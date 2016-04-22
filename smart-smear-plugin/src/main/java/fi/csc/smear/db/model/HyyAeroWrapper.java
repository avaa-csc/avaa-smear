package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HyyAero}.
 * </p>
 *
 * @author pj
 * @see HyyAero
 * @generated
 */
public class HyyAeroWrapper implements HyyAero, ModelWrapper<HyyAero> {
    private HyyAero _hyyAero;

    public HyyAeroWrapper(HyyAero hyyAero) {
        _hyyAero = hyyAero;
    }

    @Override
    public Class<?> getModelClass() {
        return HyyAero.class;
    }

    @Override
    public String getModelClassName() {
        return HyyAero.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("cn", getCn());
        attributes.put("cn_t", getCn_t());
        attributes.put("cn_p", getCn_p());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float cn = (Float) attributes.get("cn");

        if (cn != null) {
            setCn(cn);
        }

        Float cn_t = (Float) attributes.get("cn_t");

        if (cn_t != null) {
            setCn_t(cn_t);
        }

        Float cn_p = (Float) attributes.get("cn_p");

        if (cn_p != null) {
            setCn_p(cn_p);
        }
    }

    /**
    * Returns the primary key of this hyy aero.
    *
    * @return the primary key of this hyy aero
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _hyyAero.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hyy aero.
    *
    * @param primaryKey the primary key of this hyy aero
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _hyyAero.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this hyy aero.
    *
    * @return the samptime of this hyy aero
    */
    @Override
    public java.util.Date getSamptime() {
        return _hyyAero.getSamptime();
    }

    /**
    * Sets the samptime of this hyy aero.
    *
    * @param samptime the samptime of this hyy aero
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _hyyAero.setSamptime(samptime);
    }

    /**
    * Returns the cn of this hyy aero.
    *
    * @return the cn of this hyy aero
    */
    @Override
    public float getCn() {
        return _hyyAero.getCn();
    }

    /**
    * Sets the cn of this hyy aero.
    *
    * @param cn the cn of this hyy aero
    */
    @Override
    public void setCn(float cn) {
        _hyyAero.setCn(cn);
    }

    /**
    * Returns the cn_t of this hyy aero.
    *
    * @return the cn_t of this hyy aero
    */
    @Override
    public float getCn_t() {
        return _hyyAero.getCn_t();
    }

    /**
    * Sets the cn_t of this hyy aero.
    *
    * @param cn_t the cn_t of this hyy aero
    */
    @Override
    public void setCn_t(float cn_t) {
        _hyyAero.setCn_t(cn_t);
    }

    /**
    * Returns the cn_p of this hyy aero.
    *
    * @return the cn_p of this hyy aero
    */
    @Override
    public float getCn_p() {
        return _hyyAero.getCn_p();
    }

    /**
    * Sets the cn_p of this hyy aero.
    *
    * @param cn_p the cn_p of this hyy aero
    */
    @Override
    public void setCn_p(float cn_p) {
        _hyyAero.setCn_p(cn_p);
    }

    @Override
    public boolean isNew() {
        return _hyyAero.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hyyAero.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hyyAero.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hyyAero.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hyyAero.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hyyAero.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hyyAero.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hyyAero.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hyyAero.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hyyAero.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hyyAero.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HyyAeroWrapper((HyyAero) _hyyAero.clone());
    }

    @Override
    public int compareTo(HyyAero hyyAero) {
        return _hyyAero.compareTo(hyyAero);
    }

    @Override
    public int hashCode() {
        return _hyyAero.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<HyyAero> toCacheModel() {
        return _hyyAero.toCacheModel();
    }

    @Override
    public HyyAero toEscapedModel() {
        return new HyyAeroWrapper(_hyyAero.toEscapedModel());
    }

    @Override
    public HyyAero toUnescapedModel() {
        return new HyyAeroWrapper(_hyyAero.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hyyAero.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hyyAero.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hyyAero.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyAeroWrapper)) {
            return false;
        }

        HyyAeroWrapper hyyAeroWrapper = (HyyAeroWrapper) obj;

        if (Validator.equals(_hyyAero, hyyAeroWrapper._hyyAero)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public HyyAero getWrappedHyyAero() {
        return _hyyAero;
    }

    @Override
    public HyyAero getWrappedModel() {
        return _hyyAero;
    }

    @Override
    public void resetOriginalValues() {
        _hyyAero.resetOriginalValues();
    }
}
