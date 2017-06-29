package fi.csc.avaa.smear.smartsmear;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import com.vaadin.server.*;
import com.vaadin.shared.Position;
import com.vaadin.shared.ui.MarginInfo;
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
import fi.csc.avaa.vaadin.tools.VaadinTools;

/**
 * Modal confirmation dialog popup window showing the message as formatted.
 * Only one Ok button for confirmation.
 *
 */
public class ConfirmDownloadWindow extends Window implements ThreadCompleteListener {
	private static final long serialVersionUID = 1L;
	private VerticalLayout main;
	private String apiCall;
	private ProgressBar pBar;
	private HorizontalLayout dllayout;
	private Button dlBtn;
	private FileDownloader opener = null;
	private DownloadThread dlThread;
	private Date start;
	private Date end;
	private DB db;
	private String varsta;
	private Metadata mdata;
	private ComboBox avg;
	private ComboBox typeOfAVG;
	private String quality;
	private VariableItemStyleGenerator itemStyle;
	private DownloadThread.FileFormat currentFileformat;
	
	/**
	 * Constructor.
	 * 
	 * @param caption - the caption of the popup window
	 */
	//public ConfirmDownloadWindow(String caption, String message, StreamResource sr) {
	public ConfirmDownloadWindow(String caption, String message, String apicall, Date start, Date end, DB db, String varsta, Metadata mdata, ComboBox avg, ComboBox typeOfAVG, String quality, VariableItemStyleGenerator itemStyle, HorizontalLayout dllayout, boolean disableDownload) {
		super(caption);
		this.dllayout = dllayout;
		this.start = start;
		this.end = end;
		this.db = db;
		this.varsta = varsta;
		this.mdata = mdata;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.quality = quality;
		this.itemStyle = itemStyle;
		this.apiCall = apicall;
		this.dlThread = null;

		String[] parts = varsta.split(Download.MUUTTUJAEROTIN);
		String var = parts[0];
		String table = parts[1];

		setModal(true);
		setResizable(false);

		VerticalLayout text = new VerticalLayout();
		RichTextArea textArea = new RichTextArea();
		TextArea call = new TextArea();
		if(disableDownload) {
			call.setValue("N/A");
		} else {
			call.setValue(apiCall);
		}
		textArea.setValue(message);
		textArea.setReadOnly(true);
		textArea.setWidth(10, Unit.CM);
		text.setMargin(true);
		text.addComponent(textArea);
		text.addComponent(call);

		main = new VerticalLayout();
		main.setMargin(true);
		main.setSpacing(true);

		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		buttons.setMargin(new MarginInfo(false, false, true, false));
		Button csvBtn = new Button("CSV");
		Button txtBtn = new Button("TXT");
		Button metaBtn = new Button("META");
		Button hdf5Btn = new Button("HDF5");
		dlBtn = new Button("Download");
		dlBtn.setEnabled(false);

		opener = new FileDownloader(new StreamResource(null, ""));
		opener.extend(dlBtn);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if(disableDownload) {
			csvBtn.setEnabled(false);
			txtBtn.setEnabled(false);
			metaBtn.setEnabled(false);
			hdf5Btn.setEnabled(false);
		} else {
			csvBtn.addClickListener(e -> {
				csvBtn.setStyleName("btn-selected");
				txtBtn.setEnabled(false);
				metaBtn.setEnabled(false);
				hdf5Btn.setEnabled(false);
				currentFileformat = DownloadThread.FileFormat.CSV;
				opener.setFileDownloadResource(null);
				opener.setFileDownloadResource(new ExternalResource(SmearDownloadUI.SMEARDATA_API_BASE_URL + "variables=" + var + "&table=" + table + "&from=" + sdf.format(this.start) + "&to=" + sdf.format(this.end) + "&quality=" + quality + "&averaging=" + avg.getValue().toString() + "&type=" + typeOfAVG.getValue().toString() + "&format=csv"));
				dlBtn.setEnabled(true);
			});

			txtBtn.addClickListener(e -> {
				txtBtn.setStyleName("btn-selected");
				csvBtn.setEnabled(false);
				metaBtn.setEnabled(false);
				hdf5Btn.setEnabled(false);
				currentFileformat = DownloadThread.FileFormat.TXT;
				opener.setFileDownloadResource(null);
				opener.setFileDownloadResource(new ExternalResource(SmearDownloadUI.SMEARDATA_API_BASE_URL + "variables=" + var + "&table=" + table + "&from=" + sdf.format(this.start) + "&to=" + sdf.format(this.end) + "&quality=" + quality + "&averaging=" + avg.getValue().toString() + "&type=" + typeOfAVG.getValue().toString() + "&format=txt"));
				dlBtn.setEnabled(true);
			});

			metaBtn.addClickListener(e -> {
				metaBtn.setStyleName("btn-selected");
				csvBtn.setEnabled(false);
				txtBtn.setEnabled(false);
				hdf5Btn.setEnabled(false);
				opener.setFileDownloadResource(null);
				initDownloadThread(DownloadThread.FileFormat.META);
			});

			hdf5Btn.addClickListener(e -> {
				hdf5Btn.setStyleName("btn-selected");
				csvBtn.setEnabled(false);
				txtBtn.setEnabled(false);
				metaBtn.setEnabled(false);
				opener.setFileDownloadResource(null);
				VaadinTools.showNotification("Please wait until download button becomes available..", null);
				initDownloadThread(DownloadThread.FileFormat.HDF5);
			});

			dlBtn.addClickListener(e -> {
				if (currentFileformat != null && (currentFileformat == DownloadThread.FileFormat.CSV || currentFileformat == DownloadThread.FileFormat.TXT)) {
					VaadinTools.showNotification("Please wait until download is completed..", null);
				}
				csvBtn.removeStyleName("btn-selected");
				txtBtn.removeStyleName("btn-selected");
				metaBtn.removeStyleName("btn-selected");
				hdf5Btn.removeStyleName("btn-selected");
				csvBtn.setEnabled(true);
				txtBtn.setEnabled(true);
				metaBtn.setEnabled(true);
				hdf5Btn.setEnabled(true);
				dlBtn.setEnabled(false);
			});
		}

		buttons.addComponent(csvBtn);
		buttons.addComponent(txtBtn);
		buttons.addComponent(metaBtn);
		buttons.addComponent(hdf5Btn);

//		Button cancel = new Button("Close window");
//		cancel.setId("confirmationdialog.cancel");
//		cancel.addClickListener(new ClickListener() {
//			private static final long serialVersionUID = 1L;
//			@Override
//			public void buttonClick(ClickEvent event) {
//				close();
//			}
//		});

		buttons.addComponent(dlBtn);
//		buttons.addComponent(cancel);

		buttons.setExpandRatio(csvBtn, 1.0f);
		buttons.setExpandRatio(txtBtn, 1.0f);
		buttons.setExpandRatio(metaBtn, 1.0f);
		buttons.setExpandRatio(hdf5Btn, 1.0f);
		buttons.setExpandRatio(dlBtn, 2.0f);
//		buttons.setExpandRatio(cancel, 1.0f);

		main.addComponent(text);
		main.addComponent(buttons);
		main.setComponentAlignment(buttons, Alignment.BOTTOM_CENTER);
		setContent(main);
		center();

		addCloseListener(e -> {
			dlThread.dl = null;
			dlThread = null;
		});
	}

	private void initDownloadThread(DownloadThread.FileFormat initFileFormat) {
		dlThread = new DownloadThread(start, end, db, Arrays.asList(varsta), initFileFormat == DownloadThread.FileFormat.META ? null : itemStyle.getVariableAvailabilities(Arrays.asList(varsta), String.valueOf(quality).equals(SmearViewUI.CHECKED)), mdata, avg, typeOfAVG, quality, initFileFormat);
		dlThread.addListener(ConfirmDownloadWindow.this);
		UI.getCurrent().setPollInterval(100);
		pBar = new ProgressBar();
		pBar.setIndeterminate(true);
		pBar.setEnabled(false);
		dllayout.addComponent(pBar);
		dlThread.start();
	}

	@Override
	public void notifyOfThreadComplete(Thread thread) {
		if(thread instanceof DownloadThread) {
			dlThread = (DownloadThread) thread;
			if(dlThread.getDownload() != null && !dlThread.getDownload().allHaveErrors()) {
				opener.setFileDownloadResource(dlThread.getResource());
				dlBtn.setEnabled(true);
			}
			dllayout.removeComponent(pBar);
		}
		SmearViewUI.doJVMGarbageCollection();
	}

}