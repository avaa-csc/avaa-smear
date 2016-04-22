package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearvariableTagsServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearvariableTagsServiceSoap
 * @generated
 */
public class SmearvariableTagsSoap implements Serializable {
    private long _tagID;
    private long _variableID;

    public SmearvariableTagsSoap() {
    }

    public static SmearvariableTagsSoap toSoapModel(SmearvariableTags model) {
        SmearvariableTagsSoap soapModel = new SmearvariableTagsSoap();

        soapModel.setTagID(model.getTagID());
        soapModel.setVariableID(model.getVariableID());

        return soapModel;
    }

    public static SmearvariableTagsSoap[] toSoapModels(
        SmearvariableTags[] models) {
        SmearvariableTagsSoap[] soapModels = new SmearvariableTagsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearvariableTagsSoap[][] toSoapModels(
        SmearvariableTags[][] models) {
        SmearvariableTagsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearvariableTagsSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearvariableTagsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearvariableTagsSoap[] toSoapModels(
        List<SmearvariableTags> models) {
        List<SmearvariableTagsSoap> soapModels = new ArrayList<SmearvariableTagsSoap>(models.size());

        for (SmearvariableTags model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearvariableTagsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _variableID;
    }

    public void setPrimaryKey(long pk) {
        setVariableID(pk);
    }

    public long getTagID() {
        return _tagID;
    }

    public void setTagID(long tagID) {
        _tagID = tagID;
    }

    public long getVariableID() {
        return _variableID;
    }

    public void setVariableID(long variableID) {
        _variableID = variableID;
    }
}
