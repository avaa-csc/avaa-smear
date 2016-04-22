package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Hyy_eddysubLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Hyy_eddysubClp extends BaseModelImpl<Hyy_eddysub>
    implements Hyy_eddysub {
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
    private BaseModel<?> _hyy_eddysubRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Hyy_eddysubClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Hyy_eddysub.class;
    }

    @Override
    public String getModelClassName() {
        return Hyy_eddysub.class.getName();
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
        attributes.put("H_subm", getH_subm());
        attributes.put("H_subm_EMEP", getH_subm_EMEP());
        attributes.put("Qc_H_subm", getQc_H_subm());
        attributes.put("Qc_H_subm_EMEP", getQc_H_subm_EMEP());
        attributes.put("LE_subm", getLE_subm());
        attributes.put("LE_subm_EMEP", getLE_subm_EMEP());
        attributes.put("Qc_LE_subm", getQc_LE_subm());
        attributes.put("Qc_LE_subm_EMEP", getQc_LE_subm_EMEP());
        attributes.put("E_subm", getE_subm());
        attributes.put("E_subm_EMEP", getE_subm_EMEP());
        attributes.put("Qc_E_subm", getQc_E_subm());
        attributes.put("Qc_E_subm_EMEP", getQc_E_subm_EMEP());
        attributes.put("F_c_subm", getF_c_subm());
        attributes.put("F_c_subm_EMEP", getF_c_subm_EMEP());
        attributes.put("Qc_F_c_subm", getQc_F_c_subm());
        attributes.put("Qc_F_c_subm_EMEP", getQc_F_c_subm_EMEP());
        attributes.put("tau_subm", getTau_subm());
        attributes.put("tau_subm_EMEP", getTau_subm_EMEP());
        attributes.put("Qc_tau_subm", getQc_tau_subm());
        attributes.put("Qc_tau_subm_EMEP", getQc_tau_subm_EMEP());
        attributes.put("u_star_subm", getU_star_subm());
        attributes.put("u_star_subm_EMEP", getU_star_subm_EMEP());
        attributes.put("MO_length_subm", getMO_length_subm());
        attributes.put("MO_length_subm_EMEP", getMO_length_subm_EMEP());
        attributes.put("std_u_subm", getStd_u_subm());
        attributes.put("std_u_subm_EMEP", getStd_u_subm_EMEP());
        attributes.put("std_v_subm", getStd_v_subm());
        attributes.put("std_v_subm_EMEP", getStd_v_subm_EMEP());
        attributes.put("std_w_subm", getStd_w_subm());
        attributes.put("std_w_subm_EMEP", getStd_w_subm_EMEP());
        attributes.put("std_t_subm", getStd_t_subm());
        attributes.put("std_t_subm_EMEP", getStd_t_subm_EMEP());
        attributes.put("std_c_subm", getStd_c_subm());
        attributes.put("std_c_subm_EMEP", getStd_c_subm_EMEP());
        attributes.put("std_h_subm", getStd_h_subm());
        attributes.put("std_h_subm_EMEP", getStd_h_subm_EMEP());
        attributes.put("av_u_subm", getAv_u_subm());
        attributes.put("av_u_subm_EMEP", getAv_u_subm_EMEP());
        attributes.put("av_v_subm", getAv_v_subm());
        attributes.put("av_v_subm_EMEP", getAv_v_subm_EMEP());
        attributes.put("av_w_subm", getAv_w_subm());
        attributes.put("av_w_subm_EMEP", getAv_w_subm_EMEP());
        attributes.put("av_t_subm", getAv_t_subm());
        attributes.put("av_t_subm_EMEP", getAv_t_subm_EMEP());
        attributes.put("av_c_subm", getAv_c_subm());
        attributes.put("av_c_subm_EMEP", getAv_c_subm_EMEP());
        attributes.put("av_h_subm", getAv_h_subm());
        attributes.put("av_h_subm_EMEP", getAv_h_subm_EMEP());
        attributes.put("U_subm", getU_subm());
        attributes.put("U_subm_EMEP", getU_subm_EMEP());
        attributes.put("wind_dir_subm", getWind_dir_subm());
        attributes.put("wind_dir_subm_EMEP", getWind_dir_subm_EMEP());
        attributes.put("eta_subm", getEta_subm());
        attributes.put("eta_subm_EMEP", getEta_subm_EMEP());
        attributes.put("theta_subm", getTheta_subm());
        attributes.put("theta_subm_EMEP", getTheta_subm_EMEP());
        attributes.put("beta_subm", getBeta_subm());
        attributes.put("beta_subm_EMEP", getBeta_subm_EMEP());
        attributes.put("c_lag_subm", getC_lag_subm());
        attributes.put("c_lag_subm_EMEP", getC_lag_subm_EMEP());
        attributes.put("h_lag_subm", getH_lag_subm());
        attributes.put("h_lag_subm_EMEP", getH_lag_subm_EMEP());
        attributes.put("err_packet_subm", getErr_packet_subm());
        attributes.put("err_packet_subm_EMEP", getErr_packet_subm_EMEP());
        attributes.put("licor_t_std_subm", getLicor_t_std_subm());
        attributes.put("licor_t_std_subm_EMEP", getLicor_t_std_subm_EMEP());
        attributes.put("licor_t_av_subm", getLicor_t_av_subm());
        attributes.put("licor_t_av_subm_EMEP", getLicor_t_av_subm_EMEP());
        attributes.put("licor_p_std_subm", getLicor_p_std_subm());
        attributes.put("licor_p_std_subm_EMEP", getLicor_p_std_subm_EMEP());
        attributes.put("licor_p_av_subm", getLicor_p_av_subm());
        attributes.put("licor_p_av_subm_EMEP", getLicor_p_av_subm_EMEP());
        attributes.put("av_O3_subm", getAv_O3_subm());
        attributes.put("av_O3_subm_EMEP", getAv_O3_subm_EMEP());
        attributes.put("std_O3_subm", getStd_O3_subm());
        attributes.put("std_O3_subm_EMEP", getStd_O3_subm_EMEP());
        attributes.put("O3_lag_subm", getO3_lag_subm());
        attributes.put("O3_lag_subm_EMEP", getO3_lag_subm_EMEP());
        attributes.put("F_O3_subm", getF_O3_subm());
        attributes.put("F_O3_subm_EMEP", getF_O3_subm_EMEP());
        attributes.put("Qc_F_O3_subm", getQc_F_O3_subm());
        attributes.put("Qc_F_O3_subm_EMEP", getQc_F_O3_subm_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float H_subm = (Float) attributes.get("H_subm");

        if (H_subm != null) {
            setH_subm(H_subm);
        }

        Integer H_subm_EMEP = (Integer) attributes.get("H_subm_EMEP");

        if (H_subm_EMEP != null) {
            setH_subm_EMEP(H_subm_EMEP);
        }

        Integer Qc_H_subm = (Integer) attributes.get("Qc_H_subm");

        if (Qc_H_subm != null) {
            setQc_H_subm(Qc_H_subm);
        }

        Integer Qc_H_subm_EMEP = (Integer) attributes.get("Qc_H_subm_EMEP");

        if (Qc_H_subm_EMEP != null) {
            setQc_H_subm_EMEP(Qc_H_subm_EMEP);
        }

        Float LE_subm = (Float) attributes.get("LE_subm");

        if (LE_subm != null) {
            setLE_subm(LE_subm);
        }

        Integer LE_subm_EMEP = (Integer) attributes.get("LE_subm_EMEP");

        if (LE_subm_EMEP != null) {
            setLE_subm_EMEP(LE_subm_EMEP);
        }

        Integer Qc_LE_subm = (Integer) attributes.get("Qc_LE_subm");

        if (Qc_LE_subm != null) {
            setQc_LE_subm(Qc_LE_subm);
        }

        Integer Qc_LE_subm_EMEP = (Integer) attributes.get("Qc_LE_subm_EMEP");

        if (Qc_LE_subm_EMEP != null) {
            setQc_LE_subm_EMEP(Qc_LE_subm_EMEP);
        }

        Float E_subm = (Float) attributes.get("E_subm");

        if (E_subm != null) {
            setE_subm(E_subm);
        }

        Integer E_subm_EMEP = (Integer) attributes.get("E_subm_EMEP");

        if (E_subm_EMEP != null) {
            setE_subm_EMEP(E_subm_EMEP);
        }

        Integer Qc_E_subm = (Integer) attributes.get("Qc_E_subm");

        if (Qc_E_subm != null) {
            setQc_E_subm(Qc_E_subm);
        }

        Integer Qc_E_subm_EMEP = (Integer) attributes.get("Qc_E_subm_EMEP");

        if (Qc_E_subm_EMEP != null) {
            setQc_E_subm_EMEP(Qc_E_subm_EMEP);
        }

        Float F_c_subm = (Float) attributes.get("F_c_subm");

        if (F_c_subm != null) {
            setF_c_subm(F_c_subm);
        }

        Integer F_c_subm_EMEP = (Integer) attributes.get("F_c_subm_EMEP");

        if (F_c_subm_EMEP != null) {
            setF_c_subm_EMEP(F_c_subm_EMEP);
        }

        Integer Qc_F_c_subm = (Integer) attributes.get("Qc_F_c_subm");

        if (Qc_F_c_subm != null) {
            setQc_F_c_subm(Qc_F_c_subm);
        }

        Integer Qc_F_c_subm_EMEP = (Integer) attributes.get("Qc_F_c_subm_EMEP");

        if (Qc_F_c_subm_EMEP != null) {
            setQc_F_c_subm_EMEP(Qc_F_c_subm_EMEP);
        }

        Float tau_subm = (Float) attributes.get("tau_subm");

        if (tau_subm != null) {
            setTau_subm(tau_subm);
        }

        Integer tau_subm_EMEP = (Integer) attributes.get("tau_subm_EMEP");

        if (tau_subm_EMEP != null) {
            setTau_subm_EMEP(tau_subm_EMEP);
        }

        Integer Qc_tau_subm = (Integer) attributes.get("Qc_tau_subm");

        if (Qc_tau_subm != null) {
            setQc_tau_subm(Qc_tau_subm);
        }

        Integer Qc_tau_subm_EMEP = (Integer) attributes.get("Qc_tau_subm_EMEP");

        if (Qc_tau_subm_EMEP != null) {
            setQc_tau_subm_EMEP(Qc_tau_subm_EMEP);
        }

        Float u_star_subm = (Float) attributes.get("u_star_subm");

        if (u_star_subm != null) {
            setU_star_subm(u_star_subm);
        }

        Integer u_star_subm_EMEP = (Integer) attributes.get("u_star_subm_EMEP");

        if (u_star_subm_EMEP != null) {
            setU_star_subm_EMEP(u_star_subm_EMEP);
        }

        Float MO_length_subm = (Float) attributes.get("MO_length_subm");

        if (MO_length_subm != null) {
            setMO_length_subm(MO_length_subm);
        }

        Integer MO_length_subm_EMEP = (Integer) attributes.get(
                "MO_length_subm_EMEP");

        if (MO_length_subm_EMEP != null) {
            setMO_length_subm_EMEP(MO_length_subm_EMEP);
        }

        Float std_u_subm = (Float) attributes.get("std_u_subm");

        if (std_u_subm != null) {
            setStd_u_subm(std_u_subm);
        }

        Integer std_u_subm_EMEP = (Integer) attributes.get("std_u_subm_EMEP");

        if (std_u_subm_EMEP != null) {
            setStd_u_subm_EMEP(std_u_subm_EMEP);
        }

        Float std_v_subm = (Float) attributes.get("std_v_subm");

        if (std_v_subm != null) {
            setStd_v_subm(std_v_subm);
        }

        Integer std_v_subm_EMEP = (Integer) attributes.get("std_v_subm_EMEP");

        if (std_v_subm_EMEP != null) {
            setStd_v_subm_EMEP(std_v_subm_EMEP);
        }

        Float std_w_subm = (Float) attributes.get("std_w_subm");

        if (std_w_subm != null) {
            setStd_w_subm(std_w_subm);
        }

        Integer std_w_subm_EMEP = (Integer) attributes.get("std_w_subm_EMEP");

        if (std_w_subm_EMEP != null) {
            setStd_w_subm_EMEP(std_w_subm_EMEP);
        }

        Float std_t_subm = (Float) attributes.get("std_t_subm");

        if (std_t_subm != null) {
            setStd_t_subm(std_t_subm);
        }

        Integer std_t_subm_EMEP = (Integer) attributes.get("std_t_subm_EMEP");

        if (std_t_subm_EMEP != null) {
            setStd_t_subm_EMEP(std_t_subm_EMEP);
        }

        Float std_c_subm = (Float) attributes.get("std_c_subm");

        if (std_c_subm != null) {
            setStd_c_subm(std_c_subm);
        }

        Integer std_c_subm_EMEP = (Integer) attributes.get("std_c_subm_EMEP");

        if (std_c_subm_EMEP != null) {
            setStd_c_subm_EMEP(std_c_subm_EMEP);
        }

        Float std_h_subm = (Float) attributes.get("std_h_subm");

        if (std_h_subm != null) {
            setStd_h_subm(std_h_subm);
        }

        Integer std_h_subm_EMEP = (Integer) attributes.get("std_h_subm_EMEP");

        if (std_h_subm_EMEP != null) {
            setStd_h_subm_EMEP(std_h_subm_EMEP);
        }

        Float av_u_subm = (Float) attributes.get("av_u_subm");

        if (av_u_subm != null) {
            setAv_u_subm(av_u_subm);
        }

        Integer av_u_subm_EMEP = (Integer) attributes.get("av_u_subm_EMEP");

        if (av_u_subm_EMEP != null) {
            setAv_u_subm_EMEP(av_u_subm_EMEP);
        }

        Float av_v_subm = (Float) attributes.get("av_v_subm");

        if (av_v_subm != null) {
            setAv_v_subm(av_v_subm);
        }

        Integer av_v_subm_EMEP = (Integer) attributes.get("av_v_subm_EMEP");

        if (av_v_subm_EMEP != null) {
            setAv_v_subm_EMEP(av_v_subm_EMEP);
        }

        Float av_w_subm = (Float) attributes.get("av_w_subm");

        if (av_w_subm != null) {
            setAv_w_subm(av_w_subm);
        }

        Integer av_w_subm_EMEP = (Integer) attributes.get("av_w_subm_EMEP");

        if (av_w_subm_EMEP != null) {
            setAv_w_subm_EMEP(av_w_subm_EMEP);
        }

        Float av_t_subm = (Float) attributes.get("av_t_subm");

        if (av_t_subm != null) {
            setAv_t_subm(av_t_subm);
        }

        Integer av_t_subm_EMEP = (Integer) attributes.get("av_t_subm_EMEP");

        if (av_t_subm_EMEP != null) {
            setAv_t_subm_EMEP(av_t_subm_EMEP);
        }

        Float av_c_subm = (Float) attributes.get("av_c_subm");

        if (av_c_subm != null) {
            setAv_c_subm(av_c_subm);
        }

        Integer av_c_subm_EMEP = (Integer) attributes.get("av_c_subm_EMEP");

        if (av_c_subm_EMEP != null) {
            setAv_c_subm_EMEP(av_c_subm_EMEP);
        }

        Float av_h_subm = (Float) attributes.get("av_h_subm");

        if (av_h_subm != null) {
            setAv_h_subm(av_h_subm);
        }

        Integer av_h_subm_EMEP = (Integer) attributes.get("av_h_subm_EMEP");

        if (av_h_subm_EMEP != null) {
            setAv_h_subm_EMEP(av_h_subm_EMEP);
        }

        Float U_subm = (Float) attributes.get("U_subm");

        if (U_subm != null) {
            setU_subm(U_subm);
        }

        Integer U_subm_EMEP = (Integer) attributes.get("U_subm_EMEP");

        if (U_subm_EMEP != null) {
            setU_subm_EMEP(U_subm_EMEP);
        }

        Float wind_dir_subm = (Float) attributes.get("wind_dir_subm");

        if (wind_dir_subm != null) {
            setWind_dir_subm(wind_dir_subm);
        }

        Integer wind_dir_subm_EMEP = (Integer) attributes.get(
                "wind_dir_subm_EMEP");

        if (wind_dir_subm_EMEP != null) {
            setWind_dir_subm_EMEP(wind_dir_subm_EMEP);
        }

        Float eta_subm = (Float) attributes.get("eta_subm");

        if (eta_subm != null) {
            setEta_subm(eta_subm);
        }

        Integer eta_subm_EMEP = (Integer) attributes.get("eta_subm_EMEP");

        if (eta_subm_EMEP != null) {
            setEta_subm_EMEP(eta_subm_EMEP);
        }

        Float theta_subm = (Float) attributes.get("theta_subm");

        if (theta_subm != null) {
            setTheta_subm(theta_subm);
        }

        Integer theta_subm_EMEP = (Integer) attributes.get("theta_subm_EMEP");

        if (theta_subm_EMEP != null) {
            setTheta_subm_EMEP(theta_subm_EMEP);
        }

        Float beta_subm = (Float) attributes.get("beta_subm");

        if (beta_subm != null) {
            setBeta_subm(beta_subm);
        }

        Integer beta_subm_EMEP = (Integer) attributes.get("beta_subm_EMEP");

        if (beta_subm_EMEP != null) {
            setBeta_subm_EMEP(beta_subm_EMEP);
        }

        Float c_lag_subm = (Float) attributes.get("c_lag_subm");

        if (c_lag_subm != null) {
            setC_lag_subm(c_lag_subm);
        }

        Integer c_lag_subm_EMEP = (Integer) attributes.get("c_lag_subm_EMEP");

        if (c_lag_subm_EMEP != null) {
            setC_lag_subm_EMEP(c_lag_subm_EMEP);
        }

        Float h_lag_subm = (Float) attributes.get("h_lag_subm");

        if (h_lag_subm != null) {
            setH_lag_subm(h_lag_subm);
        }

        Integer h_lag_subm_EMEP = (Integer) attributes.get("h_lag_subm_EMEP");

        if (h_lag_subm_EMEP != null) {
            setH_lag_subm_EMEP(h_lag_subm_EMEP);
        }

        Float err_packet_subm = (Float) attributes.get("err_packet_subm");

        if (err_packet_subm != null) {
            setErr_packet_subm(err_packet_subm);
        }

        Integer err_packet_subm_EMEP = (Integer) attributes.get(
                "err_packet_subm_EMEP");

        if (err_packet_subm_EMEP != null) {
            setErr_packet_subm_EMEP(err_packet_subm_EMEP);
        }

        Float licor_t_std_subm = (Float) attributes.get("licor_t_std_subm");

        if (licor_t_std_subm != null) {
            setLicor_t_std_subm(licor_t_std_subm);
        }

        Integer licor_t_std_subm_EMEP = (Integer) attributes.get(
                "licor_t_std_subm_EMEP");

        if (licor_t_std_subm_EMEP != null) {
            setLicor_t_std_subm_EMEP(licor_t_std_subm_EMEP);
        }

        Float licor_t_av_subm = (Float) attributes.get("licor_t_av_subm");

        if (licor_t_av_subm != null) {
            setLicor_t_av_subm(licor_t_av_subm);
        }

        Integer licor_t_av_subm_EMEP = (Integer) attributes.get(
                "licor_t_av_subm_EMEP");

        if (licor_t_av_subm_EMEP != null) {
            setLicor_t_av_subm_EMEP(licor_t_av_subm_EMEP);
        }

        Float licor_p_std_subm = (Float) attributes.get("licor_p_std_subm");

        if (licor_p_std_subm != null) {
            setLicor_p_std_subm(licor_p_std_subm);
        }

        Integer licor_p_std_subm_EMEP = (Integer) attributes.get(
                "licor_p_std_subm_EMEP");

        if (licor_p_std_subm_EMEP != null) {
            setLicor_p_std_subm_EMEP(licor_p_std_subm_EMEP);
        }

        Float licor_p_av_subm = (Float) attributes.get("licor_p_av_subm");

        if (licor_p_av_subm != null) {
            setLicor_p_av_subm(licor_p_av_subm);
        }

        Integer licor_p_av_subm_EMEP = (Integer) attributes.get(
                "licor_p_av_subm_EMEP");

        if (licor_p_av_subm_EMEP != null) {
            setLicor_p_av_subm_EMEP(licor_p_av_subm_EMEP);
        }

        Float av_O3_subm = (Float) attributes.get("av_O3_subm");

        if (av_O3_subm != null) {
            setAv_O3_subm(av_O3_subm);
        }

        Integer av_O3_subm_EMEP = (Integer) attributes.get("av_O3_subm_EMEP");

        if (av_O3_subm_EMEP != null) {
            setAv_O3_subm_EMEP(av_O3_subm_EMEP);
        }

        Float std_O3_subm = (Float) attributes.get("std_O3_subm");

        if (std_O3_subm != null) {
            setStd_O3_subm(std_O3_subm);
        }

        Integer std_O3_subm_EMEP = (Integer) attributes.get("std_O3_subm_EMEP");

        if (std_O3_subm_EMEP != null) {
            setStd_O3_subm_EMEP(std_O3_subm_EMEP);
        }

        Float O3_lag_subm = (Float) attributes.get("O3_lag_subm");

        if (O3_lag_subm != null) {
            setO3_lag_subm(O3_lag_subm);
        }

        Integer O3_lag_subm_EMEP = (Integer) attributes.get("O3_lag_subm_EMEP");

        if (O3_lag_subm_EMEP != null) {
            setO3_lag_subm_EMEP(O3_lag_subm_EMEP);
        }

        Float F_O3_subm = (Float) attributes.get("F_O3_subm");

        if (F_O3_subm != null) {
            setF_O3_subm(F_O3_subm);
        }

        Integer F_O3_subm_EMEP = (Integer) attributes.get("F_O3_subm_EMEP");

        if (F_O3_subm_EMEP != null) {
            setF_O3_subm_EMEP(F_O3_subm_EMEP);
        }

        Integer Qc_F_O3_subm = (Integer) attributes.get("Qc_F_O3_subm");

        if (Qc_F_O3_subm != null) {
            setQc_F_O3_subm(Qc_F_O3_subm);
        }

        Integer Qc_F_O3_subm_EMEP = (Integer) attributes.get(
                "Qc_F_O3_subm_EMEP");

        if (Qc_F_O3_subm_EMEP != null) {
            setQc_F_O3_subm_EMEP(Qc_F_O3_subm_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_hyy_eddysubRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_subm() {
        return _H_subm;
    }

    @Override
    public void setH_subm(float H_subm) {
        _H_subm = H_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setH_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, H_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_subm_EMEP() {
        return _H_subm_EMEP;
    }

    @Override
    public void setH_subm_EMEP(int H_subm_EMEP) {
        _H_subm_EMEP = H_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setH_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, H_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_subm() {
        return _Qc_H_subm;
    }

    @Override
    public void setQc_H_subm(int Qc_H_subm) {
        _Qc_H_subm = Qc_H_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_H_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_subm_EMEP() {
        return _Qc_H_subm_EMEP;
    }

    @Override
    public void setQc_H_subm_EMEP(int Qc_H_subm_EMEP) {
        _Qc_H_subm_EMEP = Qc_H_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_H_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_subm() {
        return _LE_subm;
    }

    @Override
    public void setLE_subm(float LE_subm) {
        _LE_subm = LE_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, LE_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_subm_EMEP() {
        return _LE_subm_EMEP;
    }

    @Override
    public void setLE_subm_EMEP(int LE_subm_EMEP) {
        _LE_subm_EMEP = LE_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, LE_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_subm() {
        return _Qc_LE_subm;
    }

    @Override
    public void setQc_LE_subm(int Qc_LE_subm) {
        _Qc_LE_subm = Qc_LE_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_LE_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_subm_EMEP() {
        return _Qc_LE_subm_EMEP;
    }

    @Override
    public void setQc_LE_subm_EMEP(int Qc_LE_subm_EMEP) {
        _Qc_LE_subm_EMEP = Qc_LE_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_LE_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getE_subm() {
        return _E_subm;
    }

    @Override
    public void setE_subm(float E_subm) {
        _E_subm = E_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setE_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, E_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getE_subm_EMEP() {
        return _E_subm_EMEP;
    }

    @Override
    public void setE_subm_EMEP(int E_subm_EMEP) {
        _E_subm_EMEP = E_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setE_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, E_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E_subm() {
        return _Qc_E_subm;
    }

    @Override
    public void setQc_E_subm(int Qc_E_subm) {
        _Qc_E_subm = Qc_E_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_E_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E_subm_EMEP() {
        return _Qc_E_subm_EMEP;
    }

    @Override
    public void setQc_E_subm_EMEP(int Qc_E_subm_EMEP) {
        _Qc_E_subm_EMEP = Qc_E_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_E_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_c_subm() {
        return _F_c_subm;
    }

    @Override
    public void setF_c_subm(float F_c_subm) {
        _F_c_subm = F_c_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, F_c_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_c_subm_EMEP() {
        return _F_c_subm_EMEP;
    }

    @Override
    public void setF_c_subm_EMEP(int F_c_subm_EMEP) {
        _F_c_subm_EMEP = F_c_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, F_c_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c_subm() {
        return _Qc_F_c_subm;
    }

    @Override
    public void setQc_F_c_subm(int Qc_F_c_subm) {
        _Qc_F_c_subm = Qc_F_c_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_F_c_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c_subm_EMEP() {
        return _Qc_F_c_subm_EMEP;
    }

    @Override
    public void setQc_F_c_subm_EMEP(int Qc_F_c_subm_EMEP) {
        _Qc_F_c_subm_EMEP = Qc_F_c_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_F_c_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTau_subm() {
        return _tau_subm;
    }

    @Override
    public void setTau_subm(float tau_subm) {
        _tau_subm = tau_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, tau_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTau_subm_EMEP() {
        return _tau_subm_EMEP;
    }

    @Override
    public void setTau_subm_EMEP(int tau_subm_EMEP) {
        _tau_subm_EMEP = tau_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, tau_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_subm() {
        return _Qc_tau_subm;
    }

    @Override
    public void setQc_tau_subm(int Qc_tau_subm) {
        _Qc_tau_subm = Qc_tau_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_tau_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_subm_EMEP() {
        return _Qc_tau_subm_EMEP;
    }

    @Override
    public void setQc_tau_subm_EMEP(int Qc_tau_subm_EMEP) {
        _Qc_tau_subm_EMEP = Qc_tau_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_tau_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_star_subm() {
        return _u_star_subm;
    }

    @Override
    public void setU_star_subm(float u_star_subm) {
        _u_star_subm = u_star_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, u_star_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_star_subm_EMEP() {
        return _u_star_subm_EMEP;
    }

    @Override
    public void setU_star_subm_EMEP(int u_star_subm_EMEP) {
        _u_star_subm_EMEP = u_star_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, u_star_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMO_length_subm() {
        return _MO_length_subm;
    }

    @Override
    public void setMO_length_subm(float MO_length_subm) {
        _MO_length_subm = MO_length_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, MO_length_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMO_length_subm_EMEP() {
        return _MO_length_subm_EMEP;
    }

    @Override
    public void setMO_length_subm_EMEP(int MO_length_subm_EMEP) {
        _MO_length_subm_EMEP = MO_length_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, MO_length_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_u_subm() {
        return _std_u_subm;
    }

    @Override
    public void setStd_u_subm(float std_u_subm) {
        _std_u_subm = std_u_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_u_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_u_subm_EMEP() {
        return _std_u_subm_EMEP;
    }

    @Override
    public void setStd_u_subm_EMEP(int std_u_subm_EMEP) {
        _std_u_subm_EMEP = std_u_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_u_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_v_subm() {
        return _std_v_subm;
    }

    @Override
    public void setStd_v_subm(float std_v_subm) {
        _std_v_subm = std_v_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_v_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_v_subm_EMEP() {
        return _std_v_subm_EMEP;
    }

    @Override
    public void setStd_v_subm_EMEP(int std_v_subm_EMEP) {
        _std_v_subm_EMEP = std_v_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_v_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_w_subm() {
        return _std_w_subm;
    }

    @Override
    public void setStd_w_subm(float std_w_subm) {
        _std_w_subm = std_w_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_w_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_w_subm_EMEP() {
        return _std_w_subm_EMEP;
    }

    @Override
    public void setStd_w_subm_EMEP(int std_w_subm_EMEP) {
        _std_w_subm_EMEP = std_w_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_w_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_t_subm() {
        return _std_t_subm;
    }

    @Override
    public void setStd_t_subm(float std_t_subm) {
        _std_t_subm = std_t_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_t_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_t_subm_EMEP() {
        return _std_t_subm_EMEP;
    }

    @Override
    public void setStd_t_subm_EMEP(int std_t_subm_EMEP) {
        _std_t_subm_EMEP = std_t_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_t_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c_subm() {
        return _std_c_subm;
    }

    @Override
    public void setStd_c_subm(float std_c_subm) {
        _std_c_subm = std_c_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_c_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_subm_EMEP() {
        return _std_c_subm_EMEP;
    }

    @Override
    public void setStd_c_subm_EMEP(int std_c_subm_EMEP) {
        _std_c_subm_EMEP = std_c_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_c_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h_subm() {
        return _std_h_subm;
    }

    @Override
    public void setStd_h_subm(float std_h_subm) {
        _std_h_subm = std_h_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_h_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_subm_EMEP() {
        return _std_h_subm_EMEP;
    }

    @Override
    public void setStd_h_subm_EMEP(int std_h_subm_EMEP) {
        _std_h_subm_EMEP = std_h_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_h_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_u_subm() {
        return _av_u_subm;
    }

    @Override
    public void setAv_u_subm(float av_u_subm) {
        _av_u_subm = av_u_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_u_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_u_subm_EMEP() {
        return _av_u_subm_EMEP;
    }

    @Override
    public void setAv_u_subm_EMEP(int av_u_subm_EMEP) {
        _av_u_subm_EMEP = av_u_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_u_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_v_subm() {
        return _av_v_subm;
    }

    @Override
    public void setAv_v_subm(float av_v_subm) {
        _av_v_subm = av_v_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_v_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_v_subm_EMEP() {
        return _av_v_subm_EMEP;
    }

    @Override
    public void setAv_v_subm_EMEP(int av_v_subm_EMEP) {
        _av_v_subm_EMEP = av_v_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_v_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_w_subm() {
        return _av_w_subm;
    }

    @Override
    public void setAv_w_subm(float av_w_subm) {
        _av_w_subm = av_w_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_w_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_w_subm_EMEP() {
        return _av_w_subm_EMEP;
    }

    @Override
    public void setAv_w_subm_EMEP(int av_w_subm_EMEP) {
        _av_w_subm_EMEP = av_w_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_w_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_t_subm() {
        return _av_t_subm;
    }

    @Override
    public void setAv_t_subm(float av_t_subm) {
        _av_t_subm = av_t_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_t_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_t_subm_EMEP() {
        return _av_t_subm_EMEP;
    }

    @Override
    public void setAv_t_subm_EMEP(int av_t_subm_EMEP) {
        _av_t_subm_EMEP = av_t_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_t_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c_subm() {
        return _av_c_subm;
    }

    @Override
    public void setAv_c_subm(float av_c_subm) {
        _av_c_subm = av_c_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_c_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_subm_EMEP() {
        return _av_c_subm_EMEP;
    }

    @Override
    public void setAv_c_subm_EMEP(int av_c_subm_EMEP) {
        _av_c_subm_EMEP = av_c_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_c_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h_subm() {
        return _av_h_subm;
    }

    @Override
    public void setAv_h_subm(float av_h_subm) {
        _av_h_subm = av_h_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_h_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_subm_EMEP() {
        return _av_h_subm_EMEP;
    }

    @Override
    public void setAv_h_subm_EMEP(int av_h_subm_EMEP) {
        _av_h_subm_EMEP = av_h_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_h_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_subm() {
        return _U_subm;
    }

    @Override
    public void setU_subm(float U_subm) {
        _U_subm = U_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setU_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, U_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_subm_EMEP() {
        return _U_subm_EMEP;
    }

    @Override
    public void setU_subm_EMEP(int U_subm_EMEP) {
        _U_subm_EMEP = U_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setU_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, U_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWind_dir_subm() {
        return _wind_dir_subm;
    }

    @Override
    public void setWind_dir_subm(float wind_dir_subm) {
        _wind_dir_subm = wind_dir_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, wind_dir_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWind_dir_subm_EMEP() {
        return _wind_dir_subm_EMEP;
    }

    @Override
    public void setWind_dir_subm_EMEP(int wind_dir_subm_EMEP) {
        _wind_dir_subm_EMEP = wind_dir_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, wind_dir_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getEta_subm() {
        return _eta_subm;
    }

    @Override
    public void setEta_subm(float eta_subm) {
        _eta_subm = eta_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, eta_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEta_subm_EMEP() {
        return _eta_subm_EMEP;
    }

    @Override
    public void setEta_subm_EMEP(int eta_subm_EMEP) {
        _eta_subm_EMEP = eta_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, eta_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTheta_subm() {
        return _theta_subm;
    }

    @Override
    public void setTheta_subm(float theta_subm) {
        _theta_subm = theta_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, theta_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTheta_subm_EMEP() {
        return _theta_subm_EMEP;
    }

    @Override
    public void setTheta_subm_EMEP(int theta_subm_EMEP) {
        _theta_subm_EMEP = theta_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, theta_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBeta_subm() {
        return _beta_subm;
    }

    @Override
    public void setBeta_subm(float beta_subm) {
        _beta_subm = beta_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, beta_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeta_subm_EMEP() {
        return _beta_subm_EMEP;
    }

    @Override
    public void setBeta_subm_EMEP(int beta_subm_EMEP) {
        _beta_subm_EMEP = beta_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, beta_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getC_lag_subm() {
        return _c_lag_subm;
    }

    @Override
    public void setC_lag_subm(float c_lag_subm) {
        _c_lag_subm = c_lag_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, c_lag_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC_lag_subm_EMEP() {
        return _c_lag_subm_EMEP;
    }

    @Override
    public void setC_lag_subm_EMEP(int c_lag_subm_EMEP) {
        _c_lag_subm_EMEP = c_lag_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, c_lag_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_lag_subm() {
        return _h_lag_subm;
    }

    @Override
    public void setH_lag_subm(float h_lag_subm) {
        _h_lag_subm = h_lag_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, h_lag_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_lag_subm_EMEP() {
        return _h_lag_subm_EMEP;
    }

    @Override
    public void setH_lag_subm_EMEP(int h_lag_subm_EMEP) {
        _h_lag_subm_EMEP = h_lag_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, h_lag_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getErr_packet_subm() {
        return _err_packet_subm;
    }

    @Override
    public void setErr_packet_subm(float err_packet_subm) {
        _err_packet_subm = err_packet_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_subm",
                        float.class);

                method.invoke(_hyy_eddysubRemoteModel, err_packet_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet_subm_EMEP() {
        return _err_packet_subm_EMEP;
    }

    @Override
    public void setErr_packet_subm_EMEP(int err_packet_subm_EMEP) {
        _err_packet_subm_EMEP = err_packet_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, err_packet_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_std_subm() {
        return _licor_t_std_subm;
    }

    @Override
    public void setLicor_t_std_subm(float licor_t_std_subm) {
        _licor_t_std_subm = licor_t_std_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_subm",
                        float.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_t_std_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_std_subm_EMEP() {
        return _licor_t_std_subm_EMEP;
    }

    @Override
    public void setLicor_t_std_subm_EMEP(int licor_t_std_subm_EMEP) {
        _licor_t_std_subm_EMEP = licor_t_std_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_t_std_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_av_subm() {
        return _licor_t_av_subm;
    }

    @Override
    public void setLicor_t_av_subm(float licor_t_av_subm) {
        _licor_t_av_subm = licor_t_av_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_subm",
                        float.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_t_av_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_av_subm_EMEP() {
        return _licor_t_av_subm_EMEP;
    }

    @Override
    public void setLicor_t_av_subm_EMEP(int licor_t_av_subm_EMEP) {
        _licor_t_av_subm_EMEP = licor_t_av_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_t_av_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_std_subm() {
        return _licor_p_std_subm;
    }

    @Override
    public void setLicor_p_std_subm(float licor_p_std_subm) {
        _licor_p_std_subm = licor_p_std_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_subm",
                        float.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_p_std_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_std_subm_EMEP() {
        return _licor_p_std_subm_EMEP;
    }

    @Override
    public void setLicor_p_std_subm_EMEP(int licor_p_std_subm_EMEP) {
        _licor_p_std_subm_EMEP = licor_p_std_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_p_std_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_av_subm() {
        return _licor_p_av_subm;
    }

    @Override
    public void setLicor_p_av_subm(float licor_p_av_subm) {
        _licor_p_av_subm = licor_p_av_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_subm",
                        float.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_p_av_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_av_subm_EMEP() {
        return _licor_p_av_subm_EMEP;
    }

    @Override
    public void setLicor_p_av_subm_EMEP(int licor_p_av_subm_EMEP) {
        _licor_p_av_subm_EMEP = licor_p_av_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, licor_p_av_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_O3_subm() {
        return _av_O3_subm;
    }

    @Override
    public void setAv_O3_subm(float av_O3_subm) {
        _av_O3_subm = av_O3_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_O3_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, av_O3_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_O3_subm_EMEP() {
        return _av_O3_subm_EMEP;
    }

    @Override
    public void setAv_O3_subm_EMEP(int av_O3_subm_EMEP) {
        _av_O3_subm_EMEP = av_O3_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_O3_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, av_O3_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_O3_subm() {
        return _std_O3_subm;
    }

    @Override
    public void setStd_O3_subm(float std_O3_subm) {
        _std_O3_subm = std_O3_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_O3_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, std_O3_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_O3_subm_EMEP() {
        return _std_O3_subm_EMEP;
    }

    @Override
    public void setStd_O3_subm_EMEP(int std_O3_subm_EMEP) {
        _std_O3_subm_EMEP = std_O3_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_O3_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, std_O3_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_lag_subm() {
        return _O3_lag_subm;
    }

    @Override
    public void setO3_lag_subm(float O3_lag_subm) {
        _O3_lag_subm = O3_lag_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_lag_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, O3_lag_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getO3_lag_subm_EMEP() {
        return _O3_lag_subm_EMEP;
    }

    @Override
    public void setO3_lag_subm_EMEP(int O3_lag_subm_EMEP) {
        _O3_lag_subm_EMEP = O3_lag_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_lag_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, O3_lag_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_O3_subm() {
        return _F_O3_subm;
    }

    @Override
    public void setF_O3_subm(float F_O3_subm) {
        _F_O3_subm = F_O3_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setF_O3_subm", float.class);

                method.invoke(_hyy_eddysubRemoteModel, F_O3_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_O3_subm_EMEP() {
        return _F_O3_subm_EMEP;
    }

    @Override
    public void setF_O3_subm_EMEP(int F_O3_subm_EMEP) {
        _F_O3_subm_EMEP = F_O3_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setF_O3_subm_EMEP", int.class);

                method.invoke(_hyy_eddysubRemoteModel, F_O3_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_O3_subm() {
        return _Qc_F_O3_subm;
    }

    @Override
    public void setQc_F_O3_subm(int Qc_F_O3_subm) {
        _Qc_F_O3_subm = Qc_F_O3_subm;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_O3_subm", int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_F_O3_subm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_O3_subm_EMEP() {
        return _Qc_F_O3_subm_EMEP;
    }

    @Override
    public void setQc_F_O3_subm_EMEP(int Qc_F_O3_subm_EMEP) {
        _Qc_F_O3_subm_EMEP = Qc_F_O3_subm_EMEP;

        if (_hyy_eddysubRemoteModel != null) {
            try {
                Class<?> clazz = _hyy_eddysubRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_O3_subm_EMEP",
                        int.class);

                method.invoke(_hyy_eddysubRemoteModel, Qc_F_O3_subm_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHyy_eddysubRemoteModel() {
        return _hyy_eddysubRemoteModel;
    }

    public void setHyy_eddysubRemoteModel(BaseModel<?> hyy_eddysubRemoteModel) {
        _hyy_eddysubRemoteModel = hyy_eddysubRemoteModel;
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

        Class<?> remoteModelClass = _hyy_eddysubRemoteModel.getClass();

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

        Object returnValue = method.invoke(_hyy_eddysubRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Hyy_eddysubLocalServiceUtil.addHyy_eddysub(this);
        } else {
            Hyy_eddysubLocalServiceUtil.updateHyy_eddysub(this);
        }
    }

    @Override
    public Hyy_eddysub toEscapedModel() {
        return (Hyy_eddysub) ProxyUtil.newProxyInstance(Hyy_eddysub.class.getClassLoader(),
            new Class[] { Hyy_eddysub.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Hyy_eddysubClp clone = new Hyy_eddysubClp();

        clone.setSamptime(getSamptime());
        clone.setH_subm(getH_subm());
        clone.setH_subm_EMEP(getH_subm_EMEP());
        clone.setQc_H_subm(getQc_H_subm());
        clone.setQc_H_subm_EMEP(getQc_H_subm_EMEP());
        clone.setLE_subm(getLE_subm());
        clone.setLE_subm_EMEP(getLE_subm_EMEP());
        clone.setQc_LE_subm(getQc_LE_subm());
        clone.setQc_LE_subm_EMEP(getQc_LE_subm_EMEP());
        clone.setE_subm(getE_subm());
        clone.setE_subm_EMEP(getE_subm_EMEP());
        clone.setQc_E_subm(getQc_E_subm());
        clone.setQc_E_subm_EMEP(getQc_E_subm_EMEP());
        clone.setF_c_subm(getF_c_subm());
        clone.setF_c_subm_EMEP(getF_c_subm_EMEP());
        clone.setQc_F_c_subm(getQc_F_c_subm());
        clone.setQc_F_c_subm_EMEP(getQc_F_c_subm_EMEP());
        clone.setTau_subm(getTau_subm());
        clone.setTau_subm_EMEP(getTau_subm_EMEP());
        clone.setQc_tau_subm(getQc_tau_subm());
        clone.setQc_tau_subm_EMEP(getQc_tau_subm_EMEP());
        clone.setU_star_subm(getU_star_subm());
        clone.setU_star_subm_EMEP(getU_star_subm_EMEP());
        clone.setMO_length_subm(getMO_length_subm());
        clone.setMO_length_subm_EMEP(getMO_length_subm_EMEP());
        clone.setStd_u_subm(getStd_u_subm());
        clone.setStd_u_subm_EMEP(getStd_u_subm_EMEP());
        clone.setStd_v_subm(getStd_v_subm());
        clone.setStd_v_subm_EMEP(getStd_v_subm_EMEP());
        clone.setStd_w_subm(getStd_w_subm());
        clone.setStd_w_subm_EMEP(getStd_w_subm_EMEP());
        clone.setStd_t_subm(getStd_t_subm());
        clone.setStd_t_subm_EMEP(getStd_t_subm_EMEP());
        clone.setStd_c_subm(getStd_c_subm());
        clone.setStd_c_subm_EMEP(getStd_c_subm_EMEP());
        clone.setStd_h_subm(getStd_h_subm());
        clone.setStd_h_subm_EMEP(getStd_h_subm_EMEP());
        clone.setAv_u_subm(getAv_u_subm());
        clone.setAv_u_subm_EMEP(getAv_u_subm_EMEP());
        clone.setAv_v_subm(getAv_v_subm());
        clone.setAv_v_subm_EMEP(getAv_v_subm_EMEP());
        clone.setAv_w_subm(getAv_w_subm());
        clone.setAv_w_subm_EMEP(getAv_w_subm_EMEP());
        clone.setAv_t_subm(getAv_t_subm());
        clone.setAv_t_subm_EMEP(getAv_t_subm_EMEP());
        clone.setAv_c_subm(getAv_c_subm());
        clone.setAv_c_subm_EMEP(getAv_c_subm_EMEP());
        clone.setAv_h_subm(getAv_h_subm());
        clone.setAv_h_subm_EMEP(getAv_h_subm_EMEP());
        clone.setU_subm(getU_subm());
        clone.setU_subm_EMEP(getU_subm_EMEP());
        clone.setWind_dir_subm(getWind_dir_subm());
        clone.setWind_dir_subm_EMEP(getWind_dir_subm_EMEP());
        clone.setEta_subm(getEta_subm());
        clone.setEta_subm_EMEP(getEta_subm_EMEP());
        clone.setTheta_subm(getTheta_subm());
        clone.setTheta_subm_EMEP(getTheta_subm_EMEP());
        clone.setBeta_subm(getBeta_subm());
        clone.setBeta_subm_EMEP(getBeta_subm_EMEP());
        clone.setC_lag_subm(getC_lag_subm());
        clone.setC_lag_subm_EMEP(getC_lag_subm_EMEP());
        clone.setH_lag_subm(getH_lag_subm());
        clone.setH_lag_subm_EMEP(getH_lag_subm_EMEP());
        clone.setErr_packet_subm(getErr_packet_subm());
        clone.setErr_packet_subm_EMEP(getErr_packet_subm_EMEP());
        clone.setLicor_t_std_subm(getLicor_t_std_subm());
        clone.setLicor_t_std_subm_EMEP(getLicor_t_std_subm_EMEP());
        clone.setLicor_t_av_subm(getLicor_t_av_subm());
        clone.setLicor_t_av_subm_EMEP(getLicor_t_av_subm_EMEP());
        clone.setLicor_p_std_subm(getLicor_p_std_subm());
        clone.setLicor_p_std_subm_EMEP(getLicor_p_std_subm_EMEP());
        clone.setLicor_p_av_subm(getLicor_p_av_subm());
        clone.setLicor_p_av_subm_EMEP(getLicor_p_av_subm_EMEP());
        clone.setAv_O3_subm(getAv_O3_subm());
        clone.setAv_O3_subm_EMEP(getAv_O3_subm_EMEP());
        clone.setStd_O3_subm(getStd_O3_subm());
        clone.setStd_O3_subm_EMEP(getStd_O3_subm_EMEP());
        clone.setO3_lag_subm(getO3_lag_subm());
        clone.setO3_lag_subm_EMEP(getO3_lag_subm_EMEP());
        clone.setF_O3_subm(getF_O3_subm());
        clone.setF_O3_subm_EMEP(getF_O3_subm_EMEP());
        clone.setQc_F_O3_subm(getQc_F_O3_subm());
        clone.setQc_F_O3_subm_EMEP(getQc_F_O3_subm_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Hyy_eddysub hyy_eddysub) {
        java.util.Date primaryKey = hyy_eddysub.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Hyy_eddysubClp)) {
            return false;
        }

        Hyy_eddysubClp hyy_eddysub = (Hyy_eddysubClp) obj;

        java.util.Date primaryKey = hyy_eddysub.getPrimaryKey();

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
        StringBundler sb = new StringBundler(167);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", H_subm=");
        sb.append(getH_subm());
        sb.append(", H_subm_EMEP=");
        sb.append(getH_subm_EMEP());
        sb.append(", Qc_H_subm=");
        sb.append(getQc_H_subm());
        sb.append(", Qc_H_subm_EMEP=");
        sb.append(getQc_H_subm_EMEP());
        sb.append(", LE_subm=");
        sb.append(getLE_subm());
        sb.append(", LE_subm_EMEP=");
        sb.append(getLE_subm_EMEP());
        sb.append(", Qc_LE_subm=");
        sb.append(getQc_LE_subm());
        sb.append(", Qc_LE_subm_EMEP=");
        sb.append(getQc_LE_subm_EMEP());
        sb.append(", E_subm=");
        sb.append(getE_subm());
        sb.append(", E_subm_EMEP=");
        sb.append(getE_subm_EMEP());
        sb.append(", Qc_E_subm=");
        sb.append(getQc_E_subm());
        sb.append(", Qc_E_subm_EMEP=");
        sb.append(getQc_E_subm_EMEP());
        sb.append(", F_c_subm=");
        sb.append(getF_c_subm());
        sb.append(", F_c_subm_EMEP=");
        sb.append(getF_c_subm_EMEP());
        sb.append(", Qc_F_c_subm=");
        sb.append(getQc_F_c_subm());
        sb.append(", Qc_F_c_subm_EMEP=");
        sb.append(getQc_F_c_subm_EMEP());
        sb.append(", tau_subm=");
        sb.append(getTau_subm());
        sb.append(", tau_subm_EMEP=");
        sb.append(getTau_subm_EMEP());
        sb.append(", Qc_tau_subm=");
        sb.append(getQc_tau_subm());
        sb.append(", Qc_tau_subm_EMEP=");
        sb.append(getQc_tau_subm_EMEP());
        sb.append(", u_star_subm=");
        sb.append(getU_star_subm());
        sb.append(", u_star_subm_EMEP=");
        sb.append(getU_star_subm_EMEP());
        sb.append(", MO_length_subm=");
        sb.append(getMO_length_subm());
        sb.append(", MO_length_subm_EMEP=");
        sb.append(getMO_length_subm_EMEP());
        sb.append(", std_u_subm=");
        sb.append(getStd_u_subm());
        sb.append(", std_u_subm_EMEP=");
        sb.append(getStd_u_subm_EMEP());
        sb.append(", std_v_subm=");
        sb.append(getStd_v_subm());
        sb.append(", std_v_subm_EMEP=");
        sb.append(getStd_v_subm_EMEP());
        sb.append(", std_w_subm=");
        sb.append(getStd_w_subm());
        sb.append(", std_w_subm_EMEP=");
        sb.append(getStd_w_subm_EMEP());
        sb.append(", std_t_subm=");
        sb.append(getStd_t_subm());
        sb.append(", std_t_subm_EMEP=");
        sb.append(getStd_t_subm_EMEP());
        sb.append(", std_c_subm=");
        sb.append(getStd_c_subm());
        sb.append(", std_c_subm_EMEP=");
        sb.append(getStd_c_subm_EMEP());
        sb.append(", std_h_subm=");
        sb.append(getStd_h_subm());
        sb.append(", std_h_subm_EMEP=");
        sb.append(getStd_h_subm_EMEP());
        sb.append(", av_u_subm=");
        sb.append(getAv_u_subm());
        sb.append(", av_u_subm_EMEP=");
        sb.append(getAv_u_subm_EMEP());
        sb.append(", av_v_subm=");
        sb.append(getAv_v_subm());
        sb.append(", av_v_subm_EMEP=");
        sb.append(getAv_v_subm_EMEP());
        sb.append(", av_w_subm=");
        sb.append(getAv_w_subm());
        sb.append(", av_w_subm_EMEP=");
        sb.append(getAv_w_subm_EMEP());
        sb.append(", av_t_subm=");
        sb.append(getAv_t_subm());
        sb.append(", av_t_subm_EMEP=");
        sb.append(getAv_t_subm_EMEP());
        sb.append(", av_c_subm=");
        sb.append(getAv_c_subm());
        sb.append(", av_c_subm_EMEP=");
        sb.append(getAv_c_subm_EMEP());
        sb.append(", av_h_subm=");
        sb.append(getAv_h_subm());
        sb.append(", av_h_subm_EMEP=");
        sb.append(getAv_h_subm_EMEP());
        sb.append(", U_subm=");
        sb.append(getU_subm());
        sb.append(", U_subm_EMEP=");
        sb.append(getU_subm_EMEP());
        sb.append(", wind_dir_subm=");
        sb.append(getWind_dir_subm());
        sb.append(", wind_dir_subm_EMEP=");
        sb.append(getWind_dir_subm_EMEP());
        sb.append(", eta_subm=");
        sb.append(getEta_subm());
        sb.append(", eta_subm_EMEP=");
        sb.append(getEta_subm_EMEP());
        sb.append(", theta_subm=");
        sb.append(getTheta_subm());
        sb.append(", theta_subm_EMEP=");
        sb.append(getTheta_subm_EMEP());
        sb.append(", beta_subm=");
        sb.append(getBeta_subm());
        sb.append(", beta_subm_EMEP=");
        sb.append(getBeta_subm_EMEP());
        sb.append(", c_lag_subm=");
        sb.append(getC_lag_subm());
        sb.append(", c_lag_subm_EMEP=");
        sb.append(getC_lag_subm_EMEP());
        sb.append(", h_lag_subm=");
        sb.append(getH_lag_subm());
        sb.append(", h_lag_subm_EMEP=");
        sb.append(getH_lag_subm_EMEP());
        sb.append(", err_packet_subm=");
        sb.append(getErr_packet_subm());
        sb.append(", err_packet_subm_EMEP=");
        sb.append(getErr_packet_subm_EMEP());
        sb.append(", licor_t_std_subm=");
        sb.append(getLicor_t_std_subm());
        sb.append(", licor_t_std_subm_EMEP=");
        sb.append(getLicor_t_std_subm_EMEP());
        sb.append(", licor_t_av_subm=");
        sb.append(getLicor_t_av_subm());
        sb.append(", licor_t_av_subm_EMEP=");
        sb.append(getLicor_t_av_subm_EMEP());
        sb.append(", licor_p_std_subm=");
        sb.append(getLicor_p_std_subm());
        sb.append(", licor_p_std_subm_EMEP=");
        sb.append(getLicor_p_std_subm_EMEP());
        sb.append(", licor_p_av_subm=");
        sb.append(getLicor_p_av_subm());
        sb.append(", licor_p_av_subm_EMEP=");
        sb.append(getLicor_p_av_subm_EMEP());
        sb.append(", av_O3_subm=");
        sb.append(getAv_O3_subm());
        sb.append(", av_O3_subm_EMEP=");
        sb.append(getAv_O3_subm_EMEP());
        sb.append(", std_O3_subm=");
        sb.append(getStd_O3_subm());
        sb.append(", std_O3_subm_EMEP=");
        sb.append(getStd_O3_subm_EMEP());
        sb.append(", O3_lag_subm=");
        sb.append(getO3_lag_subm());
        sb.append(", O3_lag_subm_EMEP=");
        sb.append(getO3_lag_subm_EMEP());
        sb.append(", F_O3_subm=");
        sb.append(getF_O3_subm());
        sb.append(", F_O3_subm_EMEP=");
        sb.append(getF_O3_subm_EMEP());
        sb.append(", Qc_F_O3_subm=");
        sb.append(getQc_F_O3_subm());
        sb.append(", Qc_F_O3_subm_EMEP=");
        sb.append(getQc_F_O3_subm_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(253);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Hyy_eddysub");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_subm</column-name><column-value><![CDATA[");
        sb.append(getH_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_H_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_subm</column-name><column-value><![CDATA[");
        sb.append(getLE_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_subm</column-name><column-value><![CDATA[");
        sb.append(getE_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getE_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_E_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_E_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_subm</column-name><column-value><![CDATA[");
        sb.append(getF_c_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_c_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_subm</column-name><column-value><![CDATA[");
        sb.append(getTau_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_subm</column-name><column-value><![CDATA[");
        sb.append(getU_star_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_star_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_subm</column-name><column-value><![CDATA[");
        sb.append(getMO_length_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getMO_length_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_u_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_u_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_v_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_v_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_w_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_w_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_t_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_t_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_c_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_h_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_u_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_u_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_v_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_v_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_w_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_w_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_t_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_t_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_c_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_h_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_subm</column-name><column-value><![CDATA[");
        sb.append(getU_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_subm</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_subm</column-name><column-value><![CDATA[");
        sb.append(getEta_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getEta_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_subm</column-name><column-value><![CDATA[");
        sb.append(getTheta_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTheta_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_subm</column-name><column-value><![CDATA[");
        sb.append(getBeta_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getBeta_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_subm</column-name><column-value><![CDATA[");
        sb.append(getC_lag_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getC_lag_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_subm</column-name><column-value><![CDATA[");
        sb.append(getH_lag_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_lag_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_subm</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std_subm</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av_subm</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_subm</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_subm</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_O3_subm</column-name><column-value><![CDATA[");
        sb.append(getAv_O3_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_O3_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_O3_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_O3_subm</column-name><column-value><![CDATA[");
        sb.append(getStd_O3_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_O3_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_O3_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_lag_subm</column-name><column-value><![CDATA[");
        sb.append(getO3_lag_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_lag_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getO3_lag_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_O3_subm</column-name><column-value><![CDATA[");
        sb.append(getF_O3_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_O3_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_O3_subm_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_O3_subm</column-name><column-value><![CDATA[");
        sb.append(getQc_F_O3_subm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_O3_subm_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_O3_subm_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
