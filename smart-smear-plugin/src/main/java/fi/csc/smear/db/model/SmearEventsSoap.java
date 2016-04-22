package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearEventsServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearEventsServiceSoap
 * @generated
 */
public class SmearEventsSoap implements Serializable {
    private long _eventID;
    private String _event_type;
    private String _event;
    private String _who;
    private Date _period_start;
    private Date _period_end;
    private Date _etimestamp;

    public SmearEventsSoap() {
    }

    public static SmearEventsSoap toSoapModel(SmearEvents model) {
        SmearEventsSoap soapModel = new SmearEventsSoap();

        soapModel.setEventID(model.getEventID());
        soapModel.setEvent_type(model.getEvent_type());
        soapModel.setEvent(model.getEvent());
        soapModel.setWho(model.getWho());
        soapModel.setPeriod_start(model.getPeriod_start());
        soapModel.setPeriod_end(model.getPeriod_end());
        soapModel.setEtimestamp(model.getEtimestamp());

        return soapModel;
    }

    public static SmearEventsSoap[] toSoapModels(SmearEvents[] models) {
        SmearEventsSoap[] soapModels = new SmearEventsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearEventsSoap[][] toSoapModels(SmearEvents[][] models) {
        SmearEventsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearEventsSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearEventsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearEventsSoap[] toSoapModels(List<SmearEvents> models) {
        List<SmearEventsSoap> soapModels = new ArrayList<SmearEventsSoap>(models.size());

        for (SmearEvents model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearEventsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _eventID;
    }

    public void setPrimaryKey(long pk) {
        setEventID(pk);
    }

    public long getEventID() {
        return _eventID;
    }

    public void setEventID(long eventID) {
        _eventID = eventID;
    }

    public String getEvent_type() {
        return _event_type;
    }

    public void setEvent_type(String event_type) {
        _event_type = event_type;
    }

    public String getEvent() {
        return _event;
    }

    public void setEvent(String event) {
        _event = event;
    }

    public String getWho() {
        return _who;
    }

    public void setWho(String who) {
        _who = who;
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

    public Date getEtimestamp() {
        return _etimestamp;
    }

    public void setEtimestamp(Date etimestamp) {
        _etimestamp = etimestamp;
    }
}
