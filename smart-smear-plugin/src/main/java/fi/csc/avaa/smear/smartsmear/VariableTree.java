package fi.csc.avaa.smear.smartsmear;

import com.vaadin.server.PaintException;
import com.vaadin.server.PaintTarget;
import com.vaadin.ui.Tree;

public class VariableTree extends Tree {

	private static final long serialVersionUID = 1L;
	private DB db;
	
	public VariableTree(String caption, DB db) {
		super(caption);
		this.db = db;
	}

	@Override
	public void paintContent(PaintTarget target) throws PaintException {
		if(db != null) {
			db.open();
			super.paintContent(target);
			db.close();
		}
		
	}

	
}
