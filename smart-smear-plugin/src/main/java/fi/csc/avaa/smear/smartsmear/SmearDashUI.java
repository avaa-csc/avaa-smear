package fi.csc.avaa.smear.smartsmear;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.data.validator.DateRangeValidator;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Field;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

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
public class SmearDashUI extends UI {
	
	//@WebServlet(value = "/VAADIN/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = true, ui = SmearDashUI.class)
    public static class Servlet extends VaadinServlet {
    }
	
    private static final long serialVersionUID = 8532668582109303543L;
    private static Log log = LogFactoryUtil.getLog(SmearViewUI.class);
    public static final String CITE = "Cite: Junninen, H; Lauri, A; Keronen, P; Aalto, P; Hiltunen, V; Hari, P; Kulmala, M."+
	"Smart-SMEAR: on-line data exploration and visualization tool for SMEAR stations. BOREAL ENVIRONMENT RESEARCH (BER) Vol 14, Issue 4, pp.447-457";
    //private Vizualisation viz = new Vizualisation();
    private final DB db = new DB();
    public HierarchicalContainer treecontainer;
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
	private static Metadata metadata;
    private static final String MAX_SCOPE = "maxScope";
    //private HorizontalLayout[] oldrows = new HorizontalLayout[Vizualisation.ROWS]; //midselect visualization
    private CssLayout oldrows = new CssLayout();
    public volatile String storedEmailAddress;
   
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
    	this.treecontainer = new HierarchicalContainer();
    	this.storedEmailAddress = null;
    	
    	PortletPreferences portletPreferences = ((PortletRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST)).getPreferences();
    	
    	//main layout 
    	VerticalLayout layout = new VerticalLayout();
    	layout.setMargin(false);
    	setContent(layout);
    	
    	HorizontalLayout center = new HorizontalLayout();
    	center.setMargin(true);
    	
    	VerticalLayout variableselection = new VerticalLayout();
    	variableselection.setMargin(false);
    	variableselection.setSizeUndefined();
    	variableselection.setImmediate(true);
    	
        PopupDateField enddate = new PopupDateField("To:");
    	PopupDateField startdate = new PopupDateField("From:");
    	VerticalLayout chartsection = new VerticalLayout();
    	HorizontalLayout queryFirstRowLayout = new HorizontalLayout();
    	maxVisualisationTimeWindow = Integer.parseInt(portletPreferences.getValue(MAX_SCOPE, ""));
    	// Components
    	Button prevbutton = new Button("<<");
    	prevbutton.setStyleName("special-button");
    	NativeSelect timewindow = new NativeSelect();
    	timewindow.addStyleName("timewindow-select");
    	Button nextbutton = new Button(">>");
    	nextbutton.setStyleName("special-button");
    	ComboBox aheight = new ComboBox("Arrival Height:");
    	
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
    			temp.setTime(enddate.getValue());
    			enddate.setValue(getEndOfDay(false, temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DAY_OF_MONTH)));
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
    			temp.setTime(startdate.getValue());
    			startdate.setValue(getStartOfDay(false, temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DAY_OF_MONTH)));
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
//    	timewindow.addItem("Month");
    	timewindow.setNullSelectionAllowed(false);
    	timewindow.setValue("Day");
    	timewindow.setImmediate(true);
    	timewindow.setWidth("80px");
    	
    	for (int i = 0; i < Station.ASEMAT.length; i++){
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
				System.out.println("Could not retrieve metadata for station");
			}
			if (j==0 && i==0){
				vmdata=mdata;
			} else {
				//read-only list must be looped
				try {
				List<SmearVariableMetadata> mdata2 = new ArrayList<SmearVariableMetadata>(vmdata);
				mdata2.addAll(mdata);
				vmdata = mdata2;	
				} catch (NullPointerException npe) {
					log.error("Nullpointer metadataa haettaessa");
				}
			}
			
			}		
    	}
    	
       	metadata = new Metadata(vmdata);

    	prevbutton.setWidth(SMALLBUTTONWIDTH);

    	timesplit.addComponent(prevbutton);
    	timesplit.setExpandRatio(prevbutton, 1.0f);
    	timesplit.addComponent(timewindow);
    	timesplit.setExpandRatio(timewindow, 2.0f);
    	timesplit.setCaption("Shift:");
    	nextbutton.setWidth(SMALLBUTTONWIDTH);
    	timesplit.addComponent(nextbutton);
    	timesplit.setExpandRatio(nextbutton, 1.0f);
    	
    	timesplit.setComponentAlignment(prevbutton, Alignment.TOP_LEFT);
    	timesplit.setComponentAlignment(timewindow, Alignment.TOP_LEFT); 
    	timesplit.setComponentAlignment(nextbutton, Alignment.TOP_LEFT);
    	timesplit.setHeight("100%");
    	queryFirstRowLayout.addComponent(timesplit);

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
    	
    	HorizontalLayout queryButtonRowLayout = new HorizontalLayout();
    	queryButtonRowLayout.setStyleName("query-layout");
    	queryButtonRowLayout.setSpacing(true);

    	final LiferayIPC liferayipc = new LiferayIPC();
    	liferayipc.extend(this);
    	Button button = new Button();
    	button.setClickShortcut(KeyCode.ENTER);
    	button.setCaption("PLOT >>");
    	button.setIcon(FontAwesome.SEARCH);
    	button.setStyleName("query-button");
    	button.setWidth("115px");
    	button.setDescription("Click to retrieve data visualization");
    	button.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			if(isStartDateBeforeEndDate(startdate.getValue(), enddate.getValue())) {
					if(dateRangeExceedsMaxPeriod(startdate, enddate, 15)) {
						Notification notif = new Notification("Please select a period no more than 15 days", "", Notification.Type.WARNING_MESSAGE);
						notif.setDelayMsec(3000);
						notif.show(UI.getCurrent().getPage());
					} else {
		    			liferayipc.sendEvent("NewTrajectory", csvsoi(startdate.getValue())+","+aheight.getValue());
		    			updateVizualisation(startdate, enddate, chartsection,variableselection, null);
		    			SmearViewUI.doJVMGarbageCollection();
					}
				}
    		}
    	});
    	//Options selection    
    	HorizontalLayout querySecondRowLayout = new HorizontalLayout();
    	querySecondRowLayout.setMargin(true);
    	querySecondRowLayout.setSpacing(true);

    	Button mainview = new Button("Reset time");
    	mainview.setIcon(FontAwesome.UNDO);
    	mainview.setStyleName("reload-view-button link");
    	mainview.addClickListener(new Button.ClickListener() {
    		public void buttonClick(ClickEvent event) {
    			enddate.setValue(currCalendar.getTime());
    			startdate.setValue(getModifiedDate(enddate.getValue(), -1));
    			timewindow.setValue("Day");
    			updateVizualisation(startdate,enddate, chartsection, variableselection, null); 
    		}
    	});
    	querySecondRowLayout.setSpacing(true);
    	querySecondRowLayout.setMargin(true);
    	querySecondRowLayout.removeComponent(button);
    	querySecondRowLayout.addComponent(button);
    	querySecondRowLayout.removeComponent(mainview);
    	querySecondRowLayout.addComponent(mainview);
    	querySecondRowLayout.setComponentAlignment(button, Alignment.BOTTOM_RIGHT);
    	querySecondRowLayout.setComponentAlignment(mainview, Alignment.BOTTOM_RIGHT);
    	
    	String helpContent = 
			"<h4>Time span selection</h4>" + 
			"<p>" +
			"Select Time span is selected using From and To fields. You can move the time window via the Shift dropdown menu with the left and right arrows. Time is indicated at Finnish standard time (UTC+2) without daylight savings." +
			"</p>" +
			"<h4>Charts</h4>" + 
			"<p>" +
			"Detailed information regarding the variables displayed on the charts of this page can be found in search data and download pages. Chart can be zoomed either by using the mouse scroll or the controls above the graph. Chart graph display mode can be changed to one of the following: 1) continuous line, 2) bars, 3) scatter plot." +
			"</p>";
    		
    	Label helpLabel= new Label(helpContent, ContentMode.HTML);
    	helpLabel.setWidth(500, Unit.PIXELS);
    	PopupView helpPopup = new PopupView("Help", helpLabel);
    	helpPopup.addStyleName("help-popup-dash");
    	
    	querySecondRowLayout.addComponent(helpPopup);
    	queryFirstRowLayout.addComponent(querySecondRowLayout);
    	
    	//listeners
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
//	    			if (timewindow.getValue() == "Month"){
//	    				startdate.setValue(getModifiedDate(startdate.getValue(), 30));
//	    				enddate.setValue(getModifiedDate(enddate.getValue(), 30));
//	    			}
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
//	    			if (timewindow.getValue() == "Month"){
//	    				startdate.setValue(getModifiedDate(startdate.getValue(), -30));
//	    				enddate.setValue(getModifiedDate(enddate.getValue(), -30));
//	    			}
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
//    			if (timewindow.getValue() == "Month"){
//    				startdate.setResolution(Resolution.DAY);
//    				enddate.setResolution(Resolution.DAY);
//    				if ((getModifiedDate(startdate.getValue(), 30)).before(currCalendar.getTime())){
//    					enddate.setValue(getModifiedDate(startdate.getValue(), 30));
//    				} else{
//    					enddate.setValue(currCalendar.getTime());
//    					startdate.setValue(getModifiedDate(enddate.getValue(), -30));
//    				}
//    			}
    			if(dateRangeExceedsMaxPeriod(startdate, enddate, 15)) {
    				Notification notif = new Notification("Please select a period no more than 15 days", "", Notification.Type.WARNING_MESSAGE);
					notif.setDelayMsec(3000);
					notif.show(UI.getCurrent().getPage());
    			} else {
    				button.click();
    			}
    		}
    	});
    	center.addComponent(queryFirstRowLayout);
    	layout.addComponent(center);
    	layout.addComponent(chartsection);
    	updateVizualisation(startdate,enddate, chartsection, variableselection, null);
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

	public void updateVizualisation(final PopupDateField start, final PopupDateField end, final VerticalLayout chartsection, final VerticalLayout variableselection, Download dl) { 
    	Vizualisation viz = new Vizualisation(start.getValue(), end.getValue(), db, metadata, 360, 360, false);
    	//HorizontalLayout[] rows = new HorizontalLayout[Vizualisation.ROWS];
    	CssLayout rows = new CssLayout();
    	rows = viz.emptyrow();
    	rows = viz.kuvaajat();
    	rows.setSizeFull();
    	Responsive.makeResponsive(rows);
    	
    	if (chartsection.getComponentCount() > 0) {
    		chartsection.replaceComponent(oldrows, rows);
    	} else {
    		chartsection.addComponent(rows);
    	}
    	oldrows = rows;
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
}
