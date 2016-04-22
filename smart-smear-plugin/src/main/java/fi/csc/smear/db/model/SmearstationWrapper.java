package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Smearstation}.
 * </p>
 *
 * @author pj
 * @see Smearstation
 * @generated
 */
public class SmearstationWrapper implements Smearstation,
    ModelWrapper<Smearstation> {
    private Smearstation _smearstation;

    public SmearstationWrapper(Smearstation smearstation) {
        _smearstation = smearstation;
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

    /**
    * Returns the primary key of this smearstation.
    *
    * @return the primary key of this smearstation
    */
    @Override
    public long getPrimaryKey() {
        return _smearstation.getPrimaryKey();
    }

    /**
    * Sets the primary key of this smearstation.
    *
    * @param primaryKey the primary key of this smearstation
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _smearstation.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the station i d of this smearstation.
    *
    * @return the station i d of this smearstation
    */
    @Override
    public long getStationID() {
        return _smearstation.getStationID();
    }

    /**
    * Sets the station i d of this smearstation.
    *
    * @param stationID the station i d of this smearstation
    */
    @Override
    public void setStationID(long stationID) {
        _smearstation.setStationID(stationID);
    }

    /**
    * Returns the dcmipoint of this smearstation.
    *
    * @return the dcmipoint of this smearstation
    */
    @Override
    public java.lang.String getDcmipoint() {
        return _smearstation.getDcmipoint();
    }

    /**
    * Sets the dcmipoint of this smearstation.
    *
    * @param dcmipoint the dcmipoint of this smearstation
    */
    @Override
    public void setDcmipoint(java.lang.String dcmipoint) {
        _smearstation.setDcmipoint(dcmipoint);
    }

    /**
    * Returns the name of this smearstation.
    *
    * @return the name of this smearstation
    */
    @Override
    public java.lang.String getName() {
        return _smearstation.getName();
    }

    /**
    * Sets the name of this smearstation.
    *
    * @param name the name of this smearstation
    */
    @Override
    public void setName(java.lang.String name) {
        _smearstation.setName(name);
    }

    /**
    * Returns the data avail of this smearstation.
    *
    * @return the data avail of this smearstation
    */
    @Override
    public boolean getDataAvail() {
        return _smearstation.getDataAvail();
    }

    /**
    * Returns <code>true</code> if this smearstation is data avail.
    *
    * @return <code>true</code> if this smearstation is data avail; <code>false</code> otherwise
    */
    @Override
    public boolean isDataAvail() {
        return _smearstation.isDataAvail();
    }

    /**
    * Sets whether this smearstation is data avail.
    *
    * @param dataAvail the data avail of this smearstation
    */
    @Override
    public void setDataAvail(boolean dataAvail) {
        _smearstation.setDataAvail(dataAvail);
    }

    @Override
    public boolean isNew() {
        return _smearstation.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _smearstation.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _smearstation.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _smearstation.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _smearstation.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _smearstation.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _smearstation.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _smearstation.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _smearstation.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _smearstation.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _smearstation.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SmearstationWrapper((Smearstation) _smearstation.clone());
    }

    @Override
    public int compareTo(Smearstation smearstation) {
        return _smearstation.compareTo(smearstation);
    }

    @Override
    public int hashCode() {
        return _smearstation.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Smearstation> toCacheModel() {
        return _smearstation.toCacheModel();
    }

    @Override
    public Smearstation toEscapedModel() {
        return new SmearstationWrapper(_smearstation.toEscapedModel());
    }

    @Override
    public Smearstation toUnescapedModel() {
        return new SmearstationWrapper(_smearstation.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _smearstation.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _smearstation.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _smearstation.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearstationWrapper)) {
            return false;
        }

        SmearstationWrapper smearstationWrapper = (SmearstationWrapper) obj;

        if (Validator.equals(_smearstation, smearstationWrapper._smearstation)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Smearstation getWrappedSmearstation() {
        return _smearstation;
    }

    @Override
    public Smearstation getWrappedModel() {
        return _smearstation;
    }

    @Override
    public void resetOriginalValues() {
        _smearstation.resetOriginalValues();
    }
}
