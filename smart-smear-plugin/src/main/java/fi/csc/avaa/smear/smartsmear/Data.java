/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

//import java.sql.ResultSetMetaData;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Data
 * @author pj
 *
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 599945710442058651L;
	private Hashtable<String, ArrayList<String>> labels = new Hashtable<String, ArrayList<String>>();
	private String[] samptimes;
	private Hashtable<String, float[][]> fdata = new Hashtable<String, float[][]>();
	private Hashtable<String, LocalDateTime[]> timestamps = new Hashtable<>();
	private Hashtable<String, Integer> htindex;
	public Set<String> finalset;
	public Set<String> tableset;
	public LinkedList<String> tablelist = new LinkedList<String>(); //kuten tableset, mutta järjestettynä tarkkaresoluutioisin alkuun
	private boolean eka = true;
	private int nocolums = 0; //number of columns
	private int rivit;
	private String[] muotoaika; //yyyyTABmmTABddTABhhTAB...
	private String[] nws; 
	private long t1, t2; // datan aikaväli lasketaan t2-t1
	private String nwsname;
	private long[] unixtimes;
	private String maxtaulu; // taulu, jossa on eniten rivejä.
	
	public Data(Set<String> finalset, Set<String> tableset, Hashtable<String, Integer>  htindex ) {
		this.finalset = finalset;
		this.tableset = tableset;
		//this.sb = new StringBuffer();
		this.htindex = htindex; //from metadata
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
		//return htindex.get(v+Download.MUUTTUJAEROTIN+tabl);
		if (ret == null) {
			return 0;
		}
		return ret;
	}

	public boolean ekaTaulu() {
		return eka;
	}

	public void setEka(Boolean f) {
		eka = f;
	}

	public int getRivienlkm() {
		return rivit;
	}
	
	public void setRivit(int lkm) {
		this.rivit = lkm;
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
		return nocolums;
	}

	public void addSarakelkm(int i) {
		this.nocolums += i; 		
	}

	public void addLabels(ArrayList<String> cn, String table) {
		labels.put(table, cn);		
	}

	public void addFtaulu(float[][] fa, String taulu) {
		fdata.put(taulu, fa);
		//rivit = fa[0].length;
	}
	
	public float[][] getFtaulu(String taulu) {
		return fdata.get(taulu);
	}

	/**
	 * @return the t2
	 */
	public long getT2() {
		return t2;
	}

	/**
	 * @param t2 long toisen datapisteen aika
	 */
	public void setT2(long t2) {
		this.t2 = t2;
	}

	/**
	 * @return the t1
	 */
	public long getT1() {
		return t1;
	}

	/**
	 * @param t1 long ensimmäisen  datapisteen aika 
	 */
	public void setT1(long t1) {
		this.t1 = t1;
	}

	public void setNWS(String[] nws) {
		this.nws = nws;		
	}
	
	public String[] getNWS() {
		return this.nws;
	}

	public void setNWSname(String columnName) {
		this.nwsname = columnName;		
	}
	
	public String getNWSname() {
		return this.nwsname;
	}

	public void setTimestamps(LocalDateTime[] timestamps, String taulu) {
		this.timestamps.put(taulu, timestamps);		
	}
	
	public LocalDateTime[] getTimestamps(String taulu) {
		return this.timestamps.get(taulu);
	}
	
	public String clean(String s) {
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

	public long[] getUnixtimes() {
		return this.unixtimes;
	}

	public void setUnixtimes(long[] epoch) {
		this.unixtimes = epoch;		
	}

	/**
	 * @return the String[] muotoaika
	 */
	public String[] getMuotoaika() {
		return muotoaika;
	}

	/**
	 * @param muotoaika the String[] muotoaika to set
	 */
	public void setMuotoaika(String[] muotoaika) {
		this.muotoaika = muotoaika;
	}

	public void setMaxtaulu(String kanta) {	
		this.maxtaulu = kanta;
	}
	
	public String getMaxtaulu() {
		return this.maxtaulu;
	}
	
	public void setSamptimes(String[] samptimes) {
		this.samptimes = samptimes;		
	}
	
	public String[] getSamptimes() {
		return this.samptimes;
	}
}
