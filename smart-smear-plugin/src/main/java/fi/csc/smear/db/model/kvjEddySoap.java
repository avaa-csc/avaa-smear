package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.kvjEddyServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.kvjEddyServiceSoap
 * @generated
 */
public class kvjEddySoap implements Serializable {
    private Date _samptime;
    private float _H;
    private int _H_EMEP;
    private int _Qc_H;
    private int _Qc_H_EMEP;
    private float _tau;
    private int _tau_EMEP;
    private int _Qc_tau;
    private int _Qc_tau_EMEP;
    private float _u_star;
    private int _u_star_EMEP;
    private float _MO_length;
    private int _MO_length_EMEP;
    private int _err_packet;
    private int _err_packet_EMEP;
    private float _F_CO2_LI72;
    private int _F_CO2_LI72_EMEP;
    private int _Qc_CO2_LI72;
    private int _Qc_CO2_LI72_EMEP;
    private float _F_CH4_PICA;
    private int _F_CH4_PICA_EMEP;
    private int _Qc_CH4_PICA;
    private int _Qc_CH4_PICA_EMEP;
    private float _F_H2O_LI72;
    private int _F_H2O_LI72_EMEP;
    private int _Qc_H2O_LI72;
    private int _Qc_H2O_LI72_EMEP;
    private float _F_H2O_PICA;
    private int _F_H2O_PICA_EMEP;
    private int _Qc_H2O_PICA;
    private int _Qc_H2O_PICA_EMEP;
    private float _LE_LI72;
    private int _LE_LI72_EMEP;
    private float _LE_PICA;
    private int _LE_PICA_EMEP;
    private float _U;
    private int _U_EMEP;
    private float _wind_dir;
    private int _wind_dir_EMEP;
    private float _av_u;
    private int _av_u_EMEP;
    private float _av_v;
    private int _av_v_EMEP;
    private float _av_w;
    private int _av_w_EMEP;
    private float _av_t;
    private int _av_t_EMEP;
    private float _av_c_LI72;
    private int _av_c_LI72_EMEP;
    private float _av_h_LI72;
    private int _av_h_LI72_EMEP;
    private float _av_h_PICA;
    private int _av_h_PICA_EMEP;
    private float _av_CH4;
    private int _av_CH4_EMEP;
    private float _std_u;
    private int _std_u_EMEP;
    private float _std_v;
    private int _std_v_EMEP;
    private float _std_w;
    private int _std_w_EMEP;
    private float _std_t;
    private int _std_t_EMEP;
    private float _std_c_LI72;
    private int _std_c_LI72_EMEP;
    private float _std_h_LI72;
    private int _std_h_LI72_EMEP;
    private float _std_h_PICA;
    private int _std_h_PICA_EMEP;
    private float _std_CH4;
    private int _std_CH4_EMEP;
    private float _eta;
    private int _eta_EMEP;
    private float _theta;
    private int _theta_EMEP;
    private float _beta;
    private int _beta_EMEP;
    private float _Covs_u;
    private int _Covs_u_EMEP;
    private float _Covs_v;
    private int _Covs_v_EMEP;
    private float _Covs_Ts;
    private int _Covs_Ts_EMEP;
    private float _Covs_CO2_LI72;
    private int _Covs_CO2_LI72_EMEP;
    private float _Covs_H2O_LI72;
    private int _Covs_H2O_LI72_EMEP;
    private float _Covs_T_C_LI72;
    private int _Covs_T_C_LI72_EMEP;
    private float _Covs_P_C_LI72;
    private int _Covs_P_C_LI72_EMEP;
    private float _Covs_H2O_PICA;
    private int _Covs_H2O_PICA_EMEP;
    private float _Covs_CH4_PICA;
    private int _Covs_CH4_PICA_EMEP;
    private float _licor_t_av;
    private int _licor_t_av_EMEP;
    private float _licor_p_av;
    private int _licor_p_av_EMEP;
    private float _licor_t_std;
    private int _licor_t_std_EMEP;
    private float _licor_p_std;
    private int _licor_p_std_EMEP;
    private float _c_lag_LI72;
    private int _c_lag_LI72_EMEP;
    private float _h_lag_LI72;
    private int _h_lag_LI72_EMEP;
    private float _t_lag_LI72;
    private int _t_lag_LI72_EMEP;
    private float _p_lag_LI72;
    private int _p_lag_LI72_EMEP;
    private float _h_lag_PICA;
    private int _h_lag_PICA_EMEP;
    private float _CH4_lag;
    private int _CH4_lag_EMEP;
    private int _Nspikes_u;
    private int _Nspikes_u_EMEP;
    private int _Nspikes_v;
    private int _Nspikes_v_EMEP;
    private int _Nspikes_w;
    private int _Nspikes_w_EMEP;
    private int _Nspikes_Ts;
    private int _Nspikes_Ts_EMEP;
    private int _Nspikes_CO2_LI72;
    private int _Nspikes_CO2_LI72_EMEP;
    private int _Nspikes_H2O_LI72;
    private int _Nspikes_H2O_LI72_EMEP;
    private int _Nspikes_T_C_LI72;
    private int _Nspikes_T_C_LI72_EMEP;
    private int _Nspikes_P_C_LI72;
    private int _Nspikes_P_C_LI72_EMEP;
    private int _Nspikes_H2O_PICA;
    private int _Nspikes_H2O_PICA_EMEP;
    private int _Nspikes_CH4_PICA;
    private int _Nspikes_CH4_PICA_EMEP;
    private float _FI_u;
    private int _FI_u_EMEP;
    private float _FI_Ts;
    private int _FI_Ts_EMEP;
    private float _FI_CO2_LI72;
    private int _FI_CO2_LI72_EMEP;
    private float _FI_H2O_LI72;
    private int _FI_H2O_LI72_EMEP;
    private float _FI_CH4_PICA;
    private int _FI_CH4_PICA_EMEP;
    private float _FI_H2O_PICA;
    private int _FI_H2O_PICA_EMEP;
    private float _FST_u;
    private int _FST_u_EMEP;
    private float _FST_Ts;
    private int _FST_Ts_EMEP;
    private float _FST_CO2_LI72;
    private int _FST_CO2_LI72_EMEP;
    private float _FST_H2O_LI72;
    private int _FST_H2O_LI72_EMEP;
    private float _FST_CH4_PICA;
    private int _FST_CH4_PICA_EMEP;
    private float _FST_H2O_PICA;
    private int _FST_H2O_PICA_EMEP;
    private float _RFE_u;
    private int _RFE_u_EMEP;
    private float _RFE_Ts;
    private int _RFE_Ts_EMEP;
    private float _RFE_CO2_LI72;
    private int _RFE_CO2_LI72_EMEP;
    private float _RFE_H2O_LI72;
    private int _RFE_H2O_LI72_EMEP;
    private float _RFE_CH4_PICA;
    private int _RFE_CH4_PICA_EMEP;
    private float _RFE_H2O_PICA;
    private int _RFE_H2O_PICA_EMEP;
    private float _FA_u;
    private int _FA_u_EMEP;
    private float _FA_v;
    private int _FA_v_EMEP;
    private float _FA_Ts;
    private int _FA_Ts_EMEP;
    private float _FA_CO2_LI72;
    private int _FA_CO2_LI72_EMEP;
    private float _FA_H2O_LI72;
    private int _FA_H2O_LI72_EMEP;
    private float _FA_CH4_PICA;
    private int _FA_CH4_PICA_EMEP;
    private float _FA_H2O_PICA;
    private int _FA_H2O_PICA_EMEP;
    private float _covsvar_u;
    private int _covsvar_u_EMEP;
    private float _covsvar_v;
    private int _covsvar_v_EMEP;
    private float _covsvar_Ts;
    private int _covsvar_Ts_EMEP;
    private float _covsvar_CO2_LI72;
    private int _covsvar_CO2_LI72_EMEP;
    private float _covsvar_H2O_LI72;
    private int _covsvar_H2O_LI72_EMEP;
    private float _covsvar_CH4_PICA;
    private int _covsvar_CH4_PICA_EMEP;
    private float _covsvar_H2O_PICA;
    private int _covsvar_H2O_PICA_EMEP;
    private float _SKx_u;
    private int _SKx_u_EMEP;
    private float _SKx_v;
    private int _SKx_v_EMEP;
    private float _SKx_w;
    private int _SKx_w_EMEP;
    private float _SKx_Ts;
    private int _SKx_Ts_EMEP;
    private float _SKx_CO2_LI72;
    private int _SKx_CO2_LI72_EMEP;
    private float _SKx_H2O_LI72;
    private int _SKx_H2O_LI72_EMEP;
    private float _SKx_CH4_PICA;
    private int _SKx_CH4_PICA_EMEP;
    private float _SKx_H2O_PICA;
    private int _SKx_H2O_PICA_EMEP;
    private float _KUx_u;
    private int _KUx_u_EMEP;
    private float _KUx_v;
    private int _KUx_v_EMEP;
    private float _KUx_w;
    private int _KUx_w_EMEP;
    private float _KUx_Ts;
    private int _KUx_Ts_EMEP;
    private float _KUx_CO2_LI72;
    private int _KUx_CO2_LI72_EMEP;
    private float _KUx_H2O_LI72;
    private int _KUx_H2O_LI72_EMEP;
    private float _KUx_CH4_PICA;
    private int _KUx_CH4_PICA_EMEP;
    private float _KUx_H2O_PICA;
    private int _KUx_H2O_PICA_EMEP;
    private int _overall_qflag_u;
    private int _overall_qflag_u_EMEP;
    private int _overall_qflag_Ts;
    private int _overall_qflag_Ts_EMEP;
    private int _overall_qflag_CO2_LI72;
    private int _overall_qflag_CO2_LI72_EMEP;
    private int _overall_qflag_H2O_LI72;
    private int _overall_qflag_H2O_LI72_EMEP;
    private int _overall_qflag_CH4_PICA;
    private int _overall_qflag_CH4_PICA_EMEP;
    private int _overall_qflag_H2O_PICA;
    private int _overall_qflag_H2O_PICA_EMEP;
    private int _ITC_qflag_w;
    private int _ITC_qflag_w_EMEP;
    private int _ITC_qflag_u;
    private int _ITC_qflag_u_EMEP;
    private int _ITC_qflag_Ts;
    private int _ITC_qflag_Ts_EMEP;
    private int _ITC_qflag_CO2_LI72;
    private int _ITC_qflag_CO2_LI72_EMEP;
    private int _ITC_qflag_H2O_LI72;
    private int _ITC_qflag_H2O_LI72_EMEP;
    private int _ITC_qflag_CH4_PICA;
    private int _ITC_qflag_CH4_PICA_EMEP;
    private int _ITC_qflag_H2O_PICA;
    private int _ITC_qflag_H2O_PICA_EMEP;
    private int _FST_qflag_u;
    private int _FST_qflag_u_EMEP;
    private int _FST_qflag_Ts;
    private int _FST_qflag_Ts_EMEP;
    private int _FST_qflag_CO2_LI72;
    private int _FST_qflag_CO2_LI72_EMEP;
    private int _FST_qflag_H2O_LI72;
    private int _FST_qflag_H2O_LI72_EMEP;
    private int _FST_qflag_CH4_PICA;
    private int _FST_qflag_CH4_PICA_EMEP;
    private int _FST_qflag_H2O_PICA;
    private int _FST_qflag_H2O_PICA_EMEP;
    private float _Hm_u;
    private int _Hm_u_EMEP;
    private float _Hm_Ts;
    private int _Hm_Ts_EMEP;
    private float _Hm_CO2_LI72;
    private int _Hm_CO2_LI72_EMEP;
    private float _Hm_H2O_LI72;
    private int _Hm_H2O_LI72_EMEP;
    private float _Hm_CH4_PICA;
    private int _Hm_CH4_PICA_EMEP;
    private float _Hm_H2O_PICA;
    private int _Hm_H2O_PICA_EMEP;
    private float _Hv_u;
    private int _Hv_u_EMEP;
    private float _Hv_Ts;
    private int _Hv_Ts_EMEP;
    private float _Hv_CO2_LI72;
    private int _Hv_CO2_LI72_EMEP;
    private float _Hv_H2O_LI72;
    private int _Hv_H2O_LI72_EMEP;
    private float _Hv_CH4_PICA;
    private int _Hv_CH4_PICA_EMEP;
    private float _Hv_H2O_PICA;
    private int _Hv_H2O_PICA_EMEP;
    private float _fpr_x_peak;
    private int _fpr_x_peak_EMEP;
    private float _fpr_x_80;
    private int _fpr_x_80_EMEP;

    public kvjEddySoap() {
    }

    public static kvjEddySoap toSoapModel(kvjEddy model) {
        kvjEddySoap soapModel = new kvjEddySoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setH(model.getH());
        soapModel.setH_EMEP(model.getH_EMEP());
        soapModel.setQc_H(model.getQc_H());
        soapModel.setQc_H_EMEP(model.getQc_H_EMEP());
        soapModel.setTau(model.getTau());
        soapModel.setTau_EMEP(model.getTau_EMEP());
        soapModel.setQc_tau(model.getQc_tau());
        soapModel.setQc_tau_EMEP(model.getQc_tau_EMEP());
        soapModel.setU_star(model.getU_star());
        soapModel.setU_star_EMEP(model.getU_star_EMEP());
        soapModel.setMO_length(model.getMO_length());
        soapModel.setMO_length_EMEP(model.getMO_length_EMEP());
        soapModel.setErr_packet(model.getErr_packet());
        soapModel.setErr_packet_EMEP(model.getErr_packet_EMEP());
        soapModel.setF_CO2_LI72(model.getF_CO2_LI72());
        soapModel.setF_CO2_LI72_EMEP(model.getF_CO2_LI72_EMEP());
        soapModel.setQc_CO2_LI72(model.getQc_CO2_LI72());
        soapModel.setQc_CO2_LI72_EMEP(model.getQc_CO2_LI72_EMEP());
        soapModel.setF_CH4_PICA(model.getF_CH4_PICA());
        soapModel.setF_CH4_PICA_EMEP(model.getF_CH4_PICA_EMEP());
        soapModel.setQc_CH4_PICA(model.getQc_CH4_PICA());
        soapModel.setQc_CH4_PICA_EMEP(model.getQc_CH4_PICA_EMEP());
        soapModel.setF_H2O_LI72(model.getF_H2O_LI72());
        soapModel.setF_H2O_LI72_EMEP(model.getF_H2O_LI72_EMEP());
        soapModel.setQc_H2O_LI72(model.getQc_H2O_LI72());
        soapModel.setQc_H2O_LI72_EMEP(model.getQc_H2O_LI72_EMEP());
        soapModel.setF_H2O_PICA(model.getF_H2O_PICA());
        soapModel.setF_H2O_PICA_EMEP(model.getF_H2O_PICA_EMEP());
        soapModel.setQc_H2O_PICA(model.getQc_H2O_PICA());
        soapModel.setQc_H2O_PICA_EMEP(model.getQc_H2O_PICA_EMEP());
        soapModel.setLE_LI72(model.getLE_LI72());
        soapModel.setLE_LI72_EMEP(model.getLE_LI72_EMEP());
        soapModel.setLE_PICA(model.getLE_PICA());
        soapModel.setLE_PICA_EMEP(model.getLE_PICA_EMEP());
        soapModel.setU(model.getU());
        soapModel.setU_EMEP(model.getU_EMEP());
        soapModel.setWind_dir(model.getWind_dir());
        soapModel.setWind_dir_EMEP(model.getWind_dir_EMEP());
        soapModel.setAv_u(model.getAv_u());
        soapModel.setAv_u_EMEP(model.getAv_u_EMEP());
        soapModel.setAv_v(model.getAv_v());
        soapModel.setAv_v_EMEP(model.getAv_v_EMEP());
        soapModel.setAv_w(model.getAv_w());
        soapModel.setAv_w_EMEP(model.getAv_w_EMEP());
        soapModel.setAv_t(model.getAv_t());
        soapModel.setAv_t_EMEP(model.getAv_t_EMEP());
        soapModel.setAv_c_LI72(model.getAv_c_LI72());
        soapModel.setAv_c_LI72_EMEP(model.getAv_c_LI72_EMEP());
        soapModel.setAv_h_LI72(model.getAv_h_LI72());
        soapModel.setAv_h_LI72_EMEP(model.getAv_h_LI72_EMEP());
        soapModel.setAv_h_PICA(model.getAv_h_PICA());
        soapModel.setAv_h_PICA_EMEP(model.getAv_h_PICA_EMEP());
        soapModel.setAv_CH4(model.getAv_CH4());
        soapModel.setAv_CH4_EMEP(model.getAv_CH4_EMEP());
        soapModel.setStd_u(model.getStd_u());
        soapModel.setStd_u_EMEP(model.getStd_u_EMEP());
        soapModel.setStd_v(model.getStd_v());
        soapModel.setStd_v_EMEP(model.getStd_v_EMEP());
        soapModel.setStd_w(model.getStd_w());
        soapModel.setStd_w_EMEP(model.getStd_w_EMEP());
        soapModel.setStd_t(model.getStd_t());
        soapModel.setStd_t_EMEP(model.getStd_t_EMEP());
        soapModel.setStd_c_LI72(model.getStd_c_LI72());
        soapModel.setStd_c_LI72_EMEP(model.getStd_c_LI72_EMEP());
        soapModel.setStd_h_LI72(model.getStd_h_LI72());
        soapModel.setStd_h_LI72_EMEP(model.getStd_h_LI72_EMEP());
        soapModel.setStd_h_PICA(model.getStd_h_PICA());
        soapModel.setStd_h_PICA_EMEP(model.getStd_h_PICA_EMEP());
        soapModel.setStd_CH4(model.getStd_CH4());
        soapModel.setStd_CH4_EMEP(model.getStd_CH4_EMEP());
        soapModel.setEta(model.getEta());
        soapModel.setEta_EMEP(model.getEta_EMEP());
        soapModel.setTheta(model.getTheta());
        soapModel.setTheta_EMEP(model.getTheta_EMEP());
        soapModel.setBeta(model.getBeta());
        soapModel.setBeta_EMEP(model.getBeta_EMEP());
        soapModel.setCovs_u(model.getCovs_u());
        soapModel.setCovs_u_EMEP(model.getCovs_u_EMEP());
        soapModel.setCovs_v(model.getCovs_v());
        soapModel.setCovs_v_EMEP(model.getCovs_v_EMEP());
        soapModel.setCovs_Ts(model.getCovs_Ts());
        soapModel.setCovs_Ts_EMEP(model.getCovs_Ts_EMEP());
        soapModel.setCovs_CO2_LI72(model.getCovs_CO2_LI72());
        soapModel.setCovs_CO2_LI72_EMEP(model.getCovs_CO2_LI72_EMEP());
        soapModel.setCovs_H2O_LI72(model.getCovs_H2O_LI72());
        soapModel.setCovs_H2O_LI72_EMEP(model.getCovs_H2O_LI72_EMEP());
        soapModel.setCovs_T_C_LI72(model.getCovs_T_C_LI72());
        soapModel.setCovs_T_C_LI72_EMEP(model.getCovs_T_C_LI72_EMEP());
        soapModel.setCovs_P_C_LI72(model.getCovs_P_C_LI72());
        soapModel.setCovs_P_C_LI72_EMEP(model.getCovs_P_C_LI72_EMEP());
        soapModel.setCovs_H2O_PICA(model.getCovs_H2O_PICA());
        soapModel.setCovs_H2O_PICA_EMEP(model.getCovs_H2O_PICA_EMEP());
        soapModel.setCovs_CH4_PICA(model.getCovs_CH4_PICA());
        soapModel.setCovs_CH4_PICA_EMEP(model.getCovs_CH4_PICA_EMEP());
        soapModel.setLicor_t_av(model.getLicor_t_av());
        soapModel.setLicor_t_av_EMEP(model.getLicor_t_av_EMEP());
        soapModel.setLicor_p_av(model.getLicor_p_av());
        soapModel.setLicor_p_av_EMEP(model.getLicor_p_av_EMEP());
        soapModel.setLicor_t_std(model.getLicor_t_std());
        soapModel.setLicor_t_std_EMEP(model.getLicor_t_std_EMEP());
        soapModel.setLicor_p_std(model.getLicor_p_std());
        soapModel.setLicor_p_std_EMEP(model.getLicor_p_std_EMEP());
        soapModel.setC_lag_LI72(model.getC_lag_LI72());
        soapModel.setC_lag_LI72_EMEP(model.getC_lag_LI72_EMEP());
        soapModel.setH_lag_LI72(model.getH_lag_LI72());
        soapModel.setH_lag_LI72_EMEP(model.getH_lag_LI72_EMEP());
        soapModel.setT_lag_LI72(model.getT_lag_LI72());
        soapModel.setT_lag_LI72_EMEP(model.getT_lag_LI72_EMEP());
        soapModel.setP_lag_LI72(model.getP_lag_LI72());
        soapModel.setP_lag_LI72_EMEP(model.getP_lag_LI72_EMEP());
        soapModel.setH_lag_PICA(model.getH_lag_PICA());
        soapModel.setH_lag_PICA_EMEP(model.getH_lag_PICA_EMEP());
        soapModel.setCH4_lag(model.getCH4_lag());
        soapModel.setCH4_lag_EMEP(model.getCH4_lag_EMEP());
        soapModel.setNspikes_u(model.getNspikes_u());
        soapModel.setNspikes_u_EMEP(model.getNspikes_u_EMEP());
        soapModel.setNspikes_v(model.getNspikes_v());
        soapModel.setNspikes_v_EMEP(model.getNspikes_v_EMEP());
        soapModel.setNspikes_w(model.getNspikes_w());
        soapModel.setNspikes_w_EMEP(model.getNspikes_w_EMEP());
        soapModel.setNspikes_Ts(model.getNspikes_Ts());
        soapModel.setNspikes_Ts_EMEP(model.getNspikes_Ts_EMEP());
        soapModel.setNspikes_CO2_LI72(model.getNspikes_CO2_LI72());
        soapModel.setNspikes_CO2_LI72_EMEP(model.getNspikes_CO2_LI72_EMEP());
        soapModel.setNspikes_H2O_LI72(model.getNspikes_H2O_LI72());
        soapModel.setNspikes_H2O_LI72_EMEP(model.getNspikes_H2O_LI72_EMEP());
        soapModel.setNspikes_T_C_LI72(model.getNspikes_T_C_LI72());
        soapModel.setNspikes_T_C_LI72_EMEP(model.getNspikes_T_C_LI72_EMEP());
        soapModel.setNspikes_P_C_LI72(model.getNspikes_P_C_LI72());
        soapModel.setNspikes_P_C_LI72_EMEP(model.getNspikes_P_C_LI72_EMEP());
        soapModel.setNspikes_H2O_PICA(model.getNspikes_H2O_PICA());
        soapModel.setNspikes_H2O_PICA_EMEP(model.getNspikes_H2O_PICA_EMEP());
        soapModel.setNspikes_CH4_PICA(model.getNspikes_CH4_PICA());
        soapModel.setNspikes_CH4_PICA_EMEP(model.getNspikes_CH4_PICA_EMEP());
        soapModel.setFI_u(model.getFI_u());
        soapModel.setFI_u_EMEP(model.getFI_u_EMEP());
        soapModel.setFI_Ts(model.getFI_Ts());
        soapModel.setFI_Ts_EMEP(model.getFI_Ts_EMEP());
        soapModel.setFI_CO2_LI72(model.getFI_CO2_LI72());
        soapModel.setFI_CO2_LI72_EMEP(model.getFI_CO2_LI72_EMEP());
        soapModel.setFI_H2O_LI72(model.getFI_H2O_LI72());
        soapModel.setFI_H2O_LI72_EMEP(model.getFI_H2O_LI72_EMEP());
        soapModel.setFI_CH4_PICA(model.getFI_CH4_PICA());
        soapModel.setFI_CH4_PICA_EMEP(model.getFI_CH4_PICA_EMEP());
        soapModel.setFI_H2O_PICA(model.getFI_H2O_PICA());
        soapModel.setFI_H2O_PICA_EMEP(model.getFI_H2O_PICA_EMEP());
        soapModel.setFST_u(model.getFST_u());
        soapModel.setFST_u_EMEP(model.getFST_u_EMEP());
        soapModel.setFST_Ts(model.getFST_Ts());
        soapModel.setFST_Ts_EMEP(model.getFST_Ts_EMEP());
        soapModel.setFST_CO2_LI72(model.getFST_CO2_LI72());
        soapModel.setFST_CO2_LI72_EMEP(model.getFST_CO2_LI72_EMEP());
        soapModel.setFST_H2O_LI72(model.getFST_H2O_LI72());
        soapModel.setFST_H2O_LI72_EMEP(model.getFST_H2O_LI72_EMEP());
        soapModel.setFST_CH4_PICA(model.getFST_CH4_PICA());
        soapModel.setFST_CH4_PICA_EMEP(model.getFST_CH4_PICA_EMEP());
        soapModel.setFST_H2O_PICA(model.getFST_H2O_PICA());
        soapModel.setFST_H2O_PICA_EMEP(model.getFST_H2O_PICA_EMEP());
        soapModel.setRFE_u(model.getRFE_u());
        soapModel.setRFE_u_EMEP(model.getRFE_u_EMEP());
        soapModel.setRFE_Ts(model.getRFE_Ts());
        soapModel.setRFE_Ts_EMEP(model.getRFE_Ts_EMEP());
        soapModel.setRFE_CO2_LI72(model.getRFE_CO2_LI72());
        soapModel.setRFE_CO2_LI72_EMEP(model.getRFE_CO2_LI72_EMEP());
        soapModel.setRFE_H2O_LI72(model.getRFE_H2O_LI72());
        soapModel.setRFE_H2O_LI72_EMEP(model.getRFE_H2O_LI72_EMEP());
        soapModel.setRFE_CH4_PICA(model.getRFE_CH4_PICA());
        soapModel.setRFE_CH4_PICA_EMEP(model.getRFE_CH4_PICA_EMEP());
        soapModel.setRFE_H2O_PICA(model.getRFE_H2O_PICA());
        soapModel.setRFE_H2O_PICA_EMEP(model.getRFE_H2O_PICA_EMEP());
        soapModel.setFA_u(model.getFA_u());
        soapModel.setFA_u_EMEP(model.getFA_u_EMEP());
        soapModel.setFA_v(model.getFA_v());
        soapModel.setFA_v_EMEP(model.getFA_v_EMEP());
        soapModel.setFA_Ts(model.getFA_Ts());
        soapModel.setFA_Ts_EMEP(model.getFA_Ts_EMEP());
        soapModel.setFA_CO2_LI72(model.getFA_CO2_LI72());
        soapModel.setFA_CO2_LI72_EMEP(model.getFA_CO2_LI72_EMEP());
        soapModel.setFA_H2O_LI72(model.getFA_H2O_LI72());
        soapModel.setFA_H2O_LI72_EMEP(model.getFA_H2O_LI72_EMEP());
        soapModel.setFA_CH4_PICA(model.getFA_CH4_PICA());
        soapModel.setFA_CH4_PICA_EMEP(model.getFA_CH4_PICA_EMEP());
        soapModel.setFA_H2O_PICA(model.getFA_H2O_PICA());
        soapModel.setFA_H2O_PICA_EMEP(model.getFA_H2O_PICA_EMEP());
        soapModel.setCovsvar_u(model.getCovsvar_u());
        soapModel.setCovsvar_u_EMEP(model.getCovsvar_u_EMEP());
        soapModel.setCovsvar_v(model.getCovsvar_v());
        soapModel.setCovsvar_v_EMEP(model.getCovsvar_v_EMEP());
        soapModel.setCovsvar_Ts(model.getCovsvar_Ts());
        soapModel.setCovsvar_Ts_EMEP(model.getCovsvar_Ts_EMEP());
        soapModel.setCovsvar_CO2_LI72(model.getCovsvar_CO2_LI72());
        soapModel.setCovsvar_CO2_LI72_EMEP(model.getCovsvar_CO2_LI72_EMEP());
        soapModel.setCovsvar_H2O_LI72(model.getCovsvar_H2O_LI72());
        soapModel.setCovsvar_H2O_LI72_EMEP(model.getCovsvar_H2O_LI72_EMEP());
        soapModel.setCovsvar_CH4_PICA(model.getCovsvar_CH4_PICA());
        soapModel.setCovsvar_CH4_PICA_EMEP(model.getCovsvar_CH4_PICA_EMEP());
        soapModel.setCovsvar_H2O_PICA(model.getCovsvar_H2O_PICA());
        soapModel.setCovsvar_H2O_PICA_EMEP(model.getCovsvar_H2O_PICA_EMEP());
        soapModel.setSKx_u(model.getSKx_u());
        soapModel.setSKx_u_EMEP(model.getSKx_u_EMEP());
        soapModel.setSKx_v(model.getSKx_v());
        soapModel.setSKx_v_EMEP(model.getSKx_v_EMEP());
        soapModel.setSKx_w(model.getSKx_w());
        soapModel.setSKx_w_EMEP(model.getSKx_w_EMEP());
        soapModel.setSKx_Ts(model.getSKx_Ts());
        soapModel.setSKx_Ts_EMEP(model.getSKx_Ts_EMEP());
        soapModel.setSKx_CO2_LI72(model.getSKx_CO2_LI72());
        soapModel.setSKx_CO2_LI72_EMEP(model.getSKx_CO2_LI72_EMEP());
        soapModel.setSKx_H2O_LI72(model.getSKx_H2O_LI72());
        soapModel.setSKx_H2O_LI72_EMEP(model.getSKx_H2O_LI72_EMEP());
        soapModel.setSKx_CH4_PICA(model.getSKx_CH4_PICA());
        soapModel.setSKx_CH4_PICA_EMEP(model.getSKx_CH4_PICA_EMEP());
        soapModel.setSKx_H2O_PICA(model.getSKx_H2O_PICA());
        soapModel.setSKx_H2O_PICA_EMEP(model.getSKx_H2O_PICA_EMEP());
        soapModel.setKUx_u(model.getKUx_u());
        soapModel.setKUx_u_EMEP(model.getKUx_u_EMEP());
        soapModel.setKUx_v(model.getKUx_v());
        soapModel.setKUx_v_EMEP(model.getKUx_v_EMEP());
        soapModel.setKUx_w(model.getKUx_w());
        soapModel.setKUx_w_EMEP(model.getKUx_w_EMEP());
        soapModel.setKUx_Ts(model.getKUx_Ts());
        soapModel.setKUx_Ts_EMEP(model.getKUx_Ts_EMEP());
        soapModel.setKUx_CO2_LI72(model.getKUx_CO2_LI72());
        soapModel.setKUx_CO2_LI72_EMEP(model.getKUx_CO2_LI72_EMEP());
        soapModel.setKUx_H2O_LI72(model.getKUx_H2O_LI72());
        soapModel.setKUx_H2O_LI72_EMEP(model.getKUx_H2O_LI72_EMEP());
        soapModel.setKUx_CH4_PICA(model.getKUx_CH4_PICA());
        soapModel.setKUx_CH4_PICA_EMEP(model.getKUx_CH4_PICA_EMEP());
        soapModel.setKUx_H2O_PICA(model.getKUx_H2O_PICA());
        soapModel.setKUx_H2O_PICA_EMEP(model.getKUx_H2O_PICA_EMEP());
        soapModel.setOverall_qflag_u(model.getOverall_qflag_u());
        soapModel.setOverall_qflag_u_EMEP(model.getOverall_qflag_u_EMEP());
        soapModel.setOverall_qflag_Ts(model.getOverall_qflag_Ts());
        soapModel.setOverall_qflag_Ts_EMEP(model.getOverall_qflag_Ts_EMEP());
        soapModel.setOverall_qflag_CO2_LI72(model.getOverall_qflag_CO2_LI72());
        soapModel.setOverall_qflag_CO2_LI72_EMEP(model.getOverall_qflag_CO2_LI72_EMEP());
        soapModel.setOverall_qflag_H2O_LI72(model.getOverall_qflag_H2O_LI72());
        soapModel.setOverall_qflag_H2O_LI72_EMEP(model.getOverall_qflag_H2O_LI72_EMEP());
        soapModel.setOverall_qflag_CH4_PICA(model.getOverall_qflag_CH4_PICA());
        soapModel.setOverall_qflag_CH4_PICA_EMEP(model.getOverall_qflag_CH4_PICA_EMEP());
        soapModel.setOverall_qflag_H2O_PICA(model.getOverall_qflag_H2O_PICA());
        soapModel.setOverall_qflag_H2O_PICA_EMEP(model.getOverall_qflag_H2O_PICA_EMEP());
        soapModel.setITC_qflag_w(model.getITC_qflag_w());
        soapModel.setITC_qflag_w_EMEP(model.getITC_qflag_w_EMEP());
        soapModel.setITC_qflag_u(model.getITC_qflag_u());
        soapModel.setITC_qflag_u_EMEP(model.getITC_qflag_u_EMEP());
        soapModel.setITC_qflag_Ts(model.getITC_qflag_Ts());
        soapModel.setITC_qflag_Ts_EMEP(model.getITC_qflag_Ts_EMEP());
        soapModel.setITC_qflag_CO2_LI72(model.getITC_qflag_CO2_LI72());
        soapModel.setITC_qflag_CO2_LI72_EMEP(model.getITC_qflag_CO2_LI72_EMEP());
        soapModel.setITC_qflag_H2O_LI72(model.getITC_qflag_H2O_LI72());
        soapModel.setITC_qflag_H2O_LI72_EMEP(model.getITC_qflag_H2O_LI72_EMEP());
        soapModel.setITC_qflag_CH4_PICA(model.getITC_qflag_CH4_PICA());
        soapModel.setITC_qflag_CH4_PICA_EMEP(model.getITC_qflag_CH4_PICA_EMEP());
        soapModel.setITC_qflag_H2O_PICA(model.getITC_qflag_H2O_PICA());
        soapModel.setITC_qflag_H2O_PICA_EMEP(model.getITC_qflag_H2O_PICA_EMEP());
        soapModel.setFST_qflag_u(model.getFST_qflag_u());
        soapModel.setFST_qflag_u_EMEP(model.getFST_qflag_u_EMEP());
        soapModel.setFST_qflag_Ts(model.getFST_qflag_Ts());
        soapModel.setFST_qflag_Ts_EMEP(model.getFST_qflag_Ts_EMEP());
        soapModel.setFST_qflag_CO2_LI72(model.getFST_qflag_CO2_LI72());
        soapModel.setFST_qflag_CO2_LI72_EMEP(model.getFST_qflag_CO2_LI72_EMEP());
        soapModel.setFST_qflag_H2O_LI72(model.getFST_qflag_H2O_LI72());
        soapModel.setFST_qflag_H2O_LI72_EMEP(model.getFST_qflag_H2O_LI72_EMEP());
        soapModel.setFST_qflag_CH4_PICA(model.getFST_qflag_CH4_PICA());
        soapModel.setFST_qflag_CH4_PICA_EMEP(model.getFST_qflag_CH4_PICA_EMEP());
        soapModel.setFST_qflag_H2O_PICA(model.getFST_qflag_H2O_PICA());
        soapModel.setFST_qflag_H2O_PICA_EMEP(model.getFST_qflag_H2O_PICA_EMEP());
        soapModel.setHm_u(model.getHm_u());
        soapModel.setHm_u_EMEP(model.getHm_u_EMEP());
        soapModel.setHm_Ts(model.getHm_Ts());
        soapModel.setHm_Ts_EMEP(model.getHm_Ts_EMEP());
        soapModel.setHm_CO2_LI72(model.getHm_CO2_LI72());
        soapModel.setHm_CO2_LI72_EMEP(model.getHm_CO2_LI72_EMEP());
        soapModel.setHm_H2O_LI72(model.getHm_H2O_LI72());
        soapModel.setHm_H2O_LI72_EMEP(model.getHm_H2O_LI72_EMEP());
        soapModel.setHm_CH4_PICA(model.getHm_CH4_PICA());
        soapModel.setHm_CH4_PICA_EMEP(model.getHm_CH4_PICA_EMEP());
        soapModel.setHm_H2O_PICA(model.getHm_H2O_PICA());
        soapModel.setHm_H2O_PICA_EMEP(model.getHm_H2O_PICA_EMEP());
        soapModel.setHv_u(model.getHv_u());
        soapModel.setHv_u_EMEP(model.getHv_u_EMEP());
        soapModel.setHv_Ts(model.getHv_Ts());
        soapModel.setHv_Ts_EMEP(model.getHv_Ts_EMEP());
        soapModel.setHv_CO2_LI72(model.getHv_CO2_LI72());
        soapModel.setHv_CO2_LI72_EMEP(model.getHv_CO2_LI72_EMEP());
        soapModel.setHv_H2O_LI72(model.getHv_H2O_LI72());
        soapModel.setHv_H2O_LI72_EMEP(model.getHv_H2O_LI72_EMEP());
        soapModel.setHv_CH4_PICA(model.getHv_CH4_PICA());
        soapModel.setHv_CH4_PICA_EMEP(model.getHv_CH4_PICA_EMEP());
        soapModel.setHv_H2O_PICA(model.getHv_H2O_PICA());
        soapModel.setHv_H2O_PICA_EMEP(model.getHv_H2O_PICA_EMEP());
        soapModel.setFpr_x_peak(model.getFpr_x_peak());
        soapModel.setFpr_x_peak_EMEP(model.getFpr_x_peak_EMEP());
        soapModel.setFpr_x_80(model.getFpr_x_80());
        soapModel.setFpr_x_80_EMEP(model.getFpr_x_80_EMEP());

        return soapModel;
    }

    public static kvjEddySoap[] toSoapModels(kvjEddy[] models) {
        kvjEddySoap[] soapModels = new kvjEddySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static kvjEddySoap[][] toSoapModels(kvjEddy[][] models) {
        kvjEddySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new kvjEddySoap[models.length][models[0].length];
        } else {
            soapModels = new kvjEddySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static kvjEddySoap[] toSoapModels(List<kvjEddy> models) {
        List<kvjEddySoap> soapModels = new ArrayList<kvjEddySoap>(models.size());

        for (kvjEddy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new kvjEddySoap[soapModels.size()]);
    }

    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    public void setPrimaryKey(java.util.Date pk) {
        setSamptime(pk);
    }

    public Date getSamptime() {
        return _samptime;
    }

    public void setSamptime(Date samptime) {
        _samptime = samptime;
    }

    public float getH() {
        return _H;
    }

    public void setH(float H) {
        _H = H;
    }

    public int getH_EMEP() {
        return _H_EMEP;
    }

    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;
    }

    public int getQc_H() {
        return _Qc_H;
    }

    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;
    }

    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;
    }

    public float getTau() {
        return _tau;
    }

    public void setTau(float tau) {
        _tau = tau;
    }

    public int getTau_EMEP() {
        return _tau_EMEP;
    }

    public void setTau_EMEP(int tau_EMEP) {
        _tau_EMEP = tau_EMEP;
    }

    public int getQc_tau() {
        return _Qc_tau;
    }

    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;
    }

    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;
    }

    public float getU_star() {
        return _u_star;
    }

    public void setU_star(float u_star) {
        _u_star = u_star;
    }

    public int getU_star_EMEP() {
        return _u_star_EMEP;
    }

    public void setU_star_EMEP(int u_star_EMEP) {
        _u_star_EMEP = u_star_EMEP;
    }

    public float getMO_length() {
        return _MO_length;
    }

    public void setMO_length(float MO_length) {
        _MO_length = MO_length;
    }

    public int getMO_length_EMEP() {
        return _MO_length_EMEP;
    }

    public void setMO_length_EMEP(int MO_length_EMEP) {
        _MO_length_EMEP = MO_length_EMEP;
    }

    public int getErr_packet() {
        return _err_packet;
    }

    public void setErr_packet(int err_packet) {
        _err_packet = err_packet;
    }

    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;
    }

    public float getF_CO2_LI72() {
        return _F_CO2_LI72;
    }

    public void setF_CO2_LI72(float F_CO2_LI72) {
        _F_CO2_LI72 = F_CO2_LI72;
    }

    public int getF_CO2_LI72_EMEP() {
        return _F_CO2_LI72_EMEP;
    }

    public void setF_CO2_LI72_EMEP(int F_CO2_LI72_EMEP) {
        _F_CO2_LI72_EMEP = F_CO2_LI72_EMEP;
    }

    public int getQc_CO2_LI72() {
        return _Qc_CO2_LI72;
    }

    public void setQc_CO2_LI72(int Qc_CO2_LI72) {
        _Qc_CO2_LI72 = Qc_CO2_LI72;
    }

    public int getQc_CO2_LI72_EMEP() {
        return _Qc_CO2_LI72_EMEP;
    }

    public void setQc_CO2_LI72_EMEP(int Qc_CO2_LI72_EMEP) {
        _Qc_CO2_LI72_EMEP = Qc_CO2_LI72_EMEP;
    }

    public float getF_CH4_PICA() {
        return _F_CH4_PICA;
    }

    public void setF_CH4_PICA(float F_CH4_PICA) {
        _F_CH4_PICA = F_CH4_PICA;
    }

    public int getF_CH4_PICA_EMEP() {
        return _F_CH4_PICA_EMEP;
    }

    public void setF_CH4_PICA_EMEP(int F_CH4_PICA_EMEP) {
        _F_CH4_PICA_EMEP = F_CH4_PICA_EMEP;
    }

    public int getQc_CH4_PICA() {
        return _Qc_CH4_PICA;
    }

    public void setQc_CH4_PICA(int Qc_CH4_PICA) {
        _Qc_CH4_PICA = Qc_CH4_PICA;
    }

    public int getQc_CH4_PICA_EMEP() {
        return _Qc_CH4_PICA_EMEP;
    }

    public void setQc_CH4_PICA_EMEP(int Qc_CH4_PICA_EMEP) {
        _Qc_CH4_PICA_EMEP = Qc_CH4_PICA_EMEP;
    }

    public float getF_H2O_LI72() {
        return _F_H2O_LI72;
    }

    public void setF_H2O_LI72(float F_H2O_LI72) {
        _F_H2O_LI72 = F_H2O_LI72;
    }

    public int getF_H2O_LI72_EMEP() {
        return _F_H2O_LI72_EMEP;
    }

    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP) {
        _F_H2O_LI72_EMEP = F_H2O_LI72_EMEP;
    }

    public int getQc_H2O_LI72() {
        return _Qc_H2O_LI72;
    }

    public void setQc_H2O_LI72(int Qc_H2O_LI72) {
        _Qc_H2O_LI72 = Qc_H2O_LI72;
    }

    public int getQc_H2O_LI72_EMEP() {
        return _Qc_H2O_LI72_EMEP;
    }

    public void setQc_H2O_LI72_EMEP(int Qc_H2O_LI72_EMEP) {
        _Qc_H2O_LI72_EMEP = Qc_H2O_LI72_EMEP;
    }

    public float getF_H2O_PICA() {
        return _F_H2O_PICA;
    }

    public void setF_H2O_PICA(float F_H2O_PICA) {
        _F_H2O_PICA = F_H2O_PICA;
    }

    public int getF_H2O_PICA_EMEP() {
        return _F_H2O_PICA_EMEP;
    }

    public void setF_H2O_PICA_EMEP(int F_H2O_PICA_EMEP) {
        _F_H2O_PICA_EMEP = F_H2O_PICA_EMEP;
    }

    public int getQc_H2O_PICA() {
        return _Qc_H2O_PICA;
    }

    public void setQc_H2O_PICA(int Qc_H2O_PICA) {
        _Qc_H2O_PICA = Qc_H2O_PICA;
    }

    public int getQc_H2O_PICA_EMEP() {
        return _Qc_H2O_PICA_EMEP;
    }

    public void setQc_H2O_PICA_EMEP(int Qc_H2O_PICA_EMEP) {
        _Qc_H2O_PICA_EMEP = Qc_H2O_PICA_EMEP;
    }

    public float getLE_LI72() {
        return _LE_LI72;
    }

    public void setLE_LI72(float LE_LI72) {
        _LE_LI72 = LE_LI72;
    }

    public int getLE_LI72_EMEP() {
        return _LE_LI72_EMEP;
    }

    public void setLE_LI72_EMEP(int LE_LI72_EMEP) {
        _LE_LI72_EMEP = LE_LI72_EMEP;
    }

    public float getLE_PICA() {
        return _LE_PICA;
    }

    public void setLE_PICA(float LE_PICA) {
        _LE_PICA = LE_PICA;
    }

    public int getLE_PICA_EMEP() {
        return _LE_PICA_EMEP;
    }

    public void setLE_PICA_EMEP(int LE_PICA_EMEP) {
        _LE_PICA_EMEP = LE_PICA_EMEP;
    }

    public float getU() {
        return _U;
    }

    public void setU(float U) {
        _U = U;
    }

    public int getU_EMEP() {
        return _U_EMEP;
    }

    public void setU_EMEP(int U_EMEP) {
        _U_EMEP = U_EMEP;
    }

    public float getWind_dir() {
        return _wind_dir;
    }

    public void setWind_dir(float wind_dir) {
        _wind_dir = wind_dir;
    }

    public int getWind_dir_EMEP() {
        return _wind_dir_EMEP;
    }

    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _wind_dir_EMEP = wind_dir_EMEP;
    }

    public float getAv_u() {
        return _av_u;
    }

    public void setAv_u(float av_u) {
        _av_u = av_u;
    }

    public int getAv_u_EMEP() {
        return _av_u_EMEP;
    }

    public void setAv_u_EMEP(int av_u_EMEP) {
        _av_u_EMEP = av_u_EMEP;
    }

    public float getAv_v() {
        return _av_v;
    }

    public void setAv_v(float av_v) {
        _av_v = av_v;
    }

    public int getAv_v_EMEP() {
        return _av_v_EMEP;
    }

    public void setAv_v_EMEP(int av_v_EMEP) {
        _av_v_EMEP = av_v_EMEP;
    }

    public float getAv_w() {
        return _av_w;
    }

    public void setAv_w(float av_w) {
        _av_w = av_w;
    }

    public int getAv_w_EMEP() {
        return _av_w_EMEP;
    }

    public void setAv_w_EMEP(int av_w_EMEP) {
        _av_w_EMEP = av_w_EMEP;
    }

    public float getAv_t() {
        return _av_t;
    }

    public void setAv_t(float av_t) {
        _av_t = av_t;
    }

    public int getAv_t_EMEP() {
        return _av_t_EMEP;
    }

    public void setAv_t_EMEP(int av_t_EMEP) {
        _av_t_EMEP = av_t_EMEP;
    }

    public float getAv_c_LI72() {
        return _av_c_LI72;
    }

    public void setAv_c_LI72(float av_c_LI72) {
        _av_c_LI72 = av_c_LI72;
    }

    public int getAv_c_LI72_EMEP() {
        return _av_c_LI72_EMEP;
    }

    public void setAv_c_LI72_EMEP(int av_c_LI72_EMEP) {
        _av_c_LI72_EMEP = av_c_LI72_EMEP;
    }

    public float getAv_h_LI72() {
        return _av_h_LI72;
    }

    public void setAv_h_LI72(float av_h_LI72) {
        _av_h_LI72 = av_h_LI72;
    }

    public int getAv_h_LI72_EMEP() {
        return _av_h_LI72_EMEP;
    }

    public void setAv_h_LI72_EMEP(int av_h_LI72_EMEP) {
        _av_h_LI72_EMEP = av_h_LI72_EMEP;
    }

    public float getAv_h_PICA() {
        return _av_h_PICA;
    }

    public void setAv_h_PICA(float av_h_PICA) {
        _av_h_PICA = av_h_PICA;
    }

    public int getAv_h_PICA_EMEP() {
        return _av_h_PICA_EMEP;
    }

    public void setAv_h_PICA_EMEP(int av_h_PICA_EMEP) {
        _av_h_PICA_EMEP = av_h_PICA_EMEP;
    }

    public float getAv_CH4() {
        return _av_CH4;
    }

    public void setAv_CH4(float av_CH4) {
        _av_CH4 = av_CH4;
    }

    public int getAv_CH4_EMEP() {
        return _av_CH4_EMEP;
    }

    public void setAv_CH4_EMEP(int av_CH4_EMEP) {
        _av_CH4_EMEP = av_CH4_EMEP;
    }

    public float getStd_u() {
        return _std_u;
    }

    public void setStd_u(float std_u) {
        _std_u = std_u;
    }

    public int getStd_u_EMEP() {
        return _std_u_EMEP;
    }

    public void setStd_u_EMEP(int std_u_EMEP) {
        _std_u_EMEP = std_u_EMEP;
    }

    public float getStd_v() {
        return _std_v;
    }

    public void setStd_v(float std_v) {
        _std_v = std_v;
    }

    public int getStd_v_EMEP() {
        return _std_v_EMEP;
    }

    public void setStd_v_EMEP(int std_v_EMEP) {
        _std_v_EMEP = std_v_EMEP;
    }

    public float getStd_w() {
        return _std_w;
    }

    public void setStd_w(float std_w) {
        _std_w = std_w;
    }

    public int getStd_w_EMEP() {
        return _std_w_EMEP;
    }

    public void setStd_w_EMEP(int std_w_EMEP) {
        _std_w_EMEP = std_w_EMEP;
    }

    public float getStd_t() {
        return _std_t;
    }

    public void setStd_t(float std_t) {
        _std_t = std_t;
    }

    public int getStd_t_EMEP() {
        return _std_t_EMEP;
    }

    public void setStd_t_EMEP(int std_t_EMEP) {
        _std_t_EMEP = std_t_EMEP;
    }

    public float getStd_c_LI72() {
        return _std_c_LI72;
    }

    public void setStd_c_LI72(float std_c_LI72) {
        _std_c_LI72 = std_c_LI72;
    }

    public int getStd_c_LI72_EMEP() {
        return _std_c_LI72_EMEP;
    }

    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP) {
        _std_c_LI72_EMEP = std_c_LI72_EMEP;
    }

    public float getStd_h_LI72() {
        return _std_h_LI72;
    }

    public void setStd_h_LI72(float std_h_LI72) {
        _std_h_LI72 = std_h_LI72;
    }

    public int getStd_h_LI72_EMEP() {
        return _std_h_LI72_EMEP;
    }

    public void setStd_h_LI72_EMEP(int std_h_LI72_EMEP) {
        _std_h_LI72_EMEP = std_h_LI72_EMEP;
    }

    public float getStd_h_PICA() {
        return _std_h_PICA;
    }

    public void setStd_h_PICA(float std_h_PICA) {
        _std_h_PICA = std_h_PICA;
    }

    public int getStd_h_PICA_EMEP() {
        return _std_h_PICA_EMEP;
    }

    public void setStd_h_PICA_EMEP(int std_h_PICA_EMEP) {
        _std_h_PICA_EMEP = std_h_PICA_EMEP;
    }

    public float getStd_CH4() {
        return _std_CH4;
    }

    public void setStd_CH4(float std_CH4) {
        _std_CH4 = std_CH4;
    }

    public int getStd_CH4_EMEP() {
        return _std_CH4_EMEP;
    }

    public void setStd_CH4_EMEP(int std_CH4_EMEP) {
        _std_CH4_EMEP = std_CH4_EMEP;
    }

    public float getEta() {
        return _eta;
    }

    public void setEta(float eta) {
        _eta = eta;
    }

    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;
    }

    public float getTheta() {
        return _theta;
    }

    public void setTheta(float theta) {
        _theta = theta;
    }

    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;
    }

    public float getBeta() {
        return _beta;
    }

    public void setBeta(float beta) {
        _beta = beta;
    }

    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;
    }

    public float getCovs_u() {
        return _Covs_u;
    }

    public void setCovs_u(float Covs_u) {
        _Covs_u = Covs_u;
    }

    public int getCovs_u_EMEP() {
        return _Covs_u_EMEP;
    }

    public void setCovs_u_EMEP(int Covs_u_EMEP) {
        _Covs_u_EMEP = Covs_u_EMEP;
    }

    public float getCovs_v() {
        return _Covs_v;
    }

    public void setCovs_v(float Covs_v) {
        _Covs_v = Covs_v;
    }

    public int getCovs_v_EMEP() {
        return _Covs_v_EMEP;
    }

    public void setCovs_v_EMEP(int Covs_v_EMEP) {
        _Covs_v_EMEP = Covs_v_EMEP;
    }

    public float getCovs_Ts() {
        return _Covs_Ts;
    }

    public void setCovs_Ts(float Covs_Ts) {
        _Covs_Ts = Covs_Ts;
    }

    public int getCovs_Ts_EMEP() {
        return _Covs_Ts_EMEP;
    }

    public void setCovs_Ts_EMEP(int Covs_Ts_EMEP) {
        _Covs_Ts_EMEP = Covs_Ts_EMEP;
    }

    public float getCovs_CO2_LI72() {
        return _Covs_CO2_LI72;
    }

    public void setCovs_CO2_LI72(float Covs_CO2_LI72) {
        _Covs_CO2_LI72 = Covs_CO2_LI72;
    }

    public int getCovs_CO2_LI72_EMEP() {
        return _Covs_CO2_LI72_EMEP;
    }

    public void setCovs_CO2_LI72_EMEP(int Covs_CO2_LI72_EMEP) {
        _Covs_CO2_LI72_EMEP = Covs_CO2_LI72_EMEP;
    }

    public float getCovs_H2O_LI72() {
        return _Covs_H2O_LI72;
    }

    public void setCovs_H2O_LI72(float Covs_H2O_LI72) {
        _Covs_H2O_LI72 = Covs_H2O_LI72;
    }

    public int getCovs_H2O_LI72_EMEP() {
        return _Covs_H2O_LI72_EMEP;
    }

    public void setCovs_H2O_LI72_EMEP(int Covs_H2O_LI72_EMEP) {
        _Covs_H2O_LI72_EMEP = Covs_H2O_LI72_EMEP;
    }

    public float getCovs_T_C_LI72() {
        return _Covs_T_C_LI72;
    }

    public void setCovs_T_C_LI72(float Covs_T_C_LI72) {
        _Covs_T_C_LI72 = Covs_T_C_LI72;
    }

    public int getCovs_T_C_LI72_EMEP() {
        return _Covs_T_C_LI72_EMEP;
    }

    public void setCovs_T_C_LI72_EMEP(int Covs_T_C_LI72_EMEP) {
        _Covs_T_C_LI72_EMEP = Covs_T_C_LI72_EMEP;
    }

    public float getCovs_P_C_LI72() {
        return _Covs_P_C_LI72;
    }

    public void setCovs_P_C_LI72(float Covs_P_C_LI72) {
        _Covs_P_C_LI72 = Covs_P_C_LI72;
    }

    public int getCovs_P_C_LI72_EMEP() {
        return _Covs_P_C_LI72_EMEP;
    }

    public void setCovs_P_C_LI72_EMEP(int Covs_P_C_LI72_EMEP) {
        _Covs_P_C_LI72_EMEP = Covs_P_C_LI72_EMEP;
    }

    public float getCovs_H2O_PICA() {
        return _Covs_H2O_PICA;
    }

    public void setCovs_H2O_PICA(float Covs_H2O_PICA) {
        _Covs_H2O_PICA = Covs_H2O_PICA;
    }

    public int getCovs_H2O_PICA_EMEP() {
        return _Covs_H2O_PICA_EMEP;
    }

    public void setCovs_H2O_PICA_EMEP(int Covs_H2O_PICA_EMEP) {
        _Covs_H2O_PICA_EMEP = Covs_H2O_PICA_EMEP;
    }

    public float getCovs_CH4_PICA() {
        return _Covs_CH4_PICA;
    }

    public void setCovs_CH4_PICA(float Covs_CH4_PICA) {
        _Covs_CH4_PICA = Covs_CH4_PICA;
    }

    public int getCovs_CH4_PICA_EMEP() {
        return _Covs_CH4_PICA_EMEP;
    }

    public void setCovs_CH4_PICA_EMEP(int Covs_CH4_PICA_EMEP) {
        _Covs_CH4_PICA_EMEP = Covs_CH4_PICA_EMEP;
    }

    public float getLicor_t_av() {
        return _licor_t_av;
    }

    public void setLicor_t_av(float licor_t_av) {
        _licor_t_av = licor_t_av;
    }

    public int getLicor_t_av_EMEP() {
        return _licor_t_av_EMEP;
    }

    public void setLicor_t_av_EMEP(int licor_t_av_EMEP) {
        _licor_t_av_EMEP = licor_t_av_EMEP;
    }

    public float getLicor_p_av() {
        return _licor_p_av;
    }

    public void setLicor_p_av(float licor_p_av) {
        _licor_p_av = licor_p_av;
    }

    public int getLicor_p_av_EMEP() {
        return _licor_p_av_EMEP;
    }

    public void setLicor_p_av_EMEP(int licor_p_av_EMEP) {
        _licor_p_av_EMEP = licor_p_av_EMEP;
    }

    public float getLicor_t_std() {
        return _licor_t_std;
    }

    public void setLicor_t_std(float licor_t_std) {
        _licor_t_std = licor_t_std;
    }

    public int getLicor_t_std_EMEP() {
        return _licor_t_std_EMEP;
    }

    public void setLicor_t_std_EMEP(int licor_t_std_EMEP) {
        _licor_t_std_EMEP = licor_t_std_EMEP;
    }

    public float getLicor_p_std() {
        return _licor_p_std;
    }

    public void setLicor_p_std(float licor_p_std) {
        _licor_p_std = licor_p_std;
    }

    public int getLicor_p_std_EMEP() {
        return _licor_p_std_EMEP;
    }

    public void setLicor_p_std_EMEP(int licor_p_std_EMEP) {
        _licor_p_std_EMEP = licor_p_std_EMEP;
    }

    public float getC_lag_LI72() {
        return _c_lag_LI72;
    }

    public void setC_lag_LI72(float c_lag_LI72) {
        _c_lag_LI72 = c_lag_LI72;
    }

    public int getC_lag_LI72_EMEP() {
        return _c_lag_LI72_EMEP;
    }

    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP) {
        _c_lag_LI72_EMEP = c_lag_LI72_EMEP;
    }

    public float getH_lag_LI72() {
        return _h_lag_LI72;
    }

    public void setH_lag_LI72(float h_lag_LI72) {
        _h_lag_LI72 = h_lag_LI72;
    }

    public int getH_lag_LI72_EMEP() {
        return _h_lag_LI72_EMEP;
    }

    public void setH_lag_LI72_EMEP(int h_lag_LI72_EMEP) {
        _h_lag_LI72_EMEP = h_lag_LI72_EMEP;
    }

    public float getT_lag_LI72() {
        return _t_lag_LI72;
    }

    public void setT_lag_LI72(float t_lag_LI72) {
        _t_lag_LI72 = t_lag_LI72;
    }

    public int getT_lag_LI72_EMEP() {
        return _t_lag_LI72_EMEP;
    }

    public void setT_lag_LI72_EMEP(int t_lag_LI72_EMEP) {
        _t_lag_LI72_EMEP = t_lag_LI72_EMEP;
    }

    public float getP_lag_LI72() {
        return _p_lag_LI72;
    }

    public void setP_lag_LI72(float p_lag_LI72) {
        _p_lag_LI72 = p_lag_LI72;
    }

    public int getP_lag_LI72_EMEP() {
        return _p_lag_LI72_EMEP;
    }

    public void setP_lag_LI72_EMEP(int p_lag_LI72_EMEP) {
        _p_lag_LI72_EMEP = p_lag_LI72_EMEP;
    }

    public float getH_lag_PICA() {
        return _h_lag_PICA;
    }

    public void setH_lag_PICA(float h_lag_PICA) {
        _h_lag_PICA = h_lag_PICA;
    }

    public int getH_lag_PICA_EMEP() {
        return _h_lag_PICA_EMEP;
    }

    public void setH_lag_PICA_EMEP(int h_lag_PICA_EMEP) {
        _h_lag_PICA_EMEP = h_lag_PICA_EMEP;
    }

    public float getCH4_lag() {
        return _CH4_lag;
    }

    public void setCH4_lag(float CH4_lag) {
        _CH4_lag = CH4_lag;
    }

    public int getCH4_lag_EMEP() {
        return _CH4_lag_EMEP;
    }

    public void setCH4_lag_EMEP(int CH4_lag_EMEP) {
        _CH4_lag_EMEP = CH4_lag_EMEP;
    }

    public int getNspikes_u() {
        return _Nspikes_u;
    }

    public void setNspikes_u(int Nspikes_u) {
        _Nspikes_u = Nspikes_u;
    }

    public int getNspikes_u_EMEP() {
        return _Nspikes_u_EMEP;
    }

    public void setNspikes_u_EMEP(int Nspikes_u_EMEP) {
        _Nspikes_u_EMEP = Nspikes_u_EMEP;
    }

    public int getNspikes_v() {
        return _Nspikes_v;
    }

    public void setNspikes_v(int Nspikes_v) {
        _Nspikes_v = Nspikes_v;
    }

    public int getNspikes_v_EMEP() {
        return _Nspikes_v_EMEP;
    }

    public void setNspikes_v_EMEP(int Nspikes_v_EMEP) {
        _Nspikes_v_EMEP = Nspikes_v_EMEP;
    }

    public int getNspikes_w() {
        return _Nspikes_w;
    }

    public void setNspikes_w(int Nspikes_w) {
        _Nspikes_w = Nspikes_w;
    }

    public int getNspikes_w_EMEP() {
        return _Nspikes_w_EMEP;
    }

    public void setNspikes_w_EMEP(int Nspikes_w_EMEP) {
        _Nspikes_w_EMEP = Nspikes_w_EMEP;
    }

    public int getNspikes_Ts() {
        return _Nspikes_Ts;
    }

    public void setNspikes_Ts(int Nspikes_Ts) {
        _Nspikes_Ts = Nspikes_Ts;
    }

    public int getNspikes_Ts_EMEP() {
        return _Nspikes_Ts_EMEP;
    }

    public void setNspikes_Ts_EMEP(int Nspikes_Ts_EMEP) {
        _Nspikes_Ts_EMEP = Nspikes_Ts_EMEP;
    }

    public int getNspikes_CO2_LI72() {
        return _Nspikes_CO2_LI72;
    }

    public void setNspikes_CO2_LI72(int Nspikes_CO2_LI72) {
        _Nspikes_CO2_LI72 = Nspikes_CO2_LI72;
    }

    public int getNspikes_CO2_LI72_EMEP() {
        return _Nspikes_CO2_LI72_EMEP;
    }

    public void setNspikes_CO2_LI72_EMEP(int Nspikes_CO2_LI72_EMEP) {
        _Nspikes_CO2_LI72_EMEP = Nspikes_CO2_LI72_EMEP;
    }

    public int getNspikes_H2O_LI72() {
        return _Nspikes_H2O_LI72;
    }

    public void setNspikes_H2O_LI72(int Nspikes_H2O_LI72) {
        _Nspikes_H2O_LI72 = Nspikes_H2O_LI72;
    }

    public int getNspikes_H2O_LI72_EMEP() {
        return _Nspikes_H2O_LI72_EMEP;
    }

    public void setNspikes_H2O_LI72_EMEP(int Nspikes_H2O_LI72_EMEP) {
        _Nspikes_H2O_LI72_EMEP = Nspikes_H2O_LI72_EMEP;
    }

    public int getNspikes_T_C_LI72() {
        return _Nspikes_T_C_LI72;
    }

    public void setNspikes_T_C_LI72(int Nspikes_T_C_LI72) {
        _Nspikes_T_C_LI72 = Nspikes_T_C_LI72;
    }

    public int getNspikes_T_C_LI72_EMEP() {
        return _Nspikes_T_C_LI72_EMEP;
    }

    public void setNspikes_T_C_LI72_EMEP(int Nspikes_T_C_LI72_EMEP) {
        _Nspikes_T_C_LI72_EMEP = Nspikes_T_C_LI72_EMEP;
    }

    public int getNspikes_P_C_LI72() {
        return _Nspikes_P_C_LI72;
    }

    public void setNspikes_P_C_LI72(int Nspikes_P_C_LI72) {
        _Nspikes_P_C_LI72 = Nspikes_P_C_LI72;
    }

    public int getNspikes_P_C_LI72_EMEP() {
        return _Nspikes_P_C_LI72_EMEP;
    }

    public void setNspikes_P_C_LI72_EMEP(int Nspikes_P_C_LI72_EMEP) {
        _Nspikes_P_C_LI72_EMEP = Nspikes_P_C_LI72_EMEP;
    }

    public int getNspikes_H2O_PICA() {
        return _Nspikes_H2O_PICA;
    }

    public void setNspikes_H2O_PICA(int Nspikes_H2O_PICA) {
        _Nspikes_H2O_PICA = Nspikes_H2O_PICA;
    }

    public int getNspikes_H2O_PICA_EMEP() {
        return _Nspikes_H2O_PICA_EMEP;
    }

    public void setNspikes_H2O_PICA_EMEP(int Nspikes_H2O_PICA_EMEP) {
        _Nspikes_H2O_PICA_EMEP = Nspikes_H2O_PICA_EMEP;
    }

    public int getNspikes_CH4_PICA() {
        return _Nspikes_CH4_PICA;
    }

    public void setNspikes_CH4_PICA(int Nspikes_CH4_PICA) {
        _Nspikes_CH4_PICA = Nspikes_CH4_PICA;
    }

    public int getNspikes_CH4_PICA_EMEP() {
        return _Nspikes_CH4_PICA_EMEP;
    }

    public void setNspikes_CH4_PICA_EMEP(int Nspikes_CH4_PICA_EMEP) {
        _Nspikes_CH4_PICA_EMEP = Nspikes_CH4_PICA_EMEP;
    }

    public float getFI_u() {
        return _FI_u;
    }

    public void setFI_u(float FI_u) {
        _FI_u = FI_u;
    }

    public int getFI_u_EMEP() {
        return _FI_u_EMEP;
    }

    public void setFI_u_EMEP(int FI_u_EMEP) {
        _FI_u_EMEP = FI_u_EMEP;
    }

    public float getFI_Ts() {
        return _FI_Ts;
    }

    public void setFI_Ts(float FI_Ts) {
        _FI_Ts = FI_Ts;
    }

    public int getFI_Ts_EMEP() {
        return _FI_Ts_EMEP;
    }

    public void setFI_Ts_EMEP(int FI_Ts_EMEP) {
        _FI_Ts_EMEP = FI_Ts_EMEP;
    }

    public float getFI_CO2_LI72() {
        return _FI_CO2_LI72;
    }

    public void setFI_CO2_LI72(float FI_CO2_LI72) {
        _FI_CO2_LI72 = FI_CO2_LI72;
    }

    public int getFI_CO2_LI72_EMEP() {
        return _FI_CO2_LI72_EMEP;
    }

    public void setFI_CO2_LI72_EMEP(int FI_CO2_LI72_EMEP) {
        _FI_CO2_LI72_EMEP = FI_CO2_LI72_EMEP;
    }

    public float getFI_H2O_LI72() {
        return _FI_H2O_LI72;
    }

    public void setFI_H2O_LI72(float FI_H2O_LI72) {
        _FI_H2O_LI72 = FI_H2O_LI72;
    }

    public int getFI_H2O_LI72_EMEP() {
        return _FI_H2O_LI72_EMEP;
    }

    public void setFI_H2O_LI72_EMEP(int FI_H2O_LI72_EMEP) {
        _FI_H2O_LI72_EMEP = FI_H2O_LI72_EMEP;
    }

    public float getFI_CH4_PICA() {
        return _FI_CH4_PICA;
    }

    public void setFI_CH4_PICA(float FI_CH4_PICA) {
        _FI_CH4_PICA = FI_CH4_PICA;
    }

    public int getFI_CH4_PICA_EMEP() {
        return _FI_CH4_PICA_EMEP;
    }

    public void setFI_CH4_PICA_EMEP(int FI_CH4_PICA_EMEP) {
        _FI_CH4_PICA_EMEP = FI_CH4_PICA_EMEP;
    }

    public float getFI_H2O_PICA() {
        return _FI_H2O_PICA;
    }

    public void setFI_H2O_PICA(float FI_H2O_PICA) {
        _FI_H2O_PICA = FI_H2O_PICA;
    }

    public int getFI_H2O_PICA_EMEP() {
        return _FI_H2O_PICA_EMEP;
    }

    public void setFI_H2O_PICA_EMEP(int FI_H2O_PICA_EMEP) {
        _FI_H2O_PICA_EMEP = FI_H2O_PICA_EMEP;
    }

    public float getFST_u() {
        return _FST_u;
    }

    public void setFST_u(float FST_u) {
        _FST_u = FST_u;
    }

    public int getFST_u_EMEP() {
        return _FST_u_EMEP;
    }

    public void setFST_u_EMEP(int FST_u_EMEP) {
        _FST_u_EMEP = FST_u_EMEP;
    }

    public float getFST_Ts() {
        return _FST_Ts;
    }

    public void setFST_Ts(float FST_Ts) {
        _FST_Ts = FST_Ts;
    }

    public int getFST_Ts_EMEP() {
        return _FST_Ts_EMEP;
    }

    public void setFST_Ts_EMEP(int FST_Ts_EMEP) {
        _FST_Ts_EMEP = FST_Ts_EMEP;
    }

    public float getFST_CO2_LI72() {
        return _FST_CO2_LI72;
    }

    public void setFST_CO2_LI72(float FST_CO2_LI72) {
        _FST_CO2_LI72 = FST_CO2_LI72;
    }

    public int getFST_CO2_LI72_EMEP() {
        return _FST_CO2_LI72_EMEP;
    }

    public void setFST_CO2_LI72_EMEP(int FST_CO2_LI72_EMEP) {
        _FST_CO2_LI72_EMEP = FST_CO2_LI72_EMEP;
    }

    public float getFST_H2O_LI72() {
        return _FST_H2O_LI72;
    }

    public void setFST_H2O_LI72(float FST_H2O_LI72) {
        _FST_H2O_LI72 = FST_H2O_LI72;
    }

    public int getFST_H2O_LI72_EMEP() {
        return _FST_H2O_LI72_EMEP;
    }

    public void setFST_H2O_LI72_EMEP(int FST_H2O_LI72_EMEP) {
        _FST_H2O_LI72_EMEP = FST_H2O_LI72_EMEP;
    }

    public float getFST_CH4_PICA() {
        return _FST_CH4_PICA;
    }

    public void setFST_CH4_PICA(float FST_CH4_PICA) {
        _FST_CH4_PICA = FST_CH4_PICA;
    }

    public int getFST_CH4_PICA_EMEP() {
        return _FST_CH4_PICA_EMEP;
    }

    public void setFST_CH4_PICA_EMEP(int FST_CH4_PICA_EMEP) {
        _FST_CH4_PICA_EMEP = FST_CH4_PICA_EMEP;
    }

    public float getFST_H2O_PICA() {
        return _FST_H2O_PICA;
    }

    public void setFST_H2O_PICA(float FST_H2O_PICA) {
        _FST_H2O_PICA = FST_H2O_PICA;
    }

    public int getFST_H2O_PICA_EMEP() {
        return _FST_H2O_PICA_EMEP;
    }

    public void setFST_H2O_PICA_EMEP(int FST_H2O_PICA_EMEP) {
        _FST_H2O_PICA_EMEP = FST_H2O_PICA_EMEP;
    }

    public float getRFE_u() {
        return _RFE_u;
    }

    public void setRFE_u(float RFE_u) {
        _RFE_u = RFE_u;
    }

    public int getRFE_u_EMEP() {
        return _RFE_u_EMEP;
    }

    public void setRFE_u_EMEP(int RFE_u_EMEP) {
        _RFE_u_EMEP = RFE_u_EMEP;
    }

    public float getRFE_Ts() {
        return _RFE_Ts;
    }

    public void setRFE_Ts(float RFE_Ts) {
        _RFE_Ts = RFE_Ts;
    }

    public int getRFE_Ts_EMEP() {
        return _RFE_Ts_EMEP;
    }

    public void setRFE_Ts_EMEP(int RFE_Ts_EMEP) {
        _RFE_Ts_EMEP = RFE_Ts_EMEP;
    }

    public float getRFE_CO2_LI72() {
        return _RFE_CO2_LI72;
    }

    public void setRFE_CO2_LI72(float RFE_CO2_LI72) {
        _RFE_CO2_LI72 = RFE_CO2_LI72;
    }

    public int getRFE_CO2_LI72_EMEP() {
        return _RFE_CO2_LI72_EMEP;
    }

    public void setRFE_CO2_LI72_EMEP(int RFE_CO2_LI72_EMEP) {
        _RFE_CO2_LI72_EMEP = RFE_CO2_LI72_EMEP;
    }

    public float getRFE_H2O_LI72() {
        return _RFE_H2O_LI72;
    }

    public void setRFE_H2O_LI72(float RFE_H2O_LI72) {
        _RFE_H2O_LI72 = RFE_H2O_LI72;
    }

    public int getRFE_H2O_LI72_EMEP() {
        return _RFE_H2O_LI72_EMEP;
    }

    public void setRFE_H2O_LI72_EMEP(int RFE_H2O_LI72_EMEP) {
        _RFE_H2O_LI72_EMEP = RFE_H2O_LI72_EMEP;
    }

    public float getRFE_CH4_PICA() {
        return _RFE_CH4_PICA;
    }

    public void setRFE_CH4_PICA(float RFE_CH4_PICA) {
        _RFE_CH4_PICA = RFE_CH4_PICA;
    }

    public int getRFE_CH4_PICA_EMEP() {
        return _RFE_CH4_PICA_EMEP;
    }

    public void setRFE_CH4_PICA_EMEP(int RFE_CH4_PICA_EMEP) {
        _RFE_CH4_PICA_EMEP = RFE_CH4_PICA_EMEP;
    }

    public float getRFE_H2O_PICA() {
        return _RFE_H2O_PICA;
    }

    public void setRFE_H2O_PICA(float RFE_H2O_PICA) {
        _RFE_H2O_PICA = RFE_H2O_PICA;
    }

    public int getRFE_H2O_PICA_EMEP() {
        return _RFE_H2O_PICA_EMEP;
    }

    public void setRFE_H2O_PICA_EMEP(int RFE_H2O_PICA_EMEP) {
        _RFE_H2O_PICA_EMEP = RFE_H2O_PICA_EMEP;
    }

    public float getFA_u() {
        return _FA_u;
    }

    public void setFA_u(float FA_u) {
        _FA_u = FA_u;
    }

    public int getFA_u_EMEP() {
        return _FA_u_EMEP;
    }

    public void setFA_u_EMEP(int FA_u_EMEP) {
        _FA_u_EMEP = FA_u_EMEP;
    }

    public float getFA_v() {
        return _FA_v;
    }

    public void setFA_v(float FA_v) {
        _FA_v = FA_v;
    }

    public int getFA_v_EMEP() {
        return _FA_v_EMEP;
    }

    public void setFA_v_EMEP(int FA_v_EMEP) {
        _FA_v_EMEP = FA_v_EMEP;
    }

    public float getFA_Ts() {
        return _FA_Ts;
    }

    public void setFA_Ts(float FA_Ts) {
        _FA_Ts = FA_Ts;
    }

    public int getFA_Ts_EMEP() {
        return _FA_Ts_EMEP;
    }

    public void setFA_Ts_EMEP(int FA_Ts_EMEP) {
        _FA_Ts_EMEP = FA_Ts_EMEP;
    }

    public float getFA_CO2_LI72() {
        return _FA_CO2_LI72;
    }

    public void setFA_CO2_LI72(float FA_CO2_LI72) {
        _FA_CO2_LI72 = FA_CO2_LI72;
    }

    public int getFA_CO2_LI72_EMEP() {
        return _FA_CO2_LI72_EMEP;
    }

    public void setFA_CO2_LI72_EMEP(int FA_CO2_LI72_EMEP) {
        _FA_CO2_LI72_EMEP = FA_CO2_LI72_EMEP;
    }

    public float getFA_H2O_LI72() {
        return _FA_H2O_LI72;
    }

    public void setFA_H2O_LI72(float FA_H2O_LI72) {
        _FA_H2O_LI72 = FA_H2O_LI72;
    }

    public int getFA_H2O_LI72_EMEP() {
        return _FA_H2O_LI72_EMEP;
    }

    public void setFA_H2O_LI72_EMEP(int FA_H2O_LI72_EMEP) {
        _FA_H2O_LI72_EMEP = FA_H2O_LI72_EMEP;
    }

    public float getFA_CH4_PICA() {
        return _FA_CH4_PICA;
    }

    public void setFA_CH4_PICA(float FA_CH4_PICA) {
        _FA_CH4_PICA = FA_CH4_PICA;
    }

    public int getFA_CH4_PICA_EMEP() {
        return _FA_CH4_PICA_EMEP;
    }

    public void setFA_CH4_PICA_EMEP(int FA_CH4_PICA_EMEP) {
        _FA_CH4_PICA_EMEP = FA_CH4_PICA_EMEP;
    }

    public float getFA_H2O_PICA() {
        return _FA_H2O_PICA;
    }

    public void setFA_H2O_PICA(float FA_H2O_PICA) {
        _FA_H2O_PICA = FA_H2O_PICA;
    }

    public int getFA_H2O_PICA_EMEP() {
        return _FA_H2O_PICA_EMEP;
    }

    public void setFA_H2O_PICA_EMEP(int FA_H2O_PICA_EMEP) {
        _FA_H2O_PICA_EMEP = FA_H2O_PICA_EMEP;
    }

    public float getCovsvar_u() {
        return _covsvar_u;
    }

    public void setCovsvar_u(float covsvar_u) {
        _covsvar_u = covsvar_u;
    }

    public int getCovsvar_u_EMEP() {
        return _covsvar_u_EMEP;
    }

    public void setCovsvar_u_EMEP(int covsvar_u_EMEP) {
        _covsvar_u_EMEP = covsvar_u_EMEP;
    }

    public float getCovsvar_v() {
        return _covsvar_v;
    }

    public void setCovsvar_v(float covsvar_v) {
        _covsvar_v = covsvar_v;
    }

    public int getCovsvar_v_EMEP() {
        return _covsvar_v_EMEP;
    }

    public void setCovsvar_v_EMEP(int covsvar_v_EMEP) {
        _covsvar_v_EMEP = covsvar_v_EMEP;
    }

    public float getCovsvar_Ts() {
        return _covsvar_Ts;
    }

    public void setCovsvar_Ts(float covsvar_Ts) {
        _covsvar_Ts = covsvar_Ts;
    }

    public int getCovsvar_Ts_EMEP() {
        return _covsvar_Ts_EMEP;
    }

    public void setCovsvar_Ts_EMEP(int covsvar_Ts_EMEP) {
        _covsvar_Ts_EMEP = covsvar_Ts_EMEP;
    }

    public float getCovsvar_CO2_LI72() {
        return _covsvar_CO2_LI72;
    }

    public void setCovsvar_CO2_LI72(float covsvar_CO2_LI72) {
        _covsvar_CO2_LI72 = covsvar_CO2_LI72;
    }

    public int getCovsvar_CO2_LI72_EMEP() {
        return _covsvar_CO2_LI72_EMEP;
    }

    public void setCovsvar_CO2_LI72_EMEP(int covsvar_CO2_LI72_EMEP) {
        _covsvar_CO2_LI72_EMEP = covsvar_CO2_LI72_EMEP;
    }

    public float getCovsvar_H2O_LI72() {
        return _covsvar_H2O_LI72;
    }

    public void setCovsvar_H2O_LI72(float covsvar_H2O_LI72) {
        _covsvar_H2O_LI72 = covsvar_H2O_LI72;
    }

    public int getCovsvar_H2O_LI72_EMEP() {
        return _covsvar_H2O_LI72_EMEP;
    }

    public void setCovsvar_H2O_LI72_EMEP(int covsvar_H2O_LI72_EMEP) {
        _covsvar_H2O_LI72_EMEP = covsvar_H2O_LI72_EMEP;
    }

    public float getCovsvar_CH4_PICA() {
        return _covsvar_CH4_PICA;
    }

    public void setCovsvar_CH4_PICA(float covsvar_CH4_PICA) {
        _covsvar_CH4_PICA = covsvar_CH4_PICA;
    }

    public int getCovsvar_CH4_PICA_EMEP() {
        return _covsvar_CH4_PICA_EMEP;
    }

    public void setCovsvar_CH4_PICA_EMEP(int covsvar_CH4_PICA_EMEP) {
        _covsvar_CH4_PICA_EMEP = covsvar_CH4_PICA_EMEP;
    }

    public float getCovsvar_H2O_PICA() {
        return _covsvar_H2O_PICA;
    }

    public void setCovsvar_H2O_PICA(float covsvar_H2O_PICA) {
        _covsvar_H2O_PICA = covsvar_H2O_PICA;
    }

    public int getCovsvar_H2O_PICA_EMEP() {
        return _covsvar_H2O_PICA_EMEP;
    }

    public void setCovsvar_H2O_PICA_EMEP(int covsvar_H2O_PICA_EMEP) {
        _covsvar_H2O_PICA_EMEP = covsvar_H2O_PICA_EMEP;
    }

    public float getSKx_u() {
        return _SKx_u;
    }

    public void setSKx_u(float SKx_u) {
        _SKx_u = SKx_u;
    }

    public int getSKx_u_EMEP() {
        return _SKx_u_EMEP;
    }

    public void setSKx_u_EMEP(int SKx_u_EMEP) {
        _SKx_u_EMEP = SKx_u_EMEP;
    }

    public float getSKx_v() {
        return _SKx_v;
    }

    public void setSKx_v(float SKx_v) {
        _SKx_v = SKx_v;
    }

    public int getSKx_v_EMEP() {
        return _SKx_v_EMEP;
    }

    public void setSKx_v_EMEP(int SKx_v_EMEP) {
        _SKx_v_EMEP = SKx_v_EMEP;
    }

    public float getSKx_w() {
        return _SKx_w;
    }

    public void setSKx_w(float SKx_w) {
        _SKx_w = SKx_w;
    }

    public int getSKx_w_EMEP() {
        return _SKx_w_EMEP;
    }

    public void setSKx_w_EMEP(int SKx_w_EMEP) {
        _SKx_w_EMEP = SKx_w_EMEP;
    }

    public float getSKx_Ts() {
        return _SKx_Ts;
    }

    public void setSKx_Ts(float SKx_Ts) {
        _SKx_Ts = SKx_Ts;
    }

    public int getSKx_Ts_EMEP() {
        return _SKx_Ts_EMEP;
    }

    public void setSKx_Ts_EMEP(int SKx_Ts_EMEP) {
        _SKx_Ts_EMEP = SKx_Ts_EMEP;
    }

    public float getSKx_CO2_LI72() {
        return _SKx_CO2_LI72;
    }

    public void setSKx_CO2_LI72(float SKx_CO2_LI72) {
        _SKx_CO2_LI72 = SKx_CO2_LI72;
    }

    public int getSKx_CO2_LI72_EMEP() {
        return _SKx_CO2_LI72_EMEP;
    }

    public void setSKx_CO2_LI72_EMEP(int SKx_CO2_LI72_EMEP) {
        _SKx_CO2_LI72_EMEP = SKx_CO2_LI72_EMEP;
    }

    public float getSKx_H2O_LI72() {
        return _SKx_H2O_LI72;
    }

    public void setSKx_H2O_LI72(float SKx_H2O_LI72) {
        _SKx_H2O_LI72 = SKx_H2O_LI72;
    }

    public int getSKx_H2O_LI72_EMEP() {
        return _SKx_H2O_LI72_EMEP;
    }

    public void setSKx_H2O_LI72_EMEP(int SKx_H2O_LI72_EMEP) {
        _SKx_H2O_LI72_EMEP = SKx_H2O_LI72_EMEP;
    }

    public float getSKx_CH4_PICA() {
        return _SKx_CH4_PICA;
    }

    public void setSKx_CH4_PICA(float SKx_CH4_PICA) {
        _SKx_CH4_PICA = SKx_CH4_PICA;
    }

    public int getSKx_CH4_PICA_EMEP() {
        return _SKx_CH4_PICA_EMEP;
    }

    public void setSKx_CH4_PICA_EMEP(int SKx_CH4_PICA_EMEP) {
        _SKx_CH4_PICA_EMEP = SKx_CH4_PICA_EMEP;
    }

    public float getSKx_H2O_PICA() {
        return _SKx_H2O_PICA;
    }

    public void setSKx_H2O_PICA(float SKx_H2O_PICA) {
        _SKx_H2O_PICA = SKx_H2O_PICA;
    }

    public int getSKx_H2O_PICA_EMEP() {
        return _SKx_H2O_PICA_EMEP;
    }

    public void setSKx_H2O_PICA_EMEP(int SKx_H2O_PICA_EMEP) {
        _SKx_H2O_PICA_EMEP = SKx_H2O_PICA_EMEP;
    }

    public float getKUx_u() {
        return _KUx_u;
    }

    public void setKUx_u(float KUx_u) {
        _KUx_u = KUx_u;
    }

    public int getKUx_u_EMEP() {
        return _KUx_u_EMEP;
    }

    public void setKUx_u_EMEP(int KUx_u_EMEP) {
        _KUx_u_EMEP = KUx_u_EMEP;
    }

    public float getKUx_v() {
        return _KUx_v;
    }

    public void setKUx_v(float KUx_v) {
        _KUx_v = KUx_v;
    }

    public int getKUx_v_EMEP() {
        return _KUx_v_EMEP;
    }

    public void setKUx_v_EMEP(int KUx_v_EMEP) {
        _KUx_v_EMEP = KUx_v_EMEP;
    }

    public float getKUx_w() {
        return _KUx_w;
    }

    public void setKUx_w(float KUx_w) {
        _KUx_w = KUx_w;
    }

    public int getKUx_w_EMEP() {
        return _KUx_w_EMEP;
    }

    public void setKUx_w_EMEP(int KUx_w_EMEP) {
        _KUx_w_EMEP = KUx_w_EMEP;
    }

    public float getKUx_Ts() {
        return _KUx_Ts;
    }

    public void setKUx_Ts(float KUx_Ts) {
        _KUx_Ts = KUx_Ts;
    }

    public int getKUx_Ts_EMEP() {
        return _KUx_Ts_EMEP;
    }

    public void setKUx_Ts_EMEP(int KUx_Ts_EMEP) {
        _KUx_Ts_EMEP = KUx_Ts_EMEP;
    }

    public float getKUx_CO2_LI72() {
        return _KUx_CO2_LI72;
    }

    public void setKUx_CO2_LI72(float KUx_CO2_LI72) {
        _KUx_CO2_LI72 = KUx_CO2_LI72;
    }

    public int getKUx_CO2_LI72_EMEP() {
        return _KUx_CO2_LI72_EMEP;
    }

    public void setKUx_CO2_LI72_EMEP(int KUx_CO2_LI72_EMEP) {
        _KUx_CO2_LI72_EMEP = KUx_CO2_LI72_EMEP;
    }

    public float getKUx_H2O_LI72() {
        return _KUx_H2O_LI72;
    }

    public void setKUx_H2O_LI72(float KUx_H2O_LI72) {
        _KUx_H2O_LI72 = KUx_H2O_LI72;
    }

    public int getKUx_H2O_LI72_EMEP() {
        return _KUx_H2O_LI72_EMEP;
    }

    public void setKUx_H2O_LI72_EMEP(int KUx_H2O_LI72_EMEP) {
        _KUx_H2O_LI72_EMEP = KUx_H2O_LI72_EMEP;
    }

    public float getKUx_CH4_PICA() {
        return _KUx_CH4_PICA;
    }

    public void setKUx_CH4_PICA(float KUx_CH4_PICA) {
        _KUx_CH4_PICA = KUx_CH4_PICA;
    }

    public int getKUx_CH4_PICA_EMEP() {
        return _KUx_CH4_PICA_EMEP;
    }

    public void setKUx_CH4_PICA_EMEP(int KUx_CH4_PICA_EMEP) {
        _KUx_CH4_PICA_EMEP = KUx_CH4_PICA_EMEP;
    }

    public float getKUx_H2O_PICA() {
        return _KUx_H2O_PICA;
    }

    public void setKUx_H2O_PICA(float KUx_H2O_PICA) {
        _KUx_H2O_PICA = KUx_H2O_PICA;
    }

    public int getKUx_H2O_PICA_EMEP() {
        return _KUx_H2O_PICA_EMEP;
    }

    public void setKUx_H2O_PICA_EMEP(int KUx_H2O_PICA_EMEP) {
        _KUx_H2O_PICA_EMEP = KUx_H2O_PICA_EMEP;
    }

    public int getOverall_qflag_u() {
        return _overall_qflag_u;
    }

    public void setOverall_qflag_u(int overall_qflag_u) {
        _overall_qflag_u = overall_qflag_u;
    }

    public int getOverall_qflag_u_EMEP() {
        return _overall_qflag_u_EMEP;
    }

    public void setOverall_qflag_u_EMEP(int overall_qflag_u_EMEP) {
        _overall_qflag_u_EMEP = overall_qflag_u_EMEP;
    }

    public int getOverall_qflag_Ts() {
        return _overall_qflag_Ts;
    }

    public void setOverall_qflag_Ts(int overall_qflag_Ts) {
        _overall_qflag_Ts = overall_qflag_Ts;
    }

    public int getOverall_qflag_Ts_EMEP() {
        return _overall_qflag_Ts_EMEP;
    }

    public void setOverall_qflag_Ts_EMEP(int overall_qflag_Ts_EMEP) {
        _overall_qflag_Ts_EMEP = overall_qflag_Ts_EMEP;
    }

    public int getOverall_qflag_CO2_LI72() {
        return _overall_qflag_CO2_LI72;
    }

    public void setOverall_qflag_CO2_LI72(int overall_qflag_CO2_LI72) {
        _overall_qflag_CO2_LI72 = overall_qflag_CO2_LI72;
    }

    public int getOverall_qflag_CO2_LI72_EMEP() {
        return _overall_qflag_CO2_LI72_EMEP;
    }

    public void setOverall_qflag_CO2_LI72_EMEP(int overall_qflag_CO2_LI72_EMEP) {
        _overall_qflag_CO2_LI72_EMEP = overall_qflag_CO2_LI72_EMEP;
    }

    public int getOverall_qflag_H2O_LI72() {
        return _overall_qflag_H2O_LI72;
    }

    public void setOverall_qflag_H2O_LI72(int overall_qflag_H2O_LI72) {
        _overall_qflag_H2O_LI72 = overall_qflag_H2O_LI72;
    }

    public int getOverall_qflag_H2O_LI72_EMEP() {
        return _overall_qflag_H2O_LI72_EMEP;
    }

    public void setOverall_qflag_H2O_LI72_EMEP(int overall_qflag_H2O_LI72_EMEP) {
        _overall_qflag_H2O_LI72_EMEP = overall_qflag_H2O_LI72_EMEP;
    }

    public int getOverall_qflag_CH4_PICA() {
        return _overall_qflag_CH4_PICA;
    }

    public void setOverall_qflag_CH4_PICA(int overall_qflag_CH4_PICA) {
        _overall_qflag_CH4_PICA = overall_qflag_CH4_PICA;
    }

    public int getOverall_qflag_CH4_PICA_EMEP() {
        return _overall_qflag_CH4_PICA_EMEP;
    }

    public void setOverall_qflag_CH4_PICA_EMEP(int overall_qflag_CH4_PICA_EMEP) {
        _overall_qflag_CH4_PICA_EMEP = overall_qflag_CH4_PICA_EMEP;
    }

    public int getOverall_qflag_H2O_PICA() {
        return _overall_qflag_H2O_PICA;
    }

    public void setOverall_qflag_H2O_PICA(int overall_qflag_H2O_PICA) {
        _overall_qflag_H2O_PICA = overall_qflag_H2O_PICA;
    }

    public int getOverall_qflag_H2O_PICA_EMEP() {
        return _overall_qflag_H2O_PICA_EMEP;
    }

    public void setOverall_qflag_H2O_PICA_EMEP(int overall_qflag_H2O_PICA_EMEP) {
        _overall_qflag_H2O_PICA_EMEP = overall_qflag_H2O_PICA_EMEP;
    }

    public int getITC_qflag_w() {
        return _ITC_qflag_w;
    }

    public void setITC_qflag_w(int ITC_qflag_w) {
        _ITC_qflag_w = ITC_qflag_w;
    }

    public int getITC_qflag_w_EMEP() {
        return _ITC_qflag_w_EMEP;
    }

    public void setITC_qflag_w_EMEP(int ITC_qflag_w_EMEP) {
        _ITC_qflag_w_EMEP = ITC_qflag_w_EMEP;
    }

    public int getITC_qflag_u() {
        return _ITC_qflag_u;
    }

    public void setITC_qflag_u(int ITC_qflag_u) {
        _ITC_qflag_u = ITC_qflag_u;
    }

    public int getITC_qflag_u_EMEP() {
        return _ITC_qflag_u_EMEP;
    }

    public void setITC_qflag_u_EMEP(int ITC_qflag_u_EMEP) {
        _ITC_qflag_u_EMEP = ITC_qflag_u_EMEP;
    }

    public int getITC_qflag_Ts() {
        return _ITC_qflag_Ts;
    }

    public void setITC_qflag_Ts(int ITC_qflag_Ts) {
        _ITC_qflag_Ts = ITC_qflag_Ts;
    }

    public int getITC_qflag_Ts_EMEP() {
        return _ITC_qflag_Ts_EMEP;
    }

    public void setITC_qflag_Ts_EMEP(int ITC_qflag_Ts_EMEP) {
        _ITC_qflag_Ts_EMEP = ITC_qflag_Ts_EMEP;
    }

    public int getITC_qflag_CO2_LI72() {
        return _ITC_qflag_CO2_LI72;
    }

    public void setITC_qflag_CO2_LI72(int ITC_qflag_CO2_LI72) {
        _ITC_qflag_CO2_LI72 = ITC_qflag_CO2_LI72;
    }

    public int getITC_qflag_CO2_LI72_EMEP() {
        return _ITC_qflag_CO2_LI72_EMEP;
    }

    public void setITC_qflag_CO2_LI72_EMEP(int ITC_qflag_CO2_LI72_EMEP) {
        _ITC_qflag_CO2_LI72_EMEP = ITC_qflag_CO2_LI72_EMEP;
    }

    public int getITC_qflag_H2O_LI72() {
        return _ITC_qflag_H2O_LI72;
    }

    public void setITC_qflag_H2O_LI72(int ITC_qflag_H2O_LI72) {
        _ITC_qflag_H2O_LI72 = ITC_qflag_H2O_LI72;
    }

    public int getITC_qflag_H2O_LI72_EMEP() {
        return _ITC_qflag_H2O_LI72_EMEP;
    }

    public void setITC_qflag_H2O_LI72_EMEP(int ITC_qflag_H2O_LI72_EMEP) {
        _ITC_qflag_H2O_LI72_EMEP = ITC_qflag_H2O_LI72_EMEP;
    }

    public int getITC_qflag_CH4_PICA() {
        return _ITC_qflag_CH4_PICA;
    }

    public void setITC_qflag_CH4_PICA(int ITC_qflag_CH4_PICA) {
        _ITC_qflag_CH4_PICA = ITC_qflag_CH4_PICA;
    }

    public int getITC_qflag_CH4_PICA_EMEP() {
        return _ITC_qflag_CH4_PICA_EMEP;
    }

    public void setITC_qflag_CH4_PICA_EMEP(int ITC_qflag_CH4_PICA_EMEP) {
        _ITC_qflag_CH4_PICA_EMEP = ITC_qflag_CH4_PICA_EMEP;
    }

    public int getITC_qflag_H2O_PICA() {
        return _ITC_qflag_H2O_PICA;
    }

    public void setITC_qflag_H2O_PICA(int ITC_qflag_H2O_PICA) {
        _ITC_qflag_H2O_PICA = ITC_qflag_H2O_PICA;
    }

    public int getITC_qflag_H2O_PICA_EMEP() {
        return _ITC_qflag_H2O_PICA_EMEP;
    }

    public void setITC_qflag_H2O_PICA_EMEP(int ITC_qflag_H2O_PICA_EMEP) {
        _ITC_qflag_H2O_PICA_EMEP = ITC_qflag_H2O_PICA_EMEP;
    }

    public int getFST_qflag_u() {
        return _FST_qflag_u;
    }

    public void setFST_qflag_u(int FST_qflag_u) {
        _FST_qflag_u = FST_qflag_u;
    }

    public int getFST_qflag_u_EMEP() {
        return _FST_qflag_u_EMEP;
    }

    public void setFST_qflag_u_EMEP(int FST_qflag_u_EMEP) {
        _FST_qflag_u_EMEP = FST_qflag_u_EMEP;
    }

    public int getFST_qflag_Ts() {
        return _FST_qflag_Ts;
    }

    public void setFST_qflag_Ts(int FST_qflag_Ts) {
        _FST_qflag_Ts = FST_qflag_Ts;
    }

    public int getFST_qflag_Ts_EMEP() {
        return _FST_qflag_Ts_EMEP;
    }

    public void setFST_qflag_Ts_EMEP(int FST_qflag_Ts_EMEP) {
        _FST_qflag_Ts_EMEP = FST_qflag_Ts_EMEP;
    }

    public int getFST_qflag_CO2_LI72() {
        return _FST_qflag_CO2_LI72;
    }

    public void setFST_qflag_CO2_LI72(int FST_qflag_CO2_LI72) {
        _FST_qflag_CO2_LI72 = FST_qflag_CO2_LI72;
    }

    public int getFST_qflag_CO2_LI72_EMEP() {
        return _FST_qflag_CO2_LI72_EMEP;
    }

    public void setFST_qflag_CO2_LI72_EMEP(int FST_qflag_CO2_LI72_EMEP) {
        _FST_qflag_CO2_LI72_EMEP = FST_qflag_CO2_LI72_EMEP;
    }

    public int getFST_qflag_H2O_LI72() {
        return _FST_qflag_H2O_LI72;
    }

    public void setFST_qflag_H2O_LI72(int FST_qflag_H2O_LI72) {
        _FST_qflag_H2O_LI72 = FST_qflag_H2O_LI72;
    }

    public int getFST_qflag_H2O_LI72_EMEP() {
        return _FST_qflag_H2O_LI72_EMEP;
    }

    public void setFST_qflag_H2O_LI72_EMEP(int FST_qflag_H2O_LI72_EMEP) {
        _FST_qflag_H2O_LI72_EMEP = FST_qflag_H2O_LI72_EMEP;
    }

    public int getFST_qflag_CH4_PICA() {
        return _FST_qflag_CH4_PICA;
    }

    public void setFST_qflag_CH4_PICA(int FST_qflag_CH4_PICA) {
        _FST_qflag_CH4_PICA = FST_qflag_CH4_PICA;
    }

    public int getFST_qflag_CH4_PICA_EMEP() {
        return _FST_qflag_CH4_PICA_EMEP;
    }

    public void setFST_qflag_CH4_PICA_EMEP(int FST_qflag_CH4_PICA_EMEP) {
        _FST_qflag_CH4_PICA_EMEP = FST_qflag_CH4_PICA_EMEP;
    }

    public int getFST_qflag_H2O_PICA() {
        return _FST_qflag_H2O_PICA;
    }

    public void setFST_qflag_H2O_PICA(int FST_qflag_H2O_PICA) {
        _FST_qflag_H2O_PICA = FST_qflag_H2O_PICA;
    }

    public int getFST_qflag_H2O_PICA_EMEP() {
        return _FST_qflag_H2O_PICA_EMEP;
    }

    public void setFST_qflag_H2O_PICA_EMEP(int FST_qflag_H2O_PICA_EMEP) {
        _FST_qflag_H2O_PICA_EMEP = FST_qflag_H2O_PICA_EMEP;
    }

    public float getHm_u() {
        return _Hm_u;
    }

    public void setHm_u(float Hm_u) {
        _Hm_u = Hm_u;
    }

    public int getHm_u_EMEP() {
        return _Hm_u_EMEP;
    }

    public void setHm_u_EMEP(int Hm_u_EMEP) {
        _Hm_u_EMEP = Hm_u_EMEP;
    }

    public float getHm_Ts() {
        return _Hm_Ts;
    }

    public void setHm_Ts(float Hm_Ts) {
        _Hm_Ts = Hm_Ts;
    }

    public int getHm_Ts_EMEP() {
        return _Hm_Ts_EMEP;
    }

    public void setHm_Ts_EMEP(int Hm_Ts_EMEP) {
        _Hm_Ts_EMEP = Hm_Ts_EMEP;
    }

    public float getHm_CO2_LI72() {
        return _Hm_CO2_LI72;
    }

    public void setHm_CO2_LI72(float Hm_CO2_LI72) {
        _Hm_CO2_LI72 = Hm_CO2_LI72;
    }

    public int getHm_CO2_LI72_EMEP() {
        return _Hm_CO2_LI72_EMEP;
    }

    public void setHm_CO2_LI72_EMEP(int Hm_CO2_LI72_EMEP) {
        _Hm_CO2_LI72_EMEP = Hm_CO2_LI72_EMEP;
    }

    public float getHm_H2O_LI72() {
        return _Hm_H2O_LI72;
    }

    public void setHm_H2O_LI72(float Hm_H2O_LI72) {
        _Hm_H2O_LI72 = Hm_H2O_LI72;
    }

    public int getHm_H2O_LI72_EMEP() {
        return _Hm_H2O_LI72_EMEP;
    }

    public void setHm_H2O_LI72_EMEP(int Hm_H2O_LI72_EMEP) {
        _Hm_H2O_LI72_EMEP = Hm_H2O_LI72_EMEP;
    }

    public float getHm_CH4_PICA() {
        return _Hm_CH4_PICA;
    }

    public void setHm_CH4_PICA(float Hm_CH4_PICA) {
        _Hm_CH4_PICA = Hm_CH4_PICA;
    }

    public int getHm_CH4_PICA_EMEP() {
        return _Hm_CH4_PICA_EMEP;
    }

    public void setHm_CH4_PICA_EMEP(int Hm_CH4_PICA_EMEP) {
        _Hm_CH4_PICA_EMEP = Hm_CH4_PICA_EMEP;
    }

    public float getHm_H2O_PICA() {
        return _Hm_H2O_PICA;
    }

    public void setHm_H2O_PICA(float Hm_H2O_PICA) {
        _Hm_H2O_PICA = Hm_H2O_PICA;
    }

    public int getHm_H2O_PICA_EMEP() {
        return _Hm_H2O_PICA_EMEP;
    }

    public void setHm_H2O_PICA_EMEP(int Hm_H2O_PICA_EMEP) {
        _Hm_H2O_PICA_EMEP = Hm_H2O_PICA_EMEP;
    }

    public float getHv_u() {
        return _Hv_u;
    }

    public void setHv_u(float Hv_u) {
        _Hv_u = Hv_u;
    }

    public int getHv_u_EMEP() {
        return _Hv_u_EMEP;
    }

    public void setHv_u_EMEP(int Hv_u_EMEP) {
        _Hv_u_EMEP = Hv_u_EMEP;
    }

    public float getHv_Ts() {
        return _Hv_Ts;
    }

    public void setHv_Ts(float Hv_Ts) {
        _Hv_Ts = Hv_Ts;
    }

    public int getHv_Ts_EMEP() {
        return _Hv_Ts_EMEP;
    }

    public void setHv_Ts_EMEP(int Hv_Ts_EMEP) {
        _Hv_Ts_EMEP = Hv_Ts_EMEP;
    }

    public float getHv_CO2_LI72() {
        return _Hv_CO2_LI72;
    }

    public void setHv_CO2_LI72(float Hv_CO2_LI72) {
        _Hv_CO2_LI72 = Hv_CO2_LI72;
    }

    public int getHv_CO2_LI72_EMEP() {
        return _Hv_CO2_LI72_EMEP;
    }

    public void setHv_CO2_LI72_EMEP(int Hv_CO2_LI72_EMEP) {
        _Hv_CO2_LI72_EMEP = Hv_CO2_LI72_EMEP;
    }

    public float getHv_H2O_LI72() {
        return _Hv_H2O_LI72;
    }

    public void setHv_H2O_LI72(float Hv_H2O_LI72) {
        _Hv_H2O_LI72 = Hv_H2O_LI72;
    }

    public int getHv_H2O_LI72_EMEP() {
        return _Hv_H2O_LI72_EMEP;
    }

    public void setHv_H2O_LI72_EMEP(int Hv_H2O_LI72_EMEP) {
        _Hv_H2O_LI72_EMEP = Hv_H2O_LI72_EMEP;
    }

    public float getHv_CH4_PICA() {
        return _Hv_CH4_PICA;
    }

    public void setHv_CH4_PICA(float Hv_CH4_PICA) {
        _Hv_CH4_PICA = Hv_CH4_PICA;
    }

    public int getHv_CH4_PICA_EMEP() {
        return _Hv_CH4_PICA_EMEP;
    }

    public void setHv_CH4_PICA_EMEP(int Hv_CH4_PICA_EMEP) {
        _Hv_CH4_PICA_EMEP = Hv_CH4_PICA_EMEP;
    }

    public float getHv_H2O_PICA() {
        return _Hv_H2O_PICA;
    }

    public void setHv_H2O_PICA(float Hv_H2O_PICA) {
        _Hv_H2O_PICA = Hv_H2O_PICA;
    }

    public int getHv_H2O_PICA_EMEP() {
        return _Hv_H2O_PICA_EMEP;
    }

    public void setHv_H2O_PICA_EMEP(int Hv_H2O_PICA_EMEP) {
        _Hv_H2O_PICA_EMEP = Hv_H2O_PICA_EMEP;
    }

    public float getFpr_x_peak() {
        return _fpr_x_peak;
    }

    public void setFpr_x_peak(float fpr_x_peak) {
        _fpr_x_peak = fpr_x_peak;
    }

    public int getFpr_x_peak_EMEP() {
        return _fpr_x_peak_EMEP;
    }

    public void setFpr_x_peak_EMEP(int fpr_x_peak_EMEP) {
        _fpr_x_peak_EMEP = fpr_x_peak_EMEP;
    }

    public float getFpr_x_80() {
        return _fpr_x_80;
    }

    public void setFpr_x_80(float fpr_x_80) {
        _fpr_x_80 = fpr_x_80;
    }

    public int getFpr_x_80_EMEP() {
        return _fpr_x_80_EMEP;
    }

    public void setFpr_x_80_EMEP(int fpr_x_80_EMEP) {
        _fpr_x_80_EMEP = fpr_x_80_EMEP;
    }
}
