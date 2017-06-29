package fi.csc.avaa.smear.smartsmear;

import com.liferay.portal.model.PersistedModel;

import java.util.Date;

public class VariableAvailabilityKey {

	private String tableName;
	private String variable;
	private Date fromDate;
	private Date toDate;
	private Boolean isQualityChecked;

	public VariableAvailabilityKey(String tableName, Date fromDate, Date toDate, String variable, Boolean isQualityChecked) {
		this.tableName = tableName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.variable = variable;
		this.isQualityChecked = isQualityChecked;
	}

	public String getTableName() { return tableName; }

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public String getVariable() { return variable; }

	public Boolean isQualityChecked() { return isQualityChecked; }

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof VariableAvailabilityKey) {
			VariableAvailabilityKey comp = (VariableAvailabilityKey) obj;
			if(comp.getTableName().equals(this.tableName) && comp.getFromDate().equals(this.fromDate) && comp.getToDate().equals(this.toDate) && comp.getVariable().equals(this.variable) && comp.isQualityChecked() == this.isQualityChecked) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.tableName.hashCode() + this.variable.hashCode() + this.fromDate.hashCode() + this.toDate.hashCode() + this.isQualityChecked.hashCode();
	}
}
