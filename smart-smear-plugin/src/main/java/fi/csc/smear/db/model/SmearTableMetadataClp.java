package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SmearTableMetadataClp extends BaseModelImpl<SmearTableMetadata>
    implements SmearTableMetadata {
    private long _tableID;
    private String _identifier;
    private String _title;
    private String _spatial_coverage;
    private String _name;
    private Date _ttimestamp;
    private int _period;
    private BaseModel<?> _smearTableMetadataRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearTableMetadataClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearTableMetadata.class;
    }

    @Override
    public String getModelClassName() {
        return SmearTableMetadata.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _tableID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTableID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _tableID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tableID", getTableID());
        attributes.put("identifier", getIdentifier());
        attributes.put("title", getTitle());
        attributes.put("spatial_coverage", getSpatial_coverage());
        attributes.put("name", getName());
        attributes.put("ttimestamp", getTtimestamp());
        attributes.put("period", getPeriod());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tableID = (Long) attributes.get("tableID");

        if (tableID != null) {
            setTableID(tableID);
        }

        String identifier = (String) attributes.get("identifier");

        if (identifier != null) {
            setIdentifier(identifier);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String spatial_coverage = (String) attributes.get("spatial_coverage");

        if (spatial_coverage != null) {
            setSpatial_coverage(spatial_coverage);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date ttimestamp = (Date) attributes.get("ttimestamp");

        if (ttimestamp != null) {
            setTtimestamp(ttimestamp);
        }

        Integer period = (Integer) attributes.get("period");

        if (period != null) {
            setPeriod(period);
        }
    }

    @Override
    public long getTableID() {
        return _tableID;
    }

    @Override
    public void setTableID(long tableID) {
        _tableID = tableID;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTableID", long.class);

                method.invoke(_smearTableMetadataRemoteModel, tableID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdentifier() {
        return _identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        _identifier = identifier;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentifier", String.class);

                method.invoke(_smearTableMetadataRemoteModel, identifier);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_smearTableMetadataRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSpatial_coverage() {
        return _spatial_coverage;
    }

    @Override
    public void setSpatial_coverage(String spatial_coverage) {
        _spatial_coverage = spatial_coverage;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setSpatial_coverage",
                        String.class);

                method.invoke(_smearTableMetadataRemoteModel, spatial_coverage);
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

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_smearTableMetadataRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTtimestamp() {
        return _ttimestamp;
    }

    @Override
    public void setTtimestamp(Date ttimestamp) {
        _ttimestamp = ttimestamp;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTtimestamp", Date.class);

                method.invoke(_smearTableMetadataRemoteModel, ttimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPeriod() {
        return _period;
    }

    @Override
    public void setPeriod(int period) {
        _period = period;

        if (_smearTableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearTableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setPeriod", int.class);

                method.invoke(_smearTableMetadataRemoteModel, period);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearTableMetadataRemoteModel() {
        return _smearTableMetadataRemoteModel;
    }

    public void setSmearTableMetadataRemoteModel(
        BaseModel<?> smearTableMetadataRemoteModel) {
        _smearTableMetadataRemoteModel = smearTableMetadataRemoteModel;
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

        Class<?> remoteModelClass = _smearTableMetadataRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearTableMetadataRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearTableMetadataLocalServiceUtil.addSmearTableMetadata(this);
        } else {
            SmearTableMetadataLocalServiceUtil.updateSmearTableMetadata(this);
        }
    }

    @Override
    public SmearTableMetadata toEscapedModel() {
        return (SmearTableMetadata) ProxyUtil.newProxyInstance(SmearTableMetadata.class.getClassLoader(),
            new Class[] { SmearTableMetadata.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearTableMetadataClp clone = new SmearTableMetadataClp();

        clone.setTableID(getTableID());
        clone.setIdentifier(getIdentifier());
        clone.setTitle(getTitle());
        clone.setSpatial_coverage(getSpatial_coverage());
        clone.setName(getName());
        clone.setTtimestamp(getTtimestamp());
        clone.setPeriod(getPeriod());

        return clone;
    }

    @Override
    public int compareTo(SmearTableMetadata smearTableMetadata) {
        long primaryKey = smearTableMetadata.getPrimaryKey();

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

        if (!(obj instanceof SmearTableMetadataClp)) {
            return false;
        }

        SmearTableMetadataClp smearTableMetadata = (SmearTableMetadataClp) obj;

        long primaryKey = smearTableMetadata.getPrimaryKey();

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

        sb.append("{tableID=");
        sb.append(getTableID());
        sb.append(", identifier=");
        sb.append(getIdentifier());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", spatial_coverage=");
        sb.append(getSpatial_coverage());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", ttimestamp=");
        sb.append(getTtimestamp());
        sb.append(", period=");
        sb.append(getPeriod());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearTableMetadata");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>tableID</column-name><column-value><![CDATA[");
        sb.append(getTableID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier</column-name><column-value><![CDATA[");
        sb.append(getIdentifier());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>spatial_coverage</column-name><column-value><![CDATA[");
        sb.append(getSpatial_coverage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ttimestamp</column-name><column-value><![CDATA[");
        sb.append(getTtimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>period</column-name><column-value><![CDATA[");
        sb.append(getPeriod());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
