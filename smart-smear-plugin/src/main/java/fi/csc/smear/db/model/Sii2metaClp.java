package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Sii2metaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Sii2metaClp extends BaseModelImpl<Sii2meta> implements Sii2meta {
    private Date _samptime;
    private float _T_a;
    private int _T_a_EMEP;
    private float _RH;
    private int _RH_EMEP;
    private float _Net;
    private int _Net_EMEP;
    private float _T_p_5;
    private int _T_p_5_EMEP;
    private float _T_p_B20;
    private int _T_p_B20_EMEP;
    private float _T_p_B35;
    private int _T_p_B35_EMEP;
    private float _T_p_B50;
    private int _T_p_B50_EMEP;
    private float _WTD;
    private int _WTD_EMEP;
    private float _Precip;
    private int _Precip_EMEP;
    private BaseModel<?> _sii2metaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Sii2metaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Sii2meta.class;
    }

    @Override
    public String getModelClassName() {
        return Sii2meta.class.getName();
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
        attributes.put("Net", getNet());
        attributes.put("Net_EMEP", getNet_EMEP());
        attributes.put("T_p_5", getT_p_5());
        attributes.put("T_p_5_EMEP", getT_p_5_EMEP());
        attributes.put("T_p_B20", getT_p_B20());
        attributes.put("T_p_B20_EMEP", getT_p_B20_EMEP());
        attributes.put("T_p_B35", getT_p_B35());
        attributes.put("T_p_B35_EMEP", getT_p_B35_EMEP());
        attributes.put("T_p_B50", getT_p_B50());
        attributes.put("T_p_B50_EMEP", getT_p_B50_EMEP());
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

        Float Net = (Float) attributes.get("Net");

        if (Net != null) {
            setNet(Net);
        }

        Integer Net_EMEP = (Integer) attributes.get("Net_EMEP");

        if (Net_EMEP != null) {
            setNet_EMEP(Net_EMEP);
        }

        Float T_p_5 = (Float) attributes.get("T_p_5");

        if (T_p_5 != null) {
            setT_p_5(T_p_5);
        }

        Integer T_p_5_EMEP = (Integer) attributes.get("T_p_5_EMEP");

        if (T_p_5_EMEP != null) {
            setT_p_5_EMEP(T_p_5_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_sii2metaRemoteModel, samptime);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_a", float.class);

                method.invoke(_sii2metaRemoteModel, T_a);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_a_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, T_a_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH", float.class);

                method.invoke(_sii2metaRemoteModel, RH);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, RH_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNet() {
        return _Net;
    }

    @Override
    public void setNet(float Net) {
        _Net = Net;

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet", float.class);

                method.invoke(_sii2metaRemoteModel, Net);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNet_EMEP() {
        return _Net_EMEP;
    }

    @Override
    public void setNet_EMEP(int Net_EMEP) {
        _Net_EMEP = Net_EMEP;

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, Net_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_p_5() {
        return _T_p_5;
    }

    @Override
    public void setT_p_5(float T_p_5) {
        _T_p_5 = T_p_5;

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_5", float.class);

                method.invoke(_sii2metaRemoteModel, T_p_5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_p_5_EMEP() {
        return _T_p_5_EMEP;
    }

    @Override
    public void setT_p_5_EMEP(int T_p_5_EMEP) {
        _T_p_5_EMEP = T_p_5_EMEP;

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_5_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, T_p_5_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B20", float.class);

                method.invoke(_sii2metaRemoteModel, T_p_B20);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B20_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, T_p_B20_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B35", float.class);

                method.invoke(_sii2metaRemoteModel, T_p_B35);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B35_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, T_p_B35_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B50", float.class);

                method.invoke(_sii2metaRemoteModel, T_p_B50);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setT_p_B50_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, T_p_B50_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWTD", float.class);

                method.invoke(_sii2metaRemoteModel, WTD);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setWTD_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, WTD_EMEP);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecip", float.class);

                method.invoke(_sii2metaRemoteModel, Precip);
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

        if (_sii2metaRemoteModel != null) {
            try {
                Class<?> clazz = _sii2metaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecip_EMEP", int.class);

                method.invoke(_sii2metaRemoteModel, Precip_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSii2metaRemoteModel() {
        return _sii2metaRemoteModel;
    }

    public void setSii2metaRemoteModel(BaseModel<?> sii2metaRemoteModel) {
        _sii2metaRemoteModel = sii2metaRemoteModel;
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

        Class<?> remoteModelClass = _sii2metaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_sii2metaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Sii2metaLocalServiceUtil.addSii2meta(this);
        } else {
            Sii2metaLocalServiceUtil.updateSii2meta(this);
        }
    }

    @Override
    public Sii2meta toEscapedModel() {
        return (Sii2meta) ProxyUtil.newProxyInstance(Sii2meta.class.getClassLoader(),
            new Class[] { Sii2meta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Sii2metaClp clone = new Sii2metaClp();

        clone.setSamptime(getSamptime());
        clone.setT_a(getT_a());
        clone.setT_a_EMEP(getT_a_EMEP());
        clone.setRH(getRH());
        clone.setRH_EMEP(getRH_EMEP());
        clone.setNet(getNet());
        clone.setNet_EMEP(getNet_EMEP());
        clone.setT_p_5(getT_p_5());
        clone.setT_p_5_EMEP(getT_p_5_EMEP());
        clone.setT_p_B20(getT_p_B20());
        clone.setT_p_B20_EMEP(getT_p_B20_EMEP());
        clone.setT_p_B35(getT_p_B35());
        clone.setT_p_B35_EMEP(getT_p_B35_EMEP());
        clone.setT_p_B50(getT_p_B50());
        clone.setT_p_B50_EMEP(getT_p_B50_EMEP());
        clone.setWTD(getWTD());
        clone.setWTD_EMEP(getWTD_EMEP());
        clone.setPrecip(getPrecip());
        clone.setPrecip_EMEP(getPrecip_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Sii2meta sii2meta) {
        java.util.Date primaryKey = sii2meta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii2metaClp)) {
            return false;
        }

        Sii2metaClp sii2meta = (Sii2metaClp) obj;

        java.util.Date primaryKey = sii2meta.getPrimaryKey();

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
        StringBundler sb = new StringBundler(39);

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
        sb.append(", Net=");
        sb.append(getNet());
        sb.append(", Net_EMEP=");
        sb.append(getNet_EMEP());
        sb.append(", T_p_5=");
        sb.append(getT_p_5());
        sb.append(", T_p_5_EMEP=");
        sb.append(getT_p_5_EMEP());
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
        StringBundler sb = new StringBundler(61);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Sii2meta");
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
            "<column><column-name>Net</column-name><column-value><![CDATA[");
        sb.append(getNet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_5</column-name><column-value><![CDATA[");
        sb.append(getT_p_5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_5_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_5_EMEP());
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
