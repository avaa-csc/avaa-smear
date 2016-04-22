/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.Background;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.HorizontalAlign;
import com.vaadin.addon.charts.model.LayoutDirection;
import com.vaadin.addon.charts.model.ListSeries;
import com.vaadin.addon.charts.model.Pane;
import com.vaadin.addon.charts.model.PlotOptionsSeries;
import com.vaadin.addon.charts.model.PointPlacement;
import com.vaadin.addon.charts.model.Series;
import com.vaadin.addon.charts.model.Stacking;
import com.vaadin.addon.charts.model.TickmarkPlacement;
import com.vaadin.addon.charts.model.VerticalAlign;
import com.vaadin.addon.charts.model.XAxis;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.ui.Component;

import fi.csc.smear.db.model.Hydemeta;
import fi.csc.smear.db.model.Kumpulameta;
import fi.csc.smear.db.model.Varriometa;
/*import fi.csc.smear.db.service.HydemetaLocalServiceUtil;
import fi.csc.smear.db.service.KumpulametaLocalServiceUtil;
import fi.csc.smear.db.service.VarriometaLocalServiceUtil;*/

/**
 * Luokitellaan tuulensuunnst 16 luokkaan ja piirretään kauanko kustakin suunnasta on tuullut.
 * @author pj
 *
 */
public class Windrose extends Chart {
	
	private static final long serialVersionUID = 1234567890981L;
	private static final String[] ILMANSUUNNAT = {"N", "NNE", "NE", "ENE", "E", "ESE","SE", "SSE",
		"S","SSW", "SW", "WSW", "W", "WNW", "NW",  "NNW"};
	private static final int LUOKAT = 16;
	private static final float JAKAJA = 22.5f; // 360/16
	private static final Log log = LogFactoryUtil.getLog(Windrose.class);
	 
	@Override
	    public String getDescription() {
	        return "Windrose";
	    }

	private List<Series> getSisältö(Date startdate, Date enddate, Vizualisation viz) {

		int[] luokittelu = new int[LUOKAT];
		int[] prosentith = new int[LUOKAT];
		int[] prosentitk = new int[LUOKAT];
		int[] prosentitv = new int[LUOKAT];
		List<Hydemeta> dir_h = viz.getDataInRange(Hydemeta.class, startdate, enddate, "WDU168");
		List<Kumpulameta> dir_k = viz.getDataInRange(Kumpulameta.class, startdate, enddate, "Tower_WDIR_32m");
		List<Varriometa> dir_v = viz.getDataInRange(Varriometa.class, startdate, enddate, "WDIR");
		if (dir_h != null && !dir_h.isEmpty()) {
			for (Hydemeta hydedir: dir_h) { 
				luokittelu[tarkistaluokka((int)Math.floor(hydedir.getWDU168()/JAKAJA))]++;
			}
			prosentith = muutaprosenteiksi(luokittelu);

		}
		luokittelu = new int[LUOKAT];
		if (dir_k != null && !dir_k.isEmpty()) {
			for (Kumpulameta dir: dir_k) { 
				luokittelu[tarkistaluokka((int)Math.floor(dir.getTower_WDIR_32m()/JAKAJA))]++;
			}
			prosentitk = muutaprosenteiksi(luokittelu);

		}
		luokittelu = new int[LUOKAT];
		if (dir_v != null && !dir_v.isEmpty()) {
			for (Varriometa dir: dir_v) { 
				luokittelu[tarkistaluokka((int)Math.floor(dir.getWDIR()/JAKAJA))]++;
			}
			prosentitv = muutaprosenteiksi(luokittelu);

		}
		List<Series> lsa = new ArrayList<Series>();
		for (int i = 0; i < LUOKAT; i++) { 
			lsa.add( new ListSeries(ILMANSUUNNAT[i], prosentith[i],  prosentitk[i], prosentitv[i]));
		}
		return lsa;
	}

	    private int[] muutaprosenteiksi(int[] luokittelu) {
			int[] prosentit = new int[LUOKAT];
			int sum = 0;
			for (int i = 0; i < LUOKAT; i++) {
				sum += luokittelu[i];
			}
			for (int i = 0; i < LUOKAT; i++) { 
				prosentit[i] = 100*luokittelu[i]/sum; 	//lasketaan prosentit
			}
		return prosentit;
	}

	    /**
	     * Siivoaa tapaukset, joissa tuuli ei osunut luokitteluun
	     * Pohjoistuuli, 360 astetta = 0 astetta, joksi muunnamme sen.
	     * 
	     * @param luokka int
	     * @return luokka int 
	     */
	    private int tarkistaluokka(int luokka) {
	    	if (LUOKAT == luokka) {
				luokka = 0;
				return luokka;
			}
	    	if ((luokka <= -LUOKAT ) || luokka > LUOKAT ) {
	    		luokka = luokka % LUOKAT; // jakojäännös
	    		log.warn("Tuulen suunta ei ollut 0- ja 360-asteen välillä");
	    		// tässä ei ole return, koska seuraavakin täytyy tarkistaa
	    	}
	    	if (luokka < 0) { // tämä ehto toimii yhdessä edellisen kanssa
	    		luokka +=  LUOKAT; // tulkitaan -10 astetta = 350 astetta
	    		log.warn("Tuulen suunta negatiivinen");
	    	}
	    	return luokka;
	    }
	    
		protected Component getChart(Date startdate, Date enddate, Vizualisation viz) {
	        Chart chart = new Chart(ChartType.LINE);
			//Chart chart = new Chart(ChartType.COLUMN);
	        chart.setHeight(viz.getChartHeight(), Unit.PIXELS);
	        chart.setWidth(viz.getChartWidth(), Unit.PIXELS);

	        Configuration conf = chart.getConfiguration();
	        conf.getChart().setPolar(true);
	        conf.getChart().setInverted(false);
	        conf.setTitle("Wind rose");
	        //conf.setSubTitle("Source: Hyytiälä, kumpula, Värriö");

	        Pane pane = new Pane();
	        pane.setSize(viz.getChartHeight()-150);
	        conf.addPane(pane);
	        pane.setBackground(new Background[] {});

	        conf.getLegend().setReversed(false);
	        conf.getLegend().setHorizontalAlign(HorizontalAlign.RIGHT);
	        conf.getLegend().setVerticalAlign(VerticalAlign.TOP);
	        //conf.getLegend().setY(100);
	        conf.getLegend().setLayout(LayoutDirection.VERTICAL);

	        XAxis axis = new XAxis();
	        axis.setCategories("Hyytiälä", "Kumpula", "Värriö"); 
	        /*axis.setCategories("< 0.5 m/s", "0.5-2 m/s", "2-4 m/s", "4-6 m/s",
	                "6-8 m/s", "8-10 m/s", "> 10 m/s");*/
	        axis.setTickmarkPlacement(TickmarkPlacement.ON);

	        YAxis yaxs = new YAxis();
	        yaxs.setMin(0);
	        yaxs.setEndOnTick(false);
	        yaxs.setShowLastLabel(true);
	        yaxs.setTitle("Stations %");
	        yaxs.getLabels().setFormatter("function() {return this.value + '%';}");
	        conf.addxAxis(axis);
	        conf.addyAxis(yaxs);

	        conf.getTooltip().setValueSuffix("%");

	        PlotOptionsSeries series = new PlotOptionsSeries();
	        series.setStacking(Stacking.NORMAL);
	        series.setShadow(false);
	        series.setGroupPadding(0);
	        series.setPointPlacement(PointPlacement.ON);
	        conf.setPlotOptions(series);
	        conf.setSeries(getSisältö(startdate, enddate, viz));
	        /*conf.setSeries(n, nne, ne, ene, e, ese, se, sse, s, ssw, sw, wsw, w,
	                wnw, nw, nnw);*/
	        // transpose data "matrix"
	        conf.reverseListSeries();

	        chart.drawChart(conf);

	        return chart;
	    }
}
