/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.smear.db.model.SmearVariableMetadata;
import fi.csc.smear.db.model.SmearTableMetadata;
import fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
/**
 * Store metadata of the variables as Hashtable by variable
 * 
 * @author pj
 *
 */
public class Metadata  implements Serializable {

	private static final long serialVersionUID = 5999457104420586561L;
	private Hashtable<String, String> httitle = new  Hashtable<String, String>();
	private Hashtable<String, String> htunit = new  Hashtable<String, String>();
	private Hashtable<String, String> htdescription = new  Hashtable<String, String>();
	private Hashtable<String, String> htsource = new  Hashtable<String, String>();
	private Hashtable<String, Integer> htindex = new  Hashtable<String, Integer>();
	private Hashtable<String, Long> htid = new Hashtable<String, Long>();
	
	public Metadata(List<SmearVariableMetadata> mdata ) {
		// from HDF5
		SmearVariableMetadata vm = null;
		SmearTableMetadata stmd = null;
		
		for (int i = 0; i < mdata.size(); i++) {
			vm = mdata.get(i);
			try{
				stmd = SmearTableMetadataLocalServiceUtil.getSmearTableMetadata(vm.getTableID());
			} catch(PortalException pe) {
				pe.printStackTrace();
			} catch (SystemException se) {
				se.printStackTrace();
			}
			httitle.put(vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName(), vm.getTitle());
			htunit.put(vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName(), vm.getUnit());
			htdescription.put(vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName(), vm.getDescription());
			htsource.put(vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName(), vm.getSource());
			
			
			htindex.put((vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName()), i);
			htid.put(vm.getVariable()+Download.MUUTTUJAEROTIN+stmd.getName(), vm.getVariableID());
		}		
	}

	public Hashtable<String, Integer> getHTindex() {
		return htindex;
	}
	
	public Hashtable<String, String> getHTtitle() {
		return httitle;
	}

	public Hashtable<String, String>  getHTunit() {
		return htunit;
	}
	public Hashtable<String, Long>  getHTid() {
		return htid;
	}
	/**
	 * Getter for htdescription
	 * 
	 * @return htdescription Hashtable<String, String>
	 */
	public Hashtable<String, String> getHTdescription() {
		return htdescription;
	}
	
	/**
	 * Getter for htsource
	 * 
	 * @return htsource Hashtable<String, String>
	 */
	public Hashtable<String, String>  getHTsource () {
		return htsource ;
	}


}
