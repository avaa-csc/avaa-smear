/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
//import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.PersistedModel;
import com.vaadin.server.Page;
/*import fi.csc.smear.db.model.Hydemeta;
import fi.csc.smear.db.model.Kumpulameta;
import fi.csc.smear.db.model.SmearVariableMetadata;
import fi.csc.smear.db.model.Varriometa;
import fi.csc.smear.db.model.Towermeta;
import fi.csc.smear.db.model.Hyde_eddy233;
import fi.csc.smear.db.model.Hyde_eddytow;
import fi.csc.smear.db.model.Varrio_tree;*/
//import com.vaadin.server.Resource;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;

import fi.csc.smear.db.model.SmearEvents;
import fi.csc.smear.db.model.SmearVariableMetadata;
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
    public static final String SUMM = "SUMM";
    private static final String FILENAME = "export"; 
    private static final String CSV = ".csv";
    private static final String TXT = ".txt";
    private static final String TAB = StringPool.TAB;
    public Data data;
    public ResultSet qset;
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
	
	public Download(Date start, Date end, DB db, Set<String> selectedVariableIds, Metadata metadata, ComboBox avg, ComboBox typeOfAVG, String quality, VariableItemStyleGenerator itemStyle) {
		this.start = start;
		this.end = end;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.metadata = metadata;
		
		Set<String> finalset = new HashSet<String>();
		Set<String> tableset = new HashSet<String>();
		
		db.open();
		for (String varsta:selectedVariableIds){
			String[] parts = varsta.split(MUUTTUJAEROTIN);
			String var = parts[0];
			tablestr = parts[1];
			Class<? extends PersistedModel> tableClass = VariableItemStyleGenerator.getTableClass(tablestr);
			
			if (quality.equals(SmearViewUI.CHECKED)){
				double varQualityAvailability = itemStyle.getVariableExistenceQualityPercentInPeriod(var, tablestr, tableClass);
				if(varQualityAvailability == 0.0d) {
					displayMsg("Variable " + var + " has no values in this timeframe");
					setError(true);
				} else {
					if(varQualityAvailability < 1.0d) {
						displayMsg("Variable " + var + " is only partially quality checked in this timeframe");
					}
					setError(false);
					finalset.add(varsta);
					tableset.add(tablestr);
				}
			} else{
				double varAvailability = itemStyle.getVariableExistencePercentInPeriod(var, tablestr, tableClass, false);
				if(varAvailability == 0.0d) {
					displayMsg("Variable " + var + " has no values in this timeframe");
					setError(true);
				} else {
					setError(false);
					finalset.add(varsta);
					tableset.add(tablestr);
				}
			}
		}
		if (!finalset.isEmpty()){	
			station = Station.resolve(tableset.toArray(new String[tableset.size()])[0]);
			data = new Data(finalset, tableset, metadata.getHTindex());
			tableset.forEach(table ->
			db.avg(data, table, start.getTime(), end.getTime(), readAVG(this.avg), readAVGtype(typeOfAVG), quality.equals(SmearViewUI.CHECKED)));
		}
		db.close();
	}

	// SmearDownloadUI:n käyttämä ilman puu-rakennetta
	public Download(Date start, Date end, DB db, String varsta, SmearVariableMetadata mdata, ComboBox avg, ComboBox typeOfAVG, String quality, VariableItemStyleGenerator itemStyle) {
		this.start = start;
		this.end = end;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		
		List<SmearVariableMetadata> sml = new ArrayList<SmearVariableMetadata>();
		sml.add(mdata);
		this.metadata = new Metadata(sml);
		Set<String> finalset = new HashSet<String>();
		Set<String> tableset = new HashSet<String>();

		String[] parts = varsta.split(MUUTTUJAEROTIN);
		String var = parts[0];
		tablestr = parts[1];
		Class<? extends PersistedModel> tableClass = VariableItemStyleGenerator.getTableClass(tablestr);
		
		db.open();
		if (quality.equals(SmearViewUI.CHECKED)){
			double varQualityAvailability = itemStyle.getVariableExistenceQualityPercentInPeriod(var, tablestr, tableClass);
			if(varQualityAvailability == 0.0d) {
				displayMsg("Variable " + var + " has no values in this timeframe");
			} else {
				if(varQualityAvailability < 1.0d) {
					displayMsg("Variable " + var + " is only partially quality checked in this timeframe");
				}
				setError(false);
				finalset.add(varsta);
				tableset.add(tablestr);
			}
		} else{
			double varAvailability = itemStyle.getVariableExistencePercentInPeriod(var, tablestr, tableClass, false);
			if(varAvailability == 0.0d) {
				displayMsg("Variable " + var + " has no values in this timeframe");
				setError(true);
			} else {
				setError(false);
				finalset.add(varsta);
				tableset.add(tablestr);
			}
		}
		
		if (!finalset.isEmpty()) {
			station = Station.resolve(tableset.toArray(new String[tableset.size()])[0]);
			data = new Data(finalset, tableset, metadata.getHTindex());
			tableset.forEach(table ->
			db.avg(data, table, start.getTime(), end.getTime(), readAVG(this.avg), readAVGtype(typeOfAVG),quality.equals(SmearViewUI.CHECKED)));
		}
		db.close();
	}
	
	private int readAVGtype(ComboBox typeOfAVG2) {
    	String v = typeOfAVG2.getValue().toString();
    	if (v.equals(GEOMETRIC)) {
    		return DB.GEOM;
    	}
    	if (v.equals("ARITHMETIC")) {
    		return DB.MEAN;
    	}
    	if (v.equals(SUMM)) {
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
    
    public StreamResource getMetatieto() {
    	if (data != null ) {
    		return new StreamResource(new StreamSource() {
    			private static final long serialVersionUID = 4343017200085855953L;
    			@Override
    			public InputStream getStream() { 
    				String s = getMetatietoContents();
    				if(s != null) {
    					return new ByteArrayInputStream(s.getBytes());
    				}
    				return null;
    			}
    		}, "Smearmetadata"+FILENAME+FNF.format(start)+CSV);
		}else {
			System.err.println("Query return NO data");
			return null;
		}	
    }
    
    public String writeMetaFile() {
    	String filename = "metadata"+FNF.format(start) + "_" + FNF.format(end) + "_" + RandomStringUtils.random(8, false, true)+CSV;
    	String filepath = getFilePath(filename); 
    	if (writeStringToFile(filepath, getMetatietoContents())) {
    		return filename;
    	}
    	return null;
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
    	StringBuilder[] rivi = new StringBuilder[data.getRivienlkm()]; 
    	for (int i = 0; i < rivi.length; i++) {
			rivi[i] = new StringBuilder();
		}
		long[] epoch = data.getUnixtimes();;
		Iterator<String> iter = data.tablelist.iterator();
		boolean eka = true;
		while( iter.hasNext()) {
			String taulunnimi = (String)iter.next();
			String Columnnames[] = data.getLabels(taulunnimi);
			LocalDateTime[] tsat = data.getTimestamps(taulunnimi);
			float[][] faa = data.getFtaulu(taulunnimi); // lähde taulukko
			if ((null != Columnnames) && (null != faa)) {
				for (int i = 0; i < Columnnames.length; i++) {
					String[] samptimes = data.getMuotoaika();
					int used = 0;
					for (int j = 0; (j < data.getRivienlkm()) && (used < faa[i].length); j++) {
						try {
							if ((0 == i) && eka) {
								rivi[j].append(samptimes[j].replaceAll(separator, TAB));    	  								
							}
							rivi[j].append(TAB);
							long itseisarvo = Math.abs(tsat[used].toEpochSecond(ZoneOffset.ofHours(2))-epoch[j]);
							if ( itseisarvo < 10) {  //10s
								rivi[j].append(faa[i][used++]);
							} else {
								rivi[j].append("NA");
							}
						} catch (Exception e) {
							e.printStackTrace();
							return null;
						}
					} 
					eka = false;
				} 
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rivi.length; i++) {
			rivi[i].append(StringPool.NEW_LINE);
			sb.append(rivi[i]);
		}		
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
    	StringBuilder[] rivi = new StringBuilder[METALINES+data.getRivienlkm()]; 
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
		long[] epoch = data.getUnixtimes();;
		Iterator<String> iter = data.tablelist.iterator();
		boolean eka = true;
		while( iter.hasNext()) {
			String taulunnimi = (String)iter.next();
			String Columnnames[] = data.getLabels(taulunnimi);
			LocalDateTime[] tsat = data.getTimestamps(taulunnimi);
			float[][] faa = data.getFtaulu(taulunnimi); // lähde taulukko
			if ((null != Columnnames) && (null != faa)) {
				for (int i = 0; i < Columnnames.length; i++) {
					rivi[0].append(separator);
					String cn = Columnnames[i];
					rivi[0].append("\""+taulunnimi+"."+cn);
					cn = data.clean(cn);
					rivi[0].append(METASEPARATOR);
					//rivi[0].append(mddesc.get(cn).replaceAll(",", ";"));
					rivi[0].append(mddesc.get(cn+MUUTTUJAEROTIN+taulunnimi).replaceAll(",", ";"));
					rivi[0].append(METASEPARATOR);
					//rivi[0].append(metadata.getHTsource().get(cn).replaceAll(",", ";"));
					rivi[0].append(metadata.getHTsource().get(cn+MUUTTUJAEROTIN+taulunnimi).replaceAll(",", ";"));
					rivi[0].append(METASEPARATOR);
					//rivi[0].append(metadata.getHTunit().get(cn)+"\"");
					rivi[0].append(metadata.getHTunit().get(cn+MUUTTUJAEROTIN+taulunnimi)+"\"");
					String[] samptimes = data.getMuotoaika();
					int used = 0;
					for (int j = 0; (j < data.getRivienlkm()) && (used < faa[i].length); j++) {
						if ((0 == i) && eka) {
							rivi[j+METALINES].append(samptimes[j]);    	  								
						}
						rivi[j+METALINES].append(separator);
						long itseisarvo = Math.abs(tsat[used].toEpochSecond(ZoneOffset.ofHours(2))-epoch[j]);
						if ( itseisarvo < 10) {  //10s
							rivi[j+METALINES].append(faa[i][used++]);
						} else {
						}
					} 
					eka = false;
				} 
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rivi.length; i++) {
			rivi[i].append(StringPool.NEW_LINE);
			sb.append(rivi[i]);
		}		
		return sb;
    }
  
    /**
     * Pelkkä metatieto jaettuna neljälle riville, ei dataa, CSV
     * @return String 
     */
    private String getMetatietoContents() {
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
    	if(metadata != null && data != null) {
	    	Hashtable<String, String> mddesc = metadata.getHTdescription();
	    	Iterator<String> iter = data.tablelist.iterator();
	    	while( iter.hasNext()) {
	    		String taulunnimi = (String)iter.next();
	    		String Columnnames[] = data.getLabels(taulunnimi);
	    		if (null != Columnnames) {
	    			for (int i = 0; i < Columnnames.length; i++) {
	    				String cn = Columnnames[i];
	    				rivi[0].append(separator);
	    				rivi[0].append(taulunnimi+"."+cn);    				
	    				cn = data.clean(cn);
	    				rivi[1].append(separator);
	    				rivi[1].append(mddesc.get(cn+MUUTTUJAEROTIN+taulunnimi).replaceAll(",", ";"));
	    				List<SmearvariableEvent> sve = null;
	    				try {
	    					sve = SmearvariableEventLocalServiceUtil.findByVariable(metadata.getHTid().get(cn+MUUTTUJAEROTIN+taulunnimi));
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
	    				rivi[2].append(metadata.getHTsource().get(cn+MUUTTUJAEROTIN+taulunnimi));
	
	    				rivi[3].append(separator);
	    				rivi[3].append(metadata.getHTunit().get(cn+MUUTTUJAEROTIN+taulunnimi));
	    				
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
