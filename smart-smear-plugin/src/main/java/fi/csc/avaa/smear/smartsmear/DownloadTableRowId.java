package fi.csc.avaa.smear.smartsmear;

import fi.csc.smear.db.model.SmearVariableMetadata;

public class DownloadTableRowId {

	private SmearVariableMetadata metadata;
	private String tablename;
	
	public DownloadTableRowId(SmearVariableMetadata metadata, String tablename) {
		this.metadata = metadata;
		this.tablename = tablename;
	}

	public SmearVariableMetadata getMetadata() {
		return metadata;
	}

	public String getTablename() {
		return tablename;
	}

	
}
