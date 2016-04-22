package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Hyde_eddytowServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Hyde_eddytowServiceSoap
 * @generated
 */
public class Hyde_eddytowSoap implements Serializable {
    private Date _samptime;
    private float _H_radtow;
    private int _H_radtow_EMEP;
    private int _Qc_H_radtow;
    private int _Qc_H_radtow_EMEP;
    private float _LE_radtow;
    private int _LE_radtow_EMEP;
    private int _Qc_LE_radtow;
    private int _Qc_LE_radtow_EMEP;
    private float _E_radtow;
    private int _E_radtow_EMEP;
    private int _Qc_E_radtow;
    private int _Qc_E_radtow_EMEP;
    private float _F_c_radtow;
    private int _F_c_radtow_EMEP;
    private int _Qc_F_c_radtow;
    private int _Qc_F_c_radtow_EMEP;
    private float _tau_radtow;
    private int _tau_radtow_EMEP;
    private int _Qc_tau_radtow;
    private int _Qc_tau_radtow_EMEP;
    private float _u_star_radtow;
    private int _u_star_radtow_EMEP;
    private float _MO_length_radtow;
    private int _MO_length_radtow_EMEP;
    private float _std_u_radtow;
    private int _std_u_radtow_EMEP;
    private float _std_v_radtow;
    private int _std_v_radtow_EMEP;
    private float _std_w_radtow;
    private int _std_w_radtow_EMEP;
    private float _std_t_radtow;
    private int _std_t_radtow_EMEP;
    private float _std_c_radtow;
    private int _std_c_radtow_EMEP;
    private float _std_h_radtow;
    private int _std_h_radtow_EMEP;
    private float _av_u_radtow;
    private int _av_u_radtow_EMEP;
    private float _av_v_radtow;
    private int _av_v_radtow_EMEP;
    private float _av_w_radtow;
    private int _av_w_radtow_EMEP;
    private float _av_t_radtow;
    private int _av_t_radtow_EMEP;
    private float _av_c_radtow;
    private int _av_c_radtow_EMEP;
    private float _av_h_radtow;
    private int _av_h_radtow_EMEP;
    private float _U_radtow;
    private int _U_radtow_EMEP;
    private float _wind_dir_radtow;
    private int _wind_dir_radtow_EMEP;
    private float _eta_radtow;
    private int _eta_radtow_EMEP;
    private float _theta_radtow;
    private int _theta_radtow_EMEP;
    private float _beta_radtow;
    private int _beta_radtow_EMEP;
    private float _c_lag_radtow;
    private int _c_lag_radtow_EMEP;
    private float _h_lag_radtow;
    private int _h_lag_radtow_EMEP;
    private float _err_packet_radtow;
    private int _err_packet_radtow_EMEP;
    private float _licor_t_std_radtow;
    private int _licor_t_std_radtow_EMEP;
    private float _licor_t_av_radtow;
    private int _licor_t_av_radtow_EMEP;
    private float _licor_p_std_radtow;
    private int _licor_p_std_radtow_EMEP;
    private float _licor_p_av_radtow;
    private int _licor_p_av_radtow_EMEP;
    private float _F_O3_radtow;
    private int _F_O3_radtow_EMEP;
    private int _Qc_F_O3_radtow;
    private int _Qc_F_O3_radtow_EMEP;
    private float _std_O3_radtow;
    private int _std_O3_radtow_EMEP;
    private float _av_O3_radtow;
    private int _av_O3_radtow_EMEP;
    private float _O3_lag_radtow;
    private int _O3_lag_radtow_EMEP;
    private float _NEE_radtow;
    private int _NEE_radtow_EMEP;
    private int _Qc_gapf_NEE_radtow;
    private int _Qc_gapf_NEE_radtow_EMEP;
    private float _GPP_radtow;
    private int _GPP_radtow_EMEP;
    private float _TER_radtow;
    private int _TER_radtow_EMEP;

    public Hyde_eddytowSoap() {
    }

    public static Hyde_eddytowSoap toSoapModel(Hyde_eddytow model) {
        Hyde_eddytowSoap soapModel = new Hyde_eddytowSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH_radtow(model.getH_radtow());
        soapModel.setH_radtow_EMEP(model.getH_radtow_EMEP());
        soapModel.setQc_H_radtow(model.getQc_H_radtow());
        soapModel.setQc_H_radtow_EMEP(model.getQc_H_radtow_EMEP());
        soapModel.setLE_radtow(model.getLE_radtow());
        soapModel.setLE_radtow_EMEP(model.getLE_radtow_EMEP());
        soapModel.setQc_LE_radtow(model.getQc_LE_radtow());
        soapModel.setQc_LE_radtow_EMEP(model.getQc_LE_radtow_EMEP());
        soapModel.setE_radtow(model.getE_radtow());
        soapModel.setE_radtow_EMEP(model.getE_radtow_EMEP());
        soapModel.setQc_E_radtow(model.getQc_E_radtow());
        soapModel.setQc_E_radtow_EMEP(model.getQc_E_radtow_EMEP());
        soapModel.setF_c_radtow(model.getF_c_radtow());
        soapModel.setF_c_radtow_EMEP(model.getF_c_radtow_EMEP());
        soapModel.setQc_F_c_radtow(model.getQc_F_c_radtow());
        soapModel.setQc_F_c_radtow_EMEP(model.getQc_F_c_radtow_EMEP());
        soapModel.setTau_radtow(model.getTau_radtow());
        soapModel.setTau_radtow_EMEP(model.getTau_radtow_EMEP());
        soapModel.setQc_tau_radtow(model.getQc_tau_radtow());
        soapModel.setQc_tau_radtow_EMEP(model.getQc_tau_radtow_EMEP());
        soapModel.setU_star_radtow(model.getU_star_radtow());
        soapModel.setU_star_radtow_EMEP(model.getU_star_radtow_EMEP());
        soapModel.setMO_length_radtow(model.getMO_length_radtow());
        soapModel.setMO_length_radtow_EMEP(model.getMO_length_radtow_EMEP());
        soapModel.setStd_u_radtow(model.getStd_u_radtow());
        soapModel.setStd_u_radtow_EMEP(model.getStd_u_radtow_EMEP());
        soapModel.setStd_v_radtow(model.getStd_v_radtow());
        soapModel.setStd_v_radtow_EMEP(model.getStd_v_radtow_EMEP());
        soapModel.setStd_w_radtow(model.getStd_w_radtow());
        soapModel.setStd_w_radtow_EMEP(model.getStd_w_radtow_EMEP());
        soapModel.setStd_t_radtow(model.getStd_t_radtow());
        soapModel.setStd_t_radtow_EMEP(model.getStd_t_radtow_EMEP());
        soapModel.setStd_c_radtow(model.getStd_c_radtow());
        soapModel.setStd_c_radtow_EMEP(model.getStd_c_radtow_EMEP());
        soapModel.setStd_h_radtow(model.getStd_h_radtow());
        soapModel.setStd_h_radtow_EMEP(model.getStd_h_radtow_EMEP());
        soapModel.setAv_u_radtow(model.getAv_u_radtow());
        soapModel.setAv_u_radtow_EMEP(model.getAv_u_radtow_EMEP());
        soapModel.setAv_v_radtow(model.getAv_v_radtow());
        soapModel.setAv_v_radtow_EMEP(model.getAv_v_radtow_EMEP());
        soapModel.setAv_w_radtow(model.getAv_w_radtow());
        soapModel.setAv_w_radtow_EMEP(model.getAv_w_radtow_EMEP());
        soapModel.setAv_t_radtow(model.getAv_t_radtow());
        soapModel.setAv_t_radtow_EMEP(model.getAv_t_radtow_EMEP());
        soapModel.setAv_c_radtow(model.getAv_c_radtow());
        soapModel.setAv_c_radtow_EMEP(model.getAv_c_radtow_EMEP());
        soapModel.setAv_h_radtow(model.getAv_h_radtow());
        soapModel.setAv_h_radtow_EMEP(model.getAv_h_radtow_EMEP());
        soapModel.setU_radtow(model.getU_radtow());
        soapModel.setU_radtow_EMEP(model.getU_radtow_EMEP());
        soapModel.setWind_dir_radtow(model.getWind_dir_radtow());
        soapModel.setWind_dir_radtow_EMEP(model.getWind_dir_radtow_EMEP());
        soapModel.setEta_radtow(model.getEta_radtow());
        soapModel.setEta_radtow_EMEP(model.getEta_radtow_EMEP());
        soapModel.setTheta_radtow(model.getTheta_radtow());
        soapModel.setTheta_radtow_EMEP(model.getTheta_radtow_EMEP());
        soapModel.setBeta_radtow(model.getBeta_radtow());
        soapModel.setBeta_radtow_EMEP(model.getBeta_radtow_EMEP());
        soapModel.setC_lag_radtow(model.getC_lag_radtow());
        soapModel.setC_lag_radtow_EMEP(model.getC_lag_radtow_EMEP());
        soapModel.setH_lag_radtow(model.getH_lag_radtow());
        soapModel.setH_lag_radtow_EMEP(model.getH_lag_radtow_EMEP());
        soapModel.setErr_packet_radtow(model.getErr_packet_radtow());
        soapModel.setErr_packet_radtow_EMEP(model.getErr_packet_radtow_EMEP());
        soapModel.setLicor_t_std_radtow(model.getLicor_t_std_radtow());
        soapModel.setLicor_t_std_radtow_EMEP(model.getLicor_t_std_radtow_EMEP());
        soapModel.setLicor_t_av_radtow(model.getLicor_t_av_radtow());
        soapModel.setLicor_t_av_radtow_EMEP(model.getLicor_t_av_radtow_EMEP());
        soapModel.setLicor_p_std_radtow(model.getLicor_p_std_radtow());
        soapModel.setLicor_p_std_radtow_EMEP(model.getLicor_p_std_radtow_EMEP());
        soapModel.setLicor_p_av_radtow(model.getLicor_p_av_radtow());
        soapModel.setLicor_p_av_radtow_EMEP(model.getLicor_p_av_radtow_EMEP());
        soapModel.setF_O3_radtow(model.getF_O3_radtow());
        soapModel.setF_O3_radtow_EMEP(model.getF_O3_radtow_EMEP());
        soapModel.setQc_F_O3_radtow(model.getQc_F_O3_radtow());
        soapModel.setQc_F_O3_radtow_EMEP(model.getQc_F_O3_radtow_EMEP());
        soapModel.setStd_O3_radtow(model.getStd_O3_radtow());
        soapModel.setStd_O3_radtow_EMEP(model.getStd_O3_radtow_EMEP());
        soapModel.setAv_O3_radtow(model.getAv_O3_radtow());
        soapModel.setAv_O3_radtow_EMEP(model.getAv_O3_radtow_EMEP());
        soapModel.setO3_lag_radtow(model.getO3_lag_radtow());
        soapModel.setO3_lag_radtow_EMEP(model.getO3_lag_radtow_EMEP());
        soapModel.setNEE_radtow(model.getNEE_radtow());
        soapModel.setNEE_radtow_EMEP(model.getNEE_radtow_EMEP());
        soapModel.setQc_gapf_NEE_radtow(model.getQc_gapf_NEE_radtow());
        soapModel.setQc_gapf_NEE_radtow_EMEP(model.getQc_gapf_NEE_radtow_EMEP());
        soapModel.setGPP_radtow(model.getGPP_radtow());
        soapModel.setGPP_radtow_EMEP(model.getGPP_radtow_EMEP());
        soapModel.setTER_radtow(model.getTER_radtow());
        soapModel.setTER_radtow_EMEP(model.getTER_radtow_EMEP());

        return soapModel;
    }

    public static Hyde_eddytowSoap[] toSoapModels(Hyde_eddytow[] models) {
        Hyde_eddytowSoap[] soapModels = new Hyde_eddytowSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Hyde_eddytowSoap[][] toSoapModels(Hyde_eddytow[][] models) {
        Hyde_eddytowSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Hyde_eddytowSoap[models.length][models[0].length];
        } else {
            soapModels = new Hyde_eddytowSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Hyde_eddytowSoap[] toSoapModels(List<Hyde_eddytow> models) {
        List<Hyde_eddytowSoap> soapModels = new ArrayList<Hyde_eddytowSoap>(models.size());

        for (Hyde_eddytow model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Hyde_eddytowSoap[soapModels.size()]);
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

    public float getH_radtow() {
        return _H_radtow;
    }

    public void setH_radtow(float H_radtow) {
        _H_radtow = H_radtow;
    }

    public int getH_radtow_EMEP() {
        return _H_radtow_EMEP;
    }

    public void setH_radtow_EMEP(int H_radtow_EMEP) {
        _H_radtow_EMEP = H_radtow_EMEP;
    }

    public int getQc_H_radtow() {
        return _Qc_H_radtow;
    }

    public void setQc_H_radtow(int Qc_H_radtow) {
        _Qc_H_radtow = Qc_H_radtow;
    }

    public int getQc_H_radtow_EMEP() {
        return _Qc_H_radtow_EMEP;
    }

    public void setQc_H_radtow_EMEP(int Qc_H_radtow_EMEP) {
        _Qc_H_radtow_EMEP = Qc_H_radtow_EMEP;
    }

    public float getLE_radtow() {
        return _LE_radtow;
    }

    public void setLE_radtow(float LE_radtow) {
        _LE_radtow = LE_radtow;
    }

    public int getLE_radtow_EMEP() {
        return _LE_radtow_EMEP;
    }

    public void setLE_radtow_EMEP(int LE_radtow_EMEP) {
        _LE_radtow_EMEP = LE_radtow_EMEP;
    }

    public int getQc_LE_radtow() {
        return _Qc_LE_radtow;
    }

    public void setQc_LE_radtow(int Qc_LE_radtow) {
        _Qc_LE_radtow = Qc_LE_radtow;
    }

    public int getQc_LE_radtow_EMEP() {
        return _Qc_LE_radtow_EMEP;
    }

    public void setQc_LE_radtow_EMEP(int Qc_LE_radtow_EMEP) {
        _Qc_LE_radtow_EMEP = Qc_LE_radtow_EMEP;
    }

    public float getE_radtow() {
        return _E_radtow;
    }

    public void setE_radtow(float E_radtow) {
        _E_radtow = E_radtow;
    }

    public int getE_radtow_EMEP() {
        return _E_radtow_EMEP;
    }

    public void setE_radtow_EMEP(int E_radtow_EMEP) {
        _E_radtow_EMEP = E_radtow_EMEP;
    }

    public int getQc_E_radtow() {
        return _Qc_E_radtow;
    }

    public void setQc_E_radtow(int Qc_E_radtow) {
        _Qc_E_radtow = Qc_E_radtow;
    }

    public int getQc_E_radtow_EMEP() {
        return _Qc_E_radtow_EMEP;
    }

    public void setQc_E_radtow_EMEP(int Qc_E_radtow_EMEP) {
        _Qc_E_radtow_EMEP = Qc_E_radtow_EMEP;
    }

    public float getF_c_radtow() {
        return _F_c_radtow;
    }

    public void setF_c_radtow(float F_c_radtow) {
        _F_c_radtow = F_c_radtow;
    }

    public int getF_c_radtow_EMEP() {
        return _F_c_radtow_EMEP;
    }

    public void setF_c_radtow_EMEP(int F_c_radtow_EMEP) {
        _F_c_radtow_EMEP = F_c_radtow_EMEP;
    }

    public int getQc_F_c_radtow() {
        return _Qc_F_c_radtow;
    }

    public void setQc_F_c_radtow(int Qc_F_c_radtow) {
        _Qc_F_c_radtow = Qc_F_c_radtow;
    }

    public int getQc_F_c_radtow_EMEP() {
        return _Qc_F_c_radtow_EMEP;
    }

    public void setQc_F_c_radtow_EMEP(int Qc_F_c_radtow_EMEP) {
        _Qc_F_c_radtow_EMEP = Qc_F_c_radtow_EMEP;
    }

    public float getTau_radtow() {
        return _tau_radtow;
    }

    public void setTau_radtow(float tau_radtow) {
        _tau_radtow = tau_radtow;
    }

    public int getTau_radtow_EMEP() {
        return _tau_radtow_EMEP;
    }

    public void setTau_radtow_EMEP(int tau_radtow_EMEP) {
        _tau_radtow_EMEP = tau_radtow_EMEP;
    }

    public int getQc_tau_radtow() {
        return _Qc_tau_radtow;
    }

    public void setQc_tau_radtow(int Qc_tau_radtow) {
        _Qc_tau_radtow = Qc_tau_radtow;
    }

    public int getQc_tau_radtow_EMEP() {
        return _Qc_tau_radtow_EMEP;
    }

    public void setQc_tau_radtow_EMEP(int Qc_tau_radtow_EMEP) {
        _Qc_tau_radtow_EMEP = Qc_tau_radtow_EMEP;
    }

    public float getU_star_radtow() {
        return _u_star_radtow;
    }

    public void setU_star_radtow(float u_star_radtow) {
        _u_star_radtow = u_star_radtow;
    }

    public int getU_star_radtow_EMEP() {
        return _u_star_radtow_EMEP;
    }

    public void setU_star_radtow_EMEP(int u_star_radtow_EMEP) {
        _u_star_radtow_EMEP = u_star_radtow_EMEP;
    }

    public float getMO_length_radtow() {
        return _MO_length_radtow;
    }

    public void setMO_length_radtow(float MO_length_radtow) {
        _MO_length_radtow = MO_length_radtow;
    }

    public int getMO_length_radtow_EMEP() {
        return _MO_length_radtow_EMEP;
    }

    public void setMO_length_radtow_EMEP(int MO_length_radtow_EMEP) {
        _MO_length_radtow_EMEP = MO_length_radtow_EMEP;
    }

    public float getStd_u_radtow() {
        return _std_u_radtow;
    }

    public void setStd_u_radtow(float std_u_radtow) {
        _std_u_radtow = std_u_radtow;
    }

    public int getStd_u_radtow_EMEP() {
        return _std_u_radtow_EMEP;
    }

    public void setStd_u_radtow_EMEP(int std_u_radtow_EMEP) {
        _std_u_radtow_EMEP = std_u_radtow_EMEP;
    }

    public float getStd_v_radtow() {
        return _std_v_radtow;
    }

    public void setStd_v_radtow(float std_v_radtow) {
        _std_v_radtow = std_v_radtow;
    }

    public int getStd_v_radtow_EMEP() {
        return _std_v_radtow_EMEP;
    }

    public void setStd_v_radtow_EMEP(int std_v_radtow_EMEP) {
        _std_v_radtow_EMEP = std_v_radtow_EMEP;
    }

    public float getStd_w_radtow() {
        return _std_w_radtow;
    }

    public void setStd_w_radtow(float std_w_radtow) {
        _std_w_radtow = std_w_radtow;
    }

    public int getStd_w_radtow_EMEP() {
        return _std_w_radtow_EMEP;
    }

    public void setStd_w_radtow_EMEP(int std_w_radtow_EMEP) {
        _std_w_radtow_EMEP = std_w_radtow_EMEP;
    }

    public float getStd_t_radtow() {
        return _std_t_radtow;
    }

    public void setStd_t_radtow(float std_t_radtow) {
        _std_t_radtow = std_t_radtow;
    }

    public int getStd_t_radtow_EMEP() {
        return _std_t_radtow_EMEP;
    }

    public void setStd_t_radtow_EMEP(int std_t_radtow_EMEP) {
        _std_t_radtow_EMEP = std_t_radtow_EMEP;
    }

    public float getStd_c_radtow() {
        return _std_c_radtow;
    }

    public void setStd_c_radtow(float std_c_radtow) {
        _std_c_radtow = std_c_radtow;
    }

    public int getStd_c_radtow_EMEP() {
        return _std_c_radtow_EMEP;
    }

    public void setStd_c_radtow_EMEP(int std_c_radtow_EMEP) {
        _std_c_radtow_EMEP = std_c_radtow_EMEP;
    }

    public float getStd_h_radtow() {
        return _std_h_radtow;
    }

    public void setStd_h_radtow(float std_h_radtow) {
        _std_h_radtow = std_h_radtow;
    }

    public int getStd_h_radtow_EMEP() {
        return _std_h_radtow_EMEP;
    }

    public void setStd_h_radtow_EMEP(int std_h_radtow_EMEP) {
        _std_h_radtow_EMEP = std_h_radtow_EMEP;
    }

    public float getAv_u_radtow() {
        return _av_u_radtow;
    }

    public void setAv_u_radtow(float av_u_radtow) {
        _av_u_radtow = av_u_radtow;
    }

    public int getAv_u_radtow_EMEP() {
        return _av_u_radtow_EMEP;
    }

    public void setAv_u_radtow_EMEP(int av_u_radtow_EMEP) {
        _av_u_radtow_EMEP = av_u_radtow_EMEP;
    }

    public float getAv_v_radtow() {
        return _av_v_radtow;
    }

    public void setAv_v_radtow(float av_v_radtow) {
        _av_v_radtow = av_v_radtow;
    }

    public int getAv_v_radtow_EMEP() {
        return _av_v_radtow_EMEP;
    }

    public void setAv_v_radtow_EMEP(int av_v_radtow_EMEP) {
        _av_v_radtow_EMEP = av_v_radtow_EMEP;
    }

    public float getAv_w_radtow() {
        return _av_w_radtow;
    }

    public void setAv_w_radtow(float av_w_radtow) {
        _av_w_radtow = av_w_radtow;
    }

    public int getAv_w_radtow_EMEP() {
        return _av_w_radtow_EMEP;
    }

    public void setAv_w_radtow_EMEP(int av_w_radtow_EMEP) {
        _av_w_radtow_EMEP = av_w_radtow_EMEP;
    }

    public float getAv_t_radtow() {
        return _av_t_radtow;
    }

    public void setAv_t_radtow(float av_t_radtow) {
        _av_t_radtow = av_t_radtow;
    }

    public int getAv_t_radtow_EMEP() {
        return _av_t_radtow_EMEP;
    }

    public void setAv_t_radtow_EMEP(int av_t_radtow_EMEP) {
        _av_t_radtow_EMEP = av_t_radtow_EMEP;
    }

    public float getAv_c_radtow() {
        return _av_c_radtow;
    }

    public void setAv_c_radtow(float av_c_radtow) {
        _av_c_radtow = av_c_radtow;
    }

    public int getAv_c_radtow_EMEP() {
        return _av_c_radtow_EMEP;
    }

    public void setAv_c_radtow_EMEP(int av_c_radtow_EMEP) {
        _av_c_radtow_EMEP = av_c_radtow_EMEP;
    }

    public float getAv_h_radtow() {
        return _av_h_radtow;
    }

    public void setAv_h_radtow(float av_h_radtow) {
        _av_h_radtow = av_h_radtow;
    }

    public int getAv_h_radtow_EMEP() {
        return _av_h_radtow_EMEP;
    }

    public void setAv_h_radtow_EMEP(int av_h_radtow_EMEP) {
        _av_h_radtow_EMEP = av_h_radtow_EMEP;
    }

    public float getU_radtow() {
        return _U_radtow;
    }

    public void setU_radtow(float U_radtow) {
        _U_radtow = U_radtow;
    }

    public int getU_radtow_EMEP() {
        return _U_radtow_EMEP;
    }

    public void setU_radtow_EMEP(int U_radtow_EMEP) {
        _U_radtow_EMEP = U_radtow_EMEP;
    }

    public float getWind_dir_radtow() {
        return _wind_dir_radtow;
    }

    public void setWind_dir_radtow(float wind_dir_radtow) {
        _wind_dir_radtow = wind_dir_radtow;
    }

    public int getWind_dir_radtow_EMEP() {
        return _wind_dir_radtow_EMEP;
    }

    public void setWind_dir_radtow_EMEP(int wind_dir_radtow_EMEP) {
        _wind_dir_radtow_EMEP = wind_dir_radtow_EMEP;
    }

    public float getEta_radtow() {
        return _eta_radtow;
    }

    public void setEta_radtow(float eta_radtow) {
        _eta_radtow = eta_radtow;
    }

    public int getEta_radtow_EMEP() {
        return _eta_radtow_EMEP;
    }

    public void setEta_radtow_EMEP(int eta_radtow_EMEP) {
        _eta_radtow_EMEP = eta_radtow_EMEP;
    }

    public float getTheta_radtow() {
        return _theta_radtow;
    }

    public void setTheta_radtow(float theta_radtow) {
        _theta_radtow = theta_radtow;
    }

    public int getTheta_radtow_EMEP() {
        return _theta_radtow_EMEP;
    }

    public void setTheta_radtow_EMEP(int theta_radtow_EMEP) {
        _theta_radtow_EMEP = theta_radtow_EMEP;
    }

    public float getBeta_radtow() {
        return _beta_radtow;
    }

    public void setBeta_radtow(float beta_radtow) {
        _beta_radtow = beta_radtow;
    }

    public int getBeta_radtow_EMEP() {
        return _beta_radtow_EMEP;
    }

    public void setBeta_radtow_EMEP(int beta_radtow_EMEP) {
        _beta_radtow_EMEP = beta_radtow_EMEP;
    }

    public float getC_lag_radtow() {
        return _c_lag_radtow;
    }

    public void setC_lag_radtow(float c_lag_radtow) {
        _c_lag_radtow = c_lag_radtow;
    }

    public int getC_lag_radtow_EMEP() {
        return _c_lag_radtow_EMEP;
    }

    public void setC_lag_radtow_EMEP(int c_lag_radtow_EMEP) {
        _c_lag_radtow_EMEP = c_lag_radtow_EMEP;
    }

    public float getH_lag_radtow() {
        return _h_lag_radtow;
    }

    public void setH_lag_radtow(float h_lag_radtow) {
        _h_lag_radtow = h_lag_radtow;
    }

    public int getH_lag_radtow_EMEP() {
        return _h_lag_radtow_EMEP;
    }

    public void setH_lag_radtow_EMEP(int h_lag_radtow_EMEP) {
        _h_lag_radtow_EMEP = h_lag_radtow_EMEP;
    }

    public float getErr_packet_radtow() {
        return _err_packet_radtow;
    }

    public void setErr_packet_radtow(float err_packet_radtow) {
        _err_packet_radtow = err_packet_radtow;
    }

    public int getErr_packet_radtow_EMEP() {
        return _err_packet_radtow_EMEP;
    }

    public void setErr_packet_radtow_EMEP(int err_packet_radtow_EMEP) {
        _err_packet_radtow_EMEP = err_packet_radtow_EMEP;
    }

    public float getLicor_t_std_radtow() {
        return _licor_t_std_radtow;
    }

    public void setLicor_t_std_radtow(float licor_t_std_radtow) {
        _licor_t_std_radtow = licor_t_std_radtow;
    }

    public int getLicor_t_std_radtow_EMEP() {
        return _licor_t_std_radtow_EMEP;
    }

    public void setLicor_t_std_radtow_EMEP(int licor_t_std_radtow_EMEP) {
        _licor_t_std_radtow_EMEP = licor_t_std_radtow_EMEP;
    }

    public float getLicor_t_av_radtow() {
        return _licor_t_av_radtow;
    }

    public void setLicor_t_av_radtow(float licor_t_av_radtow) {
        _licor_t_av_radtow = licor_t_av_radtow;
    }

    public int getLicor_t_av_radtow_EMEP() {
        return _licor_t_av_radtow_EMEP;
    }

    public void setLicor_t_av_radtow_EMEP(int licor_t_av_radtow_EMEP) {
        _licor_t_av_radtow_EMEP = licor_t_av_radtow_EMEP;
    }

    public float getLicor_p_std_radtow() {
        return _licor_p_std_radtow;
    }

    public void setLicor_p_std_radtow(float licor_p_std_radtow) {
        _licor_p_std_radtow = licor_p_std_radtow;
    }

    public int getLicor_p_std_radtow_EMEP() {
        return _licor_p_std_radtow_EMEP;
    }

    public void setLicor_p_std_radtow_EMEP(int licor_p_std_radtow_EMEP) {
        _licor_p_std_radtow_EMEP = licor_p_std_radtow_EMEP;
    }

    public float getLicor_p_av_radtow() {
        return _licor_p_av_radtow;
    }

    public void setLicor_p_av_radtow(float licor_p_av_radtow) {
        _licor_p_av_radtow = licor_p_av_radtow;
    }

    public int getLicor_p_av_radtow_EMEP() {
        return _licor_p_av_radtow_EMEP;
    }

    public void setLicor_p_av_radtow_EMEP(int licor_p_av_radtow_EMEP) {
        _licor_p_av_radtow_EMEP = licor_p_av_radtow_EMEP;
    }

    public float getF_O3_radtow() {
        return _F_O3_radtow;
    }

    public void setF_O3_radtow(float F_O3_radtow) {
        _F_O3_radtow = F_O3_radtow;
    }

    public int getF_O3_radtow_EMEP() {
        return _F_O3_radtow_EMEP;
    }

    public void setF_O3_radtow_EMEP(int F_O3_radtow_EMEP) {
        _F_O3_radtow_EMEP = F_O3_radtow_EMEP;
    }

    public int getQc_F_O3_radtow() {
        return _Qc_F_O3_radtow;
    }

    public void setQc_F_O3_radtow(int Qc_F_O3_radtow) {
        _Qc_F_O3_radtow = Qc_F_O3_radtow;
    }

    public int getQc_F_O3_radtow_EMEP() {
        return _Qc_F_O3_radtow_EMEP;
    }

    public void setQc_F_O3_radtow_EMEP(int Qc_F_O3_radtow_EMEP) {
        _Qc_F_O3_radtow_EMEP = Qc_F_O3_radtow_EMEP;
    }

    public float getStd_O3_radtow() {
        return _std_O3_radtow;
    }

    public void setStd_O3_radtow(float std_O3_radtow) {
        _std_O3_radtow = std_O3_radtow;
    }

    public int getStd_O3_radtow_EMEP() {
        return _std_O3_radtow_EMEP;
    }

    public void setStd_O3_radtow_EMEP(int std_O3_radtow_EMEP) {
        _std_O3_radtow_EMEP = std_O3_radtow_EMEP;
    }

    public float getAv_O3_radtow() {
        return _av_O3_radtow;
    }

    public void setAv_O3_radtow(float av_O3_radtow) {
        _av_O3_radtow = av_O3_radtow;
    }

    public int getAv_O3_radtow_EMEP() {
        return _av_O3_radtow_EMEP;
    }

    public void setAv_O3_radtow_EMEP(int av_O3_radtow_EMEP) {
        _av_O3_radtow_EMEP = av_O3_radtow_EMEP;
    }

    public float getO3_lag_radtow() {
        return _O3_lag_radtow;
    }

    public void setO3_lag_radtow(float O3_lag_radtow) {
        _O3_lag_radtow = O3_lag_radtow;
    }

    public int getO3_lag_radtow_EMEP() {
        return _O3_lag_radtow_EMEP;
    }

    public void setO3_lag_radtow_EMEP(int O3_lag_radtow_EMEP) {
        _O3_lag_radtow_EMEP = O3_lag_radtow_EMEP;
    }

    public float getNEE_radtow() {
        return _NEE_radtow;
    }

    public void setNEE_radtow(float NEE_radtow) {
        _NEE_radtow = NEE_radtow;
    }

    public int getNEE_radtow_EMEP() {
        return _NEE_radtow_EMEP;
    }

    public void setNEE_radtow_EMEP(int NEE_radtow_EMEP) {
        _NEE_radtow_EMEP = NEE_radtow_EMEP;
    }

    public int getQc_gapf_NEE_radtow() {
        return _Qc_gapf_NEE_radtow;
    }

    public void setQc_gapf_NEE_radtow(int Qc_gapf_NEE_radtow) {
        _Qc_gapf_NEE_radtow = Qc_gapf_NEE_radtow;
    }

    public int getQc_gapf_NEE_radtow_EMEP() {
        return _Qc_gapf_NEE_radtow_EMEP;
    }

    public void setQc_gapf_NEE_radtow_EMEP(int Qc_gapf_NEE_radtow_EMEP) {
        _Qc_gapf_NEE_radtow_EMEP = Qc_gapf_NEE_radtow_EMEP;
    }

    public float getGPP_radtow() {
        return _GPP_radtow;
    }

    public void setGPP_radtow(float GPP_radtow) {
        _GPP_radtow = GPP_radtow;
    }

    public int getGPP_radtow_EMEP() {
        return _GPP_radtow_EMEP;
    }

    public void setGPP_radtow_EMEP(int GPP_radtow_EMEP) {
        _GPP_radtow_EMEP = GPP_radtow_EMEP;
    }

    public float getTER_radtow() {
        return _TER_radtow;
    }

    public void setTER_radtow(float TER_radtow) {
        _TER_radtow = TER_radtow;
    }

    public int getTER_radtow_EMEP() {
        return _TER_radtow_EMEP;
    }

    public void setTER_radtow_EMEP(int TER_radtow_EMEP) {
        _TER_radtow_EMEP = TER_radtow_EMEP;
    }
}
