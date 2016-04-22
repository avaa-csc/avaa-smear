package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vareddy}.
 * </p>
 *
 * @author pj
 * @see Vareddy
 * @generated
 */
public class VareddyWrapper implements Vareddy, ModelWrapper<Vareddy> {
    private Vareddy _vareddy;

    public VareddyWrapper(Vareddy vareddy) {
        _vareddy = vareddy;
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

    /**
    * Returns the primary key of this vareddy.
    *
    * @return the primary key of this vareddy
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _vareddy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this vareddy.
    *
    * @param primaryKey the primary key of this vareddy
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _vareddy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this vareddy.
    *
    * @return the samptime of this vareddy
    */
    @Override
    public java.util.Date getSamptime() {
        return _vareddy.getSamptime();
    }

    /**
    * Sets the samptime of this vareddy.
    *
    * @param samptime the samptime of this vareddy
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _vareddy.setSamptime(samptime);
    }

    /**
    * Returns the h of this vareddy.
    *
    * @return the h of this vareddy
    */
    @Override
    public float getH() {
        return _vareddy.getH();
    }

    /**
    * Sets the h of this vareddy.
    *
    * @param H the h of this vareddy
    */
    @Override
    public void setH(float H) {
        _vareddy.setH(H);
    }

    /**
    * Returns the h_ e m e p of this vareddy.
    *
    * @return the h_ e m e p of this vareddy
    */
    @Override
    public int getH_EMEP() {
        return _vareddy.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this vareddy.
    *
    * @param H_EMEP the h_ e m e p of this vareddy
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _vareddy.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the l e of this vareddy.
    *
    * @return the l e of this vareddy
    */
    @Override
    public float getLE() {
        return _vareddy.getLE();
    }

    /**
    * Sets the l e of this vareddy.
    *
    * @param LE the l e of this vareddy
    */
    @Override
    public void setLE(float LE) {
        _vareddy.setLE(LE);
    }

    /**
    * Returns the l e_ e m e p of this vareddy.
    *
    * @return the l e_ e m e p of this vareddy
    */
    @Override
    public int getLE_EMEP() {
        return _vareddy.getLE_EMEP();
    }

    /**
    * Sets the l e_ e m e p of this vareddy.
    *
    * @param LE_EMEP the l e_ e m e p of this vareddy
    */
    @Override
    public void setLE_EMEP(int LE_EMEP) {
        _vareddy.setLE_EMEP(LE_EMEP);
    }

    /**
    * Returns the e of this vareddy.
    *
    * @return the e of this vareddy
    */
    @Override
    public float getE() {
        return _vareddy.getE();
    }

    /**
    * Sets the e of this vareddy.
    *
    * @param E the e of this vareddy
    */
    @Override
    public void setE(float E) {
        _vareddy.setE(E);
    }

    /**
    * Returns the e_ e m e p of this vareddy.
    *
    * @return the e_ e m e p of this vareddy
    */
    @Override
    public int getE_EMEP() {
        return _vareddy.getE_EMEP();
    }

    /**
    * Sets the e_ e m e p of this vareddy.
    *
    * @param E_EMEP the e_ e m e p of this vareddy
    */
    @Override
    public void setE_EMEP(int E_EMEP) {
        _vareddy.setE_EMEP(E_EMEP);
    }

    /**
    * Returns the f_c of this vareddy.
    *
    * @return the f_c of this vareddy
    */
    @Override
    public float getF_c() {
        return _vareddy.getF_c();
    }

    /**
    * Sets the f_c of this vareddy.
    *
    * @param F_c the f_c of this vareddy
    */
    @Override
    public void setF_c(float F_c) {
        _vareddy.setF_c(F_c);
    }

    /**
    * Returns the f_c_ e m e p of this vareddy.
    *
    * @return the f_c_ e m e p of this vareddy
    */
    @Override
    public int getF_c_EMEP() {
        return _vareddy.getF_c_EMEP();
    }

    /**
    * Sets the f_c_ e m e p of this vareddy.
    *
    * @param F_c_EMEP the f_c_ e m e p of this vareddy
    */
    @Override
    public void setF_c_EMEP(int F_c_EMEP) {
        _vareddy.setF_c_EMEP(F_c_EMEP);
    }

    /**
    * Returns the tau of this vareddy.
    *
    * @return the tau of this vareddy
    */
    @Override
    public float getTau() {
        return _vareddy.getTau();
    }

    /**
    * Sets the tau of this vareddy.
    *
    * @param tau the tau of this vareddy
    */
    @Override
    public void setTau(float tau) {
        _vareddy.setTau(tau);
    }

    /**
    * Returns the tau_ e m e p of this vareddy.
    *
    * @return the tau_ e m e p of this vareddy
    */
    @Override
    public int getTau_EMEP() {
        return _vareddy.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this vareddy.
    *
    * @param tau_EMEP the tau_ e m e p of this vareddy
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _vareddy.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the u_star of this vareddy.
    *
    * @return the u_star of this vareddy
    */
    @Override
    public float getU_star() {
        return _vareddy.getU_star();
    }

    /**
    * Sets the u_star of this vareddy.
    *
    * @param u_star the u_star of this vareddy
    */
    @Override
    public void setU_star(float u_star) {
        _vareddy.setU_star(u_star);
    }

    /**
    * Returns the u_star_ e m e p of this vareddy.
    *
    * @return the u_star_ e m e p of this vareddy
    */
    @Override
    public int getU_star_EMEP() {
        return _vareddy.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this vareddy.
    *
    * @param u_star_EMEP the u_star_ e m e p of this vareddy
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _vareddy.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length of this vareddy.
    *
    * @return the m o_length of this vareddy
    */
    @Override
    public float getMO_length() {
        return _vareddy.getMO_length();
    }

    /**
    * Sets the m o_length of this vareddy.
    *
    * @param MO_length the m o_length of this vareddy
    */
    @Override
    public void setMO_length(float MO_length) {
        _vareddy.setMO_length(MO_length);
    }

    /**
    * Returns the m o_length_ e m e p of this vareddy.
    *
    * @return the m o_length_ e m e p of this vareddy
    */
    @Override
    public int getMO_length_EMEP() {
        return _vareddy.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this vareddy.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this vareddy
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _vareddy.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the std_u of this vareddy.
    *
    * @return the std_u of this vareddy
    */
    @Override
    public float getStd_u() {
        return _vareddy.getStd_u();
    }

    /**
    * Sets the std_u of this vareddy.
    *
    * @param std_u the std_u of this vareddy
    */
    @Override
    public void setStd_u(float std_u) {
        _vareddy.setStd_u(std_u);
    }

    /**
    * Returns the std_u_ e m e p of this vareddy.
    *
    * @return the std_u_ e m e p of this vareddy
    */
    @Override
    public int getStd_u_EMEP() {
        return _vareddy.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this vareddy.
    *
    * @param std_u_EMEP the std_u_ e m e p of this vareddy
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _vareddy.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v of this vareddy.
    *
    * @return the std_v of this vareddy
    */
    @Override
    public float getStd_v() {
        return _vareddy.getStd_v();
    }

    /**
    * Sets the std_v of this vareddy.
    *
    * @param std_v the std_v of this vareddy
    */
    @Override
    public void setStd_v(float std_v) {
        _vareddy.setStd_v(std_v);
    }

    /**
    * Returns the std_v_ e m e p of this vareddy.
    *
    * @return the std_v_ e m e p of this vareddy
    */
    @Override
    public int getStd_v_EMEP() {
        return _vareddy.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this vareddy.
    *
    * @param std_v_EMEP the std_v_ e m e p of this vareddy
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _vareddy.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w of this vareddy.
    *
    * @return the std_w of this vareddy
    */
    @Override
    public float getStd_w() {
        return _vareddy.getStd_w();
    }

    /**
    * Sets the std_w of this vareddy.
    *
    * @param std_w the std_w of this vareddy
    */
    @Override
    public void setStd_w(float std_w) {
        _vareddy.setStd_w(std_w);
    }

    /**
    * Returns the std_w_ e m e p of this vareddy.
    *
    * @return the std_w_ e m e p of this vareddy
    */
    @Override
    public int getStd_w_EMEP() {
        return _vareddy.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this vareddy.
    *
    * @param std_w_EMEP the std_w_ e m e p of this vareddy
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _vareddy.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the std_t of this vareddy.
    *
    * @return the std_t of this vareddy
    */
    @Override
    public float getStd_t() {
        return _vareddy.getStd_t();
    }

    /**
    * Sets the std_t of this vareddy.
    *
    * @param std_t the std_t of this vareddy
    */
    @Override
    public void setStd_t(float std_t) {
        _vareddy.setStd_t(std_t);
    }

    /**
    * Returns the std_t_ e m e p of this vareddy.
    *
    * @return the std_t_ e m e p of this vareddy
    */
    @Override
    public int getStd_t_EMEP() {
        return _vareddy.getStd_t_EMEP();
    }

    /**
    * Sets the std_t_ e m e p of this vareddy.
    *
    * @param std_t_EMEP the std_t_ e m e p of this vareddy
    */
    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _vareddy.setStd_t_EMEP(std_t_EMEP);
    }

    /**
    * Returns the std_c of this vareddy.
    *
    * @return the std_c of this vareddy
    */
    @Override
    public float getStd_c() {
        return _vareddy.getStd_c();
    }

    /**
    * Sets the std_c of this vareddy.
    *
    * @param std_c the std_c of this vareddy
    */
    @Override
    public void setStd_c(float std_c) {
        _vareddy.setStd_c(std_c);
    }

    /**
    * Returns the std_c_ e m e p of this vareddy.
    *
    * @return the std_c_ e m e p of this vareddy
    */
    @Override
    public int getStd_c_EMEP() {
        return _vareddy.getStd_c_EMEP();
    }

    /**
    * Sets the std_c_ e m e p of this vareddy.
    *
    * @param std_c_EMEP the std_c_ e m e p of this vareddy
    */
    @Override
    public void setStd_c_EMEP(int std_c_EMEP) {
        _vareddy.setStd_c_EMEP(std_c_EMEP);
    }

    /**
    * Returns the std_h of this vareddy.
    *
    * @return the std_h of this vareddy
    */
    @Override
    public float getStd_h() {
        return _vareddy.getStd_h();
    }

    /**
    * Sets the std_h of this vareddy.
    *
    * @param std_h the std_h of this vareddy
    */
    @Override
    public void setStd_h(float std_h) {
        _vareddy.setStd_h(std_h);
    }

    /**
    * Returns the std_h_ e m e p of this vareddy.
    *
    * @return the std_h_ e m e p of this vareddy
    */
    @Override
    public int getStd_h_EMEP() {
        return _vareddy.getStd_h_EMEP();
    }

    /**
    * Sets the std_h_ e m e p of this vareddy.
    *
    * @param std_h_EMEP the std_h_ e m e p of this vareddy
    */
    @Override
    public void setStd_h_EMEP(int std_h_EMEP) {
        _vareddy.setStd_h_EMEP(std_h_EMEP);
    }

    /**
    * Returns the av_u of this vareddy.
    *
    * @return the av_u of this vareddy
    */
    @Override
    public float getAv_u() {
        return _vareddy.getAv_u();
    }

    /**
    * Sets the av_u of this vareddy.
    *
    * @param av_u the av_u of this vareddy
    */
    @Override
    public void setAv_u(float av_u) {
        _vareddy.setAv_u(av_u);
    }

    /**
    * Returns the av_u_ e m e p of this vareddy.
    *
    * @return the av_u_ e m e p of this vareddy
    */
    @Override
    public int getAv_u_EMEP() {
        return _vareddy.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this vareddy.
    *
    * @param av_u_EMEP the av_u_ e m e p of this vareddy
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _vareddy.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v of this vareddy.
    *
    * @return the av_v of this vareddy
    */
    @Override
    public float getAv_v() {
        return _vareddy.getAv_v();
    }

    /**
    * Sets the av_v of this vareddy.
    *
    * @param av_v the av_v of this vareddy
    */
    @Override
    public void setAv_v(float av_v) {
        _vareddy.setAv_v(av_v);
    }

    /**
    * Returns the av_v_ e m e p of this vareddy.
    *
    * @return the av_v_ e m e p of this vareddy
    */
    @Override
    public int getAv_v_EMEP() {
        return _vareddy.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this vareddy.
    *
    * @param av_v_EMEP the av_v_ e m e p of this vareddy
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _vareddy.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w of this vareddy.
    *
    * @return the av_w of this vareddy
    */
    @Override
    public float getAv_w() {
        return _vareddy.getAv_w();
    }

    /**
    * Sets the av_w of this vareddy.
    *
    * @param av_w the av_w of this vareddy
    */
    @Override
    public void setAv_w(float av_w) {
        _vareddy.setAv_w(av_w);
    }

    /**
    * Returns the av_w_ e m e p of this vareddy.
    *
    * @return the av_w_ e m e p of this vareddy
    */
    @Override
    public int getAv_w_EMEP() {
        return _vareddy.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this vareddy.
    *
    * @param av_w_EMEP the av_w_ e m e p of this vareddy
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _vareddy.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the av_t of this vareddy.
    *
    * @return the av_t of this vareddy
    */
    @Override
    public float getAv_t() {
        return _vareddy.getAv_t();
    }

    /**
    * Sets the av_t of this vareddy.
    *
    * @param av_t the av_t of this vareddy
    */
    @Override
    public void setAv_t(float av_t) {
        _vareddy.setAv_t(av_t);
    }

    /**
    * Returns the av_t_ e m e p of this vareddy.
    *
    * @return the av_t_ e m e p of this vareddy
    */
    @Override
    public int getAv_t_EMEP() {
        return _vareddy.getAv_t_EMEP();
    }

    /**
    * Sets the av_t_ e m e p of this vareddy.
    *
    * @param av_t_EMEP the av_t_ e m e p of this vareddy
    */
    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _vareddy.setAv_t_EMEP(av_t_EMEP);
    }

    /**
    * Returns the av_c of this vareddy.
    *
    * @return the av_c of this vareddy
    */
    @Override
    public float getAv_c() {
        return _vareddy.getAv_c();
    }

    /**
    * Sets the av_c of this vareddy.
    *
    * @param av_c the av_c of this vareddy
    */
    @Override
    public void setAv_c(float av_c) {
        _vareddy.setAv_c(av_c);
    }

    /**
    * Returns the av_c_ e m e p of this vareddy.
    *
    * @return the av_c_ e m e p of this vareddy
    */
    @Override
    public int getAv_c_EMEP() {
        return _vareddy.getAv_c_EMEP();
    }

    /**
    * Sets the av_c_ e m e p of this vareddy.
    *
    * @param av_c_EMEP the av_c_ e m e p of this vareddy
    */
    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _vareddy.setAv_c_EMEP(av_c_EMEP);
    }

    /**
    * Returns the av_h of this vareddy.
    *
    * @return the av_h of this vareddy
    */
    @Override
    public float getAv_h() {
        return _vareddy.getAv_h();
    }

    /**
    * Sets the av_h of this vareddy.
    *
    * @param av_h the av_h of this vareddy
    */
    @Override
    public void setAv_h(float av_h) {
        _vareddy.setAv_h(av_h);
    }

    /**
    * Returns the av_h_ e m e p of this vareddy.
    *
    * @return the av_h_ e m e p of this vareddy
    */
    @Override
    public int getAv_h_EMEP() {
        return _vareddy.getAv_h_EMEP();
    }

    /**
    * Sets the av_h_ e m e p of this vareddy.
    *
    * @param av_h_EMEP the av_h_ e m e p of this vareddy
    */
    @Override
    public void setAv_h_EMEP(int av_h_EMEP) {
        _vareddy.setAv_h_EMEP(av_h_EMEP);
    }

    /**
    * Returns the u of this vareddy.
    *
    * @return the u of this vareddy
    */
    @Override
    public float getU() {
        return _vareddy.getU();
    }

    /**
    * Sets the u of this vareddy.
    *
    * @param U the u of this vareddy
    */
    @Override
    public void setU(float U) {
        _vareddy.setU(U);
    }

    /**
    * Returns the u_ e m e p of this vareddy.
    *
    * @return the u_ e m e p of this vareddy
    */
    @Override
    public int getU_EMEP() {
        return _vareddy.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this vareddy.
    *
    * @param U_EMEP the u_ e m e p of this vareddy
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _vareddy.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir of this vareddy.
    *
    * @return the wind_dir of this vareddy
    */
    @Override
    public float getWind_dir() {
        return _vareddy.getWind_dir();
    }

    /**
    * Sets the wind_dir of this vareddy.
    *
    * @param wind_dir the wind_dir of this vareddy
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _vareddy.setWind_dir(wind_dir);
    }

    /**
    * Returns the wind_dir_ e m e p of this vareddy.
    *
    * @return the wind_dir_ e m e p of this vareddy
    */
    @Override
    public int getWind_dir_EMEP() {
        return _vareddy.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this vareddy.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this vareddy
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _vareddy.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the c_lag of this vareddy.
    *
    * @return the c_lag of this vareddy
    */
    @Override
    public float getC_lag() {
        return _vareddy.getC_lag();
    }

    /**
    * Sets the c_lag of this vareddy.
    *
    * @param c_lag the c_lag of this vareddy
    */
    @Override
    public void setC_lag(float c_lag) {
        _vareddy.setC_lag(c_lag);
    }

    /**
    * Returns the c_lag_ e m e p of this vareddy.
    *
    * @return the c_lag_ e m e p of this vareddy
    */
    @Override
    public int getC_lag_EMEP() {
        return _vareddy.getC_lag_EMEP();
    }

    /**
    * Sets the c_lag_ e m e p of this vareddy.
    *
    * @param c_lag_EMEP the c_lag_ e m e p of this vareddy
    */
    @Override
    public void setC_lag_EMEP(int c_lag_EMEP) {
        _vareddy.setC_lag_EMEP(c_lag_EMEP);
    }

    /**
    * Returns the h_lag of this vareddy.
    *
    * @return the h_lag of this vareddy
    */
    @Override
    public float getH_lag() {
        return _vareddy.getH_lag();
    }

    /**
    * Sets the h_lag of this vareddy.
    *
    * @param h_lag the h_lag of this vareddy
    */
    @Override
    public void setH_lag(float h_lag) {
        _vareddy.setH_lag(h_lag);
    }

    /**
    * Returns the h_lag_ e m e p of this vareddy.
    *
    * @return the h_lag_ e m e p of this vareddy
    */
    @Override
    public int getH_lag_EMEP() {
        return _vareddy.getH_lag_EMEP();
    }

    /**
    * Sets the h_lag_ e m e p of this vareddy.
    *
    * @param h_lag_EMEP the h_lag_ e m e p of this vareddy
    */
    @Override
    public void setH_lag_EMEP(int h_lag_EMEP) {
        _vareddy.setH_lag_EMEP(h_lag_EMEP);
    }

    /**
    * Returns the licor_t_std of this vareddy.
    *
    * @return the licor_t_std of this vareddy
    */
    @Override
    public float getLicor_t_std() {
        return _vareddy.getLicor_t_std();
    }

    /**
    * Sets the licor_t_std of this vareddy.
    *
    * @param licor_t_std the licor_t_std of this vareddy
    */
    @Override
    public void setLicor_t_std(float licor_t_std) {
        _vareddy.setLicor_t_std(licor_t_std);
    }

    /**
    * Returns the licor_t_std_ e m e p of this vareddy.
    *
    * @return the licor_t_std_ e m e p of this vareddy
    */
    @Override
    public int getLicor_t_std_EMEP() {
        return _vareddy.getLicor_t_std_EMEP();
    }

    /**
    * Sets the licor_t_std_ e m e p of this vareddy.
    *
    * @param licor_t_std_EMEP the licor_t_std_ e m e p of this vareddy
    */
    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _vareddy.setLicor_t_std_EMEP(licor_t_std_EMEP);
    }

    /**
    * Returns the licor_t_av of this vareddy.
    *
    * @return the licor_t_av of this vareddy
    */
    @Override
    public float getLicor_t_av() {
        return _vareddy.getLicor_t_av();
    }

    /**
    * Sets the licor_t_av of this vareddy.
    *
    * @param licor_t_av the licor_t_av of this vareddy
    */
    @Override
    public void setLicor_t_av(float licor_t_av) {
        _vareddy.setLicor_t_av(licor_t_av);
    }

    /**
    * Returns the licor_t_av_ e m e p of this vareddy.
    *
    * @return the licor_t_av_ e m e p of this vareddy
    */
    @Override
    public int getLicor_t_av_EMEP() {
        return _vareddy.getLicor_t_av_EMEP();
    }

    /**
    * Sets the licor_t_av_ e m e p of this vareddy.
    *
    * @param licor_t_av_EMEP the licor_t_av_ e m e p of this vareddy
    */
    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _vareddy.setLicor_t_av_EMEP(licor_t_av_EMEP);
    }

    /**
    * Returns the licor_p_std of this vareddy.
    *
    * @return the licor_p_std of this vareddy
    */
    @Override
    public float getLicor_p_std() {
        return _vareddy.getLicor_p_std();
    }

    /**
    * Sets the licor_p_std of this vareddy.
    *
    * @param licor_p_std the licor_p_std of this vareddy
    */
    @Override
    public void setLicor_p_std(float licor_p_std) {
        _vareddy.setLicor_p_std(licor_p_std);
    }

    /**
    * Returns the licor_p_std_ e m e p of this vareddy.
    *
    * @return the licor_p_std_ e m e p of this vareddy
    */
    @Override
    public int getLicor_p_std_EMEP() {
        return _vareddy.getLicor_p_std_EMEP();
    }

    /**
    * Sets the licor_p_std_ e m e p of this vareddy.
    *
    * @param licor_p_std_EMEP the licor_p_std_ e m e p of this vareddy
    */
    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _vareddy.setLicor_p_std_EMEP(licor_p_std_EMEP);
    }

    /**
    * Returns the licor_p_av of this vareddy.
    *
    * @return the licor_p_av of this vareddy
    */
    @Override
    public float getLicor_p_av() {
        return _vareddy.getLicor_p_av();
    }

    /**
    * Sets the licor_p_av of this vareddy.
    *
    * @param licor_p_av the licor_p_av of this vareddy
    */
    @Override
    public void setLicor_p_av(float licor_p_av) {
        _vareddy.setLicor_p_av(licor_p_av);
    }

    /**
    * Returns the licor_p_av_ e m e p of this vareddy.
    *
    * @return the licor_p_av_ e m e p of this vareddy
    */
    @Override
    public int getLicor_p_av_EMEP() {
        return _vareddy.getLicor_p_av_EMEP();
    }

    /**
    * Sets the licor_p_av_ e m e p of this vareddy.
    *
    * @param licor_p_av_EMEP the licor_p_av_ e m e p of this vareddy
    */
    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _vareddy.setLicor_p_av_EMEP(licor_p_av_EMEP);
    }

    /**
    * Returns the h_sub of this vareddy.
    *
    * @return the h_sub of this vareddy
    */
    @Override
    public float getH_sub() {
        return _vareddy.getH_sub();
    }

    /**
    * Sets the h_sub of this vareddy.
    *
    * @param H_sub the h_sub of this vareddy
    */
    @Override
    public void setH_sub(float H_sub) {
        _vareddy.setH_sub(H_sub);
    }

    /**
    * Returns the h_sub_ e m e p of this vareddy.
    *
    * @return the h_sub_ e m e p of this vareddy
    */
    @Override
    public int getH_sub_EMEP() {
        return _vareddy.getH_sub_EMEP();
    }

    /**
    * Sets the h_sub_ e m e p of this vareddy.
    *
    * @param H_sub_EMEP the h_sub_ e m e p of this vareddy
    */
    @Override
    public void setH_sub_EMEP(int H_sub_EMEP) {
        _vareddy.setH_sub_EMEP(H_sub_EMEP);
    }

    /**
    * Returns the l e_sub of this vareddy.
    *
    * @return the l e_sub of this vareddy
    */
    @Override
    public float getLE_sub() {
        return _vareddy.getLE_sub();
    }

    /**
    * Sets the l e_sub of this vareddy.
    *
    * @param LE_sub the l e_sub of this vareddy
    */
    @Override
    public void setLE_sub(float LE_sub) {
        _vareddy.setLE_sub(LE_sub);
    }

    /**
    * Returns the l e_sub_ e m e p of this vareddy.
    *
    * @return the l e_sub_ e m e p of this vareddy
    */
    @Override
    public int getLE_sub_EMEP() {
        return _vareddy.getLE_sub_EMEP();
    }

    /**
    * Sets the l e_sub_ e m e p of this vareddy.
    *
    * @param LE_sub_EMEP the l e_sub_ e m e p of this vareddy
    */
    @Override
    public void setLE_sub_EMEP(int LE_sub_EMEP) {
        _vareddy.setLE_sub_EMEP(LE_sub_EMEP);
    }

    /**
    * Returns the e_sub of this vareddy.
    *
    * @return the e_sub of this vareddy
    */
    @Override
    public float getE_sub() {
        return _vareddy.getE_sub();
    }

    /**
    * Sets the e_sub of this vareddy.
    *
    * @param E_sub the e_sub of this vareddy
    */
    @Override
    public void setE_sub(float E_sub) {
        _vareddy.setE_sub(E_sub);
    }

    /**
    * Returns the e_sub_ e m e p of this vareddy.
    *
    * @return the e_sub_ e m e p of this vareddy
    */
    @Override
    public int getE_sub_EMEP() {
        return _vareddy.getE_sub_EMEP();
    }

    /**
    * Sets the e_sub_ e m e p of this vareddy.
    *
    * @param E_sub_EMEP the e_sub_ e m e p of this vareddy
    */
    @Override
    public void setE_sub_EMEP(int E_sub_EMEP) {
        _vareddy.setE_sub_EMEP(E_sub_EMEP);
    }

    /**
    * Returns the f_c_sub of this vareddy.
    *
    * @return the f_c_sub of this vareddy
    */
    @Override
    public float getF_c_sub() {
        return _vareddy.getF_c_sub();
    }

    /**
    * Sets the f_c_sub of this vareddy.
    *
    * @param F_c_sub the f_c_sub of this vareddy
    */
    @Override
    public void setF_c_sub(float F_c_sub) {
        _vareddy.setF_c_sub(F_c_sub);
    }

    /**
    * Returns the f_c_sub_ e m e p of this vareddy.
    *
    * @return the f_c_sub_ e m e p of this vareddy
    */
    @Override
    public int getF_c_sub_EMEP() {
        return _vareddy.getF_c_sub_EMEP();
    }

    /**
    * Sets the f_c_sub_ e m e p of this vareddy.
    *
    * @param F_c_sub_EMEP the f_c_sub_ e m e p of this vareddy
    */
    @Override
    public void setF_c_sub_EMEP(int F_c_sub_EMEP) {
        _vareddy.setF_c_sub_EMEP(F_c_sub_EMEP);
    }

    /**
    * Returns the tau_sub of this vareddy.
    *
    * @return the tau_sub of this vareddy
    */
    @Override
    public float getTau_sub() {
        return _vareddy.getTau_sub();
    }

    /**
    * Sets the tau_sub of this vareddy.
    *
    * @param tau_sub the tau_sub of this vareddy
    */
    @Override
    public void setTau_sub(float tau_sub) {
        _vareddy.setTau_sub(tau_sub);
    }

    /**
    * Returns the tau_sub_ e m e p of this vareddy.
    *
    * @return the tau_sub_ e m e p of this vareddy
    */
    @Override
    public int getTau_sub_EMEP() {
        return _vareddy.getTau_sub_EMEP();
    }

    /**
    * Sets the tau_sub_ e m e p of this vareddy.
    *
    * @param tau_sub_EMEP the tau_sub_ e m e p of this vareddy
    */
    @Override
    public void setTau_sub_EMEP(int tau_sub_EMEP) {
        _vareddy.setTau_sub_EMEP(tau_sub_EMEP);
    }

    /**
    * Returns the u_star_sub of this vareddy.
    *
    * @return the u_star_sub of this vareddy
    */
    @Override
    public float getU_star_sub() {
        return _vareddy.getU_star_sub();
    }

    /**
    * Sets the u_star_sub of this vareddy.
    *
    * @param u_star_sub the u_star_sub of this vareddy
    */
    @Override
    public void setU_star_sub(float u_star_sub) {
        _vareddy.setU_star_sub(u_star_sub);
    }

    /**
    * Returns the u_star_sub_ e m e p of this vareddy.
    *
    * @return the u_star_sub_ e m e p of this vareddy
    */
    @Override
    public int getU_star_sub_EMEP() {
        return _vareddy.getU_star_sub_EMEP();
    }

    /**
    * Sets the u_star_sub_ e m e p of this vareddy.
    *
    * @param u_star_sub_EMEP the u_star_sub_ e m e p of this vareddy
    */
    @Override
    public void setU_star_sub_EMEP(int u_star_sub_EMEP) {
        _vareddy.setU_star_sub_EMEP(u_star_sub_EMEP);
    }

    /**
    * Returns the m o_length_sub of this vareddy.
    *
    * @return the m o_length_sub of this vareddy
    */
    @Override
    public float getMO_length_sub() {
        return _vareddy.getMO_length_sub();
    }

    /**
    * Sets the m o_length_sub of this vareddy.
    *
    * @param MO_length_sub the m o_length_sub of this vareddy
    */
    @Override
    public void setMO_length_sub(float MO_length_sub) {
        _vareddy.setMO_length_sub(MO_length_sub);
    }

    /**
    * Returns the m o_length_sub_ e m e p of this vareddy.
    *
    * @return the m o_length_sub_ e m e p of this vareddy
    */
    @Override
    public int getMO_length_sub_EMEP() {
        return _vareddy.getMO_length_sub_EMEP();
    }

    /**
    * Sets the m o_length_sub_ e m e p of this vareddy.
    *
    * @param MO_length_sub_EMEP the m o_length_sub_ e m e p of this vareddy
    */
    @Override
    public void setMO_length_sub_EMEP(int MO_length_sub_EMEP) {
        _vareddy.setMO_length_sub_EMEP(MO_length_sub_EMEP);
    }

    /**
    * Returns the std_u_sub of this vareddy.
    *
    * @return the std_u_sub of this vareddy
    */
    @Override
    public float getStd_u_sub() {
        return _vareddy.getStd_u_sub();
    }

    /**
    * Sets the std_u_sub of this vareddy.
    *
    * @param std_u_sub the std_u_sub of this vareddy
    */
    @Override
    public void setStd_u_sub(float std_u_sub) {
        _vareddy.setStd_u_sub(std_u_sub);
    }

    /**
    * Returns the std_u_sub_ e m e p of this vareddy.
    *
    * @return the std_u_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_u_sub_EMEP() {
        return _vareddy.getStd_u_sub_EMEP();
    }

    /**
    * Sets the std_u_sub_ e m e p of this vareddy.
    *
    * @param std_u_sub_EMEP the std_u_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_u_sub_EMEP(int std_u_sub_EMEP) {
        _vareddy.setStd_u_sub_EMEP(std_u_sub_EMEP);
    }

    /**
    * Returns the std_v_sub of this vareddy.
    *
    * @return the std_v_sub of this vareddy
    */
    @Override
    public float getStd_v_sub() {
        return _vareddy.getStd_v_sub();
    }

    /**
    * Sets the std_v_sub of this vareddy.
    *
    * @param std_v_sub the std_v_sub of this vareddy
    */
    @Override
    public void setStd_v_sub(float std_v_sub) {
        _vareddy.setStd_v_sub(std_v_sub);
    }

    /**
    * Returns the std_v_sub_ e m e p of this vareddy.
    *
    * @return the std_v_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_v_sub_EMEP() {
        return _vareddy.getStd_v_sub_EMEP();
    }

    /**
    * Sets the std_v_sub_ e m e p of this vareddy.
    *
    * @param std_v_sub_EMEP the std_v_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_v_sub_EMEP(int std_v_sub_EMEP) {
        _vareddy.setStd_v_sub_EMEP(std_v_sub_EMEP);
    }

    /**
    * Returns the std_w_sub of this vareddy.
    *
    * @return the std_w_sub of this vareddy
    */
    @Override
    public float getStd_w_sub() {
        return _vareddy.getStd_w_sub();
    }

    /**
    * Sets the std_w_sub of this vareddy.
    *
    * @param std_w_sub the std_w_sub of this vareddy
    */
    @Override
    public void setStd_w_sub(float std_w_sub) {
        _vareddy.setStd_w_sub(std_w_sub);
    }

    /**
    * Returns the std_w_sub_ e m e p of this vareddy.
    *
    * @return the std_w_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_w_sub_EMEP() {
        return _vareddy.getStd_w_sub_EMEP();
    }

    /**
    * Sets the std_w_sub_ e m e p of this vareddy.
    *
    * @param std_w_sub_EMEP the std_w_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_w_sub_EMEP(int std_w_sub_EMEP) {
        _vareddy.setStd_w_sub_EMEP(std_w_sub_EMEP);
    }

    /**
    * Returns the std_t_sub of this vareddy.
    *
    * @return the std_t_sub of this vareddy
    */
    @Override
    public float getStd_t_sub() {
        return _vareddy.getStd_t_sub();
    }

    /**
    * Sets the std_t_sub of this vareddy.
    *
    * @param std_t_sub the std_t_sub of this vareddy
    */
    @Override
    public void setStd_t_sub(float std_t_sub) {
        _vareddy.setStd_t_sub(std_t_sub);
    }

    /**
    * Returns the std_t_sub_ e m e p of this vareddy.
    *
    * @return the std_t_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_t_sub_EMEP() {
        return _vareddy.getStd_t_sub_EMEP();
    }

    /**
    * Sets the std_t_sub_ e m e p of this vareddy.
    *
    * @param std_t_sub_EMEP the std_t_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_t_sub_EMEP(int std_t_sub_EMEP) {
        _vareddy.setStd_t_sub_EMEP(std_t_sub_EMEP);
    }

    /**
    * Returns the std_c_sub of this vareddy.
    *
    * @return the std_c_sub of this vareddy
    */
    @Override
    public float getStd_c_sub() {
        return _vareddy.getStd_c_sub();
    }

    /**
    * Sets the std_c_sub of this vareddy.
    *
    * @param std_c_sub the std_c_sub of this vareddy
    */
    @Override
    public void setStd_c_sub(float std_c_sub) {
        _vareddy.setStd_c_sub(std_c_sub);
    }

    /**
    * Returns the std_c_sub_ e m e p of this vareddy.
    *
    * @return the std_c_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_c_sub_EMEP() {
        return _vareddy.getStd_c_sub_EMEP();
    }

    /**
    * Sets the std_c_sub_ e m e p of this vareddy.
    *
    * @param std_c_sub_EMEP the std_c_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_c_sub_EMEP(int std_c_sub_EMEP) {
        _vareddy.setStd_c_sub_EMEP(std_c_sub_EMEP);
    }

    /**
    * Returns the std_h_sub of this vareddy.
    *
    * @return the std_h_sub of this vareddy
    */
    @Override
    public float getStd_h_sub() {
        return _vareddy.getStd_h_sub();
    }

    /**
    * Sets the std_h_sub of this vareddy.
    *
    * @param std_h_sub the std_h_sub of this vareddy
    */
    @Override
    public void setStd_h_sub(float std_h_sub) {
        _vareddy.setStd_h_sub(std_h_sub);
    }

    /**
    * Returns the std_h_sub_ e m e p of this vareddy.
    *
    * @return the std_h_sub_ e m e p of this vareddy
    */
    @Override
    public int getStd_h_sub_EMEP() {
        return _vareddy.getStd_h_sub_EMEP();
    }

    /**
    * Sets the std_h_sub_ e m e p of this vareddy.
    *
    * @param std_h_sub_EMEP the std_h_sub_ e m e p of this vareddy
    */
    @Override
    public void setStd_h_sub_EMEP(int std_h_sub_EMEP) {
        _vareddy.setStd_h_sub_EMEP(std_h_sub_EMEP);
    }

    /**
    * Returns the av_u_sub of this vareddy.
    *
    * @return the av_u_sub of this vareddy
    */
    @Override
    public float getAv_u_sub() {
        return _vareddy.getAv_u_sub();
    }

    /**
    * Sets the av_u_sub of this vareddy.
    *
    * @param av_u_sub the av_u_sub of this vareddy
    */
    @Override
    public void setAv_u_sub(float av_u_sub) {
        _vareddy.setAv_u_sub(av_u_sub);
    }

    /**
    * Returns the av_u_sub_ e m e p of this vareddy.
    *
    * @return the av_u_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_u_sub_EMEP() {
        return _vareddy.getAv_u_sub_EMEP();
    }

    /**
    * Sets the av_u_sub_ e m e p of this vareddy.
    *
    * @param av_u_sub_EMEP the av_u_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_u_sub_EMEP(int av_u_sub_EMEP) {
        _vareddy.setAv_u_sub_EMEP(av_u_sub_EMEP);
    }

    /**
    * Returns the av_v_sub of this vareddy.
    *
    * @return the av_v_sub of this vareddy
    */
    @Override
    public float getAv_v_sub() {
        return _vareddy.getAv_v_sub();
    }

    /**
    * Sets the av_v_sub of this vareddy.
    *
    * @param av_v_sub the av_v_sub of this vareddy
    */
    @Override
    public void setAv_v_sub(float av_v_sub) {
        _vareddy.setAv_v_sub(av_v_sub);
    }

    /**
    * Returns the av_v_sub_ e m e p of this vareddy.
    *
    * @return the av_v_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_v_sub_EMEP() {
        return _vareddy.getAv_v_sub_EMEP();
    }

    /**
    * Sets the av_v_sub_ e m e p of this vareddy.
    *
    * @param av_v_sub_EMEP the av_v_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_v_sub_EMEP(int av_v_sub_EMEP) {
        _vareddy.setAv_v_sub_EMEP(av_v_sub_EMEP);
    }

    /**
    * Returns the av_w_sub of this vareddy.
    *
    * @return the av_w_sub of this vareddy
    */
    @Override
    public float getAv_w_sub() {
        return _vareddy.getAv_w_sub();
    }

    /**
    * Sets the av_w_sub of this vareddy.
    *
    * @param av_w_sub the av_w_sub of this vareddy
    */
    @Override
    public void setAv_w_sub(float av_w_sub) {
        _vareddy.setAv_w_sub(av_w_sub);
    }

    /**
    * Returns the av_w_sub_ e m e p of this vareddy.
    *
    * @return the av_w_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_w_sub_EMEP() {
        return _vareddy.getAv_w_sub_EMEP();
    }

    /**
    * Sets the av_w_sub_ e m e p of this vareddy.
    *
    * @param av_w_sub_EMEP the av_w_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_w_sub_EMEP(int av_w_sub_EMEP) {
        _vareddy.setAv_w_sub_EMEP(av_w_sub_EMEP);
    }

    /**
    * Returns the av_t_sub of this vareddy.
    *
    * @return the av_t_sub of this vareddy
    */
    @Override
    public float getAv_t_sub() {
        return _vareddy.getAv_t_sub();
    }

    /**
    * Sets the av_t_sub of this vareddy.
    *
    * @param av_t_sub the av_t_sub of this vareddy
    */
    @Override
    public void setAv_t_sub(float av_t_sub) {
        _vareddy.setAv_t_sub(av_t_sub);
    }

    /**
    * Returns the av_t_sub_ e m e p of this vareddy.
    *
    * @return the av_t_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_t_sub_EMEP() {
        return _vareddy.getAv_t_sub_EMEP();
    }

    /**
    * Sets the av_t_sub_ e m e p of this vareddy.
    *
    * @param av_t_sub_EMEP the av_t_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_t_sub_EMEP(int av_t_sub_EMEP) {
        _vareddy.setAv_t_sub_EMEP(av_t_sub_EMEP);
    }

    /**
    * Returns the av_c_sub of this vareddy.
    *
    * @return the av_c_sub of this vareddy
    */
    @Override
    public float getAv_c_sub() {
        return _vareddy.getAv_c_sub();
    }

    /**
    * Sets the av_c_sub of this vareddy.
    *
    * @param av_c_sub the av_c_sub of this vareddy
    */
    @Override
    public void setAv_c_sub(float av_c_sub) {
        _vareddy.setAv_c_sub(av_c_sub);
    }

    /**
    * Returns the av_c_sub_ e m e p of this vareddy.
    *
    * @return the av_c_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_c_sub_EMEP() {
        return _vareddy.getAv_c_sub_EMEP();
    }

    /**
    * Sets the av_c_sub_ e m e p of this vareddy.
    *
    * @param av_c_sub_EMEP the av_c_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_c_sub_EMEP(int av_c_sub_EMEP) {
        _vareddy.setAv_c_sub_EMEP(av_c_sub_EMEP);
    }

    /**
    * Returns the av_h_sub of this vareddy.
    *
    * @return the av_h_sub of this vareddy
    */
    @Override
    public float getAv_h_sub() {
        return _vareddy.getAv_h_sub();
    }

    /**
    * Sets the av_h_sub of this vareddy.
    *
    * @param av_h_sub the av_h_sub of this vareddy
    */
    @Override
    public void setAv_h_sub(float av_h_sub) {
        _vareddy.setAv_h_sub(av_h_sub);
    }

    /**
    * Returns the av_h_sub_ e m e p of this vareddy.
    *
    * @return the av_h_sub_ e m e p of this vareddy
    */
    @Override
    public int getAv_h_sub_EMEP() {
        return _vareddy.getAv_h_sub_EMEP();
    }

    /**
    * Sets the av_h_sub_ e m e p of this vareddy.
    *
    * @param av_h_sub_EMEP the av_h_sub_ e m e p of this vareddy
    */
    @Override
    public void setAv_h_sub_EMEP(int av_h_sub_EMEP) {
        _vareddy.setAv_h_sub_EMEP(av_h_sub_EMEP);
    }

    /**
    * Returns the u_sub of this vareddy.
    *
    * @return the u_sub of this vareddy
    */
    @Override
    public float getU_sub() {
        return _vareddy.getU_sub();
    }

    /**
    * Sets the u_sub of this vareddy.
    *
    * @param U_sub the u_sub of this vareddy
    */
    @Override
    public void setU_sub(float U_sub) {
        _vareddy.setU_sub(U_sub);
    }

    /**
    * Returns the u_sub_ e m e p of this vareddy.
    *
    * @return the u_sub_ e m e p of this vareddy
    */
    @Override
    public int getU_sub_EMEP() {
        return _vareddy.getU_sub_EMEP();
    }

    /**
    * Sets the u_sub_ e m e p of this vareddy.
    *
    * @param U_sub_EMEP the u_sub_ e m e p of this vareddy
    */
    @Override
    public void setU_sub_EMEP(int U_sub_EMEP) {
        _vareddy.setU_sub_EMEP(U_sub_EMEP);
    }

    /**
    * Returns the wind_dir_sub of this vareddy.
    *
    * @return the wind_dir_sub of this vareddy
    */
    @Override
    public float getWind_dir_sub() {
        return _vareddy.getWind_dir_sub();
    }

    /**
    * Sets the wind_dir_sub of this vareddy.
    *
    * @param wind_dir_sub the wind_dir_sub of this vareddy
    */
    @Override
    public void setWind_dir_sub(float wind_dir_sub) {
        _vareddy.setWind_dir_sub(wind_dir_sub);
    }

    /**
    * Returns the wind_dir_sub_ e m e p of this vareddy.
    *
    * @return the wind_dir_sub_ e m e p of this vareddy
    */
    @Override
    public int getWind_dir_sub_EMEP() {
        return _vareddy.getWind_dir_sub_EMEP();
    }

    /**
    * Sets the wind_dir_sub_ e m e p of this vareddy.
    *
    * @param wind_dir_sub_EMEP the wind_dir_sub_ e m e p of this vareddy
    */
    @Override
    public void setWind_dir_sub_EMEP(int wind_dir_sub_EMEP) {
        _vareddy.setWind_dir_sub_EMEP(wind_dir_sub_EMEP);
    }

    @Override
    public boolean isNew() {
        return _vareddy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _vareddy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _vareddy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _vareddy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _vareddy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _vareddy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _vareddy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _vareddy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _vareddy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _vareddy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _vareddy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VareddyWrapper((Vareddy) _vareddy.clone());
    }

    @Override
    public int compareTo(Vareddy vareddy) {
        return _vareddy.compareTo(vareddy);
    }

    @Override
    public int hashCode() {
        return _vareddy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Vareddy> toCacheModel() {
        return _vareddy.toCacheModel();
    }

    @Override
    public Vareddy toEscapedModel() {
        return new VareddyWrapper(_vareddy.toEscapedModel());
    }

    @Override
    public Vareddy toUnescapedModel() {
        return new VareddyWrapper(_vareddy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _vareddy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _vareddy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _vareddy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VareddyWrapper)) {
            return false;
        }

        VareddyWrapper vareddyWrapper = (VareddyWrapper) obj;

        if (Validator.equals(_vareddy, vareddyWrapper._vareddy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Vareddy getWrappedVareddy() {
        return _vareddy;
    }

    @Override
    public Vareddy getWrappedModel() {
        return _vareddy;
    }

    @Override
    public void resetOriginalValues() {
        _vareddy.resetOriginalValues();
    }
}
