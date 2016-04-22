package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.HyyAeroLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class HyyAeroClp extends BaseModelImpl<HyyAero> implements HyyAero {
    private Date _samptime;
    private float _cn;
    private float _cn_t;
    private float _cn_p;
    private BaseModel<?> _hyyAeroRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public HyyAeroClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return HyyAero.class;
    }

    @Override
    public String getModelClassName() {
        return HyyAero.class.getName();
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
        attributes.put("cn", getCn());
        attributes.put("cn_t", getCn_t());
        attributes.put("cn_p", getCn_p());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float cn = (Float) attributes.get("cn");

        if (cn != null) {
            setCn(cn);
        }

        Float cn_t = (Float) attributes.get("cn_t");

        if (cn_t != null) {
            setCn_t(cn_t);
        }

        Float cn_p = (Float) attributes.get("cn_p");

        if (cn_p != null) {
            setCn_p(cn_p);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_hyyAeroRemoteModel != null) {
            try {
                Class<?> clazz = _hyyAeroRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_hyyAeroRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCn() {
        return _cn;
    }

    @Override
    public void setCn(float cn) {
        _cn = cn;

        if (_hyyAeroRemoteModel != null) {
            try {
                Class<?> clazz = _hyyAeroRemoteModel.getClass();

                Method method = clazz.getMethod("setCn", float.class);

                method.invoke(_hyyAeroRemoteModel, cn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCn_t() {
        return _cn_t;
    }

    @Override
    public void setCn_t(float cn_t) {
        _cn_t = cn_t;

        if (_hyyAeroRemoteModel != null) {
            try {
                Class<?> clazz = _hyyAeroRemoteModel.getClass();

                Method method = clazz.getMethod("setCn_t", float.class);

                method.invoke(_hyyAeroRemoteModel, cn_t);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCn_p() {
        return _cn_p;
    }

    @Override
    public void setCn_p(float cn_p) {
        _cn_p = cn_p;

        if (_hyyAeroRemoteModel != null) {
            try {
                Class<?> clazz = _hyyAeroRemoteModel.getClass();

                Method method = clazz.getMethod("setCn_p", float.class);

                method.invoke(_hyyAeroRemoteModel, cn_p);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHyyAeroRemoteModel() {
        return _hyyAeroRemoteModel;
    }

    public void setHyyAeroRemoteModel(BaseModel<?> hyyAeroRemoteModel) {
        _hyyAeroRemoteModel = hyyAeroRemoteModel;
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

        Class<?> remoteModelClass = _hyyAeroRemoteModel.getClass();

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

        Object returnValue = method.invoke(_hyyAeroRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HyyAeroLocalServiceUtil.addHyyAero(this);
        } else {
            HyyAeroLocalServiceUtil.updateHyyAero(this);
        }
    }

    @Override
    public HyyAero toEscapedModel() {
        return (HyyAero) ProxyUtil.newProxyInstance(HyyAero.class.getClassLoader(),
            new Class[] { HyyAero.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HyyAeroClp clone = new HyyAeroClp();

        clone.setSamptime(getSamptime());
        clone.setCn(getCn());
        clone.setCn_t(getCn_t());
        clone.setCn_p(getCn_p());

        return clone;
    }

    @Override
    public int compareTo(HyyAero hyyAero) {
        java.util.Date primaryKey = hyyAero.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyAeroClp)) {
            return false;
        }

        HyyAeroClp hyyAero = (HyyAeroClp) obj;

        java.util.Date primaryKey = hyyAero.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", cn=");
        sb.append(getCn());
        sb.append(", cn_t=");
        sb.append(getCn_t());
        sb.append(", cn_p=");
        sb.append(getCn_p());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.HyyAero");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cn</column-name><column-value><![CDATA[");
        sb.append(getCn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cn_t</column-name><column-value><![CDATA[");
        sb.append(getCn_t());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cn_p</column-name><column-value><![CDATA[");
        sb.append(getCn_p());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
