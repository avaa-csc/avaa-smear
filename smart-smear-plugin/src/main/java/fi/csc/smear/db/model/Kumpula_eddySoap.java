package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Kumpula_eddyServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Kumpula_eddyServiceSoap
 * @generated
 */
public class Kumpula_eddySoap implements Serializable {
    private Date _samptime;
    private int _H;
    private int _H_EMEP;
    private int _Qc_H;
    private int _Qc_H_EMEP;
    private float _LE;
    private int _LE_EMEP;
    private int _Qc_LE;
    private int _Qc_LE_EMEP;
    private float _E;
    private int _E_EMEP;
    private int _Qc_E;
    private int _Qc_E_EMEP;
    private float _F_c;
    private int _F_c_EMEP;
    private int _Qc_F_c;
    private int _Qc_F_c_EMEP;
    private float _tau;
    private int _tau_EMEP;
    private int _Qc_tau;
    private int _Qc_tau_EMEP;
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
    private float _eta;
    private int _eta_EMEP;
    private float _theta;
    private int _theta_EMEP;
    private float _beta;
    private int _beta_EMEP;
    private float _c_lag;
    private int _c_lag_EMEP;
    private float _h_lag;
    private int _h_lag_EMEP;
    private float _err_packet;
    private int _err_packet_EMEP;
    private float _licor_t_std;
    private int _licor_t_std_EMEP;
    private float _licor_t_av;
    private int _licor_t_av_EMEP;
    private float _licor_p_std;
    private int _licor_p_std_EMEP;
    private float _licor_p_av;
    private int _licor_p_av_EMEP;
    private float _LE_op;
    private int _LE_op_EMEP;
    private int _Qc_LE_op;
    private int _Qc_LE_op_EMEP;
    private float _E_op;
    private int _E_op_EMEP;
    private int _Qc_E_op;
    private int _Qc_E_op_EMEP;
    private float _F_c_op;
    private int _F_c_op_EMEP;
    private int _Qc_F_c_op;
    private int _Qc_F_c_op_EMEP;
    private float _std_c_op;
    private int _std_c_op_EMEP;
    private float _std_h_op;
    private int _std_h_op_EMEP;
    private float _av_c_op;
    private int _av_c_op_EMEP;
    private float _av_h_op;
    private int _av_h_op_EMEP;
    private float _c_lag_op;
    private int _c_lag_op_EMEP;
    private float _h_lag_op;
    private int _h_lag_op_EMEP;
    private float _F_CPC;
    private int _F_CPC_EMEP;
    private int _Qc_F_CPC;
    private int _Qc_F_CPC_EMEP;
    private float _std_CPC;
    private int _std_CPC_EMEP;
    private float _av_CPC;
    private int _av_CPC_EMEP;
    private float _CPC_lag;
    private int _CPC_lag_EMEP;
    private float _F_N2O;
    private int _F_N2O_EMEP;
    private int _Qc_F_N2O;
    private int _Qc_F_N2O_EMEP;
    private float _std_N2O;
    private int _std_N2O_EMEP;
    private float _av_N2O;
    private int _av_N2O_EMEP;
    private float _N2O_lag;
    private int _N2O_lag_EMEP;

    public Kumpula_eddySoap() {
    }

    public static Kumpula_eddySoap toSoapModel(Kumpula_eddy model) {
        Kumpula_eddySoap soapModel = new Kumpula_eddySoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH(model.getH());
        soapModel.setH_EMEP(model.getH_EMEP());
        soapModel.setQc_H(model.getQc_H());
        soapModel.setQc_H_EMEP(model.getQc_H_EMEP());
        soapModel.setLE(model.getLE());
        soapModel.setLE_EMEP(model.getLE_EMEP());
        soapModel.setQc_LE(model.getQc_LE());
        soapModel.setQc_LE_EMEP(model.getQc_LE_EMEP());
        soapModel.setE(model.getE());
        soapModel.setE_EMEP(model.getE_EMEP());
        soapModel.setQc_E(model.getQc_E());
        soapModel.setQc_E_EMEP(model.getQc_E_EMEP());
        soapModel.setF_c(model.getF_c());
        soapModel.setF_c_EMEP(model.getF_c_EMEP());
        soapModel.setQc_F_c(model.getQc_F_c());
        soapModel.setQc_F_c_EMEP(model.getQc_F_c_EMEP());
        soapModel.setTau(model.getTau());
        soapModel.setTau_EMEP(model.getTau_EMEP());
        soapModel.setQc_tau(model.getQc_tau());
        soapModel.setQc_tau_EMEP(model.getQc_tau_EMEP());
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
        soapModel.setEta(model.getEta());
        soapModel.setEta_EMEP(model.getEta_EMEP());
        soapModel.setTheta(model.getTheta());
        soapModel.setTheta_EMEP(model.getTheta_EMEP());
        soapModel.setBeta(model.getBeta());
        soapModel.setBeta_EMEP(model.getBeta_EMEP());
        soapModel.setC_lag(model.getC_lag());
        soapModel.setC_lag_EMEP(model.getC_lag_EMEP());
        soapModel.setH_lag(model.getH_lag());
        soapModel.setH_lag_EMEP(model.getH_lag_EMEP());
        soapModel.setErr_packet(model.getErr_packet());
        soapModel.setErr_packet_EMEP(model.getErr_packet_EMEP());
        soapModel.setLicor_t_std(model.getLicor_t_std());
        soapModel.setLicor_t_std_EMEP(model.getLicor_t_std_EMEP());
        soapModel.setLicor_t_av(model.getLicor_t_av());
        soapModel.setLicor_t_av_EMEP(model.getLicor_t_av_EMEP());
        soapModel.setLicor_p_std(model.getLicor_p_std());
        soapModel.setLicor_p_std_EMEP(model.getLicor_p_std_EMEP());
        soapModel.setLicor_p_av(model.getLicor_p_av());
        soapModel.setLicor_p_av_EMEP(model.getLicor_p_av_EMEP());
        soapModel.setLE_op(model.getLE_op());
        soapModel.setLE_op_EMEP(model.getLE_op_EMEP());
        soapModel.setQc_LE_op(model.getQc_LE_op());
        soapModel.setQc_LE_op_EMEP(model.getQc_LE_op_EMEP());
        soapModel.setE_op(model.getE_op());
        soapModel.setE_op_EMEP(model.getE_op_EMEP());
        soapModel.setQc_E_op(model.getQc_E_op());
        soapModel.setQc_E_op_EMEP(model.getQc_E_op_EMEP());
        soapModel.setF_c_op(model.getF_c_op());
        soapModel.setF_c_op_EMEP(model.getF_c_op_EMEP());
        soapModel.setQc_F_c_op(model.getQc_F_c_op());
        soapModel.setQc_F_c_op_EMEP(model.getQc_F_c_op_EMEP());
        soapModel.setStd_c_op(model.getStd_c_op());
        soapModel.setStd_c_op_EMEP(model.getStd_c_op_EMEP());
        soapModel.setStd_h_op(model.getStd_h_op());
        soapModel.setStd_h_op_EMEP(model.getStd_h_op_EMEP());
        soapModel.setAv_c_op(model.getAv_c_op());
        soapModel.setAv_c_op_EMEP(model.getAv_c_op_EMEP());
        soapModel.setAv_h_op(model.getAv_h_op());
        soapModel.setAv_h_op_EMEP(model.getAv_h_op_EMEP());
        soapModel.setC_lag_op(model.getC_lag_op());
        soapModel.setC_lag_op_EMEP(model.getC_lag_op_EMEP());
        soapModel.setH_lag_op(model.getH_lag_op());
        soapModel.setH_lag_op_EMEP(model.getH_lag_op_EMEP());
        soapModel.setF_CPC(model.getF_CPC());
        soapModel.setF_CPC_EMEP(model.getF_CPC_EMEP());
        soapModel.setQc_F_CPC(model.getQc_F_CPC());
        soapModel.setQc_F_CPC_EMEP(model.getQc_F_CPC_EMEP());
        soapModel.setStd_CPC(model.getStd_CPC());
        soapModel.setStd_CPC_EMEP(model.getStd_CPC_EMEP());
        soapModel.setAv_CPC(model.getAv_CPC());
        soapModel.setAv_CPC_EMEP(model.getAv_CPC_EMEP());
        soapModel.setCPC_lag(model.getCPC_lag());
        soapModel.setCPC_lag_EMEP(model.getCPC_lag_EMEP());
        soapModel.setF_N2O(model.getF_N2O());
        soapModel.setF_N2O_EMEP(model.getF_N2O_EMEP());
        soapModel.setQc_F_N2O(model.getQc_F_N2O());
        soapModel.setQc_F_N2O_EMEP(model.getQc_F_N2O_EMEP());
        soapModel.setStd_N2O(model.getStd_N2O());
        soapModel.setStd_N2O_EMEP(model.getStd_N2O_EMEP());
        soapModel.setAv_N2O(model.getAv_N2O());
        soapModel.setAv_N2O_EMEP(model.getAv_N2O_EMEP());
        soapModel.setN2O_lag(model.getN2O_lag());
        soapModel.setN2O_lag_EMEP(model.getN2O_lag_EMEP());

        return soapModel;
    }

    public static Kumpula_eddySoap[] toSoapModels(Kumpula_eddy[] models) {
        Kumpula_eddySoap[] soapModels = new Kumpula_eddySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Kumpula_eddySoap[][] toSoapModels(Kumpula_eddy[][] models) {
        Kumpula_eddySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Kumpula_eddySoap[models.length][models[0].length];
        } else {
            soapModels = new Kumpula_eddySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Kumpula_eddySoap[] toSoapModels(List<Kumpula_eddy> models) {
        List<Kumpula_eddySoap> soapModels = new ArrayList<Kumpula_eddySoap>(models.size());

        for (Kumpula_eddy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Kumpula_eddySoap[soapModels.size()]);
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

    public int getH() {
        return _H;
    }

    public void setH(int H) {
        _H = H;
    }

    public int getH_EMEP() {
        return _H_EMEP;
    }

    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;
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

    public int getQc_LE() {
        return _Qc_LE;
    }

    public void setQc_LE(int Qc_LE) {
        _Qc_LE = Qc_LE;
    }

    public int getQc_LE_EMEP() {
        return _Qc_LE_EMEP;
    }

    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _Qc_LE_EMEP = Qc_LE_EMEP;
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

    public int getQc_E() {
        return _Qc_E;
    }

    public void setQc_E(int Qc_E) {
        _Qc_E = Qc_E;
    }

    public int getQc_E_EMEP() {
        return _Qc_E_EMEP;
    }

    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _Qc_E_EMEP = Qc_E_EMEP;
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

    public int getQc_F_c() {
        return _Qc_F_c;
    }

    public void setQc_F_c(int Qc_F_c) {
        _Qc_F_c = Qc_F_c;
    }

    public int getQc_F_c_EMEP() {
        return _Qc_F_c_EMEP;
    }

    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _Qc_F_c_EMEP = Qc_F_c_EMEP;
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

    public float getLE_op() {
        return _LE_op;
    }

    public void setLE_op(float LE_op) {
        _LE_op = LE_op;
    }

    public int getLE_op_EMEP() {
        return _LE_op_EMEP;
    }

    public void setLE_op_EMEP(int LE_op_EMEP) {
        _LE_op_EMEP = LE_op_EMEP;
    }

    public int getQc_LE_op() {
        return _Qc_LE_op;
    }

    public void setQc_LE_op(int Qc_LE_op) {
        _Qc_LE_op = Qc_LE_op;
    }

    public int getQc_LE_op_EMEP() {
        return _Qc_LE_op_EMEP;
    }

    public void setQc_LE_op_EMEP(int Qc_LE_op_EMEP) {
        _Qc_LE_op_EMEP = Qc_LE_op_EMEP;
    }

    public float getE_op() {
        return _E_op;
    }

    public void setE_op(float E_op) {
        _E_op = E_op;
    }

    public int getE_op_EMEP() {
        return _E_op_EMEP;
    }

    public void setE_op_EMEP(int E_op_EMEP) {
        _E_op_EMEP = E_op_EMEP;
    }

    public int getQc_E_op() {
        return _Qc_E_op;
    }

    public void setQc_E_op(int Qc_E_op) {
        _Qc_E_op = Qc_E_op;
    }

    public int getQc_E_op_EMEP() {
        return _Qc_E_op_EMEP;
    }

    public void setQc_E_op_EMEP(int Qc_E_op_EMEP) {
        _Qc_E_op_EMEP = Qc_E_op_EMEP;
    }

    public float getF_c_op() {
        return _F_c_op;
    }

    public void setF_c_op(float F_c_op) {
        _F_c_op = F_c_op;
    }

    public int getF_c_op_EMEP() {
        return _F_c_op_EMEP;
    }

    public void setF_c_op_EMEP(int F_c_op_EMEP) {
        _F_c_op_EMEP = F_c_op_EMEP;
    }

    public int getQc_F_c_op() {
        return _Qc_F_c_op;
    }

    public void setQc_F_c_op(int Qc_F_c_op) {
        _Qc_F_c_op = Qc_F_c_op;
    }

    public int getQc_F_c_op_EMEP() {
        return _Qc_F_c_op_EMEP;
    }

    public void setQc_F_c_op_EMEP(int Qc_F_c_op_EMEP) {
        _Qc_F_c_op_EMEP = Qc_F_c_op_EMEP;
    }

    public float getStd_c_op() {
        return _std_c_op;
    }

    public void setStd_c_op(float std_c_op) {
        _std_c_op = std_c_op;
    }

    public int getStd_c_op_EMEP() {
        return _std_c_op_EMEP;
    }

    public void setStd_c_op_EMEP(int std_c_op_EMEP) {
        _std_c_op_EMEP = std_c_op_EMEP;
    }

    public float getStd_h_op() {
        return _std_h_op;
    }

    public void setStd_h_op(float std_h_op) {
        _std_h_op = std_h_op;
    }

    public int getStd_h_op_EMEP() {
        return _std_h_op_EMEP;
    }

    public void setStd_h_op_EMEP(int std_h_op_EMEP) {
        _std_h_op_EMEP = std_h_op_EMEP;
    }

    public float getAv_c_op() {
        return _av_c_op;
    }

    public void setAv_c_op(float av_c_op) {
        _av_c_op = av_c_op;
    }

    public int getAv_c_op_EMEP() {
        return _av_c_op_EMEP;
    }

    public void setAv_c_op_EMEP(int av_c_op_EMEP) {
        _av_c_op_EMEP = av_c_op_EMEP;
    }

    public float getAv_h_op() {
        return _av_h_op;
    }

    public void setAv_h_op(float av_h_op) {
        _av_h_op = av_h_op;
    }

    public int getAv_h_op_EMEP() {
        return _av_h_op_EMEP;
    }

    public void setAv_h_op_EMEP(int av_h_op_EMEP) {
        _av_h_op_EMEP = av_h_op_EMEP;
    }

    public float getC_lag_op() {
        return _c_lag_op;
    }

    public void setC_lag_op(float c_lag_op) {
        _c_lag_op = c_lag_op;
    }

    public int getC_lag_op_EMEP() {
        return _c_lag_op_EMEP;
    }

    public void setC_lag_op_EMEP(int c_lag_op_EMEP) {
        _c_lag_op_EMEP = c_lag_op_EMEP;
    }

    public float getH_lag_op() {
        return _h_lag_op;
    }

    public void setH_lag_op(float h_lag_op) {
        _h_lag_op = h_lag_op;
    }

    public int getH_lag_op_EMEP() {
        return _h_lag_op_EMEP;
    }

    public void setH_lag_op_EMEP(int h_lag_op_EMEP) {
        _h_lag_op_EMEP = h_lag_op_EMEP;
    }

    public float getF_CPC() {
        return _F_CPC;
    }

    public void setF_CPC(float F_CPC) {
        _F_CPC = F_CPC;
    }

    public int getF_CPC_EMEP() {
        return _F_CPC_EMEP;
    }

    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _F_CPC_EMEP = F_CPC_EMEP;
    }

    public int getQc_F_CPC() {
        return _Qc_F_CPC;
    }

    public void setQc_F_CPC(int Qc_F_CPC) {
        _Qc_F_CPC = Qc_F_CPC;
    }

    public int getQc_F_CPC_EMEP() {
        return _Qc_F_CPC_EMEP;
    }

    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _Qc_F_CPC_EMEP = Qc_F_CPC_EMEP;
    }

    public float getStd_CPC() {
        return _std_CPC;
    }

    public void setStd_CPC(float std_CPC) {
        _std_CPC = std_CPC;
    }

    public int getStd_CPC_EMEP() {
        return _std_CPC_EMEP;
    }

    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _std_CPC_EMEP = std_CPC_EMEP;
    }

    public float getAv_CPC() {
        return _av_CPC;
    }

    public void setAv_CPC(float av_CPC) {
        _av_CPC = av_CPC;
    }

    public int getAv_CPC_EMEP() {
        return _av_CPC_EMEP;
    }

    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _av_CPC_EMEP = av_CPC_EMEP;
    }

    public float getCPC_lag() {
        return _CPC_lag;
    }

    public void setCPC_lag(float CPC_lag) {
        _CPC_lag = CPC_lag;
    }

    public int getCPC_lag_EMEP() {
        return _CPC_lag_EMEP;
    }

    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _CPC_lag_EMEP = CPC_lag_EMEP;
    }

    public float getF_N2O() {
        return _F_N2O;
    }

    public void setF_N2O(float F_N2O) {
        _F_N2O = F_N2O;
    }

    public int getF_N2O_EMEP() {
        return _F_N2O_EMEP;
    }

    public void setF_N2O_EMEP(int F_N2O_EMEP) {
        _F_N2O_EMEP = F_N2O_EMEP;
    }

    public int getQc_F_N2O() {
        return _Qc_F_N2O;
    }

    public void setQc_F_N2O(int Qc_F_N2O) {
        _Qc_F_N2O = Qc_F_N2O;
    }

    public int getQc_F_N2O_EMEP() {
        return _Qc_F_N2O_EMEP;
    }

    public void setQc_F_N2O_EMEP(int Qc_F_N2O_EMEP) {
        _Qc_F_N2O_EMEP = Qc_F_N2O_EMEP;
    }

    public float getStd_N2O() {
        return _std_N2O;
    }

    public void setStd_N2O(float std_N2O) {
        _std_N2O = std_N2O;
    }

    public int getStd_N2O_EMEP() {
        return _std_N2O_EMEP;
    }

    public void setStd_N2O_EMEP(int std_N2O_EMEP) {
        _std_N2O_EMEP = std_N2O_EMEP;
    }

    public float getAv_N2O() {
        return _av_N2O;
    }

    public void setAv_N2O(float av_N2O) {
        _av_N2O = av_N2O;
    }

    public int getAv_N2O_EMEP() {
        return _av_N2O_EMEP;
    }

    public void setAv_N2O_EMEP(int av_N2O_EMEP) {
        _av_N2O_EMEP = av_N2O_EMEP;
    }

    public float getN2O_lag() {
        return _N2O_lag;
    }

    public void setN2O_lag(float N2O_lag) {
        _N2O_lag = N2O_lag;
    }

    public int getN2O_lag_EMEP() {
        return _N2O_lag_EMEP;
    }

    public void setN2O_lag_EMEP(int N2O_lag_EMEP) {
        _N2O_lag_EMEP = N2O_lag_EMEP;
    }
}
