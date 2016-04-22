/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import com.vaadin.data.Container;
import com.vaadin.ui.Table;

/**
 * @author jmlehtin
 *
 */
public class ResizingTable extends Table {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ResizingTable() {
		this.alwaysRecalculateColumnWidths = true;
	}

	/**
	 * @param caption
	 */
	public ResizingTable(String caption) {
		super(caption);
		this.alwaysRecalculateColumnWidths = true;
	}

	/**
	 * @param caption
	 * @param dataSource
	 */
	public ResizingTable(String caption, Container dataSource) {
		super(caption, dataSource);
		this.alwaysRecalculateColumnWidths = true;
	}

}
