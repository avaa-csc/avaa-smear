package fi.csc.smear.db.model;

import fi.csc.smear.db.service.persistence.SmearvariableEventPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author pj
 * @generated
 */
public class SmearvariableEventSoap implements Serializable {
    private long _eventID;
    private long _variableID;

    public SmearvariableEventSoap() {
    }

    public static SmearvariableEventSoap toSoapModel(SmearvariableEvent model) {
        SmearvariableEventSoap soapModel = new SmearvariableEventSoap();

        soapModel.setEventID(model.getEventID());
        soapModel.setVariableID(model.getVariableID());

        return soapModel;
    }

    public static SmearvariableEventSoap[] toSoapModels(
        SmearvariableEvent[] models) {
        SmearvariableEventSoap[] soapModels = new SmearvariableEventSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearvariableEventSoap[][] toSoapModels(
        SmearvariableEvent[][] models) {
        SmearvariableEventSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearvariableEventSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearvariableEventSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearvariableEventSoap[] toSoapModels(
        List<SmearvariableEvent> models) {
        List<SmearvariableEventSoap> soapModels = new ArrayList<SmearvariableEventSoap>(models.size());

        for (SmearvariableEvent model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearvariableEventSoap[soapModels.size()]);
    }

    public SmearvariableEventPK getPrimaryKey() {
        return new SmearvariableEventPK(_eventID, _variableID);
    }

    public void setPrimaryKey(SmearvariableEventPK pk) {
        setEventID(pk.eventID);
        setVariableID(pk.variableID);
    }

    public long getEventID() {
        return _eventID;
    }

    public void setEventID(long eventID) {
        _eventID = eventID;
    }

    public long getVariableID() {
        return _variableID;
    }

    public void setVariableID(long variableID) {
        _variableID = variableID;
    }
}
