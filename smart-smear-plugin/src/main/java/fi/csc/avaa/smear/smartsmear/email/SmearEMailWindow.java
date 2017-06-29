
/**
 * 
 */
package fi.csc.avaa.smear.smartsmear.email;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.vaadin.data.Validator.InvalidValueException;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import fi.csc.avaa.smear.smartsmear.FileType;
import fi.csc.avaa.vaadin.email.ThreadCompleteListener;

/**
 * Smear customised email window getting the file type which is wanted and the functionality which happens when send button is clicked.
 * 
 * @author jmlehtin
 *
 */
public class SmearEMailWindow extends EMailWindowBase<String> {

	private static final long serialVersionUID = 12345678L;
	private NativeSelect fileTypeSelect;
	private static final String WARNING_TEXT_FILE_TYPE_VALIDATION = "Please select a file type";
	
	public SmearEMailWindow(String title, String text, boolean rememberStoredEmailAddress, String storedEmailAddress, boolean closable, boolean resizable, ThreadCompleteListener threadCompleteListener, Map<String, List<String>> selectedVars, String qualityVal, Date startDate, Date endDate) {
		super(title, text, rememberStoredEmailAddress, storedEmailAddress, closable, resizable, threadCompleteListener);
		
		fileTypeSelect = new NativeSelect("Select file type");
		fileTypeSelect.setMultiSelect(false);
		fileTypeSelect.setNullSelectionAllowed(false);
		fileTypeSelect.setRequired(true);
		fileTypeSelect.setRequiredError(WARNING_TEXT_FILE_TYPE_VALIDATION);
		fileTypeSelect.addItems(FileType.CSV, FileType.TXT, FileType.HDF5);
		fileTypeSelect.select(FileType.CSV);
		contentLayout.addComponent(fileTypeSelect, 1);
		
		sendButton.addClickListener(e -> {
			try {
				emailInputField.validate();
				close();
				if(emailAction != null) {
	    			SmearSendEmail thread = new SmearSendEmail(emailInputField.getValue(), emailAction, selectedVars, qualityVal, startDate, endDate);
	    			thread.addListener(threadCompleteListener);
	    			UI.getCurrent().setPollInterval(500);
	    			thread.start();
				}
			} catch(InvalidValueException ex) {
				Notification.show(ex.getMessage());
			}
		});
	}
	
	public NativeSelect getFileTypeField() {
		return fileTypeSelect;
	}
	
	
}