/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * SQL Queries
 * @author pj
 * @modified jmlehtin
 *
 */
public class DB {
	private static final long serialVersionUID = 8132668582109303543L;
	
	private static Log log = LogFactoryUtil.getLog(DB.class);
	private static final String SEPARATORFORMAT = "yyyy"+Download.separator+"MM"+Download.separator+"dd"+Download.separator+
			"HH"+Download.separator+"mm"+Download.separator+"ss";
	public static final DateFormat SDF = new SimpleDateFormat(SEPARATORFORMAT);
	public static final GregorianCalendar gcal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
	private final static String SELECT = "SELECT ";
	public final static String SAMPTIME =  "samptime";
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
	long[] epoch;
	Connection conn = null;
	Smearyhteys sy  = null;
	/**
	 * Connection
	 */
	public DB() {
		this.sy = new Smearyhteys();
		//this.conn = sy.getConnection(true);
	}
	
	public ResultSet avg(Data data, String kanta, long dstart, long dend, int min, int type, boolean checkQuality) {
		open();
		this.avg = min;
		ResultSet rs = null;
		List<String> variables = data.getV(kanta);
		StringBuilder sb = new StringBuilder();
		Date start = new Date(dstart);
		Date end = new Date(dend);
		Timestamp startTs = new Timestamp(start.getTime());
		Timestamp endTs = new Timestamp(end.getTime());
		sb.append(SELECT);
		sb.append(SAMPTIME);
		Iterator<String> i = variables.iterator();
		while (i.hasNext()) {
			String variable = i.next();
			if(checkQuality) {
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
		sb.append(" FROM " + kanta + " WHERE "+SAMPTIME+ " <= ? AND "+SAMPTIME+ " >= ?");
		if (NONE != type) {
			sb.append(" GROUP BY floor(timestampdiff(minute, '1990-1-1', "+SAMPTIME+") /? )");
		}
		try {
			PreparedStatement ps = this.conn.prepareStatement(sb.toString());
			ps.setTimestamp(1, endTs);
			ps.setTimestamp(2, startTs);
			if (NONE != type) {
				if (min < 30) { //danger!! fix if set new averaging time
					ps.setInt(3, 30); //use 30 as default when user NOT select avraging time
				} else {
					ps.setInt(3, min);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			log.error(sb.toString());
			close();
		}
		if (null != data && rs != null) {
			process(rs, data, kanta);
		}
		SmearViewUI.doJVMGarbageCollection();
		return rs;
	}
	
	/**
	 * Tallentaa ResultSetin Data olioon
	 * 
	 * @param rs ResultSet
	 * @param data Data
	 */
	 private void process(ResultSet rs, Data data, String kanta) {
	    	try {    		
	    		long t1=0, t2 = 0;
	    		Boolean max = false;
	    		ResultSetMetaData rsmd = rs.getMetaData();
	    		if(rsmd == null) {
	    			log.error("Resultset metadata is null in DB.process");
	    			close();
	    			return;
	    		}
	    		int cc = rsmd.getColumnCount();
	    		data.addSarakelkm(cc-1);
	    		if (rs.next()) {
	    			ArrayList<String>labels = new ArrayList<String>();
	    			for (int i = 2; i <= cc; i++) {
	    				labels.add(rsmd.getColumnName(i));
	    			}
	    			data.addLabels(labels, kanta);
	    			data.setT1(rs.getTimestamp(1).getTime());
	    			if (rs.next()) {
	    				data.setT2(rs.getTimestamp(1).getTime());
	    			}
	    		}
	    		rs.last();
				int rows = rs.getRow();
				if (rows > data.getRivienlkm()) {
                    data.setRivit(rows);
                    max = true;
                    data.setMaxtaulu(kanta);
                    data.tablelist.addFirst(kanta);
                	epoch = new long[rows];
				} else {
                    data.tablelist.add(kanta);
				}
				String samptimes[] = new String[rows];
				String yyyymmddhhmm[] = new String[rows];
				LocalDateTime[] timestamps = new LocalDateTime[rows];
				String nws[] = new String[rows];
				float[][] fa = new float[cc-1][rows];  //column, rows
		    	rs.beforeFirst();
	    		int j=0; //row
			    int n = 0;
	    		while (rs.next()) {
	    			String formattedDate = aikamuotoilu(rs.getDate(1, gcal), rs.getTime(1, gcal), j);
	    			if (true == max) {
	    				yyyymmddhhmm[j] = formattedDate;
	    				samptimes[j] = rs.getString(1);	
	    			}
	    			
	    			if(formattedDate != null) {
	    				String[] splittedFormattedDate = formattedDate.split(",");
	    				if(splittedFormattedDate != null && splittedFormattedDate.length == 6) {
	    					try {
	    						timestamps[j] = LocalDateTime.of(Integer.parseInt(splittedFormattedDate[0]), Integer.parseInt(splittedFormattedDate[1]), Integer.parseInt(splittedFormattedDate[2]), Integer.parseInt(splittedFormattedDate[3]), Integer.parseInt(splittedFormattedDate[4]), Integer.parseInt(splittedFormattedDate[5]));
	    					} catch(NumberFormatException e) {
	    						timestamps[j] = null;
	    					} catch(DateTimeException ex) {
	    						log.error("Unable to parse date from database");
	    						ex.printStackTrace();
	    						timestamps[j] = null;
	    					}
	    				} else {
	    					timestamps[j] = null;
	    				}
	    			} else {
	    				timestamps[j] = null;
	    			}
	    			
	    			for (int i = 2; i <= cc; i++) {
	    				try {
	    					fa[i-2][j] = rs.getFloat(i);
	    					if (rs.wasNull()) {
	    						fa[i-2][j] = Float.NaN;
	    					}
	    				} catch ( java.sql.SQLException e) {
	    					nws[j] = rs.getString(i);
	    					n=i;
	    					close();
	    					return;
	    				} catch (  java.lang.ArrayIndexOutOfBoundsException e) {
	    					log.error("ArrayIndexOutOfBoundsException in DB.process: " + "i="+i+" j="+j);
	    					log.error("rows="+rows+" cols="+cc);
	    					e.printStackTrace();
	    					close();
	    					return;
	    				}
	    			}
	    			j++;
	    		}
				data.setEka(false);	
				if(timestamps.length > 0) {
					data.setTimestamps(timestamps, kanta);
				}
	    		data.setUnixtimes(epoch);
	    		if (yyyymmddhhmm != null && yyyymmddhhmm.length > 0 && null != yyyymmddhhmm[0] && !yyyymmddhhmm[0].isEmpty()) {
	    			data.setMuotoaika(yyyymmddhhmm);
	    		}
	    		if(samptimes != null && samptimes.length > 0 && null != samptimes[0] && !samptimes[0].isEmpty()) {
	    			data.setSamptimes(samptimes);
	    		}
	    		if (n > 0) {
	    			data.setNWS(nws);
	    			try {
	    				data.setNWSname(rsmd.getColumnName(n));
	    			} catch (java.sql.SQLException e) {
	    				log.error("NWS set failure: "+n);
	    				close();
	    				return;
	    			}
	    		}
	    		float[][] keskirarvoistettufa = keskiarvotus(fa, cc, rows, t2-t1 /(1000*60));
	    		data.addFtaulu(keskirarvoistettufa,kanta);
	    		
	    	} catch ( java.sql.SQLException e) {
	    		e.printStackTrace();
	    		close();
	    		return;
	    	}
		}
	 
	 /**
	  * Päivämäärä muotoon kuusi saraketta: vuosi, kuukausi, päivä, tunti, minuutti, sekunti
	  * Myöskään käsittely merkkijonona ei onnistu sillä jo rs.getString ottaa kesäajan huomioon. 
	  * Ei erotinta viimeisen kentän jälkeen.
	  * AVAA-237 AVAA-553
	  * 
	  * @param date Date time TIme
	  * @return kuusi saraketta: vuosi, kuukausi, päivä, tunti, minuutti, sekunti String
	  */
	 private String aikamuotoilu(Date date, Time time, int j) {	
		 if(epoch.length > 0 && j >= 0 && j < epoch.length && date != null && time != null) {
			 epoch[j] = (date.getTime() + time.getTime())/1000;				
	         java.util.Date ud = new java.util.Date(date.getTime() + time.getTime() + 2*3600*1000); 
	         SDF.setTimeZone(TimeZone.getTimeZone("UTC"));
	         return SDF.format(ud);
		 }
		 return null;
	}
	 
	private float[][] keskiarvotus(float[][] fa, int count, int size, long interval ) {
	    //Boolean geom = false; // findbug: täyttyy testata
		Boolean median = false;
		int average = 0;
		if ((avg > 0) && (interval > 0)) {
			median = MEDIAN == typeOfAVG ? true : false;
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
	
	/**
	 * Get the amount of rows in the given time period
	 * 
	 * @author jmlehtin
	 * 
	 * @param tableName
	 * @param startCol name of the colum for the start date
	 * @param startDate
	 * @param endCol name of the colum for the end date
	 * @param endDate
	 * @return total number of rows
	 */
	public int getTotalRowsInPeriod(String tableName, String startCol, long startDate, String endCol, long endDate) {
		String query = "SELECT COUNT(*) AS total FROM " + tableName + " WHERE " + startCol + " >= ? AND " + endCol + " <= ?";  
		ResultSet rs = getQueryResults(query, startDate, endDate);
		if(rs != null) {
			try {
				rs.next();
				return rs.getInt("total");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}
	
	/**
	 * Get the amount of non null variable rows in the given time period
	 * 
	 * @author jmlehtin
	 * 
	 * @param tableName
	 * @param variableName
	 * @param startCol name of the colum for the start date
	 * @param startDate
	 * @param endCol name of the colum for the end date
	 * @param endDate
	 * @return total number of non null variable rows
	 */
	public int getNonNullVariableRowAmountInPeriod(String tableName, String variableName, String startCol, long startDate, String endCol, long endDate) {
		String query = "SELECT COUNT(*) AS total FROM " + tableName + " WHERE " + variableName + " IS NOT NULL AND " + startCol + " >= ? AND " + endCol + " <= ?";  
		ResultSet rs = getQueryResults(query, startDate, endDate);
		if(rs != null) {
			try {
				rs.next();
				return rs.getInt("total");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}
	
	public int getNonNullAndQualityVariableRowAmountInPeriod(String tableName, String variableName, String startCol, long startDate, String endCol, long endDate) {
		String query = "SELECT COUNT(*) AS total FROM " + tableName + " WHERE " + variableName + " IS NOT NULL AND " + variableName + "_EMEP = 2 AND " + startCol + " >= ? AND " + endCol + " <= ?";  
		ResultSet rs = getQueryResults(query, startDate, endDate);
		if(rs != null) {
			try {
				rs.next();
				return rs.getInt("total");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}
	
	private ResultSet getQueryResults(String query, long startDate, long endDate) {
		try {
			PreparedStatement ps = this.conn.prepareStatement(query);
			ps.setTimestamp(1, new Timestamp(startDate));
			ps.setTimestamp(2, new Timestamp(endDate));
			return ps.executeQuery();
		} catch (SQLException e) {
			
		}
		return null;
	}

	public void open() {
		try {
			if(isClosed()) {
				this.conn = sy.getConnection(true);
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
