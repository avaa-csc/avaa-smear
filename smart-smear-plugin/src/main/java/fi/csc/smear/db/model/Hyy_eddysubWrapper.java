package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hyy_eddysub}.
 * </p>
 *
 * @author pj
 * @see Hyy_eddysub
 * @generated
 */
public class Hyy_eddysubWrapper implements Hyy_eddysub,
    ModelWrapper<Hyy_eddysub> {
    private Hyy_eddysub _hyy_eddysub;

    public Hyy_eddysubWrapper(Hyy_eddysub hyy_eddysub) {
        _hyy_eddysub = hyy_eddysub;
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

    /**
    * Returns the primary key of this hyy_eddysub.
    *
    * @return the primary key of this hyy_eddysub
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _hyy_eddysub.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hyy_eddysub.
    *
    * @param primaryKey the primary key of this hyy_eddysub
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _hyy_eddysub.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this hyy_eddysub.
    *
    * @return the samptime of this hyy_eddysub
    */
    @Override
    public java.util.Date getSamptime() {
        return _hyy_eddysub.getSamptime();
    }

    /**
    * Sets the samptime of this hyy_eddysub.
    *
    * @param samptime the samptime of this hyy_eddysub
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _hyy_eddysub.setSamptime(samptime);
    }

    /**
    * Returns the h_subm of this hyy_eddysub.
    *
    * @return the h_subm of this hyy_eddysub
    */
    @Override
    public float getH_subm() {
        return _hyy_eddysub.getH_subm();
    }

    /**
    * Sets the h_subm of this hyy_eddysub.
    *
    * @param H_subm the h_subm of this hyy_eddysub
    */
    @Override
    public void setH_subm(float H_subm) {
        _hyy_eddysub.setH_subm(H_subm);
    }

    /**
    * Returns the h_subm_ e m e p of this hyy_eddysub.
    *
    * @return the h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getH_subm_EMEP() {
        return _hyy_eddysub.getH_subm_EMEP();
    }

    /**
    * Sets the h_subm_ e m e p of this hyy_eddysub.
    *
    * @param H_subm_EMEP the h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setH_subm_EMEP(int H_subm_EMEP) {
        _hyy_eddysub.setH_subm_EMEP(H_subm_EMEP);
    }

    /**
    * Returns the qc_ h_subm of this hyy_eddysub.
    *
    * @return the qc_ h_subm of this hyy_eddysub
    */
    @Override
    public int getQc_H_subm() {
        return _hyy_eddysub.getQc_H_subm();
    }

    /**
    * Sets the qc_ h_subm of this hyy_eddysub.
    *
    * @param Qc_H_subm the qc_ h_subm of this hyy_eddysub
    */
    @Override
    public void setQc_H_subm(int Qc_H_subm) {
        _hyy_eddysub.setQc_H_subm(Qc_H_subm);
    }

    /**
    * Returns the qc_ h_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_ h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_H_subm_EMEP() {
        return _hyy_eddysub.getQc_H_subm_EMEP();
    }

    /**
    * Sets the qc_ h_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_H_subm_EMEP the qc_ h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_H_subm_EMEP(int Qc_H_subm_EMEP) {
        _hyy_eddysub.setQc_H_subm_EMEP(Qc_H_subm_EMEP);
    }

    /**
    * Returns the l e_subm of this hyy_eddysub.
    *
    * @return the l e_subm of this hyy_eddysub
    */
    @Override
    public float getLE_subm() {
        return _hyy_eddysub.getLE_subm();
    }

    /**
    * Sets the l e_subm of this hyy_eddysub.
    *
    * @param LE_subm the l e_subm of this hyy_eddysub
    */
    @Override
    public void setLE_subm(float LE_subm) {
        _hyy_eddysub.setLE_subm(LE_subm);
    }

    /**
    * Returns the l e_subm_ e m e p of this hyy_eddysub.
    *
    * @return the l e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getLE_subm_EMEP() {
        return _hyy_eddysub.getLE_subm_EMEP();
    }

    /**
    * Sets the l e_subm_ e m e p of this hyy_eddysub.
    *
    * @param LE_subm_EMEP the l e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setLE_subm_EMEP(int LE_subm_EMEP) {
        _hyy_eddysub.setLE_subm_EMEP(LE_subm_EMEP);
    }

    /**
    * Returns the qc_ l e_subm of this hyy_eddysub.
    *
    * @return the qc_ l e_subm of this hyy_eddysub
    */
    @Override
    public int getQc_LE_subm() {
        return _hyy_eddysub.getQc_LE_subm();
    }

    /**
    * Sets the qc_ l e_subm of this hyy_eddysub.
    *
    * @param Qc_LE_subm the qc_ l e_subm of this hyy_eddysub
    */
    @Override
    public void setQc_LE_subm(int Qc_LE_subm) {
        _hyy_eddysub.setQc_LE_subm(Qc_LE_subm);
    }

    /**
    * Returns the qc_ l e_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_ l e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_LE_subm_EMEP() {
        return _hyy_eddysub.getQc_LE_subm_EMEP();
    }

    /**
    * Sets the qc_ l e_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_LE_subm_EMEP the qc_ l e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_LE_subm_EMEP(int Qc_LE_subm_EMEP) {
        _hyy_eddysub.setQc_LE_subm_EMEP(Qc_LE_subm_EMEP);
    }

    /**
    * Returns the e_subm of this hyy_eddysub.
    *
    * @return the e_subm of this hyy_eddysub
    */
    @Override
    public float getE_subm() {
        return _hyy_eddysub.getE_subm();
    }

    /**
    * Sets the e_subm of this hyy_eddysub.
    *
    * @param E_subm the e_subm of this hyy_eddysub
    */
    @Override
    public void setE_subm(float E_subm) {
        _hyy_eddysub.setE_subm(E_subm);
    }

    /**
    * Returns the e_subm_ e m e p of this hyy_eddysub.
    *
    * @return the e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getE_subm_EMEP() {
        return _hyy_eddysub.getE_subm_EMEP();
    }

    /**
    * Sets the e_subm_ e m e p of this hyy_eddysub.
    *
    * @param E_subm_EMEP the e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setE_subm_EMEP(int E_subm_EMEP) {
        _hyy_eddysub.setE_subm_EMEP(E_subm_EMEP);
    }

    /**
    * Returns the qc_ e_subm of this hyy_eddysub.
    *
    * @return the qc_ e_subm of this hyy_eddysub
    */
    @Override
    public int getQc_E_subm() {
        return _hyy_eddysub.getQc_E_subm();
    }

    /**
    * Sets the qc_ e_subm of this hyy_eddysub.
    *
    * @param Qc_E_subm the qc_ e_subm of this hyy_eddysub
    */
    @Override
    public void setQc_E_subm(int Qc_E_subm) {
        _hyy_eddysub.setQc_E_subm(Qc_E_subm);
    }

    /**
    * Returns the qc_ e_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_ e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_E_subm_EMEP() {
        return _hyy_eddysub.getQc_E_subm_EMEP();
    }

    /**
    * Sets the qc_ e_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_E_subm_EMEP the qc_ e_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_E_subm_EMEP(int Qc_E_subm_EMEP) {
        _hyy_eddysub.setQc_E_subm_EMEP(Qc_E_subm_EMEP);
    }

    /**
    * Returns the f_c_subm of this hyy_eddysub.
    *
    * @return the f_c_subm of this hyy_eddysub
    */
    @Override
    public float getF_c_subm() {
        return _hyy_eddysub.getF_c_subm();
    }

    /**
    * Sets the f_c_subm of this hyy_eddysub.
    *
    * @param F_c_subm the f_c_subm of this hyy_eddysub
    */
    @Override
    public void setF_c_subm(float F_c_subm) {
        _hyy_eddysub.setF_c_subm(F_c_subm);
    }

    /**
    * Returns the f_c_subm_ e m e p of this hyy_eddysub.
    *
    * @return the f_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getF_c_subm_EMEP() {
        return _hyy_eddysub.getF_c_subm_EMEP();
    }

    /**
    * Sets the f_c_subm_ e m e p of this hyy_eddysub.
    *
    * @param F_c_subm_EMEP the f_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setF_c_subm_EMEP(int F_c_subm_EMEP) {
        _hyy_eddysub.setF_c_subm_EMEP(F_c_subm_EMEP);
    }

    /**
    * Returns the qc_ f_c_subm of this hyy_eddysub.
    *
    * @return the qc_ f_c_subm of this hyy_eddysub
    */
    @Override
    public int getQc_F_c_subm() {
        return _hyy_eddysub.getQc_F_c_subm();
    }

    /**
    * Sets the qc_ f_c_subm of this hyy_eddysub.
    *
    * @param Qc_F_c_subm the qc_ f_c_subm of this hyy_eddysub
    */
    @Override
    public void setQc_F_c_subm(int Qc_F_c_subm) {
        _hyy_eddysub.setQc_F_c_subm(Qc_F_c_subm);
    }

    /**
    * Returns the qc_ f_c_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_ f_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_F_c_subm_EMEP() {
        return _hyy_eddysub.getQc_F_c_subm_EMEP();
    }

    /**
    * Sets the qc_ f_c_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_F_c_subm_EMEP the qc_ f_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_F_c_subm_EMEP(int Qc_F_c_subm_EMEP) {
        _hyy_eddysub.setQc_F_c_subm_EMEP(Qc_F_c_subm_EMEP);
    }

    /**
    * Returns the tau_subm of this hyy_eddysub.
    *
    * @return the tau_subm of this hyy_eddysub
    */
    @Override
    public float getTau_subm() {
        return _hyy_eddysub.getTau_subm();
    }

    /**
    * Sets the tau_subm of this hyy_eddysub.
    *
    * @param tau_subm the tau_subm of this hyy_eddysub
    */
    @Override
    public void setTau_subm(float tau_subm) {
        _hyy_eddysub.setTau_subm(tau_subm);
    }

    /**
    * Returns the tau_subm_ e m e p of this hyy_eddysub.
    *
    * @return the tau_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getTau_subm_EMEP() {
        return _hyy_eddysub.getTau_subm_EMEP();
    }

    /**
    * Sets the tau_subm_ e m e p of this hyy_eddysub.
    *
    * @param tau_subm_EMEP the tau_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setTau_subm_EMEP(int tau_subm_EMEP) {
        _hyy_eddysub.setTau_subm_EMEP(tau_subm_EMEP);
    }

    /**
    * Returns the qc_tau_subm of this hyy_eddysub.
    *
    * @return the qc_tau_subm of this hyy_eddysub
    */
    @Override
    public int getQc_tau_subm() {
        return _hyy_eddysub.getQc_tau_subm();
    }

    /**
    * Sets the qc_tau_subm of this hyy_eddysub.
    *
    * @param Qc_tau_subm the qc_tau_subm of this hyy_eddysub
    */
    @Override
    public void setQc_tau_subm(int Qc_tau_subm) {
        _hyy_eddysub.setQc_tau_subm(Qc_tau_subm);
    }

    /**
    * Returns the qc_tau_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_tau_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_tau_subm_EMEP() {
        return _hyy_eddysub.getQc_tau_subm_EMEP();
    }

    /**
    * Sets the qc_tau_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_tau_subm_EMEP the qc_tau_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_tau_subm_EMEP(int Qc_tau_subm_EMEP) {
        _hyy_eddysub.setQc_tau_subm_EMEP(Qc_tau_subm_EMEP);
    }

    /**
    * Returns the u_star_subm of this hyy_eddysub.
    *
    * @return the u_star_subm of this hyy_eddysub
    */
    @Override
    public float getU_star_subm() {
        return _hyy_eddysub.getU_star_subm();
    }

    /**
    * Sets the u_star_subm of this hyy_eddysub.
    *
    * @param u_star_subm the u_star_subm of this hyy_eddysub
    */
    @Override
    public void setU_star_subm(float u_star_subm) {
        _hyy_eddysub.setU_star_subm(u_star_subm);
    }

    /**
    * Returns the u_star_subm_ e m e p of this hyy_eddysub.
    *
    * @return the u_star_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getU_star_subm_EMEP() {
        return _hyy_eddysub.getU_star_subm_EMEP();
    }

    /**
    * Sets the u_star_subm_ e m e p of this hyy_eddysub.
    *
    * @param u_star_subm_EMEP the u_star_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setU_star_subm_EMEP(int u_star_subm_EMEP) {
        _hyy_eddysub.setU_star_subm_EMEP(u_star_subm_EMEP);
    }

    /**
    * Returns the m o_length_subm of this hyy_eddysub.
    *
    * @return the m o_length_subm of this hyy_eddysub
    */
    @Override
    public float getMO_length_subm() {
        return _hyy_eddysub.getMO_length_subm();
    }

    /**
    * Sets the m o_length_subm of this hyy_eddysub.
    *
    * @param MO_length_subm the m o_length_subm of this hyy_eddysub
    */
    @Override
    public void setMO_length_subm(float MO_length_subm) {
        _hyy_eddysub.setMO_length_subm(MO_length_subm);
    }

    /**
    * Returns the m o_length_subm_ e m e p of this hyy_eddysub.
    *
    * @return the m o_length_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getMO_length_subm_EMEP() {
        return _hyy_eddysub.getMO_length_subm_EMEP();
    }

    /**
    * Sets the m o_length_subm_ e m e p of this hyy_eddysub.
    *
    * @param MO_length_subm_EMEP the m o_length_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setMO_length_subm_EMEP(int MO_length_subm_EMEP) {
        _hyy_eddysub.setMO_length_subm_EMEP(MO_length_subm_EMEP);
    }

    /**
    * Returns the std_u_subm of this hyy_eddysub.
    *
    * @return the std_u_subm of this hyy_eddysub
    */
    @Override
    public float getStd_u_subm() {
        return _hyy_eddysub.getStd_u_subm();
    }

    /**
    * Sets the std_u_subm of this hyy_eddysub.
    *
    * @param std_u_subm the std_u_subm of this hyy_eddysub
    */
    @Override
    public void setStd_u_subm(float std_u_subm) {
        _hyy_eddysub.setStd_u_subm(std_u_subm);
    }

    /**
    * Returns the std_u_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_u_subm_EMEP() {
        return _hyy_eddysub.getStd_u_subm_EMEP();
    }

    /**
    * Sets the std_u_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_u_subm_EMEP the std_u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_u_subm_EMEP(int std_u_subm_EMEP) {
        _hyy_eddysub.setStd_u_subm_EMEP(std_u_subm_EMEP);
    }

    /**
    * Returns the std_v_subm of this hyy_eddysub.
    *
    * @return the std_v_subm of this hyy_eddysub
    */
    @Override
    public float getStd_v_subm() {
        return _hyy_eddysub.getStd_v_subm();
    }

    /**
    * Sets the std_v_subm of this hyy_eddysub.
    *
    * @param std_v_subm the std_v_subm of this hyy_eddysub
    */
    @Override
    public void setStd_v_subm(float std_v_subm) {
        _hyy_eddysub.setStd_v_subm(std_v_subm);
    }

    /**
    * Returns the std_v_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_v_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_v_subm_EMEP() {
        return _hyy_eddysub.getStd_v_subm_EMEP();
    }

    /**
    * Sets the std_v_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_v_subm_EMEP the std_v_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_v_subm_EMEP(int std_v_subm_EMEP) {
        _hyy_eddysub.setStd_v_subm_EMEP(std_v_subm_EMEP);
    }

    /**
    * Returns the std_w_subm of this hyy_eddysub.
    *
    * @return the std_w_subm of this hyy_eddysub
    */
    @Override
    public float getStd_w_subm() {
        return _hyy_eddysub.getStd_w_subm();
    }

    /**
    * Sets the std_w_subm of this hyy_eddysub.
    *
    * @param std_w_subm the std_w_subm of this hyy_eddysub
    */
    @Override
    public void setStd_w_subm(float std_w_subm) {
        _hyy_eddysub.setStd_w_subm(std_w_subm);
    }

    /**
    * Returns the std_w_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_w_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_w_subm_EMEP() {
        return _hyy_eddysub.getStd_w_subm_EMEP();
    }

    /**
    * Sets the std_w_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_w_subm_EMEP the std_w_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_w_subm_EMEP(int std_w_subm_EMEP) {
        _hyy_eddysub.setStd_w_subm_EMEP(std_w_subm_EMEP);
    }

    /**
    * Returns the std_t_subm of this hyy_eddysub.
    *
    * @return the std_t_subm of this hyy_eddysub
    */
    @Override
    public float getStd_t_subm() {
        return _hyy_eddysub.getStd_t_subm();
    }

    /**
    * Sets the std_t_subm of this hyy_eddysub.
    *
    * @param std_t_subm the std_t_subm of this hyy_eddysub
    */
    @Override
    public void setStd_t_subm(float std_t_subm) {
        _hyy_eddysub.setStd_t_subm(std_t_subm);
    }

    /**
    * Returns the std_t_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_t_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_t_subm_EMEP() {
        return _hyy_eddysub.getStd_t_subm_EMEP();
    }

    /**
    * Sets the std_t_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_t_subm_EMEP the std_t_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_t_subm_EMEP(int std_t_subm_EMEP) {
        _hyy_eddysub.setStd_t_subm_EMEP(std_t_subm_EMEP);
    }

    /**
    * Returns the std_c_subm of this hyy_eddysub.
    *
    * @return the std_c_subm of this hyy_eddysub
    */
    @Override
    public float getStd_c_subm() {
        return _hyy_eddysub.getStd_c_subm();
    }

    /**
    * Sets the std_c_subm of this hyy_eddysub.
    *
    * @param std_c_subm the std_c_subm of this hyy_eddysub
    */
    @Override
    public void setStd_c_subm(float std_c_subm) {
        _hyy_eddysub.setStd_c_subm(std_c_subm);
    }

    /**
    * Returns the std_c_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_c_subm_EMEP() {
        return _hyy_eddysub.getStd_c_subm_EMEP();
    }

    /**
    * Sets the std_c_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_c_subm_EMEP the std_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_c_subm_EMEP(int std_c_subm_EMEP) {
        _hyy_eddysub.setStd_c_subm_EMEP(std_c_subm_EMEP);
    }

    /**
    * Returns the std_h_subm of this hyy_eddysub.
    *
    * @return the std_h_subm of this hyy_eddysub
    */
    @Override
    public float getStd_h_subm() {
        return _hyy_eddysub.getStd_h_subm();
    }

    /**
    * Sets the std_h_subm of this hyy_eddysub.
    *
    * @param std_h_subm the std_h_subm of this hyy_eddysub
    */
    @Override
    public void setStd_h_subm(float std_h_subm) {
        _hyy_eddysub.setStd_h_subm(std_h_subm);
    }

    /**
    * Returns the std_h_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_h_subm_EMEP() {
        return _hyy_eddysub.getStd_h_subm_EMEP();
    }

    /**
    * Sets the std_h_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_h_subm_EMEP the std_h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_h_subm_EMEP(int std_h_subm_EMEP) {
        _hyy_eddysub.setStd_h_subm_EMEP(std_h_subm_EMEP);
    }

    /**
    * Returns the av_u_subm of this hyy_eddysub.
    *
    * @return the av_u_subm of this hyy_eddysub
    */
    @Override
    public float getAv_u_subm() {
        return _hyy_eddysub.getAv_u_subm();
    }

    /**
    * Sets the av_u_subm of this hyy_eddysub.
    *
    * @param av_u_subm the av_u_subm of this hyy_eddysub
    */
    @Override
    public void setAv_u_subm(float av_u_subm) {
        _hyy_eddysub.setAv_u_subm(av_u_subm);
    }

    /**
    * Returns the av_u_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_u_subm_EMEP() {
        return _hyy_eddysub.getAv_u_subm_EMEP();
    }

    /**
    * Sets the av_u_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_u_subm_EMEP the av_u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_u_subm_EMEP(int av_u_subm_EMEP) {
        _hyy_eddysub.setAv_u_subm_EMEP(av_u_subm_EMEP);
    }

    /**
    * Returns the av_v_subm of this hyy_eddysub.
    *
    * @return the av_v_subm of this hyy_eddysub
    */
    @Override
    public float getAv_v_subm() {
        return _hyy_eddysub.getAv_v_subm();
    }

    /**
    * Sets the av_v_subm of this hyy_eddysub.
    *
    * @param av_v_subm the av_v_subm of this hyy_eddysub
    */
    @Override
    public void setAv_v_subm(float av_v_subm) {
        _hyy_eddysub.setAv_v_subm(av_v_subm);
    }

    /**
    * Returns the av_v_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_v_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_v_subm_EMEP() {
        return _hyy_eddysub.getAv_v_subm_EMEP();
    }

    /**
    * Sets the av_v_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_v_subm_EMEP the av_v_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_v_subm_EMEP(int av_v_subm_EMEP) {
        _hyy_eddysub.setAv_v_subm_EMEP(av_v_subm_EMEP);
    }

    /**
    * Returns the av_w_subm of this hyy_eddysub.
    *
    * @return the av_w_subm of this hyy_eddysub
    */
    @Override
    public float getAv_w_subm() {
        return _hyy_eddysub.getAv_w_subm();
    }

    /**
    * Sets the av_w_subm of this hyy_eddysub.
    *
    * @param av_w_subm the av_w_subm of this hyy_eddysub
    */
    @Override
    public void setAv_w_subm(float av_w_subm) {
        _hyy_eddysub.setAv_w_subm(av_w_subm);
    }

    /**
    * Returns the av_w_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_w_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_w_subm_EMEP() {
        return _hyy_eddysub.getAv_w_subm_EMEP();
    }

    /**
    * Sets the av_w_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_w_subm_EMEP the av_w_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_w_subm_EMEP(int av_w_subm_EMEP) {
        _hyy_eddysub.setAv_w_subm_EMEP(av_w_subm_EMEP);
    }

    /**
    * Returns the av_t_subm of this hyy_eddysub.
    *
    * @return the av_t_subm of this hyy_eddysub
    */
    @Override
    public float getAv_t_subm() {
        return _hyy_eddysub.getAv_t_subm();
    }

    /**
    * Sets the av_t_subm of this hyy_eddysub.
    *
    * @param av_t_subm the av_t_subm of this hyy_eddysub
    */
    @Override
    public void setAv_t_subm(float av_t_subm) {
        _hyy_eddysub.setAv_t_subm(av_t_subm);
    }

    /**
    * Returns the av_t_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_t_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_t_subm_EMEP() {
        return _hyy_eddysub.getAv_t_subm_EMEP();
    }

    /**
    * Sets the av_t_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_t_subm_EMEP the av_t_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_t_subm_EMEP(int av_t_subm_EMEP) {
        _hyy_eddysub.setAv_t_subm_EMEP(av_t_subm_EMEP);
    }

    /**
    * Returns the av_c_subm of this hyy_eddysub.
    *
    * @return the av_c_subm of this hyy_eddysub
    */
    @Override
    public float getAv_c_subm() {
        return _hyy_eddysub.getAv_c_subm();
    }

    /**
    * Sets the av_c_subm of this hyy_eddysub.
    *
    * @param av_c_subm the av_c_subm of this hyy_eddysub
    */
    @Override
    public void setAv_c_subm(float av_c_subm) {
        _hyy_eddysub.setAv_c_subm(av_c_subm);
    }

    /**
    * Returns the av_c_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_c_subm_EMEP() {
        return _hyy_eddysub.getAv_c_subm_EMEP();
    }

    /**
    * Sets the av_c_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_c_subm_EMEP the av_c_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_c_subm_EMEP(int av_c_subm_EMEP) {
        _hyy_eddysub.setAv_c_subm_EMEP(av_c_subm_EMEP);
    }

    /**
    * Returns the av_h_subm of this hyy_eddysub.
    *
    * @return the av_h_subm of this hyy_eddysub
    */
    @Override
    public float getAv_h_subm() {
        return _hyy_eddysub.getAv_h_subm();
    }

    /**
    * Sets the av_h_subm of this hyy_eddysub.
    *
    * @param av_h_subm the av_h_subm of this hyy_eddysub
    */
    @Override
    public void setAv_h_subm(float av_h_subm) {
        _hyy_eddysub.setAv_h_subm(av_h_subm);
    }

    /**
    * Returns the av_h_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_h_subm_EMEP() {
        return _hyy_eddysub.getAv_h_subm_EMEP();
    }

    /**
    * Sets the av_h_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_h_subm_EMEP the av_h_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_h_subm_EMEP(int av_h_subm_EMEP) {
        _hyy_eddysub.setAv_h_subm_EMEP(av_h_subm_EMEP);
    }

    /**
    * Returns the u_subm of this hyy_eddysub.
    *
    * @return the u_subm of this hyy_eddysub
    */
    @Override
    public float getU_subm() {
        return _hyy_eddysub.getU_subm();
    }

    /**
    * Sets the u_subm of this hyy_eddysub.
    *
    * @param U_subm the u_subm of this hyy_eddysub
    */
    @Override
    public void setU_subm(float U_subm) {
        _hyy_eddysub.setU_subm(U_subm);
    }

    /**
    * Returns the u_subm_ e m e p of this hyy_eddysub.
    *
    * @return the u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getU_subm_EMEP() {
        return _hyy_eddysub.getU_subm_EMEP();
    }

    /**
    * Sets the u_subm_ e m e p of this hyy_eddysub.
    *
    * @param U_subm_EMEP the u_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setU_subm_EMEP(int U_subm_EMEP) {
        _hyy_eddysub.setU_subm_EMEP(U_subm_EMEP);
    }

    /**
    * Returns the wind_dir_subm of this hyy_eddysub.
    *
    * @return the wind_dir_subm of this hyy_eddysub
    */
    @Override
    public float getWind_dir_subm() {
        return _hyy_eddysub.getWind_dir_subm();
    }

    /**
    * Sets the wind_dir_subm of this hyy_eddysub.
    *
    * @param wind_dir_subm the wind_dir_subm of this hyy_eddysub
    */
    @Override
    public void setWind_dir_subm(float wind_dir_subm) {
        _hyy_eddysub.setWind_dir_subm(wind_dir_subm);
    }

    /**
    * Returns the wind_dir_subm_ e m e p of this hyy_eddysub.
    *
    * @return the wind_dir_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getWind_dir_subm_EMEP() {
        return _hyy_eddysub.getWind_dir_subm_EMEP();
    }

    /**
    * Sets the wind_dir_subm_ e m e p of this hyy_eddysub.
    *
    * @param wind_dir_subm_EMEP the wind_dir_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setWind_dir_subm_EMEP(int wind_dir_subm_EMEP) {
        _hyy_eddysub.setWind_dir_subm_EMEP(wind_dir_subm_EMEP);
    }

    /**
    * Returns the eta_subm of this hyy_eddysub.
    *
    * @return the eta_subm of this hyy_eddysub
    */
    @Override
    public float getEta_subm() {
        return _hyy_eddysub.getEta_subm();
    }

    /**
    * Sets the eta_subm of this hyy_eddysub.
    *
    * @param eta_subm the eta_subm of this hyy_eddysub
    */
    @Override
    public void setEta_subm(float eta_subm) {
        _hyy_eddysub.setEta_subm(eta_subm);
    }

    /**
    * Returns the eta_subm_ e m e p of this hyy_eddysub.
    *
    * @return the eta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getEta_subm_EMEP() {
        return _hyy_eddysub.getEta_subm_EMEP();
    }

    /**
    * Sets the eta_subm_ e m e p of this hyy_eddysub.
    *
    * @param eta_subm_EMEP the eta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setEta_subm_EMEP(int eta_subm_EMEP) {
        _hyy_eddysub.setEta_subm_EMEP(eta_subm_EMEP);
    }

    /**
    * Returns the theta_subm of this hyy_eddysub.
    *
    * @return the theta_subm of this hyy_eddysub
    */
    @Override
    public float getTheta_subm() {
        return _hyy_eddysub.getTheta_subm();
    }

    /**
    * Sets the theta_subm of this hyy_eddysub.
    *
    * @param theta_subm the theta_subm of this hyy_eddysub
    */
    @Override
    public void setTheta_subm(float theta_subm) {
        _hyy_eddysub.setTheta_subm(theta_subm);
    }

    /**
    * Returns the theta_subm_ e m e p of this hyy_eddysub.
    *
    * @return the theta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getTheta_subm_EMEP() {
        return _hyy_eddysub.getTheta_subm_EMEP();
    }

    /**
    * Sets the theta_subm_ e m e p of this hyy_eddysub.
    *
    * @param theta_subm_EMEP the theta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setTheta_subm_EMEP(int theta_subm_EMEP) {
        _hyy_eddysub.setTheta_subm_EMEP(theta_subm_EMEP);
    }

    /**
    * Returns the beta_subm of this hyy_eddysub.
    *
    * @return the beta_subm of this hyy_eddysub
    */
    @Override
    public float getBeta_subm() {
        return _hyy_eddysub.getBeta_subm();
    }

    /**
    * Sets the beta_subm of this hyy_eddysub.
    *
    * @param beta_subm the beta_subm of this hyy_eddysub
    */
    @Override
    public void setBeta_subm(float beta_subm) {
        _hyy_eddysub.setBeta_subm(beta_subm);
    }

    /**
    * Returns the beta_subm_ e m e p of this hyy_eddysub.
    *
    * @return the beta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getBeta_subm_EMEP() {
        return _hyy_eddysub.getBeta_subm_EMEP();
    }

    /**
    * Sets the beta_subm_ e m e p of this hyy_eddysub.
    *
    * @param beta_subm_EMEP the beta_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setBeta_subm_EMEP(int beta_subm_EMEP) {
        _hyy_eddysub.setBeta_subm_EMEP(beta_subm_EMEP);
    }

    /**
    * Returns the c_lag_subm of this hyy_eddysub.
    *
    * @return the c_lag_subm of this hyy_eddysub
    */
    @Override
    public float getC_lag_subm() {
        return _hyy_eddysub.getC_lag_subm();
    }

    /**
    * Sets the c_lag_subm of this hyy_eddysub.
    *
    * @param c_lag_subm the c_lag_subm of this hyy_eddysub
    */
    @Override
    public void setC_lag_subm(float c_lag_subm) {
        _hyy_eddysub.setC_lag_subm(c_lag_subm);
    }

    /**
    * Returns the c_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @return the c_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getC_lag_subm_EMEP() {
        return _hyy_eddysub.getC_lag_subm_EMEP();
    }

    /**
    * Sets the c_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @param c_lag_subm_EMEP the c_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setC_lag_subm_EMEP(int c_lag_subm_EMEP) {
        _hyy_eddysub.setC_lag_subm_EMEP(c_lag_subm_EMEP);
    }

    /**
    * Returns the h_lag_subm of this hyy_eddysub.
    *
    * @return the h_lag_subm of this hyy_eddysub
    */
    @Override
    public float getH_lag_subm() {
        return _hyy_eddysub.getH_lag_subm();
    }

    /**
    * Sets the h_lag_subm of this hyy_eddysub.
    *
    * @param h_lag_subm the h_lag_subm of this hyy_eddysub
    */
    @Override
    public void setH_lag_subm(float h_lag_subm) {
        _hyy_eddysub.setH_lag_subm(h_lag_subm);
    }

    /**
    * Returns the h_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @return the h_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getH_lag_subm_EMEP() {
        return _hyy_eddysub.getH_lag_subm_EMEP();
    }

    /**
    * Sets the h_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @param h_lag_subm_EMEP the h_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setH_lag_subm_EMEP(int h_lag_subm_EMEP) {
        _hyy_eddysub.setH_lag_subm_EMEP(h_lag_subm_EMEP);
    }

    /**
    * Returns the err_packet_subm of this hyy_eddysub.
    *
    * @return the err_packet_subm of this hyy_eddysub
    */
    @Override
    public float getErr_packet_subm() {
        return _hyy_eddysub.getErr_packet_subm();
    }

    /**
    * Sets the err_packet_subm of this hyy_eddysub.
    *
    * @param err_packet_subm the err_packet_subm of this hyy_eddysub
    */
    @Override
    public void setErr_packet_subm(float err_packet_subm) {
        _hyy_eddysub.setErr_packet_subm(err_packet_subm);
    }

    /**
    * Returns the err_packet_subm_ e m e p of this hyy_eddysub.
    *
    * @return the err_packet_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getErr_packet_subm_EMEP() {
        return _hyy_eddysub.getErr_packet_subm_EMEP();
    }

    /**
    * Sets the err_packet_subm_ e m e p of this hyy_eddysub.
    *
    * @param err_packet_subm_EMEP the err_packet_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setErr_packet_subm_EMEP(int err_packet_subm_EMEP) {
        _hyy_eddysub.setErr_packet_subm_EMEP(err_packet_subm_EMEP);
    }

    /**
    * Returns the licor_t_std_subm of this hyy_eddysub.
    *
    * @return the licor_t_std_subm of this hyy_eddysub
    */
    @Override
    public float getLicor_t_std_subm() {
        return _hyy_eddysub.getLicor_t_std_subm();
    }

    /**
    * Sets the licor_t_std_subm of this hyy_eddysub.
    *
    * @param licor_t_std_subm the licor_t_std_subm of this hyy_eddysub
    */
    @Override
    public void setLicor_t_std_subm(float licor_t_std_subm) {
        _hyy_eddysub.setLicor_t_std_subm(licor_t_std_subm);
    }

    /**
    * Returns the licor_t_std_subm_ e m e p of this hyy_eddysub.
    *
    * @return the licor_t_std_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getLicor_t_std_subm_EMEP() {
        return _hyy_eddysub.getLicor_t_std_subm_EMEP();
    }

    /**
    * Sets the licor_t_std_subm_ e m e p of this hyy_eddysub.
    *
    * @param licor_t_std_subm_EMEP the licor_t_std_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setLicor_t_std_subm_EMEP(int licor_t_std_subm_EMEP) {
        _hyy_eddysub.setLicor_t_std_subm_EMEP(licor_t_std_subm_EMEP);
    }

    /**
    * Returns the licor_t_av_subm of this hyy_eddysub.
    *
    * @return the licor_t_av_subm of this hyy_eddysub
    */
    @Override
    public float getLicor_t_av_subm() {
        return _hyy_eddysub.getLicor_t_av_subm();
    }

    /**
    * Sets the licor_t_av_subm of this hyy_eddysub.
    *
    * @param licor_t_av_subm the licor_t_av_subm of this hyy_eddysub
    */
    @Override
    public void setLicor_t_av_subm(float licor_t_av_subm) {
        _hyy_eddysub.setLicor_t_av_subm(licor_t_av_subm);
    }

    /**
    * Returns the licor_t_av_subm_ e m e p of this hyy_eddysub.
    *
    * @return the licor_t_av_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getLicor_t_av_subm_EMEP() {
        return _hyy_eddysub.getLicor_t_av_subm_EMEP();
    }

    /**
    * Sets the licor_t_av_subm_ e m e p of this hyy_eddysub.
    *
    * @param licor_t_av_subm_EMEP the licor_t_av_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setLicor_t_av_subm_EMEP(int licor_t_av_subm_EMEP) {
        _hyy_eddysub.setLicor_t_av_subm_EMEP(licor_t_av_subm_EMEP);
    }

    /**
    * Returns the licor_p_std_subm of this hyy_eddysub.
    *
    * @return the licor_p_std_subm of this hyy_eddysub
    */
    @Override
    public float getLicor_p_std_subm() {
        return _hyy_eddysub.getLicor_p_std_subm();
    }

    /**
    * Sets the licor_p_std_subm of this hyy_eddysub.
    *
    * @param licor_p_std_subm the licor_p_std_subm of this hyy_eddysub
    */
    @Override
    public void setLicor_p_std_subm(float licor_p_std_subm) {
        _hyy_eddysub.setLicor_p_std_subm(licor_p_std_subm);
    }

    /**
    * Returns the licor_p_std_subm_ e m e p of this hyy_eddysub.
    *
    * @return the licor_p_std_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getLicor_p_std_subm_EMEP() {
        return _hyy_eddysub.getLicor_p_std_subm_EMEP();
    }

    /**
    * Sets the licor_p_std_subm_ e m e p of this hyy_eddysub.
    *
    * @param licor_p_std_subm_EMEP the licor_p_std_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setLicor_p_std_subm_EMEP(int licor_p_std_subm_EMEP) {
        _hyy_eddysub.setLicor_p_std_subm_EMEP(licor_p_std_subm_EMEP);
    }

    /**
    * Returns the licor_p_av_subm of this hyy_eddysub.
    *
    * @return the licor_p_av_subm of this hyy_eddysub
    */
    @Override
    public float getLicor_p_av_subm() {
        return _hyy_eddysub.getLicor_p_av_subm();
    }

    /**
    * Sets the licor_p_av_subm of this hyy_eddysub.
    *
    * @param licor_p_av_subm the licor_p_av_subm of this hyy_eddysub
    */
    @Override
    public void setLicor_p_av_subm(float licor_p_av_subm) {
        _hyy_eddysub.setLicor_p_av_subm(licor_p_av_subm);
    }

    /**
    * Returns the licor_p_av_subm_ e m e p of this hyy_eddysub.
    *
    * @return the licor_p_av_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getLicor_p_av_subm_EMEP() {
        return _hyy_eddysub.getLicor_p_av_subm_EMEP();
    }

    /**
    * Sets the licor_p_av_subm_ e m e p of this hyy_eddysub.
    *
    * @param licor_p_av_subm_EMEP the licor_p_av_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setLicor_p_av_subm_EMEP(int licor_p_av_subm_EMEP) {
        _hyy_eddysub.setLicor_p_av_subm_EMEP(licor_p_av_subm_EMEP);
    }

    /**
    * Returns the av_ o3_subm of this hyy_eddysub.
    *
    * @return the av_ o3_subm of this hyy_eddysub
    */
    @Override
    public float getAv_O3_subm() {
        return _hyy_eddysub.getAv_O3_subm();
    }

    /**
    * Sets the av_ o3_subm of this hyy_eddysub.
    *
    * @param av_O3_subm the av_ o3_subm of this hyy_eddysub
    */
    @Override
    public void setAv_O3_subm(float av_O3_subm) {
        _hyy_eddysub.setAv_O3_subm(av_O3_subm);
    }

    /**
    * Returns the av_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @return the av_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getAv_O3_subm_EMEP() {
        return _hyy_eddysub.getAv_O3_subm_EMEP();
    }

    /**
    * Sets the av_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @param av_O3_subm_EMEP the av_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setAv_O3_subm_EMEP(int av_O3_subm_EMEP) {
        _hyy_eddysub.setAv_O3_subm_EMEP(av_O3_subm_EMEP);
    }

    /**
    * Returns the std_ o3_subm of this hyy_eddysub.
    *
    * @return the std_ o3_subm of this hyy_eddysub
    */
    @Override
    public float getStd_O3_subm() {
        return _hyy_eddysub.getStd_O3_subm();
    }

    /**
    * Sets the std_ o3_subm of this hyy_eddysub.
    *
    * @param std_O3_subm the std_ o3_subm of this hyy_eddysub
    */
    @Override
    public void setStd_O3_subm(float std_O3_subm) {
        _hyy_eddysub.setStd_O3_subm(std_O3_subm);
    }

    /**
    * Returns the std_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @return the std_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getStd_O3_subm_EMEP() {
        return _hyy_eddysub.getStd_O3_subm_EMEP();
    }

    /**
    * Sets the std_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @param std_O3_subm_EMEP the std_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setStd_O3_subm_EMEP(int std_O3_subm_EMEP) {
        _hyy_eddysub.setStd_O3_subm_EMEP(std_O3_subm_EMEP);
    }

    /**
    * Returns the o3_lag_subm of this hyy_eddysub.
    *
    * @return the o3_lag_subm of this hyy_eddysub
    */
    @Override
    public float getO3_lag_subm() {
        return _hyy_eddysub.getO3_lag_subm();
    }

    /**
    * Sets the o3_lag_subm of this hyy_eddysub.
    *
    * @param O3_lag_subm the o3_lag_subm of this hyy_eddysub
    */
    @Override
    public void setO3_lag_subm(float O3_lag_subm) {
        _hyy_eddysub.setO3_lag_subm(O3_lag_subm);
    }

    /**
    * Returns the o3_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @return the o3_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getO3_lag_subm_EMEP() {
        return _hyy_eddysub.getO3_lag_subm_EMEP();
    }

    /**
    * Sets the o3_lag_subm_ e m e p of this hyy_eddysub.
    *
    * @param O3_lag_subm_EMEP the o3_lag_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setO3_lag_subm_EMEP(int O3_lag_subm_EMEP) {
        _hyy_eddysub.setO3_lag_subm_EMEP(O3_lag_subm_EMEP);
    }

    /**
    * Returns the f_ o3_subm of this hyy_eddysub.
    *
    * @return the f_ o3_subm of this hyy_eddysub
    */
    @Override
    public float getF_O3_subm() {
        return _hyy_eddysub.getF_O3_subm();
    }

    /**
    * Sets the f_ o3_subm of this hyy_eddysub.
    *
    * @param F_O3_subm the f_ o3_subm of this hyy_eddysub
    */
    @Override
    public void setF_O3_subm(float F_O3_subm) {
        _hyy_eddysub.setF_O3_subm(F_O3_subm);
    }

    /**
    * Returns the f_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @return the f_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getF_O3_subm_EMEP() {
        return _hyy_eddysub.getF_O3_subm_EMEP();
    }

    /**
    * Sets the f_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @param F_O3_subm_EMEP the f_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setF_O3_subm_EMEP(int F_O3_subm_EMEP) {
        _hyy_eddysub.setF_O3_subm_EMEP(F_O3_subm_EMEP);
    }

    /**
    * Returns the qc_ f_ o3_subm of this hyy_eddysub.
    *
    * @return the qc_ f_ o3_subm of this hyy_eddysub
    */
    @Override
    public int getQc_F_O3_subm() {
        return _hyy_eddysub.getQc_F_O3_subm();
    }

    /**
    * Sets the qc_ f_ o3_subm of this hyy_eddysub.
    *
    * @param Qc_F_O3_subm the qc_ f_ o3_subm of this hyy_eddysub
    */
    @Override
    public void setQc_F_O3_subm(int Qc_F_O3_subm) {
        _hyy_eddysub.setQc_F_O3_subm(Qc_F_O3_subm);
    }

    /**
    * Returns the qc_ f_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @return the qc_ f_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public int getQc_F_O3_subm_EMEP() {
        return _hyy_eddysub.getQc_F_O3_subm_EMEP();
    }

    /**
    * Sets the qc_ f_ o3_subm_ e m e p of this hyy_eddysub.
    *
    * @param Qc_F_O3_subm_EMEP the qc_ f_ o3_subm_ e m e p of this hyy_eddysub
    */
    @Override
    public void setQc_F_O3_subm_EMEP(int Qc_F_O3_subm_EMEP) {
        _hyy_eddysub.setQc_F_O3_subm_EMEP(Qc_F_O3_subm_EMEP);
    }

    @Override
    public boolean isNew() {
        return _hyy_eddysub.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hyy_eddysub.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hyy_eddysub.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hyy_eddysub.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hyy_eddysub.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hyy_eddysub.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hyy_eddysub.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hyy_eddysub.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hyy_eddysub.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hyy_eddysub.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hyy_eddysub.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Hyy_eddysubWrapper((Hyy_eddysub) _hyy_eddysub.clone());
    }

    @Override
    public int compareTo(Hyy_eddysub hyy_eddysub) {
        return _hyy_eddysub.compareTo(hyy_eddysub);
    }

    @Override
    public int hashCode() {
        return _hyy_eddysub.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Hyy_eddysub> toCacheModel() {
        return _hyy_eddysub.toCacheModel();
    }

    @Override
    public Hyy_eddysub toEscapedModel() {
        return new Hyy_eddysubWrapper(_hyy_eddysub.toEscapedModel());
    }

    @Override
    public Hyy_eddysub toUnescapedModel() {
        return new Hyy_eddysubWrapper(_hyy_eddysub.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hyy_eddysub.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hyy_eddysub.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hyy_eddysub.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Hyy_eddysubWrapper)) {
            return false;
        }

        Hyy_eddysubWrapper hyy_eddysubWrapper = (Hyy_eddysubWrapper) obj;

        if (Validator.equals(_hyy_eddysub, hyy_eddysubWrapper._hyy_eddysub)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Hyy_eddysub getWrappedHyy_eddysub() {
        return _hyy_eddysub;
    }

    @Override
    public Hyy_eddysub getWrappedModel() {
        return _hyy_eddysub;
    }

    @Override
    public void resetOriginalValues() {
        _hyy_eddysub.resetOriginalValues();
    }
}
