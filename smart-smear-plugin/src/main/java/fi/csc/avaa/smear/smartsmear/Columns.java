/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

/**
 * Metadata of the columns (of the database)
 * Currently filled by xmlparser but better to unnesessary by
 *  ResultSetMetaData rsmd = rs.getMetaData(); //sql
 * 
 * @author pj
 *
 */
public class Columns {
	private int kpl;
	private String separator;
	private String[] names;
	
	public Columns(String separator) {
		kpl = 0;
		names = new String[200];
		this.separator = separator;
	}
	
	public void append(String name) {
		if (!name.endsWith("_EMEP")) {
			names[kpl++] = name;
		}
	}
	
	public String[] getNames() {
		return names;
	}
	
	public String getSeparatedNames() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < kpl ; i++) {
			sb.append(names[i]);
			sb.append(separator);
		}
		return sb.toString();
	}
	
	public int getCount() {
		return kpl;
	}
	
}
