package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearTags}.
 * </p>
 *
 * @author pj
 * @see SmearTags
 * @generated
 */
public class SmearTagsWrapper implements SmearTags, ModelWrapper<SmearTags> {
    private SmearTags _smearTags;

    public SmearTagsWrapper(SmearTags smearTags) {
        _smearTags = smearTags;
    }

    @Override
    public Class<?> getModelClass() {
        return SmearTags.class;
    }

    @Override
    public String getModelClassName() {
        return SmearTags.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tagID", getTagID());
        attributes.put("vocabulary", getVocabulary());
        attributes.put("tag", getTag());
        attributes.put("displaykeyword", getDisplaykeyword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tagID = (Long) attributes.get("tagID");

        if (tagID != null) {
            setTagID(tagID);
        }

        String vocabulary = (String) attributes.get("vocabulary");

        if (vocabulary != null) {
            setVocabulary(vocabulary);
        }

        String tag = (String) attributes.get("tag");

        if (tag != null) {
            setTag(tag);
        }

        String displaykeyword = (String) attributes.get("displaykeyword");

        if (displaykeyword != null) {
            setDisplaykeyword(displaykeyword);
        }
    }

    /**
    * Returns the primary key of this smear tags.
    *
    * @return the primary key of this smear tags
    */
    @Override
    public long getPrimaryKey() {
        return _smearTags.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smear tags.
    *
    * @param primaryKey the primary key of this smear tags
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearTags.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the tag i d of this smear tags.
    *
    * @return the tag i d of this smear tags
    */
    @Override
    public long getTagID() {
        return _smearTags.getTagID();
    }

    /**
    * Sets the tag i d of this smear tags.
    *
    * @param tagID the tag i d of this smear tags
    */
    @Override
    public void setTagID(long tagID) {
        _smearTags.setTagID(tagID);
    }

    /**
    * Returns the vocabulary of this smear tags.
    *
    * @return the vocabulary of this smear tags
    */
    @Override
    public java.lang.String getVocabulary() {
        return _smearTags.getVocabulary();
    }

    /**
    * Sets the vocabulary of this smear tags.
    *
    * @param vocabulary the vocabulary of this smear tags
    */
    @Override
    public void setVocabulary(java.lang.String vocabulary) {
        _smearTags.setVocabulary(vocabulary);
    }

    /**
    * Returns the tag of this smear tags.
    *
    * @return the tag of this smear tags
    */
    @Override
    public java.lang.String getTag() {
        return _smearTags.getTag();
    }

    /**
    * Sets the tag of this smear tags.
    *
    * @param tag the tag of this smear tags
    */
    @Override
    public void setTag(java.lang.String tag) {
        _smearTags.setTag(tag);
    }

    /**
    * Returns the displaykeyword of this smear tags.
    *
    * @return the displaykeyword of this smear tags
    */
    @Override
    public java.lang.String getDisplaykeyword() {
        return _smearTags.getDisplaykeyword();
    }

    /**
    * Sets the displaykeyword of this smear tags.
    *
    * @param displaykeyword the displaykeyword of this smear tags
    */
    @Override
    public void setDisplaykeyword(java.lang.String displaykeyword) {
        _smearTags.setDisplaykeyword(displaykeyword);
    }

    @Override
    public boolean isNew() {
        return _smearTags.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearTags.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearTags.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearTags.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearTags.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearTags.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearTags.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearTags.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearTags.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearTags.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearTags.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearTagsWrapper((SmearTags) _smearTags.clone());
    }

    @Override
    public int compareTo(SmearTags smearTags) {
        return _smearTags.compareTo(smearTags);
    }

    @Override
    public int hashCode() {
        return _smearTags.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearTags> toCacheModel() {
        return _smearTags.toCacheModel();
    }

    @Override
    public SmearTags toEscapedModel() {
        return new SmearTagsWrapper(_smearTags.toEscapedModel());
    }

    @Override
    public SmearTags toUnescapedModel() {
        return new SmearTagsWrapper(_smearTags.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearTags.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearTags.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearTags.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearTagsWrapper)) {
            return false;
        }

        SmearTagsWrapper smearTagsWrapper = (SmearTagsWrapper) obj;

        if (Validator.equals(_smearTags, smearTagsWrapper._smearTags)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearTags getWrappedSmearTags() {
        return _smearTags;
    }

    @Override
    public SmearTags getWrappedModel() {
        return _smearTags;
    }

    @Override
    public void resetOriginalValues() {
        _smearTags.resetOriginalValues();
    }
}
