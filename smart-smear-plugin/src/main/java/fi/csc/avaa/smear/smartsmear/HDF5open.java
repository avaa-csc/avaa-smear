/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.io.Serializable;
import java.util.Date;

import fi.csc.avaa.smear.smartsmear.Data;
import fi.csc.avaa.smear.smartsmear.Metadata;

/**
 * Serialisoitava viestinvälitys luokka
 *
 * PLEASE NOTE: If you make any changes to this class, make sure to make changes also to the corresponding class in
 * HDF5writer project. Having HDF5writer as a dependency to this project caused more grey hair than having these
 * classes in both projects. -Juha-Matti Lehtinen
 *
 * @author pj
 *
 */
public class HDF5open implements Serializable {
	private static final long serialVersionUID = 5999457104420586567L;
	public Data data;
	public Metadata metadata;
	public String typeOfAVG;
	public String filepath;
	public Date start; 
	public Date end;
	public String spatial;
	public String stationid;
}
