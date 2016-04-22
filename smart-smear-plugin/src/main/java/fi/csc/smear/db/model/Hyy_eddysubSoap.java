package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Hyy_eddysubServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Hyy_eddysubServiceSoap
 * @generated
 */
public class Hyy_eddysubSoap implements Serializable {
    private Date _samptime;
    private float _H_subm;
    private int _H_subm_EMEP;
    private int _Qc_H_subm;
    private int _Qc_H_subm_EMEP;
    private float _LE_subm;
    private int _LE_subm_EMEP;
    private int _Qc_LE_subm;
    private int _Qc_LE_subm_EMEP;
    private float _E_subm;
    private int _E_subm_EMEP;
    private int _Qc_E_subm;
    private int _Qc_E_subm_EMEP;
    private float _F_c_subm;
    private int _F_c_subm_EMEP;
    private int _Qc_F_c_subm;
    private int _Qc_F_c_subm_EMEP;
    private float _tau_subm;
    private int _tau_subm_EMEP;
    private int _Qc_tau_subm;
    private int _Qc_tau_subm_EMEP;
    private float _u_star_subm;
    private int _u_star_subm_EMEP;
    private float _MO_length_subm;
    private int _MO_length_subm_EMEP;
    private float _std_u_subm;
    private int _std_u_subm_EMEP;
    private float _std_v_subm;
    private int _std_v_subm_EMEP;
    private float _std_w_subm;
    private int _std_w_subm_EMEP;
    private float _std_t_subm;
    private int _std_t_subm_EMEP;
    private float _std_c_subm;
    private int _std_c_subm_EMEP;
    private float _std_h_subm;
    private int _std_h_subm_EMEP;
    private float _av_u_subm;
    private int _av_u_subm_EMEP;
    private float _av_v_subm;
    private int _av_v_subm_EMEP;
    private float _av_w_subm;
    private int _av_w_subm_EMEP;
    private float _av_t_subm;
    private int _av_t_subm_EMEP;
    private float _av_c_subm;
    private int _av_c_subm_EMEP;
    private float _av_h_subm;
    private int _av_h_subm_EMEP;
    private float _U_subm;
    private int _U_subm_EMEP;
    private float _wind_dir_subm;
    private int _wind_dir_subm_EMEP;
    private float _eta_subm;
    private int _eta_subm_EMEP;
    private float _theta_subm;
    private int _theta_subm_EMEP;
    private float _beta_subm;
    private int _beta_subm_EMEP;
    private float _c_lag_subm;
    private int _c_lag_subm_EMEP;
    private float _h_lag_subm;
    private int _h_lag_subm_EMEP;
    private float _err_packet_subm;
    private int _err_packet_subm_EMEP;
    private float _licor_t_std_subm;
    private int _licor_t_std_subm_EMEP;
    private float _licor_t_av_subm;
    private int _licor_t_av_subm_EMEP;
    private float _licor_p_std_subm;
    private int _licor_p_std_subm_EMEP;
    private float _licor_p_av_subm;
    private int _licor_p_av_subm_EMEP;
    private float _av_O3_subm;
    private int _av_O3_subm_EMEP;
    private float _std_O3_subm;
    private int _std_O3_subm_EMEP;
    private float _O3_lag_subm;
    private int _O3_lag_subm_EMEP;
    private float _F_O3_subm;
    private int _F_O3_subm_EMEP;
    private int _Qc_F_O3_subm;
    private int _Qc_F_O3_subm_EMEP;

    public Hyy_eddysubSoap() {
    }

    public static Hyy_eddysubSoap toSoapModel(Hyy_eddysub model) {
        Hyy_eddysubSoap soapModel = new Hyy_eddysubSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH_subm(model.getH_subm());
        soapModel.setH_subm_EMEP(model.getH_subm_EMEP());
        soapModel.setQc_H_subm(model.getQc_H_subm());
        soapModel.setQc_H_subm_EMEP(model.getQc_H_subm_EMEP());
        soapModel.setLE_subm(model.getLE_subm());
        soapModel.setLE_subm_EMEP(model.getLE_subm_EMEP());
        soapModel.setQc_LE_subm(model.getQc_LE_subm());
        soapModel.setQc_LE_subm_EMEP(model.getQc_LE_subm_EMEP());
        soapModel.setE_subm(model.getE_subm());
        soapModel.setE_subm_EMEP(model.getE_subm_EMEP());
        soapModel.setQc_E_subm(model.getQc_E_subm());
        soapModel.setQc_E_subm_EMEP(model.getQc_E_subm_EMEP());
        soapModel.setF_c_subm(model.getF_c_subm());
        soapModel.setF_c_subm_EMEP(model.getF_c_subm_EMEP());
        soapModel.setQc_F_c_subm(model.getQc_F_c_subm());
        soapModel.setQc_F_c_subm_EMEP(model.getQc_F_c_subm_EMEP());
        soapModel.setTau_subm(model.getTau_subm());
        soapModel.setTau_subm_EMEP(model.getTau_subm_EMEP());
        soapModel.setQc_tau_subm(model.getQc_tau_subm());
        soapModel.setQc_tau_subm_EMEP(model.getQc_tau_subm_EMEP());
        soapModel.setU_star_subm(model.getU_star_subm());
        soapModel.setU_star_subm_EMEP(model.getU_star_subm_EMEP());
        soapModel.setMO_length_subm(model.getMO_length_subm());
        soapModel.setMO_length_subm_EMEP(model.getMO_length_subm_EMEP());
        soapModel.setStd_u_subm(model.getStd_u_subm());
        soapModel.setStd_u_subm_EMEP(model.getStd_u_subm_EMEP());
        soapModel.setStd_v_subm(model.getStd_v_subm());
        soapModel.setStd_v_subm_EMEP(model.getStd_v_subm_EMEP());
        soapModel.setStd_w_subm(model.getStd_w_subm());
        soapModel.setStd_w_subm_EMEP(model.getStd_w_subm_EMEP());
        soapModel.setStd_t_subm(model.getStd_t_subm());
        soapModel.setStd_t_subm_EMEP(model.getStd_t_subm_EMEP());
        soapModel.setStd_c_subm(model.getStd_c_subm());
        soapModel.setStd_c_subm_EMEP(model.getStd_c_subm_EMEP());
        soapModel.setStd_h_subm(model.getStd_h_subm());
        soapModel.setStd_h_subm_EMEP(model.getStd_h_subm_EMEP());
        soapModel.setAv_u_subm(model.getAv_u_subm());
        soapModel.setAv_u_subm_EMEP(model.getAv_u_subm_EMEP());
        soapModel.setAv_v_subm(model.getAv_v_subm());
        soapModel.setAv_v_subm_EMEP(model.getAv_v_subm_EMEP());
        soapModel.setAv_w_subm(model.getAv_w_subm());
        soapModel.setAv_w_subm_EMEP(model.getAv_w_subm_EMEP());
        soapModel.setAv_t_subm(model.getAv_t_subm());
        soapModel.setAv_t_subm_EMEP(model.getAv_t_subm_EMEP());
        soapModel.setAv_c_subm(model.getAv_c_subm());
        soapModel.setAv_c_subm_EMEP(model.getAv_c_subm_EMEP());
        soapModel.setAv_h_subm(model.getAv_h_subm());
        soapModel.setAv_h_subm_EMEP(model.getAv_h_subm_EMEP());
        soapModel.setU_subm(model.getU_subm());
        soapModel.setU_subm_EMEP(model.getU_subm_EMEP());
        soapModel.setWind_dir_subm(model.getWind_dir_subm());
        soapModel.setWind_dir_subm_EMEP(model.getWind_dir_subm_EMEP());
        soapModel.setEta_subm(model.getEta_subm());
        soapModel.setEta_subm_EMEP(model.getEta_subm_EMEP());
        soapModel.setTheta_subm(model.getTheta_subm());
        soapModel.setTheta_subm_EMEP(model.getTheta_subm_EMEP());
        soapModel.setBeta_subm(model.getBeta_subm());
        soapModel.setBeta_subm_EMEP(model.getBeta_subm_EMEP());
        soapModel.setC_lag_subm(model.getC_lag_subm());
        soapModel.setC_lag_subm_EMEP(model.getC_lag_subm_EMEP());
        soapModel.setH_lag_subm(model.getH_lag_subm());
        soapModel.setH_lag_subm_EMEP(model.getH_lag_subm_EMEP());
        soapModel.setErr_packet_subm(model.getErr_packet_subm());
        soapModel.setErr_packet_subm_EMEP(model.getErr_packet_subm_EMEP());
        soapModel.setLicor_t_std_subm(model.getLicor_t_std_subm());
        soapModel.setLicor_t_std_subm_EMEP(model.getLicor_t_std_subm_EMEP());
        soapModel.setLicor_t_av_subm(model.getLicor_t_av_subm());
        soapModel.setLicor_t_av_subm_EMEP(model.getLicor_t_av_subm_EMEP());
        soapModel.setLicor_p_std_subm(model.getLicor_p_std_subm());
        soapModel.setLicor_p_std_subm_EMEP(model.getLicor_p_std_subm_EMEP());
        soapModel.setLicor_p_av_subm(model.getLicor_p_av_subm());
        soapModel.setLicor_p_av_subm_EMEP(model.getLicor_p_av_subm_EMEP());
        soapModel.setAv_O3_subm(model.getAv_O3_subm());
        soapModel.setAv_O3_subm_EMEP(model.getAv_O3_subm_EMEP());
        soapModel.setStd_O3_subm(model.getStd_O3_subm());
        soapModel.setStd_O3_subm_EMEP(model.getStd_O3_subm_EMEP());
        soapModel.setO3_lag_subm(model.getO3_lag_subm());
        soapModel.setO3_lag_subm_EMEP(model.getO3_lag_subm_EMEP());
        soapModel.setF_O3_subm(model.getF_O3_subm());
        soapModel.setF_O3_subm_EMEP(model.getF_O3_subm_EMEP());
        soapModel.setQc_F_O3_subm(model.getQc_F_O3_subm());
        soapModel.setQc_F_O3_subm_EMEP(model.getQc_F_O3_subm_EMEP());

        return soapModel;
    }

    public static Hyy_eddysubSoap[] toSoapModels(Hyy_eddysub[] models) {
        Hyy_eddysubSoap[] soapModels = new Hyy_eddysubSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Hyy_eddysubSoap[][] toSoapModels(Hyy_eddysub[][] models) {
        Hyy_eddysubSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Hyy_eddysubSoap[models.length][models[0].length];
        } else {
            soapModels = new Hyy_eddysubSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Hyy_eddysubSoap[] toSoapModels(List<Hyy_eddysub> models) {
        List<Hyy_eddysubSoap> soapModels = new ArrayList<Hyy_eddysubSoap>(models.size());

        for (Hyy_eddysub model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Hyy_eddysubSoap[soapModels.size()]);
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

    public float getH_subm() {
        return _H_subm;
    }

    public void setH_subm(float H_subm) {
        _H_subm = H_subm;
    }

    public int getH_subm_EMEP() {
        return _H_subm_EMEP;
    }

    public void setH_subm_EMEP(int H_subm_EMEP) {
        _H_subm_EMEP = H_subm_EMEP;
    }

    public int getQc_H_subm() {
        return _Qc_H_subm;
    }

    public void setQc_H_subm(int Qc_H_subm) {
        _Qc_H_subm = Qc_H_subm;
    }

    public int getQc_H_subm_EMEP() {
        return _Qc_H_subm_EMEP;
    }

    public void setQc_H_subm_EMEP(int Qc_H_subm_EMEP) {
        _Qc_H_subm_EMEP = Qc_H_subm_EMEP;
    }

    public float getLE_subm() {
        return _LE_subm;
    }

    public void setLE_subm(float LE_subm) {
        _LE_subm = LE_subm;
    }

    public int getLE_subm_EMEP() {
        return _LE_subm_EMEP;
    }

    public void setLE_subm_EMEP(int LE_subm_EMEP) {
        _LE_subm_EMEP = LE_subm_EMEP;
    }

    public int getQc_LE_subm() {
        return _Qc_LE_subm;
    }

    public void setQc_LE_subm(int Qc_LE_subm) {
        _Qc_LE_subm = Qc_LE_subm;
    }

    public int getQc_LE_subm_EMEP() {
        return _Qc_LE_subm_EMEP;
    }

    public void setQc_LE_subm_EMEP(int Qc_LE_subm_EMEP) {
        _Qc_LE_subm_EMEP = Qc_LE_subm_EMEP;
    }

    public float getE_subm() {
        return _E_subm;
    }

    public void setE_subm(float E_subm) {
        _E_subm = E_subm;
    }

    public int getE_subm_EMEP() {
        return _E_subm_EMEP;
    }

    public void setE_subm_EMEP(int E_subm_EMEP) {
        _E_subm_EMEP = E_subm_EMEP;
    }

    public int getQc_E_subm() {
        return _Qc_E_subm;
    }

    public void setQc_E_subm(int Qc_E_subm) {
        _Qc_E_subm = Qc_E_subm;
    }

    public int getQc_E_subm_EMEP() {
        return _Qc_E_subm_EMEP;
    }

    public void setQc_E_subm_EMEP(int Qc_E_subm_EMEP) {
        _Qc_E_subm_EMEP = Qc_E_subm_EMEP;
    }

    public float getF_c_subm() {
        return _F_c_subm;
    }

    public void setF_c_subm(float F_c_subm) {
        _F_c_subm = F_c_subm;
    }

    public int getF_c_subm_EMEP() {
        return _F_c_subm_EMEP;
    }

    public void setF_c_subm_EMEP(int F_c_subm_EMEP) {
        _F_c_subm_EMEP = F_c_subm_EMEP;
    }

    public int getQc_F_c_subm() {
        return _Qc_F_c_subm;
    }

    public void setQc_F_c_subm(int Qc_F_c_subm) {
        _Qc_F_c_subm = Qc_F_c_subm;
    }

    public int getQc_F_c_subm_EMEP() {
        return _Qc_F_c_subm_EMEP;
    }

    public void setQc_F_c_subm_EMEP(int Qc_F_c_subm_EMEP) {
        _Qc_F_c_subm_EMEP = Qc_F_c_subm_EMEP;
    }

    public float getTau_subm() {
        return _tau_subm;
    }

    public void setTau_subm(float tau_subm) {
        _tau_subm = tau_subm;
    }

    public int getTau_subm_EMEP() {
        return _tau_subm_EMEP;
    }

    public void setTau_subm_EMEP(int tau_subm_EMEP) {
        _tau_subm_EMEP = tau_subm_EMEP;
    }

    public int getQc_tau_subm() {
        return _Qc_tau_subm;
    }

    public void setQc_tau_subm(int Qc_tau_subm) {
        _Qc_tau_subm = Qc_tau_subm;
    }

    public int getQc_tau_subm_EMEP() {
        return _Qc_tau_subm_EMEP;
    }

    public void setQc_tau_subm_EMEP(int Qc_tau_subm_EMEP) {
        _Qc_tau_subm_EMEP = Qc_tau_subm_EMEP;
    }

    public float getU_star_subm() {
        return _u_star_subm;
    }

    public void setU_star_subm(float u_star_subm) {
        _u_star_subm = u_star_subm;
    }

    public int getU_star_subm_EMEP() {
        return _u_star_subm_EMEP;
    }

    public void setU_star_subm_EMEP(int u_star_subm_EMEP) {
        _u_star_subm_EMEP = u_star_subm_EMEP;
    }

    public float getMO_length_subm() {
        return _MO_length_subm;
    }

    public void setMO_length_subm(float MO_length_subm) {
        _MO_length_subm = MO_length_subm;
    }

    public int getMO_length_subm_EMEP() {
        return _MO_length_subm_EMEP;
    }

    public void setMO_length_subm_EMEP(int MO_length_subm_EMEP) {
        _MO_length_subm_EMEP = MO_length_subm_EMEP;
    }

    public float getStd_u_subm() {
        return _std_u_subm;
    }

    public void setStd_u_subm(float std_u_subm) {
        _std_u_subm = std_u_subm;
    }

    public int getStd_u_subm_EMEP() {
        return _std_u_subm_EMEP;
    }

    public void setStd_u_subm_EMEP(int std_u_subm_EMEP) {
        _std_u_subm_EMEP = std_u_subm_EMEP;
    }

    public float getStd_v_subm() {
        return _std_v_subm;
    }

    public void setStd_v_subm(float std_v_subm) {
        _std_v_subm = std_v_subm;
    }

    public int getStd_v_subm_EMEP() {
        return _std_v_subm_EMEP;
    }

    public void setStd_v_subm_EMEP(int std_v_subm_EMEP) {
        _std_v_subm_EMEP = std_v_subm_EMEP;
    }

    public float getStd_w_subm() {
        return _std_w_subm;
    }

    public void setStd_w_subm(float std_w_subm) {
        _std_w_subm = std_w_subm;
    }

    public int getStd_w_subm_EMEP() {
        return _std_w_subm_EMEP;
    }

    public void setStd_w_subm_EMEP(int std_w_subm_EMEP) {
        _std_w_subm_EMEP = std_w_subm_EMEP;
    }

    public float getStd_t_subm() {
        return _std_t_subm;
    }

    public void setStd_t_subm(float std_t_subm) {
        _std_t_subm = std_t_subm;
    }

    public int getStd_t_subm_EMEP() {
        return _std_t_subm_EMEP;
    }

    public void setStd_t_subm_EMEP(int std_t_subm_EMEP) {
        _std_t_subm_EMEP = std_t_subm_EMEP;
    }

    public float getStd_c_subm() {
        return _std_c_subm;
    }

    public void setStd_c_subm(float std_c_subm) {
        _std_c_subm = std_c_subm;
    }

    public int getStd_c_subm_EMEP() {
        return _std_c_subm_EMEP;
    }

    public void setStd_c_subm_EMEP(int std_c_subm_EMEP) {
        _std_c_subm_EMEP = std_c_subm_EMEP;
    }

    public float getStd_h_subm() {
        return _std_h_subm;
    }

    public void setStd_h_subm(float std_h_subm) {
        _std_h_subm = std_h_subm;
    }

    public int getStd_h_subm_EMEP() {
        return _std_h_subm_EMEP;
    }

    public void setStd_h_subm_EMEP(int std_h_subm_EMEP) {
        _std_h_subm_EMEP = std_h_subm_EMEP;
    }

    public float getAv_u_subm() {
        return _av_u_subm;
    }

    public void setAv_u_subm(float av_u_subm) {
        _av_u_subm = av_u_subm;
    }

    public int getAv_u_subm_EMEP() {
        return _av_u_subm_EMEP;
    }

    public void setAv_u_subm_EMEP(int av_u_subm_EMEP) {
        _av_u_subm_EMEP = av_u_subm_EMEP;
    }

    public float getAv_v_subm() {
        return _av_v_subm;
    }

    public void setAv_v_subm(float av_v_subm) {
        _av_v_subm = av_v_subm;
    }

    public int getAv_v_subm_EMEP() {
        return _av_v_subm_EMEP;
    }

    public void setAv_v_subm_EMEP(int av_v_subm_EMEP) {
        _av_v_subm_EMEP = av_v_subm_EMEP;
    }

    public float getAv_w_subm() {
        return _av_w_subm;
    }

    public void setAv_w_subm(float av_w_subm) {
        _av_w_subm = av_w_subm;
    }

    public int getAv_w_subm_EMEP() {
        return _av_w_subm_EMEP;
    }

    public void setAv_w_subm_EMEP(int av_w_subm_EMEP) {
        _av_w_subm_EMEP = av_w_subm_EMEP;
    }

    public float getAv_t_subm() {
        return _av_t_subm;
    }

    public void setAv_t_subm(float av_t_subm) {
        _av_t_subm = av_t_subm;
    }

    public int getAv_t_subm_EMEP() {
        return _av_t_subm_EMEP;
    }

    public void setAv_t_subm_EMEP(int av_t_subm_EMEP) {
        _av_t_subm_EMEP = av_t_subm_EMEP;
    }

    public float getAv_c_subm() {
        return _av_c_subm;
    }

    public void setAv_c_subm(float av_c_subm) {
        _av_c_subm = av_c_subm;
    }

    public int getAv_c_subm_EMEP() {
        return _av_c_subm_EMEP;
    }

    public void setAv_c_subm_EMEP(int av_c_subm_EMEP) {
        _av_c_subm_EMEP = av_c_subm_EMEP;
    }

    public float getAv_h_subm() {
        return _av_h_subm;
    }

    public void setAv_h_subm(float av_h_subm) {
        _av_h_subm = av_h_subm;
    }

    public int getAv_h_subm_EMEP() {
        return _av_h_subm_EMEP;
    }

    public void setAv_h_subm_EMEP(int av_h_subm_EMEP) {
        _av_h_subm_EMEP = av_h_subm_EMEP;
    }

    public float getU_subm() {
        return _U_subm;
    }

    public void setU_subm(float U_subm) {
        _U_subm = U_subm;
    }

    public int getU_subm_EMEP() {
        return _U_subm_EMEP;
    }

    public void setU_subm_EMEP(int U_subm_EMEP) {
        _U_subm_EMEP = U_subm_EMEP;
    }

    public float getWind_dir_subm() {
        return _wind_dir_subm;
    }

    public void setWind_dir_subm(float wind_dir_subm) {
        _wind_dir_subm = wind_dir_subm;
    }

    public int getWind_dir_subm_EMEP() {
        return _wind_dir_subm_EMEP;
    }

    public void setWind_dir_subm_EMEP(int wind_dir_subm_EMEP) {
        _wind_dir_subm_EMEP = wind_dir_subm_EMEP;
    }

    public float getEta_subm() {
        return _eta_subm;
    }

    public void setEta_subm(float eta_subm) {
        _eta_subm = eta_subm;
    }

    public int getEta_subm_EMEP() {
        return _eta_subm_EMEP;
    }

    public void setEta_subm_EMEP(int eta_subm_EMEP) {
        _eta_subm_EMEP = eta_subm_EMEP;
    }

    public float getTheta_subm() {
        return _theta_subm;
    }

    public void setTheta_subm(float theta_subm) {
        _theta_subm = theta_subm;
    }

    public int getTheta_subm_EMEP() {
        return _theta_subm_EMEP;
    }

    public void setTheta_subm_EMEP(int theta_subm_EMEP) {
        _theta_subm_EMEP = theta_subm_EMEP;
    }

    public float getBeta_subm() {
        return _beta_subm;
    }

    public void setBeta_subm(float beta_subm) {
        _beta_subm = beta_subm;
    }

    public int getBeta_subm_EMEP() {
        return _beta_subm_EMEP;
    }

    public void setBeta_subm_EMEP(int beta_subm_EMEP) {
        _beta_subm_EMEP = beta_subm_EMEP;
    }

    public float getC_lag_subm() {
        return _c_lag_subm;
    }

    public void setC_lag_subm(float c_lag_subm) {
        _c_lag_subm = c_lag_subm;
    }

    public int getC_lag_subm_EMEP() {
        return _c_lag_subm_EMEP;
    }

    public void setC_lag_subm_EMEP(int c_lag_subm_EMEP) {
        _c_lag_subm_EMEP = c_lag_subm_EMEP;
    }

    public float getH_lag_subm() {
        return _h_lag_subm;
    }

    public void setH_lag_subm(float h_lag_subm) {
        _h_lag_subm = h_lag_subm;
    }

    public int getH_lag_subm_EMEP() {
        return _h_lag_subm_EMEP;
    }

    public void setH_lag_subm_EMEP(int h_lag_subm_EMEP) {
        _h_lag_subm_EMEP = h_lag_subm_EMEP;
    }

    public float getErr_packet_subm() {
        return _err_packet_subm;
    }

    public void setErr_packet_subm(float err_packet_subm) {
        _err_packet_subm = err_packet_subm;
    }

    public int getErr_packet_subm_EMEP() {
        return _err_packet_subm_EMEP;
    }

    public void setErr_packet_subm_EMEP(int err_packet_subm_EMEP) {
        _err_packet_subm_EMEP = err_packet_subm_EMEP;
    }

    public float getLicor_t_std_subm() {
        return _licor_t_std_subm;
    }

    public void setLicor_t_std_subm(float licor_t_std_subm) {
        _licor_t_std_subm = licor_t_std_subm;
    }

    public int getLicor_t_std_subm_EMEP() {
        return _licor_t_std_subm_EMEP;
    }

    public void setLicor_t_std_subm_EMEP(int licor_t_std_subm_EMEP) {
        _licor_t_std_subm_EMEP = licor_t_std_subm_EMEP;
    }

    public float getLicor_t_av_subm() {
        return _licor_t_av_subm;
    }

    public void setLicor_t_av_subm(float licor_t_av_subm) {
        _licor_t_av_subm = licor_t_av_subm;
    }

    public int getLicor_t_av_subm_EMEP() {
        return _licor_t_av_subm_EMEP;
    }

    public void setLicor_t_av_subm_EMEP(int licor_t_av_subm_EMEP) {
        _licor_t_av_subm_EMEP = licor_t_av_subm_EMEP;
    }

    public float getLicor_p_std_subm() {
        return _licor_p_std_subm;
    }

    public void setLicor_p_std_subm(float licor_p_std_subm) {
        _licor_p_std_subm = licor_p_std_subm;
    }

    public int getLicor_p_std_subm_EMEP() {
        return _licor_p_std_subm_EMEP;
    }

    public void setLicor_p_std_subm_EMEP(int licor_p_std_subm_EMEP) {
        _licor_p_std_subm_EMEP = licor_p_std_subm_EMEP;
    }

    public float getLicor_p_av_subm() {
        return _licor_p_av_subm;
    }

    public void setLicor_p_av_subm(float licor_p_av_subm) {
        _licor_p_av_subm = licor_p_av_subm;
    }

    public int getLicor_p_av_subm_EMEP() {
        return _licor_p_av_subm_EMEP;
    }

    public void setLicor_p_av_subm_EMEP(int licor_p_av_subm_EMEP) {
        _licor_p_av_subm_EMEP = licor_p_av_subm_EMEP;
    }

    public float getAv_O3_subm() {
        return _av_O3_subm;
    }

    public void setAv_O3_subm(float av_O3_subm) {
        _av_O3_subm = av_O3_subm;
    }

    public int getAv_O3_subm_EMEP() {
        return _av_O3_subm_EMEP;
    }

    public void setAv_O3_subm_EMEP(int av_O3_subm_EMEP) {
        _av_O3_subm_EMEP = av_O3_subm_EMEP;
    }

    public float getStd_O3_subm() {
        return _std_O3_subm;
    }

    public void setStd_O3_subm(float std_O3_subm) {
        _std_O3_subm = std_O3_subm;
    }

    public int getStd_O3_subm_EMEP() {
        return _std_O3_subm_EMEP;
    }

    public void setStd_O3_subm_EMEP(int std_O3_subm_EMEP) {
        _std_O3_subm_EMEP = std_O3_subm_EMEP;
    }

    public float getO3_lag_subm() {
        return _O3_lag_subm;
    }

    public void setO3_lag_subm(float O3_lag_subm) {
        _O3_lag_subm = O3_lag_subm;
    }

    public int getO3_lag_subm_EMEP() {
        return _O3_lag_subm_EMEP;
    }

    public void setO3_lag_subm_EMEP(int O3_lag_subm_EMEP) {
        _O3_lag_subm_EMEP = O3_lag_subm_EMEP;
    }

    public float getF_O3_subm() {
        return _F_O3_subm;
    }

    public void setF_O3_subm(float F_O3_subm) {
        _F_O3_subm = F_O3_subm;
    }

    public int getF_O3_subm_EMEP() {
        return _F_O3_subm_EMEP;
    }

    public void setF_O3_subm_EMEP(int F_O3_subm_EMEP) {
        _F_O3_subm_EMEP = F_O3_subm_EMEP;
    }

    public int getQc_F_O3_subm() {
        return _Qc_F_O3_subm;
    }

    public void setQc_F_O3_subm(int Qc_F_O3_subm) {
        _Qc_F_O3_subm = Qc_F_O3_subm;
    }

    public int getQc_F_O3_subm_EMEP() {
        return _Qc_F_O3_subm_EMEP;
    }

    public void setQc_F_O3_subm_EMEP(int Qc_F_O3_subm_EMEP) {
        _Qc_F_O3_subm_EMEP = Qc_F_O3_subm_EMEP;
    }
}
