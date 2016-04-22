package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link kvjEddy}.
 * </p>
 *
 * @author pj
 * @see kvjEddy
 * @generated
 */
public class kvjEddyWrapper implements kvjEddy, ModelWrapper<kvjEddy> {
    private kvjEddy _kvjEddy;

    public kvjEddyWrapper(kvjEddy kvjEddy) {
        _kvjEddy = kvjEddy;
    }

    @Override
    public Class<?> getModelClass() {
        return kvjEddy.class;
    }

    @Override
    public String getModelClassName() {
        return kvjEddy.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("H", getH());
        attributes.put("H_EMEP", getH_EMEP());
        attributes.put("Qc_H", getQc_H());
        attributes.put("Qc_H_EMEP", getQc_H_EMEP());
        attributes.put("tau", getTau());
        attributes.put("tau_EMEP", getTau_EMEP());
        attributes.put("Qc_tau", getQc_tau());
        attributes.put("Qc_tau_EMEP", getQc_tau_EMEP());
        attributes.put("u_star", getU_star());
        attributes.put("u_star_EMEP", getU_star_EMEP());
        attributes.put("MO_length", getMO_length());
        attributes.put("MO_length_EMEP", getMO_length_EMEP());
        attributes.put("err_packet", getErr_packet());
        attributes.put("err_packet_EMEP", getErr_packet_EMEP());
        attributes.put("F_CO2_LI72", getF_CO2_LI72());
        attributes.put("F_CO2_LI72_EMEP", getF_CO2_LI72_EMEP());
        attributes.put("Qc_CO2_LI72", getQc_CO2_LI72());
        attributes.put("Qc_CO2_LI72_EMEP", getQc_CO2_LI72_EMEP());
        attributes.put("F_CH4_PICA", getF_CH4_PICA());
        attributes.put("F_CH4_PICA_EMEP", getF_CH4_PICA_EMEP());
        attributes.put("Qc_CH4_PICA", getQc_CH4_PICA());
        attributes.put("Qc_CH4_PICA_EMEP", getQc_CH4_PICA_EMEP());
        attributes.put("F_H2O_LI72", getF_H2O_LI72());
        attributes.put("F_H2O_LI72_EMEP", getF_H2O_LI72_EMEP());
        attributes.put("Qc_H2O_LI72", getQc_H2O_LI72());
        attributes.put("Qc_H2O_LI72_EMEP", getQc_H2O_LI72_EMEP());
        attributes.put("F_H2O_PICA", getF_H2O_PICA());
        attributes.put("F_H2O_PICA_EMEP", getF_H2O_PICA_EMEP());
        attributes.put("Qc_H2O_PICA", getQc_H2O_PICA());
        attributes.put("Qc_H2O_PICA_EMEP", getQc_H2O_PICA_EMEP());
        attributes.put("LE_LI72", getLE_LI72());
        attributes.put("LE_LI72_EMEP", getLE_LI72_EMEP());
        attributes.put("LE_PICA", getLE_PICA());
        attributes.put("LE_PICA_EMEP", getLE_PICA_EMEP());
        attributes.put("U", getU());
        attributes.put("U_EMEP", getU_EMEP());
        attributes.put("wind_dir", getWind_dir());
        attributes.put("wind_dir_EMEP", getWind_dir_EMEP());
        attributes.put("av_u", getAv_u());
        attributes.put("av_u_EMEP", getAv_u_EMEP());
        attributes.put("av_v", getAv_v());
        attributes.put("av_v_EMEP", getAv_v_EMEP());
        attributes.put("av_w", getAv_w());
        attributes.put("av_w_EMEP", getAv_w_EMEP());
        attributes.put("av_t", getAv_t());
        attributes.put("av_t_EMEP", getAv_t_EMEP());
        attributes.put("av_c_LI72", getAv_c_LI72());
        attributes.put("av_c_LI72_EMEP", getAv_c_LI72_EMEP());
        attributes.put("av_h_LI72", getAv_h_LI72());
        attributes.put("av_h_LI72_EMEP", getAv_h_LI72_EMEP());
        attributes.put("av_h_PICA", getAv_h_PICA());
        attributes.put("av_h_PICA_EMEP", getAv_h_PICA_EMEP());
        attributes.put("av_CH4", getAv_CH4());
        attributes.put("av_CH4_EMEP", getAv_CH4_EMEP());
        attributes.put("std_u", getStd_u());
        attributes.put("std_u_EMEP", getStd_u_EMEP());
        attributes.put("std_v", getStd_v());
        attributes.put("std_v_EMEP", getStd_v_EMEP());
        attributes.put("std_w", getStd_w());
        attributes.put("std_w_EMEP", getStd_w_EMEP());
        attributes.put("std_t", getStd_t());
        attributes.put("std_t_EMEP", getStd_t_EMEP());
        attributes.put("std_c_LI72", getStd_c_LI72());
        attributes.put("std_c_LI72_EMEP", getStd_c_LI72_EMEP());
        attributes.put("std_h_LI72", getStd_h_LI72());
        attributes.put("std_h_LI72_EMEP", getStd_h_LI72_EMEP());
        attributes.put("std_h_PICA", getStd_h_PICA());
        attributes.put("std_h_PICA_EMEP", getStd_h_PICA_EMEP());
        attributes.put("std_CH4", getStd_CH4());
        attributes.put("std_CH4_EMEP", getStd_CH4_EMEP());
        attributes.put("eta", getEta());
        attributes.put("eta_EMEP", getEta_EMEP());
        attributes.put("theta", getTheta());
        attributes.put("theta_EMEP", getTheta_EMEP());
        attributes.put("beta", getBeta());
        attributes.put("beta_EMEP", getBeta_EMEP());
        attributes.put("Covs_u", getCovs_u());
        attributes.put("Covs_u_EMEP", getCovs_u_EMEP());
        attributes.put("Covs_v", getCovs_v());
        attributes.put("Covs_v_EMEP", getCovs_v_EMEP());
        attributes.put("Covs_Ts", getCovs_Ts());
        attributes.put("Covs_Ts_EMEP", getCovs_Ts_EMEP());
        attributes.put("Covs_CO2_LI72", getCovs_CO2_LI72());
        attributes.put("Covs_CO2_LI72_EMEP", getCovs_CO2_LI72_EMEP());
        attributes.put("Covs_H2O_LI72", getCovs_H2O_LI72());
        attributes.put("Covs_H2O_LI72_EMEP", getCovs_H2O_LI72_EMEP());
        attributes.put("Covs_T_C_LI72", getCovs_T_C_LI72());
        attributes.put("Covs_T_C_LI72_EMEP", getCovs_T_C_LI72_EMEP());
        attributes.put("Covs_P_C_LI72", getCovs_P_C_LI72());
        attributes.put("Covs_P_C_LI72_EMEP", getCovs_P_C_LI72_EMEP());
        attributes.put("Covs_H2O_PICA", getCovs_H2O_PICA());
        attributes.put("Covs_H2O_PICA_EMEP", getCovs_H2O_PICA_EMEP());
        attributes.put("Covs_CH4_PICA", getCovs_CH4_PICA());
        attributes.put("Covs_CH4_PICA_EMEP", getCovs_CH4_PICA_EMEP());
        attributes.put("licor_t_av", getLicor_t_av());
        attributes.put("licor_t_av_EMEP", getLicor_t_av_EMEP());
        attributes.put("licor_p_av", getLicor_p_av());
        attributes.put("licor_p_av_EMEP", getLicor_p_av_EMEP());
        attributes.put("licor_t_std", getLicor_t_std());
        attributes.put("licor_t_std_EMEP", getLicor_t_std_EMEP());
        attributes.put("licor_p_std", getLicor_p_std());
        attributes.put("licor_p_std_EMEP", getLicor_p_std_EMEP());
        attributes.put("c_lag_LI72", getC_lag_LI72());
        attributes.put("c_lag_LI72_EMEP", getC_lag_LI72_EMEP());
        attributes.put("h_lag_LI72", getH_lag_LI72());
        attributes.put("h_lag_LI72_EMEP", getH_lag_LI72_EMEP());
        attributes.put("t_lag_LI72", getT_lag_LI72());
        attributes.put("t_lag_LI72_EMEP", getT_lag_LI72_EMEP());
        attributes.put("p_lag_LI72", getP_lag_LI72());
        attributes.put("p_lag_LI72_EMEP", getP_lag_LI72_EMEP());
        attributes.put("h_lag_PICA", getH_lag_PICA());
        attributes.put("h_lag_PICA_EMEP", getH_lag_PICA_EMEP());
        attributes.put("CH4_lag", getCH4_lag());
        attributes.put("CH4_lag_EMEP", getCH4_lag_EMEP());
        attributes.put("Nspikes_u", getNspikes_u());
        attributes.put("Nspikes_u_EMEP", getNspikes_u_EMEP());
        attributes.put("Nspikes_v", getNspikes_v());
        attributes.put("Nspikes_v_EMEP", getNspikes_v_EMEP());
        attributes.put("Nspikes_w", getNspikes_w());
        attributes.put("Nspikes_w_EMEP", getNspikes_w_EMEP());
        attributes.put("Nspikes_Ts", getNspikes_Ts());
        attributes.put("Nspikes_Ts_EMEP", getNspikes_Ts_EMEP());
        attributes.put("Nspikes_CO2_LI72", getNspikes_CO2_LI72());
        attributes.put("Nspikes_CO2_LI72_EMEP", getNspikes_CO2_LI72_EMEP());
        attributes.put("Nspikes_H2O_LI72", getNspikes_H2O_LI72());
        attributes.put("Nspikes_H2O_LI72_EMEP", getNspikes_H2O_LI72_EMEP());
        attributes.put("Nspikes_T_C_LI72", getNspikes_T_C_LI72());
        attributes.put("Nspikes_T_C_LI72_EMEP", getNspikes_T_C_LI72_EMEP());
        attributes.put("Nspikes_P_C_LI72", getNspikes_P_C_LI72());
        attributes.put("Nspikes_P_C_LI72_EMEP", getNspikes_P_C_LI72_EMEP());
        attributes.put("Nspikes_H2O_PICA", getNspikes_H2O_PICA());
        attributes.put("Nspikes_H2O_PICA_EMEP", getNspikes_H2O_PICA_EMEP());
        attributes.put("Nspikes_CH4_PICA", getNspikes_CH4_PICA());
        attributes.put("Nspikes_CH4_PICA_EMEP", getNspikes_CH4_PICA_EMEP());
        attributes.put("FI_u", getFI_u());
        attributes.put("FI_u_EMEP", getFI_u_EMEP());
        attributes.put("FI_Ts", getFI_Ts());
        attributes.put("FI_Ts_EMEP", getFI_Ts_EMEP());
        attributes.put("FI_CO2_LI72", getFI_CO2_LI72());
        attributes.put("FI_CO2_LI72_EMEP", getFI_CO2_LI72_EMEP());
        attributes.put("FI_H2O_LI72", getFI_H2O_LI72());
        attributes.put("FI_H2O_LI72_EMEP", getFI_H2O_LI72_EMEP());
        attributes.put("FI_CH4_PICA", getFI_CH4_PICA());
        attributes.put("FI_CH4_PICA_EMEP", getFI_CH4_PICA_EMEP());
        attributes.put("FI_H2O_PICA", getFI_H2O_PICA());
        attributes.put("FI_H2O_PICA_EMEP", getFI_H2O_PICA_EMEP());
        attributes.put("FST_u", getFST_u());
        attributes.put("FST_u_EMEP", getFST_u_EMEP());
        attributes.put("FST_Ts", getFST_Ts());
        attributes.put("FST_Ts_EMEP", getFST_Ts_EMEP());
        attributes.put("FST_CO2_LI72", getFST_CO2_LI72());
        attributes.put("FST_CO2_LI72_EMEP", getFST_CO2_LI72_EMEP());
        attributes.put("FST_H2O_LI72", getFST_H2O_LI72());
        attributes.put("FST_H2O_LI72_EMEP", getFST_H2O_LI72_EMEP());
        attributes.put("FST_CH4_PICA", getFST_CH4_PICA());
        attributes.put("FST_CH4_PICA_EMEP", getFST_CH4_PICA_EMEP());
        attributes.put("FST_H2O_PICA", getFST_H2O_PICA());
        attributes.put("FST_H2O_PICA_EMEP", getFST_H2O_PICA_EMEP());
        attributes.put("RFE_u", getRFE_u());
        attributes.put("RFE_u_EMEP", getRFE_u_EMEP());
        attributes.put("RFE_Ts", getRFE_Ts());
        attributes.put("RFE_Ts_EMEP", getRFE_Ts_EMEP());
        attributes.put("RFE_CO2_LI72", getRFE_CO2_LI72());
        attributes.put("RFE_CO2_LI72_EMEP", getRFE_CO2_LI72_EMEP());
        attributes.put("RFE_H2O_LI72", getRFE_H2O_LI72());
        attributes.put("RFE_H2O_LI72_EMEP", getRFE_H2O_LI72_EMEP());
        attributes.put("RFE_CH4_PICA", getRFE_CH4_PICA());
        attributes.put("RFE_CH4_PICA_EMEP", getRFE_CH4_PICA_EMEP());
        attributes.put("RFE_H2O_PICA", getRFE_H2O_PICA());
        attributes.put("RFE_H2O_PICA_EMEP", getRFE_H2O_PICA_EMEP());
        attributes.put("FA_u", getFA_u());
        attributes.put("FA_u_EMEP", getFA_u_EMEP());
        attributes.put("FA_v", getFA_v());
        attributes.put("FA_v_EMEP", getFA_v_EMEP());
        attributes.put("FA_Ts", getFA_Ts());
        attributes.put("FA_Ts_EMEP", getFA_Ts_EMEP());
        attributes.put("FA_CO2_LI72", getFA_CO2_LI72());
        attributes.put("FA_CO2_LI72_EMEP", getFA_CO2_LI72_EMEP());
        attributes.put("FA_H2O_LI72", getFA_H2O_LI72());
        attributes.put("FA_H2O_LI72_EMEP", getFA_H2O_LI72_EMEP());
        attributes.put("FA_CH4_PICA", getFA_CH4_PICA());
        attributes.put("FA_CH4_PICA_EMEP", getFA_CH4_PICA_EMEP());
        attributes.put("FA_H2O_PICA", getFA_H2O_PICA());
        attributes.put("FA_H2O_PICA_EMEP", getFA_H2O_PICA_EMEP());
        attributes.put("covsvar_u", getCovsvar_u());
        attributes.put("covsvar_u_EMEP", getCovsvar_u_EMEP());
        attributes.put("covsvar_v", getCovsvar_v());
        attributes.put("covsvar_v_EMEP", getCovsvar_v_EMEP());
        attributes.put("covsvar_Ts", getCovsvar_Ts());
        attributes.put("covsvar_Ts_EMEP", getCovsvar_Ts_EMEP());
        attributes.put("covsvar_CO2_LI72", getCovsvar_CO2_LI72());
        attributes.put("covsvar_CO2_LI72_EMEP", getCovsvar_CO2_LI72_EMEP());
        attributes.put("covsvar_H2O_LI72", getCovsvar_H2O_LI72());
        attributes.put("covsvar_H2O_LI72_EMEP", getCovsvar_H2O_LI72_EMEP());
        attributes.put("covsvar_CH4_PICA", getCovsvar_CH4_PICA());
        attributes.put("covsvar_CH4_PICA_EMEP", getCovsvar_CH4_PICA_EMEP());
        attributes.put("covsvar_H2O_PICA", getCovsvar_H2O_PICA());
        attributes.put("covsvar_H2O_PICA_EMEP", getCovsvar_H2O_PICA_EMEP());
        attributes.put("SKx_u", getSKx_u());
        attributes.put("SKx_u_EMEP", getSKx_u_EMEP());
        attributes.put("SKx_v", getSKx_v());
        attributes.put("SKx_v_EMEP", getSKx_v_EMEP());
        attributes.put("SKx_w", getSKx_w());
        attributes.put("SKx_w_EMEP", getSKx_w_EMEP());
        attributes.put("SKx_Ts", getSKx_Ts());
        attributes.put("SKx_Ts_EMEP", getSKx_Ts_EMEP());
        attributes.put("SKx_CO2_LI72", getSKx_CO2_LI72());
        attributes.put("SKx_CO2_LI72_EMEP", getSKx_CO2_LI72_EMEP());
        attributes.put("SKx_H2O_LI72", getSKx_H2O_LI72());
        attributes.put("SKx_H2O_LI72_EMEP", getSKx_H2O_LI72_EMEP());
        attributes.put("SKx_CH4_PICA", getSKx_CH4_PICA());
        attributes.put("SKx_CH4_PICA_EMEP", getSKx_CH4_PICA_EMEP());
        attributes.put("SKx_H2O_PICA", getSKx_H2O_PICA());
        attributes.put("SKx_H2O_PICA_EMEP", getSKx_H2O_PICA_EMEP());
        attributes.put("KUx_u", getKUx_u());
        attributes.put("KUx_u_EMEP", getKUx_u_EMEP());
        attributes.put("KUx_v", getKUx_v());
        attributes.put("KUx_v_EMEP", getKUx_v_EMEP());
        attributes.put("KUx_w", getKUx_w());
        attributes.put("KUx_w_EMEP", getKUx_w_EMEP());
        attributes.put("KUx_Ts", getKUx_Ts());
        attributes.put("KUx_Ts_EMEP", getKUx_Ts_EMEP());
        attributes.put("KUx_CO2_LI72", getKUx_CO2_LI72());
        attributes.put("KUx_CO2_LI72_EMEP", getKUx_CO2_LI72_EMEP());
        attributes.put("KUx_H2O_LI72", getKUx_H2O_LI72());
        attributes.put("KUx_H2O_LI72_EMEP", getKUx_H2O_LI72_EMEP());
        attributes.put("KUx_CH4_PICA", getKUx_CH4_PICA());
        attributes.put("KUx_CH4_PICA_EMEP", getKUx_CH4_PICA_EMEP());
        attributes.put("KUx_H2O_PICA", getKUx_H2O_PICA());
        attributes.put("KUx_H2O_PICA_EMEP", getKUx_H2O_PICA_EMEP());
        attributes.put("overall_qflag_u", getOverall_qflag_u());
        attributes.put("overall_qflag_u_EMEP", getOverall_qflag_u_EMEP());
        attributes.put("overall_qflag_Ts", getOverall_qflag_Ts());
        attributes.put("overall_qflag_Ts_EMEP", getOverall_qflag_Ts_EMEP());
        attributes.put("overall_qflag_CO2_LI72", getOverall_qflag_CO2_LI72());
        attributes.put("overall_qflag_CO2_LI72_EMEP",
            getOverall_qflag_CO2_LI72_EMEP());
        attributes.put("overall_qflag_H2O_LI72", getOverall_qflag_H2O_LI72());
        attributes.put("overall_qflag_H2O_LI72_EMEP",
            getOverall_qflag_H2O_LI72_EMEP());
        attributes.put("overall_qflag_CH4_PICA", getOverall_qflag_CH4_PICA());
        attributes.put("overall_qflag_CH4_PICA_EMEP",
            getOverall_qflag_CH4_PICA_EMEP());
        attributes.put("overall_qflag_H2O_PICA", getOverall_qflag_H2O_PICA());
        attributes.put("overall_qflag_H2O_PICA_EMEP",
            getOverall_qflag_H2O_PICA_EMEP());
        attributes.put("ITC_qflag_w", getITC_qflag_w());
        attributes.put("ITC_qflag_w_EMEP", getITC_qflag_w_EMEP());
        attributes.put("ITC_qflag_u", getITC_qflag_u());
        attributes.put("ITC_qflag_u_EMEP", getITC_qflag_u_EMEP());
        attributes.put("ITC_qflag_Ts", getITC_qflag_Ts());
        attributes.put("ITC_qflag_Ts_EMEP", getITC_qflag_Ts_EMEP());
        attributes.put("ITC_qflag_CO2_LI72", getITC_qflag_CO2_LI72());
        attributes.put("ITC_qflag_CO2_LI72_EMEP", getITC_qflag_CO2_LI72_EMEP());
        attributes.put("ITC_qflag_H2O_LI72", getITC_qflag_H2O_LI72());
        attributes.put("ITC_qflag_H2O_LI72_EMEP", getITC_qflag_H2O_LI72_EMEP());
        attributes.put("ITC_qflag_CH4_PICA", getITC_qflag_CH4_PICA());
        attributes.put("ITC_qflag_CH4_PICA_EMEP", getITC_qflag_CH4_PICA_EMEP());
        attributes.put("ITC_qflag_H2O_PICA", getITC_qflag_H2O_PICA());
        attributes.put("ITC_qflag_H2O_PICA_EMEP", getITC_qflag_H2O_PICA_EMEP());
        attributes.put("FST_qflag_u", getFST_qflag_u());
        attributes.put("FST_qflag_u_EMEP", getFST_qflag_u_EMEP());
        attributes.put("FST_qflag_Ts", getFST_qflag_Ts());
        attributes.put("FST_qflag_Ts_EMEP", getFST_qflag_Ts_EMEP());
        attributes.put("FST_qflag_CO2_LI72", getFST_qflag_CO2_LI72());
        attributes.put("FST_qflag_CO2_LI72_EMEP", getFST_qflag_CO2_LI72_EMEP());
        attributes.put("FST_qflag_H2O_LI72", getFST_qflag_H2O_LI72());
        attributes.put("FST_qflag_H2O_LI72_EMEP", getFST_qflag_H2O_LI72_EMEP());
        attributes.put("FST_qflag_CH4_PICA", getFST_qflag_CH4_PICA());
        attributes.put("FST_qflag_CH4_PICA_EMEP", getFST_qflag_CH4_PICA_EMEP());
        attributes.put("FST_qflag_H2O_PICA", getFST_qflag_H2O_PICA());
        attributes.put("FST_qflag_H2O_PICA_EMEP", getFST_qflag_H2O_PICA_EMEP());
        attributes.put("Hm_u", getHm_u());
        attributes.put("Hm_u_EMEP", getHm_u_EMEP());
        attributes.put("Hm_Ts", getHm_Ts());
        attributes.put("Hm_Ts_EMEP", getHm_Ts_EMEP());
        attributes.put("Hm_CO2_LI72", getHm_CO2_LI72());
        attributes.put("Hm_CO2_LI72_EMEP", getHm_CO2_LI72_EMEP());
        attributes.put("Hm_H2O_LI72", getHm_H2O_LI72());
        attributes.put("Hm_H2O_LI72_EMEP", getHm_H2O_LI72_EMEP());
        attributes.put("Hm_CH4_PICA", getHm_CH4_PICA());
        attributes.put("Hm_CH4_PICA_EMEP", getHm_CH4_PICA_EMEP());
        attributes.put("Hm_H2O_PICA", getHm_H2O_PICA());
        attributes.put("Hm_H2O_PICA_EMEP", getHm_H2O_PICA_EMEP());
        attributes.put("Hv_u", getHv_u());
        attributes.put("Hv_u_EMEP", getHv_u_EMEP());
        attributes.put("Hv_Ts", getHv_Ts());
        attributes.put("Hv_Ts_EMEP", getHv_Ts_EMEP());
        attributes.put("Hv_CO2_LI72", getHv_CO2_LI72());
        attributes.put("Hv_CO2_LI72_EMEP", getHv_CO2_LI72_EMEP());
        attributes.put("Hv_H2O_LI72", getHv_H2O_LI72());
        attributes.put("Hv_H2O_LI72_EMEP", getHv_H2O_LI72_EMEP());
        attributes.put("Hv_CH4_PICA", getHv_CH4_PICA());
        attributes.put("Hv_CH4_PICA_EMEP", getHv_CH4_PICA_EMEP());
        attributes.put("Hv_H2O_PICA", getHv_H2O_PICA());
        attributes.put("Hv_H2O_PICA_EMEP", getHv_H2O_PICA_EMEP());
        attributes.put("fpr_x_peak", getFpr_x_peak());
        attributes.put("fpr_x_peak_EMEP", getFpr_x_peak_EMEP());
        attributes.put("fpr_x_80", getFpr_x_80());
        attributes.put("fpr_x_80_EMEP", getFpr_x_80_EMEP());

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

        Integer err_packet = (Integer) attributes.get("err_packet");

        if (err_packet != null) {
            setErr_packet(err_packet);
        }

        Integer err_packet_EMEP = (Integer) attributes.get("err_packet_EMEP");

        if (err_packet_EMEP != null) {
            setErr_packet_EMEP(err_packet_EMEP);
        }

        Float F_CO2_LI72 = (Float) attributes.get("F_CO2_LI72");

        if (F_CO2_LI72 != null) {
            setF_CO2_LI72(F_CO2_LI72);
        }

        Integer F_CO2_LI72_EMEP = (Integer) attributes.get("F_CO2_LI72_EMEP");

        if (F_CO2_LI72_EMEP != null) {
            setF_CO2_LI72_EMEP(F_CO2_LI72_EMEP);
        }

        Integer Qc_CO2_LI72 = (Integer) attributes.get("Qc_CO2_LI72");

        if (Qc_CO2_LI72 != null) {
            setQc_CO2_LI72(Qc_CO2_LI72);
        }

        Integer Qc_CO2_LI72_EMEP = (Integer) attributes.get("Qc_CO2_LI72_EMEP");

        if (Qc_CO2_LI72_EMEP != null) {
            setQc_CO2_LI72_EMEP(Qc_CO2_LI72_EMEP);
        }

        Float F_CH4_PICA = (Float) attributes.get("F_CH4_PICA");

        if (F_CH4_PICA != null) {
            setF_CH4_PICA(F_CH4_PICA);
        }

        Integer F_CH4_PICA_EMEP = (Integer) attributes.get("F_CH4_PICA_EMEP");

        if (F_CH4_PICA_EMEP != null) {
            setF_CH4_PICA_EMEP(F_CH4_PICA_EMEP);
        }

        Integer Qc_CH4_PICA = (Integer) attributes.get("Qc_CH4_PICA");

        if (Qc_CH4_PICA != null) {
            setQc_CH4_PICA(Qc_CH4_PICA);
        }

        Integer Qc_CH4_PICA_EMEP = (Integer) attributes.get("Qc_CH4_PICA_EMEP");

        if (Qc_CH4_PICA_EMEP != null) {
            setQc_CH4_PICA_EMEP(Qc_CH4_PICA_EMEP);
        }

        Float F_H2O_LI72 = (Float) attributes.get("F_H2O_LI72");

        if (F_H2O_LI72 != null) {
            setF_H2O_LI72(F_H2O_LI72);
        }

        Integer F_H2O_LI72_EMEP = (Integer) attributes.get("F_H2O_LI72_EMEP");

        if (F_H2O_LI72_EMEP != null) {
            setF_H2O_LI72_EMEP(F_H2O_LI72_EMEP);
        }

        Integer Qc_H2O_LI72 = (Integer) attributes.get("Qc_H2O_LI72");

        if (Qc_H2O_LI72 != null) {
            setQc_H2O_LI72(Qc_H2O_LI72);
        }

        Integer Qc_H2O_LI72_EMEP = (Integer) attributes.get("Qc_H2O_LI72_EMEP");

        if (Qc_H2O_LI72_EMEP != null) {
            setQc_H2O_LI72_EMEP(Qc_H2O_LI72_EMEP);
        }

        Float F_H2O_PICA = (Float) attributes.get("F_H2O_PICA");

        if (F_H2O_PICA != null) {
            setF_H2O_PICA(F_H2O_PICA);
        }

        Integer F_H2O_PICA_EMEP = (Integer) attributes.get("F_H2O_PICA_EMEP");

        if (F_H2O_PICA_EMEP != null) {
            setF_H2O_PICA_EMEP(F_H2O_PICA_EMEP);
        }

        Integer Qc_H2O_PICA = (Integer) attributes.get("Qc_H2O_PICA");

        if (Qc_H2O_PICA != null) {
            setQc_H2O_PICA(Qc_H2O_PICA);
        }

        Integer Qc_H2O_PICA_EMEP = (Integer) attributes.get("Qc_H2O_PICA_EMEP");

        if (Qc_H2O_PICA_EMEP != null) {
            setQc_H2O_PICA_EMEP(Qc_H2O_PICA_EMEP);
        }

        Float LE_LI72 = (Float) attributes.get("LE_LI72");

        if (LE_LI72 != null) {
            setLE_LI72(LE_LI72);
        }

        Integer LE_LI72_EMEP = (Integer) attributes.get("LE_LI72_EMEP");

        if (LE_LI72_EMEP != null) {
            setLE_LI72_EMEP(LE_LI72_EMEP);
        }

        Float LE_PICA = (Float) attributes.get("LE_PICA");

        if (LE_PICA != null) {
            setLE_PICA(LE_PICA);
        }

        Integer LE_PICA_EMEP = (Integer) attributes.get("LE_PICA_EMEP");

        if (LE_PICA_EMEP != null) {
            setLE_PICA_EMEP(LE_PICA_EMEP);
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

        Float av_c_LI72 = (Float) attributes.get("av_c_LI72");

        if (av_c_LI72 != null) {
            setAv_c_LI72(av_c_LI72);
        }

        Integer av_c_LI72_EMEP = (Integer) attributes.get("av_c_LI72_EMEP");

        if (av_c_LI72_EMEP != null) {
            setAv_c_LI72_EMEP(av_c_LI72_EMEP);
        }

        Float av_h_LI72 = (Float) attributes.get("av_h_LI72");

        if (av_h_LI72 != null) {
            setAv_h_LI72(av_h_LI72);
        }

        Integer av_h_LI72_EMEP = (Integer) attributes.get("av_h_LI72_EMEP");

        if (av_h_LI72_EMEP != null) {
            setAv_h_LI72_EMEP(av_h_LI72_EMEP);
        }

        Float av_h_PICA = (Float) attributes.get("av_h_PICA");

        if (av_h_PICA != null) {
            setAv_h_PICA(av_h_PICA);
        }

        Integer av_h_PICA_EMEP = (Integer) attributes.get("av_h_PICA_EMEP");

        if (av_h_PICA_EMEP != null) {
            setAv_h_PICA_EMEP(av_h_PICA_EMEP);
        }

        Float av_CH4 = (Float) attributes.get("av_CH4");

        if (av_CH4 != null) {
            setAv_CH4(av_CH4);
        }

        Integer av_CH4_EMEP = (Integer) attributes.get("av_CH4_EMEP");

        if (av_CH4_EMEP != null) {
            setAv_CH4_EMEP(av_CH4_EMEP);
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

        Float std_c_LI72 = (Float) attributes.get("std_c_LI72");

        if (std_c_LI72 != null) {
            setStd_c_LI72(std_c_LI72);
        }

        Integer std_c_LI72_EMEP = (Integer) attributes.get("std_c_LI72_EMEP");

        if (std_c_LI72_EMEP != null) {
            setStd_c_LI72_EMEP(std_c_LI72_EMEP);
        }

        Float std_h_LI72 = (Float) attributes.get("std_h_LI72");

        if (std_h_LI72 != null) {
            setStd_h_LI72(std_h_LI72);
        }

        Integer std_h_LI72_EMEP = (Integer) attributes.get("std_h_LI72_EMEP");

        if (std_h_LI72_EMEP != null) {
            setStd_h_LI72_EMEP(std_h_LI72_EMEP);
        }

        Float std_h_PICA = (Float) attributes.get("std_h_PICA");

        if (std_h_PICA != null) {
            setStd_h_PICA(std_h_PICA);
        }

        Integer std_h_PICA_EMEP = (Integer) attributes.get("std_h_PICA_EMEP");

        if (std_h_PICA_EMEP != null) {
            setStd_h_PICA_EMEP(std_h_PICA_EMEP);
        }

        Float std_CH4 = (Float) attributes.get("std_CH4");

        if (std_CH4 != null) {
            setStd_CH4(std_CH4);
        }

        Integer std_CH4_EMEP = (Integer) attributes.get("std_CH4_EMEP");

        if (std_CH4_EMEP != null) {
            setStd_CH4_EMEP(std_CH4_EMEP);
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

        Float Covs_u = (Float) attributes.get("Covs_u");

        if (Covs_u != null) {
            setCovs_u(Covs_u);
        }

        Integer Covs_u_EMEP = (Integer) attributes.get("Covs_u_EMEP");

        if (Covs_u_EMEP != null) {
            setCovs_u_EMEP(Covs_u_EMEP);
        }

        Float Covs_v = (Float) attributes.get("Covs_v");

        if (Covs_v != null) {
            setCovs_v(Covs_v);
        }

        Integer Covs_v_EMEP = (Integer) attributes.get("Covs_v_EMEP");

        if (Covs_v_EMEP != null) {
            setCovs_v_EMEP(Covs_v_EMEP);
        }

        Float Covs_Ts = (Float) attributes.get("Covs_Ts");

        if (Covs_Ts != null) {
            setCovs_Ts(Covs_Ts);
        }

        Integer Covs_Ts_EMEP = (Integer) attributes.get("Covs_Ts_EMEP");

        if (Covs_Ts_EMEP != null) {
            setCovs_Ts_EMEP(Covs_Ts_EMEP);
        }

        Float Covs_CO2_LI72 = (Float) attributes.get("Covs_CO2_LI72");

        if (Covs_CO2_LI72 != null) {
            setCovs_CO2_LI72(Covs_CO2_LI72);
        }

        Integer Covs_CO2_LI72_EMEP = (Integer) attributes.get(
                "Covs_CO2_LI72_EMEP");

        if (Covs_CO2_LI72_EMEP != null) {
            setCovs_CO2_LI72_EMEP(Covs_CO2_LI72_EMEP);
        }

        Float Covs_H2O_LI72 = (Float) attributes.get("Covs_H2O_LI72");

        if (Covs_H2O_LI72 != null) {
            setCovs_H2O_LI72(Covs_H2O_LI72);
        }

        Integer Covs_H2O_LI72_EMEP = (Integer) attributes.get(
                "Covs_H2O_LI72_EMEP");

        if (Covs_H2O_LI72_EMEP != null) {
            setCovs_H2O_LI72_EMEP(Covs_H2O_LI72_EMEP);
        }

        Float Covs_T_C_LI72 = (Float) attributes.get("Covs_T_C_LI72");

        if (Covs_T_C_LI72 != null) {
            setCovs_T_C_LI72(Covs_T_C_LI72);
        }

        Integer Covs_T_C_LI72_EMEP = (Integer) attributes.get(
                "Covs_T_C_LI72_EMEP");

        if (Covs_T_C_LI72_EMEP != null) {
            setCovs_T_C_LI72_EMEP(Covs_T_C_LI72_EMEP);
        }

        Float Covs_P_C_LI72 = (Float) attributes.get("Covs_P_C_LI72");

        if (Covs_P_C_LI72 != null) {
            setCovs_P_C_LI72(Covs_P_C_LI72);
        }

        Integer Covs_P_C_LI72_EMEP = (Integer) attributes.get(
                "Covs_P_C_LI72_EMEP");

        if (Covs_P_C_LI72_EMEP != null) {
            setCovs_P_C_LI72_EMEP(Covs_P_C_LI72_EMEP);
        }

        Float Covs_H2O_PICA = (Float) attributes.get("Covs_H2O_PICA");

        if (Covs_H2O_PICA != null) {
            setCovs_H2O_PICA(Covs_H2O_PICA);
        }

        Integer Covs_H2O_PICA_EMEP = (Integer) attributes.get(
                "Covs_H2O_PICA_EMEP");

        if (Covs_H2O_PICA_EMEP != null) {
            setCovs_H2O_PICA_EMEP(Covs_H2O_PICA_EMEP);
        }

        Float Covs_CH4_PICA = (Float) attributes.get("Covs_CH4_PICA");

        if (Covs_CH4_PICA != null) {
            setCovs_CH4_PICA(Covs_CH4_PICA);
        }

        Integer Covs_CH4_PICA_EMEP = (Integer) attributes.get(
                "Covs_CH4_PICA_EMEP");

        if (Covs_CH4_PICA_EMEP != null) {
            setCovs_CH4_PICA_EMEP(Covs_CH4_PICA_EMEP);
        }

        Float licor_t_av = (Float) attributes.get("licor_t_av");

        if (licor_t_av != null) {
            setLicor_t_av(licor_t_av);
        }

        Integer licor_t_av_EMEP = (Integer) attributes.get("licor_t_av_EMEP");

        if (licor_t_av_EMEP != null) {
            setLicor_t_av_EMEP(licor_t_av_EMEP);
        }

        Float licor_p_av = (Float) attributes.get("licor_p_av");

        if (licor_p_av != null) {
            setLicor_p_av(licor_p_av);
        }

        Integer licor_p_av_EMEP = (Integer) attributes.get("licor_p_av_EMEP");

        if (licor_p_av_EMEP != null) {
            setLicor_p_av_EMEP(licor_p_av_EMEP);
        }

        Float licor_t_std = (Float) attributes.get("licor_t_std");

        if (licor_t_std != null) {
            setLicor_t_std(licor_t_std);
        }

        Integer licor_t_std_EMEP = (Integer) attributes.get("licor_t_std_EMEP");

        if (licor_t_std_EMEP != null) {
            setLicor_t_std_EMEP(licor_t_std_EMEP);
        }

        Float licor_p_std = (Float) attributes.get("licor_p_std");

        if (licor_p_std != null) {
            setLicor_p_std(licor_p_std);
        }

        Integer licor_p_std_EMEP = (Integer) attributes.get("licor_p_std_EMEP");

        if (licor_p_std_EMEP != null) {
            setLicor_p_std_EMEP(licor_p_std_EMEP);
        }

        Float c_lag_LI72 = (Float) attributes.get("c_lag_LI72");

        if (c_lag_LI72 != null) {
            setC_lag_LI72(c_lag_LI72);
        }

        Integer c_lag_LI72_EMEP = (Integer) attributes.get("c_lag_LI72_EMEP");

        if (c_lag_LI72_EMEP != null) {
            setC_lag_LI72_EMEP(c_lag_LI72_EMEP);
        }

        Float h_lag_LI72 = (Float) attributes.get("h_lag_LI72");

        if (h_lag_LI72 != null) {
            setH_lag_LI72(h_lag_LI72);
        }

        Integer h_lag_LI72_EMEP = (Integer) attributes.get("h_lag_LI72_EMEP");

        if (h_lag_LI72_EMEP != null) {
            setH_lag_LI72_EMEP(h_lag_LI72_EMEP);
        }

        Float t_lag_LI72 = (Float) attributes.get("t_lag_LI72");

        if (t_lag_LI72 != null) {
            setT_lag_LI72(t_lag_LI72);
        }

        Integer t_lag_LI72_EMEP = (Integer) attributes.get("t_lag_LI72_EMEP");

        if (t_lag_LI72_EMEP != null) {
            setT_lag_LI72_EMEP(t_lag_LI72_EMEP);
        }

        Float p_lag_LI72 = (Float) attributes.get("p_lag_LI72");

        if (p_lag_LI72 != null) {
            setP_lag_LI72(p_lag_LI72);
        }

        Integer p_lag_LI72_EMEP = (Integer) attributes.get("p_lag_LI72_EMEP");

        if (p_lag_LI72_EMEP != null) {
            setP_lag_LI72_EMEP(p_lag_LI72_EMEP);
        }

        Float h_lag_PICA = (Float) attributes.get("h_lag_PICA");

        if (h_lag_PICA != null) {
            setH_lag_PICA(h_lag_PICA);
        }

        Integer h_lag_PICA_EMEP = (Integer) attributes.get("h_lag_PICA_EMEP");

        if (h_lag_PICA_EMEP != null) {
            setH_lag_PICA_EMEP(h_lag_PICA_EMEP);
        }

        Float CH4_lag = (Float) attributes.get("CH4_lag");

        if (CH4_lag != null) {
            setCH4_lag(CH4_lag);
        }

        Integer CH4_lag_EMEP = (Integer) attributes.get("CH4_lag_EMEP");

        if (CH4_lag_EMEP != null) {
            setCH4_lag_EMEP(CH4_lag_EMEP);
        }

        Integer Nspikes_u = (Integer) attributes.get("Nspikes_u");

        if (Nspikes_u != null) {
            setNspikes_u(Nspikes_u);
        }

        Integer Nspikes_u_EMEP = (Integer) attributes.get("Nspikes_u_EMEP");

        if (Nspikes_u_EMEP != null) {
            setNspikes_u_EMEP(Nspikes_u_EMEP);
        }

        Integer Nspikes_v = (Integer) attributes.get("Nspikes_v");

        if (Nspikes_v != null) {
            setNspikes_v(Nspikes_v);
        }

        Integer Nspikes_v_EMEP = (Integer) attributes.get("Nspikes_v_EMEP");

        if (Nspikes_v_EMEP != null) {
            setNspikes_v_EMEP(Nspikes_v_EMEP);
        }

        Integer Nspikes_w = (Integer) attributes.get("Nspikes_w");

        if (Nspikes_w != null) {
            setNspikes_w(Nspikes_w);
        }

        Integer Nspikes_w_EMEP = (Integer) attributes.get("Nspikes_w_EMEP");

        if (Nspikes_w_EMEP != null) {
            setNspikes_w_EMEP(Nspikes_w_EMEP);
        }

        Integer Nspikes_Ts = (Integer) attributes.get("Nspikes_Ts");

        if (Nspikes_Ts != null) {
            setNspikes_Ts(Nspikes_Ts);
        }

        Integer Nspikes_Ts_EMEP = (Integer) attributes.get("Nspikes_Ts_EMEP");

        if (Nspikes_Ts_EMEP != null) {
            setNspikes_Ts_EMEP(Nspikes_Ts_EMEP);
        }

        Integer Nspikes_CO2_LI72 = (Integer) attributes.get("Nspikes_CO2_LI72");

        if (Nspikes_CO2_LI72 != null) {
            setNspikes_CO2_LI72(Nspikes_CO2_LI72);
        }

        Integer Nspikes_CO2_LI72_EMEP = (Integer) attributes.get(
                "Nspikes_CO2_LI72_EMEP");

        if (Nspikes_CO2_LI72_EMEP != null) {
            setNspikes_CO2_LI72_EMEP(Nspikes_CO2_LI72_EMEP);
        }

        Integer Nspikes_H2O_LI72 = (Integer) attributes.get("Nspikes_H2O_LI72");

        if (Nspikes_H2O_LI72 != null) {
            setNspikes_H2O_LI72(Nspikes_H2O_LI72);
        }

        Integer Nspikes_H2O_LI72_EMEP = (Integer) attributes.get(
                "Nspikes_H2O_LI72_EMEP");

        if (Nspikes_H2O_LI72_EMEP != null) {
            setNspikes_H2O_LI72_EMEP(Nspikes_H2O_LI72_EMEP);
        }

        Integer Nspikes_T_C_LI72 = (Integer) attributes.get("Nspikes_T_C_LI72");

        if (Nspikes_T_C_LI72 != null) {
            setNspikes_T_C_LI72(Nspikes_T_C_LI72);
        }

        Integer Nspikes_T_C_LI72_EMEP = (Integer) attributes.get(
                "Nspikes_T_C_LI72_EMEP");

        if (Nspikes_T_C_LI72_EMEP != null) {
            setNspikes_T_C_LI72_EMEP(Nspikes_T_C_LI72_EMEP);
        }

        Integer Nspikes_P_C_LI72 = (Integer) attributes.get("Nspikes_P_C_LI72");

        if (Nspikes_P_C_LI72 != null) {
            setNspikes_P_C_LI72(Nspikes_P_C_LI72);
        }

        Integer Nspikes_P_C_LI72_EMEP = (Integer) attributes.get(
                "Nspikes_P_C_LI72_EMEP");

        if (Nspikes_P_C_LI72_EMEP != null) {
            setNspikes_P_C_LI72_EMEP(Nspikes_P_C_LI72_EMEP);
        }

        Integer Nspikes_H2O_PICA = (Integer) attributes.get("Nspikes_H2O_PICA");

        if (Nspikes_H2O_PICA != null) {
            setNspikes_H2O_PICA(Nspikes_H2O_PICA);
        }

        Integer Nspikes_H2O_PICA_EMEP = (Integer) attributes.get(
                "Nspikes_H2O_PICA_EMEP");

        if (Nspikes_H2O_PICA_EMEP != null) {
            setNspikes_H2O_PICA_EMEP(Nspikes_H2O_PICA_EMEP);
        }

        Integer Nspikes_CH4_PICA = (Integer) attributes.get("Nspikes_CH4_PICA");

        if (Nspikes_CH4_PICA != null) {
            setNspikes_CH4_PICA(Nspikes_CH4_PICA);
        }

        Integer Nspikes_CH4_PICA_EMEP = (Integer) attributes.get(
                "Nspikes_CH4_PICA_EMEP");

        if (Nspikes_CH4_PICA_EMEP != null) {
            setNspikes_CH4_PICA_EMEP(Nspikes_CH4_PICA_EMEP);
        }

        Float FI_u = (Float) attributes.get("FI_u");

        if (FI_u != null) {
            setFI_u(FI_u);
        }

        Integer FI_u_EMEP = (Integer) attributes.get("FI_u_EMEP");

        if (FI_u_EMEP != null) {
            setFI_u_EMEP(FI_u_EMEP);
        }

        Float FI_Ts = (Float) attributes.get("FI_Ts");

        if (FI_Ts != null) {
            setFI_Ts(FI_Ts);
        }

        Integer FI_Ts_EMEP = (Integer) attributes.get("FI_Ts_EMEP");

        if (FI_Ts_EMEP != null) {
            setFI_Ts_EMEP(FI_Ts_EMEP);
        }

        Float FI_CO2_LI72 = (Float) attributes.get("FI_CO2_LI72");

        if (FI_CO2_LI72 != null) {
            setFI_CO2_LI72(FI_CO2_LI72);
        }

        Integer FI_CO2_LI72_EMEP = (Integer) attributes.get("FI_CO2_LI72_EMEP");

        if (FI_CO2_LI72_EMEP != null) {
            setFI_CO2_LI72_EMEP(FI_CO2_LI72_EMEP);
        }

        Float FI_H2O_LI72 = (Float) attributes.get("FI_H2O_LI72");

        if (FI_H2O_LI72 != null) {
            setFI_H2O_LI72(FI_H2O_LI72);
        }

        Integer FI_H2O_LI72_EMEP = (Integer) attributes.get("FI_H2O_LI72_EMEP");

        if (FI_H2O_LI72_EMEP != null) {
            setFI_H2O_LI72_EMEP(FI_H2O_LI72_EMEP);
        }

        Float FI_CH4_PICA = (Float) attributes.get("FI_CH4_PICA");

        if (FI_CH4_PICA != null) {
            setFI_CH4_PICA(FI_CH4_PICA);
        }

        Integer FI_CH4_PICA_EMEP = (Integer) attributes.get("FI_CH4_PICA_EMEP");

        if (FI_CH4_PICA_EMEP != null) {
            setFI_CH4_PICA_EMEP(FI_CH4_PICA_EMEP);
        }

        Float FI_H2O_PICA = (Float) attributes.get("FI_H2O_PICA");

        if (FI_H2O_PICA != null) {
            setFI_H2O_PICA(FI_H2O_PICA);
        }

        Integer FI_H2O_PICA_EMEP = (Integer) attributes.get("FI_H2O_PICA_EMEP");

        if (FI_H2O_PICA_EMEP != null) {
            setFI_H2O_PICA_EMEP(FI_H2O_PICA_EMEP);
        }

        Float FST_u = (Float) attributes.get("FST_u");

        if (FST_u != null) {
            setFST_u(FST_u);
        }

        Integer FST_u_EMEP = (Integer) attributes.get("FST_u_EMEP");

        if (FST_u_EMEP != null) {
            setFST_u_EMEP(FST_u_EMEP);
        }

        Float FST_Ts = (Float) attributes.get("FST_Ts");

        if (FST_Ts != null) {
            setFST_Ts(FST_Ts);
        }

        Integer FST_Ts_EMEP = (Integer) attributes.get("FST_Ts_EMEP");

        if (FST_Ts_EMEP != null) {
            setFST_Ts_EMEP(FST_Ts_EMEP);
        }

        Float FST_CO2_LI72 = (Float) attributes.get("FST_CO2_LI72");

        if (FST_CO2_LI72 != null) {
            setFST_CO2_LI72(FST_CO2_LI72);
        }

        Integer FST_CO2_LI72_EMEP = (Integer) attributes.get(
                "FST_CO2_LI72_EMEP");

        if (FST_CO2_LI72_EMEP != null) {
            setFST_CO2_LI72_EMEP(FST_CO2_LI72_EMEP);
        }

        Float FST_H2O_LI72 = (Float) attributes.get("FST_H2O_LI72");

        if (FST_H2O_LI72 != null) {
            setFST_H2O_LI72(FST_H2O_LI72);
        }

        Integer FST_H2O_LI72_EMEP = (Integer) attributes.get(
                "FST_H2O_LI72_EMEP");

        if (FST_H2O_LI72_EMEP != null) {
            setFST_H2O_LI72_EMEP(FST_H2O_LI72_EMEP);
        }

        Float FST_CH4_PICA = (Float) attributes.get("FST_CH4_PICA");

        if (FST_CH4_PICA != null) {
            setFST_CH4_PICA(FST_CH4_PICA);
        }

        Integer FST_CH4_PICA_EMEP = (Integer) attributes.get(
                "FST_CH4_PICA_EMEP");

        if (FST_CH4_PICA_EMEP != null) {
            setFST_CH4_PICA_EMEP(FST_CH4_PICA_EMEP);
        }

        Float FST_H2O_PICA = (Float) attributes.get("FST_H2O_PICA");

        if (FST_H2O_PICA != null) {
            setFST_H2O_PICA(FST_H2O_PICA);
        }

        Integer FST_H2O_PICA_EMEP = (Integer) attributes.get(
                "FST_H2O_PICA_EMEP");

        if (FST_H2O_PICA_EMEP != null) {
            setFST_H2O_PICA_EMEP(FST_H2O_PICA_EMEP);
        }

        Float RFE_u = (Float) attributes.get("RFE_u");

        if (RFE_u != null) {
            setRFE_u(RFE_u);
        }

        Integer RFE_u_EMEP = (Integer) attributes.get("RFE_u_EMEP");

        if (RFE_u_EMEP != null) {
            setRFE_u_EMEP(RFE_u_EMEP);
        }

        Float RFE_Ts = (Float) attributes.get("RFE_Ts");

        if (RFE_Ts != null) {
            setRFE_Ts(RFE_Ts);
        }

        Integer RFE_Ts_EMEP = (Integer) attributes.get("RFE_Ts_EMEP");

        if (RFE_Ts_EMEP != null) {
            setRFE_Ts_EMEP(RFE_Ts_EMEP);
        }

        Float RFE_CO2_LI72 = (Float) attributes.get("RFE_CO2_LI72");

        if (RFE_CO2_LI72 != null) {
            setRFE_CO2_LI72(RFE_CO2_LI72);
        }

        Integer RFE_CO2_LI72_EMEP = (Integer) attributes.get(
                "RFE_CO2_LI72_EMEP");

        if (RFE_CO2_LI72_EMEP != null) {
            setRFE_CO2_LI72_EMEP(RFE_CO2_LI72_EMEP);
        }

        Float RFE_H2O_LI72 = (Float) attributes.get("RFE_H2O_LI72");

        if (RFE_H2O_LI72 != null) {
            setRFE_H2O_LI72(RFE_H2O_LI72);
        }

        Integer RFE_H2O_LI72_EMEP = (Integer) attributes.get(
                "RFE_H2O_LI72_EMEP");

        if (RFE_H2O_LI72_EMEP != null) {
            setRFE_H2O_LI72_EMEP(RFE_H2O_LI72_EMEP);
        }

        Float RFE_CH4_PICA = (Float) attributes.get("RFE_CH4_PICA");

        if (RFE_CH4_PICA != null) {
            setRFE_CH4_PICA(RFE_CH4_PICA);
        }

        Integer RFE_CH4_PICA_EMEP = (Integer) attributes.get(
                "RFE_CH4_PICA_EMEP");

        if (RFE_CH4_PICA_EMEP != null) {
            setRFE_CH4_PICA_EMEP(RFE_CH4_PICA_EMEP);
        }

        Float RFE_H2O_PICA = (Float) attributes.get("RFE_H2O_PICA");

        if (RFE_H2O_PICA != null) {
            setRFE_H2O_PICA(RFE_H2O_PICA);
        }

        Integer RFE_H2O_PICA_EMEP = (Integer) attributes.get(
                "RFE_H2O_PICA_EMEP");

        if (RFE_H2O_PICA_EMEP != null) {
            setRFE_H2O_PICA_EMEP(RFE_H2O_PICA_EMEP);
        }

        Float FA_u = (Float) attributes.get("FA_u");

        if (FA_u != null) {
            setFA_u(FA_u);
        }

        Integer FA_u_EMEP = (Integer) attributes.get("FA_u_EMEP");

        if (FA_u_EMEP != null) {
            setFA_u_EMEP(FA_u_EMEP);
        }

        Float FA_v = (Float) attributes.get("FA_v");

        if (FA_v != null) {
            setFA_v(FA_v);
        }

        Integer FA_v_EMEP = (Integer) attributes.get("FA_v_EMEP");

        if (FA_v_EMEP != null) {
            setFA_v_EMEP(FA_v_EMEP);
        }

        Float FA_Ts = (Float) attributes.get("FA_Ts");

        if (FA_Ts != null) {
            setFA_Ts(FA_Ts);
        }

        Integer FA_Ts_EMEP = (Integer) attributes.get("FA_Ts_EMEP");

        if (FA_Ts_EMEP != null) {
            setFA_Ts_EMEP(FA_Ts_EMEP);
        }

        Float FA_CO2_LI72 = (Float) attributes.get("FA_CO2_LI72");

        if (FA_CO2_LI72 != null) {
            setFA_CO2_LI72(FA_CO2_LI72);
        }

        Integer FA_CO2_LI72_EMEP = (Integer) attributes.get("FA_CO2_LI72_EMEP");

        if (FA_CO2_LI72_EMEP != null) {
            setFA_CO2_LI72_EMEP(FA_CO2_LI72_EMEP);
        }

        Float FA_H2O_LI72 = (Float) attributes.get("FA_H2O_LI72");

        if (FA_H2O_LI72 != null) {
            setFA_H2O_LI72(FA_H2O_LI72);
        }

        Integer FA_H2O_LI72_EMEP = (Integer) attributes.get("FA_H2O_LI72_EMEP");

        if (FA_H2O_LI72_EMEP != null) {
            setFA_H2O_LI72_EMEP(FA_H2O_LI72_EMEP);
        }

        Float FA_CH4_PICA = (Float) attributes.get("FA_CH4_PICA");

        if (FA_CH4_PICA != null) {
            setFA_CH4_PICA(FA_CH4_PICA);
        }

        Integer FA_CH4_PICA_EMEP = (Integer) attributes.get("FA_CH4_PICA_EMEP");

        if (FA_CH4_PICA_EMEP != null) {
            setFA_CH4_PICA_EMEP(FA_CH4_PICA_EMEP);
        }

        Float FA_H2O_PICA = (Float) attributes.get("FA_H2O_PICA");

        if (FA_H2O_PICA != null) {
            setFA_H2O_PICA(FA_H2O_PICA);
        }

        Integer FA_H2O_PICA_EMEP = (Integer) attributes.get("FA_H2O_PICA_EMEP");

        if (FA_H2O_PICA_EMEP != null) {
            setFA_H2O_PICA_EMEP(FA_H2O_PICA_EMEP);
        }

        Float covsvar_u = (Float) attributes.get("covsvar_u");

        if (covsvar_u != null) {
            setCovsvar_u(covsvar_u);
        }

        Integer covsvar_u_EMEP = (Integer) attributes.get("covsvar_u_EMEP");

        if (covsvar_u_EMEP != null) {
            setCovsvar_u_EMEP(covsvar_u_EMEP);
        }

        Float covsvar_v = (Float) attributes.get("covsvar_v");

        if (covsvar_v != null) {
            setCovsvar_v(covsvar_v);
        }

        Integer covsvar_v_EMEP = (Integer) attributes.get("covsvar_v_EMEP");

        if (covsvar_v_EMEP != null) {
            setCovsvar_v_EMEP(covsvar_v_EMEP);
        }

        Float covsvar_Ts = (Float) attributes.get("covsvar_Ts");

        if (covsvar_Ts != null) {
            setCovsvar_Ts(covsvar_Ts);
        }

        Integer covsvar_Ts_EMEP = (Integer) attributes.get("covsvar_Ts_EMEP");

        if (covsvar_Ts_EMEP != null) {
            setCovsvar_Ts_EMEP(covsvar_Ts_EMEP);
        }

        Float covsvar_CO2_LI72 = (Float) attributes.get("covsvar_CO2_LI72");

        if (covsvar_CO2_LI72 != null) {
            setCovsvar_CO2_LI72(covsvar_CO2_LI72);
        }

        Integer covsvar_CO2_LI72_EMEP = (Integer) attributes.get(
                "covsvar_CO2_LI72_EMEP");

        if (covsvar_CO2_LI72_EMEP != null) {
            setCovsvar_CO2_LI72_EMEP(covsvar_CO2_LI72_EMEP);
        }

        Float covsvar_H2O_LI72 = (Float) attributes.get("covsvar_H2O_LI72");

        if (covsvar_H2O_LI72 != null) {
            setCovsvar_H2O_LI72(covsvar_H2O_LI72);
        }

        Integer covsvar_H2O_LI72_EMEP = (Integer) attributes.get(
                "covsvar_H2O_LI72_EMEP");

        if (covsvar_H2O_LI72_EMEP != null) {
            setCovsvar_H2O_LI72_EMEP(covsvar_H2O_LI72_EMEP);
        }

        Float covsvar_CH4_PICA = (Float) attributes.get("covsvar_CH4_PICA");

        if (covsvar_CH4_PICA != null) {
            setCovsvar_CH4_PICA(covsvar_CH4_PICA);
        }

        Integer covsvar_CH4_PICA_EMEP = (Integer) attributes.get(
                "covsvar_CH4_PICA_EMEP");

        if (covsvar_CH4_PICA_EMEP != null) {
            setCovsvar_CH4_PICA_EMEP(covsvar_CH4_PICA_EMEP);
        }

        Float covsvar_H2O_PICA = (Float) attributes.get("covsvar_H2O_PICA");

        if (covsvar_H2O_PICA != null) {
            setCovsvar_H2O_PICA(covsvar_H2O_PICA);
        }

        Integer covsvar_H2O_PICA_EMEP = (Integer) attributes.get(
                "covsvar_H2O_PICA_EMEP");

        if (covsvar_H2O_PICA_EMEP != null) {
            setCovsvar_H2O_PICA_EMEP(covsvar_H2O_PICA_EMEP);
        }

        Float SKx_u = (Float) attributes.get("SKx_u");

        if (SKx_u != null) {
            setSKx_u(SKx_u);
        }

        Integer SKx_u_EMEP = (Integer) attributes.get("SKx_u_EMEP");

        if (SKx_u_EMEP != null) {
            setSKx_u_EMEP(SKx_u_EMEP);
        }

        Float SKx_v = (Float) attributes.get("SKx_v");

        if (SKx_v != null) {
            setSKx_v(SKx_v);
        }

        Integer SKx_v_EMEP = (Integer) attributes.get("SKx_v_EMEP");

        if (SKx_v_EMEP != null) {
            setSKx_v_EMEP(SKx_v_EMEP);
        }

        Float SKx_w = (Float) attributes.get("SKx_w");

        if (SKx_w != null) {
            setSKx_w(SKx_w);
        }

        Integer SKx_w_EMEP = (Integer) attributes.get("SKx_w_EMEP");

        if (SKx_w_EMEP != null) {
            setSKx_w_EMEP(SKx_w_EMEP);
        }

        Float SKx_Ts = (Float) attributes.get("SKx_Ts");

        if (SKx_Ts != null) {
            setSKx_Ts(SKx_Ts);
        }

        Integer SKx_Ts_EMEP = (Integer) attributes.get("SKx_Ts_EMEP");

        if (SKx_Ts_EMEP != null) {
            setSKx_Ts_EMEP(SKx_Ts_EMEP);
        }

        Float SKx_CO2_LI72 = (Float) attributes.get("SKx_CO2_LI72");

        if (SKx_CO2_LI72 != null) {
            setSKx_CO2_LI72(SKx_CO2_LI72);
        }

        Integer SKx_CO2_LI72_EMEP = (Integer) attributes.get(
                "SKx_CO2_LI72_EMEP");

        if (SKx_CO2_LI72_EMEP != null) {
            setSKx_CO2_LI72_EMEP(SKx_CO2_LI72_EMEP);
        }

        Float SKx_H2O_LI72 = (Float) attributes.get("SKx_H2O_LI72");

        if (SKx_H2O_LI72 != null) {
            setSKx_H2O_LI72(SKx_H2O_LI72);
        }

        Integer SKx_H2O_LI72_EMEP = (Integer) attributes.get(
                "SKx_H2O_LI72_EMEP");

        if (SKx_H2O_LI72_EMEP != null) {
            setSKx_H2O_LI72_EMEP(SKx_H2O_LI72_EMEP);
        }

        Float SKx_CH4_PICA = (Float) attributes.get("SKx_CH4_PICA");

        if (SKx_CH4_PICA != null) {
            setSKx_CH4_PICA(SKx_CH4_PICA);
        }

        Integer SKx_CH4_PICA_EMEP = (Integer) attributes.get(
                "SKx_CH4_PICA_EMEP");

        if (SKx_CH4_PICA_EMEP != null) {
            setSKx_CH4_PICA_EMEP(SKx_CH4_PICA_EMEP);
        }

        Float SKx_H2O_PICA = (Float) attributes.get("SKx_H2O_PICA");

        if (SKx_H2O_PICA != null) {
            setSKx_H2O_PICA(SKx_H2O_PICA);
        }

        Integer SKx_H2O_PICA_EMEP = (Integer) attributes.get(
                "SKx_H2O_PICA_EMEP");

        if (SKx_H2O_PICA_EMEP != null) {
            setSKx_H2O_PICA_EMEP(SKx_H2O_PICA_EMEP);
        }

        Float KUx_u = (Float) attributes.get("KUx_u");

        if (KUx_u != null) {
            setKUx_u(KUx_u);
        }

        Integer KUx_u_EMEP = (Integer) attributes.get("KUx_u_EMEP");

        if (KUx_u_EMEP != null) {
            setKUx_u_EMEP(KUx_u_EMEP);
        }

        Float KUx_v = (Float) attributes.get("KUx_v");

        if (KUx_v != null) {
            setKUx_v(KUx_v);
        }

        Integer KUx_v_EMEP = (Integer) attributes.get("KUx_v_EMEP");

        if (KUx_v_EMEP != null) {
            setKUx_v_EMEP(KUx_v_EMEP);
        }

        Float KUx_w = (Float) attributes.get("KUx_w");

        if (KUx_w != null) {
            setKUx_w(KUx_w);
        }

        Integer KUx_w_EMEP = (Integer) attributes.get("KUx_w_EMEP");

        if (KUx_w_EMEP != null) {
            setKUx_w_EMEP(KUx_w_EMEP);
        }

        Float KUx_Ts = (Float) attributes.get("KUx_Ts");

        if (KUx_Ts != null) {
            setKUx_Ts(KUx_Ts);
        }

        Integer KUx_Ts_EMEP = (Integer) attributes.get("KUx_Ts_EMEP");

        if (KUx_Ts_EMEP != null) {
            setKUx_Ts_EMEP(KUx_Ts_EMEP);
        }

        Float KUx_CO2_LI72 = (Float) attributes.get("KUx_CO2_LI72");

        if (KUx_CO2_LI72 != null) {
            setKUx_CO2_LI72(KUx_CO2_LI72);
        }

        Integer KUx_CO2_LI72_EMEP = (Integer) attributes.get(
                "KUx_CO2_LI72_EMEP");

        if (KUx_CO2_LI72_EMEP != null) {
            setKUx_CO2_LI72_EMEP(KUx_CO2_LI72_EMEP);
        }

        Float KUx_H2O_LI72 = (Float) attributes.get("KUx_H2O_LI72");

        if (KUx_H2O_LI72 != null) {
            setKUx_H2O_LI72(KUx_H2O_LI72);
        }

        Integer KUx_H2O_LI72_EMEP = (Integer) attributes.get(
                "KUx_H2O_LI72_EMEP");

        if (KUx_H2O_LI72_EMEP != null) {
            setKUx_H2O_LI72_EMEP(KUx_H2O_LI72_EMEP);
        }

        Float KUx_CH4_PICA = (Float) attributes.get("KUx_CH4_PICA");

        if (KUx_CH4_PICA != null) {
            setKUx_CH4_PICA(KUx_CH4_PICA);
        }

        Integer KUx_CH4_PICA_EMEP = (Integer) attributes.get(
                "KUx_CH4_PICA_EMEP");

        if (KUx_CH4_PICA_EMEP != null) {
            setKUx_CH4_PICA_EMEP(KUx_CH4_PICA_EMEP);
        }

        Float KUx_H2O_PICA = (Float) attributes.get("KUx_H2O_PICA");

        if (KUx_H2O_PICA != null) {
            setKUx_H2O_PICA(KUx_H2O_PICA);
        }

        Integer KUx_H2O_PICA_EMEP = (Integer) attributes.get(
                "KUx_H2O_PICA_EMEP");

        if (KUx_H2O_PICA_EMEP != null) {
            setKUx_H2O_PICA_EMEP(KUx_H2O_PICA_EMEP);
        }

        Integer overall_qflag_u = (Integer) attributes.get("overall_qflag_u");

        if (overall_qflag_u != null) {
            setOverall_qflag_u(overall_qflag_u);
        }

        Integer overall_qflag_u_EMEP = (Integer) attributes.get(
                "overall_qflag_u_EMEP");

        if (overall_qflag_u_EMEP != null) {
            setOverall_qflag_u_EMEP(overall_qflag_u_EMEP);
        }

        Integer overall_qflag_Ts = (Integer) attributes.get("overall_qflag_Ts");

        if (overall_qflag_Ts != null) {
            setOverall_qflag_Ts(overall_qflag_Ts);
        }

        Integer overall_qflag_Ts_EMEP = (Integer) attributes.get(
                "overall_qflag_Ts_EMEP");

        if (overall_qflag_Ts_EMEP != null) {
            setOverall_qflag_Ts_EMEP(overall_qflag_Ts_EMEP);
        }

        Integer overall_qflag_CO2_LI72 = (Integer) attributes.get(
                "overall_qflag_CO2_LI72");

        if (overall_qflag_CO2_LI72 != null) {
            setOverall_qflag_CO2_LI72(overall_qflag_CO2_LI72);
        }

        Integer overall_qflag_CO2_LI72_EMEP = (Integer) attributes.get(
                "overall_qflag_CO2_LI72_EMEP");

        if (overall_qflag_CO2_LI72_EMEP != null) {
            setOverall_qflag_CO2_LI72_EMEP(overall_qflag_CO2_LI72_EMEP);
        }

        Integer overall_qflag_H2O_LI72 = (Integer) attributes.get(
                "overall_qflag_H2O_LI72");

        if (overall_qflag_H2O_LI72 != null) {
            setOverall_qflag_H2O_LI72(overall_qflag_H2O_LI72);
        }

        Integer overall_qflag_H2O_LI72_EMEP = (Integer) attributes.get(
                "overall_qflag_H2O_LI72_EMEP");

        if (overall_qflag_H2O_LI72_EMEP != null) {
            setOverall_qflag_H2O_LI72_EMEP(overall_qflag_H2O_LI72_EMEP);
        }

        Integer overall_qflag_CH4_PICA = (Integer) attributes.get(
                "overall_qflag_CH4_PICA");

        if (overall_qflag_CH4_PICA != null) {
            setOverall_qflag_CH4_PICA(overall_qflag_CH4_PICA);
        }

        Integer overall_qflag_CH4_PICA_EMEP = (Integer) attributes.get(
                "overall_qflag_CH4_PICA_EMEP");

        if (overall_qflag_CH4_PICA_EMEP != null) {
            setOverall_qflag_CH4_PICA_EMEP(overall_qflag_CH4_PICA_EMEP);
        }

        Integer overall_qflag_H2O_PICA = (Integer) attributes.get(
                "overall_qflag_H2O_PICA");

        if (overall_qflag_H2O_PICA != null) {
            setOverall_qflag_H2O_PICA(overall_qflag_H2O_PICA);
        }

        Integer overall_qflag_H2O_PICA_EMEP = (Integer) attributes.get(
                "overall_qflag_H2O_PICA_EMEP");

        if (overall_qflag_H2O_PICA_EMEP != null) {
            setOverall_qflag_H2O_PICA_EMEP(overall_qflag_H2O_PICA_EMEP);
        }

        Integer ITC_qflag_w = (Integer) attributes.get("ITC_qflag_w");

        if (ITC_qflag_w != null) {
            setITC_qflag_w(ITC_qflag_w);
        }

        Integer ITC_qflag_w_EMEP = (Integer) attributes.get("ITC_qflag_w_EMEP");

        if (ITC_qflag_w_EMEP != null) {
            setITC_qflag_w_EMEP(ITC_qflag_w_EMEP);
        }

        Integer ITC_qflag_u = (Integer) attributes.get("ITC_qflag_u");

        if (ITC_qflag_u != null) {
            setITC_qflag_u(ITC_qflag_u);
        }

        Integer ITC_qflag_u_EMEP = (Integer) attributes.get("ITC_qflag_u_EMEP");

        if (ITC_qflag_u_EMEP != null) {
            setITC_qflag_u_EMEP(ITC_qflag_u_EMEP);
        }

        Integer ITC_qflag_Ts = (Integer) attributes.get("ITC_qflag_Ts");

        if (ITC_qflag_Ts != null) {
            setITC_qflag_Ts(ITC_qflag_Ts);
        }

        Integer ITC_qflag_Ts_EMEP = (Integer) attributes.get(
                "ITC_qflag_Ts_EMEP");

        if (ITC_qflag_Ts_EMEP != null) {
            setITC_qflag_Ts_EMEP(ITC_qflag_Ts_EMEP);
        }

        Integer ITC_qflag_CO2_LI72 = (Integer) attributes.get(
                "ITC_qflag_CO2_LI72");

        if (ITC_qflag_CO2_LI72 != null) {
            setITC_qflag_CO2_LI72(ITC_qflag_CO2_LI72);
        }

        Integer ITC_qflag_CO2_LI72_EMEP = (Integer) attributes.get(
                "ITC_qflag_CO2_LI72_EMEP");

        if (ITC_qflag_CO2_LI72_EMEP != null) {
            setITC_qflag_CO2_LI72_EMEP(ITC_qflag_CO2_LI72_EMEP);
        }

        Integer ITC_qflag_H2O_LI72 = (Integer) attributes.get(
                "ITC_qflag_H2O_LI72");

        if (ITC_qflag_H2O_LI72 != null) {
            setITC_qflag_H2O_LI72(ITC_qflag_H2O_LI72);
        }

        Integer ITC_qflag_H2O_LI72_EMEP = (Integer) attributes.get(
                "ITC_qflag_H2O_LI72_EMEP");

        if (ITC_qflag_H2O_LI72_EMEP != null) {
            setITC_qflag_H2O_LI72_EMEP(ITC_qflag_H2O_LI72_EMEP);
        }

        Integer ITC_qflag_CH4_PICA = (Integer) attributes.get(
                "ITC_qflag_CH4_PICA");

        if (ITC_qflag_CH4_PICA != null) {
            setITC_qflag_CH4_PICA(ITC_qflag_CH4_PICA);
        }

        Integer ITC_qflag_CH4_PICA_EMEP = (Integer) attributes.get(
                "ITC_qflag_CH4_PICA_EMEP");

        if (ITC_qflag_CH4_PICA_EMEP != null) {
            setITC_qflag_CH4_PICA_EMEP(ITC_qflag_CH4_PICA_EMEP);
        }

        Integer ITC_qflag_H2O_PICA = (Integer) attributes.get(
                "ITC_qflag_H2O_PICA");

        if (ITC_qflag_H2O_PICA != null) {
            setITC_qflag_H2O_PICA(ITC_qflag_H2O_PICA);
        }

        Integer ITC_qflag_H2O_PICA_EMEP = (Integer) attributes.get(
                "ITC_qflag_H2O_PICA_EMEP");

        if (ITC_qflag_H2O_PICA_EMEP != null) {
            setITC_qflag_H2O_PICA_EMEP(ITC_qflag_H2O_PICA_EMEP);
        }

        Integer FST_qflag_u = (Integer) attributes.get("FST_qflag_u");

        if (FST_qflag_u != null) {
            setFST_qflag_u(FST_qflag_u);
        }

        Integer FST_qflag_u_EMEP = (Integer) attributes.get("FST_qflag_u_EMEP");

        if (FST_qflag_u_EMEP != null) {
            setFST_qflag_u_EMEP(FST_qflag_u_EMEP);
        }

        Integer FST_qflag_Ts = (Integer) attributes.get("FST_qflag_Ts");

        if (FST_qflag_Ts != null) {
            setFST_qflag_Ts(FST_qflag_Ts);
        }

        Integer FST_qflag_Ts_EMEP = (Integer) attributes.get(
                "FST_qflag_Ts_EMEP");

        if (FST_qflag_Ts_EMEP != null) {
            setFST_qflag_Ts_EMEP(FST_qflag_Ts_EMEP);
        }

        Integer FST_qflag_CO2_LI72 = (Integer) attributes.get(
                "FST_qflag_CO2_LI72");

        if (FST_qflag_CO2_LI72 != null) {
            setFST_qflag_CO2_LI72(FST_qflag_CO2_LI72);
        }

        Integer FST_qflag_CO2_LI72_EMEP = (Integer) attributes.get(
                "FST_qflag_CO2_LI72_EMEP");

        if (FST_qflag_CO2_LI72_EMEP != null) {
            setFST_qflag_CO2_LI72_EMEP(FST_qflag_CO2_LI72_EMEP);
        }

        Integer FST_qflag_H2O_LI72 = (Integer) attributes.get(
                "FST_qflag_H2O_LI72");

        if (FST_qflag_H2O_LI72 != null) {
            setFST_qflag_H2O_LI72(FST_qflag_H2O_LI72);
        }

        Integer FST_qflag_H2O_LI72_EMEP = (Integer) attributes.get(
                "FST_qflag_H2O_LI72_EMEP");

        if (FST_qflag_H2O_LI72_EMEP != null) {
            setFST_qflag_H2O_LI72_EMEP(FST_qflag_H2O_LI72_EMEP);
        }

        Integer FST_qflag_CH4_PICA = (Integer) attributes.get(
                "FST_qflag_CH4_PICA");

        if (FST_qflag_CH4_PICA != null) {
            setFST_qflag_CH4_PICA(FST_qflag_CH4_PICA);
        }

        Integer FST_qflag_CH4_PICA_EMEP = (Integer) attributes.get(
                "FST_qflag_CH4_PICA_EMEP");

        if (FST_qflag_CH4_PICA_EMEP != null) {
            setFST_qflag_CH4_PICA_EMEP(FST_qflag_CH4_PICA_EMEP);
        }

        Integer FST_qflag_H2O_PICA = (Integer) attributes.get(
                "FST_qflag_H2O_PICA");

        if (FST_qflag_H2O_PICA != null) {
            setFST_qflag_H2O_PICA(FST_qflag_H2O_PICA);
        }

        Integer FST_qflag_H2O_PICA_EMEP = (Integer) attributes.get(
                "FST_qflag_H2O_PICA_EMEP");

        if (FST_qflag_H2O_PICA_EMEP != null) {
            setFST_qflag_H2O_PICA_EMEP(FST_qflag_H2O_PICA_EMEP);
        }

        Float Hm_u = (Float) attributes.get("Hm_u");

        if (Hm_u != null) {
            setHm_u(Hm_u);
        }

        Integer Hm_u_EMEP = (Integer) attributes.get("Hm_u_EMEP");

        if (Hm_u_EMEP != null) {
            setHm_u_EMEP(Hm_u_EMEP);
        }

        Float Hm_Ts = (Float) attributes.get("Hm_Ts");

        if (Hm_Ts != null) {
            setHm_Ts(Hm_Ts);
        }

        Integer Hm_Ts_EMEP = (Integer) attributes.get("Hm_Ts_EMEP");

        if (Hm_Ts_EMEP != null) {
            setHm_Ts_EMEP(Hm_Ts_EMEP);
        }

        Float Hm_CO2_LI72 = (Float) attributes.get("Hm_CO2_LI72");

        if (Hm_CO2_LI72 != null) {
            setHm_CO2_LI72(Hm_CO2_LI72);
        }

        Integer Hm_CO2_LI72_EMEP = (Integer) attributes.get("Hm_CO2_LI72_EMEP");

        if (Hm_CO2_LI72_EMEP != null) {
            setHm_CO2_LI72_EMEP(Hm_CO2_LI72_EMEP);
        }

        Float Hm_H2O_LI72 = (Float) attributes.get("Hm_H2O_LI72");

        if (Hm_H2O_LI72 != null) {
            setHm_H2O_LI72(Hm_H2O_LI72);
        }

        Integer Hm_H2O_LI72_EMEP = (Integer) attributes.get("Hm_H2O_LI72_EMEP");

        if (Hm_H2O_LI72_EMEP != null) {
            setHm_H2O_LI72_EMEP(Hm_H2O_LI72_EMEP);
        }

        Float Hm_CH4_PICA = (Float) attributes.get("Hm_CH4_PICA");

        if (Hm_CH4_PICA != null) {
            setHm_CH4_PICA(Hm_CH4_PICA);
        }

        Integer Hm_CH4_PICA_EMEP = (Integer) attributes.get("Hm_CH4_PICA_EMEP");

        if (Hm_CH4_PICA_EMEP != null) {
            setHm_CH4_PICA_EMEP(Hm_CH4_PICA_EMEP);
        }

        Float Hm_H2O_PICA = (Float) attributes.get("Hm_H2O_PICA");

        if (Hm_H2O_PICA != null) {
            setHm_H2O_PICA(Hm_H2O_PICA);
        }

        Integer Hm_H2O_PICA_EMEP = (Integer) attributes.get("Hm_H2O_PICA_EMEP");

        if (Hm_H2O_PICA_EMEP != null) {
            setHm_H2O_PICA_EMEP(Hm_H2O_PICA_EMEP);
        }

        Float Hv_u = (Float) attributes.get("Hv_u");

        if (Hv_u != null) {
            setHv_u(Hv_u);
        }

        Integer Hv_u_EMEP = (Integer) attributes.get("Hv_u_EMEP");

        if (Hv_u_EMEP != null) {
            setHv_u_EMEP(Hv_u_EMEP);
        }

        Float Hv_Ts = (Float) attributes.get("Hv_Ts");

        if (Hv_Ts != null) {
            setHv_Ts(Hv_Ts);
        }

        Integer Hv_Ts_EMEP = (Integer) attributes.get("Hv_Ts_EMEP");

        if (Hv_Ts_EMEP != null) {
            setHv_Ts_EMEP(Hv_Ts_EMEP);
        }

        Float Hv_CO2_LI72 = (Float) attributes.get("Hv_CO2_LI72");

        if (Hv_CO2_LI72 != null) {
            setHv_CO2_LI72(Hv_CO2_LI72);
        }

        Integer Hv_CO2_LI72_EMEP = (Integer) attributes.get("Hv_CO2_LI72_EMEP");

        if (Hv_CO2_LI72_EMEP != null) {
            setHv_CO2_LI72_EMEP(Hv_CO2_LI72_EMEP);
        }

        Float Hv_H2O_LI72 = (Float) attributes.get("Hv_H2O_LI72");

        if (Hv_H2O_LI72 != null) {
            setHv_H2O_LI72(Hv_H2O_LI72);
        }

        Integer Hv_H2O_LI72_EMEP = (Integer) attributes.get("Hv_H2O_LI72_EMEP");

        if (Hv_H2O_LI72_EMEP != null) {
            setHv_H2O_LI72_EMEP(Hv_H2O_LI72_EMEP);
        }

        Float Hv_CH4_PICA = (Float) attributes.get("Hv_CH4_PICA");

        if (Hv_CH4_PICA != null) {
            setHv_CH4_PICA(Hv_CH4_PICA);
        }

        Integer Hv_CH4_PICA_EMEP = (Integer) attributes.get("Hv_CH4_PICA_EMEP");

        if (Hv_CH4_PICA_EMEP != null) {
            setHv_CH4_PICA_EMEP(Hv_CH4_PICA_EMEP);
        }

        Float Hv_H2O_PICA = (Float) attributes.get("Hv_H2O_PICA");

        if (Hv_H2O_PICA != null) {
            setHv_H2O_PICA(Hv_H2O_PICA);
        }

        Integer Hv_H2O_PICA_EMEP = (Integer) attributes.get("Hv_H2O_PICA_EMEP");

        if (Hv_H2O_PICA_EMEP != null) {
            setHv_H2O_PICA_EMEP(Hv_H2O_PICA_EMEP);
        }

        Float fpr_x_peak = (Float) attributes.get("fpr_x_peak");

        if (fpr_x_peak != null) {
            setFpr_x_peak(fpr_x_peak);
        }

        Integer fpr_x_peak_EMEP = (Integer) attributes.get("fpr_x_peak_EMEP");

        if (fpr_x_peak_EMEP != null) {
            setFpr_x_peak_EMEP(fpr_x_peak_EMEP);
        }

        Float fpr_x_80 = (Float) attributes.get("fpr_x_80");

        if (fpr_x_80 != null) {
            setFpr_x_80(fpr_x_80);
        }

        Integer fpr_x_80_EMEP = (Integer) attributes.get("fpr_x_80_EMEP");

        if (fpr_x_80_EMEP != null) {
            setFpr_x_80_EMEP(fpr_x_80_EMEP);
        }
    }

    /**
    * Returns the primary key of this kvj eddy.
    *
    * @return the primary key of this kvj eddy
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _kvjEddy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this kvj eddy.
    *
    * @param primaryKey the primary key of this kvj eddy
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _kvjEddy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this kvj eddy.
    *
    * @return the samptime of this kvj eddy
    */
    @Override
    public java.util.Date getSamptime() {
        return _kvjEddy.getSamptime();
    }

    /**
    * Sets the samptime of this kvj eddy.
    *
    * @param samptime the samptime of this kvj eddy
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _kvjEddy.setSamptime(samptime);
    }

    /**
    * Returns the h of this kvj eddy.
    *
    * @return the h of this kvj eddy
    */
    @Override
    public float getH() {
        return _kvjEddy.getH();
    }

    /**
    * Sets the h of this kvj eddy.
    *
    * @param H the h of this kvj eddy
    */
    @Override
    public void setH(float H) {
        _kvjEddy.setH(H);
    }

    /**
    * Returns the h_ e m e p of this kvj eddy.
    *
    * @return the h_ e m e p of this kvj eddy
    */
    @Override
    public int getH_EMEP() {
        return _kvjEddy.getH_EMEP();
    }

    /**
    * Sets the h_ e m e p of this kvj eddy.
    *
    * @param H_EMEP the h_ e m e p of this kvj eddy
    */
    @Override
    public void setH_EMEP(int H_EMEP) {
        _kvjEddy.setH_EMEP(H_EMEP);
    }

    /**
    * Returns the qc_ h of this kvj eddy.
    *
    * @return the qc_ h of this kvj eddy
    */
    @Override
    public int getQc_H() {
        return _kvjEddy.getQc_H();
    }

    /**
    * Sets the qc_ h of this kvj eddy.
    *
    * @param Qc_H the qc_ h of this kvj eddy
    */
    @Override
    public void setQc_H(int Qc_H) {
        _kvjEddy.setQc_H(Qc_H);
    }

    /**
    * Returns the qc_ h_ e m e p of this kvj eddy.
    *
    * @return the qc_ h_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_H_EMEP() {
        return _kvjEddy.getQc_H_EMEP();
    }

    /**
    * Sets the qc_ h_ e m e p of this kvj eddy.
    *
    * @param Qc_H_EMEP the qc_ h_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _kvjEddy.setQc_H_EMEP(Qc_H_EMEP);
    }

    /**
    * Returns the tau of this kvj eddy.
    *
    * @return the tau of this kvj eddy
    */
    @Override
    public float getTau() {
        return _kvjEddy.getTau();
    }

    /**
    * Sets the tau of this kvj eddy.
    *
    * @param tau the tau of this kvj eddy
    */
    @Override
    public void setTau(float tau) {
        _kvjEddy.setTau(tau);
    }

    /**
    * Returns the tau_ e m e p of this kvj eddy.
    *
    * @return the tau_ e m e p of this kvj eddy
    */
    @Override
    public int getTau_EMEP() {
        return _kvjEddy.getTau_EMEP();
    }

    /**
    * Sets the tau_ e m e p of this kvj eddy.
    *
    * @param tau_EMEP the tau_ e m e p of this kvj eddy
    */
    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _kvjEddy.setTau_EMEP(tau_EMEP);
    }

    /**
    * Returns the qc_tau of this kvj eddy.
    *
    * @return the qc_tau of this kvj eddy
    */
    @Override
    public int getQc_tau() {
        return _kvjEddy.getQc_tau();
    }

    /**
    * Sets the qc_tau of this kvj eddy.
    *
    * @param Qc_tau the qc_tau of this kvj eddy
    */
    @Override
    public void setQc_tau(int Qc_tau) {
        _kvjEddy.setQc_tau(Qc_tau);
    }

    /**
    * Returns the qc_tau_ e m e p of this kvj eddy.
    *
    * @return the qc_tau_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_tau_EMEP() {
        return _kvjEddy.getQc_tau_EMEP();
    }

    /**
    * Sets the qc_tau_ e m e p of this kvj eddy.
    *
    * @param Qc_tau_EMEP the qc_tau_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _kvjEddy.setQc_tau_EMEP(Qc_tau_EMEP);
    }

    /**
    * Returns the u_star of this kvj eddy.
    *
    * @return the u_star of this kvj eddy
    */
    @Override
    public float getU_star() {
        return _kvjEddy.getU_star();
    }

    /**
    * Sets the u_star of this kvj eddy.
    *
    * @param u_star the u_star of this kvj eddy
    */
    @Override
    public void setU_star(float u_star) {
        _kvjEddy.setU_star(u_star);
    }

    /**
    * Returns the u_star_ e m e p of this kvj eddy.
    *
    * @return the u_star_ e m e p of this kvj eddy
    */
    @Override
    public int getU_star_EMEP() {
        return _kvjEddy.getU_star_EMEP();
    }

    /**
    * Sets the u_star_ e m e p of this kvj eddy.
    *
    * @param u_star_EMEP the u_star_ e m e p of this kvj eddy
    */
    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _kvjEddy.setU_star_EMEP(u_star_EMEP);
    }

    /**
    * Returns the m o_length of this kvj eddy.
    *
    * @return the m o_length of this kvj eddy
    */
    @Override
    public float getMO_length() {
        return _kvjEddy.getMO_length();
    }

    /**
    * Sets the m o_length of this kvj eddy.
    *
    * @param MO_length the m o_length of this kvj eddy
    */
    @Override
    public void setMO_length(float MO_length) {
        _kvjEddy.setMO_length(MO_length);
    }

    /**
    * Returns the m o_length_ e m e p of this kvj eddy.
    *
    * @return the m o_length_ e m e p of this kvj eddy
    */
    @Override
    public int getMO_length_EMEP() {
        return _kvjEddy.getMO_length_EMEP();
    }

    /**
    * Sets the m o_length_ e m e p of this kvj eddy.
    *
    * @param MO_length_EMEP the m o_length_ e m e p of this kvj eddy
    */
    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _kvjEddy.setMO_length_EMEP(MO_length_EMEP);
    }

    /**
    * Returns the err_packet of this kvj eddy.
    *
    * @return the err_packet of this kvj eddy
    */
    @Override
    public int getErr_packet() {
        return _kvjEddy.getErr_packet();
    }

    /**
    * Sets the err_packet of this kvj eddy.
    *
    * @param err_packet the err_packet of this kvj eddy
    */
    @Override
    public void setErr_packet(int err_packet) {
        _kvjEddy.setErr_packet(err_packet);
    }

    /**
    * Returns the err_packet_ e m e p of this kvj eddy.
    *
    * @return the err_packet_ e m e p of this kvj eddy
    */
    @Override
    public int getErr_packet_EMEP() {
        return _kvjEddy.getErr_packet_EMEP();
    }

    /**
    * Sets the err_packet_ e m e p of this kvj eddy.
    *
    * @param err_packet_EMEP the err_packet_ e m e p of this kvj eddy
    */
    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _kvjEddy.setErr_packet_EMEP(err_packet_EMEP);
    }

    /**
    * Returns the f_ c o2_ l i72 of this kvj eddy.
    *
    * @return the f_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getF_CO2_LI72() {
        return _kvjEddy.getF_CO2_LI72();
    }

    /**
    * Sets the f_ c o2_ l i72 of this kvj eddy.
    *
    * @param F_CO2_LI72 the f_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setF_CO2_LI72(float F_CO2_LI72) {
        _kvjEddy.setF_CO2_LI72(F_CO2_LI72);
    }

    /**
    * Returns the f_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getF_CO2_LI72_EMEP() {
        return _kvjEddy.getF_CO2_LI72_EMEP();
    }

    /**
    * Sets the f_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param F_CO2_LI72_EMEP the f_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setF_CO2_LI72_EMEP(int F_CO2_LI72_EMEP) {
        _kvjEddy.setF_CO2_LI72_EMEP(F_CO2_LI72_EMEP);
    }

    /**
    * Returns the qc_ c o2_ l i72 of this kvj eddy.
    *
    * @return the qc_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public int getQc_CO2_LI72() {
        return _kvjEddy.getQc_CO2_LI72();
    }

    /**
    * Sets the qc_ c o2_ l i72 of this kvj eddy.
    *
    * @param Qc_CO2_LI72 the qc_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setQc_CO2_LI72(int Qc_CO2_LI72) {
        _kvjEddy.setQc_CO2_LI72(Qc_CO2_LI72);
    }

    /**
    * Returns the qc_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the qc_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_CO2_LI72_EMEP() {
        return _kvjEddy.getQc_CO2_LI72_EMEP();
    }

    /**
    * Sets the qc_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param Qc_CO2_LI72_EMEP the qc_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_CO2_LI72_EMEP(int Qc_CO2_LI72_EMEP) {
        _kvjEddy.setQc_CO2_LI72_EMEP(Qc_CO2_LI72_EMEP);
    }

    /**
    * Returns the f_ c h4_ p i c a of this kvj eddy.
    *
    * @return the f_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getF_CH4_PICA() {
        return _kvjEddy.getF_CH4_PICA();
    }

    /**
    * Sets the f_ c h4_ p i c a of this kvj eddy.
    *
    * @param F_CH4_PICA the f_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setF_CH4_PICA(float F_CH4_PICA) {
        _kvjEddy.setF_CH4_PICA(F_CH4_PICA);
    }

    /**
    * Returns the f_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getF_CH4_PICA_EMEP() {
        return _kvjEddy.getF_CH4_PICA_EMEP();
    }

    /**
    * Sets the f_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param F_CH4_PICA_EMEP the f_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setF_CH4_PICA_EMEP(int F_CH4_PICA_EMEP) {
        _kvjEddy.setF_CH4_PICA_EMEP(F_CH4_PICA_EMEP);
    }

    /**
    * Returns the qc_ c h4_ p i c a of this kvj eddy.
    *
    * @return the qc_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public int getQc_CH4_PICA() {
        return _kvjEddy.getQc_CH4_PICA();
    }

    /**
    * Sets the qc_ c h4_ p i c a of this kvj eddy.
    *
    * @param Qc_CH4_PICA the qc_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setQc_CH4_PICA(int Qc_CH4_PICA) {
        _kvjEddy.setQc_CH4_PICA(Qc_CH4_PICA);
    }

    /**
    * Returns the qc_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the qc_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_CH4_PICA_EMEP() {
        return _kvjEddy.getQc_CH4_PICA_EMEP();
    }

    /**
    * Sets the qc_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Qc_CH4_PICA_EMEP the qc_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_CH4_PICA_EMEP(int Qc_CH4_PICA_EMEP) {
        _kvjEddy.setQc_CH4_PICA_EMEP(Qc_CH4_PICA_EMEP);
    }

    /**
    * Returns the f_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the f_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getF_H2O_LI72() {
        return _kvjEddy.getF_H2O_LI72();
    }

    /**
    * Sets the f_ h2 o_ l i72 of this kvj eddy.
    *
    * @param F_H2O_LI72 the f_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setF_H2O_LI72(float F_H2O_LI72) {
        _kvjEddy.setF_H2O_LI72(F_H2O_LI72);
    }

    /**
    * Returns the f_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getF_H2O_LI72_EMEP() {
        return _kvjEddy.getF_H2O_LI72_EMEP();
    }

    /**
    * Sets the f_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param F_H2O_LI72_EMEP the f_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP) {
        _kvjEddy.setF_H2O_LI72_EMEP(F_H2O_LI72_EMEP);
    }

    /**
    * Returns the qc_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the qc_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public int getQc_H2O_LI72() {
        return _kvjEddy.getQc_H2O_LI72();
    }

    /**
    * Sets the qc_ h2 o_ l i72 of this kvj eddy.
    *
    * @param Qc_H2O_LI72 the qc_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setQc_H2O_LI72(int Qc_H2O_LI72) {
        _kvjEddy.setQc_H2O_LI72(Qc_H2O_LI72);
    }

    /**
    * Returns the qc_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the qc_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_H2O_LI72_EMEP() {
        return _kvjEddy.getQc_H2O_LI72_EMEP();
    }

    /**
    * Sets the qc_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param Qc_H2O_LI72_EMEP the qc_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_H2O_LI72_EMEP(int Qc_H2O_LI72_EMEP) {
        _kvjEddy.setQc_H2O_LI72_EMEP(Qc_H2O_LI72_EMEP);
    }

    /**
    * Returns the f_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the f_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getF_H2O_PICA() {
        return _kvjEddy.getF_H2O_PICA();
    }

    /**
    * Sets the f_ h2 o_ p i c a of this kvj eddy.
    *
    * @param F_H2O_PICA the f_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setF_H2O_PICA(float F_H2O_PICA) {
        _kvjEddy.setF_H2O_PICA(F_H2O_PICA);
    }

    /**
    * Returns the f_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getF_H2O_PICA_EMEP() {
        return _kvjEddy.getF_H2O_PICA_EMEP();
    }

    /**
    * Sets the f_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param F_H2O_PICA_EMEP the f_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setF_H2O_PICA_EMEP(int F_H2O_PICA_EMEP) {
        _kvjEddy.setF_H2O_PICA_EMEP(F_H2O_PICA_EMEP);
    }

    /**
    * Returns the qc_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the qc_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public int getQc_H2O_PICA() {
        return _kvjEddy.getQc_H2O_PICA();
    }

    /**
    * Sets the qc_ h2 o_ p i c a of this kvj eddy.
    *
    * @param Qc_H2O_PICA the qc_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setQc_H2O_PICA(int Qc_H2O_PICA) {
        _kvjEddy.setQc_H2O_PICA(Qc_H2O_PICA);
    }

    /**
    * Returns the qc_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the qc_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getQc_H2O_PICA_EMEP() {
        return _kvjEddy.getQc_H2O_PICA_EMEP();
    }

    /**
    * Sets the qc_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Qc_H2O_PICA_EMEP the qc_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setQc_H2O_PICA_EMEP(int Qc_H2O_PICA_EMEP) {
        _kvjEddy.setQc_H2O_PICA_EMEP(Qc_H2O_PICA_EMEP);
    }

    /**
    * Returns the l e_ l i72 of this kvj eddy.
    *
    * @return the l e_ l i72 of this kvj eddy
    */
    @Override
    public float getLE_LI72() {
        return _kvjEddy.getLE_LI72();
    }

    /**
    * Sets the l e_ l i72 of this kvj eddy.
    *
    * @param LE_LI72 the l e_ l i72 of this kvj eddy
    */
    @Override
    public void setLE_LI72(float LE_LI72) {
        _kvjEddy.setLE_LI72(LE_LI72);
    }

    /**
    * Returns the l e_ l i72_ e m e p of this kvj eddy.
    *
    * @return the l e_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getLE_LI72_EMEP() {
        return _kvjEddy.getLE_LI72_EMEP();
    }

    /**
    * Sets the l e_ l i72_ e m e p of this kvj eddy.
    *
    * @param LE_LI72_EMEP the l e_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setLE_LI72_EMEP(int LE_LI72_EMEP) {
        _kvjEddy.setLE_LI72_EMEP(LE_LI72_EMEP);
    }

    /**
    * Returns the l e_ p i c a of this kvj eddy.
    *
    * @return the l e_ p i c a of this kvj eddy
    */
    @Override
    public float getLE_PICA() {
        return _kvjEddy.getLE_PICA();
    }

    /**
    * Sets the l e_ p i c a of this kvj eddy.
    *
    * @param LE_PICA the l e_ p i c a of this kvj eddy
    */
    @Override
    public void setLE_PICA(float LE_PICA) {
        _kvjEddy.setLE_PICA(LE_PICA);
    }

    /**
    * Returns the l e_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the l e_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getLE_PICA_EMEP() {
        return _kvjEddy.getLE_PICA_EMEP();
    }

    /**
    * Sets the l e_ p i c a_ e m e p of this kvj eddy.
    *
    * @param LE_PICA_EMEP the l e_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setLE_PICA_EMEP(int LE_PICA_EMEP) {
        _kvjEddy.setLE_PICA_EMEP(LE_PICA_EMEP);
    }

    /**
    * Returns the u of this kvj eddy.
    *
    * @return the u of this kvj eddy
    */
    @Override
    public float getU() {
        return _kvjEddy.getU();
    }

    /**
    * Sets the u of this kvj eddy.
    *
    * @param U the u of this kvj eddy
    */
    @Override
    public void setU(float U) {
        _kvjEddy.setU(U);
    }

    /**
    * Returns the u_ e m e p of this kvj eddy.
    *
    * @return the u_ e m e p of this kvj eddy
    */
    @Override
    public int getU_EMEP() {
        return _kvjEddy.getU_EMEP();
    }

    /**
    * Sets the u_ e m e p of this kvj eddy.
    *
    * @param U_EMEP the u_ e m e p of this kvj eddy
    */
    @Override
    public void setU_EMEP(int U_EMEP) {
        _kvjEddy.setU_EMEP(U_EMEP);
    }

    /**
    * Returns the wind_dir of this kvj eddy.
    *
    * @return the wind_dir of this kvj eddy
    */
    @Override
    public float getWind_dir() {
        return _kvjEddy.getWind_dir();
    }

    /**
    * Sets the wind_dir of this kvj eddy.
    *
    * @param wind_dir the wind_dir of this kvj eddy
    */
    @Override
    public void setWind_dir(float wind_dir) {
        _kvjEddy.setWind_dir(wind_dir);
    }

    /**
    * Returns the wind_dir_ e m e p of this kvj eddy.
    *
    * @return the wind_dir_ e m e p of this kvj eddy
    */
    @Override
    public int getWind_dir_EMEP() {
        return _kvjEddy.getWind_dir_EMEP();
    }

    /**
    * Sets the wind_dir_ e m e p of this kvj eddy.
    *
    * @param wind_dir_EMEP the wind_dir_ e m e p of this kvj eddy
    */
    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _kvjEddy.setWind_dir_EMEP(wind_dir_EMEP);
    }

    /**
    * Returns the av_u of this kvj eddy.
    *
    * @return the av_u of this kvj eddy
    */
    @Override
    public float getAv_u() {
        return _kvjEddy.getAv_u();
    }

    /**
    * Sets the av_u of this kvj eddy.
    *
    * @param av_u the av_u of this kvj eddy
    */
    @Override
    public void setAv_u(float av_u) {
        _kvjEddy.setAv_u(av_u);
    }

    /**
    * Returns the av_u_ e m e p of this kvj eddy.
    *
    * @return the av_u_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_u_EMEP() {
        return _kvjEddy.getAv_u_EMEP();
    }

    /**
    * Sets the av_u_ e m e p of this kvj eddy.
    *
    * @param av_u_EMEP the av_u_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _kvjEddy.setAv_u_EMEP(av_u_EMEP);
    }

    /**
    * Returns the av_v of this kvj eddy.
    *
    * @return the av_v of this kvj eddy
    */
    @Override
    public float getAv_v() {
        return _kvjEddy.getAv_v();
    }

    /**
    * Sets the av_v of this kvj eddy.
    *
    * @param av_v the av_v of this kvj eddy
    */
    @Override
    public void setAv_v(float av_v) {
        _kvjEddy.setAv_v(av_v);
    }

    /**
    * Returns the av_v_ e m e p of this kvj eddy.
    *
    * @return the av_v_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_v_EMEP() {
        return _kvjEddy.getAv_v_EMEP();
    }

    /**
    * Sets the av_v_ e m e p of this kvj eddy.
    *
    * @param av_v_EMEP the av_v_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _kvjEddy.setAv_v_EMEP(av_v_EMEP);
    }

    /**
    * Returns the av_w of this kvj eddy.
    *
    * @return the av_w of this kvj eddy
    */
    @Override
    public float getAv_w() {
        return _kvjEddy.getAv_w();
    }

    /**
    * Sets the av_w of this kvj eddy.
    *
    * @param av_w the av_w of this kvj eddy
    */
    @Override
    public void setAv_w(float av_w) {
        _kvjEddy.setAv_w(av_w);
    }

    /**
    * Returns the av_w_ e m e p of this kvj eddy.
    *
    * @return the av_w_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_w_EMEP() {
        return _kvjEddy.getAv_w_EMEP();
    }

    /**
    * Sets the av_w_ e m e p of this kvj eddy.
    *
    * @param av_w_EMEP the av_w_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _kvjEddy.setAv_w_EMEP(av_w_EMEP);
    }

    /**
    * Returns the av_t of this kvj eddy.
    *
    * @return the av_t of this kvj eddy
    */
    @Override
    public float getAv_t() {
        return _kvjEddy.getAv_t();
    }

    /**
    * Sets the av_t of this kvj eddy.
    *
    * @param av_t the av_t of this kvj eddy
    */
    @Override
    public void setAv_t(float av_t) {
        _kvjEddy.setAv_t(av_t);
    }

    /**
    * Returns the av_t_ e m e p of this kvj eddy.
    *
    * @return the av_t_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_t_EMEP() {
        return _kvjEddy.getAv_t_EMEP();
    }

    /**
    * Sets the av_t_ e m e p of this kvj eddy.
    *
    * @param av_t_EMEP the av_t_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_t_EMEP(int av_t_EMEP) {
        _kvjEddy.setAv_t_EMEP(av_t_EMEP);
    }

    /**
    * Returns the av_c_ l i72 of this kvj eddy.
    *
    * @return the av_c_ l i72 of this kvj eddy
    */
    @Override
    public float getAv_c_LI72() {
        return _kvjEddy.getAv_c_LI72();
    }

    /**
    * Sets the av_c_ l i72 of this kvj eddy.
    *
    * @param av_c_LI72 the av_c_ l i72 of this kvj eddy
    */
    @Override
    public void setAv_c_LI72(float av_c_LI72) {
        _kvjEddy.setAv_c_LI72(av_c_LI72);
    }

    /**
    * Returns the av_c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the av_c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_c_LI72_EMEP() {
        return _kvjEddy.getAv_c_LI72_EMEP();
    }

    /**
    * Sets the av_c_ l i72_ e m e p of this kvj eddy.
    *
    * @param av_c_LI72_EMEP the av_c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_c_LI72_EMEP(int av_c_LI72_EMEP) {
        _kvjEddy.setAv_c_LI72_EMEP(av_c_LI72_EMEP);
    }

    /**
    * Returns the av_h_ l i72 of this kvj eddy.
    *
    * @return the av_h_ l i72 of this kvj eddy
    */
    @Override
    public float getAv_h_LI72() {
        return _kvjEddy.getAv_h_LI72();
    }

    /**
    * Sets the av_h_ l i72 of this kvj eddy.
    *
    * @param av_h_LI72 the av_h_ l i72 of this kvj eddy
    */
    @Override
    public void setAv_h_LI72(float av_h_LI72) {
        _kvjEddy.setAv_h_LI72(av_h_LI72);
    }

    /**
    * Returns the av_h_ l i72_ e m e p of this kvj eddy.
    *
    * @return the av_h_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_h_LI72_EMEP() {
        return _kvjEddy.getAv_h_LI72_EMEP();
    }

    /**
    * Sets the av_h_ l i72_ e m e p of this kvj eddy.
    *
    * @param av_h_LI72_EMEP the av_h_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_h_LI72_EMEP(int av_h_LI72_EMEP) {
        _kvjEddy.setAv_h_LI72_EMEP(av_h_LI72_EMEP);
    }

    /**
    * Returns the av_h_ p i c a of this kvj eddy.
    *
    * @return the av_h_ p i c a of this kvj eddy
    */
    @Override
    public float getAv_h_PICA() {
        return _kvjEddy.getAv_h_PICA();
    }

    /**
    * Sets the av_h_ p i c a of this kvj eddy.
    *
    * @param av_h_PICA the av_h_ p i c a of this kvj eddy
    */
    @Override
    public void setAv_h_PICA(float av_h_PICA) {
        _kvjEddy.setAv_h_PICA(av_h_PICA);
    }

    /**
    * Returns the av_h_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the av_h_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_h_PICA_EMEP() {
        return _kvjEddy.getAv_h_PICA_EMEP();
    }

    /**
    * Sets the av_h_ p i c a_ e m e p of this kvj eddy.
    *
    * @param av_h_PICA_EMEP the av_h_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_h_PICA_EMEP(int av_h_PICA_EMEP) {
        _kvjEddy.setAv_h_PICA_EMEP(av_h_PICA_EMEP);
    }

    /**
    * Returns the av_ c h4 of this kvj eddy.
    *
    * @return the av_ c h4 of this kvj eddy
    */
    @Override
    public float getAv_CH4() {
        return _kvjEddy.getAv_CH4();
    }

    /**
    * Sets the av_ c h4 of this kvj eddy.
    *
    * @param av_CH4 the av_ c h4 of this kvj eddy
    */
    @Override
    public void setAv_CH4(float av_CH4) {
        _kvjEddy.setAv_CH4(av_CH4);
    }

    /**
    * Returns the av_ c h4_ e m e p of this kvj eddy.
    *
    * @return the av_ c h4_ e m e p of this kvj eddy
    */
    @Override
    public int getAv_CH4_EMEP() {
        return _kvjEddy.getAv_CH4_EMEP();
    }

    /**
    * Sets the av_ c h4_ e m e p of this kvj eddy.
    *
    * @param av_CH4_EMEP the av_ c h4_ e m e p of this kvj eddy
    */
    @Override
    public void setAv_CH4_EMEP(int av_CH4_EMEP) {
        _kvjEddy.setAv_CH4_EMEP(av_CH4_EMEP);
    }

    /**
    * Returns the std_u of this kvj eddy.
    *
    * @return the std_u of this kvj eddy
    */
    @Override
    public float getStd_u() {
        return _kvjEddy.getStd_u();
    }

    /**
    * Sets the std_u of this kvj eddy.
    *
    * @param std_u the std_u of this kvj eddy
    */
    @Override
    public void setStd_u(float std_u) {
        _kvjEddy.setStd_u(std_u);
    }

    /**
    * Returns the std_u_ e m e p of this kvj eddy.
    *
    * @return the std_u_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_u_EMEP() {
        return _kvjEddy.getStd_u_EMEP();
    }

    /**
    * Sets the std_u_ e m e p of this kvj eddy.
    *
    * @param std_u_EMEP the std_u_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _kvjEddy.setStd_u_EMEP(std_u_EMEP);
    }

    /**
    * Returns the std_v of this kvj eddy.
    *
    * @return the std_v of this kvj eddy
    */
    @Override
    public float getStd_v() {
        return _kvjEddy.getStd_v();
    }

    /**
    * Sets the std_v of this kvj eddy.
    *
    * @param std_v the std_v of this kvj eddy
    */
    @Override
    public void setStd_v(float std_v) {
        _kvjEddy.setStd_v(std_v);
    }

    /**
    * Returns the std_v_ e m e p of this kvj eddy.
    *
    * @return the std_v_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_v_EMEP() {
        return _kvjEddy.getStd_v_EMEP();
    }

    /**
    * Sets the std_v_ e m e p of this kvj eddy.
    *
    * @param std_v_EMEP the std_v_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _kvjEddy.setStd_v_EMEP(std_v_EMEP);
    }

    /**
    * Returns the std_w of this kvj eddy.
    *
    * @return the std_w of this kvj eddy
    */
    @Override
    public float getStd_w() {
        return _kvjEddy.getStd_w();
    }

    /**
    * Sets the std_w of this kvj eddy.
    *
    * @param std_w the std_w of this kvj eddy
    */
    @Override
    public void setStd_w(float std_w) {
        _kvjEddy.setStd_w(std_w);
    }

    /**
    * Returns the std_w_ e m e p of this kvj eddy.
    *
    * @return the std_w_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_w_EMEP() {
        return _kvjEddy.getStd_w_EMEP();
    }

    /**
    * Sets the std_w_ e m e p of this kvj eddy.
    *
    * @param std_w_EMEP the std_w_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _kvjEddy.setStd_w_EMEP(std_w_EMEP);
    }

    /**
    * Returns the std_t of this kvj eddy.
    *
    * @return the std_t of this kvj eddy
    */
    @Override
    public float getStd_t() {
        return _kvjEddy.getStd_t();
    }

    /**
    * Sets the std_t of this kvj eddy.
    *
    * @param std_t the std_t of this kvj eddy
    */
    @Override
    public void setStd_t(float std_t) {
        _kvjEddy.setStd_t(std_t);
    }

    /**
    * Returns the std_t_ e m e p of this kvj eddy.
    *
    * @return the std_t_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_t_EMEP() {
        return _kvjEddy.getStd_t_EMEP();
    }

    /**
    * Sets the std_t_ e m e p of this kvj eddy.
    *
    * @param std_t_EMEP the std_t_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_t_EMEP(int std_t_EMEP) {
        _kvjEddy.setStd_t_EMEP(std_t_EMEP);
    }

    /**
    * Returns the std_c_ l i72 of this kvj eddy.
    *
    * @return the std_c_ l i72 of this kvj eddy
    */
    @Override
    public float getStd_c_LI72() {
        return _kvjEddy.getStd_c_LI72();
    }

    /**
    * Sets the std_c_ l i72 of this kvj eddy.
    *
    * @param std_c_LI72 the std_c_ l i72 of this kvj eddy
    */
    @Override
    public void setStd_c_LI72(float std_c_LI72) {
        _kvjEddy.setStd_c_LI72(std_c_LI72);
    }

    /**
    * Returns the std_c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the std_c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_c_LI72_EMEP() {
        return _kvjEddy.getStd_c_LI72_EMEP();
    }

    /**
    * Sets the std_c_ l i72_ e m e p of this kvj eddy.
    *
    * @param std_c_LI72_EMEP the std_c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP) {
        _kvjEddy.setStd_c_LI72_EMEP(std_c_LI72_EMEP);
    }

    /**
    * Returns the std_h_ l i72 of this kvj eddy.
    *
    * @return the std_h_ l i72 of this kvj eddy
    */
    @Override
    public float getStd_h_LI72() {
        return _kvjEddy.getStd_h_LI72();
    }

    /**
    * Sets the std_h_ l i72 of this kvj eddy.
    *
    * @param std_h_LI72 the std_h_ l i72 of this kvj eddy
    */
    @Override
    public void setStd_h_LI72(float std_h_LI72) {
        _kvjEddy.setStd_h_LI72(std_h_LI72);
    }

    /**
    * Returns the std_h_ l i72_ e m e p of this kvj eddy.
    *
    * @return the std_h_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_h_LI72_EMEP() {
        return _kvjEddy.getStd_h_LI72_EMEP();
    }

    /**
    * Sets the std_h_ l i72_ e m e p of this kvj eddy.
    *
    * @param std_h_LI72_EMEP the std_h_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_h_LI72_EMEP(int std_h_LI72_EMEP) {
        _kvjEddy.setStd_h_LI72_EMEP(std_h_LI72_EMEP);
    }

    /**
    * Returns the std_h_ p i c a of this kvj eddy.
    *
    * @return the std_h_ p i c a of this kvj eddy
    */
    @Override
    public float getStd_h_PICA() {
        return _kvjEddy.getStd_h_PICA();
    }

    /**
    * Sets the std_h_ p i c a of this kvj eddy.
    *
    * @param std_h_PICA the std_h_ p i c a of this kvj eddy
    */
    @Override
    public void setStd_h_PICA(float std_h_PICA) {
        _kvjEddy.setStd_h_PICA(std_h_PICA);
    }

    /**
    * Returns the std_h_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the std_h_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_h_PICA_EMEP() {
        return _kvjEddy.getStd_h_PICA_EMEP();
    }

    /**
    * Sets the std_h_ p i c a_ e m e p of this kvj eddy.
    *
    * @param std_h_PICA_EMEP the std_h_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_h_PICA_EMEP(int std_h_PICA_EMEP) {
        _kvjEddy.setStd_h_PICA_EMEP(std_h_PICA_EMEP);
    }

    /**
    * Returns the std_ c h4 of this kvj eddy.
    *
    * @return the std_ c h4 of this kvj eddy
    */
    @Override
    public float getStd_CH4() {
        return _kvjEddy.getStd_CH4();
    }

    /**
    * Sets the std_ c h4 of this kvj eddy.
    *
    * @param std_CH4 the std_ c h4 of this kvj eddy
    */
    @Override
    public void setStd_CH4(float std_CH4) {
        _kvjEddy.setStd_CH4(std_CH4);
    }

    /**
    * Returns the std_ c h4_ e m e p of this kvj eddy.
    *
    * @return the std_ c h4_ e m e p of this kvj eddy
    */
    @Override
    public int getStd_CH4_EMEP() {
        return _kvjEddy.getStd_CH4_EMEP();
    }

    /**
    * Sets the std_ c h4_ e m e p of this kvj eddy.
    *
    * @param std_CH4_EMEP the std_ c h4_ e m e p of this kvj eddy
    */
    @Override
    public void setStd_CH4_EMEP(int std_CH4_EMEP) {
        _kvjEddy.setStd_CH4_EMEP(std_CH4_EMEP);
    }

    /**
    * Returns the eta of this kvj eddy.
    *
    * @return the eta of this kvj eddy
    */
    @Override
    public float getEta() {
        return _kvjEddy.getEta();
    }

    /**
    * Sets the eta of this kvj eddy.
    *
    * @param eta the eta of this kvj eddy
    */
    @Override
    public void setEta(float eta) {
        _kvjEddy.setEta(eta);
    }

    /**
    * Returns the eta_ e m e p of this kvj eddy.
    *
    * @return the eta_ e m e p of this kvj eddy
    */
    @Override
    public int getEta_EMEP() {
        return _kvjEddy.getEta_EMEP();
    }

    /**
    * Sets the eta_ e m e p of this kvj eddy.
    *
    * @param eta_EMEP the eta_ e m e p of this kvj eddy
    */
    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _kvjEddy.setEta_EMEP(eta_EMEP);
    }

    /**
    * Returns the theta of this kvj eddy.
    *
    * @return the theta of this kvj eddy
    */
    @Override
    public float getTheta() {
        return _kvjEddy.getTheta();
    }

    /**
    * Sets the theta of this kvj eddy.
    *
    * @param theta the theta of this kvj eddy
    */
    @Override
    public void setTheta(float theta) {
        _kvjEddy.setTheta(theta);
    }

    /**
    * Returns the theta_ e m e p of this kvj eddy.
    *
    * @return the theta_ e m e p of this kvj eddy
    */
    @Override
    public int getTheta_EMEP() {
        return _kvjEddy.getTheta_EMEP();
    }

    /**
    * Sets the theta_ e m e p of this kvj eddy.
    *
    * @param theta_EMEP the theta_ e m e p of this kvj eddy
    */
    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _kvjEddy.setTheta_EMEP(theta_EMEP);
    }

    /**
    * Returns the beta of this kvj eddy.
    *
    * @return the beta of this kvj eddy
    */
    @Override
    public float getBeta() {
        return _kvjEddy.getBeta();
    }

    /**
    * Sets the beta of this kvj eddy.
    *
    * @param beta the beta of this kvj eddy
    */
    @Override
    public void setBeta(float beta) {
        _kvjEddy.setBeta(beta);
    }

    /**
    * Returns the beta_ e m e p of this kvj eddy.
    *
    * @return the beta_ e m e p of this kvj eddy
    */
    @Override
    public int getBeta_EMEP() {
        return _kvjEddy.getBeta_EMEP();
    }

    /**
    * Sets the beta_ e m e p of this kvj eddy.
    *
    * @param beta_EMEP the beta_ e m e p of this kvj eddy
    */
    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _kvjEddy.setBeta_EMEP(beta_EMEP);
    }

    /**
    * Returns the covs_u of this kvj eddy.
    *
    * @return the covs_u of this kvj eddy
    */
    @Override
    public float getCovs_u() {
        return _kvjEddy.getCovs_u();
    }

    /**
    * Sets the covs_u of this kvj eddy.
    *
    * @param Covs_u the covs_u of this kvj eddy
    */
    @Override
    public void setCovs_u(float Covs_u) {
        _kvjEddy.setCovs_u(Covs_u);
    }

    /**
    * Returns the covs_u_ e m e p of this kvj eddy.
    *
    * @return the covs_u_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_u_EMEP() {
        return _kvjEddy.getCovs_u_EMEP();
    }

    /**
    * Sets the covs_u_ e m e p of this kvj eddy.
    *
    * @param Covs_u_EMEP the covs_u_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_u_EMEP(int Covs_u_EMEP) {
        _kvjEddy.setCovs_u_EMEP(Covs_u_EMEP);
    }

    /**
    * Returns the covs_v of this kvj eddy.
    *
    * @return the covs_v of this kvj eddy
    */
    @Override
    public float getCovs_v() {
        return _kvjEddy.getCovs_v();
    }

    /**
    * Sets the covs_v of this kvj eddy.
    *
    * @param Covs_v the covs_v of this kvj eddy
    */
    @Override
    public void setCovs_v(float Covs_v) {
        _kvjEddy.setCovs_v(Covs_v);
    }

    /**
    * Returns the covs_v_ e m e p of this kvj eddy.
    *
    * @return the covs_v_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_v_EMEP() {
        return _kvjEddy.getCovs_v_EMEP();
    }

    /**
    * Sets the covs_v_ e m e p of this kvj eddy.
    *
    * @param Covs_v_EMEP the covs_v_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_v_EMEP(int Covs_v_EMEP) {
        _kvjEddy.setCovs_v_EMEP(Covs_v_EMEP);
    }

    /**
    * Returns the covs_ ts of this kvj eddy.
    *
    * @return the covs_ ts of this kvj eddy
    */
    @Override
    public float getCovs_Ts() {
        return _kvjEddy.getCovs_Ts();
    }

    /**
    * Sets the covs_ ts of this kvj eddy.
    *
    * @param Covs_Ts the covs_ ts of this kvj eddy
    */
    @Override
    public void setCovs_Ts(float Covs_Ts) {
        _kvjEddy.setCovs_Ts(Covs_Ts);
    }

    /**
    * Returns the covs_ ts_ e m e p of this kvj eddy.
    *
    * @return the covs_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_Ts_EMEP() {
        return _kvjEddy.getCovs_Ts_EMEP();
    }

    /**
    * Sets the covs_ ts_ e m e p of this kvj eddy.
    *
    * @param Covs_Ts_EMEP the covs_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_Ts_EMEP(int Covs_Ts_EMEP) {
        _kvjEddy.setCovs_Ts_EMEP(Covs_Ts_EMEP);
    }

    /**
    * Returns the covs_ c o2_ l i72 of this kvj eddy.
    *
    * @return the covs_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getCovs_CO2_LI72() {
        return _kvjEddy.getCovs_CO2_LI72();
    }

    /**
    * Sets the covs_ c o2_ l i72 of this kvj eddy.
    *
    * @param Covs_CO2_LI72 the covs_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setCovs_CO2_LI72(float Covs_CO2_LI72) {
        _kvjEddy.setCovs_CO2_LI72(Covs_CO2_LI72);
    }

    /**
    * Returns the covs_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covs_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_CO2_LI72_EMEP() {
        return _kvjEddy.getCovs_CO2_LI72_EMEP();
    }

    /**
    * Sets the covs_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param Covs_CO2_LI72_EMEP the covs_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_CO2_LI72_EMEP(int Covs_CO2_LI72_EMEP) {
        _kvjEddy.setCovs_CO2_LI72_EMEP(Covs_CO2_LI72_EMEP);
    }

    /**
    * Returns the covs_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the covs_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getCovs_H2O_LI72() {
        return _kvjEddy.getCovs_H2O_LI72();
    }

    /**
    * Sets the covs_ h2 o_ l i72 of this kvj eddy.
    *
    * @param Covs_H2O_LI72 the covs_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setCovs_H2O_LI72(float Covs_H2O_LI72) {
        _kvjEddy.setCovs_H2O_LI72(Covs_H2O_LI72);
    }

    /**
    * Returns the covs_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covs_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_H2O_LI72_EMEP() {
        return _kvjEddy.getCovs_H2O_LI72_EMEP();
    }

    /**
    * Sets the covs_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param Covs_H2O_LI72_EMEP the covs_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_H2O_LI72_EMEP(int Covs_H2O_LI72_EMEP) {
        _kvjEddy.setCovs_H2O_LI72_EMEP(Covs_H2O_LI72_EMEP);
    }

    /**
    * Returns the covs_ t_ c_ l i72 of this kvj eddy.
    *
    * @return the covs_ t_ c_ l i72 of this kvj eddy
    */
    @Override
    public float getCovs_T_C_LI72() {
        return _kvjEddy.getCovs_T_C_LI72();
    }

    /**
    * Sets the covs_ t_ c_ l i72 of this kvj eddy.
    *
    * @param Covs_T_C_LI72 the covs_ t_ c_ l i72 of this kvj eddy
    */
    @Override
    public void setCovs_T_C_LI72(float Covs_T_C_LI72) {
        _kvjEddy.setCovs_T_C_LI72(Covs_T_C_LI72);
    }

    /**
    * Returns the covs_ t_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covs_ t_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_T_C_LI72_EMEP() {
        return _kvjEddy.getCovs_T_C_LI72_EMEP();
    }

    /**
    * Sets the covs_ t_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @param Covs_T_C_LI72_EMEP the covs_ t_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_T_C_LI72_EMEP(int Covs_T_C_LI72_EMEP) {
        _kvjEddy.setCovs_T_C_LI72_EMEP(Covs_T_C_LI72_EMEP);
    }

    /**
    * Returns the covs_ p_ c_ l i72 of this kvj eddy.
    *
    * @return the covs_ p_ c_ l i72 of this kvj eddy
    */
    @Override
    public float getCovs_P_C_LI72() {
        return _kvjEddy.getCovs_P_C_LI72();
    }

    /**
    * Sets the covs_ p_ c_ l i72 of this kvj eddy.
    *
    * @param Covs_P_C_LI72 the covs_ p_ c_ l i72 of this kvj eddy
    */
    @Override
    public void setCovs_P_C_LI72(float Covs_P_C_LI72) {
        _kvjEddy.setCovs_P_C_LI72(Covs_P_C_LI72);
    }

    /**
    * Returns the covs_ p_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covs_ p_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_P_C_LI72_EMEP() {
        return _kvjEddy.getCovs_P_C_LI72_EMEP();
    }

    /**
    * Sets the covs_ p_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @param Covs_P_C_LI72_EMEP the covs_ p_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_P_C_LI72_EMEP(int Covs_P_C_LI72_EMEP) {
        _kvjEddy.setCovs_P_C_LI72_EMEP(Covs_P_C_LI72_EMEP);
    }

    /**
    * Returns the covs_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the covs_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getCovs_H2O_PICA() {
        return _kvjEddy.getCovs_H2O_PICA();
    }

    /**
    * Sets the covs_ h2 o_ p i c a of this kvj eddy.
    *
    * @param Covs_H2O_PICA the covs_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setCovs_H2O_PICA(float Covs_H2O_PICA) {
        _kvjEddy.setCovs_H2O_PICA(Covs_H2O_PICA);
    }

    /**
    * Returns the covs_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the covs_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_H2O_PICA_EMEP() {
        return _kvjEddy.getCovs_H2O_PICA_EMEP();
    }

    /**
    * Sets the covs_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Covs_H2O_PICA_EMEP the covs_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_H2O_PICA_EMEP(int Covs_H2O_PICA_EMEP) {
        _kvjEddy.setCovs_H2O_PICA_EMEP(Covs_H2O_PICA_EMEP);
    }

    /**
    * Returns the covs_ c h4_ p i c a of this kvj eddy.
    *
    * @return the covs_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getCovs_CH4_PICA() {
        return _kvjEddy.getCovs_CH4_PICA();
    }

    /**
    * Sets the covs_ c h4_ p i c a of this kvj eddy.
    *
    * @param Covs_CH4_PICA the covs_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setCovs_CH4_PICA(float Covs_CH4_PICA) {
        _kvjEddy.setCovs_CH4_PICA(Covs_CH4_PICA);
    }

    /**
    * Returns the covs_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the covs_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getCovs_CH4_PICA_EMEP() {
        return _kvjEddy.getCovs_CH4_PICA_EMEP();
    }

    /**
    * Sets the covs_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Covs_CH4_PICA_EMEP the covs_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setCovs_CH4_PICA_EMEP(int Covs_CH4_PICA_EMEP) {
        _kvjEddy.setCovs_CH4_PICA_EMEP(Covs_CH4_PICA_EMEP);
    }

    /**
    * Returns the licor_t_av of this kvj eddy.
    *
    * @return the licor_t_av of this kvj eddy
    */
    @Override
    public float getLicor_t_av() {
        return _kvjEddy.getLicor_t_av();
    }

    /**
    * Sets the licor_t_av of this kvj eddy.
    *
    * @param licor_t_av the licor_t_av of this kvj eddy
    */
    @Override
    public void setLicor_t_av(float licor_t_av) {
        _kvjEddy.setLicor_t_av(licor_t_av);
    }

    /**
    * Returns the licor_t_av_ e m e p of this kvj eddy.
    *
    * @return the licor_t_av_ e m e p of this kvj eddy
    */
    @Override
    public int getLicor_t_av_EMEP() {
        return _kvjEddy.getLicor_t_av_EMEP();
    }

    /**
    * Sets the licor_t_av_ e m e p of this kvj eddy.
    *
    * @param licor_t_av_EMEP the licor_t_av_ e m e p of this kvj eddy
    */
    @Override
    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _kvjEddy.setLicor_t_av_EMEP(licor_t_av_EMEP);
    }

    /**
    * Returns the licor_p_av of this kvj eddy.
    *
    * @return the licor_p_av of this kvj eddy
    */
    @Override
    public float getLicor_p_av() {
        return _kvjEddy.getLicor_p_av();
    }

    /**
    * Sets the licor_p_av of this kvj eddy.
    *
    * @param licor_p_av the licor_p_av of this kvj eddy
    */
    @Override
    public void setLicor_p_av(float licor_p_av) {
        _kvjEddy.setLicor_p_av(licor_p_av);
    }

    /**
    * Returns the licor_p_av_ e m e p of this kvj eddy.
    *
    * @return the licor_p_av_ e m e p of this kvj eddy
    */
    @Override
    public int getLicor_p_av_EMEP() {
        return _kvjEddy.getLicor_p_av_EMEP();
    }

    /**
    * Sets the licor_p_av_ e m e p of this kvj eddy.
    *
    * @param licor_p_av_EMEP the licor_p_av_ e m e p of this kvj eddy
    */
    @Override
    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _kvjEddy.setLicor_p_av_EMEP(licor_p_av_EMEP);
    }

    /**
    * Returns the licor_t_std of this kvj eddy.
    *
    * @return the licor_t_std of this kvj eddy
    */
    @Override
    public float getLicor_t_std() {
        return _kvjEddy.getLicor_t_std();
    }

    /**
    * Sets the licor_t_std of this kvj eddy.
    *
    * @param licor_t_std the licor_t_std of this kvj eddy
    */
    @Override
    public void setLicor_t_std(float licor_t_std) {
        _kvjEddy.setLicor_t_std(licor_t_std);
    }

    /**
    * Returns the licor_t_std_ e m e p of this kvj eddy.
    *
    * @return the licor_t_std_ e m e p of this kvj eddy
    */
    @Override
    public int getLicor_t_std_EMEP() {
        return _kvjEddy.getLicor_t_std_EMEP();
    }

    /**
    * Sets the licor_t_std_ e m e p of this kvj eddy.
    *
    * @param licor_t_std_EMEP the licor_t_std_ e m e p of this kvj eddy
    */
    @Override
    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _kvjEddy.setLicor_t_std_EMEP(licor_t_std_EMEP);
    }

    /**
    * Returns the licor_p_std of this kvj eddy.
    *
    * @return the licor_p_std of this kvj eddy
    */
    @Override
    public float getLicor_p_std() {
        return _kvjEddy.getLicor_p_std();
    }

    /**
    * Sets the licor_p_std of this kvj eddy.
    *
    * @param licor_p_std the licor_p_std of this kvj eddy
    */
    @Override
    public void setLicor_p_std(float licor_p_std) {
        _kvjEddy.setLicor_p_std(licor_p_std);
    }

    /**
    * Returns the licor_p_std_ e m e p of this kvj eddy.
    *
    * @return the licor_p_std_ e m e p of this kvj eddy
    */
    @Override
    public int getLicor_p_std_EMEP() {
        return _kvjEddy.getLicor_p_std_EMEP();
    }

    /**
    * Sets the licor_p_std_ e m e p of this kvj eddy.
    *
    * @param licor_p_std_EMEP the licor_p_std_ e m e p of this kvj eddy
    */
    @Override
    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _kvjEddy.setLicor_p_std_EMEP(licor_p_std_EMEP);
    }

    /**
    * Returns the c_lag_ l i72 of this kvj eddy.
    *
    * @return the c_lag_ l i72 of this kvj eddy
    */
    @Override
    public float getC_lag_LI72() {
        return _kvjEddy.getC_lag_LI72();
    }

    /**
    * Sets the c_lag_ l i72 of this kvj eddy.
    *
    * @param c_lag_LI72 the c_lag_ l i72 of this kvj eddy
    */
    @Override
    public void setC_lag_LI72(float c_lag_LI72) {
        _kvjEddy.setC_lag_LI72(c_lag_LI72);
    }

    /**
    * Returns the c_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @return the c_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getC_lag_LI72_EMEP() {
        return _kvjEddy.getC_lag_LI72_EMEP();
    }

    /**
    * Sets the c_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @param c_lag_LI72_EMEP the c_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP) {
        _kvjEddy.setC_lag_LI72_EMEP(c_lag_LI72_EMEP);
    }

    /**
    * Returns the h_lag_ l i72 of this kvj eddy.
    *
    * @return the h_lag_ l i72 of this kvj eddy
    */
    @Override
    public float getH_lag_LI72() {
        return _kvjEddy.getH_lag_LI72();
    }

    /**
    * Sets the h_lag_ l i72 of this kvj eddy.
    *
    * @param h_lag_LI72 the h_lag_ l i72 of this kvj eddy
    */
    @Override
    public void setH_lag_LI72(float h_lag_LI72) {
        _kvjEddy.setH_lag_LI72(h_lag_LI72);
    }

    /**
    * Returns the h_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @return the h_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getH_lag_LI72_EMEP() {
        return _kvjEddy.getH_lag_LI72_EMEP();
    }

    /**
    * Sets the h_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @param h_lag_LI72_EMEP the h_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setH_lag_LI72_EMEP(int h_lag_LI72_EMEP) {
        _kvjEddy.setH_lag_LI72_EMEP(h_lag_LI72_EMEP);
    }

    /**
    * Returns the t_lag_ l i72 of this kvj eddy.
    *
    * @return the t_lag_ l i72 of this kvj eddy
    */
    @Override
    public float getT_lag_LI72() {
        return _kvjEddy.getT_lag_LI72();
    }

    /**
    * Sets the t_lag_ l i72 of this kvj eddy.
    *
    * @param t_lag_LI72 the t_lag_ l i72 of this kvj eddy
    */
    @Override
    public void setT_lag_LI72(float t_lag_LI72) {
        _kvjEddy.setT_lag_LI72(t_lag_LI72);
    }

    /**
    * Returns the t_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @return the t_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getT_lag_LI72_EMEP() {
        return _kvjEddy.getT_lag_LI72_EMEP();
    }

    /**
    * Sets the t_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @param t_lag_LI72_EMEP the t_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setT_lag_LI72_EMEP(int t_lag_LI72_EMEP) {
        _kvjEddy.setT_lag_LI72_EMEP(t_lag_LI72_EMEP);
    }

    /**
    * Returns the p_lag_ l i72 of this kvj eddy.
    *
    * @return the p_lag_ l i72 of this kvj eddy
    */
    @Override
    public float getP_lag_LI72() {
        return _kvjEddy.getP_lag_LI72();
    }

    /**
    * Sets the p_lag_ l i72 of this kvj eddy.
    *
    * @param p_lag_LI72 the p_lag_ l i72 of this kvj eddy
    */
    @Override
    public void setP_lag_LI72(float p_lag_LI72) {
        _kvjEddy.setP_lag_LI72(p_lag_LI72);
    }

    /**
    * Returns the p_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @return the p_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getP_lag_LI72_EMEP() {
        return _kvjEddy.getP_lag_LI72_EMEP();
    }

    /**
    * Sets the p_lag_ l i72_ e m e p of this kvj eddy.
    *
    * @param p_lag_LI72_EMEP the p_lag_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setP_lag_LI72_EMEP(int p_lag_LI72_EMEP) {
        _kvjEddy.setP_lag_LI72_EMEP(p_lag_LI72_EMEP);
    }

    /**
    * Returns the h_lag_ p i c a of this kvj eddy.
    *
    * @return the h_lag_ p i c a of this kvj eddy
    */
    @Override
    public float getH_lag_PICA() {
        return _kvjEddy.getH_lag_PICA();
    }

    /**
    * Sets the h_lag_ p i c a of this kvj eddy.
    *
    * @param h_lag_PICA the h_lag_ p i c a of this kvj eddy
    */
    @Override
    public void setH_lag_PICA(float h_lag_PICA) {
        _kvjEddy.setH_lag_PICA(h_lag_PICA);
    }

    /**
    * Returns the h_lag_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the h_lag_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getH_lag_PICA_EMEP() {
        return _kvjEddy.getH_lag_PICA_EMEP();
    }

    /**
    * Sets the h_lag_ p i c a_ e m e p of this kvj eddy.
    *
    * @param h_lag_PICA_EMEP the h_lag_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setH_lag_PICA_EMEP(int h_lag_PICA_EMEP) {
        _kvjEddy.setH_lag_PICA_EMEP(h_lag_PICA_EMEP);
    }

    /**
    * Returns the c h4_lag of this kvj eddy.
    *
    * @return the c h4_lag of this kvj eddy
    */
    @Override
    public float getCH4_lag() {
        return _kvjEddy.getCH4_lag();
    }

    /**
    * Sets the c h4_lag of this kvj eddy.
    *
    * @param CH4_lag the c h4_lag of this kvj eddy
    */
    @Override
    public void setCH4_lag(float CH4_lag) {
        _kvjEddy.setCH4_lag(CH4_lag);
    }

    /**
    * Returns the c h4_lag_ e m e p of this kvj eddy.
    *
    * @return the c h4_lag_ e m e p of this kvj eddy
    */
    @Override
    public int getCH4_lag_EMEP() {
        return _kvjEddy.getCH4_lag_EMEP();
    }

    /**
    * Sets the c h4_lag_ e m e p of this kvj eddy.
    *
    * @param CH4_lag_EMEP the c h4_lag_ e m e p of this kvj eddy
    */
    @Override
    public void setCH4_lag_EMEP(int CH4_lag_EMEP) {
        _kvjEddy.setCH4_lag_EMEP(CH4_lag_EMEP);
    }

    /**
    * Returns the nspikes_u of this kvj eddy.
    *
    * @return the nspikes_u of this kvj eddy
    */
    @Override
    public int getNspikes_u() {
        return _kvjEddy.getNspikes_u();
    }

    /**
    * Sets the nspikes_u of this kvj eddy.
    *
    * @param Nspikes_u the nspikes_u of this kvj eddy
    */
    @Override
    public void setNspikes_u(int Nspikes_u) {
        _kvjEddy.setNspikes_u(Nspikes_u);
    }

    /**
    * Returns the nspikes_u_ e m e p of this kvj eddy.
    *
    * @return the nspikes_u_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_u_EMEP() {
        return _kvjEddy.getNspikes_u_EMEP();
    }

    /**
    * Sets the nspikes_u_ e m e p of this kvj eddy.
    *
    * @param Nspikes_u_EMEP the nspikes_u_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_u_EMEP(int Nspikes_u_EMEP) {
        _kvjEddy.setNspikes_u_EMEP(Nspikes_u_EMEP);
    }

    /**
    * Returns the nspikes_v of this kvj eddy.
    *
    * @return the nspikes_v of this kvj eddy
    */
    @Override
    public int getNspikes_v() {
        return _kvjEddy.getNspikes_v();
    }

    /**
    * Sets the nspikes_v of this kvj eddy.
    *
    * @param Nspikes_v the nspikes_v of this kvj eddy
    */
    @Override
    public void setNspikes_v(int Nspikes_v) {
        _kvjEddy.setNspikes_v(Nspikes_v);
    }

    /**
    * Returns the nspikes_v_ e m e p of this kvj eddy.
    *
    * @return the nspikes_v_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_v_EMEP() {
        return _kvjEddy.getNspikes_v_EMEP();
    }

    /**
    * Sets the nspikes_v_ e m e p of this kvj eddy.
    *
    * @param Nspikes_v_EMEP the nspikes_v_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_v_EMEP(int Nspikes_v_EMEP) {
        _kvjEddy.setNspikes_v_EMEP(Nspikes_v_EMEP);
    }

    /**
    * Returns the nspikes_w of this kvj eddy.
    *
    * @return the nspikes_w of this kvj eddy
    */
    @Override
    public int getNspikes_w() {
        return _kvjEddy.getNspikes_w();
    }

    /**
    * Sets the nspikes_w of this kvj eddy.
    *
    * @param Nspikes_w the nspikes_w of this kvj eddy
    */
    @Override
    public void setNspikes_w(int Nspikes_w) {
        _kvjEddy.setNspikes_w(Nspikes_w);
    }

    /**
    * Returns the nspikes_w_ e m e p of this kvj eddy.
    *
    * @return the nspikes_w_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_w_EMEP() {
        return _kvjEddy.getNspikes_w_EMEP();
    }

    /**
    * Sets the nspikes_w_ e m e p of this kvj eddy.
    *
    * @param Nspikes_w_EMEP the nspikes_w_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_w_EMEP(int Nspikes_w_EMEP) {
        _kvjEddy.setNspikes_w_EMEP(Nspikes_w_EMEP);
    }

    /**
    * Returns the nspikes_ ts of this kvj eddy.
    *
    * @return the nspikes_ ts of this kvj eddy
    */
    @Override
    public int getNspikes_Ts() {
        return _kvjEddy.getNspikes_Ts();
    }

    /**
    * Sets the nspikes_ ts of this kvj eddy.
    *
    * @param Nspikes_Ts the nspikes_ ts of this kvj eddy
    */
    @Override
    public void setNspikes_Ts(int Nspikes_Ts) {
        _kvjEddy.setNspikes_Ts(Nspikes_Ts);
    }

    /**
    * Returns the nspikes_ ts_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_Ts_EMEP() {
        return _kvjEddy.getNspikes_Ts_EMEP();
    }

    /**
    * Sets the nspikes_ ts_ e m e p of this kvj eddy.
    *
    * @param Nspikes_Ts_EMEP the nspikes_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_Ts_EMEP(int Nspikes_Ts_EMEP) {
        _kvjEddy.setNspikes_Ts_EMEP(Nspikes_Ts_EMEP);
    }

    /**
    * Returns the nspikes_ c o2_ l i72 of this kvj eddy.
    *
    * @return the nspikes_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public int getNspikes_CO2_LI72() {
        return _kvjEddy.getNspikes_CO2_LI72();
    }

    /**
    * Sets the nspikes_ c o2_ l i72 of this kvj eddy.
    *
    * @param Nspikes_CO2_LI72 the nspikes_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setNspikes_CO2_LI72(int Nspikes_CO2_LI72) {
        _kvjEddy.setNspikes_CO2_LI72(Nspikes_CO2_LI72);
    }

    /**
    * Returns the nspikes_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_CO2_LI72_EMEP() {
        return _kvjEddy.getNspikes_CO2_LI72_EMEP();
    }

    /**
    * Sets the nspikes_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param Nspikes_CO2_LI72_EMEP the nspikes_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_CO2_LI72_EMEP(int Nspikes_CO2_LI72_EMEP) {
        _kvjEddy.setNspikes_CO2_LI72_EMEP(Nspikes_CO2_LI72_EMEP);
    }

    /**
    * Returns the nspikes_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the nspikes_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public int getNspikes_H2O_LI72() {
        return _kvjEddy.getNspikes_H2O_LI72();
    }

    /**
    * Sets the nspikes_ h2 o_ l i72 of this kvj eddy.
    *
    * @param Nspikes_H2O_LI72 the nspikes_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setNspikes_H2O_LI72(int Nspikes_H2O_LI72) {
        _kvjEddy.setNspikes_H2O_LI72(Nspikes_H2O_LI72);
    }

    /**
    * Returns the nspikes_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_H2O_LI72_EMEP() {
        return _kvjEddy.getNspikes_H2O_LI72_EMEP();
    }

    /**
    * Sets the nspikes_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param Nspikes_H2O_LI72_EMEP the nspikes_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_H2O_LI72_EMEP(int Nspikes_H2O_LI72_EMEP) {
        _kvjEddy.setNspikes_H2O_LI72_EMEP(Nspikes_H2O_LI72_EMEP);
    }

    /**
    * Returns the nspikes_ t_ c_ l i72 of this kvj eddy.
    *
    * @return the nspikes_ t_ c_ l i72 of this kvj eddy
    */
    @Override
    public int getNspikes_T_C_LI72() {
        return _kvjEddy.getNspikes_T_C_LI72();
    }

    /**
    * Sets the nspikes_ t_ c_ l i72 of this kvj eddy.
    *
    * @param Nspikes_T_C_LI72 the nspikes_ t_ c_ l i72 of this kvj eddy
    */
    @Override
    public void setNspikes_T_C_LI72(int Nspikes_T_C_LI72) {
        _kvjEddy.setNspikes_T_C_LI72(Nspikes_T_C_LI72);
    }

    /**
    * Returns the nspikes_ t_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ t_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_T_C_LI72_EMEP() {
        return _kvjEddy.getNspikes_T_C_LI72_EMEP();
    }

    /**
    * Sets the nspikes_ t_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @param Nspikes_T_C_LI72_EMEP the nspikes_ t_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_T_C_LI72_EMEP(int Nspikes_T_C_LI72_EMEP) {
        _kvjEddy.setNspikes_T_C_LI72_EMEP(Nspikes_T_C_LI72_EMEP);
    }

    /**
    * Returns the nspikes_ p_ c_ l i72 of this kvj eddy.
    *
    * @return the nspikes_ p_ c_ l i72 of this kvj eddy
    */
    @Override
    public int getNspikes_P_C_LI72() {
        return _kvjEddy.getNspikes_P_C_LI72();
    }

    /**
    * Sets the nspikes_ p_ c_ l i72 of this kvj eddy.
    *
    * @param Nspikes_P_C_LI72 the nspikes_ p_ c_ l i72 of this kvj eddy
    */
    @Override
    public void setNspikes_P_C_LI72(int Nspikes_P_C_LI72) {
        _kvjEddy.setNspikes_P_C_LI72(Nspikes_P_C_LI72);
    }

    /**
    * Returns the nspikes_ p_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ p_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_P_C_LI72_EMEP() {
        return _kvjEddy.getNspikes_P_C_LI72_EMEP();
    }

    /**
    * Sets the nspikes_ p_ c_ l i72_ e m e p of this kvj eddy.
    *
    * @param Nspikes_P_C_LI72_EMEP the nspikes_ p_ c_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_P_C_LI72_EMEP(int Nspikes_P_C_LI72_EMEP) {
        _kvjEddy.setNspikes_P_C_LI72_EMEP(Nspikes_P_C_LI72_EMEP);
    }

    /**
    * Returns the nspikes_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the nspikes_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public int getNspikes_H2O_PICA() {
        return _kvjEddy.getNspikes_H2O_PICA();
    }

    /**
    * Sets the nspikes_ h2 o_ p i c a of this kvj eddy.
    *
    * @param Nspikes_H2O_PICA the nspikes_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setNspikes_H2O_PICA(int Nspikes_H2O_PICA) {
        _kvjEddy.setNspikes_H2O_PICA(Nspikes_H2O_PICA);
    }

    /**
    * Returns the nspikes_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_H2O_PICA_EMEP() {
        return _kvjEddy.getNspikes_H2O_PICA_EMEP();
    }

    /**
    * Sets the nspikes_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Nspikes_H2O_PICA_EMEP the nspikes_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_H2O_PICA_EMEP(int Nspikes_H2O_PICA_EMEP) {
        _kvjEddy.setNspikes_H2O_PICA_EMEP(Nspikes_H2O_PICA_EMEP);
    }

    /**
    * Returns the nspikes_ c h4_ p i c a of this kvj eddy.
    *
    * @return the nspikes_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public int getNspikes_CH4_PICA() {
        return _kvjEddy.getNspikes_CH4_PICA();
    }

    /**
    * Sets the nspikes_ c h4_ p i c a of this kvj eddy.
    *
    * @param Nspikes_CH4_PICA the nspikes_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setNspikes_CH4_PICA(int Nspikes_CH4_PICA) {
        _kvjEddy.setNspikes_CH4_PICA(Nspikes_CH4_PICA);
    }

    /**
    * Returns the nspikes_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the nspikes_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getNspikes_CH4_PICA_EMEP() {
        return _kvjEddy.getNspikes_CH4_PICA_EMEP();
    }

    /**
    * Sets the nspikes_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Nspikes_CH4_PICA_EMEP the nspikes_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setNspikes_CH4_PICA_EMEP(int Nspikes_CH4_PICA_EMEP) {
        _kvjEddy.setNspikes_CH4_PICA_EMEP(Nspikes_CH4_PICA_EMEP);
    }

    /**
    * Returns the f i_u of this kvj eddy.
    *
    * @return the f i_u of this kvj eddy
    */
    @Override
    public float getFI_u() {
        return _kvjEddy.getFI_u();
    }

    /**
    * Sets the f i_u of this kvj eddy.
    *
    * @param FI_u the f i_u of this kvj eddy
    */
    @Override
    public void setFI_u(float FI_u) {
        _kvjEddy.setFI_u(FI_u);
    }

    /**
    * Returns the f i_u_ e m e p of this kvj eddy.
    *
    * @return the f i_u_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_u_EMEP() {
        return _kvjEddy.getFI_u_EMEP();
    }

    /**
    * Sets the f i_u_ e m e p of this kvj eddy.
    *
    * @param FI_u_EMEP the f i_u_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_u_EMEP(int FI_u_EMEP) {
        _kvjEddy.setFI_u_EMEP(FI_u_EMEP);
    }

    /**
    * Returns the f i_ ts of this kvj eddy.
    *
    * @return the f i_ ts of this kvj eddy
    */
    @Override
    public float getFI_Ts() {
        return _kvjEddy.getFI_Ts();
    }

    /**
    * Sets the f i_ ts of this kvj eddy.
    *
    * @param FI_Ts the f i_ ts of this kvj eddy
    */
    @Override
    public void setFI_Ts(float FI_Ts) {
        _kvjEddy.setFI_Ts(FI_Ts);
    }

    /**
    * Returns the f i_ ts_ e m e p of this kvj eddy.
    *
    * @return the f i_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_Ts_EMEP() {
        return _kvjEddy.getFI_Ts_EMEP();
    }

    /**
    * Sets the f i_ ts_ e m e p of this kvj eddy.
    *
    * @param FI_Ts_EMEP the f i_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_Ts_EMEP(int FI_Ts_EMEP) {
        _kvjEddy.setFI_Ts_EMEP(FI_Ts_EMEP);
    }

    /**
    * Returns the f i_ c o2_ l i72 of this kvj eddy.
    *
    * @return the f i_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getFI_CO2_LI72() {
        return _kvjEddy.getFI_CO2_LI72();
    }

    /**
    * Sets the f i_ c o2_ l i72 of this kvj eddy.
    *
    * @param FI_CO2_LI72 the f i_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setFI_CO2_LI72(float FI_CO2_LI72) {
        _kvjEddy.setFI_CO2_LI72(FI_CO2_LI72);
    }

    /**
    * Returns the f i_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f i_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_CO2_LI72_EMEP() {
        return _kvjEddy.getFI_CO2_LI72_EMEP();
    }

    /**
    * Sets the f i_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param FI_CO2_LI72_EMEP the f i_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_CO2_LI72_EMEP(int FI_CO2_LI72_EMEP) {
        _kvjEddy.setFI_CO2_LI72_EMEP(FI_CO2_LI72_EMEP);
    }

    /**
    * Returns the f i_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the f i_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getFI_H2O_LI72() {
        return _kvjEddy.getFI_H2O_LI72();
    }

    /**
    * Sets the f i_ h2 o_ l i72 of this kvj eddy.
    *
    * @param FI_H2O_LI72 the f i_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setFI_H2O_LI72(float FI_H2O_LI72) {
        _kvjEddy.setFI_H2O_LI72(FI_H2O_LI72);
    }

    /**
    * Returns the f i_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f i_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_H2O_LI72_EMEP() {
        return _kvjEddy.getFI_H2O_LI72_EMEP();
    }

    /**
    * Sets the f i_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param FI_H2O_LI72_EMEP the f i_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_H2O_LI72_EMEP(int FI_H2O_LI72_EMEP) {
        _kvjEddy.setFI_H2O_LI72_EMEP(FI_H2O_LI72_EMEP);
    }

    /**
    * Returns the f i_ c h4_ p i c a of this kvj eddy.
    *
    * @return the f i_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getFI_CH4_PICA() {
        return _kvjEddy.getFI_CH4_PICA();
    }

    /**
    * Sets the f i_ c h4_ p i c a of this kvj eddy.
    *
    * @param FI_CH4_PICA the f i_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setFI_CH4_PICA(float FI_CH4_PICA) {
        _kvjEddy.setFI_CH4_PICA(FI_CH4_PICA);
    }

    /**
    * Returns the f i_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f i_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_CH4_PICA_EMEP() {
        return _kvjEddy.getFI_CH4_PICA_EMEP();
    }

    /**
    * Sets the f i_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FI_CH4_PICA_EMEP the f i_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_CH4_PICA_EMEP(int FI_CH4_PICA_EMEP) {
        _kvjEddy.setFI_CH4_PICA_EMEP(FI_CH4_PICA_EMEP);
    }

    /**
    * Returns the f i_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the f i_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getFI_H2O_PICA() {
        return _kvjEddy.getFI_H2O_PICA();
    }

    /**
    * Sets the f i_ h2 o_ p i c a of this kvj eddy.
    *
    * @param FI_H2O_PICA the f i_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setFI_H2O_PICA(float FI_H2O_PICA) {
        _kvjEddy.setFI_H2O_PICA(FI_H2O_PICA);
    }

    /**
    * Returns the f i_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f i_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFI_H2O_PICA_EMEP() {
        return _kvjEddy.getFI_H2O_PICA_EMEP();
    }

    /**
    * Sets the f i_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FI_H2O_PICA_EMEP the f i_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFI_H2O_PICA_EMEP(int FI_H2O_PICA_EMEP) {
        _kvjEddy.setFI_H2O_PICA_EMEP(FI_H2O_PICA_EMEP);
    }

    /**
    * Returns the f s t_u of this kvj eddy.
    *
    * @return the f s t_u of this kvj eddy
    */
    @Override
    public float getFST_u() {
        return _kvjEddy.getFST_u();
    }

    /**
    * Sets the f s t_u of this kvj eddy.
    *
    * @param FST_u the f s t_u of this kvj eddy
    */
    @Override
    public void setFST_u(float FST_u) {
        _kvjEddy.setFST_u(FST_u);
    }

    /**
    * Returns the f s t_u_ e m e p of this kvj eddy.
    *
    * @return the f s t_u_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_u_EMEP() {
        return _kvjEddy.getFST_u_EMEP();
    }

    /**
    * Sets the f s t_u_ e m e p of this kvj eddy.
    *
    * @param FST_u_EMEP the f s t_u_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_u_EMEP(int FST_u_EMEP) {
        _kvjEddy.setFST_u_EMEP(FST_u_EMEP);
    }

    /**
    * Returns the f s t_ ts of this kvj eddy.
    *
    * @return the f s t_ ts of this kvj eddy
    */
    @Override
    public float getFST_Ts() {
        return _kvjEddy.getFST_Ts();
    }

    /**
    * Sets the f s t_ ts of this kvj eddy.
    *
    * @param FST_Ts the f s t_ ts of this kvj eddy
    */
    @Override
    public void setFST_Ts(float FST_Ts) {
        _kvjEddy.setFST_Ts(FST_Ts);
    }

    /**
    * Returns the f s t_ ts_ e m e p of this kvj eddy.
    *
    * @return the f s t_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_Ts_EMEP() {
        return _kvjEddy.getFST_Ts_EMEP();
    }

    /**
    * Sets the f s t_ ts_ e m e p of this kvj eddy.
    *
    * @param FST_Ts_EMEP the f s t_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_Ts_EMEP(int FST_Ts_EMEP) {
        _kvjEddy.setFST_Ts_EMEP(FST_Ts_EMEP);
    }

    /**
    * Returns the f s t_ c o2_ l i72 of this kvj eddy.
    *
    * @return the f s t_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getFST_CO2_LI72() {
        return _kvjEddy.getFST_CO2_LI72();
    }

    /**
    * Sets the f s t_ c o2_ l i72 of this kvj eddy.
    *
    * @param FST_CO2_LI72 the f s t_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setFST_CO2_LI72(float FST_CO2_LI72) {
        _kvjEddy.setFST_CO2_LI72(FST_CO2_LI72);
    }

    /**
    * Returns the f s t_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f s t_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_CO2_LI72_EMEP() {
        return _kvjEddy.getFST_CO2_LI72_EMEP();
    }

    /**
    * Sets the f s t_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param FST_CO2_LI72_EMEP the f s t_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_CO2_LI72_EMEP(int FST_CO2_LI72_EMEP) {
        _kvjEddy.setFST_CO2_LI72_EMEP(FST_CO2_LI72_EMEP);
    }

    /**
    * Returns the f s t_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the f s t_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getFST_H2O_LI72() {
        return _kvjEddy.getFST_H2O_LI72();
    }

    /**
    * Sets the f s t_ h2 o_ l i72 of this kvj eddy.
    *
    * @param FST_H2O_LI72 the f s t_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setFST_H2O_LI72(float FST_H2O_LI72) {
        _kvjEddy.setFST_H2O_LI72(FST_H2O_LI72);
    }

    /**
    * Returns the f s t_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f s t_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_H2O_LI72_EMEP() {
        return _kvjEddy.getFST_H2O_LI72_EMEP();
    }

    /**
    * Sets the f s t_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param FST_H2O_LI72_EMEP the f s t_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_H2O_LI72_EMEP(int FST_H2O_LI72_EMEP) {
        _kvjEddy.setFST_H2O_LI72_EMEP(FST_H2O_LI72_EMEP);
    }

    /**
    * Returns the f s t_ c h4_ p i c a of this kvj eddy.
    *
    * @return the f s t_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getFST_CH4_PICA() {
        return _kvjEddy.getFST_CH4_PICA();
    }

    /**
    * Sets the f s t_ c h4_ p i c a of this kvj eddy.
    *
    * @param FST_CH4_PICA the f s t_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setFST_CH4_PICA(float FST_CH4_PICA) {
        _kvjEddy.setFST_CH4_PICA(FST_CH4_PICA);
    }

    /**
    * Returns the f s t_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f s t_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_CH4_PICA_EMEP() {
        return _kvjEddy.getFST_CH4_PICA_EMEP();
    }

    /**
    * Sets the f s t_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FST_CH4_PICA_EMEP the f s t_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_CH4_PICA_EMEP(int FST_CH4_PICA_EMEP) {
        _kvjEddy.setFST_CH4_PICA_EMEP(FST_CH4_PICA_EMEP);
    }

    /**
    * Returns the f s t_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the f s t_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getFST_H2O_PICA() {
        return _kvjEddy.getFST_H2O_PICA();
    }

    /**
    * Sets the f s t_ h2 o_ p i c a of this kvj eddy.
    *
    * @param FST_H2O_PICA the f s t_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setFST_H2O_PICA(float FST_H2O_PICA) {
        _kvjEddy.setFST_H2O_PICA(FST_H2O_PICA);
    }

    /**
    * Returns the f s t_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f s t_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_H2O_PICA_EMEP() {
        return _kvjEddy.getFST_H2O_PICA_EMEP();
    }

    /**
    * Sets the f s t_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FST_H2O_PICA_EMEP the f s t_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_H2O_PICA_EMEP(int FST_H2O_PICA_EMEP) {
        _kvjEddy.setFST_H2O_PICA_EMEP(FST_H2O_PICA_EMEP);
    }

    /**
    * Returns the r f e_u of this kvj eddy.
    *
    * @return the r f e_u of this kvj eddy
    */
    @Override
    public float getRFE_u() {
        return _kvjEddy.getRFE_u();
    }

    /**
    * Sets the r f e_u of this kvj eddy.
    *
    * @param RFE_u the r f e_u of this kvj eddy
    */
    @Override
    public void setRFE_u(float RFE_u) {
        _kvjEddy.setRFE_u(RFE_u);
    }

    /**
    * Returns the r f e_u_ e m e p of this kvj eddy.
    *
    * @return the r f e_u_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_u_EMEP() {
        return _kvjEddy.getRFE_u_EMEP();
    }

    /**
    * Sets the r f e_u_ e m e p of this kvj eddy.
    *
    * @param RFE_u_EMEP the r f e_u_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_u_EMEP(int RFE_u_EMEP) {
        _kvjEddy.setRFE_u_EMEP(RFE_u_EMEP);
    }

    /**
    * Returns the r f e_ ts of this kvj eddy.
    *
    * @return the r f e_ ts of this kvj eddy
    */
    @Override
    public float getRFE_Ts() {
        return _kvjEddy.getRFE_Ts();
    }

    /**
    * Sets the r f e_ ts of this kvj eddy.
    *
    * @param RFE_Ts the r f e_ ts of this kvj eddy
    */
    @Override
    public void setRFE_Ts(float RFE_Ts) {
        _kvjEddy.setRFE_Ts(RFE_Ts);
    }

    /**
    * Returns the r f e_ ts_ e m e p of this kvj eddy.
    *
    * @return the r f e_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_Ts_EMEP() {
        return _kvjEddy.getRFE_Ts_EMEP();
    }

    /**
    * Sets the r f e_ ts_ e m e p of this kvj eddy.
    *
    * @param RFE_Ts_EMEP the r f e_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_Ts_EMEP(int RFE_Ts_EMEP) {
        _kvjEddy.setRFE_Ts_EMEP(RFE_Ts_EMEP);
    }

    /**
    * Returns the r f e_ c o2_ l i72 of this kvj eddy.
    *
    * @return the r f e_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getRFE_CO2_LI72() {
        return _kvjEddy.getRFE_CO2_LI72();
    }

    /**
    * Sets the r f e_ c o2_ l i72 of this kvj eddy.
    *
    * @param RFE_CO2_LI72 the r f e_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setRFE_CO2_LI72(float RFE_CO2_LI72) {
        _kvjEddy.setRFE_CO2_LI72(RFE_CO2_LI72);
    }

    /**
    * Returns the r f e_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the r f e_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_CO2_LI72_EMEP() {
        return _kvjEddy.getRFE_CO2_LI72_EMEP();
    }

    /**
    * Sets the r f e_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param RFE_CO2_LI72_EMEP the r f e_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_CO2_LI72_EMEP(int RFE_CO2_LI72_EMEP) {
        _kvjEddy.setRFE_CO2_LI72_EMEP(RFE_CO2_LI72_EMEP);
    }

    /**
    * Returns the r f e_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the r f e_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getRFE_H2O_LI72() {
        return _kvjEddy.getRFE_H2O_LI72();
    }

    /**
    * Sets the r f e_ h2 o_ l i72 of this kvj eddy.
    *
    * @param RFE_H2O_LI72 the r f e_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setRFE_H2O_LI72(float RFE_H2O_LI72) {
        _kvjEddy.setRFE_H2O_LI72(RFE_H2O_LI72);
    }

    /**
    * Returns the r f e_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the r f e_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_H2O_LI72_EMEP() {
        return _kvjEddy.getRFE_H2O_LI72_EMEP();
    }

    /**
    * Sets the r f e_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param RFE_H2O_LI72_EMEP the r f e_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_H2O_LI72_EMEP(int RFE_H2O_LI72_EMEP) {
        _kvjEddy.setRFE_H2O_LI72_EMEP(RFE_H2O_LI72_EMEP);
    }

    /**
    * Returns the r f e_ c h4_ p i c a of this kvj eddy.
    *
    * @return the r f e_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getRFE_CH4_PICA() {
        return _kvjEddy.getRFE_CH4_PICA();
    }

    /**
    * Sets the r f e_ c h4_ p i c a of this kvj eddy.
    *
    * @param RFE_CH4_PICA the r f e_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setRFE_CH4_PICA(float RFE_CH4_PICA) {
        _kvjEddy.setRFE_CH4_PICA(RFE_CH4_PICA);
    }

    /**
    * Returns the r f e_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the r f e_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_CH4_PICA_EMEP() {
        return _kvjEddy.getRFE_CH4_PICA_EMEP();
    }

    /**
    * Sets the r f e_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param RFE_CH4_PICA_EMEP the r f e_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_CH4_PICA_EMEP(int RFE_CH4_PICA_EMEP) {
        _kvjEddy.setRFE_CH4_PICA_EMEP(RFE_CH4_PICA_EMEP);
    }

    /**
    * Returns the r f e_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the r f e_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getRFE_H2O_PICA() {
        return _kvjEddy.getRFE_H2O_PICA();
    }

    /**
    * Sets the r f e_ h2 o_ p i c a of this kvj eddy.
    *
    * @param RFE_H2O_PICA the r f e_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setRFE_H2O_PICA(float RFE_H2O_PICA) {
        _kvjEddy.setRFE_H2O_PICA(RFE_H2O_PICA);
    }

    /**
    * Returns the r f e_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the r f e_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getRFE_H2O_PICA_EMEP() {
        return _kvjEddy.getRFE_H2O_PICA_EMEP();
    }

    /**
    * Sets the r f e_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param RFE_H2O_PICA_EMEP the r f e_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setRFE_H2O_PICA_EMEP(int RFE_H2O_PICA_EMEP) {
        _kvjEddy.setRFE_H2O_PICA_EMEP(RFE_H2O_PICA_EMEP);
    }

    /**
    * Returns the f a_u of this kvj eddy.
    *
    * @return the f a_u of this kvj eddy
    */
    @Override
    public float getFA_u() {
        return _kvjEddy.getFA_u();
    }

    /**
    * Sets the f a_u of this kvj eddy.
    *
    * @param FA_u the f a_u of this kvj eddy
    */
    @Override
    public void setFA_u(float FA_u) {
        _kvjEddy.setFA_u(FA_u);
    }

    /**
    * Returns the f a_u_ e m e p of this kvj eddy.
    *
    * @return the f a_u_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_u_EMEP() {
        return _kvjEddy.getFA_u_EMEP();
    }

    /**
    * Sets the f a_u_ e m e p of this kvj eddy.
    *
    * @param FA_u_EMEP the f a_u_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_u_EMEP(int FA_u_EMEP) {
        _kvjEddy.setFA_u_EMEP(FA_u_EMEP);
    }

    /**
    * Returns the f a_v of this kvj eddy.
    *
    * @return the f a_v of this kvj eddy
    */
    @Override
    public float getFA_v() {
        return _kvjEddy.getFA_v();
    }

    /**
    * Sets the f a_v of this kvj eddy.
    *
    * @param FA_v the f a_v of this kvj eddy
    */
    @Override
    public void setFA_v(float FA_v) {
        _kvjEddy.setFA_v(FA_v);
    }

    /**
    * Returns the f a_v_ e m e p of this kvj eddy.
    *
    * @return the f a_v_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_v_EMEP() {
        return _kvjEddy.getFA_v_EMEP();
    }

    /**
    * Sets the f a_v_ e m e p of this kvj eddy.
    *
    * @param FA_v_EMEP the f a_v_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_v_EMEP(int FA_v_EMEP) {
        _kvjEddy.setFA_v_EMEP(FA_v_EMEP);
    }

    /**
    * Returns the f a_ ts of this kvj eddy.
    *
    * @return the f a_ ts of this kvj eddy
    */
    @Override
    public float getFA_Ts() {
        return _kvjEddy.getFA_Ts();
    }

    /**
    * Sets the f a_ ts of this kvj eddy.
    *
    * @param FA_Ts the f a_ ts of this kvj eddy
    */
    @Override
    public void setFA_Ts(float FA_Ts) {
        _kvjEddy.setFA_Ts(FA_Ts);
    }

    /**
    * Returns the f a_ ts_ e m e p of this kvj eddy.
    *
    * @return the f a_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_Ts_EMEP() {
        return _kvjEddy.getFA_Ts_EMEP();
    }

    /**
    * Sets the f a_ ts_ e m e p of this kvj eddy.
    *
    * @param FA_Ts_EMEP the f a_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_Ts_EMEP(int FA_Ts_EMEP) {
        _kvjEddy.setFA_Ts_EMEP(FA_Ts_EMEP);
    }

    /**
    * Returns the f a_ c o2_ l i72 of this kvj eddy.
    *
    * @return the f a_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getFA_CO2_LI72() {
        return _kvjEddy.getFA_CO2_LI72();
    }

    /**
    * Sets the f a_ c o2_ l i72 of this kvj eddy.
    *
    * @param FA_CO2_LI72 the f a_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setFA_CO2_LI72(float FA_CO2_LI72) {
        _kvjEddy.setFA_CO2_LI72(FA_CO2_LI72);
    }

    /**
    * Returns the f a_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f a_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_CO2_LI72_EMEP() {
        return _kvjEddy.getFA_CO2_LI72_EMEP();
    }

    /**
    * Sets the f a_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param FA_CO2_LI72_EMEP the f a_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_CO2_LI72_EMEP(int FA_CO2_LI72_EMEP) {
        _kvjEddy.setFA_CO2_LI72_EMEP(FA_CO2_LI72_EMEP);
    }

    /**
    * Returns the f a_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the f a_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getFA_H2O_LI72() {
        return _kvjEddy.getFA_H2O_LI72();
    }

    /**
    * Sets the f a_ h2 o_ l i72 of this kvj eddy.
    *
    * @param FA_H2O_LI72 the f a_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setFA_H2O_LI72(float FA_H2O_LI72) {
        _kvjEddy.setFA_H2O_LI72(FA_H2O_LI72);
    }

    /**
    * Returns the f a_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f a_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_H2O_LI72_EMEP() {
        return _kvjEddy.getFA_H2O_LI72_EMEP();
    }

    /**
    * Sets the f a_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param FA_H2O_LI72_EMEP the f a_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_H2O_LI72_EMEP(int FA_H2O_LI72_EMEP) {
        _kvjEddy.setFA_H2O_LI72_EMEP(FA_H2O_LI72_EMEP);
    }

    /**
    * Returns the f a_ c h4_ p i c a of this kvj eddy.
    *
    * @return the f a_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getFA_CH4_PICA() {
        return _kvjEddy.getFA_CH4_PICA();
    }

    /**
    * Sets the f a_ c h4_ p i c a of this kvj eddy.
    *
    * @param FA_CH4_PICA the f a_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setFA_CH4_PICA(float FA_CH4_PICA) {
        _kvjEddy.setFA_CH4_PICA(FA_CH4_PICA);
    }

    /**
    * Returns the f a_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f a_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_CH4_PICA_EMEP() {
        return _kvjEddy.getFA_CH4_PICA_EMEP();
    }

    /**
    * Sets the f a_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FA_CH4_PICA_EMEP the f a_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_CH4_PICA_EMEP(int FA_CH4_PICA_EMEP) {
        _kvjEddy.setFA_CH4_PICA_EMEP(FA_CH4_PICA_EMEP);
    }

    /**
    * Returns the f a_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the f a_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getFA_H2O_PICA() {
        return _kvjEddy.getFA_H2O_PICA();
    }

    /**
    * Sets the f a_ h2 o_ p i c a of this kvj eddy.
    *
    * @param FA_H2O_PICA the f a_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setFA_H2O_PICA(float FA_H2O_PICA) {
        _kvjEddy.setFA_H2O_PICA(FA_H2O_PICA);
    }

    /**
    * Returns the f a_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f a_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFA_H2O_PICA_EMEP() {
        return _kvjEddy.getFA_H2O_PICA_EMEP();
    }

    /**
    * Sets the f a_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FA_H2O_PICA_EMEP the f a_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFA_H2O_PICA_EMEP(int FA_H2O_PICA_EMEP) {
        _kvjEddy.setFA_H2O_PICA_EMEP(FA_H2O_PICA_EMEP);
    }

    /**
    * Returns the covsvar_u of this kvj eddy.
    *
    * @return the covsvar_u of this kvj eddy
    */
    @Override
    public float getCovsvar_u() {
        return _kvjEddy.getCovsvar_u();
    }

    /**
    * Sets the covsvar_u of this kvj eddy.
    *
    * @param covsvar_u the covsvar_u of this kvj eddy
    */
    @Override
    public void setCovsvar_u(float covsvar_u) {
        _kvjEddy.setCovsvar_u(covsvar_u);
    }

    /**
    * Returns the covsvar_u_ e m e p of this kvj eddy.
    *
    * @return the covsvar_u_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_u_EMEP() {
        return _kvjEddy.getCovsvar_u_EMEP();
    }

    /**
    * Sets the covsvar_u_ e m e p of this kvj eddy.
    *
    * @param covsvar_u_EMEP the covsvar_u_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_u_EMEP(int covsvar_u_EMEP) {
        _kvjEddy.setCovsvar_u_EMEP(covsvar_u_EMEP);
    }

    /**
    * Returns the covsvar_v of this kvj eddy.
    *
    * @return the covsvar_v of this kvj eddy
    */
    @Override
    public float getCovsvar_v() {
        return _kvjEddy.getCovsvar_v();
    }

    /**
    * Sets the covsvar_v of this kvj eddy.
    *
    * @param covsvar_v the covsvar_v of this kvj eddy
    */
    @Override
    public void setCovsvar_v(float covsvar_v) {
        _kvjEddy.setCovsvar_v(covsvar_v);
    }

    /**
    * Returns the covsvar_v_ e m e p of this kvj eddy.
    *
    * @return the covsvar_v_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_v_EMEP() {
        return _kvjEddy.getCovsvar_v_EMEP();
    }

    /**
    * Sets the covsvar_v_ e m e p of this kvj eddy.
    *
    * @param covsvar_v_EMEP the covsvar_v_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_v_EMEP(int covsvar_v_EMEP) {
        _kvjEddy.setCovsvar_v_EMEP(covsvar_v_EMEP);
    }

    /**
    * Returns the covsvar_ ts of this kvj eddy.
    *
    * @return the covsvar_ ts of this kvj eddy
    */
    @Override
    public float getCovsvar_Ts() {
        return _kvjEddy.getCovsvar_Ts();
    }

    /**
    * Sets the covsvar_ ts of this kvj eddy.
    *
    * @param covsvar_Ts the covsvar_ ts of this kvj eddy
    */
    @Override
    public void setCovsvar_Ts(float covsvar_Ts) {
        _kvjEddy.setCovsvar_Ts(covsvar_Ts);
    }

    /**
    * Returns the covsvar_ ts_ e m e p of this kvj eddy.
    *
    * @return the covsvar_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_Ts_EMEP() {
        return _kvjEddy.getCovsvar_Ts_EMEP();
    }

    /**
    * Sets the covsvar_ ts_ e m e p of this kvj eddy.
    *
    * @param covsvar_Ts_EMEP the covsvar_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_Ts_EMEP(int covsvar_Ts_EMEP) {
        _kvjEddy.setCovsvar_Ts_EMEP(covsvar_Ts_EMEP);
    }

    /**
    * Returns the covsvar_ c o2_ l i72 of this kvj eddy.
    *
    * @return the covsvar_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getCovsvar_CO2_LI72() {
        return _kvjEddy.getCovsvar_CO2_LI72();
    }

    /**
    * Sets the covsvar_ c o2_ l i72 of this kvj eddy.
    *
    * @param covsvar_CO2_LI72 the covsvar_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setCovsvar_CO2_LI72(float covsvar_CO2_LI72) {
        _kvjEddy.setCovsvar_CO2_LI72(covsvar_CO2_LI72);
    }

    /**
    * Returns the covsvar_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covsvar_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_CO2_LI72_EMEP() {
        return _kvjEddy.getCovsvar_CO2_LI72_EMEP();
    }

    /**
    * Sets the covsvar_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param covsvar_CO2_LI72_EMEP the covsvar_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_CO2_LI72_EMEP(int covsvar_CO2_LI72_EMEP) {
        _kvjEddy.setCovsvar_CO2_LI72_EMEP(covsvar_CO2_LI72_EMEP);
    }

    /**
    * Returns the covsvar_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the covsvar_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getCovsvar_H2O_LI72() {
        return _kvjEddy.getCovsvar_H2O_LI72();
    }

    /**
    * Sets the covsvar_ h2 o_ l i72 of this kvj eddy.
    *
    * @param covsvar_H2O_LI72 the covsvar_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setCovsvar_H2O_LI72(float covsvar_H2O_LI72) {
        _kvjEddy.setCovsvar_H2O_LI72(covsvar_H2O_LI72);
    }

    /**
    * Returns the covsvar_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the covsvar_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_H2O_LI72_EMEP() {
        return _kvjEddy.getCovsvar_H2O_LI72_EMEP();
    }

    /**
    * Sets the covsvar_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param covsvar_H2O_LI72_EMEP the covsvar_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_H2O_LI72_EMEP(int covsvar_H2O_LI72_EMEP) {
        _kvjEddy.setCovsvar_H2O_LI72_EMEP(covsvar_H2O_LI72_EMEP);
    }

    /**
    * Returns the covsvar_ c h4_ p i c a of this kvj eddy.
    *
    * @return the covsvar_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getCovsvar_CH4_PICA() {
        return _kvjEddy.getCovsvar_CH4_PICA();
    }

    /**
    * Sets the covsvar_ c h4_ p i c a of this kvj eddy.
    *
    * @param covsvar_CH4_PICA the covsvar_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setCovsvar_CH4_PICA(float covsvar_CH4_PICA) {
        _kvjEddy.setCovsvar_CH4_PICA(covsvar_CH4_PICA);
    }

    /**
    * Returns the covsvar_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the covsvar_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_CH4_PICA_EMEP() {
        return _kvjEddy.getCovsvar_CH4_PICA_EMEP();
    }

    /**
    * Sets the covsvar_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param covsvar_CH4_PICA_EMEP the covsvar_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_CH4_PICA_EMEP(int covsvar_CH4_PICA_EMEP) {
        _kvjEddy.setCovsvar_CH4_PICA_EMEP(covsvar_CH4_PICA_EMEP);
    }

    /**
    * Returns the covsvar_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the covsvar_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getCovsvar_H2O_PICA() {
        return _kvjEddy.getCovsvar_H2O_PICA();
    }

    /**
    * Sets the covsvar_ h2 o_ p i c a of this kvj eddy.
    *
    * @param covsvar_H2O_PICA the covsvar_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setCovsvar_H2O_PICA(float covsvar_H2O_PICA) {
        _kvjEddy.setCovsvar_H2O_PICA(covsvar_H2O_PICA);
    }

    /**
    * Returns the covsvar_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the covsvar_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getCovsvar_H2O_PICA_EMEP() {
        return _kvjEddy.getCovsvar_H2O_PICA_EMEP();
    }

    /**
    * Sets the covsvar_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param covsvar_H2O_PICA_EMEP the covsvar_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setCovsvar_H2O_PICA_EMEP(int covsvar_H2O_PICA_EMEP) {
        _kvjEddy.setCovsvar_H2O_PICA_EMEP(covsvar_H2O_PICA_EMEP);
    }

    /**
    * Returns the s kx_u of this kvj eddy.
    *
    * @return the s kx_u of this kvj eddy
    */
    @Override
    public float getSKx_u() {
        return _kvjEddy.getSKx_u();
    }

    /**
    * Sets the s kx_u of this kvj eddy.
    *
    * @param SKx_u the s kx_u of this kvj eddy
    */
    @Override
    public void setSKx_u(float SKx_u) {
        _kvjEddy.setSKx_u(SKx_u);
    }

    /**
    * Returns the s kx_u_ e m e p of this kvj eddy.
    *
    * @return the s kx_u_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_u_EMEP() {
        return _kvjEddy.getSKx_u_EMEP();
    }

    /**
    * Sets the s kx_u_ e m e p of this kvj eddy.
    *
    * @param SKx_u_EMEP the s kx_u_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_u_EMEP(int SKx_u_EMEP) {
        _kvjEddy.setSKx_u_EMEP(SKx_u_EMEP);
    }

    /**
    * Returns the s kx_v of this kvj eddy.
    *
    * @return the s kx_v of this kvj eddy
    */
    @Override
    public float getSKx_v() {
        return _kvjEddy.getSKx_v();
    }

    /**
    * Sets the s kx_v of this kvj eddy.
    *
    * @param SKx_v the s kx_v of this kvj eddy
    */
    @Override
    public void setSKx_v(float SKx_v) {
        _kvjEddy.setSKx_v(SKx_v);
    }

    /**
    * Returns the s kx_v_ e m e p of this kvj eddy.
    *
    * @return the s kx_v_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_v_EMEP() {
        return _kvjEddy.getSKx_v_EMEP();
    }

    /**
    * Sets the s kx_v_ e m e p of this kvj eddy.
    *
    * @param SKx_v_EMEP the s kx_v_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_v_EMEP(int SKx_v_EMEP) {
        _kvjEddy.setSKx_v_EMEP(SKx_v_EMEP);
    }

    /**
    * Returns the s kx_w of this kvj eddy.
    *
    * @return the s kx_w of this kvj eddy
    */
    @Override
    public float getSKx_w() {
        return _kvjEddy.getSKx_w();
    }

    /**
    * Sets the s kx_w of this kvj eddy.
    *
    * @param SKx_w the s kx_w of this kvj eddy
    */
    @Override
    public void setSKx_w(float SKx_w) {
        _kvjEddy.setSKx_w(SKx_w);
    }

    /**
    * Returns the s kx_w_ e m e p of this kvj eddy.
    *
    * @return the s kx_w_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_w_EMEP() {
        return _kvjEddy.getSKx_w_EMEP();
    }

    /**
    * Sets the s kx_w_ e m e p of this kvj eddy.
    *
    * @param SKx_w_EMEP the s kx_w_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_w_EMEP(int SKx_w_EMEP) {
        _kvjEddy.setSKx_w_EMEP(SKx_w_EMEP);
    }

    /**
    * Returns the s kx_ ts of this kvj eddy.
    *
    * @return the s kx_ ts of this kvj eddy
    */
    @Override
    public float getSKx_Ts() {
        return _kvjEddy.getSKx_Ts();
    }

    /**
    * Sets the s kx_ ts of this kvj eddy.
    *
    * @param SKx_Ts the s kx_ ts of this kvj eddy
    */
    @Override
    public void setSKx_Ts(float SKx_Ts) {
        _kvjEddy.setSKx_Ts(SKx_Ts);
    }

    /**
    * Returns the s kx_ ts_ e m e p of this kvj eddy.
    *
    * @return the s kx_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_Ts_EMEP() {
        return _kvjEddy.getSKx_Ts_EMEP();
    }

    /**
    * Sets the s kx_ ts_ e m e p of this kvj eddy.
    *
    * @param SKx_Ts_EMEP the s kx_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_Ts_EMEP(int SKx_Ts_EMEP) {
        _kvjEddy.setSKx_Ts_EMEP(SKx_Ts_EMEP);
    }

    /**
    * Returns the s kx_ c o2_ l i72 of this kvj eddy.
    *
    * @return the s kx_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getSKx_CO2_LI72() {
        return _kvjEddy.getSKx_CO2_LI72();
    }

    /**
    * Sets the s kx_ c o2_ l i72 of this kvj eddy.
    *
    * @param SKx_CO2_LI72 the s kx_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setSKx_CO2_LI72(float SKx_CO2_LI72) {
        _kvjEddy.setSKx_CO2_LI72(SKx_CO2_LI72);
    }

    /**
    * Returns the s kx_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the s kx_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_CO2_LI72_EMEP() {
        return _kvjEddy.getSKx_CO2_LI72_EMEP();
    }

    /**
    * Sets the s kx_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param SKx_CO2_LI72_EMEP the s kx_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_CO2_LI72_EMEP(int SKx_CO2_LI72_EMEP) {
        _kvjEddy.setSKx_CO2_LI72_EMEP(SKx_CO2_LI72_EMEP);
    }

    /**
    * Returns the s kx_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the s kx_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getSKx_H2O_LI72() {
        return _kvjEddy.getSKx_H2O_LI72();
    }

    /**
    * Sets the s kx_ h2 o_ l i72 of this kvj eddy.
    *
    * @param SKx_H2O_LI72 the s kx_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setSKx_H2O_LI72(float SKx_H2O_LI72) {
        _kvjEddy.setSKx_H2O_LI72(SKx_H2O_LI72);
    }

    /**
    * Returns the s kx_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the s kx_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_H2O_LI72_EMEP() {
        return _kvjEddy.getSKx_H2O_LI72_EMEP();
    }

    /**
    * Sets the s kx_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param SKx_H2O_LI72_EMEP the s kx_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_H2O_LI72_EMEP(int SKx_H2O_LI72_EMEP) {
        _kvjEddy.setSKx_H2O_LI72_EMEP(SKx_H2O_LI72_EMEP);
    }

    /**
    * Returns the s kx_ c h4_ p i c a of this kvj eddy.
    *
    * @return the s kx_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getSKx_CH4_PICA() {
        return _kvjEddy.getSKx_CH4_PICA();
    }

    /**
    * Sets the s kx_ c h4_ p i c a of this kvj eddy.
    *
    * @param SKx_CH4_PICA the s kx_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setSKx_CH4_PICA(float SKx_CH4_PICA) {
        _kvjEddy.setSKx_CH4_PICA(SKx_CH4_PICA);
    }

    /**
    * Returns the s kx_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the s kx_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_CH4_PICA_EMEP() {
        return _kvjEddy.getSKx_CH4_PICA_EMEP();
    }

    /**
    * Sets the s kx_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param SKx_CH4_PICA_EMEP the s kx_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_CH4_PICA_EMEP(int SKx_CH4_PICA_EMEP) {
        _kvjEddy.setSKx_CH4_PICA_EMEP(SKx_CH4_PICA_EMEP);
    }

    /**
    * Returns the s kx_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the s kx_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getSKx_H2O_PICA() {
        return _kvjEddy.getSKx_H2O_PICA();
    }

    /**
    * Sets the s kx_ h2 o_ p i c a of this kvj eddy.
    *
    * @param SKx_H2O_PICA the s kx_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setSKx_H2O_PICA(float SKx_H2O_PICA) {
        _kvjEddy.setSKx_H2O_PICA(SKx_H2O_PICA);
    }

    /**
    * Returns the s kx_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the s kx_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getSKx_H2O_PICA_EMEP() {
        return _kvjEddy.getSKx_H2O_PICA_EMEP();
    }

    /**
    * Sets the s kx_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param SKx_H2O_PICA_EMEP the s kx_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setSKx_H2O_PICA_EMEP(int SKx_H2O_PICA_EMEP) {
        _kvjEddy.setSKx_H2O_PICA_EMEP(SKx_H2O_PICA_EMEP);
    }

    /**
    * Returns the k ux_u of this kvj eddy.
    *
    * @return the k ux_u of this kvj eddy
    */
    @Override
    public float getKUx_u() {
        return _kvjEddy.getKUx_u();
    }

    /**
    * Sets the k ux_u of this kvj eddy.
    *
    * @param KUx_u the k ux_u of this kvj eddy
    */
    @Override
    public void setKUx_u(float KUx_u) {
        _kvjEddy.setKUx_u(KUx_u);
    }

    /**
    * Returns the k ux_u_ e m e p of this kvj eddy.
    *
    * @return the k ux_u_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_u_EMEP() {
        return _kvjEddy.getKUx_u_EMEP();
    }

    /**
    * Sets the k ux_u_ e m e p of this kvj eddy.
    *
    * @param KUx_u_EMEP the k ux_u_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_u_EMEP(int KUx_u_EMEP) {
        _kvjEddy.setKUx_u_EMEP(KUx_u_EMEP);
    }

    /**
    * Returns the k ux_v of this kvj eddy.
    *
    * @return the k ux_v of this kvj eddy
    */
    @Override
    public float getKUx_v() {
        return _kvjEddy.getKUx_v();
    }

    /**
    * Sets the k ux_v of this kvj eddy.
    *
    * @param KUx_v the k ux_v of this kvj eddy
    */
    @Override
    public void setKUx_v(float KUx_v) {
        _kvjEddy.setKUx_v(KUx_v);
    }

    /**
    * Returns the k ux_v_ e m e p of this kvj eddy.
    *
    * @return the k ux_v_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_v_EMEP() {
        return _kvjEddy.getKUx_v_EMEP();
    }

    /**
    * Sets the k ux_v_ e m e p of this kvj eddy.
    *
    * @param KUx_v_EMEP the k ux_v_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_v_EMEP(int KUx_v_EMEP) {
        _kvjEddy.setKUx_v_EMEP(KUx_v_EMEP);
    }

    /**
    * Returns the k ux_w of this kvj eddy.
    *
    * @return the k ux_w of this kvj eddy
    */
    @Override
    public float getKUx_w() {
        return _kvjEddy.getKUx_w();
    }

    /**
    * Sets the k ux_w of this kvj eddy.
    *
    * @param KUx_w the k ux_w of this kvj eddy
    */
    @Override
    public void setKUx_w(float KUx_w) {
        _kvjEddy.setKUx_w(KUx_w);
    }

    /**
    * Returns the k ux_w_ e m e p of this kvj eddy.
    *
    * @return the k ux_w_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_w_EMEP() {
        return _kvjEddy.getKUx_w_EMEP();
    }

    /**
    * Sets the k ux_w_ e m e p of this kvj eddy.
    *
    * @param KUx_w_EMEP the k ux_w_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_w_EMEP(int KUx_w_EMEP) {
        _kvjEddy.setKUx_w_EMEP(KUx_w_EMEP);
    }

    /**
    * Returns the k ux_ ts of this kvj eddy.
    *
    * @return the k ux_ ts of this kvj eddy
    */
    @Override
    public float getKUx_Ts() {
        return _kvjEddy.getKUx_Ts();
    }

    /**
    * Sets the k ux_ ts of this kvj eddy.
    *
    * @param KUx_Ts the k ux_ ts of this kvj eddy
    */
    @Override
    public void setKUx_Ts(float KUx_Ts) {
        _kvjEddy.setKUx_Ts(KUx_Ts);
    }

    /**
    * Returns the k ux_ ts_ e m e p of this kvj eddy.
    *
    * @return the k ux_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_Ts_EMEP() {
        return _kvjEddy.getKUx_Ts_EMEP();
    }

    /**
    * Sets the k ux_ ts_ e m e p of this kvj eddy.
    *
    * @param KUx_Ts_EMEP the k ux_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_Ts_EMEP(int KUx_Ts_EMEP) {
        _kvjEddy.setKUx_Ts_EMEP(KUx_Ts_EMEP);
    }

    /**
    * Returns the k ux_ c o2_ l i72 of this kvj eddy.
    *
    * @return the k ux_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getKUx_CO2_LI72() {
        return _kvjEddy.getKUx_CO2_LI72();
    }

    /**
    * Sets the k ux_ c o2_ l i72 of this kvj eddy.
    *
    * @param KUx_CO2_LI72 the k ux_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setKUx_CO2_LI72(float KUx_CO2_LI72) {
        _kvjEddy.setKUx_CO2_LI72(KUx_CO2_LI72);
    }

    /**
    * Returns the k ux_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the k ux_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_CO2_LI72_EMEP() {
        return _kvjEddy.getKUx_CO2_LI72_EMEP();
    }

    /**
    * Sets the k ux_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param KUx_CO2_LI72_EMEP the k ux_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_CO2_LI72_EMEP(int KUx_CO2_LI72_EMEP) {
        _kvjEddy.setKUx_CO2_LI72_EMEP(KUx_CO2_LI72_EMEP);
    }

    /**
    * Returns the k ux_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the k ux_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getKUx_H2O_LI72() {
        return _kvjEddy.getKUx_H2O_LI72();
    }

    /**
    * Sets the k ux_ h2 o_ l i72 of this kvj eddy.
    *
    * @param KUx_H2O_LI72 the k ux_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setKUx_H2O_LI72(float KUx_H2O_LI72) {
        _kvjEddy.setKUx_H2O_LI72(KUx_H2O_LI72);
    }

    /**
    * Returns the k ux_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the k ux_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_H2O_LI72_EMEP() {
        return _kvjEddy.getKUx_H2O_LI72_EMEP();
    }

    /**
    * Sets the k ux_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param KUx_H2O_LI72_EMEP the k ux_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_H2O_LI72_EMEP(int KUx_H2O_LI72_EMEP) {
        _kvjEddy.setKUx_H2O_LI72_EMEP(KUx_H2O_LI72_EMEP);
    }

    /**
    * Returns the k ux_ c h4_ p i c a of this kvj eddy.
    *
    * @return the k ux_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getKUx_CH4_PICA() {
        return _kvjEddy.getKUx_CH4_PICA();
    }

    /**
    * Sets the k ux_ c h4_ p i c a of this kvj eddy.
    *
    * @param KUx_CH4_PICA the k ux_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setKUx_CH4_PICA(float KUx_CH4_PICA) {
        _kvjEddy.setKUx_CH4_PICA(KUx_CH4_PICA);
    }

    /**
    * Returns the k ux_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the k ux_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_CH4_PICA_EMEP() {
        return _kvjEddy.getKUx_CH4_PICA_EMEP();
    }

    /**
    * Sets the k ux_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param KUx_CH4_PICA_EMEP the k ux_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_CH4_PICA_EMEP(int KUx_CH4_PICA_EMEP) {
        _kvjEddy.setKUx_CH4_PICA_EMEP(KUx_CH4_PICA_EMEP);
    }

    /**
    * Returns the k ux_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the k ux_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getKUx_H2O_PICA() {
        return _kvjEddy.getKUx_H2O_PICA();
    }

    /**
    * Sets the k ux_ h2 o_ p i c a of this kvj eddy.
    *
    * @param KUx_H2O_PICA the k ux_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setKUx_H2O_PICA(float KUx_H2O_PICA) {
        _kvjEddy.setKUx_H2O_PICA(KUx_H2O_PICA);
    }

    /**
    * Returns the k ux_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the k ux_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getKUx_H2O_PICA_EMEP() {
        return _kvjEddy.getKUx_H2O_PICA_EMEP();
    }

    /**
    * Sets the k ux_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param KUx_H2O_PICA_EMEP the k ux_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setKUx_H2O_PICA_EMEP(int KUx_H2O_PICA_EMEP) {
        _kvjEddy.setKUx_H2O_PICA_EMEP(KUx_H2O_PICA_EMEP);
    }

    /**
    * Returns the overall_qflag_u of this kvj eddy.
    *
    * @return the overall_qflag_u of this kvj eddy
    */
    @Override
    public int getOverall_qflag_u() {
        return _kvjEddy.getOverall_qflag_u();
    }

    /**
    * Sets the overall_qflag_u of this kvj eddy.
    *
    * @param overall_qflag_u the overall_qflag_u of this kvj eddy
    */
    @Override
    public void setOverall_qflag_u(int overall_qflag_u) {
        _kvjEddy.setOverall_qflag_u(overall_qflag_u);
    }

    /**
    * Returns the overall_qflag_u_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_u_EMEP() {
        return _kvjEddy.getOverall_qflag_u_EMEP();
    }

    /**
    * Sets the overall_qflag_u_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_u_EMEP the overall_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_u_EMEP(int overall_qflag_u_EMEP) {
        _kvjEddy.setOverall_qflag_u_EMEP(overall_qflag_u_EMEP);
    }

    /**
    * Returns the overall_qflag_ ts of this kvj eddy.
    *
    * @return the overall_qflag_ ts of this kvj eddy
    */
    @Override
    public int getOverall_qflag_Ts() {
        return _kvjEddy.getOverall_qflag_Ts();
    }

    /**
    * Sets the overall_qflag_ ts of this kvj eddy.
    *
    * @param overall_qflag_Ts the overall_qflag_ ts of this kvj eddy
    */
    @Override
    public void setOverall_qflag_Ts(int overall_qflag_Ts) {
        _kvjEddy.setOverall_qflag_Ts(overall_qflag_Ts);
    }

    /**
    * Returns the overall_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_Ts_EMEP() {
        return _kvjEddy.getOverall_qflag_Ts_EMEP();
    }

    /**
    * Sets the overall_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_Ts_EMEP the overall_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_Ts_EMEP(int overall_qflag_Ts_EMEP) {
        _kvjEddy.setOverall_qflag_Ts_EMEP(overall_qflag_Ts_EMEP);
    }

    /**
    * Returns the overall_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @return the overall_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public int getOverall_qflag_CO2_LI72() {
        return _kvjEddy.getOverall_qflag_CO2_LI72();
    }

    /**
    * Sets the overall_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @param overall_qflag_CO2_LI72 the overall_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setOverall_qflag_CO2_LI72(int overall_qflag_CO2_LI72) {
        _kvjEddy.setOverall_qflag_CO2_LI72(overall_qflag_CO2_LI72);
    }

    /**
    * Returns the overall_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_CO2_LI72_EMEP() {
        return _kvjEddy.getOverall_qflag_CO2_LI72_EMEP();
    }

    /**
    * Sets the overall_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_CO2_LI72_EMEP the overall_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_CO2_LI72_EMEP(int overall_qflag_CO2_LI72_EMEP) {
        _kvjEddy.setOverall_qflag_CO2_LI72_EMEP(overall_qflag_CO2_LI72_EMEP);
    }

    /**
    * Returns the overall_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the overall_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public int getOverall_qflag_H2O_LI72() {
        return _kvjEddy.getOverall_qflag_H2O_LI72();
    }

    /**
    * Sets the overall_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @param overall_qflag_H2O_LI72 the overall_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setOverall_qflag_H2O_LI72(int overall_qflag_H2O_LI72) {
        _kvjEddy.setOverall_qflag_H2O_LI72(overall_qflag_H2O_LI72);
    }

    /**
    * Returns the overall_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_H2O_LI72_EMEP() {
        return _kvjEddy.getOverall_qflag_H2O_LI72_EMEP();
    }

    /**
    * Sets the overall_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_H2O_LI72_EMEP the overall_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_H2O_LI72_EMEP(int overall_qflag_H2O_LI72_EMEP) {
        _kvjEddy.setOverall_qflag_H2O_LI72_EMEP(overall_qflag_H2O_LI72_EMEP);
    }

    /**
    * Returns the overall_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @return the overall_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public int getOverall_qflag_CH4_PICA() {
        return _kvjEddy.getOverall_qflag_CH4_PICA();
    }

    /**
    * Sets the overall_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @param overall_qflag_CH4_PICA the overall_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setOverall_qflag_CH4_PICA(int overall_qflag_CH4_PICA) {
        _kvjEddy.setOverall_qflag_CH4_PICA(overall_qflag_CH4_PICA);
    }

    /**
    * Returns the overall_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_CH4_PICA_EMEP() {
        return _kvjEddy.getOverall_qflag_CH4_PICA_EMEP();
    }

    /**
    * Sets the overall_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_CH4_PICA_EMEP the overall_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_CH4_PICA_EMEP(int overall_qflag_CH4_PICA_EMEP) {
        _kvjEddy.setOverall_qflag_CH4_PICA_EMEP(overall_qflag_CH4_PICA_EMEP);
    }

    /**
    * Returns the overall_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the overall_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public int getOverall_qflag_H2O_PICA() {
        return _kvjEddy.getOverall_qflag_H2O_PICA();
    }

    /**
    * Sets the overall_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @param overall_qflag_H2O_PICA the overall_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setOverall_qflag_H2O_PICA(int overall_qflag_H2O_PICA) {
        _kvjEddy.setOverall_qflag_H2O_PICA(overall_qflag_H2O_PICA);
    }

    /**
    * Returns the overall_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the overall_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getOverall_qflag_H2O_PICA_EMEP() {
        return _kvjEddy.getOverall_qflag_H2O_PICA_EMEP();
    }

    /**
    * Sets the overall_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param overall_qflag_H2O_PICA_EMEP the overall_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setOverall_qflag_H2O_PICA_EMEP(int overall_qflag_H2O_PICA_EMEP) {
        _kvjEddy.setOverall_qflag_H2O_PICA_EMEP(overall_qflag_H2O_PICA_EMEP);
    }

    /**
    * Returns the i t c_qflag_w of this kvj eddy.
    *
    * @return the i t c_qflag_w of this kvj eddy
    */
    @Override
    public int getITC_qflag_w() {
        return _kvjEddy.getITC_qflag_w();
    }

    /**
    * Sets the i t c_qflag_w of this kvj eddy.
    *
    * @param ITC_qflag_w the i t c_qflag_w of this kvj eddy
    */
    @Override
    public void setITC_qflag_w(int ITC_qflag_w) {
        _kvjEddy.setITC_qflag_w(ITC_qflag_w);
    }

    /**
    * Returns the i t c_qflag_w_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_w_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_w_EMEP() {
        return _kvjEddy.getITC_qflag_w_EMEP();
    }

    /**
    * Sets the i t c_qflag_w_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_w_EMEP the i t c_qflag_w_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_w_EMEP(int ITC_qflag_w_EMEP) {
        _kvjEddy.setITC_qflag_w_EMEP(ITC_qflag_w_EMEP);
    }

    /**
    * Returns the i t c_qflag_u of this kvj eddy.
    *
    * @return the i t c_qflag_u of this kvj eddy
    */
    @Override
    public int getITC_qflag_u() {
        return _kvjEddy.getITC_qflag_u();
    }

    /**
    * Sets the i t c_qflag_u of this kvj eddy.
    *
    * @param ITC_qflag_u the i t c_qflag_u of this kvj eddy
    */
    @Override
    public void setITC_qflag_u(int ITC_qflag_u) {
        _kvjEddy.setITC_qflag_u(ITC_qflag_u);
    }

    /**
    * Returns the i t c_qflag_u_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_u_EMEP() {
        return _kvjEddy.getITC_qflag_u_EMEP();
    }

    /**
    * Sets the i t c_qflag_u_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_u_EMEP the i t c_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_u_EMEP(int ITC_qflag_u_EMEP) {
        _kvjEddy.setITC_qflag_u_EMEP(ITC_qflag_u_EMEP);
    }

    /**
    * Returns the i t c_qflag_ ts of this kvj eddy.
    *
    * @return the i t c_qflag_ ts of this kvj eddy
    */
    @Override
    public int getITC_qflag_Ts() {
        return _kvjEddy.getITC_qflag_Ts();
    }

    /**
    * Sets the i t c_qflag_ ts of this kvj eddy.
    *
    * @param ITC_qflag_Ts the i t c_qflag_ ts of this kvj eddy
    */
    @Override
    public void setITC_qflag_Ts(int ITC_qflag_Ts) {
        _kvjEddy.setITC_qflag_Ts(ITC_qflag_Ts);
    }

    /**
    * Returns the i t c_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_Ts_EMEP() {
        return _kvjEddy.getITC_qflag_Ts_EMEP();
    }

    /**
    * Sets the i t c_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_Ts_EMEP the i t c_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_Ts_EMEP(int ITC_qflag_Ts_EMEP) {
        _kvjEddy.setITC_qflag_Ts_EMEP(ITC_qflag_Ts_EMEP);
    }

    /**
    * Returns the i t c_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @return the i t c_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public int getITC_qflag_CO2_LI72() {
        return _kvjEddy.getITC_qflag_CO2_LI72();
    }

    /**
    * Sets the i t c_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @param ITC_qflag_CO2_LI72 the i t c_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setITC_qflag_CO2_LI72(int ITC_qflag_CO2_LI72) {
        _kvjEddy.setITC_qflag_CO2_LI72(ITC_qflag_CO2_LI72);
    }

    /**
    * Returns the i t c_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_CO2_LI72_EMEP() {
        return _kvjEddy.getITC_qflag_CO2_LI72_EMEP();
    }

    /**
    * Sets the i t c_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_CO2_LI72_EMEP the i t c_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_CO2_LI72_EMEP(int ITC_qflag_CO2_LI72_EMEP) {
        _kvjEddy.setITC_qflag_CO2_LI72_EMEP(ITC_qflag_CO2_LI72_EMEP);
    }

    /**
    * Returns the i t c_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the i t c_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public int getITC_qflag_H2O_LI72() {
        return _kvjEddy.getITC_qflag_H2O_LI72();
    }

    /**
    * Sets the i t c_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @param ITC_qflag_H2O_LI72 the i t c_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setITC_qflag_H2O_LI72(int ITC_qflag_H2O_LI72) {
        _kvjEddy.setITC_qflag_H2O_LI72(ITC_qflag_H2O_LI72);
    }

    /**
    * Returns the i t c_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_H2O_LI72_EMEP() {
        return _kvjEddy.getITC_qflag_H2O_LI72_EMEP();
    }

    /**
    * Sets the i t c_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_H2O_LI72_EMEP the i t c_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_H2O_LI72_EMEP(int ITC_qflag_H2O_LI72_EMEP) {
        _kvjEddy.setITC_qflag_H2O_LI72_EMEP(ITC_qflag_H2O_LI72_EMEP);
    }

    /**
    * Returns the i t c_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @return the i t c_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public int getITC_qflag_CH4_PICA() {
        return _kvjEddy.getITC_qflag_CH4_PICA();
    }

    /**
    * Sets the i t c_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @param ITC_qflag_CH4_PICA the i t c_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setITC_qflag_CH4_PICA(int ITC_qflag_CH4_PICA) {
        _kvjEddy.setITC_qflag_CH4_PICA(ITC_qflag_CH4_PICA);
    }

    /**
    * Returns the i t c_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_CH4_PICA_EMEP() {
        return _kvjEddy.getITC_qflag_CH4_PICA_EMEP();
    }

    /**
    * Sets the i t c_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_CH4_PICA_EMEP the i t c_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_CH4_PICA_EMEP(int ITC_qflag_CH4_PICA_EMEP) {
        _kvjEddy.setITC_qflag_CH4_PICA_EMEP(ITC_qflag_CH4_PICA_EMEP);
    }

    /**
    * Returns the i t c_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the i t c_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public int getITC_qflag_H2O_PICA() {
        return _kvjEddy.getITC_qflag_H2O_PICA();
    }

    /**
    * Sets the i t c_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @param ITC_qflag_H2O_PICA the i t c_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setITC_qflag_H2O_PICA(int ITC_qflag_H2O_PICA) {
        _kvjEddy.setITC_qflag_H2O_PICA(ITC_qflag_H2O_PICA);
    }

    /**
    * Returns the i t c_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the i t c_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getITC_qflag_H2O_PICA_EMEP() {
        return _kvjEddy.getITC_qflag_H2O_PICA_EMEP();
    }

    /**
    * Sets the i t c_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param ITC_qflag_H2O_PICA_EMEP the i t c_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setITC_qflag_H2O_PICA_EMEP(int ITC_qflag_H2O_PICA_EMEP) {
        _kvjEddy.setITC_qflag_H2O_PICA_EMEP(ITC_qflag_H2O_PICA_EMEP);
    }

    /**
    * Returns the f s t_qflag_u of this kvj eddy.
    *
    * @return the f s t_qflag_u of this kvj eddy
    */
    @Override
    public int getFST_qflag_u() {
        return _kvjEddy.getFST_qflag_u();
    }

    /**
    * Sets the f s t_qflag_u of this kvj eddy.
    *
    * @param FST_qflag_u the f s t_qflag_u of this kvj eddy
    */
    @Override
    public void setFST_qflag_u(int FST_qflag_u) {
        _kvjEddy.setFST_qflag_u(FST_qflag_u);
    }

    /**
    * Returns the f s t_qflag_u_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_u_EMEP() {
        return _kvjEddy.getFST_qflag_u_EMEP();
    }

    /**
    * Sets the f s t_qflag_u_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_u_EMEP the f s t_qflag_u_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_u_EMEP(int FST_qflag_u_EMEP) {
        _kvjEddy.setFST_qflag_u_EMEP(FST_qflag_u_EMEP);
    }

    /**
    * Returns the f s t_qflag_ ts of this kvj eddy.
    *
    * @return the f s t_qflag_ ts of this kvj eddy
    */
    @Override
    public int getFST_qflag_Ts() {
        return _kvjEddy.getFST_qflag_Ts();
    }

    /**
    * Sets the f s t_qflag_ ts of this kvj eddy.
    *
    * @param FST_qflag_Ts the f s t_qflag_ ts of this kvj eddy
    */
    @Override
    public void setFST_qflag_Ts(int FST_qflag_Ts) {
        _kvjEddy.setFST_qflag_Ts(FST_qflag_Ts);
    }

    /**
    * Returns the f s t_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_Ts_EMEP() {
        return _kvjEddy.getFST_qflag_Ts_EMEP();
    }

    /**
    * Sets the f s t_qflag_ ts_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_Ts_EMEP the f s t_qflag_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_Ts_EMEP(int FST_qflag_Ts_EMEP) {
        _kvjEddy.setFST_qflag_Ts_EMEP(FST_qflag_Ts_EMEP);
    }

    /**
    * Returns the f s t_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @return the f s t_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public int getFST_qflag_CO2_LI72() {
        return _kvjEddy.getFST_qflag_CO2_LI72();
    }

    /**
    * Sets the f s t_qflag_ c o2_ l i72 of this kvj eddy.
    *
    * @param FST_qflag_CO2_LI72 the f s t_qflag_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setFST_qflag_CO2_LI72(int FST_qflag_CO2_LI72) {
        _kvjEddy.setFST_qflag_CO2_LI72(FST_qflag_CO2_LI72);
    }

    /**
    * Returns the f s t_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_CO2_LI72_EMEP() {
        return _kvjEddy.getFST_qflag_CO2_LI72_EMEP();
    }

    /**
    * Sets the f s t_qflag_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_CO2_LI72_EMEP the f s t_qflag_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_CO2_LI72_EMEP(int FST_qflag_CO2_LI72_EMEP) {
        _kvjEddy.setFST_qflag_CO2_LI72_EMEP(FST_qflag_CO2_LI72_EMEP);
    }

    /**
    * Returns the f s t_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the f s t_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public int getFST_qflag_H2O_LI72() {
        return _kvjEddy.getFST_qflag_H2O_LI72();
    }

    /**
    * Sets the f s t_qflag_ h2 o_ l i72 of this kvj eddy.
    *
    * @param FST_qflag_H2O_LI72 the f s t_qflag_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setFST_qflag_H2O_LI72(int FST_qflag_H2O_LI72) {
        _kvjEddy.setFST_qflag_H2O_LI72(FST_qflag_H2O_LI72);
    }

    /**
    * Returns the f s t_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_H2O_LI72_EMEP() {
        return _kvjEddy.getFST_qflag_H2O_LI72_EMEP();
    }

    /**
    * Sets the f s t_qflag_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_H2O_LI72_EMEP the f s t_qflag_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_H2O_LI72_EMEP(int FST_qflag_H2O_LI72_EMEP) {
        _kvjEddy.setFST_qflag_H2O_LI72_EMEP(FST_qflag_H2O_LI72_EMEP);
    }

    /**
    * Returns the f s t_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @return the f s t_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public int getFST_qflag_CH4_PICA() {
        return _kvjEddy.getFST_qflag_CH4_PICA();
    }

    /**
    * Sets the f s t_qflag_ c h4_ p i c a of this kvj eddy.
    *
    * @param FST_qflag_CH4_PICA the f s t_qflag_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setFST_qflag_CH4_PICA(int FST_qflag_CH4_PICA) {
        _kvjEddy.setFST_qflag_CH4_PICA(FST_qflag_CH4_PICA);
    }

    /**
    * Returns the f s t_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_CH4_PICA_EMEP() {
        return _kvjEddy.getFST_qflag_CH4_PICA_EMEP();
    }

    /**
    * Sets the f s t_qflag_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_CH4_PICA_EMEP the f s t_qflag_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_CH4_PICA_EMEP(int FST_qflag_CH4_PICA_EMEP) {
        _kvjEddy.setFST_qflag_CH4_PICA_EMEP(FST_qflag_CH4_PICA_EMEP);
    }

    /**
    * Returns the f s t_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the f s t_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public int getFST_qflag_H2O_PICA() {
        return _kvjEddy.getFST_qflag_H2O_PICA();
    }

    /**
    * Sets the f s t_qflag_ h2 o_ p i c a of this kvj eddy.
    *
    * @param FST_qflag_H2O_PICA the f s t_qflag_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setFST_qflag_H2O_PICA(int FST_qflag_H2O_PICA) {
        _kvjEddy.setFST_qflag_H2O_PICA(FST_qflag_H2O_PICA);
    }

    /**
    * Returns the f s t_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the f s t_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getFST_qflag_H2O_PICA_EMEP() {
        return _kvjEddy.getFST_qflag_H2O_PICA_EMEP();
    }

    /**
    * Sets the f s t_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param FST_qflag_H2O_PICA_EMEP the f s t_qflag_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setFST_qflag_H2O_PICA_EMEP(int FST_qflag_H2O_PICA_EMEP) {
        _kvjEddy.setFST_qflag_H2O_PICA_EMEP(FST_qflag_H2O_PICA_EMEP);
    }

    /**
    * Returns the hm_u of this kvj eddy.
    *
    * @return the hm_u of this kvj eddy
    */
    @Override
    public float getHm_u() {
        return _kvjEddy.getHm_u();
    }

    /**
    * Sets the hm_u of this kvj eddy.
    *
    * @param Hm_u the hm_u of this kvj eddy
    */
    @Override
    public void setHm_u(float Hm_u) {
        _kvjEddy.setHm_u(Hm_u);
    }

    /**
    * Returns the hm_u_ e m e p of this kvj eddy.
    *
    * @return the hm_u_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_u_EMEP() {
        return _kvjEddy.getHm_u_EMEP();
    }

    /**
    * Sets the hm_u_ e m e p of this kvj eddy.
    *
    * @param Hm_u_EMEP the hm_u_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_u_EMEP(int Hm_u_EMEP) {
        _kvjEddy.setHm_u_EMEP(Hm_u_EMEP);
    }

    /**
    * Returns the hm_ ts of this kvj eddy.
    *
    * @return the hm_ ts of this kvj eddy
    */
    @Override
    public float getHm_Ts() {
        return _kvjEddy.getHm_Ts();
    }

    /**
    * Sets the hm_ ts of this kvj eddy.
    *
    * @param Hm_Ts the hm_ ts of this kvj eddy
    */
    @Override
    public void setHm_Ts(float Hm_Ts) {
        _kvjEddy.setHm_Ts(Hm_Ts);
    }

    /**
    * Returns the hm_ ts_ e m e p of this kvj eddy.
    *
    * @return the hm_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_Ts_EMEP() {
        return _kvjEddy.getHm_Ts_EMEP();
    }

    /**
    * Sets the hm_ ts_ e m e p of this kvj eddy.
    *
    * @param Hm_Ts_EMEP the hm_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_Ts_EMEP(int Hm_Ts_EMEP) {
        _kvjEddy.setHm_Ts_EMEP(Hm_Ts_EMEP);
    }

    /**
    * Returns the hm_ c o2_ l i72 of this kvj eddy.
    *
    * @return the hm_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getHm_CO2_LI72() {
        return _kvjEddy.getHm_CO2_LI72();
    }

    /**
    * Sets the hm_ c o2_ l i72 of this kvj eddy.
    *
    * @param Hm_CO2_LI72 the hm_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setHm_CO2_LI72(float Hm_CO2_LI72) {
        _kvjEddy.setHm_CO2_LI72(Hm_CO2_LI72);
    }

    /**
    * Returns the hm_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the hm_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_CO2_LI72_EMEP() {
        return _kvjEddy.getHm_CO2_LI72_EMEP();
    }

    /**
    * Sets the hm_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param Hm_CO2_LI72_EMEP the hm_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_CO2_LI72_EMEP(int Hm_CO2_LI72_EMEP) {
        _kvjEddy.setHm_CO2_LI72_EMEP(Hm_CO2_LI72_EMEP);
    }

    /**
    * Returns the hm_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the hm_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getHm_H2O_LI72() {
        return _kvjEddy.getHm_H2O_LI72();
    }

    /**
    * Sets the hm_ h2 o_ l i72 of this kvj eddy.
    *
    * @param Hm_H2O_LI72 the hm_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setHm_H2O_LI72(float Hm_H2O_LI72) {
        _kvjEddy.setHm_H2O_LI72(Hm_H2O_LI72);
    }

    /**
    * Returns the hm_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the hm_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_H2O_LI72_EMEP() {
        return _kvjEddy.getHm_H2O_LI72_EMEP();
    }

    /**
    * Sets the hm_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param Hm_H2O_LI72_EMEP the hm_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_H2O_LI72_EMEP(int Hm_H2O_LI72_EMEP) {
        _kvjEddy.setHm_H2O_LI72_EMEP(Hm_H2O_LI72_EMEP);
    }

    /**
    * Returns the hm_ c h4_ p i c a of this kvj eddy.
    *
    * @return the hm_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getHm_CH4_PICA() {
        return _kvjEddy.getHm_CH4_PICA();
    }

    /**
    * Sets the hm_ c h4_ p i c a of this kvj eddy.
    *
    * @param Hm_CH4_PICA the hm_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setHm_CH4_PICA(float Hm_CH4_PICA) {
        _kvjEddy.setHm_CH4_PICA(Hm_CH4_PICA);
    }

    /**
    * Returns the hm_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the hm_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_CH4_PICA_EMEP() {
        return _kvjEddy.getHm_CH4_PICA_EMEP();
    }

    /**
    * Sets the hm_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Hm_CH4_PICA_EMEP the hm_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_CH4_PICA_EMEP(int Hm_CH4_PICA_EMEP) {
        _kvjEddy.setHm_CH4_PICA_EMEP(Hm_CH4_PICA_EMEP);
    }

    /**
    * Returns the hm_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the hm_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getHm_H2O_PICA() {
        return _kvjEddy.getHm_H2O_PICA();
    }

    /**
    * Sets the hm_ h2 o_ p i c a of this kvj eddy.
    *
    * @param Hm_H2O_PICA the hm_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setHm_H2O_PICA(float Hm_H2O_PICA) {
        _kvjEddy.setHm_H2O_PICA(Hm_H2O_PICA);
    }

    /**
    * Returns the hm_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the hm_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getHm_H2O_PICA_EMEP() {
        return _kvjEddy.getHm_H2O_PICA_EMEP();
    }

    /**
    * Sets the hm_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Hm_H2O_PICA_EMEP the hm_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setHm_H2O_PICA_EMEP(int Hm_H2O_PICA_EMEP) {
        _kvjEddy.setHm_H2O_PICA_EMEP(Hm_H2O_PICA_EMEP);
    }

    /**
    * Returns the hv_u of this kvj eddy.
    *
    * @return the hv_u of this kvj eddy
    */
    @Override
    public float getHv_u() {
        return _kvjEddy.getHv_u();
    }

    /**
    * Sets the hv_u of this kvj eddy.
    *
    * @param Hv_u the hv_u of this kvj eddy
    */
    @Override
    public void setHv_u(float Hv_u) {
        _kvjEddy.setHv_u(Hv_u);
    }

    /**
    * Returns the hv_u_ e m e p of this kvj eddy.
    *
    * @return the hv_u_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_u_EMEP() {
        return _kvjEddy.getHv_u_EMEP();
    }

    /**
    * Sets the hv_u_ e m e p of this kvj eddy.
    *
    * @param Hv_u_EMEP the hv_u_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_u_EMEP(int Hv_u_EMEP) {
        _kvjEddy.setHv_u_EMEP(Hv_u_EMEP);
    }

    /**
    * Returns the hv_ ts of this kvj eddy.
    *
    * @return the hv_ ts of this kvj eddy
    */
    @Override
    public float getHv_Ts() {
        return _kvjEddy.getHv_Ts();
    }

    /**
    * Sets the hv_ ts of this kvj eddy.
    *
    * @param Hv_Ts the hv_ ts of this kvj eddy
    */
    @Override
    public void setHv_Ts(float Hv_Ts) {
        _kvjEddy.setHv_Ts(Hv_Ts);
    }

    /**
    * Returns the hv_ ts_ e m e p of this kvj eddy.
    *
    * @return the hv_ ts_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_Ts_EMEP() {
        return _kvjEddy.getHv_Ts_EMEP();
    }

    /**
    * Sets the hv_ ts_ e m e p of this kvj eddy.
    *
    * @param Hv_Ts_EMEP the hv_ ts_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_Ts_EMEP(int Hv_Ts_EMEP) {
        _kvjEddy.setHv_Ts_EMEP(Hv_Ts_EMEP);
    }

    /**
    * Returns the hv_ c o2_ l i72 of this kvj eddy.
    *
    * @return the hv_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public float getHv_CO2_LI72() {
        return _kvjEddy.getHv_CO2_LI72();
    }

    /**
    * Sets the hv_ c o2_ l i72 of this kvj eddy.
    *
    * @param Hv_CO2_LI72 the hv_ c o2_ l i72 of this kvj eddy
    */
    @Override
    public void setHv_CO2_LI72(float Hv_CO2_LI72) {
        _kvjEddy.setHv_CO2_LI72(Hv_CO2_LI72);
    }

    /**
    * Returns the hv_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @return the hv_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_CO2_LI72_EMEP() {
        return _kvjEddy.getHv_CO2_LI72_EMEP();
    }

    /**
    * Sets the hv_ c o2_ l i72_ e m e p of this kvj eddy.
    *
    * @param Hv_CO2_LI72_EMEP the hv_ c o2_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_CO2_LI72_EMEP(int Hv_CO2_LI72_EMEP) {
        _kvjEddy.setHv_CO2_LI72_EMEP(Hv_CO2_LI72_EMEP);
    }

    /**
    * Returns the hv_ h2 o_ l i72 of this kvj eddy.
    *
    * @return the hv_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public float getHv_H2O_LI72() {
        return _kvjEddy.getHv_H2O_LI72();
    }

    /**
    * Sets the hv_ h2 o_ l i72 of this kvj eddy.
    *
    * @param Hv_H2O_LI72 the hv_ h2 o_ l i72 of this kvj eddy
    */
    @Override
    public void setHv_H2O_LI72(float Hv_H2O_LI72) {
        _kvjEddy.setHv_H2O_LI72(Hv_H2O_LI72);
    }

    /**
    * Returns the hv_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @return the hv_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_H2O_LI72_EMEP() {
        return _kvjEddy.getHv_H2O_LI72_EMEP();
    }

    /**
    * Sets the hv_ h2 o_ l i72_ e m e p of this kvj eddy.
    *
    * @param Hv_H2O_LI72_EMEP the hv_ h2 o_ l i72_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_H2O_LI72_EMEP(int Hv_H2O_LI72_EMEP) {
        _kvjEddy.setHv_H2O_LI72_EMEP(Hv_H2O_LI72_EMEP);
    }

    /**
    * Returns the hv_ c h4_ p i c a of this kvj eddy.
    *
    * @return the hv_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public float getHv_CH4_PICA() {
        return _kvjEddy.getHv_CH4_PICA();
    }

    /**
    * Sets the hv_ c h4_ p i c a of this kvj eddy.
    *
    * @param Hv_CH4_PICA the hv_ c h4_ p i c a of this kvj eddy
    */
    @Override
    public void setHv_CH4_PICA(float Hv_CH4_PICA) {
        _kvjEddy.setHv_CH4_PICA(Hv_CH4_PICA);
    }

    /**
    * Returns the hv_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the hv_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_CH4_PICA_EMEP() {
        return _kvjEddy.getHv_CH4_PICA_EMEP();
    }

    /**
    * Sets the hv_ c h4_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Hv_CH4_PICA_EMEP the hv_ c h4_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_CH4_PICA_EMEP(int Hv_CH4_PICA_EMEP) {
        _kvjEddy.setHv_CH4_PICA_EMEP(Hv_CH4_PICA_EMEP);
    }

    /**
    * Returns the hv_ h2 o_ p i c a of this kvj eddy.
    *
    * @return the hv_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public float getHv_H2O_PICA() {
        return _kvjEddy.getHv_H2O_PICA();
    }

    /**
    * Sets the hv_ h2 o_ p i c a of this kvj eddy.
    *
    * @param Hv_H2O_PICA the hv_ h2 o_ p i c a of this kvj eddy
    */
    @Override
    public void setHv_H2O_PICA(float Hv_H2O_PICA) {
        _kvjEddy.setHv_H2O_PICA(Hv_H2O_PICA);
    }

    /**
    * Returns the hv_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @return the hv_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public int getHv_H2O_PICA_EMEP() {
        return _kvjEddy.getHv_H2O_PICA_EMEP();
    }

    /**
    * Sets the hv_ h2 o_ p i c a_ e m e p of this kvj eddy.
    *
    * @param Hv_H2O_PICA_EMEP the hv_ h2 o_ p i c a_ e m e p of this kvj eddy
    */
    @Override
    public void setHv_H2O_PICA_EMEP(int Hv_H2O_PICA_EMEP) {
        _kvjEddy.setHv_H2O_PICA_EMEP(Hv_H2O_PICA_EMEP);
    }

    /**
    * Returns the fpr_x_peak of this kvj eddy.
    *
    * @return the fpr_x_peak of this kvj eddy
    */
    @Override
    public float getFpr_x_peak() {
        return _kvjEddy.getFpr_x_peak();
    }

    /**
    * Sets the fpr_x_peak of this kvj eddy.
    *
    * @param fpr_x_peak the fpr_x_peak of this kvj eddy
    */
    @Override
    public void setFpr_x_peak(float fpr_x_peak) {
        _kvjEddy.setFpr_x_peak(fpr_x_peak);
    }

    /**
    * Returns the fpr_x_peak_ e m e p of this kvj eddy.
    *
    * @return the fpr_x_peak_ e m e p of this kvj eddy
    */
    @Override
    public int getFpr_x_peak_EMEP() {
        return _kvjEddy.getFpr_x_peak_EMEP();
    }

    /**
    * Sets the fpr_x_peak_ e m e p of this kvj eddy.
    *
    * @param fpr_x_peak_EMEP the fpr_x_peak_ e m e p of this kvj eddy
    */
    @Override
    public void setFpr_x_peak_EMEP(int fpr_x_peak_EMEP) {
        _kvjEddy.setFpr_x_peak_EMEP(fpr_x_peak_EMEP);
    }

    /**
    * Returns the fpr_x_80 of this kvj eddy.
    *
    * @return the fpr_x_80 of this kvj eddy
    */
    @Override
    public float getFpr_x_80() {
        return _kvjEddy.getFpr_x_80();
    }

    /**
    * Sets the fpr_x_80 of this kvj eddy.
    *
    * @param fpr_x_80 the fpr_x_80 of this kvj eddy
    */
    @Override
    public void setFpr_x_80(float fpr_x_80) {
        _kvjEddy.setFpr_x_80(fpr_x_80);
    }

    /**
    * Returns the fpr_x_80_ e m e p of this kvj eddy.
    *
    * @return the fpr_x_80_ e m e p of this kvj eddy
    */
    @Override
    public int getFpr_x_80_EMEP() {
        return _kvjEddy.getFpr_x_80_EMEP();
    }

    /**
    * Sets the fpr_x_80_ e m e p of this kvj eddy.
    *
    * @param fpr_x_80_EMEP the fpr_x_80_ e m e p of this kvj eddy
    */
    @Override
    public void setFpr_x_80_EMEP(int fpr_x_80_EMEP) {
        _kvjEddy.setFpr_x_80_EMEP(fpr_x_80_EMEP);
    }

    @Override
    public boolean isNew() {
        return _kvjEddy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _kvjEddy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _kvjEddy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _kvjEddy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _kvjEddy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _kvjEddy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _kvjEddy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _kvjEddy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _kvjEddy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _kvjEddy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _kvjEddy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new kvjEddyWrapper((kvjEddy) _kvjEddy.clone());
    }

    @Override
    public int compareTo(kvjEddy kvjEddy) {
        return _kvjEddy.compareTo(kvjEddy);
    }

    @Override
    public int hashCode() {
        return _kvjEddy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<kvjEddy> toCacheModel() {
        return _kvjEddy.toCacheModel();
    }

    @Override
    public kvjEddy toEscapedModel() {
        return new kvjEddyWrapper(_kvjEddy.toEscapedModel());
    }

    @Override
    public kvjEddy toUnescapedModel() {
        return new kvjEddyWrapper(_kvjEddy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _kvjEddy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _kvjEddy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _kvjEddy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof kvjEddyWrapper)) {
            return false;
        }

        kvjEddyWrapper kvjEddyWrapper = (kvjEddyWrapper) obj;

        if (Validator.equals(_kvjEddy, kvjEddyWrapper._kvjEddy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public kvjEddy getWrappedkvjEddy() {
        return _kvjEddy;
    }

    @Override
    public kvjEddy getWrappedModel() {
        return _kvjEddy;
    }

    @Override
    public void resetOriginalValues() {
        _kvjEddy.resetOriginalValues();
    }
}
