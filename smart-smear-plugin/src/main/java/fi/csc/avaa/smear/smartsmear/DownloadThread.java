package fi.csc.avaa.smear.smartsmear;

import java.util.Date;
import java.util.Set;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.UI;

import fi.csc.avaa.vaadin.email.NotifyingThread;

public class DownloadThread extends NotifyingThread {
	
	private Date start;
	private Date end;
	private DB db;
	private Set<String> selectedVariableIds;
	private Metadata metadata;
	private ComboBox avg;
	private ComboBox typeOfAVG;
	private String quality;
	private VariableItemStyleGenerator itemStyle;
	private Download dl;

	public DownloadThread(Date start, Date end, DB db,
			Set<String> selectedVariableIds, Metadata metadata, ComboBox avg,
			ComboBox typeOfAVG, String quality,
			VariableItemStyleGenerator itemStyle) {
		super();
		this.start = start;
		this.end = end;
		this.db = db;
		this.selectedVariableIds = selectedVariableIds;
		this.metadata = metadata;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.quality = quality;
		this.itemStyle = itemStyle;
		this.dl = null;
	}

	@Override
	public void doRun() {
		UI.getCurrent().getSession().getLockInstance().lock();
		try {
			dl = new Download(start, end, db, selectedVariableIds, metadata, avg, typeOfAVG, quality, itemStyle);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		UI.getCurrent().setPollInterval(-1);
		UI.getCurrent().getSession().getLockInstance().unlock();
	}
	
	public Download getDownload() {
		return dl;
	}
	
}
