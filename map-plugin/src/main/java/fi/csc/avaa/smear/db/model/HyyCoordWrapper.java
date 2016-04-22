package fi.csc.avaa.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HyyCoord}.
 * </p>
 *
 * @author tkantola
 * @see HyyCoord
 * @generated
 */
public class HyyCoordWrapper implements HyyCoord, ModelWrapper<HyyCoord> {
    private HyyCoord _hyyCoord;

    public HyyCoordWrapper(HyyCoord hyyCoord) {
        _hyyCoord = hyyCoord;
    }

    @Override
    public Class<?> getModelClass() {
        return HyyCoord.class;
    }

    @Override
    public String getModelClassName() {
        return HyyCoord.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("arrTimeID", getArrTimeID());
        attributes.put("arrTime", getArrTime());
        attributes.put("matTime", getMatTime());
        attributes.put("year", getYear());
        attributes.put("month", getMonth());
        attributes.put("day", getDay());
        attributes.put("hour", getHour());
        attributes.put("doy", getDoy());
        attributes.put("backTime", getBackTime());
        attributes.put("lat100", getLat100());
        attributes.put("lon100", getLon100());
        attributes.put("alt100", getAlt100());
        attributes.put("azim100", getAzim100());
        attributes.put("lat250", getLat250());
        attributes.put("lon250", getLon250());
        attributes.put("alt250", getAlt250());
        attributes.put("azim250", getAzim250());
        attributes.put("lat500", getLat500());
        attributes.put("lon500", getLon500());
        attributes.put("alt500", getAlt500());
        attributes.put("azim500", getAzim500());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long arrTimeID = (Long) attributes.get("arrTimeID");

        if (arrTimeID != null) {
            setArrTimeID(arrTimeID);
        }

        Date arrTime = (Date) attributes.get("arrTime");

        if (arrTime != null) {
            setArrTime(arrTime);
        }

        Float matTime = (Float) attributes.get("matTime");

        if (matTime != null) {
            setMatTime(matTime);
        }

        Integer year = (Integer) attributes.get("year");

        if (year != null) {
            setYear(year);
        }

        Integer month = (Integer) attributes.get("month");

        if (month != null) {
            setMonth(month);
        }

        Integer day = (Integer) attributes.get("day");

        if (day != null) {
            setDay(day);
        }

        Integer hour = (Integer) attributes.get("hour");

        if (hour != null) {
            setHour(hour);
        }

        Integer doy = (Integer) attributes.get("doy");

        if (doy != null) {
            setDoy(doy);
        }

        Integer backTime = (Integer) attributes.get("backTime");

        if (backTime != null) {
            setBackTime(backTime);
        }

        Float lat100 = (Float) attributes.get("lat100");

        if (lat100 != null) {
            setLat100(lat100);
        }

        Float lon100 = (Float) attributes.get("lon100");

        if (lon100 != null) {
            setLon100(lon100);
        }

        Float alt100 = (Float) attributes.get("alt100");

        if (alt100 != null) {
            setAlt100(alt100);
        }

        Float azim100 = (Float) attributes.get("azim100");

        if (azim100 != null) {
            setAzim100(azim100);
        }

        Float lat250 = (Float) attributes.get("lat250");

        if (lat250 != null) {
            setLat250(lat250);
        }

        Float lon250 = (Float) attributes.get("lon250");

        if (lon250 != null) {
            setLon250(lon250);
        }

        Float alt250 = (Float) attributes.get("alt250");

        if (alt250 != null) {
            setAlt250(alt250);
        }

        Float azim250 = (Float) attributes.get("azim250");

        if (azim250 != null) {
            setAzim250(azim250);
        }

        Float lat500 = (Float) attributes.get("lat500");

        if (lat500 != null) {
            setLat500(lat500);
        }

        Float lon500 = (Float) attributes.get("lon500");

        if (lon500 != null) {
            setLon500(lon500);
        }

        Float alt500 = (Float) attributes.get("alt500");

        if (alt500 != null) {
            setAlt500(alt500);
        }

        Float azim500 = (Float) attributes.get("azim500");

        if (azim500 != null) {
            setAzim500(azim500);
        }
    }

    /**
    * Returns the primary key of this hyy coord.
    *
    * @return the primary key of this hyy coord
    */
    @Override
    public long getPrimaryKey() {
        return _hyyCoord.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hyy coord.
    *
    * @param primaryKey the primary key of this hyy coord
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _hyyCoord.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the arr time i d of this hyy coord.
    *
    * @return the arr time i d of this hyy coord
    */
    @Override
    public long getArrTimeID() {
        return _hyyCoord.getArrTimeID();
    }

    /**
    * Sets the arr time i d of this hyy coord.
    *
    * @param arrTimeID the arr time i d of this hyy coord
    */
    @Override
    public void setArrTimeID(long arrTimeID) {
        _hyyCoord.setArrTimeID(arrTimeID);
    }

    /**
    * Returns the arr time of this hyy coord.
    *
    * @return the arr time of this hyy coord
    */
    @Override
    public java.util.Date getArrTime() {
        return _hyyCoord.getArrTime();
    }

    /**
    * Sets the arr time of this hyy coord.
    *
    * @param arrTime the arr time of this hyy coord
    */
    @Override
    public void setArrTime(java.util.Date arrTime) {
        _hyyCoord.setArrTime(arrTime);
    }

    /**
    * Returns the mat time of this hyy coord.
    *
    * @return the mat time of this hyy coord
    */
    @Override
    public float getMatTime() {
        return _hyyCoord.getMatTime();
    }

    /**
    * Sets the mat time of this hyy coord.
    *
    * @param matTime the mat time of this hyy coord
    */
    @Override
    public void setMatTime(float matTime) {
        _hyyCoord.setMatTime(matTime);
    }

    /**
    * Returns the year of this hyy coord.
    *
    * @return the year of this hyy coord
    */
    @Override
    public int getYear() {
        return _hyyCoord.getYear();
    }

    /**
    * Sets the year of this hyy coord.
    *
    * @param year the year of this hyy coord
    */
    @Override
    public void setYear(int year) {
        _hyyCoord.setYear(year);
    }

    /**
    * Returns the month of this hyy coord.
    *
    * @return the month of this hyy coord
    */
    @Override
    public int getMonth() {
        return _hyyCoord.getMonth();
    }

    /**
    * Sets the month of this hyy coord.
    *
    * @param month the month of this hyy coord
    */
    @Override
    public void setMonth(int month) {
        _hyyCoord.setMonth(month);
    }

    /**
    * Returns the day of this hyy coord.
    *
    * @return the day of this hyy coord
    */
    @Override
    public int getDay() {
        return _hyyCoord.getDay();
    }

    /**
    * Sets the day of this hyy coord.
    *
    * @param day the day of this hyy coord
    */
    @Override
    public void setDay(int day) {
        _hyyCoord.setDay(day);
    }

    /**
    * Returns the hour of this hyy coord.
    *
    * @return the hour of this hyy coord
    */
    @Override
    public int getHour() {
        return _hyyCoord.getHour();
    }

    /**
    * Sets the hour of this hyy coord.
    *
    * @param hour the hour of this hyy coord
    */
    @Override
    public void setHour(int hour) {
        _hyyCoord.setHour(hour);
    }

    /**
    * Returns the doy of this hyy coord.
    *
    * @return the doy of this hyy coord
    */
    @Override
    public int getDoy() {
        return _hyyCoord.getDoy();
    }

    /**
    * Sets the doy of this hyy coord.
    *
    * @param doy the doy of this hyy coord
    */
    @Override
    public void setDoy(int doy) {
        _hyyCoord.setDoy(doy);
    }

    /**
    * Returns the back time of this hyy coord.
    *
    * @return the back time of this hyy coord
    */
    @Override
    public int getBackTime() {
        return _hyyCoord.getBackTime();
    }

    /**
    * Sets the back time of this hyy coord.
    *
    * @param backTime the back time of this hyy coord
    */
    @Override
    public void setBackTime(int backTime) {
        _hyyCoord.setBackTime(backTime);
    }

    /**
    * Returns the lat100 of this hyy coord.
    *
    * @return the lat100 of this hyy coord
    */
    @Override
    public float getLat100() {
        return _hyyCoord.getLat100();
    }

    /**
    * Sets the lat100 of this hyy coord.
    *
    * @param lat100 the lat100 of this hyy coord
    */
    @Override
    public void setLat100(float lat100) {
        _hyyCoord.setLat100(lat100);
    }

    /**
    * Returns the lon100 of this hyy coord.
    *
    * @return the lon100 of this hyy coord
    */
    @Override
    public float getLon100() {
        return _hyyCoord.getLon100();
    }

    /**
    * Sets the lon100 of this hyy coord.
    *
    * @param lon100 the lon100 of this hyy coord
    */
    @Override
    public void setLon100(float lon100) {
        _hyyCoord.setLon100(lon100);
    }

    /**
    * Returns the alt100 of this hyy coord.
    *
    * @return the alt100 of this hyy coord
    */
    @Override
    public float getAlt100() {
        return _hyyCoord.getAlt100();
    }

    /**
    * Sets the alt100 of this hyy coord.
    *
    * @param alt100 the alt100 of this hyy coord
    */
    @Override
    public void setAlt100(float alt100) {
        _hyyCoord.setAlt100(alt100);
    }

    /**
    * Returns the azim100 of this hyy coord.
    *
    * @return the azim100 of this hyy coord
    */
    @Override
    public float getAzim100() {
        return _hyyCoord.getAzim100();
    }

    /**
    * Sets the azim100 of this hyy coord.
    *
    * @param azim100 the azim100 of this hyy coord
    */
    @Override
    public void setAzim100(float azim100) {
        _hyyCoord.setAzim100(azim100);
    }

    /**
    * Returns the lat250 of this hyy coord.
    *
    * @return the lat250 of this hyy coord
    */
    @Override
    public float getLat250() {
        return _hyyCoord.getLat250();
    }

    /**
    * Sets the lat250 of this hyy coord.
    *
    * @param lat250 the lat250 of this hyy coord
    */
    @Override
    public void setLat250(float lat250) {
        _hyyCoord.setLat250(lat250);
    }

    /**
    * Returns the lon250 of this hyy coord.
    *
    * @return the lon250 of this hyy coord
    */
    @Override
    public float getLon250() {
        return _hyyCoord.getLon250();
    }

    /**
    * Sets the lon250 of this hyy coord.
    *
    * @param lon250 the lon250 of this hyy coord
    */
    @Override
    public void setLon250(float lon250) {
        _hyyCoord.setLon250(lon250);
    }

    /**
    * Returns the alt250 of this hyy coord.
    *
    * @return the alt250 of this hyy coord
    */
    @Override
    public float getAlt250() {
        return _hyyCoord.getAlt250();
    }

    /**
    * Sets the alt250 of this hyy coord.
    *
    * @param alt250 the alt250 of this hyy coord
    */
    @Override
    public void setAlt250(float alt250) {
        _hyyCoord.setAlt250(alt250);
    }

    /**
    * Returns the azim250 of this hyy coord.
    *
    * @return the azim250 of this hyy coord
    */
    @Override
    public float getAzim250() {
        return _hyyCoord.getAzim250();
    }

    /**
    * Sets the azim250 of this hyy coord.
    *
    * @param azim250 the azim250 of this hyy coord
    */
    @Override
    public void setAzim250(float azim250) {
        _hyyCoord.setAzim250(azim250);
    }

    /**
    * Returns the lat500 of this hyy coord.
    *
    * @return the lat500 of this hyy coord
    */
    @Override
    public float getLat500() {
        return _hyyCoord.getLat500();
    }

    /**
    * Sets the lat500 of this hyy coord.
    *
    * @param lat500 the lat500 of this hyy coord
    */
    @Override
    public void setLat500(float lat500) {
        _hyyCoord.setLat500(lat500);
    }

    /**
    * Returns the lon500 of this hyy coord.
    *
    * @return the lon500 of this hyy coord
    */
    @Override
    public float getLon500() {
        return _hyyCoord.getLon500();
    }

    /**
    * Sets the lon500 of this hyy coord.
    *
    * @param lon500 the lon500 of this hyy coord
    */
    @Override
    public void setLon500(float lon500) {
        _hyyCoord.setLon500(lon500);
    }

    /**
    * Returns the alt500 of this hyy coord.
    *
    * @return the alt500 of this hyy coord
    */
    @Override
    public float getAlt500() {
        return _hyyCoord.getAlt500();
    }

    /**
    * Sets the alt500 of this hyy coord.
    *
    * @param alt500 the alt500 of this hyy coord
    */
    @Override
    public void setAlt500(float alt500) {
        _hyyCoord.setAlt500(alt500);
    }

    /**
    * Returns the azim500 of this hyy coord.
    *
    * @return the azim500 of this hyy coord
    */
    @Override
    public float getAzim500() {
        return _hyyCoord.getAzim500();
    }

    /**
    * Sets the azim500 of this hyy coord.
    *
    * @param azim500 the azim500 of this hyy coord
    */
    @Override
    public void setAzim500(float azim500) {
        _hyyCoord.setAzim500(azim500);
    }

    @Override
    public boolean isNew() {
        return _hyyCoord.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hyyCoord.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hyyCoord.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hyyCoord.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hyyCoord.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hyyCoord.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hyyCoord.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hyyCoord.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hyyCoord.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hyyCoord.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hyyCoord.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HyyCoordWrapper((HyyCoord) _hyyCoord.clone());
    }

    @Override
    public int compareTo(HyyCoord hyyCoord) {
        return _hyyCoord.compareTo(hyyCoord);
    }

    @Override
    public int hashCode() {
        return _hyyCoord.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<HyyCoord> toCacheModel() {
        return _hyyCoord.toCacheModel();
    }

    @Override
    public HyyCoord toEscapedModel() {
        return new HyyCoordWrapper(_hyyCoord.toEscapedModel());
    }

    @Override
    public HyyCoord toUnescapedModel() {
        return new HyyCoordWrapper(_hyyCoord.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hyyCoord.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hyyCoord.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hyyCoord.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyCoordWrapper)) {
            return false;
        }

        HyyCoordWrapper hyyCoordWrapper = (HyyCoordWrapper) obj;

        if (Validator.equals(_hyyCoord, hyyCoordWrapper._hyyCoord)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public HyyCoord getWrappedHyyCoord() {
        return _hyyCoord;
    }

    @Override
    public HyyCoord getWrappedModel() {
        return _hyyCoord;
    }

    @Override
    public void resetOriginalValues() {
        _hyyCoord.resetOriginalValues();
    }
}
