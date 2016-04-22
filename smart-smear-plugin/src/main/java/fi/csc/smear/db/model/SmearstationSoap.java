package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.SmearstationServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.SmearstationServiceSoap
 * @generated
 */
public class SmearstationSoap implements Serializable {
    private long _stationID;
    private String _dcmipoint;
    private String _name;
    private boolean _dataAvail;

    public SmearstationSoap() {
    }

    public static SmearstationSoap toSoapModel(Smearstation model) {
        SmearstationSoap soapModel = new SmearstationSoap();

        soapModel.setStationID(model.getStationID());
        soapModel.setDcmipoint(model.getDcmipoint());
        soapModel.setName(model.getName());
        soapModel.setDataAvail(model.getDataAvail());

        return soapModel;
    }

    public static SmearstationSoap[] toSoapModels(Smearstation[] models) {
        SmearstationSoap[] soapModels = new SmearstationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SmearstationSoap[][] toSoapModels(Smearstation[][] models) {
        SmearstationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SmearstationSoap[models.length][models[0].length];
        } else {
            soapModels = new SmearstationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SmearstationSoap[] toSoapModels(List<Smearstation> models) {
        List<SmearstationSoap> soapModels = new ArrayList<SmearstationSoap>(models.size());

        for (Smearstation model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SmearstationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _stationID;
    }

    public void setPrimaryKey(long pk) {
        setStationID(pk);
    }

    public long getStationID() {
        return _stationID;
    }

    public void setStationID(long stationID) {
        _stationID = stationID;
    }

    public String getDcmipoint() {
        return _dcmipoint;
    }

    public void setDcmipoint(String dcmipoint) {
        _dcmipoint = dcmipoint;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public boolean getDataAvail() {
        return _dataAvail;
    }

    public boolean isDataAvail() {
        return _dataAvail;
    }

    public void setDataAvail(boolean dataAvail) {
        _dataAvail = dataAvail;
    }
}
