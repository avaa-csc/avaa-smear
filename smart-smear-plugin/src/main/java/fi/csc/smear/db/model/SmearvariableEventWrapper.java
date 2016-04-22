package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearvariableEvent}.
 * </p>
 *
 * @author pj
 * @see SmearvariableEvent
 * @generated
 */
public class SmearvariableEventWrapper implements SmearvariableEvent,
    ModelWrapper<SmearvariableEvent> {
    private SmearvariableEvent _smearvariableEvent;

    public SmearvariableEventWrapper(SmearvariableEvent smearvariableEvent) {
        _smearvariableEvent = smearvariableEvent;
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

    /**
    * Returns the primary key of this smearvariable event.
    *
    * @return the primary key of this smearvariable event
    */
    @Override
    public fi.csc.smear.db.service.persistence.SmearvariableEventPK getPrimaryKey() {
        return _smearvariableEvent.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smearvariable event.
    *
    * @param primaryKey the primary key of this smearvariable event
    */
    @Override
    public void setPrimaryKey(
        fi.csc.smear.db.service.persistence.SmearvariableEventPK primaryKey) {
        _smearvariableEvent.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the event i d of this smearvariable event.
    *
    * @return the event i d of this smearvariable event
    */
    @Override
    public long getEventID() {
        return _smearvariableEvent.getEventID();
    }

    /**
    * Sets the event i d of this smearvariable event.
    *
    * @param eventID the event i d of this smearvariable event
    */
    @Override
    public void setEventID(long eventID) {
        _smearvariableEvent.setEventID(eventID);
    }

    /**
    * Returns the variable i d of this smearvariable event.
    *
    * @return the variable i d of this smearvariable event
    */
    @Override
    public long getVariableID() {
        return _smearvariableEvent.getVariableID();
    }

    /**
    * Sets the variable i d of this smearvariable event.
    *
    * @param variableID the variable i d of this smearvariable event
    */
    @Override
    public void setVariableID(long variableID) {
        _smearvariableEvent.setVariableID(variableID);
    }

    @Override
    public boolean isNew() {
        return _smearvariableEvent.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearvariableEvent.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearvariableEvent.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearvariableEvent.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearvariableEvent.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearvariableEvent.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearvariableEvent.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearvariableEvent.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearvariableEvent.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearvariableEvent.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearvariableEvent.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearvariableEventWrapper((SmearvariableEvent) _smearvariableEvent.clone());
    }

    @Override
    public int compareTo(SmearvariableEvent smearvariableEvent) {
        return _smearvariableEvent.compareTo(smearvariableEvent);
    }

    @Override
    public int hashCode() {
        return _smearvariableEvent.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearvariableEvent> toCacheModel() {
        return _smearvariableEvent.toCacheModel();
    }

    @Override
    public SmearvariableEvent toEscapedModel() {
        return new SmearvariableEventWrapper(_smearvariableEvent.toEscapedModel());
    }

    @Override
    public SmearvariableEvent toUnescapedModel() {
        return new SmearvariableEventWrapper(_smearvariableEvent.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearvariableEvent.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearvariableEvent.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearvariableEvent.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearvariableEventWrapper)) {
            return false;
        }

        SmearvariableEventWrapper smearvariableEventWrapper = (SmearvariableEventWrapper) obj;

        if (Validator.equals(_smearvariableEvent,
                    smearvariableEventWrapper._smearvariableEvent)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearvariableEvent getWrappedSmearvariableEvent() {
        return _smearvariableEvent;
    }

    @Override
    public SmearvariableEvent getWrappedModel() {
        return _smearvariableEvent;
    }

    @Override
    public void resetOriginalValues() {
        _smearvariableEvent.resetOriginalValues();
    }
}
