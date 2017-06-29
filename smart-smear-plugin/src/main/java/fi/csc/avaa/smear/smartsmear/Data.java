/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Data
 * @author pj
 *
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 599945710442058651L;
	private static final String SEPARATORFORMAT = "yyyy"+Download.separator+"MM"+Download.separator+"dd"+Download.separator+
			"HH"+Download.separator+"mm"+Download.separator+"ss";
	public static final DateFormat SDF = new SimpleDateFormat(SEPARATORFORMAT);
	private Hashtable<String, ArrayList<String>> labels = new Hashtable<String, ArrayList<String>>();
	private Hashtable<String, float[][]> fdata = new Hashtable<>();
	private Hashtable<String, long[]> epochs;
	private Hashtable<String, Integer> htindex;
	public Set<String> finalset;
	public Set<String> tableset;
	public LinkedList<String> tablelist = new LinkedList<>(); //kuten tableset, mutta järjestettynä tarkkaresoluutioisin alkuun
	private int amountOfColumns = 0; //number of columns
	private int amountOfRows;
	private String[] nws; // This is meant for containing values of one single variable: KUM_META:pwd_nws, which contains chars as values instead of floats
	private String nwsColName;
	private String lastEpochKey;

	public Data(Set<String> finalset, Set<String> tableset, Hashtable<String, Integer>  htindex ) {
		this.finalset = finalset;
		this.tableset = tableset;
		//this.sb = new StringBuffer();
		this.htindex = htindex; //from metadata
		this.epochs = new Hashtable<>();
	}

	/**
	 * Variables
	 * 
	 * @param table String table name
	 * @return sorted list of variables
	 */
	public List<String> getV(String table) {
		String[] sa = new String[2000]; //muuttujien lkm
		finalset.stream().filter(v -> v.endsWith(table)).forEach(v ->
		sa[indexsoi(muuttuja(v),table)] = muuttuja(v)); // sorting
		ArrayList<String> l = new ArrayList<String>();
		for (int i = 0; i < sa.length; i++) {
			if (null != sa[i]) {
				l.add(sa[i]);
			}
		}
		return l;
	}

	private String muuttuja(String tm) {
		return tm.substring(0,tm.indexOf(Download.MUUTTUJAEROTIN));
	}
	
	private int indexsoi(String v, String tabl) {
		Integer ret = null;
		try {
			ret = htindex.get(v+Download.MUUTTUJAEROTIN+tabl);
		} catch(Exception e) {
		}
		if (ret == null) {
			return 0;
		}
		return ret;
	}

	public int getRowAmount() {
		return amountOfRows;
	}
	
	public void setRowAmount(int lkm) {
		this.amountOfRows = lkm;
	}

	public String[] getLabels(String table) {
		ArrayList<String> al = labels.get(table);
		if (null == al) {
			System.err.println("No labels; table: "+table);
			return null;
		}
		return (String[]) al.toArray(new String[al.size()]);
	}

	public int getColumnCount() {
		return amountOfColumns;
	}

	public void addColumnCountBy(int i) {
		this.amountOfColumns += i;
	}

	public void addLabels(ArrayList<String> cn, String table) {
		labels.put(table, cn);		
	}

	public void addFtaulu(float[][] fa, String taulu) {
		fdata.put(taulu, fa);
	}
	
	public float[][] getFtaulu(String taulu) {
		return fdata.get(taulu);
	}

	public static String clean(String s) {
	    	String clean = s;
	    	if (null != s) {
	    		if (s.startsWith("avg(") || s.startsWith("sum(")) {
	    			clean = s.substring(4, s.length()-1);
	    		} else if (s.startsWith(DB.GEOMETRIC)) {
	    			clean = s.substring(DB.GEOMETRIC.length(), s.length()-3); //lopusta poistetaan loppusulut
	    		}
	    	}
			return clean;
		}

	public long[] getEpoch(String table) {
		if(table == null || epochs.isEmpty()) {
			return null;
		}
		if(epochs.containsKey(table)) {
			return epochs.get(table);
		}
		return epochs.entrySet().iterator().next().getValue();
	}

	public long[] getLastEpoch() {
		if(!epochs.isEmpty() && lastEpochKey != null) {
			return epochs.get(lastEpochKey);
		}
		return new long[0];
	}

	public void setEpoch(long[] epoch, String table) {
		this.lastEpochKey = table;
		this.epochs.put(table, epoch);
	}

	public LocalDateTime[] getTimestamps(String table) {
		if(table == null) {
			return null;
		}
		long[] unixtimes = getEpoch(table);
		LocalDateTime[] timestamps = new LocalDateTime[unixtimes.length];
		for (int i = 0; i < unixtimes.length; i++) {
			String formattedDateStr = getFormattedDate(unixtimes[i]);
			if (formattedDateStr != null) {
				String[] splittedFormattedDateStr = formattedDateStr.split(",");
				if (splittedFormattedDateStr.length == 6) {
					try {
						timestamps[i] = LocalDateTime.of(Integer.parseInt(splittedFormattedDateStr[0]), Integer.parseInt(splittedFormattedDateStr[1]), Integer.parseInt(splittedFormattedDateStr[2]), Integer.parseInt(splittedFormattedDateStr[3]), Integer.parseInt(splittedFormattedDateStr[4]), Integer.parseInt(splittedFormattedDateStr[5]));
					} catch (NumberFormatException | DateTimeException e) {
						timestamps[i] = null;
					}
				} else {
					timestamps[i] = null;
				}
			} else {
				timestamps[i] = null;
			}
		}
		return timestamps;
	}

	public String[] getFormattedDates(String table) {
		if(table == null) {
			return null;
		}
		long[] unixtimes = getEpoch(table);
		String[] formattedDates = new String[unixtimes.length];
		for(int i=0; i < unixtimes.length; i++) {
			formattedDates[i] = getFormattedDate(unixtimes[i]);
		}
		return formattedDates;
	}

	private String getFormattedDate(long epoch) {
		if (epoch != 0L) {
			java.util.Date ud = new java.util.Date((epoch * 1000) + (2 * 3600 * 1000));
			SDF.setTimeZone(TimeZone.getTimeZone("UTC"));
			return SDF.format(ud);
		}
		return null;
	}

	// The NWS methods and getSamptimes are currently used only in HDF5writer.java, so no references in this project (2.11.2016)
    /* but it have to be public [ERROR] /home/pj/IdeaProjects/avaa-smear/HDF5writer/src/main/java/fi/csc/avaa/HDF5writer/HDF5writer.java:[125,46] getSamptimes(java.lang.String) has private access in fi.csc.avaa.smear.smartsmear.Data */
	public String[] getSamptimes(String table) {
		if(table == null) {
			return null;
		}
		List<String> timestamps = Arrays.asList(getTimestamps(table)).stream().map(ts -> ts.toString()).collect(Collectors.toList());
		List<String> samptimes = timestamps.stream().map(fd -> {
			if(fd != null && fd.length() > 0) {
		   		return fd.replace('T', ' ').concat(":00.0");
			}
			return null;
		}).collect(Collectors.toList());
		return samptimes.toArray( new String[ samptimes.size() ] );
	}

	public void setNWS(String[] nws) {
		this.nws = nws;
	}

	public String[] getNWS() {
		return this.nws;
	}

	public void setNWSname(String columnName) {
		this.nwsColName = columnName;
	}

	public String getNWSname() {
		return this.nwsColName;
	}

}
