/**
* 
*/
package fi.csc.avaa.smear.smartsmear;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Stream;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.addon.timeline.Timeline;
import com.vaadin.addon.timeline.Timeline.DateRangeChangedEvent;
import com.vaadin.addon.timeline.Timeline.DateRangeListener;
import com.vaadin.data.Container.Indexed;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;

import fi.csc.smear.db.model.HyyDMPS;
import fi.csc.smear.db.model.Kumpulameta;
import fi.csc.smear.db.model.Varriometa;
import fi.csc.smear.db.service.HydemetaLocalServiceUtil;
import fi.csc.smear.db.service.KumpulametaLocalServiceUtil;
import fi.csc.smear.db.service.VarriometaLocalServiceUtil;

/**
* @author pj
* @modified jmlehtin
*
*/
public class Vizualisation  implements java.io.Serializable {
	private static final long serialVersionUID = 8532668582109303532L;
	public static final int MAXNOVIZ = 18; //visualisointien määrä sivulla
	public static final int VIZPERROW = 2; //visualisointien määrä rivillä
	public static final int ROWS = MAXNOVIZ/VIZPERROW;
	public int chartWidth;
	public int chartHeight;
	private static Set<String> finalset = new HashSet<String>();
	private static Set<String> tableset = new HashSet<String>();

	private Date start;
	private Date end;
	private Data dbdata;
	private Download download;
	
	private float graphMinValue;
	private float graphMaxValue;
	private static final float GRAPH_VALUE_INIT_MIN = 1000000000f;
	private static final float GRAPH_VALUE_INIT_MAX = -1000000000f;
	public static final String HYY_META = "HYY_META";
	public static final String KUM_META = "KUM_META";
	private static final String KP = Download.MUUTTUJAEROTIN; //:
	public static final String VAR_META = "VAR_META";
	public static final String HYY_EDDY233 = "HYY_EDDY233";
	
	private void resetExtremeValues() {
		graphMinValue = GRAPH_VALUE_INIT_MIN;
		graphMaxValue = GRAPH_VALUE_INIT_MAX;
	}
	
	private Float[] checkExtremeValues(Float[] values) {
		Float[] temp = new Float[2];
		float minTemp = values[0];
		float maxTemp = values[1];
		if(minTemp == GRAPH_VALUE_INIT_MIN || minTemp == GRAPH_VALUE_INIT_MAX) {
			minTemp = 0;
			maxTemp = 1;
		}
		if(maxTemp == GRAPH_VALUE_INIT_MIN || maxTemp == GRAPH_VALUE_INIT_MAX) {
			minTemp = 0;
			maxTemp = 1;
		}
		if(minTemp > maxTemp) {
			minTemp = maxTemp - 1; 
		}
		if(minTemp == maxTemp) {
			minTemp = minTemp - 1;
			maxTemp = maxTemp + 1;
		}
		if(minTemp == 0.0f) {
			minTemp = -1.0f;
		}
		if(maxTemp == 0.0f) {
			maxTemp = 1.0f;
		}
		float diff = maxTemp - minTemp;
		temp[0] = minTemp - (Math.abs(diff)*0.1f);
		temp[1] = maxTemp + (Math.abs(diff)*0.1f);
		return temp;
	}
	
	public Vizualisation(Date start, Date end, DB db, Metadata metadata, int widthInPixels, int heightInPixels, boolean checkQuality) {
		this.chartHeight = heightInPixels;
		this.chartWidth = widthInPixels;
		this.start = start;
		this.end = end;
		this.dbdata = new Data(finalset, tableset, metadata.getHTindex());
		db.open();
		try {
			tableset.forEach(table ->
					db.avg(dbdata, table, start.getTime(), end.getTime(), DB.NONE, DB.NONE, checkQuality)); //ei keskiarvoistusta
		} finally {
			db.close();
		}
	}
	
	public Vizualisation(Date start, Date end, DB db, Metadata metadata, int widthInPixels, int heightInPixels, boolean checkQuality, Download download) {
		this.chartHeight = heightInPixels;
		this.chartWidth = widthInPixels;
		this.start = start;
		this.end = end;
		this.download = download;
		this.dbdata = new Data(this.download.getData().finalset, this.download.getData().tableset, metadata.getHTindex());
		db.open();
		try {
			this.download.getData().tableset.forEach(table ->
					db.avg(dbdata, table, start.getTime(), end.getTime(), DB.NONE, DB.NONE, checkQuality)); //ei keskiarvoistusta
		} finally {
			db.close();
		}
	}
	
	CssLayout kuvaajat() {
		CssLayout csskuvaajat = createVizLayout();
		
		Timeline CO2vuo = createTimeline(chartWidth, chartHeight, false);
		CO2vuo.setCaption("CO₂ flux");
		IndexedContainer co2containerh = createIndexedContainer();
		setDataInRange(co2containerh, HYY_EDDY233, "F_c");	

		CO2vuo.addGraphDataSource(co2containerh,  Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		CO2vuo.setGraphCaption(co2containerh, "Hyytiälä");	
		CO2vuo.setVerticalAxisLegendUnit(co2containerh, "µmol m⁻² s⁻¹");
		CO2vuo.setGraphOutlineColor(co2containerh, SolidColor.RED);
		
		HorizontalLayout hl01 = new HorizontalLayout();
		hl01.setMargin(true);
		hl01.setSpacing(true);
		hl01.addComponent(CO2vuo);
		csskuvaajat.addComponent(hl01);
		
		HorizontalLayout hl2 = new HorizontalLayout();
		hl2.setMargin(true);
		hl2.setSpacing(true);
		hl2.addComponent(co(start,end));
		csskuvaajat.addComponent(hl2);
		
		Timeline H2O = createTimeline(chartWidth, chartHeight, false);
		H2O.setCaption("Evapotranspiration");
		IndexedContainer h2ocontainerh = createIndexedContainer();
		setDataInRange(h2ocontainerh, HYY_EDDY233, "E");	

		H2O.addGraphDataSource(h2ocontainerh,  Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		H2O.setGraphCaption(h2ocontainerh, "Hyytiälä");	
		H2O.setVerticalAxisLegendUnit(h2ocontainerh, "mmol m⁻² s⁻¹");
		H2O.setGraphOutlineColor(h2ocontainerh, SolidColor.RED);
//		H2O.setGraphCapsVisible(h2ocontainerh, true);
		
		HorizontalLayout hl13 = new HorizontalLayout();
		hl13.setMargin(true);
		hl13.setSpacing(true);
		hl13.addComponent(H2O);
		csskuvaajat.addComponent(hl13);
		
		HorizontalLayout hl3 = new HorizontalLayout();
		hl3.setMargin(true);
		hl3.setSpacing(true);
		hl3.addComponent(dpmsViz());
		csskuvaajat.addComponent(hl3);
		
		Timeline tconc = createTimeline(chartWidth, chartHeight, false);
		tconc.setCaption("Total aerosol concentration");
		tconc.setLocale(Locale.ENGLISH);
		IndexedContainer totalcontainerh = createIndexedContainer();
		List<HyyDMPS> data = getDataInRange(HyyDMPS.class, start, end, "tconc");
		if (data != null && !data.isEmpty()) {
			for (HyyDMPS hydedmps: data) {
				addItem(totalcontainerh, hydedmps.getSamptime(), hydedmps.getTconc());
			}
		} 

		tconc.addGraphDataSource(totalcontainerh,  Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tconc.setGraphCaption(totalcontainerh, "Hyytiälä");	
		tconc.setVerticalAxisLegendUnit(totalcontainerh, "1/cm³");
		tconc.setGraphOutlineColor(totalcontainerh, SolidColor.RED);
//		tconc.setGraphCapsVisible(totalcontainerh, true);
		
		HorizontalLayout hl12 = new HorizontalLayout();
		hl12.setMargin(true);
		hl12.setSpacing(true);
		hl12.addComponent(tconc);
		csskuvaajat.addComponent(hl12);
		
		HorizontalLayout hl6 = new HorizontalLayout();
		hl6.setMargin(true);
		hl6.setSpacing(true);
		hl6.addComponent(O3(start, end, Station.KUMPULA+Station.VÄRRIÖ+Station.HYYTIÄLÄ));
		csskuvaajat.addComponent(hl6);
	
		HorizontalLayout hl8 = new HorizontalLayout();
		hl8.setMargin(true);
		hl8.setSpacing(true);
		
		Timeline tlSO;
	    tlSO = createTimeline(chartWidth, chartHeight, false);
	    tlSO.setCaption("SO₂ 15-16m");
	    tlSO.setLocale(Locale.ENGLISH);
       IndexedContainer containerSO_2 = createIndexedContainer();
       IndexedContainer containerSO2168 = createIndexedContainer();
       IndexedContainer containerSO2_0 = createIndexedContainer();
		setDataInRange(containerSO2168, HYY_META, "SO2168");
		setDataInRange(containerSO_2, KUM_META, "SO_2");
		setDataInRange(containerSO2_0, VAR_META, "SO2_1");

		tlSO.addGraphDataSource(containerSO2168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlSO.addGraphDataSource(containerSO_2, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlSO.addGraphDataSource(containerSO2_0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlSO.setGraphCaption(containerSO2168, "Hyytiälä");
		tlSO.setGraphCaption(containerSO_2, "Kumpula");
		tlSO.setGraphCaption(containerSO2_0, "Värriö");
		tlSO.setGraphOutlineColor(containerSO2_0, SolidColor.BLUE);
		tlSO.setGraphOutlineColor(containerSO_2, SolidColor.BLACK);
		tlSO.setGraphOutlineColor(containerSO2168, SolidColor.RED);
		tlSO.setGraphCaption(containerSO2168, "Hyytiälä");
		tlSO.setGraphCaption(containerSO_2, "Kumpula");
		tlSO.setGraphCaption(containerSO2_0, "Värriö");
		tlSO.setVerticalAxisLegendUnit(containerSO2168, "ppb");
		tlSO.setVerticalAxisLegendUnit(containerSO_2, "ppb");
		tlSO.setVerticalAxisLegendUnit(containerSO2_0, "ppb");
//		tlSO.setGraphCapsVisible(containerSO2168, true);
//		tlSO.setGraphCapsVisible(containerSO_2, true);
//		tlSO.setGraphCapsVisible(containerSO2_0, true);
		
		hl8.addComponent(tlSO);
		csskuvaajat.addComponent(hl8);
		
		Timeline tlNO, tlNOx;
       tlNO = createTimeline(chartWidth, chartHeight, false);
       tlNOx = createTimeline(chartWidth, chartHeight, false);
       tlNO.setCaption("NO 15-16m");
       tlNOx.setCaption("NOx 15-16m");
       tlNO.setLocale(Locale.ENGLISH);
       tlNOx.setLocale(Locale.ENGLISH);
       IndexedContainer containerNO168 = createIndexedContainer();
       IndexedContainer containerNOx168 = createIndexedContainer();
       //IndexedContainer containerNO = createIndexedContainer();
       //IndexedContainer containerNO_x = createIndexedContainer();
       IndexedContainer containerNO_0 = createIndexedContainer();
       IndexedContainer containerNOX_0 = createIndexedContainer();
		setDataInRange(containerNO168, HYY_META,  "NO168");
		//List<Kumpulameta> data_k = getDataInRange(Kumpulameta.class, start, end, "NO");
		setDataInRange(containerNO_0, VAR_META, "NO_1");	
		setDataInRange(containerNOx168, HYY_META,  "NOx168");
		setDataInRange(containerNO_0, VAR_META, "NOX_1");			
		
		tlNO.addGraphDataSource(containerNO168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlNOx.addGraphDataSource(containerNOx168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlNO.addGraphDataSource(containerNO_0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlNOx.addGraphDataSource(containerNOX_0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		tlNO.setGraphCaption(containerNO168, "Hyytiälä");
		tlNOx.setGraphCaption(containerNOx168, "Hyytiälä");
		tlNO.setGraphCaption(containerNO_0, "Värriö");
		tlNOx.setGraphCaption(containerNOX_0, "Värriö");
		tlNO.setVerticalAxisLegendUnit(containerNO168, "ppb");
		tlNOx.setVerticalAxisLegendUnit(containerNOx168, "ppb");
		tlNO.setVerticalAxisLegendUnit(containerNO_0, "ppb");
		tlNOx.setVerticalAxisLegendUnit(containerNOX_0, "ppb");
		tlNO.setGraphOutlineColor(containerNO168, SolidColor.RED);
		tlNOx.setGraphOutlineColor(containerNOx168, SolidColor.RED);
		tlNO.setGraphOutlineColor(containerNO_0, SolidColor.BLUE);
		tlNOx.setGraphOutlineColor(containerNOX_0, SolidColor.BLUE);
//		tlNO.setGraphCapsVisible(containerNO168, true);
//		tlNOx.setGraphCapsVisible(containerNOx168, true);
//		tlNO.setGraphCapsVisible(containerNO_0, true);
//		tlNOx.setGraphCapsVisible(containerNOX_0, true);
		
		HorizontalLayout hl9 = new HorizontalLayout();
		hl9.setMargin(true);
		hl9.setSpacing(true);
		HorizontalLayout hl10 = new HorizontalLayout();
		hl10.setMargin(true);
		hl10.setSpacing(true);
		hl9.addComponent(tlNO);
		hl10.addComponent(tlNOx);
		csskuvaajat.addComponent(hl9);
		csskuvaajat.addComponent(hl10);
	
		HorizontalLayout hl4 = new HorizontalLayout();
		hl4.setMargin(true);
		hl4.setSpacing(true);
		hl4.addComponent(glob(start, end, Station.KUMPULA+Station.VÄRRIÖ+Station.HYYTIÄLÄ));
		csskuvaajat.addComponent(hl4);
	
		
		HorizontalLayout hl1 = new HorizontalLayout();
		hl1.setMargin(true);
		hl1.setSpacing(true);
		hl1.addComponent(temperature());
		csskuvaajat.addComponent(hl1);

		Timeline ilmanpaine = createTimeline(chartWidth, chartHeight, false);
		ilmanpaine.setCaption("Air pressure");
		ilmanpaine.setLocale(Locale.ENGLISH);
		IndexedContainer ilmanpainecontainerh = createIndexedContainer();
		IndexedContainer ilmanpainecontainerk = createIndexedContainer();
		IndexedContainer ilmanpainecontainerv = createIndexedContainer();
		setDataInRange(ilmanpainecontainerh, HYY_META, "Pamb0");
		setDataInRange(ilmanpainecontainerk, KUM_META, "p");
		setDataInRange(ilmanpainecontainerv, VAR_META, "P");
	
		ilmanpaine.addGraphDataSource(ilmanpainecontainerh, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		ilmanpaine.addGraphDataSource(ilmanpainecontainerk, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		ilmanpaine.addGraphDataSource(ilmanpainecontainerv, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		ilmanpaine.setGraphCaption(ilmanpainecontainerh, "Hyytiälä");
		ilmanpaine.setGraphCaption(ilmanpainecontainerk, "Kumpula");
		ilmanpaine.setGraphCaption(ilmanpainecontainerv, "Värriö");
		ilmanpaine.setVerticalAxisLegendUnit(ilmanpainecontainerh, "hPa");
		ilmanpaine.setVerticalAxisLegendUnit(ilmanpainecontainerk, "hPa");
		ilmanpaine.setVerticalAxisLegendUnit(ilmanpainecontainerv, "hPa");
		ilmanpaine.setGraphOutlineColor(ilmanpainecontainerk, SolidColor.BLACK);
		ilmanpaine.setGraphOutlineColor(ilmanpainecontainerh, SolidColor.RED);
		ilmanpaine.setGraphOutlineColor(ilmanpainecontainerv, SolidColor.BLUE);
//		ilmanpaine.setGraphCapsVisible(ilmanpainecontainerh, true);
//		ilmanpaine.setGraphCapsVisible(ilmanpainecontainerk, true);
//		ilmanpaine.setGraphCapsVisible(ilmanpainecontainerv, true);
		
		HorizontalLayout hl11 = new HorizontalLayout();
		hl11.setMargin(true);
		hl11.setSpacing(true);
		hl11.addComponent(ilmanpaine);
		csskuvaajat.addComponent(hl11);
		
		HorizontalLayout hl7 = new HorizontalLayout();
		hl7.setMargin(true);
		hl7.setSpacing(true);
		hl7.addComponent(windspeed(start, end));
		csskuvaajat.addComponent(hl7);
		
		/*HorizontalLayout hl15 = new HorizontalLayout();
		hl15.setMargin(true);
		hl15.setSpacing(true);
		hl15.addComponent(ilmanpaine);
		csskuvaajat.addComponent(hl15);*/
					
		Windrose wr = new Windrose();
		
		HorizontalLayout hl14 = new HorizontalLayout();
		hl14.setMargin(true);
		hl14.setSpacing(true);
		hl14.addComponent(wr.getChart(start, end, this));
		csskuvaajat.addComponent(hl14);

		HorizontalLayout hl5 = new HorizontalLayout();
		hl5.setMargin(true);
		hl5.setSpacing(true);
		hl5.addComponent(RH(start, end, Station.KUMPULA+Station.VÄRRIÖ+Station.HYYTIÄLÄ));
		csskuvaajat.addComponent(hl5);
		
		Timeline maanlampo = createTimeline(chartWidth, chartHeight, false);
		maanlampo.setCaption("Soil temperature");
		maanlampo.setLocale(Locale.ENGLISH);
		IndexedContainer maanlampocontainerh = createIndexedContainer();
		IndexedContainer maanlampocontainerv = createIndexedContainer();
		setDataInRange(maanlampocontainerh, HYY_META, "tsoil_A");
		setDataInRange(maanlampocontainerv, VAR_META, "ST");
	
		maanlampo.addGraphDataSource(maanlampocontainerh, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		maanlampo.addGraphDataSource(maanlampocontainerv, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		maanlampo.setGraphCaption(maanlampocontainerh, "Hyytiälä");
		maanlampo.setGraphCaption(maanlampocontainerv, "Värriö");
		maanlampo.setVerticalAxisLegendUnit(maanlampocontainerh, "\u00b0C");
		maanlampo.setVerticalAxisLegendUnit(maanlampocontainerv, "\u00b0C");
		maanlampo.setGraphOutlineColor(maanlampocontainerh, SolidColor.RED);
		maanlampo.setGraphOutlineColor(maanlampocontainerv, SolidColor.BLUE);	
		csskuvaajat.addComponent(maanlampo);
		
		return csskuvaajat;
	}
	
	public CssLayout dpmsViz(){
		CssLayout dpmslayout = createVizLayout();
		DPMS dpms = new DPMS(this);
		Image dpmsviz = new Image("Aerosol size Distribution [m]", dpms.getHyde(start, end));
		dpmsviz.setHeight(chartHeight, Unit.PIXELS);
		dpmsviz.setWidth(chartWidth, Unit.PIXELS);
		dpmslayout.addComponent(dpmsviz);
		return dpmslayout;
	}
	public CssLayout emptyrow(){
		CssLayout empty_row = createVizLayout();
		return empty_row;
	}
	
	public Timeline windspeed(Date startdate, Date enddate) {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setCaption("Windspeed 15-16m");
		timeline.setLocale(Locale.ENGLISH);
		IndexedContainer containerWSU168 = createIndexedContainer();
		IndexedContainer containerTower_WS_16m = createIndexedContainer(); // vaihdettu oleva muuttuja
		IndexedContainer containerWS0 = createIndexedContainer();
		setDataInRange(containerWSU168, HYY_META, "WSU168");
		setDataInRange(containerTower_WS_16m, KUM_META,  "ws");
		setDataInRange(containerWS0, VAR_META,  "WS0");

		timeline.addGraphDataSource(containerWSU168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.addGraphDataSource(containerTower_WS_16m, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.addGraphDataSource(containerWS0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerWSU168, "Hyytiälä");
		timeline.setGraphCaption(containerTower_WS_16m, "Kumpula");
		timeline.setGraphCaption(containerWS0, "Värriö 15m");
		timeline.setGraphOutlineColor(containerWS0, SolidColor.BLUE);
		timeline.setGraphOutlineColor(containerTower_WS_16m, SolidColor.BLACK);
		timeline.setGraphOutlineColor(containerWSU168, SolidColor.RED);
		timeline.setVerticalAxisLegendUnit(containerWSU168, "m/s");
		timeline.setVerticalAxisLegendUnit(containerTower_WS_16m, "m/s");
		timeline.setVerticalAxisLegendUnit(containerWS0, "m/s");
//		timeline.setGraphCapsVisible(containerWSU168, true);
//		timeline.setGraphCapsVisible(containerTower_WS_16m, true);
//		timeline.setGraphCapsVisible(containerWS0, true);
		return timeline;
	}
		
	/**
	 * 
	 * @return Timeline from vaadin addon chart
	 * */
	
	public Timeline temperature() {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setCaption("Temperature 15-16m");		
		IndexedContainer containerT168 = createIndexedContainer();
		IndexedContainer containerTower_T_16m = createIndexedContainer();
		IndexedContainer containerTDRY0 = createIndexedContainer();
		setDataInRange(containerT168, HYY_META, "T672");
		setDataInRange(containerTower_T_16m, KUM_META,  "Tower_T_16m");
		setDataInRange(containerTDRY0, VAR_META, "TDRY0");	
		
		timeline.addGraphDataSource(containerT168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.addGraphDataSource(containerTower_T_16m, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.addGraphDataSource(containerTDRY0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerT168, "Hyytiälä");
		timeline.setGraphCaption(containerTower_T_16m, "Kumpula");
		timeline.setGraphCaption(containerTDRY0, "Värriö 15m");
		timeline.setGraphOutlineColor(containerTDRY0, SolidColor.BLUE);
		timeline.setGraphOutlineColor(containerTower_T_16m, SolidColor.BLACK);
		timeline.setGraphOutlineColor(containerT168, SolidColor.RED);
		timeline.setVerticalAxisLegendUnit(containerT168, "\u00b0C");
		timeline.setVerticalAxisLegendUnit(containerTower_T_16m, "\u00b0C");
		timeline.setVerticalAxisLegendUnit(containerTDRY0, "\u00b0C");
//		timeline.setGraphCapsVisible(containerT168, true);
//		timeline.setGraphCapsVisible(containerTower_T_16m, true);
//		timeline.setGraphCapsVisible(containerTDRY0, true);
		return timeline;
	}

	/**
	 * Creates an indexed container with two properties: value and timestamp.
	 * 
	 * @return a container with "value, timestamp" items.
	 */
	public IndexedContainer createIndexedContainer() {
		IndexedContainer container = new IndexedContainer();
		container.addContainerProperty(Timeline.PropertyId.VALUE, Float.class,
				new Float(0));
		container.addContainerProperty(Timeline.PropertyId.TIMESTAMP,
				java.util.Date.class, null);
		return container;
	}

	/**
	 * 
	 * @param width int
	 * @param height int
	 * @return vaadin chart addon timeline
	 */
	Timeline createTimeline(int width, int height, boolean showBrowser) {
		Timeline timeline = new Timeline();
		timeline.setWidth(width, Unit.PIXELS);
		timeline.setHeight(height, Unit.PIXELS);
		timeline.setChartModesVisible(false);
		timeline.setDateSelectEnabled(false);
		timeline.setDateSelectVisible(false); 
		timeline.setChartModesVisible(true);
		timeline.setZoomLevelsVisible(true);
		timeline.setZoomLevelsCaption("Zoom");
		timeline.addZoomLevel("15min", 86400000L/96);
		timeline.addZoomLevel("1h", 86400000L/24);
		timeline.addZoomLevel("12h", 86400000L/2);
		timeline.addZoomLevel("1d", 86400000L);
		timeline.addZoomLevel("5d", 5 * 86400000L);
		timeline.addZoomLevel("1mth", 2629743830L);
		timeline.addZoomLevel("3mth", 3 * 2629743830L);
		timeline.addZoomLevel("6mth", 6 * 2629743830L);
		timeline.setLocale(Locale.ENGLISH);
		timeline.setGraphLegendVisible(true);
		timeline.setNoDataSourceCaption("No data available");
		timeline.setMarkerTimestampPropertyId(Timeline.PropertyId.TIMESTAMP);
		timeline.setMarkerValuePropertyId(Timeline.PropertyId.VALUE);
		if(showBrowser) {
			timeline.setBrowserVisible(true);
		} else {
			timeline.setBrowserVisible(false);
		}
		timeline.addListener(new DateRangeListener() {
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unchecked")
			@Override
			public void dateRangeChanged(DateRangeChangedEvent event) {
				if(timeline.getGraphDatasources() != null) {
					resetExtremeValues();
					for(Indexed cnt : timeline.getGraphDatasources()) {
						for(Object itemId : cnt.getItemIds()) {
							Property<Date> item = cnt.getContainerProperty(itemId, Timeline.PropertyId.TIMESTAMP);
							if(item.getValue() != null) {
								if(( item.getValue().equals(event.getStartDate()) || 
									 item.getValue().after(event.getStartDate())) &&
									(item.getValue().before(event.getEndDate()) ||
									item.getValue().equals(event.getEndDate())
								)) {
									Property<Float> value = cnt.getContainerProperty(itemId, Timeline.PropertyId.VALUE);
									if(graphMinValue > value.getValue()) {
										graphMinValue = value.getValue();
									}
									if(graphMaxValue < value.getValue()) {
										graphMaxValue = value.getValue();
									}
								}
							}
						}
					}
					Float[] extremes = checkExtremeValues(new Float[] {graphMinValue, graphMaxValue});
					timeline.setVerticalAxisRange(extremes[0], extremes[1]);
				}
			}
		});
		return timeline;
	}
	
	/**
	 * add one point to graph data
	 * 
	 * @param c IndexedContainer to store data
	 * @param samptime java.time.LocalDateTime
	 * @param value float
	 */
	@SuppressWarnings("unchecked")
	boolean addItem(IndexedContainer c, LocalDateTime samptime, float value){		
		try {
			if (!Float.isNaN(value)) { // tämä toimii muuten mutta lämpötilakuvaaja muuttuu pisteiksi viivan sijaan
				Item item = c.addItem(samptime);
				item.getItemProperty(Timeline.PropertyId.TIMESTAMP).setValue(samptime == null ? null : Date.from(samptime.atZone(ZoneId.systemDefault()).toInstant()));
				item.getItemProperty(Timeline.PropertyId.VALUE).setValue(value);
			}
			return true; //onnistui
		} catch (java.lang.NullPointerException e) {
			if (null == samptime) {
				System.err.println("samptime was null: kesäaika");
			} /*else {
				//System.err.println("value was null, samptime:"+ samptime);
			}*/
		}
		return false; //failed
	}
	
	/**
	 * add one point to graph data
	 * 
	 * @param c IndexedContainer to store data
	 * @param samptime java.util.Date
	 * @param value float
	 */
	@SuppressWarnings("unchecked")
	boolean addItem(IndexedContainer c, java.util.Date samptime, float value){		
		try {
			if (!Float.isNaN(value)) { // tämä toimii muuten mutta lämpötilakuvaaja muuttuu pisteiksi viivan sijaan
				Item item = c.addItem(samptime);
				item.getItemProperty(Timeline.PropertyId.TIMESTAMP).setValue(samptime);
				item.getItemProperty(Timeline.PropertyId.VALUE).setValue(value);
			}
			return true; //onnistui
		} catch (java.lang.NullPointerException e) {
			if (null == samptime) {
				System.err.println("samptime was null: kesäaika");
			} /*else {
				//System.err.println("value was null, samptime:"+ samptime);
			}*/
		}
		return false; //failed
	}

	/**
	 * 
	 * @param entityClass database table as liferay service builder generated
	 * @param start java.util.Date
	 * @param end java.util.Date
	 * @param property String Database columm name: only IS NOT NULL values returned
	 * @return List of data from database
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> getDataInRange(Class<T> entityClass, Date start, Date end, String property) {
		if (entityClass.equals(Varriometa.class)) {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(entityClass)
					.add(RestrictionsFactoryUtil.ge("SAMPTIME", start))
					.add(RestrictionsFactoryUtil.le("SAMPTIME", end));
			if (null != property) {
				query.add(RestrictionsFactoryUtil.isNotNull(property));
			}
			try {
				return VarriometaLocalServiceUtil.dynamicQuery(query);
			} catch (SystemException e) {
				System.err.println("SystemException: "+e);	
			}
		} else { 	
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(entityClass)
					.add(RestrictionsFactoryUtil.ge("samptime", start))
					.add(RestrictionsFactoryUtil.le("samptime", end));
			if (null != property) {
				query.add(RestrictionsFactoryUtil.isNotNull(property));
			}
			try {
				if (entityClass.equals(Kumpulameta.class)) {
					return KumpulametaLocalServiceUtil.dynamicQuery(query);
				} else {		
					return HydemetaLocalServiceUtil.dynamicQuery(query);
				}
			} catch (SystemException e) {
				System.err.println("SystemException: "+e);	
			}
		}
		return null;
	}
	/**
	 * Tallentaa datan containeriin
	 * 
	 * @param c IndexedContainer to set variable values: piirrettäväkäyrä
	 * @param table String database table name
	 * @param property String database column name
	 */
	public boolean setDataInRange(IndexedContainer c, String table, String property) {
		float[][] fa = dbdata.getFtaulu(table);
		LocalDateTime[] timestamps = dbdata.getTimestamps(table);
		String[] labels = dbdata.getLabels(table);
		if (null != labels) {
			int j = 0;
			while (!labels[j].equals(property)) {
				j++;
				if (j > fa.length) {
					return false; // ei löytynyt edes saraketta
				}
			}		
			boolean löytyi = false; //löytyykö sarakkkesta dataa?
			for (int i = 0; i < fa[j].length; i++) {
				if (addItem(c, timestamps[i], fa[j][i])) {
					löytyi = true;
				}
			}
			return löytyi;
		} else { // labels == null
			//tässä voisi tulostaa taulun ja sarakkeen, jos haluisi debugata.
			return false; 
		}
	}

	/**
	 * 
	 * @param start Date
	 * @param end Date
	 * @return Timeline vaadin chart addon
	 */
	public Timeline co(Date start, Date end) {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setLocale(Locale.ENGLISH);
		timeline.setCaption("CO₂");
		IndexedContainer containerCO2168 = createIndexedContainer();
		setDataInRange(containerCO2168, HYY_META,  "CO2168");
	
		timeline.addGraphDataSource(containerCO2168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerCO2168, "Hyytiälä 16m");
		timeline.setVerticalAxisLegendUnit(containerCO2168, "ppm");
		timeline.setGraphOutlineColor(containerCO2168, SolidColor.RED);
//		timeline.setGraphCapsVisible(containerCO2168, true);

		return timeline;
	}
	
	public Timeline glob(Date start, Date end, int stations) {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setLocale(Locale.ENGLISH);
		timeline.setCaption("Global shortwave radiation");
		IndexedContainer containerGlob = createIndexedContainer();
		IndexedContainer containerglob = createIndexedContainer();
		IndexedContainer containerGLOB = createIndexedContainer();
		setDataInRange(containerGlob, HYY_META, "Glob");
		setDataInRange(containerglob, KUM_META,  "glob");
		setDataInRange(containerGLOB, VAR_META, "GLOB");
		timeline.addGraphDataSource(containerGlob, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerGlob, "Hyytiälä");
		timeline.setGraphOutlineColor(containerGlob, SolidColor.RED);
		timeline.setVerticalAxisLegendUnit(containerGlob, "W/m²");
//		timeline.setGraphCapsVisible(containerGlob, true);

		timeline.addGraphDataSource(containerglob, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerglob, "Kumpula");
		timeline.setGraphOutlineColor(containerglob, SolidColor.BLACK);
		timeline.setVerticalAxisLegendUnit(containerglob, "W/m²");
//		timeline.setGraphCapsVisible(containerglob, true);

		timeline.addGraphDataSource(containerGLOB, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerGLOB, "Värriö");
		timeline.setGraphOutlineColor(containerGLOB, SolidColor.BLUE);
		timeline.setVerticalAxisLegendUnit(containerGLOB, "W/m²");
//		timeline.setGraphCapsVisible(containerGLOB, true);

		return timeline;
	}
	
	public Timeline RH(Date start, Date end, int stations) {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setCaption("Relative humidity");
		timeline.setLocale(Locale.ENGLISH);
	
		IndexedContainer containerRHIRGA168 = createIndexedContainer();
		IndexedContainer containerRH = createIndexedContainer();
		IndexedContainer containerHUM_RH = createIndexedContainer();
	
		setDataInRange(containerRHIRGA168, HYY_META, "RHIRGA168");
		setDataInRange(containerRH, KUM_META, "rh");
		setDataInRange(containerHUM_RH, VAR_META, "HUM_RH");

		timeline.addGraphDataSource(containerRHIRGA168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerRHIRGA168, "Hyytiälä");
		timeline.setVerticalAxisLegendUnit(containerRHIRGA168, "%");
		timeline.setGraphOutlineColor(containerRHIRGA168, SolidColor.RED);
//		timeline.setGraphCapsVisible(containerRHIRGA168, true);

		timeline.addGraphDataSource(containerRH, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerRH, "Kumpula");
		timeline.setGraphOutlineColor(containerRH, SolidColor.BLACK);
		timeline.setVerticalAxisLegendUnit(containerRH, "%");
//		timeline.setGraphCapsVisible(containerRH, true);

		timeline.addGraphDataSource(containerHUM_RH, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerHUM_RH, "Värriö");
		timeline.setGraphOutlineColor(containerHUM_RH, SolidColor.BLUE);
		timeline.setVerticalAxisLegendUnit(containerHUM_RH, "%");
//		timeline.setGraphCapsVisible(containerHUM_RH, true);

		return timeline;
	}
	
	public Timeline O3(Date start, Date end, int stations) {
		Timeline timeline = createTimeline(chartWidth, chartHeight, false);
		timeline.setCaption("Ozone");
		timeline.setLocale(Locale.ENGLISH);
	
		IndexedContainer containerO3168 = createIndexedContainer();
		//IndexedContainer containerO_3 = createIndexedContainer();
		IndexedContainer containerO3_0 = createIndexedContainer();
		//List<Hydemeta> data = getDataInRange(Hydemeta.class, start, end, "O3672");
		setDataInRange(containerO3168, HYY_META, "O3168");
		//List<Kumpulameta> data_k = getDataInRange(Kumpulameta.class, start, end, "O_3");
		setDataInRange(containerO3_0, VAR_META,  "O3_1");

		timeline.addGraphDataSource(containerO3168, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerO3168, "Hyytiälä");
		timeline.setGraphOutlineColor(containerO3168, SolidColor.RED);
		timeline.setVerticalAxisLegendUnit(containerO3168, "ppb");
//		timeline.setGraphCapsVisible(containerO3168, true);
/*
		timeline.addGraphDataSource(containerO_3, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerO_3, "Kumpula");
		timeline.setGraphOutlineColor(containerO_3, SolidColor.BLACK);
		timeline.setVerticalAxisLegendUnit(containerO_3, "ppb");
*/
		timeline.addGraphDataSource(containerO3_0, Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
		timeline.setGraphCaption(containerO3_0, "Värriö");
		timeline.setGraphOutlineColor(containerO3_0, SolidColor.BLUE);
		timeline.setVerticalAxisLegendUnit(containerO3_0, "ppb");
//		timeline.setGraphCapsVisible(containerO3_0, true);
		return timeline;
	}
	
	public CssLayout plotVariables(ArrayList<String> set, Tree t, HierarchicalContainer treecontainer) {
		CssLayout rowscss = new CssLayout();	
		// now we have dl and there is the data too
		Data data = download.getData();
		try{
			int noc = data.getColumnCount(); //no of columns
			int rc = noc > MAXNOVIZ ? MAXNOVIZ : noc ;  //real colums 
			HorizontalLayout[] rows = new HorizontalLayout[rc];
			IndexedContainer[] ica = new IndexedContainer[rc];
			for (int i = 0; i < rc; i++) {
				ica[i] = createIndexedContainer();
			}
			String labels[] = new String[rc];
			int l = 0; // lkm laskuri koti rc:tä
			Iterator<String> iter = data.tableset.iterator();
			while( iter.hasNext() && (l < rc)) {
				String taulunnimi = iter.next();
				float[][] faa = data.getFtaulu(taulunnimi);
				LocalDateTime[] timestamps = data.getTimestamps(taulunnimi);
				int sarakkeet = faa.length;				
				int ehto = sarakkeet < rc-l ?  sarakkeet : rc-l;
				String Columnnames[] = data.getLabels(taulunnimi);
				if (null == Columnnames) {
					System.out.println("Ohitetaan ajanjaksolla tyhjä taulu: "+taulunnimi);
				} else {
					for (int i = 0; i < ehto ; i++) {
						try {
							labels[l+i] = Columnnames[i];
							int rivit = timestamps.length;
							resetExtremeValues();
							for (int j = 0; j < rivit; j++) {
								if(!addItem(ica[i+l], timestamps[j], faa[i][j])) {
									System.err.println("FailedtoaddItem:l="+l+", i="+i+", sarakkeet="+sarakkeet+", rivi="+j);
								}
							}
						} catch (  java.lang.ArrayIndexOutOfBoundsException e) {
							System.err.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
							System.err.println("l="+l+", i="+i+", sarakkeet="+sarakkeet+", rivit="+timestamps.length);
						}
					}
					l = l + ehto;
				}
			}
			Timeline[] tla = new Timeline[rc];
			for (int i = 0; i < rc; i++) {
				if (rc != 1) {
					tla[i] = createTimeline(chartWidth, chartHeight, true);
				} else {
					tla[i] = createTimeline(650, 600, true);
				}
				// vrealname = muuttujan nimi. Puun alkiot ovat muuttuja:taulu muotoa
				String variab = labels[i];
				String vrealname = Data.clean(variab);
				if(vrealname == null) {
					Notification notif = new Notification("Unable to visualise one or more variables", "Please select variables that are available");
					notif.show(UI.getCurrent().getPage());
					continue;
				}
				
				String stationLong = "";
				Item v = null;
				String varReadableName = "";
				for (String variabsta:set){
					String[] parts = variabsta.split(":");
					String vartree = parts[0];
					if (vartree.equals(vrealname)){
						v = treecontainer.getItem(variabsta);
						stationLong = Station.getStationDisplayName(parts[1]);
						varReadableName = t.getItemCaption(variabsta);
					}
				}
				
				Object u = null;
				try {
					u = v.getItemProperty(Station.UNIT).getValue();
				} catch (java.lang.NullPointerException e) {
					System.err.println("Null pointer Exception " + variab);
				}
				tla[i].setCaption(stationLong + ": " + varReadableName);
				
				tla[i].addGraphDataSource(ica[i], Timeline.PropertyId.TIMESTAMP, Timeline.PropertyId.VALUE);
				tla[i].setVerticalAxisLegendUnit(ica[i], String.valueOf(u));
				
				tla[i].setGraphCaption(ica[i], vrealname);
				
				tla[i].setGraphOutlineColor(ica[i], SolidColor.RED);
				tla[i].setLocale(Locale.ENGLISH);

				tla[i].setGraphCapsVisible(ica[i], true);
		        
		        rows[i] = new HorizontalLayout();
		        rows[i].setMargin(true);
		        rows[i].setSpacing(true);
		        rows[i].setResponsive(true);
		        rows[i].setSizeUndefined();
		        tla[i].setResponsive(true);
				rows[i].addComponent(tla[i]);
				rowscss.addComponent(rows[i]);
			}

		} catch (java.lang.NullPointerException e) {
			if (null == data) {
				System.err.println("Null pointer Exception because data was null");
			} else {
				System.err.println("datan rivit: "+ data.getRowAmount());
				e.printStackTrace();
			}
		} catch (  java.lang.ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: ");
			e.printStackTrace();
		}
	// } //else no dl
		
	return rowscss;
}
	public CssLayout createVizLayout() {
		CssLayout chartsHL = new CssLayout();
		return chartsHL;		
	}
	
	public int getChartWidth() {
		return chartWidth;
	}

	public int getChartHeight() {
		return chartHeight;
	}


	/**
	 * Alustetaan DashBoardin=alkunäytön visualisoinnit
	 */
	static {
		tableset.add(HYY_META);
		tableset.add(KUM_META);
		tableset.add(VAR_META);
		tableset.add(HYY_EDDY233);
		finalset.add("T672"+KP+HYY_META);
		finalset.add("Tower_T_16m"+KP+KUM_META);
		finalset.add("TDRY0"+KP+VAR_META);
		finalset.add("SO2168"+KP+HYY_META);
		finalset.add("SO_2"+KP+KUM_META);
		finalset.add("SO2_1"+KP+VAR_META);
		finalset.add("NO168"+KP+HYY_META);
		finalset.add("NOx168"+KP+HYY_META);
		finalset.add("NO_1"+KP+VAR_META);
		finalset.add("NOX_1"+KP+VAR_META);
		finalset.add("Pamb0"+KP+HYY_META);
		finalset.add("p"+KP+KUM_META);
		finalset.add("P"+KP+VAR_META);
		finalset.add("WSU168"+KP+HYY_META);
		finalset.add("ws"+KP+KUM_META);
		finalset.add("WS0"+KP+VAR_META);
		finalset.add("CO2168"+KP+HYY_META);
		finalset.add("Glob"+KP+HYY_META);
		finalset.add("glob"+KP+KUM_META);
		finalset.add("GLOB"+KP+VAR_META);
		finalset.add("O3168"+KP+HYY_META);
		//finalset.add("O_3"+KP+KUM_META);
		finalset.add("O3_1"+KP+VAR_META);
		finalset.add("RHIRGA168"+KP+HYY_META);
		finalset.add("rh"+KP+KUM_META);
		finalset.add("HUM_RH"+KP+VAR_META);	
		finalset.add("F_c"+KP+HYY_EDDY233);
		finalset.add("E"+KP+HYY_EDDY233);
		finalset.add("tsoil_A"+KP+HYY_META);
		finalset.add("ST"+KP+VAR_META);
	}
}