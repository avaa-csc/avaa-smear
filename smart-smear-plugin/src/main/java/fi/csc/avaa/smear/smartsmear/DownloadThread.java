package fi.csc.avaa.smear.smartsmear;

import java.io.File;
import java.util.*;

import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.UI;

import fi.csc.avaa.vaadin.email.NotifyingThread;

public class DownloadThread extends NotifyingThread {
	
	private Date start;
	private Date end;
	private DB db;
	private List<String> selectedVariableIds;
	private List<Double> selectedVariableAvailabilities;
	private Metadata metadata;
	private ComboBox avg;
	private ComboBox typeOfAVG;
	private String quality;
	public Download dl;
	private FileFormat fileFormat;

	public DownloadThread(Date start, Date end, DB db,
						  List<String> selectedVariableIds, List<Double> selectedVariableAvailabilities, Metadata metadata, ComboBox avg,
						  ComboBox typeOfAVG, String quality,
						  FileFormat fileFormat) {
		super();
		this.start = start;
		this.end = end;
		this.db = db;
		this.selectedVariableIds = selectedVariableIds;
		this.selectedVariableAvailabilities = selectedVariableAvailabilities;
		this.metadata = metadata;
		this.avg = avg;
		this.typeOfAVG = typeOfAVG;
		this.quality = quality;
		this.dl = null;
		this.fileFormat = fileFormat;
	}

	@Override
	public void doRun() {
		UI.getCurrent().getSession().getLockInstance().lock();
		if(fileFormat != FileFormat.META) {
			try {
				dl = new Download(start, end, db, selectedVariableIds, selectedVariableAvailabilities, metadata, avg, typeOfAVG, quality);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} else {
			dl = new Download(metadata, start, end);
		}
		UI.getCurrent().setPollInterval(-1);
		UI.getCurrent().getSession().getLockInstance().unlock();
	}

	public Resource getResource() {
		if(dl != null) {
			UI.getCurrent().getSession().getLockInstance().lock();
			Resource r = null;
			switch(fileFormat) {
				case CSV:
					r = dl.getCSV();
					break;
				case TXT:
					r = dl.getTXT();
					break;
				case META:
					Map<String, List<String>> varsGroupedByTable = new HashMap<>();
					for(String varId : selectedVariableIds) {
						String[] parts = varId.split(Download.MUUTTUJAEROTIN);
						String var = parts[0];
						String table = parts[1];
						if(!varsGroupedByTable.containsKey(table)) {
							varsGroupedByTable.put(table, new ArrayList<String>());
						}
						varsGroupedByTable.get(table).add(var);
					}
					r = dl.getMetatieto(varsGroupedByTable);
					break;
				case HDF5:
					File hdf5File = dl.getHDF5();
					if (hdf5File != null) {
						r = new FileResource(hdf5File);
					}
					break;
			}
			UI.getCurrent().getSession().getLockInstance().unlock();
			return r;
		}
		return null;
	}

	public enum FileFormat {
		CSV,
		TXT,
		META,
		HDF5;
	}

	public Download getDownload() {
		return dl;
	}
}