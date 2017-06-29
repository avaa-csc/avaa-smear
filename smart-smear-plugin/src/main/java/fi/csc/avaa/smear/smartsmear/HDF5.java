package fi.csc.avaa.smear.smartsmear;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import com.vaadin.ui.ComboBox;

/**
 * write HDF5 file
 *  CLASSPATH jhdf5obj.jar:jhdf5.jar:jhdfobj.jar:
 *
 * Copyright (c) CSC 2012, 2013, 2014, 2015
 * @author Pekka Järveläinen
 */
public class HDF5 implements Runnable{

	final static String ISO8601 = "yyyy-MM-dd'T'HH:mm:ssz";	
	final static String  HDF5PATH = "/opt/avaa/tools/smear/hdf5/java/";
	final static String LIB = "latest/lib";
	//final static int GZIPNO = 0;
	//final static int GZIPYES = 1; //ei toiminut v 2012
	//final static int CLSTRING =  Datatype.CLASS_STRING;
	final static int SAMTIMELENGTH = 19; //second accurance, 21 with .0 seconds
	//private static FileFormat fileFormat = null;
	private Date start; 
	private Date end;
	//private Download dl;
	private Data data;
	private int stationno;
	private Metadata mdata;
	private File file;	

	private String filename = "";
	private String filePath = "";

	private static final String HDF5 = ".hdf5";
	//Columns columns = null;	
	
	private ComboBox typeOfAVG;
		
	public HDF5(Download dl, Date start, Date end, int station, int avg, ComboBox typeOfAVG, boolean useThread, Metadata metadata) {
		//this.dl = dl;	
		this.data = dl.data;
		this.start = start;
		this.end = end;
		this.stationno = station;
		this.mdata = metadata;	
		//this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.filename = Download.getFilename(start, end, HDF5);
		this.filePath = Download.getFilePath(this.filename); 
		this.file = new File(this.filePath); // cann't be in the thread, used after constructor 
		if (null == file) {
			System.err.println("file was null!" + filePath);
		}
		if(useThread) {
			new Thread(this).start();
		}
	}
	
	@Override
	public void run() {	
		HDF5open ho = new HDF5open();
		ho.typeOfAVG = (String)typeOfAVG.getValue();
		ho.start = start;
		ho.end = end;
		ho.data = data;
		ho.metadata = mdata;
		ho.filepath = filePath;
		ho.spatial =  Station.getGeographicalCoverage(stationno);
		ho.stationid = Station.getIdentifier(stationno);
		try		{
			File tmp = new File("/tmp/"+filename+".ser");
			FileOutputStream fileOut =
					new FileOutputStream(tmp);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(ho);
			out.close();
			fileOut.close();
			//http://commons.apache.org/proper/commons-exec/apidocs/index.html
			Map<String,String> environment = new HashMap<String,String>();
			environment.put("CLASSPATH", ".:"+LIB+"/hdf-java-3.2.1.jar");
			String line = "/etc/alternatives/jre_1.8.0/bin/java -Djava.library.path="+HDF5PATH+LIB+
					" -jar HDF5writer-0.4.jar "+ tmp.getAbsolutePath();
			CommandLine cmdLine = CommandLine.parse(line);
			DefaultExecutor executor = new DefaultExecutor();
			executor.setExitValue(0);
			executor.setWorkingDirectory(new File(HDF5PATH));
			int exitValue = executor.execute(cmdLine, environment);
			if (0 == exitValue) {
				tmp.delete();
			} else {
				System.err.println("HDF5 creation failed: "+exitValue);
				System.err.println("Serialized data is saved in /tmp/"+filename+".ser");
				file = null;
				return;
			}
			
		} catch(IOException i) {
			i.printStackTrace();
			file = null;
			return;
		}
		file = new File(filePath);
	}
	
	/**
	 * Kirjoittaa Vektorin HDF5 tiedostoon.
	 * Taulu parametrin voisi lisätä.
	 * 
	 * @param name	Tietokantasarakkeen nimi
	 * @param station	Group (HDF5)
	 * @param nativefloat Datatype (HDF5)
	 * @param dims 	long [] yksiulotteinen: dims[0] =  rows ;
	 * @param fa	float[] Tiedostoon kirjoitettava data
	 */
	/*private void createAndWriteDS(String name, Group station, Datatype nativefloat, long [] dims, float fa[]) {

			Dataset dataset;
			try {
				dataset = h5f.createScalarDS(name, station, nativefloat, dims,
						null, null, GZIPNO, fa);
				metawrite(dataset, data.clean(name));
				dataset.write(fa);
			} catch (ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException e) {
				System.err.println(e+" HDF5LibraryException: "+name);
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	
   
	private void metawrite(Dataset dataset, String name) {
		String title = mdata.getHTtitle().get(name);
		if (null != title) {
			try {
				dataset.writeMetadata(attribute("title", CLSTRING, title));
			} catch (Exception e) {
				System.out.println("Type Exception HD5 title metawrite");
				e.printStackTrace();
			}
		} else {
			System.err.println("There is no title for name "+name);
		}
		String unit = mdata.getHTunit().get(name);
		if (null != unit) {
			try {
				dataset.writeMetadata(attribute("unit", CLSTRING, unit));
			} catch (Exception e) {
				System.out.println("Type Exception HD5 unit metawrite");
				e.printStackTrace();
			}
		} else {
			System.err.println("There is no unit for name "+name);
		}
		String desc = mdata.getHTdescription().get(name);
		if (null != desc) {
			try {
				dataset.writeMetadata(attribute("Description", CLSTRING, desc));
			} catch (Exception e) {
				System.out.println("Type Exception HD5 desc metawrite");
				e.printStackTrace();
			}
		} else {
			System.err.println("There is no desc for name "+name);
		}
	}*/

	/**
     * Create single 1 dimension Attribute and set value
     */
    /* Attribute attribute(String name, int type, String value) {
        long[] dims = { 1 };
        String values[] = new String[1];
        values[0] = value;
        Datatype datatype = null;
        int dtype = 0;
        try {
            //+4 sallii pari ä-kirjainta, jotka ovat pitempiä UTF-8 koodauksessa
            //varmaan jomman kumman Datatype.NATIVE tilalla pitäisi olla CharacterEncoding.UTF8
            //JNI sucks. Mutta NCSA erikseen sanoo, etteivät aio tehdä puhdasta java toteutusta.
            datatype = h5f.createDatatype(type,  value.length()+4,  Datatype.NATIVE, Datatype.NATIVE);
            dtype = datatype.toNative();
            H5.H5Tset_cset(dtype, HDF5Constants.H5T_CSET_UTF8); 
            //System.out.println("Onnistui luoda merkkijono"+dtype);
        } catch ( ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException e )  {
            System.out.println("Error to createDatatype"+e.getMajorErrorNumber() +e.getMessage());
        } catch ( Exception e )  {
            System.out.println("Other error to createDatatype"+e.toString());
        }
        Attribute result = new Attribute(name, datatype, dims);
        result.setValue(values);
        datatype.close(dtype);
        return result;
    }*/

	/**
	 * HDF5 file was written to DIR = "/var/www/html/tmp/";
	 * @return File
	 */
	public synchronized File getFile() {
		return file;
	}

	public String createHDF5File() {
		this.run(); //??? onko olemassa tilanne, jossa tämä on jo ajettu?
		return filename;
	}
		
}
