package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearEventsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SmearEventsClp extends BaseModelImpl<SmearEvents>
    implements SmearEvents {
    private long _eventID;
    private String _event_type;
    private String _event;
    private String _who;
    private Date _period_start;
    private Date _period_end;
    private Date _etimestamp;
    private BaseModel<?> _smearEventsRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearEventsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearEvents.class;
    }

    @Override
    public String getModelClassName() {
        return SmearEvents.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _eventID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEventID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _eventID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("eventID", getEventID());
        attributes.put("event_type", getEvent_type());
        attributes.put("event", getEvent());
        attributes.put("who", getWho());
        attributes.put("period_start", getPeriod_start());
        attributes.put("period_end", getPeriod_end());
        attributes.put("etimestamp", getEtimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long eventID = (Long) attributes.get("eventID");

        if (eventID != null) {
            setEventID(eventID);
        }

        String event_type = (String) attributes.get("event_type");

        if (event_type != null) {
            setEvent_type(event_type);
        }

        String event = (String) attributes.get("event");

        if (event != null) {
            setEvent(event);
        }

        String who = (String) attributes.get("who");

        if (who != null) {
            setWho(who);
        }

        Date period_start = (Date) attributes.get("period_start");

        if (period_start != null) {
            setPeriod_start(period_start);
        }

        Date period_end = (Date) attributes.get("period_end");

        if (period_end != null) {
            setPeriod_end(period_end);
        }

        Date etimestamp = (Date) attributes.get("etimestamp");

        if (etimestamp != null) {
            setEtimestamp(etimestamp);
        }
    }

    @Override
    public long getEventID() {
        return _eventID;
    }

    @Override
    public void setEventID(long eventID) {
        _eventID = eventID;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setEventID", long.class);

                method.invoke(_smearEventsRemoteModel, eventID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEvent_type() {
        return _event_type;
    }

    @Override
    public void setEvent_type(String event_type) {
        _event_type = event_type;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setEvent_type", String.class);

                method.invoke(_smearEventsRemoteModel, event_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEvent() {
        return _event;
    }

    @Override
    public void setEvent(String event) {
        _event = event;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setEvent", String.class);

                method.invoke(_smearEventsRemoteModel, event);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWho() {
        return _who;
    }

    @Override
    public void setWho(String who) {
        _who = who;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setWho", String.class);

                method.invoke(_smearEventsRemoteModel, who);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPeriod_start() {
        return _period_start;
    }

    @Override
    public void setPeriod_start(Date period_start) {
        _period_start = period_start;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setPeriod_start", Date.class);

                method.invoke(_smearEventsRemoteModel, period_start);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPeriod_end() {
        return _period_end;
    }

    @Override
    public void setPeriod_end(Date period_end) {
        _period_end = period_end;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setPeriod_end", Date.class);

                method.invoke(_smearEventsRemoteModel, period_end);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEtimestamp() {
        return _etimestamp;
    }

    @Override
    public void setEtimestamp(Date etimestamp) {
        _etimestamp = etimestamp;

        if (_smearEventsRemoteModel != null) {
            try {
                Class<?> clazz = _smearEventsRemoteModel.getClass();

                Method method = clazz.getMethod("setEtimestamp", Date.class);

                method.invoke(_smearEventsRemoteModel, etimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearEventsRemoteModel() {
        return _smearEventsRemoteModel;
    }

    public void setSmearEventsRemoteModel(BaseModel<?> smearEventsRemoteModel) {
        _smearEventsRemoteModel = smearEventsRemoteModel;
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

        Class<?> remoteModelClass = _smearEventsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearEventsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearEventsLocalServiceUtil.addSmearEvents(this);
        } else {
            SmearEventsLocalServiceUtil.updateSmearEvents(this);
        }
    }

    @Override
    public SmearEvents toEscapedModel() {
        return (SmearEvents) ProxyUtil.newProxyInstance(SmearEvents.class.getClassLoader(),
            new Class[] { SmearEvents.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearEventsClp clone = new SmearEventsClp();

        clone.setEventID(getEventID());
        clone.setEvent_type(getEvent_type());
        clone.setEvent(getEvent());
        clone.setWho(getWho());
        clone.setPeriod_start(getPeriod_start());
        clone.setPeriod_end(getPeriod_end());
        clone.setEtimestamp(getEtimestamp());

        return clone;
    }

    @Override
    public int compareTo(SmearEvents smearEvents) {
        long primaryKey = smearEvents.getPrimaryKey();

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

        if (!(obj instanceof SmearEventsClp)) {
            return false;
        }

        SmearEventsClp smearEvents = (SmearEventsClp) obj;

        long primaryKey = smearEvents.getPrimaryKey();

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
        StringBundler sb = new StringBundler(15);

        sb.append("{eventID=");
        sb.append(getEventID());
        sb.append(", event_type=");
        sb.append(getEvent_type());
        sb.append(", event=");
        sb.append(getEvent());
        sb.append(", who=");
        sb.append(getWho());
        sb.append(", period_start=");
        sb.append(getPeriod_start());
        sb.append(", period_end=");
        sb.append(getPeriod_end());
        sb.append(", etimestamp=");
        sb.append(getEtimestamp());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearEvents");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>eventID</column-name><column-value><![CDATA[");
        sb.append(getEventID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>event_type</column-name><column-value><![CDATA[");
        sb.append(getEvent_type());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>event</column-name><column-value><![CDATA[");
        sb.append(getEvent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>who</column-name><column-value><![CDATA[");
        sb.append(getWho());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>period_start</column-name><column-value><![CDATA[");
        sb.append(getPeriod_start());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>period_end</column-name><column-value><![CDATA[");
        sb.append(getPeriod_end());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>etimestamp</column-name><column-value><![CDATA[");
        sb.append(getEtimestamp());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
