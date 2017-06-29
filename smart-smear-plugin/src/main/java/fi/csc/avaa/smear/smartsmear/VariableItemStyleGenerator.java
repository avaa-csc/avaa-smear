/**
 *
 */
package fi.csc.avaa.smear.smartsmear;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.liferay.portal.model.PersistedModel;
import com.vaadin.shared.Position;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.ItemStyleGenerator;
import com.vaadin.ui.UI;

import fi.csc.smear.db.model.*;

/**
 * Used for styling Smart Smear variable tree items based on the variable quality.
 *
 * @author jmlehtin
 *
 */
public class VariableItemStyleGenerator implements ItemStyleGenerator {

	private static final long serialVersionUID = 1L;
	private CheckBox varExistButton;
	private boolean showAvailability = false;
	private PopupDateField fromDate, toDate;
	private ComboBox qualitySelection;
	private List<Object> visibleItemIds;
	private Tree tree;
	private DB db; // = new DB();
	public static final int MAX_AVAILABILITY_PERIOD = 180;
	private Map<RowTotalCountKey, Integer> totalRowCountInPeriod;
	private Map<VariableAvailabilityKey, Double> varAvailabilityInPeriod;

	public VariableItemStyleGenerator(DB db,PopupDateField fromDate, PopupDateField toDate, List<Object> visibleItemIds, Tree tree, ComboBox qualitySelection) {
		this(db, fromDate, toDate, visibleItemIds, qualitySelection);
		this.tree = tree;
		createVarExistSelection();
	}

	public VariableItemStyleGenerator(DB db,PopupDateField fromDate, PopupDateField toDate, List<Object> visibleItemIds, ComboBox qualitySelection) {
		this.db = db;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.qualitySelection = qualitySelection;
		this.visibleItemIds = visibleItemIds;
		this.totalRowCountInPeriod = new HashMap<>();
		this.varAvailabilityInPeriod = new HashMap<>();
	}

	@Override
	public String getStyle(Tree source, Object itemId) {
		if(visibleItemIds.contains(itemId)) {
			if(checkVarExistence()) {
				Double availabilityPercent = getVariableAvailabilityInPeriod(itemId);
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

	private VariableAvailabilityKey getVariableAvailabilityKey(Object varId) {
		String[] parts = String.valueOf(varId).split(Download.MUUTTUJAEROTIN);
		String variable = parts[0];
		String tableName = parts[1];
		return new VariableAvailabilityKey(tableName, this.fromDate.getValue(), this.toDate.getValue(), variable, checkVarQuality());
	}

	public List<Double> getVariableAvailabilities(List<String> variableIds, boolean isQuality) {
		List<Double> availabilities = new ArrayList<>();
		for (String varId : variableIds) {
			VariableAvailabilityKey key = getVariableAvailabilityKey(varId);
			if (varAvailabilityInPeriod.get(key) == null) {
				setVariableAvailabilitiesAsBatch(variableIds, isQuality);
			}
			availabilities.add(varAvailabilityInPeriod.get(key));
		}
		return availabilities;
	}

	private void setVariableAvailabilitiesAsBatch(List<String> variableIds, boolean considerQuality) {
		if(variableIds != null && variableIds.size() > 0) {
			Map<String, List<String>> tableGroupedVarNames = new HashMap<>();
			variableIds.stream().forEach(varId -> {
				String varName = varId.split(Download.MUUTTUJAEROTIN)[0];
				String varTable = varId.split(Download.MUUTTUJAEROTIN)[1];

				List<String> tableVars = tableGroupedVarNames.get(varTable);
				if(tableVars == null) {
					tableVars = new ArrayList<>();
					tableGroupedVarNames.put(varTable, tableVars);
				}
				tableGroupedVarNames.get(varTable).add(varName);
			});
			List<String> varNames = variableIds.stream().map(varId -> String.valueOf(varId).split(Download.MUUTTUJAEROTIN)[0]).collect(Collectors.toList());
			Map<String, Double> varAvailabilities = db.getVariableAvailabilitiesInPeriod(tableGroupedVarNames, fromDate.getValue().getTime(), toDate.getValue().getTime(), considerQuality);
			for(int i=0; i < variableIds.size(); i++) {
				String varName = varNames.get(i);
				VariableAvailabilityKey key = getVariableAvailabilityKey(variableIds.get(i));
				varAvailabilityInPeriod.put(key, varAvailabilities.get(varName));
			}
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
		varExistButton = new CheckBox("Show data availability");
		varExistButton.addStyleName("variable-availability-selection link");
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
					showAvailability = !showAvailability;
					if(!showAvailability) {
						varExistButton.setCaption("Show data availability");
					}
					inspect();
				}
			} else {
				varExistButton.setValue(false);
			}
		});
	}

	public CheckBox getVariableExistButton() {
		return varExistButton;
	}

	/**
	 * Get the amount of non null variable rows compared to the total amount of rows in the time period
	 *
	 * @return
	 */
	private double getVariableExistencePercentInPeriod(Object varId, boolean considerQuality) {
		String[] parts = String.valueOf(varId).split(Download.MUUTTUJAEROTIN);
		String variable = parts[0];
		String tableName = parts[1];
		int varRows = 0;
		if(considerQuality) {
			varRows = db.getNonNullAndQualityVariableRowAmountInPeriod(tableName, variable, fromDate.getValue().getTime(), toDate.getValue().getTime());
		} else {
			varRows = db.getNonNullVariableRowAmountInPeriod(tableName, variable, fromDate.getValue().getTime(), toDate.getValue().getTime());
		}
		if(varRows >= 0) {
			Integer totRows = getTotalRowsInPeriod(tableName);
			if(totRows != null && totRows > 0) {
				return new Double(varRows) / new Double(totRows);
			}

		}
		return 0.0d;
	}

	public Integer getTotalRowsInPeriod(String tableName) {
		RowTotalCountKey key = new RowTotalCountKey(tableName, fromDate.getValue(), toDate.getValue());
		Integer totRowCount = totalRowCountInPeriod.get(key);
		if(totRowCount == null) {
			totalRowCountInPeriod.put(key, db.getTotalRowsInPeriod(tableName, fromDate.getValue().getTime(), toDate.getValue().getTime()));
		}
		return totalRowCountInPeriod.get(key);
	}

	private Double getVariableAvailabilityInPeriod(Object varId) {
		VariableAvailabilityKey key = getVariableAvailabilityKey(varId);
//		System.out.println("Getting availability for " + key.getTableName() + " - " + key.getVariable());
		Double availability = varAvailabilityInPeriod.get(key);
		if(availability == null) {
//			System.out.println("Could not find var availability for " + varId.toString());
			long startTime = System.nanoTime();
			if(checkVarQuality()) {
				availability = getVariableExistencePercentInPeriod(varId, true);
			} else {
				availability = getVariableExistencePercentInPeriod(varId, false);
			}
			long endTime = System.nanoTime();
//			System.out.println("Calculated var availability: " + availability);
//			System.out.println("It took seconds: " + TimeUnit.NANOSECONDS.toSeconds(endTime-startTime));
			varAvailabilityInPeriod.put(key, availability);
		} else {
//			System.out.println("Found cached var availability for " + varId.toString() + " and it is " + availability);
		}
		return varAvailabilityInPeriod.get(key);
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
		} else if(Station.TAULUT[6][1].equals(stationName)) {
			return kvjMeta.class;
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
		if(tree != null) {
			tree.markAsDirty();
		}
	}

}