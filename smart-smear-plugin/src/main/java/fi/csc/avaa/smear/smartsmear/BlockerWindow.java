package fi.csc.avaa.smear.smartsmear;

import com.vaadin.ui.*;

/**
 * Created by jmlehtin on 8/11/2016.
 */
public class BlockerWindow extends Window {

	public BlockerWindow(String message) {
		this.setResizable(false);
		this.setDraggable(false);
		this.setModal(true);
		this.center();
		this.setStyleName("loading-window");
		this.setClosable(false);

		setCaption("Loading");
		setWidth("400px");
		setHeight("150px");

		ProgressBar loadingIndicator = new ProgressBar();
		loadingIndicator.setStyleName("preload-spinner");
		loadingIndicator.setIndeterminate(true);

		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		mainLayout.setMargin(true);

		Label msg = new Label(message);
		mainLayout.addComponent(msg);
		mainLayout.addComponent(loadingIndicator);
		mainLayout.setComponentAlignment(msg, Alignment.TOP_CENTER);
		mainLayout.setComponentAlignment(loadingIndicator, Alignment.MIDDLE_CENTER);

		this.setContent(mainLayout);
	}
}
