package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sii2meta}.
 * </p>
 *
 * @author pj
 * @see Sii2meta
 * @generated
 */
public class Sii2metaWrapper implements Sii2meta, ModelWrapper<Sii2meta> {
    private Sii2meta _sii2meta;

    public Sii2metaWrapper(Sii2meta sii2meta) {
        _sii2meta = sii2meta;
    }

    @Override
    public Class<?> getModelClass() {
        return Sii2meta.class;
    }

    @Override
    public String getModelClassName() {
        return Sii2meta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("T_a", getT_a());
        attributes.put("T_a_EMEP", getT_a_EMEP());
        attributes.put("RH", getRH());
        attributes.put("RH_EMEP", getRH_EMEP());
        attributes.put("Net", getNet());
        attributes.put("Net_EMEP", getNet_EMEP());
        attributes.put("T_p_5", getT_p_5());
        attributes.put("T_p_5_EMEP", getT_p_5_EMEP());
        attributes.put("T_p_B20", getT_p_B20());
        attributes.put("T_p_B20_EMEP", getT_p_B20_EMEP());
        attributes.put("T_p_B35", getT_p_B35());
        attributes.put("T_p_B35_EMEP", getT_p_B35_EMEP());
        attributes.put("T_p_B50", getT_p_B50());
        attributes.put("T_p_B50_EMEP", getT_p_B50_EMEP());
        attributes.put("WTD", getWTD());
        attributes.put("WTD_EMEP", getWTD_EMEP());
        attributes.put("Precip", getPrecip());
        attributes.put("Precip_EMEP", getPrecip_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float T_a = (Float) attributes.get("T_a");

        if (T_a != null) {
            setT_a(T_a);
        }

        Integer T_a_EMEP = (Integer) attributes.get("T_a_EMEP");

        if (T_a_EMEP != null) {
            setT_a_EMEP(T_a_EMEP);
        }

        Float RH = (Float) attributes.get("RH");

        if (RH != null) {
            setRH(RH);
        }

        Integer RH_EMEP = (Integer) attributes.get("RH_EMEP");

        if (RH_EMEP != null) {
            setRH_EMEP(RH_EMEP);
        }

        Float Net = (Float) attributes.get("Net");

        if (Net != null) {
            setNet(Net);
        }

        Integer Net_EMEP = (Integer) attributes.get("Net_EMEP");

        if (Net_EMEP != null) {
            setNet_EMEP(Net_EMEP);
        }

        Float T_p_5 = (Float) attributes.get("T_p_5");

        if (T_p_5 != null) {
            setT_p_5(T_p_5);
        }

        Integer T_p_5_EMEP = (Integer) attributes.get("T_p_5_EMEP");

        if (T_p_5_EMEP != null) {
            setT_p_5_EMEP(T_p_5_EMEP);
        }

        Float T_p_B20 = (Float) attributes.get("T_p_B20");

        if (T_p_B20 != null) {
            setT_p_B20(T_p_B20);
        }

        Integer T_p_B20_EMEP = (Integer) attributes.get("T_p_B20_EMEP");

        if (T_p_B20_EMEP != null) {
            setT_p_B20_EMEP(T_p_B20_EMEP);
        }

        Float T_p_B35 = (Float) attributes.get("T_p_B35");

        if (T_p_B35 != null) {
            setT_p_B35(T_p_B35);
        }

        Integer T_p_B35_EMEP = (Integer) attributes.get("T_p_B35_EMEP");

        if (T_p_B35_EMEP != null) {
            setT_p_B35_EMEP(T_p_B35_EMEP);
        }

        Float T_p_B50 = (Float) attributes.get("T_p_B50");

        if (T_p_B50 != null) {
            setT_p_B50(T_p_B50);
        }

        Integer T_p_B50_EMEP = (Integer) attributes.get("T_p_B50_EMEP");

        if (T_p_B50_EMEP != null) {
            setT_p_B50_EMEP(T_p_B50_EMEP);
        }

        Float WTD = (Float) attributes.get("WTD");

        if (WTD != null) {
            setWTD(WTD);
        }

        Integer WTD_EMEP = (Integer) attributes.get("WTD_EMEP");

        if (WTD_EMEP != null) {
            setWTD_EMEP(WTD_EMEP);
        }

        Float Precip = (Float) attributes.get("Precip");

        if (Precip != null) {
            setPrecip(Precip);
        }

        Integer Precip_EMEP = (Integer) attributes.get("Precip_EMEP");

        if (Precip_EMEP != null) {
            setPrecip_EMEP(Precip_EMEP);
        }
    }

    /**
    * Returns the primary key of this sii2meta.
    *
    * @return the primary key of this sii2meta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _sii2meta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this sii2meta.
    *
    * @param primaryKey the primary key of this sii2meta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _sii2meta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this sii2meta.
    *
    * @return the samptime of this sii2meta
    */
    @Override
    public java.util.Date getSamptime() {
        return _sii2meta.getSamptime();
    }

    /**
    * Sets the samptime of this sii2meta.
    *
    * @param samptime the samptime of this sii2meta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _sii2meta.setSamptime(samptime);
    }

    /**
    * Returns the t_a of this sii2meta.
    *
    * @return the t_a of this sii2meta
    */
    @Override
    public float getT_a() {
        return _sii2meta.getT_a();
    }

    /**
    * Sets the t_a of this sii2meta.
    *
    * @param T_a the t_a of this sii2meta
    */
    @Override
    public void setT_a(float T_a) {
        _sii2meta.setT_a(T_a);
    }

    /**
    * Returns the t_a_ e m e p of this sii2meta.
    *
    * @return the t_a_ e m e p of this sii2meta
    */
    @Override
    public int getT_a_EMEP() {
        return _sii2meta.getT_a_EMEP();
    }

    /**
    * Sets the t_a_ e m e p of this sii2meta.
    *
    * @param T_a_EMEP the t_a_ e m e p of this sii2meta
    */
    @Override
    public void setT_a_EMEP(int T_a_EMEP) {
        _sii2meta.setT_a_EMEP(T_a_EMEP);
    }

    /**
    * Returns the r h of this sii2meta.
    *
    * @return the r h of this sii2meta
    */
    @Override
    public float getRH() {
        return _sii2meta.getRH();
    }

    /**
    * Sets the r h of this sii2meta.
    *
    * @param RH the r h of this sii2meta
    */
    @Override
    public void setRH(float RH) {
        _sii2meta.setRH(RH);
    }

    /**
    * Returns the r h_ e m e p of this sii2meta.
    *
    * @return the r h_ e m e p of this sii2meta
    */
    @Override
    public int getRH_EMEP() {
        return _sii2meta.getRH_EMEP();
    }

    /**
    * Sets the r h_ e m e p of this sii2meta.
    *
    * @param RH_EMEP the r h_ e m e p of this sii2meta
    */
    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _sii2meta.setRH_EMEP(RH_EMEP);
    }

    /**
    * Returns the net of this sii2meta.
    *
    * @return the net of this sii2meta
    */
    @Override
    public float getNet() {
        return _sii2meta.getNet();
    }

    /**
    * Sets the net of this sii2meta.
    *
    * @param Net the net of this sii2meta
    */
    @Override
    public void setNet(float Net) {
        _sii2meta.setNet(Net);
    }

    /**
    * Returns the net_ e m e p of this sii2meta.
    *
    * @return the net_ e m e p of this sii2meta
    */
    @Override
    public int getNet_EMEP() {
        return _sii2meta.getNet_EMEP();
    }

    /**
    * Sets the net_ e m e p of this sii2meta.
    *
    * @param Net_EMEP the net_ e m e p of this sii2meta
    */
    @Override
    public void setNet_EMEP(int Net_EMEP) {
        _sii2meta.setNet_EMEP(Net_EMEP);
    }

    /**
    * Returns the t_p_5 of this sii2meta.
    *
    * @return the t_p_5 of this sii2meta
    */
    @Override
    public float getT_p_5() {
        return _sii2meta.getT_p_5();
    }

    /**
    * Sets the t_p_5 of this sii2meta.
    *
    * @param T_p_5 the t_p_5 of this sii2meta
    */
    @Override
    public void setT_p_5(float T_p_5) {
        _sii2meta.setT_p_5(T_p_5);
    }

    /**
    * Returns the t_p_5_ e m e p of this sii2meta.
    *
    * @return the t_p_5_ e m e p of this sii2meta
    */
    @Override
    public int getT_p_5_EMEP() {
        return _sii2meta.getT_p_5_EMEP();
    }

    /**
    * Sets the t_p_5_ e m e p of this sii2meta.
    *
    * @param T_p_5_EMEP the t_p_5_ e m e p of this sii2meta
    */
    @Override
    public void setT_p_5_EMEP(int T_p_5_EMEP) {
        _sii2meta.setT_p_5_EMEP(T_p_5_EMEP);
    }

    /**
    * Returns the t_p_ b20 of this sii2meta.
    *
    * @return the t_p_ b20 of this sii2meta
    */
    @Override
    public float getT_p_B20() {
        return _sii2meta.getT_p_B20();
    }

    /**
    * Sets the t_p_ b20 of this sii2meta.
    *
    * @param T_p_B20 the t_p_ b20 of this sii2meta
    */
    @Override
    public void setT_p_B20(float T_p_B20) {
        _sii2meta.setT_p_B20(T_p_B20);
    }

    /**
    * Returns the t_p_ b20_ e m e p of this sii2meta.
    *
    * @return the t_p_ b20_ e m e p of this sii2meta
    */
    @Override
    public int getT_p_B20_EMEP() {
        return _sii2meta.getT_p_B20_EMEP();
    }

    /**
    * Sets the t_p_ b20_ e m e p of this sii2meta.
    *
    * @param T_p_B20_EMEP the t_p_ b20_ e m e p of this sii2meta
    */
    @Override
    public void setT_p_B20_EMEP(int T_p_B20_EMEP) {
        _sii2meta.setT_p_B20_EMEP(T_p_B20_EMEP);
    }

    /**
    * Returns the t_p_ b35 of this sii2meta.
    *
    * @return the t_p_ b35 of this sii2meta
    */
    @Override
    public float getT_p_B35() {
        return _sii2meta.getT_p_B35();
    }

    /**
    * Sets the t_p_ b35 of this sii2meta.
    *
    * @param T_p_B35 the t_p_ b35 of this sii2meta
    */
    @Override
    public void setT_p_B35(float T_p_B35) {
        _sii2meta.setT_p_B35(T_p_B35);
    }

    /**
    * Returns the t_p_ b35_ e m e p of this sii2meta.
    *
    * @return the t_p_ b35_ e m e p of this sii2meta
    */
    @Override
    public int getT_p_B35_EMEP() {
        return _sii2meta.getT_p_B35_EMEP();
    }

    /**
    * Sets the t_p_ b35_ e m e p of this sii2meta.
    *
    * @param T_p_B35_EMEP the t_p_ b35_ e m e p of this sii2meta
    */
    @Override
    public void setT_p_B35_EMEP(int T_p_B35_EMEP) {
        _sii2meta.setT_p_B35_EMEP(T_p_B35_EMEP);
    }

    /**
    * Returns the t_p_ b50 of this sii2meta.
    *
    * @return the t_p_ b50 of this sii2meta
    */
    @Override
    public float getT_p_B50() {
        return _sii2meta.getT_p_B50();
    }

    /**
    * Sets the t_p_ b50 of this sii2meta.
    *
    * @param T_p_B50 the t_p_ b50 of this sii2meta
    */
    @Override
    public void setT_p_B50(float T_p_B50) {
        _sii2meta.setT_p_B50(T_p_B50);
    }

    /**
    * Returns the t_p_ b50_ e m e p of this sii2meta.
    *
    * @return the t_p_ b50_ e m e p of this sii2meta
    */
    @Override
    public int getT_p_B50_EMEP() {
        return _sii2meta.getT_p_B50_EMEP();
    }

    /**
    * Sets the t_p_ b50_ e m e p of this sii2meta.
    *
    * @param T_p_B50_EMEP the t_p_ b50_ e m e p of this sii2meta
    */
    @Override
    public void setT_p_B50_EMEP(int T_p_B50_EMEP) {
        _sii2meta.setT_p_B50_EMEP(T_p_B50_EMEP);
    }

    /**
    * Returns the w t d of this sii2meta.
    *
    * @return the w t d of this sii2meta
    */
    @Override
    public float getWTD() {
        return _sii2meta.getWTD();
    }

    /**
    * Sets the w t d of this sii2meta.
    *
    * @param WTD the w t d of this sii2meta
    */
    @Override
    public void setWTD(float WTD) {
        _sii2meta.setWTD(WTD);
    }

    /**
    * Returns the w t d_ e m e p of this sii2meta.
    *
    * @return the w t d_ e m e p of this sii2meta
    */
    @Override
    public int getWTD_EMEP() {
        return _sii2meta.getWTD_EMEP();
    }

    /**
    * Sets the w t d_ e m e p of this sii2meta.
    *
    * @param WTD_EMEP the w t d_ e m e p of this sii2meta
    */
    @Override
    public void setWTD_EMEP(int WTD_EMEP) {
        _sii2meta.setWTD_EMEP(WTD_EMEP);
    }

    /**
    * Returns the precip of this sii2meta.
    *
    * @return the precip of this sii2meta
    */
    @Override
    public float getPrecip() {
        return _sii2meta.getPrecip();
    }

    /**
    * Sets the precip of this sii2meta.
    *
    * @param Precip the precip of this sii2meta
    */
    @Override
    public void setPrecip(float Precip) {
        _sii2meta.setPrecip(Precip);
    }

    /**
    * Returns the precip_ e m e p of this sii2meta.
    *
    * @return the precip_ e m e p of this sii2meta
    */
    @Override
    public int getPrecip_EMEP() {
        return _sii2meta.getPrecip_EMEP();
    }

    /**
    * Sets the precip_ e m e p of this sii2meta.
    *
    * @param Precip_EMEP the precip_ e m e p of this sii2meta
    */
    @Override
    public void setPrecip_EMEP(int Precip_EMEP) {
        _sii2meta.setPrecip_EMEP(Precip_EMEP);
    }

    @Override
    public boolean isNew() {
        return _sii2meta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _sii2meta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _sii2meta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _sii2meta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _sii2meta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _sii2meta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _sii2meta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _sii2meta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _sii2meta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _sii2meta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _sii2meta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Sii2metaWrapper((Sii2meta) _sii2meta.clone());
    }

    @Override
    public int compareTo(Sii2meta sii2meta) {
        return _sii2meta.compareTo(sii2meta);
    }

    @Override
    public int hashCode() {
        return _sii2meta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Sii2meta> toCacheModel() {
        return _sii2meta.toCacheModel();
    }

    @Override
    public Sii2meta toEscapedModel() {
        return new Sii2metaWrapper(_sii2meta.toEscapedModel());
    }

    @Override
    public Sii2meta toUnescapedModel() {
        return new Sii2metaWrapper(_sii2meta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _sii2meta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _sii2meta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _sii2meta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii2metaWrapper)) {
            return false;
        }

        Sii2metaWrapper sii2metaWrapper = (Sii2metaWrapper) obj;

        if (Validator.equals(_sii2meta, sii2metaWrapper._sii2meta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Sii2meta getWrappedSii2meta() {
        return _sii2meta;
    }

    @Override
    public Sii2meta getWrappedModel() {
        return _sii2meta;
    }

    @Override
    public void resetOriginalValues() {
        _sii2meta.resetOriginalValues();
    }
}
