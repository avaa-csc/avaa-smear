
/**
 * 
 */
package fi.csc.avaa.smear.smartsmear.email;

import java.util.function.Supplier;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import fi.csc.avaa.vaadin.email.ThreadCompleteListener;

/**
 * Base class for Vaadin e-mail window, which is used to get user's email address for sending them some information in the emailAction.
 * The window has a title, a description text for the user, an input field to type in the email address and a send button.
 * 
 * @author jmlehtin
 *
 */
public abstract class EMailWindowBase<T> extends Window implements EMailWindow<T> {

	private static final long serialVersionUID = 12345678909L;
	protected VerticalLayout contentLayout;
	protected TextField emailInputField; // Input field for user to input e-mail address
	protected Button sendButton; // Button which is clicked after typing in the e-mail address
	protected static final String WARNING_TEXT_EMAIL_VALIDATION = "Please enter a valid e-mail address";
	protected Supplier<T> emailAction; // Action that is run after user pressed the send button
	protected ThreadCompleteListener threadCompleteListener; // Some listener that is informed after the action has been completed
	
	public EMailWindowBase(String title, String text, boolean rememberStoredEmailAddress, String storedEmailAddress, boolean closable, boolean resizable, ThreadCompleteListener threadCompleteListener) {
		super(title);
		this.threadCompleteListener = threadCompleteListener;
		this.emailAction = null;
		Label description = new Label(text);
		description.setContentMode(ContentMode.HTML);
		
		contentLayout = new VerticalLayout();
		contentLayout.setMargin(true);
		contentLayout.setSpacing(true);
		
		emailInputField = new TextField("E-mail address");
		emailInputField.setImmediate(true);
		emailInputField.setRequired(true);
		emailInputField.setRequiredError(WARNING_TEXT_EMAIL_VALIDATION);
		emailInputField.addValidator(new EmailValidator(WARNING_TEXT_EMAIL_VALIDATION));
		if(rememberStoredEmailAddress && storedEmailAddress != null && !storedEmailAddress.isEmpty()) {
			emailInputField.setValue(storedEmailAddress);
		}
		
		sendButton = new Button("Send");
		
		contentLayout.addComponent(description);
		contentLayout.addComponent(emailInputField);
		contentLayout.addComponent(sendButton);
		
		setWindowMode(WindowMode.NORMAL);
		setTabStopEnabled(true);
		setResizable(resizable);
		setModal(true);
		setClosable(closable);
		center();
		setContent(this.contentLayout);
	}
	
	@Override
	public String getEmailFieldValue() {
		return emailInputField.getValue();
	}

	@Override
	public void setEmailAction(Supplier<T> emailAction) {
		this.emailAction = emailAction;
	}
	
}