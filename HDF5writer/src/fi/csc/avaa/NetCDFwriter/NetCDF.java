/**
 * 
 */
package fi.csc.avaa.NetCDFwriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import fi.csc.avaa.HDF5open;
import fi.csc.avaa.HDF5writer.HDF5writer;
import fi.csc.avaa.smear.smartsmear.Data;
import fi.csc.avaa.smear.smartsmear.Metadata;
import fi.csc.avaa.smear.smartsmear.SmearViewUI;
import ucar.ma2.Array;
import ucar.ma2.InvalidRangeException;
import ucar.nc2.Attribute;
import ucar.nc2.Dimension;
//import ucar.nc2.FileWriter2;
import ucar.nc2.Group;
import ucar.nc2.NetcdfFile;
import ucar.nc2.NetcdfFileWriter;
import ucar.nc2.Variable;
/*import ucar.nc2.dataset.NetcdfDataset;
import ucar.nc2.ft.FeatureDataset;
import ucar.nc2.ft.FeatureDatasetImpl;*/

/**
 * @author pj
 *
 */
public class NetCDF {
	static DateFormat formatter = new SimpleDateFormat(HDF5writer.ISO8601);
	private static Data data;
	private static Metadata mdata;
	int stationno;
	private Date start; 
	private Date end;
	private String location = "";
	private String filename = "";
	static HDF5open ho = null;
	
	public static void main(String [] args) {
		
		try
		{
			FileInputStream fileIn = new FileInputStream("/tmp/"+args[0]+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ho = (HDF5open) in.readObject();
			mdata = ho.metadata;
			data = ho.data;
			in.close();
			fileIn.close();
			createNetCDFile();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("HDF5 class not found");
			c.printStackTrace();
			return;
		}
	}
	
	/*
	public NetCDF(Download dl, Date start, Date end, int station ) {
		this.data = dl.data;
		this.start = start;
		this.end = end;
		this.stationno = station;
		this.mdata = SmearViewUI.getMetadata();	
		this.filename = Download.getFilename(start, end, ".nc");
		this.location = Download.getFilePath(filename);
	}*/
	
	/**
	 * 
	 * @return
	 */
	public  static void createNetCDFile() {
		NetcdfFileWriter nfr = null;
		//NetcdfFile nf = null;
		try {
			nfr = NetcdfFileWriter.createNew(NetcdfFileWriter.Version.netcdf4,ho.filepath, null);
			//nf = nfr.getNetcdfFile();
			//nf = NetcdfDataset.open(location);
			//Group root = nf.getRootGroup();
			Group root = nfr.addGroup(null, ""); //get the root=/ group: ¤%%&&# API 
			Date date = new Date();
			root.addAttribute(new Attribute("metadata date of modification", formatter.format(date)));	
			root.addAttribute(new Attribute("distributor contact",
			"University of Helsinki, Departement of Atmospheric Sciences, Departement of Physical Sciences, atm-data@helsinki.fi"));
			root.addAttribute(new Attribute("Cite", SmearViewUI.CITE));
			root.addAttribute(new Attribute("access rights",
			"<RightsDeclaration RIGHTSCATEGORY=”LICENSED”>http://creativecommons.org/licenses/by-sa/4.0/</RightsDeclaration>"));
			root.addAttribute(new Attribute("project", "http://www.atm.helsinki.fi/SMEAR/"));
			long[] epoch = data.getUnixtimes();
			/*System.out.println("epoch length: "+ epoch.length);		
			Dimension dim = new Dimension("samptime", epoch.length);
			System.out.println("dim.getLength(): "+dim.getLength());
			samptime.setDimension(0, dim);
			root.addVariable(samptime);*/
			//nfr.addDimension(root, "SCALAR", epoch.length);
			Variable samptime = nfr.addVariable(root, "samptime", ucar.ma2.DataType.LONG, "");
			Variable[] v = new Variable[100];
		    Iterator<String> iter = data.tableset.iterator();
		    while( iter.hasNext()) {
		    	String taulunnimi = (String)iter.next();
		    	float[][] fa = data.getFtaulu(taulunnimi);
				Group station = nfr.addGroup(root, taulunnimi);
				station.addAttribute(new Attribute("metadata date of modification",formatter.format(ho.end)));
				station.addAttribute(new Attribute("identifier", ho.stationid));
				station.addAttribute(new Attribute("geographicalCoverage", ho.spatial));

		    	//int cc = fa.length;
		    	String[] ColumnNames =  data.getLabels(taulunnimi);
		    	if (null != ColumnNames) {
		    		int cc = ColumnNames.length;
		    		for (int i = 0; i < cc; i++) {		    	
		    			v[i] = createVariable(ColumnNames[i], station, nfr, fa[i]);								
		    		}
		    	}
		    }
			nfr.create();
			nfr.write(samptime, Array.factory(epoch));
			iter = data.tableset.iterator();
			while( iter.hasNext()) {
				String taulunnimi = (String)iter.next();
		    	float[][] fa = data.getFtaulu(taulunnimi);
		    	String[] ColumnNames =  data.getLabels(taulunnimi);
		    	if (null != ColumnNames) {
		    		int cc = ColumnNames.length;
		    		for (int i = 0; i < cc; i++) {		    	
		    			nfr.write(v[i], Array.factory(fa[i]));								
		    		}
		    	}
			}
			
			//FileWriter2 writer = new ucar.nc2.FileWriter2(nf, location, NetcdfFileWriter.Version.netcdf4, null);
			//ncd = new NetcdfDataset(nf);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidRangeException e) {
			System.err.println("InvalidRangeException: ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Muu virhe: ");
			e.printStackTrace();
		} finally {
			try {
				//nf.close();
				nfr.close();
				//ncd.close();
			} catch (IOException e) {
				System.out.println("Cann't close netcdf");
			}
		}	
	}

	/**
	 * Luo sarakkeesta netCDF vektorimuotoisen (1-ylotteisen) Variablen, johon liitetään metatiedot
	 * 
	 * @param sarake String 
	 * @param station Group
	 * @param nf	NetcdfFile
	 * @param fs float[]
	 * @return Variable with metadata
	 */
	private static Variable createVariable(String sarake, Group station, NetcdfFileWriter nfw,
			float[] fs) {
		Variable v = nfw.addVariable(station, sarake, ucar.ma2.DataType.FLOAT, "");
		/*Dimension dim = new Dimension(sarake, fs.length);
		v.setDimension(1, dim);*/
		String name = data.clean(sarake);
		v.addAttribute(new Attribute("title", mdata.getHTtitle().get(name)));
		v.addAttribute(new Attribute("unit", mdata.getHTunit().get(name)));
		//station.addVariable(v);
		return v;	
	}
	
	
}

