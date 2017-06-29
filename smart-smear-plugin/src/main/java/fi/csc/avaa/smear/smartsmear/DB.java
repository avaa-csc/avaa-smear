/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import fi.csc.avaa.smear.api.Smearyhteys;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

/**
 * SQL Queries
 * @author pj
 * @modified jmlehtin
 *
 */
public class DB {
	private static final long serialVersionUID = 8132668582109303543L;
	
	private static Log log = LogFactoryUtil.getLog(DB.class);
	public static final GregorianCalendar gcal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
	private final static String SELECT = "SELECT ";
	public final static String SAMPTIME =  "samptime";
	public final static String COUNT_SAMPTIME = "COUNT(" + SAMPTIME + ") AS total";
	public final static String GEOMETRIC = "exp(avg(ln(";
	private final static String CS = ", ";
	private final static String[] AVG = {CS, CS+GEOMETRIC, CS+"avg(", CS+"sum(", CS};
	private final static String[] LOPPUSULUT = {"", ")))", ")", ")", ""};
	public final static int NONE = 0;
	public final static int GEOM = 1;
	public final static int MEAN = 2;
	public final static int SUMM = 3;
	public static final int MEDIAN = 4;
	private int typeOfAVG; //some of above
	private int avg; //0, 30, 60min
	private Connection conn = null;
	private Smearyhteys sy  = null;
	/**
	 * Connection
	 */
	public DB() {
		this.sy = new Smearyhteys();
	}

	public int getQueryRowAmount(Timestamp startTs, Timestamp endTs, String kanta) {
		ResultSet rs = null;
		PreparedStatement ps = null;

		StringBuilder sb = new StringBuilder();
		sb.append(SELECT);
		sb.append(COUNT_SAMPTIME);
		sb.append(" FROM " + kanta + " WHERE " + SAMPTIME + " <= ? AND " + SAMPTIME + " >= ?");

		long startTime = System.nanoTime();
		try {
			ps = this.conn.prepareStatement(sb.toString(), ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ps.setFetchSize(Integer.MIN_VALUE); // yammer database group 2017-02-20. was only avg-mthod
			ps.setTimestamp(1, endTs);
			ps.setTimestamp(2, startTs);
			rs = ps.executeQuery();
			long endTime = System.nanoTime();
			if(rs.next()) {
				return rs.getInt("total");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error(sb.toString());
		} finally {
			try {
				if (rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (ps != null) ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public void avg(Data data, String table, long dstart, long dend, int min, int type, boolean checkQuality) {
		open();
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			this.avg = min;
			Timestamp startTs = new Timestamp(new Date(dstart).getTime());
			Timestamp endTs = new Timestamp(new Date(dend).getTime());
			int totalRowAmount = getQueryRowAmount(startTs, endTs, table);

			List<String> variables = data.getV(table);
			StringBuilder sb = new StringBuilder();
			sb.append(SELECT);
			sb.append(SAMPTIME);
			Iterator<String> i = variables.iterator();
			while (i.hasNext()) {
				String variable = i.next();
				if (checkQuality) {
					sb.append(AVG[type]);
					sb.append("CASE WHEN " + variable + "_EMEP = 2 THEN ");
					sb.append(variable);
					sb.append(" ELSE NULL END");
					sb.append(LOPPUSULUT[type]);
					sb.append(" AS " + variable);
				} else {
					sb.append(AVG[type]);
					sb.append(variable);
					sb.append(LOPPUSULUT[type]);
				}
			}
			sb.append(" FROM " + table + " WHERE " + SAMPTIME + " < ? AND " + SAMPTIME + " >= ?");
			if (NONE != type) {
				sb.append(" GROUP BY floor(timestampdiff(minute, '1990-1-1', " + SAMPTIME + ") /? )");
			}
			sb.append(" LIMIT " + totalRowAmount);
			long startTime = System.nanoTime();
			try {
				ps = this.conn.prepareStatement(sb.toString(), ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
				ps.setTimestamp(1, endTs);
				ps.setTimestamp(2, startTs);
				if (NONE != type) {
					if (min < 30) { //danger!! fix if set new averaging time
						ps.setInt(3, 30); //use 30 as default when user NOT select averaging time
					} else {
						ps.setInt(3, min);
					}
				}
				ps.setFetchSize(Integer.MIN_VALUE);
				rs = ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
				log.error(sb.toString());
			}
			long endTime = System.nanoTime();
			if (null != data && rs != null) {
				process(rs, data, table, totalRowAmount);
			}
			SmearViewUI.doJVMGarbageCollection();
		} finally {
			try { if (rs != null) rs.close(); } catch (Exception e) {e.printStackTrace();};
			try { if (ps != null) ps.close(); } catch (Exception e) {e.printStackTrace();};
			close();
		}
	}
	
	/**
	 * Tallentaa ResultSetin Data olioon
	 * 
	 * @param rs ResultSet
	 * @param data Data
	 */
	 private void process(ResultSet rs, Data data, String table, int totalRowAmount) {
		long startTime = System.nanoTime();
		ArrayList<String>labels;
		try {
			long[] epoch = data.getLastEpoch();
			ResultSetMetaData rsmd = rs.getMetaData();
			if(rsmd == null) {
				log.error("Resultset metadata is null in DB.process");
				return;
			}
			int columnCount = rsmd.getColumnCount();
			int varColumnCount = columnCount-1;
			data.addColumnCountBy(varColumnCount);
			if (totalRowAmount > data.getRowAmount()) {
				data.setRowAmount(totalRowAmount);
				data.tablelist.addFirst(table);
				epoch = new long[totalRowAmount];
			} else {
				data.tablelist.add(table);
			}
			float[][] fa = new float[varColumnCount][totalRowAmount];  //column, rows
			String nws[] = new String[totalRowAmount];
			int j=0; //row
			int nwsColumnNumber = 0;
			long t1=0, t2 = 0;
			while (rs.next()) {
				if(t1 == 0L) {
					labels = new ArrayList<>();
					for (int i = 2; i <= columnCount; i++) {
						labels.add(rsmd.getColumnName(i));
					}
					data.addLabels(labels, table);
					t1 = rs.getTimestamp(1).getTime();
				} else if(t2 == 0L) {
					t2 = rs.getTimestamp(1).getTime();
				}

				if(epoch.length > 0 && j >= 0 && j < epoch.length && rs.getDate(1, gcal) != null && rs.getTime(1, gcal) != null) {
					epoch[j] = (rs.getDate(1, gcal).getTime() + rs.getTime(1, gcal).getTime()) / 1000;
				}
				for (int i = 2; i <= columnCount; i++) {
					try {
						fa[i-2][j] = rs.getFloat(i);
						if (rs.wasNull()) {
							fa[i-2][j] = Float.NaN;
						}
					} catch ( java.sql.SQLException e) {
						nws[j] = rs.getString(i);
						nwsColumnNumber=i;
						return;
					} catch (  java.lang.ArrayIndexOutOfBoundsException e) {
						log.error("ArrayIndexOutOfBoundsException in DB.process: " + "i="+i+" j="+j);
						log.error("rows="+totalRowAmount+" cols="+varColumnCount);
						e.printStackTrace();
						close();
						return;
					}
				}
				j++;
			}

			if (nwsColumnNumber > 0) {
				data.setNWS(nws);
				try {
					data.setNWSname(rsmd.getColumnName(nwsColumnNumber));
				} catch (java.sql.SQLException e) {
					log.error("NWS set failure: "+ nwsColumnNumber);
					return;
				}
			}
			data.setEpoch(epoch, table);
			float[][] keskiarvoistettufa = keskiarvotus(fa, varColumnCount, totalRowAmount, (t2-t1)/(1000*60));
			data.addFtaulu(keskiarvoistettufa,table);
			fa = null;
			keskiarvoistettufa = null;
		} catch ( java.sql.SQLException e) {
			e.printStackTrace();
			return;
		} finally {
			long endTime = System.nanoTime();
		}
	 }

	private float[][] keskiarvotus(float[][] fa, int count, int size, long interval ) {
		Boolean median = false;
		int average = 0;
		if (avg > 0 && interval > 0) {
			median = MEDIAN == typeOfAVG;
			average = (int) (avg/interval);
		}

		for (int i = 0 ; i < count ; i++) {
			if (average > 1) {
				int dims = size/average;
				float[] f =  new float[dims];
				int l = 0;
				for (int k = 0; k+average < size; k = k + average) {
					if (median) {
						float a[] = new float[average];
						int m = 0;
						for (int j = k; j < k+average; j++) {
							a[m++] = fa[i][j];
						}
						Arrays.sort(a);
						f[l++] = a[average/2];
					} 
				}
				fa[i] = f;
			}
		}
		return fa;
	}

	private int getTotalValue(String query, long startDate, long endDate) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			rs = getAvailabilityQueryResults(query, startDate, endDate, ps);
			if(rs != null) {
				rs.next();
				return rs.getInt("total");
			}
		} catch (SQLException e) {
			log.error(e.getMessage());
		} finally {
			try { if (rs != null) rs.close(); } catch (Exception e) {e.printStackTrace();};
			try { if (ps != null) ps.close(); } catch (Exception e) {e.printStackTrace();};
		}
		return -1;
	}

	private Map<String, Double> getVariableAvailabilityValues(String query, long startDate, long endDate, List<String> variableNames, boolean considerQuality) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Map<String, Double> varAvailabilities = new HashMap<>();
		HashMap<String, Integer> varExistCounts = new HashMap<>();
		variableNames.stream().forEach(varName -> {
			varExistCounts.put(varName, 0);
			varAvailabilities.put(varName, 0.0d);
		});
		try {
			long startTime = System.nanoTime();
			rs = getAvailabilityQueryResults(query, startDate, endDate, ps);
			long endTime = System.nanoTime();
			startTime = System.nanoTime();
			if(rs != null) {
				int totCount = 0;
				if(considerQuality) {
					ResultSetMetaData rsmd = rs.getMetaData();
					while (rs.next()) {
						totCount++;
						int queryIdx = 1;
						for (int varIdx=0; varIdx < variableNames.size(); varIdx++) {
							try {
								String varName = variableNames.get(varIdx);
								String emepColName = varName + "_EMEP";
								while(!emepColName.equals(rsmd.getColumnName(queryIdx))) {
									queryIdx++;
								}
								if(rs.getInt(queryIdx) == 2) {
									varExistCounts.put(varName, (varExistCounts.get(varName) + 1));
								}
								queryIdx++;
							} catch (Exception e) {
								continue;
							}
						}
					}
				} else {
					while (rs.next()) {
						totCount++;
						for (int i = 0; i < variableNames.size(); i++) {
							try {
								String varName = variableNames.get(i);
								rs.getFloat(varName);
								if (!rs.wasNull()) {
									varExistCounts.put(varName, (varExistCounts.get(varName) + 1));
								}
							} catch (Exception e) {
								continue;
							}
						}
					}
				}

				final int temp = totCount;
				varExistCounts.forEach((k,v) -> {
					varAvailabilities.put(k, temp == 0 ? 0.0d : (double) varExistCounts.get(k)/temp);
				});
				endTime = System.nanoTime();
			}
			return varAvailabilities;
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			try { if (rs != null) rs.close(); } catch (Exception e) {e.printStackTrace();}
			try { if (ps != null) ps.close(); } catch (Exception e) {e.printStackTrace();}
		}
		return varAvailabilities;
	}
	
	/**
	 * Get the amount of rows in the given time period
	 * 
	 * @author jmlehtin
	 * 
	 * @param tableName
	 * @param startDate
	 * @param endDate
	 * @return total number of rows
	 */
	public int getTotalRowsInPeriod(String tableName, long startDate, long endDate) {
		String query = "SELECT COUNT(samptime) AS total FROM " + tableName + " WHERE samptime >= ? AND samptime <= ?";
		return getTotalValue(query, startDate, endDate);
	}
	
	/**
	 * Get the amount of non null variable rows in the given time period
	 * 
	 * @author jmlehtin
	 * 
	 * @param tableName
	 * @param variableName
	 * @param startDate
	 * @param endDate
	 * @return total number of non null variable rows
	 */
	public int getNonNullVariableRowAmountInPeriod(String tableName, String variableName, long startDate, long endDate) {
		String query = "SELECT COUNT(samptime) AS total FROM " + tableName + " WHERE " + variableName + " IS NOT NULL AND samptime >= ? AND samptime <= ?";
		return getTotalValue(query, startDate, endDate);
	}

	public int getNonNullAndQualityVariableRowAmountInPeriod(String tableName, String variableName, long startDate, long endDate) {
		String query = "SELECT COUNT(samptime) AS total FROM " + tableName + " WHERE " + variableName + " IS NOT NULL AND " + variableName + "_EMEP = 2 AND samptime >= ? AND samptime <= ?";
		return getTotalValue(query, startDate, endDate);
	}

	/**
	 * Get Map of
	 *
	 * @param tableGroupedVariables
	 * @param startDate
	 * @param endDate
	 * @param considerQuality
	 * @return
	 */
	public Map<String, Double> getVariableAvailabilitiesInPeriod(Map<String, List<String>> tableGroupedVariables, long startDate, long endDate, boolean considerQuality) {
		Map<String, Double> varExistCounts = new HashMap<>();
		for(Map.Entry<String, List<String>> tableAndVariables : tableGroupedVariables.entrySet()) {
			String table = tableAndVariables.getKey();
			List<String> varNames = tableAndVariables.getValue();

			String query;
			if(considerQuality) {
				query = "SELECT ".concat(varNames.stream().map(varName -> varName + "_EMEP").collect(Collectors.joining(", "))).concat(" FROM " + table + " WHERE samptime >= ? AND samptime <= ?");
			} else {
				query = "SELECT ".concat(varNames.stream().collect(Collectors.joining(", "))).concat(" FROM " + table + " WHERE samptime >= ? AND samptime <= ?");
			}
			long startTime = System.nanoTime();
			varExistCounts.putAll(getVariableAvailabilityValues(query, startDate, endDate, varNames, considerQuality));
			long endTime = System.nanoTime();
		}
		return varExistCounts;
	}
	
	private ResultSet getAvailabilityQueryResults(String query, long startDate, long endDate, PreparedStatement ps) {
		ResultSet rs;
		open();
		String validQuery = getValidAvailabilityQuery(query, startDate, endDate);
		try {
			ps = this.conn.prepareStatement(validQuery, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ps.setTimestamp(1, new Timestamp(startDate));
			ps.setTimestamp(2, new Timestamp(endDate));
			ps.setFetchSize(Integer.MIN_VALUE);
			rs = ps.executeQuery();
		} catch(SQLException ex) {
			return null;
		}
		return rs;
	}

	/**
	 * Since
	 *
	 * @param query
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	private String getValidAvailabilityQuery(String query, long startDate, long endDate) {
		boolean success = false;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String retVal = query;
		int counter = 0;
		while(!success && counter < 100) {
			counter++;
			try {
				ps = this.conn.prepareStatement(retVal + " LIMIT 1", ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
				ps.setTimestamp(1, new Timestamp(startDate));
				ps.setTimestamp(2, new Timestamp(endDate));
				ps.setFetchSize(10);
				rs = ps.executeQuery();
				success = true;
			} catch(SQLException ex) {
				retVal = improveQuery(ex, retVal);
				if(retVal == null) {
					return null;
				}
			} finally {
				try { if (rs != null) rs.close(); } catch (Exception e) {e.printStackTrace();}
				try { if (ps != null) ps.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
		return retVal;
	}

	private String improveQuery(SQLException ex, String query) {
		String retVal = query;
		int beg = ex.getMessage().indexOf('\'')+1;
		int end = ex.getMessage().indexOf('\'', ex.getMessage().indexOf('\'')+1);
		String missingCol = ex.getMessage().substring(beg, end);
		if(!retVal.contains(missingCol)) {
			return null;
		}
		if(retVal.contains(", " + missingCol)) {
			retVal = retVal.replace(String.valueOf(", " + missingCol), "");
		} else if (query.contains(missingCol + ", ")) {
			retVal = retVal.replace(String.valueOf(missingCol + ", "), "");
		} else {
			return null;
		}
		return retVal;
	}

	public void open() {
		try {
			if(isClosed()) {
				this.conn = sy.getConnection(true);
				this.conn.setAutoCommit(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(this.conn != null && !isClosed()) {
				this.conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isClosed() {
		try {
			if(this.conn != null) {
				return this.conn.isClosed();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}    
