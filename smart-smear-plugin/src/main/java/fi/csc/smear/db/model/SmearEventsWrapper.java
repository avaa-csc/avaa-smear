package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SmearEvents}.
 * </p>
 *
 * @author pj
 * @see SmearEvents
 * @generated
 */
public class SmearEventsWrapper implements SmearEvents,
    ModelWrapper<SmearEvents> {
    private SmearEvents _smearEvents;

    public SmearEventsWrapper(SmearEvents smearEvents) {
        _smearEvents = smearEvents;
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

    /**
    * Returns the primary key of this smear events.
    *
    * @return the primary key of this smear events
    */
    @Override
    public long getPrimaryKey() {
        return _smearEvents.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smear events.
    *
    * @param primaryKey the primary key of this smear events
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearEvents.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the event i d of this smear events.
    *
    * @return the event i d of this smear events
    */
    @Override
    public long getEventID() {
        return _smearEvents.getEventID();
    }

    /**
    * Sets the event i d of this smear events.
    *
    * @param eventID the event i d of this smear events
    */
    @Override
    public void setEventID(long eventID) {
        _smearEvents.setEventID(eventID);
    }

    /**
    * Returns the event_type of this smear events.
    *
    * @return the event_type of this smear events
    */
    @Override
    public java.lang.String getEvent_type() {
        return _smearEvents.getEvent_type();
    }

    /**
    * Sets the event_type of this smear events.
    *
    * @param event_type the event_type of this smear events
    */
    @Override
    public void setEvent_type(java.lang.String event_type) {
        _smearEvents.setEvent_type(event_type);
    }

    /**
    * Returns the event of this smear events.
    *
    * @return the event of this smear events
    */
    @Override
    public java.lang.String getEvent() {
        return _smearEvents.getEvent();
    }

    /**
    * Sets the event of this smear events.
    *
    * @param event the event of this smear events
    */
    @Override
    public void setEvent(java.lang.String event) {
        _smearEvents.setEvent(event);
    }

    /**
    * Returns the who of this smear events.
    *
    * @return the who of this smear events
    */
    @Override
    public java.lang.String getWho() {
        return _smearEvents.getWho();
    }

    /**
    * Sets the who of this smear events.
    *
    * @param who the who of this smear events
    */
    @Override
    public void setWho(java.lang.String who) {
        _smearEvents.setWho(who);
    }

    /**
    * Returns the period_start of this smear events.
    *
    * @return the period_start of this smear events
    */
    @Override
    public java.util.Date getPeriod_start() {
        return _smearEvents.getPeriod_start();
    }

    /**
    * Sets the period_start of this smear events.
    *
    * @param period_start the period_start of this smear events
    */
    @Override
    public void setPeriod_start(java.util.Date period_start) {
        _smearEvents.setPeriod_start(period_start);
    }

    /**
    * Returns the period_end of this smear events.
    *
    * @return the period_end of this smear events
    */
    @Override
    public java.util.Date getPeriod_end() {
        return _smearEvents.getPeriod_end();
    }

    /**
    * Sets the period_end of this smear events.
    *
    * @param period_end the period_end of this smear events
    */
    @Override
    public void setPeriod_end(java.util.Date period_end) {
        _smearEvents.setPeriod_end(period_end);
    }

    /**
    * Returns the etimestamp of this smear events.
    *
    * @return the etimestamp of this smear events
    */
    @Override
    public java.util.Date getEtimestamp() {
        return _smearEvents.getEtimestamp();
    }

    /**
    * Sets the etimestamp of this smear events.
    *
    * @param etimestamp the etimestamp of this smear events
    */
    @Override
    public void setEtimestamp(java.util.Date etimestamp) {
        _smearEvents.setEtimestamp(etimestamp);
    }

    @Override
    public boolean isNew() {
        return _smearEvents.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearEvents.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearEvents.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearEvents.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearEvents.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearEvents.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearEvents.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearEvents.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearEvents.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearEvents.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearEvents.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearEventsWrapper((SmearEvents) _smearEvents.clone());
    }

    @Override
    public int compareTo(SmearEvents smearEvents) {
        return _smearEvents.compareTo(smearEvents);
    }

    @Override
    public int hashCode() {
        return _smearEvents.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SmearEvents> toCacheModel() {
        return _smearEvents.toCacheModel();
    }

    @Override
    public SmearEvents toEscapedModel() {
        return new SmearEventsWrapper(_smearEvents.toEscapedModel());
    }

    @Override
    public SmearEvents toUnescapedModel() {
        return new SmearEventsWrapper(_smearEvents.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearEvents.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearEvents.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearEvents.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearEventsWrapper)) {
            return false;
        }

        SmearEventsWrapper smearEventsWrapper = (SmearEventsWrapper) obj;

        if (Validator.equals(_smearEvents, smearEventsWrapper._smearEvents)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SmearEvents getWrappedSmearEvents() {
        return _smearEvents;
    }

    @Override
    public SmearEvents getWrappedModel() {
        return _smearEvents;
    }

    @Override
    public void resetOriginalValues() {
        _smearEvents.resetOriginalValues();
    }
}
