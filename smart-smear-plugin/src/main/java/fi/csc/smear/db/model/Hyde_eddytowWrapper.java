package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hyde_eddytow}.
 * </p>
 *
 * @author pj
 * @see Hyde_eddytow
 * @generated
 */
public class Hyde_eddytowWrapper implements Hyde_eddytow,
    ModelWrapper<Hyde_eddytow> {
    private Hyde_eddytow _hyde_eddytow;

    public Hyde_eddytowWrapper(Hyde_eddytow hyde_eddytow) {
        _hyde_eddytow = hyde_eddytow;
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

    /**
    * Returns the primary key of this hyde_eddytow.
    *
    * @return the primary key of this hyde_eddytow
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _hyde_eddytow.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hyde_eddytow.
    *
    * @param primaryKey the primary key of this hyde_eddytow
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _hyde_eddytow.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this hyde_eddytow.
    *
    * @return the samptime of this hyde_eddytow
    */
    @Override
    public java.util.Date getSamptime() {
        return _hyde_eddytow.getSamptime();
    }

    /**
    * Sets the samptime of this hyde_eddytow.
    *
    * @param samptime the samptime of this hyde_eddytow
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _hyde_eddytow.setSamptime(samptime);
    }

    /**
    * Returns the h_radtow of this hyde_eddytow.
    *
    * @return the h_radtow of this hyde_eddytow
    */
    @Override
    public float getH_radtow() {
        return _hyde_eddytow.getH_radtow();
    }

    /**
    * Sets the h_radtow of this hyde_eddytow.
    *
    * @param H_radtow the h_radtow of this hyde_eddytow
    */
    @Override
    public void setH_radtow(float H_radtow) {
        _hyde_eddytow.setH_radtow(H_radtow);
    }

    /**
    * Returns the h_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getH_radtow_EMEP() {
        return _hyde_eddytow.getH_radtow_EMEP();
    }

    /**
    * Sets the h_radtow_ e m e p of this hyde_eddytow.
    *
    * @param H_radtow_EMEP the h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setH_radtow_EMEP(int H_radtow_EMEP) {
        _hyde_eddytow.setH_radtow_EMEP(H_radtow_EMEP);
    }

    /**
    * Returns the qc_ h_radtow of this hyde_eddytow.
    *
    * @return the qc_ h_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_H_radtow() {
        return _hyde_eddytow.getQc_H_radtow();
    }

    /**
    * Sets the qc_ h_radtow of this hyde_eddytow.
    *
    * @param Qc_H_radtow the qc_ h_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_H_radtow(int Qc_H_radtow) {
        _hyde_eddytow.setQc_H_radtow(Qc_H_radtow);
    }

    /**
    * Returns the qc_ h_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_ h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_H_radtow_EMEP() {
        return _hyde_eddytow.getQc_H_radtow_EMEP();
    }

    /**
    * Sets the qc_ h_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_H_radtow_EMEP the qc_ h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_H_radtow_EMEP(int Qc_H_radtow_EMEP) {
        _hyde_eddytow.setQc_H_radtow_EMEP(Qc_H_radtow_EMEP);
    }

    /**
    * Returns the l e_radtow of this hyde_eddytow.
    *
    * @return the l e_radtow of this hyde_eddytow
    */
    @Override
    public float getLE_radtow() {
        return _hyde_eddytow.getLE_radtow();
    }

    /**
    * Sets the l e_radtow of this hyde_eddytow.
    *
    * @param LE_radtow the l e_radtow of this hyde_eddytow
    */
    @Override
    public void setLE_radtow(float LE_radtow) {
        _hyde_eddytow.setLE_radtow(LE_radtow);
    }

    /**
    * Returns the l e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the l e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getLE_radtow_EMEP() {
        return _hyde_eddytow.getLE_radtow_EMEP();
    }

    /**
    * Sets the l e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param LE_radtow_EMEP the l e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setLE_radtow_EMEP(int LE_radtow_EMEP) {
        _hyde_eddytow.setLE_radtow_EMEP(LE_radtow_EMEP);
    }

    /**
    * Returns the qc_ l e_radtow of this hyde_eddytow.
    *
    * @return the qc_ l e_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_LE_radtow() {
        return _hyde_eddytow.getQc_LE_radtow();
    }

    /**
    * Sets the qc_ l e_radtow of this hyde_eddytow.
    *
    * @param Qc_LE_radtow the qc_ l e_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_LE_radtow(int Qc_LE_radtow) {
        _hyde_eddytow.setQc_LE_radtow(Qc_LE_radtow);
    }

    /**
    * Returns the qc_ l e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_ l e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_LE_radtow_EMEP() {
        return _hyde_eddytow.getQc_LE_radtow_EMEP();
    }

    /**
    * Sets the qc_ l e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_LE_radtow_EMEP the qc_ l e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_LE_radtow_EMEP(int Qc_LE_radtow_EMEP) {
        _hyde_eddytow.setQc_LE_radtow_EMEP(Qc_LE_radtow_EMEP);
    }

    /**
    * Returns the e_radtow of this hyde_eddytow.
    *
    * @return the e_radtow of this hyde_eddytow
    */
    @Override
    public float getE_radtow() {
        return _hyde_eddytow.getE_radtow();
    }

    /**
    * Sets the e_radtow of this hyde_eddytow.
    *
    * @param E_radtow the e_radtow of this hyde_eddytow
    */
    @Override
    public void setE_radtow(float E_radtow) {
        _hyde_eddytow.setE_radtow(E_radtow);
    }

    /**
    * Returns the e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getE_radtow_EMEP() {
        return _hyde_eddytow.getE_radtow_EMEP();
    }

    /**
    * Sets the e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param E_radtow_EMEP the e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setE_radtow_EMEP(int E_radtow_EMEP) {
        _hyde_eddytow.setE_radtow_EMEP(E_radtow_EMEP);
    }

    /**
    * Returns the qc_ e_radtow of this hyde_eddytow.
    *
    * @return the qc_ e_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_E_radtow() {
        return _hyde_eddytow.getQc_E_radtow();
    }

    /**
    * Sets the qc_ e_radtow of this hyde_eddytow.
    *
    * @param Qc_E_radtow the qc_ e_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_E_radtow(int Qc_E_radtow) {
        _hyde_eddytow.setQc_E_radtow(Qc_E_radtow);
    }

    /**
    * Returns the qc_ e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_ e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_E_radtow_EMEP() {
        return _hyde_eddytow.getQc_E_radtow_EMEP();
    }

    /**
    * Sets the qc_ e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_E_radtow_EMEP the qc_ e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_E_radtow_EMEP(int Qc_E_radtow_EMEP) {
        _hyde_eddytow.setQc_E_radtow_EMEP(Qc_E_radtow_EMEP);
    }

    /**
    * Returns the f_c_radtow of this hyde_eddytow.
    *
    * @return the f_c_radtow of this hyde_eddytow
    */
    @Override
    public float getF_c_radtow() {
        return _hyde_eddytow.getF_c_radtow();
    }

    /**
    * Sets the f_c_radtow of this hyde_eddytow.
    *
    * @param F_c_radtow the f_c_radtow of this hyde_eddytow
    */
    @Override
    public void setF_c_radtow(float F_c_radtow) {
        _hyde_eddytow.setF_c_radtow(F_c_radtow);
    }

    /**
    * Returns the f_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the f_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getF_c_radtow_EMEP() {
        return _hyde_eddytow.getF_c_radtow_EMEP();
    }

    /**
    * Sets the f_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @param F_c_radtow_EMEP the f_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setF_c_radtow_EMEP(int F_c_radtow_EMEP) {
        _hyde_eddytow.setF_c_radtow_EMEP(F_c_radtow_EMEP);
    }

    /**
    * Returns the qc_ f_c_radtow of this hyde_eddytow.
    *
    * @return the qc_ f_c_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_F_c_radtow() {
        return _hyde_eddytow.getQc_F_c_radtow();
    }

    /**
    * Sets the qc_ f_c_radtow of this hyde_eddytow.
    *
    * @param Qc_F_c_radtow the qc_ f_c_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_F_c_radtow(int Qc_F_c_radtow) {
        _hyde_eddytow.setQc_F_c_radtow(Qc_F_c_radtow);
    }

    /**
    * Returns the qc_ f_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_ f_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_F_c_radtow_EMEP() {
        return _hyde_eddytow.getQc_F_c_radtow_EMEP();
    }

    /**
    * Sets the qc_ f_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_F_c_radtow_EMEP the qc_ f_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_F_c_radtow_EMEP(int Qc_F_c_radtow_EMEP) {
        _hyde_eddytow.setQc_F_c_radtow_EMEP(Qc_F_c_radtow_EMEP);
    }

    /**
    * Returns the tau_radtow of this hyde_eddytow.
    *
    * @return the tau_radtow of this hyde_eddytow
    */
    @Override
    public float getTau_radtow() {
        return _hyde_eddytow.getTau_radtow();
    }

    /**
    * Sets the tau_radtow of this hyde_eddytow.
    *
    * @param tau_radtow the tau_radtow of this hyde_eddytow
    */
    @Override
    public void setTau_radtow(float tau_radtow) {
        _hyde_eddytow.setTau_radtow(tau_radtow);
    }

    /**
    * Returns the tau_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the tau_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getTau_radtow_EMEP() {
        return _hyde_eddytow.getTau_radtow_EMEP();
    }

    /**
    * Sets the tau_radtow_ e m e p of this hyde_eddytow.
    *
    * @param tau_radtow_EMEP the tau_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setTau_radtow_EMEP(int tau_radtow_EMEP) {
        _hyde_eddytow.setTau_radtow_EMEP(tau_radtow_EMEP);
    }

    /**
    * Returns the qc_tau_radtow of this hyde_eddytow.
    *
    * @return the qc_tau_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_tau_radtow() {
        return _hyde_eddytow.getQc_tau_radtow();
    }

    /**
    * Sets the qc_tau_radtow of this hyde_eddytow.
    *
    * @param Qc_tau_radtow the qc_tau_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_tau_radtow(int Qc_tau_radtow) {
        _hyde_eddytow.setQc_tau_radtow(Qc_tau_radtow);
    }

    /**
    * Returns the qc_tau_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_tau_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_tau_radtow_EMEP() {
        return _hyde_eddytow.getQc_tau_radtow_EMEP();
    }

    /**
    * Sets the qc_tau_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_tau_radtow_EMEP the qc_tau_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_tau_radtow_EMEP(int Qc_tau_radtow_EMEP) {
        _hyde_eddytow.setQc_tau_radtow_EMEP(Qc_tau_radtow_EMEP);
    }

    /**
    * Returns the u_star_radtow of this hyde_eddytow.
    *
    * @return the u_star_radtow of this hyde_eddytow
    */
    @Override
    public float getU_star_radtow() {
        return _hyde_eddytow.getU_star_radtow();
    }

    /**
    * Sets the u_star_radtow of this hyde_eddytow.
    *
    * @param u_star_radtow the u_star_radtow of this hyde_eddytow
    */
    @Override
    public void setU_star_radtow(float u_star_radtow) {
        _hyde_eddytow.setU_star_radtow(u_star_radtow);
    }

    /**
    * Returns the u_star_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the u_star_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getU_star_radtow_EMEP() {
        return _hyde_eddytow.getU_star_radtow_EMEP();
    }

    /**
    * Sets the u_star_radtow_ e m e p of this hyde_eddytow.
    *
    * @param u_star_radtow_EMEP the u_star_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setU_star_radtow_EMEP(int u_star_radtow_EMEP) {
        _hyde_eddytow.setU_star_radtow_EMEP(u_star_radtow_EMEP);
    }

    /**
    * Returns the m o_length_radtow of this hyde_eddytow.
    *
    * @return the m o_length_radtow of this hyde_eddytow
    */
    @Override
    public float getMO_length_radtow() {
        return _hyde_eddytow.getMO_length_radtow();
    }

    /**
    * Sets the m o_length_radtow of this hyde_eddytow.
    *
    * @param MO_length_radtow the m o_length_radtow of this hyde_eddytow
    */
    @Override
    public void setMO_length_radtow(float MO_length_radtow) {
        _hyde_eddytow.setMO_length_radtow(MO_length_radtow);
    }

    /**
    * Returns the m o_length_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the m o_length_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getMO_length_radtow_EMEP() {
        return _hyde_eddytow.getMO_length_radtow_EMEP();
    }

    /**
    * Sets the m o_length_radtow_ e m e p of this hyde_eddytow.
    *
    * @param MO_length_radtow_EMEP the m o_length_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setMO_length_radtow_EMEP(int MO_length_radtow_EMEP) {
        _hyde_eddytow.setMO_length_radtow_EMEP(MO_length_radtow_EMEP);
    }

    /**
    * Returns the std_u_radtow of this hyde_eddytow.
    *
    * @return the std_u_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_u_radtow() {
        return _hyde_eddytow.getStd_u_radtow();
    }

    /**
    * Sets the std_u_radtow of this hyde_eddytow.
    *
    * @param std_u_radtow the std_u_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_u_radtow(float std_u_radtow) {
        _hyde_eddytow.setStd_u_radtow(std_u_radtow);
    }

    /**
    * Returns the std_u_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_u_radtow_EMEP() {
        return _hyde_eddytow.getStd_u_radtow_EMEP();
    }

    /**
    * Sets the std_u_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_u_radtow_EMEP the std_u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_u_radtow_EMEP(int std_u_radtow_EMEP) {
        _hyde_eddytow.setStd_u_radtow_EMEP(std_u_radtow_EMEP);
    }

    /**
    * Returns the std_v_radtow of this hyde_eddytow.
    *
    * @return the std_v_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_v_radtow() {
        return _hyde_eddytow.getStd_v_radtow();
    }

    /**
    * Sets the std_v_radtow of this hyde_eddytow.
    *
    * @param std_v_radtow the std_v_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_v_radtow(float std_v_radtow) {
        _hyde_eddytow.setStd_v_radtow(std_v_radtow);
    }

    /**
    * Returns the std_v_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_v_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_v_radtow_EMEP() {
        return _hyde_eddytow.getStd_v_radtow_EMEP();
    }

    /**
    * Sets the std_v_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_v_radtow_EMEP the std_v_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_v_radtow_EMEP(int std_v_radtow_EMEP) {
        _hyde_eddytow.setStd_v_radtow_EMEP(std_v_radtow_EMEP);
    }

    /**
    * Returns the std_w_radtow of this hyde_eddytow.
    *
    * @return the std_w_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_w_radtow() {
        return _hyde_eddytow.getStd_w_radtow();
    }

    /**
    * Sets the std_w_radtow of this hyde_eddytow.
    *
    * @param std_w_radtow the std_w_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_w_radtow(float std_w_radtow) {
        _hyde_eddytow.setStd_w_radtow(std_w_radtow);
    }

    /**
    * Returns the std_w_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_w_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_w_radtow_EMEP() {
        return _hyde_eddytow.getStd_w_radtow_EMEP();
    }

    /**
    * Sets the std_w_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_w_radtow_EMEP the std_w_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_w_radtow_EMEP(int std_w_radtow_EMEP) {
        _hyde_eddytow.setStd_w_radtow_EMEP(std_w_radtow_EMEP);
    }

    /**
    * Returns the std_t_radtow of this hyde_eddytow.
    *
    * @return the std_t_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_t_radtow() {
        return _hyde_eddytow.getStd_t_radtow();
    }

    /**
    * Sets the std_t_radtow of this hyde_eddytow.
    *
    * @param std_t_radtow the std_t_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_t_radtow(float std_t_radtow) {
        _hyde_eddytow.setStd_t_radtow(std_t_radtow);
    }

    /**
    * Returns the std_t_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_t_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_t_radtow_EMEP() {
        return _hyde_eddytow.getStd_t_radtow_EMEP();
    }

    /**
    * Sets the std_t_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_t_radtow_EMEP the std_t_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_t_radtow_EMEP(int std_t_radtow_EMEP) {
        _hyde_eddytow.setStd_t_radtow_EMEP(std_t_radtow_EMEP);
    }

    /**
    * Returns the std_c_radtow of this hyde_eddytow.
    *
    * @return the std_c_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_c_radtow() {
        return _hyde_eddytow.getStd_c_radtow();
    }

    /**
    * Sets the std_c_radtow of this hyde_eddytow.
    *
    * @param std_c_radtow the std_c_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_c_radtow(float std_c_radtow) {
        _hyde_eddytow.setStd_c_radtow(std_c_radtow);
    }

    /**
    * Returns the std_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_c_radtow_EMEP() {
        return _hyde_eddytow.getStd_c_radtow_EMEP();
    }

    /**
    * Sets the std_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_c_radtow_EMEP the std_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_c_radtow_EMEP(int std_c_radtow_EMEP) {
        _hyde_eddytow.setStd_c_radtow_EMEP(std_c_radtow_EMEP);
    }

    /**
    * Returns the std_h_radtow of this hyde_eddytow.
    *
    * @return the std_h_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_h_radtow() {
        return _hyde_eddytow.getStd_h_radtow();
    }

    /**
    * Sets the std_h_radtow of this hyde_eddytow.
    *
    * @param std_h_radtow the std_h_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_h_radtow(float std_h_radtow) {
        _hyde_eddytow.setStd_h_radtow(std_h_radtow);
    }

    /**
    * Returns the std_h_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_h_radtow_EMEP() {
        return _hyde_eddytow.getStd_h_radtow_EMEP();
    }

    /**
    * Sets the std_h_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_h_radtow_EMEP the std_h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_h_radtow_EMEP(int std_h_radtow_EMEP) {
        _hyde_eddytow.setStd_h_radtow_EMEP(std_h_radtow_EMEP);
    }

    /**
    * Returns the av_u_radtow of this hyde_eddytow.
    *
    * @return the av_u_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_u_radtow() {
        return _hyde_eddytow.getAv_u_radtow();
    }

    /**
    * Sets the av_u_radtow of this hyde_eddytow.
    *
    * @param av_u_radtow the av_u_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_u_radtow(float av_u_radtow) {
        _hyde_eddytow.setAv_u_radtow(av_u_radtow);
    }

    /**
    * Returns the av_u_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_u_radtow_EMEP() {
        return _hyde_eddytow.getAv_u_radtow_EMEP();
    }

    /**
    * Sets the av_u_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_u_radtow_EMEP the av_u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_u_radtow_EMEP(int av_u_radtow_EMEP) {
        _hyde_eddytow.setAv_u_radtow_EMEP(av_u_radtow_EMEP);
    }

    /**
    * Returns the av_v_radtow of this hyde_eddytow.
    *
    * @return the av_v_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_v_radtow() {
        return _hyde_eddytow.getAv_v_radtow();
    }

    /**
    * Sets the av_v_radtow of this hyde_eddytow.
    *
    * @param av_v_radtow the av_v_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_v_radtow(float av_v_radtow) {
        _hyde_eddytow.setAv_v_radtow(av_v_radtow);
    }

    /**
    * Returns the av_v_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_v_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_v_radtow_EMEP() {
        return _hyde_eddytow.getAv_v_radtow_EMEP();
    }

    /**
    * Sets the av_v_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_v_radtow_EMEP the av_v_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_v_radtow_EMEP(int av_v_radtow_EMEP) {
        _hyde_eddytow.setAv_v_radtow_EMEP(av_v_radtow_EMEP);
    }

    /**
    * Returns the av_w_radtow of this hyde_eddytow.
    *
    * @return the av_w_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_w_radtow() {
        return _hyde_eddytow.getAv_w_radtow();
    }

    /**
    * Sets the av_w_radtow of this hyde_eddytow.
    *
    * @param av_w_radtow the av_w_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_w_radtow(float av_w_radtow) {
        _hyde_eddytow.setAv_w_radtow(av_w_radtow);
    }

    /**
    * Returns the av_w_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_w_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_w_radtow_EMEP() {
        return _hyde_eddytow.getAv_w_radtow_EMEP();
    }

    /**
    * Sets the av_w_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_w_radtow_EMEP the av_w_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_w_radtow_EMEP(int av_w_radtow_EMEP) {
        _hyde_eddytow.setAv_w_radtow_EMEP(av_w_radtow_EMEP);
    }

    /**
    * Returns the av_t_radtow of this hyde_eddytow.
    *
    * @return the av_t_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_t_radtow() {
        return _hyde_eddytow.getAv_t_radtow();
    }

    /**
    * Sets the av_t_radtow of this hyde_eddytow.
    *
    * @param av_t_radtow the av_t_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_t_radtow(float av_t_radtow) {
        _hyde_eddytow.setAv_t_radtow(av_t_radtow);
    }

    /**
    * Returns the av_t_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_t_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_t_radtow_EMEP() {
        return _hyde_eddytow.getAv_t_radtow_EMEP();
    }

    /**
    * Sets the av_t_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_t_radtow_EMEP the av_t_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_t_radtow_EMEP(int av_t_radtow_EMEP) {
        _hyde_eddytow.setAv_t_radtow_EMEP(av_t_radtow_EMEP);
    }

    /**
    * Returns the av_c_radtow of this hyde_eddytow.
    *
    * @return the av_c_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_c_radtow() {
        return _hyde_eddytow.getAv_c_radtow();
    }

    /**
    * Sets the av_c_radtow of this hyde_eddytow.
    *
    * @param av_c_radtow the av_c_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_c_radtow(float av_c_radtow) {
        _hyde_eddytow.setAv_c_radtow(av_c_radtow);
    }

    /**
    * Returns the av_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_c_radtow_EMEP() {
        return _hyde_eddytow.getAv_c_radtow_EMEP();
    }

    /**
    * Sets the av_c_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_c_radtow_EMEP the av_c_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_c_radtow_EMEP(int av_c_radtow_EMEP) {
        _hyde_eddytow.setAv_c_radtow_EMEP(av_c_radtow_EMEP);
    }

    /**
    * Returns the av_h_radtow of this hyde_eddytow.
    *
    * @return the av_h_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_h_radtow() {
        return _hyde_eddytow.getAv_h_radtow();
    }

    /**
    * Sets the av_h_radtow of this hyde_eddytow.
    *
    * @param av_h_radtow the av_h_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_h_radtow(float av_h_radtow) {
        _hyde_eddytow.setAv_h_radtow(av_h_radtow);
    }

    /**
    * Returns the av_h_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_h_radtow_EMEP() {
        return _hyde_eddytow.getAv_h_radtow_EMEP();
    }

    /**
    * Sets the av_h_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_h_radtow_EMEP the av_h_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_h_radtow_EMEP(int av_h_radtow_EMEP) {
        _hyde_eddytow.setAv_h_radtow_EMEP(av_h_radtow_EMEP);
    }

    /**
    * Returns the u_radtow of this hyde_eddytow.
    *
    * @return the u_radtow of this hyde_eddytow
    */
    @Override
    public float getU_radtow() {
        return _hyde_eddytow.getU_radtow();
    }

    /**
    * Sets the u_radtow of this hyde_eddytow.
    *
    * @param U_radtow the u_radtow of this hyde_eddytow
    */
    @Override
    public void setU_radtow(float U_radtow) {
        _hyde_eddytow.setU_radtow(U_radtow);
    }

    /**
    * Returns the u_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getU_radtow_EMEP() {
        return _hyde_eddytow.getU_radtow_EMEP();
    }

    /**
    * Sets the u_radtow_ e m e p of this hyde_eddytow.
    *
    * @param U_radtow_EMEP the u_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setU_radtow_EMEP(int U_radtow_EMEP) {
        _hyde_eddytow.setU_radtow_EMEP(U_radtow_EMEP);
    }

    /**
    * Returns the wind_dir_radtow of this hyde_eddytow.
    *
    * @return the wind_dir_radtow of this hyde_eddytow
    */
    @Override
    public float getWind_dir_radtow() {
        return _hyde_eddytow.getWind_dir_radtow();
    }

    /**
    * Sets the wind_dir_radtow of this hyde_eddytow.
    *
    * @param wind_dir_radtow the wind_dir_radtow of this hyde_eddytow
    */
    @Override
    public void setWind_dir_radtow(float wind_dir_radtow) {
        _hyde_eddytow.setWind_dir_radtow(wind_dir_radtow);
    }

    /**
    * Returns the wind_dir_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the wind_dir_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getWind_dir_radtow_EMEP() {
        return _hyde_eddytow.getWind_dir_radtow_EMEP();
    }

    /**
    * Sets the wind_dir_radtow_ e m e p of this hyde_eddytow.
    *
    * @param wind_dir_radtow_EMEP the wind_dir_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setWind_dir_radtow_EMEP(int wind_dir_radtow_EMEP) {
        _hyde_eddytow.setWind_dir_radtow_EMEP(wind_dir_radtow_EMEP);
    }

    /**
    * Returns the eta_radtow of this hyde_eddytow.
    *
    * @return the eta_radtow of this hyde_eddytow
    */
    @Override
    public float getEta_radtow() {
        return _hyde_eddytow.getEta_radtow();
    }

    /**
    * Sets the eta_radtow of this hyde_eddytow.
    *
    * @param eta_radtow the eta_radtow of this hyde_eddytow
    */
    @Override
    public void setEta_radtow(float eta_radtow) {
        _hyde_eddytow.setEta_radtow(eta_radtow);
    }

    /**
    * Returns the eta_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the eta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getEta_radtow_EMEP() {
        return _hyde_eddytow.getEta_radtow_EMEP();
    }

    /**
    * Sets the eta_radtow_ e m e p of this hyde_eddytow.
    *
    * @param eta_radtow_EMEP the eta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setEta_radtow_EMEP(int eta_radtow_EMEP) {
        _hyde_eddytow.setEta_radtow_EMEP(eta_radtow_EMEP);
    }

    /**
    * Returns the theta_radtow of this hyde_eddytow.
    *
    * @return the theta_radtow of this hyde_eddytow
    */
    @Override
    public float getTheta_radtow() {
        return _hyde_eddytow.getTheta_radtow();
    }

    /**
    * Sets the theta_radtow of this hyde_eddytow.
    *
    * @param theta_radtow the theta_radtow of this hyde_eddytow
    */
    @Override
    public void setTheta_radtow(float theta_radtow) {
        _hyde_eddytow.setTheta_radtow(theta_radtow);
    }

    /**
    * Returns the theta_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the theta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getTheta_radtow_EMEP() {
        return _hyde_eddytow.getTheta_radtow_EMEP();
    }

    /**
    * Sets the theta_radtow_ e m e p of this hyde_eddytow.
    *
    * @param theta_radtow_EMEP the theta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setTheta_radtow_EMEP(int theta_radtow_EMEP) {
        _hyde_eddytow.setTheta_radtow_EMEP(theta_radtow_EMEP);
    }

    /**
    * Returns the beta_radtow of this hyde_eddytow.
    *
    * @return the beta_radtow of this hyde_eddytow
    */
    @Override
    public float getBeta_radtow() {
        return _hyde_eddytow.getBeta_radtow();
    }

    /**
    * Sets the beta_radtow of this hyde_eddytow.
    *
    * @param beta_radtow the beta_radtow of this hyde_eddytow
    */
    @Override
    public void setBeta_radtow(float beta_radtow) {
        _hyde_eddytow.setBeta_radtow(beta_radtow);
    }

    /**
    * Returns the beta_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the beta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getBeta_radtow_EMEP() {
        return _hyde_eddytow.getBeta_radtow_EMEP();
    }

    /**
    * Sets the beta_radtow_ e m e p of this hyde_eddytow.
    *
    * @param beta_radtow_EMEP the beta_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setBeta_radtow_EMEP(int beta_radtow_EMEP) {
        _hyde_eddytow.setBeta_radtow_EMEP(beta_radtow_EMEP);
    }

    /**
    * Returns the c_lag_radtow of this hyde_eddytow.
    *
    * @return the c_lag_radtow of this hyde_eddytow
    */
    @Override
    public float getC_lag_radtow() {
        return _hyde_eddytow.getC_lag_radtow();
    }

    /**
    * Sets the c_lag_radtow of this hyde_eddytow.
    *
    * @param c_lag_radtow the c_lag_radtow of this hyde_eddytow
    */
    @Override
    public void setC_lag_radtow(float c_lag_radtow) {
        _hyde_eddytow.setC_lag_radtow(c_lag_radtow);
    }

    /**
    * Returns the c_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the c_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getC_lag_radtow_EMEP() {
        return _hyde_eddytow.getC_lag_radtow_EMEP();
    }

    /**
    * Sets the c_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @param c_lag_radtow_EMEP the c_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setC_lag_radtow_EMEP(int c_lag_radtow_EMEP) {
        _hyde_eddytow.setC_lag_radtow_EMEP(c_lag_radtow_EMEP);
    }

    /**
    * Returns the h_lag_radtow of this hyde_eddytow.
    *
    * @return the h_lag_radtow of this hyde_eddytow
    */
    @Override
    public float getH_lag_radtow() {
        return _hyde_eddytow.getH_lag_radtow();
    }

    /**
    * Sets the h_lag_radtow of this hyde_eddytow.
    *
    * @param h_lag_radtow the h_lag_radtow of this hyde_eddytow
    */
    @Override
    public void setH_lag_radtow(float h_lag_radtow) {
        _hyde_eddytow.setH_lag_radtow(h_lag_radtow);
    }

    /**
    * Returns the h_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the h_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getH_lag_radtow_EMEP() {
        return _hyde_eddytow.getH_lag_radtow_EMEP();
    }

    /**
    * Sets the h_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @param h_lag_radtow_EMEP the h_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setH_lag_radtow_EMEP(int h_lag_radtow_EMEP) {
        _hyde_eddytow.setH_lag_radtow_EMEP(h_lag_radtow_EMEP);
    }

    /**
    * Returns the err_packet_radtow of this hyde_eddytow.
    *
    * @return the err_packet_radtow of this hyde_eddytow
    */
    @Override
    public float getErr_packet_radtow() {
        return _hyde_eddytow.getErr_packet_radtow();
    }

    /**
    * Sets the err_packet_radtow of this hyde_eddytow.
    *
    * @param err_packet_radtow the err_packet_radtow of this hyde_eddytow
    */
    @Override
    public void setErr_packet_radtow(float err_packet_radtow) {
        _hyde_eddytow.setErr_packet_radtow(err_packet_radtow);
    }

    /**
    * Returns the err_packet_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the err_packet_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getErr_packet_radtow_EMEP() {
        return _hyde_eddytow.getErr_packet_radtow_EMEP();
    }

    /**
    * Sets the err_packet_radtow_ e m e p of this hyde_eddytow.
    *
    * @param err_packet_radtow_EMEP the err_packet_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setErr_packet_radtow_EMEP(int err_packet_radtow_EMEP) {
        _hyde_eddytow.setErr_packet_radtow_EMEP(err_packet_radtow_EMEP);
    }

    /**
    * Returns the licor_t_std_radtow of this hyde_eddytow.
    *
    * @return the licor_t_std_radtow of this hyde_eddytow
    */
    @Override
    public float getLicor_t_std_radtow() {
        return _hyde_eddytow.getLicor_t_std_radtow();
    }

    /**
    * Sets the licor_t_std_radtow of this hyde_eddytow.
    *
    * @param licor_t_std_radtow the licor_t_std_radtow of this hyde_eddytow
    */
    @Override
    public void setLicor_t_std_radtow(float licor_t_std_radtow) {
        _hyde_eddytow.setLicor_t_std_radtow(licor_t_std_radtow);
    }

    /**
    * Returns the licor_t_std_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the licor_t_std_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getLicor_t_std_radtow_EMEP() {
        return _hyde_eddytow.getLicor_t_std_radtow_EMEP();
    }

    /**
    * Sets the licor_t_std_radtow_ e m e p of this hyde_eddytow.
    *
    * @param licor_t_std_radtow_EMEP the licor_t_std_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setLicor_t_std_radtow_EMEP(int licor_t_std_radtow_EMEP) {
        _hyde_eddytow.setLicor_t_std_radtow_EMEP(licor_t_std_radtow_EMEP);
    }

    /**
    * Returns the licor_t_av_radtow of this hyde_eddytow.
    *
    * @return the licor_t_av_radtow of this hyde_eddytow
    */
    @Override
    public float getLicor_t_av_radtow() {
        return _hyde_eddytow.getLicor_t_av_radtow();
    }

    /**
    * Sets the licor_t_av_radtow of this hyde_eddytow.
    *
    * @param licor_t_av_radtow the licor_t_av_radtow of this hyde_eddytow
    */
    @Override
    public void setLicor_t_av_radtow(float licor_t_av_radtow) {
        _hyde_eddytow.setLicor_t_av_radtow(licor_t_av_radtow);
    }

    /**
    * Returns the licor_t_av_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the licor_t_av_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getLicor_t_av_radtow_EMEP() {
        return _hyde_eddytow.getLicor_t_av_radtow_EMEP();
    }

    /**
    * Sets the licor_t_av_radtow_ e m e p of this hyde_eddytow.
    *
    * @param licor_t_av_radtow_EMEP the licor_t_av_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setLicor_t_av_radtow_EMEP(int licor_t_av_radtow_EMEP) {
        _hyde_eddytow.setLicor_t_av_radtow_EMEP(licor_t_av_radtow_EMEP);
    }

    /**
    * Returns the licor_p_std_radtow of this hyde_eddytow.
    *
    * @return the licor_p_std_radtow of this hyde_eddytow
    */
    @Override
    public float getLicor_p_std_radtow() {
        return _hyde_eddytow.getLicor_p_std_radtow();
    }

    /**
    * Sets the licor_p_std_radtow of this hyde_eddytow.
    *
    * @param licor_p_std_radtow the licor_p_std_radtow of this hyde_eddytow
    */
    @Override
    public void setLicor_p_std_radtow(float licor_p_std_radtow) {
        _hyde_eddytow.setLicor_p_std_radtow(licor_p_std_radtow);
    }

    /**
    * Returns the licor_p_std_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the licor_p_std_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getLicor_p_std_radtow_EMEP() {
        return _hyde_eddytow.getLicor_p_std_radtow_EMEP();
    }

    /**
    * Sets the licor_p_std_radtow_ e m e p of this hyde_eddytow.
    *
    * @param licor_p_std_radtow_EMEP the licor_p_std_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setLicor_p_std_radtow_EMEP(int licor_p_std_radtow_EMEP) {
        _hyde_eddytow.setLicor_p_std_radtow_EMEP(licor_p_std_radtow_EMEP);
    }

    /**
    * Returns the licor_p_av_radtow of this hyde_eddytow.
    *
    * @return the licor_p_av_radtow of this hyde_eddytow
    */
    @Override
    public float getLicor_p_av_radtow() {
        return _hyde_eddytow.getLicor_p_av_radtow();
    }

    /**
    * Sets the licor_p_av_radtow of this hyde_eddytow.
    *
    * @param licor_p_av_radtow the licor_p_av_radtow of this hyde_eddytow
    */
    @Override
    public void setLicor_p_av_radtow(float licor_p_av_radtow) {
        _hyde_eddytow.setLicor_p_av_radtow(licor_p_av_radtow);
    }

    /**
    * Returns the licor_p_av_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the licor_p_av_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getLicor_p_av_radtow_EMEP() {
        return _hyde_eddytow.getLicor_p_av_radtow_EMEP();
    }

    /**
    * Sets the licor_p_av_radtow_ e m e p of this hyde_eddytow.
    *
    * @param licor_p_av_radtow_EMEP the licor_p_av_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setLicor_p_av_radtow_EMEP(int licor_p_av_radtow_EMEP) {
        _hyde_eddytow.setLicor_p_av_radtow_EMEP(licor_p_av_radtow_EMEP);
    }

    /**
    * Returns the f_ o3_radtow of this hyde_eddytow.
    *
    * @return the f_ o3_radtow of this hyde_eddytow
    */
    @Override
    public float getF_O3_radtow() {
        return _hyde_eddytow.getF_O3_radtow();
    }

    /**
    * Sets the f_ o3_radtow of this hyde_eddytow.
    *
    * @param F_O3_radtow the f_ o3_radtow of this hyde_eddytow
    */
    @Override
    public void setF_O3_radtow(float F_O3_radtow) {
        _hyde_eddytow.setF_O3_radtow(F_O3_radtow);
    }

    /**
    * Returns the f_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the f_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getF_O3_radtow_EMEP() {
        return _hyde_eddytow.getF_O3_radtow_EMEP();
    }

    /**
    * Sets the f_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @param F_O3_radtow_EMEP the f_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setF_O3_radtow_EMEP(int F_O3_radtow_EMEP) {
        _hyde_eddytow.setF_O3_radtow_EMEP(F_O3_radtow_EMEP);
    }

    /**
    * Returns the qc_ f_ o3_radtow of this hyde_eddytow.
    *
    * @return the qc_ f_ o3_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_F_O3_radtow() {
        return _hyde_eddytow.getQc_F_O3_radtow();
    }

    /**
    * Sets the qc_ f_ o3_radtow of this hyde_eddytow.
    *
    * @param Qc_F_O3_radtow the qc_ f_ o3_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_F_O3_radtow(int Qc_F_O3_radtow) {
        _hyde_eddytow.setQc_F_O3_radtow(Qc_F_O3_radtow);
    }

    /**
    * Returns the qc_ f_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_ f_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_F_O3_radtow_EMEP() {
        return _hyde_eddytow.getQc_F_O3_radtow_EMEP();
    }

    /**
    * Sets the qc_ f_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_F_O3_radtow_EMEP the qc_ f_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_F_O3_radtow_EMEP(int Qc_F_O3_radtow_EMEP) {
        _hyde_eddytow.setQc_F_O3_radtow_EMEP(Qc_F_O3_radtow_EMEP);
    }

    /**
    * Returns the std_ o3_radtow of this hyde_eddytow.
    *
    * @return the std_ o3_radtow of this hyde_eddytow
    */
    @Override
    public float getStd_O3_radtow() {
        return _hyde_eddytow.getStd_O3_radtow();
    }

    /**
    * Sets the std_ o3_radtow of this hyde_eddytow.
    *
    * @param std_O3_radtow the std_ o3_radtow of this hyde_eddytow
    */
    @Override
    public void setStd_O3_radtow(float std_O3_radtow) {
        _hyde_eddytow.setStd_O3_radtow(std_O3_radtow);
    }

    /**
    * Returns the std_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the std_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getStd_O3_radtow_EMEP() {
        return _hyde_eddytow.getStd_O3_radtow_EMEP();
    }

    /**
    * Sets the std_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @param std_O3_radtow_EMEP the std_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setStd_O3_radtow_EMEP(int std_O3_radtow_EMEP) {
        _hyde_eddytow.setStd_O3_radtow_EMEP(std_O3_radtow_EMEP);
    }

    /**
    * Returns the av_ o3_radtow of this hyde_eddytow.
    *
    * @return the av_ o3_radtow of this hyde_eddytow
    */
    @Override
    public float getAv_O3_radtow() {
        return _hyde_eddytow.getAv_O3_radtow();
    }

    /**
    * Sets the av_ o3_radtow of this hyde_eddytow.
    *
    * @param av_O3_radtow the av_ o3_radtow of this hyde_eddytow
    */
    @Override
    public void setAv_O3_radtow(float av_O3_radtow) {
        _hyde_eddytow.setAv_O3_radtow(av_O3_radtow);
    }

    /**
    * Returns the av_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the av_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getAv_O3_radtow_EMEP() {
        return _hyde_eddytow.getAv_O3_radtow_EMEP();
    }

    /**
    * Sets the av_ o3_radtow_ e m e p of this hyde_eddytow.
    *
    * @param av_O3_radtow_EMEP the av_ o3_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setAv_O3_radtow_EMEP(int av_O3_radtow_EMEP) {
        _hyde_eddytow.setAv_O3_radtow_EMEP(av_O3_radtow_EMEP);
    }

    /**
    * Returns the o3_lag_radtow of this hyde_eddytow.
    *
    * @return the o3_lag_radtow of this hyde_eddytow
    */
    @Override
    public float getO3_lag_radtow() {
        return _hyde_eddytow.getO3_lag_radtow();
    }

    /**
    * Sets the o3_lag_radtow of this hyde_eddytow.
    *
    * @param O3_lag_radtow the o3_lag_radtow of this hyde_eddytow
    */
    @Override
    public void setO3_lag_radtow(float O3_lag_radtow) {
        _hyde_eddytow.setO3_lag_radtow(O3_lag_radtow);
    }

    /**
    * Returns the o3_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the o3_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getO3_lag_radtow_EMEP() {
        return _hyde_eddytow.getO3_lag_radtow_EMEP();
    }

    /**
    * Sets the o3_lag_radtow_ e m e p of this hyde_eddytow.
    *
    * @param O3_lag_radtow_EMEP the o3_lag_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setO3_lag_radtow_EMEP(int O3_lag_radtow_EMEP) {
        _hyde_eddytow.setO3_lag_radtow_EMEP(O3_lag_radtow_EMEP);
    }

    /**
    * Returns the n e e_radtow of this hyde_eddytow.
    *
    * @return the n e e_radtow of this hyde_eddytow
    */
    @Override
    public float getNEE_radtow() {
        return _hyde_eddytow.getNEE_radtow();
    }

    /**
    * Sets the n e e_radtow of this hyde_eddytow.
    *
    * @param NEE_radtow the n e e_radtow of this hyde_eddytow
    */
    @Override
    public void setNEE_radtow(float NEE_radtow) {
        _hyde_eddytow.setNEE_radtow(NEE_radtow);
    }

    /**
    * Returns the n e e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the n e e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getNEE_radtow_EMEP() {
        return _hyde_eddytow.getNEE_radtow_EMEP();
    }

    /**
    * Sets the n e e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param NEE_radtow_EMEP the n e e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setNEE_radtow_EMEP(int NEE_radtow_EMEP) {
        _hyde_eddytow.setNEE_radtow_EMEP(NEE_radtow_EMEP);
    }

    /**
    * Returns the qc_gapf_ n e e_radtow of this hyde_eddytow.
    *
    * @return the qc_gapf_ n e e_radtow of this hyde_eddytow
    */
    @Override
    public int getQc_gapf_NEE_radtow() {
        return _hyde_eddytow.getQc_gapf_NEE_radtow();
    }

    /**
    * Sets the qc_gapf_ n e e_radtow of this hyde_eddytow.
    *
    * @param Qc_gapf_NEE_radtow the qc_gapf_ n e e_radtow of this hyde_eddytow
    */
    @Override
    public void setQc_gapf_NEE_radtow(int Qc_gapf_NEE_radtow) {
        _hyde_eddytow.setQc_gapf_NEE_radtow(Qc_gapf_NEE_radtow);
    }

    /**
    * Returns the qc_gapf_ n e e_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the qc_gapf_ n e e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getQc_gapf_NEE_radtow_EMEP() {
        return _hyde_eddytow.getQc_gapf_NEE_radtow_EMEP();
    }

    /**
    * Sets the qc_gapf_ n e e_radtow_ e m e p of this hyde_eddytow.
    *
    * @param Qc_gapf_NEE_radtow_EMEP the qc_gapf_ n e e_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setQc_gapf_NEE_radtow_EMEP(int Qc_gapf_NEE_radtow_EMEP) {
        _hyde_eddytow.setQc_gapf_NEE_radtow_EMEP(Qc_gapf_NEE_radtow_EMEP);
    }

    /**
    * Returns the g p p_radtow of this hyde_eddytow.
    *
    * @return the g p p_radtow of this hyde_eddytow
    */
    @Override
    public float getGPP_radtow() {
        return _hyde_eddytow.getGPP_radtow();
    }

    /**
    * Sets the g p p_radtow of this hyde_eddytow.
    *
    * @param GPP_radtow the g p p_radtow of this hyde_eddytow
    */
    @Override
    public void setGPP_radtow(float GPP_radtow) {
        _hyde_eddytow.setGPP_radtow(GPP_radtow);
    }

    /**
    * Returns the g p p_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the g p p_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getGPP_radtow_EMEP() {
        return _hyde_eddytow.getGPP_radtow_EMEP();
    }

    /**
    * Sets the g p p_radtow_ e m e p of this hyde_eddytow.
    *
    * @param GPP_radtow_EMEP the g p p_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setGPP_radtow_EMEP(int GPP_radtow_EMEP) {
        _hyde_eddytow.setGPP_radtow_EMEP(GPP_radtow_EMEP);
    }

    /**
    * Returns the t e r_radtow of this hyde_eddytow.
    *
    * @return the t e r_radtow of this hyde_eddytow
    */
    @Override
    public float getTER_radtow() {
        return _hyde_eddytow.getTER_radtow();
    }

    /**
    * Sets the t e r_radtow of this hyde_eddytow.
    *
    * @param TER_radtow the t e r_radtow of this hyde_eddytow
    */
    @Override
    public void setTER_radtow(float TER_radtow) {
        _hyde_eddytow.setTER_radtow(TER_radtow);
    }

    /**
    * Returns the t e r_radtow_ e m e p of this hyde_eddytow.
    *
    * @return the t e r_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public int getTER_radtow_EMEP() {
        return _hyde_eddytow.getTER_radtow_EMEP();
    }

    /**
    * Sets the t e r_radtow_ e m e p of this hyde_eddytow.
    *
    * @param TER_radtow_EMEP the t e r_radtow_ e m e p of this hyde_eddytow
    */
    @Override
    public void setTER_radtow_EMEP(int TER_radtow_EMEP) {
        _hyde_eddytow.setTER_radtow_EMEP(TER_radtow_EMEP);
    }

    @Override
    public boolean isNew() {
        return _hyde_eddytow.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hyde_eddytow.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hyde_eddytow.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hyde_eddytow.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hyde_eddytow.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hyde_eddytow.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hyde_eddytow.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hyde_eddytow.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hyde_eddytow.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hyde_eddytow.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hyde_eddytow.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Hyde_eddytowWrapper((Hyde_eddytow) _hyde_eddytow.clone());
    }

    @Override
    public int compareTo(Hyde_eddytow hyde_eddytow) {
        return _hyde_eddytow.compareTo(hyde_eddytow);
    }

    @Override
    public int hashCode() {
        return _hyde_eddytow.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Hyde_eddytow> toCacheModel() {
        return _hyde_eddytow.toCacheModel();
    }

    @Override
    public Hyde_eddytow toEscapedModel() {
        return new Hyde_eddytowWrapper(_hyde_eddytow.toEscapedModel());
    }

    @Override
    public Hyde_eddytow toUnescapedModel() {
        return new Hyde_eddytowWrapper(_hyde_eddytow.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hyde_eddytow.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hyde_eddytow.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hyde_eddytow.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Hyde_eddytowWrapper)) {
            return false;
        }

        Hyde_eddytowWrapper hyde_eddytowWrapper = (Hyde_eddytowWrapper) obj;

        if (Validator.equals(_hyde_eddytow, hyde_eddytowWrapper._hyde_eddytow)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Hyde_eddytow getWrappedHyde_eddytow() {
        return _hyde_eddytow;
    }

    @Override
    public Hyde_eddytow getWrappedModel() {
        return _hyde_eddytow;
    }

    @Override
    public void resetOriginalValues() {
        _hyde_eddytow.resetOriginalValues();
    }
}
