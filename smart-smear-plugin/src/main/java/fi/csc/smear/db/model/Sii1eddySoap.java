package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Sii1eddyServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Sii1eddyServiceSoap
 * @generated
 */
public class Sii1eddySoap implements Serializable {
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
    private float _F_c_LI70;
    private int _F_c_LI70_EMEP;
    private float _F_H2O_LI70;
    private int _F_H2O_LI70_EMEP;
    private float _F_CH4_LGR;
    private int _F_CH4_LGR_EMEP;
    private float _F_CH4_TGA;
    private int _F_CH4_TGA_EMEP;
    private float _F_H2O_PIC;
    private int _F_H2O_PIC_EMEP;
    private float _F_CH4_PIC;
    private int _F_CH4_PIC_EMEP;
    private float _LE_LI70;
    private int _LE_LI70_EMEP;
    private float _LE_PIC;
    private int _LE_PIC_EMEP;
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
    private float _av_H2O_LI70;
    private int _av_H2O_LI70_EMEP;
    private float _av_CH4_LGR;
    private int _av_CH4_LGR_EMEP;
    private float _av_CH4_TGA;
    private int _av_CH4_TGA_EMEP;
    private float _av_H2O_PIC;
    private int _av_H2O_PIC_EMEP;
    private float _av_CH4_PIC;
    private int _av_CH4_PIC_EMEP;
    private float _std_u;
    private int _std_u_EMEP;
    private float _std_v;
    private int _std_v_EMEP;
    private float _std_w;
    private int _std_w_EMEP;
    private float _std_T_s;
    private int _std_T_s_EMEP;
    private float _std_c_LI70;
    private int _std_c_LI70_EMEP;
    private float _std_H2O_LI70;
    private int _std_H2O_LI70_EMEP;
    private float _std_CH4_LGR;
    private int _std_CH4_LGR_EMEP;
    private float _std_CH4_TGA;
    private int _std_CH4_TGA_EMEP;
    private float _std_H2O_PIC;
    private int _std_H2O_PIC_EMEP;
    private float _std_CH4_PIC;
    private int _std_CH4_PIC_EMEP;
    private float _c_lag_LI70;
    private int _c_lag_LI70_EMEP;
    private float _H2O_lag_LI70;
    private int _H2O_lag_LI70_EMEP;
    private float _CH4_lag_LGR;
    private int _CH4_lag_LGR_EMEP;
    private float _CH4_lag_TGA;
    private int _CH4_lag_TGA_EMEP;
    private float _H2O_lag_PIC;
    private int _H2O_lag_PIC_EMEP;
    private float _CH4_lag_PIC;
    private int _CH4_lag_PIC_EMEP;
    private int _Qc_H;
    private int _Qc_H_EMEP;
    private int _Qc_CO2_LI70;
    private int _Qc_CO2_LI70_EMEP;
    private int _Qc_CH4_LGR;
    private int _Qc_CH4_LGR_EMEP;
    private int _Qc_CH4_TGA;
    private int _Qc_CH4_TGA_EMEP;
    private int _Qc_CH4_PIC;
    private int _Qc_CH4_PIC_EMEP;
    private int _Qc_LE_LI70;
    private int _Qc_LE_LI70_EMEP;
    private int _Qc_LE_PIC;
    private int _Qc_LE_PIC_EMEP;
    private int _Qc_tau;
    private int _Qc_tau_EMEP;

    public Sii1eddySoap() {
    }

    public static Sii1eddySoap toSoapModel(Sii1eddy model) {
        Sii1eddySoap soapModel = new Sii1eddySoap();

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
        soapModel.setF_c_LI70(model.getF_c_LI70());
        soapModel.setF_c_LI70_EMEP(model.getF_c_LI70_EMEP());
        soapModel.setF_H2O_LI70(model.getF_H2O_LI70());
        soapModel.setF_H2O_LI70_EMEP(model.getF_H2O_LI70_EMEP());
        soapModel.setF_CH4_LGR(model.getF_CH4_LGR());
        soapModel.setF_CH4_LGR_EMEP(model.getF_CH4_LGR_EMEP());
        soapModel.setF_CH4_TGA(model.getF_CH4_TGA());
        soapModel.setF_CH4_TGA_EMEP(model.getF_CH4_TGA_EMEP());
        soapModel.setF_H2O_PIC(model.getF_H2O_PIC());
        soapModel.setF_H2O_PIC_EMEP(model.getF_H2O_PIC_EMEP());
        soapModel.setF_CH4_PIC(model.getF_CH4_PIC());
        soapModel.setF_CH4_PIC_EMEP(model.getF_CH4_PIC_EMEP());
        soapModel.setLE_LI70(model.getLE_LI70());
        soapModel.setLE_LI70_EMEP(model.getLE_LI70_EMEP());
        soapModel.setLE_PIC(model.getLE_PIC());
        soapModel.setLE_PIC_EMEP(model.getLE_PIC_EMEP());
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
        soapModel.setAv_H2O_LI70(model.getAv_H2O_LI70());
        soapModel.setAv_H2O_LI70_EMEP(model.getAv_H2O_LI70_EMEP());
        soapModel.setAv_CH4_LGR(model.getAv_CH4_LGR());
        soapModel.setAv_CH4_LGR_EMEP(model.getAv_CH4_LGR_EMEP());
        soapModel.setAv_CH4_TGA(model.getAv_CH4_TGA());
        soapModel.setAv_CH4_TGA_EMEP(model.getAv_CH4_TGA_EMEP());
        soapModel.setAv_H2O_PIC(model.getAv_H2O_PIC());
        soapModel.setAv_H2O_PIC_EMEP(model.getAv_H2O_PIC_EMEP());
        soapModel.setAv_CH4_PIC(model.getAv_CH4_PIC());
        soapModel.setAv_CH4_PIC_EMEP(model.getAv_CH4_PIC_EMEP());
        soapModel.setStd_u(model.getStd_u());
        soapModel.setStd_u_EMEP(model.getStd_u_EMEP());
        soapModel.setStd_v(model.getStd_v());
        soapModel.setStd_v_EMEP(model.getStd_v_EMEP());
        soapModel.setStd_w(model.getStd_w());
        soapModel.setStd_w_EMEP(model.getStd_w_EMEP());
        soapModel.setStd_T_s(model.getStd_T_s());
        soapModel.setStd_T_s_EMEP(model.getStd_T_s_EMEP());
        soapModel.setStd_c_LI70(model.getStd_c_LI70());
        soapModel.setStd_c_LI70_EMEP(model.getStd_c_LI70_EMEP());
        soapModel.setStd_H2O_LI70(model.getStd_H2O_LI70());
        soapModel.setStd_H2O_LI70_EMEP(model.getStd_H2O_LI70_EMEP());
        soapModel.setStd_CH4_LGR(model.getStd_CH4_LGR());
        soapModel.setStd_CH4_LGR_EMEP(model.getStd_CH4_LGR_EMEP());
        soapModel.setStd_CH4_TGA(model.getStd_CH4_TGA());
        soapModel.setStd_CH4_TGA_EMEP(model.getStd_CH4_TGA_EMEP());
        soapModel.setStd_H2O_PIC(model.getStd_H2O_PIC());
        soapModel.setStd_H2O_PIC_EMEP(model.getStd_H2O_PIC_EMEP());
        soapModel.setStd_CH4_PIC(model.getStd_CH4_PIC());
        soapModel.setStd_CH4_PIC_EMEP(model.getStd_CH4_PIC_EMEP());
        soapModel.setC_lag_LI70(model.getC_lag_LI70());
        soapModel.setC_lag_LI70_EMEP(model.getC_lag_LI70_EMEP());
        soapModel.setH2O_lag_LI70(model.getH2O_lag_LI70());
        soapModel.setH2O_lag_LI70_EMEP(model.getH2O_lag_LI70_EMEP());
        soapModel.setCH4_lag_LGR(model.getCH4_lag_LGR());
        soapModel.setCH4_lag_LGR_EMEP(model.getCH4_lag_LGR_EMEP());
        soapModel.setCH4_lag_TGA(model.getCH4_lag_TGA());
        soapModel.setCH4_lag_TGA_EMEP(model.getCH4_lag_TGA_EMEP());
        soapModel.setH2O_lag_PIC(model.getH2O_lag_PIC());
        soapModel.setH2O_lag_PIC_EMEP(model.getH2O_lag_PIC_EMEP());
        soapModel.setCH4_lag_PIC(model.getCH4_lag_PIC());
        soapModel.setCH4_lag_PIC_EMEP(model.getCH4_lag_PIC_EMEP());
        soapModel.setQc_H(model.getQc_H());
        soapModel.setQc_H_EMEP(model.getQc_H_EMEP());
        soapModel.setQc_CO2_LI70(model.getQc_CO2_LI70());
        soapModel.setQc_CO2_LI70_EMEP(model.getQc_CO2_LI70_EMEP());
        soapModel.setQc_CH4_LGR(model.getQc_CH4_LGR());
        soapModel.setQc_CH4_LGR_EMEP(model.getQc_CH4_LGR_EMEP());
        soapModel.setQc_CH4_TGA(model.getQc_CH4_TGA());
        soapModel.setQc_CH4_TGA_EMEP(model.getQc_CH4_TGA_EMEP());
        soapModel.setQc_CH4_PIC(model.getQc_CH4_PIC());
        soapModel.setQc_CH4_PIC_EMEP(model.getQc_CH4_PIC_EMEP());
        soapModel.setQc_LE_LI70(model.getQc_LE_LI70());
        soapModel.setQc_LE_LI70_EMEP(model.getQc_LE_LI70_EMEP());
        soapModel.setQc_LE_PIC(model.getQc_LE_PIC());
        soapModel.setQc_LE_PIC_EMEP(model.getQc_LE_PIC_EMEP());
        soapModel.setQc_tau(model.getQc_tau());
        soapModel.setQc_tau_EMEP(model.getQc_tau_EMEP());

        return soapModel;
    }

    public static Sii1eddySoap[] toSoapModels(Sii1eddy[] models) {
        Sii1eddySoap[] soapModels = new Sii1eddySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Sii1eddySoap[][] toSoapModels(Sii1eddy[][] models) {
        Sii1eddySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Sii1eddySoap[models.length][models[0].length];
        } else {
            soapModels = new Sii1eddySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Sii1eddySoap[] toSoapModels(List<Sii1eddy> models) {
        List<Sii1eddySoap> soapModels = new ArrayList<Sii1eddySoap>(models.size());

        for (Sii1eddy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Sii1eddySoap[soapModels.size()]);
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

    public float getF_c_LI70() {
        return _F_c_LI70;
    }

    public void setF_c_LI70(float F_c_LI70) {
        _F_c_LI70 = F_c_LI70;
    }

    public int getF_c_LI70_EMEP() {
        return _F_c_LI70_EMEP;
    }

    public void setF_c_LI70_EMEP(int F_c_LI70_EMEP) {
        _F_c_LI70_EMEP = F_c_LI70_EMEP;
    }

    public float getF_H2O_LI70() {
        return _F_H2O_LI70;
    }

    public void setF_H2O_LI70(float F_H2O_LI70) {
        _F_H2O_LI70 = F_H2O_LI70;
    }

    public int getF_H2O_LI70_EMEP() {
        return _F_H2O_LI70_EMEP;
    }

    public void setF_H2O_LI70_EMEP(int F_H2O_LI70_EMEP) {
        _F_H2O_LI70_EMEP = F_H2O_LI70_EMEP;
    }

    public float getF_CH4_LGR() {
        return _F_CH4_LGR;
    }

    public void setF_CH4_LGR(float F_CH4_LGR) {
        _F_CH4_LGR = F_CH4_LGR;
    }

    public int getF_CH4_LGR_EMEP() {
        return _F_CH4_LGR_EMEP;
    }

    public void setF_CH4_LGR_EMEP(int F_CH4_LGR_EMEP) {
        _F_CH4_LGR_EMEP = F_CH4_LGR_EMEP;
    }

    public float getF_CH4_TGA() {
        return _F_CH4_TGA;
    }

    public void setF_CH4_TGA(float F_CH4_TGA) {
        _F_CH4_TGA = F_CH4_TGA;
    }

    public int getF_CH4_TGA_EMEP() {
        return _F_CH4_TGA_EMEP;
    }

    public void setF_CH4_TGA_EMEP(int F_CH4_TGA_EMEP) {
        _F_CH4_TGA_EMEP = F_CH4_TGA_EMEP;
    }

    public float getF_H2O_PIC() {
        return _F_H2O_PIC;
    }

    public void setF_H2O_PIC(float F_H2O_PIC) {
        _F_H2O_PIC = F_H2O_PIC;
    }

    public int getF_H2O_PIC_EMEP() {
        return _F_H2O_PIC_EMEP;
    }

    public void setF_H2O_PIC_EMEP(int F_H2O_PIC_EMEP) {
        _F_H2O_PIC_EMEP = F_H2O_PIC_EMEP;
    }

    public float getF_CH4_PIC() {
        return _F_CH4_PIC;
    }

    public void setF_CH4_PIC(float F_CH4_PIC) {
        _F_CH4_PIC = F_CH4_PIC;
    }

    public int getF_CH4_PIC_EMEP() {
        return _F_CH4_PIC_EMEP;
    }

    public void setF_CH4_PIC_EMEP(int F_CH4_PIC_EMEP) {
        _F_CH4_PIC_EMEP = F_CH4_PIC_EMEP;
    }

    public float getLE_LI70() {
        return _LE_LI70;
    }

    public void setLE_LI70(float LE_LI70) {
        _LE_LI70 = LE_LI70;
    }

    public int getLE_LI70_EMEP() {
        return _LE_LI70_EMEP;
    }

    public void setLE_LI70_EMEP(int LE_LI70_EMEP) {
        _LE_LI70_EMEP = LE_LI70_EMEP;
    }

    public float getLE_PIC() {
        return _LE_PIC;
    }

    public void setLE_PIC(float LE_PIC) {
        _LE_PIC = LE_PIC;
    }

    public int getLE_PIC_EMEP() {
        return _LE_PIC_EMEP;
    }

    public void setLE_PIC_EMEP(int LE_PIC_EMEP) {
        _LE_PIC_EMEP = LE_PIC_EMEP;
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

    public float getAv_H2O_LI70() {
        return _av_H2O_LI70;
    }

    public void setAv_H2O_LI70(float av_H2O_LI70) {
        _av_H2O_LI70 = av_H2O_LI70;
    }

    public int getAv_H2O_LI70_EMEP() {
        return _av_H2O_LI70_EMEP;
    }

    public void setAv_H2O_LI70_EMEP(int av_H2O_LI70_EMEP) {
        _av_H2O_LI70_EMEP = av_H2O_LI70_EMEP;
    }

    public float getAv_CH4_LGR() {
        return _av_CH4_LGR;
    }

    public void setAv_CH4_LGR(float av_CH4_LGR) {
        _av_CH4_LGR = av_CH4_LGR;
    }

    public int getAv_CH4_LGR_EMEP() {
        return _av_CH4_LGR_EMEP;
    }

    public void setAv_CH4_LGR_EMEP(int av_CH4_LGR_EMEP) {
        _av_CH4_LGR_EMEP = av_CH4_LGR_EMEP;
    }

    public float getAv_CH4_TGA() {
        return _av_CH4_TGA;
    }

    public void setAv_CH4_TGA(float av_CH4_TGA) {
        _av_CH4_TGA = av_CH4_TGA;
    }

    public int getAv_CH4_TGA_EMEP() {
        return _av_CH4_TGA_EMEP;
    }

    public void setAv_CH4_TGA_EMEP(int av_CH4_TGA_EMEP) {
        _av_CH4_TGA_EMEP = av_CH4_TGA_EMEP;
    }

    public float getAv_H2O_PIC() {
        return _av_H2O_PIC;
    }

    public void setAv_H2O_PIC(float av_H2O_PIC) {
        _av_H2O_PIC = av_H2O_PIC;
    }

    public int getAv_H2O_PIC_EMEP() {
        return _av_H2O_PIC_EMEP;
    }

    public void setAv_H2O_PIC_EMEP(int av_H2O_PIC_EMEP) {
        _av_H2O_PIC_EMEP = av_H2O_PIC_EMEP;
    }

    public float getAv_CH4_PIC() {
        return _av_CH4_PIC;
    }

    public void setAv_CH4_PIC(float av_CH4_PIC) {
        _av_CH4_PIC = av_CH4_PIC;
    }

    public int getAv_CH4_PIC_EMEP() {
        return _av_CH4_PIC_EMEP;
    }

    public void setAv_CH4_PIC_EMEP(int av_CH4_PIC_EMEP) {
        _av_CH4_PIC_EMEP = av_CH4_PIC_EMEP;
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

    public float getStd_c_LI70() {
        return _std_c_LI70;
    }

    public void setStd_c_LI70(float std_c_LI70) {
        _std_c_LI70 = std_c_LI70;
    }

    public int getStd_c_LI70_EMEP() {
        return _std_c_LI70_EMEP;
    }

    public void setStd_c_LI70_EMEP(int std_c_LI70_EMEP) {
        _std_c_LI70_EMEP = std_c_LI70_EMEP;
    }

    public float getStd_H2O_LI70() {
        return _std_H2O_LI70;
    }

    public void setStd_H2O_LI70(float std_H2O_LI70) {
        _std_H2O_LI70 = std_H2O_LI70;
    }

    public int getStd_H2O_LI70_EMEP() {
        return _std_H2O_LI70_EMEP;
    }

    public void setStd_H2O_LI70_EMEP(int std_H2O_LI70_EMEP) {
        _std_H2O_LI70_EMEP = std_H2O_LI70_EMEP;
    }

    public float getStd_CH4_LGR() {
        return _std_CH4_LGR;
    }

    public void setStd_CH4_LGR(float std_CH4_LGR) {
        _std_CH4_LGR = std_CH4_LGR;
    }

    public int getStd_CH4_LGR_EMEP() {
        return _std_CH4_LGR_EMEP;
    }

    public void setStd_CH4_LGR_EMEP(int std_CH4_LGR_EMEP) {
        _std_CH4_LGR_EMEP = std_CH4_LGR_EMEP;
    }

    public float getStd_CH4_TGA() {
        return _std_CH4_TGA;
    }

    public void setStd_CH4_TGA(float std_CH4_TGA) {
        _std_CH4_TGA = std_CH4_TGA;
    }

    public int getStd_CH4_TGA_EMEP() {
        return _std_CH4_TGA_EMEP;
    }

    public void setStd_CH4_TGA_EMEP(int std_CH4_TGA_EMEP) {
        _std_CH4_TGA_EMEP = std_CH4_TGA_EMEP;
    }

    public float getStd_H2O_PIC() {
        return _std_H2O_PIC;
    }

    public void setStd_H2O_PIC(float std_H2O_PIC) {
        _std_H2O_PIC = std_H2O_PIC;
    }

    public int getStd_H2O_PIC_EMEP() {
        return _std_H2O_PIC_EMEP;
    }

    public void setStd_H2O_PIC_EMEP(int std_H2O_PIC_EMEP) {
        _std_H2O_PIC_EMEP = std_H2O_PIC_EMEP;
    }

    public float getStd_CH4_PIC() {
        return _std_CH4_PIC;
    }

    public void setStd_CH4_PIC(float std_CH4_PIC) {
        _std_CH4_PIC = std_CH4_PIC;
    }

    public int getStd_CH4_PIC_EMEP() {
        return _std_CH4_PIC_EMEP;
    }

    public void setStd_CH4_PIC_EMEP(int std_CH4_PIC_EMEP) {
        _std_CH4_PIC_EMEP = std_CH4_PIC_EMEP;
    }

    public float getC_lag_LI70() {
        return _c_lag_LI70;
    }

    public void setC_lag_LI70(float c_lag_LI70) {
        _c_lag_LI70 = c_lag_LI70;
    }

    public int getC_lag_LI70_EMEP() {
        return _c_lag_LI70_EMEP;
    }

    public void setC_lag_LI70_EMEP(int c_lag_LI70_EMEP) {
        _c_lag_LI70_EMEP = c_lag_LI70_EMEP;
    }

    public float getH2O_lag_LI70() {
        return _H2O_lag_LI70;
    }

    public void setH2O_lag_LI70(float H2O_lag_LI70) {
        _H2O_lag_LI70 = H2O_lag_LI70;
    }

    public int getH2O_lag_LI70_EMEP() {
        return _H2O_lag_LI70_EMEP;
    }

    public void setH2O_lag_LI70_EMEP(int H2O_lag_LI70_EMEP) {
        _H2O_lag_LI70_EMEP = H2O_lag_LI70_EMEP;
    }

    public float getCH4_lag_LGR() {
        return _CH4_lag_LGR;
    }

    public void setCH4_lag_LGR(float CH4_lag_LGR) {
        _CH4_lag_LGR = CH4_lag_LGR;
    }

    public int getCH4_lag_LGR_EMEP() {
        return _CH4_lag_LGR_EMEP;
    }

    public void setCH4_lag_LGR_EMEP(int CH4_lag_LGR_EMEP) {
        _CH4_lag_LGR_EMEP = CH4_lag_LGR_EMEP;
    }

    public float getCH4_lag_TGA() {
        return _CH4_lag_TGA;
    }

    public void setCH4_lag_TGA(float CH4_lag_TGA) {
        _CH4_lag_TGA = CH4_lag_TGA;
    }

    public int getCH4_lag_TGA_EMEP() {
        return _CH4_lag_TGA_EMEP;
    }

    public void setCH4_lag_TGA_EMEP(int CH4_lag_TGA_EMEP) {
        _CH4_lag_TGA_EMEP = CH4_lag_TGA_EMEP;
    }

    public float getH2O_lag_PIC() {
        return _H2O_lag_PIC;
    }

    public void setH2O_lag_PIC(float H2O_lag_PIC) {
        _H2O_lag_PIC = H2O_lag_PIC;
    }

    public int getH2O_lag_PIC_EMEP() {
        return _H2O_lag_PIC_EMEP;
    }

    public void setH2O_lag_PIC_EMEP(int H2O_lag_PIC_EMEP) {
        _H2O_lag_PIC_EMEP = H2O_lag_PIC_EMEP;
    }

    public float getCH4_lag_PIC() {
        return _CH4_lag_PIC;
    }

    public void setCH4_lag_PIC(float CH4_lag_PIC) {
        _CH4_lag_PIC = CH4_lag_PIC;
    }

    public int getCH4_lag_PIC_EMEP() {
        return _CH4_lag_PIC_EMEP;
    }

    public void setCH4_lag_PIC_EMEP(int CH4_lag_PIC_EMEP) {
        _CH4_lag_PIC_EMEP = CH4_lag_PIC_EMEP;
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

    public int getQc_CH4_LGR() {
        return _Qc_CH4_LGR;
    }

    public void setQc_CH4_LGR(int Qc_CH4_LGR) {
        _Qc_CH4_LGR = Qc_CH4_LGR;
    }

    public int getQc_CH4_LGR_EMEP() {
        return _Qc_CH4_LGR_EMEP;
    }

    public void setQc_CH4_LGR_EMEP(int Qc_CH4_LGR_EMEP) {
        _Qc_CH4_LGR_EMEP = Qc_CH4_LGR_EMEP;
    }

    public int getQc_CH4_TGA() {
        return _Qc_CH4_TGA;
    }

    public void setQc_CH4_TGA(int Qc_CH4_TGA) {
        _Qc_CH4_TGA = Qc_CH4_TGA;
    }

    public int getQc_CH4_TGA_EMEP() {
        return _Qc_CH4_TGA_EMEP;
    }

    public void setQc_CH4_TGA_EMEP(int Qc_CH4_TGA_EMEP) {
        _Qc_CH4_TGA_EMEP = Qc_CH4_TGA_EMEP;
    }

    public int getQc_CH4_PIC() {
        return _Qc_CH4_PIC;
    }

    public void setQc_CH4_PIC(int Qc_CH4_PIC) {
        _Qc_CH4_PIC = Qc_CH4_PIC;
    }

    public int getQc_CH4_PIC_EMEP() {
        return _Qc_CH4_PIC_EMEP;
    }

    public void setQc_CH4_PIC_EMEP(int Qc_CH4_PIC_EMEP) {
        _Qc_CH4_PIC_EMEP = Qc_CH4_PIC_EMEP;
    }

    public int getQc_LE_LI70() {
        return _Qc_LE_LI70;
    }

    public void setQc_LE_LI70(int Qc_LE_LI70) {
        _Qc_LE_LI70 = Qc_LE_LI70;
    }

    public int getQc_LE_LI70_EMEP() {
        return _Qc_LE_LI70_EMEP;
    }

    public void setQc_LE_LI70_EMEP(int Qc_LE_LI70_EMEP) {
        _Qc_LE_LI70_EMEP = Qc_LE_LI70_EMEP;
    }

    public int getQc_LE_PIC() {
        return _Qc_LE_PIC;
    }

    public void setQc_LE_PIC(int Qc_LE_PIC) {
        _Qc_LE_PIC = Qc_LE_PIC;
    }

    public int getQc_LE_PIC_EMEP() {
        return _Qc_LE_PIC_EMEP;
    }

    public void setQc_LE_PIC_EMEP(int Qc_LE_PIC_EMEP) {
        _Qc_LE_PIC_EMEP = Qc_LE_PIC_EMEP;
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
