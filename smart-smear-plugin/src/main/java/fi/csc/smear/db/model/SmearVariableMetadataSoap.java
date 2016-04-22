package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearVariableMetadataServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearVariableMetadataServiceSoap
 * @generated
 */
public class SmearVariableMetadataSoap implements Serializable {
    private long _variableID;
    private long _tableID;
    private String _variable;
    private String _description;
    private String _unit;
    private String _title;
    private String _source;
    private Date _period_start;
    private Date _period_end;
    private long _coverage;
    private String _rights;
    private boolean _mandatory;
    private boolean _derivative;
    private Date _vtimestamp;
    private String _category;

    public SmearVariableMetadataSoap() {
    }

    public static SmearVariableMetadataSoap toSoapModel(
        SmearVariableMetadata model) {
        SmearVariableMetadataSoap soapModel = new SmearVariableMetadataSoap();

        soapModel.setVariableID(model.getVariableID());
        soapModel.setTableID(model.getTableID());
        soapModel.setVariable(model.getVariable());
        soapModel.setDescription(model.getDescription());
        soapModel.setUnit(model.getUnit());
        soapModel.setTitle(model.getTitle());
        soapModel.setSource(model.getSource());
        soapModel.setPeriod_start(model.getPeriod_start());
        soapModel.setPeriod_end(model.getPeriod_end());
        soapModel.setCoverage(model.getCoverage());
        soapModel.setRights(model.getRights());
        soapModel.setMandatory(model.getMandatory());
        soapModel.setDerivative(model.getDerivative());
        soapModel.setVtimestamp(model.getVtimestamp());
        soapModel.setCategory(model.getCategory());

        return soapModel;
    }

    public static SmearVariableMetadataSoap[] toSoapModels(
        SmearVariableMetadata[] models) {
        SmearVariableMetadataSoap[] soapModels = new SmearVariableMetadataSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearVariableMetadataSoap[][] toSoapModels(
        SmearVariableMetadata[][] models) {
        SmearVariableMetadataSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearVariableMetadataSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearVariableMetadataSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearVariableMetadataSoap[] toSoapModels(
        List<SmearVariableMetadata> models) {
        List<SmearVariableMetadataSoap> soapModels = new ArrayList<SmearVariableMetadataSoap>(models.size());

        for (SmearVariableMetadata model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearVariableMetadataSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _variableID;
    }

    public void setPrimaryKey(long pk) {
        setVariableID(pk);
    }

    public long getVariableID() {
        return _variableID;
    }

    public void setVariableID(long variableID) {
        _variableID = variableID;
    }

    public long getTableID() {
        return _tableID;
    }

    public void setTableID(long tableID) {
        _tableID = tableID;
    }

    public String getVariable() {
        return _variable;
    }

    public void setVariable(String variable) {
        _variable = variable;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getUnit() {
        return _unit;
    }

    public void setUnit(String unit) {
        _unit = unit;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getSource() {
        return _source;
    }

    public void setSource(String source) {
        _source = source;
    }

    public Date getPeriod_start() {
        return _period_start;
    }

    public void setPeriod_start(Date period_start) {
        _period_start = period_start;
    }

    public Date getPeriod_end() {
        return _period_end;
    }

    public void setPeriod_end(Date period_end) {
        _period_end = period_end;
    }

    public long getCoverage() {
        return _coverage;
    }

    public void setCoverage(long coverage) {
        _coverage = coverage;
    }

    public String getRights() {
        return _rights;
    }

    public void setRights(String rights) {
        _rights = rights;
    }

    public boolean getMandatory() {
        return _mandatory;
    }

    public boolean isMandatory() {
        return _mandatory;
    }

    public void setMandatory(boolean mandatory) {
        _mandatory = mandatory;
    }

    public boolean getDerivative() {
        return _derivative;
    }

    public boolean isDerivative() {
        return _derivative;
    }

    public void setDerivative(boolean derivative) {
        _derivative = derivative;
    }

    public Date getVtimestamp() {
        return _vtimestamp;
    }

    public void setVtimestamp(Date vtimestamp) {
        _vtimestamp = vtimestamp;
    }

    public String getCategory() {
        return _category;
    }

    public void setCategory(String category) {
        _category = category;
    }
}
