
/**
 * 
 */
package fi.csc.avaa.smear.smartsmear.email;

import java.util.function.Supplier;

/**
 * Generic interface for a Vaadin e-mail window, which does an action after e-mail address has been provided in the window.
 * 
 * @author jmlehtin
 *
 */
public interface EMailWindow<T> {

	public String getEmailFieldValue();
	
	public void setEmailAction(Supplier<T> emailAction);
	
}