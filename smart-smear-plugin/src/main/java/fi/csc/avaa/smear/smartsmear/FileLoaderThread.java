package fi.csc.avaa.smear.smartsmear;

import java.io.File;
import java.util.*;

import com.vaadin.server.FileResource;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.UI;

import fi.csc.avaa.vaadin.email.NotifyingThread;

public class FileLoaderThread extends NotifyingThread {
	
	private Download dl;
	private StreamResource csvStreamRes = null;
	private StreamResource txtStreamRes = null;
	private StreamResource metaStreamRes = null;
	private boolean getCsv, getTxt, getMeta, getHdf5;
	private FileResource hdf5FileRes = null;

	public FileLoaderThread(Download dl, boolean getCsv, boolean getTxt, boolean getMeta, boolean getHdf5) {
		super();
		this.dl = dl;
		this.getCsv = getCsv;
		this.getTxt = getTxt;
		this.getMeta = getMeta;
		this.getHdf5 = getHdf5;
	}

	@Override
	public void doRun() {
		UI.getCurrent().getSession().getLockInstance().lock();
		if(dl != null) {
			if (getCsv) {
				csvStreamRes = dl.getCSV();
			}
			if (getTxt) {
				txtStreamRes = dl.getTXT();
			}
			if (getMeta) {
				Data data = dl.getData();
				Iterator<String> iter = data.tablelist.iterator();
				Map<String, List<String>> varsGroupedByTable = new HashMap<>();
				while( iter.hasNext()) {
					String table = (String) iter.next();
					List<String> tableVarNames = Arrays.asList(data.getLabels(table));
					varsGroupedByTable.put(table, tableVarNames);
				}
				metaStreamRes = dl.getMetatieto(varsGroupedByTable);
			}
			if (getHdf5) {
				File hdf5File = dl.getHDF5();
				if (hdf5File != null) {
					hdf5FileRes = new FileResource(hdf5File);
				}
			}
		}
		
		UI.getCurrent().setPollInterval(-1);
		UI.getCurrent().getSession().getLockInstance().unlock();
	}

	public StreamResource getCsvStreamRes() {
		return csvStreamRes;
	}

	public StreamResource getTxtStreamRes() {
		return txtStreamRes;
	}

	public StreamResource getMetaStreamRes() {
		return metaStreamRes;
	}

	public FileResource getHdf5FileRes() {
		return hdf5FileRes;
	}

	public boolean isGetCsv() {	return getCsv; }

	public boolean isGetTxt() { return getTxt; }

	public boolean isGetMeta() { return getMeta; }

	public boolean isGetHdf5() { return getHdf5; }
}
