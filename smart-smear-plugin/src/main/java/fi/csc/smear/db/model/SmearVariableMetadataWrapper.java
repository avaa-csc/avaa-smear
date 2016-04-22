package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearVariableMetadata}.
 * </p>
 *
 * @author pj
 * @see SmearVariableMetadata
 * @generated
 */
public class SmearVariableMetadataWrapper implements SmearVariableMetadata,
    ModelWrapper<SmearVariableMetadata> {
    private SmearVariableMetadata _smearVariableMetadata;

    public SmearVariableMetadataWrapper(
        SmearVariableMetadata smearVariableMetadata) {
        _smearVariableMetadata = smearVariableMetadata;
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

    /**
    * Returns the primary key of this smear variable metadata.
    *
    * @return the primary key of this smear variable metadata
    */
    @Override
    public long getPrimaryKey() {
        return _smearVariableMetadata.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smear variable metadata.
    *
    * @param primaryKey the primary key of this smear variable metadata
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearVariableMetadata.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the variable i d of this smear variable metadata.
    *
    * @return the variable i d of this smear variable metadata
    */
    @Override
    public long getVariableID() {
        return _smearVariableMetadata.getVariableID();
    }

    /**
    * Sets the variable i d of this smear variable metadata.
    *
    * @param variableID the variable i d of this smear variable metadata
    */
    @Override
    public void setVariableID(long variableID) {
        _smearVariableMetadata.setVariableID(variableID);
    }

    /**
    * Returns the table i d of this smear variable metadata.
    *
    * @return the table i d of this smear variable metadata
    */
    @Override
    public long getTableID() {
        return _smearVariableMetadata.getTableID();
    }

    /**
    * Sets the table i d of this smear variable metadata.
    *
    * @param tableID the table i d of this smear variable metadata
    */
    @Override
    public void setTableID(long tableID) {
        _smearVariableMetadata.setTableID(tableID);
    }

    /**
    * Returns the variable of this smear variable metadata.
    *
    * @return the variable of this smear variable metadata
    */
    @Override
    public java.lang.String getVariable() {
        return _smearVariableMetadata.getVariable();
    }

    /**
    * Sets the variable of this smear variable metadata.
    *
    * @param variable the variable of this smear variable metadata
    */
    @Override
    public void setVariable(java.lang.String variable) {
        _smearVariableMetadata.setVariable(variable);
    }

    /**
    * Returns the description of this smear variable metadata.
    *
    * @return the description of this smear variable metadata
    */
    @Override
    public java.lang.String getDescription() {
        return _smearVariableMetadata.getDescription();
    }

    /**
    * Sets the description of this smear variable metadata.
    *
    * @param description the description of this smear variable metadata
    */
    @Override
    public void setDescription(java.lang.String description) {
        _smearVariableMetadata.setDescription(description);
    }

    /**
    * Returns the unit of this smear variable metadata.
    *
    * @return the unit of this smear variable metadata
    */
    @Override
    public java.lang.String getUnit() {
        return _smearVariableMetadata.getUnit();
    }

    /**
    * Sets the unit of this smear variable metadata.
    *
    * @param unit the unit of this smear variable metadata
    */
    @Override
    public void setUnit(java.lang.String unit) {
        _smearVariableMetadata.setUnit(unit);
    }

    /**
    * Returns the title of this smear variable metadata.
    *
    * @return the title of this smear variable metadata
    */
    @Override
    public java.lang.String getTitle() {
        return _smearVariableMetadata.getTitle();
    }

    /**
    * Sets the title of this smear variable metadata.
    *
    * @param title the title of this smear variable metadata
    */
    @Override
    public void setTitle(java.lang.String title) {
        _smearVariableMetadata.setTitle(title);
    }

    /**
    * Returns the source of this smear variable metadata.
    *
    * @return the source of this smear variable metadata
    */
    @Override
    public java.lang.String getSource() {
        return _smearVariableMetadata.getSource();
    }

    /**
    * Sets the source of this smear variable metadata.
    *
    * @param source the source of this smear variable metadata
    */
    @Override
    public void setSource(java.lang.String source) {
        _smearVariableMetadata.setSource(source);
    }

    /**
    * Returns the period_start of this smear variable metadata.
    *
    * @return the period_start of this smear variable metadata
    */
    @Override
    public java.util.Date getPeriod_start() {
        return _smearVariableMetadata.getPeriod_start();
    }

    /**
    * Sets the period_start of this smear variable metadata.
    *
    * @param period_start the period_start of this smear variable metadata
    */
    @Override
    public void setPeriod_start(java.util.Date period_start) {
        _smearVariableMetadata.setPeriod_start(period_start);
    }

    /**
    * Returns the period_end of this smear variable metadata.
    *
    * @return the period_end of this smear variable metadata
    */
    @Override
    public java.util.Date getPeriod_end() {
        return _smearVariableMetadata.getPeriod_end();
    }

    /**
    * Sets the period_end of this smear variable metadata.
    *
    * @param period_end the period_end of this smear variable metadata
    */
    @Override
    public void setPeriod_end(java.util.Date period_end) {
        _smearVariableMetadata.setPeriod_end(period_end);
    }

    /**
    * Returns the coverage of this smear variable metadata.
    *
    * @return the coverage of this smear variable metadata
    */
    @Override
    public long getCoverage() {
        return _smearVariableMetadata.getCoverage();
    }

    /**
    * Sets the coverage of this smear variable metadata.
    *
    * @param coverage the coverage of this smear variable metadata
    */
    @Override
    public void setCoverage(long coverage) {
        _smearVariableMetadata.setCoverage(coverage);
    }

    /**
    * Returns the rights of this smear variable metadata.
    *
    * @return the rights of this smear variable metadata
    */
    @Override
    public java.lang.String getRights() {
        return _smearVariableMetadata.getRights();
    }

    /**
    * Sets the rights of this smear variable metadata.
    *
    * @param rights the rights of this smear variable metadata
    */
    @Override
    public void setRights(java.lang.String rights) {
        _smearVariableMetadata.setRights(rights);
    }

    /**
    * Returns the mandatory of this smear variable metadata.
    *
    * @return the mandatory of this smear variable metadata
    */
    @Override
    public boolean getMandatory() {
        return _smearVariableMetadata.getMandatory();
    }

    /**
    * Returns <code>true</code> if this smear variable metadata is mandatory.
    *
    * @return <code>true</code> if this smear variable metadata is mandatory; <code>false</code> otherwise
    */
    @Override
    public boolean isMandatory() {
        return _smearVariableMetadata.isMandatory();
    }

    /**
    * Sets whether this smear variable metadata is mandatory.
    *
    * @param mandatory the mandatory of this smear variable metadata
    */
    @Override
    public void setMandatory(boolean mandatory) {
        _smearVariableMetadata.setMandatory(mandatory);
    }

    /**
    * Returns the derivative of this smear variable metadata.
    *
    * @return the derivative of this smear variable metadata
    */
    @Override
    public boolean getDerivative() {
        return _smearVariableMetadata.getDerivative();
    }

    /**
    * Returns <code>true</code> if this smear variable metadata is derivative.
    *
    * @return <code>true</code> if this smear variable metadata is derivative; <code>false</code> otherwise
    */
    @Override
    public boolean isDerivative() {
        return _smearVariableMetadata.isDerivative();
    }

    /**
    * Sets whether this smear variable metadata is derivative.
    *
    * @param derivative the derivative of this smear variable metadata
    */
    @Override
    public void setDerivative(boolean derivative) {
        _smearVariableMetadata.setDerivative(derivative);
    }

    /**
    * Returns the vtimestamp of this smear variable metadata.
    *
    * @return the vtimestamp of this smear variable metadata
    */
    @Override
    public java.util.Date getVtimestamp() {
        return _smearVariableMetadata.getVtimestamp();
    }

    /**
    * Sets the vtimestamp of this smear variable metadata.
    *
    * @param vtimestamp the vtimestamp of this smear variable metadata
    */
    @Override
    public void setVtimestamp(java.util.Date vtimestamp) {
        _smearVariableMetadata.setVtimestamp(vtimestamp);
    }

    /**
    * Returns the category of this smear variable metadata.
    *
    * @return the category of this smear variable metadata
    */
    @Override
    public java.lang.String getCategory() {
        return _smearVariableMetadata.getCategory();
    }

    /**
    * Sets the category of this smear variable metadata.
    *
    * @param category the category of this smear variable metadata
    */
    @Override
    public void setCategory(java.lang.String category) {
        _smearVariableMetadata.setCategory(category);
    }

    @Override
    public boolean isNew() {
        return _smearVariableMetadata.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearVariableMetadata.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearVariableMetadata.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearVariableMetadata.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearVariableMetadata.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearVariableMetadata.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearVariableMetadata.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearVariableMetadata.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearVariableMetadata.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearVariableMetadata.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearVariableMetadata.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearVariableMetadataWrapper((SmearVariableMetadata) _smearVariableMetadata.clone());
    }

    @Override
    public int compareTo(SmearVariableMetadata smearVariableMetadata) {
        return _smearVariableMetadata.compareTo(smearVariableMetadata);
    }

    @Override
    public int hashCode() {
        return _smearVariableMetadata.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearVariableMetadata> toCacheModel() {
        return _smearVariableMetadata.toCacheModel();
    }

    @Override
    public SmearVariableMetadata toEscapedModel() {
        return new SmearVariableMetadataWrapper(_smearVariableMetadata.toEscapedModel());
    }

    @Override
    public SmearVariableMetadata toUnescapedModel() {
        return new SmearVariableMetadataWrapper(_smearVariableMetadata.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearVariableMetadata.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearVariableMetadata.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearVariableMetadata.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearVariableMetadataWrapper)) {
            return false;
        }

        SmearVariableMetadataWrapper smearVariableMetadataWrapper = (SmearVariableMetadataWrapper) obj;

        if (Validator.equals(_smearVariableMetadata,
                    smearVariableMetadataWrapper._smearVariableMetadata)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearVariableMetadata getWrappedSmearVariableMetadata() {
        return _smearVariableMetadata;
    }

    @Override
    public SmearVariableMetadata getWrappedModel() {
        return _smearVariableMetadata;
    }

    @Override
    public void resetOriginalValues() {
        _smearVariableMetadata.resetOriginalValues();
    }
}
