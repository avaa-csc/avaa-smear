package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Kumpula_eddy}.
 * </p>
 *
 * @author pj
 * @see Kumpula_eddy
 * @generated
 */
public class Kumpula_eddyWrapper implements Kumpula_eddy,
    ModelWrapper<Kumpula_eddy> {
    private Kumpula_eddy _kumpula_eddy;

    public Kumpula_eddyWrapper(Kumpula_eddy kumpula_eddy) {
        _kumpula_eddy = kumpula_eddy;
    }

    @Override
    public Class<?> getModelClass() {
        return Kumpula_eddy.class;
    }

    @Override
    public String getModelClassName() {
        return Kumpula_eddy.class.getName();
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
        attributes.put("LE_op", getLE_op());
        attributes.put("LE_op_EMEP", getLE_op_EMEP());
        attributes.put("Qc_LE_op", getQc_LE_op());
        attributes.put("Qc_LE_op_EMEP", getQc_LE_op_EMEP());
        attributes.put("E_op", getE_op());
        attributes.put("E_op_EMEP", getE_op_EMEP());
        attributes.put("Qc_E_op", getQc_E_op());
        attributes.put("Qc_E_op_EMEP", getQc_E_op_EMEP());
        attributes.put("F_c_op", getF_c_op());
        attributes.put("F_c_op_EMEP", getF_c_op_EMEP());
        attributes.put("Qc_F_c_op", getQc_F_c_op());
        attributes.put("Qc_F_c_op_EMEP", getQc_F_c_op_EMEP());
        attributes.put("std_c_op", getStd_c_op());
        attributes.put("std_c_op_EMEP", getStd_c_op_EMEP());
        attributes.put("std_h_op", getStd_h_op());
        attributes.put("std_h_op_EMEP", getStd_h_op_EMEP());
        attributes.put("av_c_op", getAv_c_op());
        attributes.put("av_c_op_EMEP", getAv_c_op_EMEP());
        attributes.put("av_h_op", getAv_h_op());
        attributes.put("av_h_op_EMEP", getAv_h_op_EMEP());
        attributes.put("c_lag_op", getC_lag_op());
        attributes.put("c_lag_op_EMEP", getC_lag_op_EMEP());
        attributes.put("h_lag_op", getH_lag_op());
        attributes.put("h_lag_op_EMEP", getH_lag_op_EMEP());
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
        attributes.put("F_N2O", getF_N2O());
        attributes.put("F_N2O_EMEP", getF_N2O_EMEP());
        attributes.put("Qc_F_N2O", getQc_F_N2O());
        attributes.put("Qc_F_N2O_EMEP", getQc_F_N2O_EMEP());
        attributes.put("std_N2O", getStd_N2O());
        attributes.put("std_N2O_EMEP", getStd_N2O_EMEP());
        attributes.put("av_N2O", getAv_N2O());
        attributes.put("av_N2O_EMEP", getAv_N2O_EMEP());
        attributes.put("N2O_lag", getN2O_lag());
        attributes.put("N2O_lag_EMEP", getN2O_lag_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Integer H = (Integer) attributes.get("H");

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

        Float LE_op = (Float) attributes.get("LE_op");

        if (LE_op != null) {
            setLE_op(LE_op);
        }

        Integer LE_op_EMEP = (Integer) attributes.get("LE_op_EMEP");

        if (LE_op_EMEP != null) {
            setLE_op_EMEP(LE_op_EMEP);
        }

        Integer Qc_LE_op = (Integer) attributes.get("Qc_LE_op");

        if (Qc_LE_op != null) {
            setQc_LE_op(Qc_LE_op);
        }

        Integer Qc_LE_op_EMEP = (Integer) attributes.get("Qc_LE_op_EMEP");

        if (Qc_LE_op_EMEP != null) {
            setQc_LE_op_EMEP(Qc_LE_op_EMEP);
        }

        Float E_op = (Float) attributes.get("E_op");

        if (E_op != null) {
            setE_op(E_op);
        }

        Integer E_op_EMEP = (Integer) attributes.get("E_op_EMEP");

        if (E_op_EMEP != null) {
            setE_op_EMEP(E_op_EMEP);
        }

        Integer Qc_E_op = (Integer) attributes.get("Qc_E_op");

        if (Qc_E_op != null) {
            setQc_E_op(Qc_E_op);
        }

        Integer Qc_E_op_EMEP = (Integer) attributes.get("Qc_E_op_EMEP");

        if (Qc_E_op_EMEP != null) {
            setQc_E_op_EMEP(Qc_E_op_EMEP);
        }

        Float F_c_op = (Float) attributes.get("F_c_op");

        if (F_c_op != null) {
            setF_c_op(F_c_op);
        }

        Integer F_c_op_EMEP = (Integer) attributes.get("F_c_op_EMEP");

        if (F_c_op_EMEP != null) {
            setF_c_op_EMEP(F_c_op_EMEP);
        }

        Integer Qc_F_c_op = (Integer) attributes.get("Qc_F_c_op");

        if (Qc_F_c_op != null) {
            setQc_F_c_op(Qc_F_c_op);
        }

        Integer Qc_F_c_op_EMEP = (Integer) attributes.get("Qc_F_c_op_EMEP");

        if (Qc_F_c_op_EMEP != null) {
            setQc_F_c_op_EMEP(Qc_F_c_op_EMEP);
        }

        Float std_c_op = (Float) attributes.get("std_c_op");

        if (std_c_op != null) {
            setStd_c_op(std_c_op);
        }

        Integer std_c_op_EMEP = (Integer) attributes.get("std_c_op_EMEP");

        if (std_c_op_EMEP != null) {
            setStd_c_op_EMEP(std_c_op_EMEP);
        }

        Float std_h_op = (Float) attributes.get("std_h_op");

        if (std_h_op != null) {
            setStd_h_op(std_h_op);
        }

        Integer std_h_op_EMEP = (Integer) attributes.get("std_h_op_EMEP");

        if (std_h_op_EMEP != null) {
            setStd_h_op_EMEP(std_h_op_EMEP);
        }

        Float av_c_op = (Float) attributes.get("av_c_op");

        if (av_c_op != null) {
            setAv_c_op(av_c_op);
        }

        Integer av_c_op_EMEP = (Integer) attributes.get("av_c_op_EMEP");

        if (av_c_op_EMEP != null) {
            setAv_c_op_EMEP(av_c_op_EMEP);
        }

        Float av_h_op = (Float) attributes.get("av_h_op");

        if (av_h_op != null) {
            setAv_h_op(av_h_op);
        }

        Integer av_h_op_EMEP = (Integer) attributes.get("av_h_op_EMEP");

        if (av_h_op_EMEP != null) {
            setAv_h_op_EMEP(av_h_op_EMEP);
        }

        Float c_lag_op = (Float) attributes.get("c_lag_op");

        if (c_lag_op != null) {
            setC_lag_op(c_lag_op);
        }

        Integer c_lag_op_EMEP = (Integer) attributes.get("c_lag_op_EMEP");

        if (c_lag_op_EMEP != null) {
            setC_lag_op_EMEP(c_lag_op_EMEP);
        }

        Float h_lag_op = (Float) attributes.get("h_lag_op");

        if (h_lag_op != null) {
            setH_lag_op(h_lag_op);
        }

        Integer h_lag_op_EMEP = (Integer) attributes.get("h_lag_op_EMEP");

        if (h_lag_op_EMEP != null) {
            setH_lag_op_EMEP(h_lag_op_EMEP);
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

        Float F_N2O = (Float) attributes.get("F_N2O");

        if (F_N2O != null) {
            setF_N2O(F_N2O);
        }

        Integer F_N2O_EMEP = (Integer) attributes.get("F_N2O_EMEP");

        if (F_N2O_EMEP != null) {
            setF_N2O_EMEP(F_N2O_EMEP);
        }

        Integer Qc_F_N2O = (Integer) attributes.get("Qc_F_N2O");

        if (Qc_F_N2O != null) {
            setQc_F_N2O(Qc_F_N2O);
        }

        Integer Qc_F_N2O_EMEP = (Integer) attributes.get("Qc_F_N2O_EMEP");

        if (Qc_F_N2O_EMEP != null) {
            setQc_F_N2O_EMEP(Qc_F_N2O_EMEP);
        }

        Float std_N2O = (Float) attributes.get("std_N2O");

        if (std_N2O != null) {
            setStd_N2O(std_N2O);
        }

        Integer std_N2O_EMEP = (Integer) attributes.get("std_N2O_EMEP");

        if (std_N2O_EMEP != null) {
            setStd_N2O_EMEP(std_N2O_EMEP);
        }

        Float av_N2O = (Float) attributes.get("av_N2O");

        if (av_N2O != null) {
            setAv_N2O(av_N2O);
        }

        Integer av_N2O_EMEP = (Integer) attributes.get("av_N2O_EMEP");

        if (av_N2O_EMEP != null) {
            setAv_N2O_EMEP(av_N2O_EMEP);
        }

        Float N2O_lag = (Float) attributes.get("N2O_lag");

        if (N2O_lag != null) {
            setN2O_lag(N2O_lag);
        }

        Integer N2O_lag_EMEP = (Integer) attributes.get("N2O_lag_EMEP");

        if (N2O_lag_EMEP != null) {
            setN2O_lag_EMEP(N2O_lag_EMEP);
        }
    }

    /**
    * Returns the primary key of this kumpula_eddy.
    *
    * @return the primary key of this kumpula_eddy
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _kumpula_eddy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this kumpula_eddy.
    *
    * @param primaryKey the primary key of this kumpula_eddy
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _kumpula_eddy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this kumpula_eddy.
    *
    * @return the samptime of this kumpula_eddy
    */
    @Override
    public java.util.Date getSamptime() {
        return _kumpula_eddy.getSamptime();
    }

    /**
    * Sets the samptime of this kumpula_eddy.
    *
    * @param samptime the samptime of this kumpula_eddy
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _kumpula_eddy.setSamptime(samptime);
    }

    /**
    * Returns the h of this kumpula_eddy.
    *
    * @return the h of this kumpula_eddy
    */
    @Override
    public int getH() {
        return _kumpula_eddy.getH();
    }

    /**
    * Sets the h of this kumpula_eddy.
    *
    * @param H the h of this kumpula_eddy
    */
    @Override
    public void setH(int H) {
        _kumpula_eddy.setH(H);
    }

    /**
    * Returns the h_ e m e p of this kumpula_eddy.
    *
    * @return the h_ e m e p of this kumpula_eddy
    */
    @Override
    public int getH_EMEP() {
        return _kumpula_eddy.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this kumpula_eddy.
    *
    * @param H_EMEP the h_ e m e p of this kumpula_eddy
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _kumpula_eddy.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the qc_ h of this kumpula_eddy.
    *
    * @return the qc_ h of this kumpula_eddy
    */
    @Override
    public int getQc_H() {
        return _kumpula_eddy.getQc_H();
    }

    /**
    * Sets the qc_ h of this kumpula_eddy.
    *
    * @param Qc_H the qc_ h of this kumpula_eddy
    */
    @Override
    public void setQc_H(int Qc_H) {
        _kumpula_eddy.setQc_H(Qc_H);
    }

    /**
    * Returns the qc_ h_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ h_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_H_EMEP() {
        return _kumpula_eddy.getQc_H_EMEP();
    }

    /**
    * Sets the qc_ h_ e m e p of this kumpula_eddy.
    *
    * @param Qc_H_EMEP the qc_ h_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _kumpula_eddy.setQc_H_EMEP(Qc_H_EMEP);
    }

    /**
    * Returns the l e of this kumpula_eddy.
    *
    * @return the l e of this kumpula_eddy
    */
    @Override
    public float getLE() {
        return _kumpula_eddy.getLE();
    }

    /**
    * Sets the l e of this kumpula_eddy.
    *
    * @param LE the l e of this kumpula_eddy
    */
    @Override
    public void setLE(float LE) {
        _kumpula_eddy.setLE(LE);
    }

    /**
    * Returns the l e_ e m e p of this kumpula_eddy.
    *
    * @return the l e_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLE_EMEP() {
        return _kumpula_eddy.getLE_EMEP();
    }

    /**
    * Sets the l e_ e m e p of this kumpula_eddy.
    *
    * @param LE_EMEP the l e_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLE_EMEP(int LE_EMEP) {
        _kumpula_eddy.setLE_EMEP(LE_EMEP);
    }

    /**
    * Returns the qc_ l e of this kumpula_eddy.
    *
    * @return the qc_ l e of this kumpula_eddy
    */
    @Override
    public int getQc_LE() {
        return _kumpula_eddy.getQc_LE();
    }

    /**
    * Sets the qc_ l e of this kumpula_eddy.
    *
    * @param Qc_LE the qc_ l e of this kumpula_eddy
    */
    @Override
    public void setQc_LE(int Qc_LE) {
        _kumpula_eddy.setQc_LE(Qc_LE);
    }

    /**
    * Returns the qc_ l e_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ l e_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_LE_EMEP() {
        return _kumpula_eddy.getQc_LE_EMEP();
    }

    /**
    * Sets the qc_ l e_ e m e p of this kumpula_eddy.
    *
    * @param Qc_LE_EMEP the qc_ l e_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_LE_EMEP(int Qc_LE_EMEP) {
        _kumpula_eddy.setQc_LE_EMEP(Qc_LE_EMEP);
    }

    /**
    * Returns the e of this kumpula_eddy.
    *
    * @return the e of this kumpula_eddy
    */
    @Override
    public float getE() {
        return _kumpula_eddy.getE();
    }

    /**
    * Sets the e of this kumpula_eddy.
    *
    * @param E the e of this kumpula_eddy
    */
    @Override
    public void setE(float E) {
        _kumpula_eddy.setE(E);
    }

    /**
    * Returns the e_ e m e p of this kumpula_eddy.
    *
    * @return the e_ e m e p of this kumpula_eddy
    */
    @Override
    public int getE_EMEP() {
        return _kumpula_eddy.getE_EMEP();
    }

    /**
    * Sets the e_ e m e p of this kumpula_eddy.
    *
    * @param E_EMEP the e_ e m e p of this kumpula_eddy
    */
    @Override
    public void setE_EMEP(int E_EMEP) {
        _kumpula_eddy.setE_EMEP(E_EMEP);
    }

    /**
    * Returns the qc_ e of this kumpula_eddy.
    *
    * @return the qc_ e of this kumpula_eddy
    */
    @Override
    public int getQc_E() {
        return _kumpula_eddy.getQc_E();
    }

    /**
    * Sets the qc_ e of this kumpula_eddy.
    *
    * @param Qc_E the qc_ e of this kumpula_eddy
    */
    @Override
    public void setQc_E(int Qc_E) {
        _kumpula_eddy.setQc_E(Qc_E);
    }

    /**
    * Returns the qc_ e_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ e_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_E_EMEP() {
        return _kumpula_eddy.getQc_E_EMEP();
    }

    /**
    * Sets the qc_ e_ e m e p of this kumpula_eddy.
    *
    * @param Qc_E_EMEP the qc_ e_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_E_EMEP(int Qc_E_EMEP) {
        _kumpula_eddy.setQc_E_EMEP(Qc_E_EMEP);
    }

    /**
    * Returns the f_c of this kumpula_eddy.
    *
    * @return the f_c of this kumpula_eddy
    */
    @Override
    public float getF_c() {
        return _kumpula_eddy.getF_c();
    }

    /**
    * Sets the f_c of this kumpula_eddy.
    *
    * @param F_c the f_c of this kumpula_eddy
    */
    @Override
    public void setF_c(float F_c) {
        _kumpula_eddy.setF_c(F_c);
    }

    /**
    * Returns the f_c_ e m e p of this kumpula_eddy.
    *
    * @return the f_c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getF_c_EMEP() {
        return _kumpula_eddy.getF_c_EMEP();
    }

    /**
    * Sets the f_c_ e m e p of this kumpula_eddy.
    *
    * @param F_c_EMEP the f_c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setF_c_EMEP(int F_c_EMEP) {
        _kumpula_eddy.setF_c_EMEP(F_c_EMEP);
    }

    /**
    * Returns the qc_ f_c of this kumpula_eddy.
    *
    * @return the qc_ f_c of this kumpula_eddy
    */
    @Override
    public int getQc_F_c() {
        return _kumpula_eddy.getQc_F_c();
    }

    /**
    * Sets the qc_ f_c of this kumpula_eddy.
    *
    * @param Qc_F_c the qc_ f_c of this kumpula_eddy
    */
    @Override
    public void setQc_F_c(int Qc_F_c) {
        _kumpula_eddy.setQc_F_c(Qc_F_c);
    }

    /**
    * Returns the qc_ f_c_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ f_c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_F_c_EMEP() {
        return _kumpula_eddy.getQc_F_c_EMEP();
    }

    /**
    * Sets the qc_ f_c_ e m e p of this kumpula_eddy.
    *
    * @param Qc_F_c_EMEP the qc_ f_c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_F_c_EMEP(int Qc_F_c_EMEP) {
        _kumpula_eddy.setQc_F_c_EMEP(Qc_F_c_EMEP);
    }

    /**
    * Returns the tau of this kumpula_eddy.
    *
    * @return the tau of this kumpula_eddy
    */
    @Override
    public float getTau() {
        return _kumpula_eddy.getTau();
    }

    /**
    * Sets the tau of this kumpula_eddy.
    *
    * @param tau the tau of this kumpula_eddy
    */
    @Override
    public void setTau(float tau) {
        _kumpula_eddy.setTau(tau);
    }

    /**
    * Returns the tau_ e m e p of this kumpula_eddy.
    *
    * @return the tau_ e m e p of this kumpula_eddy
    */
    @Override
    public int getTau_EMEP() {
        return _kumpula_eddy.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this kumpula_eddy.
    *
    * @param tau_EMEP the tau_ e m e p of this kumpula_eddy
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _kumpula_eddy.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the qc_tau of this kumpula_eddy.
    *
    * @return the qc_tau of this kumpula_eddy
    */
    @Override
    public int getQc_tau() {
        return _kumpula_eddy.getQc_tau();
    }

    /**
    * Sets the qc_tau of this kumpula_eddy.
    *
    * @param Qc_tau the qc_tau of this kumpula_eddy
    */
    @Override
    public void setQc_tau(int Qc_tau) {
        _kumpula_eddy.setQc_tau(Qc_tau);
    }

    /**
    * Returns the qc_tau_ e m e p of this kumpula_eddy.
    *
    * @return the qc_tau_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_tau_EMEP() {
        return _kumpula_eddy.getQc_tau_EMEP();
    }

    /**
    * Sets the qc_tau_ e m e p of this kumpula_eddy.
    *
    * @param Qc_tau_EMEP the qc_tau_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _kumpula_eddy.setQc_tau_EMEP(Qc_tau_EMEP);
    }

    /**
    * Returns the u_star of this kumpula_eddy.
    *
    * @return the u_star of this kumpula_eddy
    */
    @Override
    public float getU_star() {
        return _kumpula_eddy.getU_star();
    }

    /**
    * Sets the u_star of this kumpula_eddy.
    *
    * @param u_star the u_star of this kumpula_eddy
    */
    @Override
    public void setU_star(float u_star) {
        _kumpula_eddy.setU_star(u_star);
    }

    /**
    * Returns the u_star_ e m e p of this kumpula_eddy.
    *
    * @return the u_star_ e m e p of this kumpula_eddy
    */
    @Override
    public int getU_star_EMEP() {
        return _kumpula_eddy.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this kumpula_eddy.
    *
    * @param u_star_EMEP the u_star_ e m e p of this kumpula_eddy
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _kumpula_eddy.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length of this kumpula_eddy.
    *
    * @return the m o_length of this kumpula_eddy
    */
    @Override
    public float getMO_length() {
        return _kumpula_eddy.getMO_length();
    }

    /**
    * Sets the m o_length of this kumpula_eddy.
    *
    * @param MO_length the m o_length of this kumpula_eddy
    */
    @Override
    public void setMO_length(float MO_length) {
        _kumpula_eddy.setMO_length(MO_length);
    }

    /**
    * Returns the m o_length_ e m e p of this kumpula_eddy.
    *
    * @return the m o_length_ e m e p of this kumpula_eddy
    */
    @Override
    public int getMO_length_EMEP() {
        return _kumpula_eddy.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this kumpula_eddy.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this kumpula_eddy
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _kumpula_eddy.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the std_u of this kumpula_eddy.
    *
    * @return the std_u of this kumpula_eddy
    */
    @Override
    public float getStd_u() {
        return _kumpula_eddy.getStd_u();
    }

    /**
    * Sets the std_u of this kumpula_eddy.
    *
    * @param std_u the std_u of this kumpula_eddy
    */
    @Override
    public void setStd_u(float std_u) {
        _kumpula_eddy.setStd_u(std_u);
    }

    /**
    * Returns the std_u_ e m e p of this kumpula_eddy.
    *
    * @return the std_u_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_u_EMEP() {
        return _kumpula_eddy.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this kumpula_eddy.
    *
    * @param std_u_EMEP the std_u_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _kumpula_eddy.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v of this kumpula_eddy.
    *
    * @return the std_v of this kumpula_eddy
    */
    @Override
    public float getStd_v() {
        return _kumpula_eddy.getStd_v();
    }

    /**
    * Sets the std_v of this kumpula_eddy.
    *
    * @param std_v the std_v of this kumpula_eddy
    */
    @Override
    public void setStd_v(float std_v) {
        _kumpula_eddy.setStd_v(std_v);
    }

    /**
    * Returns the std_v_ e m e p of this kumpula_eddy.
    *
    * @return the std_v_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_v_EMEP() {
        return _kumpula_eddy.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this kumpula_eddy.
    *
    * @param std_v_EMEP the std_v_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _kumpula_eddy.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w of this kumpula_eddy.
    *
    * @return the std_w of this kumpula_eddy
    */
    @Override
    public float getStd_w() {
        return _kumpula_eddy.getStd_w();
    }

    /**
    * Sets the std_w of this kumpula_eddy.
    *
    * @param std_w the std_w of this kumpula_eddy
    */
    @Override
    public void setStd_w(float std_w) {
        _kumpula_eddy.setStd_w(std_w);
    }

    /**
    * Returns the std_w_ e m e p of this kumpula_eddy.
    *
    * @return the std_w_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_w_EMEP() {
        return _kumpula_eddy.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this kumpula_eddy.
    *
    * @param std_w_EMEP the std_w_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _kumpula_eddy.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the std_t of this kumpula_eddy.
    *
    * @return the std_t of this kumpula_eddy
    */
    @Override
    public float getStd_t() {
        return _kumpula_eddy.getStd_t();
    }

    /**
    * Sets the std_t of this kumpula_eddy.
    *
    * @param std_t the std_t of this kumpula_eddy
    */
    @Override
    public void setStd_t(float std_t) {
        _kumpula_eddy.setStd_t(std_t);
    }

    /**
    * Returns the std_t_ e m e p of this kumpula_eddy.
    *
    * @return the std_t_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_t_EMEP() {
        return _kumpula_eddy.getStd_t_EMEP();
    }

    /**
    * Sets the std_t_ e m e p of this kumpula_eddy.
    *
    * @param std_t_EMEP the std_t_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _kumpula_eddy.setStd_t_EMEP(std_t_EMEP);
    }

    /**
    * Returns the std_c of this kumpula_eddy.
    *
    * @return the std_c of this kumpula_eddy
    */
    @Override
    public float getStd_c() {
        return _kumpula_eddy.getStd_c();
    }

    /**
    * Sets the std_c of this kumpula_eddy.
    *
    * @param std_c the std_c of this kumpula_eddy
    */
    @Override
    public void setStd_c(float std_c) {
        _kumpula_eddy.setStd_c(std_c);
    }

    /**
    * Returns the std_c_ e m e p of this kumpula_eddy.
    *
    * @return the std_c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_c_EMEP() {
        return _kumpula_eddy.getStd_c_EMEP();
    }

    /**
    * Sets the std_c_ e m e p of this kumpula_eddy.
    *
    * @param std_c_EMEP the std_c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_c_EMEP(int std_c_EMEP) {
        _kumpula_eddy.setStd_c_EMEP(std_c_EMEP);
    }

    /**
    * Returns the std_h of this kumpula_eddy.
    *
    * @return the std_h of this kumpula_eddy
    */
    @Override
    public float getStd_h() {
        return _kumpula_eddy.getStd_h();
    }

    /**
    * Sets the std_h of this kumpula_eddy.
    *
    * @param std_h the std_h of this kumpula_eddy
    */
    @Override
    public void setStd_h(float std_h) {
        _kumpula_eddy.setStd_h(std_h);
    }

    /**
    * Returns the std_h_ e m e p of this kumpula_eddy.
    *
    * @return the std_h_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_h_EMEP() {
        return _kumpula_eddy.getStd_h_EMEP();
    }

    /**
    * Sets the std_h_ e m e p of this kumpula_eddy.
    *
    * @param std_h_EMEP the std_h_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_h_EMEP(int std_h_EMEP) {
        _kumpula_eddy.setStd_h_EMEP(std_h_EMEP);
    }

    /**
    * Returns the av_u of this kumpula_eddy.
    *
    * @return the av_u of this kumpula_eddy
    */
    @Override
    public float getAv_u() {
        return _kumpula_eddy.getAv_u();
    }

    /**
    * Sets the av_u of this kumpula_eddy.
    *
    * @param av_u the av_u of this kumpula_eddy
    */
    @Override
    public void setAv_u(float av_u) {
        _kumpula_eddy.setAv_u(av_u);
    }

    /**
    * Returns the av_u_ e m e p of this kumpula_eddy.
    *
    * @return the av_u_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_u_EMEP() {
        return _kumpula_eddy.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this kumpula_eddy.
    *
    * @param av_u_EMEP the av_u_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _kumpula_eddy.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v of this kumpula_eddy.
    *
    * @return the av_v of this kumpula_eddy
    */
    @Override
    public float getAv_v() {
        return _kumpula_eddy.getAv_v();
    }

    /**
    * Sets the av_v of this kumpula_eddy.
    *
    * @param av_v the av_v of this kumpula_eddy
    */
    @Override
    public void setAv_v(float av_v) {
        _kumpula_eddy.setAv_v(av_v);
    }

    /**
    * Returns the av_v_ e m e p of this kumpula_eddy.
    *
    * @return the av_v_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_v_EMEP() {
        return _kumpula_eddy.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this kumpula_eddy.
    *
    * @param av_v_EMEP the av_v_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _kumpula_eddy.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w of this kumpula_eddy.
    *
    * @return the av_w of this kumpula_eddy
    */
    @Override
    public float getAv_w() {
        return _kumpula_eddy.getAv_w();
    }

    /**
    * Sets the av_w of this kumpula_eddy.
    *
    * @param av_w the av_w of this kumpula_eddy
    */
    @Override
    public void setAv_w(float av_w) {
        _kumpula_eddy.setAv_w(av_w);
    }

    /**
    * Returns the av_w_ e m e p of this kumpula_eddy.
    *
    * @return the av_w_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_w_EMEP() {
        return _kumpula_eddy.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this kumpula_eddy.
    *
    * @param av_w_EMEP the av_w_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _kumpula_eddy.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the av_t of this kumpula_eddy.
    *
    * @return the av_t of this kumpula_eddy
    */
    @Override
    public float getAv_t() {
        return _kumpula_eddy.getAv_t();
    }

    /**
    * Sets the av_t of this kumpula_eddy.
    *
    * @param av_t the av_t of this kumpula_eddy
    */
    @Override
    public void setAv_t(float av_t) {
        _kumpula_eddy.setAv_t(av_t);
    }

    /**
    * Returns the av_t_ e m e p of this kumpula_eddy.
    *
    * @return the av_t_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_t_EMEP() {
        return _kumpula_eddy.getAv_t_EMEP();
    }

    /**
    * Sets the av_t_ e m e p of this kumpula_eddy.
    *
    * @param av_t_EMEP the av_t_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _kumpula_eddy.setAv_t_EMEP(av_t_EMEP);
    }

    /**
    * Returns the av_c of this kumpula_eddy.
    *
    * @return the av_c of this kumpula_eddy
    */
    @Override
    public float getAv_c() {
        return _kumpula_eddy.getAv_c();
    }

    /**
    * Sets the av_c of this kumpula_eddy.
    *
    * @param av_c the av_c of this kumpula_eddy
    */
    @Override
    public void setAv_c(float av_c) {
        _kumpula_eddy.setAv_c(av_c);
    }

    /**
    * Returns the av_c_ e m e p of this kumpula_eddy.
    *
    * @return the av_c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_c_EMEP() {
        return _kumpula_eddy.getAv_c_EMEP();
    }

    /**
    * Sets the av_c_ e m e p of this kumpula_eddy.
    *
    * @param av_c_EMEP the av_c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _kumpula_eddy.setAv_c_EMEP(av_c_EMEP);
    }

    /**
    * Returns the av_h of this kumpula_eddy.
    *
    * @return the av_h of this kumpula_eddy
    */
    @Override
    public float getAv_h() {
        return _kumpula_eddy.getAv_h();
    }

    /**
    * Sets the av_h of this kumpula_eddy.
    *
    * @param av_h the av_h of this kumpula_eddy
    */
    @Override
    public void setAv_h(float av_h) {
        _kumpula_eddy.setAv_h(av_h);
    }

    /**
    * Returns the av_h_ e m e p of this kumpula_eddy.
    *
    * @return the av_h_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_h_EMEP() {
        return _kumpula_eddy.getAv_h_EMEP();
    }

    /**
    * Sets the av_h_ e m e p of this kumpula_eddy.
    *
    * @param av_h_EMEP the av_h_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_h_EMEP(int av_h_EMEP) {
        _kumpula_eddy.setAv_h_EMEP(av_h_EMEP);
    }

    /**
    * Returns the u of this kumpula_eddy.
    *
    * @return the u of this kumpula_eddy
    */
    @Override
    public float getU() {
        return _kumpula_eddy.getU();
    }

    /**
    * Sets the u of this kumpula_eddy.
    *
    * @param U the u of this kumpula_eddy
    */
    @Override
    public void setU(float U) {
        _kumpula_eddy.setU(U);
    }

    /**
    * Returns the u_ e m e p of this kumpula_eddy.
    *
    * @return the u_ e m e p of this kumpula_eddy
    */
    @Override
    public int getU_EMEP() {
        return _kumpula_eddy.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this kumpula_eddy.
    *
    * @param U_EMEP the u_ e m e p of this kumpula_eddy
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _kumpula_eddy.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir of this kumpula_eddy.
    *
    * @return the wind_dir of this kumpula_eddy
    */
    @Override
    public float getWind_dir() {
        return _kumpula_eddy.getWind_dir();
    }

    /**
    * Sets the wind_dir of this kumpula_eddy.
    *
    * @param wind_dir the wind_dir of this kumpula_eddy
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _kumpula_eddy.setWind_dir(wind_dir);
    }

    /**
    * Returns the wind_dir_ e m e p of this kumpula_eddy.
    *
    * @return the wind_dir_ e m e p of this kumpula_eddy
    */
    @Override
    public int getWind_dir_EMEP() {
        return _kumpula_eddy.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this kumpula_eddy.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this kumpula_eddy
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _kumpula_eddy.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the eta of this kumpula_eddy.
    *
    * @return the eta of this kumpula_eddy
    */
    @Override
    public float getEta() {
        return _kumpula_eddy.getEta();
    }

    /**
    * Sets the eta of this kumpula_eddy.
    *
    * @param eta the eta of this kumpula_eddy
    */
    @Override
    public void setEta(float eta) {
        _kumpula_eddy.setEta(eta);
    }

    /**
    * Returns the eta_ e m e p of this kumpula_eddy.
    *
    * @return the eta_ e m e p of this kumpula_eddy
    */
    @Override
    public int getEta_EMEP() {
        return _kumpula_eddy.getEta_EMEP();
    }

    /**
    * Sets the eta_ e m e p of this kumpula_eddy.
    *
    * @param eta_EMEP the eta_ e m e p of this kumpula_eddy
    */
    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _kumpula_eddy.setEta_EMEP(eta_EMEP);
    }

    /**
    * Returns the theta of this kumpula_eddy.
    *
    * @return the theta of this kumpula_eddy
    */
    @Override
    public float getTheta() {
        return _kumpula_eddy.getTheta();
    }

    /**
    * Sets the theta of this kumpula_eddy.
    *
    * @param theta the theta of this kumpula_eddy
    */
    @Override
    public void setTheta(float theta) {
        _kumpula_eddy.setTheta(theta);
    }

    /**
    * Returns the theta_ e m e p of this kumpula_eddy.
    *
    * @return the theta_ e m e p of this kumpula_eddy
    */
    @Override
    public int getTheta_EMEP() {
        return _kumpula_eddy.getTheta_EMEP();
    }

    /**
    * Sets the theta_ e m e p of this kumpula_eddy.
    *
    * @param theta_EMEP the theta_ e m e p of this kumpula_eddy
    */
    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _kumpula_eddy.setTheta_EMEP(theta_EMEP);
    }

    /**
    * Returns the beta of this kumpula_eddy.
    *
    * @return the beta of this kumpula_eddy
    */
    @Override
    public float getBeta() {
        return _kumpula_eddy.getBeta();
    }

    /**
    * Sets the beta of this kumpula_eddy.
    *
    * @param beta the beta of this kumpula_eddy
    */
    @Override
    public void setBeta(float beta) {
        _kumpula_eddy.setBeta(beta);
    }

    /**
    * Returns the beta_ e m e p of this kumpula_eddy.
    *
    * @return the beta_ e m e p of this kumpula_eddy
    */
    @Override
    public int getBeta_EMEP() {
        return _kumpula_eddy.getBeta_EMEP();
    }

    /**
    * Sets the beta_ e m e p of this kumpula_eddy.
    *
    * @param beta_EMEP the beta_ e m e p of this kumpula_eddy
    */
    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _kumpula_eddy.setBeta_EMEP(beta_EMEP);
    }

    /**
    * Returns the c_lag of this kumpula_eddy.
    *
    * @return the c_lag of this kumpula_eddy
    */
    @Override
    public float getC_lag() {
        return _kumpula_eddy.getC_lag();
    }

    /**
    * Sets the c_lag of this kumpula_eddy.
    *
    * @param c_lag the c_lag of this kumpula_eddy
    */
    @Override
    public void setC_lag(float c_lag) {
        _kumpula_eddy.setC_lag(c_lag);
    }

    /**
    * Returns the c_lag_ e m e p of this kumpula_eddy.
    *
    * @return the c_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public int getC_lag_EMEP() {
        return _kumpula_eddy.getC_lag_EMEP();
    }

    /**
    * Sets the c_lag_ e m e p of this kumpula_eddy.
    *
    * @param c_lag_EMEP the c_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public void setC_lag_EMEP(int c_lag_EMEP) {
        _kumpula_eddy.setC_lag_EMEP(c_lag_EMEP);
    }

    /**
    * Returns the h_lag of this kumpula_eddy.
    *
    * @return the h_lag of this kumpula_eddy
    */
    @Override
    public float getH_lag() {
        return _kumpula_eddy.getH_lag();
    }

    /**
    * Sets the h_lag of this kumpula_eddy.
    *
    * @param h_lag the h_lag of this kumpula_eddy
    */
    @Override
    public void setH_lag(float h_lag) {
        _kumpula_eddy.setH_lag(h_lag);
    }

    /**
    * Returns the h_lag_ e m e p of this kumpula_eddy.
    *
    * @return the h_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public int getH_lag_EMEP() {
        return _kumpula_eddy.getH_lag_EMEP();
    }

    /**
    * Sets the h_lag_ e m e p of this kumpula_eddy.
    *
    * @param h_lag_EMEP the h_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public void setH_lag_EMEP(int h_lag_EMEP) {
        _kumpula_eddy.setH_lag_EMEP(h_lag_EMEP);
    }

    /**
    * Returns the err_packet of this kumpula_eddy.
    *
    * @return the err_packet of this kumpula_eddy
    */
    @Override
    public float getErr_packet() {
        return _kumpula_eddy.getErr_packet();
    }

    /**
    * Sets the err_packet of this kumpula_eddy.
    *
    * @param err_packet the err_packet of this kumpula_eddy
    */
    @Override
    public void setErr_packet(float err_packet) {
        _kumpula_eddy.setErr_packet(err_packet);
    }

    /**
    * Returns the err_packet_ e m e p of this kumpula_eddy.
    *
    * @return the err_packet_ e m e p of this kumpula_eddy
    */
    @Override
    public int getErr_packet_EMEP() {
        return _kumpula_eddy.getErr_packet_EMEP();
    }

    /**
    * Sets the err_packet_ e m e p of this kumpula_eddy.
    *
    * @param err_packet_EMEP the err_packet_ e m e p of this kumpula_eddy
    */
    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _kumpula_eddy.setErr_packet_EMEP(err_packet_EMEP);
    }

    /**
    * Returns the licor_t_std of this kumpula_eddy.
    *
    * @return the licor_t_std of this kumpula_eddy
    */
    @Override
    public float getLicor_t_std() {
        return _kumpula_eddy.getLicor_t_std();
    }

    /**
    * Sets the licor_t_std of this kumpula_eddy.
    *
    * @param licor_t_std the licor_t_std of this kumpula_eddy
    */
    @Override
    public void setLicor_t_std(float licor_t_std) {
        _kumpula_eddy.setLicor_t_std(licor_t_std);
    }

    /**
    * Returns the licor_t_std_ e m e p of this kumpula_eddy.
    *
    * @return the licor_t_std_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLicor_t_std_EMEP() {
        return _kumpula_eddy.getLicor_t_std_EMEP();
    }

    /**
    * Sets the licor_t_std_ e m e p of this kumpula_eddy.
    *
    * @param licor_t_std_EMEP the licor_t_std_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _kumpula_eddy.setLicor_t_std_EMEP(licor_t_std_EMEP);
    }

    /**
    * Returns the licor_t_av of this kumpula_eddy.
    *
    * @return the licor_t_av of this kumpula_eddy
    */
    @Override
    public float getLicor_t_av() {
        return _kumpula_eddy.getLicor_t_av();
    }

    /**
    * Sets the licor_t_av of this kumpula_eddy.
    *
    * @param licor_t_av the licor_t_av of this kumpula_eddy
    */
    @Override
    public void setLicor_t_av(float licor_t_av) {
        _kumpula_eddy.setLicor_t_av(licor_t_av);
    }

    /**
    * Returns the licor_t_av_ e m e p of this kumpula_eddy.
    *
    * @return the licor_t_av_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLicor_t_av_EMEP() {
        return _kumpula_eddy.getLicor_t_av_EMEP();
    }

    /**
    * Sets the licor_t_av_ e m e p of this kumpula_eddy.
    *
    * @param licor_t_av_EMEP the licor_t_av_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _kumpula_eddy.setLicor_t_av_EMEP(licor_t_av_EMEP);
    }

    /**
    * Returns the licor_p_std of this kumpula_eddy.
    *
    * @return the licor_p_std of this kumpula_eddy
    */
    @Override
    public float getLicor_p_std() {
        return _kumpula_eddy.getLicor_p_std();
    }

    /**
    * Sets the licor_p_std of this kumpula_eddy.
    *
    * @param licor_p_std the licor_p_std of this kumpula_eddy
    */
    @Override
    public void setLicor_p_std(float licor_p_std) {
        _kumpula_eddy.setLicor_p_std(licor_p_std);
    }

    /**
    * Returns the licor_p_std_ e m e p of this kumpula_eddy.
    *
    * @return the licor_p_std_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLicor_p_std_EMEP() {
        return _kumpula_eddy.getLicor_p_std_EMEP();
    }

    /**
    * Sets the licor_p_std_ e m e p of this kumpula_eddy.
    *
    * @param licor_p_std_EMEP the licor_p_std_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _kumpula_eddy.setLicor_p_std_EMEP(licor_p_std_EMEP);
    }

    /**
    * Returns the licor_p_av of this kumpula_eddy.
    *
    * @return the licor_p_av of this kumpula_eddy
    */
    @Override
    public float getLicor_p_av() {
        return _kumpula_eddy.getLicor_p_av();
    }

    /**
    * Sets the licor_p_av of this kumpula_eddy.
    *
    * @param licor_p_av the licor_p_av of this kumpula_eddy
    */
    @Override
    public void setLicor_p_av(float licor_p_av) {
        _kumpula_eddy.setLicor_p_av(licor_p_av);
    }

    /**
    * Returns the licor_p_av_ e m e p of this kumpula_eddy.
    *
    * @return the licor_p_av_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLicor_p_av_EMEP() {
        return _kumpula_eddy.getLicor_p_av_EMEP();
    }

    /**
    * Sets the licor_p_av_ e m e p of this kumpula_eddy.
    *
    * @param licor_p_av_EMEP the licor_p_av_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _kumpula_eddy.setLicor_p_av_EMEP(licor_p_av_EMEP);
    }

    /**
    * Returns the l e_op of this kumpula_eddy.
    *
    * @return the l e_op of this kumpula_eddy
    */
    @Override
    public float getLE_op() {
        return _kumpula_eddy.getLE_op();
    }

    /**
    * Sets the l e_op of this kumpula_eddy.
    *
    * @param LE_op the l e_op of this kumpula_eddy
    */
    @Override
    public void setLE_op(float LE_op) {
        _kumpula_eddy.setLE_op(LE_op);
    }

    /**
    * Returns the l e_op_ e m e p of this kumpula_eddy.
    *
    * @return the l e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getLE_op_EMEP() {
        return _kumpula_eddy.getLE_op_EMEP();
    }

    /**
    * Sets the l e_op_ e m e p of this kumpula_eddy.
    *
    * @param LE_op_EMEP the l e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setLE_op_EMEP(int LE_op_EMEP) {
        _kumpula_eddy.setLE_op_EMEP(LE_op_EMEP);
    }

    /**
    * Returns the qc_ l e_op of this kumpula_eddy.
    *
    * @return the qc_ l e_op of this kumpula_eddy
    */
    @Override
    public int getQc_LE_op() {
        return _kumpula_eddy.getQc_LE_op();
    }

    /**
    * Sets the qc_ l e_op of this kumpula_eddy.
    *
    * @param Qc_LE_op the qc_ l e_op of this kumpula_eddy
    */
    @Override
    public void setQc_LE_op(int Qc_LE_op) {
        _kumpula_eddy.setQc_LE_op(Qc_LE_op);
    }

    /**
    * Returns the qc_ l e_op_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ l e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_LE_op_EMEP() {
        return _kumpula_eddy.getQc_LE_op_EMEP();
    }

    /**
    * Sets the qc_ l e_op_ e m e p of this kumpula_eddy.
    *
    * @param Qc_LE_op_EMEP the qc_ l e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_LE_op_EMEP(int Qc_LE_op_EMEP) {
        _kumpula_eddy.setQc_LE_op_EMEP(Qc_LE_op_EMEP);
    }

    /**
    * Returns the e_op of this kumpula_eddy.
    *
    * @return the e_op of this kumpula_eddy
    */
    @Override
    public float getE_op() {
        return _kumpula_eddy.getE_op();
    }

    /**
    * Sets the e_op of this kumpula_eddy.
    *
    * @param E_op the e_op of this kumpula_eddy
    */
    @Override
    public void setE_op(float E_op) {
        _kumpula_eddy.setE_op(E_op);
    }

    /**
    * Returns the e_op_ e m e p of this kumpula_eddy.
    *
    * @return the e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getE_op_EMEP() {
        return _kumpula_eddy.getE_op_EMEP();
    }

    /**
    * Sets the e_op_ e m e p of this kumpula_eddy.
    *
    * @param E_op_EMEP the e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setE_op_EMEP(int E_op_EMEP) {
        _kumpula_eddy.setE_op_EMEP(E_op_EMEP);
    }

    /**
    * Returns the qc_ e_op of this kumpula_eddy.
    *
    * @return the qc_ e_op of this kumpula_eddy
    */
    @Override
    public int getQc_E_op() {
        return _kumpula_eddy.getQc_E_op();
    }

    /**
    * Sets the qc_ e_op of this kumpula_eddy.
    *
    * @param Qc_E_op the qc_ e_op of this kumpula_eddy
    */
    @Override
    public void setQc_E_op(int Qc_E_op) {
        _kumpula_eddy.setQc_E_op(Qc_E_op);
    }

    /**
    * Returns the qc_ e_op_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_E_op_EMEP() {
        return _kumpula_eddy.getQc_E_op_EMEP();
    }

    /**
    * Sets the qc_ e_op_ e m e p of this kumpula_eddy.
    *
    * @param Qc_E_op_EMEP the qc_ e_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_E_op_EMEP(int Qc_E_op_EMEP) {
        _kumpula_eddy.setQc_E_op_EMEP(Qc_E_op_EMEP);
    }

    /**
    * Returns the f_c_op of this kumpula_eddy.
    *
    * @return the f_c_op of this kumpula_eddy
    */
    @Override
    public float getF_c_op() {
        return _kumpula_eddy.getF_c_op();
    }

    /**
    * Sets the f_c_op of this kumpula_eddy.
    *
    * @param F_c_op the f_c_op of this kumpula_eddy
    */
    @Override
    public void setF_c_op(float F_c_op) {
        _kumpula_eddy.setF_c_op(F_c_op);
    }

    /**
    * Returns the f_c_op_ e m e p of this kumpula_eddy.
    *
    * @return the f_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getF_c_op_EMEP() {
        return _kumpula_eddy.getF_c_op_EMEP();
    }

    /**
    * Sets the f_c_op_ e m e p of this kumpula_eddy.
    *
    * @param F_c_op_EMEP the f_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setF_c_op_EMEP(int F_c_op_EMEP) {
        _kumpula_eddy.setF_c_op_EMEP(F_c_op_EMEP);
    }

    /**
    * Returns the qc_ f_c_op of this kumpula_eddy.
    *
    * @return the qc_ f_c_op of this kumpula_eddy
    */
    @Override
    public int getQc_F_c_op() {
        return _kumpula_eddy.getQc_F_c_op();
    }

    /**
    * Sets the qc_ f_c_op of this kumpula_eddy.
    *
    * @param Qc_F_c_op the qc_ f_c_op of this kumpula_eddy
    */
    @Override
    public void setQc_F_c_op(int Qc_F_c_op) {
        _kumpula_eddy.setQc_F_c_op(Qc_F_c_op);
    }

    /**
    * Returns the qc_ f_c_op_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ f_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_F_c_op_EMEP() {
        return _kumpula_eddy.getQc_F_c_op_EMEP();
    }

    /**
    * Sets the qc_ f_c_op_ e m e p of this kumpula_eddy.
    *
    * @param Qc_F_c_op_EMEP the qc_ f_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_F_c_op_EMEP(int Qc_F_c_op_EMEP) {
        _kumpula_eddy.setQc_F_c_op_EMEP(Qc_F_c_op_EMEP);
    }

    /**
    * Returns the std_c_op of this kumpula_eddy.
    *
    * @return the std_c_op of this kumpula_eddy
    */
    @Override
    public float getStd_c_op() {
        return _kumpula_eddy.getStd_c_op();
    }

    /**
    * Sets the std_c_op of this kumpula_eddy.
    *
    * @param std_c_op the std_c_op of this kumpula_eddy
    */
    @Override
    public void setStd_c_op(float std_c_op) {
        _kumpula_eddy.setStd_c_op(std_c_op);
    }

    /**
    * Returns the std_c_op_ e m e p of this kumpula_eddy.
    *
    * @return the std_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_c_op_EMEP() {
        return _kumpula_eddy.getStd_c_op_EMEP();
    }

    /**
    * Sets the std_c_op_ e m e p of this kumpula_eddy.
    *
    * @param std_c_op_EMEP the std_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_c_op_EMEP(int std_c_op_EMEP) {
        _kumpula_eddy.setStd_c_op_EMEP(std_c_op_EMEP);
    }

    /**
    * Returns the std_h_op of this kumpula_eddy.
    *
    * @return the std_h_op of this kumpula_eddy
    */
    @Override
    public float getStd_h_op() {
        return _kumpula_eddy.getStd_h_op();
    }

    /**
    * Sets the std_h_op of this kumpula_eddy.
    *
    * @param std_h_op the std_h_op of this kumpula_eddy
    */
    @Override
    public void setStd_h_op(float std_h_op) {
        _kumpula_eddy.setStd_h_op(std_h_op);
    }

    /**
    * Returns the std_h_op_ e m e p of this kumpula_eddy.
    *
    * @return the std_h_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_h_op_EMEP() {
        return _kumpula_eddy.getStd_h_op_EMEP();
    }

    /**
    * Sets the std_h_op_ e m e p of this kumpula_eddy.
    *
    * @param std_h_op_EMEP the std_h_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_h_op_EMEP(int std_h_op_EMEP) {
        _kumpula_eddy.setStd_h_op_EMEP(std_h_op_EMEP);
    }

    /**
    * Returns the av_c_op of this kumpula_eddy.
    *
    * @return the av_c_op of this kumpula_eddy
    */
    @Override
    public float getAv_c_op() {
        return _kumpula_eddy.getAv_c_op();
    }

    /**
    * Sets the av_c_op of this kumpula_eddy.
    *
    * @param av_c_op the av_c_op of this kumpula_eddy
    */
    @Override
    public void setAv_c_op(float av_c_op) {
        _kumpula_eddy.setAv_c_op(av_c_op);
    }

    /**
    * Returns the av_c_op_ e m e p of this kumpula_eddy.
    *
    * @return the av_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_c_op_EMEP() {
        return _kumpula_eddy.getAv_c_op_EMEP();
    }

    /**
    * Sets the av_c_op_ e m e p of this kumpula_eddy.
    *
    * @param av_c_op_EMEP the av_c_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_c_op_EMEP(int av_c_op_EMEP) {
        _kumpula_eddy.setAv_c_op_EMEP(av_c_op_EMEP);
    }

    /**
    * Returns the av_h_op of this kumpula_eddy.
    *
    * @return the av_h_op of this kumpula_eddy
    */
    @Override
    public float getAv_h_op() {
        return _kumpula_eddy.getAv_h_op();
    }

    /**
    * Sets the av_h_op of this kumpula_eddy.
    *
    * @param av_h_op the av_h_op of this kumpula_eddy
    */
    @Override
    public void setAv_h_op(float av_h_op) {
        _kumpula_eddy.setAv_h_op(av_h_op);
    }

    /**
    * Returns the av_h_op_ e m e p of this kumpula_eddy.
    *
    * @return the av_h_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_h_op_EMEP() {
        return _kumpula_eddy.getAv_h_op_EMEP();
    }

    /**
    * Sets the av_h_op_ e m e p of this kumpula_eddy.
    *
    * @param av_h_op_EMEP the av_h_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_h_op_EMEP(int av_h_op_EMEP) {
        _kumpula_eddy.setAv_h_op_EMEP(av_h_op_EMEP);
    }

    /**
    * Returns the c_lag_op of this kumpula_eddy.
    *
    * @return the c_lag_op of this kumpula_eddy
    */
    @Override
    public float getC_lag_op() {
        return _kumpula_eddy.getC_lag_op();
    }

    /**
    * Sets the c_lag_op of this kumpula_eddy.
    *
    * @param c_lag_op the c_lag_op of this kumpula_eddy
    */
    @Override
    public void setC_lag_op(float c_lag_op) {
        _kumpula_eddy.setC_lag_op(c_lag_op);
    }

    /**
    * Returns the c_lag_op_ e m e p of this kumpula_eddy.
    *
    * @return the c_lag_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getC_lag_op_EMEP() {
        return _kumpula_eddy.getC_lag_op_EMEP();
    }

    /**
    * Sets the c_lag_op_ e m e p of this kumpula_eddy.
    *
    * @param c_lag_op_EMEP the c_lag_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setC_lag_op_EMEP(int c_lag_op_EMEP) {
        _kumpula_eddy.setC_lag_op_EMEP(c_lag_op_EMEP);
    }

    /**
    * Returns the h_lag_op of this kumpula_eddy.
    *
    * @return the h_lag_op of this kumpula_eddy
    */
    @Override
    public float getH_lag_op() {
        return _kumpula_eddy.getH_lag_op();
    }

    /**
    * Sets the h_lag_op of this kumpula_eddy.
    *
    * @param h_lag_op the h_lag_op of this kumpula_eddy
    */
    @Override
    public void setH_lag_op(float h_lag_op) {
        _kumpula_eddy.setH_lag_op(h_lag_op);
    }

    /**
    * Returns the h_lag_op_ e m e p of this kumpula_eddy.
    *
    * @return the h_lag_op_ e m e p of this kumpula_eddy
    */
    @Override
    public int getH_lag_op_EMEP() {
        return _kumpula_eddy.getH_lag_op_EMEP();
    }

    /**
    * Sets the h_lag_op_ e m e p of this kumpula_eddy.
    *
    * @param h_lag_op_EMEP the h_lag_op_ e m e p of this kumpula_eddy
    */
    @Override
    public void setH_lag_op_EMEP(int h_lag_op_EMEP) {
        _kumpula_eddy.setH_lag_op_EMEP(h_lag_op_EMEP);
    }

    /**
    * Returns the f_ c p c of this kumpula_eddy.
    *
    * @return the f_ c p c of this kumpula_eddy
    */
    @Override
    public float getF_CPC() {
        return _kumpula_eddy.getF_CPC();
    }

    /**
    * Sets the f_ c p c of this kumpula_eddy.
    *
    * @param F_CPC the f_ c p c of this kumpula_eddy
    */
    @Override
    public void setF_CPC(float F_CPC) {
        _kumpula_eddy.setF_CPC(F_CPC);
    }

    /**
    * Returns the f_ c p c_ e m e p of this kumpula_eddy.
    *
    * @return the f_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getF_CPC_EMEP() {
        return _kumpula_eddy.getF_CPC_EMEP();
    }

    /**
    * Sets the f_ c p c_ e m e p of this kumpula_eddy.
    *
    * @param F_CPC_EMEP the f_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setF_CPC_EMEP(int F_CPC_EMEP) {
        _kumpula_eddy.setF_CPC_EMEP(F_CPC_EMEP);
    }

    /**
    * Returns the qc_ f_ c p c of this kumpula_eddy.
    *
    * @return the qc_ f_ c p c of this kumpula_eddy
    */
    @Override
    public int getQc_F_CPC() {
        return _kumpula_eddy.getQc_F_CPC();
    }

    /**
    * Sets the qc_ f_ c p c of this kumpula_eddy.
    *
    * @param Qc_F_CPC the qc_ f_ c p c of this kumpula_eddy
    */
    @Override
    public void setQc_F_CPC(int Qc_F_CPC) {
        _kumpula_eddy.setQc_F_CPC(Qc_F_CPC);
    }

    /**
    * Returns the qc_ f_ c p c_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ f_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_F_CPC_EMEP() {
        return _kumpula_eddy.getQc_F_CPC_EMEP();
    }

    /**
    * Sets the qc_ f_ c p c_ e m e p of this kumpula_eddy.
    *
    * @param Qc_F_CPC_EMEP the qc_ f_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_F_CPC_EMEP(int Qc_F_CPC_EMEP) {
        _kumpula_eddy.setQc_F_CPC_EMEP(Qc_F_CPC_EMEP);
    }

    /**
    * Returns the std_ c p c of this kumpula_eddy.
    *
    * @return the std_ c p c of this kumpula_eddy
    */
    @Override
    public float getStd_CPC() {
        return _kumpula_eddy.getStd_CPC();
    }

    /**
    * Sets the std_ c p c of this kumpula_eddy.
    *
    * @param std_CPC the std_ c p c of this kumpula_eddy
    */
    @Override
    public void setStd_CPC(float std_CPC) {
        _kumpula_eddy.setStd_CPC(std_CPC);
    }

    /**
    * Returns the std_ c p c_ e m e p of this kumpula_eddy.
    *
    * @return the std_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_CPC_EMEP() {
        return _kumpula_eddy.getStd_CPC_EMEP();
    }

    /**
    * Sets the std_ c p c_ e m e p of this kumpula_eddy.
    *
    * @param std_CPC_EMEP the std_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_CPC_EMEP(int std_CPC_EMEP) {
        _kumpula_eddy.setStd_CPC_EMEP(std_CPC_EMEP);
    }

    /**
    * Returns the av_ c p c of this kumpula_eddy.
    *
    * @return the av_ c p c of this kumpula_eddy
    */
    @Override
    public float getAv_CPC() {
        return _kumpula_eddy.getAv_CPC();
    }

    /**
    * Sets the av_ c p c of this kumpula_eddy.
    *
    * @param av_CPC the av_ c p c of this kumpula_eddy
    */
    @Override
    public void setAv_CPC(float av_CPC) {
        _kumpula_eddy.setAv_CPC(av_CPC);
    }

    /**
    * Returns the av_ c p c_ e m e p of this kumpula_eddy.
    *
    * @return the av_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_CPC_EMEP() {
        return _kumpula_eddy.getAv_CPC_EMEP();
    }

    /**
    * Sets the av_ c p c_ e m e p of this kumpula_eddy.
    *
    * @param av_CPC_EMEP the av_ c p c_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_CPC_EMEP(int av_CPC_EMEP) {
        _kumpula_eddy.setAv_CPC_EMEP(av_CPC_EMEP);
    }

    /**
    * Returns the c p c_lag of this kumpula_eddy.
    *
    * @return the c p c_lag of this kumpula_eddy
    */
    @Override
    public float getCPC_lag() {
        return _kumpula_eddy.getCPC_lag();
    }

    /**
    * Sets the c p c_lag of this kumpula_eddy.
    *
    * @param CPC_lag the c p c_lag of this kumpula_eddy
    */
    @Override
    public void setCPC_lag(float CPC_lag) {
        _kumpula_eddy.setCPC_lag(CPC_lag);
    }

    /**
    * Returns the c p c_lag_ e m e p of this kumpula_eddy.
    *
    * @return the c p c_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public int getCPC_lag_EMEP() {
        return _kumpula_eddy.getCPC_lag_EMEP();
    }

    /**
    * Sets the c p c_lag_ e m e p of this kumpula_eddy.
    *
    * @param CPC_lag_EMEP the c p c_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public void setCPC_lag_EMEP(int CPC_lag_EMEP) {
        _kumpula_eddy.setCPC_lag_EMEP(CPC_lag_EMEP);
    }

    /**
    * Returns the f_ n2 o of this kumpula_eddy.
    *
    * @return the f_ n2 o of this kumpula_eddy
    */
    @Override
    public float getF_N2O() {
        return _kumpula_eddy.getF_N2O();
    }

    /**
    * Sets the f_ n2 o of this kumpula_eddy.
    *
    * @param F_N2O the f_ n2 o of this kumpula_eddy
    */
    @Override
    public void setF_N2O(float F_N2O) {
        _kumpula_eddy.setF_N2O(F_N2O);
    }

    /**
    * Returns the f_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @return the f_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public int getF_N2O_EMEP() {
        return _kumpula_eddy.getF_N2O_EMEP();
    }

    /**
    * Sets the f_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @param F_N2O_EMEP the f_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public void setF_N2O_EMEP(int F_N2O_EMEP) {
        _kumpula_eddy.setF_N2O_EMEP(F_N2O_EMEP);
    }

    /**
    * Returns the qc_ f_ n2 o of this kumpula_eddy.
    *
    * @return the qc_ f_ n2 o of this kumpula_eddy
    */
    @Override
    public int getQc_F_N2O() {
        return _kumpula_eddy.getQc_F_N2O();
    }

    /**
    * Sets the qc_ f_ n2 o of this kumpula_eddy.
    *
    * @param Qc_F_N2O the qc_ f_ n2 o of this kumpula_eddy
    */
    @Override
    public void setQc_F_N2O(int Qc_F_N2O) {
        _kumpula_eddy.setQc_F_N2O(Qc_F_N2O);
    }

    /**
    * Returns the qc_ f_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @return the qc_ f_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public int getQc_F_N2O_EMEP() {
        return _kumpula_eddy.getQc_F_N2O_EMEP();
    }

    /**
    * Sets the qc_ f_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @param Qc_F_N2O_EMEP the qc_ f_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public void setQc_F_N2O_EMEP(int Qc_F_N2O_EMEP) {
        _kumpula_eddy.setQc_F_N2O_EMEP(Qc_F_N2O_EMEP);
    }

    /**
    * Returns the std_ n2 o of this kumpula_eddy.
    *
    * @return the std_ n2 o of this kumpula_eddy
    */
    @Override
    public float getStd_N2O() {
        return _kumpula_eddy.getStd_N2O();
    }

    /**
    * Sets the std_ n2 o of this kumpula_eddy.
    *
    * @param std_N2O the std_ n2 o of this kumpula_eddy
    */
    @Override
    public void setStd_N2O(float std_N2O) {
        _kumpula_eddy.setStd_N2O(std_N2O);
    }

    /**
    * Returns the std_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @return the std_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public int getStd_N2O_EMEP() {
        return _kumpula_eddy.getStd_N2O_EMEP();
    }

    /**
    * Sets the std_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @param std_N2O_EMEP the std_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public void setStd_N2O_EMEP(int std_N2O_EMEP) {
        _kumpula_eddy.setStd_N2O_EMEP(std_N2O_EMEP);
    }

    /**
    * Returns the av_ n2 o of this kumpula_eddy.
    *
    * @return the av_ n2 o of this kumpula_eddy
    */
    @Override
    public float getAv_N2O() {
        return _kumpula_eddy.getAv_N2O();
    }

    /**
    * Sets the av_ n2 o of this kumpula_eddy.
    *
    * @param av_N2O the av_ n2 o of this kumpula_eddy
    */
    @Override
    public void setAv_N2O(float av_N2O) {
        _kumpula_eddy.setAv_N2O(av_N2O);
    }

    /**
    * Returns the av_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @return the av_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public int getAv_N2O_EMEP() {
        return _kumpula_eddy.getAv_N2O_EMEP();
    }

    /**
    * Sets the av_ n2 o_ e m e p of this kumpula_eddy.
    *
    * @param av_N2O_EMEP the av_ n2 o_ e m e p of this kumpula_eddy
    */
    @Override
    public void setAv_N2O_EMEP(int av_N2O_EMEP) {
        _kumpula_eddy.setAv_N2O_EMEP(av_N2O_EMEP);
    }

    /**
    * Returns the n2 o_lag of this kumpula_eddy.
    *
    * @return the n2 o_lag of this kumpula_eddy
    */
    @Override
    public float getN2O_lag() {
        return _kumpula_eddy.getN2O_lag();
    }

    /**
    * Sets the n2 o_lag of this kumpula_eddy.
    *
    * @param N2O_lag the n2 o_lag of this kumpula_eddy
    */
    @Override
    public void setN2O_lag(float N2O_lag) {
        _kumpula_eddy.setN2O_lag(N2O_lag);
    }

    /**
    * Returns the n2 o_lag_ e m e p of this kumpula_eddy.
    *
    * @return the n2 o_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public int getN2O_lag_EMEP() {
        return _kumpula_eddy.getN2O_lag_EMEP();
    }

    /**
    * Sets the n2 o_lag_ e m e p of this kumpula_eddy.
    *
    * @param N2O_lag_EMEP the n2 o_lag_ e m e p of this kumpula_eddy
    */
    @Override
    public void setN2O_lag_EMEP(int N2O_lag_EMEP) {
        _kumpula_eddy.setN2O_lag_EMEP(N2O_lag_EMEP);
    }

    @Override
    public boolean isNew() {
        return _kumpula_eddy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _kumpula_eddy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _kumpula_eddy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _kumpula_eddy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _kumpula_eddy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _kumpula_eddy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _kumpula_eddy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _kumpula_eddy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _kumpula_eddy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _kumpula_eddy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _kumpula_eddy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Kumpula_eddyWrapper((Kumpula_eddy) _kumpula_eddy.clone());
    }

    @Override
    public int compareTo(Kumpula_eddy kumpula_eddy) {
        return _kumpula_eddy.compareTo(kumpula_eddy);
    }

    @Override
    public int hashCode() {
        return _kumpula_eddy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Kumpula_eddy> toCacheModel() {
        return _kumpula_eddy.toCacheModel();
    }

    @Override
    public Kumpula_eddy toEscapedModel() {
        return new Kumpula_eddyWrapper(_kumpula_eddy.toEscapedModel());
    }

    @Override
    public Kumpula_eddy toUnescapedModel() {
        return new Kumpula_eddyWrapper(_kumpula_eddy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _kumpula_eddy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _kumpula_eddy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _kumpula_eddy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Kumpula_eddyWrapper)) {
            return false;
        }

        Kumpula_eddyWrapper kumpula_eddyWrapper = (Kumpula_eddyWrapper) obj;

        if (Validator.equals(_kumpula_eddy, kumpula_eddyWrapper._kumpula_eddy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Kumpula_eddy getWrappedKumpula_eddy() {
        return _kumpula_eddy;
    }

    @Override
    public Kumpula_eddy getWrappedModel() {
        return _kumpula_eddy;
    }

    @Override
    public void resetOriginalValues() {
        _kumpula_eddy.resetOriginalValues();
    }
}
