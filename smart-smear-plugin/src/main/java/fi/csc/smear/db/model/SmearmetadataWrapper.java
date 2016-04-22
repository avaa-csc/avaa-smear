package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Smearmetadata}.
 * </p>
 *
 * @author pj
 * @see Smearmetadata
 * @generated
 */
public class SmearmetadataWrapper implements Smearmetadata,
    ModelWrapper<Smearmetadata> {
    private Smearmetadata _smearmetadata;

    public SmearmetadataWrapper(Smearmetadata smearmetadata) {
        _smearmetadata = smearmetadata;
    }

    @Override
    public Class<?> getModelClass() {
        return Smearmetadata.class;
    }

    @Override
    public String getModelClassName() {
        return Smearmetadata.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("title", getTitle());
        attributes.put("rightsCategory", getRightsCategory());
        attributes.put("access_rights", getAccess_rights());
        attributes.put("project", getProject());
        attributes.put("maintaining_organisation", getMaintaining_organisation());
        attributes.put("contact", getContact());
        attributes.put("ref", getRef());
        attributes.put("creator", getCreator());
        attributes.put("discipline", getDiscipline());
        attributes.put("timestamp", getTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String rightsCategory = (String) attributes.get("rightsCategory");

        if (rightsCategory != null) {
            setRightsCategory(rightsCategory);
        }

        String access_rights = (String) attributes.get("access_rights");

        if (access_rights != null) {
            setAccess_rights(access_rights);
        }

        String project = (String) attributes.get("project");

        if (project != null) {
            setProject(project);
        }

        String maintaining_organisation = (String) attributes.get(
                "maintaining_organisation");

        if (maintaining_organisation != null) {
            setMaintaining_organisation(maintaining_organisation);
        }

        String contact = (String) attributes.get("contact");

        if (contact != null) {
            setContact(contact);
        }

        String ref = (String) attributes.get("ref");

        if (ref != null) {
            setRef(ref);
        }

        String creator = (String) attributes.get("creator");

        if (creator != null) {
            setCreator(creator);
        }

        String discipline = (String) attributes.get("discipline");

        if (discipline != null) {
            setDiscipline(discipline);
        }

        Date timestamp = (Date) attributes.get("timestamp");

        if (timestamp != null) {
            setTimestamp(timestamp);
        }
    }

    /**
    * Returns the primary key of this smearmetadata.
    *
    * @return the primary key of this smearmetadata
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _smearmetadata.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smearmetadata.
    *
    * @param primaryKey the primary key of this smearmetadata
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _smearmetadata.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the title of this smearmetadata.
    *
    * @return the title of this smearmetadata
    */
    @Override
    public java.lang.String getTitle() {
        return _smearmetadata.getTitle();
    }

    /**
    * Sets the title of this smearmetadata.
    *
    * @param title the title of this smearmetadata
    */
    @Override
    public void setTitle(java.lang.String title) {
        _smearmetadata.setTitle(title);
    }

    /**
    * Returns the rights category of this smearmetadata.
    *
    * @return the rights category of this smearmetadata
    */
    @Override
    public java.lang.String getRightsCategory() {
        return _smearmetadata.getRightsCategory();
    }

    /**
    * Sets the rights category of this smearmetadata.
    *
    * @param rightsCategory the rights category of this smearmetadata
    */
    @Override
    public void setRightsCategory(java.lang.String rightsCategory) {
        _smearmetadata.setRightsCategory(rightsCategory);
    }

    /**
    * Returns the access_rights of this smearmetadata.
    *
    * @return the access_rights of this smearmetadata
    */
    @Override
    public java.lang.String getAccess_rights() {
        return _smearmetadata.getAccess_rights();
    }

    /**
    * Sets the access_rights of this smearmetadata.
    *
    * @param access_rights the access_rights of this smearmetadata
    */
    @Override
    public void setAccess_rights(java.lang.String access_rights) {
        _smearmetadata.setAccess_rights(access_rights);
    }

    /**
    * Returns the project of this smearmetadata.
    *
    * @return the project of this smearmetadata
    */
    @Override
    public java.lang.String getProject() {
        return _smearmetadata.getProject();
    }

    /**
    * Sets the project of this smearmetadata.
    *
    * @param project the project of this smearmetadata
    */
    @Override
    public void setProject(java.lang.String project) {
        _smearmetadata.setProject(project);
    }

    /**
    * Returns the maintaining_organisation of this smearmetadata.
    *
    * @return the maintaining_organisation of this smearmetadata
    */
    @Override
    public java.lang.String getMaintaining_organisation() {
        return _smearmetadata.getMaintaining_organisation();
    }

    /**
    * Sets the maintaining_organisation of this smearmetadata.
    *
    * @param maintaining_organisation the maintaining_organisation of this smearmetadata
    */
    @Override
    public void setMaintaining_organisation(
        java.lang.String maintaining_organisation) {
        _smearmetadata.setMaintaining_organisation(maintaining_organisation);
    }

    /**
    * Returns the contact of this smearmetadata.
    *
    * @return the contact of this smearmetadata
    */
    @Override
    public java.lang.String getContact() {
        return _smearmetadata.getContact();
    }

    /**
    * Sets the contact of this smearmetadata.
    *
    * @param contact the contact of this smearmetadata
    */
    @Override
    public void setContact(java.lang.String contact) {
        _smearmetadata.setContact(contact);
    }

    /**
    * Returns the ref of this smearmetadata.
    *
    * @return the ref of this smearmetadata
    */
    @Override
    public java.lang.String getRef() {
        return _smearmetadata.getRef();
    }

    /**
    * Sets the ref of this smearmetadata.
    *
    * @param ref the ref of this smearmetadata
    */
    @Override
    public void setRef(java.lang.String ref) {
        _smearmetadata.setRef(ref);
    }

    /**
    * Returns the creator of this smearmetadata.
    *
    * @return the creator of this smearmetadata
    */
    @Override
    public java.lang.String getCreator() {
        return _smearmetadata.getCreator();
    }

    /**
    * Sets the creator of this smearmetadata.
    *
    * @param creator the creator of this smearmetadata
    */
    @Override
    public void setCreator(java.lang.String creator) {
        _smearmetadata.setCreator(creator);
    }

    /**
    * Returns the discipline of this smearmetadata.
    *
    * @return the discipline of this smearmetadata
    */
    @Override
    public java.lang.String getDiscipline() {
        return _smearmetadata.getDiscipline();
    }

    /**
    * Sets the discipline of this smearmetadata.
    *
    * @param discipline the discipline of this smearmetadata
    */
    @Override
    public void setDiscipline(java.lang.String discipline) {
        _smearmetadata.setDiscipline(discipline);
    }

    /**
    * Returns the timestamp of this smearmetadata.
    *
    * @return the timestamp of this smearmetadata
    */
    @Override
    public java.util.Date getTimestamp() {
        return _smearmetadata.getTimestamp();
    }

    /**
    * Sets the timestamp of this smearmetadata.
    *
    * @param timestamp the timestamp of this smearmetadata
    */
    @Override
    public void setTimestamp(java.util.Date timestamp) {
        _smearmetadata.setTimestamp(timestamp);
    }

    @Override
    public boolean isNew() {
        return _smearmetadata.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearmetadata.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearmetadata.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearmetadata.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearmetadata.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearmetadata.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearmetadata.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearmetadata.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearmetadata.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearmetadata.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearmetadata.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearmetadataWrapper((Smearmetadata) _smearmetadata.clone());
    }

    @Override
    public int compareTo(Smearmetadata smearmetadata) {
        return _smearmetadata.compareTo(smearmetadata);
    }

    @Override
    public int hashCode() {
        return _smearmetadata.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Smearmetadata> toCacheModel() {
        return _smearmetadata.toCacheModel();
    }

    @Override
    public Smearmetadata toEscapedModel() {
        return new SmearmetadataWrapper(_smearmetadata.toEscapedModel());
    }

    @Override
    public Smearmetadata toUnescapedModel() {
        return new SmearmetadataWrapper(_smearmetadata.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearmetadata.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearmetadata.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearmetadata.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearmetadataWrapper)) {
            return false;
        }

        SmearmetadataWrapper smearmetadataWrapper = (SmearmetadataWrapper) obj;

        if (Validator.equals(_smearmetadata, smearmetadataWrapper._smearmetadata)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Smearmetadata getWrappedSmearmetadata() {
        return _smearmetadata;
    }

    @Override
    public Smearmetadata getWrappedModel() {
        return _smearmetadata;
    }

    @Override
    public void resetOriginalValues() {
        _smearmetadata.resetOriginalValues();
    }
}
