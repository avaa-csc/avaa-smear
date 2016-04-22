package fi.csc.avaa.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.smear.db.service.http.HyyCoordServiceSoap}.
 *
 * @author tkantola
 * @see fi.csc.avaa.smear.db.service.http.HyyCoordServiceSoap
 * @generated
 */
public class HyyCoordSoap implements Serializable {
    private long _arrTimeID;
    private Date _arrTime;
    private float _matTime;
    private int _year;
    private int _month;
    private int _day;
    private int _hour;
    private int _doy;
    private int _backTime;
    private float _lat100;
    private float _lon100;
    private float _alt100;
    private float _azim100;
    private float _lat250;
    private float _lon250;
    private float _alt250;
    private float _azim250;
    private float _lat500;
    private float _lon500;
    private float _alt500;
    private float _azim500;

    public HyyCoordSoap() {
    }

    public static HyyCoordSoap toSoapModel(HyyCoord model) {
        HyyCoordSoap soapModel = new HyyCoordSoap();

        soapModel.setArrTimeID(model.getArrTimeID());
        soapModel.setArrTime(model.getArrTime());
        soapModel.setMatTime(model.getMatTime());
        soapModel.setYear(model.getYear());
        soapModel.setMonth(model.getMonth());
        soapModel.setDay(model.getDay());
        soapModel.setHour(model.getHour());
        soapModel.setDoy(model.getDoy());
        soapModel.setBackTime(model.getBackTime());
        soapModel.setLat100(model.getLat100());
        soapModel.setLon100(model.getLon100());
        soapModel.setAlt100(model.getAlt100());
        soapModel.setAzim100(model.getAzim100());
        soapModel.setLat250(model.getLat250());
        soapModel.setLon250(model.getLon250());
        soapModel.setAlt250(model.getAlt250());
        soapModel.setAzim250(model.getAzim250());
        soapModel.setLat500(model.getLat500());
        soapModel.setLon500(model.getLon500());
        soapModel.setAlt500(model.getAlt500());
        soapModel.setAzim500(model.getAzim500());

        return soapModel;
    }

    public static HyyCoordSoap[] toSoapModels(HyyCoord[] models) {
        HyyCoordSoap[] soapModels = new HyyCoordSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HyyCoordSoap[][] toSoapModels(HyyCoord[][] models) {
        HyyCoordSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HyyCoordSoap[models.length][models[0].length];
        } else {
            soapModels = new HyyCoordSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HyyCoordSoap[] toSoapModels(List<HyyCoord> models) {
        List<HyyCoordSoap> soapModels = new ArrayList<HyyCoordSoap>(models.size());

        for (HyyCoord model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HyyCoordSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _arrTimeID;
    }

    public void setPrimaryKey(long pk) {
        setArrTimeID(pk);
    }

    public long getArrTimeID() {
        return _arrTimeID;
    }

    public void setArrTimeID(long arrTimeID) {
        _arrTimeID = arrTimeID;
    }

    public Date getArrTime() {
        return _arrTime;
    }

    public void setArrTime(Date arrTime) {
        _arrTime = arrTime;
    }

    public float getMatTime() {
        return _matTime;
    }

    public void setMatTime(float matTime) {
        _matTime = matTime;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int year) {
        _year = year;
    }

    public int getMonth() {
        return _month;
    }

    public void setMonth(int month) {
        _month = month;
    }

    public int getDay() {
        return _day;
    }

    public void setDay(int day) {
        _day = day;
    }

    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) {
        _hour = hour;
    }

    public int getDoy() {
        return _doy;
    }

    public void setDoy(int doy) {
        _doy = doy;
    }

    public int getBackTime() {
        return _backTime;
    }

    public void setBackTime(int backTime) {
        _backTime = backTime;
    }

    public float getLat100() {
        return _lat100;
    }

    public void setLat100(float lat100) {
        _lat100 = lat100;
    }

    public float getLon100() {
        return _lon100;
    }

    public void setLon100(float lon100) {
        _lon100 = lon100;
    }

    public float getAlt100() {
        return _alt100;
    }

    public void setAlt100(float alt100) {
        _alt100 = alt100;
    }

    public float getAzim100() {
        return _azim100;
    }

    public void setAzim100(float azim100) {
        _azim100 = azim100;
    }

    public float getLat250() {
        return _lat250;
    }

    public void setLat250(float lat250) {
        _lat250 = lat250;
    }

    public float getLon250() {
        return _lon250;
    }

    public void setLon250(float lon250) {
        _lon250 = lon250;
    }

    public float getAlt250() {
        return _alt250;
    }

    public void setAlt250(float alt250) {
        _alt250 = alt250;
    }

    public float getAzim250() {
        return _azim250;
    }

    public void setAzim250(float azim250) {
        _azim250 = azim250;
    }

    public float getLat500() {
        return _lat500;
    }

    public void setLat500(float lat500) {
        _lat500 = lat500;
    }

    public float getLon500() {
        return _lon500;
    }

    public void setLon500(float lon500) {
        _lon500 = lon500;
    }

    public float getAlt500() {
        return _alt500;
    }

    public void setAlt500(float alt500) {
        _alt500 = alt500;
    }

    public float getAzim500() {
        return _azim500;
    }

    public void setAzim500(float azim500) {
        _azim500 = azim500;
    }
}
