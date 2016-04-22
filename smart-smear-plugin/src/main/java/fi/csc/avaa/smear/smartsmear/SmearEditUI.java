package fi.csc.avaa.smear.smartsmear;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.data.Validator;
import com.vaadin.data.Validator.InvalidValueException;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.UI;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class SmearEditUI extends UI {
	private static final long serialVersionUID = 3079770321922379009L;
	private static final String MAX_SCOPE = "maxScope";
	private static final String TILA = "state";
	private static final String CONTACT_EMAIL = "";

	@Override
	protected void init(VaadinRequest request) {
		final PortletPreferences portletPreferences = ((PortletRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST)).getPreferences();
		
		VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		
		final TextField maxScopeTf = new TextField("Maximum day scope for visualisations");
		maxScopeTf.setImmediate(true);
		maxScopeTf.setValue(portletPreferences.getValue(MAX_SCOPE, "not set"));
		maxScopeTf.addValidator(new MaxScopeValidator());
		layout.addComponent(maxScopeTf);
		
		final OptionGroup stateOG = new OptionGroup();
		stateOG.setImmediate(true);
		stateOG.setMultiSelect(false);
		stateOG.addItems("Dashboard", "Search", "Download");
		stateOG.setValue(portletPreferences.getValue(TILA, "not set"));
		Panel pan = new Panel("Portlet is used as a dashboard/search/download -component");
		pan.setWidth("30%");
		pan.setContent(stateOG);
		
		
		layout.addComponent(maxScopeTf);
		layout.addComponent(pan);
		Button storeButton = new Button("Save preferences");
		storeButton.setImmediate(true);
		layout.addComponent(storeButton);
		
		storeButton.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = -7286274148631006454L;

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					maxScopeTf.validate();
					portletPreferences.setValue(MAX_SCOPE, maxScopeTf.getValue());
					portletPreferences.setValue(TILA, stateOG.getValue().toString());
					portletPreferences.store();
				} catch (InvalidValueException e) {
					Notification.show(e.getMessage(), Type.ERROR_MESSAGE);
				} catch (Exception e) {
					Notification.show("Failed to save preference value", Type.ERROR_MESSAGE);
				}
			}
		});
		final TextArea contacts = new TextArea("Contacts");
		contacts.setHeight("400");
		contacts.setWidth("400");
		contacts.setValue(portletPreferences.getValue(CONTACT_EMAIL, ""));
		layout.addComponent(contacts);
		Button clear = new Button("Clear");
		clear.setImmediate(true);
		layout.addComponent(clear);
		clear.addClickListener(new Button.ClickListener() {
			//private static final long serialVersionUID = -7286274148631006454L;

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					portletPreferences.setValue(CONTACT_EMAIL, "");
					portletPreferences.store();
					contacts.setValue("");
				} catch (InvalidValueException e) {
					Notification.show(e.getMessage(), Type.ERROR_MESSAGE);
				} catch (Exception e) {
					Notification.show("Failed to save preference value", Type.ERROR_MESSAGE);
				}
			}
		});
	}
	
	private class MaxScopeValidator implements Validator {
		private static final long serialVersionUID = -2971937978498281004L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			try {
				int val = Integer.valueOf(value.toString());
				
				if (val < 1) {
					throw new InvalidValueException("Value must be larger than 0");
				}
			} catch (NumberFormatException e) {
				throw new InvalidValueException("Value is not an integer number");
			}
		}
	}
}
