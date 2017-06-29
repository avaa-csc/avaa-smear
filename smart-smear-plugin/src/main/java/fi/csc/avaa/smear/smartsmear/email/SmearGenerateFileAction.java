/**
 * 
 */
package fi.csc.avaa.smear.smartsmear.email;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Tree;

import fi.csc.avaa.smear.smartsmear.DB;
import fi.csc.avaa.smear.smartsmear.Download;
import fi.csc.avaa.smear.smartsmear.FileType;
import fi.csc.avaa.smear.smartsmear.Metadata;
import fi.csc.avaa.smear.smartsmear.SmearViewUI;
import fi.csc.avaa.smear.smartsmear.VariableItemStyleGenerator;
import fi.csc.avaa.vaadin.email.Action;

import java.util.List;

/**
 * This class implements the functionality of what happens when a user clicks send after providing email address to SmearEmailWindow.
 * 
 * @author jmlehtin
 *
 */
public class SmearGenerateFileAction implements Action<String> {

	private NativeSelect fileType;
	private PopupDateField start;
	private PopupDateField end;
	private DB db;
	private Tree tree;
	private Metadata metadata;
	private ComboBox avg;
	private ComboBox typeOfAVG;
	private ComboBox quality;

	public SmearGenerateFileAction() {
		
	}
	public SmearGenerateFileAction(PopupDateField start, PopupDateField end, DB db, Tree tree, Metadata metadata, ComboBox avg, ComboBox typeOfAVG, ComboBox quality, NativeSelect fileType) {
		this.start = start;
		this.end = end;
		this.db = db;
		this.tree = tree;
		this.metadata = metadata;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.quality = quality;
		this.fileType = fileType;
	}

	@Override
	public String doAction() {
		synchronized(this) {
			return generateFile(new Download(start.getValue(), end.getValue(), db, SmearViewUI.getSelectedVariables(tree), null, metadata, avg, typeOfAVG, String.valueOf(quality.getValue())));
		}
	}

	private String generateFile(Download dl) {
		FileType fileTypeVal = (FileType) fileType.getValue();
		switch (fileTypeVal) {
		case CSV:
			return dl.writeCsvFile();
		case HDF5:
			return dl.writeHDF5File();
		case NETCDF:
			return null;
		case TXT:
			return dl.writeTabFile();
		default:
			return null;
		}
	}
}
