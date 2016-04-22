package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearTableMetadataServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearTableMetadataServiceSoap
 * @generated
 */
public class SmearTableMetadataSoap implements Serializable {
    private long _tableID;
    private String _identifier;
    private String _title;
    private String _spatial_coverage;
    private String _name;
    private Date _ttimestamp;
    private int _period;

    public SmearTableMetadataSoap() {
    }

    public static SmearTableMetadataSoap toSoapModel(SmearTableMetadata model) {
        SmearTableMetadataSoap soapModel = new SmearTableMetadataSoap();

        soapModel.setTableID(model.getTableID());
        soapModel.setIdentifier(model.getIdentifier());
        soapModel.setTitle(model.getTitle());
        soapModel.setSpatial_coverage(model.getSpatial_coverage());
        soapModel.setName(model.getName());
        soapModel.setTtimestamp(model.getTtimestamp());
        soapModel.setPeriod(model.getPeriod());

        return soapModel;
    }

    public static SmearTableMetadataSoap[] toSoapModels(
        SmearTableMetadata[] models) {
        SmearTableMetadataSoap[] soapModels = new SmearTableMetadataSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearTableMetadataSoap[][] toSoapModels(
        SmearTableMetadata[][] models) {
        SmearTableMetadataSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearTableMetadataSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearTableMetadataSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearTableMetadataSoap[] toSoapModels(
        List<SmearTableMetadata> models) {
        List<SmearTableMetadataSoap> soapModels = new ArrayList<SmearTableMetadataSoap>(models.size());

        for (SmearTableMetadata model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearTableMetadataSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _tableID;
    }

    public void setPrimaryKey(long pk) {
        setTableID(pk);
    }

    public long getTableID() {
        return _tableID;
    }

    public void setTableID(long tableID) {
        _tableID = tableID;
    }

    public String getIdentifier() {
        return _identifier;
    }

    public void setIdentifier(String identifier) {
        _identifier = identifier;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getSpatial_coverage() {
        return _spatial_coverage;
    }

    public void setSpatial_coverage(String spatial_coverage) {
        _spatial_coverage = spatial_coverage;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getTtimestamp() {
        return _ttimestamp;
    }

    public void setTtimestamp(Date ttimestamp) {
        _ttimestamp = ttimestamp;
    }

    public int getPeriod() {
        return _period;
    }

    public void setPeriod(int period) {
        _period = period;
    }
}
