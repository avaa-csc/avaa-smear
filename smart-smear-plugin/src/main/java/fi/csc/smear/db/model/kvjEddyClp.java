package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.kvjEddyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class kvjEddyClp extends BaseModelImpl<kvjEddy> implements kvjEddy {
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
    private BaseModel<?> _kvjEddyRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public kvjEddyClp() {
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

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_kvjEddyRemoteModel, samptime);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH", float.class);

                method.invoke(_kvjEddyRemoteModel, H);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, H_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H() {
        return _Qc_H;
    }

    @Override
    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau", float.class);

                method.invoke(_kvjEddyRemoteModel, tau);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, tau_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau() {
        return _Qc_tau;
    }

    @Override
    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_tau);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_tau_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star", float.class);

                method.invoke(_kvjEddyRemoteModel, u_star);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, u_star_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length", float.class);

                method.invoke(_kvjEddyRemoteModel, MO_length);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, MO_length_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet() {
        return _err_packet;
    }

    @Override
    public void setErr_packet(int err_packet) {
        _err_packet = err_packet;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet", int.class);

                method.invoke(_kvjEddyRemoteModel, err_packet);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, err_packet_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CO2_LI72() {
        return _F_CO2_LI72;
    }

    @Override
    public void setF_CO2_LI72(float F_CO2_LI72) {
        _F_CO2_LI72 = F_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, F_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CO2_LI72_EMEP() {
        return _F_CO2_LI72_EMEP;
    }

    @Override
    public void setF_CO2_LI72_EMEP(int F_CO2_LI72_EMEP) {
        _F_CO2_LI72_EMEP = F_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, F_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CO2_LI72() {
        return _Qc_CO2_LI72;
    }

    @Override
    public void setQc_CO2_LI72(int Qc_CO2_LI72) {
        _Qc_CO2_LI72 = Qc_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CO2_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CO2_LI72_EMEP() {
        return _Qc_CO2_LI72_EMEP;
    }

    @Override
    public void setQc_CO2_LI72_EMEP(int Qc_CO2_LI72_EMEP) {
        _Qc_CO2_LI72_EMEP = Qc_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CH4_PICA() {
        return _F_CH4_PICA;
    }

    @Override
    public void setF_CH4_PICA(float F_CH4_PICA) {
        _F_CH4_PICA = F_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, F_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CH4_PICA_EMEP() {
        return _F_CH4_PICA_EMEP;
    }

    @Override
    public void setF_CH4_PICA_EMEP(int F_CH4_PICA_EMEP) {
        _F_CH4_PICA_EMEP = F_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, F_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CH4_PICA() {
        return _Qc_CH4_PICA;
    }

    @Override
    public void setQc_CH4_PICA(int Qc_CH4_PICA) {
        _Qc_CH4_PICA = Qc_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CH4_PICA", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CH4_PICA_EMEP() {
        return _Qc_CH4_PICA_EMEP;
    }

    @Override
    public void setQc_CH4_PICA_EMEP(int Qc_CH4_PICA_EMEP) {
        _Qc_CH4_PICA_EMEP = Qc_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_LI72() {
        return _F_H2O_LI72;
    }

    @Override
    public void setF_H2O_LI72(float F_H2O_LI72) {
        _F_H2O_LI72 = F_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, F_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_LI72_EMEP() {
        return _F_H2O_LI72_EMEP;
    }

    @Override
    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP) {
        _F_H2O_LI72_EMEP = F_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, F_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H2O_LI72() {
        return _Qc_H2O_LI72;
    }

    @Override
    public void setQc_H2O_LI72(int Qc_H2O_LI72) {
        _Qc_H2O_LI72 = Qc_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H2O_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H2O_LI72_EMEP() {
        return _Qc_H2O_LI72_EMEP;
    }

    @Override
    public void setQc_H2O_LI72_EMEP(int Qc_H2O_LI72_EMEP) {
        _Qc_H2O_LI72_EMEP = Qc_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_PICA() {
        return _F_H2O_PICA;
    }

    @Override
    public void setF_H2O_PICA(float F_H2O_PICA) {
        _F_H2O_PICA = F_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, F_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_PICA_EMEP() {
        return _F_H2O_PICA_EMEP;
    }

    @Override
    public void setF_H2O_PICA_EMEP(int F_H2O_PICA_EMEP) {
        _F_H2O_PICA_EMEP = F_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, F_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H2O_PICA() {
        return _Qc_H2O_PICA;
    }

    @Override
    public void setQc_H2O_PICA(int Qc_H2O_PICA) {
        _Qc_H2O_PICA = Qc_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H2O_PICA", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H2O_PICA_EMEP() {
        return _Qc_H2O_PICA_EMEP;
    }

    @Override
    public void setQc_H2O_PICA_EMEP(int Qc_H2O_PICA_EMEP) {
        _Qc_H2O_PICA_EMEP = Qc_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Qc_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_LI72() {
        return _LE_LI72;
    }

    @Override
    public void setLE_LI72(float LE_LI72) {
        _LE_LI72 = LE_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, LE_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_LI72_EMEP() {
        return _LE_LI72_EMEP;
    }

    @Override
    public void setLE_LI72_EMEP(int LE_LI72_EMEP) {
        _LE_LI72_EMEP = LE_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, LE_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_PICA() {
        return _LE_PICA;
    }

    @Override
    public void setLE_PICA(float LE_PICA) {
        _LE_PICA = LE_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, LE_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_PICA_EMEP() {
        return _LE_PICA_EMEP;
    }

    @Override
    public void setLE_PICA_EMEP(int LE_PICA_EMEP) {
        _LE_PICA_EMEP = LE_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, LE_PICA_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU", float.class);

                method.invoke(_kvjEddyRemoteModel, U);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, U_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir", float.class);

                method.invoke(_kvjEddyRemoteModel, wind_dir);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, wind_dir_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u", float.class);

                method.invoke(_kvjEddyRemoteModel, av_u);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_u_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v", float.class);

                method.invoke(_kvjEddyRemoteModel, av_v);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_v_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w", float.class);

                method.invoke(_kvjEddyRemoteModel, av_w);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_w_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t", float.class);

                method.invoke(_kvjEddyRemoteModel, av_t);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_t_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_t_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c_LI72() {
        return _av_c_LI72;
    }

    @Override
    public void setAv_c_LI72(float av_c_LI72) {
        _av_c_LI72 = av_c_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, av_c_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_LI72_EMEP() {
        return _av_c_LI72_EMEP;
    }

    @Override
    public void setAv_c_LI72_EMEP(int av_c_LI72_EMEP) {
        _av_c_LI72_EMEP = av_c_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_c_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h_LI72() {
        return _av_h_LI72;
    }

    @Override
    public void setAv_h_LI72(float av_h_LI72) {
        _av_h_LI72 = av_h_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, av_h_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_LI72_EMEP() {
        return _av_h_LI72_EMEP;
    }

    @Override
    public void setAv_h_LI72_EMEP(int av_h_LI72_EMEP) {
        _av_h_LI72_EMEP = av_h_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_h_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_h_PICA() {
        return _av_h_PICA;
    }

    @Override
    public void setAv_h_PICA(float av_h_PICA) {
        _av_h_PICA = av_h_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, av_h_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_h_PICA_EMEP() {
        return _av_h_PICA_EMEP;
    }

    @Override
    public void setAv_h_PICA_EMEP(int av_h_PICA_EMEP) {
        _av_h_PICA_EMEP = av_h_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_h_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_h_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_CH4() {
        return _av_CH4;
    }

    @Override
    public void setAv_CH4(float av_CH4) {
        _av_CH4 = av_CH4;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CH4", float.class);

                method.invoke(_kvjEddyRemoteModel, av_CH4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_CH4_EMEP() {
        return _av_CH4_EMEP;
    }

    @Override
    public void setAv_CH4_EMEP(int av_CH4_EMEP) {
        _av_CH4_EMEP = av_CH4_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CH4_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, av_CH4_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u", float.class);

                method.invoke(_kvjEddyRemoteModel, std_u);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_u_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v", float.class);

                method.invoke(_kvjEddyRemoteModel, std_v);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_v_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w", float.class);

                method.invoke(_kvjEddyRemoteModel, std_w);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_w_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t", float.class);

                method.invoke(_kvjEddyRemoteModel, std_t);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_t_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_t_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c_LI72() {
        return _std_c_LI72;
    }

    @Override
    public void setStd_c_LI72(float std_c_LI72) {
        _std_c_LI72 = std_c_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, std_c_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_LI72_EMEP() {
        return _std_c_LI72_EMEP;
    }

    @Override
    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP) {
        _std_c_LI72_EMEP = std_c_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_c_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h_LI72() {
        return _std_h_LI72;
    }

    @Override
    public void setStd_h_LI72(float std_h_LI72) {
        _std_h_LI72 = std_h_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, std_h_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_LI72_EMEP() {
        return _std_h_LI72_EMEP;
    }

    @Override
    public void setStd_h_LI72_EMEP(int std_h_LI72_EMEP) {
        _std_h_LI72_EMEP = std_h_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_h_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_h_PICA() {
        return _std_h_PICA;
    }

    @Override
    public void setStd_h_PICA(float std_h_PICA) {
        _std_h_PICA = std_h_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, std_h_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_h_PICA_EMEP() {
        return _std_h_PICA_EMEP;
    }

    @Override
    public void setStd_h_PICA_EMEP(int std_h_PICA_EMEP) {
        _std_h_PICA_EMEP = std_h_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_h_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_h_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_CH4() {
        return _std_CH4;
    }

    @Override
    public void setStd_CH4(float std_CH4) {
        _std_CH4 = std_CH4;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CH4", float.class);

                method.invoke(_kvjEddyRemoteModel, std_CH4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_CH4_EMEP() {
        return _std_CH4_EMEP;
    }

    @Override
    public void setStd_CH4_EMEP(int std_CH4_EMEP) {
        _std_CH4_EMEP = std_CH4_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CH4_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, std_CH4_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getEta() {
        return _eta;
    }

    @Override
    public void setEta(float eta) {
        _eta = eta;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setEta", float.class);

                method.invoke(_kvjEddyRemoteModel, eta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, eta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTheta() {
        return _theta;
    }

    @Override
    public void setTheta(float theta) {
        _theta = theta;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta", float.class);

                method.invoke(_kvjEddyRemoteModel, theta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, theta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBeta() {
        return _beta;
    }

    @Override
    public void setBeta(float beta) {
        _beta = beta;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta", float.class);

                method.invoke(_kvjEddyRemoteModel, beta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, beta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_u() {
        return _Covs_u;
    }

    @Override
    public void setCovs_u(float Covs_u) {
        _Covs_u = Covs_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_u", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_u_EMEP() {
        return _Covs_u_EMEP;
    }

    @Override
    public void setCovs_u_EMEP(int Covs_u_EMEP) {
        _Covs_u_EMEP = Covs_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_v() {
        return _Covs_v;
    }

    @Override
    public void setCovs_v(float Covs_v) {
        _Covs_v = Covs_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_v", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_v_EMEP() {
        return _Covs_v_EMEP;
    }

    @Override
    public void setCovs_v_EMEP(int Covs_v_EMEP) {
        _Covs_v_EMEP = Covs_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_Ts() {
        return _Covs_Ts;
    }

    @Override
    public void setCovs_Ts(float Covs_Ts) {
        _Covs_Ts = Covs_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_Ts_EMEP() {
        return _Covs_Ts_EMEP;
    }

    @Override
    public void setCovs_Ts_EMEP(int Covs_Ts_EMEP) {
        _Covs_Ts_EMEP = Covs_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_CO2_LI72() {
        return _Covs_CO2_LI72;
    }

    @Override
    public void setCovs_CO2_LI72(float Covs_CO2_LI72) {
        _Covs_CO2_LI72 = Covs_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_CO2_LI72_EMEP() {
        return _Covs_CO2_LI72_EMEP;
    }

    @Override
    public void setCovs_CO2_LI72_EMEP(int Covs_CO2_LI72_EMEP) {
        _Covs_CO2_LI72_EMEP = Covs_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_H2O_LI72() {
        return _Covs_H2O_LI72;
    }

    @Override
    public void setCovs_H2O_LI72(float Covs_H2O_LI72) {
        _Covs_H2O_LI72 = Covs_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_H2O_LI72_EMEP() {
        return _Covs_H2O_LI72_EMEP;
    }

    @Override
    public void setCovs_H2O_LI72_EMEP(int Covs_H2O_LI72_EMEP) {
        _Covs_H2O_LI72_EMEP = Covs_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_T_C_LI72() {
        return _Covs_T_C_LI72;
    }

    @Override
    public void setCovs_T_C_LI72(float Covs_T_C_LI72) {
        _Covs_T_C_LI72 = Covs_T_C_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_T_C_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_T_C_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_T_C_LI72_EMEP() {
        return _Covs_T_C_LI72_EMEP;
    }

    @Override
    public void setCovs_T_C_LI72_EMEP(int Covs_T_C_LI72_EMEP) {
        _Covs_T_C_LI72_EMEP = Covs_T_C_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_T_C_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_T_C_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_P_C_LI72() {
        return _Covs_P_C_LI72;
    }

    @Override
    public void setCovs_P_C_LI72(float Covs_P_C_LI72) {
        _Covs_P_C_LI72 = Covs_P_C_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_P_C_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_P_C_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_P_C_LI72_EMEP() {
        return _Covs_P_C_LI72_EMEP;
    }

    @Override
    public void setCovs_P_C_LI72_EMEP(int Covs_P_C_LI72_EMEP) {
        _Covs_P_C_LI72_EMEP = Covs_P_C_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_P_C_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_P_C_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_H2O_PICA() {
        return _Covs_H2O_PICA;
    }

    @Override
    public void setCovs_H2O_PICA(float Covs_H2O_PICA) {
        _Covs_H2O_PICA = Covs_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_H2O_PICA_EMEP() {
        return _Covs_H2O_PICA_EMEP;
    }

    @Override
    public void setCovs_H2O_PICA_EMEP(int Covs_H2O_PICA_EMEP) {
        _Covs_H2O_PICA_EMEP = Covs_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovs_CH4_PICA() {
        return _Covs_CH4_PICA;
    }

    @Override
    public void setCovs_CH4_PICA(float Covs_CH4_PICA) {
        _Covs_CH4_PICA = Covs_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Covs_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovs_CH4_PICA_EMEP() {
        return _Covs_CH4_PICA_EMEP;
    }

    @Override
    public void setCovs_CH4_PICA_EMEP(int Covs_CH4_PICA_EMEP) {
        _Covs_CH4_PICA_EMEP = Covs_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovs_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Covs_CH4_PICA_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av", float.class);

                method.invoke(_kvjEddyRemoteModel, licor_t_av);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_av_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, licor_t_av_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av", float.class);

                method.invoke(_kvjEddyRemoteModel, licor_p_av);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_av_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, licor_p_av_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std", float.class);

                method.invoke(_kvjEddyRemoteModel, licor_t_std);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_t_std_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, licor_t_std_EMEP);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std", float.class);

                method.invoke(_kvjEddyRemoteModel, licor_p_std);
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

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLicor_p_std_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, licor_p_std_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getC_lag_LI72() {
        return _c_lag_LI72;
    }

    @Override
    public void setC_lag_LI72(float c_lag_LI72) {
        _c_lag_LI72 = c_lag_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, c_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC_lag_LI72_EMEP() {
        return _c_lag_LI72_EMEP;
    }

    @Override
    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP) {
        _c_lag_LI72_EMEP = c_lag_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, c_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_lag_LI72() {
        return _h_lag_LI72;
    }

    @Override
    public void setH_lag_LI72(float h_lag_LI72) {
        _h_lag_LI72 = h_lag_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, h_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_lag_LI72_EMEP() {
        return _h_lag_LI72_EMEP;
    }

    @Override
    public void setH_lag_LI72_EMEP(int h_lag_LI72_EMEP) {
        _h_lag_LI72_EMEP = h_lag_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, h_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_lag_LI72() {
        return _t_lag_LI72;
    }

    @Override
    public void setT_lag_LI72(float t_lag_LI72) {
        _t_lag_LI72 = t_lag_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setT_lag_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, t_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_lag_LI72_EMEP() {
        return _t_lag_LI72_EMEP;
    }

    @Override
    public void setT_lag_LI72_EMEP(int t_lag_LI72_EMEP) {
        _t_lag_LI72_EMEP = t_lag_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setT_lag_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, t_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP_lag_LI72() {
        return _p_lag_LI72;
    }

    @Override
    public void setP_lag_LI72(float p_lag_LI72) {
        _p_lag_LI72 = p_lag_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setP_lag_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, p_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getP_lag_LI72_EMEP() {
        return _p_lag_LI72_EMEP;
    }

    @Override
    public void setP_lag_LI72_EMEP(int p_lag_LI72_EMEP) {
        _p_lag_LI72_EMEP = p_lag_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setP_lag_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, p_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH_lag_PICA() {
        return _h_lag_PICA;
    }

    @Override
    public void setH_lag_PICA(float h_lag_PICA) {
        _h_lag_PICA = h_lag_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, h_lag_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_lag_PICA_EMEP() {
        return _h_lag_PICA_EMEP;
    }

    @Override
    public void setH_lag_PICA_EMEP(int h_lag_PICA_EMEP) {
        _h_lag_PICA_EMEP = h_lag_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_lag_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, h_lag_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCH4_lag() {
        return _CH4_lag;
    }

    @Override
    public void setCH4_lag(float CH4_lag) {
        _CH4_lag = CH4_lag;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4_lag", float.class);

                method.invoke(_kvjEddyRemoteModel, CH4_lag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCH4_lag_EMEP() {
        return _CH4_lag_EMEP;
    }

    @Override
    public void setCH4_lag_EMEP(int CH4_lag_EMEP) {
        _CH4_lag_EMEP = CH4_lag_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4_lag_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, CH4_lag_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_u() {
        return _Nspikes_u;
    }

    @Override
    public void setNspikes_u(int Nspikes_u) {
        _Nspikes_u = Nspikes_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_u", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_u_EMEP() {
        return _Nspikes_u_EMEP;
    }

    @Override
    public void setNspikes_u_EMEP(int Nspikes_u_EMEP) {
        _Nspikes_u_EMEP = Nspikes_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_v() {
        return _Nspikes_v;
    }

    @Override
    public void setNspikes_v(int Nspikes_v) {
        _Nspikes_v = Nspikes_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_v", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_v_EMEP() {
        return _Nspikes_v_EMEP;
    }

    @Override
    public void setNspikes_v_EMEP(int Nspikes_v_EMEP) {
        _Nspikes_v_EMEP = Nspikes_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_w() {
        return _Nspikes_w;
    }

    @Override
    public void setNspikes_w(int Nspikes_w) {
        _Nspikes_w = Nspikes_w;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_w", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_w_EMEP() {
        return _Nspikes_w_EMEP;
    }

    @Override
    public void setNspikes_w_EMEP(int Nspikes_w_EMEP) {
        _Nspikes_w_EMEP = Nspikes_w_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_Ts() {
        return _Nspikes_Ts;
    }

    @Override
    public void setNspikes_Ts(int Nspikes_Ts) {
        _Nspikes_Ts = Nspikes_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_Ts", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_Ts_EMEP() {
        return _Nspikes_Ts_EMEP;
    }

    @Override
    public void setNspikes_Ts_EMEP(int Nspikes_Ts_EMEP) {
        _Nspikes_Ts_EMEP = Nspikes_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_CO2_LI72() {
        return _Nspikes_CO2_LI72;
    }

    @Override
    public void setNspikes_CO2_LI72(int Nspikes_CO2_LI72) {
        _Nspikes_CO2_LI72 = Nspikes_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_CO2_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_CO2_LI72_EMEP() {
        return _Nspikes_CO2_LI72_EMEP;
    }

    @Override
    public void setNspikes_CO2_LI72_EMEP(int Nspikes_CO2_LI72_EMEP) {
        _Nspikes_CO2_LI72_EMEP = Nspikes_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_H2O_LI72() {
        return _Nspikes_H2O_LI72;
    }

    @Override
    public void setNspikes_H2O_LI72(int Nspikes_H2O_LI72) {
        _Nspikes_H2O_LI72 = Nspikes_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_H2O_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_H2O_LI72_EMEP() {
        return _Nspikes_H2O_LI72_EMEP;
    }

    @Override
    public void setNspikes_H2O_LI72_EMEP(int Nspikes_H2O_LI72_EMEP) {
        _Nspikes_H2O_LI72_EMEP = Nspikes_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_T_C_LI72() {
        return _Nspikes_T_C_LI72;
    }

    @Override
    public void setNspikes_T_C_LI72(int Nspikes_T_C_LI72) {
        _Nspikes_T_C_LI72 = Nspikes_T_C_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_T_C_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_T_C_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_T_C_LI72_EMEP() {
        return _Nspikes_T_C_LI72_EMEP;
    }

    @Override
    public void setNspikes_T_C_LI72_EMEP(int Nspikes_T_C_LI72_EMEP) {
        _Nspikes_T_C_LI72_EMEP = Nspikes_T_C_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_T_C_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_T_C_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_P_C_LI72() {
        return _Nspikes_P_C_LI72;
    }

    @Override
    public void setNspikes_P_C_LI72(int Nspikes_P_C_LI72) {
        _Nspikes_P_C_LI72 = Nspikes_P_C_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_P_C_LI72", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_P_C_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_P_C_LI72_EMEP() {
        return _Nspikes_P_C_LI72_EMEP;
    }

    @Override
    public void setNspikes_P_C_LI72_EMEP(int Nspikes_P_C_LI72_EMEP) {
        _Nspikes_P_C_LI72_EMEP = Nspikes_P_C_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_P_C_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_P_C_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_H2O_PICA() {
        return _Nspikes_H2O_PICA;
    }

    @Override
    public void setNspikes_H2O_PICA(int Nspikes_H2O_PICA) {
        _Nspikes_H2O_PICA = Nspikes_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_H2O_PICA", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_H2O_PICA_EMEP() {
        return _Nspikes_H2O_PICA_EMEP;
    }

    @Override
    public void setNspikes_H2O_PICA_EMEP(int Nspikes_H2O_PICA_EMEP) {
        _Nspikes_H2O_PICA_EMEP = Nspikes_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_CH4_PICA() {
        return _Nspikes_CH4_PICA;
    }

    @Override
    public void setNspikes_CH4_PICA(int Nspikes_CH4_PICA) {
        _Nspikes_CH4_PICA = Nspikes_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_CH4_PICA", int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNspikes_CH4_PICA_EMEP() {
        return _Nspikes_CH4_PICA_EMEP;
    }

    @Override
    public void setNspikes_CH4_PICA_EMEP(int Nspikes_CH4_PICA_EMEP) {
        _Nspikes_CH4_PICA_EMEP = Nspikes_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setNspikes_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, Nspikes_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_u() {
        return _FI_u;
    }

    @Override
    public void setFI_u(float FI_u) {
        _FI_u = FI_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_u", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_u_EMEP() {
        return _FI_u_EMEP;
    }

    @Override
    public void setFI_u_EMEP(int FI_u_EMEP) {
        _FI_u_EMEP = FI_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_Ts() {
        return _FI_Ts;
    }

    @Override
    public void setFI_Ts(float FI_Ts) {
        _FI_Ts = FI_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_Ts_EMEP() {
        return _FI_Ts_EMEP;
    }

    @Override
    public void setFI_Ts_EMEP(int FI_Ts_EMEP) {
        _FI_Ts_EMEP = FI_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_CO2_LI72() {
        return _FI_CO2_LI72;
    }

    @Override
    public void setFI_CO2_LI72(float FI_CO2_LI72) {
        _FI_CO2_LI72 = FI_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_CO2_LI72_EMEP() {
        return _FI_CO2_LI72_EMEP;
    }

    @Override
    public void setFI_CO2_LI72_EMEP(int FI_CO2_LI72_EMEP) {
        _FI_CO2_LI72_EMEP = FI_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_H2O_LI72() {
        return _FI_H2O_LI72;
    }

    @Override
    public void setFI_H2O_LI72(float FI_H2O_LI72) {
        _FI_H2O_LI72 = FI_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_H2O_LI72_EMEP() {
        return _FI_H2O_LI72_EMEP;
    }

    @Override
    public void setFI_H2O_LI72_EMEP(int FI_H2O_LI72_EMEP) {
        _FI_H2O_LI72_EMEP = FI_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_CH4_PICA() {
        return _FI_CH4_PICA;
    }

    @Override
    public void setFI_CH4_PICA(float FI_CH4_PICA) {
        _FI_CH4_PICA = FI_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_CH4_PICA_EMEP() {
        return _FI_CH4_PICA_EMEP;
    }

    @Override
    public void setFI_CH4_PICA_EMEP(int FI_CH4_PICA_EMEP) {
        _FI_CH4_PICA_EMEP = FI_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFI_H2O_PICA() {
        return _FI_H2O_PICA;
    }

    @Override
    public void setFI_H2O_PICA(float FI_H2O_PICA) {
        _FI_H2O_PICA = FI_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FI_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFI_H2O_PICA_EMEP() {
        return _FI_H2O_PICA_EMEP;
    }

    @Override
    public void setFI_H2O_PICA_EMEP(int FI_H2O_PICA_EMEP) {
        _FI_H2O_PICA_EMEP = FI_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFI_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FI_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_u() {
        return _FST_u;
    }

    @Override
    public void setFST_u(float FST_u) {
        _FST_u = FST_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_u", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_u_EMEP() {
        return _FST_u_EMEP;
    }

    @Override
    public void setFST_u_EMEP(int FST_u_EMEP) {
        _FST_u_EMEP = FST_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FST_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_Ts() {
        return _FST_Ts;
    }

    @Override
    public void setFST_Ts(float FST_Ts) {
        _FST_Ts = FST_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_Ts_EMEP() {
        return _FST_Ts_EMEP;
    }

    @Override
    public void setFST_Ts_EMEP(int FST_Ts_EMEP) {
        _FST_Ts_EMEP = FST_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FST_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_CO2_LI72() {
        return _FST_CO2_LI72;
    }

    @Override
    public void setFST_CO2_LI72(float FST_CO2_LI72) {
        _FST_CO2_LI72 = FST_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_CO2_LI72_EMEP() {
        return _FST_CO2_LI72_EMEP;
    }

    @Override
    public void setFST_CO2_LI72_EMEP(int FST_CO2_LI72_EMEP) {
        _FST_CO2_LI72_EMEP = FST_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_H2O_LI72() {
        return _FST_H2O_LI72;
    }

    @Override
    public void setFST_H2O_LI72(float FST_H2O_LI72) {
        _FST_H2O_LI72 = FST_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_H2O_LI72_EMEP() {
        return _FST_H2O_LI72_EMEP;
    }

    @Override
    public void setFST_H2O_LI72_EMEP(int FST_H2O_LI72_EMEP) {
        _FST_H2O_LI72_EMEP = FST_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_CH4_PICA() {
        return _FST_CH4_PICA;
    }

    @Override
    public void setFST_CH4_PICA(float FST_CH4_PICA) {
        _FST_CH4_PICA = FST_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_CH4_PICA_EMEP() {
        return _FST_CH4_PICA_EMEP;
    }

    @Override
    public void setFST_CH4_PICA_EMEP(int FST_CH4_PICA_EMEP) {
        _FST_CH4_PICA_EMEP = FST_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFST_H2O_PICA() {
        return _FST_H2O_PICA;
    }

    @Override
    public void setFST_H2O_PICA(float FST_H2O_PICA) {
        _FST_H2O_PICA = FST_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FST_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_H2O_PICA_EMEP() {
        return _FST_H2O_PICA_EMEP;
    }

    @Override
    public void setFST_H2O_PICA_EMEP(int FST_H2O_PICA_EMEP) {
        _FST_H2O_PICA_EMEP = FST_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_u() {
        return _RFE_u;
    }

    @Override
    public void setRFE_u(float RFE_u) {
        _RFE_u = RFE_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_u", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_u_EMEP() {
        return _RFE_u_EMEP;
    }

    @Override
    public void setRFE_u_EMEP(int RFE_u_EMEP) {
        _RFE_u_EMEP = RFE_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_Ts() {
        return _RFE_Ts;
    }

    @Override
    public void setRFE_Ts(float RFE_Ts) {
        _RFE_Ts = RFE_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_Ts_EMEP() {
        return _RFE_Ts_EMEP;
    }

    @Override
    public void setRFE_Ts_EMEP(int RFE_Ts_EMEP) {
        _RFE_Ts_EMEP = RFE_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_CO2_LI72() {
        return _RFE_CO2_LI72;
    }

    @Override
    public void setRFE_CO2_LI72(float RFE_CO2_LI72) {
        _RFE_CO2_LI72 = RFE_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_CO2_LI72_EMEP() {
        return _RFE_CO2_LI72_EMEP;
    }

    @Override
    public void setRFE_CO2_LI72_EMEP(int RFE_CO2_LI72_EMEP) {
        _RFE_CO2_LI72_EMEP = RFE_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_H2O_LI72() {
        return _RFE_H2O_LI72;
    }

    @Override
    public void setRFE_H2O_LI72(float RFE_H2O_LI72) {
        _RFE_H2O_LI72 = RFE_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_H2O_LI72_EMEP() {
        return _RFE_H2O_LI72_EMEP;
    }

    @Override
    public void setRFE_H2O_LI72_EMEP(int RFE_H2O_LI72_EMEP) {
        _RFE_H2O_LI72_EMEP = RFE_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_CH4_PICA() {
        return _RFE_CH4_PICA;
    }

    @Override
    public void setRFE_CH4_PICA(float RFE_CH4_PICA) {
        _RFE_CH4_PICA = RFE_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_CH4_PICA_EMEP() {
        return _RFE_CH4_PICA_EMEP;
    }

    @Override
    public void setRFE_CH4_PICA_EMEP(int RFE_CH4_PICA_EMEP) {
        _RFE_CH4_PICA_EMEP = RFE_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRFE_H2O_PICA() {
        return _RFE_H2O_PICA;
    }

    @Override
    public void setRFE_H2O_PICA(float RFE_H2O_PICA) {
        _RFE_H2O_PICA = RFE_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, RFE_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRFE_H2O_PICA_EMEP() {
        return _RFE_H2O_PICA_EMEP;
    }

    @Override
    public void setRFE_H2O_PICA_EMEP(int RFE_H2O_PICA_EMEP) {
        _RFE_H2O_PICA_EMEP = RFE_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setRFE_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, RFE_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_u() {
        return _FA_u;
    }

    @Override
    public void setFA_u(float FA_u) {
        _FA_u = FA_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_u", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_u_EMEP() {
        return _FA_u_EMEP;
    }

    @Override
    public void setFA_u_EMEP(int FA_u_EMEP) {
        _FA_u_EMEP = FA_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_v() {
        return _FA_v;
    }

    @Override
    public void setFA_v(float FA_v) {
        _FA_v = FA_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_v", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_v_EMEP() {
        return _FA_v_EMEP;
    }

    @Override
    public void setFA_v_EMEP(int FA_v_EMEP) {
        _FA_v_EMEP = FA_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_Ts() {
        return _FA_Ts;
    }

    @Override
    public void setFA_Ts(float FA_Ts) {
        _FA_Ts = FA_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_Ts_EMEP() {
        return _FA_Ts_EMEP;
    }

    @Override
    public void setFA_Ts_EMEP(int FA_Ts_EMEP) {
        _FA_Ts_EMEP = FA_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_CO2_LI72() {
        return _FA_CO2_LI72;
    }

    @Override
    public void setFA_CO2_LI72(float FA_CO2_LI72) {
        _FA_CO2_LI72 = FA_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_CO2_LI72_EMEP() {
        return _FA_CO2_LI72_EMEP;
    }

    @Override
    public void setFA_CO2_LI72_EMEP(int FA_CO2_LI72_EMEP) {
        _FA_CO2_LI72_EMEP = FA_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_H2O_LI72() {
        return _FA_H2O_LI72;
    }

    @Override
    public void setFA_H2O_LI72(float FA_H2O_LI72) {
        _FA_H2O_LI72 = FA_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_H2O_LI72_EMEP() {
        return _FA_H2O_LI72_EMEP;
    }

    @Override
    public void setFA_H2O_LI72_EMEP(int FA_H2O_LI72_EMEP) {
        _FA_H2O_LI72_EMEP = FA_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_CH4_PICA() {
        return _FA_CH4_PICA;
    }

    @Override
    public void setFA_CH4_PICA(float FA_CH4_PICA) {
        _FA_CH4_PICA = FA_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_CH4_PICA_EMEP() {
        return _FA_CH4_PICA_EMEP;
    }

    @Override
    public void setFA_CH4_PICA_EMEP(int FA_CH4_PICA_EMEP) {
        _FA_CH4_PICA_EMEP = FA_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFA_H2O_PICA() {
        return _FA_H2O_PICA;
    }

    @Override
    public void setFA_H2O_PICA(float FA_H2O_PICA) {
        _FA_H2O_PICA = FA_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, FA_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFA_H2O_PICA_EMEP() {
        return _FA_H2O_PICA_EMEP;
    }

    @Override
    public void setFA_H2O_PICA_EMEP(int FA_H2O_PICA_EMEP) {
        _FA_H2O_PICA_EMEP = FA_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFA_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FA_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_u() {
        return _covsvar_u;
    }

    @Override
    public void setCovsvar_u(float covsvar_u) {
        _covsvar_u = covsvar_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_u", float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_u_EMEP() {
        return _covsvar_u_EMEP;
    }

    @Override
    public void setCovsvar_u_EMEP(int covsvar_u_EMEP) {
        _covsvar_u_EMEP = covsvar_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_v() {
        return _covsvar_v;
    }

    @Override
    public void setCovsvar_v(float covsvar_v) {
        _covsvar_v = covsvar_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_v", float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_v_EMEP() {
        return _covsvar_v_EMEP;
    }

    @Override
    public void setCovsvar_v_EMEP(int covsvar_v_EMEP) {
        _covsvar_v_EMEP = covsvar_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_Ts() {
        return _covsvar_Ts;
    }

    @Override
    public void setCovsvar_Ts(float covsvar_Ts) {
        _covsvar_Ts = covsvar_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_Ts_EMEP() {
        return _covsvar_Ts_EMEP;
    }

    @Override
    public void setCovsvar_Ts_EMEP(int covsvar_Ts_EMEP) {
        _covsvar_Ts_EMEP = covsvar_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_CO2_LI72() {
        return _covsvar_CO2_LI72;
    }

    @Override
    public void setCovsvar_CO2_LI72(float covsvar_CO2_LI72) {
        _covsvar_CO2_LI72 = covsvar_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_CO2_LI72",
                        float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_CO2_LI72_EMEP() {
        return _covsvar_CO2_LI72_EMEP;
    }

    @Override
    public void setCovsvar_CO2_LI72_EMEP(int covsvar_CO2_LI72_EMEP) {
        _covsvar_CO2_LI72_EMEP = covsvar_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_H2O_LI72() {
        return _covsvar_H2O_LI72;
    }

    @Override
    public void setCovsvar_H2O_LI72(float covsvar_H2O_LI72) {
        _covsvar_H2O_LI72 = covsvar_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_H2O_LI72",
                        float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_H2O_LI72_EMEP() {
        return _covsvar_H2O_LI72_EMEP;
    }

    @Override
    public void setCovsvar_H2O_LI72_EMEP(int covsvar_H2O_LI72_EMEP) {
        _covsvar_H2O_LI72_EMEP = covsvar_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_CH4_PICA() {
        return _covsvar_CH4_PICA;
    }

    @Override
    public void setCovsvar_CH4_PICA(float covsvar_CH4_PICA) {
        _covsvar_CH4_PICA = covsvar_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_CH4_PICA",
                        float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_CH4_PICA_EMEP() {
        return _covsvar_CH4_PICA_EMEP;
    }

    @Override
    public void setCovsvar_CH4_PICA_EMEP(int covsvar_CH4_PICA_EMEP) {
        _covsvar_CH4_PICA_EMEP = covsvar_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCovsvar_H2O_PICA() {
        return _covsvar_H2O_PICA;
    }

    @Override
    public void setCovsvar_H2O_PICA(float covsvar_H2O_PICA) {
        _covsvar_H2O_PICA = covsvar_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_H2O_PICA",
                        float.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCovsvar_H2O_PICA_EMEP() {
        return _covsvar_H2O_PICA_EMEP;
    }

    @Override
    public void setCovsvar_H2O_PICA_EMEP(int covsvar_H2O_PICA_EMEP) {
        _covsvar_H2O_PICA_EMEP = covsvar_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCovsvar_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, covsvar_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_u() {
        return _SKx_u;
    }

    @Override
    public void setSKx_u(float SKx_u) {
        _SKx_u = SKx_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_u", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_u_EMEP() {
        return _SKx_u_EMEP;
    }

    @Override
    public void setSKx_u_EMEP(int SKx_u_EMEP) {
        _SKx_u_EMEP = SKx_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_v() {
        return _SKx_v;
    }

    @Override
    public void setSKx_v(float SKx_v) {
        _SKx_v = SKx_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_v", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_v_EMEP() {
        return _SKx_v_EMEP;
    }

    @Override
    public void setSKx_v_EMEP(int SKx_v_EMEP) {
        _SKx_v_EMEP = SKx_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_w() {
        return _SKx_w;
    }

    @Override
    public void setSKx_w(float SKx_w) {
        _SKx_w = SKx_w;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_w", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_w_EMEP() {
        return _SKx_w_EMEP;
    }

    @Override
    public void setSKx_w_EMEP(int SKx_w_EMEP) {
        _SKx_w_EMEP = SKx_w_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_Ts() {
        return _SKx_Ts;
    }

    @Override
    public void setSKx_Ts(float SKx_Ts) {
        _SKx_Ts = SKx_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_Ts_EMEP() {
        return _SKx_Ts_EMEP;
    }

    @Override
    public void setSKx_Ts_EMEP(int SKx_Ts_EMEP) {
        _SKx_Ts_EMEP = SKx_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_CO2_LI72() {
        return _SKx_CO2_LI72;
    }

    @Override
    public void setSKx_CO2_LI72(float SKx_CO2_LI72) {
        _SKx_CO2_LI72 = SKx_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_CO2_LI72_EMEP() {
        return _SKx_CO2_LI72_EMEP;
    }

    @Override
    public void setSKx_CO2_LI72_EMEP(int SKx_CO2_LI72_EMEP) {
        _SKx_CO2_LI72_EMEP = SKx_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_H2O_LI72() {
        return _SKx_H2O_LI72;
    }

    @Override
    public void setSKx_H2O_LI72(float SKx_H2O_LI72) {
        _SKx_H2O_LI72 = SKx_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_H2O_LI72_EMEP() {
        return _SKx_H2O_LI72_EMEP;
    }

    @Override
    public void setSKx_H2O_LI72_EMEP(int SKx_H2O_LI72_EMEP) {
        _SKx_H2O_LI72_EMEP = SKx_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_CH4_PICA() {
        return _SKx_CH4_PICA;
    }

    @Override
    public void setSKx_CH4_PICA(float SKx_CH4_PICA) {
        _SKx_CH4_PICA = SKx_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_CH4_PICA_EMEP() {
        return _SKx_CH4_PICA_EMEP;
    }

    @Override
    public void setSKx_CH4_PICA_EMEP(int SKx_CH4_PICA_EMEP) {
        _SKx_CH4_PICA_EMEP = SKx_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSKx_H2O_PICA() {
        return _SKx_H2O_PICA;
    }

    @Override
    public void setSKx_H2O_PICA(float SKx_H2O_PICA) {
        _SKx_H2O_PICA = SKx_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, SKx_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSKx_H2O_PICA_EMEP() {
        return _SKx_H2O_PICA_EMEP;
    }

    @Override
    public void setSKx_H2O_PICA_EMEP(int SKx_H2O_PICA_EMEP) {
        _SKx_H2O_PICA_EMEP = SKx_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSKx_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, SKx_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_u() {
        return _KUx_u;
    }

    @Override
    public void setKUx_u(float KUx_u) {
        _KUx_u = KUx_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_u", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_u_EMEP() {
        return _KUx_u_EMEP;
    }

    @Override
    public void setKUx_u_EMEP(int KUx_u_EMEP) {
        _KUx_u_EMEP = KUx_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_v() {
        return _KUx_v;
    }

    @Override
    public void setKUx_v(float KUx_v) {
        _KUx_v = KUx_v;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_v", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_v_EMEP() {
        return _KUx_v_EMEP;
    }

    @Override
    public void setKUx_v_EMEP(int KUx_v_EMEP) {
        _KUx_v_EMEP = KUx_v_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_v_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_w() {
        return _KUx_w;
    }

    @Override
    public void setKUx_w(float KUx_w) {
        _KUx_w = KUx_w;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_w", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_w_EMEP() {
        return _KUx_w_EMEP;
    }

    @Override
    public void setKUx_w_EMEP(int KUx_w_EMEP) {
        _KUx_w_EMEP = KUx_w_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_Ts() {
        return _KUx_Ts;
    }

    @Override
    public void setKUx_Ts(float KUx_Ts) {
        _KUx_Ts = KUx_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_Ts_EMEP() {
        return _KUx_Ts_EMEP;
    }

    @Override
    public void setKUx_Ts_EMEP(int KUx_Ts_EMEP) {
        _KUx_Ts_EMEP = KUx_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_CO2_LI72() {
        return _KUx_CO2_LI72;
    }

    @Override
    public void setKUx_CO2_LI72(float KUx_CO2_LI72) {
        _KUx_CO2_LI72 = KUx_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_CO2_LI72_EMEP() {
        return _KUx_CO2_LI72_EMEP;
    }

    @Override
    public void setKUx_CO2_LI72_EMEP(int KUx_CO2_LI72_EMEP) {
        _KUx_CO2_LI72_EMEP = KUx_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_H2O_LI72() {
        return _KUx_H2O_LI72;
    }

    @Override
    public void setKUx_H2O_LI72(float KUx_H2O_LI72) {
        _KUx_H2O_LI72 = KUx_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_H2O_LI72_EMEP() {
        return _KUx_H2O_LI72_EMEP;
    }

    @Override
    public void setKUx_H2O_LI72_EMEP(int KUx_H2O_LI72_EMEP) {
        _KUx_H2O_LI72_EMEP = KUx_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_CH4_PICA() {
        return _KUx_CH4_PICA;
    }

    @Override
    public void setKUx_CH4_PICA(float KUx_CH4_PICA) {
        _KUx_CH4_PICA = KUx_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_CH4_PICA_EMEP() {
        return _KUx_CH4_PICA_EMEP;
    }

    @Override
    public void setKUx_CH4_PICA_EMEP(int KUx_CH4_PICA_EMEP) {
        _KUx_CH4_PICA_EMEP = KUx_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getKUx_H2O_PICA() {
        return _KUx_H2O_PICA;
    }

    @Override
    public void setKUx_H2O_PICA(float KUx_H2O_PICA) {
        _KUx_H2O_PICA = KUx_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, KUx_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKUx_H2O_PICA_EMEP() {
        return _KUx_H2O_PICA_EMEP;
    }

    @Override
    public void setKUx_H2O_PICA_EMEP(int KUx_H2O_PICA_EMEP) {
        _KUx_H2O_PICA_EMEP = KUx_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setKUx_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, KUx_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_u() {
        return _overall_qflag_u;
    }

    @Override
    public void setOverall_qflag_u(int overall_qflag_u) {
        _overall_qflag_u = overall_qflag_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_u", int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_u_EMEP() {
        return _overall_qflag_u_EMEP;
    }

    @Override
    public void setOverall_qflag_u_EMEP(int overall_qflag_u_EMEP) {
        _overall_qflag_u_EMEP = overall_qflag_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_u_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_Ts() {
        return _overall_qflag_Ts;
    }

    @Override
    public void setOverall_qflag_Ts(int overall_qflag_Ts) {
        _overall_qflag_Ts = overall_qflag_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_Ts", int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_Ts_EMEP() {
        return _overall_qflag_Ts_EMEP;
    }

    @Override
    public void setOverall_qflag_Ts_EMEP(int overall_qflag_Ts_EMEP) {
        _overall_qflag_Ts_EMEP = overall_qflag_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_Ts_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_CO2_LI72() {
        return _overall_qflag_CO2_LI72;
    }

    @Override
    public void setOverall_qflag_CO2_LI72(int overall_qflag_CO2_LI72) {
        _overall_qflag_CO2_LI72 = overall_qflag_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_CO2_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_CO2_LI72_EMEP() {
        return _overall_qflag_CO2_LI72_EMEP;
    }

    @Override
    public void setOverall_qflag_CO2_LI72_EMEP(int overall_qflag_CO2_LI72_EMEP) {
        _overall_qflag_CO2_LI72_EMEP = overall_qflag_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_H2O_LI72() {
        return _overall_qflag_H2O_LI72;
    }

    @Override
    public void setOverall_qflag_H2O_LI72(int overall_qflag_H2O_LI72) {
        _overall_qflag_H2O_LI72 = overall_qflag_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_H2O_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_H2O_LI72_EMEP() {
        return _overall_qflag_H2O_LI72_EMEP;
    }

    @Override
    public void setOverall_qflag_H2O_LI72_EMEP(int overall_qflag_H2O_LI72_EMEP) {
        _overall_qflag_H2O_LI72_EMEP = overall_qflag_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_CH4_PICA() {
        return _overall_qflag_CH4_PICA;
    }

    @Override
    public void setOverall_qflag_CH4_PICA(int overall_qflag_CH4_PICA) {
        _overall_qflag_CH4_PICA = overall_qflag_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_CH4_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_CH4_PICA_EMEP() {
        return _overall_qflag_CH4_PICA_EMEP;
    }

    @Override
    public void setOverall_qflag_CH4_PICA_EMEP(int overall_qflag_CH4_PICA_EMEP) {
        _overall_qflag_CH4_PICA_EMEP = overall_qflag_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_H2O_PICA() {
        return _overall_qflag_H2O_PICA;
    }

    @Override
    public void setOverall_qflag_H2O_PICA(int overall_qflag_H2O_PICA) {
        _overall_qflag_H2O_PICA = overall_qflag_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_H2O_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOverall_qflag_H2O_PICA_EMEP() {
        return _overall_qflag_H2O_PICA_EMEP;
    }

    @Override
    public void setOverall_qflag_H2O_PICA_EMEP(int overall_qflag_H2O_PICA_EMEP) {
        _overall_qflag_H2O_PICA_EMEP = overall_qflag_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setOverall_qflag_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, overall_qflag_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_w() {
        return _ITC_qflag_w;
    }

    @Override
    public void setITC_qflag_w(int ITC_qflag_w) {
        _ITC_qflag_w = ITC_qflag_w;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_w", int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_w_EMEP() {
        return _ITC_qflag_w_EMEP;
    }

    @Override
    public void setITC_qflag_w_EMEP(int ITC_qflag_w_EMEP) {
        _ITC_qflag_w_EMEP = ITC_qflag_w_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_w_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_u() {
        return _ITC_qflag_u;
    }

    @Override
    public void setITC_qflag_u(int ITC_qflag_u) {
        _ITC_qflag_u = ITC_qflag_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_u", int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_u_EMEP() {
        return _ITC_qflag_u_EMEP;
    }

    @Override
    public void setITC_qflag_u_EMEP(int ITC_qflag_u_EMEP) {
        _ITC_qflag_u_EMEP = ITC_qflag_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_Ts() {
        return _ITC_qflag_Ts;
    }

    @Override
    public void setITC_qflag_Ts(int ITC_qflag_Ts) {
        _ITC_qflag_Ts = ITC_qflag_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_Ts", int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_Ts_EMEP() {
        return _ITC_qflag_Ts_EMEP;
    }

    @Override
    public void setITC_qflag_Ts_EMEP(int ITC_qflag_Ts_EMEP) {
        _ITC_qflag_Ts_EMEP = ITC_qflag_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_Ts_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_CO2_LI72() {
        return _ITC_qflag_CO2_LI72;
    }

    @Override
    public void setITC_qflag_CO2_LI72(int ITC_qflag_CO2_LI72) {
        _ITC_qflag_CO2_LI72 = ITC_qflag_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_CO2_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_CO2_LI72_EMEP() {
        return _ITC_qflag_CO2_LI72_EMEP;
    }

    @Override
    public void setITC_qflag_CO2_LI72_EMEP(int ITC_qflag_CO2_LI72_EMEP) {
        _ITC_qflag_CO2_LI72_EMEP = ITC_qflag_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_H2O_LI72() {
        return _ITC_qflag_H2O_LI72;
    }

    @Override
    public void setITC_qflag_H2O_LI72(int ITC_qflag_H2O_LI72) {
        _ITC_qflag_H2O_LI72 = ITC_qflag_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_H2O_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_H2O_LI72_EMEP() {
        return _ITC_qflag_H2O_LI72_EMEP;
    }

    @Override
    public void setITC_qflag_H2O_LI72_EMEP(int ITC_qflag_H2O_LI72_EMEP) {
        _ITC_qflag_H2O_LI72_EMEP = ITC_qflag_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_CH4_PICA() {
        return _ITC_qflag_CH4_PICA;
    }

    @Override
    public void setITC_qflag_CH4_PICA(int ITC_qflag_CH4_PICA) {
        _ITC_qflag_CH4_PICA = ITC_qflag_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_CH4_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_CH4_PICA_EMEP() {
        return _ITC_qflag_CH4_PICA_EMEP;
    }

    @Override
    public void setITC_qflag_CH4_PICA_EMEP(int ITC_qflag_CH4_PICA_EMEP) {
        _ITC_qflag_CH4_PICA_EMEP = ITC_qflag_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_H2O_PICA() {
        return _ITC_qflag_H2O_PICA;
    }

    @Override
    public void setITC_qflag_H2O_PICA(int ITC_qflag_H2O_PICA) {
        _ITC_qflag_H2O_PICA = ITC_qflag_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_H2O_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getITC_qflag_H2O_PICA_EMEP() {
        return _ITC_qflag_H2O_PICA_EMEP;
    }

    @Override
    public void setITC_qflag_H2O_PICA_EMEP(int ITC_qflag_H2O_PICA_EMEP) {
        _ITC_qflag_H2O_PICA_EMEP = ITC_qflag_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setITC_qflag_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, ITC_qflag_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_u() {
        return _FST_qflag_u;
    }

    @Override
    public void setFST_qflag_u(int FST_qflag_u) {
        _FST_qflag_u = FST_qflag_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_u", int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_u_EMEP() {
        return _FST_qflag_u_EMEP;
    }

    @Override
    public void setFST_qflag_u_EMEP(int FST_qflag_u_EMEP) {
        _FST_qflag_u_EMEP = FST_qflag_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_Ts() {
        return _FST_qflag_Ts;
    }

    @Override
    public void setFST_qflag_Ts(int FST_qflag_Ts) {
        _FST_qflag_Ts = FST_qflag_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_Ts", int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_Ts_EMEP() {
        return _FST_qflag_Ts_EMEP;
    }

    @Override
    public void setFST_qflag_Ts_EMEP(int FST_qflag_Ts_EMEP) {
        _FST_qflag_Ts_EMEP = FST_qflag_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_Ts_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_CO2_LI72() {
        return _FST_qflag_CO2_LI72;
    }

    @Override
    public void setFST_qflag_CO2_LI72(int FST_qflag_CO2_LI72) {
        _FST_qflag_CO2_LI72 = FST_qflag_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_CO2_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_CO2_LI72_EMEP() {
        return _FST_qflag_CO2_LI72_EMEP;
    }

    @Override
    public void setFST_qflag_CO2_LI72_EMEP(int FST_qflag_CO2_LI72_EMEP) {
        _FST_qflag_CO2_LI72_EMEP = FST_qflag_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_CO2_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_H2O_LI72() {
        return _FST_qflag_H2O_LI72;
    }

    @Override
    public void setFST_qflag_H2O_LI72(int FST_qflag_H2O_LI72) {
        _FST_qflag_H2O_LI72 = FST_qflag_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_H2O_LI72",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_H2O_LI72_EMEP() {
        return _FST_qflag_H2O_LI72_EMEP;
    }

    @Override
    public void setFST_qflag_H2O_LI72_EMEP(int FST_qflag_H2O_LI72_EMEP) {
        _FST_qflag_H2O_LI72_EMEP = FST_qflag_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_CH4_PICA() {
        return _FST_qflag_CH4_PICA;
    }

    @Override
    public void setFST_qflag_CH4_PICA(int FST_qflag_CH4_PICA) {
        _FST_qflag_CH4_PICA = FST_qflag_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_CH4_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_CH4_PICA_EMEP() {
        return _FST_qflag_CH4_PICA_EMEP;
    }

    @Override
    public void setFST_qflag_CH4_PICA_EMEP(int FST_qflag_CH4_PICA_EMEP) {
        _FST_qflag_CH4_PICA_EMEP = FST_qflag_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_CH4_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_H2O_PICA() {
        return _FST_qflag_H2O_PICA;
    }

    @Override
    public void setFST_qflag_H2O_PICA(int FST_qflag_H2O_PICA) {
        _FST_qflag_H2O_PICA = FST_qflag_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_H2O_PICA",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFST_qflag_H2O_PICA_EMEP() {
        return _FST_qflag_H2O_PICA_EMEP;
    }

    @Override
    public void setFST_qflag_H2O_PICA_EMEP(int FST_qflag_H2O_PICA_EMEP) {
        _FST_qflag_H2O_PICA_EMEP = FST_qflag_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFST_qflag_H2O_PICA_EMEP",
                        int.class);

                method.invoke(_kvjEddyRemoteModel, FST_qflag_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_u() {
        return _Hm_u;
    }

    @Override
    public void setHm_u(float Hm_u) {
        _Hm_u = Hm_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_u", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_u_EMEP() {
        return _Hm_u_EMEP;
    }

    @Override
    public void setHm_u_EMEP(int Hm_u_EMEP) {
        _Hm_u_EMEP = Hm_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_Ts() {
        return _Hm_Ts;
    }

    @Override
    public void setHm_Ts(float Hm_Ts) {
        _Hm_Ts = Hm_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_Ts_EMEP() {
        return _Hm_Ts_EMEP;
    }

    @Override
    public void setHm_Ts_EMEP(int Hm_Ts_EMEP) {
        _Hm_Ts_EMEP = Hm_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_CO2_LI72() {
        return _Hm_CO2_LI72;
    }

    @Override
    public void setHm_CO2_LI72(float Hm_CO2_LI72) {
        _Hm_CO2_LI72 = Hm_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_CO2_LI72_EMEP() {
        return _Hm_CO2_LI72_EMEP;
    }

    @Override
    public void setHm_CO2_LI72_EMEP(int Hm_CO2_LI72_EMEP) {
        _Hm_CO2_LI72_EMEP = Hm_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_H2O_LI72() {
        return _Hm_H2O_LI72;
    }

    @Override
    public void setHm_H2O_LI72(float Hm_H2O_LI72) {
        _Hm_H2O_LI72 = Hm_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_H2O_LI72_EMEP() {
        return _Hm_H2O_LI72_EMEP;
    }

    @Override
    public void setHm_H2O_LI72_EMEP(int Hm_H2O_LI72_EMEP) {
        _Hm_H2O_LI72_EMEP = Hm_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_CH4_PICA() {
        return _Hm_CH4_PICA;
    }

    @Override
    public void setHm_CH4_PICA(float Hm_CH4_PICA) {
        _Hm_CH4_PICA = Hm_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_CH4_PICA_EMEP() {
        return _Hm_CH4_PICA_EMEP;
    }

    @Override
    public void setHm_CH4_PICA_EMEP(int Hm_CH4_PICA_EMEP) {
        _Hm_CH4_PICA_EMEP = Hm_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHm_H2O_PICA() {
        return _Hm_H2O_PICA;
    }

    @Override
    public void setHm_H2O_PICA(float Hm_H2O_PICA) {
        _Hm_H2O_PICA = Hm_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Hm_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHm_H2O_PICA_EMEP() {
        return _Hm_H2O_PICA_EMEP;
    }

    @Override
    public void setHm_H2O_PICA_EMEP(int Hm_H2O_PICA_EMEP) {
        _Hm_H2O_PICA_EMEP = Hm_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHm_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hm_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_u() {
        return _Hv_u;
    }

    @Override
    public void setHv_u(float Hv_u) {
        _Hv_u = Hv_u;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_u", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_u_EMEP() {
        return _Hv_u_EMEP;
    }

    @Override
    public void setHv_u_EMEP(int Hv_u_EMEP) {
        _Hv_u_EMEP = Hv_u_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_u_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_Ts() {
        return _Hv_Ts;
    }

    @Override
    public void setHv_Ts(float Hv_Ts) {
        _Hv_Ts = Hv_Ts;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_Ts", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_Ts);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_Ts_EMEP() {
        return _Hv_Ts_EMEP;
    }

    @Override
    public void setHv_Ts_EMEP(int Hv_Ts_EMEP) {
        _Hv_Ts_EMEP = Hv_Ts_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_Ts_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_Ts_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_CO2_LI72() {
        return _Hv_CO2_LI72;
    }

    @Override
    public void setHv_CO2_LI72(float Hv_CO2_LI72) {
        _Hv_CO2_LI72 = Hv_CO2_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_CO2_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_CO2_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_CO2_LI72_EMEP() {
        return _Hv_CO2_LI72_EMEP;
    }

    @Override
    public void setHv_CO2_LI72_EMEP(int Hv_CO2_LI72_EMEP) {
        _Hv_CO2_LI72_EMEP = Hv_CO2_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_CO2_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_CO2_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_H2O_LI72() {
        return _Hv_H2O_LI72;
    }

    @Override
    public void setHv_H2O_LI72(float Hv_H2O_LI72) {
        _Hv_H2O_LI72 = Hv_H2O_LI72;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_H2O_LI72", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_H2O_LI72_EMEP() {
        return _Hv_H2O_LI72_EMEP;
    }

    @Override
    public void setHv_H2O_LI72_EMEP(int Hv_H2O_LI72_EMEP) {
        _Hv_H2O_LI72_EMEP = Hv_H2O_LI72_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_H2O_LI72_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_CH4_PICA() {
        return _Hv_CH4_PICA;
    }

    @Override
    public void setHv_CH4_PICA(float Hv_CH4_PICA) {
        _Hv_CH4_PICA = Hv_CH4_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_CH4_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_CH4_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_CH4_PICA_EMEP() {
        return _Hv_CH4_PICA_EMEP;
    }

    @Override
    public void setHv_CH4_PICA_EMEP(int Hv_CH4_PICA_EMEP) {
        _Hv_CH4_PICA_EMEP = Hv_CH4_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_CH4_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_CH4_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHv_H2O_PICA() {
        return _Hv_H2O_PICA;
    }

    @Override
    public void setHv_H2O_PICA(float Hv_H2O_PICA) {
        _Hv_H2O_PICA = Hv_H2O_PICA;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_H2O_PICA", float.class);

                method.invoke(_kvjEddyRemoteModel, Hv_H2O_PICA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHv_H2O_PICA_EMEP() {
        return _Hv_H2O_PICA_EMEP;
    }

    @Override
    public void setHv_H2O_PICA_EMEP(int Hv_H2O_PICA_EMEP) {
        _Hv_H2O_PICA_EMEP = Hv_H2O_PICA_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setHv_H2O_PICA_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, Hv_H2O_PICA_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFpr_x_peak() {
        return _fpr_x_peak;
    }

    @Override
    public void setFpr_x_peak(float fpr_x_peak) {
        _fpr_x_peak = fpr_x_peak;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFpr_x_peak", float.class);

                method.invoke(_kvjEddyRemoteModel, fpr_x_peak);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFpr_x_peak_EMEP() {
        return _fpr_x_peak_EMEP;
    }

    @Override
    public void setFpr_x_peak_EMEP(int fpr_x_peak_EMEP) {
        _fpr_x_peak_EMEP = fpr_x_peak_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFpr_x_peak_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, fpr_x_peak_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getFpr_x_80() {
        return _fpr_x_80;
    }

    @Override
    public void setFpr_x_80(float fpr_x_80) {
        _fpr_x_80 = fpr_x_80;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFpr_x_80", float.class);

                method.invoke(_kvjEddyRemoteModel, fpr_x_80);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFpr_x_80_EMEP() {
        return _fpr_x_80_EMEP;
    }

    @Override
    public void setFpr_x_80_EMEP(int fpr_x_80_EMEP) {
        _fpr_x_80_EMEP = fpr_x_80_EMEP;

        if (_kvjEddyRemoteModel != null) {
            try {
                Class<?> clazz = _kvjEddyRemoteModel.getClass();

                Method method = clazz.getMethod("setFpr_x_80_EMEP", int.class);

                method.invoke(_kvjEddyRemoteModel, fpr_x_80_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getkvjEddyRemoteModel() {
        return _kvjEddyRemoteModel;
    }

    public void setkvjEddyRemoteModel(BaseModel<?> kvjEddyRemoteModel) {
        _kvjEddyRemoteModel = kvjEddyRemoteModel;
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

        Class<?> remoteModelClass = _kvjEddyRemoteModel.getClass();

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

        Object returnValue = method.invoke(_kvjEddyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            kvjEddyLocalServiceUtil.addkvjEddy(this);
        } else {
            kvjEddyLocalServiceUtil.updatekvjEddy(this);
        }
    }

    @Override
    public kvjEddy toEscapedModel() {
        return (kvjEddy) ProxyUtil.newProxyInstance(kvjEddy.class.getClassLoader(),
            new Class[] { kvjEddy.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        kvjEddyClp clone = new kvjEddyClp();

        clone.setSamptime(getSamptime());
        clone.setH(getH());
        clone.setH_EMEP(getH_EMEP());
        clone.setQc_H(getQc_H());
        clone.setQc_H_EMEP(getQc_H_EMEP());
        clone.setTau(getTau());
        clone.setTau_EMEP(getTau_EMEP());
        clone.setQc_tau(getQc_tau());
        clone.setQc_tau_EMEP(getQc_tau_EMEP());
        clone.setU_star(getU_star());
        clone.setU_star_EMEP(getU_star_EMEP());
        clone.setMO_length(getMO_length());
        clone.setMO_length_EMEP(getMO_length_EMEP());
        clone.setErr_packet(getErr_packet());
        clone.setErr_packet_EMEP(getErr_packet_EMEP());
        clone.setF_CO2_LI72(getF_CO2_LI72());
        clone.setF_CO2_LI72_EMEP(getF_CO2_LI72_EMEP());
        clone.setQc_CO2_LI72(getQc_CO2_LI72());
        clone.setQc_CO2_LI72_EMEP(getQc_CO2_LI72_EMEP());
        clone.setF_CH4_PICA(getF_CH4_PICA());
        clone.setF_CH4_PICA_EMEP(getF_CH4_PICA_EMEP());
        clone.setQc_CH4_PICA(getQc_CH4_PICA());
        clone.setQc_CH4_PICA_EMEP(getQc_CH4_PICA_EMEP());
        clone.setF_H2O_LI72(getF_H2O_LI72());
        clone.setF_H2O_LI72_EMEP(getF_H2O_LI72_EMEP());
        clone.setQc_H2O_LI72(getQc_H2O_LI72());
        clone.setQc_H2O_LI72_EMEP(getQc_H2O_LI72_EMEP());
        clone.setF_H2O_PICA(getF_H2O_PICA());
        clone.setF_H2O_PICA_EMEP(getF_H2O_PICA_EMEP());
        clone.setQc_H2O_PICA(getQc_H2O_PICA());
        clone.setQc_H2O_PICA_EMEP(getQc_H2O_PICA_EMEP());
        clone.setLE_LI72(getLE_LI72());
        clone.setLE_LI72_EMEP(getLE_LI72_EMEP());
        clone.setLE_PICA(getLE_PICA());
        clone.setLE_PICA_EMEP(getLE_PICA_EMEP());
        clone.setU(getU());
        clone.setU_EMEP(getU_EMEP());
        clone.setWind_dir(getWind_dir());
        clone.setWind_dir_EMEP(getWind_dir_EMEP());
        clone.setAv_u(getAv_u());
        clone.setAv_u_EMEP(getAv_u_EMEP());
        clone.setAv_v(getAv_v());
        clone.setAv_v_EMEP(getAv_v_EMEP());
        clone.setAv_w(getAv_w());
        clone.setAv_w_EMEP(getAv_w_EMEP());
        clone.setAv_t(getAv_t());
        clone.setAv_t_EMEP(getAv_t_EMEP());
        clone.setAv_c_LI72(getAv_c_LI72());
        clone.setAv_c_LI72_EMEP(getAv_c_LI72_EMEP());
        clone.setAv_h_LI72(getAv_h_LI72());
        clone.setAv_h_LI72_EMEP(getAv_h_LI72_EMEP());
        clone.setAv_h_PICA(getAv_h_PICA());
        clone.setAv_h_PICA_EMEP(getAv_h_PICA_EMEP());
        clone.setAv_CH4(getAv_CH4());
        clone.setAv_CH4_EMEP(getAv_CH4_EMEP());
        clone.setStd_u(getStd_u());
        clone.setStd_u_EMEP(getStd_u_EMEP());
        clone.setStd_v(getStd_v());
        clone.setStd_v_EMEP(getStd_v_EMEP());
        clone.setStd_w(getStd_w());
        clone.setStd_w_EMEP(getStd_w_EMEP());
        clone.setStd_t(getStd_t());
        clone.setStd_t_EMEP(getStd_t_EMEP());
        clone.setStd_c_LI72(getStd_c_LI72());
        clone.setStd_c_LI72_EMEP(getStd_c_LI72_EMEP());
        clone.setStd_h_LI72(getStd_h_LI72());
        clone.setStd_h_LI72_EMEP(getStd_h_LI72_EMEP());
        clone.setStd_h_PICA(getStd_h_PICA());
        clone.setStd_h_PICA_EMEP(getStd_h_PICA_EMEP());
        clone.setStd_CH4(getStd_CH4());
        clone.setStd_CH4_EMEP(getStd_CH4_EMEP());
        clone.setEta(getEta());
        clone.setEta_EMEP(getEta_EMEP());
        clone.setTheta(getTheta());
        clone.setTheta_EMEP(getTheta_EMEP());
        clone.setBeta(getBeta());
        clone.setBeta_EMEP(getBeta_EMEP());
        clone.setCovs_u(getCovs_u());
        clone.setCovs_u_EMEP(getCovs_u_EMEP());
        clone.setCovs_v(getCovs_v());
        clone.setCovs_v_EMEP(getCovs_v_EMEP());
        clone.setCovs_Ts(getCovs_Ts());
        clone.setCovs_Ts_EMEP(getCovs_Ts_EMEP());
        clone.setCovs_CO2_LI72(getCovs_CO2_LI72());
        clone.setCovs_CO2_LI72_EMEP(getCovs_CO2_LI72_EMEP());
        clone.setCovs_H2O_LI72(getCovs_H2O_LI72());
        clone.setCovs_H2O_LI72_EMEP(getCovs_H2O_LI72_EMEP());
        clone.setCovs_T_C_LI72(getCovs_T_C_LI72());
        clone.setCovs_T_C_LI72_EMEP(getCovs_T_C_LI72_EMEP());
        clone.setCovs_P_C_LI72(getCovs_P_C_LI72());
        clone.setCovs_P_C_LI72_EMEP(getCovs_P_C_LI72_EMEP());
        clone.setCovs_H2O_PICA(getCovs_H2O_PICA());
        clone.setCovs_H2O_PICA_EMEP(getCovs_H2O_PICA_EMEP());
        clone.setCovs_CH4_PICA(getCovs_CH4_PICA());
        clone.setCovs_CH4_PICA_EMEP(getCovs_CH4_PICA_EMEP());
        clone.setLicor_t_av(getLicor_t_av());
        clone.setLicor_t_av_EMEP(getLicor_t_av_EMEP());
        clone.setLicor_p_av(getLicor_p_av());
        clone.setLicor_p_av_EMEP(getLicor_p_av_EMEP());
        clone.setLicor_t_std(getLicor_t_std());
        clone.setLicor_t_std_EMEP(getLicor_t_std_EMEP());
        clone.setLicor_p_std(getLicor_p_std());
        clone.setLicor_p_std_EMEP(getLicor_p_std_EMEP());
        clone.setC_lag_LI72(getC_lag_LI72());
        clone.setC_lag_LI72_EMEP(getC_lag_LI72_EMEP());
        clone.setH_lag_LI72(getH_lag_LI72());
        clone.setH_lag_LI72_EMEP(getH_lag_LI72_EMEP());
        clone.setT_lag_LI72(getT_lag_LI72());
        clone.setT_lag_LI72_EMEP(getT_lag_LI72_EMEP());
        clone.setP_lag_LI72(getP_lag_LI72());
        clone.setP_lag_LI72_EMEP(getP_lag_LI72_EMEP());
        clone.setH_lag_PICA(getH_lag_PICA());
        clone.setH_lag_PICA_EMEP(getH_lag_PICA_EMEP());
        clone.setCH4_lag(getCH4_lag());
        clone.setCH4_lag_EMEP(getCH4_lag_EMEP());
        clone.setNspikes_u(getNspikes_u());
        clone.setNspikes_u_EMEP(getNspikes_u_EMEP());
        clone.setNspikes_v(getNspikes_v());
        clone.setNspikes_v_EMEP(getNspikes_v_EMEP());
        clone.setNspikes_w(getNspikes_w());
        clone.setNspikes_w_EMEP(getNspikes_w_EMEP());
        clone.setNspikes_Ts(getNspikes_Ts());
        clone.setNspikes_Ts_EMEP(getNspikes_Ts_EMEP());
        clone.setNspikes_CO2_LI72(getNspikes_CO2_LI72());
        clone.setNspikes_CO2_LI72_EMEP(getNspikes_CO2_LI72_EMEP());
        clone.setNspikes_H2O_LI72(getNspikes_H2O_LI72());
        clone.setNspikes_H2O_LI72_EMEP(getNspikes_H2O_LI72_EMEP());
        clone.setNspikes_T_C_LI72(getNspikes_T_C_LI72());
        clone.setNspikes_T_C_LI72_EMEP(getNspikes_T_C_LI72_EMEP());
        clone.setNspikes_P_C_LI72(getNspikes_P_C_LI72());
        clone.setNspikes_P_C_LI72_EMEP(getNspikes_P_C_LI72_EMEP());
        clone.setNspikes_H2O_PICA(getNspikes_H2O_PICA());
        clone.setNspikes_H2O_PICA_EMEP(getNspikes_H2O_PICA_EMEP());
        clone.setNspikes_CH4_PICA(getNspikes_CH4_PICA());
        clone.setNspikes_CH4_PICA_EMEP(getNspikes_CH4_PICA_EMEP());
        clone.setFI_u(getFI_u());
        clone.setFI_u_EMEP(getFI_u_EMEP());
        clone.setFI_Ts(getFI_Ts());
        clone.setFI_Ts_EMEP(getFI_Ts_EMEP());
        clone.setFI_CO2_LI72(getFI_CO2_LI72());
        clone.setFI_CO2_LI72_EMEP(getFI_CO2_LI72_EMEP());
        clone.setFI_H2O_LI72(getFI_H2O_LI72());
        clone.setFI_H2O_LI72_EMEP(getFI_H2O_LI72_EMEP());
        clone.setFI_CH4_PICA(getFI_CH4_PICA());
        clone.setFI_CH4_PICA_EMEP(getFI_CH4_PICA_EMEP());
        clone.setFI_H2O_PICA(getFI_H2O_PICA());
        clone.setFI_H2O_PICA_EMEP(getFI_H2O_PICA_EMEP());
        clone.setFST_u(getFST_u());
        clone.setFST_u_EMEP(getFST_u_EMEP());
        clone.setFST_Ts(getFST_Ts());
        clone.setFST_Ts_EMEP(getFST_Ts_EMEP());
        clone.setFST_CO2_LI72(getFST_CO2_LI72());
        clone.setFST_CO2_LI72_EMEP(getFST_CO2_LI72_EMEP());
        clone.setFST_H2O_LI72(getFST_H2O_LI72());
        clone.setFST_H2O_LI72_EMEP(getFST_H2O_LI72_EMEP());
        clone.setFST_CH4_PICA(getFST_CH4_PICA());
        clone.setFST_CH4_PICA_EMEP(getFST_CH4_PICA_EMEP());
        clone.setFST_H2O_PICA(getFST_H2O_PICA());
        clone.setFST_H2O_PICA_EMEP(getFST_H2O_PICA_EMEP());
        clone.setRFE_u(getRFE_u());
        clone.setRFE_u_EMEP(getRFE_u_EMEP());
        clone.setRFE_Ts(getRFE_Ts());
        clone.setRFE_Ts_EMEP(getRFE_Ts_EMEP());
        clone.setRFE_CO2_LI72(getRFE_CO2_LI72());
        clone.setRFE_CO2_LI72_EMEP(getRFE_CO2_LI72_EMEP());
        clone.setRFE_H2O_LI72(getRFE_H2O_LI72());
        clone.setRFE_H2O_LI72_EMEP(getRFE_H2O_LI72_EMEP());
        clone.setRFE_CH4_PICA(getRFE_CH4_PICA());
        clone.setRFE_CH4_PICA_EMEP(getRFE_CH4_PICA_EMEP());
        clone.setRFE_H2O_PICA(getRFE_H2O_PICA());
        clone.setRFE_H2O_PICA_EMEP(getRFE_H2O_PICA_EMEP());
        clone.setFA_u(getFA_u());
        clone.setFA_u_EMEP(getFA_u_EMEP());
        clone.setFA_v(getFA_v());
        clone.setFA_v_EMEP(getFA_v_EMEP());
        clone.setFA_Ts(getFA_Ts());
        clone.setFA_Ts_EMEP(getFA_Ts_EMEP());
        clone.setFA_CO2_LI72(getFA_CO2_LI72());
        clone.setFA_CO2_LI72_EMEP(getFA_CO2_LI72_EMEP());
        clone.setFA_H2O_LI72(getFA_H2O_LI72());
        clone.setFA_H2O_LI72_EMEP(getFA_H2O_LI72_EMEP());
        clone.setFA_CH4_PICA(getFA_CH4_PICA());
        clone.setFA_CH4_PICA_EMEP(getFA_CH4_PICA_EMEP());
        clone.setFA_H2O_PICA(getFA_H2O_PICA());
        clone.setFA_H2O_PICA_EMEP(getFA_H2O_PICA_EMEP());
        clone.setCovsvar_u(getCovsvar_u());
        clone.setCovsvar_u_EMEP(getCovsvar_u_EMEP());
        clone.setCovsvar_v(getCovsvar_v());
        clone.setCovsvar_v_EMEP(getCovsvar_v_EMEP());
        clone.setCovsvar_Ts(getCovsvar_Ts());
        clone.setCovsvar_Ts_EMEP(getCovsvar_Ts_EMEP());
        clone.setCovsvar_CO2_LI72(getCovsvar_CO2_LI72());
        clone.setCovsvar_CO2_LI72_EMEP(getCovsvar_CO2_LI72_EMEP());
        clone.setCovsvar_H2O_LI72(getCovsvar_H2O_LI72());
        clone.setCovsvar_H2O_LI72_EMEP(getCovsvar_H2O_LI72_EMEP());
        clone.setCovsvar_CH4_PICA(getCovsvar_CH4_PICA());
        clone.setCovsvar_CH4_PICA_EMEP(getCovsvar_CH4_PICA_EMEP());
        clone.setCovsvar_H2O_PICA(getCovsvar_H2O_PICA());
        clone.setCovsvar_H2O_PICA_EMEP(getCovsvar_H2O_PICA_EMEP());
        clone.setSKx_u(getSKx_u());
        clone.setSKx_u_EMEP(getSKx_u_EMEP());
        clone.setSKx_v(getSKx_v());
        clone.setSKx_v_EMEP(getSKx_v_EMEP());
        clone.setSKx_w(getSKx_w());
        clone.setSKx_w_EMEP(getSKx_w_EMEP());
        clone.setSKx_Ts(getSKx_Ts());
        clone.setSKx_Ts_EMEP(getSKx_Ts_EMEP());
        clone.setSKx_CO2_LI72(getSKx_CO2_LI72());
        clone.setSKx_CO2_LI72_EMEP(getSKx_CO2_LI72_EMEP());
        clone.setSKx_H2O_LI72(getSKx_H2O_LI72());
        clone.setSKx_H2O_LI72_EMEP(getSKx_H2O_LI72_EMEP());
        clone.setSKx_CH4_PICA(getSKx_CH4_PICA());
        clone.setSKx_CH4_PICA_EMEP(getSKx_CH4_PICA_EMEP());
        clone.setSKx_H2O_PICA(getSKx_H2O_PICA());
        clone.setSKx_H2O_PICA_EMEP(getSKx_H2O_PICA_EMEP());
        clone.setKUx_u(getKUx_u());
        clone.setKUx_u_EMEP(getKUx_u_EMEP());
        clone.setKUx_v(getKUx_v());
        clone.setKUx_v_EMEP(getKUx_v_EMEP());
        clone.setKUx_w(getKUx_w());
        clone.setKUx_w_EMEP(getKUx_w_EMEP());
        clone.setKUx_Ts(getKUx_Ts());
        clone.setKUx_Ts_EMEP(getKUx_Ts_EMEP());
        clone.setKUx_CO2_LI72(getKUx_CO2_LI72());
        clone.setKUx_CO2_LI72_EMEP(getKUx_CO2_LI72_EMEP());
        clone.setKUx_H2O_LI72(getKUx_H2O_LI72());
        clone.setKUx_H2O_LI72_EMEP(getKUx_H2O_LI72_EMEP());
        clone.setKUx_CH4_PICA(getKUx_CH4_PICA());
        clone.setKUx_CH4_PICA_EMEP(getKUx_CH4_PICA_EMEP());
        clone.setKUx_H2O_PICA(getKUx_H2O_PICA());
        clone.setKUx_H2O_PICA_EMEP(getKUx_H2O_PICA_EMEP());
        clone.setOverall_qflag_u(getOverall_qflag_u());
        clone.setOverall_qflag_u_EMEP(getOverall_qflag_u_EMEP());
        clone.setOverall_qflag_Ts(getOverall_qflag_Ts());
        clone.setOverall_qflag_Ts_EMEP(getOverall_qflag_Ts_EMEP());
        clone.setOverall_qflag_CO2_LI72(getOverall_qflag_CO2_LI72());
        clone.setOverall_qflag_CO2_LI72_EMEP(getOverall_qflag_CO2_LI72_EMEP());
        clone.setOverall_qflag_H2O_LI72(getOverall_qflag_H2O_LI72());
        clone.setOverall_qflag_H2O_LI72_EMEP(getOverall_qflag_H2O_LI72_EMEP());
        clone.setOverall_qflag_CH4_PICA(getOverall_qflag_CH4_PICA());
        clone.setOverall_qflag_CH4_PICA_EMEP(getOverall_qflag_CH4_PICA_EMEP());
        clone.setOverall_qflag_H2O_PICA(getOverall_qflag_H2O_PICA());
        clone.setOverall_qflag_H2O_PICA_EMEP(getOverall_qflag_H2O_PICA_EMEP());
        clone.setITC_qflag_w(getITC_qflag_w());
        clone.setITC_qflag_w_EMEP(getITC_qflag_w_EMEP());
        clone.setITC_qflag_u(getITC_qflag_u());
        clone.setITC_qflag_u_EMEP(getITC_qflag_u_EMEP());
        clone.setITC_qflag_Ts(getITC_qflag_Ts());
        clone.setITC_qflag_Ts_EMEP(getITC_qflag_Ts_EMEP());
        clone.setITC_qflag_CO2_LI72(getITC_qflag_CO2_LI72());
        clone.setITC_qflag_CO2_LI72_EMEP(getITC_qflag_CO2_LI72_EMEP());
        clone.setITC_qflag_H2O_LI72(getITC_qflag_H2O_LI72());
        clone.setITC_qflag_H2O_LI72_EMEP(getITC_qflag_H2O_LI72_EMEP());
        clone.setITC_qflag_CH4_PICA(getITC_qflag_CH4_PICA());
        clone.setITC_qflag_CH4_PICA_EMEP(getITC_qflag_CH4_PICA_EMEP());
        clone.setITC_qflag_H2O_PICA(getITC_qflag_H2O_PICA());
        clone.setITC_qflag_H2O_PICA_EMEP(getITC_qflag_H2O_PICA_EMEP());
        clone.setFST_qflag_u(getFST_qflag_u());
        clone.setFST_qflag_u_EMEP(getFST_qflag_u_EMEP());
        clone.setFST_qflag_Ts(getFST_qflag_Ts());
        clone.setFST_qflag_Ts_EMEP(getFST_qflag_Ts_EMEP());
        clone.setFST_qflag_CO2_LI72(getFST_qflag_CO2_LI72());
        clone.setFST_qflag_CO2_LI72_EMEP(getFST_qflag_CO2_LI72_EMEP());
        clone.setFST_qflag_H2O_LI72(getFST_qflag_H2O_LI72());
        clone.setFST_qflag_H2O_LI72_EMEP(getFST_qflag_H2O_LI72_EMEP());
        clone.setFST_qflag_CH4_PICA(getFST_qflag_CH4_PICA());
        clone.setFST_qflag_CH4_PICA_EMEP(getFST_qflag_CH4_PICA_EMEP());
        clone.setFST_qflag_H2O_PICA(getFST_qflag_H2O_PICA());
        clone.setFST_qflag_H2O_PICA_EMEP(getFST_qflag_H2O_PICA_EMEP());
        clone.setHm_u(getHm_u());
        clone.setHm_u_EMEP(getHm_u_EMEP());
        clone.setHm_Ts(getHm_Ts());
        clone.setHm_Ts_EMEP(getHm_Ts_EMEP());
        clone.setHm_CO2_LI72(getHm_CO2_LI72());
        clone.setHm_CO2_LI72_EMEP(getHm_CO2_LI72_EMEP());
        clone.setHm_H2O_LI72(getHm_H2O_LI72());
        clone.setHm_H2O_LI72_EMEP(getHm_H2O_LI72_EMEP());
        clone.setHm_CH4_PICA(getHm_CH4_PICA());
        clone.setHm_CH4_PICA_EMEP(getHm_CH4_PICA_EMEP());
        clone.setHm_H2O_PICA(getHm_H2O_PICA());
        clone.setHm_H2O_PICA_EMEP(getHm_H2O_PICA_EMEP());
        clone.setHv_u(getHv_u());
        clone.setHv_u_EMEP(getHv_u_EMEP());
        clone.setHv_Ts(getHv_Ts());
        clone.setHv_Ts_EMEP(getHv_Ts_EMEP());
        clone.setHv_CO2_LI72(getHv_CO2_LI72());
        clone.setHv_CO2_LI72_EMEP(getHv_CO2_LI72_EMEP());
        clone.setHv_H2O_LI72(getHv_H2O_LI72());
        clone.setHv_H2O_LI72_EMEP(getHv_H2O_LI72_EMEP());
        clone.setHv_CH4_PICA(getHv_CH4_PICA());
        clone.setHv_CH4_PICA_EMEP(getHv_CH4_PICA_EMEP());
        clone.setHv_H2O_PICA(getHv_H2O_PICA());
        clone.setHv_H2O_PICA_EMEP(getHv_H2O_PICA_EMEP());
        clone.setFpr_x_peak(getFpr_x_peak());
        clone.setFpr_x_peak_EMEP(getFpr_x_peak_EMEP());
        clone.setFpr_x_80(getFpr_x_80());
        clone.setFpr_x_80_EMEP(getFpr_x_80_EMEP());

        return clone;
    }

    @Override
    public int compareTo(kvjEddy kvjEddy) {
        java.util.Date primaryKey = kvjEddy.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof kvjEddyClp)) {
            return false;
        }

        kvjEddyClp kvjEddy = (kvjEddyClp) obj;

        java.util.Date primaryKey = kvjEddy.getPrimaryKey();

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
        StringBundler sb = new StringBundler(595);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", H=");
        sb.append(getH());
        sb.append(", H_EMEP=");
        sb.append(getH_EMEP());
        sb.append(", Qc_H=");
        sb.append(getQc_H());
        sb.append(", Qc_H_EMEP=");
        sb.append(getQc_H_EMEP());
        sb.append(", tau=");
        sb.append(getTau());
        sb.append(", tau_EMEP=");
        sb.append(getTau_EMEP());
        sb.append(", Qc_tau=");
        sb.append(getQc_tau());
        sb.append(", Qc_tau_EMEP=");
        sb.append(getQc_tau_EMEP());
        sb.append(", u_star=");
        sb.append(getU_star());
        sb.append(", u_star_EMEP=");
        sb.append(getU_star_EMEP());
        sb.append(", MO_length=");
        sb.append(getMO_length());
        sb.append(", MO_length_EMEP=");
        sb.append(getMO_length_EMEP());
        sb.append(", err_packet=");
        sb.append(getErr_packet());
        sb.append(", err_packet_EMEP=");
        sb.append(getErr_packet_EMEP());
        sb.append(", F_CO2_LI72=");
        sb.append(getF_CO2_LI72());
        sb.append(", F_CO2_LI72_EMEP=");
        sb.append(getF_CO2_LI72_EMEP());
        sb.append(", Qc_CO2_LI72=");
        sb.append(getQc_CO2_LI72());
        sb.append(", Qc_CO2_LI72_EMEP=");
        sb.append(getQc_CO2_LI72_EMEP());
        sb.append(", F_CH4_PICA=");
        sb.append(getF_CH4_PICA());
        sb.append(", F_CH4_PICA_EMEP=");
        sb.append(getF_CH4_PICA_EMEP());
        sb.append(", Qc_CH4_PICA=");
        sb.append(getQc_CH4_PICA());
        sb.append(", Qc_CH4_PICA_EMEP=");
        sb.append(getQc_CH4_PICA_EMEP());
        sb.append(", F_H2O_LI72=");
        sb.append(getF_H2O_LI72());
        sb.append(", F_H2O_LI72_EMEP=");
        sb.append(getF_H2O_LI72_EMEP());
        sb.append(", Qc_H2O_LI72=");
        sb.append(getQc_H2O_LI72());
        sb.append(", Qc_H2O_LI72_EMEP=");
        sb.append(getQc_H2O_LI72_EMEP());
        sb.append(", F_H2O_PICA=");
        sb.append(getF_H2O_PICA());
        sb.append(", F_H2O_PICA_EMEP=");
        sb.append(getF_H2O_PICA_EMEP());
        sb.append(", Qc_H2O_PICA=");
        sb.append(getQc_H2O_PICA());
        sb.append(", Qc_H2O_PICA_EMEP=");
        sb.append(getQc_H2O_PICA_EMEP());
        sb.append(", LE_LI72=");
        sb.append(getLE_LI72());
        sb.append(", LE_LI72_EMEP=");
        sb.append(getLE_LI72_EMEP());
        sb.append(", LE_PICA=");
        sb.append(getLE_PICA());
        sb.append(", LE_PICA_EMEP=");
        sb.append(getLE_PICA_EMEP());
        sb.append(", U=");
        sb.append(getU());
        sb.append(", U_EMEP=");
        sb.append(getU_EMEP());
        sb.append(", wind_dir=");
        sb.append(getWind_dir());
        sb.append(", wind_dir_EMEP=");
        sb.append(getWind_dir_EMEP());
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
        sb.append(", av_c_LI72=");
        sb.append(getAv_c_LI72());
        sb.append(", av_c_LI72_EMEP=");
        sb.append(getAv_c_LI72_EMEP());
        sb.append(", av_h_LI72=");
        sb.append(getAv_h_LI72());
        sb.append(", av_h_LI72_EMEP=");
        sb.append(getAv_h_LI72_EMEP());
        sb.append(", av_h_PICA=");
        sb.append(getAv_h_PICA());
        sb.append(", av_h_PICA_EMEP=");
        sb.append(getAv_h_PICA_EMEP());
        sb.append(", av_CH4=");
        sb.append(getAv_CH4());
        sb.append(", av_CH4_EMEP=");
        sb.append(getAv_CH4_EMEP());
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
        sb.append(", std_c_LI72=");
        sb.append(getStd_c_LI72());
        sb.append(", std_c_LI72_EMEP=");
        sb.append(getStd_c_LI72_EMEP());
        sb.append(", std_h_LI72=");
        sb.append(getStd_h_LI72());
        sb.append(", std_h_LI72_EMEP=");
        sb.append(getStd_h_LI72_EMEP());
        sb.append(", std_h_PICA=");
        sb.append(getStd_h_PICA());
        sb.append(", std_h_PICA_EMEP=");
        sb.append(getStd_h_PICA_EMEP());
        sb.append(", std_CH4=");
        sb.append(getStd_CH4());
        sb.append(", std_CH4_EMEP=");
        sb.append(getStd_CH4_EMEP());
        sb.append(", eta=");
        sb.append(getEta());
        sb.append(", eta_EMEP=");
        sb.append(getEta_EMEP());
        sb.append(", theta=");
        sb.append(getTheta());
        sb.append(", theta_EMEP=");
        sb.append(getTheta_EMEP());
        sb.append(", beta=");
        sb.append(getBeta());
        sb.append(", beta_EMEP=");
        sb.append(getBeta_EMEP());
        sb.append(", Covs_u=");
        sb.append(getCovs_u());
        sb.append(", Covs_u_EMEP=");
        sb.append(getCovs_u_EMEP());
        sb.append(", Covs_v=");
        sb.append(getCovs_v());
        sb.append(", Covs_v_EMEP=");
        sb.append(getCovs_v_EMEP());
        sb.append(", Covs_Ts=");
        sb.append(getCovs_Ts());
        sb.append(", Covs_Ts_EMEP=");
        sb.append(getCovs_Ts_EMEP());
        sb.append(", Covs_CO2_LI72=");
        sb.append(getCovs_CO2_LI72());
        sb.append(", Covs_CO2_LI72_EMEP=");
        sb.append(getCovs_CO2_LI72_EMEP());
        sb.append(", Covs_H2O_LI72=");
        sb.append(getCovs_H2O_LI72());
        sb.append(", Covs_H2O_LI72_EMEP=");
        sb.append(getCovs_H2O_LI72_EMEP());
        sb.append(", Covs_T_C_LI72=");
        sb.append(getCovs_T_C_LI72());
        sb.append(", Covs_T_C_LI72_EMEP=");
        sb.append(getCovs_T_C_LI72_EMEP());
        sb.append(", Covs_P_C_LI72=");
        sb.append(getCovs_P_C_LI72());
        sb.append(", Covs_P_C_LI72_EMEP=");
        sb.append(getCovs_P_C_LI72_EMEP());
        sb.append(", Covs_H2O_PICA=");
        sb.append(getCovs_H2O_PICA());
        sb.append(", Covs_H2O_PICA_EMEP=");
        sb.append(getCovs_H2O_PICA_EMEP());
        sb.append(", Covs_CH4_PICA=");
        sb.append(getCovs_CH4_PICA());
        sb.append(", Covs_CH4_PICA_EMEP=");
        sb.append(getCovs_CH4_PICA_EMEP());
        sb.append(", licor_t_av=");
        sb.append(getLicor_t_av());
        sb.append(", licor_t_av_EMEP=");
        sb.append(getLicor_t_av_EMEP());
        sb.append(", licor_p_av=");
        sb.append(getLicor_p_av());
        sb.append(", licor_p_av_EMEP=");
        sb.append(getLicor_p_av_EMEP());
        sb.append(", licor_t_std=");
        sb.append(getLicor_t_std());
        sb.append(", licor_t_std_EMEP=");
        sb.append(getLicor_t_std_EMEP());
        sb.append(", licor_p_std=");
        sb.append(getLicor_p_std());
        sb.append(", licor_p_std_EMEP=");
        sb.append(getLicor_p_std_EMEP());
        sb.append(", c_lag_LI72=");
        sb.append(getC_lag_LI72());
        sb.append(", c_lag_LI72_EMEP=");
        sb.append(getC_lag_LI72_EMEP());
        sb.append(", h_lag_LI72=");
        sb.append(getH_lag_LI72());
        sb.append(", h_lag_LI72_EMEP=");
        sb.append(getH_lag_LI72_EMEP());
        sb.append(", t_lag_LI72=");
        sb.append(getT_lag_LI72());
        sb.append(", t_lag_LI72_EMEP=");
        sb.append(getT_lag_LI72_EMEP());
        sb.append(", p_lag_LI72=");
        sb.append(getP_lag_LI72());
        sb.append(", p_lag_LI72_EMEP=");
        sb.append(getP_lag_LI72_EMEP());
        sb.append(", h_lag_PICA=");
        sb.append(getH_lag_PICA());
        sb.append(", h_lag_PICA_EMEP=");
        sb.append(getH_lag_PICA_EMEP());
        sb.append(", CH4_lag=");
        sb.append(getCH4_lag());
        sb.append(", CH4_lag_EMEP=");
        sb.append(getCH4_lag_EMEP());
        sb.append(", Nspikes_u=");
        sb.append(getNspikes_u());
        sb.append(", Nspikes_u_EMEP=");
        sb.append(getNspikes_u_EMEP());
        sb.append(", Nspikes_v=");
        sb.append(getNspikes_v());
        sb.append(", Nspikes_v_EMEP=");
        sb.append(getNspikes_v_EMEP());
        sb.append(", Nspikes_w=");
        sb.append(getNspikes_w());
        sb.append(", Nspikes_w_EMEP=");
        sb.append(getNspikes_w_EMEP());
        sb.append(", Nspikes_Ts=");
        sb.append(getNspikes_Ts());
        sb.append(", Nspikes_Ts_EMEP=");
        sb.append(getNspikes_Ts_EMEP());
        sb.append(", Nspikes_CO2_LI72=");
        sb.append(getNspikes_CO2_LI72());
        sb.append(", Nspikes_CO2_LI72_EMEP=");
        sb.append(getNspikes_CO2_LI72_EMEP());
        sb.append(", Nspikes_H2O_LI72=");
        sb.append(getNspikes_H2O_LI72());
        sb.append(", Nspikes_H2O_LI72_EMEP=");
        sb.append(getNspikes_H2O_LI72_EMEP());
        sb.append(", Nspikes_T_C_LI72=");
        sb.append(getNspikes_T_C_LI72());
        sb.append(", Nspikes_T_C_LI72_EMEP=");
        sb.append(getNspikes_T_C_LI72_EMEP());
        sb.append(", Nspikes_P_C_LI72=");
        sb.append(getNspikes_P_C_LI72());
        sb.append(", Nspikes_P_C_LI72_EMEP=");
        sb.append(getNspikes_P_C_LI72_EMEP());
        sb.append(", Nspikes_H2O_PICA=");
        sb.append(getNspikes_H2O_PICA());
        sb.append(", Nspikes_H2O_PICA_EMEP=");
        sb.append(getNspikes_H2O_PICA_EMEP());
        sb.append(", Nspikes_CH4_PICA=");
        sb.append(getNspikes_CH4_PICA());
        sb.append(", Nspikes_CH4_PICA_EMEP=");
        sb.append(getNspikes_CH4_PICA_EMEP());
        sb.append(", FI_u=");
        sb.append(getFI_u());
        sb.append(", FI_u_EMEP=");
        sb.append(getFI_u_EMEP());
        sb.append(", FI_Ts=");
        sb.append(getFI_Ts());
        sb.append(", FI_Ts_EMEP=");
        sb.append(getFI_Ts_EMEP());
        sb.append(", FI_CO2_LI72=");
        sb.append(getFI_CO2_LI72());
        sb.append(", FI_CO2_LI72_EMEP=");
        sb.append(getFI_CO2_LI72_EMEP());
        sb.append(", FI_H2O_LI72=");
        sb.append(getFI_H2O_LI72());
        sb.append(", FI_H2O_LI72_EMEP=");
        sb.append(getFI_H2O_LI72_EMEP());
        sb.append(", FI_CH4_PICA=");
        sb.append(getFI_CH4_PICA());
        sb.append(", FI_CH4_PICA_EMEP=");
        sb.append(getFI_CH4_PICA_EMEP());
        sb.append(", FI_H2O_PICA=");
        sb.append(getFI_H2O_PICA());
        sb.append(", FI_H2O_PICA_EMEP=");
        sb.append(getFI_H2O_PICA_EMEP());
        sb.append(", FST_u=");
        sb.append(getFST_u());
        sb.append(", FST_u_EMEP=");
        sb.append(getFST_u_EMEP());
        sb.append(", FST_Ts=");
        sb.append(getFST_Ts());
        sb.append(", FST_Ts_EMEP=");
        sb.append(getFST_Ts_EMEP());
        sb.append(", FST_CO2_LI72=");
        sb.append(getFST_CO2_LI72());
        sb.append(", FST_CO2_LI72_EMEP=");
        sb.append(getFST_CO2_LI72_EMEP());
        sb.append(", FST_H2O_LI72=");
        sb.append(getFST_H2O_LI72());
        sb.append(", FST_H2O_LI72_EMEP=");
        sb.append(getFST_H2O_LI72_EMEP());
        sb.append(", FST_CH4_PICA=");
        sb.append(getFST_CH4_PICA());
        sb.append(", FST_CH4_PICA_EMEP=");
        sb.append(getFST_CH4_PICA_EMEP());
        sb.append(", FST_H2O_PICA=");
        sb.append(getFST_H2O_PICA());
        sb.append(", FST_H2O_PICA_EMEP=");
        sb.append(getFST_H2O_PICA_EMEP());
        sb.append(", RFE_u=");
        sb.append(getRFE_u());
        sb.append(", RFE_u_EMEP=");
        sb.append(getRFE_u_EMEP());
        sb.append(", RFE_Ts=");
        sb.append(getRFE_Ts());
        sb.append(", RFE_Ts_EMEP=");
        sb.append(getRFE_Ts_EMEP());
        sb.append(", RFE_CO2_LI72=");
        sb.append(getRFE_CO2_LI72());
        sb.append(", RFE_CO2_LI72_EMEP=");
        sb.append(getRFE_CO2_LI72_EMEP());
        sb.append(", RFE_H2O_LI72=");
        sb.append(getRFE_H2O_LI72());
        sb.append(", RFE_H2O_LI72_EMEP=");
        sb.append(getRFE_H2O_LI72_EMEP());
        sb.append(", RFE_CH4_PICA=");
        sb.append(getRFE_CH4_PICA());
        sb.append(", RFE_CH4_PICA_EMEP=");
        sb.append(getRFE_CH4_PICA_EMEP());
        sb.append(", RFE_H2O_PICA=");
        sb.append(getRFE_H2O_PICA());
        sb.append(", RFE_H2O_PICA_EMEP=");
        sb.append(getRFE_H2O_PICA_EMEP());
        sb.append(", FA_u=");
        sb.append(getFA_u());
        sb.append(", FA_u_EMEP=");
        sb.append(getFA_u_EMEP());
        sb.append(", FA_v=");
        sb.append(getFA_v());
        sb.append(", FA_v_EMEP=");
        sb.append(getFA_v_EMEP());
        sb.append(", FA_Ts=");
        sb.append(getFA_Ts());
        sb.append(", FA_Ts_EMEP=");
        sb.append(getFA_Ts_EMEP());
        sb.append(", FA_CO2_LI72=");
        sb.append(getFA_CO2_LI72());
        sb.append(", FA_CO2_LI72_EMEP=");
        sb.append(getFA_CO2_LI72_EMEP());
        sb.append(", FA_H2O_LI72=");
        sb.append(getFA_H2O_LI72());
        sb.append(", FA_H2O_LI72_EMEP=");
        sb.append(getFA_H2O_LI72_EMEP());
        sb.append(", FA_CH4_PICA=");
        sb.append(getFA_CH4_PICA());
        sb.append(", FA_CH4_PICA_EMEP=");
        sb.append(getFA_CH4_PICA_EMEP());
        sb.append(", FA_H2O_PICA=");
        sb.append(getFA_H2O_PICA());
        sb.append(", FA_H2O_PICA_EMEP=");
        sb.append(getFA_H2O_PICA_EMEP());
        sb.append(", covsvar_u=");
        sb.append(getCovsvar_u());
        sb.append(", covsvar_u_EMEP=");
        sb.append(getCovsvar_u_EMEP());
        sb.append(", covsvar_v=");
        sb.append(getCovsvar_v());
        sb.append(", covsvar_v_EMEP=");
        sb.append(getCovsvar_v_EMEP());
        sb.append(", covsvar_Ts=");
        sb.append(getCovsvar_Ts());
        sb.append(", covsvar_Ts_EMEP=");
        sb.append(getCovsvar_Ts_EMEP());
        sb.append(", covsvar_CO2_LI72=");
        sb.append(getCovsvar_CO2_LI72());
        sb.append(", covsvar_CO2_LI72_EMEP=");
        sb.append(getCovsvar_CO2_LI72_EMEP());
        sb.append(", covsvar_H2O_LI72=");
        sb.append(getCovsvar_H2O_LI72());
        sb.append(", covsvar_H2O_LI72_EMEP=");
        sb.append(getCovsvar_H2O_LI72_EMEP());
        sb.append(", covsvar_CH4_PICA=");
        sb.append(getCovsvar_CH4_PICA());
        sb.append(", covsvar_CH4_PICA_EMEP=");
        sb.append(getCovsvar_CH4_PICA_EMEP());
        sb.append(", covsvar_H2O_PICA=");
        sb.append(getCovsvar_H2O_PICA());
        sb.append(", covsvar_H2O_PICA_EMEP=");
        sb.append(getCovsvar_H2O_PICA_EMEP());
        sb.append(", SKx_u=");
        sb.append(getSKx_u());
        sb.append(", SKx_u_EMEP=");
        sb.append(getSKx_u_EMEP());
        sb.append(", SKx_v=");
        sb.append(getSKx_v());
        sb.append(", SKx_v_EMEP=");
        sb.append(getSKx_v_EMEP());
        sb.append(", SKx_w=");
        sb.append(getSKx_w());
        sb.append(", SKx_w_EMEP=");
        sb.append(getSKx_w_EMEP());
        sb.append(", SKx_Ts=");
        sb.append(getSKx_Ts());
        sb.append(", SKx_Ts_EMEP=");
        sb.append(getSKx_Ts_EMEP());
        sb.append(", SKx_CO2_LI72=");
        sb.append(getSKx_CO2_LI72());
        sb.append(", SKx_CO2_LI72_EMEP=");
        sb.append(getSKx_CO2_LI72_EMEP());
        sb.append(", SKx_H2O_LI72=");
        sb.append(getSKx_H2O_LI72());
        sb.append(", SKx_H2O_LI72_EMEP=");
        sb.append(getSKx_H2O_LI72_EMEP());
        sb.append(", SKx_CH4_PICA=");
        sb.append(getSKx_CH4_PICA());
        sb.append(", SKx_CH4_PICA_EMEP=");
        sb.append(getSKx_CH4_PICA_EMEP());
        sb.append(", SKx_H2O_PICA=");
        sb.append(getSKx_H2O_PICA());
        sb.append(", SKx_H2O_PICA_EMEP=");
        sb.append(getSKx_H2O_PICA_EMEP());
        sb.append(", KUx_u=");
        sb.append(getKUx_u());
        sb.append(", KUx_u_EMEP=");
        sb.append(getKUx_u_EMEP());
        sb.append(", KUx_v=");
        sb.append(getKUx_v());
        sb.append(", KUx_v_EMEP=");
        sb.append(getKUx_v_EMEP());
        sb.append(", KUx_w=");
        sb.append(getKUx_w());
        sb.append(", KUx_w_EMEP=");
        sb.append(getKUx_w_EMEP());
        sb.append(", KUx_Ts=");
        sb.append(getKUx_Ts());
        sb.append(", KUx_Ts_EMEP=");
        sb.append(getKUx_Ts_EMEP());
        sb.append(", KUx_CO2_LI72=");
        sb.append(getKUx_CO2_LI72());
        sb.append(", KUx_CO2_LI72_EMEP=");
        sb.append(getKUx_CO2_LI72_EMEP());
        sb.append(", KUx_H2O_LI72=");
        sb.append(getKUx_H2O_LI72());
        sb.append(", KUx_H2O_LI72_EMEP=");
        sb.append(getKUx_H2O_LI72_EMEP());
        sb.append(", KUx_CH4_PICA=");
        sb.append(getKUx_CH4_PICA());
        sb.append(", KUx_CH4_PICA_EMEP=");
        sb.append(getKUx_CH4_PICA_EMEP());
        sb.append(", KUx_H2O_PICA=");
        sb.append(getKUx_H2O_PICA());
        sb.append(", KUx_H2O_PICA_EMEP=");
        sb.append(getKUx_H2O_PICA_EMEP());
        sb.append(", overall_qflag_u=");
        sb.append(getOverall_qflag_u());
        sb.append(", overall_qflag_u_EMEP=");
        sb.append(getOverall_qflag_u_EMEP());
        sb.append(", overall_qflag_Ts=");
        sb.append(getOverall_qflag_Ts());
        sb.append(", overall_qflag_Ts_EMEP=");
        sb.append(getOverall_qflag_Ts_EMEP());
        sb.append(", overall_qflag_CO2_LI72=");
        sb.append(getOverall_qflag_CO2_LI72());
        sb.append(", overall_qflag_CO2_LI72_EMEP=");
        sb.append(getOverall_qflag_CO2_LI72_EMEP());
        sb.append(", overall_qflag_H2O_LI72=");
        sb.append(getOverall_qflag_H2O_LI72());
        sb.append(", overall_qflag_H2O_LI72_EMEP=");
        sb.append(getOverall_qflag_H2O_LI72_EMEP());
        sb.append(", overall_qflag_CH4_PICA=");
        sb.append(getOverall_qflag_CH4_PICA());
        sb.append(", overall_qflag_CH4_PICA_EMEP=");
        sb.append(getOverall_qflag_CH4_PICA_EMEP());
        sb.append(", overall_qflag_H2O_PICA=");
        sb.append(getOverall_qflag_H2O_PICA());
        sb.append(", overall_qflag_H2O_PICA_EMEP=");
        sb.append(getOverall_qflag_H2O_PICA_EMEP());
        sb.append(", ITC_qflag_w=");
        sb.append(getITC_qflag_w());
        sb.append(", ITC_qflag_w_EMEP=");
        sb.append(getITC_qflag_w_EMEP());
        sb.append(", ITC_qflag_u=");
        sb.append(getITC_qflag_u());
        sb.append(", ITC_qflag_u_EMEP=");
        sb.append(getITC_qflag_u_EMEP());
        sb.append(", ITC_qflag_Ts=");
        sb.append(getITC_qflag_Ts());
        sb.append(", ITC_qflag_Ts_EMEP=");
        sb.append(getITC_qflag_Ts_EMEP());
        sb.append(", ITC_qflag_CO2_LI72=");
        sb.append(getITC_qflag_CO2_LI72());
        sb.append(", ITC_qflag_CO2_LI72_EMEP=");
        sb.append(getITC_qflag_CO2_LI72_EMEP());
        sb.append(", ITC_qflag_H2O_LI72=");
        sb.append(getITC_qflag_H2O_LI72());
        sb.append(", ITC_qflag_H2O_LI72_EMEP=");
        sb.append(getITC_qflag_H2O_LI72_EMEP());
        sb.append(", ITC_qflag_CH4_PICA=");
        sb.append(getITC_qflag_CH4_PICA());
        sb.append(", ITC_qflag_CH4_PICA_EMEP=");
        sb.append(getITC_qflag_CH4_PICA_EMEP());
        sb.append(", ITC_qflag_H2O_PICA=");
        sb.append(getITC_qflag_H2O_PICA());
        sb.append(", ITC_qflag_H2O_PICA_EMEP=");
        sb.append(getITC_qflag_H2O_PICA_EMEP());
        sb.append(", FST_qflag_u=");
        sb.append(getFST_qflag_u());
        sb.append(", FST_qflag_u_EMEP=");
        sb.append(getFST_qflag_u_EMEP());
        sb.append(", FST_qflag_Ts=");
        sb.append(getFST_qflag_Ts());
        sb.append(", FST_qflag_Ts_EMEP=");
        sb.append(getFST_qflag_Ts_EMEP());
        sb.append(", FST_qflag_CO2_LI72=");
        sb.append(getFST_qflag_CO2_LI72());
        sb.append(", FST_qflag_CO2_LI72_EMEP=");
        sb.append(getFST_qflag_CO2_LI72_EMEP());
        sb.append(", FST_qflag_H2O_LI72=");
        sb.append(getFST_qflag_H2O_LI72());
        sb.append(", FST_qflag_H2O_LI72_EMEP=");
        sb.append(getFST_qflag_H2O_LI72_EMEP());
        sb.append(", FST_qflag_CH4_PICA=");
        sb.append(getFST_qflag_CH4_PICA());
        sb.append(", FST_qflag_CH4_PICA_EMEP=");
        sb.append(getFST_qflag_CH4_PICA_EMEP());
        sb.append(", FST_qflag_H2O_PICA=");
        sb.append(getFST_qflag_H2O_PICA());
        sb.append(", FST_qflag_H2O_PICA_EMEP=");
        sb.append(getFST_qflag_H2O_PICA_EMEP());
        sb.append(", Hm_u=");
        sb.append(getHm_u());
        sb.append(", Hm_u_EMEP=");
        sb.append(getHm_u_EMEP());
        sb.append(", Hm_Ts=");
        sb.append(getHm_Ts());
        sb.append(", Hm_Ts_EMEP=");
        sb.append(getHm_Ts_EMEP());
        sb.append(", Hm_CO2_LI72=");
        sb.append(getHm_CO2_LI72());
        sb.append(", Hm_CO2_LI72_EMEP=");
        sb.append(getHm_CO2_LI72_EMEP());
        sb.append(", Hm_H2O_LI72=");
        sb.append(getHm_H2O_LI72());
        sb.append(", Hm_H2O_LI72_EMEP=");
        sb.append(getHm_H2O_LI72_EMEP());
        sb.append(", Hm_CH4_PICA=");
        sb.append(getHm_CH4_PICA());
        sb.append(", Hm_CH4_PICA_EMEP=");
        sb.append(getHm_CH4_PICA_EMEP());
        sb.append(", Hm_H2O_PICA=");
        sb.append(getHm_H2O_PICA());
        sb.append(", Hm_H2O_PICA_EMEP=");
        sb.append(getHm_H2O_PICA_EMEP());
        sb.append(", Hv_u=");
        sb.append(getHv_u());
        sb.append(", Hv_u_EMEP=");
        sb.append(getHv_u_EMEP());
        sb.append(", Hv_Ts=");
        sb.append(getHv_Ts());
        sb.append(", Hv_Ts_EMEP=");
        sb.append(getHv_Ts_EMEP());
        sb.append(", Hv_CO2_LI72=");
        sb.append(getHv_CO2_LI72());
        sb.append(", Hv_CO2_LI72_EMEP=");
        sb.append(getHv_CO2_LI72_EMEP());
        sb.append(", Hv_H2O_LI72=");
        sb.append(getHv_H2O_LI72());
        sb.append(", Hv_H2O_LI72_EMEP=");
        sb.append(getHv_H2O_LI72_EMEP());
        sb.append(", Hv_CH4_PICA=");
        sb.append(getHv_CH4_PICA());
        sb.append(", Hv_CH4_PICA_EMEP=");
        sb.append(getHv_CH4_PICA_EMEP());
        sb.append(", Hv_H2O_PICA=");
        sb.append(getHv_H2O_PICA());
        sb.append(", Hv_H2O_PICA_EMEP=");
        sb.append(getHv_H2O_PICA_EMEP());
        sb.append(", fpr_x_peak=");
        sb.append(getFpr_x_peak());
        sb.append(", fpr_x_peak_EMEP=");
        sb.append(getFpr_x_peak_EMEP());
        sb.append(", fpr_x_80=");
        sb.append(getFpr_x_80());
        sb.append(", fpr_x_80_EMEP=");
        sb.append(getFpr_x_80_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(895);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.kvjEddy");
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
            "<column><column-name>Qc_H</column-name><column-value><![CDATA[");
        sb.append(getQc_H());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H_EMEP());
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
            "<column><column-name>Qc_tau</column-name><column-value><![CDATA[");
        sb.append(getQc_tau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_EMEP());
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
            "<column><column-name>err_packet</column-name><column-value><![CDATA[");
        sb.append(getErr_packet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_EMEP</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getQc_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getF_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getQc_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getQc_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getQc_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_LI72</column-name><column-value><![CDATA[");
        sb.append(getLE_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_PICA</column-name><column-value><![CDATA[");
        sb.append(getLE_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_PICA_EMEP());
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
            "<column><column-name>av_c_LI72</column-name><column-value><![CDATA[");
        sb.append(getAv_c_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_LI72</column-name><column-value><![CDATA[");
        sb.append(getAv_h_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_PICA</column-name><column-value><![CDATA[");
        sb.append(getAv_h_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_h_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_h_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CH4</column-name><column-value><![CDATA[");
        sb.append(getAv_CH4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CH4_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_CH4_EMEP());
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
            "<column><column-name>std_c_LI72</column-name><column-value><![CDATA[");
        sb.append(getStd_c_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_LI72</column-name><column-value><![CDATA[");
        sb.append(getStd_h_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_PICA</column-name><column-value><![CDATA[");
        sb.append(getStd_h_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_h_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_h_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CH4</column-name><column-value><![CDATA[");
        sb.append(getStd_CH4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CH4_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_CH4_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta</column-name><column-value><![CDATA[");
        sb.append(getEta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getEta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta</column-name><column-value><![CDATA[");
        sb.append(getTheta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTheta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta</column-name><column-value><![CDATA[");
        sb.append(getBeta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getBeta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_u</column-name><column-value><![CDATA[");
        sb.append(getCovs_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_v</column-name><column-value><![CDATA[");
        sb.append(getCovs_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_Ts</column-name><column-value><![CDATA[");
        sb.append(getCovs_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovs_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovs_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_T_C_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovs_T_C_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_T_C_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_T_C_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_P_C_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovs_P_C_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_P_C_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_P_C_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getCovs_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getCovs_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Covs_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovs_CH4_PICA_EMEP());
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
            "<column><column-name>licor_p_av</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_av_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_av_EMEP());
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
            "<column><column-name>licor_p_std</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>licor_p_std_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLicor_p_std_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getC_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getC_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getH_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>t_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getT_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>t_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>p_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getP_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>p_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getP_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_PICA</column-name><column-value><![CDATA[");
        sb.append(getH_lag_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>h_lag_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_lag_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4_lag</column-name><column-value><![CDATA[");
        sb.append(getCH4_lag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4_lag_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCH4_lag_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_u</column-name><column-value><![CDATA[");
        sb.append(getNspikes_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_v</column-name><column-value><![CDATA[");
        sb.append(getNspikes_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_w</column-name><column-value><![CDATA[");
        sb.append(getNspikes_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_Ts</column-name><column-value><![CDATA[");
        sb.append(getNspikes_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getNspikes_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getNspikes_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_T_C_LI72</column-name><column-value><![CDATA[");
        sb.append(getNspikes_T_C_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_T_C_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_T_C_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_P_C_LI72</column-name><column-value><![CDATA[");
        sb.append(getNspikes_P_C_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_P_C_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_P_C_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getNspikes_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getNspikes_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Nspikes_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNspikes_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_u</column-name><column-value><![CDATA[");
        sb.append(getFI_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_Ts</column-name><column-value><![CDATA[");
        sb.append(getFI_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getFI_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getFI_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getFI_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getFI_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FI_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFI_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_u</column-name><column-value><![CDATA[");
        sb.append(getFST_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_Ts</column-name><column-value><![CDATA[");
        sb.append(getFST_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getFST_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getFST_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getFST_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getFST_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_u</column-name><column-value><![CDATA[");
        sb.append(getRFE_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_Ts</column-name><column-value><![CDATA[");
        sb.append(getRFE_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getRFE_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getRFE_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getRFE_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getRFE_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RFE_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRFE_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_u</column-name><column-value><![CDATA[");
        sb.append(getFA_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_v</column-name><column-value><![CDATA[");
        sb.append(getFA_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_Ts</column-name><column-value><![CDATA[");
        sb.append(getFA_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getFA_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getFA_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getFA_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getFA_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FA_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFA_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_u</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_v</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_Ts</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>covsvar_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCovsvar_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_u</column-name><column-value><![CDATA[");
        sb.append(getSKx_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_v</column-name><column-value><![CDATA[");
        sb.append(getSKx_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_w</column-name><column-value><![CDATA[");
        sb.append(getSKx_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_Ts</column-name><column-value><![CDATA[");
        sb.append(getSKx_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getSKx_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getSKx_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getSKx_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getSKx_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SKx_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getSKx_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_u</column-name><column-value><![CDATA[");
        sb.append(getKUx_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_v</column-name><column-value><![CDATA[");
        sb.append(getKUx_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_w</column-name><column-value><![CDATA[");
        sb.append(getKUx_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_Ts</column-name><column-value><![CDATA[");
        sb.append(getKUx_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getKUx_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getKUx_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getKUx_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getKUx_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KUx_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getKUx_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_u</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_Ts</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>overall_qflag_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getOverall_qflag_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_w</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_u</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_Ts</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ITC_qflag_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getITC_qflag_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_u</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_Ts</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FST_qflag_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFST_qflag_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_u</column-name><column-value><![CDATA[");
        sb.append(getHm_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_Ts</column-name><column-value><![CDATA[");
        sb.append(getHm_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getHm_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getHm_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getHm_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getHm_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hm_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHm_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_u</column-name><column-value><![CDATA[");
        sb.append(getHv_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_Ts</column-name><column-value><![CDATA[");
        sb.append(getHv_Ts());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_Ts_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_Ts_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_CO2_LI72</column-name><column-value><![CDATA[");
        sb.append(getHv_CO2_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_CO2_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_CO2_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getHv_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_CH4_PICA</column-name><column-value><![CDATA[");
        sb.append(getHv_CH4_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_CH4_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_CH4_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_H2O_PICA</column-name><column-value><![CDATA[");
        sb.append(getHv_H2O_PICA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Hv_H2O_PICA_EMEP</column-name><column-value><![CDATA[");
        sb.append(getHv_H2O_PICA_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fpr_x_peak</column-name><column-value><![CDATA[");
        sb.append(getFpr_x_peak());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fpr_x_peak_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFpr_x_peak_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fpr_x_80</column-name><column-value><![CDATA[");
        sb.append(getFpr_x_80());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fpr_x_80_EMEP</column-name><column-value><![CDATA[");
        sb.append(getFpr_x_80_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
