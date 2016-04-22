package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.VarDMPSServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.VarDMPSServiceSoap
 * @generated
 */
public class VarDMPSSoap implements Serializable {
    private Date _samptime;
    private float _t1;
    private float _t2;
    private float _p1;
    private float _p2;
    private float _rh1;
    private float _rh2;
    private float _d100e1;
    private float _d112e1;
    private float _d126e1;
    private float _d141e1;
    private float _d158e1;
    private float _d178e1;
    private float _d200e1;
    private float _d224e1;
    private float _d251e1;
    private float _d282e1;
    private float _d316e1;
    private float _d355e1;
    private float _d398e1;
    private float _d447e1;
    private float _d501e1;
    private float _d562e1;
    private float _d631e1;
    private float _d708e1;
    private float _d794e1;
    private float _d891e1;
    private float _d100e2;
    private float _d112e2;
    private float _d126e2;
    private float _d141e2;
    private float _d158e2;
    private float _d178e2;
    private float _d200e2;
    private float _d224e2;
    private float _d251e2;
    private float _d282e2;
    private float _d316e2;
    private float _d355e2;
    private float _d398e2;
    private float _d447e2;
    private float _d501e2;
    private float _d562e2;
    private float _d631e2;
    private float _d708e2;
    private float _d794e2;
    private float _d891e2;
    private float _d100e3;
    private float _d112e3;
    private float _d126e3;
    private float _d141e3;
    private float _d158e3;
    private float _d178e3;
    private float _d200e3;
    private float _d224e3;
    private float _d251e3;
    private float _d282e3;
    private float _d316e3;
    private float _d355e3;
    private float _d398e3;
    private float _d447e3;
    private float _d501e3;
    private float _d562e3;
    private float _d631e3;
    private float _d708e3;
    private float _d794e3;
    private float _d891e3;
    private float _d100e4;
    private float _tconc;

    public VarDMPSSoap() {
    }

    public static VarDMPSSoap toSoapModel(VarDMPS model) {
        VarDMPSSoap soapModel = new VarDMPSSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setT1(model.getT1());
        soapModel.setT2(model.getT2());
        soapModel.setP1(model.getP1());
        soapModel.setP2(model.getP2());
        soapModel.setRh1(model.getRh1());
        soapModel.setRh2(model.getRh2());
        soapModel.setD100e1(model.getD100e1());
        soapModel.setD112e1(model.getD112e1());
        soapModel.setD126e1(model.getD126e1());
        soapModel.setD141e1(model.getD141e1());
        soapModel.setD158e1(model.getD158e1());
        soapModel.setD178e1(model.getD178e1());
        soapModel.setD200e1(model.getD200e1());
        soapModel.setD224e1(model.getD224e1());
        soapModel.setD251e1(model.getD251e1());
        soapModel.setD282e1(model.getD282e1());
        soapModel.setD316e1(model.getD316e1());
        soapModel.setD355e1(model.getD355e1());
        soapModel.setD398e1(model.getD398e1());
        soapModel.setD447e1(model.getD447e1());
        soapModel.setD501e1(model.getD501e1());
        soapModel.setD562e1(model.getD562e1());
        soapModel.setD631e1(model.getD631e1());
        soapModel.setD708e1(model.getD708e1());
        soapModel.setD794e1(model.getD794e1());
        soapModel.setD891e1(model.getD891e1());
        soapModel.setD100e2(model.getD100e2());
        soapModel.setD112e2(model.getD112e2());
        soapModel.setD126e2(model.getD126e2());
        soapModel.setD141e2(model.getD141e2());
        soapModel.setD158e2(model.getD158e2());
        soapModel.setD178e2(model.getD178e2());
        soapModel.setD200e2(model.getD200e2());
        soapModel.setD224e2(model.getD224e2());
        soapModel.setD251e2(model.getD251e2());
        soapModel.setD282e2(model.getD282e2());
        soapModel.setD316e2(model.getD316e2());
        soapModel.setD355e2(model.getD355e2());
        soapModel.setD398e2(model.getD398e2());
        soapModel.setD447e2(model.getD447e2());
        soapModel.setD501e2(model.getD501e2());
        soapModel.setD562e2(model.getD562e2());
        soapModel.setD631e2(model.getD631e2());
        soapModel.setD708e2(model.getD708e2());
        soapModel.setD794e2(model.getD794e2());
        soapModel.setD891e2(model.getD891e2());
        soapModel.setD100e3(model.getD100e3());
        soapModel.setD112e3(model.getD112e3());
        soapModel.setD126e3(model.getD126e3());
        soapModel.setD141e3(model.getD141e3());
        soapModel.setD158e3(model.getD158e3());
        soapModel.setD178e3(model.getD178e3());
        soapModel.setD200e3(model.getD200e3());
        soapModel.setD224e3(model.getD224e3());
        soapModel.setD251e3(model.getD251e3());
        soapModel.setD282e3(model.getD282e3());
        soapModel.setD316e3(model.getD316e3());
        soapModel.setD355e3(model.getD355e3());
        soapModel.setD398e3(model.getD398e3());
        soapModel.setD447e3(model.getD447e3());
        soapModel.setD501e3(model.getD501e3());
        soapModel.setD562e3(model.getD562e3());
        soapModel.setD631e3(model.getD631e3());
        soapModel.setD708e3(model.getD708e3());
        soapModel.setD794e3(model.getD794e3());
        soapModel.setD891e3(model.getD891e3());
        soapModel.setD100e4(model.getD100e4());
        soapModel.setTconc(model.getTconc());

        return soapModel;
    }

    public static VarDMPSSoap[] toSoapModels(VarDMPS[] models) {
        VarDMPSSoap[] soapModels = new VarDMPSSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VarDMPSSoap[][] toSoapModels(VarDMPS[][] models) {
        VarDMPSSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VarDMPSSoap[models.length][models[0].length];
        } else {
            soapModels = new VarDMPSSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VarDMPSSoap[] toSoapModels(List<VarDMPS> models) {
        List<VarDMPSSoap> soapModels = new ArrayList<VarDMPSSoap>(models.size());

        for (VarDMPS model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VarDMPSSoap[soapModels.size()]);
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

    public float getT1() {
        return _t1;
    }

    public void setT1(float t1) {
        _t1 = t1;
    }

    public float getT2() {
        return _t2;
    }

    public void setT2(float t2) {
        _t2 = t2;
    }

    public float getP1() {
        return _p1;
    }

    public void setP1(float p1) {
        _p1 = p1;
    }

    public float getP2() {
        return _p2;
    }

    public void setP2(float p2) {
        _p2 = p2;
    }

    public float getRh1() {
        return _rh1;
    }

    public void setRh1(float rh1) {
        _rh1 = rh1;
    }

    public float getRh2() {
        return _rh2;
    }

    public void setRh2(float rh2) {
        _rh2 = rh2;
    }

    public float getD100e1() {
        return _d100e1;
    }

    public void setD100e1(float d100e1) {
        _d100e1 = d100e1;
    }

    public float getD112e1() {
        return _d112e1;
    }

    public void setD112e1(float d112e1) {
        _d112e1 = d112e1;
    }

    public float getD126e1() {
        return _d126e1;
    }

    public void setD126e1(float d126e1) {
        _d126e1 = d126e1;
    }

    public float getD141e1() {
        return _d141e1;
    }

    public void setD141e1(float d141e1) {
        _d141e1 = d141e1;
    }

    public float getD158e1() {
        return _d158e1;
    }

    public void setD158e1(float d158e1) {
        _d158e1 = d158e1;
    }

    public float getD178e1() {
        return _d178e1;
    }

    public void setD178e1(float d178e1) {
        _d178e1 = d178e1;
    }

    public float getD200e1() {
        return _d200e1;
    }

    public void setD200e1(float d200e1) {
        _d200e1 = d200e1;
    }

    public float getD224e1() {
        return _d224e1;
    }

    public void setD224e1(float d224e1) {
        _d224e1 = d224e1;
    }

    public float getD251e1() {
        return _d251e1;
    }

    public void setD251e1(float d251e1) {
        _d251e1 = d251e1;
    }

    public float getD282e1() {
        return _d282e1;
    }

    public void setD282e1(float d282e1) {
        _d282e1 = d282e1;
    }

    public float getD316e1() {
        return _d316e1;
    }

    public void setD316e1(float d316e1) {
        _d316e1 = d316e1;
    }

    public float getD355e1() {
        return _d355e1;
    }

    public void setD355e1(float d355e1) {
        _d355e1 = d355e1;
    }

    public float getD398e1() {
        return _d398e1;
    }

    public void setD398e1(float d398e1) {
        _d398e1 = d398e1;
    }

    public float getD447e1() {
        return _d447e1;
    }

    public void setD447e1(float d447e1) {
        _d447e1 = d447e1;
    }

    public float getD501e1() {
        return _d501e1;
    }

    public void setD501e1(float d501e1) {
        _d501e1 = d501e1;
    }

    public float getD562e1() {
        return _d562e1;
    }

    public void setD562e1(float d562e1) {
        _d562e1 = d562e1;
    }

    public float getD631e1() {
        return _d631e1;
    }

    public void setD631e1(float d631e1) {
        _d631e1 = d631e1;
    }

    public float getD708e1() {
        return _d708e1;
    }

    public void setD708e1(float d708e1) {
        _d708e1 = d708e1;
    }

    public float getD794e1() {
        return _d794e1;
    }

    public void setD794e1(float d794e1) {
        _d794e1 = d794e1;
    }

    public float getD891e1() {
        return _d891e1;
    }

    public void setD891e1(float d891e1) {
        _d891e1 = d891e1;
    }

    public float getD100e2() {
        return _d100e2;
    }

    public void setD100e2(float d100e2) {
        _d100e2 = d100e2;
    }

    public float getD112e2() {
        return _d112e2;
    }

    public void setD112e2(float d112e2) {
        _d112e2 = d112e2;
    }

    public float getD126e2() {
        return _d126e2;
    }

    public void setD126e2(float d126e2) {
        _d126e2 = d126e2;
    }

    public float getD141e2() {
        return _d141e2;
    }

    public void setD141e2(float d141e2) {
        _d141e2 = d141e2;
    }

    public float getD158e2() {
        return _d158e2;
    }

    public void setD158e2(float d158e2) {
        _d158e2 = d158e2;
    }

    public float getD178e2() {
        return _d178e2;
    }

    public void setD178e2(float d178e2) {
        _d178e2 = d178e2;
    }

    public float getD200e2() {
        return _d200e2;
    }

    public void setD200e2(float d200e2) {
        _d200e2 = d200e2;
    }

    public float getD224e2() {
        return _d224e2;
    }

    public void setD224e2(float d224e2) {
        _d224e2 = d224e2;
    }

    public float getD251e2() {
        return _d251e2;
    }

    public void setD251e2(float d251e2) {
        _d251e2 = d251e2;
    }

    public float getD282e2() {
        return _d282e2;
    }

    public void setD282e2(float d282e2) {
        _d282e2 = d282e2;
    }

    public float getD316e2() {
        return _d316e2;
    }

    public void setD316e2(float d316e2) {
        _d316e2 = d316e2;
    }

    public float getD355e2() {
        return _d355e2;
    }

    public void setD355e2(float d355e2) {
        _d355e2 = d355e2;
    }

    public float getD398e2() {
        return _d398e2;
    }

    public void setD398e2(float d398e2) {
        _d398e2 = d398e2;
    }

    public float getD447e2() {
        return _d447e2;
    }

    public void setD447e2(float d447e2) {
        _d447e2 = d447e2;
    }

    public float getD501e2() {
        return _d501e2;
    }

    public void setD501e2(float d501e2) {
        _d501e2 = d501e2;
    }

    public float getD562e2() {
        return _d562e2;
    }

    public void setD562e2(float d562e2) {
        _d562e2 = d562e2;
    }

    public float getD631e2() {
        return _d631e2;
    }

    public void setD631e2(float d631e2) {
        _d631e2 = d631e2;
    }

    public float getD708e2() {
        return _d708e2;
    }

    public void setD708e2(float d708e2) {
        _d708e2 = d708e2;
    }

    public float getD794e2() {
        return _d794e2;
    }

    public void setD794e2(float d794e2) {
        _d794e2 = d794e2;
    }

    public float getD891e2() {
        return _d891e2;
    }

    public void setD891e2(float d891e2) {
        _d891e2 = d891e2;
    }

    public float getD100e3() {
        return _d100e3;
    }

    public void setD100e3(float d100e3) {
        _d100e3 = d100e3;
    }

    public float getD112e3() {
        return _d112e3;
    }

    public void setD112e3(float d112e3) {
        _d112e3 = d112e3;
    }

    public float getD126e3() {
        return _d126e3;
    }

    public void setD126e3(float d126e3) {
        _d126e3 = d126e3;
    }

    public float getD141e3() {
        return _d141e3;
    }

    public void setD141e3(float d141e3) {
        _d141e3 = d141e3;
    }

    public float getD158e3() {
        return _d158e3;
    }

    public void setD158e3(float d158e3) {
        _d158e3 = d158e3;
    }

    public float getD178e3() {
        return _d178e3;
    }

    public void setD178e3(float d178e3) {
        _d178e3 = d178e3;
    }

    public float getD200e3() {
        return _d200e3;
    }

    public void setD200e3(float d200e3) {
        _d200e3 = d200e3;
    }

    public float getD224e3() {
        return _d224e3;
    }

    public void setD224e3(float d224e3) {
        _d224e3 = d224e3;
    }

    public float getD251e3() {
        return _d251e3;
    }

    public void setD251e3(float d251e3) {
        _d251e3 = d251e3;
    }

    public float getD282e3() {
        return _d282e3;
    }

    public void setD282e3(float d282e3) {
        _d282e3 = d282e3;
    }

    public float getD316e3() {
        return _d316e3;
    }

    public void setD316e3(float d316e3) {
        _d316e3 = d316e3;
    }

    public float getD355e3() {
        return _d355e3;
    }

    public void setD355e3(float d355e3) {
        _d355e3 = d355e3;
    }

    public float getD398e3() {
        return _d398e3;
    }

    public void setD398e3(float d398e3) {
        _d398e3 = d398e3;
    }

    public float getD447e3() {
        return _d447e3;
    }

    public void setD447e3(float d447e3) {
        _d447e3 = d447e3;
    }

    public float getD501e3() {
        return _d501e3;
    }

    public void setD501e3(float d501e3) {
        _d501e3 = d501e3;
    }

    public float getD562e3() {
        return _d562e3;
    }

    public void setD562e3(float d562e3) {
        _d562e3 = d562e3;
    }

    public float getD631e3() {
        return _d631e3;
    }

    public void setD631e3(float d631e3) {
        _d631e3 = d631e3;
    }

    public float getD708e3() {
        return _d708e3;
    }

    public void setD708e3(float d708e3) {
        _d708e3 = d708e3;
    }

    public float getD794e3() {
        return _d794e3;
    }

    public void setD794e3(float d794e3) {
        _d794e3 = d794e3;
    }

    public float getD891e3() {
        return _d891e3;
    }

    public void setD891e3(float d891e3) {
        _d891e3 = d891e3;
    }

    public float getD100e4() {
        return _d100e4;
    }

    public void setD100e4(float d100e4) {
        _d100e4 = d100e4;
    }

    public float getTconc() {
        return _tconc;
    }

    public void setTconc(float tconc) {
        _tconc = tconc;
    }
}
