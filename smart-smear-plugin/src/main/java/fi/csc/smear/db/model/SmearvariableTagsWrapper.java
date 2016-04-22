package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearvariableTags}.
 * </p>
 *
 * @author pj
 * @see SmearvariableTags
 * @generated
 */
public class SmearvariableTagsWrapper implements SmearvariableTags,
    ModelWrapper<SmearvariableTags> {
    private SmearvariableTags _smearvariableTags;

    public SmearvariableTagsWrapper(SmearvariableTags smearvariableTags) {
        _smearvariableTags = smearvariableTags;
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

    /**
    * Returns the primary key of this smearvariable tags.
    *
    * @return the primary key of this smearvariable tags
    */
    @Override
    public long getPrimaryKey() {
        return _smearvariableTags.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smearvariable tags.
    *
    * @param primaryKey the primary key of this smearvariable tags
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearvariableTags.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the tag i d of this smearvariable tags.
    *
    * @return the tag i d of this smearvariable tags
    */
    @Override
    public long getTagID() {
        return _smearvariableTags.getTagID();
    }

    /**
    * Sets the tag i d of this smearvariable tags.
    *
    * @param tagID the tag i d of this smearvariable tags
    */
    @Override
    public void setTagID(long tagID) {
        _smearvariableTags.setTagID(tagID);
    }

    /**
    * Returns the variable i d of this smearvariable tags.
    *
    * @return the variable i d of this smearvariable tags
    */
    @Override
    public long getVariableID() {
        return _smearvariableTags.getVariableID();
    }

    /**
    * Sets the variable i d of this smearvariable tags.
    *
    * @param variableID the variable i d of this smearvariable tags
    */
    @Override
    public void setVariableID(long variableID) {
        _smearvariableTags.setVariableID(variableID);
    }

    @Override
    public boolean isNew() {
        return _smearvariableTags.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearvariableTags.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearvariableTags.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearvariableTags.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearvariableTags.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearvariableTags.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearvariableTags.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearvariableTags.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearvariableTags.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearvariableTags.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearvariableTags.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearvariableTagsWrapper((SmearvariableTags) _smearvariableTags.clone());
    }

    @Override
    public int compareTo(SmearvariableTags smearvariableTags) {
        return _smearvariableTags.compareTo(smearvariableTags);
    }

    @Override
    public int hashCode() {
        return _smearvariableTags.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearvariableTags> toCacheModel() {
        return _smearvariableTags.toCacheModel();
    }

    @Override
    public SmearvariableTags toEscapedModel() {
        return new SmearvariableTagsWrapper(_smearvariableTags.toEscapedModel());
    }

    @Override
    public SmearvariableTags toUnescapedModel() {
        return new SmearvariableTagsWrapper(_smearvariableTags.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearvariableTags.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearvariableTags.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearvariableTags.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearvariableTagsWrapper)) {
            return false;
        }

        SmearvariableTagsWrapper smearvariableTagsWrapper = (SmearvariableTagsWrapper) obj;

        if (Validator.equals(_smearvariableTags,
                    smearvariableTagsWrapper._smearvariableTags)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearvariableTags getWrappedSmearvariableTags() {
        return _smearvariableTags;
    }

    @Override
    public SmearvariableTags getWrappedModel() {
        return _smearvariableTags;
    }

    @Override
    public void resetOriginalValues() {
        _smearvariableTags.resetOriginalValues();
    }
}
