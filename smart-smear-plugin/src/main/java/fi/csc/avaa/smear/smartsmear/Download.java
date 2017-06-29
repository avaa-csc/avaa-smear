/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;

import com.liferay.portal.kernel.util.StringPool;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;

import fi.csc.smear.db.model.SmearEvents;
import fi.csc.smear.db.model.SmearvariableEvent;
import fi.csc.smear.db.service.SmearEventsLocalServiceUtil;
import fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil;

/**
 * @author pj
 *
 */
public class Download {

    final static String FILENAMEFORMAT = "yyyyMMdd";
    final public static String DIR = "/var/www/html/tmp/";
    public static final String GEOMETRIC = "GEOMETRIC";
    public static final String MEDIAN = "MEDIAN";
    public static final String SUM = "SUM";
	public static final String ARITHMETIC = "ARITHMETIC";
    private static final String FILENAME = "export"; 
    private static final String CSV = ".csv";
    private static final String TXT = ".txt";
    private static final String TAB = StringPool.TAB;
    public Data data;
    ComboBox avg, typeOfAVG;
    public static final String separator = StringPool.COMMA;
    protected static final String METASEPARATOR = StringPool.SEMICOLON;
	protected static final int METALINES = 1;
    private int station;
    private Date start;
    private Date end;
    public static final String MUUTTUJAEROTIN = ":";
    public static final DateFormat FNF = new SimpleDateFormat(FILENAMEFORMAT);
    private Metadata metadata;
    private String tablestr;
	private HDF5 hdf5;
	private List<Boolean> hasErrors = new ArrayList<>();
	
	//For meta file format
	public Download(Metadata metadata, Date start, Date end) {
		this.metadata = metadata;
		this.start = start;
		this.end = end;
	}

	public Download(Date start, Date end, DB db, List<String> selectedVariableIds, List<Double> selectedVariableAvailabilities, Metadata metadata, ComboBox avg, ComboBox typeOfAVG, String quality) {
		this.start = start;
		this.end = end;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.metadata = metadata;
		
		Set<String> finalset = new HashSet<String>();
		Set<String> tableset = new HashSet<String>();
		
		db.open();
		try {
			for (int i=0; i < selectedVariableIds.size(); i++) {
				String varsta = selectedVariableIds.get(i);
				String[] parts = varsta.split(MUUTTUJAEROTIN);
				String var = parts[0];
				tablestr = parts[1];

				if (quality.equals(SmearViewUI.CHECKED)) {
					if(selectedVariableAvailabilities != null) {
						Double availability = selectedVariableAvailabilities.get(i);
						if (availability == 0.0d) {
							displayMsg("Variable " + var + " has no values in this timeframe");
							setError(true);
						} else {
							if (availability < 1.0d) {
								displayMsg("Variable " + var + " is only partially quality checked in this timeframe");
							}
							setError(false);
							finalset.add(varsta);
							tableset.add(tablestr);
						}
					} else {
						setError(false);
						finalset.add(varsta);
						tableset.add(tablestr);
					}
				} else {
					if(selectedVariableAvailabilities != null) {
						Double availability = selectedVariableAvailabilities.get(i);
						if (availability == 0.0d) {
							displayMsg("Variable " + var + " has no values in this timeframe");
							setError(true);
						} else {
							setError(false);
							finalset.add(varsta);
							tableset.add(tablestr);
						}
					} else {
						setError(false);
						finalset.add(varsta);
						tableset.add(tablestr);
					}
				}
			}
			if (!finalset.isEmpty()) {
				station = Station.resolve(tableset.toArray(new String[tableset.size()])[0]);
				data = new Data(finalset, tableset, metadata.getHTindex());
				tableset.forEach(table ->
						db.avg(data, table, start.getTime(), end.getTime(), readAVG(this.avg), readAVGtype(typeOfAVG), quality.equals(SmearViewUI.CHECKED)));
			}
		} finally {
			db.close();
		}
	}

	private int readAVGtype(ComboBox typeOfAVG2) {
    	String v = typeOfAVG2.getValue().toString();
    	if (v.equals(GEOMETRIC)) {
    		return DB.GEOM;
    	}
    	if (v.equals(ARITHMETIC)) {
    		return DB.MEAN;
    	}
    	if (v.equals(SUM)) {
    		return DB.SUMM;
    	}
    	if (v.equals(MEDIAN)) {
    		return DB.MEDIAN;
    	}
    	return DB.NONE;
    }

    public File getHDF5() {
    	if (data != null) {
    		hdf5 = new HDF5(this, start, end, station, readAVG(this.avg), this.typeOfAVG, true, metadata);
    		return hdf5.getFile();
    	} else {
    		return null;
    	}
    }
    
    public String writeHDF5File() {
    	if(data != null) {
    		hdf5 = new HDF5(this, start, end, station, readAVG(this.avg), this.typeOfAVG, false, metadata);
    		return hdf5.createHDF5File();
    	}
   		return null;
    }
	
    public StreamResource getCSV() {
    	if (data != null ) {
    		return new StreamResource(new StreamSource() {
    			private static final long serialVersionUID = 4343017200085855921L;
    			@Override
    			public InputStream getStream() {
    				StringBuilder sb = getCsvContents();
    				if(sb != null) {
    					return new ByteArrayInputStream(sb.toString().getBytes());
    				}
    				return null;
    			}
    		}, "Smeardata"+FILENAME+FNF.format(start)+CSV);
		} else {
			System.err.println("Query return NO data");
			return null;
		}
	}
    
    public StreamResource getTXT() {
    	if (data != null ) {
    		return new StreamResource(new StreamSource() {
    			private static final long serialVersionUID = 4343017200085855954L;
    			@Override
    			public InputStream getStream() { 
    				StringBuilder sb = getTabContents();
    				if(sb != null) {
    					return new ByteArrayInputStream(sb.toString().getBytes());
    				}
    				return null;
    			}
    		}, "Smeardata"+FILENAME+FNF.format(start)+TXT);
		}else {
			System.err.println("Query return NO data");
			return null;
		}
	}
    
    public StreamResource getMetatieto(Map<String, List<String>> varsGroupedByTable) {
		return new StreamResource(new StreamSource() {
			private static final long serialVersionUID = 4343017200085855953L;
			@Override
			public InputStream getStream() {
				String s = getMetatietoContents(varsGroupedByTable);
				if(s != null) {
					return new ByteArrayInputStream(s.getBytes());
				}
				return null;
			}
		}, "Smearmetadata"+FILENAME+FNF.format(start)+CSV);
    }
    
    public String writeCsvFile() {
    	StringBuilder sb = getCsvContents();
    	if(sb == null) {
    		return null;
    	}
    	String filename = getFilename(start, end, CSV);
    	String filepath = getFilePath(filename); 
    	if (writeStringToFile(filepath, sb.toString())) {
    		return filename;
    	}
    	return null;
    }
    
    public String writeTabFile() {
    	StringBuilder sb = getTabContents();
    	if(sb == null) {
    		return null;
    	}
    	String filename = getFilename(start, end, TXT);
    	String filepath = getFilePath(filename);
    	if (writeStringToFile(filepath, sb.toString())) {
    		return filename;
    	}
    	return null;
    }
    
    /**
     * Tämä korvaa getCsvContents().toString().replaceAll(separator, TAB))
     * sillä metadata erotellaan nyt erikseen eikä enää ekalla rivillä
     * 
     * @return StringBuilder TAB-separeted table
     */
    
    private StringBuilder getTabContents() {
    	if(data == null) {
    		return null;
    	}
    	StringBuilder[] rivi = new StringBuilder[data.getRowAmount()];
    	for (int i = 0; i < rivi.length; i++) {
			rivi[i] = new StringBuilder();
		}
		Iterator<String> iter = data.tablelist.iterator();
		boolean eka = true;
		while( iter.hasNext()) {
			String taulunnimi = iter.next();
			String Columnnames[] = data.getLabels(taulunnimi);
			long[] epoch = data.getEpoch(taulunnimi);
			LocalDateTime[] tsat = data.getTimestamps(taulunnimi);
			float[][] faa = data.getFtaulu(taulunnimi); // lähde taulukko
			if ((null != Columnnames) && (null != faa)) {
				for (int i = 0; i < Columnnames.length; i++) {
					String[] samptimes = data.getFormattedDates(taulunnimi);
					int used = 0;
					for (int j = 0; (j < data.getRowAmount()) && (used < faa[i].length); j++) {
						try {
							if ((0 == i) && eka) {
								rivi[j].append(samptimes[j].replaceAll(separator, TAB));    	  								
							}
							rivi[j].append(TAB);
							long itseisarvo = Math.abs(tsat[used].toEpochSecond(ZoneOffset.ofHours(2))-epoch[j]);
							if ( itseisarvo < 10) {  //10s
								rivi[j].append(faa[i][used++]);
							} else {
								rivi[j].append("NaN");
							}
						} catch (Exception e) {
							e.printStackTrace();
							return null;
						}
					} 
					eka = false;
				} 
			}
			taulunnimi = null;
			Columnnames = null;
			tsat = null;
			epoch = null;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rivi.length; i++) {
			rivi[i].append(StringPool.NEW_LINE);
			sb.append(rivi[i]);
		}
		rivi = null;
		return sb;
    }
    
    /**
     * Pari getTABContents()-metodille, josta puuttuu metatiedot
     * 
     * @return StringBuilder ,-separeted table
     */
    private StringBuilder getCsvContents() {
    	if(data == null) {
    		return null;
    	}
    	StringBuilder[] rivi = new StringBuilder[METALINES+data.getRowAmount()];
		for (int i = 0; i < rivi.length; i++) {
			rivi[i] = new StringBuilder();
		}
		
		rivi[0].append("Year");rivi[0].append(separator);
		rivi[0].append("Month");rivi[0].append(separator);
		rivi[0].append("Day");rivi[0].append(separator);
		rivi[0].append("Hour");rivi[0].append(separator);
		rivi[0].append("Minute");rivi[0].append(separator);
		rivi[0].append("Second");
		
		Hashtable<String, String> mddesc = metadata.getHTdescription();
		Iterator<String> iter = data.tablelist.iterator();
		boolean eka = true;
		while( iter.hasNext()) {
			String taulunnimi = iter.next();
			String Columnnames[] = data.getLabels(taulunnimi);
			LocalDateTime[] tsat = data.getTimestamps(taulunnimi);
			long[] epoch = data.getEpoch(taulunnimi);
			float[][] faa = data.getFtaulu(taulunnimi); // lähde taulukko
			if ((null != Columnnames) && (null != faa)) {
				for (int i = 0; i < Columnnames.length; i++) {
					rivi[0].append(separator);
					String cn = Columnnames[i];
					rivi[0].append("\""+taulunnimi+"."+cn);
					cn = Data.clean(cn);
					rivi[0].append(METASEPARATOR);
					rivi[0].append(mddesc.get(cn+MUUTTUJAEROTIN+taulunnimi).replaceAll(",", ";"));
					rivi[0].append(METASEPARATOR);
					rivi[0].append(metadata.getHTsource().get(cn+MUUTTUJAEROTIN+taulunnimi).replaceAll(",", ";"));
					rivi[0].append(METASEPARATOR);
					rivi[0].append(metadata.getHTunit().get(cn+MUUTTUJAEROTIN+taulunnimi)+"\"");
					String[] samptimes = data.getFormattedDates(taulunnimi);
					int used = 0;
					for (int j = 0; (j < data.getRowAmount()) && (used < faa[i].length); j++) {
						if ((0 == i) && eka) {
							rivi[j+METALINES].append(samptimes[j]);    	  								
						}
						rivi[j+METALINES].append(separator);
						long itseisarvo = Math.abs(tsat[used].toEpochSecond(ZoneOffset.ofHours(2))-epoch[j]);
						if ( itseisarvo < 10) {  //10s
							rivi[j+METALINES].append(faa[i][used++]);
						} else {
							rivi[j].append("NaN");
						}
					} 
					eka = false;
				} 
			}
			taulunnimi = null;
			Columnnames = null;
			tsat = null;
			epoch = null;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rivi.length; i++) {
			rivi[i].append(StringPool.NEW_LINE);
			sb.append(rivi[i]);
		}
		rivi = null;
		return sb;
    }
  
    /**
     * Pelkkä metatieto jaettuna neljälle riville, ei dataa, CSV
     * @return String 
     */
    private String getMetatietoContents(Map<String, List<String>> varsGroupedByTable) {
    	StringBuilder[] rivi = new StringBuilder[4]; 

    	for (int i = 0; i < rivi.length; i++) {
    		rivi[i] = new StringBuilder();
    		if (i > 0) {
    			rivi[i].append(separator); rivi[i].append(separator); rivi[i].append(separator);
    			rivi[i].append(separator); rivi[i].append(separator);
    		}
    	}
    	rivi[0].append("Year");rivi[0].append(separator);
    	rivi[0].append("Month");rivi[0].append(separator);
    	rivi[0].append("Day");rivi[0].append(separator);
    	rivi[0].append("Hour");rivi[0].append(separator);
    	rivi[0].append("Minute");rivi[0].append(separator);
    	rivi[0].append("Second");
    	if(varsGroupedByTable != null && varsGroupedByTable.size() > 0) {
	    	Hashtable<String, String> mddesc = metadata.getHTdescription();
	    	for( Map.Entry<String, List<String>> grpEntry : varsGroupedByTable.entrySet()) {
	    		String tableName = grpEntry.getKey();
	    		List<String> variables = grpEntry.getValue();
	    		if (null != variables) {
	    			for (String var : variables) {
	    				rivi[0].append(separator);
	    				rivi[0].append(tableName+"."+var);
						var = Data.clean(var);
	    				rivi[1].append(separator);
	    				rivi[1].append(mddesc.get(var+MUUTTUJAEROTIN+tableName).replaceAll(",", ";"));
	    				List<SmearvariableEvent> sve = null;
	    				try {
	    					sve = SmearvariableEventLocalServiceUtil.findByVariable(metadata.getHTid().get(var+MUUTTUJAEROTIN+tableName));
	    				}catch (Exception e) {
	    					System.out.println("Exception "+e);
	    				}	
	    				
	    				for(SmearvariableEvent ve : sve) {
	    					try {
	    						SmearEvents se = SmearEventsLocalServiceUtil.getSmearEvents(ve.getEventID());
	    						if (se.getPeriod_start().before(end) && se.getPeriod_end().after(start)) { 
	    							rivi[1].append(" Events: "+se.getEvent_type()+" "+se.getEvent()+" "+se.getWho()+" "+se.getPeriod_start()+" "+se.getPeriod_end());
	    						}
	    					} catch(Exception e){
	    						
	    					}
	    					
	    				}
	    				rivi[2].append(separator);
	    				rivi[2].append(metadata.getHTsource().get(var+MUUTTUJAEROTIN+tableName));
	
	    				rivi[3].append(separator);
	    				rivi[3].append(metadata.getHTunit().get(var+MUUTTUJAEROTIN+tableName));
	    				
	    			}
	    		}
	    	}
    	}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rivi.length; i++) {
			rivi[i].append(StringPool.NEW_LINE);
			sb.append(rivi[i]);
		}		
		return sb.toString();
    }
    
    
    private boolean writeStringToFile(String filePath, String fileContent) {
    	Path path = Paths.get(filePath);
        byte[] strToBytes = fileContent.getBytes();
    	try {
    		Files.write(path, strToBytes);
    	} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
    	return true;
    }

  
    private int readAVG(ComboBox avg2) {
    	try {
    		String v = avg2.getValue().toString();
    		if (v.equals("30MIN")) {
    			return 30;
    		}
    		if (v.equals("1HOUR")) {
    			return 60;
    		}
    	} catch (java.lang.NullPointerException e) {
    		System.out.println("NO average selected");
    	}
    	return 0;
    }

    public Data getData() {
    	return this.data;
    }  
    
    public static String getFilename(Date start, Date end, String fileType) {
    	return "smeardata_" + RandomStringUtils.random(8, false, true) + fileType;
    }
    
    public static String getFilePath(String filename) {
    	return DIR + filename;
    }
    
    private void displayMsg(String msg) {
    	new Notification(msg,"", Notification.Type.WARNING_MESSAGE, true)
    	.show(Page.getCurrent());
    }
    
    private void setError(Boolean isError) {
    	hasErrors.add(isError);
    }
    
    public boolean allHaveErrors() {
    	if(hasErrors.size() > 0) {
    		int errAmt = 0;
    		for(Boolean hasErr : hasErrors) {
    			if(hasErr) {
    				errAmt++;
    			}
    		}
    		if(hasErrors.size() == errAmt) {
    			return true;
    		}
    	}
    	return false;
    }
    
}
