/**
 * 
 */
package fi.csc.avaa.HDF5writer;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import fi.csc.avaa.HDF5open;
import fi.csc.avaa.smear.smartsmear.Data;
import fi.csc.avaa.smear.smartsmear.Metadata;
import fi.csc.avaa.smear.smartsmear.SmearViewUI;
import ncsa.hdf.hdf5lib.H5;
import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.object.Attribute;
import ncsa.hdf.object.Dataset;
import ncsa.hdf.object.Datatype;
import ncsa.hdf.object.FileFormat;
import ncsa.hdf.object.Group;
import ncsa.hdf.object.h5.H5File;


/**
 * Create HDF5-file using serialized input
 * 
 * @author pj
 *
 */
public class HDF5writer {

	public final static String ISO8601 = "yyyy-MM-dd'T'HH:mm:ssz";	
	final static int GZIPNO = 0;
	final static int GZIPYES = 1; //ei toiminut v 2012
	final static int CLSTRING =  Datatype.CLASS_STRING;
	final static int SAMTIMELENGTH = 19; //second accurance, 21 with .0 seconds
	private static  Metadata mdata;
	static  Data data;
	static DateFormat formatter = new SimpleDateFormat(ISO8601);
	static H5File h5f;
	private static String filePath = "";
	static HDF5open ho = null;
	
	public static void main(String [] args) {
		
		try	{
			FileInputStream fileIn = new FileInputStream(args[0]);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ho = (HDF5open) in.readObject();
			mdata = ho.metadata;
			data = ho.data;
			in.close();
			fileIn.close();
			filePath = ho.filepath;
			//System.out.println("Filepath: "+filePath);
			createHDF5File();
		}catch(IOException i)
		{
			i.printStackTrace();
			System.exit(10);
		}catch(ClassNotFoundException c)
		{
			System.out.println("HDF5 class not found");
			c.printStackTrace();
			System.exit(11);
		}
	}

	public static void createHDF5File() {
		
		String stationname = "Smeardata";

		try {
			FileFormat fileFormat = FileFormat.getFileFormat(FileFormat.FILE_TYPE_HDF5);
			if (null == fileFormat) {
			    System.err.println("Failed to getFileFormat: "+filePath);				//homma kaatuu null-pointeriin seuraavalla rivillä 
			    System.exit(1);
			}
			h5f = (H5File)fileFormat.createFile(filePath, FileFormat.FILE_CREATE_DELETE );
			if (h5f  == null) {
				System.err.println("Failed to create file: "+filePath);
				System.exit(2);
			}
			if (-1 == h5f.open()) {
				System.err.println("Failed to open file: "+filePath);
				System.exit(3);
			}
			//file = new File(filename);
			Group root = (Group)((javax.swing.tree.DefaultMutableTreeNode)h5f.getRootNode()).getUserObject();
			Group station = h5f.createGroup(stationname, root);
			station.writeMetadata(attribute("metadata identifier", CLSTRING, "URN:NBN:fi-fe201207066171"));
			Date date = new Date();
			station.writeMetadata(attribute("metadata date of modification", CLSTRING, formatter.format(date)));		
			station.writeMetadata(attribute("identifier", CLSTRING, ho.stationid));
			station.writeMetadata(attribute("date of modification", CLSTRING,  formatter.format(ho.end)));
			station.writeMetadata(attribute("typeOfAVG", CLSTRING, ho.typeOfAVG));
			station.writeMetadata(attribute("isPartOf", CLSTRING, "http://www.atm.helsinki.fi/SMEAR/"));
			h5f.writeAttribute(root, attribute("distributor contact", CLSTRING,
					"University of Helsinki, Departement of Atmospheric Sciences, Departement of Physical Sciences, atm-data@helsinki.fi"),
					false);
			h5f.writeAttribute(root, attribute("Cite", CLSTRING, SmearViewUI.CITE), false);
			station.writeMetadata(attribute("title", CLSTRING, stationname + " SMEAR "+
					formatter.format(ho.start)+"-"+formatter.format(ho.end)));
			station.writeMetadata(attribute("geographicalCoverage", CLSTRING, ho.spatial));
			h5f.writeAttribute(root, attribute("access rights", CLSTRING,
					"<RightsDeclaration RIGHTSCATEGORY=”LICENSED”>http://creativecommons.org/licenses/by-sa/4.0/</RightsDeclaration>"), false);
			h5f.writeAttribute(root, attribute("project", CLSTRING, "http://www.atm.helsinki.fi/SMEAR/"), false);
		
			Datatype unixtime = h5f.createDatatype(Datatype.CLASS_INTEGER, 8, Datatype.NATIVE, Datatype.NATIVE);
		    Datatype isodate =  h5f.createDatatype(CLSTRING, SAMTIMELENGTH, Datatype.NATIVE, Datatype.NATIVE);
		    Datatype meteocode =  h5f.createDatatype(CLSTRING, 3, Datatype.NATIVE, Datatype.NATIVE);
		    Datatype nativefloat = h5f.createDatatype(Datatype.CLASS_FLOAT, 4, Datatype.NATIVE, Datatype.NATIVE);
		    
		    long  dims[] = new long[1];
		    String[] samptimes = data.getSamptimes();
		    if(samptimes == null) {
		    	System.out.println("samptimes == null");
		    	System.exit(4);
		    }
		    int rows = samptimes.length;
			dims[0] =  rows ;
		    Dataset dataset = h5f.createScalarDS("samptime", station, isodate, dims, null, null, GZIPNO, samptimes);
		    if (null == dataset) { System.out.println("NULLdataset"); }
		    System.out.println("Ajanpituus: "+samptimes[0].length());
		    dataset.write(samptimes);
		    dataset = h5f.createScalarDS("UNIXtime", station, unixtime, dims, null, null, GZIPNO, data.getUnixtimes());
		    dataset.write(data.getUnixtimes());
		    Iterator<String> iter = data.tableset.iterator();
		    while( iter.hasNext()) {
		    	String taulunnimi = (String)iter.next();
		    	float[][] fa = data.getFtaulu(taulunnimi);
		    	//int cc = fa.length;
		    	String[] ColumnNames =  data.getLabels(taulunnimi);
		    	if (null != ColumnNames) {
		    		int cc = ColumnNames.length;
		    		System.out.println("HDFsarakkeet: "+cc);
		    		for (int i = 0; i < cc; i++) {
		    			if (!ColumnNames[i].equals(data.getNWSname())) {
		    				createAndWriteDS(ColumnNames[i], station, nativefloat, dims,  fa[i], taulunnimi);
		    			}
		    		}
		    	}
		    }
		    String nws[] = data.getNWS();
		    if (null != nws) {
		    	try  {
		    	 dataset = h5f.createScalarDS(data.getNWSname(), station, meteocode, dims, null, null, GZIPNO, nws);		    			    
		    	 dataset.write(nws);
		    	} catch (ncsa.hdf.hdf5lib.exceptions.HDF5SymbolTableException e ) {
		    		System.err.println("HDF5 NWS virhe: "+data.getNWSname());
		    		e.printStackTrace();
		    	}
		    }
		    h5f.close();
		} catch (Exception e) {
				System.err.println("HDF5 luontivirhe: ");
				e.printStackTrace();			
		}
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
    private static void createAndWriteDS(String name, Group station, Datatype nativefloat, long [] dims, float fa[], String taulunnimi) {

			Dataset dataset;
			try {
				dataset = h5f.createScalarDS(name, station, nativefloat, dims,
						null, null, GZIPNO, fa);
				metawrite(dataset, data.clean(name)+":"+taulunnimi); //13.11. Metadata.javan muutos
				dataset.write(fa);
			} catch (ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException e) {
				System.err.println(e+" HDF5LibraryException: "+name);
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	
   
	private static void metawrite(Dataset dataset, String name) {
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
	}

	/**
     * Create single 1 dimension Attribute and set value
     */
     static Attribute attribute(String name, int type, String value) {
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
    }

}
