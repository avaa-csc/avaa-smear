package fi.csc.avaa.smear.smartsmear;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.data.validator.DateRangeValidator;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FileResource;
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
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import fi.csc.avaa.vaadin.email.ThreadCompleteListener;
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
//@Theme("liferay")
public class SmearDownloadUI extends UI implements ThreadCompleteListener {
	
	//@WebServlet(value = "/VAADIN/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = true, ui = SmearDownloadUI.class)
    public static class Servlet extends VaadinServlet {
    }
	
    private static final long serialVersionUID = 8532668582109303543L;
    private static Log log = LogFactoryUtil.getLog(SmearViewUI.class);
    public static final String CITE = "Cite: Junninen, H; Lauri, A; Keronen, P; Aalto, P; Hiltunen, V; Hari, P; Kulmala, M."+
	"Smart-SMEAR: on-line data exploration and visualization tool for SMEAR stations. BOREAL ENVIRONMENT RESEARCH (BER) Vol 14, Issue 4, pp.447-457";
    private final DB db = new DB();
    public HierarchicalContainer stationcontainer;
    public static final String DESCRIPTION = "description";
    public static final String TITLE = "title";
    public static final String UNIT = "unit";
    public static final String SOURCE = "source";
    public static final String AVAILABLE = "available";
    public static final String CONTACT_EMAIL = "";
    public static final String CHECKED = "CHECKED";
    public static final String WIDTH = "130px";
    public static final String SMALLBUTTONWIDTH = "30px";
    private  List<SmearVariableMetadata> vmdata; //used to create Metadata, voitaisiin laskea staattisesti
    public String contact_email = "Someone";
    public boolean nohuman;
    public static int maxVisualisationTimeWindow = 180;
	private Metadata metadata;
    private static final String MAX_SCOPE = "maxScope";
    public volatile String storedEmailAddress;
    private List<Object> visibleVarItemIds;
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
	private ComboBox avaraging = new ComboBox("Averaging:");
	private ComboBox typeavaraging = new ComboBox("Averaging Type:");
	private OptionGroup asemat = new OptionGroup("Station");
	private NativeSelect kategoria = new NativeSelect("Select variable category");
	private List<DownloadTableRowId> selectedRowIds;
	private HorizontalLayout layout;
	private VerticalLayout tablesection;
	private ProgressBar pBar;
	private ConfirmDownloadWindow cdw;
	
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
    	this.nohuman = false;
    	this.visibleVarItemIds = new ArrayList<>();
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
	    		Set<String> selectedVariableIds = new HashSet<>();
	    		selectedRowIds.forEach(rowId -> selectedVariableIds.add(rowId.getMetadata().getVariable() + Download.MUUTTUJAEROTIN + rowId.getTablename()));
	    		
	    		DownloadThread dlThread = new DownloadThread(startdate.getValue(), enddate.getValue(), db, selectedVariableIds, metadata, avaraging, typeavaraging, String.valueOf(quality.getValue()), variableStyleGenerator);
	    		dlThread.addListener(SmearDownloadUI.this);
	    		UI.getCurrent().setPollInterval(100);
	    		pBar = new ProgressBar();
	    		pBar.setIndeterminate(true);
	    		pBar.setEnabled(false);
	    		tablesection.addComponent(pBar);
	    		tablesection.setComponentAlignment(pBar, Alignment.BOTTOM_RIGHT);
	    		dlThread.start();
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
    	
    	kategoria.addValueChangeListener(new NativeSelect.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			updateTable();
    			muuttujat.setVisible(true);
    			dlSelectedBtn.setVisible(true);
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

    	avaraging.addItem("NONE");
    	avaraging.addItem("30MIN");
    	avaraging.addItem("1HOUR");
    	avaraging.setItemCaption("NONE", "None");
    	avaraging.setItemCaption("30MIN", "30 min");
    	avaraging.setItemCaption("1HOUR", "1 hour");
    	avaraging.setNullSelectionAllowed(false);
    	avaraging.setValue("NONE");
    	avaraging.setImmediate(true);
    	avaraging.setWidth(WIDTH);
    	avaraging.setHeight("100%");

    	//Type of avaraging

    	typeavaraging.addItem("NONE");
    	typeavaraging.addItem("ARITHMETIC");
    	typeavaraging.addItem(Download.GEOMETRIC);
    	typeavaraging.addItem(Download.MEDIAN);
    	typeavaraging.addItem(Download.SUMM);
    	typeavaraging.setItemCaption("NONE", "None");
    	typeavaraging.setItemCaption("ARITHMETIC", "Arithmetic");
    	typeavaraging.setItemCaption(Download.GEOMETRIC, "Geometric");
    	typeavaraging.setItemCaption(Download.MEDIAN, "Median");
    	typeavaraging.setItemCaption(Download.SUMM, "Sum");
    	typeavaraging.setNullSelectionAllowed(false);
    	typeavaraging.setValue("NONE");
    	typeavaraging.setImmediate(true);
    	typeavaraging.setWidth(WIDTH);
    	typeavaraging.setHeight("100%");

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

    	final LiferayIPC liferayipc = new LiferayIPC();
    	liferayipc.extend(this);
    	Button button = new Button();
    	button.setCaption("Update >>");
    	button.setIcon(FontAwesome.SEARCH);
    	button.setStyleName("query-button");
    	button.setDescription("Click to retrieve data visualization of selected variables");
    	
    	button.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			updateTable();
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
    	
    	queryThirdRowLayout.addComponent(helpPopup);
    	queryThirdRowLayout.addComponent(asemat);
    	queryThirdRowLayout.addComponent(kategoria);
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
    			avaraging.setValue("NONE");
    			typeavaraging.setValue("NONE");
    			asemat.setValue(null);
    			enddate.setValue(currCalendar.getTime());
    			startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    			timewindow.setValue("Day");
    		}
    	});
    	querySecondRowLayout.addComponent(quality);
    	querySecondRowLayout.addComponent(avaraging);
    	querySecondRowLayout.addComponent(typeavaraging);
    	
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
    	typeavaraging.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (typeavaraging.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				avaraging.setValue("1HOUR");
    				nohuman = false;
    			}
    			
    		}
    	});
    	avaraging.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (avaraging.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				typeavaraging.setValue("ARITHMETIC");
    				nohuman = false;
    			}
    			if (avaraging.getValue() == "NONE" && nohuman == false){
    				nohuman = true;
    				typeavaraging.setValue("NONE");
    				nohuman = false;
    			}
    		
    		}
    	});
    	
    	layout.addComponent(left);
    	layout.addComponent(right);
    }
    
    @SuppressWarnings("unchecked")
	protected static Set<String> getSelectedVariables(Tree tree) {
    	Set<String> results = new TreeSet<>();
    	for(Object itemId : (Set<String>) tree.getValue()) {
			if(!tree.hasChildren(itemId)) {
				results.add(itemId.toString());
			}
		}
    	return results;
    }
    
    private void buildTable() {
    	muuttujat = new ResizingTable("");
    	muuttujat.setImmediate(true);
    	muuttujat.setVisible(false);
    	muuttujat.setStyleName("variable-table");
    	
    	muuttujat.addContainerProperty("Variable", String.class, null);
    	muuttujat.addContainerProperty("Description", String.class, null);
    	muuttujat.addContainerProperty("Availability %", Double.class, null);
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
			DownloadThread dlThread = (DownloadThread) thread;
			Download dl = dlThread.getDownload();
			if(dl != null && !dl.allHaveErrors()) {
				FileLoaderThread fileThread = new FileLoaderThread(dl);
				UI.getCurrent().setPollInterval(100);
				fileThread.addListener(SmearDownloadUI.this);
				fileThread.start();
			} else {
				tablesection.removeComponent(pBar);
			}
		} else if(thread instanceof FileLoaderThread) {
			FileLoaderThread fileThread = (FileLoaderThread) thread;
			
			StreamResource csvFileRes = fileThread.getCsvStreamRes();
			StreamResource txtFileRes = fileThread.getTxtStreamRes();
			StreamResource metaFileRes = fileThread.getMetaStreamRes();
			FileResource hdf5FileRes = fileThread.getHdf5FileRes();

			HorizontalLayout buttons = new HorizontalLayout();
    		buttons.setSpacing(true);
    		buttons.setMargin(true);
			
    		FileDownloader csvDownloader = new FileDownloader(new StreamResource(null, ""));
    		FileDownloader txtDownloader = new FileDownloader(new StreamResource(null, ""));
    		FileDownloader metaDownloader = new FileDownloader(new StreamResource(null, ""));
    		FileDownloader hdf5Downloader = new FileDownloader(new StreamResource(null, ""));
    		
	    	if(csvFileRes != null) {
	    		Button csvBtn = new Button("CSV");
	    		csvDownloader.setFileDownloadResource(csvFileRes);
	    		csvDownloader.extend(csvBtn);
	    		buttons.addComponent(csvBtn);
	    	}
	    	if(txtFileRes != null) {
	    		Button txtBtn = new Button("TXT");
	    		txtDownloader.setFileDownloadResource(txtFileRes);
	    		txtDownloader.extend(txtBtn);
	    		buttons.addComponent(txtBtn);
	    	}
	    	if(metaFileRes != null) {
	    		Button metaBtn = new Button("Meta");
	    		metaDownloader.setFileDownloadResource(metaFileRes);
	    		metaDownloader.extend(metaBtn);
	    		buttons.addComponent(metaBtn);
	    	}
			if (hdf5FileRes != null) {
				Button hdf5Btn = new Button("HDF5");
				hdf5Downloader.setFileDownloadResource(hdf5FileRes);
				hdf5Downloader.extend(hdf5Btn);
	    		buttons.addComponent(hdf5Btn);
			}
    		
    		Window multiDlWindow = new Window("Select download format", buttons);
    		multiDlWindow.setDraggable(false);
    		multiDlWindow.setResizable(false);
    		multiDlWindow.setModal(true);
    		multiDlWindow.center();

    		tablesection.removeComponent(pBar);
    		if(!UI.getCurrent().getWindows().contains(multiDlWindow)) {
				UI.getCurrent().addWindow(multiDlWindow);
				multiDlWindow.focus();
			}
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
						DownloadTableRowId rowId = new DownloadTableRowId(meta, varTableName);
						Item newItem = muuttujat.addItem(rowId);
						newItem.getItemProperty("Variable").setValue(meta.getTitle());
						if (meta.getDescription() != null) {
							newItem.getItemProperty("Description").setValue(meta.getDescription());
						} else {
							newItem.getItemProperty("Description").setValue("");
						}
						boolean considerQuality = false;
						Double percent = 0.0d;
						
						visibleVarItemIds.add(meta);
						//percentage = new VariableItemStyleGenerator(startdate, enddate, visibleVarItemIds, quality);
						if (CHECKED.equals(quality.getValue())){
							considerQuality = true;
						}
						percent = 100 * variableStyleGenerator.getVariableExistencePercentInPeriod(meta.getVariable(), varTableName, VariableItemStyleGenerator.getTableClass(varTableName), considerQuality);
						
						//var.getItemProperty("Availability").setValue(new BigDecimal(percent).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"%");
						newItem.getItemProperty("Availability %").setValue(new BigDecimal(percent).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue());
						
						Button downloaddata = new Button("Download");
						downloaddata.setImmediate(true);
						
						final String tempVarTableName = varTableName;
						
						HorizontalLayout dllayout = new HorizontalLayout();
						dllayout.addComponent(downloaddata);
						newItem.getItemProperty("Download").setValue(dllayout);
						
						downloaddata.addClickListener(e -> {
			    			Timestamp startTs = new Timestamp(startdate.getValue().getTime());
			    			Timestamp endTs = new Timestamp(enddate.getValue().getTime());
			    			String apicall = "http://avaa.tdata.fi/palvelut/smeardata.jsp?variable="+meta.getVariable()+"&table="+tempVarTableName+"&from="+startTs+"&to="+endTs+"&quality="+String.valueOf(quality.getValue())+"&averaging="+avaraging+"&type="+typeavaraging;
			    			String message = "<h6>Variable:</h6><p >Name:  "+meta.getTitle()+"<br> Description:  "
			    			+meta.getDescription()+"<br>"+"Source:  "+meta.getSource()+"<br>"+"Unit:  "+meta.getUnit()+"<br>"+"Column name:  "+meta.getVariable()+"<br>"+"From table:  "+tempVarTableName+"</p><h6>Options:</h6><p>From: "+startdate.getValue()+"<br>"+"To: "+enddate.getValue()+"<br>"
			    			+"Averaging: "+avaraging+"<br>"+"Averaging type: "+typeavaraging+"<br>"+"Quality: "+String.valueOf(quality.getValue())+"</p><h6>API call:</h6>";
		    				cdw = new ConfirmDownloadWindow("Download", message, apicall, startdate.getValue(), enddate.getValue(), db, meta.getVariable()+":"+tempVarTableName, metadata, avaraging, typeavaraging, String.valueOf(quality.getValue()), variableStyleGenerator, this, dllayout) ;
				    	});
						
						CheckBox selectCheckbox = new CheckBox();
						selectCheckbox.addValueChangeListener(e -> {
							if(selectCheckbox.getValue()) {
								selectedRowIds.add(rowId);
							} else {
								selectedRowIds.remove(rowId);
							}
						});
						
						newItem.getItemProperty("Select").setValue(selectCheckbox);
					}
				} //if not null
			} //for
			db.close();
			SmearViewUI.doJVMGarbageCollection();
		} else {
			muuttujat.removeAllItems();//if not null
		}
	}
}
