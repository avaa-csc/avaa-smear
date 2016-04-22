package fi.csc.avaa.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.smear.db.service.ClpSerializer;
import fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class HyyCoordClp extends BaseModelImpl<HyyCoord> implements HyyCoord {
    private long _arrTimeID;
    private Date _arrTime;
    private float _matTime;
    private int _year;
    private int _month;
    private int _day;
    private int _hour;
    private int _doy;
    private int _backTime;
    private float _lat100;
    private float _lon100;
    private float _alt100;
    private float _azim100;
    private float _lat250;
    private float _lon250;
    private float _alt250;
    private float _azim250;
    private float _lat500;
    private float _lon500;
    private float _alt500;
    private float _azim500;
    private BaseModel<?> _hyyCoordRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.smear.db.service.ClpSerializer.class;

    public HyyCoordClp() {
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
    public long getPrimaryKey() {
        return _arrTimeID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setArrTimeID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _arrTimeID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getArrTimeID() {
        return _arrTimeID;
    }

    @Override
    public void setArrTimeID(long arrTimeID) {
        _arrTimeID = arrTimeID;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setArrTimeID", long.class);

                method.invoke(_hyyCoordRemoteModel, arrTimeID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getArrTime() {
        return _arrTime;
    }

    @Override
    public void setArrTime(Date arrTime) {
        _arrTime = arrTime;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setArrTime", Date.class);

                method.invoke(_hyyCoordRemoteModel, arrTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMatTime() {
        return _matTime;
    }

    @Override
    public void setMatTime(float matTime) {
        _matTime = matTime;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setMatTime", float.class);

                method.invoke(_hyyCoordRemoteModel, matTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getYear() {
        return _year;
    }

    @Override
    public void setYear(int year) {
        _year = year;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setYear", int.class);

                method.invoke(_hyyCoordRemoteModel, year);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMonth() {
        return _month;
    }

    @Override
    public void setMonth(int month) {
        _month = month;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setMonth", int.class);

                method.invoke(_hyyCoordRemoteModel, month);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDay() {
        return _day;
    }

    @Override
    public void setDay(int day) {
        _day = day;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setDay", int.class);

                method.invoke(_hyyCoordRemoteModel, day);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHour() {
        return _hour;
    }

    @Override
    public void setHour(int hour) {
        _hour = hour;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setHour", int.class);

                method.invoke(_hyyCoordRemoteModel, hour);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDoy() {
        return _doy;
    }

    @Override
    public void setDoy(int doy) {
        _doy = doy;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setDoy", int.class);

                method.invoke(_hyyCoordRemoteModel, doy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBackTime() {
        return _backTime;
    }

    @Override
    public void setBackTime(int backTime) {
        _backTime = backTime;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setBackTime", int.class);

                method.invoke(_hyyCoordRemoteModel, backTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLat100() {
        return _lat100;
    }

    @Override
    public void setLat100(float lat100) {
        _lat100 = lat100;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLat100", float.class);

                method.invoke(_hyyCoordRemoteModel, lat100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLon100() {
        return _lon100;
    }

    @Override
    public void setLon100(float lon100) {
        _lon100 = lon100;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLon100", float.class);

                method.invoke(_hyyCoordRemoteModel, lon100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAlt100() {
        return _alt100;
    }

    @Override
    public void setAlt100(float alt100) {
        _alt100 = alt100;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAlt100", float.class);

                method.invoke(_hyyCoordRemoteModel, alt100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAzim100() {
        return _azim100;
    }

    @Override
    public void setAzim100(float azim100) {
        _azim100 = azim100;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAzim100", float.class);

                method.invoke(_hyyCoordRemoteModel, azim100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLat250() {
        return _lat250;
    }

    @Override
    public void setLat250(float lat250) {
        _lat250 = lat250;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLat250", float.class);

                method.invoke(_hyyCoordRemoteModel, lat250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLon250() {
        return _lon250;
    }

    @Override
    public void setLon250(float lon250) {
        _lon250 = lon250;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLon250", float.class);

                method.invoke(_hyyCoordRemoteModel, lon250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAlt250() {
        return _alt250;
    }

    @Override
    public void setAlt250(float alt250) {
        _alt250 = alt250;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAlt250", float.class);

                method.invoke(_hyyCoordRemoteModel, alt250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAzim250() {
        return _azim250;
    }

    @Override
    public void setAzim250(float azim250) {
        _azim250 = azim250;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAzim250", float.class);

                method.invoke(_hyyCoordRemoteModel, azim250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLat500() {
        return _lat500;
    }

    @Override
    public void setLat500(float lat500) {
        _lat500 = lat500;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLat500", float.class);

                method.invoke(_hyyCoordRemoteModel, lat500);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLon500() {
        return _lon500;
    }

    @Override
    public void setLon500(float lon500) {
        _lon500 = lon500;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setLon500", float.class);

                method.invoke(_hyyCoordRemoteModel, lon500);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAlt500() {
        return _alt500;
    }

    @Override
    public void setAlt500(float alt500) {
        _alt500 = alt500;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAlt500", float.class);

                method.invoke(_hyyCoordRemoteModel, alt500);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAzim500() {
        return _azim500;
    }

    @Override
    public void setAzim500(float azim500) {
        _azim500 = azim500;

        if (_hyyCoordRemoteModel != null) {
            try {
                Class<?> clazz = _hyyCoordRemoteModel.getClass();

                Method method = clazz.getMethod("setAzim500", float.class);

                method.invoke(_hyyCoordRemoteModel, azim500);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHyyCoordRemoteModel() {
        return _hyyCoordRemoteModel;
    }

    public void setHyyCoordRemoteModel(BaseModel<?> hyyCoordRemoteModel) {
        _hyyCoordRemoteModel = hyyCoordRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _hyyCoordRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_hyyCoordRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HyyCoordLocalServiceUtil.addHyyCoord(this);
        } else {
            HyyCoordLocalServiceUtil.updateHyyCoord(this);
        }
    }

    @Override
    public HyyCoord toEscapedModel() {
        return (HyyCoord) ProxyUtil.newProxyInstance(HyyCoord.class.getClassLoader(),
            new Class[] { HyyCoord.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HyyCoordClp clone = new HyyCoordClp();

        clone.setArrTimeID(getArrTimeID());
        clone.setArrTime(getArrTime());
        clone.setMatTime(getMatTime());
        clone.setYear(getYear());
        clone.setMonth(getMonth());
        clone.setDay(getDay());
        clone.setHour(getHour());
        clone.setDoy(getDoy());
        clone.setBackTime(getBackTime());
        clone.setLat100(getLat100());
        clone.setLon100(getLon100());
        clone.setAlt100(getAlt100());
        clone.setAzim100(getAzim100());
        clone.setLat250(getLat250());
        clone.setLon250(getLon250());
        clone.setAlt250(getAlt250());
        clone.setAzim250(getAzim250());
        clone.setLat500(getLat500());
        clone.setLon500(getLon500());
        clone.setAlt500(getAlt500());
        clone.setAzim500(getAzim500());

        return clone;
    }

    @Override
    public int compareTo(HyyCoord hyyCoord) {
        long primaryKey = hyyCoord.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyCoordClp)) {
            return false;
        }

        HyyCoordClp hyyCoord = (HyyCoordClp) obj;

        long primaryKey = hyyCoord.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(43);

        sb.append("{arrTimeID=");
        sb.append(getArrTimeID());
        sb.append(", arrTime=");
        sb.append(getArrTime());
        sb.append(", matTime=");
        sb.append(getMatTime());
        sb.append(", year=");
        sb.append(getYear());
        sb.append(", month=");
        sb.append(getMonth());
        sb.append(", day=");
        sb.append(getDay());
        sb.append(", hour=");
        sb.append(getHour());
        sb.append(", doy=");
        sb.append(getDoy());
        sb.append(", backTime=");
        sb.append(getBackTime());
        sb.append(", lat100=");
        sb.append(getLat100());
        sb.append(", lon100=");
        sb.append(getLon100());
        sb.append(", alt100=");
        sb.append(getAlt100());
        sb.append(", azim100=");
        sb.append(getAzim100());
        sb.append(", lat250=");
        sb.append(getLat250());
        sb.append(", lon250=");
        sb.append(getLon250());
        sb.append(", alt250=");
        sb.append(getAlt250());
        sb.append(", azim250=");
        sb.append(getAzim250());
        sb.append(", lat500=");
        sb.append(getLat500());
        sb.append(", lon500=");
        sb.append(getLon500());
        sb.append(", alt500=");
        sb.append(getAlt500());
        sb.append(", azim500=");
        sb.append(getAzim500());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(67);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.smear.db.model.HyyCoord");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>arrTimeID</column-name><column-value><![CDATA[");
        sb.append(getArrTimeID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arrTime</column-name><column-value><![CDATA[");
        sb.append(getArrTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>matTime</column-name><column-value><![CDATA[");
        sb.append(getMatTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>year</column-name><column-value><![CDATA[");
        sb.append(getYear());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>month</column-name><column-value><![CDATA[");
        sb.append(getMonth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>day</column-name><column-value><![CDATA[");
        sb.append(getDay());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hour</column-name><column-value><![CDATA[");
        sb.append(getHour());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>doy</column-name><column-value><![CDATA[");
        sb.append(getDoy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>backTime</column-name><column-value><![CDATA[");
        sb.append(getBackTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat100</column-name><column-value><![CDATA[");
        sb.append(getLat100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon100</column-name><column-value><![CDATA[");
        sb.append(getLon100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt100</column-name><column-value><![CDATA[");
        sb.append(getAlt100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim100</column-name><column-value><![CDATA[");
        sb.append(getAzim100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat250</column-name><column-value><![CDATA[");
        sb.append(getLat250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon250</column-name><column-value><![CDATA[");
        sb.append(getLon250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt250</column-name><column-value><![CDATA[");
        sb.append(getAlt250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim250</column-name><column-value><![CDATA[");
        sb.append(getAzim250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat500</column-name><column-value><![CDATA[");
        sb.append(getLat500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon500</column-name><column-value><![CDATA[");
        sb.append(getLon500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt500</column-name><column-value><![CDATA[");
        sb.append(getAlt500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim500</column-name><column-value><![CDATA[");
        sb.append(getAzim500());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
