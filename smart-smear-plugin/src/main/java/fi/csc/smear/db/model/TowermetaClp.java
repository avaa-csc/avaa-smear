package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.TowermetaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class TowermetaClp extends BaseModelImpl<Towermeta> implements Towermeta {
    private Date _samptime;
    private float _H;
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
    private BaseModel<?> _towermetaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public TowermetaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Towermeta.class;
    }

    @Override
    public String getModelClassName() {
        return Towermeta.class.getName();
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
        attributes.put("H", getH());
        attributes.put("H_EMEP", getH_EMEP());
        attributes.put("Qc_H", getQc_H());
        attributes.put("Qc_H_EMEP", getQc_H_EMEP());
        attributes.put("LE", getLE());
        attributes.put("LE_EMEP", getLE_EMEP());
        attributes.put("Qc_LE", getQc_LE());
        attributes.put("Qc_LE_EMEP", getQc_LE_EMEP());
        attributes.put("E", getE());
        attributes.put("E_EMEP", getE_EMEP());
        attributes.put("Qc_E", getQc_E());
        attributes.put("Qc_E_EMEP", getQc_E_EMEP());
        attributes.put("F_c", getF_c());
        attributes.put("F_c_EMEP", getF_c_EMEP());
        attributes.put("Qc_F_c", getQc_F_c());
        attributes.put("Qc_F_c_EMEP", getQc_F_c_EMEP());
        attributes.put("tau", getTau());
        attributes.put("tau_EMEP", getTau_EMEP());
        attributes.put("Qc_tau", getQc_tau());
        attributes.put("Qc_tau_EMEP", getQc_tau_EMEP());
        attributes.put("u_star", getU_star());
        attributes.put("u_star_EMEP", getU_star_EMEP());
        attributes.put("MO_length", getMO_length());
        attributes.put("MO_length_EMEP", getMO_length_EMEP());
        attributes.put("std_u", getStd_u());
        attributes.put("std_u_EMEP", getStd_u_EMEP());
        attributes.put("std_v", getStd_v());
        attributes.put("std_v_EMEP", getStd_v_EMEP());
        attributes.put("std_w", getStd_w());
        attributes.put("std_w_EMEP", getStd_w_EMEP());
        attributes.put("std_t", getStd_t());
        attributes.put("std_t_EMEP", getStd_t_EMEP());
        attributes.put("std_c", getStd_c());
        attributes.put("std_c_EMEP", getStd_c_EMEP());
        attributes.put("std_h", getStd_h());
        attributes.put("std_h_EMEP", getStd_h_EMEP());
        attributes.put("av_u", getAv_u());
        attributes.put("av_u_EMEP", getAv_u_EMEP());
        attributes.put("av_v", getAv_v());
        attributes.put("av_v_EMEP", getAv_v_EMEP());
        attributes.put("av_w", getAv_w());
        attributes.put("av_w_EMEP", getAv_w_EMEP());
        attributes.put("av_t", getAv_t());
        attributes.put("av_t_EMEP", getAv_t_EMEP());
        attributes.put("av_c", getAv_c());
        attributes.put("av_c_EMEP", getAv_c_EMEP());
        attributes.put("av_h", getAv_h());
        attributes.put("av_h_EMEP", getAv_h_EMEP());
        attributes.put("U", getU());
        attributes.put("U_EMEP", getU_EMEP());
        attributes.put("wind_dir", getWind_dir());
        attributes.put("wind_dir_EMEP", getWind_dir_EMEP());
        attributes.put("eta", getEta());
        attributes.put("eta_EMEP", getEta_EMEP());
        attributes.put("theta", getTheta());
        attributes.put("theta_EMEP", getTheta_EMEP());
        attributes.put("beta", getBeta());
        attributes.put("beta_EMEP", getBeta_EMEP());
        attributes.put("c_lag", getC_lag());
        attributes.put("c_lag_EMEP", getC_lag_EMEP());
        attributes.put("h_lag", getH_lag());
        attributes.put("h_lag_EMEP", getH_lag_EMEP());
        attributes.put("err_packet", getErr_packet());
        attributes.put("err_packet_EMEP", getErr_packet_EMEP());
        attributes.put("licor_t_std", getLicor_t_std());
        attributes.put("licor_t_std_EMEP", getLicor_t_std_EMEP());
        attributes.put("licor_t_av", getLicor_t_av());
        attributes.put("licor_t_av_EMEP", getLicor_t_av_EMEP());
        attributes.put("licor_p_std", getLicor_p_std());
        attributes.put("licor_p_std_EMEP", getLicor_p_std_EMEP());
        attributes.put("licor_p_av", getLicor_p_av());
        attributes.put("licor_p_av_EMEP", getLicor_p_av_EMEP());
        attributes.put("F_CPC", getF_CPC());
        attributes.put("F_CPC_EMEP", getF_CPC_EMEP());
        attributes.put("Qc_F_CPC", getQc_F_CPC());
        attributes.put("Qc_F_CPC_EMEP", getQc_F_CPC_EMEP());
        attributes.put("std_CPC", getStd_CPC());
        attributes.put("std_CPC_EMEP", getStd_CPC_EMEP());
        attributes.put("av_CPC", getAv_CPC());
        attributes.put("av_CPC_EMEP", getAv_CPC_EMEP());
        attributes.put("CPC_lag", getCPC_lag());
        attributes.put("CPC_lag_EMEP", getCPC_lag_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float H = (Float) attributes.get("H");

        if (H != null) {
            setH(H);
        }

        Integer H_EMEP = (Integer) attributes.get("H_EMEP");

        if (H_EMEP != null) {
            setH_EMEP(H_EMEP);
        }

        Integer Qc_H = (Integer) attributes.get("Qc_H");

        if (Qc_H != null) {
            setQc_H(Qc_H);
        }

        Integer Qc_H_EMEP = (Integer) attributes.get("Qc_H_EMEP");

        if (Qc_H_EMEP != null) {
            setQc_H_EMEP(Qc_H_EMEP);
        }

        Float LE = (Float) attributes.get("LE");

        if (LE != null) {
            setLE(LE);
        }

        Integer LE_EMEP = (Integer) attributes.get("LE_EMEP");

        if (LE_EMEP != null) {
            setLE_EMEP(LE_EMEP);
        }

        Integer Qc_LE = (Integer) attributes.get("Qc_LE");

        if (Qc_LE != null) {
            setQc_LE(Qc_LE);
        }

        Integer Qc_LE_EMEP = (Integer) attributes.get("Qc_LE_EMEP");

        if (Qc_LE_EMEP != null) {
            setQc_LE_EMEP(Qc_LE_EMEP);
        }

        Float E = (Float) attributes.get("E");

        if (E != null) {
            setE(E);
        }

        Integer E_EMEP = (Integer) attributes.get("E_EMEP");

        if (E_EMEP != null) {
            setE_EMEP(E_EMEP);
        }

        Integer Qc_E = (Integer) attributes.get("Qc_E");

        if (Qc_E != null) {
            setQc_E(Qc_E);
        }

        Integer Qc_E_EMEP = (Integer) attributes.get("Qc_E_EMEP");

        if (Qc_E_EMEP != null) {
            setQc_E_EMEP(Qc_E_EMEP);
        }

        Float F_c = (Float) attributes.get("F_c");

        if (F_c != null) {
            setF_c(F_c);
        }

        Integer F_c_EMEP = (Integer) attributes.get("F_c_EMEP");

        if (F_c_EMEP != null) {
            setF_c_EMEP(F_c_EMEP);
        }

        Integer Qc_F_c = (Integer) attributes.get("Qc_F_c");

        if (Qc_F_c != null) {
            setQc_F_c(Qc_F_c);
        }

        Integer Qc_F_c_EMEP = (Integer) attributes.get("Qc_F_c_EMEP");

        if (Qc_F_c_EMEP != null) {
            setQc_F_c_EMEP(Qc_F_c_EMEP);
        }

        Float tau = (Float) attributes.get("tau");

        if (tau != null) {
            setTau(tau);
        }

        Integer tau_EMEP = (Integer) attributes.get("tau_EMEP");

        if (tau_EMEP != null) {
            setTau_EMEP(tau_EMEP);
        }

        Integer Qc_tau = (Integer) attributes.get("Qc_tau");

        if (Qc_tau != null) {
            setQc_tau(Qc_tau);
        }

        Integer Qc_tau_EMEP = (Integer) attributes.get("Qc_tau_EMEP");

        if (Qc_tau_EMEP != null) {
            setQc_tau_EMEP(Qc_tau_EMEP);
        }

        Float u_star = (Float) attributes.get("u_star");

        if (u_star != null) {
            setU_star(u_star);
        }

        Integer u_star_EMEP = (Integer) attributes.get("u_star_EMEP");

        if (u_star_EMEP != null) {
            setU_star_EMEP(u_star_EMEP);
        }

        Float MO_length = (Float) attributes.get("MO_length");

        if (MO_length != null) {
            setMO_length(MO_length);
        }

        Integer MO_length_EMEP = (Integer) attributes.get("MO_length_EMEP");

        if (MO_length_EMEP != null) {
            setMO_length_EMEP(MO_length_EMEP);
        }

        Float std_u = (Float) attributes.get("std_u");

        if (std_u != null) {
            setStd_u(std_u);
        }

        Integer std_u_EMEP = (Integer) attributes.get("std_u_EMEP");

        if (std_u_EMEP != null) {
            setStd_u_EMEP(std_u_EMEP);
        }

        Float std_v = (Float) attributes.get("std_v");

        if (std_v != null) {
            setStd_v(std_v);
        }

        Integer std_v_EMEP = (Integer) attributes.get("std_v_EMEP");

        if (std_v_EMEP != null) {
            setStd_v_EMEP(std_v_EMEP);
        }

        Float std_w = (Float) attributes.get("std_w");

        if (std_w != null) {
            setStd_w(std_w);
        }

        Integer std_w_EMEP = (Integer) attributes.get("std_w_EMEP");

        if (std_w_EMEP != null) {
            setStd_w_EMEP(std_w_EMEP);
        }

        Float std_t = (Float) attributes.get("std_t");

        if (std_t != null) {
            setStd_t(std_t);
        }

        Integer std_t_EMEP = (Integer) attributes.get("std_t_EMEP");

        if (std_t_EMEP != null) {
            setStd_t_EMEP(std_t_EMEP);
        }

        Float std_c = (Float) attributes.get("std_c");

        if (std_c != null) {
            setStd_c(std_c);
        }

        Integer std_c_EMEP = (Integer) attributes.get("std_c_EMEP");

        if (std_c_EMEP != null) {
            setStd_c_EMEP(std_c_EMEP);
        }

        Float std_h = (Float) attributes.get("std_h");

        if (std_h != null) {
            setStd_h(std_h);
        }

        Integer std_h_EMEP = (Integer) attributes.get("std_h_EMEP");

        if (std_h_EMEP != null) {
            setStd_h_EMEP(std_h_EMEP);
        }

        Float av_u = (Float) attributes.get("av_u");

        if (av_u != null) {
            setAv_u(av_u);
        }

        Integer av_u_EMEP = (Integer) attributes.get("av_u_EMEP");

        if (av_u_EMEP != null) {
            setAv_u_EMEP(av_u_EMEP);
        }

        Float av_v = (Float) attributes.get("av_v");

        if (av_v != null) {
            setAv_v(av_v);
        }

        Integer av_v_EMEP = (Integer) attributes.get("av_v_EMEP");

        if (av_v_EMEP != null) {
            setAv_v_EMEP(av_v_EMEP);
        }

        Float av_w = (Float) attributes.get("av_w");

        if (av_w != null) {
            setAv_w(av_w);
        }

        Integer av_w_EMEP = (Integer) attributes.get("av_w_EMEP");

        if (av_w_EMEP != null) {
            setAv_w_EMEP(av_w_EMEP);
        }

        Float av_t = (Float) attributes.get("av_t");

        if (av_t != null) {
            setAv_t(av_t);
        }

        Integer av_t_EMEP = (Integer) attributes.get("av_t_EMEP");

        if (av_t_EMEP != null) {
            setAv_t_EMEP(av_t_EMEP);
        }

        Float av_c = (Float) attributes.get("av_c");

        if (av_c != null) {
            setAv_c(av_c);
        }

        Integer av_c_EMEP = (Integer) attributes.get("av_c_EMEP");

        if (av_c_EMEP != null) {
            setAv_c_EMEP(av_c_EMEP);
        }

        Float av_h = (Float) attributes.get("av_h");

        if (av_h != null) {
            setAv_h(av_h);
        }

        Integer av_h_EMEP = (Integer) attributes.get("av_h_EMEP");

        if (av_h_EMEP != null) {
            setAv_h_EMEP(av_h_EMEP);
        }

        Float U = (Float) attributes.get("U");

        if (U != null) {
            setU(U);
        }

        Integer U_EMEP = (Integer) attributes.get("U_EMEP");

        if (U_EMEP != null) {
            setU_EMEP(U_EMEP);
        }

        Float wind_dir = (Float) attributes.get("wind_dir");

        if (wind_dir != null) {
            setWind_dir(wind_dir);
        }

        Integer wind_dir_EMEP = (Integer) attributes.get("wind_dir_EMEP");

        if (wind_dir_EMEP != null) {
            setWind_dir_EMEP(wind_dir_EMEP);
        }

        Float eta = (Float) attributes.get("eta");

        if (eta != null) {
            setEta(eta);
        }

        Integer eta_EMEP = (Integer) attributes.get("eta_EMEP");

        if (eta_EMEP != null) {
            setEta_EMEP(eta_EMEP);
        }

        Float theta = (Float) attributes.get("theta");

        if (theta != null) {
            setTheta(theta);
        }

        Integer theta_EMEP = (Integer) attributes.get("theta_EMEP");

        if (theta_EMEP != null) {
            setTheta_EMEP(theta_EMEP);
        }

        Float beta = (Float) attributes.get("beta");

        if (beta != null) {
            setBeta(beta);
        }

        Integer beta_EMEP = (Integer) attributes.get("beta_EMEP");

        if (beta_EMEP != null) {
            setBeta_EMEP(beta_EMEP);
        }

        Float c_lag = (Float) attributes.get("c_lag");

        if (c_lag != null) {
            setC_lag(c_lag);
        }

        Integer c_lag_EMEP = (Integer) attributes.get("c_lag_EMEP");

        if (c_lag_EMEP != null) {
            setC_lag_EMEP(c_lag_EMEP);
        }

        Float h_lag = (Float) attributes.get("h_lag");

        if (h_lag != null) {
            setH_lag(h_lag);
        }

        Integer h_lag_EMEP = (Integer) attributes.get("h_lag_EMEP");

        if (h_lag_EMEP != null) {
            setH_lag_EMEP(h_lag_EMEP);
        }

        Float err_packet = (Float) attributes.get("err_packet");

        if (err_packet != null) {
            setErr_packet(err_packet);
        }

        Integer err_packet_EMEP = (Integer) attributes.get("err_packet_EMEP");

        if (err_packet_EMEP != null) {
            setErr_packet_EMEP(err_packet_EMEP);
        }

        Float licor_t_std = (Float) attributes.get("licor_t_std");

        if (licor_t_std != null) {
            setLicor_t_std(licor_t_std);
        }

        Integer licor_t_std_EMEP = (Integer) attributes.get("licor_t_std_EMEP");

        if (licor_t_std_EMEP != null) {
            setLicor_t_std_EMEP(licor_t_std_EMEP);
        }

        Float licor_t_av = (Float) attributes.get("licor_t_av");

        if (licor_t_av != null) {
            setLicor_t_av(licor_t_av);
        }

        Integer licor_t_av_EMEP = (Integer) attributes.get("licor_t_av_EMEP");

        if (licor_t_av_EMEP != null) {
            setLicor_t_av_EMEP(licor_t_av_EMEP);
        }

        Float licor_p_std = (Float) attributes.get("licor_p_std");

        if (licor_p_std != null) {
            setLicor_p_std(licor_p_std);
        }

        Integer licor_p_std_EMEP = (Integer) attributes.get("licor_p_std_EMEP");

        if (licor_p_std_EMEP != null) {
            setLicor_p_std_EMEP(licor_p_std_EMEP);
        }

        Float licor_p_av = (Float) attributes.get("licor_p_av");

        if (licor_p_av != null) {
            setLicor_p_av(licor_p_av);
        }

        Integer licor_p_av_EMEP = (Integer) attributes.get("licor_p_av_EMEP");

        if (licor_p_av_EMEP != null) {
            setLicor_p_av_EMEP(licor_p_av_EMEP);
        }

        Float F_CPC = (Float) attributes.get("F_CPC");

        if (F_CPC != null) {
            setF_CPC(F_CPC);
        }

        Integer F_CPC_EMEP = (Integer) attributes.get("F_CPC_EMEP");

        if (F_CPC_EMEP != null) {
            setF_CPC_EMEP(F_CPC_EMEP);
        }

        Integer Qc_F_CPC = (Integer) attributes.get("Qc_F_CPC");

        if (Qc_F_CPC != null) {
            setQc_F_CPC(Qc_F_CPC);
        }

        Integer Qc_F_CPC_EMEP = (Integer) attributes.get("Qc_F_CPC_EMEP");

        if (Qc_F_CPC_EMEP != null) {
            setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
        }

        Float std_CPC = (Float) attributes.get("std_CPC");

        if (std_CPC != null) {
            setStd_CPC(std_CPC);
        }

        Integer std_CPC_EMEP = (Integer) attributes.get("std_CPC_EMEP");

        if (std_CPC_EMEP != null) {
            setStd_CPC_EMEP(std_CPC_EMEP);
        }

        Float av_CPC = (Float) attributes.get("av_CPC");

        if (av_CPC != null) {
            setAv_CPC(av_CPC);
        }

        Integer av_CPC_EMEP = (Integer) attributes.get("av_CPC_EMEP");

        if (av_CPC_EMEP != null) {
            setAv_CPC_EMEP(av_CPC_EMEP);
        }

        Float CPC_lag = (Float) attributes.get("CPC_lag");

        if (CPC_lag != null) {
            setCPC_lag(CPC_lag);
        }

        Integer CPC_lag_EMEP = (Integer) attributes.get("CPC_lag_EMEP");

        if (CPC_lag_EMEP != null) {
            setCPC_lag_EMEP(CPC_lag_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_towermetaRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH() {
        return _H;
    }

    @Override
    public void setH(float H) {
        _H = H;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH", float.class);

                method.invoke(_towermetaRemoteModel, H);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_EMEP() {
        return _H_EMEP;
    }

    @Override
    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, H_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H() {
        return _Qc_H;
    }

    @Override
    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H", int.class);

                method.invoke(_towermetaRemoteModel, Qc_H);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_H_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE() {
        return _LE;
    }

    @Override
    public void setLE(float LE) {
        _LE = LE;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLE", float.class);

                method.invoke(_towermetaRemoteModel, LE);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_EMEP() {
        return _LE_EMEP;
    }

    @Override
    public void setLE_EMEP(int LE_EMEP) {
        _LE_EMEP = LE_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, LE_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE() {
        return _Qc_LE;
    }

    @Override
    public void setQc_LE(int Qc_LE) {
        _Qc_LE = Qc_LE;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE", int.class);

                method.invoke(_towermetaRemoteModel, Qc_LE);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_EMEP() {
        return _Qc_LE_EMEP;
    }

    @Override
    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _Qc_LE_EMEP = Qc_LE_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_LE_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getE() {
        return _E;
    }

    @Override
    public void setE(float E) {
        _E = E;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setE", float.class);

                method.invoke(_towermetaRemoteModel, E);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getE_EMEP() {
        return _E_EMEP;
    }

    @Override
    public void setE_EMEP(int E_EMEP) {
        _E_EMEP = E_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setE_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, E_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E() {
        return _Qc_E;
    }

    @Override
    public void setQc_E(int Qc_E) {
        _Qc_E = Qc_E;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E", int.class);

                method.invoke(_towermetaRemoteModel, Qc_E);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_E_EMEP() {
        return _Qc_E_EMEP;
    }

    @Override
    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _Qc_E_EMEP = Qc_E_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_E_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_E_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_c() {
        return _F_c;
    }

    @Override
    public void setF_c(float F_c) {
        _F_c = F_c;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c", float.class);

                method.invoke(_towermetaRemoteModel, F_c);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_c_EMEP() {
        return _F_c_EMEP;
    }

    @Override
    public void setF_c_EMEP(int F_c_EMEP) {
        _F_c_EMEP = F_c_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, F_c_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c() {
        return _Qc_F_c;
    }

    @Override
    public void setQc_F_c(int Qc_F_c) {
        _Qc_F_c = Qc_F_c;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c", int.class);

                method.invoke(_towermetaRemoteModel, Qc_F_c);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_c_EMEP() {
        return _Qc_F_c_EMEP;
    }

    @Override
    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _Qc_F_c_EMEP = Qc_F_c_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_c_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_F_c_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTau() {
        return _tau;
    }

    @Override
    public void setTau(float tau) {
        _tau = tau;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTau", float.class);

                method.invoke(_towermetaRemoteModel, tau);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTau_EMEP() {
        return _tau_EMEP;
    }

    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _tau_EMEP = tau_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, tau_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau() {
        return _Qc_tau;
    }

    @Override
    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau", int.class);

                method.invoke(_towermetaRemoteModel, Qc_tau);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_tau_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_star() {
        return _u_star;
    }

    @Override
    public void setU_star(float u_star) {
        _u_star = u_star;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star", float.class);

                method.invoke(_towermetaRemoteModel, u_star);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_star_EMEP() {
        return _u_star_EMEP;
    }

    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _u_star_EMEP = u_star_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, u_star_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMO_length() {
        return _MO_length;
    }

    @Override
    public void setMO_length(float MO_length) {
        _MO_length = MO_length;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length", float.class);

                method.invoke(_towermetaRemoteModel, MO_length);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMO_length_EMEP() {
        return _MO_length_EMEP;
    }

    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _MO_length_EMEP = MO_length_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, MO_length_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_u() {
        return _std_u;
    }

    @Override
    public void setStd_u(float std_u) {
        _std_u = std_u;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u", float.class);

                method.invoke(_towermetaRemoteModel, std_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_u_EMEP() {
        return _std_u_EMEP;
    }

    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _std_u_EMEP = std_u_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_v() {
        return _std_v;
    }

    @Override
    public void setStd_v(float std_v) {
        _std_v = std_v;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v", float.class);

                method.invoke(_towermetaRemoteModel, std_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_v_EMEP() {
        return _std_v_EMEP;
    }

    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _std_v_EMEP = std_v_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_w() {
        return _std_w;
    }

    @Override
    public void setStd_w(float std_w) {
        _std_w = std_w;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w", float.class);

                method.invoke(_towermetaRemoteModel, std_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_w_EMEP() {
        return _std_w_EMEP;
    }

    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _std_w_EMEP = std_w_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_t() {
        return _std_t;
    }

    @Override
    public void setStd_t(float std_t) {
        _std_t = std_t;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t", float.class);

                method.invoke(_towermetaRemoteModel, std_t);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_t_EMEP() {
        return _std_t_EMEP;
    }

    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _std_t_EMEP = std_t_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_t_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c() {
        return _std_c;
    }

    @Override
    public void setStd_c(float std_c) {
        _std_c = std_c;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c", float.class);

                method.invoke(_towermetaRemoteModel, std_c);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_EMEP() {
        return _std_c_EMEP;
    }

    @Override
    public void setStd_c_EMEP(int std_c_EMEP) {
        _std_c_EMEP = std_c_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_c_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h() {
        return _std_h;
    }

    @Override
    public void setStd_h(float std_h) {
        _std_h = std_h;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h", float.class);

                method.invoke(_towermetaRemoteModel, std_h);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_EMEP() {
        return _std_h_EMEP;
    }

    @Override
    public void setStd_h_EMEP(int std_h_EMEP) {
        _std_h_EMEP = std_h_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_h_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_u() {
        return _av_u;
    }

    @Override
    public void setAv_u(float av_u) {
        _av_u = av_u;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u", float.class);

                method.invoke(_towermetaRemoteModel, av_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_u_EMEP() {
        return _av_u_EMEP;
    }

    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _av_u_EMEP = av_u_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_v() {
        return _av_v;
    }

    @Override
    public void setAv_v(float av_v) {
        _av_v = av_v;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v", float.class);

                method.invoke(_towermetaRemoteModel, av_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_v_EMEP() {
        return _av_v_EMEP;
    }

    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _av_v_EMEP = av_v_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_w() {
        return _av_w;
    }

    @Override
    public void setAv_w(float av_w) {
        _av_w = av_w;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w", float.class);

                method.invoke(_towermetaRemoteModel, av_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_w_EMEP() {
        return _av_w_EMEP;
    }

    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _av_w_EMEP = av_w_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_t() {
        return _av_t;
    }

    @Override
    public void setAv_t(float av_t) {
        _av_t = av_t;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t", float.class);

                method.invoke(_towermetaRemoteModel, av_t);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_t_EMEP() {
        return _av_t_EMEP;
    }

    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _av_t_EMEP = av_t_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_t_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c() {
        return _av_c;
    }

    @Override
    public void setAv_c(float av_c) {
        _av_c = av_c;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c", float.class);

                method.invoke(_towermetaRemoteModel, av_c);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_EMEP() {
        return _av_c_EMEP;
    }

    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _av_c_EMEP = av_c_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_c_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h() {
        return _av_h;
    }

    @Override
    public void setAv_h(float av_h) {
        _av_h = av_h;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h", float.class);

                method.invoke(_towermetaRemoteModel, av_h);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_EMEP() {
        return _av_h_EMEP;
    }

    @Override
    public void setAv_h_EMEP(int av_h_EMEP) {
        _av_h_EMEP = av_h_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_h_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU() {
        return _U;
    }

    @Override
    public void setU(float U) {
        _U = U;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setU", float.class);

                method.invoke(_towermetaRemoteModel, U);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_EMEP() {
        return _U_EMEP;
    }

    @Override
    public void setU_EMEP(int U_EMEP) {
        _U_EMEP = U_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setU_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, U_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWind_dir() {
        return _wind_dir;
    }

    @Override
    public void setWind_dir(float wind_dir) {
        _wind_dir = wind_dir;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir", float.class);

                method.invoke(_towermetaRemoteModel, wind_dir);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWind_dir_EMEP() {
        return _wind_dir_EMEP;
    }

    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _wind_dir_EMEP = wind_dir_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, wind_dir_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getEta() {
        return _eta;
    }

    @Override
    public void setEta(float eta) {
        _eta = eta;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setEta", float.class);

                method.invoke(_towermetaRemoteModel, eta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, eta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTheta() {
        return _theta;
    }

    @Override
    public void setTheta(float theta) {
        _theta = theta;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta", float.class);

                method.invoke(_towermetaRemoteModel, theta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, theta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBeta() {
        return _beta;
    }

    @Override
    public void setBeta(float beta) {
        _beta = beta;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta", float.class);

                method.invoke(_towermetaRemoteModel, beta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, beta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getC_lag() {
        return _c_lag;
    }

    @Override
    public void setC_lag(float c_lag) {
        _c_lag = c_lag;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag", float.class);

                method.invoke(_towermetaRemoteModel, c_lag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC_lag_EMEP() {
        return _c_lag_EMEP;
    }

    @Override
    public void setC_lag_EMEP(int c_lag_EMEP) {
        _c_lag_EMEP = c_lag_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, c_lag_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_lag() {
        return _h_lag;
    }

    @Override
    public void setH_lag(float h_lag) {
        _h_lag = h_lag;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag", float.class);

                method.invoke(_towermetaRemoteModel, h_lag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_lag_EMEP() {
        return _h_lag_EMEP;
    }

    @Override
    public void setH_lag_EMEP(int h_lag_EMEP) {
        _h_lag_EMEP = h_lag_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, h_lag_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getErr_packet() {
        return _err_packet;
    }

    @Override
    public void setErr_packet(float err_packet) {
        _err_packet = err_packet;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet", float.class);

                method.invoke(_towermetaRemoteModel, err_packet);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, err_packet_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_std() {
        return _licor_t_std;
    }

    @Override
    public void setLicor_t_std(float licor_t_std) {
        _licor_t_std = licor_t_std;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std", float.class);

                method.invoke(_towermetaRemoteModel, licor_t_std);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_std_EMEP() {
        return _licor_t_std_EMEP;
    }

    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _licor_t_std_EMEP = licor_t_std_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, licor_t_std_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_t_av() {
        return _licor_t_av;
    }

    @Override
    public void setLicor_t_av(float licor_t_av) {
        _licor_t_av = licor_t_av;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av", float.class);

                method.invoke(_towermetaRemoteModel, licor_t_av);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_t_av_EMEP() {
        return _licor_t_av_EMEP;
    }

    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _licor_t_av_EMEP = licor_t_av_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, licor_t_av_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_std() {
        return _licor_p_std;
    }

    @Override
    public void setLicor_p_std(float licor_p_std) {
        _licor_p_std = licor_p_std;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std", float.class);

                method.invoke(_towermetaRemoteModel, licor_p_std);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_std_EMEP() {
        return _licor_p_std_EMEP;
    }

    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _licor_p_std_EMEP = licor_p_std_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, licor_p_std_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLicor_p_av() {
        return _licor_p_av;
    }

    @Override
    public void setLicor_p_av(float licor_p_av) {
        _licor_p_av = licor_p_av;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av", float.class);

                method.invoke(_towermetaRemoteModel, licor_p_av);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLicor_p_av_EMEP() {
        return _licor_p_av_EMEP;
    }

    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _licor_p_av_EMEP = licor_p_av_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, licor_p_av_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CPC() {
        return _F_CPC;
    }

    @Override
    public void setF_CPC(float F_CPC) {
        _F_CPC = F_CPC;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CPC", float.class);

                method.invoke(_towermetaRemoteModel, F_CPC);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CPC_EMEP() {
        return _F_CPC_EMEP;
    }

    @Override
    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _F_CPC_EMEP = F_CPC_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CPC_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, F_CPC_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_CPC() {
        return _Qc_F_CPC;
    }

    @Override
    public void setQc_F_CPC(int Qc_F_CPC) {
        _Qc_F_CPC = Qc_F_CPC;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_CPC", int.class);

                method.invoke(_towermetaRemoteModel, Qc_F_CPC);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_F_CPC_EMEP() {
        return _Qc_F_CPC_EMEP;
    }

    @Override
    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _Qc_F_CPC_EMEP = Qc_F_CPC_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_F_CPC_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, Qc_F_CPC_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_CPC() {
        return _std_CPC;
    }

    @Override
    public void setStd_CPC(float std_CPC) {
        _std_CPC = std_CPC;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CPC", float.class);

                method.invoke(_towermetaRemoteModel, std_CPC);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_CPC_EMEP() {
        return _std_CPC_EMEP;
    }

    @Override
    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _std_CPC_EMEP = std_CPC_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CPC_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, std_CPC_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_CPC() {
        return _av_CPC;
    }

    @Override
    public void setAv_CPC(float av_CPC) {
        _av_CPC = av_CPC;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CPC", float.class);

                method.invoke(_towermetaRemoteModel, av_CPC);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_CPC_EMEP() {
        return _av_CPC_EMEP;
    }

    @Override
    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _av_CPC_EMEP = av_CPC_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CPC_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, av_CPC_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCPC_lag() {
        return _CPC_lag;
    }

    @Override
    public void setCPC_lag(float CPC_lag) {
        _CPC_lag = CPC_lag;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCPC_lag", float.class);

                method.invoke(_towermetaRemoteModel, CPC_lag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCPC_lag_EMEP() {
        return _CPC_lag_EMEP;
    }

    @Override
    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _CPC_lag_EMEP = CPC_lag_EMEP;

        if (_towermetaRemoteModel != null) {
            try {
                Class<?> clazz = _towermetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCPC_lag_EMEP", int.class);

                method.invoke(_towermetaRemoteModel, CPC_lag_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTowermetaRemoteModel() {
        return _towermetaRemoteModel;
    }

    public void setTowermetaRemoteModel(BaseModel<?> towermetaRemoteModel) {
        _towermetaRemoteModel = towermetaRemoteModel;
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

        Class<?> remoteModelClass = _towermetaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_towermetaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TowermetaLocalServiceUtil.addTowermeta(this);
        } else {
            TowermetaLocalServiceUtil.updateTowermeta(this);
        }
    }

    @Override
    public Towermeta toEscapedModel() {
        return (Towermeta) ProxyUtil.newProxyInstance(Towermeta.class.getClassLoader(),
            new Class[] { Towermeta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TowermetaClp clone = new TowermetaClp();

        clone.setSamptime(getSamptime());
        clone.setH(getH());
        clone.setH_EMEP(getH_EMEP());
        clone.setQc_H(getQc_H());
        clone.setQc_H_EMEP(getQc_H_EMEP());
        clone.setLE(getLE());
        clone.setLE_EMEP(getLE_EMEP());
        clone.setQc_LE(getQc_LE());
        clone.setQc_LE_EMEP(getQc_LE_EMEP());
        clone.setE(getE());
        clone.setE_EMEP(getE_EMEP());
        clone.setQc_E(getQc_E());
        clone.setQc_E_EMEP(getQc_E_EMEP());
        clone.setF_c(getF_c());
        clone.setF_c_EMEP(getF_c_EMEP());
        clone.setQc_F_c(getQc_F_c());
        clone.setQc_F_c_EMEP(getQc_F_c_EMEP());
        clone.setTau(getTau());
        clone.setTau_EMEP(getTau_EMEP());
        clone.setQc_tau(getQc_tau());
        clone.setQc_tau_EMEP(getQc_tau_EMEP());
        clone.setU_star(getU_star());
        clone.setU_star_EMEP(getU_star_EMEP());
        clone.setMO_length(getMO_length());
        clone.setMO_length_EMEP(getMO_length_EMEP());
        clone.setStd_u(getStd_u());
        clone.setStd_u_EMEP(getStd_u_EMEP());
        clone.setStd_v(getStd_v());
        clone.setStd_v_EMEP(getStd_v_EMEP());
        clone.setStd_w(getStd_w());
        clone.setStd_w_EMEP(getStd_w_EMEP());
        clone.setStd_t(getStd_t());
        clone.setStd_t_EMEP(getStd_t_EMEP());
        clone.setStd_c(getStd_c());
        clone.setStd_c_EMEP(getStd_c_EMEP());
        clone.setStd_h(getStd_h());
        clone.setStd_h_EMEP(getStd_h_EMEP());
        clone.setAv_u(getAv_u());
        clone.setAv_u_EMEP(getAv_u_EMEP());
        clone.setAv_v(getAv_v());
        clone.setAv_v_EMEP(getAv_v_EMEP());
        clone.setAv_w(getAv_w());
        clone.setAv_w_EMEP(getAv_w_EMEP());
        clone.setAv_t(getAv_t());
        clone.setAv_t_EMEP(getAv_t_EMEP());
        clone.setAv_c(getAv_c());
        clone.setAv_c_EMEP(getAv_c_EMEP());
        clone.setAv_h(getAv_h());
        clone.setAv_h_EMEP(getAv_h_EMEP());
        clone.setU(getU());
        clone.setU_EMEP(getU_EMEP());
        clone.setWind_dir(getWind_dir());
        clone.setWind_dir_EMEP(getWind_dir_EMEP());
        clone.setEta(getEta());
        clone.setEta_EMEP(getEta_EMEP());
        clone.setTheta(getTheta());
        clone.setTheta_EMEP(getTheta_EMEP());
        clone.setBeta(getBeta());
        clone.setBeta_EMEP(getBeta_EMEP());
        clone.setC_lag(getC_lag());
        clone.setC_lag_EMEP(getC_lag_EMEP());
        clone.setH_lag(getH_lag());
        clone.setH_lag_EMEP(getH_lag_EMEP());
        clone.setErr_packet(getErr_packet());
        clone.setErr_packet_EMEP(getErr_packet_EMEP());
        clone.setLicor_t_std(getLicor_t_std());
        clone.setLicor_t_std_EMEP(getLicor_t_std_EMEP());
        clone.setLicor_t_av(getLicor_t_av());
        clone.setLicor_t_av_EMEP(getLicor_t_av_EMEP());
        clone.setLicor_p_std(getLicor_p_std());
        clone.setLicor_p_std_EMEP(getLicor_p_std_EMEP());
        clone.setLicor_p_av(getLicor_p_av());
        clone.setLicor_p_av_EMEP(getLicor_p_av_EMEP());
        clone.setF_CPC(getF_CPC());
        clone.setF_CPC_EMEP(getF_CPC_EMEP());
        clone.setQc_F_CPC(getQc_F_CPC());
        clone.setQc_F_CPC_EMEP(getQc_F_CPC_EMEP());
        clone.setStd_CPC(getStd_CPC());
        clone.setStd_CPC_EMEP(getStd_CPC_EMEP());
        clone.setAv_CPC(getAv_CPC());
        clone.setAv_CPC_EMEP(getAv_CPC_EMEP());
        clone.setCPC_lag(getCPC_lag());
        clone.setCPC_lag_EMEP(getCPC_lag_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Towermeta towermeta) {
        java.util.Date primaryKey = towermeta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TowermetaClp)) {
            return false;
        }

        TowermetaClp towermeta = (TowermetaClp) obj;

        java.util.Date primaryKey = towermeta.getPrimaryKey();

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
        sb.append(", H=");
        sb.append(getH());
        sb.append(", H_EMEP=");
        sb.append(getH_EMEP());
        sb.append(", Qc_H=");
        sb.append(getQc_H());
        sb.append(", Qc_H_EMEP=");
        sb.append(getQc_H_EMEP());
        sb.append(", LE=");
        sb.append(getLE());
        sb.append(", LE_EMEP=");
        sb.append(getLE_EMEP());
        sb.append(", Qc_LE=");
        sb.append(getQc_LE());
        sb.append(", Qc_LE_EMEP=");
        sb.append(getQc_LE_EMEP());
        sb.append(", E=");
        sb.append(getE());
        sb.append(", E_EMEP=");
        sb.append(getE_EMEP());
        sb.append(", Qc_E=");
        sb.append(getQc_E());
        sb.append(", Qc_E_EMEP=");
        sb.append(getQc_E_EMEP());
        sb.append(", F_c=");
        sb.append(getF_c());
        sb.append(", F_c_EMEP=");
        sb.append(getF_c_EMEP());
        sb.append(", Qc_F_c=");
        sb.append(getQc_F_c());
        sb.append(", Qc_F_c_EMEP=");
        sb.append(getQc_F_c_EMEP());
        sb.append(", tau=");
        sb.append(getTau());
        sb.append(", tau_EMEP=");
        sb.append(getTau_EMEP());
        sb.append(", Qc_tau=");
        sb.append(getQc_tau());
        sb.append(", Qc_tau_EMEP=");
        sb.append(getQc_tau_EMEP());
        sb.append(", u_star=");
        sb.append(getU_star());
        sb.append(", u_star_EMEP=");
        sb.append(getU_star_EMEP());
        sb.append(", MO_length=");
        sb.append(getMO_length());
        sb.append(", MO_length_EMEP=");
        sb.append(getMO_length_EMEP());
        sb.append(", std_u=");
        sb.append(getStd_u());
        sb.append(", std_u_EMEP=");
        sb.append(getStd_u_EMEP());
        sb.append(", std_v=");
        sb.append(getStd_v());
        sb.append(", std_v_EMEP=");
        sb.append(getStd_v_EMEP());
        sb.append(", std_w=");
        sb.append(getStd_w());
        sb.append(", std_w_EMEP=");
        sb.append(getStd_w_EMEP());
        sb.append(", std_t=");
        sb.append(getStd_t());
        sb.append(", std_t_EMEP=");
        sb.append(getStd_t_EMEP());
        sb.append(", std_c=");
        sb.append(getStd_c());
        sb.append(", std_c_EMEP=");
        sb.append(getStd_c_EMEP());
        sb.append(", std_h=");
        sb.append(getStd_h());
        sb.append(", std_h_EMEP=");
        sb.append(getStd_h_EMEP());
        sb.append(", av_u=");
        sb.append(getAv_u());
        sb.append(", av_u_EMEP=");
        sb.append(getAv_u_EMEP());
        sb.append(", av_v=");
        sb.append(getAv_v());
        sb.append(", av_v_EMEP=");
        sb.append(getAv_v_EMEP());
        sb.append(", av_w=");
        sb.append(getAv_w());
        sb.append(", av_w_EMEP=");
        sb.append(getAv_w_EMEP());
        sb.append(", av_t=");
        sb.append(getAv_t());
        sb.append(", av_t_EMEP=");
        sb.append(getAv_t_EMEP());
        sb.append(", av_c=");
        sb.append(getAv_c());
        sb.append(", av_c_EMEP=");
        sb.append(getAv_c_EMEP());
        sb.append(", av_h=");
        sb.append(getAv_h());
        sb.append(", av_h_EMEP=");
        sb.append(getAv_h_EMEP());
        sb.append(", U=");
        sb.append(getU());
        sb.append(", U_EMEP=");
        sb.append(getU_EMEP());
        sb.append(", wind_dir=");
        sb.append(getWind_dir());
        sb.append(", wind_dir_EMEP=");
        sb.append(getWind_dir_EMEP());
        sb.append(", eta=");
        sb.append(getEta());
        sb.append(", eta_EMEP=");
        sb.append(getEta_EMEP());
        sb.append(", theta=");
        sb.append(getTheta());
        sb.append(", theta_EMEP=");
        sb.append(getTheta_EMEP());
        sb.append(", beta=");
        sb.append(getBeta());
        sb.append(", beta_EMEP=");
        sb.append(getBeta_EMEP());
        sb.append(", c_lag=");
        sb.append(getC_lag());
        sb.append(", c_lag_EMEP=");
        sb.append(getC_lag_EMEP());
        sb.append(", h_lag=");
        sb.append(getH_lag());
        sb.append(", h_lag_EMEP=");
        sb.append(getH_lag_EMEP());
        sb.append(", err_packet=");
        sb.append(getErr_packet());
        sb.append(", err_packet_EMEP=");
        sb.append(getErr_packet_EMEP());
        sb.append(", licor_t_std=");
        sb.append(getLicor_t_std());
        sb.append(", licor_t_std_EMEP=");
        sb.append(getLicor_t_std_EMEP());
        sb.append(", licor_t_av=");
        sb.append(getLicor_t_av());
        sb.append(", licor_t_av_EMEP=");
        sb.append(getLicor_t_av_EMEP());
        sb.append(", licor_p_std=");
        sb.append(getLicor_p_std());
        sb.append(", licor_p_std_EMEP=");
        sb.append(getLicor_p_std_EMEP());
        sb.append(", licor_p_av=");
        sb.append(getLicor_p_av());
        sb.append(", licor_p_av_EMEP=");
        sb.append(getLicor_p_av_EMEP());
        sb.append(", F_CPC=");
        sb.append(getF_CPC());
        sb.append(", F_CPC_EMEP=");
        sb.append(getF_CPC_EMEP());
        sb.append(", Qc_F_CPC=");
        sb.append(getQc_F_CPC());
        sb.append(", Qc_F_CPC_EMEP=");
        sb.append(getQc_F_CPC_EMEP());
        sb.append(", std_CPC=");
        sb.append(getStd_CPC());
        sb.append(", std_CPC_EMEP=");
        sb.append(getStd_CPC_EMEP());
        sb.append(", av_CPC=");
        sb.append(getAv_CPC());
        sb.append(", av_CPC_EMEP=");
        sb.append(getAv_CPC_EMEP());
        sb.append(", CPC_lag=");
        sb.append(getCPC_lag());
        sb.append(", CPC_lag_EMEP=");
        sb.append(getCPC_lag_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(253);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Towermeta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>H</column-name><column-value><![CDATA[");
        sb.append(getH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H</column-name><column-value><![CDATA[");
        sb.append(getQc_H());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE</column-name><column-value><![CDATA[");
        sb.append(getLE());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE</column-name><column-value><![CDATA[");
        sb.append(getQc_LE());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_EMEP());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>E</column-name><column-value><![CDATA[");
        sb.append(getE());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_EMEP</column-name><column-value><![CDATA[");
        sb.append(getE_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E</column-name><column-value><![CDATA[");
        sb.append(getQc_E());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_E_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_E_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c</column-name><column-value><![CDATA[");
        sb.append(getF_c());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_c_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_c_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_c_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau</column-name><column-value><![CDATA[");
        sb.append(getTau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau</column-name><column-value><![CDATA[");
        sb.append(getQc_tau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star</column-name><column-value><![CDATA[");
        sb.append(getU_star());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_star_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length</column-name><column-value><![CDATA[");
        sb.append(getMO_length());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_EMEP</column-name><column-value><![CDATA[");
        sb.append(getMO_length_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u</column-name><column-value><![CDATA[");
        sb.append(getStd_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v</column-name><column-value><![CDATA[");
        sb.append(getStd_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w</column-name><column-value><![CDATA[");
        sb.append(getStd_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t</column-name><column-value><![CDATA[");
        sb.append(getStd_t());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_t_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c</column-name><column-value><![CDATA[");
        sb.append(getStd_c());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h</column-name><column-value><![CDATA[");
        sb.append(getStd_h());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u</column-name><column-value><![CDATA[");
        sb.append(getAv_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v</column-name><column-value><![CDATA[");
        sb.append(getAv_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w</column-name><column-value><![CDATA[");
        sb.append(getAv_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t</column-name><column-value><![CDATA[");
        sb.append(getAv_t());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_t_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c</column-name><column-value><![CDATA[");
        sb.append(getAv_c());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h</column-name><column-value><![CDATA[");
        sb.append(getAv_h());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_EMEP());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>U</column-name><column-value><![CDATA[");
        sb.append(getU());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir</column-name><column-value><![CDATA[");
        sb.append(getWind_dir());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta</column-name><column-value><![CDATA[");
        sb.append(getEta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getEta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta</column-name><column-value><![CDATA[");
        sb.append(getTheta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTheta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta</column-name><column-value><![CDATA[");
        sb.append(getBeta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getBeta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag</column-name><column-value><![CDATA[");
        sb.append(getC_lag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_EMEP</column-name><column-value><![CDATA[");
        sb.append(getC_lag_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag</column-name><column-value><![CDATA[");
        sb.append(getH_lag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_lag_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet</column-name><column-value><![CDATA[");
        sb.append(getErr_packet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_EMEP</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_std_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_std_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_t_av_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_t_av_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CPC</column-name><column-value><![CDATA[");
        sb.append(getF_CPC());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CPC_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CPC_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_CPC</column-name><column-value><![CDATA[");
        sb.append(getQc_F_CPC());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_F_CPC_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_F_CPC_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CPC</column-name><column-value><![CDATA[");
        sb.append(getStd_CPC());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CPC_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_CPC_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CPC</column-name><column-value><![CDATA[");
        sb.append(getAv_CPC());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CPC_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_CPC_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CPC_lag</column-name><column-value><![CDATA[");
        sb.append(getCPC_lag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CPC_lag_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCPC_lag_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
