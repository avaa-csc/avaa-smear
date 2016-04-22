package fi.csc.avaa.smear.smartsmear;

import java.util.Date;

import com.liferay.portal.model.PersistedModel;

public class RowCountKey implements Comparable<RowCountKey> {

	Class<? extends PersistedModel> table;
	Date fromDate;
	Date toDate;
	
	public RowCountKey(Class<? extends PersistedModel> table, Date fromDate, Date toDate) {
		this.table = table;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Class<? extends PersistedModel> getTable() {
		return table;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof RowCountKey) {
			RowCountKey comp = (RowCountKey) obj;
			if(comp.getTable().getClass() == this.getTable().getClass() && comp.getFromDate().equals(this.getFromDate()) && comp.getToDate().equals(this.getToDate())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(RowCountKey o) {
		if(o.getTable() == this.getTable() && o.getFromDate().equals(this.getFromDate()) && o.getToDate().equals(this.getToDate())) {
			return 0;
		}
		return -1;
	}
	
	

}
