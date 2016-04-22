package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil;
import fi.csc.smear.db.service.persistence.SmearvariableEventPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SmearvariableEventClp extends BaseModelImpl<SmearvariableEvent>
    implements SmearvariableEvent {
    private long _eventID;
    private long _variableID;
    private BaseModel<?> _smearvariableEventRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearvariableEventClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearvariableEvent.class;
    }

    @Override
    public String getModelClassName() {
        return SmearvariableEvent.class.getName();
    }

    @Override
    public SmearvariableEventPK getPrimaryKey() {
        return new SmearvariableEventPK(_eventID, _variableID);
    }

    @Override
    public void setPrimaryKey(SmearvariableEventPK primaryKey) {
        setEventID(primaryKey.eventID);
        setVariableID(primaryKey.variableID);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new SmearvariableEventPK(_eventID, _variableID);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((SmearvariableEventPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("eventID", getEventID());
        attributes.put("variableID", getVariableID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long eventID = (Long) attributes.get("eventID");

        if (eventID != null) {
            setEventID(eventID);
        }

        Long variableID = (Long) attributes.get("variableID");

        if (variableID != null) {
            setVariableID(variableID);
        }
    }

    @Override
    public long getEventID() {
        return _eventID;
    }

    @Override
    public void setEventID(long eventID) {
        _eventID = eventID;

        if (_smearvariableEventRemoteModel != null) {
            try {
                Class<?> clazz = _smearvariableEventRemoteModel.getClass();

                Method method = clazz.getMethod("setEventID", long.class);

                method.invoke(_smearvariableEventRemoteModel, eventID);
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

        if (_smearvariableEventRemoteModel != null) {
            try {
                Class<?> clazz = _smearvariableEventRemoteModel.getClass();

                Method method = clazz.getMethod("setVariableID", long.class);

                method.invoke(_smearvariableEventRemoteModel, variableID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearvariableEventRemoteModel() {
        return _smearvariableEventRemoteModel;
    }

    public void setSmearvariableEventRemoteModel(
        BaseModel<?> smearvariableEventRemoteModel) {
        _smearvariableEventRemoteModel = smearvariableEventRemoteModel;
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

        Class<?> remoteModelClass = _smearvariableEventRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearvariableEventRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearvariableEventLocalServiceUtil.addSmearvariableEvent(this);
        } else {
            SmearvariableEventLocalServiceUtil.updateSmearvariableEvent(this);
        }
    }

    @Override
    public SmearvariableEvent toEscapedModel() {
        return (SmearvariableEvent) ProxyUtil.newProxyInstance(SmearvariableEvent.class.getClassLoader(),
            new Class[] { SmearvariableEvent.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearvariableEventClp clone = new SmearvariableEventClp();

        clone.setEventID(getEventID());
        clone.setVariableID(getVariableID());

        return clone;
    }

    @Override
    public int compareTo(SmearvariableEvent smearvariableEvent) {
        SmearvariableEventPK primaryKey = smearvariableEvent.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearvariableEventClp)) {
            return false;
        }

        SmearvariableEventClp smearvariableEvent = (SmearvariableEventClp) obj;

        SmearvariableEventPK primaryKey = smearvariableEvent.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{eventID=");
        sb.append(getEventID());
        sb.append(", variableID=");
        sb.append(getVariableID());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearvariableEvent");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>eventID</column-name><column-value><![CDATA[");
        sb.append(getEventID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>variableID</column-name><column-value><![CDATA[");
        sb.append(getVariableID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
