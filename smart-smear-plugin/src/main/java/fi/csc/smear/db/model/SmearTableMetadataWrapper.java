package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearTableMetadata}.
 * </p>
 *
 * @author pj
 * @see SmearTableMetadata
 * @generated
 */
public class SmearTableMetadataWrapper implements SmearTableMetadata,
    ModelWrapper<SmearTableMetadata> {
    private SmearTableMetadata _smearTableMetadata;

    public SmearTableMetadataWrapper(SmearTableMetadata smearTableMetadata) {
        _smearTableMetadata = smearTableMetadata;
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

    /**
    * Returns the primary key of this smear table metadata.
    *
    * @return the primary key of this smear table metadata
    */
    @Override
    public long getPrimaryKey() {
        return _smearTableMetadata.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smear table metadata.
    *
    * @param primaryKey the primary key of this smear table metadata
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearTableMetadata.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the table i d of this smear table metadata.
    *
    * @return the table i d of this smear table metadata
    */
    @Override
    public long getTableID() {
        return _smearTableMetadata.getTableID();
    }

    /**
    * Sets the table i d of this smear table metadata.
    *
    * @param tableID the table i d of this smear table metadata
    */
    @Override
    public void setTableID(long tableID) {
        _smearTableMetadata.setTableID(tableID);
    }

    /**
    * Returns the identifier of this smear table metadata.
    *
    * @return the identifier of this smear table metadata
    */
    @Override
    public java.lang.String getIdentifier() {
        return _smearTableMetadata.getIdentifier();
    }

    /**
    * Sets the identifier of this smear table metadata.
    *
    * @param identifier the identifier of this smear table metadata
    */
    @Override
    public void setIdentifier(java.lang.String identifier) {
        _smearTableMetadata.setIdentifier(identifier);
    }

    /**
    * Returns the title of this smear table metadata.
    *
    * @return the title of this smear table metadata
    */
    @Override
    public java.lang.String getTitle() {
        return _smearTableMetadata.getTitle();
    }

    /**
    * Sets the title of this smear table metadata.
    *
    * @param title the title of this smear table metadata
    */
    @Override
    public void setTitle(java.lang.String title) {
        _smearTableMetadata.setTitle(title);
    }

    /**
    * Returns the spatial_coverage of this smear table metadata.
    *
    * @return the spatial_coverage of this smear table metadata
    */
    @Override
    public java.lang.String getSpatial_coverage() {
        return _smearTableMetadata.getSpatial_coverage();
    }

    /**
    * Sets the spatial_coverage of this smear table metadata.
    *
    * @param spatial_coverage the spatial_coverage of this smear table metadata
    */
    @Override
    public void setSpatial_coverage(java.lang.String spatial_coverage) {
        _smearTableMetadata.setSpatial_coverage(spatial_coverage);
    }

    /**
    * Returns the name of this smear table metadata.
    *
    * @return the name of this smear table metadata
    */
    @Override
    public java.lang.String getName() {
        return _smearTableMetadata.getName();
    }

    /**
    * Sets the name of this smear table metadata.
    *
    * @param name the name of this smear table metadata
    */
    @Override
    public void setName(java.lang.String name) {
        _smearTableMetadata.setName(name);
    }

    /**
    * Returns the ttimestamp of this smear table metadata.
    *
    * @return the ttimestamp of this smear table metadata
    */
    @Override
    public java.util.Date getTtimestamp() {
        return _smearTableMetadata.getTtimestamp();
    }

    /**
    * Sets the ttimestamp of this smear table metadata.
    *
    * @param ttimestamp the ttimestamp of this smear table metadata
    */
    @Override
    public void setTtimestamp(java.util.Date ttimestamp) {
        _smearTableMetadata.setTtimestamp(ttimestamp);
    }

    /**
    * Returns the period of this smear table metadata.
    *
    * @return the period of this smear table metadata
    */
    @Override
    public int getPeriod() {
        return _smearTableMetadata.getPeriod();
    }

    /**
    * Sets the period of this smear table metadata.
    *
    * @param period the period of this smear table metadata
    */
    @Override
    public void setPeriod(int period) {
        _smearTableMetadata.setPeriod(period);
    }

    @Override
    public boolean isNew() {
        return _smearTableMetadata.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearTableMetadata.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearTableMetadata.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearTableMetadata.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearTableMetadata.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearTableMetadata.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearTableMetadata.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearTableMetadata.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearTableMetadata.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearTableMetadata.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearTableMetadata.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearTableMetadataWrapper((SmearTableMetadata) _smearTableMetadata.clone());
    }

    @Override
    public int compareTo(SmearTableMetadata smearTableMetadata) {
        return _smearTableMetadata.compareTo(smearTableMetadata);
    }

    @Override
    public int hashCode() {
        return _smearTableMetadata.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearTableMetadata> toCacheModel() {
        return _smearTableMetadata.toCacheModel();
    }

    @Override
    public SmearTableMetadata toEscapedModel() {
        return new SmearTableMetadataWrapper(_smearTableMetadata.toEscapedModel());
    }

    @Override
    public SmearTableMetadata toUnescapedModel() {
        return new SmearTableMetadataWrapper(_smearTableMetadata.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearTableMetadata.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearTableMetadata.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearTableMetadata.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearTableMetadataWrapper)) {
            return false;
        }

        SmearTableMetadataWrapper smearTableMetadataWrapper = (SmearTableMetadataWrapper) obj;

        if (Validator.equals(_smearTableMetadata,
                    smearTableMetadataWrapper._smearTableMetadata)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearTableMetadata getWrappedSmearTableMetadata() {
        return _smearTableMetadata;
    }

    @Override
    public SmearTableMetadata getWrappedModel() {
        return _smearTableMetadata;
    }

    @Override
    public void resetOriginalValues() {
        _smearTableMetadata.resetOriginalValues();
    }
}
