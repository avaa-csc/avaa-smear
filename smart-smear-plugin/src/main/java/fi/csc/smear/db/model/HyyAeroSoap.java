package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.HyyAeroServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.HyyAeroServiceSoap
 * @generated
 */
public class HyyAeroSoap implements Serializable {
    private Date _samptime;
    private float _cn;
    private float _cn_t;
    private float _cn_p;

    public HyyAeroSoap() {
    }

    public static HyyAeroSoap toSoapModel(HyyAero model) {
        HyyAeroSoap soapModel = new HyyAeroSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setCn(model.getCn());
        soapModel.setCn_t(model.getCn_t());
        soapModel.setCn_p(model.getCn_p());

        return soapModel;
    }

    public static HyyAeroSoap[] toSoapModels(HyyAero[] models) {
        HyyAeroSoap[] soapModels = new HyyAeroSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HyyAeroSoap[][] toSoapModels(HyyAero[][] models) {
        HyyAeroSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HyyAeroSoap[models.length][models[0].length];
        } else {
            soapModels = new HyyAeroSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HyyAeroSoap[] toSoapModels(List<HyyAero> models) {
        List<HyyAeroSoap> soapModels = new ArrayList<HyyAeroSoap>(models.size());

        for (HyyAero model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HyyAeroSoap[soapModels.size()]);
    }

    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    public void setPrimaryKey(java.util.Date pk) {
        setSamptime(pk);
    }

    public Date getSamptime() {
        return _samptime;
    }

    public void setSamptime(Date samptime) {
        _samptime = samptime;
    }

    public float getCn() {
        return _cn;
    }

    public void setCn(float cn) {
        _cn = cn;
    }

    public float getCn_t() {
        return _cn_t;
    }

    public void setCn_t(float cn_t) {
        _cn_t = cn_t;
    }

    public float getCn_p() {
        return _cn_p;
    }

    public void setCn_p(float cn_p) {
        _cn_p = cn_p;
    }
}
