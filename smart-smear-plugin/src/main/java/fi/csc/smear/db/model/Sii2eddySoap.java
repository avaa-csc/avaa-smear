package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Sii2eddyServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Sii2eddyServiceSoap
 * @generated
 */
public class Sii2eddySoap implements Serializable {
    private Date _samptime;
    private float _U;
    private int _U_EMEP;
    private float _wind_dir;
    private int _wind_dir_EMEP;
    private float _eta;
    private int _eta_EMEP;
    private float _theta;
    private int _theta_EMEP;
    private float _beta;
    private int _beta_EMEP;
    private float _H;
    private int _H_EMEP;
    private float _tau;
    private int _tau_EMEP;
    private float _u_star;
    private int _u_star_EMEP;
    private float _MO_length;
    private int _MO_length_EMEP;
    private float _err_packet;
    private int _err_packet_EMEP;
    private float _F_c_LI72;
    private int _F_c_LI72_EMEP;
    private float _F_H2O_LI72;
    private int _F_H2O_LI72_EMEP;
    private float _F_CH4_LI77;
    private int _F_CH4_LI77_EMEP;
    private float _LE_LI72;
    private int _LE_LI72_EMEP;
    private float _av_u;
    private int _av_u_EMEP;
    private float _av_v;
    private int _av_v_EMEP;
    private float _av_w;
    private int _av_w_EMEP;
    private float _T_s;
    private int _T_s_EMEP;
    private float _av_c;
    private int _av_c_EMEP;
    private float _av_H2O_LI72;
    private int _av_H2O_LI72_EMEP;
    private float _av_CH4_LI77;
    private int _av_CH4_LI77_EMEP;
    private float _std_u;
    private int _std_u_EMEP;
    private float _std_v;
    private int _std_v_EMEP;
    private float _std_w;
    private int _std_w_EMEP;
    private float _std_T_s;
    private int _std_T_s_EMEP;
    private float _std_c_LI72;
    private int _std_c_LI72_EMEP;
    private float _std_H2O_LI72;
    private int _std_H2O_LI72_EMEP;
    private float _std_CH4_LI77;
    private int _std_CH4_LI77_EMEP;
    private float _c_lag_LI72;
    private int _c_lag_LI72_EMEP;
    private float _H2O_lag_LI72;
    private int _H2O_lag_LI72_EMEP;
    private float _CH4_lag_LI77;
    private int _CH4_lag_LI77_EMEP;
    private int _Qc_H;
    private int _Qc_H_EMEP;
    private int _Qc_CO2_LI70;
    private int _Qc_CO2_LI70_EMEP;
    private int _Qc_CH4_LI77;
    private int _Qc_CH4_LI77_EMEP;
    private int _Qc_LE_LI72;
    private int _Qc_LE_LI72_EMEP;
    private int _Qc_tau;
    private int _Qc_tau_EMEP;

    public Sii2eddySoap() {
    }

    public static Sii2eddySoap toSoapModel(Sii2eddy model) {
        Sii2eddySoap soapModel = new Sii2eddySoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setU(model.getU());
        soapModel.setU_EMEP(model.getU_EMEP());
        soapModel.setWind_dir(model.getWind_dir());
        soapModel.setWind_dir_EMEP(model.getWind_dir_EMEP());
        soapModel.setEta(model.getEta());
        soapModel.setEta_EMEP(model.getEta_EMEP());
        soapModel.setTheta(model.getTheta());
        soapModel.setTheta_EMEP(model.getTheta_EMEP());
        soapModel.setBeta(model.getBeta());
        soapModel.setBeta_EMEP(model.getBeta_EMEP());
        soapModel.setH(model.getH());
        soapModel.setH_EMEP(model.getH_EMEP());
        soapModel.setTau(model.getTau());
        soapModel.setTau_EMEP(model.getTau_EMEP());
        soapModel.setU_star(model.getU_star());
        soapModel.setU_star_EMEP(model.getU_star_EMEP());
        soapModel.setMO_length(model.getMO_length());
        soapModel.setMO_length_EMEP(model.getMO_length_EMEP());
        soapModel.setErr_packet(model.getErr_packet());
        soapModel.setErr_packet_EMEP(model.getErr_packet_EMEP());
        soapModel.setF_c_LI72(model.getF_c_LI72());
        soapModel.setF_c_LI72_EMEP(model.getF_c_LI72_EMEP());
        soapModel.setF_H2O_LI72(model.getF_H2O_LI72());
        soapModel.setF_H2O_LI72_EMEP(model.getF_H2O_LI72_EMEP());
        soapModel.setF_CH4_LI77(model.getF_CH4_LI77());
        soapModel.setF_CH4_LI77_EMEP(model.getF_CH4_LI77_EMEP());
        soapModel.setLE_LI72(model.getLE_LI72());
        soapModel.setLE_LI72_EMEP(model.getLE_LI72_EMEP());
        soapModel.setAv_u(model.getAv_u());
        soapModel.setAv_u_EMEP(model.getAv_u_EMEP());
        soapModel.setAv_v(model.getAv_v());
        soapModel.setAv_v_EMEP(model.getAv_v_EMEP());
        soapModel.setAv_w(model.getAv_w());
        soapModel.setAv_w_EMEP(model.getAv_w_EMEP());
        soapModel.setT_s(model.getT_s());
        soapModel.setT_s_EMEP(model.getT_s_EMEP());
        soapModel.setAv_c(model.getAv_c());
        soapModel.setAv_c_EMEP(model.getAv_c_EMEP());
        soapModel.setAv_H2O_LI72(model.getAv_H2O_LI72());
        soapModel.setAv_H2O_LI72_EMEP(model.getAv_H2O_LI72_EMEP());
        soapModel.setAv_CH4_LI77(model.getAv_CH4_LI77());
        soapModel.setAv_CH4_LI77_EMEP(model.getAv_CH4_LI77_EMEP());
        soapModel.setStd_u(model.getStd_u());
        soapModel.setStd_u_EMEP(model.getStd_u_EMEP());
        soapModel.setStd_v(model.getStd_v());
        soapModel.setStd_v_EMEP(model.getStd_v_EMEP());
        soapModel.setStd_w(model.getStd_w());
        soapModel.setStd_w_EMEP(model.getStd_w_EMEP());
        soapModel.setStd_T_s(model.getStd_T_s());
        soapModel.setStd_T_s_EMEP(model.getStd_T_s_EMEP());
        soapModel.setStd_c_LI72(model.getStd_c_LI72());
        soapModel.setStd_c_LI72_EMEP(model.getStd_c_LI72_EMEP());
        soapModel.setStd_H2O_LI72(model.getStd_H2O_LI72());
        soapModel.setStd_H2O_LI72_EMEP(model.getStd_H2O_LI72_EMEP());
        soapModel.setStd_CH4_LI77(model.getStd_CH4_LI77());
        soapModel.setStd_CH4_LI77_EMEP(model.getStd_CH4_LI77_EMEP());
        soapModel.setC_lag_LI72(model.getC_lag_LI72());
        soapModel.setC_lag_LI72_EMEP(model.getC_lag_LI72_EMEP());
        soapModel.setH2O_lag_LI72(model.getH2O_lag_LI72());
        soapModel.setH2O_lag_LI72_EMEP(model.getH2O_lag_LI72_EMEP());
        soapModel.setCH4_lag_LI77(model.getCH4_lag_LI77());
        soapModel.setCH4_lag_LI77_EMEP(model.getCH4_lag_LI77_EMEP());
        soapModel.setQc_H(model.getQc_H());
        soapModel.setQc_H_EMEP(model.getQc_H_EMEP());
        soapModel.setQc_CO2_LI70(model.getQc_CO2_LI70());
        soapModel.setQc_CO2_LI70_EMEP(model.getQc_CO2_LI70_EMEP());
        soapModel.setQc_CH4_LI77(model.getQc_CH4_LI77());
        soapModel.setQc_CH4_LI77_EMEP(model.getQc_CH4_LI77_EMEP());
        soapModel.setQc_LE_LI72(model.getQc_LE_LI72());
        soapModel.setQc_LE_LI72_EMEP(model.getQc_LE_LI72_EMEP());
        soapModel.setQc_tau(model.getQc_tau());
        soapModel.setQc_tau_EMEP(model.getQc_tau_EMEP());

        return soapModel;
    }

    public static Sii2eddySoap[] toSoapModels(Sii2eddy[] models) {
        Sii2eddySoap[] soapModels = new Sii2eddySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Sii2eddySoap[][] toSoapModels(Sii2eddy[][] models) {
        Sii2eddySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Sii2eddySoap[models.length][models[0].length];
        } else {
            soapModels = new Sii2eddySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Sii2eddySoap[] toSoapModels(List<Sii2eddy> models) {
        List<Sii2eddySoap> soapModels = new ArrayList<Sii2eddySoap>(models.size());

        for (Sii2eddy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Sii2eddySoap[soapModels.size()]);
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

    public float getEta() {
        return _eta;
    }

    public void setEta(float eta) {
        _eta = eta;
    }

    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;
    }

    public float getTheta() {
        return _theta;
    }

    public void setTheta(float theta) {
        _theta = theta;
    }

    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;
    }

    public float getBeta() {
        return _beta;
    }

    public void setBeta(float beta) {
        _beta = beta;
    }

    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;
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

    public float getErr_packet() {
        return _err_packet;
    }

    public void setErr_packet(float err_packet) {
        _err_packet = err_packet;
    }

    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;
    }

    public float getF_c_LI72() {
        return _F_c_LI72;
    }

    public void setF_c_LI72(float F_c_LI72) {
        _F_c_LI72 = F_c_LI72;
    }

    public int getF_c_LI72_EMEP() {
        return _F_c_LI72_EMEP;
    }

    public void setF_c_LI72_EMEP(int F_c_LI72_EMEP) {
        _F_c_LI72_EMEP = F_c_LI72_EMEP;
    }

    public float getF_H2O_LI72() {
        return _F_H2O_LI72;
    }

    public void setF_H2O_LI72(float F_H2O_LI72) {
        _F_H2O_LI72 = F_H2O_LI72;
    }

    public int getF_H2O_LI72_EMEP() {
        return _F_H2O_LI72_EMEP;
    }

    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP) {
        _F_H2O_LI72_EMEP = F_H2O_LI72_EMEP;
    }

    public float getF_CH4_LI77() {
        return _F_CH4_LI77;
    }

    public void setF_CH4_LI77(float F_CH4_LI77) {
        _F_CH4_LI77 = F_CH4_LI77;
    }

    public int getF_CH4_LI77_EMEP() {
        return _F_CH4_LI77_EMEP;
    }

    public void setF_CH4_LI77_EMEP(int F_CH4_LI77_EMEP) {
        _F_CH4_LI77_EMEP = F_CH4_LI77_EMEP;
    }

    public float getLE_LI72() {
        return _LE_LI72;
    }

    public void setLE_LI72(float LE_LI72) {
        _LE_LI72 = LE_LI72;
    }

    public int getLE_LI72_EMEP() {
        return _LE_LI72_EMEP;
    }

    public void setLE_LI72_EMEP(int LE_LI72_EMEP) {
        _LE_LI72_EMEP = LE_LI72_EMEP;
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

    public float getT_s() {
        return _T_s;
    }

    public void setT_s(float T_s) {
        _T_s = T_s;
    }

    public int getT_s_EMEP() {
        return _T_s_EMEP;
    }

    public void setT_s_EMEP(int T_s_EMEP) {
        _T_s_EMEP = T_s_EMEP;
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

    public float getAv_H2O_LI72() {
        return _av_H2O_LI72;
    }

    public void setAv_H2O_LI72(float av_H2O_LI72) {
        _av_H2O_LI72 = av_H2O_LI72;
    }

    public int getAv_H2O_LI72_EMEP() {
        return _av_H2O_LI72_EMEP;
    }

    public void setAv_H2O_LI72_EMEP(int av_H2O_LI72_EMEP) {
        _av_H2O_LI72_EMEP = av_H2O_LI72_EMEP;
    }

    public float getAv_CH4_LI77() {
        return _av_CH4_LI77;
    }

    public void setAv_CH4_LI77(float av_CH4_LI77) {
        _av_CH4_LI77 = av_CH4_LI77;
    }

    public int getAv_CH4_LI77_EMEP() {
        return _av_CH4_LI77_EMEP;
    }

    public void setAv_CH4_LI77_EMEP(int av_CH4_LI77_EMEP) {
        _av_CH4_LI77_EMEP = av_CH4_LI77_EMEP;
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

    public float getStd_T_s() {
        return _std_T_s;
    }

    public void setStd_T_s(float std_T_s) {
        _std_T_s = std_T_s;
    }

    public int getStd_T_s_EMEP() {
        return _std_T_s_EMEP;
    }

    public void setStd_T_s_EMEP(int std_T_s_EMEP) {
        _std_T_s_EMEP = std_T_s_EMEP;
    }

    public float getStd_c_LI72() {
        return _std_c_LI72;
    }

    public void setStd_c_LI72(float std_c_LI72) {
        _std_c_LI72 = std_c_LI72;
    }

    public int getStd_c_LI72_EMEP() {
        return _std_c_LI72_EMEP;
    }

    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP) {
        _std_c_LI72_EMEP = std_c_LI72_EMEP;
    }

    public float getStd_H2O_LI72() {
        return _std_H2O_LI72;
    }

    public void setStd_H2O_LI72(float std_H2O_LI72) {
        _std_H2O_LI72 = std_H2O_LI72;
    }

    public int getStd_H2O_LI72_EMEP() {
        return _std_H2O_LI72_EMEP;
    }

    public void setStd_H2O_LI72_EMEP(int std_H2O_LI72_EMEP) {
        _std_H2O_LI72_EMEP = std_H2O_LI72_EMEP;
    }

    public float getStd_CH4_LI77() {
        return _std_CH4_LI77;
    }

    public void setStd_CH4_LI77(float std_CH4_LI77) {
        _std_CH4_LI77 = std_CH4_LI77;
    }

    public int getStd_CH4_LI77_EMEP() {
        return _std_CH4_LI77_EMEP;
    }

    public void setStd_CH4_LI77_EMEP(int std_CH4_LI77_EMEP) {
        _std_CH4_LI77_EMEP = std_CH4_LI77_EMEP;
    }

    public float getC_lag_LI72() {
        return _c_lag_LI72;
    }

    public void setC_lag_LI72(float c_lag_LI72) {
        _c_lag_LI72 = c_lag_LI72;
    }

    public int getC_lag_LI72_EMEP() {
        return _c_lag_LI72_EMEP;
    }

    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP) {
        _c_lag_LI72_EMEP = c_lag_LI72_EMEP;
    }

    public float getH2O_lag_LI72() {
        return _H2O_lag_LI72;
    }

    public void setH2O_lag_LI72(float H2O_lag_LI72) {
        _H2O_lag_LI72 = H2O_lag_LI72;
    }

    public int getH2O_lag_LI72_EMEP() {
        return _H2O_lag_LI72_EMEP;
    }

    public void setH2O_lag_LI72_EMEP(int H2O_lag_LI72_EMEP) {
        _H2O_lag_LI72_EMEP = H2O_lag_LI72_EMEP;
    }

    public float getCH4_lag_LI77() {
        return _CH4_lag_LI77;
    }

    public void setCH4_lag_LI77(float CH4_lag_LI77) {
        _CH4_lag_LI77 = CH4_lag_LI77;
    }

    public int getCH4_lag_LI77_EMEP() {
        return _CH4_lag_LI77_EMEP;
    }

    public void setCH4_lag_LI77_EMEP(int CH4_lag_LI77_EMEP) {
        _CH4_lag_LI77_EMEP = CH4_lag_LI77_EMEP;
    }

    public int getQc_H() {
        return _Qc_H;
    }

    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;
    }

    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;
    }

    public int getQc_CO2_LI70() {
        return _Qc_CO2_LI70;
    }

    public void setQc_CO2_LI70(int Qc_CO2_LI70) {
        _Qc_CO2_LI70 = Qc_CO2_LI70;
    }

    public int getQc_CO2_LI70_EMEP() {
        return _Qc_CO2_LI70_EMEP;
    }

    public void setQc_CO2_LI70_EMEP(int Qc_CO2_LI70_EMEP) {
        _Qc_CO2_LI70_EMEP = Qc_CO2_LI70_EMEP;
    }

    public int getQc_CH4_LI77() {
        return _Qc_CH4_LI77;
    }

    public void setQc_CH4_LI77(int Qc_CH4_LI77) {
        _Qc_CH4_LI77 = Qc_CH4_LI77;
    }

    public int getQc_CH4_LI77_EMEP() {
        return _Qc_CH4_LI77_EMEP;
    }

    public void setQc_CH4_LI77_EMEP(int Qc_CH4_LI77_EMEP) {
        _Qc_CH4_LI77_EMEP = Qc_CH4_LI77_EMEP;
    }

    public int getQc_LE_LI72() {
        return _Qc_LE_LI72;
    }

    public void setQc_LE_LI72(int Qc_LE_LI72) {
        _Qc_LE_LI72 = Qc_LE_LI72;
    }

    public int getQc_LE_LI72_EMEP() {
        return _Qc_LE_LI72_EMEP;
    }

    public void setQc_LE_LI72_EMEP(int Qc_LE_LI72_EMEP) {
        _Qc_LE_LI72_EMEP = Qc_LE_LI72_EMEP;
    }

    public int getQc_tau() {
        return _Qc_tau;
    }

    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;
    }

    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;
    }
}
