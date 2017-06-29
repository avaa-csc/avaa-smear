package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.kvjMetaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.kvjMetaServiceSoap
 * @generated
 */
public class kvjMetaSoap implements Serializable {
    private Date _samptime;
    private float _Tw2;
    private float _Tw5;
    private float _Tw10;
    private float _Tw15;
    private float _Tw20;
    private float _Tw25;
    private float _Tw30;
    private float _Tw35;
    private float _Tw40;
    private float _Tw45;
    private float _Tw50;
    private float _Tw60;
    private float _Tw70;
    private float _Tw80;
    private float _Tw100;
    private float _Tw120;
    private float _CO2w02;
    private float _CO2w15;
    private float _CO2w25;
    private float _CO2w70;
    private float _Glob;
    private float _RGlob;
    private float _LWin;
    private float _LWout;
    private float _PARw02;
    private float _PARw07;
    private float _PARw10;
    private float _Ta;
    private float _RH;
    private int _Tw2_EMEP;
    private int _Tw5_EMEP;
    private int _Tw10_EMEP;
    private int _Tw15_EMEP;
    private int _Tw20_EMEP;
    private int _Tw25_EMEP;
    private int _Tw30_EMEP;
    private int _Tw35_EMEP;
    private int _Tw40_EMEP;
    private int _Tw45_EMEP;
    private int _Tw50_EMEP;
    private int _Tw60_EMEP;
    private int _Tw70_EMEP;
    private int _Tw80_EMEP;
    private int _Tw100_EMEP;
    private int _Tw120_EMEP;
    private int _CO2w02_EMEP;
    private int _CO2w15_EMEP;
    private int _CO2w25_EMEP;
    private int _CO2w70_EMEP;
    private int _Glob_EMEP;
    private int _RGlob_EMEP;
    private int _LWin_EMEP;
    private int _LWout_EMEP;
    private int _PARw02_EMEP;
    private int _PARw07_EMEP;
    private int _PARw10_EMEP;
    private int _Ta_EMEP;
    private int _RH_EMEP;

    public kvjMetaSoap() {
    }

    public static kvjMetaSoap toSoapModel(kvjMeta model) {
        kvjMetaSoap soapModel = new kvjMetaSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setTw2(model.getTw2());
        soapModel.setTw5(model.getTw5());
        soapModel.setTw10(model.getTw10());
        soapModel.setTw15(model.getTw15());
        soapModel.setTw20(model.getTw20());
        soapModel.setTw25(model.getTw25());
        soapModel.setTw30(model.getTw30());
        soapModel.setTw35(model.getTw35());
        soapModel.setTw40(model.getTw40());
        soapModel.setTw45(model.getTw45());
        soapModel.setTw50(model.getTw50());
        soapModel.setTw60(model.getTw60());
        soapModel.setTw70(model.getTw70());
        soapModel.setTw80(model.getTw80());
        soapModel.setTw100(model.getTw100());
        soapModel.setTw120(model.getTw120());
        soapModel.setCO2w02(model.getCO2w02());
        soapModel.setCO2w15(model.getCO2w15());
        soapModel.setCO2w25(model.getCO2w25());
        soapModel.setCO2w70(model.getCO2w70());
        soapModel.setGlob(model.getGlob());
        soapModel.setRGlob(model.getRGlob());
        soapModel.setLWin(model.getLWin());
        soapModel.setLWout(model.getLWout());
        soapModel.setPARw02(model.getPARw02());
        soapModel.setPARw07(model.getPARw07());
        soapModel.setPARw10(model.getPARw10());
        soapModel.setTa(model.getTa());
        soapModel.setRH(model.getRH());
        soapModel.setTw2_EMEP(model.getTw2_EMEP());
        soapModel.setTw5_EMEP(model.getTw5_EMEP());
        soapModel.setTw10_EMEP(model.getTw10_EMEP());
        soapModel.setTw15_EMEP(model.getTw15_EMEP());
        soapModel.setTw20_EMEP(model.getTw20_EMEP());
        soapModel.setTw25_EMEP(model.getTw25_EMEP());
        soapModel.setTw30_EMEP(model.getTw30_EMEP());
        soapModel.setTw35_EMEP(model.getTw35_EMEP());
        soapModel.setTw40_EMEP(model.getTw40_EMEP());
        soapModel.setTw45_EMEP(model.getTw45_EMEP());
        soapModel.setTw50_EMEP(model.getTw50_EMEP());
        soapModel.setTw60_EMEP(model.getTw60_EMEP());
        soapModel.setTw70_EMEP(model.getTw70_EMEP());
        soapModel.setTw80_EMEP(model.getTw80_EMEP());
        soapModel.setTw100_EMEP(model.getTw100_EMEP());
        soapModel.setTw120_EMEP(model.getTw120_EMEP());
        soapModel.setCO2w02_EMEP(model.getCO2w02_EMEP());
        soapModel.setCO2w15_EMEP(model.getCO2w15_EMEP());
        soapModel.setCO2w25_EMEP(model.getCO2w25_EMEP());
        soapModel.setCO2w70_EMEP(model.getCO2w70_EMEP());
        soapModel.setGlob_EMEP(model.getGlob_EMEP());
        soapModel.setRGlob_EMEP(model.getRGlob_EMEP());
        soapModel.setLWin_EMEP(model.getLWin_EMEP());
        soapModel.setLWout_EMEP(model.getLWout_EMEP());
        soapModel.setPARw02_EMEP(model.getPARw02_EMEP());
        soapModel.setPARw07_EMEP(model.getPARw07_EMEP());
        soapModel.setPARw10_EMEP(model.getPARw10_EMEP());
        soapModel.setTa_EMEP(model.getTa_EMEP());
        soapModel.setRH_EMEP(model.getRH_EMEP());

        return soapModel;
    }

    public static kvjMetaSoap[] toSoapModels(kvjMeta[] models) {
        kvjMetaSoap[] soapModels = new kvjMetaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static kvjMetaSoap[][] toSoapModels(kvjMeta[][] models) {
        kvjMetaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new kvjMetaSoap[models.length][models[0].length];
        } else {
            soapModels = new kvjMetaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static kvjMetaSoap[] toSoapModels(List<kvjMeta> models) {
        List<kvjMetaSoap> soapModels = new ArrayList<kvjMetaSoap>(models.size());

        for (kvjMeta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new kvjMetaSoap[soapModels.size()]);
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

    public float getTw2() {
        return _Tw2;
    }

    public void setTw2(float Tw2) {
        _Tw2 = Tw2;
    }

    public float getTw5() {
        return _Tw5;
    }

    public void setTw5(float Tw5) {
        _Tw5 = Tw5;
    }

    public float getTw10() {
        return _Tw10;
    }

    public void setTw10(float Tw10) {
        _Tw10 = Tw10;
    }

    public float getTw15() {
        return _Tw15;
    }

    public void setTw15(float Tw15) {
        _Tw15 = Tw15;
    }

    public float getTw20() {
        return _Tw20;
    }

    public void setTw20(float Tw20) {
        _Tw20 = Tw20;
    }

    public float getTw25() {
        return _Tw25;
    }

    public void setTw25(float Tw25) {
        _Tw25 = Tw25;
    }

    public float getTw30() {
        return _Tw30;
    }

    public void setTw30(float Tw30) {
        _Tw30 = Tw30;
    }

    public float getTw35() {
        return _Tw35;
    }

    public void setTw35(float Tw35) {
        _Tw35 = Tw35;
    }

    public float getTw40() {
        return _Tw40;
    }

    public void setTw40(float Tw40) {
        _Tw40 = Tw40;
    }

    public float getTw45() {
        return _Tw45;
    }

    public void setTw45(float Tw45) {
        _Tw45 = Tw45;
    }

    public float getTw50() {
        return _Tw50;
    }

    public void setTw50(float Tw50) {
        _Tw50 = Tw50;
    }

    public float getTw60() {
        return _Tw60;
    }

    public void setTw60(float Tw60) {
        _Tw60 = Tw60;
    }

    public float getTw70() {
        return _Tw70;
    }

    public void setTw70(float Tw70) {
        _Tw70 = Tw70;
    }

    public float getTw80() {
        return _Tw80;
    }

    public void setTw80(float Tw80) {
        _Tw80 = Tw80;
    }

    public float getTw100() {
        return _Tw100;
    }

    public void setTw100(float Tw100) {
        _Tw100 = Tw100;
    }

    public float getTw120() {
        return _Tw120;
    }

    public void setTw120(float Tw120) {
        _Tw120 = Tw120;
    }

    public float getCO2w02() {
        return _CO2w02;
    }

    public void setCO2w02(float CO2w02) {
        _CO2w02 = CO2w02;
    }

    public float getCO2w15() {
        return _CO2w15;
    }

    public void setCO2w15(float CO2w15) {
        _CO2w15 = CO2w15;
    }

    public float getCO2w25() {
        return _CO2w25;
    }

    public void setCO2w25(float CO2w25) {
        _CO2w25 = CO2w25;
    }

    public float getCO2w70() {
        return _CO2w70;
    }

    public void setCO2w70(float CO2w70) {
        _CO2w70 = CO2w70;
    }

    public float getGlob() {
        return _Glob;
    }

    public void setGlob(float Glob) {
        _Glob = Glob;
    }

    public float getRGlob() {
        return _RGlob;
    }

    public void setRGlob(float RGlob) {
        _RGlob = RGlob;
    }

    public float getLWin() {
        return _LWin;
    }

    public void setLWin(float LWin) {
        _LWin = LWin;
    }

    public float getLWout() {
        return _LWout;
    }

    public void setLWout(float LWout) {
        _LWout = LWout;
    }

    public float getPARw02() {
        return _PARw02;
    }

    public void setPARw02(float PARw02) {
        _PARw02 = PARw02;
    }

    public float getPARw07() {
        return _PARw07;
    }

    public void setPARw07(float PARw07) {
        _PARw07 = PARw07;
    }

    public float getPARw10() {
        return _PARw10;
    }

    public void setPARw10(float PARw10) {
        _PARw10 = PARw10;
    }

    public float getTa() {
        return _Ta;
    }

    public void setTa(float Ta) {
        _Ta = Ta;
    }

    public float getRH() {
        return _RH;
    }

    public void setRH(float RH) {
        _RH = RH;
    }

    public int getTw2_EMEP() {
        return _Tw2_EMEP;
    }

    public void setTw2_EMEP(int Tw2_EMEP) {
        _Tw2_EMEP = Tw2_EMEP;
    }

    public int getTw5_EMEP() {
        return _Tw5_EMEP;
    }

    public void setTw5_EMEP(int Tw5_EMEP) {
        _Tw5_EMEP = Tw5_EMEP;
    }

    public int getTw10_EMEP() {
        return _Tw10_EMEP;
    }

    public void setTw10_EMEP(int Tw10_EMEP) {
        _Tw10_EMEP = Tw10_EMEP;
    }

    public int getTw15_EMEP() {
        return _Tw15_EMEP;
    }

    public void setTw15_EMEP(int Tw15_EMEP) {
        _Tw15_EMEP = Tw15_EMEP;
    }

    public int getTw20_EMEP() {
        return _Tw20_EMEP;
    }

    public void setTw20_EMEP(int Tw20_EMEP) {
        _Tw20_EMEP = Tw20_EMEP;
    }

    public int getTw25_EMEP() {
        return _Tw25_EMEP;
    }

    public void setTw25_EMEP(int Tw25_EMEP) {
        _Tw25_EMEP = Tw25_EMEP;
    }

    public int getTw30_EMEP() {
        return _Tw30_EMEP;
    }

    public void setTw30_EMEP(int Tw30_EMEP) {
        _Tw30_EMEP = Tw30_EMEP;
    }

    public int getTw35_EMEP() {
        return _Tw35_EMEP;
    }

    public void setTw35_EMEP(int Tw35_EMEP) {
        _Tw35_EMEP = Tw35_EMEP;
    }

    public int getTw40_EMEP() {
        return _Tw40_EMEP;
    }

    public void setTw40_EMEP(int Tw40_EMEP) {
        _Tw40_EMEP = Tw40_EMEP;
    }

    public int getTw45_EMEP() {
        return _Tw45_EMEP;
    }

    public void setTw45_EMEP(int Tw45_EMEP) {
        _Tw45_EMEP = Tw45_EMEP;
    }

    public int getTw50_EMEP() {
        return _Tw50_EMEP;
    }

    public void setTw50_EMEP(int Tw50_EMEP) {
        _Tw50_EMEP = Tw50_EMEP;
    }

    public int getTw60_EMEP() {
        return _Tw60_EMEP;
    }

    public void setTw60_EMEP(int Tw60_EMEP) {
        _Tw60_EMEP = Tw60_EMEP;
    }

    public int getTw70_EMEP() {
        return _Tw70_EMEP;
    }

    public void setTw70_EMEP(int Tw70_EMEP) {
        _Tw70_EMEP = Tw70_EMEP;
    }

    public int getTw80_EMEP() {
        return _Tw80_EMEP;
    }

    public void setTw80_EMEP(int Tw80_EMEP) {
        _Tw80_EMEP = Tw80_EMEP;
    }

    public int getTw100_EMEP() {
        return _Tw100_EMEP;
    }

    public void setTw100_EMEP(int Tw100_EMEP) {
        _Tw100_EMEP = Tw100_EMEP;
    }

    public int getTw120_EMEP() {
        return _Tw120_EMEP;
    }

    public void setTw120_EMEP(int Tw120_EMEP) {
        _Tw120_EMEP = Tw120_EMEP;
    }

    public int getCO2w02_EMEP() {
        return _CO2w02_EMEP;
    }

    public void setCO2w02_EMEP(int CO2w02_EMEP) {
        _CO2w02_EMEP = CO2w02_EMEP;
    }

    public int getCO2w15_EMEP() {
        return _CO2w15_EMEP;
    }

    public void setCO2w15_EMEP(int CO2w15_EMEP) {
        _CO2w15_EMEP = CO2w15_EMEP;
    }

    public int getCO2w25_EMEP() {
        return _CO2w25_EMEP;
    }

    public void setCO2w25_EMEP(int CO2w25_EMEP) {
        _CO2w25_EMEP = CO2w25_EMEP;
    }

    public int getCO2w70_EMEP() {
        return _CO2w70_EMEP;
    }

    public void setCO2w70_EMEP(int CO2w70_EMEP) {
        _CO2w70_EMEP = CO2w70_EMEP;
    }

    public int getGlob_EMEP() {
        return _Glob_EMEP;
    }

    public void setGlob_EMEP(int Glob_EMEP) {
        _Glob_EMEP = Glob_EMEP;
    }

    public int getRGlob_EMEP() {
        return _RGlob_EMEP;
    }

    public void setRGlob_EMEP(int RGlob_EMEP) {
        _RGlob_EMEP = RGlob_EMEP;
    }

    public int getLWin_EMEP() {
        return _LWin_EMEP;
    }

    public void setLWin_EMEP(int LWin_EMEP) {
        _LWin_EMEP = LWin_EMEP;
    }

    public int getLWout_EMEP() {
        return _LWout_EMEP;
    }

    public void setLWout_EMEP(int LWout_EMEP) {
        _LWout_EMEP = LWout_EMEP;
    }

    public int getPARw02_EMEP() {
        return _PARw02_EMEP;
    }

    public void setPARw02_EMEP(int PARw02_EMEP) {
        _PARw02_EMEP = PARw02_EMEP;
    }

    public int getPARw07_EMEP() {
        return _PARw07_EMEP;
    }

    public void setPARw07_EMEP(int PARw07_EMEP) {
        _PARw07_EMEP = PARw07_EMEP;
    }

    public int getPARw10_EMEP() {
        return _PARw10_EMEP;
    }

    public void setPARw10_EMEP(int PARw10_EMEP) {
        _PARw10_EMEP = PARw10_EMEP;
    }

    public int getTa_EMEP() {
        return _Ta_EMEP;
    }

    public void setTa_EMEP(int Ta_EMEP) {
        _Ta_EMEP = Ta_EMEP;
    }

    public int getRH_EMEP() {
        return _RH_EMEP;
    }

    public void setRH_EMEP(int RH_EMEP) {
        _RH_EMEP = RH_EMEP;
    }
}
