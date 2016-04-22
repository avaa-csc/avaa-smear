package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Sii1metaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Sii1metaClp extends BaseModelImpl<Sii1meta> implements Sii1meta {
    private Date _samptime;
    private float _T_a;
    private int _T_a_EMEP;
    private float _RH;
    private int _RH_EMEP;
    private float _PAR;
    private int _PAR_EMEP;
    private float _R_PAR;
    private int _R_PAR_EMEP;
    private float _Net_CNR4;
    private int _Net_CNR4_EMEP;
    private float _Net_NRLite;
    private int _Net_NRLite_EMEP;
    private float _Wsoil_1;
    private int _Wsoil_1_EMEP;
    private float _Wsoil_2;
    private int _Wsoil_2_EMEP;
    private float _T_p_B5;
    private int _T_p_B5_EMEP;
    private float _T_p_B20;
    private int _T_p_B20_EMEP;
    private float _T_p_B35;
    private int _T_p_B35_EMEP;
    private float _T_p_B50;
    private int _T_p_B50_EMEP;
    private float _T_p_C1;
    private int _T_p_C1_EMEP;
    private float _T_p_C2;
    private int _T_p_C2_EMEP;
    private float _T_p_C5;
    private int _T_p_C5_EMEP;
    private float _T_p_C10;
    private int _T_p_C10_EMEP;
    private float _T_p_C15;
    private int _T_p_C15_EMEP;
    private float _T_p_C20;
    private int _T_p_C20_EMEP;
    private float _T_p_C30;
    private int _T_p_C30_EMEP;
    private float _T_p_C50;
    private int _T_p_C50_EMEP;
    private float _T_p_C70;
    private int _T_p_C70_EMEP;
    private float _T_p_C100;
    private int _T_p_C100_EMEP;
    private float _WTD;
    private int _WTD_EMEP;
    private float _Precip;
    private int _Precip_EMEP;
    private BaseModel<?> _sii1metaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Sii1metaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Sii1meta.class;
    }

    @Override
    public String getModelClassName() {
        return Sii1meta.class.getName();
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
        attributes.put("T_a", getT_a());
        attributes.put("T_a_EMEP", getT_a_EMEP());
        attributes.put("RH", getRH());
        attributes.put("RH_EMEP", getRH_EMEP());
        attributes.put("PAR", getPAR());
        attributes.put("PAR_EMEP", getPAR_EMEP());
        attributes.put("R_PAR", getR_PAR());
        attributes.put("R_PAR_EMEP", getR_PAR_EMEP());
        attributes.put("Net_CNR4", getNet_CNR4());
        attributes.put("Net_CNR4_EMEP", getNet_CNR4_EMEP());
        attributes.put("Net_NRLite", getNet_NRLite());
        attributes.put("Net_NRLite_EMEP", getNet_NRLite_EMEP());
        attributes.put("Wsoil_1", getWsoil_1());
        attributes.put("Wsoil_1_EMEP", getWsoil_1_EMEP());
        attributes.put("Wsoil_2", getWsoil_2());
        attributes.put("Wsoil_2_EMEP", getWsoil_2_EMEP());
        attributes.put("T_p_B5", getT_p_B5());
        attributes.put("T_p_B5_EMEP", getT_p_B5_EMEP());
        attributes.put("T_p_B20", getT_p_B20());
        attributes.put("T_p_B20_EMEP", getT_p_B20_EMEP());
        attributes.put("T_p_B35", getT_p_B35());
        attributes.put("T_p_B35_EMEP", getT_p_B35_EMEP());
        attributes.put("T_p_B50", getT_p_B50());
        attributes.put("T_p_B50_EMEP", getT_p_B50_EMEP());
        attributes.put("T_p_C1", getT_p_C1());
        attributes.put("T_p_C1_EMEP", getT_p_C1_EMEP());
        attributes.put("T_p_C2", getT_p_C2());
        attributes.put("T_p_C2_EMEP", getT_p_C2_EMEP());
        attributes.put("T_p_C5", getT_p_C5());
        attributes.put("T_p_C5_EMEP", getT_p_C5_EMEP());
        attributes.put("T_p_C10", getT_p_C10());
        attributes.put("T_p_C10_EMEP", getT_p_C10_EMEP());
        attributes.put("T_p_C15", getT_p_C15());
        attributes.put("T_p_C15_EMEP", getT_p_C15_EMEP());
        attributes.put("T_p_C20", getT_p_C20());
        attributes.put("T_p_C20_EMEP", getT_p_C20_EMEP());
        attributes.put("T_p_C30", getT_p_C30());
        attributes.put("T_p_C30_EMEP", getT_p_C30_EMEP());
        attributes.put("T_p_C50", getT_p_C50());
        attributes.put("T_p_C50_EMEP", getT_p_C50_EMEP());
        attributes.put("T_p_C70", getT_p_C70());
        attributes.put("T_p_C70_EMEP", getT_p_C70_EMEP());
        attributes.put("T_p_C100", getT_p_C100());
        attributes.put("T_p_C100_EMEP", getT_p_C100_EMEP());
        attributes.put("WTD", getWTD());
        attributes.put("WTD_EMEP", getWTD_EMEP());
        attributes.put("Precip", getPrecip());
        attributes.put("Precip_EMEP", getPrecip_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float T_a = (Float) attributes.get("T_a");

        if (T_a != null) {
            setT_a(T_a);
        }

        Integer T_a_EMEP = (Integer) attributes.get("T_a_EMEP");

        if (T_a_EMEP != null) {
            setT_a_EMEP(T_a_EMEP);
        }

        Float RH = (Float) attributes.get("RH");

        if (RH != null) {
            setRH(RH);
        }

        Integer RH_EMEP = (Integer) attributes.get("RH_EMEP");

        if (RH_EMEP != null) {
            setRH_EMEP(RH_EMEP);
        }

        Float PAR = (Float) attributes.get("PAR");

        if (PAR != null) {
            setPAR(PAR);
        }

        Integer PAR_EMEP = (Integer) attributes.get("PAR_EMEP");

        if (PAR_EMEP != null) {
            setPAR_EMEP(PAR_EMEP);
        }

        Float R_PAR = (Float) attributes.get("R_PAR");

        if (R_PAR != null) {
            setR_PAR(R_PAR);
        }

        Integer R_PAR_EMEP = (Integer) attributes.get("R_PAR_EMEP");

        if (R_PAR_EMEP != null) {
            setR_PAR_EMEP(R_PAR_EMEP);
        }

        Float Net_CNR4 = (Float) attributes.get("Net_CNR4");

        if (Net_CNR4 != null) {
            setNet_CNR4(Net_CNR4);
        }

        Integer Net_CNR4_EMEP = (Integer) attributes.get("Net_CNR4_EMEP");

        if (Net_CNR4_EMEP != null) {
            setNet_CNR4_EMEP(Net_CNR4_EMEP);
        }

        Float Net_NRLite = (Float) attributes.get("Net_NRLite");

        if (Net_NRLite != null) {
            setNet_NRLite(Net_NRLite);
        }

        Integer Net_NRLite_EMEP = (Integer) attributes.get("Net_NRLite_EMEP");

        if (Net_NRLite_EMEP != null) {
            setNet_NRLite_EMEP(Net_NRLite_EMEP);
        }

        Float Wsoil_1 = (Float) attributes.get("Wsoil_1");

        if (Wsoil_1 != null) {
            setWsoil_1(Wsoil_1);
        }

        Integer Wsoil_1_EMEP = (Integer) attributes.get("Wsoil_1_EMEP");

        if (Wsoil_1_EMEP != null) {
            setWsoil_1_EMEP(Wsoil_1_EMEP);
        }

        Float Wsoil_2 = (Float) attributes.get("Wsoil_2");

        if (Wsoil_2 != null) {
            setWsoil_2(Wsoil_2);
        }

        Integer Wsoil_2_EMEP = (Integer) attributes.get("Wsoil_2_EMEP");

        if (Wsoil_2_EMEP != null) {
            setWsoil_2_EMEP(Wsoil_2_EMEP);
        }

        Float T_p_B5 = (Float) attributes.get("T_p_B5");

        if (T_p_B5 != null) {
            setT_p_B5(T_p_B5);
        }

        Integer T_p_B5_EMEP = (Integer) attributes.get("T_p_B5_EMEP");

        if (T_p_B5_EMEP != null) {
            setT_p_B5_EMEP(T_p_B5_EMEP);
        }

        Float T_p_B20 = (Float) attributes.get("T_p_B20");

        if (T_p_B20 != null) {
            setT_p_B20(T_p_B20);
        }

        Integer T_p_B20_EMEP = (Integer) attributes.get("T_p_B20_EMEP");

        if (T_p_B20_EMEP != null) {
            setT_p_B20_EMEP(T_p_B20_EMEP);
        }

        Float T_p_B35 = (Float) attributes.get("T_p_B35");

        if (T_p_B35 != null) {
            setT_p_B35(T_p_B35);
        }

        Integer T_p_B35_EMEP = (Integer) attributes.get("T_p_B35_EMEP");

        if (T_p_B35_EMEP != null) {
            setT_p_B35_EMEP(T_p_B35_EMEP);
        }

        Float T_p_B50 = (Float) attributes.get("T_p_B50");

        if (T_p_B50 != null) {
            setT_p_B50(T_p_B50);
        }

        Integer T_p_B50_EMEP = (Integer) attributes.get("T_p_B50_EMEP");

        if (T_p_B50_EMEP != null) {
            setT_p_B50_EMEP(T_p_B50_EMEP);
        }

        Float T_p_C1 = (Float) attributes.get("T_p_C1");

        if (T_p_C1 != null) {
            setT_p_C1(T_p_C1);
        }

        Integer T_p_C1_EMEP = (Integer) attributes.get("T_p_C1_EMEP");

        if (T_p_C1_EMEP != null) {
            setT_p_C1_EMEP(T_p_C1_EMEP);
        }

        Float T_p_C2 = (Float) attributes.get("T_p_C2");

        if (T_p_C2 != null) {
            setT_p_C2(T_p_C2);
        }

        Integer T_p_C2_EMEP = (Integer) attributes.get("T_p_C2_EMEP");

        if (T_p_C2_EMEP != null) {
            setT_p_C2_EMEP(T_p_C2_EMEP);
        }

        Float T_p_C5 = (Float) attributes.get("T_p_C5");

        if (T_p_C5 != null) {
            setT_p_C5(T_p_C5);
        }

        Integer T_p_C5_EMEP = (Integer) attributes.get("T_p_C5_EMEP");

        if (T_p_C5_EMEP != null) {
            setT_p_C5_EMEP(T_p_C5_EMEP);
        }

        Float T_p_C10 = (Float) attributes.get("T_p_C10");

        if (T_p_C10 != null) {
            setT_p_C10(T_p_C10);
        }

        Integer T_p_C10_EMEP = (Integer) attributes.get("T_p_C10_EMEP");

        if (T_p_C10_EMEP != null) {
            setT_p_C10_EMEP(T_p_C10_EMEP);
        }

        Float T_p_C15 = (Float) attributes.get("T_p_C15");

        if (T_p_C15 != null) {
            setT_p_C15(T_p_C15);
        }

        Integer T_p_C15_EMEP = (Integer) attributes.get("T_p_C15_EMEP");

        if (T_p_C15_EMEP != null) {
            setT_p_C15_EMEP(T_p_C15_EMEP);
        }

        Float T_p_C20 = (Float) attributes.get("T_p_C20");

        if (T_p_C20 != null) {
            setT_p_C20(T_p_C20);
        }

        Integer T_p_C20_EMEP = (Integer) attributes.get("T_p_C20_EMEP");

        if (T_p_C20_EMEP != null) {
            setT_p_C20_EMEP(T_p_C20_EMEP);
        }

        Float T_p_C30 = (Float) attributes.get("T_p_C30");

        if (T_p_C30 != null) {
            setT_p_C30(T_p_C30);
        }

        Integer T_p_C30_EMEP = (Integer) attributes.get("T_p_C30_EMEP");

        if (T_p_C30_EMEP != null) {
            setT_p_C30_EMEP(T_p_C30_EMEP);
        }

        Float T_p_C50 = (Float) attributes.get("T_p_C50");

        if (T_p_C50 != null) {
            setT_p_C50(T_p_C50);
        }

        Integer T_p_C50_EMEP = (Integer) attributes.get("T_p_C50_EMEP");

        if (T_p_C50_EMEP != null) {
            setT_p_C50_EMEP(T_p_C50_EMEP);
        }

        Float T_p_C70 = (Float) attributes.get("T_p_C70");

        if (T_p_C70 != null) {
            setT_p_C70(T_p_C70);
        }

        Integer T_p_C70_EMEP = (Integer) attributes.get("T_p_C70_EMEP");

        if (T_p_C70_EMEP != null) {
            setT_p_C70_EMEP(T_p_C70_EMEP);
        }

        Float T_p_C100 = (Float) attributes.get("T_p_C100");

        if (T_p_C100 != null) {
            setT_p_C100(T_p_C100);
        }

        Integer T_p_C100_EMEP = (Integer) attributes.get("T_p_C100_EMEP");

        if (T_p_C100_EMEP != null) {
            setT_p_C100_EMEP(T_p_C100_EMEP);
        }

        Float WTD = (Float) attributes.get("WTD");

        if (WTD != null) {
            setWTD(WTD);
        }

        Integer WTD_EMEP = (Integer) attributes.get("WTD_EMEP");

        if (WTD_EMEP != null) {
            setWTD_EMEP(WTD_EMEP);
        }

        Float Precip = (Float) attributes.get("Precip");

        if (Precip != null) {
            setPrecip(Precip);
        }

        Integer Precip_EMEP = (Integer) attributes.get("Precip_EMEP");

        if (Precip_EMEP != null) {
            setPrecip_EMEP(Precip_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_sii1metaRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_a() {
        return _T_a;
    }

    @Override
    public void setT_a(float T_a) {
        _T_a = T_a;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_a", float.class);

                method.invoke(_sii1metaRemoteModel, T_a);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_a_EMEP() {
        return _T_a_EMEP;
    }

    @Override
    public void setT_a_EMEP(int T_a_EMEP) {
        _T_a_EMEP = T_a_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_a_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_a_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRH() {
        return _RH;
    }

    @Override
    public void setRH(float RH) {
        _RH = RH;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH", float.class);

                method.invoke(_sii1metaRemoteModel, RH);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRH_EMEP() {
        return _RH_EMEP;
    }

    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _RH_EMEP = RH_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, RH_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPAR() {
        return _PAR;
    }

    @Override
    public void setPAR(float PAR) {
        _PAR = PAR;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR", float.class);

                method.invoke(_sii1metaRemoteModel, PAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPAR_EMEP() {
        return _PAR_EMEP;
    }

    @Override
    public void setPAR_EMEP(int PAR_EMEP) {
        _PAR_EMEP = PAR_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, PAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getR_PAR() {
        return _R_PAR;
    }

    @Override
    public void setR_PAR(float R_PAR) {
        _R_PAR = R_PAR;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setR_PAR", float.class);

                method.invoke(_sii1metaRemoteModel, R_PAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getR_PAR_EMEP() {
        return _R_PAR_EMEP;
    }

    @Override
    public void setR_PAR_EMEP(int R_PAR_EMEP) {
        _R_PAR_EMEP = R_PAR_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setR_PAR_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, R_PAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNet_CNR4() {
        return _Net_CNR4;
    }

    @Override
    public void setNet_CNR4(float Net_CNR4) {
        _Net_CNR4 = Net_CNR4;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_CNR4", float.class);

                method.invoke(_sii1metaRemoteModel, Net_CNR4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNet_CNR4_EMEP() {
        return _Net_CNR4_EMEP;
    }

    @Override
    public void setNet_CNR4_EMEP(int Net_CNR4_EMEP) {
        _Net_CNR4_EMEP = Net_CNR4_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_CNR4_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, Net_CNR4_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNet_NRLite() {
        return _Net_NRLite;
    }

    @Override
    public void setNet_NRLite(float Net_NRLite) {
        _Net_NRLite = Net_NRLite;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_NRLite", float.class);

                method.invoke(_sii1metaRemoteModel, Net_NRLite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNet_NRLite_EMEP() {
        return _Net_NRLite_EMEP;
    }

    @Override
    public void setNet_NRLite_EMEP(int Net_NRLite_EMEP) {
        _Net_NRLite_EMEP = Net_NRLite_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_NRLite_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, Net_NRLite_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_1() {
        return _Wsoil_1;
    }

    @Override
    public void setWsoil_1(float Wsoil_1) {
        _Wsoil_1 = Wsoil_1;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_1", float.class);

                method.invoke(_sii1metaRemoteModel, Wsoil_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWsoil_1_EMEP() {
        return _Wsoil_1_EMEP;
    }

    @Override
    public void setWsoil_1_EMEP(int Wsoil_1_EMEP) {
        _Wsoil_1_EMEP = Wsoil_1_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_1_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, Wsoil_1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_2() {
        return _Wsoil_2;
    }

    @Override
    public void setWsoil_2(float Wsoil_2) {
        _Wsoil_2 = Wsoil_2;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_2", float.class);

                method.invoke(_sii1metaRemoteModel, Wsoil_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWsoil_2_EMEP() {
        return _Wsoil_2_EMEP;
    }

    @Override
    public void setWsoil_2_EMEP(int Wsoil_2_EMEP) {
        _Wsoil_2_EMEP = Wsoil_2_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_2_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, Wsoil_2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_B5() {
        return _T_p_B5;
    }

    @Override
    public void setT_p_B5(float T_p_B5) {
        _T_p_B5 = T_p_B5;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B5", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_B5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_B5_EMEP() {
        return _T_p_B5_EMEP;
    }

    @Override
    public void setT_p_B5_EMEP(int T_p_B5_EMEP) {
        _T_p_B5_EMEP = T_p_B5_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B5_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_B5_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_B20() {
        return _T_p_B20;
    }

    @Override
    public void setT_p_B20(float T_p_B20) {
        _T_p_B20 = T_p_B20;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B20", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_B20);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_B20_EMEP() {
        return _T_p_B20_EMEP;
    }

    @Override
    public void setT_p_B20_EMEP(int T_p_B20_EMEP) {
        _T_p_B20_EMEP = T_p_B20_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B20_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_B20_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_B35() {
        return _T_p_B35;
    }

    @Override
    public void setT_p_B35(float T_p_B35) {
        _T_p_B35 = T_p_B35;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B35", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_B35);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_B35_EMEP() {
        return _T_p_B35_EMEP;
    }

    @Override
    public void setT_p_B35_EMEP(int T_p_B35_EMEP) {
        _T_p_B35_EMEP = T_p_B35_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B35_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_B35_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_B50() {
        return _T_p_B50;
    }

    @Override
    public void setT_p_B50(float T_p_B50) {
        _T_p_B50 = T_p_B50;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B50", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_B50);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_B50_EMEP() {
        return _T_p_B50_EMEP;
    }

    @Override
    public void setT_p_B50_EMEP(int T_p_B50_EMEP) {
        _T_p_B50_EMEP = T_p_B50_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B50_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_B50_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C1() {
        return _T_p_C1;
    }

    @Override
    public void setT_p_C1(float T_p_C1) {
        _T_p_C1 = T_p_C1;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C1", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C1_EMEP() {
        return _T_p_C1_EMEP;
    }

    @Override
    public void setT_p_C1_EMEP(int T_p_C1_EMEP) {
        _T_p_C1_EMEP = T_p_C1_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C1_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C2() {
        return _T_p_C2;
    }

    @Override
    public void setT_p_C2(float T_p_C2) {
        _T_p_C2 = T_p_C2;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C2", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C2_EMEP() {
        return _T_p_C2_EMEP;
    }

    @Override
    public void setT_p_C2_EMEP(int T_p_C2_EMEP) {
        _T_p_C2_EMEP = T_p_C2_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C2_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C5() {
        return _T_p_C5;
    }

    @Override
    public void setT_p_C5(float T_p_C5) {
        _T_p_C5 = T_p_C5;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C5", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C5_EMEP() {
        return _T_p_C5_EMEP;
    }

    @Override
    public void setT_p_C5_EMEP(int T_p_C5_EMEP) {
        _T_p_C5_EMEP = T_p_C5_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C5_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C5_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C10() {
        return _T_p_C10;
    }

    @Override
    public void setT_p_C10(float T_p_C10) {
        _T_p_C10 = T_p_C10;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C10", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C10);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C10_EMEP() {
        return _T_p_C10_EMEP;
    }

    @Override
    public void setT_p_C10_EMEP(int T_p_C10_EMEP) {
        _T_p_C10_EMEP = T_p_C10_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C10_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C10_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C15() {
        return _T_p_C15;
    }

    @Override
    public void setT_p_C15(float T_p_C15) {
        _T_p_C15 = T_p_C15;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C15", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C15);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C15_EMEP() {
        return _T_p_C15_EMEP;
    }

    @Override
    public void setT_p_C15_EMEP(int T_p_C15_EMEP) {
        _T_p_C15_EMEP = T_p_C15_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C15_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C15_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C20() {
        return _T_p_C20;
    }

    @Override
    public void setT_p_C20(float T_p_C20) {
        _T_p_C20 = T_p_C20;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C20", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C20);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C20_EMEP() {
        return _T_p_C20_EMEP;
    }

    @Override
    public void setT_p_C20_EMEP(int T_p_C20_EMEP) {
        _T_p_C20_EMEP = T_p_C20_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C20_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C20_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C30() {
        return _T_p_C30;
    }

    @Override
    public void setT_p_C30(float T_p_C30) {
        _T_p_C30 = T_p_C30;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C30", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C30);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C30_EMEP() {
        return _T_p_C30_EMEP;
    }

    @Override
    public void setT_p_C30_EMEP(int T_p_C30_EMEP) {
        _T_p_C30_EMEP = T_p_C30_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C30_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C30_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C50() {
        return _T_p_C50;
    }

    @Override
    public void setT_p_C50(float T_p_C50) {
        _T_p_C50 = T_p_C50;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C50", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C50);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C50_EMEP() {
        return _T_p_C50_EMEP;
    }

    @Override
    public void setT_p_C50_EMEP(int T_p_C50_EMEP) {
        _T_p_C50_EMEP = T_p_C50_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C50_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C50_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C70() {
        return _T_p_C70;
    }

    @Override
    public void setT_p_C70(float T_p_C70) {
        _T_p_C70 = T_p_C70;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C70", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C70);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C70_EMEP() {
        return _T_p_C70_EMEP;
    }

    @Override
    public void setT_p_C70_EMEP(int T_p_C70_EMEP) {
        _T_p_C70_EMEP = T_p_C70_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C70_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C70_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_C100() {
        return _T_p_C100;
    }

    @Override
    public void setT_p_C100(float T_p_C100) {
        _T_p_C100 = T_p_C100;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C100", float.class);

                method.invoke(_sii1metaRemoteModel, T_p_C100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_C100_EMEP() {
        return _T_p_C100_EMEP;
    }

    @Override
    public void setT_p_C100_EMEP(int T_p_C100_EMEP) {
        _T_p_C100_EMEP = T_p_C100_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_C100_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, T_p_C100_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWTD() {
        return _WTD;
    }

    @Override
    public void setWTD(float WTD) {
        _WTD = WTD;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWTD", float.class);

                method.invoke(_sii1metaRemoteModel, WTD);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWTD_EMEP() {
        return _WTD_EMEP;
    }

    @Override
    public void setWTD_EMEP(int WTD_EMEP) {
        _WTD_EMEP = WTD_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWTD_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, WTD_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecip() {
        return _Precip;
    }

    @Override
    public void setPrecip(float Precip) {
        _Precip = Precip;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecip", float.class);

                method.invoke(_sii1metaRemoteModel, Precip);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPrecip_EMEP() {
        return _Precip_EMEP;
    }

    @Override
    public void setPrecip_EMEP(int Precip_EMEP) {
        _Precip_EMEP = Precip_EMEP;

        if (_sii1metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii1metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecip_EMEP", int.class);

                method.invoke(_sii1metaRemoteModel, Precip_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSii1metaRemoteModel() {
        return _sii1metaRemoteModel;
    }

    public void setSii1metaRemoteModel(BaseModel<?> sii1metaRemoteModel) {
        _sii1metaRemoteModel = sii1metaRemoteModel;
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

        Class<?> remoteModelClass = _sii1metaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_sii1metaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Sii1metaLocalServiceUtil.addSii1meta(this);
        } else {
            Sii1metaLocalServiceUtil.updateSii1meta(this);
        }
    }

    @Override
    public Sii1meta toEscapedModel() {
        return (Sii1meta) ProxyUtil.newProxyInstance(Sii1meta.class.getClassLoader(),
            new Class[] { Sii1meta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Sii1metaClp clone = new Sii1metaClp();

        clone.setSamptime(getSamptime());
        clone.setT_a(getT_a());
        clone.setT_a_EMEP(getT_a_EMEP());
        clone.setRH(getRH());
        clone.setRH_EMEP(getRH_EMEP());
        clone.setPAR(getPAR());
        clone.setPAR_EMEP(getPAR_EMEP());
        clone.setR_PAR(getR_PAR());
        clone.setR_PAR_EMEP(getR_PAR_EMEP());
        clone.setNet_CNR4(getNet_CNR4());
        clone.setNet_CNR4_EMEP(getNet_CNR4_EMEP());
        clone.setNet_NRLite(getNet_NRLite());
        clone.setNet_NRLite_EMEP(getNet_NRLite_EMEP());
        clone.setWsoil_1(getWsoil_1());
        clone.setWsoil_1_EMEP(getWsoil_1_EMEP());
        clone.setWsoil_2(getWsoil_2());
        clone.setWsoil_2_EMEP(getWsoil_2_EMEP());
        clone.setT_p_B5(getT_p_B5());
        clone.setT_p_B5_EMEP(getT_p_B5_EMEP());
        clone.setT_p_B20(getT_p_B20());
        clone.setT_p_B20_EMEP(getT_p_B20_EMEP());
        clone.setT_p_B35(getT_p_B35());
        clone.setT_p_B35_EMEP(getT_p_B35_EMEP());
        clone.setT_p_B50(getT_p_B50());
        clone.setT_p_B50_EMEP(getT_p_B50_EMEP());
        clone.setT_p_C1(getT_p_C1());
        clone.setT_p_C1_EMEP(getT_p_C1_EMEP());
        clone.setT_p_C2(getT_p_C2());
        clone.setT_p_C2_EMEP(getT_p_C2_EMEP());
        clone.setT_p_C5(getT_p_C5());
        clone.setT_p_C5_EMEP(getT_p_C5_EMEP());
        clone.setT_p_C10(getT_p_C10());
        clone.setT_p_C10_EMEP(getT_p_C10_EMEP());
        clone.setT_p_C15(getT_p_C15());
        clone.setT_p_C15_EMEP(getT_p_C15_EMEP());
        clone.setT_p_C20(getT_p_C20());
        clone.setT_p_C20_EMEP(getT_p_C20_EMEP());
        clone.setT_p_C30(getT_p_C30());
        clone.setT_p_C30_EMEP(getT_p_C30_EMEP());
        clone.setT_p_C50(getT_p_C50());
        clone.setT_p_C50_EMEP(getT_p_C50_EMEP());
        clone.setT_p_C70(getT_p_C70());
        clone.setT_p_C70_EMEP(getT_p_C70_EMEP());
        clone.setT_p_C100(getT_p_C100());
        clone.setT_p_C100_EMEP(getT_p_C100_EMEP());
        clone.setWTD(getWTD());
        clone.setWTD_EMEP(getWTD_EMEP());
        clone.setPrecip(getPrecip());
        clone.setPrecip_EMEP(getPrecip_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Sii1meta sii1meta) {
        java.util.Date primaryKey = sii1meta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii1metaClp)) {
            return false;
        }

        Sii1metaClp sii1meta = (Sii1metaClp) obj;

        java.util.Date primaryKey = sii1meta.getPrimaryKey();

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
        StringBundler sb = new StringBundler(99);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", T_a=");
        sb.append(getT_a());
        sb.append(", T_a_EMEP=");
        sb.append(getT_a_EMEP());
        sb.append(", RH=");
        sb.append(getRH());
        sb.append(", RH_EMEP=");
        sb.append(getRH_EMEP());
        sb.append(", PAR=");
        sb.append(getPAR());
        sb.append(", PAR_EMEP=");
        sb.append(getPAR_EMEP());
        sb.append(", R_PAR=");
        sb.append(getR_PAR());
        sb.append(", R_PAR_EMEP=");
        sb.append(getR_PAR_EMEP());
        sb.append(", Net_CNR4=");
        sb.append(getNet_CNR4());
        sb.append(", Net_CNR4_EMEP=");
        sb.append(getNet_CNR4_EMEP());
        sb.append(", Net_NRLite=");
        sb.append(getNet_NRLite());
        sb.append(", Net_NRLite_EMEP=");
        sb.append(getNet_NRLite_EMEP());
        sb.append(", Wsoil_1=");
        sb.append(getWsoil_1());
        sb.append(", Wsoil_1_EMEP=");
        sb.append(getWsoil_1_EMEP());
        sb.append(", Wsoil_2=");
        sb.append(getWsoil_2());
        sb.append(", Wsoil_2_EMEP=");
        sb.append(getWsoil_2_EMEP());
        sb.append(", T_p_B5=");
        sb.append(getT_p_B5());
        sb.append(", T_p_B5_EMEP=");
        sb.append(getT_p_B5_EMEP());
        sb.append(", T_p_B20=");
        sb.append(getT_p_B20());
        sb.append(", T_p_B20_EMEP=");
        sb.append(getT_p_B20_EMEP());
        sb.append(", T_p_B35=");
        sb.append(getT_p_B35());
        sb.append(", T_p_B35_EMEP=");
        sb.append(getT_p_B35_EMEP());
        sb.append(", T_p_B50=");
        sb.append(getT_p_B50());
        sb.append(", T_p_B50_EMEP=");
        sb.append(getT_p_B50_EMEP());
        sb.append(", T_p_C1=");
        sb.append(getT_p_C1());
        sb.append(", T_p_C1_EMEP=");
        sb.append(getT_p_C1_EMEP());
        sb.append(", T_p_C2=");
        sb.append(getT_p_C2());
        sb.append(", T_p_C2_EMEP=");
        sb.append(getT_p_C2_EMEP());
        sb.append(", T_p_C5=");
        sb.append(getT_p_C5());
        sb.append(", T_p_C5_EMEP=");
        sb.append(getT_p_C5_EMEP());
        sb.append(", T_p_C10=");
        sb.append(getT_p_C10());
        sb.append(", T_p_C10_EMEP=");
        sb.append(getT_p_C10_EMEP());
        sb.append(", T_p_C15=");
        sb.append(getT_p_C15());
        sb.append(", T_p_C15_EMEP=");
        sb.append(getT_p_C15_EMEP());
        sb.append(", T_p_C20=");
        sb.append(getT_p_C20());
        sb.append(", T_p_C20_EMEP=");
        sb.append(getT_p_C20_EMEP());
        sb.append(", T_p_C30=");
        sb.append(getT_p_C30());
        sb.append(", T_p_C30_EMEP=");
        sb.append(getT_p_C30_EMEP());
        sb.append(", T_p_C50=");
        sb.append(getT_p_C50());
        sb.append(", T_p_C50_EMEP=");
        sb.append(getT_p_C50_EMEP());
        sb.append(", T_p_C70=");
        sb.append(getT_p_C70());
        sb.append(", T_p_C70_EMEP=");
        sb.append(getT_p_C70_EMEP());
        sb.append(", T_p_C100=");
        sb.append(getT_p_C100());
        sb.append(", T_p_C100_EMEP=");
        sb.append(getT_p_C100_EMEP());
        sb.append(", WTD=");
        sb.append(getWTD());
        sb.append(", WTD_EMEP=");
        sb.append(getWTD_EMEP());
        sb.append(", Precip=");
        sb.append(getPrecip());
        sb.append(", Precip_EMEP=");
        sb.append(getPrecip_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(151);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Sii1meta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_a</column-name><column-value><![CDATA[");
        sb.append(getT_a());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_a_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_a_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH</column-name><column-value><![CDATA[");
        sb.append(getRH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRH_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR</column-name><column-value><![CDATA[");
        sb.append(getPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>R_PAR</column-name><column-value><![CDATA[");
        sb.append(getR_PAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>R_PAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getR_PAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_CNR4</column-name><column-value><![CDATA[");
        sb.append(getNet_CNR4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_CNR4_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNet_CNR4_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_NRLite</column-name><column-value><![CDATA[");
        sb.append(getNet_NRLite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_NRLite_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNet_NRLite_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Wsoil_1</column-name><column-value><![CDATA[");
        sb.append(getWsoil_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Wsoil_1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWsoil_1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Wsoil_2</column-name><column-value><![CDATA[");
        sb.append(getWsoil_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Wsoil_2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWsoil_2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B5</column-name><column-value><![CDATA[");
        sb.append(getT_p_B5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B5_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B5_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B20</column-name><column-value><![CDATA[");
        sb.append(getT_p_B20());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B20_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B20_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B35</column-name><column-value><![CDATA[");
        sb.append(getT_p_B35());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B35_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B35_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B50</column-name><column-value><![CDATA[");
        sb.append(getT_p_B50());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B50_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B50_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C1</column-name><column-value><![CDATA[");
        sb.append(getT_p_C1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C2</column-name><column-value><![CDATA[");
        sb.append(getT_p_C2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C5</column-name><column-value><![CDATA[");
        sb.append(getT_p_C5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C5_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C5_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C10</column-name><column-value><![CDATA[");
        sb.append(getT_p_C10());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C10_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C10_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C15</column-name><column-value><![CDATA[");
        sb.append(getT_p_C15());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C15_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C15_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C20</column-name><column-value><![CDATA[");
        sb.append(getT_p_C20());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C20_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C20_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C30</column-name><column-value><![CDATA[");
        sb.append(getT_p_C30());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C30_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C30_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C50</column-name><column-value><![CDATA[");
        sb.append(getT_p_C50());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C50_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C50_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C70</column-name><column-value><![CDATA[");
        sb.append(getT_p_C70());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C70_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C70_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C100</column-name><column-value><![CDATA[");
        sb.append(getT_p_C100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_C100_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_C100_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WTD</column-name><column-value><![CDATA[");
        sb.append(getWTD());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WTD_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWTD_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precip</column-name><column-value><![CDATA[");
        sb.append(getPrecip());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precip_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPrecip_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
