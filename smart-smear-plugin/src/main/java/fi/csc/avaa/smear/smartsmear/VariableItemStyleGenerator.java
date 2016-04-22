/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.liferay.portal.model.PersistedModel;
import com.vaadin.shared.Position;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.ItemStyleGenerator;
import com.vaadin.ui.UI;

import fi.csc.smear.db.model.Hyde_eddy233;
import fi.csc.smear.db.model.Hyde_eddytow;
import fi.csc.smear.db.model.Hydemeta;
import fi.csc.smear.db.model.HyyAero;
import fi.csc.smear.db.model.HyyDMPS;
import fi.csc.smear.db.model.Hyy_eddysub;
import fi.csc.smear.db.model.KumpulaDMPS;
import fi.csc.smear.db.model.Kumpula_eddy;
import fi.csc.smear.db.model.Kumpulameta;
import fi.csc.smear.db.model.Sii1eddy;
import fi.csc.smear.db.model.Sii1meta;
import fi.csc.smear.db.model.Sii2eddy;
import fi.csc.smear.db.model.Sii2meta;
import fi.csc.smear.db.model.Towermeta;
import fi.csc.smear.db.model.VarDMPS;
import fi.csc.smear.db.model.Vareddy;
import fi.csc.smear.db.model.Varrio_tree;
import fi.csc.smear.db.model.Varriometa;
import fi.csc.smear.db.model.kvjEddy;

/**
 * Used for styling Smart Smear variable tree items based on the variable quality.
 * 
 * @author jmlehtin
 *
 */
public class VariableItemStyleGenerator implements ItemStyleGenerator {

	private static final long serialVersionUID = 1L;
	//private Button varExistButton;
	private CheckBox varExistButton;
	private boolean showAvailability = false;
	private PopupDateField fromDate, toDate;
	private ComboBox qualitySelection;
	private List<Object> visibleItemIds;
	private Tree tree;
	private DB db; // = new DB();
	public static final int MAX_AVAILABILITY_PERIOD = 180;
	private Map<RowCountKey, Integer> totalRowCountInPeriod;
	
	public VariableItemStyleGenerator(DB db,PopupDateField fromDate, PopupDateField toDate, List<Object> visibleItemIds, Tree tree, ComboBox qualitySelection) {
		this.db = db;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.visibleItemIds = visibleItemIds;
		this.tree = tree;
		this.qualitySelection = qualitySelection;
		this.totalRowCountInPeriod = new TreeMap<>();
		createVarExistSelection();
	}
	
	public VariableItemStyleGenerator(DB db,PopupDateField fromDate, PopupDateField toDate, List<Object> visibleItemIds, ComboBox qualitySelection) {
		this.db = db;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.qualitySelection = qualitySelection;
		this.totalRowCountInPeriod = new TreeMap<>();
	}
	
	public void createNewTotalRowCount(RowCountKey key, int totalRowAmount) {
		totalRowCountInPeriod.put(key, totalRowAmount);
	}
	
	@Override
	public String getStyle(Tree source, Object itemId) {
		if(visibleItemIds.contains(itemId)) {
			if(checkVarExistence()) {
				String[] idStrings = String.valueOf(itemId).split(":");
				String variableName = idStrings[0];
				String tableName = idStrings[1];
				Class<? extends PersistedModel> tableClass = getTableClass(tableName);
				double availabilityPercent = 0.0d;
				if(checkVarQuality()) {
					availabilityPercent = getVariableExistencePercentInPeriod(variableName, tableName, tableClass, true);
				} else {
					availabilityPercent = getVariableExistencePercentInPeriod(variableName, tableName, tableClass, false);
				}
				if(availabilityPercent == 0.0d) {
					return "red";
				} else if(availabilityPercent > 0.0d && availabilityPercent < 0.5d) {
					return "yellow";
				} else if(availabilityPercent >= 0.5d && availabilityPercent <= 1.0d) {
					return "green";
				} else {
					return "gray";
				}
			} else {
				return "";
			}
		} else {
			return "";
		}
	}
	
	public boolean checkVarExistence() {
		return showAvailability;
	}
	
	public void unselectVarExistenceButton() {
		varExistButton.setCaption("Show data availability");
		showAvailability = false;
	}
	
	public boolean checkVarQuality() {
		return SmearViewUI.CHECKED.equals(qualitySelection.getValue());
	}
	
	/**
	 * Create checkbox for switching on/off the checking of the variable availability
	 * 
	 */
	private void createVarExistSelection() {
		showAvailability = false;
		//varExistButton = new Button("<b>Show data availability</b>");
		varExistButton = new CheckBox("Show data availability");
		//varExistButton.setHtmlContentAllowed(true);
		varExistButton.addStyleName("variable-availability-selection link");
		//varExistButton.setIcon(FontAwesome.QUESTION_CIRCLE);
		varExistButton.setDescription("<p>Display how much data a variable on scale from 0.0 to 1.0 has in the given time period. Maximum period where availability can be displayed is 180 days. Recommended usage is not to have too many expanded tree branches when checking for the availability as this can slow the application down unnecessarily.</p><ul><li style='color: red'>0.0</li><li style='color: rgb(210, 204, 79);'>&lt; 0.5</li><li style='color: #36b645;'>&gt;= 0.5</li></ul>");
		varExistButton.addValueChangeListener(e -> {
			if(SmearViewUI.isStartDateBeforeEndDate(fromDate, toDate)) {
				if(SmearViewUI.dateRangeExceedsMaxPeriod(fromDate, toDate, MAX_AVAILABILITY_PERIOD)) {
					Notification notif = new Notification("Availability not shown", "Not available for over " + MAX_AVAILABILITY_PERIOD + " days", Notification.Type.ASSISTIVE_NOTIFICATION);
					notif.setPosition(Position.MIDDLE_CENTER);
					notif.setDelayMsec(1000);
					notif.show(UI.getCurrent().getPage());
					varExistButton.setValue(false);
				} else {
		    		//CheckBox btn = e.getCheckBox();
					//Button btn = e.getButton();
		    		showAvailability = !showAvailability;
		    		if(showAvailability) {
		    			//varExistButton.setCaption("Hide data availability");
		    			//btn.setCaption("<b>Hide data availability</b>");
		    		} else {
		    			varExistButton.setCaption("Show data availability");
		    			//btn.setCaption("<b>Show data availability</b>");
		    		}
		    		inspect();
				}
			} else {
				varExistButton.setValue(false);
			}
    	});
	}
	
	//public Button getVariableExistButton() {
	public CheckBox getVariableExistButton() {
		return varExistButton;
	}

	/**
	 * Get the amount of non null variable rows compared to the total amount of rows in the time period
	 * 
	 * @param itemId
	 * @return
	 */
	public double getVariableExistencePercentInPeriod(String variableName, String tableName, Class<? extends PersistedModel> tableClass, boolean considerQuality) {
		int varRows = 0;
		
		if (tableClass.equals(Varriometa.class) ||
			tableClass.equals(Varrio_tree.class)) {
			if(considerQuality) {
				varRows = db.getNonNullAndQualityVariableRowAmountInPeriod(tableName, variableName, "samptime", fromDate.getValue().getTime(), "samptime", toDate.getValue().getTime());
			} else {
				varRows = db.getNonNullVariableRowAmountInPeriod(tableName, variableName, "samptime", fromDate.getValue().getTime(), "samptime", toDate.getValue().getTime());
			}
		} else {
			if(considerQuality) {
				varRows = db.getNonNullAndQualityVariableRowAmountInPeriod(tableName, variableName, "SAMPTIME", fromDate.getValue().getTime(), "SAMPTIME", toDate.getValue().getTime());
			} else {
				varRows = db.getNonNullVariableRowAmountInPeriod(tableName, variableName, "SAMPTIME", fromDate.getValue().getTime(), "SAMPTIME", toDate.getValue().getTime());
			}
		}
		
		if(varRows >= 0) {
			Integer totRows = getTotalRowsInPeriod(tableName, tableClass);
			if(totRows != null && totRows > 0) {
				return new Double(varRows) / new Double(totRows);
			}
			
		}
		return 0.0d;
	}
	
	public double getVariableExistenceQualityPercentInPeriod(String variableName, String tableName, Class<? extends PersistedModel> tableClass) {
		int varRows = 0;
		
		if (tableClass.equals(Varriometa.class) ||
			tableClass.equals(Varrio_tree.class)) {
				varRows = db.getNonNullAndQualityVariableRowAmountInPeriod(tableName, variableName, "samptime", fromDate.getValue().getTime(), "samptime", toDate.getValue().getTime());
		} else {
				varRows = db.getNonNullAndQualityVariableRowAmountInPeriod(tableName, variableName, "SAMPTIME", fromDate.getValue().getTime(), "SAMPTIME", toDate.getValue().getTime());
		}
		
		if(varRows >= 0) {
			Integer totRows = db.getNonNullVariableRowAmountInPeriod(tableName, variableName, "samptime", fromDate.getValue().getTime(), "samptime", toDate.getValue().getTime());
			if(totRows != null && totRows > 0) {
				return new Double(varRows) / new Double(totRows);
			}
		}
		return 0.0d;
	}
	
	public Integer getTotalRowsInPeriod(String stationName,
			Class<? extends PersistedModel> tableClass) {
		
		RowCountKey key = new RowCountKey(tableClass, fromDate.getValue(), toDate.getValue());
		Integer totRowCount = totalRowCountInPeriod.get(key);
		if(totRowCount == null) {
			if (tableClass.equals(Varriometa.class) ||
				tableClass.equals(Varrio_tree.class)) {
				totRowCount = db.getTotalRowsInPeriod(stationName, "samptime", fromDate.getValue().getTime(), "samptime", toDate.getValue().getTime());
			} else {
				totRowCount = db.getTotalRowsInPeriod(stationName, "SAMPTIME", fromDate.getValue().getTime(), "SAMPTIME", toDate.getValue().getTime());
			}
			createNewTotalRowCount(key, totRowCount);
		}
		return totalRowCountInPeriod.get(key);
	}
	
	/**
	 * Mapping between table names and table classes
	 * 
	 * @param stationName
	 * @return
	 */
	public static Class<? extends PersistedModel> getTableClass(String stationName) {
		if(Station.TAULUT[0][0].equals(stationName)) {
			return Hydemeta.class;
		} else if(Station.TAULUT[0][1].equals(stationName)) {
			return Hyde_eddy233.class;
		} else if(Station.TAULUT[0][2].equals(stationName)) {
			return Hyde_eddytow.class;
		} else if(Station.TAULUT[0][3].equals(stationName)) {
			return Hyy_eddysub.class;
		} else if(Station.TAULUT[0][4].equals(stationName)) {
			return HyyDMPS.class;
		} else if(Station.TAULUT[0][5].equals(stationName)) {
			return HyyAero.class;
		} else if(Station.TAULUT[1][0].equals(stationName)) {
			return Kumpulameta.class;
		} else if(Station.TAULUT[1][1].equals(stationName)) {
			return Kumpula_eddy.class;
		} else if(Station.TAULUT[1][2].equals(stationName)) {
			return KumpulaDMPS.class;
		} else if(Station.TAULUT[2][0].equals(stationName)) {
			return Varriometa.class;
		} else if(Station.TAULUT[2][1].equals(stationName)) {
			return Varrio_tree.class;
		} else if(Station.TAULUT[2][2].equals(stationName)) {
			return Vareddy.class;
		} else if(Station.TAULUT[2][3].equals(stationName)) {
			return VarDMPS.class;
		} else if(Station.TAULUT[3][0].equals(stationName)) {
			return Sii1meta.class;
		} else if(Station.TAULUT[3][1].equals(stationName)) {
			return Sii1eddy.class;
		} else if(Station.TAULUT[4][0].equals(stationName)) {
			return Sii2meta.class;
		} else if(Station.TAULUT[4][1].equals(stationName)) {
			return Sii2eddy.class;
		} else if(Station.TAULUT[5][0].equals(stationName)) {
			return Towermeta.class;
		} else if(Station.TAULUT[6][0].equals(stationName)) {
			return kvjEddy.class;
		} else {
			return null;
		}
	}
	
	public void inspect() {
		if(SmearViewUI.dateRangeExceedsMaxPeriod(fromDate, toDate, MAX_AVAILABILITY_PERIOD)) {
			String notifCaption = null, notifText = null;
			unselectVarExistenceButton();
			if(checkVarExistence() && checkVarQuality()) {
				notifCaption = "Availability & quality not shown";
				notifText = "Not available for over " + MAX_AVAILABILITY_PERIOD + " days";
			} else if(checkVarExistence()) {
				notifCaption = "Availability not shown";
				notifText = "Not available for over " + MAX_AVAILABILITY_PERIOD + " days";
			}
			if(notifCaption != null) {
				Notification notif = new Notification(notifCaption, notifText, Notification.Type.ASSISTIVE_NOTIFICATION);
				notif.setPosition(Position.MIDDLE_CENTER);
				notif.setDelayMsec(1000);
				notif.show(UI.getCurrent().getPage());
			}
		}
		tree.markAsDirty();
	}
	
}
