package fi.csc.avaa.smear.smartsmear;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.UI;

import fi.csc.avaa.vaadin.email.NotifyingThread;

public class FileLoaderThread extends NotifyingThread {
	
	private Download dl;
	private StreamResource csvStreamRes = null;
	private StreamResource txtStreamRes = null;
	private StreamResource metaStreamRes = null;
	private FileResource hdf5FileRes = null;

	public FileLoaderThread(Download dl) {
		super();
		this.dl = dl;
	}

	@Override
	public void doRun() {
		UI.getCurrent().getSession().getLockInstance().lock();
		csvStreamRes = dl.getCSV();
		txtStreamRes = dl.getTXT();
		metaStreamRes = dl.getMetatieto();
		File hdf5File = dl.getHDF5();
		if(hdf5File != null) {
			hdf5FileRes = new FileResource(hdf5File);	
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
	
}
