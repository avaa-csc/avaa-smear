package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.SmearVariableMetadataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SmearVariableMetadataClp extends BaseModelImpl<SmearVariableMetadata>
    implements SmearVariableMetadata {
    private long _variableID;
    private long _tableID;
    private String _variable;
    private String _description;
    private String _unit;
    private String _title;
    private String _source;
    private Date _period_start;
    private Date _period_end;
    private long _coverage;
    private String _rights;
    private boolean _mandatory;
    private boolean _derivative;
    private Date _vtimestamp;
    private String _category;
    private BaseModel<?> _smearVariableMetadataRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public SmearVariableMetadataClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SmearVariableMetadata.class;
    }

    @Override
    public String getModelClassName() {
        return SmearVariableMetadata.class.getName();
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

        attributes.put("variableID", getVariableID());
        attributes.put("tableID", getTableID());
        attributes.put("variable", getVariable());
        attributes.put("description", getDescription());
        attributes.put("unit", getUnit());
        attributes.put("title", getTitle());
        attributes.put("source", getSource());
        attributes.put("period_start", getPeriod_start());
        attributes.put("period_end", getPeriod_end());
        attributes.put("coverage", getCoverage());
        attributes.put("rights", getRights());
        attributes.put("mandatory", getMandatory());
        attributes.put("derivative", getDerivative());
        attributes.put("vtimestamp", getVtimestamp());
        attributes.put("category", getCategory());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long variableID = (Long) attributes.get("variableID");

        if (variableID != null) {
            setVariableID(variableID);
        }

        Long tableID = (Long) attributes.get("tableID");

        if (tableID != null) {
            setTableID(tableID);
        }

        String variable = (String) attributes.get("variable");

        if (variable != null) {
            setVariable(variable);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String unit = (String) attributes.get("unit");

        if (unit != null) {
            setUnit(unit);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String source = (String) attributes.get("source");

        if (source != null) {
            setSource(source);
        }

        Date period_start = (Date) attributes.get("period_start");

        if (period_start != null) {
            setPeriod_start(period_start);
        }

        Date period_end = (Date) attributes.get("period_end");

        if (period_end != null) {
            setPeriod_end(period_end);
        }

        Long coverage = (Long) attributes.get("coverage");

        if (coverage != null) {
            setCoverage(coverage);
        }

        String rights = (String) attributes.get("rights");

        if (rights != null) {
            setRights(rights);
        }

        Boolean mandatory = (Boolean) attributes.get("mandatory");

        if (mandatory != null) {
            setMandatory(mandatory);
        }

        Boolean derivative = (Boolean) attributes.get("derivative");

        if (derivative != null) {
            setDerivative(derivative);
        }

        Date vtimestamp = (Date) attributes.get("vtimestamp");

        if (vtimestamp != null) {
            setVtimestamp(vtimestamp);
        }

        String category = (String) attributes.get("category");

        if (category != null) {
            setCategory(category);
        }
    }

    @Override
    public long getVariableID() {
        return _variableID;
    }

    @Override
    public void setVariableID(long variableID) {
        _variableID = variableID;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setVariableID", long.class);

                method.invoke(_smearVariableMetadataRemoteModel, variableID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTableID() {
        return _tableID;
    }

    @Override
    public void setTableID(long tableID) {
        _tableID = tableID;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTableID", long.class);

                method.invoke(_smearVariableMetadataRemoteModel, tableID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVariable() {
        return _variable;
    }

    @Override
    public void setVariable(String variable) {
        _variable = variable;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setVariable", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, variable);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUnit() {
        return _unit;
    }

    @Override
    public void setUnit(String unit) {
        _unit = unit;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setUnit", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, unit);
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

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSource() {
        return _source;
    }

    @Override
    public void setSource(String source) {
        _source = source;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setSource", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, source);
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

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setPeriod_start", Date.class);

                method.invoke(_smearVariableMetadataRemoteModel, period_start);
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

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setPeriod_end", Date.class);

                method.invoke(_smearVariableMetadataRemoteModel, period_end);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCoverage() {
        return _coverage;
    }

    @Override
    public void setCoverage(long coverage) {
        _coverage = coverage;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setCoverage", long.class);

                method.invoke(_smearVariableMetadataRemoteModel, coverage);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRights() {
        return _rights;
    }

    @Override
    public void setRights(String rights) {
        _rights = rights;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setRights", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, rights);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getMandatory() {
        return _mandatory;
    }

    @Override
    public boolean isMandatory() {
        return _mandatory;
    }

    @Override
    public void setMandatory(boolean mandatory) {
        _mandatory = mandatory;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setMandatory", boolean.class);

                method.invoke(_smearVariableMetadataRemoteModel, mandatory);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getDerivative() {
        return _derivative;
    }

    @Override
    public boolean isDerivative() {
        return _derivative;
    }

    @Override
    public void setDerivative(boolean derivative) {
        _derivative = derivative;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setDerivative", boolean.class);

                method.invoke(_smearVariableMetadataRemoteModel, derivative);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getVtimestamp() {
        return _vtimestamp;
    }

    @Override
    public void setVtimestamp(Date vtimestamp) {
        _vtimestamp = vtimestamp;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setVtimestamp", Date.class);

                method.invoke(_smearVariableMetadataRemoteModel, vtimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCategory() {
        return _category;
    }

    @Override
    public void setCategory(String category) {
        _category = category;

        if (_smearVariableMetadataRemoteModel != null) {
            try {
                Class<?> clazz = _smearVariableMetadataRemoteModel.getClass();

                Method method = clazz.getMethod("setCategory", String.class);

                method.invoke(_smearVariableMetadataRemoteModel, category);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSmearVariableMetadataRemoteModel() {
        return _smearVariableMetadataRemoteModel;
    }

    public void setSmearVariableMetadataRemoteModel(
        BaseModel<?> smearVariableMetadataRemoteModel) {
        _smearVariableMetadataRemoteModel = smearVariableMetadataRemoteModel;
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

        Class<?> remoteModelClass = _smearVariableMetadataRemoteModel.getClass();

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

        Object returnValue = method.invoke(_smearVariableMetadataRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearVariableMetadataLocalServiceUtil.addSmearVariableMetadata(this);
        } else {
            SmearVariableMetadataLocalServiceUtil.updateSmearVariableMetadata(this);
        }
    }

    @Override
    public SmearVariableMetadata toEscapedModel() {
        return (SmearVariableMetadata) ProxyUtil.newProxyInstance(SmearVariableMetadata.class.getClassLoader(),
            new Class[] { SmearVariableMetadata.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SmearVariableMetadataClp clone = new SmearVariableMetadataClp();

        clone.setVariableID(getVariableID());
        clone.setTableID(getTableID());
        clone.setVariable(getVariable());
        clone.setDescription(getDescription());
        clone.setUnit(getUnit());
        clone.setTitle(getTitle());
        clone.setSource(getSource());
        clone.setPeriod_start(getPeriod_start());
        clone.setPeriod_end(getPeriod_end());
        clone.setCoverage(getCoverage());
        clone.setRights(getRights());
        clone.setMandatory(getMandatory());
        clone.setDerivative(getDerivative());
        clone.setVtimestamp(getVtimestamp());
        clone.setCategory(getCategory());

        return clone;
    }

    @Override
    public int compareTo(SmearVariableMetadata smearVariableMetadata) {
        long primaryKey = smearVariableMetadata.getPrimaryKey();

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

        if (!(obj instanceof SmearVariableMetadataClp)) {
            return false;
        }

        SmearVariableMetadataClp smearVariableMetadata = (SmearVariableMetadataClp) obj;

        long primaryKey = smearVariableMetadata.getPrimaryKey();

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
        StringBundler sb = new StringBundler(31);

        sb.append("{variableID=");
        sb.append(getVariableID());
        sb.append(", tableID=");
        sb.append(getTableID());
        sb.append(", variable=");
        sb.append(getVariable());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", unit=");
        sb.append(getUnit());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", source=");
        sb.append(getSource());
        sb.append(", period_start=");
        sb.append(getPeriod_start());
        sb.append(", period_end=");
        sb.append(getPeriod_end());
        sb.append(", coverage=");
        sb.append(getCoverage());
        sb.append(", rights=");
        sb.append(getRights());
        sb.append(", mandatory=");
        sb.append(getMandatory());
        sb.append(", derivative=");
        sb.append(getDerivative());
        sb.append(", vtimestamp=");
        sb.append(getVtimestamp());
        sb.append(", category=");
        sb.append(getCategory());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearVariableMetadata");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>variableID</column-name><column-value><![CDATA[");
        sb.append(getVariableID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tableID</column-name><column-value><![CDATA[");
        sb.append(getTableID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>variable</column-name><column-value><![CDATA[");
        sb.append(getVariable());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>unit</column-name><column-value><![CDATA[");
        sb.append(getUnit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>source</column-name><column-value><![CDATA[");
        sb.append(getSource());
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
            "<column><column-name>coverage</column-name><column-value><![CDATA[");
        sb.append(getCoverage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rights</column-name><column-value><![CDATA[");
        sb.append(getRights());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mandatory</column-name><column-value><![CDATA[");
        sb.append(getMandatory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>derivative</column-name><column-value><![CDATA[");
        sb.append(getDerivative());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>vtimestamp</column-name><column-value><![CDATA[");
        sb.append(getVtimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>category</column-name><column-value><![CDATA[");
        sb.append(getCategory());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
