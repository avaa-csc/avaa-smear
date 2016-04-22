package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Sii2metaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Sii2metaServiceSoap
 * @generated
 */
public class Sii2metaSoap implements Serializable {
    private Date _samptime;
    private float _T_a;
    private int _T_a_EMEP;
    private float _RH;
    private int _RH_EMEP;
    private float _Net;
    private int _Net_EMEP;
    private float _T_p_5;
    private int _T_p_5_EMEP;
    private float _T_p_B20;
    private int _T_p_B20_EMEP;
    private float _T_p_B35;
    private int _T_p_B35_EMEP;
    private float _T_p_B50;
    private int _T_p_B50_EMEP;
    private float _WTD;
    private int _WTD_EMEP;
    private float _Precip;
    private int _Precip_EMEP;

    public Sii2metaSoap() {
    }

    public static Sii2metaSoap toSoapModel(Sii2meta model) {
        Sii2metaSoap soapModel = new Sii2metaSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setT_a(model.getT_a());
        soapModel.setT_a_EMEP(model.getT_a_EMEP());
        soapModel.setRH(model.getRH());
        soapModel.setRH_EMEP(model.getRH_EMEP());
        soapModel.setNet(model.getNet());
        soapModel.setNet_EMEP(model.getNet_EMEP());
        soapModel.setT_p_5(model.getT_p_5());
        soapModel.setT_p_5_EMEP(model.getT_p_5_EMEP());
        soapModel.setT_p_B20(model.getT_p_B20());
        soapModel.setT_p_B20_EMEP(model.getT_p_B20_EMEP());
        soapModel.setT_p_B35(model.getT_p_B35());
        soapModel.setT_p_B35_EMEP(model.getT_p_B35_EMEP());
        soapModel.setT_p_B50(model.getT_p_B50());
        soapModel.setT_p_B50_EMEP(model.getT_p_B50_EMEP());
        soapModel.setWTD(model.getWTD());
        soapModel.setWTD_EMEP(model.getWTD_EMEP());
        soapModel.setPrecip(model.getPrecip());
        soapModel.setPrecip_EMEP(model.getPrecip_EMEP());

        return soapModel;
    }

    public static Sii2metaSoap[] toSoapModels(Sii2meta[] models) {
        Sii2metaSoap[] soapModels = new Sii2metaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Sii2metaSoap[][] toSoapModels(Sii2meta[][] models) {
        Sii2metaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Sii2metaSoap[models.length][models[0].length];
        } else {
            soapModels = new Sii2metaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Sii2metaSoap[] toSoapModels(List<Sii2meta> models) {
        List<Sii2metaSoap> soapModels = new ArrayList<Sii2metaSoap>(models.size());

        for (Sii2meta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Sii2metaSoap[soapModels.size()]);
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

    public float getT_a() {
        return _T_a;
    }

    public void setT_a(float T_a) {
        _T_a = T_a;
    }

    public int getT_a_EMEP() {
        return _T_a_EMEP;
    }

    public void setT_a_EMEP(int T_a_EMEP) {
        _T_a_EMEP = T_a_EMEP;
    }

    public float getRH() {
        return _RH;
    }

    public void setRH(float RH) {
        _RH = RH;
    }

    public int getRH_EMEP() {
        return _RH_EMEP;
    }

    public void setRH_EMEP(int RH_EMEP) {
        _RH_EMEP = RH_EMEP;
    }

    public float getNet() {
        return _Net;
    }

    public void setNet(float Net) {
        _Net = Net;
    }

    public int getNet_EMEP() {
        return _Net_EMEP;
    }

    public void setNet_EMEP(int Net_EMEP) {
        _Net_EMEP = Net_EMEP;
    }

    public float getT_p_5() {
        return _T_p_5;
    }

    public void setT_p_5(float T_p_5) {
        _T_p_5 = T_p_5;
    }

    public int getT_p_5_EMEP() {
        return _T_p_5_EMEP;
    }

    public void setT_p_5_EMEP(int T_p_5_EMEP) {
        _T_p_5_EMEP = T_p_5_EMEP;
    }

    public float getT_p_B20() {
        return _T_p_B20;
    }

    public void setT_p_B20(float T_p_B20) {
        _T_p_B20 = T_p_B20;
    }

    public int getT_p_B20_EMEP() {
        return _T_p_B20_EMEP;
    }

    public void setT_p_B20_EMEP(int T_p_B20_EMEP) {
        _T_p_B20_EMEP = T_p_B20_EMEP;
    }

    public float getT_p_B35() {
        return _T_p_B35;
    }

    public void setT_p_B35(float T_p_B35) {
        _T_p_B35 = T_p_B35;
    }

    public int getT_p_B35_EMEP() {
        return _T_p_B35_EMEP;
    }

    public void setT_p_B35_EMEP(int T_p_B35_EMEP) {
        _T_p_B35_EMEP = T_p_B35_EMEP;
    }

    public float getT_p_B50() {
        return _T_p_B50;
    }

    public void setT_p_B50(float T_p_B50) {
        _T_p_B50 = T_p_B50;
    }

    public int getT_p_B50_EMEP() {
        return _T_p_B50_EMEP;
    }

    public void setT_p_B50_EMEP(int T_p_B50_EMEP) {
        _T_p_B50_EMEP = T_p_B50_EMEP;
    }

    public float getWTD() {
        return _WTD;
    }

    public void setWTD(float WTD) {
        _WTD = WTD;
    }

    public int getWTD_EMEP() {
        return _WTD_EMEP;
    }

    public void setWTD_EMEP(int WTD_EMEP) {
        _WTD_EMEP = WTD_EMEP;
    }

    public float getPrecip() {
        return _Precip;
    }

    public void setPrecip(float Precip) {
        _Precip = Precip;
    }

    public int getPrecip_EMEP() {
        return _Precip_EMEP;
    }

    public void setPrecip_EMEP(int Precip_EMEP) {
        _Precip_EMEP = Precip_EMEP;
    }
}
