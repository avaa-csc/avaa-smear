package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sii1eddy}.
 * </p>
 *
 * @author pj
 * @see Sii1eddy
 * @generated
 */
public class Sii1eddyWrapper implements Sii1eddy, ModelWrapper<Sii1eddy> {
    private Sii1eddy _sii1eddy;

    public Sii1eddyWrapper(Sii1eddy sii1eddy) {
        _sii1eddy = sii1eddy;
    }

    @Override
    public Class<?> getModelClass() {
        return Sii1eddy.class;
    }

    @Override
    public String getModelClassName() {
        return Sii1eddy.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
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
        attributes.put("H", getH());
        attributes.put("H_EMEP", getH_EMEP());
        attributes.put("tau", getTau());
        attributes.put("tau_EMEP", getTau_EMEP());
        attributes.put("u_star", getU_star());
        attributes.put("u_star_EMEP", getU_star_EMEP());
        attributes.put("MO_length", getMO_length());
        attributes.put("MO_length_EMEP", getMO_length_EMEP());
        attributes.put("err_packet", getErr_packet());
        attributes.put("err_packet_EMEP", getErr_packet_EMEP());
        attributes.put("F_c_LI70", getF_c_LI70());
        attributes.put("F_c_LI70_EMEP", getF_c_LI70_EMEP());
        attributes.put("F_H2O_LI70", getF_H2O_LI70());
        attributes.put("F_H2O_LI70_EMEP", getF_H2O_LI70_EMEP());
        attributes.put("F_CH4_LGR", getF_CH4_LGR());
        attributes.put("F_CH4_LGR_EMEP", getF_CH4_LGR_EMEP());
        attributes.put("F_CH4_TGA", getF_CH4_TGA());
        attributes.put("F_CH4_TGA_EMEP", getF_CH4_TGA_EMEP());
        attributes.put("F_H2O_PIC", getF_H2O_PIC());
        attributes.put("F_H2O_PIC_EMEP", getF_H2O_PIC_EMEP());
        attributes.put("F_CH4_PIC", getF_CH4_PIC());
        attributes.put("F_CH4_PIC_EMEP", getF_CH4_PIC_EMEP());
        attributes.put("LE_LI70", getLE_LI70());
        attributes.put("LE_LI70_EMEP", getLE_LI70_EMEP());
        attributes.put("LE_PIC", getLE_PIC());
        attributes.put("LE_PIC_EMEP", getLE_PIC_EMEP());
        attributes.put("av_u", getAv_u());
        attributes.put("av_u_EMEP", getAv_u_EMEP());
        attributes.put("av_v", getAv_v());
        attributes.put("av_v_EMEP", getAv_v_EMEP());
        attributes.put("av_w", getAv_w());
        attributes.put("av_w_EMEP", getAv_w_EMEP());
        attributes.put("T_s", getT_s());
        attributes.put("T_s_EMEP", getT_s_EMEP());
        attributes.put("av_c", getAv_c());
        attributes.put("av_c_EMEP", getAv_c_EMEP());
        attributes.put("av_H2O_LI70", getAv_H2O_LI70());
        attributes.put("av_H2O_LI70_EMEP", getAv_H2O_LI70_EMEP());
        attributes.put("av_CH4_LGR", getAv_CH4_LGR());
        attributes.put("av_CH4_LGR_EMEP", getAv_CH4_LGR_EMEP());
        attributes.put("av_CH4_TGA", getAv_CH4_TGA());
        attributes.put("av_CH4_TGA_EMEP", getAv_CH4_TGA_EMEP());
        attributes.put("av_H2O_PIC", getAv_H2O_PIC());
        attributes.put("av_H2O_PIC_EMEP", getAv_H2O_PIC_EMEP());
        attributes.put("av_CH4_PIC", getAv_CH4_PIC());
        attributes.put("av_CH4_PIC_EMEP", getAv_CH4_PIC_EMEP());
        attributes.put("std_u", getStd_u());
        attributes.put("std_u_EMEP", getStd_u_EMEP());
        attributes.put("std_v", getStd_v());
        attributes.put("std_v_EMEP", getStd_v_EMEP());
        attributes.put("std_w", getStd_w());
        attributes.put("std_w_EMEP", getStd_w_EMEP());
        attributes.put("std_T_s", getStd_T_s());
        attributes.put("std_T_s_EMEP", getStd_T_s_EMEP());
        attributes.put("std_c_LI70", getStd_c_LI70());
        attributes.put("std_c_LI70_EMEP", getStd_c_LI70_EMEP());
        attributes.put("std_H2O_LI70", getStd_H2O_LI70());
        attributes.put("std_H2O_LI70_EMEP", getStd_H2O_LI70_EMEP());
        attributes.put("std_CH4_LGR", getStd_CH4_LGR());
        attributes.put("std_CH4_LGR_EMEP", getStd_CH4_LGR_EMEP());
        attributes.put("std_CH4_TGA", getStd_CH4_TGA());
        attributes.put("std_CH4_TGA_EMEP", getStd_CH4_TGA_EMEP());
        attributes.put("std_H2O_PIC", getStd_H2O_PIC());
        attributes.put("std_H2O_PIC_EMEP", getStd_H2O_PIC_EMEP());
        attributes.put("std_CH4_PIC", getStd_CH4_PIC());
        attributes.put("std_CH4_PIC_EMEP", getStd_CH4_PIC_EMEP());
        attributes.put("c_lag_LI70", getC_lag_LI70());
        attributes.put("c_lag_LI70_EMEP", getC_lag_LI70_EMEP());
        attributes.put("H2O_lag_LI70", getH2O_lag_LI70());
        attributes.put("H2O_lag_LI70_EMEP", getH2O_lag_LI70_EMEP());
        attributes.put("CH4_lag_LGR", getCH4_lag_LGR());
        attributes.put("CH4_lag_LGR_EMEP", getCH4_lag_LGR_EMEP());
        attributes.put("CH4_lag_TGA", getCH4_lag_TGA());
        attributes.put("CH4_lag_TGA_EMEP", getCH4_lag_TGA_EMEP());
        attributes.put("H2O_lag_PIC", getH2O_lag_PIC());
        attributes.put("H2O_lag_PIC_EMEP", getH2O_lag_PIC_EMEP());
        attributes.put("CH4_lag_PIC", getCH4_lag_PIC());
        attributes.put("CH4_lag_PIC_EMEP", getCH4_lag_PIC_EMEP());
        attributes.put("Qc_H", getQc_H());
        attributes.put("Qc_H_EMEP", getQc_H_EMEP());
        attributes.put("Qc_CO2_LI70", getQc_CO2_LI70());
        attributes.put("Qc_CO2_LI70_EMEP", getQc_CO2_LI70_EMEP());
        attributes.put("Qc_CH4_LGR", getQc_CH4_LGR());
        attributes.put("Qc_CH4_LGR_EMEP", getQc_CH4_LGR_EMEP());
        attributes.put("Qc_CH4_TGA", getQc_CH4_TGA());
        attributes.put("Qc_CH4_TGA_EMEP", getQc_CH4_TGA_EMEP());
        attributes.put("Qc_CH4_PIC", getQc_CH4_PIC());
        attributes.put("Qc_CH4_PIC_EMEP", getQc_CH4_PIC_EMEP());
        attributes.put("Qc_LE_LI70", getQc_LE_LI70());
        attributes.put("Qc_LE_LI70_EMEP", getQc_LE_LI70_EMEP());
        attributes.put("Qc_LE_PIC", getQc_LE_PIC());
        attributes.put("Qc_LE_PIC_EMEP", getQc_LE_PIC_EMEP());
        attributes.put("Qc_tau", getQc_tau());
        attributes.put("Qc_tau_EMEP", getQc_tau_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
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

        Float H = (Float) attributes.get("H");

        if (H != null) {
            setH(H);
        }

        Integer H_EMEP = (Integer) attributes.get("H_EMEP");

        if (H_EMEP != null) {
            setH_EMEP(H_EMEP);
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

        Float err_packet = (Float) attributes.get("err_packet");

        if (err_packet != null) {
            setErr_packet(err_packet);
        }

        Integer err_packet_EMEP = (Integer) attributes.get("err_packet_EMEP");

        if (err_packet_EMEP != null) {
            setErr_packet_EMEP(err_packet_EMEP);
        }

        Float F_c_LI70 = (Float) attributes.get("F_c_LI70");

        if (F_c_LI70 != null) {
            setF_c_LI70(F_c_LI70);
        }

        Integer F_c_LI70_EMEP = (Integer) attributes.get("F_c_LI70_EMEP");

        if (F_c_LI70_EMEP != null) {
            setF_c_LI70_EMEP(F_c_LI70_EMEP);
        }

        Float F_H2O_LI70 = (Float) attributes.get("F_H2O_LI70");

        if (F_H2O_LI70 != null) {
            setF_H2O_LI70(F_H2O_LI70);
        }

        Integer F_H2O_LI70_EMEP = (Integer) attributes.get("F_H2O_LI70_EMEP");

        if (F_H2O_LI70_EMEP != null) {
            setF_H2O_LI70_EMEP(F_H2O_LI70_EMEP);
        }

        Float F_CH4_LGR = (Float) attributes.get("F_CH4_LGR");

        if (F_CH4_LGR != null) {
            setF_CH4_LGR(F_CH4_LGR);
        }

        Integer F_CH4_LGR_EMEP = (Integer) attributes.get("F_CH4_LGR_EMEP");

        if (F_CH4_LGR_EMEP != null) {
            setF_CH4_LGR_EMEP(F_CH4_LGR_EMEP);
        }

        Float F_CH4_TGA = (Float) attributes.get("F_CH4_TGA");

        if (F_CH4_TGA != null) {
            setF_CH4_TGA(F_CH4_TGA);
        }

        Integer F_CH4_TGA_EMEP = (Integer) attributes.get("F_CH4_TGA_EMEP");

        if (F_CH4_TGA_EMEP != null) {
            setF_CH4_TGA_EMEP(F_CH4_TGA_EMEP);
        }

        Float F_H2O_PIC = (Float) attributes.get("F_H2O_PIC");

        if (F_H2O_PIC != null) {
            setF_H2O_PIC(F_H2O_PIC);
        }

        Integer F_H2O_PIC_EMEP = (Integer) attributes.get("F_H2O_PIC_EMEP");

        if (F_H2O_PIC_EMEP != null) {
            setF_H2O_PIC_EMEP(F_H2O_PIC_EMEP);
        }

        Float F_CH4_PIC = (Float) attributes.get("F_CH4_PIC");

        if (F_CH4_PIC != null) {
            setF_CH4_PIC(F_CH4_PIC);
        }

        Integer F_CH4_PIC_EMEP = (Integer) attributes.get("F_CH4_PIC_EMEP");

        if (F_CH4_PIC_EMEP != null) {
            setF_CH4_PIC_EMEP(F_CH4_PIC_EMEP);
        }

        Float LE_LI70 = (Float) attributes.get("LE_LI70");

        if (LE_LI70 != null) {
            setLE_LI70(LE_LI70);
        }

        Integer LE_LI70_EMEP = (Integer) attributes.get("LE_LI70_EMEP");

        if (LE_LI70_EMEP != null) {
            setLE_LI70_EMEP(LE_LI70_EMEP);
        }

        Float LE_PIC = (Float) attributes.get("LE_PIC");

        if (LE_PIC != null) {
            setLE_PIC(LE_PIC);
        }

        Integer LE_PIC_EMEP = (Integer) attributes.get("LE_PIC_EMEP");

        if (LE_PIC_EMEP != null) {
            setLE_PIC_EMEP(LE_PIC_EMEP);
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

        Float T_s = (Float) attributes.get("T_s");

        if (T_s != null) {
            setT_s(T_s);
        }

        Integer T_s_EMEP = (Integer) attributes.get("T_s_EMEP");

        if (T_s_EMEP != null) {
            setT_s_EMEP(T_s_EMEP);
        }

        Float av_c = (Float) attributes.get("av_c");

        if (av_c != null) {
            setAv_c(av_c);
        }

        Integer av_c_EMEP = (Integer) attributes.get("av_c_EMEP");

        if (av_c_EMEP != null) {
            setAv_c_EMEP(av_c_EMEP);
        }

        Float av_H2O_LI70 = (Float) attributes.get("av_H2O_LI70");

        if (av_H2O_LI70 != null) {
            setAv_H2O_LI70(av_H2O_LI70);
        }

        Integer av_H2O_LI70_EMEP = (Integer) attributes.get("av_H2O_LI70_EMEP");

        if (av_H2O_LI70_EMEP != null) {
            setAv_H2O_LI70_EMEP(av_H2O_LI70_EMEP);
        }

        Float av_CH4_LGR = (Float) attributes.get("av_CH4_LGR");

        if (av_CH4_LGR != null) {
            setAv_CH4_LGR(av_CH4_LGR);
        }

        Integer av_CH4_LGR_EMEP = (Integer) attributes.get("av_CH4_LGR_EMEP");

        if (av_CH4_LGR_EMEP != null) {
            setAv_CH4_LGR_EMEP(av_CH4_LGR_EMEP);
        }

        Float av_CH4_TGA = (Float) attributes.get("av_CH4_TGA");

        if (av_CH4_TGA != null) {
            setAv_CH4_TGA(av_CH4_TGA);
        }

        Integer av_CH4_TGA_EMEP = (Integer) attributes.get("av_CH4_TGA_EMEP");

        if (av_CH4_TGA_EMEP != null) {
            setAv_CH4_TGA_EMEP(av_CH4_TGA_EMEP);
        }

        Float av_H2O_PIC = (Float) attributes.get("av_H2O_PIC");

        if (av_H2O_PIC != null) {
            setAv_H2O_PIC(av_H2O_PIC);
        }

        Integer av_H2O_PIC_EMEP = (Integer) attributes.get("av_H2O_PIC_EMEP");

        if (av_H2O_PIC_EMEP != null) {
            setAv_H2O_PIC_EMEP(av_H2O_PIC_EMEP);
        }

        Float av_CH4_PIC = (Float) attributes.get("av_CH4_PIC");

        if (av_CH4_PIC != null) {
            setAv_CH4_PIC(av_CH4_PIC);
        }

        Integer av_CH4_PIC_EMEP = (Integer) attributes.get("av_CH4_PIC_EMEP");

        if (av_CH4_PIC_EMEP != null) {
            setAv_CH4_PIC_EMEP(av_CH4_PIC_EMEP);
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

        Float std_T_s = (Float) attributes.get("std_T_s");

        if (std_T_s != null) {
            setStd_T_s(std_T_s);
        }

        Integer std_T_s_EMEP = (Integer) attributes.get("std_T_s_EMEP");

        if (std_T_s_EMEP != null) {
            setStd_T_s_EMEP(std_T_s_EMEP);
        }

        Float std_c_LI70 = (Float) attributes.get("std_c_LI70");

        if (std_c_LI70 != null) {
            setStd_c_LI70(std_c_LI70);
        }

        Integer std_c_LI70_EMEP = (Integer) attributes.get("std_c_LI70_EMEP");

        if (std_c_LI70_EMEP != null) {
            setStd_c_LI70_EMEP(std_c_LI70_EMEP);
        }

        Float std_H2O_LI70 = (Float) attributes.get("std_H2O_LI70");

        if (std_H2O_LI70 != null) {
            setStd_H2O_LI70(std_H2O_LI70);
        }

        Integer std_H2O_LI70_EMEP = (Integer) attributes.get(
                "std_H2O_LI70_EMEP");

        if (std_H2O_LI70_EMEP != null) {
            setStd_H2O_LI70_EMEP(std_H2O_LI70_EMEP);
        }

        Float std_CH4_LGR = (Float) attributes.get("std_CH4_LGR");

        if (std_CH4_LGR != null) {
            setStd_CH4_LGR(std_CH4_LGR);
        }

        Integer std_CH4_LGR_EMEP = (Integer) attributes.get("std_CH4_LGR_EMEP");

        if (std_CH4_LGR_EMEP != null) {
            setStd_CH4_LGR_EMEP(std_CH4_LGR_EMEP);
        }

        Float std_CH4_TGA = (Float) attributes.get("std_CH4_TGA");

        if (std_CH4_TGA != null) {
            setStd_CH4_TGA(std_CH4_TGA);
        }

        Integer std_CH4_TGA_EMEP = (Integer) attributes.get("std_CH4_TGA_EMEP");

        if (std_CH4_TGA_EMEP != null) {
            setStd_CH4_TGA_EMEP(std_CH4_TGA_EMEP);
        }

        Float std_H2O_PIC = (Float) attributes.get("std_H2O_PIC");

        if (std_H2O_PIC != null) {
            setStd_H2O_PIC(std_H2O_PIC);
        }

        Integer std_H2O_PIC_EMEP = (Integer) attributes.get("std_H2O_PIC_EMEP");

        if (std_H2O_PIC_EMEP != null) {
            setStd_H2O_PIC_EMEP(std_H2O_PIC_EMEP);
        }

        Float std_CH4_PIC = (Float) attributes.get("std_CH4_PIC");

        if (std_CH4_PIC != null) {
            setStd_CH4_PIC(std_CH4_PIC);
        }

        Integer std_CH4_PIC_EMEP = (Integer) attributes.get("std_CH4_PIC_EMEP");

        if (std_CH4_PIC_EMEP != null) {
            setStd_CH4_PIC_EMEP(std_CH4_PIC_EMEP);
        }

        Float c_lag_LI70 = (Float) attributes.get("c_lag_LI70");

        if (c_lag_LI70 != null) {
            setC_lag_LI70(c_lag_LI70);
        }

        Integer c_lag_LI70_EMEP = (Integer) attributes.get("c_lag_LI70_EMEP");

        if (c_lag_LI70_EMEP != null) {
            setC_lag_LI70_EMEP(c_lag_LI70_EMEP);
        }

        Float H2O_lag_LI70 = (Float) attributes.get("H2O_lag_LI70");

        if (H2O_lag_LI70 != null) {
            setH2O_lag_LI70(H2O_lag_LI70);
        }

        Integer H2O_lag_LI70_EMEP = (Integer) attributes.get(
                "H2O_lag_LI70_EMEP");

        if (H2O_lag_LI70_EMEP != null) {
            setH2O_lag_LI70_EMEP(H2O_lag_LI70_EMEP);
        }

        Float CH4_lag_LGR = (Float) attributes.get("CH4_lag_LGR");

        if (CH4_lag_LGR != null) {
            setCH4_lag_LGR(CH4_lag_LGR);
        }

        Integer CH4_lag_LGR_EMEP = (Integer) attributes.get("CH4_lag_LGR_EMEP");

        if (CH4_lag_LGR_EMEP != null) {
            setCH4_lag_LGR_EMEP(CH4_lag_LGR_EMEP);
        }

        Float CH4_lag_TGA = (Float) attributes.get("CH4_lag_TGA");

        if (CH4_lag_TGA != null) {
            setCH4_lag_TGA(CH4_lag_TGA);
        }

        Integer CH4_lag_TGA_EMEP = (Integer) attributes.get("CH4_lag_TGA_EMEP");

        if (CH4_lag_TGA_EMEP != null) {
            setCH4_lag_TGA_EMEP(CH4_lag_TGA_EMEP);
        }

        Float H2O_lag_PIC = (Float) attributes.get("H2O_lag_PIC");

        if (H2O_lag_PIC != null) {
            setH2O_lag_PIC(H2O_lag_PIC);
        }

        Integer H2O_lag_PIC_EMEP = (Integer) attributes.get("H2O_lag_PIC_EMEP");

        if (H2O_lag_PIC_EMEP != null) {
            setH2O_lag_PIC_EMEP(H2O_lag_PIC_EMEP);
        }

        Float CH4_lag_PIC = (Float) attributes.get("CH4_lag_PIC");

        if (CH4_lag_PIC != null) {
            setCH4_lag_PIC(CH4_lag_PIC);
        }

        Integer CH4_lag_PIC_EMEP = (Integer) attributes.get("CH4_lag_PIC_EMEP");

        if (CH4_lag_PIC_EMEP != null) {
            setCH4_lag_PIC_EMEP(CH4_lag_PIC_EMEP);
        }

        Integer Qc_H = (Integer) attributes.get("Qc_H");

        if (Qc_H != null) {
            setQc_H(Qc_H);
        }

        Integer Qc_H_EMEP = (Integer) attributes.get("Qc_H_EMEP");

        if (Qc_H_EMEP != null) {
            setQc_H_EMEP(Qc_H_EMEP);
        }

        Integer Qc_CO2_LI70 = (Integer) attributes.get("Qc_CO2_LI70");

        if (Qc_CO2_LI70 != null) {
            setQc_CO2_LI70(Qc_CO2_LI70);
        }

        Integer Qc_CO2_LI70_EMEP = (Integer) attributes.get("Qc_CO2_LI70_EMEP");

        if (Qc_CO2_LI70_EMEP != null) {
            setQc_CO2_LI70_EMEP(Qc_CO2_LI70_EMEP);
        }

        Integer Qc_CH4_LGR = (Integer) attributes.get("Qc_CH4_LGR");

        if (Qc_CH4_LGR != null) {
            setQc_CH4_LGR(Qc_CH4_LGR);
        }

        Integer Qc_CH4_LGR_EMEP = (Integer) attributes.get("Qc_CH4_LGR_EMEP");

        if (Qc_CH4_LGR_EMEP != null) {
            setQc_CH4_LGR_EMEP(Qc_CH4_LGR_EMEP);
        }

        Integer Qc_CH4_TGA = (Integer) attributes.get("Qc_CH4_TGA");

        if (Qc_CH4_TGA != null) {
            setQc_CH4_TGA(Qc_CH4_TGA);
        }

        Integer Qc_CH4_TGA_EMEP = (Integer) attributes.get("Qc_CH4_TGA_EMEP");

        if (Qc_CH4_TGA_EMEP != null) {
            setQc_CH4_TGA_EMEP(Qc_CH4_TGA_EMEP);
        }

        Integer Qc_CH4_PIC = (Integer) attributes.get("Qc_CH4_PIC");

        if (Qc_CH4_PIC != null) {
            setQc_CH4_PIC(Qc_CH4_PIC);
        }

        Integer Qc_CH4_PIC_EMEP = (Integer) attributes.get("Qc_CH4_PIC_EMEP");

        if (Qc_CH4_PIC_EMEP != null) {
            setQc_CH4_PIC_EMEP(Qc_CH4_PIC_EMEP);
        }

        Integer Qc_LE_LI70 = (Integer) attributes.get("Qc_LE_LI70");

        if (Qc_LE_LI70 != null) {
            setQc_LE_LI70(Qc_LE_LI70);
        }

        Integer Qc_LE_LI70_EMEP = (Integer) attributes.get("Qc_LE_LI70_EMEP");

        if (Qc_LE_LI70_EMEP != null) {
            setQc_LE_LI70_EMEP(Qc_LE_LI70_EMEP);
        }

        Integer Qc_LE_PIC = (Integer) attributes.get("Qc_LE_PIC");

        if (Qc_LE_PIC != null) {
            setQc_LE_PIC(Qc_LE_PIC);
        }

        Integer Qc_LE_PIC_EMEP = (Integer) attributes.get("Qc_LE_PIC_EMEP");

        if (Qc_LE_PIC_EMEP != null) {
            setQc_LE_PIC_EMEP(Qc_LE_PIC_EMEP);
        }

        Integer Qc_tau = (Integer) attributes.get("Qc_tau");

        if (Qc_tau != null) {
            setQc_tau(Qc_tau);
        }

        Integer Qc_tau_EMEP = (Integer) attributes.get("Qc_tau_EMEP");

        if (Qc_tau_EMEP != null) {
            setQc_tau_EMEP(Qc_tau_EMEP);
        }
    }

    /**
    * Returns the primary key of this sii1eddy.
    *
    * @return the primary key of this sii1eddy
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _sii1eddy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this sii1eddy.
    *
    * @param primaryKey the primary key of this sii1eddy
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _sii1eddy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this sii1eddy.
    *
    * @return the samptime of this sii1eddy
    */
    @Override
    public java.util.Date getSamptime() {
        return _sii1eddy.getSamptime();
    }

    /**
    * Sets the samptime of this sii1eddy.
    *
    * @param samptime the samptime of this sii1eddy
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _sii1eddy.setSamptime(samptime);
    }

    /**
    * Returns the u of this sii1eddy.
    *
    * @return the u of this sii1eddy
    */
    @Override
    public float getU() {
        return _sii1eddy.getU();
    }

    /**
    * Sets the u of this sii1eddy.
    *
    * @param U the u of this sii1eddy
    */
    @Override
    public void setU(float U) {
        _sii1eddy.setU(U);
    }

    /**
    * Returns the u_ e m e p of this sii1eddy.
    *
    * @return the u_ e m e p of this sii1eddy
    */
    @Override
    public int getU_EMEP() {
        return _sii1eddy.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this sii1eddy.
    *
    * @param U_EMEP the u_ e m e p of this sii1eddy
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _sii1eddy.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir of this sii1eddy.
    *
    * @return the wind_dir of this sii1eddy
    */
    @Override
    public float getWind_dir() {
        return _sii1eddy.getWind_dir();
    }

    /**
    * Sets the wind_dir of this sii1eddy.
    *
    * @param wind_dir the wind_dir of this sii1eddy
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _sii1eddy.setWind_dir(wind_dir);
    }

    /**
    * Returns the wind_dir_ e m e p of this sii1eddy.
    *
    * @return the wind_dir_ e m e p of this sii1eddy
    */
    @Override
    public int getWind_dir_EMEP() {
        return _sii1eddy.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this sii1eddy.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this sii1eddy
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _sii1eddy.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the eta of this sii1eddy.
    *
    * @return the eta of this sii1eddy
    */
    @Override
    public float getEta() {
        return _sii1eddy.getEta();
    }

    /**
    * Sets the eta of this sii1eddy.
    *
    * @param eta the eta of this sii1eddy
    */
    @Override
    public void setEta(float eta) {
        _sii1eddy.setEta(eta);
    }

    /**
    * Returns the eta_ e m e p of this sii1eddy.
    *
    * @return the eta_ e m e p of this sii1eddy
    */
    @Override
    public int getEta_EMEP() {
        return _sii1eddy.getEta_EMEP();
    }

    /**
    * Sets the eta_ e m e p of this sii1eddy.
    *
    * @param eta_EMEP the eta_ e m e p of this sii1eddy
    */
    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _sii1eddy.setEta_EMEP(eta_EMEP);
    }

    /**
    * Returns the theta of this sii1eddy.
    *
    * @return the theta of this sii1eddy
    */
    @Override
    public float getTheta() {
        return _sii1eddy.getTheta();
    }

    /**
    * Sets the theta of this sii1eddy.
    *
    * @param theta the theta of this sii1eddy
    */
    @Override
    public void setTheta(float theta) {
        _sii1eddy.setTheta(theta);
    }

    /**
    * Returns the theta_ e m e p of this sii1eddy.
    *
    * @return the theta_ e m e p of this sii1eddy
    */
    @Override
    public int getTheta_EMEP() {
        return _sii1eddy.getTheta_EMEP();
    }

    /**
    * Sets the theta_ e m e p of this sii1eddy.
    *
    * @param theta_EMEP the theta_ e m e p of this sii1eddy
    */
    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _sii1eddy.setTheta_EMEP(theta_EMEP);
    }

    /**
    * Returns the beta of this sii1eddy.
    *
    * @return the beta of this sii1eddy
    */
    @Override
    public float getBeta() {
        return _sii1eddy.getBeta();
    }

    /**
    * Sets the beta of this sii1eddy.
    *
    * @param beta the beta of this sii1eddy
    */
    @Override
    public void setBeta(float beta) {
        _sii1eddy.setBeta(beta);
    }

    /**
    * Returns the beta_ e m e p of this sii1eddy.
    *
    * @return the beta_ e m e p of this sii1eddy
    */
    @Override
    public int getBeta_EMEP() {
        return _sii1eddy.getBeta_EMEP();
    }

    /**
    * Sets the beta_ e m e p of this sii1eddy.
    *
    * @param beta_EMEP the beta_ e m e p of this sii1eddy
    */
    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _sii1eddy.setBeta_EMEP(beta_EMEP);
    }

    /**
    * Returns the h of this sii1eddy.
    *
    * @return the h of this sii1eddy
    */
    @Override
    public float getH() {
        return _sii1eddy.getH();
    }

    /**
    * Sets the h of this sii1eddy.
    *
    * @param H the h of this sii1eddy
    */
    @Override
    public void setH(float H) {
        _sii1eddy.setH(H);
    }

    /**
    * Returns the h_ e m e p of this sii1eddy.
    *
    * @return the h_ e m e p of this sii1eddy
    */
    @Override
    public int getH_EMEP() {
        return _sii1eddy.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this sii1eddy.
    *
    * @param H_EMEP the h_ e m e p of this sii1eddy
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _sii1eddy.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the tau of this sii1eddy.
    *
    * @return the tau of this sii1eddy
    */
    @Override
    public float getTau() {
        return _sii1eddy.getTau();
    }

    /**
    * Sets the tau of this sii1eddy.
    *
    * @param tau the tau of this sii1eddy
    */
    @Override
    public void setTau(float tau) {
        _sii1eddy.setTau(tau);
    }

    /**
    * Returns the tau_ e m e p of this sii1eddy.
    *
    * @return the tau_ e m e p of this sii1eddy
    */
    @Override
    public int getTau_EMEP() {
        return _sii1eddy.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this sii1eddy.
    *
    * @param tau_EMEP the tau_ e m e p of this sii1eddy
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _sii1eddy.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the u_star of this sii1eddy.
    *
    * @return the u_star of this sii1eddy
    */
    @Override
    public float getU_star() {
        return _sii1eddy.getU_star();
    }

    /**
    * Sets the u_star of this sii1eddy.
    *
    * @param u_star the u_star of this sii1eddy
    */
    @Override
    public void setU_star(float u_star) {
        _sii1eddy.setU_star(u_star);
    }

    /**
    * Returns the u_star_ e m e p of this sii1eddy.
    *
    * @return the u_star_ e m e p of this sii1eddy
    */
    @Override
    public int getU_star_EMEP() {
        return _sii1eddy.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this sii1eddy.
    *
    * @param u_star_EMEP the u_star_ e m e p of this sii1eddy
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _sii1eddy.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length of this sii1eddy.
    *
    * @return the m o_length of this sii1eddy
    */
    @Override
    public float getMO_length() {
        return _sii1eddy.getMO_length();
    }

    /**
    * Sets the m o_length of this sii1eddy.
    *
    * @param MO_length the m o_length of this sii1eddy
    */
    @Override
    public void setMO_length(float MO_length) {
        _sii1eddy.setMO_length(MO_length);
    }

    /**
    * Returns the m o_length_ e m e p of this sii1eddy.
    *
    * @return the m o_length_ e m e p of this sii1eddy
    */
    @Override
    public int getMO_length_EMEP() {
        return _sii1eddy.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this sii1eddy.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this sii1eddy
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _sii1eddy.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the err_packet of this sii1eddy.
    *
    * @return the err_packet of this sii1eddy
    */
    @Override
    public float getErr_packet() {
        return _sii1eddy.getErr_packet();
    }

    /**
    * Sets the err_packet of this sii1eddy.
    *
    * @param err_packet the err_packet of this sii1eddy
    */
    @Override
    public void setErr_packet(float err_packet) {
        _sii1eddy.setErr_packet(err_packet);
    }

    /**
    * Returns the err_packet_ e m e p of this sii1eddy.
    *
    * @return the err_packet_ e m e p of this sii1eddy
    */
    @Override
    public int getErr_packet_EMEP() {
        return _sii1eddy.getErr_packet_EMEP();
    }

    /**
    * Sets the err_packet_ e m e p of this sii1eddy.
    *
    * @param err_packet_EMEP the err_packet_ e m e p of this sii1eddy
    */
    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _sii1eddy.setErr_packet_EMEP(err_packet_EMEP);
    }

    /**
    * Returns the f_c_ l i70 of this sii1eddy.
    *
    * @return the f_c_ l i70 of this sii1eddy
    */
    @Override
    public float getF_c_LI70() {
        return _sii1eddy.getF_c_LI70();
    }

    /**
    * Sets the f_c_ l i70 of this sii1eddy.
    *
    * @param F_c_LI70 the f_c_ l i70 of this sii1eddy
    */
    @Override
    public void setF_c_LI70(float F_c_LI70) {
        _sii1eddy.setF_c_LI70(F_c_LI70);
    }

    /**
    * Returns the f_c_ l i70_ e m e p of this sii1eddy.
    *
    * @return the f_c_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getF_c_LI70_EMEP() {
        return _sii1eddy.getF_c_LI70_EMEP();
    }

    /**
    * Sets the f_c_ l i70_ e m e p of this sii1eddy.
    *
    * @param F_c_LI70_EMEP the f_c_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setF_c_LI70_EMEP(int F_c_LI70_EMEP) {
        _sii1eddy.setF_c_LI70_EMEP(F_c_LI70_EMEP);
    }

    /**
    * Returns the f_ h2 o_ l i70 of this sii1eddy.
    *
    * @return the f_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public float getF_H2O_LI70() {
        return _sii1eddy.getF_H2O_LI70();
    }

    /**
    * Sets the f_ h2 o_ l i70 of this sii1eddy.
    *
    * @param F_H2O_LI70 the f_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public void setF_H2O_LI70(float F_H2O_LI70) {
        _sii1eddy.setF_H2O_LI70(F_H2O_LI70);
    }

    /**
    * Returns the f_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @return the f_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getF_H2O_LI70_EMEP() {
        return _sii1eddy.getF_H2O_LI70_EMEP();
    }

    /**
    * Sets the f_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @param F_H2O_LI70_EMEP the f_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setF_H2O_LI70_EMEP(int F_H2O_LI70_EMEP) {
        _sii1eddy.setF_H2O_LI70_EMEP(F_H2O_LI70_EMEP);
    }

    /**
    * Returns the f_ c h4_ l g r of this sii1eddy.
    *
    * @return the f_ c h4_ l g r of this sii1eddy
    */
    @Override
    public float getF_CH4_LGR() {
        return _sii1eddy.getF_CH4_LGR();
    }

    /**
    * Sets the f_ c h4_ l g r of this sii1eddy.
    *
    * @param F_CH4_LGR the f_ c h4_ l g r of this sii1eddy
    */
    @Override
    public void setF_CH4_LGR(float F_CH4_LGR) {
        _sii1eddy.setF_CH4_LGR(F_CH4_LGR);
    }

    /**
    * Returns the f_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @return the f_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public int getF_CH4_LGR_EMEP() {
        return _sii1eddy.getF_CH4_LGR_EMEP();
    }

    /**
    * Sets the f_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @param F_CH4_LGR_EMEP the f_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public void setF_CH4_LGR_EMEP(int F_CH4_LGR_EMEP) {
        _sii1eddy.setF_CH4_LGR_EMEP(F_CH4_LGR_EMEP);
    }

    /**
    * Returns the f_ c h4_ t g a of this sii1eddy.
    *
    * @return the f_ c h4_ t g a of this sii1eddy
    */
    @Override
    public float getF_CH4_TGA() {
        return _sii1eddy.getF_CH4_TGA();
    }

    /**
    * Sets the f_ c h4_ t g a of this sii1eddy.
    *
    * @param F_CH4_TGA the f_ c h4_ t g a of this sii1eddy
    */
    @Override
    public void setF_CH4_TGA(float F_CH4_TGA) {
        _sii1eddy.setF_CH4_TGA(F_CH4_TGA);
    }

    /**
    * Returns the f_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @return the f_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public int getF_CH4_TGA_EMEP() {
        return _sii1eddy.getF_CH4_TGA_EMEP();
    }

    /**
    * Sets the f_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @param F_CH4_TGA_EMEP the f_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public void setF_CH4_TGA_EMEP(int F_CH4_TGA_EMEP) {
        _sii1eddy.setF_CH4_TGA_EMEP(F_CH4_TGA_EMEP);
    }

    /**
    * Returns the f_ h2 o_ p i c of this sii1eddy.
    *
    * @return the f_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public float getF_H2O_PIC() {
        return _sii1eddy.getF_H2O_PIC();
    }

    /**
    * Sets the f_ h2 o_ p i c of this sii1eddy.
    *
    * @param F_H2O_PIC the f_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public void setF_H2O_PIC(float F_H2O_PIC) {
        _sii1eddy.setF_H2O_PIC(F_H2O_PIC);
    }

    /**
    * Returns the f_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @return the f_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getF_H2O_PIC_EMEP() {
        return _sii1eddy.getF_H2O_PIC_EMEP();
    }

    /**
    * Sets the f_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @param F_H2O_PIC_EMEP the f_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setF_H2O_PIC_EMEP(int F_H2O_PIC_EMEP) {
        _sii1eddy.setF_H2O_PIC_EMEP(F_H2O_PIC_EMEP);
    }

    /**
    * Returns the f_ c h4_ p i c of this sii1eddy.
    *
    * @return the f_ c h4_ p i c of this sii1eddy
    */
    @Override
    public float getF_CH4_PIC() {
        return _sii1eddy.getF_CH4_PIC();
    }

    /**
    * Sets the f_ c h4_ p i c of this sii1eddy.
    *
    * @param F_CH4_PIC the f_ c h4_ p i c of this sii1eddy
    */
    @Override
    public void setF_CH4_PIC(float F_CH4_PIC) {
        _sii1eddy.setF_CH4_PIC(F_CH4_PIC);
    }

    /**
    * Returns the f_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @return the f_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getF_CH4_PIC_EMEP() {
        return _sii1eddy.getF_CH4_PIC_EMEP();
    }

    /**
    * Sets the f_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @param F_CH4_PIC_EMEP the f_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setF_CH4_PIC_EMEP(int F_CH4_PIC_EMEP) {
        _sii1eddy.setF_CH4_PIC_EMEP(F_CH4_PIC_EMEP);
    }

    /**
    * Returns the l e_ l i70 of this sii1eddy.
    *
    * @return the l e_ l i70 of this sii1eddy
    */
    @Override
    public float getLE_LI70() {
        return _sii1eddy.getLE_LI70();
    }

    /**
    * Sets the l e_ l i70 of this sii1eddy.
    *
    * @param LE_LI70 the l e_ l i70 of this sii1eddy
    */
    @Override
    public void setLE_LI70(float LE_LI70) {
        _sii1eddy.setLE_LI70(LE_LI70);
    }

    /**
    * Returns the l e_ l i70_ e m e p of this sii1eddy.
    *
    * @return the l e_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getLE_LI70_EMEP() {
        return _sii1eddy.getLE_LI70_EMEP();
    }

    /**
    * Sets the l e_ l i70_ e m e p of this sii1eddy.
    *
    * @param LE_LI70_EMEP the l e_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setLE_LI70_EMEP(int LE_LI70_EMEP) {
        _sii1eddy.setLE_LI70_EMEP(LE_LI70_EMEP);
    }

    /**
    * Returns the l e_ p i c of this sii1eddy.
    *
    * @return the l e_ p i c of this sii1eddy
    */
    @Override
    public float getLE_PIC() {
        return _sii1eddy.getLE_PIC();
    }

    /**
    * Sets the l e_ p i c of this sii1eddy.
    *
    * @param LE_PIC the l e_ p i c of this sii1eddy
    */
    @Override
    public void setLE_PIC(float LE_PIC) {
        _sii1eddy.setLE_PIC(LE_PIC);
    }

    /**
    * Returns the l e_ p i c_ e m e p of this sii1eddy.
    *
    * @return the l e_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getLE_PIC_EMEP() {
        return _sii1eddy.getLE_PIC_EMEP();
    }

    /**
    * Sets the l e_ p i c_ e m e p of this sii1eddy.
    *
    * @param LE_PIC_EMEP the l e_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setLE_PIC_EMEP(int LE_PIC_EMEP) {
        _sii1eddy.setLE_PIC_EMEP(LE_PIC_EMEP);
    }

    /**
    * Returns the av_u of this sii1eddy.
    *
    * @return the av_u of this sii1eddy
    */
    @Override
    public float getAv_u() {
        return _sii1eddy.getAv_u();
    }

    /**
    * Sets the av_u of this sii1eddy.
    *
    * @param av_u the av_u of this sii1eddy
    */
    @Override
    public void setAv_u(float av_u) {
        _sii1eddy.setAv_u(av_u);
    }

    /**
    * Returns the av_u_ e m e p of this sii1eddy.
    *
    * @return the av_u_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_u_EMEP() {
        return _sii1eddy.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this sii1eddy.
    *
    * @param av_u_EMEP the av_u_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _sii1eddy.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v of this sii1eddy.
    *
    * @return the av_v of this sii1eddy
    */
    @Override
    public float getAv_v() {
        return _sii1eddy.getAv_v();
    }

    /**
    * Sets the av_v of this sii1eddy.
    *
    * @param av_v the av_v of this sii1eddy
    */
    @Override
    public void setAv_v(float av_v) {
        _sii1eddy.setAv_v(av_v);
    }

    /**
    * Returns the av_v_ e m e p of this sii1eddy.
    *
    * @return the av_v_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_v_EMEP() {
        return _sii1eddy.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this sii1eddy.
    *
    * @param av_v_EMEP the av_v_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _sii1eddy.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w of this sii1eddy.
    *
    * @return the av_w of this sii1eddy
    */
    @Override
    public float getAv_w() {
        return _sii1eddy.getAv_w();
    }

    /**
    * Sets the av_w of this sii1eddy.
    *
    * @param av_w the av_w of this sii1eddy
    */
    @Override
    public void setAv_w(float av_w) {
        _sii1eddy.setAv_w(av_w);
    }

    /**
    * Returns the av_w_ e m e p of this sii1eddy.
    *
    * @return the av_w_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_w_EMEP() {
        return _sii1eddy.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this sii1eddy.
    *
    * @param av_w_EMEP the av_w_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _sii1eddy.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the t_s of this sii1eddy.
    *
    * @return the t_s of this sii1eddy
    */
    @Override
    public float getT_s() {
        return _sii1eddy.getT_s();
    }

    /**
    * Sets the t_s of this sii1eddy.
    *
    * @param T_s the t_s of this sii1eddy
    */
    @Override
    public void setT_s(float T_s) {
        _sii1eddy.setT_s(T_s);
    }

    /**
    * Returns the t_s_ e m e p of this sii1eddy.
    *
    * @return the t_s_ e m e p of this sii1eddy
    */
    @Override
    public int getT_s_EMEP() {
        return _sii1eddy.getT_s_EMEP();
    }

    /**
    * Sets the t_s_ e m e p of this sii1eddy.
    *
    * @param T_s_EMEP the t_s_ e m e p of this sii1eddy
    */
    @Override
    public void setT_s_EMEP(int T_s_EMEP) {
        _sii1eddy.setT_s_EMEP(T_s_EMEP);
    }

    /**
    * Returns the av_c of this sii1eddy.
    *
    * @return the av_c of this sii1eddy
    */
    @Override
    public float getAv_c() {
        return _sii1eddy.getAv_c();
    }

    /**
    * Sets the av_c of this sii1eddy.
    *
    * @param av_c the av_c of this sii1eddy
    */
    @Override
    public void setAv_c(float av_c) {
        _sii1eddy.setAv_c(av_c);
    }

    /**
    * Returns the av_c_ e m e p of this sii1eddy.
    *
    * @return the av_c_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_c_EMEP() {
        return _sii1eddy.getAv_c_EMEP();
    }

    /**
    * Sets the av_c_ e m e p of this sii1eddy.
    *
    * @param av_c_EMEP the av_c_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _sii1eddy.setAv_c_EMEP(av_c_EMEP);
    }

    /**
    * Returns the av_ h2 o_ l i70 of this sii1eddy.
    *
    * @return the av_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public float getAv_H2O_LI70() {
        return _sii1eddy.getAv_H2O_LI70();
    }

    /**
    * Sets the av_ h2 o_ l i70 of this sii1eddy.
    *
    * @param av_H2O_LI70 the av_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public void setAv_H2O_LI70(float av_H2O_LI70) {
        _sii1eddy.setAv_H2O_LI70(av_H2O_LI70);
    }

    /**
    * Returns the av_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @return the av_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_H2O_LI70_EMEP() {
        return _sii1eddy.getAv_H2O_LI70_EMEP();
    }

    /**
    * Sets the av_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @param av_H2O_LI70_EMEP the av_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_H2O_LI70_EMEP(int av_H2O_LI70_EMEP) {
        _sii1eddy.setAv_H2O_LI70_EMEP(av_H2O_LI70_EMEP);
    }

    /**
    * Returns the av_ c h4_ l g r of this sii1eddy.
    *
    * @return the av_ c h4_ l g r of this sii1eddy
    */
    @Override
    public float getAv_CH4_LGR() {
        return _sii1eddy.getAv_CH4_LGR();
    }

    /**
    * Sets the av_ c h4_ l g r of this sii1eddy.
    *
    * @param av_CH4_LGR the av_ c h4_ l g r of this sii1eddy
    */
    @Override
    public void setAv_CH4_LGR(float av_CH4_LGR) {
        _sii1eddy.setAv_CH4_LGR(av_CH4_LGR);
    }

    /**
    * Returns the av_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @return the av_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_CH4_LGR_EMEP() {
        return _sii1eddy.getAv_CH4_LGR_EMEP();
    }

    /**
    * Sets the av_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @param av_CH4_LGR_EMEP the av_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_CH4_LGR_EMEP(int av_CH4_LGR_EMEP) {
        _sii1eddy.setAv_CH4_LGR_EMEP(av_CH4_LGR_EMEP);
    }

    /**
    * Returns the av_ c h4_ t g a of this sii1eddy.
    *
    * @return the av_ c h4_ t g a of this sii1eddy
    */
    @Override
    public float getAv_CH4_TGA() {
        return _sii1eddy.getAv_CH4_TGA();
    }

    /**
    * Sets the av_ c h4_ t g a of this sii1eddy.
    *
    * @param av_CH4_TGA the av_ c h4_ t g a of this sii1eddy
    */
    @Override
    public void setAv_CH4_TGA(float av_CH4_TGA) {
        _sii1eddy.setAv_CH4_TGA(av_CH4_TGA);
    }

    /**
    * Returns the av_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @return the av_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_CH4_TGA_EMEP() {
        return _sii1eddy.getAv_CH4_TGA_EMEP();
    }

    /**
    * Sets the av_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @param av_CH4_TGA_EMEP the av_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_CH4_TGA_EMEP(int av_CH4_TGA_EMEP) {
        _sii1eddy.setAv_CH4_TGA_EMEP(av_CH4_TGA_EMEP);
    }

    /**
    * Returns the av_ h2 o_ p i c of this sii1eddy.
    *
    * @return the av_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public float getAv_H2O_PIC() {
        return _sii1eddy.getAv_H2O_PIC();
    }

    /**
    * Sets the av_ h2 o_ p i c of this sii1eddy.
    *
    * @param av_H2O_PIC the av_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public void setAv_H2O_PIC(float av_H2O_PIC) {
        _sii1eddy.setAv_H2O_PIC(av_H2O_PIC);
    }

    /**
    * Returns the av_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @return the av_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_H2O_PIC_EMEP() {
        return _sii1eddy.getAv_H2O_PIC_EMEP();
    }

    /**
    * Sets the av_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @param av_H2O_PIC_EMEP the av_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_H2O_PIC_EMEP(int av_H2O_PIC_EMEP) {
        _sii1eddy.setAv_H2O_PIC_EMEP(av_H2O_PIC_EMEP);
    }

    /**
    * Returns the av_ c h4_ p i c of this sii1eddy.
    *
    * @return the av_ c h4_ p i c of this sii1eddy
    */
    @Override
    public float getAv_CH4_PIC() {
        return _sii1eddy.getAv_CH4_PIC();
    }

    /**
    * Sets the av_ c h4_ p i c of this sii1eddy.
    *
    * @param av_CH4_PIC the av_ c h4_ p i c of this sii1eddy
    */
    @Override
    public void setAv_CH4_PIC(float av_CH4_PIC) {
        _sii1eddy.setAv_CH4_PIC(av_CH4_PIC);
    }

    /**
    * Returns the av_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @return the av_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getAv_CH4_PIC_EMEP() {
        return _sii1eddy.getAv_CH4_PIC_EMEP();
    }

    /**
    * Sets the av_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @param av_CH4_PIC_EMEP the av_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setAv_CH4_PIC_EMEP(int av_CH4_PIC_EMEP) {
        _sii1eddy.setAv_CH4_PIC_EMEP(av_CH4_PIC_EMEP);
    }

    /**
    * Returns the std_u of this sii1eddy.
    *
    * @return the std_u of this sii1eddy
    */
    @Override
    public float getStd_u() {
        return _sii1eddy.getStd_u();
    }

    /**
    * Sets the std_u of this sii1eddy.
    *
    * @param std_u the std_u of this sii1eddy
    */
    @Override
    public void setStd_u(float std_u) {
        _sii1eddy.setStd_u(std_u);
    }

    /**
    * Returns the std_u_ e m e p of this sii1eddy.
    *
    * @return the std_u_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_u_EMEP() {
        return _sii1eddy.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this sii1eddy.
    *
    * @param std_u_EMEP the std_u_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _sii1eddy.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v of this sii1eddy.
    *
    * @return the std_v of this sii1eddy
    */
    @Override
    public float getStd_v() {
        return _sii1eddy.getStd_v();
    }

    /**
    * Sets the std_v of this sii1eddy.
    *
    * @param std_v the std_v of this sii1eddy
    */
    @Override
    public void setStd_v(float std_v) {
        _sii1eddy.setStd_v(std_v);
    }

    /**
    * Returns the std_v_ e m e p of this sii1eddy.
    *
    * @return the std_v_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_v_EMEP() {
        return _sii1eddy.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this sii1eddy.
    *
    * @param std_v_EMEP the std_v_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _sii1eddy.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w of this sii1eddy.
    *
    * @return the std_w of this sii1eddy
    */
    @Override
    public float getStd_w() {
        return _sii1eddy.getStd_w();
    }

    /**
    * Sets the std_w of this sii1eddy.
    *
    * @param std_w the std_w of this sii1eddy
    */
    @Override
    public void setStd_w(float std_w) {
        _sii1eddy.setStd_w(std_w);
    }

    /**
    * Returns the std_w_ e m e p of this sii1eddy.
    *
    * @return the std_w_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_w_EMEP() {
        return _sii1eddy.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this sii1eddy.
    *
    * @param std_w_EMEP the std_w_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _sii1eddy.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the std_ t_s of this sii1eddy.
    *
    * @return the std_ t_s of this sii1eddy
    */
    @Override
    public float getStd_T_s() {
        return _sii1eddy.getStd_T_s();
    }

    /**
    * Sets the std_ t_s of this sii1eddy.
    *
    * @param std_T_s the std_ t_s of this sii1eddy
    */
    @Override
    public void setStd_T_s(float std_T_s) {
        _sii1eddy.setStd_T_s(std_T_s);
    }

    /**
    * Returns the std_ t_s_ e m e p of this sii1eddy.
    *
    * @return the std_ t_s_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_T_s_EMEP() {
        return _sii1eddy.getStd_T_s_EMEP();
    }

    /**
    * Sets the std_ t_s_ e m e p of this sii1eddy.
    *
    * @param std_T_s_EMEP the std_ t_s_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_T_s_EMEP(int std_T_s_EMEP) {
        _sii1eddy.setStd_T_s_EMEP(std_T_s_EMEP);
    }

    /**
    * Returns the std_c_ l i70 of this sii1eddy.
    *
    * @return the std_c_ l i70 of this sii1eddy
    */
    @Override
    public float getStd_c_LI70() {
        return _sii1eddy.getStd_c_LI70();
    }

    /**
    * Sets the std_c_ l i70 of this sii1eddy.
    *
    * @param std_c_LI70 the std_c_ l i70 of this sii1eddy
    */
    @Override
    public void setStd_c_LI70(float std_c_LI70) {
        _sii1eddy.setStd_c_LI70(std_c_LI70);
    }

    /**
    * Returns the std_c_ l i70_ e m e p of this sii1eddy.
    *
    * @return the std_c_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_c_LI70_EMEP() {
        return _sii1eddy.getStd_c_LI70_EMEP();
    }

    /**
    * Sets the std_c_ l i70_ e m e p of this sii1eddy.
    *
    * @param std_c_LI70_EMEP the std_c_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_c_LI70_EMEP(int std_c_LI70_EMEP) {
        _sii1eddy.setStd_c_LI70_EMEP(std_c_LI70_EMEP);
    }

    /**
    * Returns the std_ h2 o_ l i70 of this sii1eddy.
    *
    * @return the std_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public float getStd_H2O_LI70() {
        return _sii1eddy.getStd_H2O_LI70();
    }

    /**
    * Sets the std_ h2 o_ l i70 of this sii1eddy.
    *
    * @param std_H2O_LI70 the std_ h2 o_ l i70 of this sii1eddy
    */
    @Override
    public void setStd_H2O_LI70(float std_H2O_LI70) {
        _sii1eddy.setStd_H2O_LI70(std_H2O_LI70);
    }

    /**
    * Returns the std_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @return the std_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_H2O_LI70_EMEP() {
        return _sii1eddy.getStd_H2O_LI70_EMEP();
    }

    /**
    * Sets the std_ h2 o_ l i70_ e m e p of this sii1eddy.
    *
    * @param std_H2O_LI70_EMEP the std_ h2 o_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_H2O_LI70_EMEP(int std_H2O_LI70_EMEP) {
        _sii1eddy.setStd_H2O_LI70_EMEP(std_H2O_LI70_EMEP);
    }

    /**
    * Returns the std_ c h4_ l g r of this sii1eddy.
    *
    * @return the std_ c h4_ l g r of this sii1eddy
    */
    @Override
    public float getStd_CH4_LGR() {
        return _sii1eddy.getStd_CH4_LGR();
    }

    /**
    * Sets the std_ c h4_ l g r of this sii1eddy.
    *
    * @param std_CH4_LGR the std_ c h4_ l g r of this sii1eddy
    */
    @Override
    public void setStd_CH4_LGR(float std_CH4_LGR) {
        _sii1eddy.setStd_CH4_LGR(std_CH4_LGR);
    }

    /**
    * Returns the std_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @return the std_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_CH4_LGR_EMEP() {
        return _sii1eddy.getStd_CH4_LGR_EMEP();
    }

    /**
    * Sets the std_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @param std_CH4_LGR_EMEP the std_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_CH4_LGR_EMEP(int std_CH4_LGR_EMEP) {
        _sii1eddy.setStd_CH4_LGR_EMEP(std_CH4_LGR_EMEP);
    }

    /**
    * Returns the std_ c h4_ t g a of this sii1eddy.
    *
    * @return the std_ c h4_ t g a of this sii1eddy
    */
    @Override
    public float getStd_CH4_TGA() {
        return _sii1eddy.getStd_CH4_TGA();
    }

    /**
    * Sets the std_ c h4_ t g a of this sii1eddy.
    *
    * @param std_CH4_TGA the std_ c h4_ t g a of this sii1eddy
    */
    @Override
    public void setStd_CH4_TGA(float std_CH4_TGA) {
        _sii1eddy.setStd_CH4_TGA(std_CH4_TGA);
    }

    /**
    * Returns the std_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @return the std_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_CH4_TGA_EMEP() {
        return _sii1eddy.getStd_CH4_TGA_EMEP();
    }

    /**
    * Sets the std_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @param std_CH4_TGA_EMEP the std_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_CH4_TGA_EMEP(int std_CH4_TGA_EMEP) {
        _sii1eddy.setStd_CH4_TGA_EMEP(std_CH4_TGA_EMEP);
    }

    /**
    * Returns the std_ h2 o_ p i c of this sii1eddy.
    *
    * @return the std_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public float getStd_H2O_PIC() {
        return _sii1eddy.getStd_H2O_PIC();
    }

    /**
    * Sets the std_ h2 o_ p i c of this sii1eddy.
    *
    * @param std_H2O_PIC the std_ h2 o_ p i c of this sii1eddy
    */
    @Override
    public void setStd_H2O_PIC(float std_H2O_PIC) {
        _sii1eddy.setStd_H2O_PIC(std_H2O_PIC);
    }

    /**
    * Returns the std_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @return the std_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_H2O_PIC_EMEP() {
        return _sii1eddy.getStd_H2O_PIC_EMEP();
    }

    /**
    * Sets the std_ h2 o_ p i c_ e m e p of this sii1eddy.
    *
    * @param std_H2O_PIC_EMEP the std_ h2 o_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_H2O_PIC_EMEP(int std_H2O_PIC_EMEP) {
        _sii1eddy.setStd_H2O_PIC_EMEP(std_H2O_PIC_EMEP);
    }

    /**
    * Returns the std_ c h4_ p i c of this sii1eddy.
    *
    * @return the std_ c h4_ p i c of this sii1eddy
    */
    @Override
    public float getStd_CH4_PIC() {
        return _sii1eddy.getStd_CH4_PIC();
    }

    /**
    * Sets the std_ c h4_ p i c of this sii1eddy.
    *
    * @param std_CH4_PIC the std_ c h4_ p i c of this sii1eddy
    */
    @Override
    public void setStd_CH4_PIC(float std_CH4_PIC) {
        _sii1eddy.setStd_CH4_PIC(std_CH4_PIC);
    }

    /**
    * Returns the std_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @return the std_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getStd_CH4_PIC_EMEP() {
        return _sii1eddy.getStd_CH4_PIC_EMEP();
    }

    /**
    * Sets the std_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @param std_CH4_PIC_EMEP the std_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setStd_CH4_PIC_EMEP(int std_CH4_PIC_EMEP) {
        _sii1eddy.setStd_CH4_PIC_EMEP(std_CH4_PIC_EMEP);
    }

    /**
    * Returns the c_lag_ l i70 of this sii1eddy.
    *
    * @return the c_lag_ l i70 of this sii1eddy
    */
    @Override
    public float getC_lag_LI70() {
        return _sii1eddy.getC_lag_LI70();
    }

    /**
    * Sets the c_lag_ l i70 of this sii1eddy.
    *
    * @param c_lag_LI70 the c_lag_ l i70 of this sii1eddy
    */
    @Override
    public void setC_lag_LI70(float c_lag_LI70) {
        _sii1eddy.setC_lag_LI70(c_lag_LI70);
    }

    /**
    * Returns the c_lag_ l i70_ e m e p of this sii1eddy.
    *
    * @return the c_lag_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getC_lag_LI70_EMEP() {
        return _sii1eddy.getC_lag_LI70_EMEP();
    }

    /**
    * Sets the c_lag_ l i70_ e m e p of this sii1eddy.
    *
    * @param c_lag_LI70_EMEP the c_lag_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setC_lag_LI70_EMEP(int c_lag_LI70_EMEP) {
        _sii1eddy.setC_lag_LI70_EMEP(c_lag_LI70_EMEP);
    }

    /**
    * Returns the h2 o_lag_ l i70 of this sii1eddy.
    *
    * @return the h2 o_lag_ l i70 of this sii1eddy
    */
    @Override
    public float getH2O_lag_LI70() {
        return _sii1eddy.getH2O_lag_LI70();
    }

    /**
    * Sets the h2 o_lag_ l i70 of this sii1eddy.
    *
    * @param H2O_lag_LI70 the h2 o_lag_ l i70 of this sii1eddy
    */
    @Override
    public void setH2O_lag_LI70(float H2O_lag_LI70) {
        _sii1eddy.setH2O_lag_LI70(H2O_lag_LI70);
    }

    /**
    * Returns the h2 o_lag_ l i70_ e m e p of this sii1eddy.
    *
    * @return the h2 o_lag_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getH2O_lag_LI70_EMEP() {
        return _sii1eddy.getH2O_lag_LI70_EMEP();
    }

    /**
    * Sets the h2 o_lag_ l i70_ e m e p of this sii1eddy.
    *
    * @param H2O_lag_LI70_EMEP the h2 o_lag_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setH2O_lag_LI70_EMEP(int H2O_lag_LI70_EMEP) {
        _sii1eddy.setH2O_lag_LI70_EMEP(H2O_lag_LI70_EMEP);
    }

    /**
    * Returns the c h4_lag_ l g r of this sii1eddy.
    *
    * @return the c h4_lag_ l g r of this sii1eddy
    */
    @Override
    public float getCH4_lag_LGR() {
        return _sii1eddy.getCH4_lag_LGR();
    }

    /**
    * Sets the c h4_lag_ l g r of this sii1eddy.
    *
    * @param CH4_lag_LGR the c h4_lag_ l g r of this sii1eddy
    */
    @Override
    public void setCH4_lag_LGR(float CH4_lag_LGR) {
        _sii1eddy.setCH4_lag_LGR(CH4_lag_LGR);
    }

    /**
    * Returns the c h4_lag_ l g r_ e m e p of this sii1eddy.
    *
    * @return the c h4_lag_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public int getCH4_lag_LGR_EMEP() {
        return _sii1eddy.getCH4_lag_LGR_EMEP();
    }

    /**
    * Sets the c h4_lag_ l g r_ e m e p of this sii1eddy.
    *
    * @param CH4_lag_LGR_EMEP the c h4_lag_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public void setCH4_lag_LGR_EMEP(int CH4_lag_LGR_EMEP) {
        _sii1eddy.setCH4_lag_LGR_EMEP(CH4_lag_LGR_EMEP);
    }

    /**
    * Returns the c h4_lag_ t g a of this sii1eddy.
    *
    * @return the c h4_lag_ t g a of this sii1eddy
    */
    @Override
    public float getCH4_lag_TGA() {
        return _sii1eddy.getCH4_lag_TGA();
    }

    /**
    * Sets the c h4_lag_ t g a of this sii1eddy.
    *
    * @param CH4_lag_TGA the c h4_lag_ t g a of this sii1eddy
    */
    @Override
    public void setCH4_lag_TGA(float CH4_lag_TGA) {
        _sii1eddy.setCH4_lag_TGA(CH4_lag_TGA);
    }

    /**
    * Returns the c h4_lag_ t g a_ e m e p of this sii1eddy.
    *
    * @return the c h4_lag_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public int getCH4_lag_TGA_EMEP() {
        return _sii1eddy.getCH4_lag_TGA_EMEP();
    }

    /**
    * Sets the c h4_lag_ t g a_ e m e p of this sii1eddy.
    *
    * @param CH4_lag_TGA_EMEP the c h4_lag_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public void setCH4_lag_TGA_EMEP(int CH4_lag_TGA_EMEP) {
        _sii1eddy.setCH4_lag_TGA_EMEP(CH4_lag_TGA_EMEP);
    }

    /**
    * Returns the h2 o_lag_ p i c of this sii1eddy.
    *
    * @return the h2 o_lag_ p i c of this sii1eddy
    */
    @Override
    public float getH2O_lag_PIC() {
        return _sii1eddy.getH2O_lag_PIC();
    }

    /**
    * Sets the h2 o_lag_ p i c of this sii1eddy.
    *
    * @param H2O_lag_PIC the h2 o_lag_ p i c of this sii1eddy
    */
    @Override
    public void setH2O_lag_PIC(float H2O_lag_PIC) {
        _sii1eddy.setH2O_lag_PIC(H2O_lag_PIC);
    }

    /**
    * Returns the h2 o_lag_ p i c_ e m e p of this sii1eddy.
    *
    * @return the h2 o_lag_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getH2O_lag_PIC_EMEP() {
        return _sii1eddy.getH2O_lag_PIC_EMEP();
    }

    /**
    * Sets the h2 o_lag_ p i c_ e m e p of this sii1eddy.
    *
    * @param H2O_lag_PIC_EMEP the h2 o_lag_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setH2O_lag_PIC_EMEP(int H2O_lag_PIC_EMEP) {
        _sii1eddy.setH2O_lag_PIC_EMEP(H2O_lag_PIC_EMEP);
    }

    /**
    * Returns the c h4_lag_ p i c of this sii1eddy.
    *
    * @return the c h4_lag_ p i c of this sii1eddy
    */
    @Override
    public float getCH4_lag_PIC() {
        return _sii1eddy.getCH4_lag_PIC();
    }

    /**
    * Sets the c h4_lag_ p i c of this sii1eddy.
    *
    * @param CH4_lag_PIC the c h4_lag_ p i c of this sii1eddy
    */
    @Override
    public void setCH4_lag_PIC(float CH4_lag_PIC) {
        _sii1eddy.setCH4_lag_PIC(CH4_lag_PIC);
    }

    /**
    * Returns the c h4_lag_ p i c_ e m e p of this sii1eddy.
    *
    * @return the c h4_lag_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getCH4_lag_PIC_EMEP() {
        return _sii1eddy.getCH4_lag_PIC_EMEP();
    }

    /**
    * Sets the c h4_lag_ p i c_ e m e p of this sii1eddy.
    *
    * @param CH4_lag_PIC_EMEP the c h4_lag_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setCH4_lag_PIC_EMEP(int CH4_lag_PIC_EMEP) {
        _sii1eddy.setCH4_lag_PIC_EMEP(CH4_lag_PIC_EMEP);
    }

    /**
    * Returns the qc_ h of this sii1eddy.
    *
    * @return the qc_ h of this sii1eddy
    */
    @Override
    public int getQc_H() {
        return _sii1eddy.getQc_H();
    }

    /**
    * Sets the qc_ h of this sii1eddy.
    *
    * @param Qc_H the qc_ h of this sii1eddy
    */
    @Override
    public void setQc_H(int Qc_H) {
        _sii1eddy.setQc_H(Qc_H);
    }

    /**
    * Returns the qc_ h_ e m e p of this sii1eddy.
    *
    * @return the qc_ h_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_H_EMEP() {
        return _sii1eddy.getQc_H_EMEP();
    }

    /**
    * Sets the qc_ h_ e m e p of this sii1eddy.
    *
    * @param Qc_H_EMEP the qc_ h_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _sii1eddy.setQc_H_EMEP(Qc_H_EMEP);
    }

    /**
    * Returns the qc_ c o2_ l i70 of this sii1eddy.
    *
    * @return the qc_ c o2_ l i70 of this sii1eddy
    */
    @Override
    public int getQc_CO2_LI70() {
        return _sii1eddy.getQc_CO2_LI70();
    }

    /**
    * Sets the qc_ c o2_ l i70 of this sii1eddy.
    *
    * @param Qc_CO2_LI70 the qc_ c o2_ l i70 of this sii1eddy
    */
    @Override
    public void setQc_CO2_LI70(int Qc_CO2_LI70) {
        _sii1eddy.setQc_CO2_LI70(Qc_CO2_LI70);
    }

    /**
    * Returns the qc_ c o2_ l i70_ e m e p of this sii1eddy.
    *
    * @return the qc_ c o2_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_CO2_LI70_EMEP() {
        return _sii1eddy.getQc_CO2_LI70_EMEP();
    }

    /**
    * Sets the qc_ c o2_ l i70_ e m e p of this sii1eddy.
    *
    * @param Qc_CO2_LI70_EMEP the qc_ c o2_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_CO2_LI70_EMEP(int Qc_CO2_LI70_EMEP) {
        _sii1eddy.setQc_CO2_LI70_EMEP(Qc_CO2_LI70_EMEP);
    }

    /**
    * Returns the qc_ c h4_ l g r of this sii1eddy.
    *
    * @return the qc_ c h4_ l g r of this sii1eddy
    */
    @Override
    public int getQc_CH4_LGR() {
        return _sii1eddy.getQc_CH4_LGR();
    }

    /**
    * Sets the qc_ c h4_ l g r of this sii1eddy.
    *
    * @param Qc_CH4_LGR the qc_ c h4_ l g r of this sii1eddy
    */
    @Override
    public void setQc_CH4_LGR(int Qc_CH4_LGR) {
        _sii1eddy.setQc_CH4_LGR(Qc_CH4_LGR);
    }

    /**
    * Returns the qc_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @return the qc_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_CH4_LGR_EMEP() {
        return _sii1eddy.getQc_CH4_LGR_EMEP();
    }

    /**
    * Sets the qc_ c h4_ l g r_ e m e p of this sii1eddy.
    *
    * @param Qc_CH4_LGR_EMEP the qc_ c h4_ l g r_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_CH4_LGR_EMEP(int Qc_CH4_LGR_EMEP) {
        _sii1eddy.setQc_CH4_LGR_EMEP(Qc_CH4_LGR_EMEP);
    }

    /**
    * Returns the qc_ c h4_ t g a of this sii1eddy.
    *
    * @return the qc_ c h4_ t g a of this sii1eddy
    */
    @Override
    public int getQc_CH4_TGA() {
        return _sii1eddy.getQc_CH4_TGA();
    }

    /**
    * Sets the qc_ c h4_ t g a of this sii1eddy.
    *
    * @param Qc_CH4_TGA the qc_ c h4_ t g a of this sii1eddy
    */
    @Override
    public void setQc_CH4_TGA(int Qc_CH4_TGA) {
        _sii1eddy.setQc_CH4_TGA(Qc_CH4_TGA);
    }

    /**
    * Returns the qc_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @return the qc_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_CH4_TGA_EMEP() {
        return _sii1eddy.getQc_CH4_TGA_EMEP();
    }

    /**
    * Sets the qc_ c h4_ t g a_ e m e p of this sii1eddy.
    *
    * @param Qc_CH4_TGA_EMEP the qc_ c h4_ t g a_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_CH4_TGA_EMEP(int Qc_CH4_TGA_EMEP) {
        _sii1eddy.setQc_CH4_TGA_EMEP(Qc_CH4_TGA_EMEP);
    }

    /**
    * Returns the qc_ c h4_ p i c of this sii1eddy.
    *
    * @return the qc_ c h4_ p i c of this sii1eddy
    */
    @Override
    public int getQc_CH4_PIC() {
        return _sii1eddy.getQc_CH4_PIC();
    }

    /**
    * Sets the qc_ c h4_ p i c of this sii1eddy.
    *
    * @param Qc_CH4_PIC the qc_ c h4_ p i c of this sii1eddy
    */
    @Override
    public void setQc_CH4_PIC(int Qc_CH4_PIC) {
        _sii1eddy.setQc_CH4_PIC(Qc_CH4_PIC);
    }

    /**
    * Returns the qc_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @return the qc_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_CH4_PIC_EMEP() {
        return _sii1eddy.getQc_CH4_PIC_EMEP();
    }

    /**
    * Sets the qc_ c h4_ p i c_ e m e p of this sii1eddy.
    *
    * @param Qc_CH4_PIC_EMEP the qc_ c h4_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_CH4_PIC_EMEP(int Qc_CH4_PIC_EMEP) {
        _sii1eddy.setQc_CH4_PIC_EMEP(Qc_CH4_PIC_EMEP);
    }

    /**
    * Returns the qc_ l e_ l i70 of this sii1eddy.
    *
    * @return the qc_ l e_ l i70 of this sii1eddy
    */
    @Override
    public int getQc_LE_LI70() {
        return _sii1eddy.getQc_LE_LI70();
    }

    /**
    * Sets the qc_ l e_ l i70 of this sii1eddy.
    *
    * @param Qc_LE_LI70 the qc_ l e_ l i70 of this sii1eddy
    */
    @Override
    public void setQc_LE_LI70(int Qc_LE_LI70) {
        _sii1eddy.setQc_LE_LI70(Qc_LE_LI70);
    }

    /**
    * Returns the qc_ l e_ l i70_ e m e p of this sii1eddy.
    *
    * @return the qc_ l e_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_LE_LI70_EMEP() {
        return _sii1eddy.getQc_LE_LI70_EMEP();
    }

    /**
    * Sets the qc_ l e_ l i70_ e m e p of this sii1eddy.
    *
    * @param Qc_LE_LI70_EMEP the qc_ l e_ l i70_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_LE_LI70_EMEP(int Qc_LE_LI70_EMEP) {
        _sii1eddy.setQc_LE_LI70_EMEP(Qc_LE_LI70_EMEP);
    }

    /**
    * Returns the qc_ l e_ p i c of this sii1eddy.
    *
    * @return the qc_ l e_ p i c of this sii1eddy
    */
    @Override
    public int getQc_LE_PIC() {
        return _sii1eddy.getQc_LE_PIC();
    }

    /**
    * Sets the qc_ l e_ p i c of this sii1eddy.
    *
    * @param Qc_LE_PIC the qc_ l e_ p i c of this sii1eddy
    */
    @Override
    public void setQc_LE_PIC(int Qc_LE_PIC) {
        _sii1eddy.setQc_LE_PIC(Qc_LE_PIC);
    }

    /**
    * Returns the qc_ l e_ p i c_ e m e p of this sii1eddy.
    *
    * @return the qc_ l e_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_LE_PIC_EMEP() {
        return _sii1eddy.getQc_LE_PIC_EMEP();
    }

    /**
    * Sets the qc_ l e_ p i c_ e m e p of this sii1eddy.
    *
    * @param Qc_LE_PIC_EMEP the qc_ l e_ p i c_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_LE_PIC_EMEP(int Qc_LE_PIC_EMEP) {
        _sii1eddy.setQc_LE_PIC_EMEP(Qc_LE_PIC_EMEP);
    }

    /**
    * Returns the qc_tau of this sii1eddy.
    *
    * @return the qc_tau of this sii1eddy
    */
    @Override
    public int getQc_tau() {
        return _sii1eddy.getQc_tau();
    }

    /**
    * Sets the qc_tau of this sii1eddy.
    *
    * @param Qc_tau the qc_tau of this sii1eddy
    */
    @Override
    public void setQc_tau(int Qc_tau) {
        _sii1eddy.setQc_tau(Qc_tau);
    }

    /**
    * Returns the qc_tau_ e m e p of this sii1eddy.
    *
    * @return the qc_tau_ e m e p of this sii1eddy
    */
    @Override
    public int getQc_tau_EMEP() {
        return _sii1eddy.getQc_tau_EMEP();
    }

    /**
    * Sets the qc_tau_ e m e p of this sii1eddy.
    *
    * @param Qc_tau_EMEP the qc_tau_ e m e p of this sii1eddy
    */
    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _sii1eddy.setQc_tau_EMEP(Qc_tau_EMEP);
    }

    @Override
    public boolean isNew() {
        return _sii1eddy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _sii1eddy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _sii1eddy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _sii1eddy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _sii1eddy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _sii1eddy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _sii1eddy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _sii1eddy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _sii1eddy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _sii1eddy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _sii1eddy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Sii1eddyWrapper((Sii1eddy) _sii1eddy.clone());
    }

    @Override
    public int compareTo(Sii1eddy sii1eddy) {
        return _sii1eddy.compareTo(sii1eddy);
    }

    @Override
    public int hashCode() {
        return _sii1eddy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Sii1eddy> toCacheModel() {
        return _sii1eddy.toCacheModel();
    }

    @Override
    public Sii1eddy toEscapedModel() {
        return new Sii1eddyWrapper(_sii1eddy.toEscapedModel());
    }

    @Override
    public Sii1eddy toUnescapedModel() {
        return new Sii1eddyWrapper(_sii1eddy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _sii1eddy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _sii1eddy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _sii1eddy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii1eddyWrapper)) {
            return false;
        }

        Sii1eddyWrapper sii1eddyWrapper = (Sii1eddyWrapper) obj;

        if (Validator.equals(_sii1eddy, sii1eddyWrapper._sii1eddy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Sii1eddy getWrappedSii1eddy() {
        return _sii1eddy;
    }

    @Override
    public Sii1eddy getWrappedModel() {
        return _sii1eddy;
    }

    @Override
    public void resetOriginalValues() {
        _sii1eddy.resetOriginalValues();
    }
}
