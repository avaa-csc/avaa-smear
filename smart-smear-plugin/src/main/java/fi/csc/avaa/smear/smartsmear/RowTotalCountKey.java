package fi.csc.avaa.smear.smartsmear;

import java.util.Date;

import com.liferay.portal.model.PersistedModel;

public class RowTotalCountKey {

	private String tableName;
	private Date fromDate;
	private Date toDate;
	
	public RowTotalCountKey(String tableName, Date fromDate, Date toDate) {
		this.tableName = tableName;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public String getTableName() {
		return tableName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof RowTotalCountKey) {
			RowTotalCountKey comp = (RowTotalCountKey) obj;
			if(comp.getTableName().equals(this.tableName) && comp.getFromDate().equals(this.fromDate) && comp.getToDate().equals(this.toDate)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.tableName.hashCode() + this.fromDate.hashCode() + this.toDate.hashCode();
	}
}
