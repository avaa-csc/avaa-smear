package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearstationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SmearstationClp extends BaseModelImpl<Smearstation>
    implements Smearstation {
    private long _stationID;
    private String _dcmipoint;
    private String _name;
    private boolean _dataAvail;
    private BaseModel<?> _smearstationRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearstationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Smearstation.class;
    }

    @Override
    public String getModelClassName() {
        return Smearstation.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _stationID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStationID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _stationID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("stationID", getStationID());
        attributes.put("dcmipoint", getDcmipoint());
        attributes.put("name", getName());
        attributes.put("dataAvail", getDataAvail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long stationID = (Long) attributes.get("stationID");

        if (stationID != null) {
            setStationID(stationID);
        }

        String dcmipoint = (String) attributes.get("dcmipoint");

        if (dcmipoint != null) {
            setDcmipoint(dcmipoint);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean dataAvail = (Boolean) attributes.get("dataAvail");

        if (dataAvail != null) {
            setDataAvail(dataAvail);
        }
    }

    @Override
    public long getStationID() {
        return _stationID;
    }

    @Override
    public void setStationID(long stationID) {
        _stationID = stationID;

        if (_smearstationRemoteModel != null) {
            try {
                Class<?> clazz = _smearstationRemoteModel.getClass();

                Method method = clazz.getMethod("setStationID", long.class);

                method.invoke(_smearstationRemoteModel, stationID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDcmipoint() {
        return _dcmipoint;
    }

    @Override
    public void setDcmipoint(String dcmipoint) {
        _dcmipoint = dcmipoint;

        if (_smearstationRemoteModel != null) {
            try {
                Class<?> clazz = _smearstationRemoteModel.getClass();

                Method method = clazz.getMethod("setDcmipoint", String.class);

                method.invoke(_smearstationRemoteModel, dcmipoint);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_smearstationRemoteModel != null) {
            try {
                Class<?> clazz = _smearstationRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_smearstationRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getDataAvail() {
        return _dataAvail;
    }

    @Override
    public boolean isDataAvail() {
        return _dataAvail;
    }

    @Override
    public void setDataAvail(boolean dataAvail) {
        _dataAvail = dataAvail;

        if (_smearstationRemoteModel != null) {
            try {
                Class<?> clazz = _smearstationRemoteModel.getClass();

                Method method = clazz.getMethod("setDataAvail", boolean.class);

                method.invoke(_smearstationRemoteModel, dataAvail);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearstationRemoteModel() {
        return _smearstationRemoteModel;
    }

    public void setSmearstationRemoteModel(BaseModel<?> smearstationRemoteModel) {
        _smearstationRemoteModel = smearstationRemoteModel;
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

        Class<?> remoteModelClass = _smearstationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearstationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearstationLocalServiceUtil.addSmearstation(this);
        } else {
            SmearstationLocalServiceUtil.updateSmearstation(this);
        }
    }

    @Override
    public Smearstation toEscapedModel() {
        return (Smearstation) ProxyUtil.newProxyInstance(Smearstation.class.getClassLoader(),
            new Class[] { Smearstation.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearstationClp clone = new SmearstationClp();

        clone.setStationID(getStationID());
        clone.setDcmipoint(getDcmipoint());
        clone.setName(getName());
        clone.setDataAvail(getDataAvail());

        return clone;
    }

    @Override
    public int compareTo(Smearstation smearstation) {
        long primaryKey = smearstation.getPrimaryKey();

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

        if (!(obj instanceof SmearstationClp)) {
            return false;
        }

        SmearstationClp smearstation = (SmearstationClp) obj;

        long primaryKey = smearstation.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{stationID=");
        sb.append(getStationID());
        sb.append(", dcmipoint=");
        sb.append(getDcmipoint());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", dataAvail=");
        sb.append(getDataAvail());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Smearstation");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>stationID</column-name><column-value><![CDATA[");
        sb.append(getStationID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dcmipoint</column-name><column-value><![CDATA[");
        sb.append(getDcmipoint());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataAvail</column-name><column-value><![CDATA[");
        sb.append(getDataAvail());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
