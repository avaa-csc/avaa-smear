package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Towermeta}.
 * </p>
 *
 * @author pj
 * @see Towermeta
 * @generated
 */
public class TowermetaWrapper implements Towermeta, ModelWrapper<Towermeta> {
    private Towermeta _towermeta;

    public TowermetaWrapper(Towermeta towermeta) {
        _towermeta = towermeta;
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

    /**
    * Returns the primary key of this towermeta.
    *
    * @return the primary key of this towermeta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _towermeta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this towermeta.
    *
    * @param primaryKey the primary key of this towermeta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _towermeta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this towermeta.
    *
    * @return the samptime of this towermeta
    */
    @Override
    public java.util.Date getSamptime() {
        return _towermeta.getSamptime();
    }

    /**
    * Sets the samptime of this towermeta.
    *
    * @param samptime the samptime of this towermeta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _towermeta.setSamptime(samptime);
    }

    /**
    * Returns the h of this towermeta.
    *
    * @return the h of this towermeta
    */
    @Override
    public float getH() {
        return _towermeta.getH();
    }

    /**
    * Sets the h of this towermeta.
    *
    * @param H the h of this towermeta
    */
    @Override
    public void setH(float H) {
        _towermeta.setH(H);
    }

    /**
    * Returns the h_ e m e p of this towermeta.
    *
    * @return the h_ e m e p of this towermeta
    */
    @Override
    public int getH_EMEP() {
        return _towermeta.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this towermeta.
    *
    * @param H_EMEP the h_ e m e p of this towermeta
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _towermeta.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the qc_ h of this towermeta.
    *
    * @return the qc_ h of this towermeta
    */
    @Override
    public int getQc_H() {
        return _towermeta.getQc_H();
    }

    /**
    * Sets the qc_ h of this towermeta.
    *
    * @param Qc_H the qc_ h of this towermeta
    */
    @Override
    public void setQc_H(int Qc_H) {
        _towermeta.setQc_H(Qc_H);
    }

    /**
    * Returns the qc_ h_ e m e p of this towermeta.
    *
    * @return the qc_ h_ e m e p of this towermeta
    */
    @Override
    public int getQc_H_EMEP() {
        return _towermeta.getQc_H_EMEP();
    }

    /**
    * Sets the qc_ h_ e m e p of this towermeta.
    *
    * @param Qc_H_EMEP the qc_ h_ e m e p of this towermeta
    */
    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _towermeta.setQc_H_EMEP(Qc_H_EMEP);
    }

    /**
    * Returns the l e of this towermeta.
    *
    * @return the l e of this towermeta
    */
    @Override
    public float getLE() {
        return _towermeta.getLE();
    }

    /**
    * Sets the l e of this towermeta.
    *
    * @param LE the l e of this towermeta
    */
    @Override
    public void setLE(float LE) {
        _towermeta.setLE(LE);
    }

    /**
    * Returns the l e_ e m e p of this towermeta.
    *
    * @return the l e_ e m e p of this towermeta
    */
    @Override
    public int getLE_EMEP() {
        return _towermeta.getLE_EMEP();
    }

    /**
    * Sets the l e_ e m e p of this towermeta.
    *
    * @param LE_EMEP the l e_ e m e p of this towermeta
    */
    @Override
    public void setLE_EMEP(int LE_EMEP) {
        _towermeta.setLE_EMEP(LE_EMEP);
    }

    /**
    * Returns the qc_ l e of this towermeta.
    *
    * @return the qc_ l e of this towermeta
    */
    @Override
    public int getQc_LE() {
        return _towermeta.getQc_LE();
    }

    /**
    * Sets the qc_ l e of this towermeta.
    *
    * @param Qc_LE the qc_ l e of this towermeta
    */
    @Override
    public void setQc_LE(int Qc_LE) {
        _towermeta.setQc_LE(Qc_LE);
    }

    /**
    * Returns the qc_ l e_ e m e p of this towermeta.
    *
    * @return the qc_ l e_ e m e p of this towermeta
    */
    @Override
    public int getQc_LE_EMEP() {
        return _towermeta.getQc_LE_EMEP();
    }

    /**
    * Sets the qc_ l e_ e m e p of this towermeta.
    *
    * @param Qc_LE_EMEP the qc_ l e_ e m e p of this towermeta
    */
    @Override
    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _towermeta.setQc_LE_EMEP(Qc_LE_EMEP);
    }

    /**
    * Returns the e of this towermeta.
    *
    * @return the e of this towermeta
    */
    @Override
    public float getE() {
        return _towermeta.getE();
    }

    /**
    * Sets the e of this towermeta.
    *
    * @param E the e of this towermeta
    */
    @Override
    public void setE(float E) {
        _towermeta.setE(E);
    }

    /**
    * Returns the e_ e m e p of this towermeta.
    *
    * @return the e_ e m e p of this towermeta
    */
    @Override
    public int getE_EMEP() {
        return _towermeta.getE_EMEP();
    }

    /**
    * Sets the e_ e m e p of this towermeta.
    *
    * @param E_EMEP the e_ e m e p of this towermeta
    */
    @Override
    public void setE_EMEP(int E_EMEP) {
        _towermeta.setE_EMEP(E_EMEP);
    }

    /**
    * Returns the qc_ e of this towermeta.
    *
    * @return the qc_ e of this towermeta
    */
    @Override
    public int getQc_E() {
        return _towermeta.getQc_E();
    }

    /**
    * Sets the qc_ e of this towermeta.
    *
    * @param Qc_E the qc_ e of this towermeta
    */
    @Override
    public void setQc_E(int Qc_E) {
        _towermeta.setQc_E(Qc_E);
    }

    /**
    * Returns the qc_ e_ e m e p of this towermeta.
    *
    * @return the qc_ e_ e m e p of this towermeta
    */
    @Override
    public int getQc_E_EMEP() {
        return _towermeta.getQc_E_EMEP();
    }

    /**
    * Sets the qc_ e_ e m e p of this towermeta.
    *
    * @param Qc_E_EMEP the qc_ e_ e m e p of this towermeta
    */
    @Override
    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _towermeta.setQc_E_EMEP(Qc_E_EMEP);
    }

    /**
    * Returns the f_c of this towermeta.
    *
    * @return the f_c of this towermeta
    */
    @Override
    public float getF_c() {
        return _towermeta.getF_c();
    }

    /**
    * Sets the f_c of this towermeta.
    *
    * @param F_c the f_c of this towermeta
    */
    @Override
    public void setF_c(float F_c) {
        _towermeta.setF_c(F_c);
    }

    /**
    * Returns the f_c_ e m e p of this towermeta.
    *
    * @return the f_c_ e m e p of this towermeta
    */
    @Override
    public int getF_c_EMEP() {
        return _towermeta.getF_c_EMEP();
    }

    /**
    * Sets the f_c_ e m e p of this towermeta.
    *
    * @param F_c_EMEP the f_c_ e m e p of this towermeta
    */
    @Override
    public void setF_c_EMEP(int F_c_EMEP) {
        _towermeta.setF_c_EMEP(F_c_EMEP);
    }

    /**
    * Returns the qc_ f_c of this towermeta.
    *
    * @return the qc_ f_c of this towermeta
    */
    @Override
    public int getQc_F_c() {
        return _towermeta.getQc_F_c();
    }

    /**
    * Sets the qc_ f_c of this towermeta.
    *
    * @param Qc_F_c the qc_ f_c of this towermeta
    */
    @Override
    public void setQc_F_c(int Qc_F_c) {
        _towermeta.setQc_F_c(Qc_F_c);
    }

    /**
    * Returns the qc_ f_c_ e m e p of this towermeta.
    *
    * @return the qc_ f_c_ e m e p of this towermeta
    */
    @Override
    public int getQc_F_c_EMEP() {
        return _towermeta.getQc_F_c_EMEP();
    }

    /**
    * Sets the qc_ f_c_ e m e p of this towermeta.
    *
    * @param Qc_F_c_EMEP the qc_ f_c_ e m e p of this towermeta
    */
    @Override
    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _towermeta.setQc_F_c_EMEP(Qc_F_c_EMEP);
    }

    /**
    * Returns the tau of this towermeta.
    *
    * @return the tau of this towermeta
    */
    @Override
    public float getTau() {
        return _towermeta.getTau();
    }

    /**
    * Sets the tau of this towermeta.
    *
    * @param tau the tau of this towermeta
    */
    @Override
    public void setTau(float tau) {
        _towermeta.setTau(tau);
    }

    /**
    * Returns the tau_ e m e p of this towermeta.
    *
    * @return the tau_ e m e p of this towermeta
    */
    @Override
    public int getTau_EMEP() {
        return _towermeta.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this towermeta.
    *
    * @param tau_EMEP the tau_ e m e p of this towermeta
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _towermeta.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the qc_tau of this towermeta.
    *
    * @return the qc_tau of this towermeta
    */
    @Override
    public int getQc_tau() {
        return _towermeta.getQc_tau();
    }

    /**
    * Sets the qc_tau of this towermeta.
    *
    * @param Qc_tau the qc_tau of this towermeta
    */
    @Override
    public void setQc_tau(int Qc_tau) {
        _towermeta.setQc_tau(Qc_tau);
    }

    /**
    * Returns the qc_tau_ e m e p of this towermeta.
    *
    * @return the qc_tau_ e m e p of this towermeta
    */
    @Override
    public int getQc_tau_EMEP() {
        return _towermeta.getQc_tau_EMEP();
    }

    /**
    * Sets the qc_tau_ e m e p of this towermeta.
    *
    * @param Qc_tau_EMEP the qc_tau_ e m e p of this towermeta
    */
    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _towermeta.setQc_tau_EMEP(Qc_tau_EMEP);
    }

    /**
    * Returns the u_star of this towermeta.
    *
    * @return the u_star of this towermeta
    */
    @Override
    public float getU_star() {
        return _towermeta.getU_star();
    }

    /**
    * Sets the u_star of this towermeta.
    *
    * @param u_star the u_star of this towermeta
    */
    @Override
    public void setU_star(float u_star) {
        _towermeta.setU_star(u_star);
    }

    /**
    * Returns the u_star_ e m e p of this towermeta.
    *
    * @return the u_star_ e m e p of this towermeta
    */
    @Override
    public int getU_star_EMEP() {
        return _towermeta.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this towermeta.
    *
    * @param u_star_EMEP the u_star_ e m e p of this towermeta
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _towermeta.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length of this towermeta.
    *
    * @return the m o_length of this towermeta
    */
    @Override
    public float getMO_length() {
        return _towermeta.getMO_length();
    }

    /**
    * Sets the m o_length of this towermeta.
    *
    * @param MO_length the m o_length of this towermeta
    */
    @Override
    public void setMO_length(float MO_length) {
        _towermeta.setMO_length(MO_length);
    }

    /**
    * Returns the m o_length_ e m e p of this towermeta.
    *
    * @return the m o_length_ e m e p of this towermeta
    */
    @Override
    public int getMO_length_EMEP() {
        return _towermeta.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this towermeta.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this towermeta
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _towermeta.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the std_u of this towermeta.
    *
    * @return the std_u of this towermeta
    */
    @Override
    public float getStd_u() {
        return _towermeta.getStd_u();
    }

    /**
    * Sets the std_u of this towermeta.
    *
    * @param std_u the std_u of this towermeta
    */
    @Override
    public void setStd_u(float std_u) {
        _towermeta.setStd_u(std_u);
    }

    /**
    * Returns the std_u_ e m e p of this towermeta.
    *
    * @return the std_u_ e m e p of this towermeta
    */
    @Override
    public int getStd_u_EMEP() {
        return _towermeta.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this towermeta.
    *
    * @param std_u_EMEP the std_u_ e m e p of this towermeta
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _towermeta.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v of this towermeta.
    *
    * @return the std_v of this towermeta
    */
    @Override
    public float getStd_v() {
        return _towermeta.getStd_v();
    }

    /**
    * Sets the std_v of this towermeta.
    *
    * @param std_v the std_v of this towermeta
    */
    @Override
    public void setStd_v(float std_v) {
        _towermeta.setStd_v(std_v);
    }

    /**
    * Returns the std_v_ e m e p of this towermeta.
    *
    * @return the std_v_ e m e p of this towermeta
    */
    @Override
    public int getStd_v_EMEP() {
        return _towermeta.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this towermeta.
    *
    * @param std_v_EMEP the std_v_ e m e p of this towermeta
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _towermeta.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w of this towermeta.
    *
    * @return the std_w of this towermeta
    */
    @Override
    public float getStd_w() {
        return _towermeta.getStd_w();
    }

    /**
    * Sets the std_w of this towermeta.
    *
    * @param std_w the std_w of this towermeta
    */
    @Override
    public void setStd_w(float std_w) {
        _towermeta.setStd_w(std_w);
    }

    /**
    * Returns the std_w_ e m e p of this towermeta.
    *
    * @return the std_w_ e m e p of this towermeta
    */
    @Override
    public int getStd_w_EMEP() {
        return _towermeta.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this towermeta.
    *
    * @param std_w_EMEP the std_w_ e m e p of this towermeta
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _towermeta.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the std_t of this towermeta.
    *
    * @return the std_t of this towermeta
    */
    @Override
    public float getStd_t() {
        return _towermeta.getStd_t();
    }

    /**
    * Sets the std_t of this towermeta.
    *
    * @param std_t the std_t of this towermeta
    */
    @Override
    public void setStd_t(float std_t) {
        _towermeta.setStd_t(std_t);
    }

    /**
    * Returns the std_t_ e m e p of this towermeta.
    *
    * @return the std_t_ e m e p of this towermeta
    */
    @Override
    public int getStd_t_EMEP() {
        return _towermeta.getStd_t_EMEP();
    }

    /**
    * Sets the std_t_ e m e p of this towermeta.
    *
    * @param std_t_EMEP the std_t_ e m e p of this towermeta
    */
    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _towermeta.setStd_t_EMEP(std_t_EMEP);
    }

    /**
    * Returns the std_c of this towermeta.
    *
    * @return the std_c of this towermeta
    */
    @Override
    public float getStd_c() {
        return _towermeta.getStd_c();
    }

    /**
    * Sets the std_c of this towermeta.
    *
    * @param std_c the std_c of this towermeta
    */
    @Override
    public void setStd_c(float std_c) {
        _towermeta.setStd_c(std_c);
    }

    /**
    * Returns the std_c_ e m e p of this towermeta.
    *
    * @return the std_c_ e m e p of this towermeta
    */
    @Override
    public int getStd_c_EMEP() {
        return _towermeta.getStd_c_EMEP();
    }

    /**
    * Sets the std_c_ e m e p of this towermeta.
    *
    * @param std_c_EMEP the std_c_ e m e p of this towermeta
    */
    @Override
    public void setStd_c_EMEP(int std_c_EMEP) {
        _towermeta.setStd_c_EMEP(std_c_EMEP);
    }

    /**
    * Returns the std_h of this towermeta.
    *
    * @return the std_h of this towermeta
    */
    @Override
    public float getStd_h() {
        return _towermeta.getStd_h();
    }

    /**
    * Sets the std_h of this towermeta.
    *
    * @param std_h the std_h of this towermeta
    */
    @Override
    public void setStd_h(float std_h) {
        _towermeta.setStd_h(std_h);
    }

    /**
    * Returns the std_h_ e m e p of this towermeta.
    *
    * @return the std_h_ e m e p of this towermeta
    */
    @Override
    public int getStd_h_EMEP() {
        return _towermeta.getStd_h_EMEP();
    }

    /**
    * Sets the std_h_ e m e p of this towermeta.
    *
    * @param std_h_EMEP the std_h_ e m e p of this towermeta
    */
    @Override
    public void setStd_h_EMEP(int std_h_EMEP) {
        _towermeta.setStd_h_EMEP(std_h_EMEP);
    }

    /**
    * Returns the av_u of this towermeta.
    *
    * @return the av_u of this towermeta
    */
    @Override
    public float getAv_u() {
        return _towermeta.getAv_u();
    }

    /**
    * Sets the av_u of this towermeta.
    *
    * @param av_u the av_u of this towermeta
    */
    @Override
    public void setAv_u(float av_u) {
        _towermeta.setAv_u(av_u);
    }

    /**
    * Returns the av_u_ e m e p of this towermeta.
    *
    * @return the av_u_ e m e p of this towermeta
    */
    @Override
    public int getAv_u_EMEP() {
        return _towermeta.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this towermeta.
    *
    * @param av_u_EMEP the av_u_ e m e p of this towermeta
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _towermeta.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v of this towermeta.
    *
    * @return the av_v of this towermeta
    */
    @Override
    public float getAv_v() {
        return _towermeta.getAv_v();
    }

    /**
    * Sets the av_v of this towermeta.
    *
    * @param av_v the av_v of this towermeta
    */
    @Override
    public void setAv_v(float av_v) {
        _towermeta.setAv_v(av_v);
    }

    /**
    * Returns the av_v_ e m e p of this towermeta.
    *
    * @return the av_v_ e m e p of this towermeta
    */
    @Override
    public int getAv_v_EMEP() {
        return _towermeta.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this towermeta.
    *
    * @param av_v_EMEP the av_v_ e m e p of this towermeta
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _towermeta.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w of this towermeta.
    *
    * @return the av_w of this towermeta
    */
    @Override
    public float getAv_w() {
        return _towermeta.getAv_w();
    }

    /**
    * Sets the av_w of this towermeta.
    *
    * @param av_w the av_w of this towermeta
    */
    @Override
    public void setAv_w(float av_w) {
        _towermeta.setAv_w(av_w);
    }

    /**
    * Returns the av_w_ e m e p of this towermeta.
    *
    * @return the av_w_ e m e p of this towermeta
    */
    @Override
    public int getAv_w_EMEP() {
        return _towermeta.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this towermeta.
    *
    * @param av_w_EMEP the av_w_ e m e p of this towermeta
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _towermeta.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the av_t of this towermeta.
    *
    * @return the av_t of this towermeta
    */
    @Override
    public float getAv_t() {
        return _towermeta.getAv_t();
    }

    /**
    * Sets the av_t of this towermeta.
    *
    * @param av_t the av_t of this towermeta
    */
    @Override
    public void setAv_t(float av_t) {
        _towermeta.setAv_t(av_t);
    }

    /**
    * Returns the av_t_ e m e p of this towermeta.
    *
    * @return the av_t_ e m e p of this towermeta
    */
    @Override
    public int getAv_t_EMEP() {
        return _towermeta.getAv_t_EMEP();
    }

    /**
    * Sets the av_t_ e m e p of this towermeta.
    *
    * @param av_t_EMEP the av_t_ e m e p of this towermeta
    */
    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _towermeta.setAv_t_EMEP(av_t_EMEP);
    }

    /**
    * Returns the av_c of this towermeta.
    *
    * @return the av_c of this towermeta
    */
    @Override
    public float getAv_c() {
        return _towermeta.getAv_c();
    }

    /**
    * Sets the av_c of this towermeta.
    *
    * @param av_c the av_c of this towermeta
    */
    @Override
    public void setAv_c(float av_c) {
        _towermeta.setAv_c(av_c);
    }

    /**
    * Returns the av_c_ e m e p of this towermeta.
    *
    * @return the av_c_ e m e p of this towermeta
    */
    @Override
    public int getAv_c_EMEP() {
        return _towermeta.getAv_c_EMEP();
    }

    /**
    * Sets the av_c_ e m e p of this towermeta.
    *
    * @param av_c_EMEP the av_c_ e m e p of this towermeta
    */
    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _towermeta.setAv_c_EMEP(av_c_EMEP);
    }

    /**
    * Returns the av_h of this towermeta.
    *
    * @return the av_h of this towermeta
    */
    @Override
    public float getAv_h() {
        return _towermeta.getAv_h();
    }

    /**
    * Sets the av_h of this towermeta.
    *
    * @param av_h the av_h of this towermeta
    */
    @Override
    public void setAv_h(float av_h) {
        _towermeta.setAv_h(av_h);
    }

    /**
    * Returns the av_h_ e m e p of this towermeta.
    *
    * @return the av_h_ e m e p of this towermeta
    */
    @Override
    public int getAv_h_EMEP() {
        return _towermeta.getAv_h_EMEP();
    }

    /**
    * Sets the av_h_ e m e p of this towermeta.
    *
    * @param av_h_EMEP the av_h_ e m e p of this towermeta
    */
    @Override
    public void setAv_h_EMEP(int av_h_EMEP) {
        _towermeta.setAv_h_EMEP(av_h_EMEP);
    }

    /**
    * Returns the u of this towermeta.
    *
    * @return the u of this towermeta
    */
    @Override
    public float getU() {
        return _towermeta.getU();
    }

    /**
    * Sets the u of this towermeta.
    *
    * @param U the u of this towermeta
    */
    @Override
    public void setU(float U) {
        _towermeta.setU(U);
    }

    /**
    * Returns the u_ e m e p of this towermeta.
    *
    * @return the u_ e m e p of this towermeta
    */
    @Override
    public int getU_EMEP() {
        return _towermeta.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this towermeta.
    *
    * @param U_EMEP the u_ e m e p of this towermeta
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _towermeta.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir of this towermeta.
    *
    * @return the wind_dir of this towermeta
    */
    @Override
    public float getWind_dir() {
        return _towermeta.getWind_dir();
    }

    /**
    * Sets the wind_dir of this towermeta.
    *
    * @param wind_dir the wind_dir of this towermeta
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _towermeta.setWind_dir(wind_dir);
    }

    /**
    * Returns the wind_dir_ e m e p of this towermeta.
    *
    * @return the wind_dir_ e m e p of this towermeta
    */
    @Override
    public int getWind_dir_EMEP() {
        return _towermeta.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this towermeta.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this towermeta
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _towermeta.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the eta of this towermeta.
    *
    * @return the eta of this towermeta
    */
    @Override
    public float getEta() {
        return _towermeta.getEta();
    }

    /**
    * Sets the eta of this towermeta.
    *
    * @param eta the eta of this towermeta
    */
    @Override
    public void setEta(float eta) {
        _towermeta.setEta(eta);
    }

    /**
    * Returns the eta_ e m e p of this towermeta.
    *
    * @return the eta_ e m e p of this towermeta
    */
    @Override
    public int getEta_EMEP() {
        return _towermeta.getEta_EMEP();
    }

    /**
    * Sets the eta_ e m e p of this towermeta.
    *
    * @param eta_EMEP the eta_ e m e p of this towermeta
    */
    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _towermeta.setEta_EMEP(eta_EMEP);
    }

    /**
    * Returns the theta of this towermeta.
    *
    * @return the theta of this towermeta
    */
    @Override
    public float getTheta() {
        return _towermeta.getTheta();
    }

    /**
    * Sets the theta of this towermeta.
    *
    * @param theta the theta of this towermeta
    */
    @Override
    public void setTheta(float theta) {
        _towermeta.setTheta(theta);
    }

    /**
    * Returns the theta_ e m e p of this towermeta.
    *
    * @return the theta_ e m e p of this towermeta
    */
    @Override
    public int getTheta_EMEP() {
        return _towermeta.getTheta_EMEP();
    }

    /**
    * Sets the theta_ e m e p of this towermeta.
    *
    * @param theta_EMEP the theta_ e m e p of this towermeta
    */
    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _towermeta.setTheta_EMEP(theta_EMEP);
    }

    /**
    * Returns the beta of this towermeta.
    *
    * @return the beta of this towermeta
    */
    @Override
    public float getBeta() {
        return _towermeta.getBeta();
    }

    /**
    * Sets the beta of this towermeta.
    *
    * @param beta the beta of this towermeta
    */
    @Override
    public void setBeta(float beta) {
        _towermeta.setBeta(beta);
    }

    /**
    * Returns the beta_ e m e p of this towermeta.
    *
    * @return the beta_ e m e p of this towermeta
    */
    @Override
    public int getBeta_EMEP() {
        return _towermeta.getBeta_EMEP();
    }

    /**
    * Sets the beta_ e m e p of this towermeta.
    *
    * @param beta_EMEP the beta_ e m e p of this towermeta
    */
    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _towermeta.setBeta_EMEP(beta_EMEP);
    }

    /**
    * Returns the c_lag of this towermeta.
    *
    * @return the c_lag of this towermeta
    */
    @Override
    public float getC_lag() {
        return _towermeta.getC_lag();
    }

    /**
    * Sets the c_lag of this towermeta.
    *
    * @param c_lag the c_lag of this towermeta
    */
    @Override
    public void setC_lag(float c_lag) {
        _towermeta.setC_lag(c_lag);
    }

    /**
    * Returns the c_lag_ e m e p of this towermeta.
    *
    * @return the c_lag_ e m e p of this towermeta
    */
    @Override
    public int getC_lag_EMEP() {
        return _towermeta.getC_lag_EMEP();
    }

    /**
    * Sets the c_lag_ e m e p of this towermeta.
    *
    * @param c_lag_EMEP the c_lag_ e m e p of this towermeta
    */
    @Override
    public void setC_lag_EMEP(int c_lag_EMEP) {
        _towermeta.setC_lag_EMEP(c_lag_EMEP);
    }

    /**
    * Returns the h_lag of this towermeta.
    *
    * @return the h_lag of this towermeta
    */
    @Override
    public float getH_lag() {
        return _towermeta.getH_lag();
    }

    /**
    * Sets the h_lag of this towermeta.
    *
    * @param h_lag the h_lag of this towermeta
    */
    @Override
    public void setH_lag(float h_lag) {
        _towermeta.setH_lag(h_lag);
    }

    /**
    * Returns the h_lag_ e m e p of this towermeta.
    *
    * @return the h_lag_ e m e p of this towermeta
    */
    @Override
    public int getH_lag_EMEP() {
        return _towermeta.getH_lag_EMEP();
    }

    /**
    * Sets the h_lag_ e m e p of this towermeta.
    *
    * @param h_lag_EMEP the h_lag_ e m e p of this towermeta
    */
    @Override
    public void setH_lag_EMEP(int h_lag_EMEP) {
        _towermeta.setH_lag_EMEP(h_lag_EMEP);
    }

    /**
    * Returns the err_packet of this towermeta.
    *
    * @return the err_packet of this towermeta
    */
    @Override
    public float getErr_packet() {
        return _towermeta.getErr_packet();
    }

    /**
    * Sets the err_packet of this towermeta.
    *
    * @param err_packet the err_packet of this towermeta
    */
    @Override
    public void setErr_packet(float err_packet) {
        _towermeta.setErr_packet(err_packet);
    }

    /**
    * Returns the err_packet_ e m e p of this towermeta.
    *
    * @return the err_packet_ e m e p of this towermeta
    */
    @Override
    public int getErr_packet_EMEP() {
        return _towermeta.getErr_packet_EMEP();
    }

    /**
    * Sets the err_packet_ e m e p of this towermeta.
    *
    * @param err_packet_EMEP the err_packet_ e m e p of this towermeta
    */
    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _towermeta.setErr_packet_EMEP(err_packet_EMEP);
    }

    /**
    * Returns the licor_t_std of this towermeta.
    *
    * @return the licor_t_std of this towermeta
    */
    @Override
    public float getLicor_t_std() {
        return _towermeta.getLicor_t_std();
    }

    /**
    * Sets the licor_t_std of this towermeta.
    *
    * @param licor_t_std the licor_t_std of this towermeta
    */
    @Override
    public void setLicor_t_std(float licor_t_std) {
        _towermeta.setLicor_t_std(licor_t_std);
    }

    /**
    * Returns the licor_t_std_ e m e p of this towermeta.
    *
    * @return the licor_t_std_ e m e p of this towermeta
    */
    @Override
    public int getLicor_t_std_EMEP() {
        return _towermeta.getLicor_t_std_EMEP();
    }

    /**
    * Sets the licor_t_std_ e m e p of this towermeta.
    *
    * @param licor_t_std_EMEP the licor_t_std_ e m e p of this towermeta
    */
    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _towermeta.setLicor_t_std_EMEP(licor_t_std_EMEP);
    }

    /**
    * Returns the licor_t_av of this towermeta.
    *
    * @return the licor_t_av of this towermeta
    */
    @Override
    public float getLicor_t_av() {
        return _towermeta.getLicor_t_av();
    }

    /**
    * Sets the licor_t_av of this towermeta.
    *
    * @param licor_t_av the licor_t_av of this towermeta
    */
    @Override
    public void setLicor_t_av(float licor_t_av) {
        _towermeta.setLicor_t_av(licor_t_av);
    }

    /**
    * Returns the licor_t_av_ e m e p of this towermeta.
    *
    * @return the licor_t_av_ e m e p of this towermeta
    */
    @Override
    public int getLicor_t_av_EMEP() {
        return _towermeta.getLicor_t_av_EMEP();
    }

    /**
    * Sets the licor_t_av_ e m e p of this towermeta.
    *
    * @param licor_t_av_EMEP the licor_t_av_ e m e p of this towermeta
    */
    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _towermeta.setLicor_t_av_EMEP(licor_t_av_EMEP);
    }

    /**
    * Returns the licor_p_std of this towermeta.
    *
    * @return the licor_p_std of this towermeta
    */
    @Override
    public float getLicor_p_std() {
        return _towermeta.getLicor_p_std();
    }

    /**
    * Sets the licor_p_std of this towermeta.
    *
    * @param licor_p_std the licor_p_std of this towermeta
    */
    @Override
    public void setLicor_p_std(float licor_p_std) {
        _towermeta.setLicor_p_std(licor_p_std);
    }

    /**
    * Returns the licor_p_std_ e m e p of this towermeta.
    *
    * @return the licor_p_std_ e m e p of this towermeta
    */
    @Override
    public int getLicor_p_std_EMEP() {
        return _towermeta.getLicor_p_std_EMEP();
    }

    /**
    * Sets the licor_p_std_ e m e p of this towermeta.
    *
    * @param licor_p_std_EMEP the licor_p_std_ e m e p of this towermeta
    */
    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _towermeta.setLicor_p_std_EMEP(licor_p_std_EMEP);
    }

    /**
    * Returns the licor_p_av of this towermeta.
    *
    * @return the licor_p_av of this towermeta
    */
    @Override
    public float getLicor_p_av() {
        return _towermeta.getLicor_p_av();
    }

    /**
    * Sets the licor_p_av of this towermeta.
    *
    * @param licor_p_av the licor_p_av of this towermeta
    */
    @Override
    public void setLicor_p_av(float licor_p_av) {
        _towermeta.setLicor_p_av(licor_p_av);
    }

    /**
    * Returns the licor_p_av_ e m e p of this towermeta.
    *
    * @return the licor_p_av_ e m e p of this towermeta
    */
    @Override
    public int getLicor_p_av_EMEP() {
        return _towermeta.getLicor_p_av_EMEP();
    }

    /**
    * Sets the licor_p_av_ e m e p of this towermeta.
    *
    * @param licor_p_av_EMEP the licor_p_av_ e m e p of this towermeta
    */
    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _towermeta.setLicor_p_av_EMEP(licor_p_av_EMEP);
    }

    /**
    * Returns the f_ c p c of this towermeta.
    *
    * @return the f_ c p c of this towermeta
    */
    @Override
    public float getF_CPC() {
        return _towermeta.getF_CPC();
    }

    /**
    * Sets the f_ c p c of this towermeta.
    *
    * @param F_CPC the f_ c p c of this towermeta
    */
    @Override
    public void setF_CPC(float F_CPC) {
        _towermeta.setF_CPC(F_CPC);
    }

    /**
    * Returns the f_ c p c_ e m e p of this towermeta.
    *
    * @return the f_ c p c_ e m e p of this towermeta
    */
    @Override
    public int getF_CPC_EMEP() {
        return _towermeta.getF_CPC_EMEP();
    }

    /**
    * Sets the f_ c p c_ e m e p of this towermeta.
    *
    * @param F_CPC_EMEP the f_ c p c_ e m e p of this towermeta
    */
    @Override
    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _towermeta.setF_CPC_EMEP(F_CPC_EMEP);
    }

    /**
    * Returns the qc_ f_ c p c of this towermeta.
    *
    * @return the qc_ f_ c p c of this towermeta
    */
    @Override
    public int getQc_F_CPC() {
        return _towermeta.getQc_F_CPC();
    }

    /**
    * Sets the qc_ f_ c p c of this towermeta.
    *
    * @param Qc_F_CPC the qc_ f_ c p c of this towermeta
    */
    @Override
    public void setQc_F_CPC(int Qc_F_CPC) {
        _towermeta.setQc_F_CPC(Qc_F_CPC);
    }

    /**
    * Returns the qc_ f_ c p c_ e m e p of this towermeta.
    *
    * @return the qc_ f_ c p c_ e m e p of this towermeta
    */
    @Override
    public int getQc_F_CPC_EMEP() {
        return _towermeta.getQc_F_CPC_EMEP();
    }

    /**
    * Sets the qc_ f_ c p c_ e m e p of this towermeta.
    *
    * @param Qc_F_CPC_EMEP the qc_ f_ c p c_ e m e p of this towermeta
    */
    @Override
    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _towermeta.setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
    }

    /**
    * Returns the std_ c p c of this towermeta.
    *
    * @return the std_ c p c of this towermeta
    */
    @Override
    public float getStd_CPC() {
        return _towermeta.getStd_CPC();
    }

    /**
    * Sets the std_ c p c of this towermeta.
    *
    * @param std_CPC the std_ c p c of this towermeta
    */
    @Override
    public void setStd_CPC(float std_CPC) {
        _towermeta.setStd_CPC(std_CPC);
    }

    /**
    * Returns the std_ c p c_ e m e p of this towermeta.
    *
    * @return the std_ c p c_ e m e p of this towermeta
    */
    @Override
    public int getStd_CPC_EMEP() {
        return _towermeta.getStd_CPC_EMEP();
    }

    /**
    * Sets the std_ c p c_ e m e p of this towermeta.
    *
    * @param std_CPC_EMEP the std_ c p c_ e m e p of this towermeta
    */
    @Override
    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _towermeta.setStd_CPC_EMEP(std_CPC_EMEP);
    }

    /**
    * Returns the av_ c p c of this towermeta.
    *
    * @return the av_ c p c of this towermeta
    */
    @Override
    public float getAv_CPC() {
        return _towermeta.getAv_CPC();
    }

    /**
    * Sets the av_ c p c of this towermeta.
    *
    * @param av_CPC the av_ c p c of this towermeta
    */
    @Override
    public void setAv_CPC(float av_CPC) {
        _towermeta.setAv_CPC(av_CPC);
    }

    /**
    * Returns the av_ c p c_ e m e p of this towermeta.
    *
    * @return the av_ c p c_ e m e p of this towermeta
    */
    @Override
    public int getAv_CPC_EMEP() {
        return _towermeta.getAv_CPC_EMEP();
    }

    /**
    * Sets the av_ c p c_ e m e p of this towermeta.
    *
    * @param av_CPC_EMEP the av_ c p c_ e m e p of this towermeta
    */
    @Override
    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _towermeta.setAv_CPC_EMEP(av_CPC_EMEP);
    }

    /**
    * Returns the c p c_lag of this towermeta.
    *
    * @return the c p c_lag of this towermeta
    */
    @Override
    public float getCPC_lag() {
        return _towermeta.getCPC_lag();
    }

    /**
    * Sets the c p c_lag of this towermeta.
    *
    * @param CPC_lag the c p c_lag of this towermeta
    */
    @Override
    public void setCPC_lag(float CPC_lag) {
        _towermeta.setCPC_lag(CPC_lag);
    }

    /**
    * Returns the c p c_lag_ e m e p of this towermeta.
    *
    * @return the c p c_lag_ e m e p of this towermeta
    */
    @Override
    public int getCPC_lag_EMEP() {
        return _towermeta.getCPC_lag_EMEP();
    }

    /**
    * Sets the c p c_lag_ e m e p of this towermeta.
    *
    * @param CPC_lag_EMEP the c p c_lag_ e m e p of this towermeta
    */
    @Override
    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _towermeta.setCPC_lag_EMEP(CPC_lag_EMEP);
    }

    @Override
    public boolean isNew() {
        return _towermeta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _towermeta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _towermeta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _towermeta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _towermeta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _towermeta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _towermeta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _towermeta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _towermeta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _towermeta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _towermeta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TowermetaWrapper((Towermeta) _towermeta.clone());
    }

    @Override
    public int compareTo(Towermeta towermeta) {
        return _towermeta.compareTo(towermeta);
    }

    @Override
    public int hashCode() {
        return _towermeta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Towermeta> toCacheModel() {
        return _towermeta.toCacheModel();
    }

    @Override
    public Towermeta toEscapedModel() {
        return new TowermetaWrapper(_towermeta.toEscapedModel());
    }

    @Override
    public Towermeta toUnescapedModel() {
        return new TowermetaWrapper(_towermeta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _towermeta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _towermeta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _towermeta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TowermetaWrapper)) {
            return false;
        }

        TowermetaWrapper towermetaWrapper = (TowermetaWrapper) obj;

        if (Validator.equals(_towermeta, towermetaWrapper._towermeta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Towermeta getWrappedTowermeta() {
        return _towermeta;
    }

    @Override
    public Towermeta getWrappedModel() {
        return _towermeta;
    }

    @Override
    public void resetOriginalValues() {
        _towermeta.resetOriginalValues();
    }
}
