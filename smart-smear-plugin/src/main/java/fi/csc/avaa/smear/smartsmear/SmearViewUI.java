package fi.csc.avaa.smear.smartsmear;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.servlet.annotation.WebServlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Item;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.data.validator.DateRangeValidator;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.Responsive;
import com.vaadin.server.StreamResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.AbstractSelect.ItemDescriptionGenerator;
import com.vaadin.ui.Button.ClickEvent;

import fi.csc.avaa.smear.smartsmear.email.SmearEMailWindow;
import fi.csc.avaa.smear.smartsmear.email.SmearGenerateFileAction;
import fi.csc.avaa.vaadin.email.SendEmailThread;
import fi.csc.avaa.vaadin.email.ThreadCompleteListener;
import fi.csc.smear.db.model.SmearVariableMetadata;


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
@Theme("liferay")
public class SmearViewUI extends UI implements ThreadCompleteListener {
	
	@WebServlet(value = "/VAADIN/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = true, ui = SmearViewUI.class)
    public static class Servlet extends VaadinServlet {
    }
	
    private static final long serialVersionUID = 8532668582109303543L;
    private static Log log = LogFactoryUtil.getLog(SmearViewUI.class);
    public static final String CITE = "Cite: Junninen, H; Lauri, A; Keronen, P; Aalto, P; Hiltunen, V; Hari, P; Kulmala, M."+
	"Smart-SMEAR: on-line data exploration and visualization tool for SMEAR stations. BOREAL ENVIRONMENT RESEARCH (BER) Vol 14, Issue 4, pp.447-457";
    private final DB db = new DB();
    public HierarchicalContainer treecontainer;
    public static final String DESCRIPTION = "description";
    public static final String TITLE = "title";
    public static final String UNIT = "unit";
    public static final String SOURCE = "source";
    public static final String AVAILABLE = "available";
    public static final String CONTACT_EMAIL = "";
    public static final String CHECKED = "CHECKED";
    public static final String WIDTH = "100px";
    public static final String SMALLBUTTONWIDTH = "30px";
    private  List<SmearVariableMetadata> vmdata; //used to create Metadata, voitaisiin laskea staattisesti
    public boolean nohuman;
    private FileDownloader downloader;
    public static int maxVisualisationTimeWindow = 180;
	private static Metadata metadata;
    private static final String MAX_SCOPE = "maxScope";
    private CssLayout oldrows = new CssLayout(); //midselect visualization
    public volatile String storedEmailAddress;
    private VariableItemStyleGenerator itemStyle;
    private List<Object> visibleVarItemIds;
	private Object clickedItemId;
	private NativeSelect dlSelect;
	private Button downloadButton;
	public static int garbageCollectionCount = 0;
	private ProgressBar pBar;
	private Download download;
	private VerticalLayout right;


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
    
    @SuppressWarnings("unchecked")
	@Override
    protected void init(VaadinRequest request) {
    	this.nohuman = false;
    	this.treecontainer = new HierarchicalContainer();
    	this.visibleVarItemIds = new ArrayList<>();
    	this.itemStyle = null;
    	this.storedEmailAddress = null;
    	this.downloader = new FileDownloader(new StreamResource(null, ""));
    	
    	PortletPreferences portletPreferences = ((PortletRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST)).getPreferences();

    	//main layout
		GridLayout layout = new GridLayout(20,1);
    	layout.setWidth(100, Unit.PERCENTAGE);
    	layout.setMargin(false);
    	layout.setSpacing(false);
    	setContent(layout);

		right = new VerticalLayout();
    	VerticalLayout left = new VerticalLayout();
    	left.setWidth(100, Unit.PERCENTAGE);
    	VerticalLayout variableselection = new VerticalLayout();
    	variableselection.setMargin(false);
    	variableselection.setSizeUndefined();
    	variableselection.setImmediate(true);
    	HorizontalLayout controlsLayout = new HorizontalLayout();
    	
    	PopupDateField startdate = new PopupDateField("From:");
        PopupDateField enddate = new PopupDateField("To:");

        CssLayout chartsection = new CssLayout();
    	chartsection.setSizeFull();
    	Responsive.makeResponsive(chartsection);
    	HorizontalLayout queryFirstRowLayout = new HorizontalLayout();
    	maxVisualisationTimeWindow = Integer.parseInt(portletPreferences.getValue(MAX_SCOPE, ""));

    	Button prevbutton = new Button("<<");
    	prevbutton.setStyleName("special-button");
    	NativeSelect timewindow = new NativeSelect();
    	timewindow.addStyleName("timewindow-select");
    	Button nextbutton = new Button(">>");
    	nextbutton.setStyleName("special-button");
    	ComboBox quality = new ComboBox("Quality Level:");
    	ComboBox aheight = new ComboBox("Arrival Height:");
    	ComboBox averaging = new ComboBox("Averaging:");
    	ComboBox averagingType = new ComboBox("Averaging Type:");
    	VariableTree tree = new VariableTree("Variables:", db);
    	
    	dlSelect = new NativeSelect();
    	dlSelect.setMultiSelect(false);
    	dlSelect.setNewItemsAllowed(false);
    	dlSelect.setNullSelectionItemId("Choose type");
    	dlSelect.setCaption("Download type");
    	dlSelect.addStyleName("download-select-dropdown");
    	dlSelect.setEnabled(false);
    	dlSelect.setResponsive(true);
		dlSelect.addItem("CSV");
		dlSelect.addItem("TXT");
		dlSelect.addItem("Meta");
		dlSelect.addItem("HDF5");

    	downloadButton = new Button("Download");
    	downloadButton.setStyleName("download-button");
    	downloadButton.setEnabled(false);
    	downloadButton.setResponsive(true);
    	downloader.extend(downloadButton);

    	tree.setMultiSelect(true);
    	tree.setMultiselectMode(MultiSelectMode.DEFAULT);
    	tree.setNullSelectionAllowed(true);
    	tree.setImmediate(true);
    	tree.setDescription("You may choose stations and variables on the left. Clicking a station name opens a list of variables divided into different categories. Hovering the mouse pointer over a variable shows its database column name and a short description with unit and source instrument or source variables. Some variables are measured with several instruments, (2) after name indicates secondary measurement. You may select multiple variables by pressing the ctrl key simultaneously. Select a continuous list by clicking on the first and last variables while pressing shift. Up to 18 variables can be visualized at one time.");
    	tree.addItemClickListener(e -> {
    		clickedItemId = e.getItemId();
    	});
    	
    	tree.addValueChangeListener(e -> {
    		if(tree.hasChildren(clickedItemId)) {
				tree.unselect(clickedItemId);
				tree.expandItem(clickedItemId);
			}
		});
    	
    	tree.addExpandListener(e -> {
    		visibleVarItemIds.clear();
			for(Object itemId : tree.getVisibleItemIds()) {
				if(!tree.hasChildren(itemId)) {
					visibleVarItemIds.add(itemId);
				}
			}
			tree.markAsDirty();
    	});
    	
    	itemStyle = new VariableItemStyleGenerator(db, startdate, enddate, visibleVarItemIds, tree, quality);
    	tree.setItemStyleGenerator(itemStyle);

    	for (int i = 0; i < Station.ASEMAT.length; i++){
    		Item asema = treecontainer.addItem(Station.ASEMAT[i]);
    		
    		for (int j = 0; j < Station.TAULUT[i].length; j++){
    			String tablename = Station.TAULUT[i][j];
    			List<SmearVariableMetadata> mdata = null;
    			try{
    				mdata = Station.getMetadataInStation(tablename);
    			} catch(Exception mdataexc){
    				log.error("Exception in retrieving tablemetadata: "+tablename);
    				mdataexc.printStackTrace();		    
    			}
    			if (null == mdata || mdata.isEmpty()){
    				log.error("Could not retrieve metadata for station");
    			}
    			if (j==0 && i==0){
    				vmdata=mdata;
    			} else {
    				//read-only list must be looped
    				List<SmearVariableMetadata> mdata2 = new ArrayList<SmearVariableMetadata>(vmdata);
    				try {
    					mdata2.addAll(mdata);
    				} catch(Exception e) {
    					e.printStackTrace();
    				}
    				vmdata = mdata2;	
    			}

    			if (mdata != null && !mdata.isEmpty()) {
    				treecontainer.addContainerProperty(DESCRIPTION,String.class, "");
    				treecontainer.addContainerProperty(TITLE,String.class, "");
    				treecontainer.addContainerProperty(UNIT, String.class, "");
    				treecontainer.addContainerProperty(SOURCE, String.class, "");
    				treecontainer.addContainerProperty(AVAILABLE, String.class, "");
    				tree.setItemCaptionPropertyId(TITLE);
    				tree.setItemCaptionMode( AbstractSelect.ItemCaptionMode.PROPERTY );

    				/* Vaikeuksia, ajonaikanen null-poikkeus
    				 */
    				try {
    					asema.getItemProperty(DESCRIPTION).setValue(" ");
    					asema.getItemProperty(TITLE).setValue(Station.ASEMAT[i]);
    					asema.getItemProperty(UNIT).setValue(" ");
    					asema.getItemProperty(SOURCE).setValue(" ");
    					asema.getItemProperty(AVAILABLE).setValue(" ");						
    				} catch (Exception e) {
    					asema = new PropertysetItem();
    					asema.addItemProperty(DESCRIPTION, new ObjectProperty<String>(" ", String.class));
    					asema.addItemProperty(TITLE, new ObjectProperty<String>(Station.ASEMAT[i], String.class));
    					asema.addItemProperty(UNIT, new ObjectProperty<String>(" ", String.class));
    					asema.addItemProperty(SOURCE, new ObjectProperty<String>(" ", String.class));
    					asema.addItemProperty(AVAILABLE, new ObjectProperty<String>(" ", String.class));
    				}
    				
    				for (SmearVariableMetadata meta: mdata) {
    					String variable = meta.getVariable();
    					String variable_id = variable+Download.MUUTTUJAEROTIN+tablename;
    					treecontainer.removeItem(variable_id);
    					String description = meta.getDescription();
    					String unit = meta.getUnit();
    					String title = meta.getTitle();
    					
    					String source = meta.getSource();
    					Date started = meta.getPeriod_start();
    					String available="";
    					if (!String.valueOf(started.getTime()).equals("0000-00-00 00:00:00")){
    						try{
    							Format formatter = new SimpleDateFormat("yyyy-MM-dd");
    							available = formatter.format(started);
    						}catch (Exception edate) {
    							System.out.println("Exception in "+variable+" available");
    							available = "Not found";
    						}
    					}
    					String cat = meta.getCategory();
    					String categoryitem = Station.ASEMAT[i]+cat;
    					
    					if (!available.equals("9999-09-09") && (!cat.equals(""))){
    						Item variable_item = treecontainer.addItem(variable_id);
    						Item category = treecontainer.addItem(categoryitem);
    						
    						try {
    							category.getItemProperty(DESCRIPTION).setValue(" ");
    							category.getItemProperty(TITLE).setValue(cat);
    							category.getItemProperty(UNIT).setValue(" ");
    							category.getItemProperty(SOURCE).setValue(" ");
    							category.getItemProperty(AVAILABLE).setValue(" ");
    						} catch (Exception e) {	
    							category = new PropertysetItem();
    							category.addItemProperty(DESCRIPTION, new ObjectProperty<String>(" ", String.class));
    							category.addItemProperty(TITLE, new ObjectProperty<String>(cat, String.class));
    							category.addItemProperty(UNIT, new ObjectProperty<String>(" ", String.class));
    							category.addItemProperty(SOURCE, new ObjectProperty<String>(" ", String.class));
    							category.addItemProperty(AVAILABLE, new ObjectProperty<String>(" ", String.class));
    						}
    						treecontainer.setParent(categoryitem,Station.ASEMAT[i]);
    						treecontainer.setParent(variable_id,categoryitem);
    						treecontainer.setChildrenAllowed(variable_id, false);
    						try{
    							if (exist(description)) {
    								variable_item.getItemProperty(DESCRIPTION).setValue(description);
    							} else {
    								variable_item.getItemProperty(DESCRIPTION).setValue("No meta");
    							}
    							if (exist(title)) { 
    								variable_item.getItemProperty(TITLE).setValue(title);
    							} else {
    								variable_item.getItemProperty(TITLE).setValue("No title");
    							}
    							if (exist(unit)){
    								variable_item.getItemProperty(UNIT).setValue(unit);
    							} else {
    								variable_item.getItemProperty(UNIT).setValue("No unit");
    							}
    							if (exist(source)) {
    								variable_item.getItemProperty(SOURCE).setValue(source);
    							} else {
    								variable_item.getItemProperty(SOURCE).setValue("No source");
    							}
    							if (started != null || !String.valueOf(started).equals("0000-00-00 00:00:00")) {
    								variable_item.getItemProperty(AVAILABLE).setValue(available);
    							}
    						} catch (Exception e) {
    							System.out.println("Catched1 " + e);
    						}
    					}
    					tree.setContainerDataSource(treecontainer);							
    				}

    				tree.markAsDirty();
    				variableselection.markAsDirty();
    			} else {
    				System.err.println("No metadata");
    			}
    		}
    	} //for stations
    	tree.setItemDescriptionGenerator(new ItemDescriptionGenerator() {                            
    		public String generateDescription(Component tree, Object variable_id, Object description) {
    			Item item = treecontainer.getItem(variable_id);

    			Object desc = item.getItemProperty(DESCRIPTION).getValue();
    			Object unit = item.getItemProperty(UNIT).getValue();
    			Object source = item.getItemProperty(SOURCE).getValue();
    			Object available = item.getItemProperty(AVAILABLE).getValue();
    			return "VARIABLE: " + String.valueOf(desc) + "<br>COLUMN: " + String.valueOf(variable_id) + "<br>UNIT: " + String.valueOf(unit) + "<br>SOURCE: " + String.valueOf(source) + "<br>AVAILABLE: " + String.valueOf(available);

    		}});
    	CheckBox varExistButton = itemStyle.getVariableExistButton();
    	Button collapseBtn = new Button();
    	collapseBtn.setHtmlContentAllowed(true);
    	collapseBtn.addStyleName("link collapse-button");
    	collapseBtn.setCaption("<b>Hide search</b>");
    	collapseBtn.setIcon(FontAwesome.ANGLE_DOUBLE_UP);
    	// Add click listener to collapse/expand button
    	collapseBtn.addClickListener(e -> {
    		Button btn = e.getButton();
    		controlsLayout.setVisible(!controlsLayout.isVisible());
    		if(controlsLayout.isVisible()) {
    			btn.setCaption("<b>Hide search</b>");
    			btn.setIcon(FontAwesome.ANGLE_DOUBLE_UP);
    		} else {
    			btn.setCaption("<b>Show search</b>");
    			btn.setIcon(FontAwesome.ANGLE_DOUBLE_DOWN);
    		}
    	});
    	variableselection.addComponent(varExistButton);
    	variableselection.addComponent(tree);

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
    				varExistButton.setValue(false);
    				itemStyle.inspect();
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
    				varExistButton.setValue(false);
    				itemStyle.inspect();
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
    	timesplit.setCaption("Shift:");

    	timewindow.setHeight("100%");
    	timewindow.addItem("Day");
    	timewindow.addItem("Week");
    	timewindow.addItem("Month");
    	timewindow.setNullSelectionAllowed(false);
    	timewindow.setValue("Day");
    	timewindow.setImmediate(true);
    	timewindow.setWidth("80px");

       	metadata = new Metadata(vmdata);

    	prevbutton.setWidth(SMALLBUTTONWIDTH);

    	timesplit.addComponent(prevbutton);
    	timesplit.setExpandRatio(prevbutton, 1.0f);
    	timesplit.addComponent(timewindow);
    	timesplit.setExpandRatio(timewindow, 2.0f);

    	nextbutton.setWidth(SMALLBUTTONWIDTH);

    	timesplit.addComponent(nextbutton);
    	timesplit.setExpandRatio(nextbutton, 1.0f);
    	//timesplit.setWidth("200px");
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
    	//Type of avaraging
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
    	
    	VerticalLayout queryButtonRowLayout = new VerticalLayout();
    	queryButtonRowLayout.setSpacing(true);

    	final LiferayIPC liferayipc = new LiferayIPC();
    	liferayipc.extend(this);
    	Button button = new Button();
    	button.setClickShortcut(KeyCode.ENTER);
    	button.setCaption("PLOT >>");
    	button.setIcon(FontAwesome.SEARCH);
    	button.setStyleName("query-button");
    	button.setWidth("115px");
    	button.setResponsive(true);
    	button.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate, enddate)) {
					if(dateRangeExceedsMaxPeriod(startdate, enddate, maxVisualisationTimeWindow)) {
						dlSelect.setEnabled(false);
						downloadButton.setEnabled(false);
						displayMailWindow(startdate, enddate, averaging, averagingType, quality, tree);
					} else {
						dlSelect.setEnabled(false);
						dlSelect.setValue("Choose type");
						downloadButton.setEnabled(false);
		    			liferayipc.sendEvent("NewTrajectory", csvsoi(startdate.getValue())+","+aheight.getValue());
		    			Tree t2 = (Tree)variableselection.getComponent(1);
		    			final ArrayList<String> set2 = new ArrayList<>((Set<String>)t2.getValue());
		    			download = null;
		    			if (!set2.isEmpty()) {
							try {
								download = new Download(startdate.getValue(), enddate.getValue(), db, SmearViewUI.getSelectedVariables(t2), itemStyle.getVariableAvailabilities(SmearViewUI.getSelectedVariables(t2), String.valueOf(quality).equals(SmearViewUI.CHECKED)), metadata, averaging, averagingType, String.valueOf(quality.getValue()));
							} catch (Exception e) {
								System.out.println("Catched " + e);
								e.printStackTrace();
							}
							if(download == null || download.allHaveErrors()) {
								chartsection.removeAllComponents();
							} else {
								if (!set2.isEmpty()) {
									dlSelect.setEnabled(true);
								}
								updateVizualisation(startdate, enddate, chartsection,variableselection, String.valueOf(quality).equals(SmearViewUI.CHECKED));
								SmearViewUI.doJVMGarbageCollection();
							}
						} // if set.empty
					}
				}
    		
    		}
    	});
    	VerticalLayout queryInputsLayout = new VerticalLayout();
    	VerticalLayout downloadLayout = new VerticalLayout();
    	HorizontalLayout querySecondRowLayout = new HorizontalLayout();
    	querySecondRowLayout.setMargin(true);
    	querySecondRowLayout.setSpacing(true);

    	Button resetBtn = new Button("Reset");
    	resetBtn.setIcon(FontAwesome.UNDO);
    	resetBtn.setStyleName("reload-view-button link");
    	resetBtn.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			liferayipc.sendEvent("ResetTrajectory", null);
    			final ArrayList<String> set3 = new ArrayList<>((Set<String>)tree.getValue());
    			for (String rm:set3){
    				tree.unselect(rm);
    			}
    			enddate.setValue(currCalendar.getTime());
    			startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    			timewindow.setValue("Day");
    			dlSelect.removeAllItems();
    			downloadButton.setEnabled(false);
    			dlSelect.setEnabled(false);
				download = null;
    			varExistButton.setValue(false);
    			chartsection.removeAllComponents();
    			updateVizualisation(startdate, enddate, chartsection, variableselection, String.valueOf(quality).equals(SmearViewUI.CHECKED));
    			
    		}
    	});
    	
    	querySecondRowLayout.setMargin(true);
    	querySecondRowLayout.setSpacing(true);
    	querySecondRowLayout.addComponent(quality);
    	querySecondRowLayout.addComponent(averaging);
    	querySecondRowLayout.addComponent(averagingType);
    	
    	downloadLayout.setMargin(true);
    	downloadLayout.setSpacing(true);
    	downloadLayout.setSizeUndefined();
    	downloadLayout.addComponent(button);
    	downloadLayout.addComponent(dlSelect);
    	downloadLayout.addComponent(downloadButton);
    	downloadLayout.addComponent(resetBtn);
		queryInputsLayout.addComponent(queryFirstRowLayout);
		queryInputsLayout.addComponent(querySecondRowLayout);
		controlsLayout.addComponent(queryInputsLayout);
		controlsLayout.addComponent(downloadLayout);
		
		right.addComponent(controlsLayout);
		
		HorizontalLayout collapseLayout = new HorizontalLayout();
		collapseLayout.setSpacing(true);
		collapseLayout.addComponent(collapseBtn);
		
		String helpContent = 
			"<p>" +
			"Search page allows visualization and download of variables from different stations and variable categories." +
			"</p>" + 
			"<h4>Variable tree</h4>" + 
			"<p>" +
			"You may choose stations and variables on the left. Clicking a station name opens a list of variables divided into different categories. Hovering the mouse pointer over a variable shows its database column name and a short description with unit and source instrument or source variables. Some variables are measured with several instruments, (2) after name indicates secondary measurement. You may select multiple variables by pressing the ctrl key simultaneously. Select a continuous list by clicking on the first and last variables while pressing shift. Up to 18 variables can be visualized at one time." +
			"</p>" +
			"<h4>Time span selection</h4>" + 
			"<p>" +
			"Select Time span is selected using From and To fields. You can move the time window via the Shift dropdown menu with the left and right arrows. Time is indicated at Finnish standard time (UTC+2) without daylight savings." +
			"</p>" +
			"<h4>Quality</h4>" + 
			"<p>" +
			"Filter the data by its quality check status. 'Any' gives all available records. 'Quality checked' selects only those data that were rigorously checked by the responsible researcher. Most variables are calculated and inserted to the database near real time with automated quality check and updated later with quality-checked data." +
			"</p>" +
			"<h4>Averaging</h4>" + 
			"<p>" +
			"The data can be downloaded in the original time resolution or aggregated half-hourly or hourly. The basic time step for the data is one minute. Some variables, such as fluxes and flux ancillary data, are stored as 30 min averages. Selecting 'None' for Averaging yields the original data in the database. You can also select the aggregation method with Averaging Type menu. Arithmetic mean is good for most variables. Some variables (e.g. precipitation, runoff/drainage) are cumulative and must be summed instead of averaged to obtain e.g. correct hourly values. Averaging wind direction requires a calculation of vector mean. Time is indicated as the beginning time of the averaging time window." +
			"</p>" +
			"<h4>Download</h4>" + 
			"<p>" +
			"Download selected data in chosen filetype after plotting it. The downloaded files also contain variable descriptions. Metadata may also be downloaded and queried through the API." +
			"</p>" +
			"<h4>Plotting</h4>" + 
			"<p>" +
			"Plot the data by clicking plot after selecting search parameters. If available, plotting also results in drawing air mass trajectories for the first day of selected time window to the map." +
			"</p>" +
			"<h4>Charts</h4>" + 
			"<p>" +
			"Chart visible time span can be adjusted using the slidable window below the graph(s). Chart can be zoomed either by using the mouse scroll or the controls above the graph. Chart graph display mode can be changed to one of the following: 1) continuous line, 2) bars, 3) scatter plot." +
			"</p>";
		
    	Label helpLabel= new Label(helpContent, ContentMode.HTML);
    	helpLabel.setWidth(500, Unit.PIXELS);
    	PopupView helpPopup = new PopupView("Help", helpLabel);
    	helpPopup.addStyleName("help-popup-view");
    	collapseLayout.addComponent(helpPopup);
    	
		right.addComponent(collapseLayout);
    	right.addComponent(chartsection);
    	
		
		//listeners
    	nextbutton.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate, enddate)) {
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
						displayMailWindow(startdate, enddate, averaging, averagingType, quality, tree);
						dlSelect.removeAllItems();
						downloadButton.setEnabled(false);
						dlSelect.setEnabled(false);
	    			} else {
	    				button.click();
	    			}
    			}
    		}
    	});
    	prevbutton.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate, enddate)) {
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
	    				dlSelect.removeAllItems();
						downloadButton.setEnabled(false);
						dlSelect.setEnabled(false);
	    				displayMailWindow(startdate, enddate, averaging, averagingType, quality, tree);
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
					displayMailWindow(startdate, enddate, averaging, averagingType, quality, tree);
					dlSelect.removeAllItems();
					downloadButton.setEnabled(false);
					dlSelect.setEnabled(false);
    			} else {
    				button.click();
    			}
    		}
    	}); 
    	averagingType.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (averagingType.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				if(averaging.getValue() == "NONE") {
    					averaging.setValue("1HOUR");
    				}
    				nohuman = false;
    			}
    			if (averagingType.getValue() == "NONE" && nohuman == false){
    				nohuman = true;
    				averaging.setValue("NONE");
    				nohuman = false;
    			}
    		}
    	});
    	averaging.addValueChangeListener(new Field.ValueChangeListener() {
    		public void valueChange(ValueChangeEvent event) {
    			if (averaging.getValue() != "NONE" && nohuman == false){
    				nohuman = true;
    				if(averagingType.getValue() == "NONE") {
    					averagingType.setValue("ARITHMETIC");
    				}
    				nohuman = false;
    			}
    			if (averaging.getValue() == "NONE" && nohuman == false){
    				nohuman = true;
    				averagingType.setValue("NONE");
    				nohuman = false;
    			}
    		}
    	});
    	
    	dlSelect.addValueChangeListener(e -> {
    		if(downloader != null && download != null) {
    			if("CSV".equals(dlSelect.getValue())) {
					downloader.setFileDownloadResource(null);
					FileLoaderThread fileThread = new FileLoaderThread(download, true, false, false, false);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					right.addComponent(pBar);
					fileThread.addListener(SmearViewUI.this);
					fileThread.start();
    			} else if("TXT".equals(dlSelect.getValue())) {
					downloader.setFileDownloadResource(null);
					FileLoaderThread fileThread = new FileLoaderThread(download, false, true, false, false);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					right.addComponent(pBar);
					fileThread.addListener(SmearViewUI.this);
					fileThread.start();
    			} else if("Meta".equals(dlSelect.getValue())) {
					downloader.setFileDownloadResource(null);
					FileLoaderThread fileThread = new FileLoaderThread(download, false, false, true, false);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					right.addComponent(pBar);
					fileThread.addListener(SmearViewUI.this);
					fileThread.start();
    			} else if("HDF5".equals(dlSelect.getValue())) {
					downloader.setFileDownloadResource(null);
					FileLoaderThread fileThread = new FileLoaderThread(download, false, false, false, true);
					UI.getCurrent().setPollInterval(100);
					pBar = new ProgressBar();
					pBar.setIndeterminate(true);
					pBar.setEnabled(false);
					right.addComponent(pBar);
					fileThread.addListener(SmearViewUI.this);
					fileThread.start();
    			} else {
					downloadButton.setEnabled(false);
				}
    		} else {
				downloadButton.setEnabled(false);
			}
    		SmearViewUI.doJVMGarbageCollection();
    	});
    	downloadButton.addClickListener(e -> {
    		downloadButton.setEnabled(false);
			dlSelect.setValue("Choose type");
    	});
    	
    	left.addComponent(variableselection);
    	layout.addComponent(left, 0, 0, 4, 0);
    	layout.addComponent(right, 5, 0, 19, 0);
    	
    	startdate.addValueChangeListener(e -> {
    		if(itemStyle.checkVarExistence()) {
    			if(isStartDateBeforeEndDate(startdate, enddate) && dateRangeExceedsMaxPeriod(startdate, enddate, VariableItemStyleGenerator.MAX_AVAILABILITY_PERIOD)) {
    				varExistButton.setValue(null);
    			}
				itemStyle.inspect();
    		}
		});
		enddate.addValueChangeListener(e -> {
			if(itemStyle.checkVarExistence()) {
				if(isStartDateBeforeEndDate(startdate, enddate) && dateRangeExceedsMaxPeriod(startdate, enddate, VariableItemStyleGenerator.MAX_AVAILABILITY_PERIOD)) {
    				varExistButton.setValue(null);
    			}
				itemStyle.inspect();
			}
		});
		quality.addValueChangeListener(e -> {
			if(itemStyle.checkVarExistence()) {
				itemStyle.inspect();
			}
		});
    }

    protected void displayMailWindow(PopupDateField startdate, PopupDateField enddate, ComboBox avaraging, ComboBox typeavaraging, ComboBox quality, Tree tree) {
    	Map<String, List<String>> selectedVars = getSelectedVariablesGroupedByStation(tree);
		if(selectedVars.size() > 0) {
	    	SmearEMailWindow mailWindow = new SmearEMailWindow("Get data via e-mail", "Visualisations are not supported for time periods exceeding " + maxVisualisationTimeWindow + " days.</p><p>Please choose file type and provide an e-mail address where a download link will be sent as soon as the data is available.</p><p>Generation of the data may take several minutes, after which a notification will be displayed on the screen.</p>", true, storedEmailAddress, true, false, SmearViewUI.this, selectedVars, String.valueOf(quality.getValue()), startdate.getValue(), enddate.getValue());
			SmearGenerateFileAction generateFileAction = new SmearGenerateFileAction(startdate, enddate, db, tree, getMetadata(), avaraging, typeavaraging, quality, mailWindow.getFileTypeField());
			mailWindow.setEmailAction(generateFileAction::doAction);
			mailWindow.addCloseListener(e -> {
				final String emailAddress = mailWindow.getEmailFieldValue();
				storedEmailAddress = emailAddress;
			});
			UI.getCurrent().addWindow(mailWindow);
			mailWindow.bringToFront();
			mailWindow.setVisible(true);
		} else {
			new Notification("No variables selected", "Please select at least one variable.", Notification.Type.WARNING_MESSAGE).show(UI.getCurrent().getPage());;
		}
	}
    
	private Map<String, List<String>> getSelectedVariablesGroupedByStation(Tree tree) {
		ArrayList<String> selectedVars = getSelectedVariables(tree);
		Map<String, List<String>> selectedVarsGrouped = new HashMap<>();
		for(String itemId : selectedVars) {
			String stationName = Station.getStationDisplayName(itemId.split(":")[1]);
			String varName = tree.getItemCaption(itemId);
			if(selectedVarsGrouped.get(stationName) == null) {
				selectedVarsGrouped.put(stationName, new ArrayList<String>());
			}
			selectedVarsGrouped.get(stationName).add(varName);
		}
		return selectedVarsGrouped;
	} 
    
    @SuppressWarnings("unchecked")
	public static ArrayList<String> getSelectedVariables(Tree tree) {
    	ArrayList<String> results = new ArrayList<>();
    	for(Object itemId : (Set<String>) tree.getValue()) {
			if(!tree.hasChildren(itemId)) {
				results.add(itemId.toString());
			}
		}
    	return results;
    }

	/**
     * station is ignored, because vmdata is set by table
     *  
     * 
     * @return Metadata metadata
     */
    public static Metadata getMetadata() {
    	return metadata;
    }

    @SuppressWarnings("unchecked")
	
    public void updateVizualisation(final PopupDateField start, final PopupDateField end, final CssLayout chartsection, final VerticalLayout variableselection, boolean checkQuality) {
    	Tree t = (Tree) variableselection.getComponent(1);
    	ArrayList<String> varsta = (Set<String>)t.getValue() != null ? new ArrayList<>((Set<String>)t.getValue()) : null;
    	if (varsta != null) {
    		Vizualisation viz = new Vizualisation(start.getValue(), end.getValue(), db, metadata, 300, 320, checkQuality ,download);
    		CssLayout rows = new CssLayout();
    		rows.setSizeFull();
    		Responsive.makeResponsive(rows);
    		int norows = Vizualisation.ROWS; // turha alustus, vastattava todellisuutta tai tule null-osoitin-poikkeus
    		if (varsta != null && varsta.isEmpty() == false){
    			rows = viz.plotVariables(varsta, t, treecontainer);
    			//norows = rows.length;
    		} else { //if selection == null
    			rows = viz.emptyrow();
    			norows = 0;
    		}
    		if (chartsection.getComponentCount() > 0) { 
    			for (int i = 0; i < norows; i++) {		
    				chartsection.replaceComponent(oldrows, rows);
    			}
    		} else {
    			chartsection.addComponent(rows); 
    		}
    		oldrows = rows;
    	}
    }

    String csvsoi(Date ft) {
    	final String COMMASEPARATED = "yyyy,MM,dd,HH";
    	DateFormat fnf = new SimpleDateFormat(COMMASEPARATED);
    	try{
    		return fnf.format(ft);
    	} catch(java.lang.NullPointerException enu) {
    		System.err.println("Null pointer Exception");
    		return "No valid time";
    	}
    }

    /**
     * Tarkistetaan muuttujan olemassaolo ja että muuttujalla on sisältö.
     */  
    private boolean exist(String object) {
    	if (null == object) {
    		return false;
    	} 
    	if (object.equals("")) {
    		return false;
    	} 
    	return true;
    }

	@SuppressWarnings("rawtypes")
	@Override
	public void notifyOfThreadComplete(Thread thread) {
		if(thread instanceof SendEmailThread) {
			Notification notif = null;
			if(((SendEmailThread) thread).mailHasBeenSent()) {
				notif = new Notification("The data is ready", "An e-mail with a link to the data has been sent.", Notification.Type.TRAY_NOTIFICATION);
				notif.setDelayMsec(-1);
			} else {
				notif = new Notification("Something went wrong", "Generating data failed. Please contact AVAA administrators to resolve the issue.", Notification.Type.WARNING_MESSAGE);
			}
			
			notif.show(UI.getCurrent().getPage());
			setPollInterval(-1);
		} else if(thread instanceof FileLoaderThread) {
			FileLoaderThread fileThread = (FileLoaderThread) thread;

			if(fileThread.isGetCsv()) {
				downloader.setFileDownloadResource(fileThread.getCsvStreamRes());
			}
			if(fileThread.isGetTxt()) {
				downloader.setFileDownloadResource(fileThread.getTxtStreamRes());
			}
			if(fileThread.isGetMeta()) {
				downloader.setFileDownloadResource(fileThread.getMetaStreamRes());
			}
			if(fileThread.isGetHdf5()) {
				downloader.setFileDownloadResource(fileThread.getHdf5FileRes());
			}

			right.removeComponent(pBar);
			downloadButton.setEnabled(true);
		}
		SmearViewUI.doJVMGarbageCollection();
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
		super.refresh(request);
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
	
	public static boolean isStartDateBeforeEndDate(PopupDateField startDate, PopupDateField endDate) {
		if(startDate == null || endDate == null || startDate.getValue() == null || endDate.getValue() == null) {
			Notification notif = new Notification("Invalid date range", "From date or To date is invalid", Notification.Type.WARNING_MESSAGE);
			notif.show(UI.getCurrent().getPage());
			return false;
		}
		if(startDate.getValue().equals(endDate.getValue()) || startDate.getValue().after(endDate.getValue())) {
			Notification notif = new Notification("Invalid date range", "From date must be earlier than To date", Notification.Type.WARNING_MESSAGE);
			notif.show(UI.getCurrent().getPage());
			return false;
		}
		return true;
	}
	
	public static void doJVMGarbageCollection() {
		if(garbageCollectionCount % 50 == 0) {
			System.gc();
		}
		garbageCollectionCount++;
	}

}
