package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Sii1metaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Sii1metaServiceSoap
 * @generated
 */
public class Sii1metaSoap implements Serializable {
    private Date _samptime;
    private float _T_a;
    private int _T_a_EMEP;
    private float _RH;
    private int _RH_EMEP;
    private float _PAR;
    private int _PAR_EMEP;
    private float _R_PAR;
    private int _R_PAR_EMEP;
    private float _Net_CNR4;
    private int _Net_CNR4_EMEP;
    private float _Net_NRLite;
    private int _Net_NRLite_EMEP;
    private float _Wsoil_1;
    private int _Wsoil_1_EMEP;
    private float _Wsoil_2;
    private int _Wsoil_2_EMEP;
    private float _T_p_B5;
    private int _T_p_B5_EMEP;
    private float _T_p_B20;
    private int _T_p_B20_EMEP;
    private float _T_p_B35;
    private int _T_p_B35_EMEP;
    private float _T_p_B50;
    private int _T_p_B50_EMEP;
    private float _T_p_C1;
    private int _T_p_C1_EMEP;
    private float _T_p_C2;
    private int _T_p_C2_EMEP;
    private float _T_p_C5;
    private int _T_p_C5_EMEP;
    private float _T_p_C10;
    private int _T_p_C10_EMEP;
    private float _T_p_C15;
    private int _T_p_C15_EMEP;
    private float _T_p_C20;
    private int _T_p_C20_EMEP;
    private float _T_p_C30;
    private int _T_p_C30_EMEP;
    private float _T_p_C50;
    private int _T_p_C50_EMEP;
    private float _T_p_C70;
    private int _T_p_C70_EMEP;
    private float _T_p_C100;
    private int _T_p_C100_EMEP;
    private float _WTD;
    private int _WTD_EMEP;
    private float _Precip;
    private int _Precip_EMEP;

    public Sii1metaSoap() {
    }

    public static Sii1metaSoap toSoapModel(Sii1meta model) {
        Sii1metaSoap soapModel = new Sii1metaSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setT_a(model.getT_a());
        soapModel.setT_a_EMEP(model.getT_a_EMEP());
        soapModel.setRH(model.getRH());
        soapModel.setRH_EMEP(model.getRH_EMEP());
        soapModel.setPAR(model.getPAR());
        soapModel.setPAR_EMEP(model.getPAR_EMEP());
        soapModel.setR_PAR(model.getR_PAR());
        soapModel.setR_PAR_EMEP(model.getR_PAR_EMEP());
        soapModel.setNet_CNR4(model.getNet_CNR4());
        soapModel.setNet_CNR4_EMEP(model.getNet_CNR4_EMEP());
        soapModel.setNet_NRLite(model.getNet_NRLite());
        soapModel.setNet_NRLite_EMEP(model.getNet_NRLite_EMEP());
        soapModel.setWsoil_1(model.getWsoil_1());
        soapModel.setWsoil_1_EMEP(model.getWsoil_1_EMEP());
        soapModel.setWsoil_2(model.getWsoil_2());
        soapModel.setWsoil_2_EMEP(model.getWsoil_2_EMEP());
        soapModel.setT_p_B5(model.getT_p_B5());
        soapModel.setT_p_B5_EMEP(model.getT_p_B5_EMEP());
        soapModel.setT_p_B20(model.getT_p_B20());
        soapModel.setT_p_B20_EMEP(model.getT_p_B20_EMEP());
        soapModel.setT_p_B35(model.getT_p_B35());
        soapModel.setT_p_B35_EMEP(model.getT_p_B35_EMEP());
        soapModel.setT_p_B50(model.getT_p_B50());
        soapModel.setT_p_B50_EMEP(model.getT_p_B50_EMEP());
        soapModel.setT_p_C1(model.getT_p_C1());
        soapModel.setT_p_C1_EMEP(model.getT_p_C1_EMEP());
        soapModel.setT_p_C2(model.getT_p_C2());
        soapModel.setT_p_C2_EMEP(model.getT_p_C2_EMEP());
        soapModel.setT_p_C5(model.getT_p_C5());
        soapModel.setT_p_C5_EMEP(model.getT_p_C5_EMEP());
        soapModel.setT_p_C10(model.getT_p_C10());
        soapModel.setT_p_C10_EMEP(model.getT_p_C10_EMEP());
        soapModel.setT_p_C15(model.getT_p_C15());
        soapModel.setT_p_C15_EMEP(model.getT_p_C15_EMEP());
        soapModel.setT_p_C20(model.getT_p_C20());
        soapModel.setT_p_C20_EMEP(model.getT_p_C20_EMEP());
        soapModel.setT_p_C30(model.getT_p_C30());
        soapModel.setT_p_C30_EMEP(model.getT_p_C30_EMEP());
        soapModel.setT_p_C50(model.getT_p_C50());
        soapModel.setT_p_C50_EMEP(model.getT_p_C50_EMEP());
        soapModel.setT_p_C70(model.getT_p_C70());
        soapModel.setT_p_C70_EMEP(model.getT_p_C70_EMEP());
        soapModel.setT_p_C100(model.getT_p_C100());
        soapModel.setT_p_C100_EMEP(model.getT_p_C100_EMEP());
        soapModel.setWTD(model.getWTD());
        soapModel.setWTD_EMEP(model.getWTD_EMEP());
        soapModel.setPrecip(model.getPrecip());
        soapModel.setPrecip_EMEP(model.getPrecip_EMEP());

        return soapModel;
    }

    public static Sii1metaSoap[] toSoapModels(Sii1meta[] models) {
        Sii1metaSoap[] soapModels = new Sii1metaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Sii1metaSoap[][] toSoapModels(Sii1meta[][] models) {
        Sii1metaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Sii1metaSoap[models.length][models[0].length];
        } else {
            soapModels = new Sii1metaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Sii1metaSoap[] toSoapModels(List<Sii1meta> models) {
        List<Sii1metaSoap> soapModels = new ArrayList<Sii1metaSoap>(models.size());

        for (Sii1meta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Sii1metaSoap[soapModels.size()]);
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

    public float getPAR() {
        return _PAR;
    }

    public void setPAR(float PAR) {
        _PAR = PAR;
    }

    public int getPAR_EMEP() {
        return _PAR_EMEP;
    }

    public void setPAR_EMEP(int PAR_EMEP) {
        _PAR_EMEP = PAR_EMEP;
    }

    public float getR_PAR() {
        return _R_PAR;
    }

    public void setR_PAR(float R_PAR) {
        _R_PAR = R_PAR;
    }

    public int getR_PAR_EMEP() {
        return _R_PAR_EMEP;
    }

    public void setR_PAR_EMEP(int R_PAR_EMEP) {
        _R_PAR_EMEP = R_PAR_EMEP;
    }

    public float getNet_CNR4() {
        return _Net_CNR4;
    }

    public void setNet_CNR4(float Net_CNR4) {
        _Net_CNR4 = Net_CNR4;
    }

    public int getNet_CNR4_EMEP() {
        return _Net_CNR4_EMEP;
    }

    public void setNet_CNR4_EMEP(int Net_CNR4_EMEP) {
        _Net_CNR4_EMEP = Net_CNR4_EMEP;
    }

    public float getNet_NRLite() {
        return _Net_NRLite;
    }

    public void setNet_NRLite(float Net_NRLite) {
        _Net_NRLite = Net_NRLite;
    }

    public int getNet_NRLite_EMEP() {
        return _Net_NRLite_EMEP;
    }

    public void setNet_NRLite_EMEP(int Net_NRLite_EMEP) {
        _Net_NRLite_EMEP = Net_NRLite_EMEP;
    }

    public float getWsoil_1() {
        return _Wsoil_1;
    }

    public void setWsoil_1(float Wsoil_1) {
        _Wsoil_1 = Wsoil_1;
    }

    public int getWsoil_1_EMEP() {
        return _Wsoil_1_EMEP;
    }

    public void setWsoil_1_EMEP(int Wsoil_1_EMEP) {
        _Wsoil_1_EMEP = Wsoil_1_EMEP;
    }

    public float getWsoil_2() {
        return _Wsoil_2;
    }

    public void setWsoil_2(float Wsoil_2) {
        _Wsoil_2 = Wsoil_2;
    }

    public int getWsoil_2_EMEP() {
        return _Wsoil_2_EMEP;
    }

    public void setWsoil_2_EMEP(int Wsoil_2_EMEP) {
        _Wsoil_2_EMEP = Wsoil_2_EMEP;
    }

    public float getT_p_B5() {
        return _T_p_B5;
    }

    public void setT_p_B5(float T_p_B5) {
        _T_p_B5 = T_p_B5;
    }

    public int getT_p_B5_EMEP() {
        return _T_p_B5_EMEP;
    }

    public void setT_p_B5_EMEP(int T_p_B5_EMEP) {
        _T_p_B5_EMEP = T_p_B5_EMEP;
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

    public float getT_p_C1() {
        return _T_p_C1;
    }

    public void setT_p_C1(float T_p_C1) {
        _T_p_C1 = T_p_C1;
    }

    public int getT_p_C1_EMEP() {
        return _T_p_C1_EMEP;
    }

    public void setT_p_C1_EMEP(int T_p_C1_EMEP) {
        _T_p_C1_EMEP = T_p_C1_EMEP;
    }

    public float getT_p_C2() {
        return _T_p_C2;
    }

    public void setT_p_C2(float T_p_C2) {
        _T_p_C2 = T_p_C2;
    }

    public int getT_p_C2_EMEP() {
        return _T_p_C2_EMEP;
    }

    public void setT_p_C2_EMEP(int T_p_C2_EMEP) {
        _T_p_C2_EMEP = T_p_C2_EMEP;
    }

    public float getT_p_C5() {
        return _T_p_C5;
    }

    public void setT_p_C5(float T_p_C5) {
        _T_p_C5 = T_p_C5;
    }

    public int getT_p_C5_EMEP() {
        return _T_p_C5_EMEP;
    }

    public void setT_p_C5_EMEP(int T_p_C5_EMEP) {
        _T_p_C5_EMEP = T_p_C5_EMEP;
    }

    public float getT_p_C10() {
        return _T_p_C10;
    }

    public void setT_p_C10(float T_p_C10) {
        _T_p_C10 = T_p_C10;
    }

    public int getT_p_C10_EMEP() {
        return _T_p_C10_EMEP;
    }

    public void setT_p_C10_EMEP(int T_p_C10_EMEP) {
        _T_p_C10_EMEP = T_p_C10_EMEP;
    }

    public float getT_p_C15() {
        return _T_p_C15;
    }

    public void setT_p_C15(float T_p_C15) {
        _T_p_C15 = T_p_C15;
    }

    public int getT_p_C15_EMEP() {
        return _T_p_C15_EMEP;
    }

    public void setT_p_C15_EMEP(int T_p_C15_EMEP) {
        _T_p_C15_EMEP = T_p_C15_EMEP;
    }

    public float getT_p_C20() {
        return _T_p_C20;
    }

    public void setT_p_C20(float T_p_C20) {
        _T_p_C20 = T_p_C20;
    }

    public int getT_p_C20_EMEP() {
        return _T_p_C20_EMEP;
    }

    public void setT_p_C20_EMEP(int T_p_C20_EMEP) {
        _T_p_C20_EMEP = T_p_C20_EMEP;
    }

    public float getT_p_C30() {
        return _T_p_C30;
    }

    public void setT_p_C30(float T_p_C30) {
        _T_p_C30 = T_p_C30;
    }

    public int getT_p_C30_EMEP() {
        return _T_p_C30_EMEP;
    }

    public void setT_p_C30_EMEP(int T_p_C30_EMEP) {
        _T_p_C30_EMEP = T_p_C30_EMEP;
    }

    public float getT_p_C50() {
        return _T_p_C50;
    }

    public void setT_p_C50(float T_p_C50) {
        _T_p_C50 = T_p_C50;
    }

    public int getT_p_C50_EMEP() {
        return _T_p_C50_EMEP;
    }

    public void setT_p_C50_EMEP(int T_p_C50_EMEP) {
        _T_p_C50_EMEP = T_p_C50_EMEP;
    }

    public float getT_p_C70() {
        return _T_p_C70;
    }

    public void setT_p_C70(float T_p_C70) {
        _T_p_C70 = T_p_C70;
    }

    public int getT_p_C70_EMEP() {
        return _T_p_C70_EMEP;
    }

    public void setT_p_C70_EMEP(int T_p_C70_EMEP) {
        _T_p_C70_EMEP = T_p_C70_EMEP;
    }

    public float getT_p_C100() {
        return _T_p_C100;
    }

    public void setT_p_C100(float T_p_C100) {
        _T_p_C100 = T_p_C100;
    }

    public int getT_p_C100_EMEP() {
        return _T_p_C100_EMEP;
    }

    public void setT_p_C100_EMEP(int T_p_C100_EMEP) {
        _T_p_C100_EMEP = T_p_C100_EMEP;
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
