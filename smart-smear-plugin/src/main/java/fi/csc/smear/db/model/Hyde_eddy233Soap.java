package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Hyde_eddy233ServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Hyde_eddy233ServiceSoap
 * @generated
 */
public class Hyde_eddy233Soap implements Serializable {
    private Date _samptime;
    private float _H;
    private float _LE;
    private float _E;
    private float _F_c;
    private float _tau;
    private float _u_star;
    private float _MO_length;
    private float _std_u;
    private float _std_v;
    private float _std_w;
    private float _av_u;
    private float _av_v;
    private float _av_w;
    private float _av_t;
    private float _av_c;
    private float _av_h;
    private float _U;
    private float _wind_dir;
    private float _eta;
    private float _theta;
    private float _beta;
    private int _c_lag;
    private int _h_lag;
    private int _err_packet;
    private float _licor_t_av;
    private float _licor_t_std;
    private float _licor_p_av;
    private float _licor_p_std;
    private float _F_CPC;
    private float _std_CPC;
    private float _av_CPC;
    private int _CPC_lag;
    private float _std_t;
    private float _std_c;
    private float _std_h;
    private int _quality;
    private int _Qc_H;
    private int _Qc_LE;
    private int _Qc_E;
    private int _Qc_F_c;
    private int _Qc_tau;
    private int _Qc_F_CPC;
    private int _H_EMEP;
    private int _LE_EMEP;
    private int _E_EMEP;
    private int _F_c_EMEP;
    private int _tau_EMEP;
    private int _u_star_EMEP;
    private int _MO_length_EMEP;
    private int _std_u_EMEP;
    private int _std_v_EMEP;
    private int _std_w_EMEP;
    private int _av_u_EMEP;
    private int _av_v_EMEP;
    private int _av_w_EMEP;
    private int _av_t_EMEP;
    private int _av_c_EMEP;
    private int _av_h_EMEP;
    private int _U_EMEP;
    private int _wind_dir_EMEP;
    private int _eta_EMEP;
    private int _theta_EMEP;
    private int _beta_EMEP;
    private int _c_lag_EMEP;
    private int _h_lag_EMEP;
    private int _err_packet_EMEP;
    private int _licor_t_av_EMEP;
    private int _licor_t_std_EMEP;
    private int _licor_p_av_EMEP;
    private int _licor_p_std_EMEP;
    private int _F_CPC_EMEP;
    private int _std_CPC_EMEP;
    private int _av_CPC_EMEP;
    private int _CPC_lag_EMEP;
    private int _std_t_EMEP;
    private int _std_c_EMEP;
    private int _std_h_EMEP;
    private int _quality_EMEP;
    private int _Qc_H_EMEP;
    private int _Qc_LE_EMEP;
    private int _Qc_E_EMEP;
    private int _Qc_F_c_EMEP;
    private int _Qc_tau_EMEP;
    private int _Qc_F_CPC_EMEP;
    private float _NEE;
    private int _Qc_gapf_NEE;
    private float _GPP;
    private float _TER;
    private float _H_gapf;
    private int _Qc_gapf_H;
    private float _ET_gapf;
    private int _Qc_gapf_ET;
    private int _NEE_EMEP;
    private int _Qc_gapf_NEE_EMEP;
    private int _GPP_EMEP;
    private int _TER_EMEP;
    private int _H_gapf_EMEP;
    private int _Qc_gapf_H_EMEP;
    private int _ET_gapf_EMEP;
    private int _Qc_gapf_ET_EMEP;

    public Hyde_eddy233Soap() {
    }

    public static Hyde_eddy233Soap toSoapModel(Hyde_eddy233 model) {
        Hyde_eddy233Soap soapModel = new Hyde_eddy233Soap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH(model.getH());
        soapModel.setLE(model.getLE());
        soapModel.setE(model.getE());
        soapModel.setF_c(model.getF_c());
        soapModel.setTau(model.getTau());
        soapModel.setU_star(model.getU_star());
        soapModel.setMO_length(model.getMO_length());
        soapModel.setStd_u(model.getStd_u());
        soapModel.setStd_v(model.getStd_v());
        soapModel.setStd_w(model.getStd_w());
        soapModel.setAv_u(model.getAv_u());
        soapModel.setAv_v(model.getAv_v());
        soapModel.setAv_w(model.getAv_w());
        soapModel.setAv_t(model.getAv_t());
        soapModel.setAv_c(model.getAv_c());
        soapModel.setAv_h(model.getAv_h());
        soapModel.setU(model.getU());
        soapModel.setWind_dir(model.getWind_dir());
        soapModel.setEta(model.getEta());
        soapModel.setTheta(model.getTheta());
        soapModel.setBeta(model.getBeta());
        soapModel.setC_lag(model.getC_lag());
        soapModel.setH_lag(model.getH_lag());
        soapModel.setErr_packet(model.getErr_packet());
        soapModel.setLicor_t_av(model.getLicor_t_av());
        soapModel.setLicor_t_std(model.getLicor_t_std());
        soapModel.setLicor_p_av(model.getLicor_p_av());
        soapModel.setLicor_p_std(model.getLicor_p_std());
        soapModel.setF_CPC(model.getF_CPC());
        soapModel.setStd_CPC(model.getStd_CPC());
        soapModel.setAv_CPC(model.getAv_CPC());
        soapModel.setCPC_lag(model.getCPC_lag());
        soapModel.setStd_t(model.getStd_t());
        soapModel.setStd_c(model.getStd_c());
        soapModel.setStd_h(model.getStd_h());
        soapModel.setQuality(model.getQuality());
        soapModel.setQc_H(model.getQc_H());
        soapModel.setQc_LE(model.getQc_LE());
        soapModel.setQc_E(model.getQc_E());
        soapModel.setQc_F_c(model.getQc_F_c());
        soapModel.setQc_tau(model.getQc_tau());
        soapModel.setQc_F_CPC(model.getQc_F_CPC());
        soapModel.setH_EMEP(model.getH_EMEP());
        soapModel.setLE_EMEP(model.getLE_EMEP());
        soapModel.setE_EMEP(model.getE_EMEP());
        soapModel.setF_c_EMEP(model.getF_c_EMEP());
        soapModel.setTau_EMEP(model.getTau_EMEP());
        soapModel.setU_star_EMEP(model.getU_star_EMEP());
        soapModel.setMO_length_EMEP(model.getMO_length_EMEP());
        soapModel.setStd_u_EMEP(model.getStd_u_EMEP());
        soapModel.setStd_v_EMEP(model.getStd_v_EMEP());
        soapModel.setStd_w_EMEP(model.getStd_w_EMEP());
        soapModel.setAv_u_EMEP(model.getAv_u_EMEP());
        soapModel.setAv_v_EMEP(model.getAv_v_EMEP());
        soapModel.setAv_w_EMEP(model.getAv_w_EMEP());
        soapModel.setAv_t_EMEP(model.getAv_t_EMEP());
        soapModel.setAv_c_EMEP(model.getAv_c_EMEP());
        soapModel.setAv_h_EMEP(model.getAv_h_EMEP());
        soapModel.setU_EMEP(model.getU_EMEP());
        soapModel.setWind_dir_EMEP(model.getWind_dir_EMEP());
        soapModel.setEta_EMEP(model.getEta_EMEP());
        soapModel.setTheta_EMEP(model.getTheta_EMEP());
        soapModel.setBeta_EMEP(model.getBeta_EMEP());
        soapModel.setC_lag_EMEP(model.getC_lag_EMEP());
        soapModel.setH_lag_EMEP(model.getH_lag_EMEP());
        soapModel.setErr_packet_EMEP(model.getErr_packet_EMEP());
        soapModel.setLicor_t_av_EMEP(model.getLicor_t_av_EMEP());
        soapModel.setLicor_t_std_EMEP(model.getLicor_t_std_EMEP());
        soapModel.setLicor_p_av_EMEP(model.getLicor_p_av_EMEP());
        soapModel.setLicor_p_std_EMEP(model.getLicor_p_std_EMEP());
        soapModel.setF_CPC_EMEP(model.getF_CPC_EMEP());
        soapModel.setStd_CPC_EMEP(model.getStd_CPC_EMEP());
        soapModel.setAv_CPC_EMEP(model.getAv_CPC_EMEP());
        soapModel.setCPC_lag_EMEP(model.getCPC_lag_EMEP());
        soapModel.setStd_t_EMEP(model.getStd_t_EMEP());
        soapModel.setStd_c_EMEP(model.getStd_c_EMEP());
        soapModel.setStd_h_EMEP(model.getStd_h_EMEP());
        soapModel.setQuality_EMEP(model.getQuality_EMEP());
        soapModel.setQc_H_EMEP(model.getQc_H_EMEP());
        soapModel.setQc_LE_EMEP(model.getQc_LE_EMEP());
        soapModel.setQc_E_EMEP(model.getQc_E_EMEP());
        soapModel.setQc_F_c_EMEP(model.getQc_F_c_EMEP());
        soapModel.setQc_tau_EMEP(model.getQc_tau_EMEP());
        soapModel.setQc_F_CPC_EMEP(model.getQc_F_CPC_EMEP());
        soapModel.setNEE(model.getNEE());
        soapModel.setQc_gapf_NEE(model.getQc_gapf_NEE());
        soapModel.setGPP(model.getGPP());
        soapModel.setTER(model.getTER());
        soapModel.setH_gapf(model.getH_gapf());
        soapModel.setQc_gapf_H(model.getQc_gapf_H());
        soapModel.setET_gapf(model.getET_gapf());
        soapModel.setQc_gapf_ET(model.getQc_gapf_ET());
        soapModel.setNEE_EMEP(model.getNEE_EMEP());
        soapModel.setQc_gapf_NEE_EMEP(model.getQc_gapf_NEE_EMEP());
        soapModel.setGPP_EMEP(model.getGPP_EMEP());
        soapModel.setTER_EMEP(model.getTER_EMEP());
        soapModel.setH_gapf_EMEP(model.getH_gapf_EMEP());
        soapModel.setQc_gapf_H_EMEP(model.getQc_gapf_H_EMEP());
        soapModel.setET_gapf_EMEP(model.getET_gapf_EMEP());
        soapModel.setQc_gapf_ET_EMEP(model.getQc_gapf_ET_EMEP());

        return soapModel;
    }

    public static Hyde_eddy233Soap[] toSoapModels(Hyde_eddy233[] models) {
        Hyde_eddy233Soap[] soapModels = new Hyde_eddy233Soap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Hyde_eddy233Soap[][] toSoapModels(Hyde_eddy233[][] models) {
        Hyde_eddy233Soap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Hyde_eddy233Soap[models.length][models[0].length];
        } else {
            soapModels = new Hyde_eddy233Soap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Hyde_eddy233Soap[] toSoapModels(List<Hyde_eddy233> models) {
        List<Hyde_eddy233Soap> soapModels = new ArrayList<Hyde_eddy233Soap>(models.size());

        for (Hyde_eddy233 model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Hyde_eddy233Soap[soapModels.size()]);
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

    public float getLE() {
        return _LE;
    }

    public void setLE(float LE) {
        _LE = LE;
    }

    public float getE() {
        return _E;
    }

    public void setE(float E) {
        _E = E;
    }

    public float getF_c() {
        return _F_c;
    }

    public void setF_c(float F_c) {
        _F_c = F_c;
    }

    public float getTau() {
        return _tau;
    }

    public void setTau(float tau) {
        _tau = tau;
    }

    public float getU_star() {
        return _u_star;
    }

    public void setU_star(float u_star) {
        _u_star = u_star;
    }

    public float getMO_length() {
        return _MO_length;
    }

    public void setMO_length(float MO_length) {
        _MO_length = MO_length;
    }

    public float getStd_u() {
        return _std_u;
    }

    public void setStd_u(float std_u) {
        _std_u = std_u;
    }

    public float getStd_v() {
        return _std_v;
    }

    public void setStd_v(float std_v) {
        _std_v = std_v;
    }

    public float getStd_w() {
        return _std_w;
    }

    public void setStd_w(float std_w) {
        _std_w = std_w;
    }

    public float getAv_u() {
        return _av_u;
    }

    public void setAv_u(float av_u) {
        _av_u = av_u;
    }

    public float getAv_v() {
        return _av_v;
    }

    public void setAv_v(float av_v) {
        _av_v = av_v;
    }

    public float getAv_w() {
        return _av_w;
    }

    public void setAv_w(float av_w) {
        _av_w = av_w;
    }

    public float getAv_t() {
        return _av_t;
    }

    public void setAv_t(float av_t) {
        _av_t = av_t;
    }

    public float getAv_c() {
        return _av_c;
    }

    public void setAv_c(float av_c) {
        _av_c = av_c;
    }

    public float getAv_h() {
        return _av_h;
    }

    public void setAv_h(float av_h) {
        _av_h = av_h;
    }

    public float getU() {
        return _U;
    }

    public void setU(float U) {
        _U = U;
    }

    public float getWind_dir() {
        return _wind_dir;
    }

    public void setWind_dir(float wind_dir) {
        _wind_dir = wind_dir;
    }

    public float getEta() {
        return _eta;
    }

    public void setEta(float eta) {
        _eta = eta;
    }

    public float getTheta() {
        return _theta;
    }

    public void setTheta(float theta) {
        _theta = theta;
    }

    public float getBeta() {
        return _beta;
    }

    public void setBeta(float beta) {
        _beta = beta;
    }

    public int getC_lag() {
        return _c_lag;
    }

    public void setC_lag(int c_lag) {
        _c_lag = c_lag;
    }

    public int getH_lag() {
        return _h_lag;
    }

    public void setH_lag(int h_lag) {
        _h_lag = h_lag;
    }

    public int getErr_packet() {
        return _err_packet;
    }

    public void setErr_packet(int err_packet) {
        _err_packet = err_packet;
    }

    public float getLicor_t_av() {
        return _licor_t_av;
    }

    public void setLicor_t_av(float licor_t_av) {
        _licor_t_av = licor_t_av;
    }

    public float getLicor_t_std() {
        return _licor_t_std;
    }

    public void setLicor_t_std(float licor_t_std) {
        _licor_t_std = licor_t_std;
    }

    public float getLicor_p_av() {
        return _licor_p_av;
    }

    public void setLicor_p_av(float licor_p_av) {
        _licor_p_av = licor_p_av;
    }

    public float getLicor_p_std() {
        return _licor_p_std;
    }

    public void setLicor_p_std(float licor_p_std) {
        _licor_p_std = licor_p_std;
    }

    public float getF_CPC() {
        return _F_CPC;
    }

    public void setF_CPC(float F_CPC) {
        _F_CPC = F_CPC;
    }

    public float getStd_CPC() {
        return _std_CPC;
    }

    public void setStd_CPC(float std_CPC) {
        _std_CPC = std_CPC;
    }

    public float getAv_CPC() {
        return _av_CPC;
    }

    public void setAv_CPC(float av_CPC) {
        _av_CPC = av_CPC;
    }

    public int getCPC_lag() {
        return _CPC_lag;
    }

    public void setCPC_lag(int CPC_lag) {
        _CPC_lag = CPC_lag;
    }

    public float getStd_t() {
        return _std_t;
    }

    public void setStd_t(float std_t) {
        _std_t = std_t;
    }

    public float getStd_c() {
        return _std_c;
    }

    public void setStd_c(float std_c) {
        _std_c = std_c;
    }

    public float getStd_h() {
        return _std_h;
    }

    public void setStd_h(float std_h) {
        _std_h = std_h;
    }

    public int getQuality() {
        return _quality;
    }

    public void setQuality(int quality) {
        _quality = quality;
    }

    public int getQc_H() {
        return _Qc_H;
    }

    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;
    }

    public int getQc_LE() {
        return _Qc_LE;
    }

    public void setQc_LE(int Qc_LE) {
        _Qc_LE = Qc_LE;
    }

    public int getQc_E() {
        return _Qc_E;
    }

    public void setQc_E(int Qc_E) {
        _Qc_E = Qc_E;
    }

    public int getQc_F_c() {
        return _Qc_F_c;
    }

    public void setQc_F_c(int Qc_F_c) {
        _Qc_F_c = Qc_F_c;
    }

    public int getQc_tau() {
        return _Qc_tau;
    }

    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;
    }

    public int getQc_F_CPC() {
        return _Qc_F_CPC;
    }

    public void setQc_F_CPC(int Qc_F_CPC) {
        _Qc_F_CPC = Qc_F_CPC;
    }

    public int getH_EMEP() {
        return _H_EMEP;
    }

    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;
    }

    public int getLE_EMEP() {
        return _LE_EMEP;
    }

    public void setLE_EMEP(int LE_EMEP) {
        _LE_EMEP = LE_EMEP;
    }

    public int getE_EMEP() {
        return _E_EMEP;
    }

    public void setE_EMEP(int E_EMEP) {
        _E_EMEP = E_EMEP;
    }

    public int getF_c_EMEP() {
        return _F_c_EMEP;
    }

    public void setF_c_EMEP(int F_c_EMEP) {
        _F_c_EMEP = F_c_EMEP;
    }

    public int getTau_EMEP() {
        return _tau_EMEP;
    }

    public void setTau_EMEP(int tau_EMEP) {
        _tau_EMEP = tau_EMEP;
    }

    public int getU_star_EMEP() {
        return _u_star_EMEP;
    }

    public void setU_star_EMEP(int u_star_EMEP) {
        _u_star_EMEP = u_star_EMEP;
    }

    public int getMO_length_EMEP() {
        return _MO_length_EMEP;
    }

    public void setMO_length_EMEP(int MO_length_EMEP) {
        _MO_length_EMEP = MO_length_EMEP;
    }

    public int getStd_u_EMEP() {
        return _std_u_EMEP;
    }

    public void setStd_u_EMEP(int std_u_EMEP) {
        _std_u_EMEP = std_u_EMEP;
    }

    public int getStd_v_EMEP() {
        return _std_v_EMEP;
    }

    public void setStd_v_EMEP(int std_v_EMEP) {
        _std_v_EMEP = std_v_EMEP;
    }

    public int getStd_w_EMEP() {
        return _std_w_EMEP;
    }

    public void setStd_w_EMEP(int std_w_EMEP) {
        _std_w_EMEP = std_w_EMEP;
    }

    public int getAv_u_EMEP() {
        return _av_u_EMEP;
    }

    public void setAv_u_EMEP(int av_u_EMEP) {
        _av_u_EMEP = av_u_EMEP;
    }

    public int getAv_v_EMEP() {
        return _av_v_EMEP;
    }

    public void setAv_v_EMEP(int av_v_EMEP) {
        _av_v_EMEP = av_v_EMEP;
    }

    public int getAv_w_EMEP() {
        return _av_w_EMEP;
    }

    public void setAv_w_EMEP(int av_w_EMEP) {
        _av_w_EMEP = av_w_EMEP;
    }

    public int getAv_t_EMEP() {
        return _av_t_EMEP;
    }

    public void setAv_t_EMEP(int av_t_EMEP) {
        _av_t_EMEP = av_t_EMEP;
    }

    public int getAv_c_EMEP() {
        return _av_c_EMEP;
    }

    public void setAv_c_EMEP(int av_c_EMEP) {
        _av_c_EMEP = av_c_EMEP;
    }

    public int getAv_h_EMEP() {
        return _av_h_EMEP;
    }

    public void setAv_h_EMEP(int av_h_EMEP) {
        _av_h_EMEP = av_h_EMEP;
    }

    public int getU_EMEP() {
        return _U_EMEP;
    }

    public void setU_EMEP(int U_EMEP) {
        _U_EMEP = U_EMEP;
    }

    public int getWind_dir_EMEP() {
        return _wind_dir_EMEP;
    }

    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _wind_dir_EMEP = wind_dir_EMEP;
    }

    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;
    }

    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;
    }

    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;
    }

    public int getC_lag_EMEP() {
        return _c_lag_EMEP;
    }

    public void setC_lag_EMEP(int c_lag_EMEP) {
        _c_lag_EMEP = c_lag_EMEP;
    }

    public int getH_lag_EMEP() {
        return _h_lag_EMEP;
    }

    public void setH_lag_EMEP(int h_lag_EMEP) {
        _h_lag_EMEP = h_lag_EMEP;
    }

    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;
    }

    public int getLicor_t_av_EMEP() {
        return _licor_t_av_EMEP;
    }

    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _licor_t_av_EMEP = licor_t_av_EMEP;
    }

    public int getLicor_t_std_EMEP() {
        return _licor_t_std_EMEP;
    }

    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _licor_t_std_EMEP = licor_t_std_EMEP;
    }

    public int getLicor_p_av_EMEP() {
        return _licor_p_av_EMEP;
    }

    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _licor_p_av_EMEP = licor_p_av_EMEP;
    }

    public int getLicor_p_std_EMEP() {
        return _licor_p_std_EMEP;
    }

    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _licor_p_std_EMEP = licor_p_std_EMEP;
    }

    public int getF_CPC_EMEP() {
        return _F_CPC_EMEP;
    }

    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _F_CPC_EMEP = F_CPC_EMEP;
    }

    public int getStd_CPC_EMEP() {
        return _std_CPC_EMEP;
    }

    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _std_CPC_EMEP = std_CPC_EMEP;
    }

    public int getAv_CPC_EMEP() {
        return _av_CPC_EMEP;
    }

    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _av_CPC_EMEP = av_CPC_EMEP;
    }

    public int getCPC_lag_EMEP() {
        return _CPC_lag_EMEP;
    }

    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _CPC_lag_EMEP = CPC_lag_EMEP;
    }

    public int getStd_t_EMEP() {
        return _std_t_EMEP;
    }

    public void setStd_t_EMEP(int std_t_EMEP) {
        _std_t_EMEP = std_t_EMEP;
    }

    public int getStd_c_EMEP() {
        return _std_c_EMEP;
    }

    public void setStd_c_EMEP(int std_c_EMEP) {
        _std_c_EMEP = std_c_EMEP;
    }

    public int getStd_h_EMEP() {
        return _std_h_EMEP;
    }

    public void setStd_h_EMEP(int std_h_EMEP) {
        _std_h_EMEP = std_h_EMEP;
    }

    public int getQuality_EMEP() {
        return _quality_EMEP;
    }

    public void setQuality_EMEP(int quality_EMEP) {
        _quality_EMEP = quality_EMEP;
    }

    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;
    }

    public int getQc_LE_EMEP() {
        return _Qc_LE_EMEP;
    }

    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _Qc_LE_EMEP = Qc_LE_EMEP;
    }

    public int getQc_E_EMEP() {
        return _Qc_E_EMEP;
    }

    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _Qc_E_EMEP = Qc_E_EMEP;
    }

    public int getQc_F_c_EMEP() {
        return _Qc_F_c_EMEP;
    }

    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _Qc_F_c_EMEP = Qc_F_c_EMEP;
    }

    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;
    }

    public int getQc_F_CPC_EMEP() {
        return _Qc_F_CPC_EMEP;
    }

    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _Qc_F_CPC_EMEP = Qc_F_CPC_EMEP;
    }

    public float getNEE() {
        return _NEE;
    }

    public void setNEE(float NEE) {
        _NEE = NEE;
    }

    public int getQc_gapf_NEE() {
        return _Qc_gapf_NEE;
    }

    public void setQc_gapf_NEE(int Qc_gapf_NEE) {
        _Qc_gapf_NEE = Qc_gapf_NEE;
    }

    public float getGPP() {
        return _GPP;
    }

    public void setGPP(float GPP) {
        _GPP = GPP;
    }

    public float getTER() {
        return _TER;
    }

    public void setTER(float TER) {
        _TER = TER;
    }

    public float getH_gapf() {
        return _H_gapf;
    }

    public void setH_gapf(float H_gapf) {
        _H_gapf = H_gapf;
    }

    public int getQc_gapf_H() {
        return _Qc_gapf_H;
    }

    public void setQc_gapf_H(int Qc_gapf_H) {
        _Qc_gapf_H = Qc_gapf_H;
    }

    public float getET_gapf() {
        return _ET_gapf;
    }

    public void setET_gapf(float ET_gapf) {
        _ET_gapf = ET_gapf;
    }

    public int getQc_gapf_ET() {
        return _Qc_gapf_ET;
    }

    public void setQc_gapf_ET(int Qc_gapf_ET) {
        _Qc_gapf_ET = Qc_gapf_ET;
    }

    public int getNEE_EMEP() {
        return _NEE_EMEP;
    }

    public void setNEE_EMEP(int NEE_EMEP) {
        _NEE_EMEP = NEE_EMEP;
    }

    public int getQc_gapf_NEE_EMEP() {
        return _Qc_gapf_NEE_EMEP;
    }

    public void setQc_gapf_NEE_EMEP(int Qc_gapf_NEE_EMEP) {
        _Qc_gapf_NEE_EMEP = Qc_gapf_NEE_EMEP;
    }

    public int getGPP_EMEP() {
        return _GPP_EMEP;
    }

    public void setGPP_EMEP(int GPP_EMEP) {
        _GPP_EMEP = GPP_EMEP;
    }

    public int getTER_EMEP() {
        return _TER_EMEP;
    }

    public void setTER_EMEP(int TER_EMEP) {
        _TER_EMEP = TER_EMEP;
    }

    public int getH_gapf_EMEP() {
        return _H_gapf_EMEP;
    }

    public void setH_gapf_EMEP(int H_gapf_EMEP) {
        _H_gapf_EMEP = H_gapf_EMEP;
    }

    public int getQc_gapf_H_EMEP() {
        return _Qc_gapf_H_EMEP;
    }

    public void setQc_gapf_H_EMEP(int Qc_gapf_H_EMEP) {
        _Qc_gapf_H_EMEP = Qc_gapf_H_EMEP;
    }

    public int getET_gapf_EMEP() {
        return _ET_gapf_EMEP;
    }

    public void setET_gapf_EMEP(int ET_gapf_EMEP) {
        _ET_gapf_EMEP = ET_gapf_EMEP;
    }

    public int getQc_gapf_ET_EMEP() {
        return _Qc_gapf_ET_EMEP;
    }

    public void setQc_gapf_ET_EMEP(int Qc_gapf_ET_EMEP) {
        _Qc_gapf_ET_EMEP = Qc_gapf_ET_EMEP;
    }
}
