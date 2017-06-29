package fi.csc.avaa.smear.smartsmear;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.validator.DateRangeValidator;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Field;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.CellStyleGenerator;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import fi.csc.avaa.vaadin.email.NotifyingThread;
import fi.csc.avaa.vaadin.email.ThreadCompleteListener;
import fi.csc.avaa.vaadin.tools.VaadinTools;
import fi.csc.smear.db.model.SmearVariableMetadata;
import fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil;

/**
 * @author pj
 * @modified jmlehtin
 *
 *	The Application's "main" class
 *
 *As a Vaadin UI the init method is the main program of the portlet
 */
@SuppressWarnings("serial")
@Title("SmartSMEAR")
public class SmearDownloadUI extends UI implements ThreadCompleteListener {
	
    @VaadinServletConfiguration(productionMode = true, ui = SmearDownloadUI.class)
    public static class Servlet extends VaadinServlet {
    }
	
    private static final long serialVersionUID = 8532668582109303543L;
    private static Log log = LogFactoryUtil.getLog(SmearViewUI.class);
    public static final String CITE = "Cite: Junninen, H; Lauri, A; Keronen, P; Aalto, P; Hiltunen, V; Hari, P; Kulmala, M."+
	"Smart-SMEAR: on-line data exploration and visualization tool for SMEAR stations. BOREAL ENVIRONMENT RESEARCH (BER) Vol 14, Issue 4, pp.447-457";
	public static final String SMEARDATA_API_BASE_URL = "/smear-services/smeardata.jsp?";
    private final DB db = new DB();
    public static final String CHECKED = "CHECKED";
    public static final String WIDTH = "130px";
    public static final String SMALLBUTTONWIDTH = "30px";
    private  List<SmearVariableMetadata> vmdata; //used to create Metadata, voitaisiin laskea staattisesti
    public boolean nohuman;
    public static int maxVisualisationTimeWindow = 180;
	private Metadata metadata;
    private static final String MAX_SCOPE = "maxScope";
    public volatile String storedEmailAddress;
	private ResizingTable muuttujat;
	private List<SmearVariableMetadata> mdata = null;
	private VariableItemStyleGenerator variableStyleGenerator;
	private PopupDateField enddate = new PopupDateField("To:");
	private PopupDateField startdate = new PopupDateField("From:");
	private Button prevbutton = new Button("<<");
	private NativeSelect timewindow = new NativeSelect();
	private Button nextbutton = new Button(">>");
	private ComboBox quality = new ComboBox("Quality Level:");
	private ComboBox aheight = new ComboBox("Arrival Height:");
	private ComboBox averaging = new ComboBox("Averaging:");
	private ComboBox averagingType = new ComboBox("Averaging Type:");
	private OptionGroup asemat = new OptionGroup("Station");
	private NativeSelect kategoria = new NativeSelect("Select variable category");
	private List<DownloadTableRowId> selectedRowIds;
	private HorizontalLayout layout;
	private VerticalLayout tablesection;
	private ProgressBar pBar;
	private ConfirmDownloadWindow cdw;
	private Button dlBtn;
	private FileDownloader opener = null;
	private DownloadThread dlThread;
	private CheckBox calcAvailability;
	private BlockerWindow blockerWindow;
	private FileType clickedFiletypeBtn;

    private static Date getModifiedDate(Date currentdate, int modifier) {
    	Calendar calendar = new GregorianCalendar();
    	calendar.setTime(currentdate);
    	if (modifier == 30){
	    calendar.add(Calendar.MONTH, 1);
    	}
    	if (modifier == -30) {
	    calendar.add(Calendar.MONTH, -1);
    	}
    	if (modifier != 30 && modifier != -30){
	    calendar.add(Calendar.DAY_OF_MONTH, modifier);
    	}
    	return calendar.getTime();
    }
    
	@Override
    protected void init(VaadinRequest request) {
		UI.getCurrent().getReconnectDialogConfiguration().setDialogText("Please wait while loading data. It may take quite some time if the interval is long and/or the interval contains a lot of data.");
		UI.getCurrent().getReconnectDialogConfiguration().setDialogTextGaveUp("Please wait while loading data. It may take quite some time if the interval is long and/or the interval contains a lot of data.");
    	this.nohuman = false;
    	this.storedEmailAddress = null;
    	
    	this.selectedRowIds = new ArrayList<>();

    	PortletPreferences portletPreferences = ((PortletRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST)).getPreferences();
    	variableStyleGenerator = new VariableItemStyleGenerator(db,startdate, enddate,null, quality);
    	//main layout 
    	layout = new HorizontalLayout();
    	layout.setMargin(false);
    	setContent(layout);

    	VerticalLayout left = new VerticalLayout();
    	VerticalLayout right = new VerticalLayout();
    
    	tablesection = new VerticalLayout();
    	tablesection.setSizeFull();
    	tablesection.setSpacing(true);
    	right.addComponent(tablesection);
    	
    	VerticalLayout queryFirstRowLayout = new VerticalLayout();
    	maxVisualisationTimeWindow = Integer.parseInt(portletPreferences.getValue(MAX_SCOPE, ""));
    	prevbutton.setStyleName("special-button");
    	timewindow.addStyleName("timewindow-select");
    	nextbutton.setStyleName("special-button");
    	
    	buildTable();
    	Button dlSelectedBtn = new Button("Download selected");
    	dlSelectedBtn.addClickListener(e -> {
    		if(selectedRowIds.isEmpty()) {
    			new Notification("Select at least one variable from the table",
						null,
						Notification.Type.WARNING_MESSAGE, false)
				.show(Page.getCurrent());
    		} else {
				Map<String, List<String>> varsGroupedByTable = new HashMap<>();
				selectedRowIds.forEach(rowId -> {
					String var = rowId.getMetadata().getVariable();
					String table = rowId.getTablename();
					if(!varsGroupedByTable.containsKey(table)) {
						varsGroupedByTable.put(table, new ArrayList<>());
					}
					varsGroupedByTable.get(table).add(var);
				});

				ArrayList<String> selectedVariableIds = new ArrayList<>();
				selectedRowIds.forEach(rowId -> selectedVariableIds.add(rowId.getMetadata().getVariable() + Download.MUUTTUJAEROTIN + rowId.getTablename()));

				HorizontalLayout buttons = new HorizontalLayout();
				buttons.setSpacing(true);
				buttons.setMargin(true);

				Button csvBtn = new Button("CSV");
				Button txtBtn = new Button("TXT");
				Button metaBtn = new Button("Meta");
				Button hdf5Btn = new Button("HDF5");
				dlBtn = new Button("Download");
				dlBtn.setEnabled(false);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				csvBtn.addClickListener(f -> {
					clickedFiletypeBtn = FileType.CSV;
					csvBtn.setStyleName("btn-selected");
					txtBtn.setEnabled(false);
					metaBtn.setEnabled(false);
					hdf5Btn.setEnabled(false);
					if(opener != null) {
						dlBtn.removeExtension(opener);
					}
					dlBtn.setEnabled(true);
				});

				txtBtn.addClickListener(f -> {
					clickedFiletypeBtn = FileType.TXT;
					txtBtn.setStyleName("btn-selected");
					csvBtn.setEnabled(false);
					metaBtn.setEnabled(false);
					hdf5Btn.setEnabled(false);
					if(opener != null) {
						dlBtn.removeExtension(opener);
					}
					dlBtn.setEnabled(true);
				});

				metaBtn.addClickListener(f -> {
					opener = new FileDownloader(new StreamResource(null, ""));
					opener.extend(dlBtn);
					clickedFiletypeBtn = FileType.META;
					metaBtn.setStyleName("btn-selected");
					csvBtn.setEnabled(false);
					txtBtn.setEnabled(false);
					hdf5Btn.setEnabled(false);
					opener.setFileDownloadResource(null);
					dlThread = new DownloadThread(startdate.getValue(), enddate.getValue(), db, selectedVariableIds,  null, metadata, averaging, averagingType, String.valueOf(quality.getValue()), DownloadThread.FileFormat.META);
					dlThread.addListener(SmearDownloadUI.this);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					tablesection.addComponent(pBar);
					dlThread.start();
				});

				hdf5Btn.addClickListener(f -> {
					opener = new FileDownloader(new StreamResource(null, ""));
					opener.extend(dlBtn);
					clickedFiletypeBtn = FileType.HDF5;
					hdf5Btn.setStyleName("btn-selected");
					csvBtn.setEnabled(false);
					txtBtn.setEnabled(false);
					metaBtn.setEnabled(false);
					opener.setFileDownloadResource(null);
					VaadinTools.showNotification("Please wait until download button becomes available..", null);
					dlThread = new DownloadThread(startdate.getValue(), enddate.getValue(), db, selectedVariableIds, calcAvailability.getValue() ? variableStyleGenerator.getVariableAvailabilities(selectedVariableIds, String.valueOf(quality).equals(SmearViewUI.CHECKED)) : null, metadata, averaging, averagingType, String.valueOf(quality.getValue()), DownloadThread.FileFormat.HDF5);
					dlThread.addListener(SmearDownloadUI.this);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					tablesection.addComponent(pBar);
					dlThread.start();
				});

				dlBtn.addClickListener(f -> {
					switch(clickedFiletypeBtn) {
						case CSV:
							for(Map.Entry<String, List<String>> varsGrpTableEntry : varsGroupedByTable.entrySet()) {
								getUI().getPage().open(SMEARDATA_API_BASE_URL + "variables=" + varsGrpTableEntry.getValue().stream().collect(Collectors.joining(",")) + "&table=" + varsGrpTableEntry.getKey() + "&from=" + sdf.format(startdate.getValue()) + "&to=" + sdf.format(enddate.getValue()) + "&quality=" + String.valueOf(quality.getValue()) + "&averaging=" + averaging.getValue().toString() + "&type=" + averagingType.getValue().toString() + "&format=csv", "_blank");
							}
							VaadinTools.showNotification("Please wait until downloading is completed..", null);
							break;
						case HDF5:
							VaadinTools.showNotification("Please wait until generating the file is completed..", null);
							break;
						case TXT:
							for(Map.Entry<String, List<String>> varsGrpTableEntry : varsGroupedByTable.entrySet()) {
								getUI().getPage().open(SMEARDATA_API_BASE_URL + "variables=" + varsGrpTableEntry.getValue().stream().collect(Collectors.joining(",")) + "&table=" + varsGrpTableEntry.getKey() + "&from=" + sdf.format(startdate.getValue()) + "&to=" + sdf.format(enddate.getValue()) + "&quality=" + String.valueOf(quality.getValue()) + "&averaging=" + averaging.getValue().toString() + "&type=" + averagingType.getValue().toString() + "&format=txt", "_blank");
							}
							VaadinTools.showNotification("Please wait until downloading is completed..", null);
							break;
						case META:
							break;
						case NETCDF:
							break;
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

				buttons.addComponent(csvBtn);
				buttons.addComponent(txtBtn);
				buttons.addComponent(metaBtn);
				buttons.addComponent(hdf5Btn);
				buttons.addComponent(dlBtn);

				Window multiDlWindow = new Window("Select download format", buttons);
				multiDlWindow.setDraggable(false);
				multiDlWindow.setResizable(false);
				multiDlWindow.setModal(true);
				multiDlWindow.center();

				if(!UI.getCurrent().getWindows().contains(multiDlWindow)) {
					UI.getCurrent().addWindow(multiDlWindow);
					multiDlWindow.focus();
				}

				multiDlWindow.addCloseListener(f -> {
					dlThread.dl = null;
					dlThread = null;
				});

    		}
    	});
    	dlSelectedBtn.setVisible(false);
    	
    	kategoria.setImmediate(true);
    	kategoria.setNullSelectionAllowed(false);
    	asemat.setImmediate(true);
    	asemat.setMultiSelect(false);
    	
    	for (int i = 0; i < Station.ASEMAT.length; i++){
    		asemat.addItem(i);
    		asemat.setItemCaption(i, Station.ASEMAT[i]);
    	}
    	asemat.addValueChangeListener(new OptionGroup.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    		if (asemat.getValue() != null) {
    			kategoria.removeAllItems();
    			for (int j = 0; j < Station.TAULUT[Integer.valueOf(asemat.getValue().toString())].length; j++){
    				String tablename = Station.TAULUT[Integer.valueOf(asemat.getValue().toString())][j];
    				mdata = null;
    				try{
    					mdata = Station.getMetadataInStation(tablename);
    				} catch(Exception mdataexc){
    					log.error("Exception in retrieving tablemetadata: "+tablename);
    					mdataexc.printStackTrace();		    
    				}
    				if (null == mdata || mdata.isEmpty()){
    					System.out.println("Could not retrieve metadata for station");
    				}
    				if (j==0){
    					vmdata=mdata;
    				} else {
    					//read-only list must be looped
    					List<SmearVariableMetadata> mdata2 = new ArrayList<SmearVariableMetadata>(vmdata);
    					mdata2.addAll(mdata);
    					vmdata = mdata2;	
    				}
    				for (SmearVariableMetadata meta: mdata) {
    					String cat = meta.getCategory();
    					if(kategoria.getItem(cat) == null && !"".equals(cat)) {
    						kategoria.addItem(cat);
    					}
    				}		
    			}
    			metadata = null;
    			metadata = new Metadata(vmdata);
    			kategoria.setValue(kategoria.getItemIds().iterator().next());
    			} else {
    				kategoria.setValue(null);
    			}
    		}
    		
    	});
    	
    	queryFirstRowLayout.setMargin(true);
    	final GregorianCalendar currCalendar = new GregorianCalendar();
    	currCalendar.setTime(new Date());

    	enddate.setWidth("65%");
    	enddate.setDateFormat("yyyy-MM-dd");
    	enddate.setResolution(Resolution.DAY);
    	enddate.setInputPrompt("To date");
    	enddate.setValue(currCalendar.getTime());
    	enddate.setImmediate(true);
    	enddate.setLocale(new Locale("en", "US"));
    	enddate.setAssistiveText(CITE);

    	startdate.setWidth("65%");
    	startdate.setDateFormat("yyyy-MM-dd");
    	startdate.setResolution(Resolution.DAY);
    	startdate.setInputPrompt("From date");
    	startdate.setAssistiveText("University of Helsinki - Division of Atmospheric Sciences."); //sivun alareunassa "Arrow down key opens calendar element for choosing the date"
    	startdate.setLocale(new Locale("en", "US"));
    	final Date minValue = getStartOfDay(false, 1991, 1, 1);

    	// Get yesterday 00:00.00
    	GregorianCalendar temp = new GregorianCalendar();
    	temp.setTime(getModifiedDate(enddate.getValue(), -1));
    	startdate.setValue(getStartOfDay(false, temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DAY_OF_MONTH)));
    	Station.setFrom(startdate.getValue());
    	startdate.setImmediate(true);
    	startdate.setValidationVisible(true);
    	enddate.setValidationVisible(true);
    	
    	final ValueChangeListener changeValueListener_to = new ValueChangeListener() {
    		@Override
    		public void valueChange(ValueChangeEvent event) {
    			GregorianCalendar temp = new GregorianCalendar();
    			if(enddate == null || enddate.getValue() == null) {
    				new Notification("Invalid To date",
    						"<br/>Resetting dates",
    						Notification.Type.WARNING_MESSAGE, true)
    				.show(Page.getCurrent());
    				enddate.setValue(currCalendar.getTime());
    				GregorianCalendar tmp = new GregorianCalendar();
    				tmp.setTime(getModifiedDate(enddate.getValue(), -1));
    				startdate.setValue(getStartOfDay(false, tmp.get(Calendar.YEAR), tmp.get(Calendar.MONTH), tmp.get(Calendar.DAY_OF_MONTH)));
    			} else {
    				temp.setTime(enddate.getValue());
    				enddate.setValue(getEndOfDay(false, temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DAY_OF_MONTH)));
    			}
    			try {
    				enddate.removeAllValidators();
    				enddate.addValidator(new DateRangeValidator("To-date must be set between 1991-01-01 and today", minValue, getEndOfDay(true), Resolution.DAY));
    				enddate.validate();
    				enddate.setComponentError(null);
    			} catch (Exception e) {
    				new Notification("Invalid To date",
    						"<br/>To date should be set between 1991-01-01 and today",
    						Notification.Type.WARNING_MESSAGE, true)
    				.show(Page.getCurrent());
    				enddate.setValue(currCalendar.getTime());
    				startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    				enddate.markAsDirty();
    			}
    			Station.setFrom(startdate.getValue());
    		}
    	};
    	final ValueChangeListener changeValueListener_from = new ValueChangeListener() {
    		@Override
    		public void valueChange(ValueChangeEvent event) {
    			GregorianCalendar temp = new GregorianCalendar();
    			if(startdate == null || startdate.getValue() == null) {
    				new Notification("Invalid From date",
    						"<br/>Resetting dates",
    						Notification.Type.WARNING_MESSAGE, true)
    				.show(Page.getCurrent());
    				enddate.setValue(currCalendar.getTime());
    				GregorianCalendar tmp = new GregorianCalendar();
    				tmp.setTime(getModifiedDate(enddate.getValue(), -1));
    				startdate.setValue(getStartOfDay(false, tmp.get(Calendar.YEAR), tmp.get(Calendar.MONTH), tmp.get(Calendar.DAY_OF_MONTH)));
    			} else {
    				temp.setTime(startdate.getValue());
    				startdate.setValue(getStartOfDay(false, temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DAY_OF_MONTH)));
    			}
    			try {
    				startdate.removeAllValidators();
    				startdate.addValidator(new DateRangeValidator("From date must be set between 1991-01-01 and yesterday", minValue, getStartOfDay(true), Resolution.DAY));
    				startdate.validate();
    				startdate.setComponentError(null);
    			} catch (Exception e) {
    				new Notification("Invalid From date",
    						"<br/>From date should be set between 1991-01-01 and yesterday",
    						Notification.Type.WARNING_MESSAGE, true)
    				.show(Page.getCurrent());
    				enddate.setValue(currCalendar.getTime());
    				startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    				startdate.markAsDirty();
    			}
    			Station.setFrom(startdate.getValue());
    		}
    	};

    	startdate.addValueChangeListener(changeValueListener_from);
    	enddate.addValueChangeListener(changeValueListener_to);
    	startdate.setImmediate(true);
    	enddate.setImmediate(true);
    	startdate.setHeight("100%");
    	enddate.setHeight("100%");
    	HorizontalLayout hsplit = new HorizontalLayout();
    	hsplit.setWidth("250px");        
    	hsplit.addComponent(startdate);
    	hsplit.addComponent(enddate);
    	hsplit.setComponentAlignment(startdate, Alignment.BOTTOM_LEFT);
    	hsplit.setComponentAlignment(enddate, Alignment.BOTTOM_LEFT);
    	queryFirstRowLayout.addComponent(hsplit);
    	HorizontalLayout timesplit = new HorizontalLayout();

    	timewindow.setHeight("100%");
    	timewindow.addItem("Day");
    	timewindow.addItem("Week");
    	timewindow.addItem("Month");
    	timewindow.setNullSelectionAllowed(false);
    	timewindow.setValue("Day");
    	timewindow.setImmediate(true);
    	timewindow.setWidth("80px");

    	prevbutton.setWidth(SMALLBUTTONWIDTH);
    	timesplit.setCaption("Shift:");
    	timesplit.addComponent(prevbutton);
    	timesplit.setExpandRatio(prevbutton, 1.0f);
    	timesplit.addComponent(timewindow);
    	timesplit.setExpandRatio(timewindow, 2.0f);

    	nextbutton.setWidth(SMALLBUTTONWIDTH);

    	timesplit.addComponent(nextbutton);
    	timesplit.setExpandRatio(nextbutton, 1.0f);
    	timesplit.setComponentAlignment(prevbutton, Alignment.TOP_LEFT);
    	timesplit.setComponentAlignment(timewindow, Alignment.TOP_LEFT); 
    	timesplit.setComponentAlignment(nextbutton, Alignment.TOP_LEFT);
    	timesplit.setHeight("100%");
    	queryFirstRowLayout.addComponent(timesplit);

    	//Averaging

    	averaging.addItem("NONE");
    	averaging.addItem("30MIN");
    	averaging.addItem("1HOUR");
    	averaging.setItemCaption("NONE", "None");
    	averaging.setItemCaption("30MIN", "30 min");
    	averaging.setItemCaption("1HOUR", "1 hour");
    	averaging.setNullSelectionAllowed(false);
    	averaging.setValue("NONE");
    	averaging.setImmediate(true);
    	averaging.setWidth(WIDTH);
    	averaging.setHeight("100%");

    	//Type of averaging

    	averagingType.addItem("NONE");
    	averagingType.addItem(Download.ARITHMETIC);
    	averagingType.addItem(Download.GEOMETRIC);
    	averagingType.addItem(Download.MEDIAN);
    	averagingType.addItem(Download.SUM);
    	averagingType.setItemCaption("NONE", "None");
    	averagingType.setItemCaption(Download.ARITHMETIC, "Arithmetic");
    	averagingType.setItemCaption(Download.GEOMETRIC, "Geometric");
    	averagingType.setItemCaption(Download.MEDIAN, "Median");
    	averagingType.setItemCaption(Download.SUM, "Sum");
    	averagingType.setNullSelectionAllowed(false);
    	averagingType.setValue("NONE");
    	averagingType.setImmediate(true);
    	averagingType.setWidth(WIDTH);
    	averagingType.setHeight("100%");

    	// Arrival Height

    	aheight.addItem("HEIGHT_100");
    	aheight.addItem("HEIGHT_250");
    	aheight.addItem("HEIGHT_500");
    	aheight.setItemCaption("HEIGHT_100", "100m");
    	aheight.setItemCaption("HEIGHT_250", "250m");
    	aheight.setItemCaption("HEIGHT_500", "500m");
    	aheight.setNullSelectionAllowed(false);
    	aheight.setValue("HEIGHT_100");
    	aheight.setImmediate(true);
    	aheight.setWidth(WIDTH);
    	aheight.setHeight("100%");

    	//Qualitylevel

    	quality.addItem("ANY");
    	quality.addItem(CHECKED);
    	quality.setItemCaption("ANY", "Any");
    	quality.setItemCaption(CHECKED, "Quality Checked");
    	quality.setNullSelectionAllowed(false);
    	quality.setValue("ANY");
    	quality.setImmediate(true);
    	quality.setWidth(WIDTH);
    	quality.setHeight("100%");
    	
    	HorizontalLayout resetQueryButtonLayout = new HorizontalLayout();
    	
    	HorizontalLayout queryButtonRowLayout = new HorizontalLayout();
    	queryButtonRowLayout.setStyleName("query-layout");
    	queryButtonRowLayout.setSpacing(true);

    	Button button = new Button();
    	button.setCaption("Update >>");
    	button.setIcon(FontAwesome.SEARCH);
    	button.setStyleName("query-button");

    	button.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			updateTable();
				muuttujat.setVisible(true);
				dlSelectedBtn.setVisible(true);
    		}
    	});
    	
    	VerticalLayout queryThirdRowLayout = new VerticalLayout();
    	queryThirdRowLayout.setMargin(true);
    	
    	String helpContent = 
			"<p>" +
			"Download page allows retrieving data from one station and variable category at one time without visualization. Downloading the data also shows corresponding API call for scripted queries of data." +
			"</p>" + 
			"<h4>Station and variable category</h4>" + 
			"<p>" +
			"Selecting station and category opens a table that shows the descriptions of the variables and the temporal coverage of each variable in the selected time window." +
			"</p>" +
			"<h4>Time span selection</h4>" + 
			"<p>" +
			"Select Time span using From and To fields. You can move the time window via the Shift dropdown menu with the left and right arrows. Time is indicated at Finnish standard time (UTC+2) without daylight savings." +
			"</p>" +
			"<h4>Quality</h4>" + 
			"<p>" +
			"Filter the data by its quality check status. 'Any' gives all available records. 'Quality checked' selects only those data that were rigorously checked by responsible researcher. Most variables are calculated and inserted to the database near real time with automated quality check and updated later with quality-checked data." +
			"</p>" +
			"<h4>Averaging</h4>" + 
			"<p>" +
			"The data can be downloaded in the original time resolution or aggregated half-hourly or hourly. The basic time step for the data is one minute. Some variables, such as fluxes and flux ancillary data, are stored as 30 min averages. Selecting 'None' for Averaging yields the original data in the database. You can also select the aggregation method with Averaging Type menu. Arithmetic mean is good for most variables. Some variables (e.g. precipitation, runoff/drainage) are cumulative and must be summed instead of averaged to obtain e.g. correct hourly values. Averaging wind direction requires a calculation of vector mean. Time is indicated as the beginning time of the averaging time window." +
			"</p>" +
			"<h4>Variable table</h4>" + 
			"<p>" +
			"Sort the variables by name, description or availability. Use Download button to download the corresponding variable in desired format. You can also download several variables in one file using Select tick boxes and Download selected button below the table." +
			"</p>";
    		
    	Label helpLabel= new Label(helpContent, ContentMode.HTML);
    	helpLabel.setWidth(500, Unit.PIXELS);
    	PopupView helpPopup = new PopupView("Help", helpLabel);
    	helpPopup.addStyleName("help-popup-view-download");

		calcAvailability = new CheckBox("Calculate availability on update", false);
		calcAvailability.setDescription("Check this if you want availability calculated for all variables in the table after clicking update. Please note for long time spans this operation may be very slow.");
    	
    	queryThirdRowLayout.addComponent(helpPopup);
    	queryThirdRowLayout.addComponent(asemat);
    	queryThirdRowLayout.addComponent(kategoria);
		queryThirdRowLayout.addComponent(calcAvailability);
		calcAvailability.setStyleName("availability-btn");
    	left.addComponent(queryThirdRowLayout);
    	
    	left.addComponent(queryFirstRowLayout);
    	//Options selection    
    	VerticalLayout querySecondRowLayout = new VerticalLayout();
    	querySecondRowLayout.setMargin(true);
    	querySecondRowLayout.setSpacing(true);
    	
    	Button mainview = new Button("Reset");
    	mainview.setIcon(FontAwesome.UNDO);
    	mainview.setStyleName("reload-view-button link");
    	mainview.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			quality.setValue("ANY");
    			averaging.setValue("NONE");
    			averagingType.setValue("NONE");
    			asemat.setValue(null);
    			enddate.setValue(currCalendar.getTime());
    			startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    			timewindow.setValue("Day");
    		}
    	});
    	querySecondRowLayout.addComponent(quality);
    	querySecondRowLayout.addComponent(averaging);
    	querySecondRowLayout.addComponent(averagingType);
    	
    	left.addComponent(querySecondRowLayout);
    	
    	VerticalLayout queryFourthRowLayout = new VerticalLayout();
    	queryFourthRowLayout.setMargin(true);
    	queryFourthRowLayout.setSpacing(true);
    	
    	tablesection.addComponent(muuttujat);
    	tablesection.addComponent(dlSelectedBtn);
    	tablesection.setComponentAlignment(dlSelectedBtn, Alignment.MIDDLE_RIGHT);
    	
    	resetQueryButtonLayout.removeComponent(mainview);
    	resetQueryButtonLayout.addComponent(mainview);
    	resetQueryButtonLayout.setMargin(true);
    	
    	queryFourthRowLayout.addComponent(button);
    	queryFourthRowLayout.addComponent(resetQueryButtonLayout);
    	
    	left.addComponent(queryFourthRowLayout);
    	nextbutton.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate.getValue(), enddate.getValue())) {
	    			if (timewindow.getValue() == "Day"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), 1));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), 1));
	    			}
	    			if (timewindow.getValue() == "Week"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), 7));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), 7));
	    			}
	    			if (timewindow.getValue() == "Month"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), 30));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), 30));
	    			}
	    			if(dateRangeExceedsMaxPeriod(startdate, enddate, maxVisualisationTimeWindow)) {
					
	    			} else {
	    				button.click();
	    			}
    			}
    		}
    	});
    	prevbutton.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate.getValue(), enddate.getValue())) {
	    			if (timewindow.getValue() == "Day"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), -1));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), -1));
	    			}
	    			if (timewindow.getValue() == "Week"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), -7));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), -7));
	    			}
	    			if (timewindow.getValue() == "Month"){
	    				startdate.setValue(getModifiedDate(startdate.getValue(), -30));
	    				enddate.setValue(getModifiedDate(enddate.getValue(), -30));
	    			}
	    			if(dateRangeExceedsMaxPeriod(startdate, enddate, maxVisualisationTimeWindow)) {
	    			
	    			} else {
	    				button.click();
	    			}
    			}
    		}
    	});

    	timewindow.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (timewindow.getValue() == "Day"){
    				startdate.setResolution(Resolution.DAY);
    				enddate.setResolution(Resolution.DAY);
    				if ((getModifiedDate(startdate.getValue(), 1)).before(currCalendar.getTime())){
    					enddate.setValue(getModifiedDate(startdate.getValue(), 1));
    				} else{
    					enddate.setValue(currCalendar.getTime());
    					startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    				}
    			}
    			if (timewindow.getValue() == "Week"){
    				startdate.setResolution(Resolution.DAY);
    				enddate.setResolution(Resolution.DAY); 
    				if ((getModifiedDate(startdate.getValue(), 7)).before(currCalendar.getTime())){
    					enddate.setValue(getModifiedDate(startdate.getValue(), 7));
    				} else{
    					enddate.setValue(currCalendar.getTime());
    					startdate.setValue(getModifiedDate(enddate.getValue(), -7));
    				}
    			}
    			if (timewindow.getValue() == "Month"){
    				startdate.setResolution(Resolution.DAY);
    				enddate.setResolution(Resolution.DAY);
    				if ((getModifiedDate(startdate.getValue(), 30)).before(currCalendar.getTime())){
    					enddate.setValue(getModifiedDate(startdate.getValue(), 30));
    				} else{
    					enddate.setValue(currCalendar.getTime());
    					startdate.setValue(getModifiedDate(enddate.getValue(), -30));
    				}
    			}
    			if(dateRangeExceedsMaxPeriod(startdate, enddate, maxVisualisationTimeWindow)) {
				
    			} else {
    				button.click();
    			}
    		}
    	}); 
    	averagingType.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (averagingType.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				averaging.setValue("1HOUR");
    				nohuman = false;
    			}
    			
    		}
    	});
    	averaging.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (averaging.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				averagingType.setValue("ARITHMETIC");
    				nohuman = false;
    			}
    			if (averaging.getValue() == "NONE" && nohuman == false){
    				nohuman = true;
    				averagingType.setValue("NONE");
    				nohuman = false;
    			}
    		
    		}
    	});
    	
    	layout.addComponent(left);
    	layout.addComponent(right);
    }
    
    private void buildTable() {
    	muuttujat = new ResizingTable("");
    	muuttujat.setImmediate(true);
    	muuttujat.setVisible(false);
    	muuttujat.setStyleName("variable-table");
    	
    	muuttujat.addContainerProperty("Variable", String.class, null);
    	muuttujat.addContainerProperty("Description", String.class, null);
    	muuttujat.addContainerProperty("Availability %", String.class, null);
    	muuttujat.addContainerProperty("Download", HorizontalLayout.class, null);
    	muuttujat.addContainerProperty("Select", CheckBox.class, null);
    	
    	muuttujat.setCellStyleGenerator(new CellStyleGenerator() {
			
			@Override
			public String getStyle(Table source, Object itemId, Object propertyId) {
				if("Variable".equals(propertyId)) {
					return "variable";
				} else if("Description".equals(propertyId)) {
					return "description";
				} else if("Availability %".equals(propertyId)) {
					return "availability";
				}
				return "";
			}
		});
    }

	/**
     * station is ignored, because vmdata is set by table
     *  
     * 
     * @return Metadata metadata
     */
    public Metadata getMetadata() {
    	return metadata;
    }

	@Override
	public void notifyOfThreadComplete(Thread thread) {
		if(thread instanceof DownloadThread) {
			dlThread = (DownloadThread) thread;
			if(dlThread.getDownload() != null && !dlThread.getDownload().allHaveErrors()) {
				opener.setFileDownloadResource(dlThread.getResource());
				dlBtn.setEnabled(true);
			}
			tablesection.removeComponent(pBar);
		} else if(thread instanceof WorkThread) {
			db.close();
		}
		SmearViewUI.doJVMGarbageCollection();
	}
	
	public void openDownloadWindow() {
		if(!UI.getCurrent().getWindows().contains(cdw)) {
			UI.getCurrent().addWindow(cdw);
			cdw.focus();
		}
	}
	
	public static boolean dateRangeExceedsMaxPeriod(PopupDateField startDate, PopupDateField endDate, int maxDays) {
		if(startDate.getValue() != null && endDate.getValue() != null) {
			long diffInDays = TimeUnit.MILLISECONDS.toDays(Math.abs(endDate.getValue().getTime() - startDate.getValue().getTime()));
			return diffInDays > maxDays;
		}
		return false;
	}
	
	@Override
    protected void refresh(VaadinRequest request) {
        init(request);
    }
	
	private static Date getStartOfDay(boolean useToday, int... yearMonthDay) {
		final GregorianCalendar calendar = new GregorianCalendar();
		if(useToday) {
			calendar.setTime(new Date());
		} else {
			if(yearMonthDay.length != 3) {
				return null;
			}
			calendar.set(Calendar.YEAR, yearMonthDay[0]);
			calendar.set(Calendar.MONTH, yearMonthDay[1]);
			calendar.set(Calendar.DAY_OF_MONTH, yearMonthDay[2]);
		}
    	calendar.set(Calendar.HOUR_OF_DAY, 0);
    	calendar.set(Calendar.MINUTE, 0);
    	calendar.set(Calendar.SECOND, 0);
    	return calendar.getTime();
	}
	
	private static Date getEndOfDay(boolean useToday, int... yearMonthDay) {
		final GregorianCalendar calendar = new GregorianCalendar();
		if(useToday) {
			calendar.setTime(new Date());
		} else {
			if(yearMonthDay.length != 3) {
				return null;
			}
			calendar.set(Calendar.YEAR, yearMonthDay[0]);
			calendar.set(Calendar.MONTH, yearMonthDay[1]);
			calendar.set(Calendar.DAY_OF_MONTH, yearMonthDay[2]);
		}
    	calendar.set(Calendar.HOUR_OF_DAY, 23);
    	calendar.set(Calendar.MINUTE,59);
    	calendar.set(Calendar.SECOND, 59);
    	return calendar.getTime();
	}
	
	private boolean isStartDateBeforeEndDate(Date startDate, Date endDate) {
		if(startDate.equals(endDate) || startDate.after(endDate)) {
			Notification notif = new Notification("Invalid date range", "From date must be earlier than To date", Notification.Type.WARNING_MESSAGE);
			notif.show(UI.getCurrent().getPage());
			return false;
		}
		return true;
	}
	@SuppressWarnings("unchecked")
	public void updateTable() {
		if (asemat.getValue() != null && kategoria.getValue() != null) {
			muuttujat.removeAllItems();
			selectedRowIds.clear();
			db.open();
			List<Object> itemIds = new ArrayList<>();
			List<String> variableIds = new ArrayList<>();

			String varTableName = null;
			long prevTableId = -1;
			for (SmearVariableMetadata meta: vmdata) {
				if (meta.getCategory() != null && kategoria.getValue() != null) {
					if(meta.getCategory().equals(kategoria.getValue().toString())) {
						long varTableId = meta.getTableID();
						if(varTableName == null || prevTableId != varTableId) {
							try {
								varTableName = SmearTableMetadataLocalServiceUtil.getSmearTableMetadata(varTableId).getName();
							} catch (PortalException | SystemException e1) {
								e1.printStackTrace();
							}
							prevTableId = varTableId;
						}
						final DownloadTableRowId rowId = new DownloadTableRowId(meta, varTableName);
						Item newItem = muuttujat.addItem(rowId);
						newItem.getItemProperty("Variable").setValue(meta.getTitle());
						if (meta.getDescription() != null) {
							newItem.getItemProperty("Description").setValue(meta.getDescription());
						} else {
							newItem.getItemProperty("Description").setValue("");
						}

						String variableId = meta.getVariable() + Download.MUUTTUJAEROTIN + varTableName;
						variableIds.add(variableId);
						itemIds.add(rowId);
						Button downloaddata = new Button("Download");
						downloaddata.setImmediate(true);
						final String tempVarTableName = varTableName;
						
						HorizontalLayout dllayout = new HorizontalLayout();
						dllayout.addComponent(downloaddata);
						newItem.getItemProperty("Download").setValue(dllayout);
						
						downloaddata.addClickListener(e -> {
							Timestamp startTs = new Timestamp(startdate.getValue().getTime());
							Timestamp endTs = new Timestamp(enddate.getValue().getTime());
							String apicall = "https://avaa.tdata.fi/smear-services/smeardata.jsp?variables=" + meta.getVariable() + "&table=" + tempVarTableName + "&from=" + startTs + "&to=" + endTs + "&quality=" + String.valueOf(quality.getValue()) + "&averaging=" + averaging + "&type=" + averagingType;
							String message = "<h6>Variable:</h6><p >Name:  " + meta.getTitle() + "<br> Description:  "
									+ meta.getDescription() + "<br>" + "Source:  " + meta.getSource() + "<br>" + "Unit:  " + meta.getUnit() + "<br>" + "Column name:  " + meta.getVariable() + "<br>" + "From table:  " + tempVarTableName + "</p><h6>Options:</h6><p>From: " + startdate.getValue() + "<br>" + "To: " + enddate.getValue() + "<br>"
									+ "Averaging: " + averaging + "<br>" + "Averaging type: " + averagingType + "<br>" + "Quality: " + String.valueOf(quality.getValue()) + "</p><h6>API call:</h6>";
							cdw = new ConfirmDownloadWindow("Download", message, apicall, startdate.getValue(), enddate.getValue(), db, meta.getVariable() + ":" + tempVarTableName, metadata, averaging, averagingType, String.valueOf(quality.getValue()), variableStyleGenerator, dllayout, muuttujat.getItem(rowId).getItemProperty("Availability %").getValue().equals("0.0"));
							openDownloadWindow();
				    	});
						
						CheckBox selectCheckbox = new CheckBox();
						selectCheckbox.addValueChangeListener(e -> {
							if(selectCheckbox.getValue()) {
								if(muuttujat.getItem(rowId).getItemProperty("Availability %").getValue().equals("0.0")) {
									selectCheckbox.setValue(false);
									VaadinTools.showWarning("No values in the selected timeframe", null);
								} else {
									selectedRowIds.add(rowId);
								}
							} else {
								selectedRowIds.remove(rowId);
							}
						});
						newItem.getItemProperty("Select").setValue(selectCheckbox);
					}
				}
			}
			if(variableIds != null && variableIds.size() > 0) {
				if (calcAvailability.getValue()) {
					blockerWindow = new BlockerWindow("Please wait while calculating the variable availabilities...");
					UI.getCurrent().addWindow(blockerWindow);
					UI.getCurrent().setPollInterval(100);
					WorkThread thread = new WorkThread(variableIds, itemIds);
					thread.addListener(SmearDownloadUI.this);
					thread.start();
				} else {
					for (Object itemId : itemIds) {
						muuttujat.getItem(itemId).getItemProperty("Availability %").setValue("N/A");
					}
				}
			}
		} else {
			muuttujat.removeAllItems();//if not null
		}
	}

	private class WorkThread extends NotifyingThread {

		List<String> variableIds;
		List<Object> itemIds;

		public WorkThread(List<String> variableIds, List<Object> itemIds) {
			this.itemIds = itemIds;
			this.variableIds = variableIds;
		}

		@Override
		public void doRun() {
			UI.getCurrent().getSession().getLockInstance().lock();
			int i = 0;
			List<Double> availabilities = variableStyleGenerator.getVariableAvailabilities(variableIds, String.valueOf(quality).equals(SmearViewUI.CHECKED));
			for (Object itemId : itemIds) {
				muuttujat.getItem(itemId).getItemProperty("Availability %").setValue(String.valueOf(new BigDecimal(availabilities.get(i) * 100).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()));
				i++;
			}

			boolean isRemoved = false;
			int counter = 0;
			while (!isRemoved && counter < 1000) {
				try {
					isRemoved = UI.getCurrent().removeWindow(blockerWindow);
				} catch (IllegalStateException e) {
					counter++;
				}
			}

			UI.getCurrent().setPollInterval(-1);
			UI.getCurrent().getSession().getLockInstance().unlock();
		}


	}
}
