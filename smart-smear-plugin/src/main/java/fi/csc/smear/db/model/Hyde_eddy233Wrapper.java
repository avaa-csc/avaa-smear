package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hyde_eddy233}.
 * </p>
 *
 * @author pj
 * @see Hyde_eddy233
 * @generated
 */
public class Hyde_eddy233Wrapper implements Hyde_eddy233,
    ModelWrapper<Hyde_eddy233> {
    private Hyde_eddy233 _hyde_eddy233;

    public Hyde_eddy233Wrapper(Hyde_eddy233 hyde_eddy233) {
        _hyde_eddy233 = hyde_eddy233;
    }

    @Override
    public Class<?> getModelClass() {
        return Hyde_eddy233.class;
    }

    @Override
    public String getModelClassName() {
        return Hyde_eddy233.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("H", getH());
        attributes.put("LE", getLE());
        attributes.put("E", getE());
        attributes.put("F_c", getF_c());
        attributes.put("tau", getTau());
        attributes.put("u_star", getU_star());
        attributes.put("MO_length", getMO_length());
        attributes.put("std_u", getStd_u());
        attributes.put("std_v", getStd_v());
        attributes.put("std_w", getStd_w());
        attributes.put("av_u", getAv_u());
        attributes.put("av_v", getAv_v());
        attributes.put("av_w", getAv_w());
        attributes.put("av_t", getAv_t());
        attributes.put("av_c", getAv_c());
        attributes.put("av_h", getAv_h());
        attributes.put("U", getU());
        attributes.put("wind_dir", getWind_dir());
        attributes.put("eta", getEta());
        attributes.put("theta", getTheta());
        attributes.put("beta", getBeta());
        attributes.put("c_lag", getC_lag());
        attributes.put("h_lag", getH_lag());
        attributes.put("err_packet", getErr_packet());
        attributes.put("licor_t_av", getLicor_t_av());
        attributes.put("licor_t_std", getLicor_t_std());
        attributes.put("licor_p_av", getLicor_p_av());
        attributes.put("licor_p_std", getLicor_p_std());
        attributes.put("F_CPC", getF_CPC());
        attributes.put("std_CPC", getStd_CPC());
        attributes.put("av_CPC", getAv_CPC());
        attributes.put("CPC_lag", getCPC_lag());
        attributes.put("std_t", getStd_t());
        attributes.put("std_c", getStd_c());
        attributes.put("std_h", getStd_h());
        attributes.put("quality", getQuality());
        attributes.put("Qc_H", getQc_H());
        attributes.put("Qc_LE", getQc_LE());
        attributes.put("Qc_E", getQc_E());
        attributes.put("Qc_F_c", getQc_F_c());
        attributes.put("Qc_tau", getQc_tau());
        attributes.put("Qc_F_CPC", getQc_F_CPC());
        attributes.put("H_EMEP", getH_EMEP());
        attributes.put("LE_EMEP", getLE_EMEP());
        attributes.put("E_EMEP", getE_EMEP());
        attributes.put("F_c_EMEP", getF_c_EMEP());
        attributes.put("tau_EMEP", getTau_EMEP());
        attributes.put("u_star_EMEP", getU_star_EMEP());
        attributes.put("MO_length_EMEP", getMO_length_EMEP());
        attributes.put("std_u_EMEP", getStd_u_EMEP());
        attributes.put("std_v_EMEP", getStd_v_EMEP());
        attributes.put("std_w_EMEP", getStd_w_EMEP());
        attributes.put("av_u_EMEP", getAv_u_EMEP());
        attributes.put("av_v_EMEP", getAv_v_EMEP());
        attributes.put("av_w_EMEP", getAv_w_EMEP());
        attributes.put("av_t_EMEP", getAv_t_EMEP());
        attributes.put("av_c_EMEP", getAv_c_EMEP());
        attributes.put("av_h_EMEP", getAv_h_EMEP());
        attributes.put("U_EMEP", getU_EMEP());
        attributes.put("wind_dir_EMEP", getWind_dir_EMEP());
        attributes.put("eta_EMEP", getEta_EMEP());
        attributes.put("theta_EMEP", getTheta_EMEP());
        attributes.put("beta_EMEP", getBeta_EMEP());
        attributes.put("c_lag_EMEP", getC_lag_EMEP());
        attributes.put("h_lag_EMEP", getH_lag_EMEP());
        attributes.put("err_packet_EMEP", getErr_packet_EMEP());
        attributes.put("licor_t_av_EMEP", getLicor_t_av_EMEP());
        attributes.put("licor_t_std_EMEP", getLicor_t_std_EMEP());
        attributes.put("licor_p_av_EMEP", getLicor_p_av_EMEP());
        attributes.put("licor_p_std_EMEP", getLicor_p_std_EMEP());
        attributes.put("F_CPC_EMEP", getF_CPC_EMEP());
        attributes.put("std_CPC_EMEP", getStd_CPC_EMEP());
        attributes.put("av_CPC_EMEP", getAv_CPC_EMEP());
        attributes.put("CPC_lag_EMEP", getCPC_lag_EMEP());
        attributes.put("std_t_EMEP", getStd_t_EMEP());
        attributes.put("std_c_EMEP", getStd_c_EMEP());
        attributes.put("std_h_EMEP", getStd_h_EMEP());
        attributes.put("quality_EMEP", getQuality_EMEP());
        attributes.put("Qc_H_EMEP", getQc_H_EMEP());
        attributes.put("Qc_LE_EMEP", getQc_LE_EMEP());
        attributes.put("Qc_E_EMEP", getQc_E_EMEP());
        attributes.put("Qc_F_c_EMEP", getQc_F_c_EMEP());
        attributes.put("Qc_tau_EMEP", getQc_tau_EMEP());
        attributes.put("Qc_F_CPC_EMEP", getQc_F_CPC_EMEP());
        attributes.put("NEE", getNEE());
        attributes.put("Qc_gapf_NEE", getQc_gapf_NEE());
        attributes.put("GPP", getGPP());
        attributes.put("TER", getTER());
        attributes.put("H_gapf", getH_gapf());
        attributes.put("Qc_gapf_H", getQc_gapf_H());
        attributes.put("ET_gapf", getET_gapf());
        attributes.put("Qc_gapf_ET", getQc_gapf_ET());
        attributes.put("NEE_EMEP", getNEE_EMEP());
        attributes.put("Qc_gapf_NEE_EMEP", getQc_gapf_NEE_EMEP());
        attributes.put("GPP_EMEP", getGPP_EMEP());
        attributes.put("TER_EMEP", getTER_EMEP());
        attributes.put("H_gapf_EMEP", getH_gapf_EMEP());
        attributes.put("Qc_gapf_H_EMEP", getQc_gapf_H_EMEP());
        attributes.put("ET_gapf_EMEP", getET_gapf_EMEP());
        attributes.put("Qc_gapf_ET_EMEP", getQc_gapf_ET_EMEP());

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

        Float LE = (Float) attributes.get("LE");

        if (LE != null) {
            setLE(LE);
        }

        Float E = (Float) attributes.get("E");

        if (E != null) {
            setE(E);
        }

        Float F_c = (Float) attributes.get("F_c");

        if (F_c != null) {
            setF_c(F_c);
        }

        Float tau = (Float) attributes.get("tau");

        if (tau != null) {
            setTau(tau);
        }

        Float u_star = (Float) attributes.get("u_star");

        if (u_star != null) {
            setU_star(u_star);
        }

        Float MO_length = (Float) attributes.get("MO_length");

        if (MO_length != null) {
            setMO_length(MO_length);
        }

        Float std_u = (Float) attributes.get("std_u");

        if (std_u != null) {
            setStd_u(std_u);
        }

        Float std_v = (Float) attributes.get("std_v");

        if (std_v != null) {
            setStd_v(std_v);
        }

        Float std_w = (Float) attributes.get("std_w");

        if (std_w != null) {
            setStd_w(std_w);
        }

        Float av_u = (Float) attributes.get("av_u");

        if (av_u != null) {
            setAv_u(av_u);
        }

        Float av_v = (Float) attributes.get("av_v");

        if (av_v != null) {
            setAv_v(av_v);
        }

        Float av_w = (Float) attributes.get("av_w");

        if (av_w != null) {
            setAv_w(av_w);
        }

        Float av_t = (Float) attributes.get("av_t");

        if (av_t != null) {
            setAv_t(av_t);
        }

        Float av_c = (Float) attributes.get("av_c");

        if (av_c != null) {
            setAv_c(av_c);
        }

        Float av_h = (Float) attributes.get("av_h");

        if (av_h != null) {
            setAv_h(av_h);
        }

        Float U = (Float) attributes.get("U");

        if (U != null) {
            setU(U);
        }

        Float wind_dir = (Float) attributes.get("wind_dir");

        if (wind_dir != null) {
            setWind_dir(wind_dir);
        }

        Float eta = (Float) attributes.get("eta");

        if (eta != null) {
            setEta(eta);
        }

        Float theta = (Float) attributes.get("theta");

        if (theta != null) {
            setTheta(theta);
        }

        Float beta = (Float) attributes.get("beta");

        if (beta != null) {
            setBeta(beta);
        }

        Integer c_lag = (Integer) attributes.get("c_lag");

        if (c_lag != null) {
            setC_lag(c_lag);
        }

        Integer h_lag = (Integer) attributes.get("h_lag");

        if (h_lag != null) {
            setH_lag(h_lag);
        }

        Integer err_packet = (Integer) attributes.get("err_packet");

        if (err_packet != null) {
            setErr_packet(err_packet);
        }

        Float licor_t_av = (Float) attributes.get("licor_t_av");

        if (licor_t_av != null) {
            setLicor_t_av(licor_t_av);
        }

        Float licor_t_std = (Float) attributes.get("licor_t_std");

        if (licor_t_std != null) {
            setLicor_t_std(licor_t_std);
        }

        Float licor_p_av = (Float) attributes.get("licor_p_av");

        if (licor_p_av != null) {
            setLicor_p_av(licor_p_av);
        }

        Float licor_p_std = (Float) attributes.get("licor_p_std");

        if (licor_p_std != null) {
            setLicor_p_std(licor_p_std);
        }

        Float F_CPC = (Float) attributes.get("F_CPC");

        if (F_CPC != null) {
            setF_CPC(F_CPC);
        }

        Float std_CPC = (Float) attributes.get("std_CPC");

        if (std_CPC != null) {
            setStd_CPC(std_CPC);
        }

        Float av_CPC = (Float) attributes.get("av_CPC");

        if (av_CPC != null) {
            setAv_CPC(av_CPC);
        }

        Integer CPC_lag = (Integer) attributes.get("CPC_lag");

        if (CPC_lag != null) {
            setCPC_lag(CPC_lag);
        }

        Float std_t = (Float) attributes.get("std_t");

        if (std_t != null) {
            setStd_t(std_t);
        }

        Float std_c = (Float) attributes.get("std_c");

        if (std_c != null) {
            setStd_c(std_c);
        }

        Float std_h = (Float) attributes.get("std_h");

        if (std_h != null) {
            setStd_h(std_h);
        }

        Integer quality = (Integer) attributes.get("quality");

        if (quality != null) {
            setQuality(quality);
        }

        Integer Qc_H = (Integer) attributes.get("Qc_H");

        if (Qc_H != null) {
            setQc_H(Qc_H);
        }

        Integer Qc_LE = (Integer) attributes.get("Qc_LE");

        if (Qc_LE != null) {
            setQc_LE(Qc_LE);
        }

        Integer Qc_E = (Integer) attributes.get("Qc_E");

        if (Qc_E != null) {
            setQc_E(Qc_E);
        }

        Integer Qc_F_c = (Integer) attributes.get("Qc_F_c");

        if (Qc_F_c != null) {
            setQc_F_c(Qc_F_c);
        }

        Integer Qc_tau = (Integer) attributes.get("Qc_tau");

        if (Qc_tau != null) {
            setQc_tau(Qc_tau);
        }

        Integer Qc_F_CPC = (Integer) attributes.get("Qc_F_CPC");

        if (Qc_F_CPC != null) {
            setQc_F_CPC(Qc_F_CPC);
        }

        Integer H_EMEP = (Integer) attributes.get("H_EMEP");

        if (H_EMEP != null) {
            setH_EMEP(H_EMEP);
        }

        Integer LE_EMEP = (Integer) attributes.get("LE_EMEP");

        if (LE_EMEP != null) {
            setLE_EMEP(LE_EMEP);
        }

        Integer E_EMEP = (Integer) attributes.get("E_EMEP");

        if (E_EMEP != null) {
            setE_EMEP(E_EMEP);
        }

        Integer F_c_EMEP = (Integer) attributes.get("F_c_EMEP");

        if (F_c_EMEP != null) {
            setF_c_EMEP(F_c_EMEP);
        }

        Integer tau_EMEP = (Integer) attributes.get("tau_EMEP");

        if (tau_EMEP != null) {
            setTau_EMEP(tau_EMEP);
        }

        Integer u_star_EMEP = (Integer) attributes.get("u_star_EMEP");

        if (u_star_EMEP != null) {
            setU_star_EMEP(u_star_EMEP);
        }

        Integer MO_length_EMEP = (Integer) attributes.get("MO_length_EMEP");

        if (MO_length_EMEP != null) {
            setMO_length_EMEP(MO_length_EMEP);
        }

        Integer std_u_EMEP = (Integer) attributes.get("std_u_EMEP");

        if (std_u_EMEP != null) {
            setStd_u_EMEP(std_u_EMEP);
        }

        Integer std_v_EMEP = (Integer) attributes.get("std_v_EMEP");

        if (std_v_EMEP != null) {
            setStd_v_EMEP(std_v_EMEP);
        }

        Integer std_w_EMEP = (Integer) attributes.get("std_w_EMEP");

        if (std_w_EMEP != null) {
            setStd_w_EMEP(std_w_EMEP);
        }

        Integer av_u_EMEP = (Integer) attributes.get("av_u_EMEP");

        if (av_u_EMEP != null) {
            setAv_u_EMEP(av_u_EMEP);
        }

        Integer av_v_EMEP = (Integer) attributes.get("av_v_EMEP");

        if (av_v_EMEP != null) {
            setAv_v_EMEP(av_v_EMEP);
        }

        Integer av_w_EMEP = (Integer) attributes.get("av_w_EMEP");

        if (av_w_EMEP != null) {
            setAv_w_EMEP(av_w_EMEP);
        }

        Integer av_t_EMEP = (Integer) attributes.get("av_t_EMEP");

        if (av_t_EMEP != null) {
            setAv_t_EMEP(av_t_EMEP);
        }

        Integer av_c_EMEP = (Integer) attributes.get("av_c_EMEP");

        if (av_c_EMEP != null) {
            setAv_c_EMEP(av_c_EMEP);
        }

        Integer av_h_EMEP = (Integer) attributes.get("av_h_EMEP");

        if (av_h_EMEP != null) {
            setAv_h_EMEP(av_h_EMEP);
        }

        Integer U_EMEP = (Integer) attributes.get("U_EMEP");

        if (U_EMEP != null) {
            setU_EMEP(U_EMEP);
        }

        Integer wind_dir_EMEP = (Integer) attributes.get("wind_dir_EMEP");

        if (wind_dir_EMEP != null) {
            setWind_dir_EMEP(wind_dir_EMEP);
        }

        Integer eta_EMEP = (Integer) attributes.get("eta_EMEP");

        if (eta_EMEP != null) {
            setEta_EMEP(eta_EMEP);
        }

        Integer theta_EMEP = (Integer) attributes.get("theta_EMEP");

        if (theta_EMEP != null) {
            setTheta_EMEP(theta_EMEP);
        }

        Integer beta_EMEP = (Integer) attributes.get("beta_EMEP");

        if (beta_EMEP != null) {
            setBeta_EMEP(beta_EMEP);
        }

        Integer c_lag_EMEP = (Integer) attributes.get("c_lag_EMEP");

        if (c_lag_EMEP != null) {
            setC_lag_EMEP(c_lag_EMEP);
        }

        Integer h_lag_EMEP = (Integer) attributes.get("h_lag_EMEP");

        if (h_lag_EMEP != null) {
            setH_lag_EMEP(h_lag_EMEP);
        }

        Integer err_packet_EMEP = (Integer) attributes.get("err_packet_EMEP");

        if (err_packet_EMEP != null) {
            setErr_packet_EMEP(err_packet_EMEP);
        }

        Integer licor_t_av_EMEP = (Integer) attributes.get("licor_t_av_EMEP");

        if (licor_t_av_EMEP != null) {
            setLicor_t_av_EMEP(licor_t_av_EMEP);
        }

        Integer licor_t_std_EMEP = (Integer) attributes.get("licor_t_std_EMEP");

        if (licor_t_std_EMEP != null) {
            setLicor_t_std_EMEP(licor_t_std_EMEP);
        }

        Integer licor_p_av_EMEP = (Integer) attributes.get("licor_p_av_EMEP");

        if (licor_p_av_EMEP != null) {
            setLicor_p_av_EMEP(licor_p_av_EMEP);
        }

        Integer licor_p_std_EMEP = (Integer) attributes.get("licor_p_std_EMEP");

        if (licor_p_std_EMEP != null) {
            setLicor_p_std_EMEP(licor_p_std_EMEP);
        }

        Integer F_CPC_EMEP = (Integer) attributes.get("F_CPC_EMEP");

        if (F_CPC_EMEP != null) {
            setF_CPC_EMEP(F_CPC_EMEP);
        }

        Integer std_CPC_EMEP = (Integer) attributes.get("std_CPC_EMEP");

        if (std_CPC_EMEP != null) {
            setStd_CPC_EMEP(std_CPC_EMEP);
        }

        Integer av_CPC_EMEP = (Integer) attributes.get("av_CPC_EMEP");

        if (av_CPC_EMEP != null) {
            setAv_CPC_EMEP(av_CPC_EMEP);
        }

        Integer CPC_lag_EMEP = (Integer) attributes.get("CPC_lag_EMEP");

        if (CPC_lag_EMEP != null) {
            setCPC_lag_EMEP(CPC_lag_EMEP);
        }

        Integer std_t_EMEP = (Integer) attributes.get("std_t_EMEP");

        if (std_t_EMEP != null) {
            setStd_t_EMEP(std_t_EMEP);
        }

        Integer std_c_EMEP = (Integer) attributes.get("std_c_EMEP");

        if (std_c_EMEP != null) {
            setStd_c_EMEP(std_c_EMEP);
        }

        Integer std_h_EMEP = (Integer) attributes.get("std_h_EMEP");

        if (std_h_EMEP != null) {
            setStd_h_EMEP(std_h_EMEP);
        }

        Integer quality_EMEP = (Integer) attributes.get("quality_EMEP");

        if (quality_EMEP != null) {
            setQuality_EMEP(quality_EMEP);
        }

        Integer Qc_H_EMEP = (Integer) attributes.get("Qc_H_EMEP");

        if (Qc_H_EMEP != null) {
            setQc_H_EMEP(Qc_H_EMEP);
        }

        Integer Qc_LE_EMEP = (Integer) attributes.get("Qc_LE_EMEP");

        if (Qc_LE_EMEP != null) {
            setQc_LE_EMEP(Qc_LE_EMEP);
        }

        Integer Qc_E_EMEP = (Integer) attributes.get("Qc_E_EMEP");

        if (Qc_E_EMEP != null) {
            setQc_E_EMEP(Qc_E_EMEP);
        }

        Integer Qc_F_c_EMEP = (Integer) attributes.get("Qc_F_c_EMEP");

        if (Qc_F_c_EMEP != null) {
            setQc_F_c_EMEP(Qc_F_c_EMEP);
        }

        Integer Qc_tau_EMEP = (Integer) attributes.get("Qc_tau_EMEP");

        if (Qc_tau_EMEP != null) {
            setQc_tau_EMEP(Qc_tau_EMEP);
        }

        Integer Qc_F_CPC_EMEP = (Integer) attributes.get("Qc_F_CPC_EMEP");

        if (Qc_F_CPC_EMEP != null) {
            setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
        }

        Float NEE = (Float) attributes.get("NEE");

        if (NEE != null) {
            setNEE(NEE);
        }

        Integer Qc_gapf_NEE = (Integer) attributes.get("Qc_gapf_NEE");

        if (Qc_gapf_NEE != null) {
            setQc_gapf_NEE(Qc_gapf_NEE);
        }

        Float GPP = (Float) attributes.get("GPP");

        if (GPP != null) {
            setGPP(GPP);
        }

        Float TER = (Float) attributes.get("TER");

        if (TER != null) {
            setTER(TER);
        }

        Float H_gapf = (Float) attributes.get("H_gapf");

        if (H_gapf != null) {
            setH_gapf(H_gapf);
        }

        Integer Qc_gapf_H = (Integer) attributes.get("Qc_gapf_H");

        if (Qc_gapf_H != null) {
            setQc_gapf_H(Qc_gapf_H);
        }

        Float ET_gapf = (Float) attributes.get("ET_gapf");

        if (ET_gapf != null) {
            setET_gapf(ET_gapf);
        }

        Integer Qc_gapf_ET = (Integer) attributes.get("Qc_gapf_ET");

        if (Qc_gapf_ET != null) {
            setQc_gapf_ET(Qc_gapf_ET);
        }

        Integer NEE_EMEP = (Integer) attributes.get("NEE_EMEP");

        if (NEE_EMEP != null) {
            setNEE_EMEP(NEE_EMEP);
        }

        Integer Qc_gapf_NEE_EMEP = (Integer) attributes.get("Qc_gapf_NEE_EMEP");

        if (Qc_gapf_NEE_EMEP != null) {
            setQc_gapf_NEE_EMEP(Qc_gapf_NEE_EMEP);
        }

        Integer GPP_EMEP = (Integer) attributes.get("GPP_EMEP");

        if (GPP_EMEP != null) {
            setGPP_EMEP(GPP_EMEP);
        }

        Integer TER_EMEP = (Integer) attributes.get("TER_EMEP");

        if (TER_EMEP != null) {
            setTER_EMEP(TER_EMEP);
        }

        Integer H_gapf_EMEP = (Integer) attributes.get("H_gapf_EMEP");

        if (H_gapf_EMEP != null) {
            setH_gapf_EMEP(H_gapf_EMEP);
        }

        Integer Qc_gapf_H_EMEP = (Integer) attributes.get("Qc_gapf_H_EMEP");

        if (Qc_gapf_H_EMEP != null) {
            setQc_gapf_H_EMEP(Qc_gapf_H_EMEP);
        }

        Integer ET_gapf_EMEP = (Integer) attributes.get("ET_gapf_EMEP");

        if (ET_gapf_EMEP != null) {
            setET_gapf_EMEP(ET_gapf_EMEP);
        }

        Integer Qc_gapf_ET_EMEP = (Integer) attributes.get("Qc_gapf_ET_EMEP");

        if (Qc_gapf_ET_EMEP != null) {
            setQc_gapf_ET_EMEP(Qc_gapf_ET_EMEP);
        }
    }

    /**
    * Returns the primary key of this hyde_eddy233.
    *
    * @return the primary key of this hyde_eddy233
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _hyde_eddy233.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hyde_eddy233.
    *
    * @param primaryKey the primary key of this hyde_eddy233
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _hyde_eddy233.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this hyde_eddy233.
    *
    * @return the samptime of this hyde_eddy233
    */
    @Override
    public java.util.Date getSamptime() {
        return _hyde_eddy233.getSamptime();
    }

    /**
    * Sets the samptime of this hyde_eddy233.
    *
    * @param samptime the samptime of this hyde_eddy233
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _hyde_eddy233.setSamptime(samptime);
    }

    /**
    * Returns the h of this hyde_eddy233.
    *
    * @return the h of this hyde_eddy233
    */
    @Override
    public float getH() {
        return _hyde_eddy233.getH();
    }

    /**
    * Sets the h of this hyde_eddy233.
    *
    * @param H the h of this hyde_eddy233
    */
    @Override
    public void setH(float H) {
        _hyde_eddy233.setH(H);
    }

    /**
    * Returns the l e of this hyde_eddy233.
    *
    * @return the l e of this hyde_eddy233
    */
    @Override
    public float getLE() {
        return _hyde_eddy233.getLE();
    }

    /**
    * Sets the l e of this hyde_eddy233.
    *
    * @param LE the l e of this hyde_eddy233
    */
    @Override
    public void setLE(float LE) {
        _hyde_eddy233.setLE(LE);
    }

    /**
    * Returns the e of this hyde_eddy233.
    *
    * @return the e of this hyde_eddy233
    */
    @Override
    public float getE() {
        return _hyde_eddy233.getE();
    }

    /**
    * Sets the e of this hyde_eddy233.
    *
    * @param E the e of this hyde_eddy233
    */
    @Override
    public void setE(float E) {
        _hyde_eddy233.setE(E);
    }

    /**
    * Returns the f_c of this hyde_eddy233.
    *
    * @return the f_c of this hyde_eddy233
    */
    @Override
    public float getF_c() {
        return _hyde_eddy233.getF_c();
    }

    /**
    * Sets the f_c of this hyde_eddy233.
    *
    * @param F_c the f_c of this hyde_eddy233
    */
    @Override
    public void setF_c(float F_c) {
        _hyde_eddy233.setF_c(F_c);
    }

    /**
    * Returns the tau of this hyde_eddy233.
    *
    * @return the tau of this hyde_eddy233
    */
    @Override
    public float getTau() {
        return _hyde_eddy233.getTau();
    }

    /**
    * Sets the tau of this hyde_eddy233.
    *
    * @param tau the tau of this hyde_eddy233
    */
    @Override
    public void setTau(float tau) {
        _hyde_eddy233.setTau(tau);
    }

    /**
    * Returns the u_star of this hyde_eddy233.
    *
    * @return the u_star of this hyde_eddy233
    */
    @Override
    public float getU_star() {
        return _hyde_eddy233.getU_star();
    }

    /**
    * Sets the u_star of this hyde_eddy233.
    *
    * @param u_star the u_star of this hyde_eddy233
    */
    @Override
    public void setU_star(float u_star) {
        _hyde_eddy233.setU_star(u_star);
    }

    /**
    * Returns the m o_length of this hyde_eddy233.
    *
    * @return the m o_length of this hyde_eddy233
    */
    @Override
    public float getMO_length() {
        return _hyde_eddy233.getMO_length();
    }

    /**
    * Sets the m o_length of this hyde_eddy233.
    *
    * @param MO_length the m o_length of this hyde_eddy233
    */
    @Override
    public void setMO_length(float MO_length) {
        _hyde_eddy233.setMO_length(MO_length);
    }

    /**
    * Returns the std_u of this hyde_eddy233.
    *
    * @return the std_u of this hyde_eddy233
    */
    @Override
    public float getStd_u() {
        return _hyde_eddy233.getStd_u();
    }

    /**
    * Sets the std_u of this hyde_eddy233.
    *
    * @param std_u the std_u of this hyde_eddy233
    */
    @Override
    public void setStd_u(float std_u) {
        _hyde_eddy233.setStd_u(std_u);
    }

    /**
    * Returns the std_v of this hyde_eddy233.
    *
    * @return the std_v of this hyde_eddy233
    */
    @Override
    public float getStd_v() {
        return _hyde_eddy233.getStd_v();
    }

    /**
    * Sets the std_v of this hyde_eddy233.
    *
    * @param std_v the std_v of this hyde_eddy233
    */
    @Override
    public void setStd_v(float std_v) {
        _hyde_eddy233.setStd_v(std_v);
    }

    /**
    * Returns the std_w of this hyde_eddy233.
    *
    * @return the std_w of this hyde_eddy233
    */
    @Override
    public float getStd_w() {
        return _hyde_eddy233.getStd_w();
    }

    /**
    * Sets the std_w of this hyde_eddy233.
    *
    * @param std_w the std_w of this hyde_eddy233
    */
    @Override
    public void setStd_w(float std_w) {
        _hyde_eddy233.setStd_w(std_w);
    }

    /**
    * Returns the av_u of this hyde_eddy233.
    *
    * @return the av_u of this hyde_eddy233
    */
    @Override
    public float getAv_u() {
        return _hyde_eddy233.getAv_u();
    }

    /**
    * Sets the av_u of this hyde_eddy233.
    *
    * @param av_u the av_u of this hyde_eddy233
    */
    @Override
    public void setAv_u(float av_u) {
        _hyde_eddy233.setAv_u(av_u);
    }

    /**
    * Returns the av_v of this hyde_eddy233.
    *
    * @return the av_v of this hyde_eddy233
    */
    @Override
    public float getAv_v() {
        return _hyde_eddy233.getAv_v();
    }

    /**
    * Sets the av_v of this hyde_eddy233.
    *
    * @param av_v the av_v of this hyde_eddy233
    */
    @Override
    public void setAv_v(float av_v) {
        _hyde_eddy233.setAv_v(av_v);
    }

    /**
    * Returns the av_w of this hyde_eddy233.
    *
    * @return the av_w of this hyde_eddy233
    */
    @Override
    public float getAv_w() {
        return _hyde_eddy233.getAv_w();
    }

    /**
    * Sets the av_w of this hyde_eddy233.
    *
    * @param av_w the av_w of this hyde_eddy233
    */
    @Override
    public void setAv_w(float av_w) {
        _hyde_eddy233.setAv_w(av_w);
    }

    /**
    * Returns the av_t of this hyde_eddy233.
    *
    * @return the av_t of this hyde_eddy233
    */
    @Override
    public float getAv_t() {
        return _hyde_eddy233.getAv_t();
    }

    /**
    * Sets the av_t of this hyde_eddy233.
    *
    * @param av_t the av_t of this hyde_eddy233
    */
    @Override
    public void setAv_t(float av_t) {
        _hyde_eddy233.setAv_t(av_t);
    }

    /**
    * Returns the av_c of this hyde_eddy233.
    *
    * @return the av_c of this hyde_eddy233
    */
    @Override
    public float getAv_c() {
        return _hyde_eddy233.getAv_c();
    }

    /**
    * Sets the av_c of this hyde_eddy233.
    *
    * @param av_c the av_c of this hyde_eddy233
    */
    @Override
    public void setAv_c(float av_c) {
        _hyde_eddy233.setAv_c(av_c);
    }

    /**
    * Returns the av_h of this hyde_eddy233.
    *
    * @return the av_h of this hyde_eddy233
    */
    @Override
    public float getAv_h() {
        return _hyde_eddy233.getAv_h();
    }

    /**
    * Sets the av_h of this hyde_eddy233.
    *
    * @param av_h the av_h of this hyde_eddy233
    */
    @Override
    public void setAv_h(float av_h) {
        _hyde_eddy233.setAv_h(av_h);
    }

    /**
    * Returns the u of this hyde_eddy233.
    *
    * @return the u of this hyde_eddy233
    */
    @Override
    public float getU() {
        return _hyde_eddy233.getU();
    }

    /**
    * Sets the u of this hyde_eddy233.
    *
    * @param U the u of this hyde_eddy233
    */
    @Override
    public void setU(float U) {
        _hyde_eddy233.setU(U);
    }

    /**
    * Returns the wind_dir of this hyde_eddy233.
    *
    * @return the wind_dir of this hyde_eddy233
    */
    @Override
    public float getWind_dir() {
        return _hyde_eddy233.getWind_dir();
    }

    /**
    * Sets the wind_dir of this hyde_eddy233.
    *
    * @param wind_dir the wind_dir of this hyde_eddy233
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _hyde_eddy233.setWind_dir(wind_dir);
    }

    /**
    * Returns the eta of this hyde_eddy233.
    *
    * @return the eta of this hyde_eddy233
    */
    @Override
    public float getEta() {
        return _hyde_eddy233.getEta();
    }

    /**
    * Sets the eta of this hyde_eddy233.
    *
    * @param eta the eta of this hyde_eddy233
    */
    @Override
    public void setEta(float eta) {
        _hyde_eddy233.setEta(eta);
    }

    /**
    * Returns the theta of this hyde_eddy233.
    *
    * @return the theta of this hyde_eddy233
    */
    @Override
    public float getTheta() {
        return _hyde_eddy233.getTheta();
    }

    /**
    * Sets the theta of this hyde_eddy233.
    *
    * @param theta the theta of this hyde_eddy233
    */
    @Override
    public void setTheta(float theta) {
        _hyde_eddy233.setTheta(theta);
    }

    /**
    * Returns the beta of this hyde_eddy233.
    *
    * @return the beta of this hyde_eddy233
    */
    @Override
    public float getBeta() {
        return _hyde_eddy233.getBeta();
    }

    /**
    * Sets the beta of this hyde_eddy233.
    *
    * @param beta the beta of this hyde_eddy233
    */
    @Override
    public void setBeta(float beta) {
        _hyde_eddy233.setBeta(beta);
    }

    /**
    * Returns the c_lag of this hyde_eddy233.
    *
    * @return the c_lag of this hyde_eddy233
    */
    @Override
    public int getC_lag() {
        return _hyde_eddy233.getC_lag();
    }

    /**
    * Sets the c_lag of this hyde_eddy233.
    *
    * @param c_lag the c_lag of this hyde_eddy233
    */
    @Override
    public void setC_lag(int c_lag) {
        _hyde_eddy233.setC_lag(c_lag);
    }

    /**
    * Returns the h_lag of this hyde_eddy233.
    *
    * @return the h_lag of this hyde_eddy233
    */
    @Override
    public int getH_lag() {
        return _hyde_eddy233.getH_lag();
    }

    /**
    * Sets the h_lag of this hyde_eddy233.
    *
    * @param h_lag the h_lag of this hyde_eddy233
    */
    @Override
    public void setH_lag(int h_lag) {
        _hyde_eddy233.setH_lag(h_lag);
    }

    /**
    * Returns the err_packet of this hyde_eddy233.
    *
    * @return the err_packet of this hyde_eddy233
    */
    @Override
    public int getErr_packet() {
        return _hyde_eddy233.getErr_packet();
    }

    /**
    * Sets the err_packet of this hyde_eddy233.
    *
    * @param err_packet the err_packet of this hyde_eddy233
    */
    @Override
    public void setErr_packet(int err_packet) {
        _hyde_eddy233.setErr_packet(err_packet);
    }

    /**
    * Returns the licor_t_av of this hyde_eddy233.
    *
    * @return the licor_t_av of this hyde_eddy233
    */
    @Override
    public float getLicor_t_av() {
        return _hyde_eddy233.getLicor_t_av();
    }

    /**
    * Sets the licor_t_av of this hyde_eddy233.
    *
    * @param licor_t_av the licor_t_av of this hyde_eddy233
    */
    @Override
    public void setLicor_t_av(float licor_t_av) {
        _hyde_eddy233.setLicor_t_av(licor_t_av);
    }

    /**
    * Returns the licor_t_std of this hyde_eddy233.
    *
    * @return the licor_t_std of this hyde_eddy233
    */
    @Override
    public float getLicor_t_std() {
        return _hyde_eddy233.getLicor_t_std();
    }

    /**
    * Sets the licor_t_std of this hyde_eddy233.
    *
    * @param licor_t_std the licor_t_std of this hyde_eddy233
    */
    @Override
    public void setLicor_t_std(float licor_t_std) {
        _hyde_eddy233.setLicor_t_std(licor_t_std);
    }

    /**
    * Returns the licor_p_av of this hyde_eddy233.
    *
    * @return the licor_p_av of this hyde_eddy233
    */
    @Override
    public float getLicor_p_av() {
        return _hyde_eddy233.getLicor_p_av();
    }

    /**
    * Sets the licor_p_av of this hyde_eddy233.
    *
    * @param licor_p_av the licor_p_av of this hyde_eddy233
    */
    @Override
    public void setLicor_p_av(float licor_p_av) {
        _hyde_eddy233.setLicor_p_av(licor_p_av);
    }

    /**
    * Returns the licor_p_std of this hyde_eddy233.
    *
    * @return the licor_p_std of this hyde_eddy233
    */
    @Override
    public float getLicor_p_std() {
        return _hyde_eddy233.getLicor_p_std();
    }

    /**
    * Sets the licor_p_std of this hyde_eddy233.
    *
    * @param licor_p_std the licor_p_std of this hyde_eddy233
    */
    @Override
    public void setLicor_p_std(float licor_p_std) {
        _hyde_eddy233.setLicor_p_std(licor_p_std);
    }

    /**
    * Returns the f_ c p c of this hyde_eddy233.
    *
    * @return the f_ c p c of this hyde_eddy233
    */
    @Override
    public float getF_CPC() {
        return _hyde_eddy233.getF_CPC();
    }

    /**
    * Sets the f_ c p c of this hyde_eddy233.
    *
    * @param F_CPC the f_ c p c of this hyde_eddy233
    */
    @Override
    public void setF_CPC(float F_CPC) {
        _hyde_eddy233.setF_CPC(F_CPC);
    }

    /**
    * Returns the std_ c p c of this hyde_eddy233.
    *
    * @return the std_ c p c of this hyde_eddy233
    */
    @Override
    public float getStd_CPC() {
        return _hyde_eddy233.getStd_CPC();
    }

    /**
    * Sets the std_ c p c of this hyde_eddy233.
    *
    * @param std_CPC the std_ c p c of this hyde_eddy233
    */
    @Override
    public void setStd_CPC(float std_CPC) {
        _hyde_eddy233.setStd_CPC(std_CPC);
    }

    /**
    * Returns the av_ c p c of this hyde_eddy233.
    *
    * @return the av_ c p c of this hyde_eddy233
    */
    @Override
    public float getAv_CPC() {
        return _hyde_eddy233.getAv_CPC();
    }

    /**
    * Sets the av_ c p c of this hyde_eddy233.
    *
    * @param av_CPC the av_ c p c of this hyde_eddy233
    */
    @Override
    public void setAv_CPC(float av_CPC) {
        _hyde_eddy233.setAv_CPC(av_CPC);
    }

    /**
    * Returns the c p c_lag of this hyde_eddy233.
    *
    * @return the c p c_lag of this hyde_eddy233
    */
    @Override
    public int getCPC_lag() {
        return _hyde_eddy233.getCPC_lag();
    }

    /**
    * Sets the c p c_lag of this hyde_eddy233.
    *
    * @param CPC_lag the c p c_lag of this hyde_eddy233
    */
    @Override
    public void setCPC_lag(int CPC_lag) {
        _hyde_eddy233.setCPC_lag(CPC_lag);
    }

    /**
    * Returns the std_t of this hyde_eddy233.
    *
    * @return the std_t of this hyde_eddy233
    */
    @Override
    public float getStd_t() {
        return _hyde_eddy233.getStd_t();
    }

    /**
    * Sets the std_t of this hyde_eddy233.
    *
    * @param std_t the std_t of this hyde_eddy233
    */
    @Override
    public void setStd_t(float std_t) {
        _hyde_eddy233.setStd_t(std_t);
    }

    /**
    * Returns the std_c of this hyde_eddy233.
    *
    * @return the std_c of this hyde_eddy233
    */
    @Override
    public float getStd_c() {
        return _hyde_eddy233.getStd_c();
    }

    /**
    * Sets the std_c of this hyde_eddy233.
    *
    * @param std_c the std_c of this hyde_eddy233
    */
    @Override
    public void setStd_c(float std_c) {
        _hyde_eddy233.setStd_c(std_c);
    }

    /**
    * Returns the std_h of this hyde_eddy233.
    *
    * @return the std_h of this hyde_eddy233
    */
    @Override
    public float getStd_h() {
        return _hyde_eddy233.getStd_h();
    }

    /**
    * Sets the std_h of this hyde_eddy233.
    *
    * @param std_h the std_h of this hyde_eddy233
    */
    @Override
    public void setStd_h(float std_h) {
        _hyde_eddy233.setStd_h(std_h);
    }

    /**
    * Returns the quality of this hyde_eddy233.
    *
    * @return the quality of this hyde_eddy233
    */
    @Override
    public int getQuality() {
        return _hyde_eddy233.getQuality();
    }

    /**
    * Sets the quality of this hyde_eddy233.
    *
    * @param quality the quality of this hyde_eddy233
    */
    @Override
    public void setQuality(int quality) {
        _hyde_eddy233.setQuality(quality);
    }

    /**
    * Returns the qc_ h of this hyde_eddy233.
    *
    * @return the qc_ h of this hyde_eddy233
    */
    @Override
    public int getQc_H() {
        return _hyde_eddy233.getQc_H();
    }

    /**
    * Sets the qc_ h of this hyde_eddy233.
    *
    * @param Qc_H the qc_ h of this hyde_eddy233
    */
    @Override
    public void setQc_H(int Qc_H) {
        _hyde_eddy233.setQc_H(Qc_H);
    }

    /**
    * Returns the qc_ l e of this hyde_eddy233.
    *
    * @return the qc_ l e of this hyde_eddy233
    */
    @Override
    public int getQc_LE() {
        return _hyde_eddy233.getQc_LE();
    }

    /**
    * Sets the qc_ l e of this hyde_eddy233.
    *
    * @param Qc_LE the qc_ l e of this hyde_eddy233
    */
    @Override
    public void setQc_LE(int Qc_LE) {
        _hyde_eddy233.setQc_LE(Qc_LE);
    }

    /**
    * Returns the qc_ e of this hyde_eddy233.
    *
    * @return the qc_ e of this hyde_eddy233
    */
    @Override
    public int getQc_E() {
        return _hyde_eddy233.getQc_E();
    }

    /**
    * Sets the qc_ e of this hyde_eddy233.
    *
    * @param Qc_E the qc_ e of this hyde_eddy233
    */
    @Override
    public void setQc_E(int Qc_E) {
        _hyde_eddy233.setQc_E(Qc_E);
    }

    /**
    * Returns the qc_ f_c of this hyde_eddy233.
    *
    * @return the qc_ f_c of this hyde_eddy233
    */
    @Override
    public int getQc_F_c() {
        return _hyde_eddy233.getQc_F_c();
    }

    /**
    * Sets the qc_ f_c of this hyde_eddy233.
    *
    * @param Qc_F_c the qc_ f_c of this hyde_eddy233
    */
    @Override
    public void setQc_F_c(int Qc_F_c) {
        _hyde_eddy233.setQc_F_c(Qc_F_c);
    }

    /**
    * Returns the qc_tau of this hyde_eddy233.
    *
    * @return the qc_tau of this hyde_eddy233
    */
    @Override
    public int getQc_tau() {
        return _hyde_eddy233.getQc_tau();
    }

    /**
    * Sets the qc_tau of this hyde_eddy233.
    *
    * @param Qc_tau the qc_tau of this hyde_eddy233
    */
    @Override
    public void setQc_tau(int Qc_tau) {
        _hyde_eddy233.setQc_tau(Qc_tau);
    }

    /**
    * Returns the qc_ f_ c p c of this hyde_eddy233.
    *
    * @return the qc_ f_ c p c of this hyde_eddy233
    */
    @Override
    public int getQc_F_CPC() {
        return _hyde_eddy233.getQc_F_CPC();
    }

    /**
    * Sets the qc_ f_ c p c of this hyde_eddy233.
    *
    * @param Qc_F_CPC the qc_ f_ c p c of this hyde_eddy233
    */
    @Override
    public void setQc_F_CPC(int Qc_F_CPC) {
        _hyde_eddy233.setQc_F_CPC(Qc_F_CPC);
    }

    /**
    * Returns the h_ e m e p of this hyde_eddy233.
    *
    * @return the h_ e m e p of this hyde_eddy233
    */
    @Override
    public int getH_EMEP() {
        return _hyde_eddy233.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this hyde_eddy233.
    *
    * @param H_EMEP the h_ e m e p of this hyde_eddy233
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _hyde_eddy233.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the l e_ e m e p of this hyde_eddy233.
    *
    * @return the l e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getLE_EMEP() {
        return _hyde_eddy233.getLE_EMEP();
    }

    /**
    * Sets the l e_ e m e p of this hyde_eddy233.
    *
    * @param LE_EMEP the l e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setLE_EMEP(int LE_EMEP) {
        _hyde_eddy233.setLE_EMEP(LE_EMEP);
    }

    /**
    * Returns the e_ e m e p of this hyde_eddy233.
    *
    * @return the e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getE_EMEP() {
        return _hyde_eddy233.getE_EMEP();
    }

    /**
    * Sets the e_ e m e p of this hyde_eddy233.
    *
    * @param E_EMEP the e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setE_EMEP(int E_EMEP) {
        _hyde_eddy233.setE_EMEP(E_EMEP);
    }

    /**
    * Returns the f_c_ e m e p of this hyde_eddy233.
    *
    * @return the f_c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getF_c_EMEP() {
        return _hyde_eddy233.getF_c_EMEP();
    }

    /**
    * Sets the f_c_ e m e p of this hyde_eddy233.
    *
    * @param F_c_EMEP the f_c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setF_c_EMEP(int F_c_EMEP) {
        _hyde_eddy233.setF_c_EMEP(F_c_EMEP);
    }

    /**
    * Returns the tau_ e m e p of this hyde_eddy233.
    *
    * @return the tau_ e m e p of this hyde_eddy233
    */
    @Override
    public int getTau_EMEP() {
        return _hyde_eddy233.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this hyde_eddy233.
    *
    * @param tau_EMEP the tau_ e m e p of this hyde_eddy233
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _hyde_eddy233.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the u_star_ e m e p of this hyde_eddy233.
    *
    * @return the u_star_ e m e p of this hyde_eddy233
    */
    @Override
    public int getU_star_EMEP() {
        return _hyde_eddy233.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this hyde_eddy233.
    *
    * @param u_star_EMEP the u_star_ e m e p of this hyde_eddy233
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _hyde_eddy233.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length_ e m e p of this hyde_eddy233.
    *
    * @return the m o_length_ e m e p of this hyde_eddy233
    */
    @Override
    public int getMO_length_EMEP() {
        return _hyde_eddy233.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this hyde_eddy233.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this hyde_eddy233
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _hyde_eddy233.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the std_u_ e m e p of this hyde_eddy233.
    *
    * @return the std_u_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_u_EMEP() {
        return _hyde_eddy233.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this hyde_eddy233.
    *
    * @param std_u_EMEP the std_u_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _hyde_eddy233.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v_ e m e p of this hyde_eddy233.
    *
    * @return the std_v_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_v_EMEP() {
        return _hyde_eddy233.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this hyde_eddy233.
    *
    * @param std_v_EMEP the std_v_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _hyde_eddy233.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w_ e m e p of this hyde_eddy233.
    *
    * @return the std_w_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_w_EMEP() {
        return _hyde_eddy233.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this hyde_eddy233.
    *
    * @param std_w_EMEP the std_w_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _hyde_eddy233.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the av_u_ e m e p of this hyde_eddy233.
    *
    * @return the av_u_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_u_EMEP() {
        return _hyde_eddy233.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this hyde_eddy233.
    *
    * @param av_u_EMEP the av_u_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _hyde_eddy233.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v_ e m e p of this hyde_eddy233.
    *
    * @return the av_v_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_v_EMEP() {
        return _hyde_eddy233.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this hyde_eddy233.
    *
    * @param av_v_EMEP the av_v_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _hyde_eddy233.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w_ e m e p of this hyde_eddy233.
    *
    * @return the av_w_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_w_EMEP() {
        return _hyde_eddy233.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this hyde_eddy233.
    *
    * @param av_w_EMEP the av_w_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _hyde_eddy233.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the av_t_ e m e p of this hyde_eddy233.
    *
    * @return the av_t_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_t_EMEP() {
        return _hyde_eddy233.getAv_t_EMEP();
    }

    /**
    * Sets the av_t_ e m e p of this hyde_eddy233.
    *
    * @param av_t_EMEP the av_t_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _hyde_eddy233.setAv_t_EMEP(av_t_EMEP);
    }

    /**
    * Returns the av_c_ e m e p of this hyde_eddy233.
    *
    * @return the av_c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_c_EMEP() {
        return _hyde_eddy233.getAv_c_EMEP();
    }

    /**
    * Sets the av_c_ e m e p of this hyde_eddy233.
    *
    * @param av_c_EMEP the av_c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _hyde_eddy233.setAv_c_EMEP(av_c_EMEP);
    }

    /**
    * Returns the av_h_ e m e p of this hyde_eddy233.
    *
    * @return the av_h_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_h_EMEP() {
        return _hyde_eddy233.getAv_h_EMEP();
    }

    /**
    * Sets the av_h_ e m e p of this hyde_eddy233.
    *
    * @param av_h_EMEP the av_h_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_h_EMEP(int av_h_EMEP) {
        _hyde_eddy233.setAv_h_EMEP(av_h_EMEP);
    }

    /**
    * Returns the u_ e m e p of this hyde_eddy233.
    *
    * @return the u_ e m e p of this hyde_eddy233
    */
    @Override
    public int getU_EMEP() {
        return _hyde_eddy233.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this hyde_eddy233.
    *
    * @param U_EMEP the u_ e m e p of this hyde_eddy233
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _hyde_eddy233.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir_ e m e p of this hyde_eddy233.
    *
    * @return the wind_dir_ e m e p of this hyde_eddy233
    */
    @Override
    public int getWind_dir_EMEP() {
        return _hyde_eddy233.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this hyde_eddy233.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this hyde_eddy233
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _hyde_eddy233.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the eta_ e m e p of this hyde_eddy233.
    *
    * @return the eta_ e m e p of this hyde_eddy233
    */
    @Override
    public int getEta_EMEP() {
        return _hyde_eddy233.getEta_EMEP();
    }

    /**
    * Sets the eta_ e m e p of this hyde_eddy233.
    *
    * @param eta_EMEP the eta_ e m e p of this hyde_eddy233
    */
    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _hyde_eddy233.setEta_EMEP(eta_EMEP);
    }

    /**
    * Returns the theta_ e m e p of this hyde_eddy233.
    *
    * @return the theta_ e m e p of this hyde_eddy233
    */
    @Override
    public int getTheta_EMEP() {
        return _hyde_eddy233.getTheta_EMEP();
    }

    /**
    * Sets the theta_ e m e p of this hyde_eddy233.
    *
    * @param theta_EMEP the theta_ e m e p of this hyde_eddy233
    */
    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _hyde_eddy233.setTheta_EMEP(theta_EMEP);
    }

    /**
    * Returns the beta_ e m e p of this hyde_eddy233.
    *
    * @return the beta_ e m e p of this hyde_eddy233
    */
    @Override
    public int getBeta_EMEP() {
        return _hyde_eddy233.getBeta_EMEP();
    }

    /**
    * Sets the beta_ e m e p of this hyde_eddy233.
    *
    * @param beta_EMEP the beta_ e m e p of this hyde_eddy233
    */
    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _hyde_eddy233.setBeta_EMEP(beta_EMEP);
    }

    /**
    * Returns the c_lag_ e m e p of this hyde_eddy233.
    *
    * @return the c_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public int getC_lag_EMEP() {
        return _hyde_eddy233.getC_lag_EMEP();
    }

    /**
    * Sets the c_lag_ e m e p of this hyde_eddy233.
    *
    * @param c_lag_EMEP the c_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public void setC_lag_EMEP(int c_lag_EMEP) {
        _hyde_eddy233.setC_lag_EMEP(c_lag_EMEP);
    }

    /**
    * Returns the h_lag_ e m e p of this hyde_eddy233.
    *
    * @return the h_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public int getH_lag_EMEP() {
        return _hyde_eddy233.getH_lag_EMEP();
    }

    /**
    * Sets the h_lag_ e m e p of this hyde_eddy233.
    *
    * @param h_lag_EMEP the h_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public void setH_lag_EMEP(int h_lag_EMEP) {
        _hyde_eddy233.setH_lag_EMEP(h_lag_EMEP);
    }

    /**
    * Returns the err_packet_ e m e p of this hyde_eddy233.
    *
    * @return the err_packet_ e m e p of this hyde_eddy233
    */
    @Override
    public int getErr_packet_EMEP() {
        return _hyde_eddy233.getErr_packet_EMEP();
    }

    /**
    * Sets the err_packet_ e m e p of this hyde_eddy233.
    *
    * @param err_packet_EMEP the err_packet_ e m e p of this hyde_eddy233
    */
    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _hyde_eddy233.setErr_packet_EMEP(err_packet_EMEP);
    }

    /**
    * Returns the licor_t_av_ e m e p of this hyde_eddy233.
    *
    * @return the licor_t_av_ e m e p of this hyde_eddy233
    */
    @Override
    public int getLicor_t_av_EMEP() {
        return _hyde_eddy233.getLicor_t_av_EMEP();
    }

    /**
    * Sets the licor_t_av_ e m e p of this hyde_eddy233.
    *
    * @param licor_t_av_EMEP the licor_t_av_ e m e p of this hyde_eddy233
    */
    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _hyde_eddy233.setLicor_t_av_EMEP(licor_t_av_EMEP);
    }

    /**
    * Returns the licor_t_std_ e m e p of this hyde_eddy233.
    *
    * @return the licor_t_std_ e m e p of this hyde_eddy233
    */
    @Override
    public int getLicor_t_std_EMEP() {
        return _hyde_eddy233.getLicor_t_std_EMEP();
    }

    /**
    * Sets the licor_t_std_ e m e p of this hyde_eddy233.
    *
    * @param licor_t_std_EMEP the licor_t_std_ e m e p of this hyde_eddy233
    */
    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _hyde_eddy233.setLicor_t_std_EMEP(licor_t_std_EMEP);
    }

    /**
    * Returns the licor_p_av_ e m e p of this hyde_eddy233.
    *
    * @return the licor_p_av_ e m e p of this hyde_eddy233
    */
    @Override
    public int getLicor_p_av_EMEP() {
        return _hyde_eddy233.getLicor_p_av_EMEP();
    }

    /**
    * Sets the licor_p_av_ e m e p of this hyde_eddy233.
    *
    * @param licor_p_av_EMEP the licor_p_av_ e m e p of this hyde_eddy233
    */
    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _hyde_eddy233.setLicor_p_av_EMEP(licor_p_av_EMEP);
    }

    /**
    * Returns the licor_p_std_ e m e p of this hyde_eddy233.
    *
    * @return the licor_p_std_ e m e p of this hyde_eddy233
    */
    @Override
    public int getLicor_p_std_EMEP() {
        return _hyde_eddy233.getLicor_p_std_EMEP();
    }

    /**
    * Sets the licor_p_std_ e m e p of this hyde_eddy233.
    *
    * @param licor_p_std_EMEP the licor_p_std_ e m e p of this hyde_eddy233
    */
    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _hyde_eddy233.setLicor_p_std_EMEP(licor_p_std_EMEP);
    }

    /**
    * Returns the f_ c p c_ e m e p of this hyde_eddy233.
    *
    * @return the f_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getF_CPC_EMEP() {
        return _hyde_eddy233.getF_CPC_EMEP();
    }

    /**
    * Sets the f_ c p c_ e m e p of this hyde_eddy233.
    *
    * @param F_CPC_EMEP the f_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _hyde_eddy233.setF_CPC_EMEP(F_CPC_EMEP);
    }

    /**
    * Returns the std_ c p c_ e m e p of this hyde_eddy233.
    *
    * @return the std_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_CPC_EMEP() {
        return _hyde_eddy233.getStd_CPC_EMEP();
    }

    /**
    * Sets the std_ c p c_ e m e p of this hyde_eddy233.
    *
    * @param std_CPC_EMEP the std_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _hyde_eddy233.setStd_CPC_EMEP(std_CPC_EMEP);
    }

    /**
    * Returns the av_ c p c_ e m e p of this hyde_eddy233.
    *
    * @return the av_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getAv_CPC_EMEP() {
        return _hyde_eddy233.getAv_CPC_EMEP();
    }

    /**
    * Sets the av_ c p c_ e m e p of this hyde_eddy233.
    *
    * @param av_CPC_EMEP the av_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _hyde_eddy233.setAv_CPC_EMEP(av_CPC_EMEP);
    }

    /**
    * Returns the c p c_lag_ e m e p of this hyde_eddy233.
    *
    * @return the c p c_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public int getCPC_lag_EMEP() {
        return _hyde_eddy233.getCPC_lag_EMEP();
    }

    /**
    * Sets the c p c_lag_ e m e p of this hyde_eddy233.
    *
    * @param CPC_lag_EMEP the c p c_lag_ e m e p of this hyde_eddy233
    */
    @Override
    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _hyde_eddy233.setCPC_lag_EMEP(CPC_lag_EMEP);
    }

    /**
    * Returns the std_t_ e m e p of this hyde_eddy233.
    *
    * @return the std_t_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_t_EMEP() {
        return _hyde_eddy233.getStd_t_EMEP();
    }

    /**
    * Sets the std_t_ e m e p of this hyde_eddy233.
    *
    * @param std_t_EMEP the std_t_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _hyde_eddy233.setStd_t_EMEP(std_t_EMEP);
    }

    /**
    * Returns the std_c_ e m e p of this hyde_eddy233.
    *
    * @return the std_c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_c_EMEP() {
        return _hyde_eddy233.getStd_c_EMEP();
    }

    /**
    * Sets the std_c_ e m e p of this hyde_eddy233.
    *
    * @param std_c_EMEP the std_c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_c_EMEP(int std_c_EMEP) {
        _hyde_eddy233.setStd_c_EMEP(std_c_EMEP);
    }

    /**
    * Returns the std_h_ e m e p of this hyde_eddy233.
    *
    * @return the std_h_ e m e p of this hyde_eddy233
    */
    @Override
    public int getStd_h_EMEP() {
        return _hyde_eddy233.getStd_h_EMEP();
    }

    /**
    * Sets the std_h_ e m e p of this hyde_eddy233.
    *
    * @param std_h_EMEP the std_h_ e m e p of this hyde_eddy233
    */
    @Override
    public void setStd_h_EMEP(int std_h_EMEP) {
        _hyde_eddy233.setStd_h_EMEP(std_h_EMEP);
    }

    /**
    * Returns the quality_ e m e p of this hyde_eddy233.
    *
    * @return the quality_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQuality_EMEP() {
        return _hyde_eddy233.getQuality_EMEP();
    }

    /**
    * Sets the quality_ e m e p of this hyde_eddy233.
    *
    * @param quality_EMEP the quality_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQuality_EMEP(int quality_EMEP) {
        _hyde_eddy233.setQuality_EMEP(quality_EMEP);
    }

    /**
    * Returns the qc_ h_ e m e p of this hyde_eddy233.
    *
    * @return the qc_ h_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_H_EMEP() {
        return _hyde_eddy233.getQc_H_EMEP();
    }

    /**
    * Sets the qc_ h_ e m e p of this hyde_eddy233.
    *
    * @param Qc_H_EMEP the qc_ h_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _hyde_eddy233.setQc_H_EMEP(Qc_H_EMEP);
    }

    /**
    * Returns the qc_ l e_ e m e p of this hyde_eddy233.
    *
    * @return the qc_ l e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_LE_EMEP() {
        return _hyde_eddy233.getQc_LE_EMEP();
    }

    /**
    * Sets the qc_ l e_ e m e p of this hyde_eddy233.
    *
    * @param Qc_LE_EMEP the qc_ l e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _hyde_eddy233.setQc_LE_EMEP(Qc_LE_EMEP);
    }

    /**
    * Returns the qc_ e_ e m e p of this hyde_eddy233.
    *
    * @return the qc_ e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_E_EMEP() {
        return _hyde_eddy233.getQc_E_EMEP();
    }

    /**
    * Sets the qc_ e_ e m e p of this hyde_eddy233.
    *
    * @param Qc_E_EMEP the qc_ e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _hyde_eddy233.setQc_E_EMEP(Qc_E_EMEP);
    }

    /**
    * Returns the qc_ f_c_ e m e p of this hyde_eddy233.
    *
    * @return the qc_ f_c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_F_c_EMEP() {
        return _hyde_eddy233.getQc_F_c_EMEP();
    }

    /**
    * Sets the qc_ f_c_ e m e p of this hyde_eddy233.
    *
    * @param Qc_F_c_EMEP the qc_ f_c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _hyde_eddy233.setQc_F_c_EMEP(Qc_F_c_EMEP);
    }

    /**
    * Returns the qc_tau_ e m e p of this hyde_eddy233.
    *
    * @return the qc_tau_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_tau_EMEP() {
        return _hyde_eddy233.getQc_tau_EMEP();
    }

    /**
    * Sets the qc_tau_ e m e p of this hyde_eddy233.
    *
    * @param Qc_tau_EMEP the qc_tau_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _hyde_eddy233.setQc_tau_EMEP(Qc_tau_EMEP);
    }

    /**
    * Returns the qc_ f_ c p c_ e m e p of this hyde_eddy233.
    *
    * @return the qc_ f_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_F_CPC_EMEP() {
        return _hyde_eddy233.getQc_F_CPC_EMEP();
    }

    /**
    * Sets the qc_ f_ c p c_ e m e p of this hyde_eddy233.
    *
    * @param Qc_F_CPC_EMEP the qc_ f_ c p c_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _hyde_eddy233.setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
    }

    /**
    * Returns the n e e of this hyde_eddy233.
    *
    * @return the n e e of this hyde_eddy233
    */
    @Override
    public float getNEE() {
        return _hyde_eddy233.getNEE();
    }

    /**
    * Sets the n e e of this hyde_eddy233.
    *
    * @param NEE the n e e of this hyde_eddy233
    */
    @Override
    public void setNEE(float NEE) {
        _hyde_eddy233.setNEE(NEE);
    }

    /**
    * Returns the qc_gapf_ n e e of this hyde_eddy233.
    *
    * @return the qc_gapf_ n e e of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_NEE() {
        return _hyde_eddy233.getQc_gapf_NEE();
    }

    /**
    * Sets the qc_gapf_ n e e of this hyde_eddy233.
    *
    * @param Qc_gapf_NEE the qc_gapf_ n e e of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_NEE(int Qc_gapf_NEE) {
        _hyde_eddy233.setQc_gapf_NEE(Qc_gapf_NEE);
    }

    /**
    * Returns the g p p of this hyde_eddy233.
    *
    * @return the g p p of this hyde_eddy233
    */
    @Override
    public float getGPP() {
        return _hyde_eddy233.getGPP();
    }

    /**
    * Sets the g p p of this hyde_eddy233.
    *
    * @param GPP the g p p of this hyde_eddy233
    */
    @Override
    public void setGPP(float GPP) {
        _hyde_eddy233.setGPP(GPP);
    }

    /**
    * Returns the t e r of this hyde_eddy233.
    *
    * @return the t e r of this hyde_eddy233
    */
    @Override
    public float getTER() {
        return _hyde_eddy233.getTER();
    }

    /**
    * Sets the t e r of this hyde_eddy233.
    *
    * @param TER the t e r of this hyde_eddy233
    */
    @Override
    public void setTER(float TER) {
        _hyde_eddy233.setTER(TER);
    }

    /**
    * Returns the h_gapf of this hyde_eddy233.
    *
    * @return the h_gapf of this hyde_eddy233
    */
    @Override
    public float getH_gapf() {
        return _hyde_eddy233.getH_gapf();
    }

    /**
    * Sets the h_gapf of this hyde_eddy233.
    *
    * @param H_gapf the h_gapf of this hyde_eddy233
    */
    @Override
    public void setH_gapf(float H_gapf) {
        _hyde_eddy233.setH_gapf(H_gapf);
    }

    /**
    * Returns the qc_gapf_ h of this hyde_eddy233.
    *
    * @return the qc_gapf_ h of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_H() {
        return _hyde_eddy233.getQc_gapf_H();
    }

    /**
    * Sets the qc_gapf_ h of this hyde_eddy233.
    *
    * @param Qc_gapf_H the qc_gapf_ h of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_H(int Qc_gapf_H) {
        _hyde_eddy233.setQc_gapf_H(Qc_gapf_H);
    }

    /**
    * Returns the e t_gapf of this hyde_eddy233.
    *
    * @return the e t_gapf of this hyde_eddy233
    */
    @Override
    public float getET_gapf() {
        return _hyde_eddy233.getET_gapf();
    }

    /**
    * Sets the e t_gapf of this hyde_eddy233.
    *
    * @param ET_gapf the e t_gapf of this hyde_eddy233
    */
    @Override
    public void setET_gapf(float ET_gapf) {
        _hyde_eddy233.setET_gapf(ET_gapf);
    }

    /**
    * Returns the qc_gapf_ e t of this hyde_eddy233.
    *
    * @return the qc_gapf_ e t of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_ET() {
        return _hyde_eddy233.getQc_gapf_ET();
    }

    /**
    * Sets the qc_gapf_ e t of this hyde_eddy233.
    *
    * @param Qc_gapf_ET the qc_gapf_ e t of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_ET(int Qc_gapf_ET) {
        _hyde_eddy233.setQc_gapf_ET(Qc_gapf_ET);
    }

    /**
    * Returns the n e e_ e m e p of this hyde_eddy233.
    *
    * @return the n e e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getNEE_EMEP() {
        return _hyde_eddy233.getNEE_EMEP();
    }

    /**
    * Sets the n e e_ e m e p of this hyde_eddy233.
    *
    * @param NEE_EMEP the n e e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setNEE_EMEP(int NEE_EMEP) {
        _hyde_eddy233.setNEE_EMEP(NEE_EMEP);
    }

    /**
    * Returns the qc_gapf_ n e e_ e m e p of this hyde_eddy233.
    *
    * @return the qc_gapf_ n e e_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_NEE_EMEP() {
        return _hyde_eddy233.getQc_gapf_NEE_EMEP();
    }

    /**
    * Sets the qc_gapf_ n e e_ e m e p of this hyde_eddy233.
    *
    * @param Qc_gapf_NEE_EMEP the qc_gapf_ n e e_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_NEE_EMEP(int Qc_gapf_NEE_EMEP) {
        _hyde_eddy233.setQc_gapf_NEE_EMEP(Qc_gapf_NEE_EMEP);
    }

    /**
    * Returns the g p p_ e m e p of this hyde_eddy233.
    *
    * @return the g p p_ e m e p of this hyde_eddy233
    */
    @Override
    public int getGPP_EMEP() {
        return _hyde_eddy233.getGPP_EMEP();
    }

    /**
    * Sets the g p p_ e m e p of this hyde_eddy233.
    *
    * @param GPP_EMEP the g p p_ e m e p of this hyde_eddy233
    */
    @Override
    public void setGPP_EMEP(int GPP_EMEP) {
        _hyde_eddy233.setGPP_EMEP(GPP_EMEP);
    }

    /**
    * Returns the t e r_ e m e p of this hyde_eddy233.
    *
    * @return the t e r_ e m e p of this hyde_eddy233
    */
    @Override
    public int getTER_EMEP() {
        return _hyde_eddy233.getTER_EMEP();
    }

    /**
    * Sets the t e r_ e m e p of this hyde_eddy233.
    *
    * @param TER_EMEP the t e r_ e m e p of this hyde_eddy233
    */
    @Override
    public void setTER_EMEP(int TER_EMEP) {
        _hyde_eddy233.setTER_EMEP(TER_EMEP);
    }

    /**
    * Returns the h_gapf_ e m e p of this hyde_eddy233.
    *
    * @return the h_gapf_ e m e p of this hyde_eddy233
    */
    @Override
    public int getH_gapf_EMEP() {
        return _hyde_eddy233.getH_gapf_EMEP();
    }

    /**
    * Sets the h_gapf_ e m e p of this hyde_eddy233.
    *
    * @param H_gapf_EMEP the h_gapf_ e m e p of this hyde_eddy233
    */
    @Override
    public void setH_gapf_EMEP(int H_gapf_EMEP) {
        _hyde_eddy233.setH_gapf_EMEP(H_gapf_EMEP);
    }

    /**
    * Returns the qc_gapf_ h_ e m e p of this hyde_eddy233.
    *
    * @return the qc_gapf_ h_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_H_EMEP() {
        return _hyde_eddy233.getQc_gapf_H_EMEP();
    }

    /**
    * Sets the qc_gapf_ h_ e m e p of this hyde_eddy233.
    *
    * @param Qc_gapf_H_EMEP the qc_gapf_ h_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_H_EMEP(int Qc_gapf_H_EMEP) {
        _hyde_eddy233.setQc_gapf_H_EMEP(Qc_gapf_H_EMEP);
    }

    /**
    * Returns the e t_gapf_ e m e p of this hyde_eddy233.
    *
    * @return the e t_gapf_ e m e p of this hyde_eddy233
    */
    @Override
    public int getET_gapf_EMEP() {
        return _hyde_eddy233.getET_gapf_EMEP();
    }

    /**
    * Sets the e t_gapf_ e m e p of this hyde_eddy233.
    *
    * @param ET_gapf_EMEP the e t_gapf_ e m e p of this hyde_eddy233
    */
    @Override
    public void setET_gapf_EMEP(int ET_gapf_EMEP) {
        _hyde_eddy233.setET_gapf_EMEP(ET_gapf_EMEP);
    }

    /**
    * Returns the qc_gapf_ e t_ e m e p of this hyde_eddy233.
    *
    * @return the qc_gapf_ e t_ e m e p of this hyde_eddy233
    */
    @Override
    public int getQc_gapf_ET_EMEP() {
        return _hyde_eddy233.getQc_gapf_ET_EMEP();
    }

    /**
    * Sets the qc_gapf_ e t_ e m e p of this hyde_eddy233.
    *
    * @param Qc_gapf_ET_EMEP the qc_gapf_ e t_ e m e p of this hyde_eddy233
    */
    @Override
    public void setQc_gapf_ET_EMEP(int Qc_gapf_ET_EMEP) {
        _hyde_eddy233.setQc_gapf_ET_EMEP(Qc_gapf_ET_EMEP);
    }

    @Override
    public boolean isNew() {
        return _hyde_eddy233.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hyde_eddy233.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hyde_eddy233.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hyde_eddy233.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hyde_eddy233.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hyde_eddy233.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hyde_eddy233.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hyde_eddy233.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hyde_eddy233.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hyde_eddy233.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hyde_eddy233.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Hyde_eddy233Wrapper((Hyde_eddy233) _hyde_eddy233.clone());
    }

    @Override
    public int compareTo(Hyde_eddy233 hyde_eddy233) {
        return _hyde_eddy233.compareTo(hyde_eddy233);
    }

    @Override
    public int hashCode() {
        return _hyde_eddy233.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Hyde_eddy233> toCacheModel() {
        return _hyde_eddy233.toCacheModel();
    }

    @Override
    public Hyde_eddy233 toEscapedModel() {
        return new Hyde_eddy233Wrapper(_hyde_eddy233.toEscapedModel());
    }

    @Override
    public Hyde_eddy233 toUnescapedModel() {
        return new Hyde_eddy233Wrapper(_hyde_eddy233.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hyde_eddy233.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hyde_eddy233.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hyde_eddy233.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Hyde_eddy233Wrapper)) {
            return false;
        }

        Hyde_eddy233Wrapper hyde_eddy233Wrapper = (Hyde_eddy233Wrapper) obj;

        if (Validator.equals(_hyde_eddy233, hyde_eddy233Wrapper._hyde_eddy233)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Hyde_eddy233 getWrappedHyde_eddy233() {
        return _hyde_eddy233;
    }

    @Override
    public Hyde_eddy233 getWrappedModel() {
        return _hyde_eddy233;
    }

    @Override
    public void resetOriginalValues() {
        _hyde_eddy233.resetOriginalValues();
    }
}
