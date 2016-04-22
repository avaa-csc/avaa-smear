package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.VareddyServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.VareddyServiceSoap
 * @generated
 */
public class VareddySoap implements Serializable {
    private Date _samptime;
    private float _H;
    private int _H_EMEP;
    private float _LE;
    private int _LE_EMEP;
    private float _E;
    private int _E_EMEP;
    private float _F_c;
    private int _F_c_EMEP;
    private float _tau;
    private int _tau_EMEP;
    private float _u_star;
    private int _u_star_EMEP;
    private float _MO_length;
    private int _MO_length_EMEP;
    private float _std_u;
    private int _std_u_EMEP;
    private float _std_v;
    private int _std_v_EMEP;
    private float _std_w;
    private int _std_w_EMEP;
    private float _std_t;
    private int _std_t_EMEP;
    private float _std_c;
    private int _std_c_EMEP;
    private float _std_h;
    private int _std_h_EMEP;
    private float _av_u;
    private int _av_u_EMEP;
    private float _av_v;
    private int _av_v_EMEP;
    private float _av_w;
    private int _av_w_EMEP;
    private float _av_t;
    private int _av_t_EMEP;
    private float _av_c;
    private int _av_c_EMEP;
    private float _av_h;
    private int _av_h_EMEP;
    private float _U;
    private int _U_EMEP;
    private float _wind_dir;
    private int _wind_dir_EMEP;
    private float _c_lag;
    private int _c_lag_EMEP;
    private float _h_lag;
    private int _h_lag_EMEP;
    private float _licor_t_std;
    private int _licor_t_std_EMEP;
    private float _licor_t_av;
    private int _licor_t_av_EMEP;
    private float _licor_p_std;
    private int _licor_p_std_EMEP;
    private float _licor_p_av;
    private int _licor_p_av_EMEP;
    private float _H_sub;
    private int _H_sub_EMEP;
    private float _LE_sub;
    private int _LE_sub_EMEP;
    private float _E_sub;
    private int _E_sub_EMEP;
    private float _F_c_sub;
    private int _F_c_sub_EMEP;
    private float _tau_sub;
    private int _tau_sub_EMEP;
    private float _u_star_sub;
    private int _u_star_sub_EMEP;
    private float _MO_length_sub;
    private int _MO_length_sub_EMEP;
    private float _std_u_sub;
    private int _std_u_sub_EMEP;
    private float _std_v_sub;
    private int _std_v_sub_EMEP;
    private float _std_w_sub;
    private int _std_w_sub_EMEP;
    private float _std_t_sub;
    private int _std_t_sub_EMEP;
    private float _std_c_sub;
    private int _std_c_sub_EMEP;
    private float _std_h_sub;
    private int _std_h_sub_EMEP;
    private float _av_u_sub;
    private int _av_u_sub_EMEP;
    private float _av_v_sub;
    private int _av_v_sub_EMEP;
    private float _av_w_sub;
    private int _av_w_sub_EMEP;
    private float _av_t_sub;
    private int _av_t_sub_EMEP;
    private float _av_c_sub;
    private int _av_c_sub_EMEP;
    private float _av_h_sub;
    private int _av_h_sub_EMEP;
    private float _U_sub;
    private int _U_sub_EMEP;
    private float _wind_dir_sub;
    private int _wind_dir_sub_EMEP;

    public VareddySoap() {
    }

    public static VareddySoap toSoapModel(Vareddy model) {
        VareddySoap soapModel = new VareddySoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH(model.getH());
        soapModel.setH_EMEP(model.getH_EMEP());
        soapModel.setLE(model.getLE());
        soapModel.setLE_EMEP(model.getLE_EMEP());
        soapModel.setE(model.getE());
        soapModel.setE_EMEP(model.getE_EMEP());
        soapModel.setF_c(model.getF_c());
        soapModel.setF_c_EMEP(model.getF_c_EMEP());
        soapModel.setTau(model.getTau());
        soapModel.setTau_EMEP(model.getTau_EMEP());
        soapModel.setU_star(model.getU_star());
        soapModel.setU_star_EMEP(model.getU_star_EMEP());
        soapModel.setMO_length(model.getMO_length());
        soapModel.setMO_length_EMEP(model.getMO_length_EMEP());
        soapModel.setStd_u(model.getStd_u());
        soapModel.setStd_u_EMEP(model.getStd_u_EMEP());
        soapModel.setStd_v(model.getStd_v());
        soapModel.setStd_v_EMEP(model.getStd_v_EMEP());
        soapModel.setStd_w(model.getStd_w());
        soapModel.setStd_w_EMEP(model.getStd_w_EMEP());
        soapModel.setStd_t(model.getStd_t());
        soapModel.setStd_t_EMEP(model.getStd_t_EMEP());
        soapModel.setStd_c(model.getStd_c());
        soapModel.setStd_c_EMEP(model.getStd_c_EMEP());
        soapModel.setStd_h(model.getStd_h());
        soapModel.setStd_h_EMEP(model.getStd_h_EMEP());
        soapModel.setAv_u(model.getAv_u());
        soapModel.setAv_u_EMEP(model.getAv_u_EMEP());
        soapModel.setAv_v(model.getAv_v());
        soapModel.setAv_v_EMEP(model.getAv_v_EMEP());
        soapModel.setAv_w(model.getAv_w());
        soapModel.setAv_w_EMEP(model.getAv_w_EMEP());
        soapModel.setAv_t(model.getAv_t());
        soapModel.setAv_t_EMEP(model.getAv_t_EMEP());
        soapModel.setAv_c(model.getAv_c());
        soapModel.setAv_c_EMEP(model.getAv_c_EMEP());
        soapModel.setAv_h(model.getAv_h());
        soapModel.setAv_h_EMEP(model.getAv_h_EMEP());
        soapModel.setU(model.getU());
        soapModel.setU_EMEP(model.getU_EMEP());
        soapModel.setWind_dir(model.getWind_dir());
        soapModel.setWind_dir_EMEP(model.getWind_dir_EMEP());
        soapModel.setC_lag(model.getC_lag());
        soapModel.setC_lag_EMEP(model.getC_lag_EMEP());
        soapModel.setH_lag(model.getH_lag());
        soapModel.setH_lag_EMEP(model.getH_lag_EMEP());
        soapModel.setLicor_t_std(model.getLicor_t_std());
        soapModel.setLicor_t_std_EMEP(model.getLicor_t_std_EMEP());
        soapModel.setLicor_t_av(model.getLicor_t_av());
        soapModel.setLicor_t_av_EMEP(model.getLicor_t_av_EMEP());
        soapModel.setLicor_p_std(model.getLicor_p_std());
        soapModel.setLicor_p_std_EMEP(model.getLicor_p_std_EMEP());
        soapModel.setLicor_p_av(model.getLicor_p_av());
        soapModel.setLicor_p_av_EMEP(model.getLicor_p_av_EMEP());
        soapModel.setH_sub(model.getH_sub());
        soapModel.setH_sub_EMEP(model.getH_sub_EMEP());
        soapModel.setLE_sub(model.getLE_sub());
        soapModel.setLE_sub_EMEP(model.getLE_sub_EMEP());
        soapModel.setE_sub(model.getE_sub());
        soapModel.setE_sub_EMEP(model.getE_sub_EMEP());
        soapModel.setF_c_sub(model.getF_c_sub());
        soapModel.setF_c_sub_EMEP(model.getF_c_sub_EMEP());
        soapModel.setTau_sub(model.getTau_sub());
        soapModel.setTau_sub_EMEP(model.getTau_sub_EMEP());
        soapModel.setU_star_sub(model.getU_star_sub());
        soapModel.setU_star_sub_EMEP(model.getU_star_sub_EMEP());
        soapModel.setMO_length_sub(model.getMO_length_sub());
        soapModel.setMO_length_sub_EMEP(model.getMO_length_sub_EMEP());
        soapModel.setStd_u_sub(model.getStd_u_sub());
        soapModel.setStd_u_sub_EMEP(model.getStd_u_sub_EMEP());
        soapModel.setStd_v_sub(model.getStd_v_sub());
        soapModel.setStd_v_sub_EMEP(model.getStd_v_sub_EMEP());
        soapModel.setStd_w_sub(model.getStd_w_sub());
        soapModel.setStd_w_sub_EMEP(model.getStd_w_sub_EMEP());
        soapModel.setStd_t_sub(model.getStd_t_sub());
        soapModel.setStd_t_sub_EMEP(model.getStd_t_sub_EMEP());
        soapModel.setStd_c_sub(model.getStd_c_sub());
        soapModel.setStd_c_sub_EMEP(model.getStd_c_sub_EMEP());
        soapModel.setStd_h_sub(model.getStd_h_sub());
        soapModel.setStd_h_sub_EMEP(model.getStd_h_sub_EMEP());
        soapModel.setAv_u_sub(model.getAv_u_sub());
        soapModel.setAv_u_sub_EMEP(model.getAv_u_sub_EMEP());
        soapModel.setAv_v_sub(model.getAv_v_sub());
        soapModel.setAv_v_sub_EMEP(model.getAv_v_sub_EMEP());
        soapModel.setAv_w_sub(model.getAv_w_sub());
        soapModel.setAv_w_sub_EMEP(model.getAv_w_sub_EMEP());
        soapModel.setAv_t_sub(model.getAv_t_sub());
        soapModel.setAv_t_sub_EMEP(model.getAv_t_sub_EMEP());
        soapModel.setAv_c_sub(model.getAv_c_sub());
        soapModel.setAv_c_sub_EMEP(model.getAv_c_sub_EMEP());
        soapModel.setAv_h_sub(model.getAv_h_sub());
        soapModel.setAv_h_sub_EMEP(model.getAv_h_sub_EMEP());
        soapModel.setU_sub(model.getU_sub());
        soapModel.setU_sub_EMEP(model.getU_sub_EMEP());
        soapModel.setWind_dir_sub(model.getWind_dir_sub());
        soapModel.setWind_dir_sub_EMEP(model.getWind_dir_sub_EMEP());

        return soapModel;
    }

    public static VareddySoap[] toSoapModels(Vareddy[] models) {
        VareddySoap[] soapModels = new VareddySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VareddySoap[][] toSoapModels(Vareddy[][] models) {
        VareddySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VareddySoap[models.length][models[0].length];
        } else {
            soapModels = new VareddySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VareddySoap[] toSoapModels(List<Vareddy> models) {
        List<VareddySoap> soapModels = new ArrayList<VareddySoap>(models.size());

        for (Vareddy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VareddySoap[soapModels.size()]);
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

    public float getH() {
        return _H;
    }

    public void setH(float H) {
        _H = H;
    }

    public int getH_EMEP() {
        return _H_EMEP;
    }

    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;
    }

    public float getLE() {
        return _LE;
    }

    public void setLE(float LE) {
        _LE = LE;
    }

    public int getLE_EMEP() {
        return _LE_EMEP;
    }

    public void setLE_EMEP(int LE_EMEP) {
        _LE_EMEP = LE_EMEP;
    }

    public float getE() {
        return _E;
    }

    public void setE(float E) {
        _E = E;
    }

    public int getE_EMEP() {
        return _E_EMEP;
    }

    public void setE_EMEP(int E_EMEP) {
        _E_EMEP = E_EMEP;
    }

    public float getF_c() {
        return _F_c;
    }

    public void setF_c(float F_c) {
        _F_c = F_c;
    }

    public int getF_c_EMEP() {
        return _F_c_EMEP;
    }

    public void setF_c_EMEP(int F_c_EMEP) {
        _F_c_EMEP = F_c_EMEP;
    }

    public float getTau() {
        return _tau;
    }

    public void setTau(float tau) {
        _tau = tau;
    }

    public int getTau_EMEP() {
        return _tau_EMEP;
    }

    public void setTau_EMEP(int tau_EMEP) {
        _tau_EMEP = tau_EMEP;
    }

    public float getU_star() {
        return _u_star;
    }

    public void setU_star(float u_star) {
        _u_star = u_star;
    }

    public int getU_star_EMEP() {
        return _u_star_EMEP;
    }

    public void setU_star_EMEP(int u_star_EMEP) {
        _u_star_EMEP = u_star_EMEP;
    }

    public float getMO_length() {
        return _MO_length;
    }

    public void setMO_length(float MO_length) {
        _MO_length = MO_length;
    }

    public int getMO_length_EMEP() {
        return _MO_length_EMEP;
    }

    public void setMO_length_EMEP(int MO_length_EMEP) {
        _MO_length_EMEP = MO_length_EMEP;
    }

    public float getStd_u() {
        return _std_u;
    }

    public void setStd_u(float std_u) {
        _std_u = std_u;
    }

    public int getStd_u_EMEP() {
        return _std_u_EMEP;
    }

    public void setStd_u_EMEP(int std_u_EMEP) {
        _std_u_EMEP = std_u_EMEP;
    }

    public float getStd_v() {
        return _std_v;
    }

    public void setStd_v(float std_v) {
        _std_v = std_v;
    }

    public int getStd_v_EMEP() {
        return _std_v_EMEP;
    }

    public void setStd_v_EMEP(int std_v_EMEP) {
        _std_v_EMEP = std_v_EMEP;
    }

    public float getStd_w() {
        return _std_w;
    }

    public void setStd_w(float std_w) {
        _std_w = std_w;
    }

    public int getStd_w_EMEP() {
        return _std_w_EMEP;
    }

    public void setStd_w_EMEP(int std_w_EMEP) {
        _std_w_EMEP = std_w_EMEP;
    }

    public float getStd_t() {
        return _std_t;
    }

    public void setStd_t(float std_t) {
        _std_t = std_t;
    }

    public int getStd_t_EMEP() {
        return _std_t_EMEP;
    }

    public void setStd_t_EMEP(int std_t_EMEP) {
        _std_t_EMEP = std_t_EMEP;
    }

    public float getStd_c() {
        return _std_c;
    }

    public void setStd_c(float std_c) {
        _std_c = std_c;
    }

    public int getStd_c_EMEP() {
        return _std_c_EMEP;
    }

    public void setStd_c_EMEP(int std_c_EMEP) {
        _std_c_EMEP = std_c_EMEP;
    }

    public float getStd_h() {
        return _std_h;
    }

    public void setStd_h(float std_h) {
        _std_h = std_h;
    }

    public int getStd_h_EMEP() {
        return _std_h_EMEP;
    }

    public void setStd_h_EMEP(int std_h_EMEP) {
        _std_h_EMEP = std_h_EMEP;
    }

    public float getAv_u() {
        return _av_u;
    }

    public void setAv_u(float av_u) {
        _av_u = av_u;
    }

    public int getAv_u_EMEP() {
        return _av_u_EMEP;
    }

    public void setAv_u_EMEP(int av_u_EMEP) {
        _av_u_EMEP = av_u_EMEP;
    }

    public float getAv_v() {
        return _av_v;
    }

    public void setAv_v(float av_v) {
        _av_v = av_v;
    }

    public int getAv_v_EMEP() {
        return _av_v_EMEP;
    }

    public void setAv_v_EMEP(int av_v_EMEP) {
        _av_v_EMEP = av_v_EMEP;
    }

    public float getAv_w() {
        return _av_w;
    }

    public void setAv_w(float av_w) {
        _av_w = av_w;
    }

    public int getAv_w_EMEP() {
        return _av_w_EMEP;
    }

    public void setAv_w_EMEP(int av_w_EMEP) {
        _av_w_EMEP = av_w_EMEP;
    }

    public float getAv_t() {
        return _av_t;
    }

    public void setAv_t(float av_t) {
        _av_t = av_t;
    }

    public int getAv_t_EMEP() {
        return _av_t_EMEP;
    }

    public void setAv_t_EMEP(int av_t_EMEP) {
        _av_t_EMEP = av_t_EMEP;
    }

    public float getAv_c() {
        return _av_c;
    }

    public void setAv_c(float av_c) {
        _av_c = av_c;
    }

    public int getAv_c_EMEP() {
        return _av_c_EMEP;
    }

    public void setAv_c_EMEP(int av_c_EMEP) {
        _av_c_EMEP = av_c_EMEP;
    }

    public float getAv_h() {
        return _av_h;
    }

    public void setAv_h(float av_h) {
        _av_h = av_h;
    }

    public int getAv_h_EMEP() {
        return _av_h_EMEP;
    }

    public void setAv_h_EMEP(int av_h_EMEP) {
        _av_h_EMEP = av_h_EMEP;
    }

    public float getU() {
        return _U;
    }

    public void setU(float U) {
        _U = U;
    }

    public int getU_EMEP() {
        return _U_EMEP;
    }

    public void setU_EMEP(int U_EMEP) {
        _U_EMEP = U_EMEP;
    }

    public float getWind_dir() {
        return _wind_dir;
    }

    public void setWind_dir(float wind_dir) {
        _wind_dir = wind_dir;
    }

    public int getWind_dir_EMEP() {
        return _wind_dir_EMEP;
    }

    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _wind_dir_EMEP = wind_dir_EMEP;
    }

    public float getC_lag() {
        return _c_lag;
    }

    public void setC_lag(float c_lag) {
        _c_lag = c_lag;
    }

    public int getC_lag_EMEP() {
        return _c_lag_EMEP;
    }

    public void setC_lag_EMEP(int c_lag_EMEP) {
        _c_lag_EMEP = c_lag_EMEP;
    }

    public float getH_lag() {
        return _h_lag;
    }

    public void setH_lag(float h_lag) {
        _h_lag = h_lag;
    }

    public int getH_lag_EMEP() {
        return _h_lag_EMEP;
    }

    public void setH_lag_EMEP(int h_lag_EMEP) {
        _h_lag_EMEP = h_lag_EMEP;
    }

    public float getLicor_t_std() {
        return _licor_t_std;
    }

    public void setLicor_t_std(float licor_t_std) {
        _licor_t_std = licor_t_std;
    }

    public int getLicor_t_std_EMEP() {
        return _licor_t_std_EMEP;
    }

    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _licor_t_std_EMEP = licor_t_std_EMEP;
    }

    public float getLicor_t_av() {
        return _licor_t_av;
    }

    public void setLicor_t_av(float licor_t_av) {
        _licor_t_av = licor_t_av;
    }

    public int getLicor_t_av_EMEP() {
        return _licor_t_av_EMEP;
    }

    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _licor_t_av_EMEP = licor_t_av_EMEP;
    }

    public float getLicor_p_std() {
        return _licor_p_std;
    }

    public void setLicor_p_std(float licor_p_std) {
        _licor_p_std = licor_p_std;
    }

    public int getLicor_p_std_EMEP() {
        return _licor_p_std_EMEP;
    }

    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _licor_p_std_EMEP = licor_p_std_EMEP;
    }

    public float getLicor_p_av() {
        return _licor_p_av;
    }

    public void setLicor_p_av(float licor_p_av) {
        _licor_p_av = licor_p_av;
    }

    public int getLicor_p_av_EMEP() {
        return _licor_p_av_EMEP;
    }

    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _licor_p_av_EMEP = licor_p_av_EMEP;
    }

    public float getH_sub() {
        return _H_sub;
    }

    public void setH_sub(float H_sub) {
        _H_sub = H_sub;
    }

    public int getH_sub_EMEP() {
        return _H_sub_EMEP;
    }

    public void setH_sub_EMEP(int H_sub_EMEP) {
        _H_sub_EMEP = H_sub_EMEP;
    }

    public float getLE_sub() {
        return _LE_sub;
    }

    public void setLE_sub(float LE_sub) {
        _LE_sub = LE_sub;
    }

    public int getLE_sub_EMEP() {
        return _LE_sub_EMEP;
    }

    public void setLE_sub_EMEP(int LE_sub_EMEP) {
        _LE_sub_EMEP = LE_sub_EMEP;
    }

    public float getE_sub() {
        return _E_sub;
    }

    public void setE_sub(float E_sub) {
        _E_sub = E_sub;
    }

    public int getE_sub_EMEP() {
        return _E_sub_EMEP;
    }

    public void setE_sub_EMEP(int E_sub_EMEP) {
        _E_sub_EMEP = E_sub_EMEP;
    }

    public float getF_c_sub() {
        return _F_c_sub;
    }

    public void setF_c_sub(float F_c_sub) {
        _F_c_sub = F_c_sub;
    }

    public int getF_c_sub_EMEP() {
        return _F_c_sub_EMEP;
    }

    public void setF_c_sub_EMEP(int F_c_sub_EMEP) {
        _F_c_sub_EMEP = F_c_sub_EMEP;
    }

    public float getTau_sub() {
        return _tau_sub;
    }

    public void setTau_sub(float tau_sub) {
        _tau_sub = tau_sub;
    }

    public int getTau_sub_EMEP() {
        return _tau_sub_EMEP;
    }

    public void setTau_sub_EMEP(int tau_sub_EMEP) {
        _tau_sub_EMEP = tau_sub_EMEP;
    }

    public float getU_star_sub() {
        return _u_star_sub;
    }

    public void setU_star_sub(float u_star_sub) {
        _u_star_sub = u_star_sub;
    }

    public int getU_star_sub_EMEP() {
        return _u_star_sub_EMEP;
    }

    public void setU_star_sub_EMEP(int u_star_sub_EMEP) {
        _u_star_sub_EMEP = u_star_sub_EMEP;
    }

    public float getMO_length_sub() {
        return _MO_length_sub;
    }

    public void setMO_length_sub(float MO_length_sub) {
        _MO_length_sub = MO_length_sub;
    }

    public int getMO_length_sub_EMEP() {
        return _MO_length_sub_EMEP;
    }

    public void setMO_length_sub_EMEP(int MO_length_sub_EMEP) {
        _MO_length_sub_EMEP = MO_length_sub_EMEP;
    }

    public float getStd_u_sub() {
        return _std_u_sub;
    }

    public void setStd_u_sub(float std_u_sub) {
        _std_u_sub = std_u_sub;
    }

    public int getStd_u_sub_EMEP() {
        return _std_u_sub_EMEP;
    }

    public void setStd_u_sub_EMEP(int std_u_sub_EMEP) {
        _std_u_sub_EMEP = std_u_sub_EMEP;
    }

    public float getStd_v_sub() {
        return _std_v_sub;
    }

    public void setStd_v_sub(float std_v_sub) {
        _std_v_sub = std_v_sub;
    }

    public int getStd_v_sub_EMEP() {
        return _std_v_sub_EMEP;
    }

    public void setStd_v_sub_EMEP(int std_v_sub_EMEP) {
        _std_v_sub_EMEP = std_v_sub_EMEP;
    }

    public float getStd_w_sub() {
        return _std_w_sub;
    }

    public void setStd_w_sub(float std_w_sub) {
        _std_w_sub = std_w_sub;
    }

    public int getStd_w_sub_EMEP() {
        return _std_w_sub_EMEP;
    }

    public void setStd_w_sub_EMEP(int std_w_sub_EMEP) {
        _std_w_sub_EMEP = std_w_sub_EMEP;
    }

    public float getStd_t_sub() {
        return _std_t_sub;
    }

    public void setStd_t_sub(float std_t_sub) {
        _std_t_sub = std_t_sub;
    }

    public int getStd_t_sub_EMEP() {
        return _std_t_sub_EMEP;
    }

    public void setStd_t_sub_EMEP(int std_t_sub_EMEP) {
        _std_t_sub_EMEP = std_t_sub_EMEP;
    }

    public float getStd_c_sub() {
        return _std_c_sub;
    }

    public void setStd_c_sub(float std_c_sub) {
        _std_c_sub = std_c_sub;
    }

    public int getStd_c_sub_EMEP() {
        return _std_c_sub_EMEP;
    }

    public void setStd_c_sub_EMEP(int std_c_sub_EMEP) {
        _std_c_sub_EMEP = std_c_sub_EMEP;
    }

    public float getStd_h_sub() {
        return _std_h_sub;
    }

    public void setStd_h_sub(float std_h_sub) {
        _std_h_sub = std_h_sub;
    }

    public int getStd_h_sub_EMEP() {
        return _std_h_sub_EMEP;
    }

    public void setStd_h_sub_EMEP(int std_h_sub_EMEP) {
        _std_h_sub_EMEP = std_h_sub_EMEP;
    }

    public float getAv_u_sub() {
        return _av_u_sub;
    }

    public void setAv_u_sub(float av_u_sub) {
        _av_u_sub = av_u_sub;
    }

    public int getAv_u_sub_EMEP() {
        return _av_u_sub_EMEP;
    }

    public void setAv_u_sub_EMEP(int av_u_sub_EMEP) {
        _av_u_sub_EMEP = av_u_sub_EMEP;
    }

    public float getAv_v_sub() {
        return _av_v_sub;
    }

    public void setAv_v_sub(float av_v_sub) {
        _av_v_sub = av_v_sub;
    }

    public int getAv_v_sub_EMEP() {
        return _av_v_sub_EMEP;
    }

    public void setAv_v_sub_EMEP(int av_v_sub_EMEP) {
        _av_v_sub_EMEP = av_v_sub_EMEP;
    }

    public float getAv_w_sub() {
        return _av_w_sub;
    }

    public void setAv_w_sub(float av_w_sub) {
        _av_w_sub = av_w_sub;
    }

    public int getAv_w_sub_EMEP() {
        return _av_w_sub_EMEP;
    }

    public void setAv_w_sub_EMEP(int av_w_sub_EMEP) {
        _av_w_sub_EMEP = av_w_sub_EMEP;
    }

    public float getAv_t_sub() {
        return _av_t_sub;
    }

    public void setAv_t_sub(float av_t_sub) {
        _av_t_sub = av_t_sub;
    }

    public int getAv_t_sub_EMEP() {
        return _av_t_sub_EMEP;
    }

    public void setAv_t_sub_EMEP(int av_t_sub_EMEP) {
        _av_t_sub_EMEP = av_t_sub_EMEP;
    }

    public float getAv_c_sub() {
        return _av_c_sub;
    }

    public void setAv_c_sub(float av_c_sub) {
        _av_c_sub = av_c_sub;
    }

    public int getAv_c_sub_EMEP() {
        return _av_c_sub_EMEP;
    }

    public void setAv_c_sub_EMEP(int av_c_sub_EMEP) {
        _av_c_sub_EMEP = av_c_sub_EMEP;
    }

    public float getAv_h_sub() {
        return _av_h_sub;
    }

    public void setAv_h_sub(float av_h_sub) {
        _av_h_sub = av_h_sub;
    }

    public int getAv_h_sub_EMEP() {
        return _av_h_sub_EMEP;
    }

    public void setAv_h_sub_EMEP(int av_h_sub_EMEP) {
        _av_h_sub_EMEP = av_h_sub_EMEP;
    }

    public float getU_sub() {
        return _U_sub;
    }

    public void setU_sub(float U_sub) {
        _U_sub = U_sub;
    }

    public int getU_sub_EMEP() {
        return _U_sub_EMEP;
    }

    public void setU_sub_EMEP(int U_sub_EMEP) {
        _U_sub_EMEP = U_sub_EMEP;
    }

    public float getWind_dir_sub() {
        return _wind_dir_sub;
    }

    public void setWind_dir_sub(float wind_dir_sub) {
        _wind_dir_sub = wind_dir_sub;
    }

    public int getWind_dir_sub_EMEP() {
        return _wind_dir_sub_EMEP;
    }

    public void setWind_dir_sub_EMEP(int wind_dir_sub_EMEP) {
        _wind_dir_sub_EMEP = wind_dir_sub_EMEP;
    }
}
