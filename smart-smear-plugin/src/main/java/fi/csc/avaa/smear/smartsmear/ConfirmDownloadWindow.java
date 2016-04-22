package fi.csc.avaa.smear.smartsmear;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import com.vaadin.server.FileDownloader;
import com.vaadin.server.FileResource;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import fi.csc.avaa.vaadin.email.ThreadCompleteListener;

/**
 * Modal confirmation dialog popup window showing the message as formatted.
 * Only one Ok button for confirmation.
 *
 */
public class ConfirmDownloadWindow extends Window implements ThreadCompleteListener {
	private static final long serialVersionUID = 1L;
	private boolean confirmed;
	private FileDownloader downloaderCSV;
	private FileDownloader downloaderMETA;
	private FileDownloader downloaderTXT;
	private FileDownloader downloaderHDF5;
	private VerticalLayout main;
	private String message;
	private String apiCall;
	private SmearDownloadUI dlUI;
	private ProgressBar pBar;
	private HorizontalLayout dllayout;
	
	/**
	 * Constructor.
	 * 
	 * @param caption - the caption of the popup window
	 * @param message - the message to be shown
	 */
	//public ConfirmDownloadWindow(String caption, String message, StreamResource sr) {
	public ConfirmDownloadWindow(String caption, String message, String apicall, Date start, Date end, DB db, String varsta, Metadata mdata, ComboBox avg, ComboBox typeOfAVG, String quality, VariableItemStyleGenerator itemStyle, SmearDownloadUI dlUI, HorizontalLayout dllayout) {
		super(caption);
		this.dlUI = dlUI;
		this.dllayout = dllayout;
		init(message, apicall, start, end, db, varsta, mdata, avg, typeOfAVG, quality, itemStyle);
	}

	private void init(String message, String apicall, Date start, Date end, DB db, String varsta, Metadata mdata, ComboBox avg, ComboBox typeOfAVG, String quality, VariableItemStyleGenerator itemStyle) {
		this.message = message;
		this.apiCall = apicall;
		
		DownloadThread dlThread = new DownloadThread(start, end, db, new HashSet<String>(Arrays.asList(varsta)), mdata, avg, typeOfAVG, quality, itemStyle);
		dlThread.addListener(ConfirmDownloadWindow.this);
		UI.getCurrent().setPollInterval(100);
		pBar = new ProgressBar();
		pBar.setIndeterminate(true);
		pBar.setEnabled(false);
		dllayout.addComponent(pBar);
		dlThread.start();
	}
	public boolean isConfirmed() {
		return confirmed;
	}

	@Override
	public void notifyOfThreadComplete(Thread thread) {
		if(thread instanceof DownloadThread) {
			DownloadThread dlThread = (DownloadThread) thread;
			Download dl = dlThread.getDownload();
			
			if(dl != null && !dl.allHaveErrors()) {
				FileLoaderThread fileThread = new FileLoaderThread(dl);
				UI.getCurrent().setPollInterval(100);
				fileThread.addListener(ConfirmDownloadWindow.this);
				fileThread.start();
			} else {
				dllayout.removeComponent(pBar);
			}
		} else if(thread instanceof FileLoaderThread) {
			FileLoaderThread fileThread = (FileLoaderThread) thread;
			
			StreamResource csvFileRes = fileThread.getCsvStreamRes();
			StreamResource txtFileRes = fileThread.getTxtStreamRes();
			StreamResource metaFileRes = fileThread.getMetaStreamRes();
			FileResource hdf5FileRes = fileThread.getHdf5FileRes();
			
			setModal(true);
			setResizable(false);
	
	        main = new VerticalLayout();
			main.setMargin(true);
			main.setSpacing(true);
			
			// Put some components in it
	        VerticalLayout text = new VerticalLayout();
	        // Need richtextarea for fancy html, but need also textarea for api call url, so user can paint-copy-paste the url. 
	        RichTextArea textArea = new RichTextArea();
	        TextArea call = new TextArea();
	        call.setValue(apiCall);
	        //call.setReadOnly(true);
	        //textArea.setWordwrap(false);
	        textArea.setValue(message);
	        textArea.setReadOnly(true);
	        textArea.setWidth(10, Unit.CM);
	        //textArea.setHeight(10, Unit.CM);
			text.setMargin(true);
			text.addComponent(textArea);
			text.addComponent(call);
			downloaderCSV = new FileDownloader(new StreamResource(null, ""));
			downloaderTXT = new FileDownloader(new StreamResource(null, ""));
			downloaderMETA = new FileDownloader(new StreamResource(null, ""));
			downloaderHDF5 = new FileDownloader(new StreamResource(null, ""));
			
			HorizontalLayout buttons = new HorizontalLayout();
			buttons.setSpacing(true);
			Button csv = new Button("CSV");
			Button txt = new Button("TXT");
			Button meta = new Button("META");
			Button hdf5 = new Button("HDF5");
			if(csvFileRes != null) {
				downloaderCSV.setFileDownloadResource(csvFileRes);
				downloaderCSV.extend(csv);
			}
			if(txtFileRes != null) {
				downloaderTXT.setFileDownloadResource(txtFileRes);
				downloaderTXT.extend(txt);
			}
			if(metaFileRes != null) {
				downloaderMETA.setFileDownloadResource(metaFileRes);
				downloaderMETA.extend(meta);
			}
			downloaderHDF5.setFileDownloadResource(hdf5FileRes);
			downloaderHDF5.extend(hdf5);
			
			csv.addClickListener(new ClickListener() {
				private static final long serialVersionUID = 1L;
				@Override
				public void buttonClick(ClickEvent event) {
					confirmed = true;
					//close();
				}
			});
			buttons.addComponent(csv);
			buttons.addComponent(txt);
			buttons.addComponent(meta);
			buttons.addComponent(hdf5);
			
			Button cancel = new Button("Close window");
			cancel.setId("confirmationdialog.cancel");
			cancel.addClickListener(new ClickListener() {
				private static final long serialVersionUID = 1L;
				@Override
				public void buttonClick(ClickEvent event) {
					close();
				}
			});
			buttons.addComponent(cancel);
			
			main.addComponent(text);
			main.addComponent(buttons);
			main.setComponentAlignment(buttons, Alignment.BOTTOM_CENTER);
			setContent(main);
			center();
			dlUI.openDownloadWindow();
			dllayout.removeComponent(pBar);
		}
		SmearViewUI.doJVMGarbageCollection();
	}

}