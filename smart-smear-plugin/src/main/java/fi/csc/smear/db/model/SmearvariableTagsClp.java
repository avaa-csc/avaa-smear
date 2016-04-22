package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearvariableTagsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SmearvariableTagsClp extends BaseModelImpl<SmearvariableTags>
    implements SmearvariableTags {
    private long _tagID;
    private long _variableID;
    private BaseModel<?> _smearvariableTagsRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearvariableTagsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearvariableTags.class;
    }

    @Override
    public String getModelClassName() {
        return SmearvariableTags.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _variableID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setVariableID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _variableID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tagID", getTagID());
        attributes.put("variableID", getVariableID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tagID = (Long) attributes.get("tagID");

        if (tagID != null) {
            setTagID(tagID);
        }

        Long variableID = (Long) attributes.get("variableID");

        if (variableID != null) {
            setVariableID(variableID);
        }
    }

    @Override
    public long getTagID() {
        return _tagID;
    }

    @Override
    public void setTagID(long tagID) {
        _tagID = tagID;

        if (_smearvariableTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearvariableTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setTagID", long.class);

                method.invoke(_smearvariableTagsRemoteModel, tagID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getVariableID() {
        return _variableID;
    }

    @Override
    public void setVariableID(long variableID) {
        _variableID = variableID;

        if (_smearvariableTagsRemoteModel != null) {
            try {
                Class<?> clazz = _smearvariableTagsRemoteModel.getClass();

                Method method = clazz.getMethod("setVariableID", long.class);

                method.invoke(_smearvariableTagsRemoteModel, variableID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearvariableTagsRemoteModel() {
        return _smearvariableTagsRemoteModel;
    }

    public void setSmearvariableTagsRemoteModel(
        BaseModel<?> smearvariableTagsRemoteModel) {
        _smearvariableTagsRemoteModel = smearvariableTagsRemoteModel;
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

        Class<?> remoteModelClass = _smearvariableTagsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearvariableTagsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearvariableTagsLocalServiceUtil.addSmearvariableTags(this);
        } else {
            SmearvariableTagsLocalServiceUtil.updateSmearvariableTags(this);
        }
    }

    @Override
    public SmearvariableTags toEscapedModel() {
        return (SmearvariableTags) ProxyUtil.newProxyInstance(SmearvariableTags.class.getClassLoader(),
            new Class[] { SmearvariableTags.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearvariableTagsClp clone = new SmearvariableTagsClp();

        clone.setTagID(getTagID());
        clone.setVariableID(getVariableID());

        return clone;
    }

    @Override
    public int compareTo(SmearvariableTags smearvariableTags) {
        long primaryKey = smearvariableTags.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearvariableTagsClp)) {
            return false;
        }

        SmearvariableTagsClp smearvariableTags = (SmearvariableTagsClp) obj;

        long primaryKey = smearvariableTags.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
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
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{tagID=");
        sb.append(getTagID());
        sb.append(", variableID=");
        sb.append(getVariableID());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearvariableTags");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>tagID</column-name><column-value><![CDATA[");
        sb.append(getTagID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>variableID</column-name><column-value><![CDATA[");
        sb.append(getVariableID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
