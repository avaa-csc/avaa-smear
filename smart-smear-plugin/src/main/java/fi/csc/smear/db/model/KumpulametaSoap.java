package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.KumpulametaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.KumpulametaServiceSoap
 * @generated
 */
public class KumpulametaSoap implements Serializable {
    private Date _samptime;
    private float _t;
    private float _dp;
    private float _rh;
    private float _p;
    private float _ws;
    private float _wdir;
    private float _rmm;
    private float _p0;
    private float _glob;
    private float _par;
    private float _skyir;
    private float _pwd_visibility_1;
    private float _pwd_visibility_10;
    private float _pwd_wmo_0;
    private float _pwd_wmo_15;
    private float _pwd_wmo_60;
    private float _pwd_intensity_w;
    private float _pwd_rmm;
    private float _pwd_smm;
    private String _pwd_nws;
    private float _Tower_T_4m;
    private float _Tower_T_8m;
    private float _Tower_T_16m;
    private float _Tower_T_32m;
    private float _Tower_WS_32m;
    private float _Tower_WS_16m;
    private float _Tower_WS_8m;
    private float _Tower_WS_4m;
    private float _Tower_WDIR_32m;
    private float _Tower_WDIR_16m;
    private float _Tower_WDIR_8m;
    private float _Tower_WDIR_4m;
    private float _Tower_PAR_32m;
    private float _Tower_PAR_REFL_32m;
    private float _Tower_GLOB_32m;
    private float _Tower_GLOB_REFL_32m;
    private float _Tower_IR_32m;
    private float _Tower_IR_REFL_32m;
    private float _Tower_VT_4m;
    private float _Tower_VT_8m;
    private float _Tower_VT_16m;
    private float _Tower_VT_32m;
    private float _O_3;
    private float _NO;
    private float _NO_x;
    private float _SO_2;
    private float _CO;
    private float _Tower_WS_MAX_32m;
    private float _Tower_WS_MAX_16m;
    private float _Tower_WS_MAX_8m;
    private float _Tower_WS_MAX_4m;

    public KumpulametaSoap() {
    }

    public static KumpulametaSoap toSoapModel(Kumpulameta model) {
        KumpulametaSoap soapModel = new KumpulametaSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setT(model.getT());
        soapModel.setDp(model.getDp());
        soapModel.setRh(model.getRh());
        soapModel.setP(model.getP());
        soapModel.setWs(model.getWs());
        soapModel.setWdir(model.getWdir());
        soapModel.setRmm(model.getRmm());
        soapModel.setP0(model.getP0());
        soapModel.setGlob(model.getGlob());
        soapModel.setPar(model.getPar());
        soapModel.setSkyir(model.getSkyir());
        soapModel.setPwd_visibility_1(model.getPwd_visibility_1());
        soapModel.setPwd_visibility_10(model.getPwd_visibility_10());
        soapModel.setPwd_wmo_0(model.getPwd_wmo_0());
        soapModel.setPwd_wmo_15(model.getPwd_wmo_15());
        soapModel.setPwd_wmo_60(model.getPwd_wmo_60());
        soapModel.setPwd_intensity_w(model.getPwd_intensity_w());
        soapModel.setPwd_rmm(model.getPwd_rmm());
        soapModel.setPwd_smm(model.getPwd_smm());
        soapModel.setPwd_nws(model.getPwd_nws());
        soapModel.setTower_T_4m(model.getTower_T_4m());
        soapModel.setTower_T_8m(model.getTower_T_8m());
        soapModel.setTower_T_16m(model.getTower_T_16m());
        soapModel.setTower_T_32m(model.getTower_T_32m());
        soapModel.setTower_WS_32m(model.getTower_WS_32m());
        soapModel.setTower_WS_16m(model.getTower_WS_16m());
        soapModel.setTower_WS_8m(model.getTower_WS_8m());
        soapModel.setTower_WS_4m(model.getTower_WS_4m());
        soapModel.setTower_WDIR_32m(model.getTower_WDIR_32m());
        soapModel.setTower_WDIR_16m(model.getTower_WDIR_16m());
        soapModel.setTower_WDIR_8m(model.getTower_WDIR_8m());
        soapModel.setTower_WDIR_4m(model.getTower_WDIR_4m());
        soapModel.setTower_PAR_32m(model.getTower_PAR_32m());
        soapModel.setTower_PAR_REFL_32m(model.getTower_PAR_REFL_32m());
        soapModel.setTower_GLOB_32m(model.getTower_GLOB_32m());
        soapModel.setTower_GLOB_REFL_32m(model.getTower_GLOB_REFL_32m());
        soapModel.setTower_IR_32m(model.getTower_IR_32m());
        soapModel.setTower_IR_REFL_32m(model.getTower_IR_REFL_32m());
        soapModel.setTower_VT_4m(model.getTower_VT_4m());
        soapModel.setTower_VT_8m(model.getTower_VT_8m());
        soapModel.setTower_VT_16m(model.getTower_VT_16m());
        soapModel.setTower_VT_32m(model.getTower_VT_32m());
        soapModel.setO_3(model.getO_3());
        soapModel.setNO(model.getNO());
        soapModel.setNO_x(model.getNO_x());
        soapModel.setSO_2(model.getSO_2());
        soapModel.setCO(model.getCO());
        soapModel.setTower_WS_MAX_32m(model.getTower_WS_MAX_32m());
        soapModel.setTower_WS_MAX_16m(model.getTower_WS_MAX_16m());
        soapModel.setTower_WS_MAX_8m(model.getTower_WS_MAX_8m());
        soapModel.setTower_WS_MAX_4m(model.getTower_WS_MAX_4m());

        return soapModel;
    }

    public static KumpulametaSoap[] toSoapModels(Kumpulameta[] models) {
        KumpulametaSoap[] soapModels = new KumpulametaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static KumpulametaSoap[][] toSoapModels(Kumpulameta[][] models) {
        KumpulametaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new KumpulametaSoap[models.length][models[0].length];
        } else {
            soapModels = new KumpulametaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static KumpulametaSoap[] toSoapModels(List<Kumpulameta> models) {
        List<KumpulametaSoap> soapModels = new ArrayList<KumpulametaSoap>(models.size());

        for (Kumpulameta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new KumpulametaSoap[soapModels.size()]);
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

    public float getT() {
        return _t;
    }

    public void setT(float t) {
        _t = t;
    }

    public float getDp() {
        return _dp;
    }

    public void setDp(float dp) {
        _dp = dp;
    }

    public float getRh() {
        return _rh;
    }

    public void setRh(float rh) {
        _rh = rh;
    }

    public float getP() {
        return _p;
    }

    public void setP(float p) {
        _p = p;
    }

    public float getWs() {
        return _ws;
    }

    public void setWs(float ws) {
        _ws = ws;
    }

    public float getWdir() {
        return _wdir;
    }

    public void setWdir(float wdir) {
        _wdir = wdir;
    }

    public float getRmm() {
        return _rmm;
    }

    public void setRmm(float rmm) {
        _rmm = rmm;
    }

    public float getP0() {
        return _p0;
    }

    public void setP0(float p0) {
        _p0 = p0;
    }

    public float getGlob() {
        return _glob;
    }

    public void setGlob(float glob) {
        _glob = glob;
    }

    public float getPar() {
        return _par;
    }

    public void setPar(float par) {
        _par = par;
    }

    public float getSkyir() {
        return _skyir;
    }

    public void setSkyir(float skyir) {
        _skyir = skyir;
    }

    public float getPwd_visibility_1() {
        return _pwd_visibility_1;
    }

    public void setPwd_visibility_1(float pwd_visibility_1) {
        _pwd_visibility_1 = pwd_visibility_1;
    }

    public float getPwd_visibility_10() {
        return _pwd_visibility_10;
    }

    public void setPwd_visibility_10(float pwd_visibility_10) {
        _pwd_visibility_10 = pwd_visibility_10;
    }

    public float getPwd_wmo_0() {
        return _pwd_wmo_0;
    }

    public void setPwd_wmo_0(float pwd_wmo_0) {
        _pwd_wmo_0 = pwd_wmo_0;
    }

    public float getPwd_wmo_15() {
        return _pwd_wmo_15;
    }

    public void setPwd_wmo_15(float pwd_wmo_15) {
        _pwd_wmo_15 = pwd_wmo_15;
    }

    public float getPwd_wmo_60() {
        return _pwd_wmo_60;
    }

    public void setPwd_wmo_60(float pwd_wmo_60) {
        _pwd_wmo_60 = pwd_wmo_60;
    }

    public float getPwd_intensity_w() {
        return _pwd_intensity_w;
    }

    public void setPwd_intensity_w(float pwd_intensity_w) {
        _pwd_intensity_w = pwd_intensity_w;
    }

    public float getPwd_rmm() {
        return _pwd_rmm;
    }

    public void setPwd_rmm(float pwd_rmm) {
        _pwd_rmm = pwd_rmm;
    }

    public float getPwd_smm() {
        return _pwd_smm;
    }

    public void setPwd_smm(float pwd_smm) {
        _pwd_smm = pwd_smm;
    }

    public String getPwd_nws() {
        return _pwd_nws;
    }

    public void setPwd_nws(String pwd_nws) {
        _pwd_nws = pwd_nws;
    }

    public float getTower_T_4m() {
        return _Tower_T_4m;
    }

    public void setTower_T_4m(float Tower_T_4m) {
        _Tower_T_4m = Tower_T_4m;
    }

    public float getTower_T_8m() {
        return _Tower_T_8m;
    }

    public void setTower_T_8m(float Tower_T_8m) {
        _Tower_T_8m = Tower_T_8m;
    }

    public float getTower_T_16m() {
        return _Tower_T_16m;
    }

    public void setTower_T_16m(float Tower_T_16m) {
        _Tower_T_16m = Tower_T_16m;
    }

    public float getTower_T_32m() {
        return _Tower_T_32m;
    }

    public void setTower_T_32m(float Tower_T_32m) {
        _Tower_T_32m = Tower_T_32m;
    }

    public float getTower_WS_32m() {
        return _Tower_WS_32m;
    }

    public void setTower_WS_32m(float Tower_WS_32m) {
        _Tower_WS_32m = Tower_WS_32m;
    }

    public float getTower_WS_16m() {
        return _Tower_WS_16m;
    }

    public void setTower_WS_16m(float Tower_WS_16m) {
        _Tower_WS_16m = Tower_WS_16m;
    }

    public float getTower_WS_8m() {
        return _Tower_WS_8m;
    }

    public void setTower_WS_8m(float Tower_WS_8m) {
        _Tower_WS_8m = Tower_WS_8m;
    }

    public float getTower_WS_4m() {
        return _Tower_WS_4m;
    }

    public void setTower_WS_4m(float Tower_WS_4m) {
        _Tower_WS_4m = Tower_WS_4m;
    }

    public float getTower_WDIR_32m() {
        return _Tower_WDIR_32m;
    }

    public void setTower_WDIR_32m(float Tower_WDIR_32m) {
        _Tower_WDIR_32m = Tower_WDIR_32m;
    }

    public float getTower_WDIR_16m() {
        return _Tower_WDIR_16m;
    }

    public void setTower_WDIR_16m(float Tower_WDIR_16m) {
        _Tower_WDIR_16m = Tower_WDIR_16m;
    }

    public float getTower_WDIR_8m() {
        return _Tower_WDIR_8m;
    }

    public void setTower_WDIR_8m(float Tower_WDIR_8m) {
        _Tower_WDIR_8m = Tower_WDIR_8m;
    }

    public float getTower_WDIR_4m() {
        return _Tower_WDIR_4m;
    }

    public void setTower_WDIR_4m(float Tower_WDIR_4m) {
        _Tower_WDIR_4m = Tower_WDIR_4m;
    }

    public float getTower_PAR_32m() {
        return _Tower_PAR_32m;
    }

    public void setTower_PAR_32m(float Tower_PAR_32m) {
        _Tower_PAR_32m = Tower_PAR_32m;
    }

    public float getTower_PAR_REFL_32m() {
        return _Tower_PAR_REFL_32m;
    }

    public void setTower_PAR_REFL_32m(float Tower_PAR_REFL_32m) {
        _Tower_PAR_REFL_32m = Tower_PAR_REFL_32m;
    }

    public float getTower_GLOB_32m() {
        return _Tower_GLOB_32m;
    }

    public void setTower_GLOB_32m(float Tower_GLOB_32m) {
        _Tower_GLOB_32m = Tower_GLOB_32m;
    }

    public float getTower_GLOB_REFL_32m() {
        return _Tower_GLOB_REFL_32m;
    }

    public void setTower_GLOB_REFL_32m(float Tower_GLOB_REFL_32m) {
        _Tower_GLOB_REFL_32m = Tower_GLOB_REFL_32m;
    }

    public float getTower_IR_32m() {
        return _Tower_IR_32m;
    }

    public void setTower_IR_32m(float Tower_IR_32m) {
        _Tower_IR_32m = Tower_IR_32m;
    }

    public float getTower_IR_REFL_32m() {
        return _Tower_IR_REFL_32m;
    }

    public void setTower_IR_REFL_32m(float Tower_IR_REFL_32m) {
        _Tower_IR_REFL_32m = Tower_IR_REFL_32m;
    }

    public float getTower_VT_4m() {
        return _Tower_VT_4m;
    }

    public void setTower_VT_4m(float Tower_VT_4m) {
        _Tower_VT_4m = Tower_VT_4m;
    }

    public float getTower_VT_8m() {
        return _Tower_VT_8m;
    }

    public void setTower_VT_8m(float Tower_VT_8m) {
        _Tower_VT_8m = Tower_VT_8m;
    }

    public float getTower_VT_16m() {
        return _Tower_VT_16m;
    }

    public void setTower_VT_16m(float Tower_VT_16m) {
        _Tower_VT_16m = Tower_VT_16m;
    }

    public float getTower_VT_32m() {
        return _Tower_VT_32m;
    }

    public void setTower_VT_32m(float Tower_VT_32m) {
        _Tower_VT_32m = Tower_VT_32m;
    }

    public float getO_3() {
        return _O_3;
    }

    public void setO_3(float O_3) {
        _O_3 = O_3;
    }

    public float getNO() {
        return _NO;
    }

    public void setNO(float NO) {
        _NO = NO;
    }

    public float getNO_x() {
        return _NO_x;
    }

    public void setNO_x(float NO_x) {
        _NO_x = NO_x;
    }

    public float getSO_2() {
        return _SO_2;
    }

    public void setSO_2(float SO_2) {
        _SO_2 = SO_2;
    }

    public float getCO() {
        return _CO;
    }

    public void setCO(float CO) {
        _CO = CO;
    }

    public float getTower_WS_MAX_32m() {
        return _Tower_WS_MAX_32m;
    }

    public void setTower_WS_MAX_32m(float Tower_WS_MAX_32m) {
        _Tower_WS_MAX_32m = Tower_WS_MAX_32m;
    }

    public float getTower_WS_MAX_16m() {
        return _Tower_WS_MAX_16m;
    }

    public void setTower_WS_MAX_16m(float Tower_WS_MAX_16m) {
        _Tower_WS_MAX_16m = Tower_WS_MAX_16m;
    }

    public float getTower_WS_MAX_8m() {
        return _Tower_WS_MAX_8m;
    }

    public void setTower_WS_MAX_8m(float Tower_WS_MAX_8m) {
        _Tower_WS_MAX_8m = Tower_WS_MAX_8m;
    }

    public float getTower_WS_MAX_4m() {
        return _Tower_WS_MAX_4m;
    }

    public void setTower_WS_MAX_4m(float Tower_WS_MAX_4m) {
        _Tower_WS_MAX_4m = Tower_WS_MAX_4m;
    }
}
