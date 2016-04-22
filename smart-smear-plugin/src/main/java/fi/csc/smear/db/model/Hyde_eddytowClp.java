package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Hyde_eddytowLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Hyde_eddytowClp extends BaseModelImpl<Hyde_eddytow>
    implements Hyde_eddytow {
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
    private BaseModel<?> _hyde_eddytowRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Hyde_eddytowClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Hyde_eddytow.class;
    }

    @Override
    public String getModelClassName() {
        return Hyde_eddytow.class.getName();
    }

    @Override
    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        setSamptime(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _samptime;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((java.util.Date) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("H_radtow", getH_radtow());
        attributes.put("H_radtow_EMEP", getH_radtow_EMEP());
        attributes.put("Qc_H_radtow", getQc_H_radtow());
        attributes.put("Qc_H_radtow_EMEP", getQc_H_radtow_EMEP());
        attributes.put("LE_radtow", getLE_radtow());
        attributes.put("LE_radtow_EMEP", getLE_radtow_EMEP());
        attributes.put("Qc_LE_radtow", getQc_LE_radtow());
        attributes.put("Qc_LE_radtow_EMEP", getQc_LE_radtow_EMEP());
        attributes.put("E_radtow", getE_radtow());
        attributes.put("E_radtow_EMEP", getE_radtow_EMEP());
        attributes.put("Qc_E_radtow", getQc_E_radtow());
        attributes.put("Qc_E_radtow_EMEP", getQc_E_radtow_EMEP());
        attributes.put("F_c_radtow", getF_c_radtow());
        attributes.put("F_c_radtow_EMEP", getF_c_radtow_EMEP());
        attributes.put("Qc_F_c_radtow", getQc_F_c_radtow());
        attributes.put("Qc_F_c_radtow_EMEP", getQc_F_c_radtow_EMEP());
        attributes.put("tau_radtow", getTau_radtow());
        attributes.put("tau_radtow_EMEP", getTau_radtow_EMEP());
        attributes.put("Qc_tau_radtow", getQc_tau_radtow());
        attributes.put("Qc_tau_radtow_EMEP", getQc_tau_radtow_EMEP());
        attributes.put("u_star_radtow", getU_star_radtow());
        attributes.put("u_star_radtow_EMEP", getU_star_radtow_EMEP());
        attributes.put("MO_length_radtow", getMO_length_radtow());
        attributes.put("MO_length_radtow_EMEP", getMO_length_radtow_EMEP());
        attributes.put("std_u_radtow", getStd_u_radtow());
        attributes.put("std_u_radtow_EMEP", getStd_u_radtow_EMEP());
        attributes.put("std_v_radtow", getStd_v_radtow());
        attributes.put("std_v_radtow_EMEP", getStd_v_radtow_EMEP());
        attributes.put("std_w_radtow", getStd_w_radtow());
        attributes.put("std_w_radtow_EMEP", getStd_w_radtow_EMEP());
        attributes.put("std_t_radtow", getStd_t_radtow());
        attributes.put("std_t_radtow_EMEP", getStd_t_radtow_EMEP());
        attributes.put("std_c_radtow", getStd_c_radtow());
        attributes.put("std_c_radtow_EMEP", getStd_c_radtow_EMEP());
        attributes.put("std_h_radtow", getStd_h_radtow());
        attributes.put("std_h_radtow_EMEP", getStd_h_radtow_EMEP());
        attributes.put("av_u_radtow", getAv_u_radtow());
        attributes.put("av_u_radtow_EMEP", getAv_u_radtow_EMEP());
        attributes.put("av_v_radtow", getAv_v_radtow());
        attributes.put("av_v_radtow_EMEP", getAv_v_radtow_EMEP());
        attributes.put("av_w_radtow", getAv_w_radtow());
        attributes.put("av_w_radtow_EMEP", getAv_w_radtow_EMEP());
        attributes.put("av_t_radtow", getAv_t_radtow());
        attributes.put("av_t_radtow_EMEP", getAv_t_radtow_EMEP());
        attributes.put("av_c_radtow", getAv_c_radtow());
        attributes.put("av_c_radtow_EMEP", getAv_c_radtow_EMEP());
        attributes.put("av_h_radtow", getAv_h_radtow());
        attributes.put("av_h_radtow_EMEP", getAv_h_radtow_EMEP());
        attributes.put("U_radtow", getU_radtow());
        attributes.put("U_radtow_EMEP", getU_radtow_EMEP());
        attributes.put("wind_dir_radtow", getWind_dir_radtow());
        attributes.put("wind_dir_radtow_EMEP", getWind_dir_radtow_EMEP());
        attributes.put("eta_radtow", getEta_radtow());
        attributes.put("eta_radtow_EMEP", getEta_radtow_EMEP());
        attributes.put("theta_radtow", getTheta_radtow());
        attributes.put("theta_radtow_EMEP", getTheta_radtow_EMEP());
        attributes.put("beta_radtow", getBeta_radtow());
        attributes.put("beta_radtow_EMEP", getBeta_radtow_EMEP());
        attributes.put("c_lag_radtow", getC_lag_radtow());
        attributes.put("c_lag_radtow_EMEP", getC_lag_radtow_EMEP());
        attributes.put("h_lag_radtow", getH_lag_radtow());
        attributes.put("h_lag_radtow_EMEP", getH_lag_radtow_EMEP());
        attributes.put("err_packet_radtow", getErr_packet_radtow());
        attributes.put("err_packet_radtow_EMEP", getErr_packet_radtow_EMEP());
        attributes.put("licor_t_std_radtow", getLicor_t_std_radtow());
        attributes.put("licor_t_std_radtow_EMEP", getLicor_t_std_radtow_EMEP());
        attributes.put("licor_t_av_radtow", getLicor_t_av_radtow());
        attributes.put("licor_t_av_radtow_EMEP", getLicor_t_av_radtow_EMEP());
        attributes.put("licor_p_std_radtow", getLicor_p_std_radtow());
        attributes.put("licor_p_std_radtow_EMEP", getLicor_p_std_radtow_EMEP());
        attributes.put("licor_p_av_radtow", getLicor_p_av_radtow());
        attributes.put("licor_p_av_radtow_EMEP", getLicor_p_av_radtow_EMEP());
        attributes.put("F_O3_radtow", getF_O3_radtow());
        attributes.put("F_O3_radtow_EMEP", getF_O3_radtow_EMEP());
        attributes.put("Qc_F_O3_radtow", getQc_F_O3_radtow());
        attributes.put("Qc_F_O3_radtow_EMEP", getQc_F_O3_radtow_EMEP());
        attributes.put("std_O3_radtow", getStd_O3_radtow());
        attributes.put("std_O3_radtow_EMEP", getStd_O3_radtow_EMEP());
        attributes.put("av_O3_radtow", getAv_O3_radtow());
        attributes.put("av_O3_radtow_EMEP", getAv_O3_radtow_EMEP());
        attributes.put("O3_lag_radtow", getO3_lag_radtow());
        attributes.put("O3_lag_radtow_EMEP", getO3_lag_radtow_EMEP());
        attributes.put("NEE_radtow", getNEE_radtow());
        attributes.put("NEE_radtow_EMEP", getNEE_radtow_EMEP());
        attributes.put("Qc_gapf_NEE_radtow", getQc_gapf_NEE_radtow());
        attributes.put("Qc_gapf_NEE_radtow_EMEP", getQc_gapf_NEE_radtow_EMEP());
        attributes.put("GPP_radtow", getGPP_radtow());
        attributes.put("GPP_radtow_EMEP", getGPP_radtow_EMEP());
        attributes.put("TER_radtow", getTER_radtow());
        attributes.put("TER_radtow_EMEP", getTER_radtow_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float H_radtow = (Float) attributes.get("H_radtow");

        if (H_radtow != null) {
            setH_radtow(H_radtow);
        }

        Integer H_radtow_EMEP = (Integer) attributes.get("H_radtow_EMEP");

        if (H_radtow_EMEP != null) {
            setH_radtow_EMEP(H_radtow_EMEP);
        }

        Integer Qc_H_radtow = (Integer) attributes.get("Qc_H_radtow");

        if (Qc_H_radtow != null) {
            setQc_H_radtow(Qc_H_radtow);
        }

        Integer Qc_H_radtow_EMEP = (Integer) attributes.get("Qc_H_radtow_EMEP");

        if (Qc_H_radtow_EMEP != null) {
            setQc_H_radtow_EMEP(Qc_H_radtow_EMEP);
        }

        Float LE_radtow = (Float) attributes.get("LE_radtow");

        if (LE_radtow != null) {
            setLE_radtow(LE_radtow);
        }

        Integer LE_radtow_EMEP = (Integer) attributes.get("LE_radtow_EMEP");

        if (LE_radtow_EMEP != null) {
            setLE_radtow_EMEP(LE_radtow_EMEP);
        }

        Integer Qc_LE_radtow = (Integer) attributes.get("Qc_LE_radtow");

        if (Qc_LE_radtow != null) {
            setQc_LE_radtow(Qc_LE_radtow);
        }

        Integer Qc_LE_radtow_EMEP = (Integer) attributes.get(
                "Qc_LE_radtow_EMEP");

        if (Qc_LE_radtow_EMEP != null) {
            setQc_LE_radtow_EMEP(Qc_LE_radtow_EMEP);
        }

        Float E_radtow = (Float) attributes.get("E_radtow");

        if (E_radtow != null) {
            setE_radtow(E_radtow);
        }

        Integer E_radtow_EMEP = (Integer) attributes.get("E_radtow_EMEP");

        if (E_radtow_EMEP != null) {
            setE_radtow_EMEP(E_radtow_EMEP);
        }

        Integer Qc_E_radtow = (Integer) attributes.get("Qc_E_radtow");

        if (Qc_E_radtow != null) {
            setQc_E_radtow(Qc_E_radtow);
        }

        Integer Qc_E_radtow_EMEP = (Integer) attributes.get("Qc_E_radtow_EMEP");

        if (Qc_E_radtow_EMEP != null) {
            setQc_E_radtow_EMEP(Qc_E_radtow_EMEP);
        }

        Float F_c_radtow = (Float) attributes.get("F_c_radtow");

        if (F_c_radtow != null) {
            setF_c_radtow(F_c_radtow);
        }

        Integer F_c_radtow_EMEP = (Integer) attributes.get("F_c_radtow_EMEP");

        if (F_c_radtow_EMEP != null) {
            setF_c_radtow_EMEP(F_c_radtow_EMEP);
        }

        Integer Qc_F_c_radtow = (Integer) attributes.get("Qc_F_c_radtow");

        if (Qc_F_c_radtow != null) {
            setQc_F_c_radtow(Qc_F_c_radtow);
        }

        Integer Qc_F_c_radtow_EMEP = (Integer) attributes.get(
                "Qc_F_c_radtow_EMEP");

        if (Qc_F_c_radtow_EMEP != null) {
            setQc_F_c_radtow_EMEP(Qc_F_c_radtow_EMEP);
        }

        Float tau_radtow = (Float) attributes.get("tau_radtow");

        if (tau_radtow != null) {
            setTau_radtow(tau_radtow);
        }

        Integer tau_radtow_EMEP = (Integer) attributes.get("tau_radtow_EMEP");

        if (tau_radtow_EMEP != null) {
            setTau_radtow_EMEP(tau_radtow_EMEP);
        }

        Integer Qc_tau_radtow = (Integer) attributes.get("Qc_tau_radtow");

        if (Qc_tau_radtow != null) {
            setQc_tau_radtow(Qc_tau_radtow);
        }

        Integer Qc_tau_radtow_EMEP = (Integer) attributes.get(
                "Qc_tau_radtow_EMEP");

        if (Qc_tau_radtow_EMEP != null) {
            setQc_tau_radtow_EMEP(Qc_tau_radtow_EMEP);
        }

        Float u_star_radtow = (Float) attributes.get("u_star_radtow");

        if (u_star_radtow != null) {
            setU_star_radtow(u_star_radtow);
        }

        Integer u_star_radtow_EMEP = (Integer) attributes.get(
                "u_star_radtow_EMEP");

        if (u_star_radtow_EMEP != null) {
            setU_star_radtow_EMEP(u_star_radtow_EMEP);
        }

        Float MO_length_radtow = (Float) attributes.get("MO_length_radtow");

        if (MO_length_radtow != null) {
            setMO_length_radtow(MO_length_radtow);
        }

        Integer MO_length_radtow_EMEP = (Integer) attributes.get(
                "MO_length_radtow_EMEP");

        if (MO_length_radtow_EMEP != null) {
            setMO_length_radtow_EMEP(MO_length_radtow_EMEP);
        }

        Float std_u_radtow = (Float) attributes.get("std_u_radtow");

        if (std_u_radtow != null) {
            setStd_u_radtow(std_u_radtow);
        }

        Integer std_u_radtow_EMEP = (Integer) attributes.get(
                "std_u_radtow_EMEP");

        if (std_u_radtow_EMEP != null) {
            setStd_u_radtow_EMEP(std_u_radtow_EMEP);
        }

        Float std_v_radtow = (Float) attributes.get("std_v_radtow");

        if (std_v_radtow != null) {
            setStd_v_radtow(std_v_radtow);
        }

        Integer std_v_radtow_EMEP = (Integer) attributes.get(
                "std_v_radtow_EMEP");

        if (std_v_radtow_EMEP != null) {
            setStd_v_radtow_EMEP(std_v_radtow_EMEP);
        }

        Float std_w_radtow = (Float) attributes.get("std_w_radtow");

        if (std_w_radtow != null) {
            setStd_w_radtow(std_w_radtow);
        }

        Integer std_w_radtow_EMEP = (Integer) attributes.get(
                "std_w_radtow_EMEP");

        if (std_w_radtow_EMEP != null) {
            setStd_w_radtow_EMEP(std_w_radtow_EMEP);
        }

        Float std_t_radtow = (Float) attributes.get("std_t_radtow");

        if (std_t_radtow != null) {
            setStd_t_radtow(std_t_radtow);
        }

        Integer std_t_radtow_EMEP = (Integer) attributes.get(
                "std_t_radtow_EMEP");

        if (std_t_radtow_EMEP != null) {
            setStd_t_radtow_EMEP(std_t_radtow_EMEP);
        }

        Float std_c_radtow = (Float) attributes.get("std_c_radtow");

        if (std_c_radtow != null) {
            setStd_c_radtow(std_c_radtow);
        }

        Integer std_c_radtow_EMEP = (Integer) attributes.get(
                "std_c_radtow_EMEP");

        if (std_c_radtow_EMEP != null) {
            setStd_c_radtow_EMEP(std_c_radtow_EMEP);
        }

        Float std_h_radtow = (Float) attributes.get("std_h_radtow");

        if (std_h_radtow != null) {
            setStd_h_radtow(std_h_radtow);
        }

        Integer std_h_radtow_EMEP = (Integer) attributes.get(
                "std_h_radtow_EMEP");

        if (std_h_radtow_EMEP != null) {
            setStd_h_radtow_EMEP(std_h_radtow_EMEP);
        }

        Float av_u_radtow = (Float) attributes.get("av_u_radtow");

        if (av_u_radtow != null) {
            setAv_u_radtow(av_u_radtow);
        }

        Integer av_u_radtow_EMEP = (Integer) attributes.get("av_u_radtow_EMEP");

        if (av_u_radtow_EMEP != null) {
            setAv_u_radtow_EMEP(av_u_radtow_EMEP);
        }

        Float av_v_radtow = (Float) attributes.get("av_v_radtow");

        if (av_v_radtow != null) {
            setAv_v_radtow(av_v_radtow);
        }

        Integer av_v_radtow_EMEP = (Integer) attributes.get("av_v_radtow_EMEP");

        if (av_v_radtow_EMEP != null) {
            setAv_v_radtow_EMEP(av_v_radtow_EMEP);
        }

        Float av_w_radtow = (Float) attributes.get("av_w_radtow");

        if (av_w_radtow != null) {
            setAv_w_radtow(av_w_radtow);
        }

        Integer av_w_radtow_EMEP = (Integer) attributes.get("av_w_radtow_EMEP");

        if (av_w_radtow_EMEP != null) {
            setAv_w_radtow_EMEP(av_w_radtow_EMEP);
        }

        Float av_t_radtow = (Float) attributes.get("av_t_radtow");

        if (av_t_radtow != null) {
            setAv_t_radtow(av_t_radtow);
        }

        Integer av_t_radtow_EMEP = (Integer) attributes.get("av_t_radtow_EMEP");

        if (av_t_radtow_EMEP != null) {
            setAv_t_radtow_EMEP(av_t_radtow_EMEP);
        }

        Float av_c_radtow = (Float) attributes.get("av_c_radtow");

        if (av_c_radtow != null) {
            setAv_c_radtow(av_c_radtow);
        }

        Integer av_c_radtow_EMEP = (Integer) attributes.get("av_c_radtow_EMEP");

        if (av_c_radtow_EMEP != null) {
            setAv_c_radtow_EMEP(av_c_radtow_EMEP);
        }

        Float av_h_radtow = (Float) attributes.get("av_h_radtow");

        if (av_h_radtow != null) {
            setAv_h_radtow(av_h_radtow);
        }

        Integer av_h_radtow_EMEP = (Integer) attributes.get("av_h_radtow_EMEP");

        if (av_h_radtow_EMEP != null) {
            setAv_h_radtow_EMEP(av_h_radtow_EMEP);
        }

        Float U_radtow = (Float) attributes.get("U_radtow");

        if (U_radtow != null) {
            setU_radtow(U_radtow);
        }

        Integer U_radtow_EMEP = (Integer) attributes.get("U_radtow_EMEP");

        if (U_radtow_EMEP != null) {
            setU_radtow_EMEP(U_radtow_EMEP);
        }

        Float wind_dir_radtow = (Float) attributes.get("wind_dir_radtow");

        if (wind_dir_radtow != null) {
            setWind_dir_radtow(wind_dir_radtow);
        }

        Integer wind_dir_radtow_EMEP = (Integer) attributes.get(
                "wind_dir_radtow_EMEP");

        if (wind_dir_radtow_EMEP != null) {
            setWind_dir_radtow_EMEP(wind_dir_radtow_EMEP);
        }

        Float eta_radtow = (Float) attributes.get("eta_radtow");

        if (eta_radtow != null) {
            setEta_radtow(eta_radtow);
        }

        Integer eta_radtow_EMEP = (Integer) attributes.get("eta_radtow_EMEP");

        if (eta_radtow_EMEP != null) {
            setEta_radtow_EMEP(eta_radtow_EMEP);
        }

        Float theta_radtow = (Float) attributes.get("theta_radtow");

        if (theta_radtow != null) {
            setTheta_radtow(theta_radtow);
        }

        Integer theta_radtow_EMEP = (Integer) attributes.get(
                "theta_radtow_EMEP");

        if (theta_radtow_EMEP != null) {
            setTheta_radtow_EMEP(theta_radtow_EMEP);
        }

        Float beta_radtow = (Float) attributes.get("beta_radtow");

        if (beta_radtow != null) {
            setBeta_radtow(beta_radtow);
        }

        Integer beta_radtow_EMEP = (Integer) attributes.get("beta_radtow_EMEP");

        if (beta_radtow_EMEP != null) {
            setBeta_radtow_EMEP(beta_radtow_EMEP);
        }

        Float c_lag_radtow = (Float) attributes.get("c_lag_radtow");

        if (c_lag_radtow != null) {
            setC_lag_radtow(c_lag_radtow);
        }

        Integer c_lag_radtow_EMEP = (Integer) attributes.get(
                "c_lag_radtow_EMEP");

        if (c_lag_radtow_EMEP != null) {
            setC_lag_radtow_EMEP(c_lag_radtow_EMEP);
        }

        Float h_lag_radtow = (Float) attributes.get("h_lag_radtow");

        if (h_lag_radtow != null) {
            setH_lag_radtow(h_lag_radtow);
        }

        Integer h_lag_radtow_EMEP = (Integer) attributes.get(
                "h_lag_radtow_EMEP");

        if (h_lag_radtow_EMEP != null) {
            setH_lag_radtow_EMEP(h_lag_radtow_EMEP);
        }

        Float err_packet_radtow = (Float) attributes.get("err_packet_radtow");

        if (err_packet_radtow != null) {
            setErr_packet_radtow(err_packet_radtow);
        }

        Integer err_packet_radtow_EMEP = (Integer) attributes.get(
                "err_packet_radtow_EMEP");

        if (err_packet_radtow_EMEP != null) {
            setErr_packet_radtow_EMEP(err_packet_radtow_EMEP);
        }

        Float licor_t_std_radtow = (Float) attributes.get("licor_t_std_radtow");

        if (licor_t_std_radtow != null) {
            setLicor_t_std_radtow(licor_t_std_radtow);
        }

        Integer licor_t_std_radtow_EMEP = (Integer) attributes.get(
                "licor_t_std_radtow_EMEP");

        if (licor_t_std_radtow_EMEP != null) {
            setLicor_t_std_radtow_EMEP(licor_t_std_radtow_EMEP);
        }

        Float licor_t_av_radtow = (Float) attributes.get("licor_t_av_radtow");

        if (licor_t_av_radtow != null) {
            setLicor_t_av_radtow(licor_t_av_radtow);
        }

        Integer licor_t_av_radtow_EMEP = (Integer) attributes.get(
                "licor_t_av_radtow_EMEP");

        if (licor_t_av_radtow_EMEP != null) {
            setLicor_t_av_radtow_EMEP(licor_t_av_radtow_EMEP);
        }

        Float licor_p_std_radtow = (Float) attributes.get("licor_p_std_radtow");

        if (licor_p_std_radtow != null) {
            setLicor_p_std_radtow(licor_p_std_radtow);
        }

        Integer licor_p_std_radtow_EMEP = (Integer) attributes.get(
                "licor_p_std_radtow_EMEP");

        if (licor_p_std_radtow_EMEP != null) {
            setLicor_p_std_radtow_EMEP(licor_p_std_radtow_EMEP);
        }

        Float licor_p_av_radtow = (Float) attributes.get("licor_p_av_radtow");

        if (licor_p_av_radtow != null) {
            setLicor_p_av_radtow(licor_p_av_radtow);
        }

        Integer licor_p_av_radtow_EMEP = (Integer) attributes.get(
                "licor_p_av_radtow_EMEP");

        if (licor_p_av_radtow_EMEP != null) {
            setLicor_p_av_radtow_EMEP(licor_p_av_radtow_EMEP);
        }

        Float F_O3_radtow = (Float) attributes.get("F_O3_radtow");

        if (F_O3_radtow != null) {
            setF_O3_radtow(F_O3_radtow);
        }

        Integer F_O3_radtow_EMEP = (Integer) attributes.get("F_O3_radtow_EMEP");

        if (F_O3_radtow_EMEP != null) {
            setF_O3_radtow_EMEP(F_O3_radtow_EMEP);
        }

        Integer Qc_F_O3_radtow = (Integer) attributes.get("Qc_F_O3_radtow");

        if (Qc_F_O3_radtow != null) {
            setQc_F_O3_radtow(Qc_F_O3_radtow);
        }

        Integer Qc_F_O3_radtow_EMEP = (Integer) attributes.get(
                "Qc_F_O3_radtow_EMEP");

        if (Qc_F_O3_radtow_EMEP != null) {
            setQc_F_O3_radtow_EMEP(Qc_F_O3_radtow_EMEP);
        }

        Float std_O3_radtow = (Float) attributes.get("std_O3_radtow");

        if (std_O3_radtow != null) {
            setStd_O3_radtow(std_O3_radtow);
        }

        Integer std_O3_radtow_EMEP = (Integer) attributes.get(
                "std_O3_radtow_EMEP");

        if (std_O3_radtow_EMEP != null) {
            setStd_O3_radtow_EMEP(std_O3_radtow_EMEP);
        }

        Float av_O3_radtow = (Float) attributes.get("av_O3_radtow");

        if (av_O3_radtow != null) {
            setAv_O3_radtow(av_O3_radtow);
        }

        Integer av_O3_radtow_EMEP = (Integer) attributes.get(
                "av_O3_radtow_EMEP");

        if (av_O3_radtow_EMEP != null) {
            setAv_O3_radtow_EMEP(av_O3_radtow_EMEP);
        }

        Float O3_lag_radtow = (Float) attributes.get("O3_lag_radtow");

        if (O3_lag_radtow != null) {
            setO3_lag_radtow(O3_lag_radtow);
        }

        Integer O3_lag_radtow_EMEP = (Integer) attributes.get(
                "O3_lag_radtow_EMEP");

        if (O3_lag_radtow_EMEP != null) {
            setO3_lag_radtow_EMEP(O3_lag_radtow_EMEP);
        }

        Float NEE_radtow = (Float) attributes.get("NEE_radtow");

        if (NEE_radtow != null) {
            setNEE_radtow(NEE_radtow);
        }

        Integer NEE_radtow_EMEP = (Integer) attributes.get("NEE_radtow_EMEP");

        if (NEE_radtow_EMEP != null) {
            setNEE_radtow_EMEP(NEE_radtow_EMEP);
        }

        Integer Qc_gapf_NEE_radtow = (Integer) attributes.get(
                "Qc_gapf_NEE_radtow");

        if (Qc_gapf_NEE_radtow != null) {
            setQc_gapf_NEE_radtow(Qc_gapf_NEE_radtow);
        }

        Integer Qc_gapf_NEE_radtow_EMEP = (Integer) attributes.get(
                "Qc_gapf_NEE_radtow_EMEP");

        if (Qc_gapf_NEE_radtow_EMEP != null) {
            setQc_gapf_NEE_radtow_EMEP(Qc_gapf_NEE_radtow_EMEP);
        }

        Float GPP_radtow = (Float) attributes.get("GPP_radtow");

        if (GPP_radtow != null) {
            setGPP_radtow(GPP_radtow);
        }

        Integer GPP_radtow_EMEP = (Integer) attributes.get("GPP_radtow_EMEP");

        if (GPP_radtow_EMEP != null) {
            setGPP_radtow_EMEP(GPP_radtow_EMEP);
        }

        Float TER_radtow = (Float) attributes.get("TER_radtow");

        if (TER_radtow != null) {
            setTER_radtow(TER_radtow);
        }

        Integer TER_radtow_EMEP = (Integer) attributes.get("TER_radtow_EMEP");

        if (TER_radtow_EMEP != null) {
            setTER_radtow_EMEP(TER_radtow_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_hyde_eddytowRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_radtow() {
        return _H_radtow;
    }

    @Override
    public void setH_radtow(float H_radtow) {
        _H_radtow = H_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setH_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, H_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_radtow_EMEP() {
        return _H_radtow_EMEP;
    }

    @Override
    public void setH_radtow_EMEP(int H_radtow_EMEP) {
        _H_radtow_EMEP = H_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setH_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, H_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_radtow() {
        return _Qc_H_radtow;
    }

    @Override
    public void setQc_H_radtow(int Qc_H_radtow) {
        _Qc_H_radtow = Qc_H_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_H_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_radtow_EMEP() {
        return _Qc_H_radtow_EMEP;
    }

    @Override
    public void setQc_H_radtow_EMEP(int Qc_H_radtow_EMEP) {
        _Qc_H_radtow_EMEP = Qc_H_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_H_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_radtow() {
        return _LE_radtow;
    }

    @Override
    public void setLE_radtow(float LE_radtow) {
        _LE_radtow = LE_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, LE_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_radtow_EMEP() {
        return _LE_radtow_EMEP;
    }

    @Override
    public void setLE_radtow_EMEP(int LE_radtow_EMEP) {
        _LE_radtow_EMEP = LE_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, LE_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_radtow() {
        return _Qc_LE_radtow;
    }

    @Override
    public void setQc_LE_radtow(int Qc_LE_radtow) {
        _Qc_LE_radtow = Qc_LE_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_LE_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_radtow_EMEP() {
        return _Qc_LE_radtow_EMEP;
    }

    @Override
    public void setQc_LE_radtow_EMEP(int Qc_LE_radtow_EMEP) {
        _Qc_LE_radtow_EMEP = Qc_LE_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_LE_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getE_radtow() {
        return _E_radtow;
    }

    @Override
    public void setE_radtow(float E_radtow) {
        _E_radtow = E_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setE_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, E_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getE_radtow_EMEP() {
        return _E_radtow_EMEP;
    }

    @Override
    public void setE_radtow_EMEP(int E_radtow_EMEP) {
        _E_radtow_EMEP = E_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setE_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, E_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E_radtow() {
        return _Qc_E_radtow;
    }

    @Override
    public void setQc_E_radtow(int Qc_E_radtow) {
        _Qc_E_radtow = Qc_E_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_E_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E_radtow_EMEP() {
        return _Qc_E_radtow_EMEP;
    }

    @Override
    public void setQc_E_radtow_EMEP(int Qc_E_radtow_EMEP) {
        _Qc_E_radtow_EMEP = Qc_E_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_E_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_c_radtow() {
        return _F_c_radtow;
    }

    @Override
    public void setF_c_radtow(float F_c_radtow) {
        _F_c_radtow = F_c_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, F_c_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_c_radtow_EMEP() {
        return _F_c_radtow_EMEP;
    }

    @Override
    public void setF_c_radtow_EMEP(int F_c_radtow_EMEP) {
        _F_c_radtow_EMEP = F_c_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, F_c_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c_radtow() {
        return _Qc_F_c_radtow;
    }

    @Override
    public void setQc_F_c_radtow(int Qc_F_c_radtow) {
        _Qc_F_c_radtow = Qc_F_c_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_F_c_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c_radtow_EMEP() {
        return _Qc_F_c_radtow_EMEP;
    }

    @Override
    public void setQc_F_c_radtow_EMEP(int Qc_F_c_radtow_EMEP) {
        _Qc_F_c_radtow_EMEP = Qc_F_c_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_F_c_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTau_radtow() {
        return _tau_radtow;
    }

    @Override
    public void setTau_radtow(float tau_radtow) {
        _tau_radtow = tau_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, tau_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTau_radtow_EMEP() {
        return _tau_radtow_EMEP;
    }

    @Override
    public void setTau_radtow_EMEP(int tau_radtow_EMEP) {
        _tau_radtow_EMEP = tau_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, tau_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_radtow() {
        return _Qc_tau_radtow;
    }

    @Override
    public void setQc_tau_radtow(int Qc_tau_radtow) {
        _Qc_tau_radtow = Qc_tau_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_tau_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_radtow_EMEP() {
        return _Qc_tau_radtow_EMEP;
    }

    @Override
    public void setQc_tau_radtow_EMEP(int Qc_tau_radtow_EMEP) {
        _Qc_tau_radtow_EMEP = Qc_tau_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_tau_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_star_radtow() {
        return _u_star_radtow;
    }

    @Override
    public void setU_star_radtow(float u_star_radtow) {
        _u_star_radtow = u_star_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, u_star_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_star_radtow_EMEP() {
        return _u_star_radtow_EMEP;
    }

    @Override
    public void setU_star_radtow_EMEP(int u_star_radtow_EMEP) {
        _u_star_radtow_EMEP = u_star_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, u_star_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMO_length_radtow() {
        return _MO_length_radtow;
    }

    @Override
    public void setMO_length_radtow(float MO_length_radtow) {
        _MO_length_radtow = MO_length_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, MO_length_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMO_length_radtow_EMEP() {
        return _MO_length_radtow_EMEP;
    }

    @Override
    public void setMO_length_radtow_EMEP(int MO_length_radtow_EMEP) {
        _MO_length_radtow_EMEP = MO_length_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, MO_length_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_u_radtow() {
        return _std_u_radtow;
    }

    @Override
    public void setStd_u_radtow(float std_u_radtow) {
        _std_u_radtow = std_u_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_u_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_u_radtow_EMEP() {
        return _std_u_radtow_EMEP;
    }

    @Override
    public void setStd_u_radtow_EMEP(int std_u_radtow_EMEP) {
        _std_u_radtow_EMEP = std_u_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_u_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_v_radtow() {
        return _std_v_radtow;
    }

    @Override
    public void setStd_v_radtow(float std_v_radtow) {
        _std_v_radtow = std_v_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_v_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_v_radtow_EMEP() {
        return _std_v_radtow_EMEP;
    }

    @Override
    public void setStd_v_radtow_EMEP(int std_v_radtow_EMEP) {
        _std_v_radtow_EMEP = std_v_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_v_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_w_radtow() {
        return _std_w_radtow;
    }

    @Override
    public void setStd_w_radtow(float std_w_radtow) {
        _std_w_radtow = std_w_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_w_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_w_radtow_EMEP() {
        return _std_w_radtow_EMEP;
    }

    @Override
    public void setStd_w_radtow_EMEP(int std_w_radtow_EMEP) {
        _std_w_radtow_EMEP = std_w_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_w_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_t_radtow() {
        return _std_t_radtow;
    }

    @Override
    public void setStd_t_radtow(float std_t_radtow) {
        _std_t_radtow = std_t_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_t_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_t_radtow_EMEP() {
        return _std_t_radtow_EMEP;
    }

    @Override
    public void setStd_t_radtow_EMEP(int std_t_radtow_EMEP) {
        _std_t_radtow_EMEP = std_t_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_t_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c_radtow() {
        return _std_c_radtow;
    }

    @Override
    public void setStd_c_radtow(float std_c_radtow) {
        _std_c_radtow = std_c_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_c_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_radtow_EMEP() {
        return _std_c_radtow_EMEP;
    }

    @Override
    public void setStd_c_radtow_EMEP(int std_c_radtow_EMEP) {
        _std_c_radtow_EMEP = std_c_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_c_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h_radtow() {
        return _std_h_radtow;
    }

    @Override
    public void setStd_h_radtow(float std_h_radtow) {
        _std_h_radtow = std_h_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_h_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_radtow_EMEP() {
        return _std_h_radtow_EMEP;
    }

    @Override
    public void setStd_h_radtow_EMEP(int std_h_radtow_EMEP) {
        _std_h_radtow_EMEP = std_h_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_h_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_u_radtow() {
        return _av_u_radtow;
    }

    @Override
    public void setAv_u_radtow(float av_u_radtow) {
        _av_u_radtow = av_u_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_u_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_u_radtow_EMEP() {
        return _av_u_radtow_EMEP;
    }

    @Override
    public void setAv_u_radtow_EMEP(int av_u_radtow_EMEP) {
        _av_u_radtow_EMEP = av_u_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_u_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_v_radtow() {
        return _av_v_radtow;
    }

    @Override
    public void setAv_v_radtow(float av_v_radtow) {
        _av_v_radtow = av_v_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_v_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_v_radtow_EMEP() {
        return _av_v_radtow_EMEP;
    }

    @Override
    public void setAv_v_radtow_EMEP(int av_v_radtow_EMEP) {
        _av_v_radtow_EMEP = av_v_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_v_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_w_radtow() {
        return _av_w_radtow;
    }

    @Override
    public void setAv_w_radtow(float av_w_radtow) {
        _av_w_radtow = av_w_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_w_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_w_radtow_EMEP() {
        return _av_w_radtow_EMEP;
    }

    @Override
    public void setAv_w_radtow_EMEP(int av_w_radtow_EMEP) {
        _av_w_radtow_EMEP = av_w_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_w_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_t_radtow() {
        return _av_t_radtow;
    }

    @Override
    public void setAv_t_radtow(float av_t_radtow) {
        _av_t_radtow = av_t_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_t_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_t_radtow_EMEP() {
        return _av_t_radtow_EMEP;
    }

    @Override
    public void setAv_t_radtow_EMEP(int av_t_radtow_EMEP) {
        _av_t_radtow_EMEP = av_t_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_t_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c_radtow() {
        return _av_c_radtow;
    }

    @Override
    public void setAv_c_radtow(float av_c_radtow) {
        _av_c_radtow = av_c_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_c_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_radtow_EMEP() {
        return _av_c_radtow_EMEP;
    }

    @Override
    public void setAv_c_radtow_EMEP(int av_c_radtow_EMEP) {
        _av_c_radtow_EMEP = av_c_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_c_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h_radtow() {
        return _av_h_radtow;
    }

    @Override
    public void setAv_h_radtow(float av_h_radtow) {
        _av_h_radtow = av_h_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_h_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_radtow_EMEP() {
        return _av_h_radtow_EMEP;
    }

    @Override
    public void setAv_h_radtow_EMEP(int av_h_radtow_EMEP) {
        _av_h_radtow_EMEP = av_h_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_h_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_radtow() {
        return _U_radtow;
    }

    @Override
    public void setU_radtow(float U_radtow) {
        _U_radtow = U_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setU_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, U_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_radtow_EMEP() {
        return _U_radtow_EMEP;
    }

    @Override
    public void setU_radtow_EMEP(int U_radtow_EMEP) {
        _U_radtow_EMEP = U_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setU_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, U_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWind_dir_radtow() {
        return _wind_dir_radtow;
    }

    @Override
    public void setWind_dir_radtow(float wind_dir_radtow) {
        _wind_dir_radtow = wind_dir_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, wind_dir_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWind_dir_radtow_EMEP() {
        return _wind_dir_radtow_EMEP;
    }

    @Override
    public void setWind_dir_radtow_EMEP(int wind_dir_radtow_EMEP) {
        _wind_dir_radtow_EMEP = wind_dir_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, wind_dir_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getEta_radtow() {
        return _eta_radtow;
    }

    @Override
    public void setEta_radtow(float eta_radtow) {
        _eta_radtow = eta_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, eta_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEta_radtow_EMEP() {
        return _eta_radtow_EMEP;
    }

    @Override
    public void setEta_radtow_EMEP(int eta_radtow_EMEP) {
        _eta_radtow_EMEP = eta_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, eta_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTheta_radtow() {
        return _theta_radtow;
    }

    @Override
    public void setTheta_radtow(float theta_radtow) {
        _theta_radtow = theta_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, theta_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTheta_radtow_EMEP() {
        return _theta_radtow_EMEP;
    }

    @Override
    public void setTheta_radtow_EMEP(int theta_radtow_EMEP) {
        _theta_radtow_EMEP = theta_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, theta_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBeta_radtow() {
        return _beta_radtow;
    }

    @Override
    public void setBeta_radtow(float beta_radtow) {
        _beta_radtow = beta_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, beta_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeta_radtow_EMEP() {
        return _beta_radtow_EMEP;
    }

    @Override
    public void setBeta_radtow_EMEP(int beta_radtow_EMEP) {
        _beta_radtow_EMEP = beta_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, beta_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getC_lag_radtow() {
        return _c_lag_radtow;
    }

    @Override
    public void setC_lag_radtow(float c_lag_radtow) {
        _c_lag_radtow = c_lag_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, c_lag_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC_lag_radtow_EMEP() {
        return _c_lag_radtow_EMEP;
    }

    @Override
    public void setC_lag_radtow_EMEP(int c_lag_radtow_EMEP) {
        _c_lag_radtow_EMEP = c_lag_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, c_lag_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_lag_radtow() {
        return _h_lag_radtow;
    }

    @Override
    public void setH_lag_radtow(float h_lag_radtow) {
        _h_lag_radtow = h_lag_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, h_lag_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_lag_radtow_EMEP() {
        return _h_lag_radtow_EMEP;
    }

    @Override
    public void setH_lag_radtow_EMEP(int h_lag_radtow_EMEP) {
        _h_lag_radtow_EMEP = h_lag_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, h_lag_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getErr_packet_radtow() {
        return _err_packet_radtow;
    }

    @Override
    public void setErr_packet_radtow(float err_packet_radtow) {
        _err_packet_radtow = err_packet_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, err_packet_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet_radtow_EMEP() {
        return _err_packet_radtow_EMEP;
    }

    @Override
    public void setErr_packet_radtow_EMEP(int err_packet_radtow_EMEP) {
        _err_packet_radtow_EMEP = err_packet_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, err_packet_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_std_radtow() {
        return _licor_t_std_radtow;
    }

    @Override
    public void setLicor_t_std_radtow(float licor_t_std_radtow) {
        _licor_t_std_radtow = licor_t_std_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_t_std_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_std_radtow_EMEP() {
        return _licor_t_std_radtow_EMEP;
    }

    @Override
    public void setLicor_t_std_radtow_EMEP(int licor_t_std_radtow_EMEP) {
        _licor_t_std_radtow_EMEP = licor_t_std_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_t_std_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_av_radtow() {
        return _licor_t_av_radtow;
    }

    @Override
    public void setLicor_t_av_radtow(float licor_t_av_radtow) {
        _licor_t_av_radtow = licor_t_av_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_t_av_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_av_radtow_EMEP() {
        return _licor_t_av_radtow_EMEP;
    }

    @Override
    public void setLicor_t_av_radtow_EMEP(int licor_t_av_radtow_EMEP) {
        _licor_t_av_radtow_EMEP = licor_t_av_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_t_av_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_std_radtow() {
        return _licor_p_std_radtow;
    }

    @Override
    public void setLicor_p_std_radtow(float licor_p_std_radtow) {
        _licor_p_std_radtow = licor_p_std_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_p_std_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_std_radtow_EMEP() {
        return _licor_p_std_radtow_EMEP;
    }

    @Override
    public void setLicor_p_std_radtow_EMEP(int licor_p_std_radtow_EMEP) {
        _licor_p_std_radtow_EMEP = licor_p_std_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_p_std_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_av_radtow() {
        return _licor_p_av_radtow;
    }

    @Override
    public void setLicor_p_av_radtow(float licor_p_av_radtow) {
        _licor_p_av_radtow = licor_p_av_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_radtow",
                        float.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_p_av_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_av_radtow_EMEP() {
        return _licor_p_av_radtow_EMEP;
    }

    @Override
    public void setLicor_p_av_radtow_EMEP(int licor_p_av_radtow_EMEP) {
        _licor_p_av_radtow_EMEP = licor_p_av_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, licor_p_av_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_O3_radtow() {
        return _F_O3_radtow;
    }

    @Override
    public void setF_O3_radtow(float F_O3_radtow) {
        _F_O3_radtow = F_O3_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setF_O3_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, F_O3_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_O3_radtow_EMEP() {
        return _F_O3_radtow_EMEP;
    }

    @Override
    public void setF_O3_radtow_EMEP(int F_O3_radtow_EMEP) {
        _F_O3_radtow_EMEP = F_O3_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setF_O3_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, F_O3_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_O3_radtow() {
        return _Qc_F_O3_radtow;
    }

    @Override
    public void setQc_F_O3_radtow(int Qc_F_O3_radtow) {
        _Qc_F_O3_radtow = Qc_F_O3_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_O3_radtow", int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_F_O3_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_O3_radtow_EMEP() {
        return _Qc_F_O3_radtow_EMEP;
    }

    @Override
    public void setQc_F_O3_radtow_EMEP(int Qc_F_O3_radtow_EMEP) {
        _Qc_F_O3_radtow_EMEP = Qc_F_O3_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_O3_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_F_O3_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_O3_radtow() {
        return _std_O3_radtow;
    }

    @Override
    public void setStd_O3_radtow(float std_O3_radtow) {
        _std_O3_radtow = std_O3_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_O3_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, std_O3_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_O3_radtow_EMEP() {
        return _std_O3_radtow_EMEP;
    }

    @Override
    public void setStd_O3_radtow_EMEP(int std_O3_radtow_EMEP) {
        _std_O3_radtow_EMEP = std_O3_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_O3_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, std_O3_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_O3_radtow() {
        return _av_O3_radtow;
    }

    @Override
    public void setAv_O3_radtow(float av_O3_radtow) {
        _av_O3_radtow = av_O3_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_O3_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, av_O3_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_O3_radtow_EMEP() {
        return _av_O3_radtow_EMEP;
    }

    @Override
    public void setAv_O3_radtow_EMEP(int av_O3_radtow_EMEP) {
        _av_O3_radtow_EMEP = av_O3_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_O3_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, av_O3_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_lag_radtow() {
        return _O3_lag_radtow;
    }

    @Override
    public void setO3_lag_radtow(float O3_lag_radtow) {
        _O3_lag_radtow = O3_lag_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_lag_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, O3_lag_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getO3_lag_radtow_EMEP() {
        return _O3_lag_radtow_EMEP;
    }

    @Override
    public void setO3_lag_radtow_EMEP(int O3_lag_radtow_EMEP) {
        _O3_lag_radtow_EMEP = O3_lag_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_lag_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, O3_lag_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNEE_radtow() {
        return _NEE_radtow;
    }

    @Override
    public void setNEE_radtow(float NEE_radtow) {
        _NEE_radtow = NEE_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setNEE_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, NEE_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNEE_radtow_EMEP() {
        return _NEE_radtow_EMEP;
    }

    @Override
    public void setNEE_radtow_EMEP(int NEE_radtow_EMEP) {
        _NEE_radtow_EMEP = NEE_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setNEE_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, NEE_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_gapf_NEE_radtow() {
        return _Qc_gapf_NEE_radtow;
    }

    @Override
    public void setQc_gapf_NEE_radtow(int Qc_gapf_NEE_radtow) {
        _Qc_gapf_NEE_radtow = Qc_gapf_NEE_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_gapf_NEE_radtow",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_gapf_NEE_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_gapf_NEE_radtow_EMEP() {
        return _Qc_gapf_NEE_radtow_EMEP;
    }

    @Override
    public void setQc_gapf_NEE_radtow_EMEP(int Qc_gapf_NEE_radtow_EMEP) {
        _Qc_gapf_NEE_radtow_EMEP = Qc_gapf_NEE_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_gapf_NEE_radtow_EMEP",
                        int.class);

                method.invoke(_hyde_eddytowRemoteModel, Qc_gapf_NEE_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getGPP_radtow() {
        return _GPP_radtow;
    }

    @Override
    public void setGPP_radtow(float GPP_radtow) {
        _GPP_radtow = GPP_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setGPP_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, GPP_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getGPP_radtow_EMEP() {
        return _GPP_radtow_EMEP;
    }

    @Override
    public void setGPP_radtow_EMEP(int GPP_radtow_EMEP) {
        _GPP_radtow_EMEP = GPP_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setGPP_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, GPP_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTER_radtow() {
        return _TER_radtow;
    }

    @Override
    public void setTER_radtow(float TER_radtow) {
        _TER_radtow = TER_radtow;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTER_radtow", float.class);

                method.invoke(_hyde_eddytowRemoteModel, TER_radtow);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTER_radtow_EMEP() {
        return _TER_radtow_EMEP;
    }

    @Override
    public void setTER_radtow_EMEP(int TER_radtow_EMEP) {
        _TER_radtow_EMEP = TER_radtow_EMEP;

        if (_hyde_eddytowRemoteModel != null) {
            try {
                Class<?> clazz = _hyde_eddytowRemoteModel.getClass();

                Method method = clazz.getMethod("setTER_radtow_EMEP", int.class);

                method.invoke(_hyde_eddytowRemoteModel, TER_radtow_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHyde_eddytowRemoteModel() {
        return _hyde_eddytowRemoteModel;
    }

    public void setHyde_eddytowRemoteModel(BaseModel<?> hyde_eddytowRemoteModel) {
        _hyde_eddytowRemoteModel = hyde_eddytowRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _hyde_eddytowRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_hyde_eddytowRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Hyde_eddytowLocalServiceUtil.addHyde_eddytow(this);
        } else {
            Hyde_eddytowLocalServiceUtil.updateHyde_eddytow(this);
        }
    }

    @Override
    public Hyde_eddytow toEscapedModel() {
        return (Hyde_eddytow) ProxyUtil.newProxyInstance(Hyde_eddytow.class.getClassLoader(),
            new Class[] { Hyde_eddytow.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Hyde_eddytowClp clone = new Hyde_eddytowClp();

        clone.setSamptime(getSamptime());
        clone.setH_radtow(getH_radtow());
        clone.setH_radtow_EMEP(getH_radtow_EMEP());
        clone.setQc_H_radtow(getQc_H_radtow());
        clone.setQc_H_radtow_EMEP(getQc_H_radtow_EMEP());
        clone.setLE_radtow(getLE_radtow());
        clone.setLE_radtow_EMEP(getLE_radtow_EMEP());
        clone.setQc_LE_radtow(getQc_LE_radtow());
        clone.setQc_LE_radtow_EMEP(getQc_LE_radtow_EMEP());
        clone.setE_radtow(getE_radtow());
        clone.setE_radtow_EMEP(getE_radtow_EMEP());
        clone.setQc_E_radtow(getQc_E_radtow());
        clone.setQc_E_radtow_EMEP(getQc_E_radtow_EMEP());
        clone.setF_c_radtow(getF_c_radtow());
        clone.setF_c_radtow_EMEP(getF_c_radtow_EMEP());
        clone.setQc_F_c_radtow(getQc_F_c_radtow());
        clone.setQc_F_c_radtow_EMEP(getQc_F_c_radtow_EMEP());
        clone.setTau_radtow(getTau_radtow());
        clone.setTau_radtow_EMEP(getTau_radtow_EMEP());
        clone.setQc_tau_radtow(getQc_tau_radtow());
        clone.setQc_tau_radtow_EMEP(getQc_tau_radtow_EMEP());
        clone.setU_star_radtow(getU_star_radtow());
        clone.setU_star_radtow_EMEP(getU_star_radtow_EMEP());
        clone.setMO_length_radtow(getMO_length_radtow());
        clone.setMO_length_radtow_EMEP(getMO_length_radtow_EMEP());
        clone.setStd_u_radtow(getStd_u_radtow());
        clone.setStd_u_radtow_EMEP(getStd_u_radtow_EMEP());
        clone.setStd_v_radtow(getStd_v_radtow());
        clone.setStd_v_radtow_EMEP(getStd_v_radtow_EMEP());
        clone.setStd_w_radtow(getStd_w_radtow());
        clone.setStd_w_radtow_EMEP(getStd_w_radtow_EMEP());
        clone.setStd_t_radtow(getStd_t_radtow());
        clone.setStd_t_radtow_EMEP(getStd_t_radtow_EMEP());
        clone.setStd_c_radtow(getStd_c_radtow());
        clone.setStd_c_radtow_EMEP(getStd_c_radtow_EMEP());
        clone.setStd_h_radtow(getStd_h_radtow());
        clone.setStd_h_radtow_EMEP(getStd_h_radtow_EMEP());
        clone.setAv_u_radtow(getAv_u_radtow());
        clone.setAv_u_radtow_EMEP(getAv_u_radtow_EMEP());
        clone.setAv_v_radtow(getAv_v_radtow());
        clone.setAv_v_radtow_EMEP(getAv_v_radtow_EMEP());
        clone.setAv_w_radtow(getAv_w_radtow());
        clone.setAv_w_radtow_EMEP(getAv_w_radtow_EMEP());
        clone.setAv_t_radtow(getAv_t_radtow());
        clone.setAv_t_radtow_EMEP(getAv_t_radtow_EMEP());
        clone.setAv_c_radtow(getAv_c_radtow());
        clone.setAv_c_radtow_EMEP(getAv_c_radtow_EMEP());
        clone.setAv_h_radtow(getAv_h_radtow());
        clone.setAv_h_radtow_EMEP(getAv_h_radtow_EMEP());
        clone.setU_radtow(getU_radtow());
        clone.setU_radtow_EMEP(getU_radtow_EMEP());
        clone.setWind_dir_radtow(getWind_dir_radtow());
        clone.setWind_dir_radtow_EMEP(getWind_dir_radtow_EMEP());
        clone.setEta_radtow(getEta_radtow());
        clone.setEta_radtow_EMEP(getEta_radtow_EMEP());
        clone.setTheta_radtow(getTheta_radtow());
        clone.setTheta_radtow_EMEP(getTheta_radtow_EMEP());
        clone.setBeta_radtow(getBeta_radtow());
        clone.setBeta_radtow_EMEP(getBeta_radtow_EMEP());
        clone.setC_lag_radtow(getC_lag_radtow());
        clone.setC_lag_radtow_EMEP(getC_lag_radtow_EMEP());
        clone.setH_lag_radtow(getH_lag_radtow());
        clone.setH_lag_radtow_EMEP(getH_lag_radtow_EMEP());
        clone.setErr_packet_radtow(getErr_packet_radtow());
        clone.setErr_packet_radtow_EMEP(getErr_packet_radtow_EMEP());
        clone.setLicor_t_std_radtow(getLicor_t_std_radtow());
        clone.setLicor_t_std_radtow_EMEP(getLicor_t_std_radtow_EMEP());
        clone.setLicor_t_av_radtow(getLicor_t_av_radtow());
        clone.setLicor_t_av_radtow_EMEP(getLicor_t_av_radtow_EMEP());
        clone.setLicor_p_std_radtow(getLicor_p_std_radtow());
        clone.setLicor_p_std_radtow_EMEP(getLicor_p_std_radtow_EMEP());
        clone.setLicor_p_av_radtow(getLicor_p_av_radtow());
        clone.setLicor_p_av_radtow_EMEP(getLicor_p_av_radtow_EMEP());
        clone.setF_O3_radtow(getF_O3_radtow());
        clone.setF_O3_radtow_EMEP(getF_O3_radtow_EMEP());
        clone.setQc_F_O3_radtow(getQc_F_O3_radtow());
        clone.setQc_F_O3_radtow_EMEP(getQc_F_O3_radtow_EMEP());
        clone.setStd_O3_radtow(getStd_O3_radtow());
        clone.setStd_O3_radtow_EMEP(getStd_O3_radtow_EMEP());
        clone.setAv_O3_radtow(getAv_O3_radtow());
        clone.setAv_O3_radtow_EMEP(getAv_O3_radtow_EMEP());
        clone.setO3_lag_radtow(getO3_lag_radtow());
        clone.setO3_lag_radtow_EMEP(getO3_lag_radtow_EMEP());
        clone.setNEE_radtow(getNEE_radtow());
        clone.setNEE_radtow_EMEP(getNEE_radtow_EMEP());
        clone.setQc_gapf_NEE_radtow(getQc_gapf_NEE_radtow());
        clone.setQc_gapf_NEE_radtow_EMEP(getQc_gapf_NEE_radtow_EMEP());
        clone.setGPP_radtow(getGPP_radtow());
        clone.setGPP_radtow_EMEP(getGPP_radtow_EMEP());
        clone.setTER_radtow(getTER_radtow());
        clone.setTER_radtow_EMEP(getTER_radtow_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Hyde_eddytow hyde_eddytow) {
        java.util.Date primaryKey = hyde_eddytow.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Hyde_eddytowClp)) {
            return false;
        }

        Hyde_eddytowClp hyde_eddytow = (Hyde_eddytowClp) obj;

        java.util.Date primaryKey = hyde_eddytow.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(183);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", H_radtow=");
        sb.append(getH_radtow());
        sb.append(", H_radtow_EMEP=");
        sb.append(getH_radtow_EMEP());
        sb.append(", Qc_H_radtow=");
        sb.append(getQc_H_radtow());
        sb.append(", Qc_H_radtow_EMEP=");
        sb.append(getQc_H_radtow_EMEP());
        sb.append(", LE_radtow=");
        sb.append(getLE_radtow());
        sb.append(", LE_radtow_EMEP=");
        sb.append(getLE_radtow_EMEP());
        sb.append(", Qc_LE_radtow=");
        sb.append(getQc_LE_radtow());
        sb.append(", Qc_LE_radtow_EMEP=");
        sb.append(getQc_LE_radtow_EMEP());
        sb.append(", E_radtow=");
        sb.append(getE_radtow());
        sb.append(", E_radtow_EMEP=");
        sb.append(getE_radtow_EMEP());
        sb.append(", Qc_E_radtow=");
        sb.append(getQc_E_radtow());
        sb.append(", Qc_E_radtow_EMEP=");
        sb.append(getQc_E_radtow_EMEP());
        sb.append(", F_c_radtow=");
        sb.append(getF_c_radtow());
        sb.append(", F_c_radtow_EMEP=");
        sb.append(getF_c_radtow_EMEP());
        sb.append(", Qc_F_c_radtow=");
        sb.append(getQc_F_c_radtow());
        sb.append(", Qc_F_c_radtow_EMEP=");
        sb.append(getQc_F_c_radtow_EMEP());
        sb.append(", tau_radtow=");
        sb.append(getTau_radtow());
        sb.append(", tau_radtow_EMEP=");
        sb.append(getTau_radtow_EMEP());
        sb.append(", Qc_tau_radtow=");
        sb.append(getQc_tau_radtow());
        sb.append(", Qc_tau_radtow_EMEP=");
        sb.append(getQc_tau_radtow_EMEP());
        sb.append(", u_star_radtow=");
        sb.append(getU_star_radtow());
        sb.append(", u_star_radtow_EMEP=");
        sb.append(getU_star_radtow_EMEP());
        sb.append(", MO_length_radtow=");
        sb.append(getMO_length_radtow());
        sb.append(", MO_length_radtow_EMEP=");
        sb.append(getMO_length_radtow_EMEP());
        sb.append(", std_u_radtow=");
        sb.append(getStd_u_radtow());
        sb.append(", std_u_radtow_EMEP=");
        sb.append(getStd_u_radtow_EMEP());
        sb.append(", std_v_radtow=");
        sb.append(getStd_v_radtow());
        sb.append(", std_v_radtow_EMEP=");
        sb.append(getStd_v_radtow_EMEP());
        sb.append(", std_w_radtow=");
        sb.append(getStd_w_radtow());
        sb.append(", std_w_radtow_EMEP=");
        sb.append(getStd_w_radtow_EMEP());
        sb.append(", std_t_radtow=");
        sb.append(getStd_t_radtow());
        sb.append(", std_t_radtow_EMEP=");
        sb.append(getStd_t_radtow_EMEP());
        sb.append(", std_c_radtow=");
        sb.append(getStd_c_radtow());
        sb.append(", std_c_radtow_EMEP=");
        sb.append(getStd_c_radtow_EMEP());
        sb.append(", std_h_radtow=");
        sb.append(getStd_h_radtow());
        sb.append(", std_h_radtow_EMEP=");
        sb.append(getStd_h_radtow_EMEP());
        sb.append(", av_u_radtow=");
        sb.append(getAv_u_radtow());
        sb.append(", av_u_radtow_EMEP=");
        sb.append(getAv_u_radtow_EMEP());
        sb.append(", av_v_radtow=");
        sb.append(getAv_v_radtow());
        sb.append(", av_v_radtow_EMEP=");
        sb.append(getAv_v_radtow_EMEP());
        sb.append(", av_w_radtow=");
        sb.append(getAv_w_radtow());
        sb.append(", av_w_radtow_EMEP=");
        sb.append(getAv_w_radtow_EMEP());
        sb.append(", av_t_radtow=");
        sb.append(getAv_t_radtow());
        sb.append(", av_t_radtow_EMEP=");
        sb.append(getAv_t_radtow_EMEP());
        sb.append(", av_c_radtow=");
        sb.append(getAv_c_radtow());
        sb.append(", av_c_radtow_EMEP=");
        sb.append(getAv_c_radtow_EMEP());
        sb.append(", av_h_radtow=");
        sb.append(getAv_h_radtow());
        sb.append(", av_h_radtow_EMEP=");
        sb.append(getAv_h_radtow_EMEP());
        sb.append(", U_radtow=");
        sb.append(getU_radtow());
        sb.append(", U_radtow_EMEP=");
        sb.append(getU_radtow_EMEP());
        sb.append(", wind_dir_radtow=");
        sb.append(getWind_dir_radtow());
        sb.append(", wind_dir_radtow_EMEP=");
        sb.append(getWind_dir_radtow_EMEP());
        sb.append(", eta_radtow=");
        sb.append(getEta_radtow());
        sb.append(", eta_radtow_EMEP=");
        sb.append(getEta_radtow_EMEP());
        sb.append(", theta_radtow=");
        sb.append(getTheta_radtow());
        sb.append(", theta_radtow_EMEP=");
        sb.append(getTheta_radtow_EMEP());
        sb.append(", beta_radtow=");
        sb.append(getBeta_radtow());
        sb.append(", beta_radtow_EMEP=");
        sb.append(getBeta_radtow_EMEP());
        sb.append(", c_lag_radtow=");
        sb.append(getC_lag_radtow());
        sb.append(", c_lag_radtow_EMEP=");
        sb.append(getC_lag_radtow_EMEP());
        sb.append(", h_lag_radtow=");
        sb.append(getH_lag_radtow());
        sb.append(", h_lag_radtow_EMEP=");
        sb.append(getH_lag_radtow_EMEP());
        sb.append(", err_packet_radtow=");
        sb.append(getErr_packet_radtow());
        sb.append(", err_packet_radtow_EMEP=");
        sb.append(getErr_packet_radtow_EMEP());
        sb.append(", licor_t_std_radtow=");
        sb.append(getLicor_t_std_radtow());
        sb.append(", licor_t_std_radtow_EMEP=");
        sb.append(getLicor_t_std_radtow_EMEP());
        sb.append(", licor_t_av_radtow=");
        sb.append(getLicor_t_av_radtow());
        sb.append(", licor_t_av_radtow_EMEP=");
        sb.append(getLicor_t_av_radtow_EMEP());
        sb.append(", licor_p_std_radtow=");
        sb.append(getLicor_p_std_radtow());
        sb.append(", licor_p_std_radtow_EMEP=");
        sb.append(getLicor_p_std_radtow_EMEP());
        sb.append(", licor_p_av_radtow=");
        sb.append(getLicor_p_av_radtow());
        sb.append(", licor_p_av_radtow_EMEP=");
        sb.append(getLicor_p_av_radtow_EMEP());
        sb.append(", F_O3_radtow=");
        sb.append(getF_O3_radtow());
        sb.append(", F_O3_radtow_EMEP=");
        sb.append(getF_O3_radtow_EMEP());
        sb.append(", Qc_F_O3_radtow=");
        sb.append(getQc_F_O3_radtow());
        sb.append(", Qc_F_O3_radtow_EMEP=");
        sb.append(getQc_F_O3_radtow_EMEP());
        sb.append(", std_O3_radtow=");
        sb.append(getStd_O3_radtow());
        sb.append(", std_O3_radtow_EMEP=");
        sb.append(getStd_O3_radtow_EMEP());
        sb.append(", av_O3_radtow=");
        sb.append(getAv_O3_radtow());
        sb.append(", av_O3_radtow_EMEP=");
        sb.append(getAv_O3_radtow_EMEP());
        sb.append(", O3_lag_radtow=");
        sb.append(getO3_lag_radtow());
        sb.append(", O3_lag_radtow_EMEP=");
        sb.append(getO3_lag_radtow_EMEP());
        sb.append(", NEE_radtow=");
        sb.append(getNEE_radtow());
        sb.append(", NEE_radtow_EMEP=");
        sb.append(getNEE_radtow_EMEP());
        sb.append(", Qc_gapf_NEE_radtow=");
        sb.append(getQc_gapf_NEE_radtow());
        sb.append(", Qc_gapf_NEE_radtow_EMEP=");
        sb.append(getQc_gapf_NEE_radtow_EMEP());
        sb.append(", GPP_radtow=");
        sb.append(getGPP_radtow());
        sb.append(", GPP_radtow_EMEP=");
        sb.append(getGPP_radtow_EMEP());
        sb.append(", TER_radtow=");
        sb.append(getTER_radtow());
        sb.append(", TER_radtow_EMEP=");
        sb.append(getTER_radtow_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(277);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Hyde_eddytow");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_radtow</column-name><column-value><![CDATA[");
        sb.append(getH_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_H_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_radtow</column-name><column-value><![CDATA[");
        sb.append(getLE_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_radtow</column-name><column-value><![CDATA[");
        sb.append(getE_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getE_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_E_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_E_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_radtow</column-name><column-value><![CDATA[");
        sb.append(getF_c_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_c_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_radtow</column-name><column-value><![CDATA[");
        sb.append(getTau_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_radtow</column-name><column-value><![CDATA[");
        sb.append(getU_star_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_star_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_radtow</column-name><column-value><![CDATA[");
        sb.append(getMO_length_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getMO_length_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_u_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_u_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_v_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_v_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_w_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_w_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_t_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_t_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_c_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_h_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_u_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_u_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_v_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_v_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_w_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_w_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_t_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_t_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_c_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_h_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_radtow</column-name><column-value><![CDATA[");
        sb.append(getU_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_radtow</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_radtow</column-name><column-value><![CDATA[");
        sb.append(getEta_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getEta_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_radtow</column-name><column-value><![CDATA[");
        sb.append(getTheta_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTheta_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_radtow</column-name><column-value><![CDATA[");
        sb.append(getBeta_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getBeta_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_radtow</column-name><column-value><![CDATA[");
        sb.append(getC_lag_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getC_lag_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_radtow</column-name><column-value><![CDATA[");
        sb.append(getH_lag_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_lag_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_radtow</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std_radtow</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av_radtow</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_radtow</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_radtow</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_O3_radtow</column-name><column-value><![CDATA[");
        sb.append(getF_O3_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_O3_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_O3_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_O3_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_F_O3_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_O3_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_O3_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_O3_radtow</column-name><column-value><![CDATA[");
        sb.append(getStd_O3_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_O3_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_O3_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_O3_radtow</column-name><column-value><![CDATA[");
        sb.append(getAv_O3_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_O3_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_O3_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_lag_radtow</column-name><column-value><![CDATA[");
        sb.append(getO3_lag_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_lag_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getO3_lag_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NEE_radtow</column-name><column-value><![CDATA[");
        sb.append(getNEE_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NEE_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNEE_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_gapf_NEE_radtow</column-name><column-value><![CDATA[");
        sb.append(getQc_gapf_NEE_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_gapf_NEE_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_gapf_NEE_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>GPP_radtow</column-name><column-value><![CDATA[");
        sb.append(getGPP_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>GPP_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getGPP_radtow_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TER_radtow</column-name><column-value><![CDATA[");
        sb.append(getTER_radtow());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TER_radtow_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTER_radtow_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
