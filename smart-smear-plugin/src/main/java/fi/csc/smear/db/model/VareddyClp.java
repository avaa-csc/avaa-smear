package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.VareddyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class VareddyClp extends BaseModelImpl<Vareddy> implements Vareddy {
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
    private BaseModel<?> _vareddyRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public VareddyClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Vareddy.class;
    }

    @Override
    public String getModelClassName() {
        return Vareddy.class.getName();
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
        attributes.put("LE", getLE());
        attributes.put("LE_EMEP", getLE_EMEP());
        attributes.put("E", getE());
        attributes.put("E_EMEP", getE_EMEP());
        attributes.put("F_c", getF_c());
        attributes.put("F_c_EMEP", getF_c_EMEP());
        attributes.put("tau", getTau());
        attributes.put("tau_EMEP", getTau_EMEP());
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
        attributes.put("c_lag", getC_lag());
        attributes.put("c_lag_EMEP", getC_lag_EMEP());
        attributes.put("h_lag", getH_lag());
        attributes.put("h_lag_EMEP", getH_lag_EMEP());
        attributes.put("licor_t_std", getLicor_t_std());
        attributes.put("licor_t_std_EMEP", getLicor_t_std_EMEP());
        attributes.put("licor_t_av", getLicor_t_av());
        attributes.put("licor_t_av_EMEP", getLicor_t_av_EMEP());
        attributes.put("licor_p_std", getLicor_p_std());
        attributes.put("licor_p_std_EMEP", getLicor_p_std_EMEP());
        attributes.put("licor_p_av", getLicor_p_av());
        attributes.put("licor_p_av_EMEP", getLicor_p_av_EMEP());
        attributes.put("H_sub", getH_sub());
        attributes.put("H_sub_EMEP", getH_sub_EMEP());
        attributes.put("LE_sub", getLE_sub());
        attributes.put("LE_sub_EMEP", getLE_sub_EMEP());
        attributes.put("E_sub", getE_sub());
        attributes.put("E_sub_EMEP", getE_sub_EMEP());
        attributes.put("F_c_sub", getF_c_sub());
        attributes.put("F_c_sub_EMEP", getF_c_sub_EMEP());
        attributes.put("tau_sub", getTau_sub());
        attributes.put("tau_sub_EMEP", getTau_sub_EMEP());
        attributes.put("u_star_sub", getU_star_sub());
        attributes.put("u_star_sub_EMEP", getU_star_sub_EMEP());
        attributes.put("MO_length_sub", getMO_length_sub());
        attributes.put("MO_length_sub_EMEP", getMO_length_sub_EMEP());
        attributes.put("std_u_sub", getStd_u_sub());
        attributes.put("std_u_sub_EMEP", getStd_u_sub_EMEP());
        attributes.put("std_v_sub", getStd_v_sub());
        attributes.put("std_v_sub_EMEP", getStd_v_sub_EMEP());
        attributes.put("std_w_sub", getStd_w_sub());
        attributes.put("std_w_sub_EMEP", getStd_w_sub_EMEP());
        attributes.put("std_t_sub", getStd_t_sub());
        attributes.put("std_t_sub_EMEP", getStd_t_sub_EMEP());
        attributes.put("std_c_sub", getStd_c_sub());
        attributes.put("std_c_sub_EMEP", getStd_c_sub_EMEP());
        attributes.put("std_h_sub", getStd_h_sub());
        attributes.put("std_h_sub_EMEP", getStd_h_sub_EMEP());
        attributes.put("av_u_sub", getAv_u_sub());
        attributes.put("av_u_sub_EMEP", getAv_u_sub_EMEP());
        attributes.put("av_v_sub", getAv_v_sub());
        attributes.put("av_v_sub_EMEP", getAv_v_sub_EMEP());
        attributes.put("av_w_sub", getAv_w_sub());
        attributes.put("av_w_sub_EMEP", getAv_w_sub_EMEP());
        attributes.put("av_t_sub", getAv_t_sub());
        attributes.put("av_t_sub_EMEP", getAv_t_sub_EMEP());
        attributes.put("av_c_sub", getAv_c_sub());
        attributes.put("av_c_sub_EMEP", getAv_c_sub_EMEP());
        attributes.put("av_h_sub", getAv_h_sub());
        attributes.put("av_h_sub_EMEP", getAv_h_sub_EMEP());
        attributes.put("U_sub", getU_sub());
        attributes.put("U_sub_EMEP", getU_sub_EMEP());
        attributes.put("wind_dir_sub", getWind_dir_sub());
        attributes.put("wind_dir_sub_EMEP", getWind_dir_sub_EMEP());

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

        Float LE = (Float) attributes.get("LE");

        if (LE != null) {
            setLE(LE);
        }

        Integer LE_EMEP = (Integer) attributes.get("LE_EMEP");

        if (LE_EMEP != null) {
            setLE_EMEP(LE_EMEP);
        }

        Float E = (Float) attributes.get("E");

        if (E != null) {
            setE(E);
        }

        Integer E_EMEP = (Integer) attributes.get("E_EMEP");

        if (E_EMEP != null) {
            setE_EMEP(E_EMEP);
        }

        Float F_c = (Float) attributes.get("F_c");

        if (F_c != null) {
            setF_c(F_c);
        }

        Integer F_c_EMEP = (Integer) attributes.get("F_c_EMEP");

        if (F_c_EMEP != null) {
            setF_c_EMEP(F_c_EMEP);
        }

        Float tau = (Float) attributes.get("tau");

        if (tau != null) {
            setTau(tau);
        }

        Integer tau_EMEP = (Integer) attributes.get("tau_EMEP");

        if (tau_EMEP != null) {
            setTau_EMEP(tau_EMEP);
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

        Float H_sub = (Float) attributes.get("H_sub");

        if (H_sub != null) {
            setH_sub(H_sub);
        }

        Integer H_sub_EMEP = (Integer) attributes.get("H_sub_EMEP");

        if (H_sub_EMEP != null) {
            setH_sub_EMEP(H_sub_EMEP);
        }

        Float LE_sub = (Float) attributes.get("LE_sub");

        if (LE_sub != null) {
            setLE_sub(LE_sub);
        }

        Integer LE_sub_EMEP = (Integer) attributes.get("LE_sub_EMEP");

        if (LE_sub_EMEP != null) {
            setLE_sub_EMEP(LE_sub_EMEP);
        }

        Float E_sub = (Float) attributes.get("E_sub");

        if (E_sub != null) {
            setE_sub(E_sub);
        }

        Integer E_sub_EMEP = (Integer) attributes.get("E_sub_EMEP");

        if (E_sub_EMEP != null) {
            setE_sub_EMEP(E_sub_EMEP);
        }

        Float F_c_sub = (Float) attributes.get("F_c_sub");

        if (F_c_sub != null) {
            setF_c_sub(F_c_sub);
        }

        Integer F_c_sub_EMEP = (Integer) attributes.get("F_c_sub_EMEP");

        if (F_c_sub_EMEP != null) {
            setF_c_sub_EMEP(F_c_sub_EMEP);
        }

        Float tau_sub = (Float) attributes.get("tau_sub");

        if (tau_sub != null) {
            setTau_sub(tau_sub);
        }

        Integer tau_sub_EMEP = (Integer) attributes.get("tau_sub_EMEP");

        if (tau_sub_EMEP != null) {
            setTau_sub_EMEP(tau_sub_EMEP);
        }

        Float u_star_sub = (Float) attributes.get("u_star_sub");

        if (u_star_sub != null) {
            setU_star_sub(u_star_sub);
        }

        Integer u_star_sub_EMEP = (Integer) attributes.get("u_star_sub_EMEP");

        if (u_star_sub_EMEP != null) {
            setU_star_sub_EMEP(u_star_sub_EMEP);
        }

        Float MO_length_sub = (Float) attributes.get("MO_length_sub");

        if (MO_length_sub != null) {
            setMO_length_sub(MO_length_sub);
        }

        Integer MO_length_sub_EMEP = (Integer) attributes.get(
                "MO_length_sub_EMEP");

        if (MO_length_sub_EMEP != null) {
            setMO_length_sub_EMEP(MO_length_sub_EMEP);
        }

        Float std_u_sub = (Float) attributes.get("std_u_sub");

        if (std_u_sub != null) {
            setStd_u_sub(std_u_sub);
        }

        Integer std_u_sub_EMEP = (Integer) attributes.get("std_u_sub_EMEP");

        if (std_u_sub_EMEP != null) {
            setStd_u_sub_EMEP(std_u_sub_EMEP);
        }

        Float std_v_sub = (Float) attributes.get("std_v_sub");

        if (std_v_sub != null) {
            setStd_v_sub(std_v_sub);
        }

        Integer std_v_sub_EMEP = (Integer) attributes.get("std_v_sub_EMEP");

        if (std_v_sub_EMEP != null) {
            setStd_v_sub_EMEP(std_v_sub_EMEP);
        }

        Float std_w_sub = (Float) attributes.get("std_w_sub");

        if (std_w_sub != null) {
            setStd_w_sub(std_w_sub);
        }

        Integer std_w_sub_EMEP = (Integer) attributes.get("std_w_sub_EMEP");

        if (std_w_sub_EMEP != null) {
            setStd_w_sub_EMEP(std_w_sub_EMEP);
        }

        Float std_t_sub = (Float) attributes.get("std_t_sub");

        if (std_t_sub != null) {
            setStd_t_sub(std_t_sub);
        }

        Integer std_t_sub_EMEP = (Integer) attributes.get("std_t_sub_EMEP");

        if (std_t_sub_EMEP != null) {
            setStd_t_sub_EMEP(std_t_sub_EMEP);
        }

        Float std_c_sub = (Float) attributes.get("std_c_sub");

        if (std_c_sub != null) {
            setStd_c_sub(std_c_sub);
        }

        Integer std_c_sub_EMEP = (Integer) attributes.get("std_c_sub_EMEP");

        if (std_c_sub_EMEP != null) {
            setStd_c_sub_EMEP(std_c_sub_EMEP);
        }

        Float std_h_sub = (Float) attributes.get("std_h_sub");

        if (std_h_sub != null) {
            setStd_h_sub(std_h_sub);
        }

        Integer std_h_sub_EMEP = (Integer) attributes.get("std_h_sub_EMEP");

        if (std_h_sub_EMEP != null) {
            setStd_h_sub_EMEP(std_h_sub_EMEP);
        }

        Float av_u_sub = (Float) attributes.get("av_u_sub");

        if (av_u_sub != null) {
            setAv_u_sub(av_u_sub);
        }

        Integer av_u_sub_EMEP = (Integer) attributes.get("av_u_sub_EMEP");

        if (av_u_sub_EMEP != null) {
            setAv_u_sub_EMEP(av_u_sub_EMEP);
        }

        Float av_v_sub = (Float) attributes.get("av_v_sub");

        if (av_v_sub != null) {
            setAv_v_sub(av_v_sub);
        }

        Integer av_v_sub_EMEP = (Integer) attributes.get("av_v_sub_EMEP");

        if (av_v_sub_EMEP != null) {
            setAv_v_sub_EMEP(av_v_sub_EMEP);
        }

        Float av_w_sub = (Float) attributes.get("av_w_sub");

        if (av_w_sub != null) {
            setAv_w_sub(av_w_sub);
        }

        Integer av_w_sub_EMEP = (Integer) attributes.get("av_w_sub_EMEP");

        if (av_w_sub_EMEP != null) {
            setAv_w_sub_EMEP(av_w_sub_EMEP);
        }

        Float av_t_sub = (Float) attributes.get("av_t_sub");

        if (av_t_sub != null) {
            setAv_t_sub(av_t_sub);
        }

        Integer av_t_sub_EMEP = (Integer) attributes.get("av_t_sub_EMEP");

        if (av_t_sub_EMEP != null) {
            setAv_t_sub_EMEP(av_t_sub_EMEP);
        }

        Float av_c_sub = (Float) attributes.get("av_c_sub");

        if (av_c_sub != null) {
            setAv_c_sub(av_c_sub);
        }

        Integer av_c_sub_EMEP = (Integer) attributes.get("av_c_sub_EMEP");

        if (av_c_sub_EMEP != null) {
            setAv_c_sub_EMEP(av_c_sub_EMEP);
        }

        Float av_h_sub = (Float) attributes.get("av_h_sub");

        if (av_h_sub != null) {
            setAv_h_sub(av_h_sub);
        }

        Integer av_h_sub_EMEP = (Integer) attributes.get("av_h_sub_EMEP");

        if (av_h_sub_EMEP != null) {
            setAv_h_sub_EMEP(av_h_sub_EMEP);
        }

        Float U_sub = (Float) attributes.get("U_sub");

        if (U_sub != null) {
            setU_sub(U_sub);
        }

        Integer U_sub_EMEP = (Integer) attributes.get("U_sub_EMEP");

        if (U_sub_EMEP != null) {
            setU_sub_EMEP(U_sub_EMEP);
        }

        Float wind_dir_sub = (Float) attributes.get("wind_dir_sub");

        if (wind_dir_sub != null) {
            setWind_dir_sub(wind_dir_sub);
        }

        Integer wind_dir_sub_EMEP = (Integer) attributes.get(
                "wind_dir_sub_EMEP");

        if (wind_dir_sub_EMEP != null) {
            setWind_dir_sub_EMEP(wind_dir_sub_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_vareddyRemoteModel, samptime);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH", float.class);

                method.invoke(_vareddyRemoteModel, H);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, H_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE", float.class);

                method.invoke(_vareddyRemoteModel, LE);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, LE_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setE", float.class);

                method.invoke(_vareddyRemoteModel, E);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setE_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, E_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c", float.class);

                method.invoke(_vareddyRemoteModel, F_c);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, F_c_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau", float.class);

                method.invoke(_vareddyRemoteModel, tau);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, tau_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star", float.class);

                method.invoke(_vareddyRemoteModel, u_star);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, u_star_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length", float.class);

                method.invoke(_vareddyRemoteModel, MO_length);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, MO_length_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u", float.class);

                method.invoke(_vareddyRemoteModel, std_u);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_u_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v", float.class);

                method.invoke(_vareddyRemoteModel, std_v);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_v_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w", float.class);

                method.invoke(_vareddyRemoteModel, std_w);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_w_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t", float.class);

                method.invoke(_vareddyRemoteModel, std_t);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_t_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c", float.class);

                method.invoke(_vareddyRemoteModel, std_c);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_c_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h", float.class);

                method.invoke(_vareddyRemoteModel, std_h);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_h_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u", float.class);

                method.invoke(_vareddyRemoteModel, av_u);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_u_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v", float.class);

                method.invoke(_vareddyRemoteModel, av_v);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_v_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w", float.class);

                method.invoke(_vareddyRemoteModel, av_w);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_w_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t", float.class);

                method.invoke(_vareddyRemoteModel, av_t);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_t_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c", float.class);

                method.invoke(_vareddyRemoteModel, av_c);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_c_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h", float.class);

                method.invoke(_vareddyRemoteModel, av_h);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_h_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU", float.class);

                method.invoke(_vareddyRemoteModel, U);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, U_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir", float.class);

                method.invoke(_vareddyRemoteModel, wind_dir);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, wind_dir_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag", float.class);

                method.invoke(_vareddyRemoteModel, c_lag);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, c_lag_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag", float.class);

                method.invoke(_vareddyRemoteModel, h_lag);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, h_lag_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std", float.class);

                method.invoke(_vareddyRemoteModel, licor_t_std);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, licor_t_std_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av", float.class);

                method.invoke(_vareddyRemoteModel, licor_t_av);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, licor_t_av_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std", float.class);

                method.invoke(_vareddyRemoteModel, licor_p_std);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, licor_p_std_EMEP);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av", float.class);

                method.invoke(_vareddyRemoteModel, licor_p_av);
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

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, licor_p_av_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_sub() {
        return _H_sub;
    }

    @Override
    public void setH_sub(float H_sub) {
        _H_sub = H_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_sub", float.class);

                method.invoke(_vareddyRemoteModel, H_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_sub_EMEP() {
        return _H_sub_EMEP;
    }

    @Override
    public void setH_sub_EMEP(int H_sub_EMEP) {
        _H_sub_EMEP = H_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, H_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_sub() {
        return _LE_sub;
    }

    @Override
    public void setLE_sub(float LE_sub) {
        _LE_sub = LE_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_sub", float.class);

                method.invoke(_vareddyRemoteModel, LE_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_sub_EMEP() {
        return _LE_sub_EMEP;
    }

    @Override
    public void setLE_sub_EMEP(int LE_sub_EMEP) {
        _LE_sub_EMEP = LE_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, LE_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getE_sub() {
        return _E_sub;
    }

    @Override
    public void setE_sub(float E_sub) {
        _E_sub = E_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setE_sub", float.class);

                method.invoke(_vareddyRemoteModel, E_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getE_sub_EMEP() {
        return _E_sub_EMEP;
    }

    @Override
    public void setE_sub_EMEP(int E_sub_EMEP) {
        _E_sub_EMEP = E_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setE_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, E_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_c_sub() {
        return _F_c_sub;
    }

    @Override
    public void setF_c_sub(float F_c_sub) {
        _F_c_sub = F_c_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_sub", float.class);

                method.invoke(_vareddyRemoteModel, F_c_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_c_sub_EMEP() {
        return _F_c_sub_EMEP;
    }

    @Override
    public void setF_c_sub_EMEP(int F_c_sub_EMEP) {
        _F_c_sub_EMEP = F_c_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, F_c_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTau_sub() {
        return _tau_sub;
    }

    @Override
    public void setTau_sub(float tau_sub) {
        _tau_sub = tau_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_sub", float.class);

                method.invoke(_vareddyRemoteModel, tau_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTau_sub_EMEP() {
        return _tau_sub_EMEP;
    }

    @Override
    public void setTau_sub_EMEP(int tau_sub_EMEP) {
        _tau_sub_EMEP = tau_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, tau_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_star_sub() {
        return _u_star_sub;
    }

    @Override
    public void setU_star_sub(float u_star_sub) {
        _u_star_sub = u_star_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_sub", float.class);

                method.invoke(_vareddyRemoteModel, u_star_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_star_sub_EMEP() {
        return _u_star_sub_EMEP;
    }

    @Override
    public void setU_star_sub_EMEP(int u_star_sub_EMEP) {
        _u_star_sub_EMEP = u_star_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, u_star_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMO_length_sub() {
        return _MO_length_sub;
    }

    @Override
    public void setMO_length_sub(float MO_length_sub) {
        _MO_length_sub = MO_length_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_sub", float.class);

                method.invoke(_vareddyRemoteModel, MO_length_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMO_length_sub_EMEP() {
        return _MO_length_sub_EMEP;
    }

    @Override
    public void setMO_length_sub_EMEP(int MO_length_sub_EMEP) {
        _MO_length_sub_EMEP = MO_length_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_sub_EMEP",
                        int.class);

                method.invoke(_vareddyRemoteModel, MO_length_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_u_sub() {
        return _std_u_sub;
    }

    @Override
    public void setStd_u_sub(float std_u_sub) {
        _std_u_sub = std_u_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_u_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_u_sub_EMEP() {
        return _std_u_sub_EMEP;
    }

    @Override
    public void setStd_u_sub_EMEP(int std_u_sub_EMEP) {
        _std_u_sub_EMEP = std_u_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_u_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_v_sub() {
        return _std_v_sub;
    }

    @Override
    public void setStd_v_sub(float std_v_sub) {
        _std_v_sub = std_v_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_v_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_v_sub_EMEP() {
        return _std_v_sub_EMEP;
    }

    @Override
    public void setStd_v_sub_EMEP(int std_v_sub_EMEP) {
        _std_v_sub_EMEP = std_v_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_v_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_w_sub() {
        return _std_w_sub;
    }

    @Override
    public void setStd_w_sub(float std_w_sub) {
        _std_w_sub = std_w_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_w_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_w_sub_EMEP() {
        return _std_w_sub_EMEP;
    }

    @Override
    public void setStd_w_sub_EMEP(int std_w_sub_EMEP) {
        _std_w_sub_EMEP = std_w_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_w_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_t_sub() {
        return _std_t_sub;
    }

    @Override
    public void setStd_t_sub(float std_t_sub) {
        _std_t_sub = std_t_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_t_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_t_sub_EMEP() {
        return _std_t_sub_EMEP;
    }

    @Override
    public void setStd_t_sub_EMEP(int std_t_sub_EMEP) {
        _std_t_sub_EMEP = std_t_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_t_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c_sub() {
        return _std_c_sub;
    }

    @Override
    public void setStd_c_sub(float std_c_sub) {
        _std_c_sub = std_c_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_c_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_sub_EMEP() {
        return _std_c_sub_EMEP;
    }

    @Override
    public void setStd_c_sub_EMEP(int std_c_sub_EMEP) {
        _std_c_sub_EMEP = std_c_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_c_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h_sub() {
        return _std_h_sub;
    }

    @Override
    public void setStd_h_sub(float std_h_sub) {
        _std_h_sub = std_h_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_sub", float.class);

                method.invoke(_vareddyRemoteModel, std_h_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_sub_EMEP() {
        return _std_h_sub_EMEP;
    }

    @Override
    public void setStd_h_sub_EMEP(int std_h_sub_EMEP) {
        _std_h_sub_EMEP = std_h_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, std_h_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_u_sub() {
        return _av_u_sub;
    }

    @Override
    public void setAv_u_sub(float av_u_sub) {
        _av_u_sub = av_u_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_u_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_u_sub_EMEP() {
        return _av_u_sub_EMEP;
    }

    @Override
    public void setAv_u_sub_EMEP(int av_u_sub_EMEP) {
        _av_u_sub_EMEP = av_u_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_u_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_v_sub() {
        return _av_v_sub;
    }

    @Override
    public void setAv_v_sub(float av_v_sub) {
        _av_v_sub = av_v_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_v_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_v_sub_EMEP() {
        return _av_v_sub_EMEP;
    }

    @Override
    public void setAv_v_sub_EMEP(int av_v_sub_EMEP) {
        _av_v_sub_EMEP = av_v_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_v_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_w_sub() {
        return _av_w_sub;
    }

    @Override
    public void setAv_w_sub(float av_w_sub) {
        _av_w_sub = av_w_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_w_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_w_sub_EMEP() {
        return _av_w_sub_EMEP;
    }

    @Override
    public void setAv_w_sub_EMEP(int av_w_sub_EMEP) {
        _av_w_sub_EMEP = av_w_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_w_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_t_sub() {
        return _av_t_sub;
    }

    @Override
    public void setAv_t_sub(float av_t_sub) {
        _av_t_sub = av_t_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_t_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_t_sub_EMEP() {
        return _av_t_sub_EMEP;
    }

    @Override
    public void setAv_t_sub_EMEP(int av_t_sub_EMEP) {
        _av_t_sub_EMEP = av_t_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_t_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c_sub() {
        return _av_c_sub;
    }

    @Override
    public void setAv_c_sub(float av_c_sub) {
        _av_c_sub = av_c_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_c_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_sub_EMEP() {
        return _av_c_sub_EMEP;
    }

    @Override
    public void setAv_c_sub_EMEP(int av_c_sub_EMEP) {
        _av_c_sub_EMEP = av_c_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_c_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h_sub() {
        return _av_h_sub;
    }

    @Override
    public void setAv_h_sub(float av_h_sub) {
        _av_h_sub = av_h_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_sub", float.class);

                method.invoke(_vareddyRemoteModel, av_h_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_sub_EMEP() {
        return _av_h_sub_EMEP;
    }

    @Override
    public void setAv_h_sub_EMEP(int av_h_sub_EMEP) {
        _av_h_sub_EMEP = av_h_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, av_h_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_sub() {
        return _U_sub;
    }

    @Override
    public void setU_sub(float U_sub) {
        _U_sub = U_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_sub", float.class);

                method.invoke(_vareddyRemoteModel, U_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_sub_EMEP() {
        return _U_sub_EMEP;
    }

    @Override
    public void setU_sub_EMEP(int U_sub_EMEP) {
        _U_sub_EMEP = U_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_sub_EMEP", int.class);

                method.invoke(_vareddyRemoteModel, U_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWind_dir_sub() {
        return _wind_dir_sub;
    }

    @Override
    public void setWind_dir_sub(float wind_dir_sub) {
        _wind_dir_sub = wind_dir_sub;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_sub", float.class);

                method.invoke(_vareddyRemoteModel, wind_dir_sub);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWind_dir_sub_EMEP() {
        return _wind_dir_sub_EMEP;
    }

    @Override
    public void setWind_dir_sub_EMEP(int wind_dir_sub_EMEP) {
        _wind_dir_sub_EMEP = wind_dir_sub_EMEP;

        if (_vareddyRemoteModel != null) {
            try {
                Class<?> clazz = _vareddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_sub_EMEP",
                        int.class);

                method.invoke(_vareddyRemoteModel, wind_dir_sub_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getVareddyRemoteModel() {
        return _vareddyRemoteModel;
    }

    public void setVareddyRemoteModel(BaseModel<?> vareddyRemoteModel) {
        _vareddyRemoteModel = vareddyRemoteModel;
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

        Class<?> remoteModelClass = _vareddyRemoteModel.getClass();

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

        Object returnValue = method.invoke(_vareddyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VareddyLocalServiceUtil.addVareddy(this);
        } else {
            VareddyLocalServiceUtil.updateVareddy(this);
        }
    }

    @Override
    public Vareddy toEscapedModel() {
        return (Vareddy) ProxyUtil.newProxyInstance(Vareddy.class.getClassLoader(),
            new Class[] { Vareddy.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        VareddyClp clone = new VareddyClp();

        clone.setSamptime(getSamptime());
        clone.setH(getH());
        clone.setH_EMEP(getH_EMEP());
        clone.setLE(getLE());
        clone.setLE_EMEP(getLE_EMEP());
        clone.setE(getE());
        clone.setE_EMEP(getE_EMEP());
        clone.setF_c(getF_c());
        clone.setF_c_EMEP(getF_c_EMEP());
        clone.setTau(getTau());
        clone.setTau_EMEP(getTau_EMEP());
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
        clone.setC_lag(getC_lag());
        clone.setC_lag_EMEP(getC_lag_EMEP());
        clone.setH_lag(getH_lag());
        clone.setH_lag_EMEP(getH_lag_EMEP());
        clone.setLicor_t_std(getLicor_t_std());
        clone.setLicor_t_std_EMEP(getLicor_t_std_EMEP());
        clone.setLicor_t_av(getLicor_t_av());
        clone.setLicor_t_av_EMEP(getLicor_t_av_EMEP());
        clone.setLicor_p_std(getLicor_p_std());
        clone.setLicor_p_std_EMEP(getLicor_p_std_EMEP());
        clone.setLicor_p_av(getLicor_p_av());
        clone.setLicor_p_av_EMEP(getLicor_p_av_EMEP());
        clone.setH_sub(getH_sub());
        clone.setH_sub_EMEP(getH_sub_EMEP());
        clone.setLE_sub(getLE_sub());
        clone.setLE_sub_EMEP(getLE_sub_EMEP());
        clone.setE_sub(getE_sub());
        clone.setE_sub_EMEP(getE_sub_EMEP());
        clone.setF_c_sub(getF_c_sub());
        clone.setF_c_sub_EMEP(getF_c_sub_EMEP());
        clone.setTau_sub(getTau_sub());
        clone.setTau_sub_EMEP(getTau_sub_EMEP());
        clone.setU_star_sub(getU_star_sub());
        clone.setU_star_sub_EMEP(getU_star_sub_EMEP());
        clone.setMO_length_sub(getMO_length_sub());
        clone.setMO_length_sub_EMEP(getMO_length_sub_EMEP());
        clone.setStd_u_sub(getStd_u_sub());
        clone.setStd_u_sub_EMEP(getStd_u_sub_EMEP());
        clone.setStd_v_sub(getStd_v_sub());
        clone.setStd_v_sub_EMEP(getStd_v_sub_EMEP());
        clone.setStd_w_sub(getStd_w_sub());
        clone.setStd_w_sub_EMEP(getStd_w_sub_EMEP());
        clone.setStd_t_sub(getStd_t_sub());
        clone.setStd_t_sub_EMEP(getStd_t_sub_EMEP());
        clone.setStd_c_sub(getStd_c_sub());
        clone.setStd_c_sub_EMEP(getStd_c_sub_EMEP());
        clone.setStd_h_sub(getStd_h_sub());
        clone.setStd_h_sub_EMEP(getStd_h_sub_EMEP());
        clone.setAv_u_sub(getAv_u_sub());
        clone.setAv_u_sub_EMEP(getAv_u_sub_EMEP());
        clone.setAv_v_sub(getAv_v_sub());
        clone.setAv_v_sub_EMEP(getAv_v_sub_EMEP());
        clone.setAv_w_sub(getAv_w_sub());
        clone.setAv_w_sub_EMEP(getAv_w_sub_EMEP());
        clone.setAv_t_sub(getAv_t_sub());
        clone.setAv_t_sub_EMEP(getAv_t_sub_EMEP());
        clone.setAv_c_sub(getAv_c_sub());
        clone.setAv_c_sub_EMEP(getAv_c_sub_EMEP());
        clone.setAv_h_sub(getAv_h_sub());
        clone.setAv_h_sub_EMEP(getAv_h_sub_EMEP());
        clone.setU_sub(getU_sub());
        clone.setU_sub_EMEP(getU_sub_EMEP());
        clone.setWind_dir_sub(getWind_dir_sub());
        clone.setWind_dir_sub_EMEP(getWind_dir_sub_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Vareddy vareddy) {
        java.util.Date primaryKey = vareddy.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VareddyClp)) {
            return false;
        }

        VareddyClp vareddy = (VareddyClp) obj;

        java.util.Date primaryKey = vareddy.getPrimaryKey();

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
        StringBundler sb = new StringBundler(195);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", H=");
        sb.append(getH());
        sb.append(", H_EMEP=");
        sb.append(getH_EMEP());
        sb.append(", LE=");
        sb.append(getLE());
        sb.append(", LE_EMEP=");
        sb.append(getLE_EMEP());
        sb.append(", E=");
        sb.append(getE());
        sb.append(", E_EMEP=");
        sb.append(getE_EMEP());
        sb.append(", F_c=");
        sb.append(getF_c());
        sb.append(", F_c_EMEP=");
        sb.append(getF_c_EMEP());
        sb.append(", tau=");
        sb.append(getTau());
        sb.append(", tau_EMEP=");
        sb.append(getTau_EMEP());
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
        sb.append(", c_lag=");
        sb.append(getC_lag());
        sb.append(", c_lag_EMEP=");
        sb.append(getC_lag_EMEP());
        sb.append(", h_lag=");
        sb.append(getH_lag());
        sb.append(", h_lag_EMEP=");
        sb.append(getH_lag_EMEP());
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
        sb.append(", H_sub=");
        sb.append(getH_sub());
        sb.append(", H_sub_EMEP=");
        sb.append(getH_sub_EMEP());
        sb.append(", LE_sub=");
        sb.append(getLE_sub());
        sb.append(", LE_sub_EMEP=");
        sb.append(getLE_sub_EMEP());
        sb.append(", E_sub=");
        sb.append(getE_sub());
        sb.append(", E_sub_EMEP=");
        sb.append(getE_sub_EMEP());
        sb.append(", F_c_sub=");
        sb.append(getF_c_sub());
        sb.append(", F_c_sub_EMEP=");
        sb.append(getF_c_sub_EMEP());
        sb.append(", tau_sub=");
        sb.append(getTau_sub());
        sb.append(", tau_sub_EMEP=");
        sb.append(getTau_sub_EMEP());
        sb.append(", u_star_sub=");
        sb.append(getU_star_sub());
        sb.append(", u_star_sub_EMEP=");
        sb.append(getU_star_sub_EMEP());
        sb.append(", MO_length_sub=");
        sb.append(getMO_length_sub());
        sb.append(", MO_length_sub_EMEP=");
        sb.append(getMO_length_sub_EMEP());
        sb.append(", std_u_sub=");
        sb.append(getStd_u_sub());
        sb.append(", std_u_sub_EMEP=");
        sb.append(getStd_u_sub_EMEP());
        sb.append(", std_v_sub=");
        sb.append(getStd_v_sub());
        sb.append(", std_v_sub_EMEP=");
        sb.append(getStd_v_sub_EMEP());
        sb.append(", std_w_sub=");
        sb.append(getStd_w_sub());
        sb.append(", std_w_sub_EMEP=");
        sb.append(getStd_w_sub_EMEP());
        sb.append(", std_t_sub=");
        sb.append(getStd_t_sub());
        sb.append(", std_t_sub_EMEP=");
        sb.append(getStd_t_sub_EMEP());
        sb.append(", std_c_sub=");
        sb.append(getStd_c_sub());
        sb.append(", std_c_sub_EMEP=");
        sb.append(getStd_c_sub_EMEP());
        sb.append(", std_h_sub=");
        sb.append(getStd_h_sub());
        sb.append(", std_h_sub_EMEP=");
        sb.append(getStd_h_sub_EMEP());
        sb.append(", av_u_sub=");
        sb.append(getAv_u_sub());
        sb.append(", av_u_sub_EMEP=");
        sb.append(getAv_u_sub_EMEP());
        sb.append(", av_v_sub=");
        sb.append(getAv_v_sub());
        sb.append(", av_v_sub_EMEP=");
        sb.append(getAv_v_sub_EMEP());
        sb.append(", av_w_sub=");
        sb.append(getAv_w_sub());
        sb.append(", av_w_sub_EMEP=");
        sb.append(getAv_w_sub_EMEP());
        sb.append(", av_t_sub=");
        sb.append(getAv_t_sub());
        sb.append(", av_t_sub_EMEP=");
        sb.append(getAv_t_sub_EMEP());
        sb.append(", av_c_sub=");
        sb.append(getAv_c_sub());
        sb.append(", av_c_sub_EMEP=");
        sb.append(getAv_c_sub_EMEP());
        sb.append(", av_h_sub=");
        sb.append(getAv_h_sub());
        sb.append(", av_h_sub_EMEP=");
        sb.append(getAv_h_sub_EMEP());
        sb.append(", U_sub=");
        sb.append(getU_sub());
        sb.append(", U_sub_EMEP=");
        sb.append(getU_sub_EMEP());
        sb.append(", wind_dir_sub=");
        sb.append(getWind_dir_sub());
        sb.append(", wind_dir_sub_EMEP=");
        sb.append(getWind_dir_sub_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(295);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Vareddy");
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
            "<column><column-name>LE</column-name><column-value><![CDATA[");
        sb.append(getLE());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_EMEP());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>E</column-name><column-value><![CDATA[");
        sb.append(getE());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_EMEP</column-name><column-value><![CDATA[");
        sb.append(getE_EMEP());
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
            "<column><column-name>tau</column-name><column-value><![CDATA[");
        sb.append(getTau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_EMEP());
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
            "<column><column-name>H_sub</column-name><column-value><![CDATA[");
        sb.append(getH_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_sub</column-name><column-value><![CDATA[");
        sb.append(getLE_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_sub</column-name><column-value><![CDATA[");
        sb.append(getE_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>E_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getE_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_sub</column-name><column-value><![CDATA[");
        sb.append(getF_c_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_c_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_sub</column-name><column-value><![CDATA[");
        sb.append(getTau_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_sub</column-name><column-value><![CDATA[");
        sb.append(getU_star_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_star_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_sub</column-name><column-value><![CDATA[");
        sb.append(getMO_length_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getMO_length_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_u_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_u_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_v_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_v_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_w_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_w_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_t_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_t_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_t_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_c_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_sub</column-name><column-value><![CDATA[");
        sb.append(getStd_h_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_u_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_u_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_v_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_v_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_w_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_w_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_t_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_t_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_t_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_c_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_sub</column-name><column-value><![CDATA[");
        sb.append(getAv_h_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_sub</column-name><column-value><![CDATA[");
        sb.append(getU_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_sub_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_sub</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_sub());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_sub_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_sub_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
