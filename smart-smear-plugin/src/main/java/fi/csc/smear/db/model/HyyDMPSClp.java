package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.HyyDMPSLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class HyyDMPSClp extends BaseModelImpl<HyyDMPS> implements HyyDMPS {
    private Date _samptime;
    private float _t1;
    private float _t2;
    private float _p1;
    private float _p2;
    private float _rh1;
    private float _rh2;
    private float _d100e1;
    private float _d112e1;
    private float _d126e1;
    private float _d141e1;
    private float _d158e1;
    private float _d178e1;
    private float _d200e1;
    private float _d224e1;
    private float _d251e1;
    private float _d282e1;
    private float _d316e1;
    private float _d355e1;
    private float _d398e1;
    private float _d447e1;
    private float _d501e1;
    private float _d562e1;
    private float _d631e1;
    private float _d708e1;
    private float _d794e1;
    private float _d891e1;
    private float _d100e2;
    private float _d112e2;
    private float _d126e2;
    private float _d141e2;
    private float _d158e2;
    private float _d178e2;
    private float _d200e2;
    private float _d224e2;
    private float _d251e2;
    private float _d282e2;
    private float _d316e2;
    private float _d355e2;
    private float _d398e2;
    private float _d447e2;
    private float _d501e2;
    private float _d562e2;
    private float _d631e2;
    private float _d708e2;
    private float _d794e2;
    private float _d891e2;
    private float _d100e3;
    private float _d112e3;
    private float _d126e3;
    private float _d141e3;
    private float _d158e3;
    private float _d178e3;
    private float _d200e3;
    private float _d224e3;
    private float _d251e3;
    private float _d282e3;
    private float _d316e3;
    private float _d355e3;
    private float _d398e3;
    private float _d447e3;
    private float _d501e3;
    private float _d562e3;
    private float _d631e3;
    private float _d708e3;
    private float _d794e3;
    private float _d891e3;
    private float _d100e4;
    private float _tconc;
    private BaseModel<?> _hyyDMPSRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public HyyDMPSClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return HyyDMPS.class;
    }

    @Override
    public String getModelClassName() {
        return HyyDMPS.class.getName();
    }

    @Override
    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        setSamptime(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _samptime;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((java.util.Date) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("t1", getT1());
        attributes.put("t2", getT2());
        attributes.put("p1", getP1());
        attributes.put("p2", getP2());
        attributes.put("rh1", getRh1());
        attributes.put("rh2", getRh2());
        attributes.put("d100e1", getD100e1());
        attributes.put("d112e1", getD112e1());
        attributes.put("d126e1", getD126e1());
        attributes.put("d141e1", getD141e1());
        attributes.put("d158e1", getD158e1());
        attributes.put("d178e1", getD178e1());
        attributes.put("d200e1", getD200e1());
        attributes.put("d224e1", getD224e1());
        attributes.put("d251e1", getD251e1());
        attributes.put("d282e1", getD282e1());
        attributes.put("d316e1", getD316e1());
        attributes.put("d355e1", getD355e1());
        attributes.put("d398e1", getD398e1());
        attributes.put("d447e1", getD447e1());
        attributes.put("d501e1", getD501e1());
        attributes.put("d562e1", getD562e1());
        attributes.put("d631e1", getD631e1());
        attributes.put("d708e1", getD708e1());
        attributes.put("d794e1", getD794e1());
        attributes.put("d891e1", getD891e1());
        attributes.put("d100e2", getD100e2());
        attributes.put("d112e2", getD112e2());
        attributes.put("d126e2", getD126e2());
        attributes.put("d141e2", getD141e2());
        attributes.put("d158e2", getD158e2());
        attributes.put("d178e2", getD178e2());
        attributes.put("d200e2", getD200e2());
        attributes.put("d224e2", getD224e2());
        attributes.put("d251e2", getD251e2());
        attributes.put("d282e2", getD282e2());
        attributes.put("d316e2", getD316e2());
        attributes.put("d355e2", getD355e2());
        attributes.put("d398e2", getD398e2());
        attributes.put("d447e2", getD447e2());
        attributes.put("d501e2", getD501e2());
        attributes.put("d562e2", getD562e2());
        attributes.put("d631e2", getD631e2());
        attributes.put("d708e2", getD708e2());
        attributes.put("d794e2", getD794e2());
        attributes.put("d891e2", getD891e2());
        attributes.put("d100e3", getD100e3());
        attributes.put("d112e3", getD112e3());
        attributes.put("d126e3", getD126e3());
        attributes.put("d141e3", getD141e3());
        attributes.put("d158e3", getD158e3());
        attributes.put("d178e3", getD178e3());
        attributes.put("d200e3", getD200e3());
        attributes.put("d224e3", getD224e3());
        attributes.put("d251e3", getD251e3());
        attributes.put("d282e3", getD282e3());
        attributes.put("d316e3", getD316e3());
        attributes.put("d355e3", getD355e3());
        attributes.put("d398e3", getD398e3());
        attributes.put("d447e3", getD447e3());
        attributes.put("d501e3", getD501e3());
        attributes.put("d562e3", getD562e3());
        attributes.put("d631e3", getD631e3());
        attributes.put("d708e3", getD708e3());
        attributes.put("d794e3", getD794e3());
        attributes.put("d891e3", getD891e3());
        attributes.put("d100e4", getD100e4());
        attributes.put("tconc", getTconc());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float t1 = (Float) attributes.get("t1");

        if (t1 != null) {
            setT1(t1);
        }

        Float t2 = (Float) attributes.get("t2");

        if (t2 != null) {
            setT2(t2);
        }

        Float p1 = (Float) attributes.get("p1");

        if (p1 != null) {
            setP1(p1);
        }

        Float p2 = (Float) attributes.get("p2");

        if (p2 != null) {
            setP2(p2);
        }

        Float rh1 = (Float) attributes.get("rh1");

        if (rh1 != null) {
            setRh1(rh1);
        }

        Float rh2 = (Float) attributes.get("rh2");

        if (rh2 != null) {
            setRh2(rh2);
        }

        Float d100e1 = (Float) attributes.get("d100e1");

        if (d100e1 != null) {
            setD100e1(d100e1);
        }

        Float d112e1 = (Float) attributes.get("d112e1");

        if (d112e1 != null) {
            setD112e1(d112e1);
        }

        Float d126e1 = (Float) attributes.get("d126e1");

        if (d126e1 != null) {
            setD126e1(d126e1);
        }

        Float d141e1 = (Float) attributes.get("d141e1");

        if (d141e1 != null) {
            setD141e1(d141e1);
        }

        Float d158e1 = (Float) attributes.get("d158e1");

        if (d158e1 != null) {
            setD158e1(d158e1);
        }

        Float d178e1 = (Float) attributes.get("d178e1");

        if (d178e1 != null) {
            setD178e1(d178e1);
        }

        Float d200e1 = (Float) attributes.get("d200e1");

        if (d200e1 != null) {
            setD200e1(d200e1);
        }

        Float d224e1 = (Float) attributes.get("d224e1");

        if (d224e1 != null) {
            setD224e1(d224e1);
        }

        Float d251e1 = (Float) attributes.get("d251e1");

        if (d251e1 != null) {
            setD251e1(d251e1);
        }

        Float d282e1 = (Float) attributes.get("d282e1");

        if (d282e1 != null) {
            setD282e1(d282e1);
        }

        Float d316e1 = (Float) attributes.get("d316e1");

        if (d316e1 != null) {
            setD316e1(d316e1);
        }

        Float d355e1 = (Float) attributes.get("d355e1");

        if (d355e1 != null) {
            setD355e1(d355e1);
        }

        Float d398e1 = (Float) attributes.get("d398e1");

        if (d398e1 != null) {
            setD398e1(d398e1);
        }

        Float d447e1 = (Float) attributes.get("d447e1");

        if (d447e1 != null) {
            setD447e1(d447e1);
        }

        Float d501e1 = (Float) attributes.get("d501e1");

        if (d501e1 != null) {
            setD501e1(d501e1);
        }

        Float d562e1 = (Float) attributes.get("d562e1");

        if (d562e1 != null) {
            setD562e1(d562e1);
        }

        Float d631e1 = (Float) attributes.get("d631e1");

        if (d631e1 != null) {
            setD631e1(d631e1);
        }

        Float d708e1 = (Float) attributes.get("d708e1");

        if (d708e1 != null) {
            setD708e1(d708e1);
        }

        Float d794e1 = (Float) attributes.get("d794e1");

        if (d794e1 != null) {
            setD794e1(d794e1);
        }

        Float d891e1 = (Float) attributes.get("d891e1");

        if (d891e1 != null) {
            setD891e1(d891e1);
        }

        Float d100e2 = (Float) attributes.get("d100e2");

        if (d100e2 != null) {
            setD100e2(d100e2);
        }

        Float d112e2 = (Float) attributes.get("d112e2");

        if (d112e2 != null) {
            setD112e2(d112e2);
        }

        Float d126e2 = (Float) attributes.get("d126e2");

        if (d126e2 != null) {
            setD126e2(d126e2);
        }

        Float d141e2 = (Float) attributes.get("d141e2");

        if (d141e2 != null) {
            setD141e2(d141e2);
        }

        Float d158e2 = (Float) attributes.get("d158e2");

        if (d158e2 != null) {
            setD158e2(d158e2);
        }

        Float d178e2 = (Float) attributes.get("d178e2");

        if (d178e2 != null) {
            setD178e2(d178e2);
        }

        Float d200e2 = (Float) attributes.get("d200e2");

        if (d200e2 != null) {
            setD200e2(d200e2);
        }

        Float d224e2 = (Float) attributes.get("d224e2");

        if (d224e2 != null) {
            setD224e2(d224e2);
        }

        Float d251e2 = (Float) attributes.get("d251e2");

        if (d251e2 != null) {
            setD251e2(d251e2);
        }

        Float d282e2 = (Float) attributes.get("d282e2");

        if (d282e2 != null) {
            setD282e2(d282e2);
        }

        Float d316e2 = (Float) attributes.get("d316e2");

        if (d316e2 != null) {
            setD316e2(d316e2);
        }

        Float d355e2 = (Float) attributes.get("d355e2");

        if (d355e2 != null) {
            setD355e2(d355e2);
        }

        Float d398e2 = (Float) attributes.get("d398e2");

        if (d398e2 != null) {
            setD398e2(d398e2);
        }

        Float d447e2 = (Float) attributes.get("d447e2");

        if (d447e2 != null) {
            setD447e2(d447e2);
        }

        Float d501e2 = (Float) attributes.get("d501e2");

        if (d501e2 != null) {
            setD501e2(d501e2);
        }

        Float d562e2 = (Float) attributes.get("d562e2");

        if (d562e2 != null) {
            setD562e2(d562e2);
        }

        Float d631e2 = (Float) attributes.get("d631e2");

        if (d631e2 != null) {
            setD631e2(d631e2);
        }

        Float d708e2 = (Float) attributes.get("d708e2");

        if (d708e2 != null) {
            setD708e2(d708e2);
        }

        Float d794e2 = (Float) attributes.get("d794e2");

        if (d794e2 != null) {
            setD794e2(d794e2);
        }

        Float d891e2 = (Float) attributes.get("d891e2");

        if (d891e2 != null) {
            setD891e2(d891e2);
        }

        Float d100e3 = (Float) attributes.get("d100e3");

        if (d100e3 != null) {
            setD100e3(d100e3);
        }

        Float d112e3 = (Float) attributes.get("d112e3");

        if (d112e3 != null) {
            setD112e3(d112e3);
        }

        Float d126e3 = (Float) attributes.get("d126e3");

        if (d126e3 != null) {
            setD126e3(d126e3);
        }

        Float d141e3 = (Float) attributes.get("d141e3");

        if (d141e3 != null) {
            setD141e3(d141e3);
        }

        Float d158e3 = (Float) attributes.get("d158e3");

        if (d158e3 != null) {
            setD158e3(d158e3);
        }

        Float d178e3 = (Float) attributes.get("d178e3");

        if (d178e3 != null) {
            setD178e3(d178e3);
        }

        Float d200e3 = (Float) attributes.get("d200e3");

        if (d200e3 != null) {
            setD200e3(d200e3);
        }

        Float d224e3 = (Float) attributes.get("d224e3");

        if (d224e3 != null) {
            setD224e3(d224e3);
        }

        Float d251e3 = (Float) attributes.get("d251e3");

        if (d251e3 != null) {
            setD251e3(d251e3);
        }

        Float d282e3 = (Float) attributes.get("d282e3");

        if (d282e3 != null) {
            setD282e3(d282e3);
        }

        Float d316e3 = (Float) attributes.get("d316e3");

        if (d316e3 != null) {
            setD316e3(d316e3);
        }

        Float d355e3 = (Float) attributes.get("d355e3");

        if (d355e3 != null) {
            setD355e3(d355e3);
        }

        Float d398e3 = (Float) attributes.get("d398e3");

        if (d398e3 != null) {
            setD398e3(d398e3);
        }

        Float d447e3 = (Float) attributes.get("d447e3");

        if (d447e3 != null) {
            setD447e3(d447e3);
        }

        Float d501e3 = (Float) attributes.get("d501e3");

        if (d501e3 != null) {
            setD501e3(d501e3);
        }

        Float d562e3 = (Float) attributes.get("d562e3");

        if (d562e3 != null) {
            setD562e3(d562e3);
        }

        Float d631e3 = (Float) attributes.get("d631e3");

        if (d631e3 != null) {
            setD631e3(d631e3);
        }

        Float d708e3 = (Float) attributes.get("d708e3");

        if (d708e3 != null) {
            setD708e3(d708e3);
        }

        Float d794e3 = (Float) attributes.get("d794e3");

        if (d794e3 != null) {
            setD794e3(d794e3);
        }

        Float d891e3 = (Float) attributes.get("d891e3");

        if (d891e3 != null) {
            setD891e3(d891e3);
        }

        Float d100e4 = (Float) attributes.get("d100e4");

        if (d100e4 != null) {
            setD100e4(d100e4);
        }

        Float tconc = (Float) attributes.get("tconc");

        if (tconc != null) {
            setTconc(tconc);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_hyyDMPSRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT1() {
        return _t1;
    }

    @Override
    public void setT1(float t1) {
        _t1 = t1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setT1", float.class);

                method.invoke(_hyyDMPSRemoteModel, t1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT2() {
        return _t2;
    }

    @Override
    public void setT2(float t2) {
        _t2 = t2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setT2", float.class);

                method.invoke(_hyyDMPSRemoteModel, t2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP1() {
        return _p1;
    }

    @Override
    public void setP1(float p1) {
        _p1 = p1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setP1", float.class);

                method.invoke(_hyyDMPSRemoteModel, p1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP2() {
        return _p2;
    }

    @Override
    public void setP2(float p2) {
        _p2 = p2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setP2", float.class);

                method.invoke(_hyyDMPSRemoteModel, p2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRh1() {
        return _rh1;
    }

    @Override
    public void setRh1(float rh1) {
        _rh1 = rh1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setRh1", float.class);

                method.invoke(_hyyDMPSRemoteModel, rh1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRh2() {
        return _rh2;
    }

    @Override
    public void setRh2(float rh2) {
        _rh2 = rh2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setRh2", float.class);

                method.invoke(_hyyDMPSRemoteModel, rh2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD100e1() {
        return _d100e1;
    }

    @Override
    public void setD100e1(float d100e1) {
        _d100e1 = d100e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD100e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d100e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD112e1() {
        return _d112e1;
    }

    @Override
    public void setD112e1(float d112e1) {
        _d112e1 = d112e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD112e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d112e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD126e1() {
        return _d126e1;
    }

    @Override
    public void setD126e1(float d126e1) {
        _d126e1 = d126e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD126e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d126e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD141e1() {
        return _d141e1;
    }

    @Override
    public void setD141e1(float d141e1) {
        _d141e1 = d141e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD141e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d141e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD158e1() {
        return _d158e1;
    }

    @Override
    public void setD158e1(float d158e1) {
        _d158e1 = d158e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD158e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d158e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD178e1() {
        return _d178e1;
    }

    @Override
    public void setD178e1(float d178e1) {
        _d178e1 = d178e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD178e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d178e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD200e1() {
        return _d200e1;
    }

    @Override
    public void setD200e1(float d200e1) {
        _d200e1 = d200e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD200e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d200e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD224e1() {
        return _d224e1;
    }

    @Override
    public void setD224e1(float d224e1) {
        _d224e1 = d224e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD224e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d224e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD251e1() {
        return _d251e1;
    }

    @Override
    public void setD251e1(float d251e1) {
        _d251e1 = d251e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD251e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d251e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD282e1() {
        return _d282e1;
    }

    @Override
    public void setD282e1(float d282e1) {
        _d282e1 = d282e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD282e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d282e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD316e1() {
        return _d316e1;
    }

    @Override
    public void setD316e1(float d316e1) {
        _d316e1 = d316e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD316e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d316e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD355e1() {
        return _d355e1;
    }

    @Override
    public void setD355e1(float d355e1) {
        _d355e1 = d355e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD355e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d355e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD398e1() {
        return _d398e1;
    }

    @Override
    public void setD398e1(float d398e1) {
        _d398e1 = d398e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD398e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d398e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD447e1() {
        return _d447e1;
    }

    @Override
    public void setD447e1(float d447e1) {
        _d447e1 = d447e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD447e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d447e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD501e1() {
        return _d501e1;
    }

    @Override
    public void setD501e1(float d501e1) {
        _d501e1 = d501e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD501e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d501e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD562e1() {
        return _d562e1;
    }

    @Override
    public void setD562e1(float d562e1) {
        _d562e1 = d562e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD562e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d562e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD631e1() {
        return _d631e1;
    }

    @Override
    public void setD631e1(float d631e1) {
        _d631e1 = d631e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD631e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d631e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD708e1() {
        return _d708e1;
    }

    @Override
    public void setD708e1(float d708e1) {
        _d708e1 = d708e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD708e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d708e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD794e1() {
        return _d794e1;
    }

    @Override
    public void setD794e1(float d794e1) {
        _d794e1 = d794e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD794e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d794e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD891e1() {
        return _d891e1;
    }

    @Override
    public void setD891e1(float d891e1) {
        _d891e1 = d891e1;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD891e1", float.class);

                method.invoke(_hyyDMPSRemoteModel, d891e1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD100e2() {
        return _d100e2;
    }

    @Override
    public void setD100e2(float d100e2) {
        _d100e2 = d100e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD100e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d100e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD112e2() {
        return _d112e2;
    }

    @Override
    public void setD112e2(float d112e2) {
        _d112e2 = d112e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD112e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d112e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD126e2() {
        return _d126e2;
    }

    @Override
    public void setD126e2(float d126e2) {
        _d126e2 = d126e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD126e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d126e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD141e2() {
        return _d141e2;
    }

    @Override
    public void setD141e2(float d141e2) {
        _d141e2 = d141e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD141e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d141e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD158e2() {
        return _d158e2;
    }

    @Override
    public void setD158e2(float d158e2) {
        _d158e2 = d158e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD158e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d158e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD178e2() {
        return _d178e2;
    }

    @Override
    public void setD178e2(float d178e2) {
        _d178e2 = d178e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD178e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d178e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD200e2() {
        return _d200e2;
    }

    @Override
    public void setD200e2(float d200e2) {
        _d200e2 = d200e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD200e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d200e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD224e2() {
        return _d224e2;
    }

    @Override
    public void setD224e2(float d224e2) {
        _d224e2 = d224e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD224e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d224e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD251e2() {
        return _d251e2;
    }

    @Override
    public void setD251e2(float d251e2) {
        _d251e2 = d251e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD251e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d251e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD282e2() {
        return _d282e2;
    }

    @Override
    public void setD282e2(float d282e2) {
        _d282e2 = d282e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD282e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d282e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD316e2() {
        return _d316e2;
    }

    @Override
    public void setD316e2(float d316e2) {
        _d316e2 = d316e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD316e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d316e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD355e2() {
        return _d355e2;
    }

    @Override
    public void setD355e2(float d355e2) {
        _d355e2 = d355e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD355e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d355e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD398e2() {
        return _d398e2;
    }

    @Override
    public void setD398e2(float d398e2) {
        _d398e2 = d398e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD398e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d398e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD447e2() {
        return _d447e2;
    }

    @Override
    public void setD447e2(float d447e2) {
        _d447e2 = d447e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD447e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d447e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD501e2() {
        return _d501e2;
    }

    @Override
    public void setD501e2(float d501e2) {
        _d501e2 = d501e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD501e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d501e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD562e2() {
        return _d562e2;
    }

    @Override
    public void setD562e2(float d562e2) {
        _d562e2 = d562e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD562e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d562e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD631e2() {
        return _d631e2;
    }

    @Override
    public void setD631e2(float d631e2) {
        _d631e2 = d631e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD631e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d631e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD708e2() {
        return _d708e2;
    }

    @Override
    public void setD708e2(float d708e2) {
        _d708e2 = d708e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD708e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d708e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD794e2() {
        return _d794e2;
    }

    @Override
    public void setD794e2(float d794e2) {
        _d794e2 = d794e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD794e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d794e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD891e2() {
        return _d891e2;
    }

    @Override
    public void setD891e2(float d891e2) {
        _d891e2 = d891e2;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD891e2", float.class);

                method.invoke(_hyyDMPSRemoteModel, d891e2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD100e3() {
        return _d100e3;
    }

    @Override
    public void setD100e3(float d100e3) {
        _d100e3 = d100e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD100e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d100e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD112e3() {
        return _d112e3;
    }

    @Override
    public void setD112e3(float d112e3) {
        _d112e3 = d112e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD112e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d112e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD126e3() {
        return _d126e3;
    }

    @Override
    public void setD126e3(float d126e3) {
        _d126e3 = d126e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD126e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d126e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD141e3() {
        return _d141e3;
    }

    @Override
    public void setD141e3(float d141e3) {
        _d141e3 = d141e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD141e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d141e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD158e3() {
        return _d158e3;
    }

    @Override
    public void setD158e3(float d158e3) {
        _d158e3 = d158e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD158e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d158e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD178e3() {
        return _d178e3;
    }

    @Override
    public void setD178e3(float d178e3) {
        _d178e3 = d178e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD178e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d178e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD200e3() {
        return _d200e3;
    }

    @Override
    public void setD200e3(float d200e3) {
        _d200e3 = d200e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD200e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d200e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD224e3() {
        return _d224e3;
    }

    @Override
    public void setD224e3(float d224e3) {
        _d224e3 = d224e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD224e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d224e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD251e3() {
        return _d251e3;
    }

    @Override
    public void setD251e3(float d251e3) {
        _d251e3 = d251e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD251e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d251e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD282e3() {
        return _d282e3;
    }

    @Override
    public void setD282e3(float d282e3) {
        _d282e3 = d282e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD282e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d282e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD316e3() {
        return _d316e3;
    }

    @Override
    public void setD316e3(float d316e3) {
        _d316e3 = d316e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD316e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d316e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD355e3() {
        return _d355e3;
    }

    @Override
    public void setD355e3(float d355e3) {
        _d355e3 = d355e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD355e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d355e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD398e3() {
        return _d398e3;
    }

    @Override
    public void setD398e3(float d398e3) {
        _d398e3 = d398e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD398e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d398e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD447e3() {
        return _d447e3;
    }

    @Override
    public void setD447e3(float d447e3) {
        _d447e3 = d447e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD447e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d447e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD501e3() {
        return _d501e3;
    }

    @Override
    public void setD501e3(float d501e3) {
        _d501e3 = d501e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD501e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d501e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD562e3() {
        return _d562e3;
    }

    @Override
    public void setD562e3(float d562e3) {
        _d562e3 = d562e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD562e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d562e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD631e3() {
        return _d631e3;
    }

    @Override
    public void setD631e3(float d631e3) {
        _d631e3 = d631e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD631e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d631e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD708e3() {
        return _d708e3;
    }

    @Override
    public void setD708e3(float d708e3) {
        _d708e3 = d708e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD708e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d708e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD794e3() {
        return _d794e3;
    }

    @Override
    public void setD794e3(float d794e3) {
        _d794e3 = d794e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD794e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d794e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD891e3() {
        return _d891e3;
    }

    @Override
    public void setD891e3(float d891e3) {
        _d891e3 = d891e3;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD891e3", float.class);

                method.invoke(_hyyDMPSRemoteModel, d891e3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getD100e4() {
        return _d100e4;
    }

    @Override
    public void setD100e4(float d100e4) {
        _d100e4 = d100e4;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setD100e4", float.class);

                method.invoke(_hyyDMPSRemoteModel, d100e4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTconc() {
        return _tconc;
    }

    @Override
    public void setTconc(float tconc) {
        _tconc = tconc;

        if (_hyyDMPSRemoteModel != null) {
            try {
                Class<?> clazz = _hyyDMPSRemoteModel.getClass();

                Method method = clazz.getMethod("setTconc", float.class);

                method.invoke(_hyyDMPSRemoteModel, tconc);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHyyDMPSRemoteModel() {
        return _hyyDMPSRemoteModel;
    }

    public void setHyyDMPSRemoteModel(BaseModel<?> hyyDMPSRemoteModel) {
        _hyyDMPSRemoteModel = hyyDMPSRemoteModel;
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

        Class<?> remoteModelClass = _hyyDMPSRemoteModel.getClass();

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

        Object returnValue = method.invoke(_hyyDMPSRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HyyDMPSLocalServiceUtil.addHyyDMPS(this);
        } else {
            HyyDMPSLocalServiceUtil.updateHyyDMPS(this);
        }
    }

    @Override
    public HyyDMPS toEscapedModel() {
        return (HyyDMPS) ProxyUtil.newProxyInstance(HyyDMPS.class.getClassLoader(),
            new Class[] { HyyDMPS.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HyyDMPSClp clone = new HyyDMPSClp();

        clone.setSamptime(getSamptime());
        clone.setT1(getT1());
        clone.setT2(getT2());
        clone.setP1(getP1());
        clone.setP2(getP2());
        clone.setRh1(getRh1());
        clone.setRh2(getRh2());
        clone.setD100e1(getD100e1());
        clone.setD112e1(getD112e1());
        clone.setD126e1(getD126e1());
        clone.setD141e1(getD141e1());
        clone.setD158e1(getD158e1());
        clone.setD178e1(getD178e1());
        clone.setD200e1(getD200e1());
        clone.setD224e1(getD224e1());
        clone.setD251e1(getD251e1());
        clone.setD282e1(getD282e1());
        clone.setD316e1(getD316e1());
        clone.setD355e1(getD355e1());
        clone.setD398e1(getD398e1());
        clone.setD447e1(getD447e1());
        clone.setD501e1(getD501e1());
        clone.setD562e1(getD562e1());
        clone.setD631e1(getD631e1());
        clone.setD708e1(getD708e1());
        clone.setD794e1(getD794e1());
        clone.setD891e1(getD891e1());
        clone.setD100e2(getD100e2());
        clone.setD112e2(getD112e2());
        clone.setD126e2(getD126e2());
        clone.setD141e2(getD141e2());
        clone.setD158e2(getD158e2());
        clone.setD178e2(getD178e2());
        clone.setD200e2(getD200e2());
        clone.setD224e2(getD224e2());
        clone.setD251e2(getD251e2());
        clone.setD282e2(getD282e2());
        clone.setD316e2(getD316e2());
        clone.setD355e2(getD355e2());
        clone.setD398e2(getD398e2());
        clone.setD447e2(getD447e2());
        clone.setD501e2(getD501e2());
        clone.setD562e2(getD562e2());
        clone.setD631e2(getD631e2());
        clone.setD708e2(getD708e2());
        clone.setD794e2(getD794e2());
        clone.setD891e2(getD891e2());
        clone.setD100e3(getD100e3());
        clone.setD112e3(getD112e3());
        clone.setD126e3(getD126e3());
        clone.setD141e3(getD141e3());
        clone.setD158e3(getD158e3());
        clone.setD178e3(getD178e3());
        clone.setD200e3(getD200e3());
        clone.setD224e3(getD224e3());
        clone.setD251e3(getD251e3());
        clone.setD282e3(getD282e3());
        clone.setD316e3(getD316e3());
        clone.setD355e3(getD355e3());
        clone.setD398e3(getD398e3());
        clone.setD447e3(getD447e3());
        clone.setD501e3(getD501e3());
        clone.setD562e3(getD562e3());
        clone.setD631e3(getD631e3());
        clone.setD708e3(getD708e3());
        clone.setD794e3(getD794e3());
        clone.setD891e3(getD891e3());
        clone.setD100e4(getD100e4());
        clone.setTconc(getTconc());

        return clone;
    }

    @Override
    public int compareTo(HyyDMPS hyyDMPS) {
        java.util.Date primaryKey = hyyDMPS.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyDMPSClp)) {
            return false;
        }

        HyyDMPSClp hyyDMPS = (HyyDMPSClp) obj;

        java.util.Date primaryKey = hyyDMPS.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(139);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", t1=");
        sb.append(getT1());
        sb.append(", t2=");
        sb.append(getT2());
        sb.append(", p1=");
        sb.append(getP1());
        sb.append(", p2=");
        sb.append(getP2());
        sb.append(", rh1=");
        sb.append(getRh1());
        sb.append(", rh2=");
        sb.append(getRh2());
        sb.append(", d100e1=");
        sb.append(getD100e1());
        sb.append(", d112e1=");
        sb.append(getD112e1());
        sb.append(", d126e1=");
        sb.append(getD126e1());
        sb.append(", d141e1=");
        sb.append(getD141e1());
        sb.append(", d158e1=");
        sb.append(getD158e1());
        sb.append(", d178e1=");
        sb.append(getD178e1());
        sb.append(", d200e1=");
        sb.append(getD200e1());
        sb.append(", d224e1=");
        sb.append(getD224e1());
        sb.append(", d251e1=");
        sb.append(getD251e1());
        sb.append(", d282e1=");
        sb.append(getD282e1());
        sb.append(", d316e1=");
        sb.append(getD316e1());
        sb.append(", d355e1=");
        sb.append(getD355e1());
        sb.append(", d398e1=");
        sb.append(getD398e1());
        sb.append(", d447e1=");
        sb.append(getD447e1());
        sb.append(", d501e1=");
        sb.append(getD501e1());
        sb.append(", d562e1=");
        sb.append(getD562e1());
        sb.append(", d631e1=");
        sb.append(getD631e1());
        sb.append(", d708e1=");
        sb.append(getD708e1());
        sb.append(", d794e1=");
        sb.append(getD794e1());
        sb.append(", d891e1=");
        sb.append(getD891e1());
        sb.append(", d100e2=");
        sb.append(getD100e2());
        sb.append(", d112e2=");
        sb.append(getD112e2());
        sb.append(", d126e2=");
        sb.append(getD126e2());
        sb.append(", d141e2=");
        sb.append(getD141e2());
        sb.append(", d158e2=");
        sb.append(getD158e2());
        sb.append(", d178e2=");
        sb.append(getD178e2());
        sb.append(", d200e2=");
        sb.append(getD200e2());
        sb.append(", d224e2=");
        sb.append(getD224e2());
        sb.append(", d251e2=");
        sb.append(getD251e2());
        sb.append(", d282e2=");
        sb.append(getD282e2());
        sb.append(", d316e2=");
        sb.append(getD316e2());
        sb.append(", d355e2=");
        sb.append(getD355e2());
        sb.append(", d398e2=");
        sb.append(getD398e2());
        sb.append(", d447e2=");
        sb.append(getD447e2());
        sb.append(", d501e2=");
        sb.append(getD501e2());
        sb.append(", d562e2=");
        sb.append(getD562e2());
        sb.append(", d631e2=");
        sb.append(getD631e2());
        sb.append(", d708e2=");
        sb.append(getD708e2());
        sb.append(", d794e2=");
        sb.append(getD794e2());
        sb.append(", d891e2=");
        sb.append(getD891e2());
        sb.append(", d100e3=");
        sb.append(getD100e3());
        sb.append(", d112e3=");
        sb.append(getD112e3());
        sb.append(", d126e3=");
        sb.append(getD126e3());
        sb.append(", d141e3=");
        sb.append(getD141e3());
        sb.append(", d158e3=");
        sb.append(getD158e3());
        sb.append(", d178e3=");
        sb.append(getD178e3());
        sb.append(", d200e3=");
        sb.append(getD200e3());
        sb.append(", d224e3=");
        sb.append(getD224e3());
        sb.append(", d251e3=");
        sb.append(getD251e3());
        sb.append(", d282e3=");
        sb.append(getD282e3());
        sb.append(", d316e3=");
        sb.append(getD316e3());
        sb.append(", d355e3=");
        sb.append(getD355e3());
        sb.append(", d398e3=");
        sb.append(getD398e3());
        sb.append(", d447e3=");
        sb.append(getD447e3());
        sb.append(", d501e3=");
        sb.append(getD501e3());
        sb.append(", d562e3=");
        sb.append(getD562e3());
        sb.append(", d631e3=");
        sb.append(getD631e3());
        sb.append(", d708e3=");
        sb.append(getD708e3());
        sb.append(", d794e3=");
        sb.append(getD794e3());
        sb.append(", d891e3=");
        sb.append(getD891e3());
        sb.append(", d100e4=");
        sb.append(getD100e4());
        sb.append(", tconc=");
        sb.append(getTconc());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(211);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.HyyDMPS");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>t1</column-name><column-value><![CDATA[");
        sb.append(getT1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>t2</column-name><column-value><![CDATA[");
        sb.append(getT2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>p1</column-name><column-value><![CDATA[");
        sb.append(getP1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>p2</column-name><column-value><![CDATA[");
        sb.append(getP2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rh1</column-name><column-value><![CDATA[");
        sb.append(getRh1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rh2</column-name><column-value><![CDATA[");
        sb.append(getRh2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d100e1</column-name><column-value><![CDATA[");
        sb.append(getD100e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d112e1</column-name><column-value><![CDATA[");
        sb.append(getD112e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d126e1</column-name><column-value><![CDATA[");
        sb.append(getD126e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d141e1</column-name><column-value><![CDATA[");
        sb.append(getD141e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d158e1</column-name><column-value><![CDATA[");
        sb.append(getD158e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d178e1</column-name><column-value><![CDATA[");
        sb.append(getD178e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d200e1</column-name><column-value><![CDATA[");
        sb.append(getD200e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d224e1</column-name><column-value><![CDATA[");
        sb.append(getD224e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d251e1</column-name><column-value><![CDATA[");
        sb.append(getD251e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d282e1</column-name><column-value><![CDATA[");
        sb.append(getD282e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d316e1</column-name><column-value><![CDATA[");
        sb.append(getD316e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d355e1</column-name><column-value><![CDATA[");
        sb.append(getD355e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d398e1</column-name><column-value><![CDATA[");
        sb.append(getD398e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d447e1</column-name><column-value><![CDATA[");
        sb.append(getD447e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d501e1</column-name><column-value><![CDATA[");
        sb.append(getD501e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d562e1</column-name><column-value><![CDATA[");
        sb.append(getD562e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d631e1</column-name><column-value><![CDATA[");
        sb.append(getD631e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d708e1</column-name><column-value><![CDATA[");
        sb.append(getD708e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d794e1</column-name><column-value><![CDATA[");
        sb.append(getD794e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d891e1</column-name><column-value><![CDATA[");
        sb.append(getD891e1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d100e2</column-name><column-value><![CDATA[");
        sb.append(getD100e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d112e2</column-name><column-value><![CDATA[");
        sb.append(getD112e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d126e2</column-name><column-value><![CDATA[");
        sb.append(getD126e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d141e2</column-name><column-value><![CDATA[");
        sb.append(getD141e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d158e2</column-name><column-value><![CDATA[");
        sb.append(getD158e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d178e2</column-name><column-value><![CDATA[");
        sb.append(getD178e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d200e2</column-name><column-value><![CDATA[");
        sb.append(getD200e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d224e2</column-name><column-value><![CDATA[");
        sb.append(getD224e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d251e2</column-name><column-value><![CDATA[");
        sb.append(getD251e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d282e2</column-name><column-value><![CDATA[");
        sb.append(getD282e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d316e2</column-name><column-value><![CDATA[");
        sb.append(getD316e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d355e2</column-name><column-value><![CDATA[");
        sb.append(getD355e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d398e2</column-name><column-value><![CDATA[");
        sb.append(getD398e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d447e2</column-name><column-value><![CDATA[");
        sb.append(getD447e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d501e2</column-name><column-value><![CDATA[");
        sb.append(getD501e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d562e2</column-name><column-value><![CDATA[");
        sb.append(getD562e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d631e2</column-name><column-value><![CDATA[");
        sb.append(getD631e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d708e2</column-name><column-value><![CDATA[");
        sb.append(getD708e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d794e2</column-name><column-value><![CDATA[");
        sb.append(getD794e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d891e2</column-name><column-value><![CDATA[");
        sb.append(getD891e2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d100e3</column-name><column-value><![CDATA[");
        sb.append(getD100e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d112e3</column-name><column-value><![CDATA[");
        sb.append(getD112e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d126e3</column-name><column-value><![CDATA[");
        sb.append(getD126e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d141e3</column-name><column-value><![CDATA[");
        sb.append(getD141e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d158e3</column-name><column-value><![CDATA[");
        sb.append(getD158e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d178e3</column-name><column-value><![CDATA[");
        sb.append(getD178e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d200e3</column-name><column-value><![CDATA[");
        sb.append(getD200e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d224e3</column-name><column-value><![CDATA[");
        sb.append(getD224e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d251e3</column-name><column-value><![CDATA[");
        sb.append(getD251e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d282e3</column-name><column-value><![CDATA[");
        sb.append(getD282e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d316e3</column-name><column-value><![CDATA[");
        sb.append(getD316e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d355e3</column-name><column-value><![CDATA[");
        sb.append(getD355e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d398e3</column-name><column-value><![CDATA[");
        sb.append(getD398e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d447e3</column-name><column-value><![CDATA[");
        sb.append(getD447e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d501e3</column-name><column-value><![CDATA[");
        sb.append(getD501e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d562e3</column-name><column-value><![CDATA[");
        sb.append(getD562e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d631e3</column-name><column-value><![CDATA[");
        sb.append(getD631e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d708e3</column-name><column-value><![CDATA[");
        sb.append(getD708e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d794e3</column-name><column-value><![CDATA[");
        sb.append(getD794e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d891e3</column-name><column-value><![CDATA[");
        sb.append(getD891e3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>d100e4</column-name><column-value><![CDATA[");
        sb.append(getD100e4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tconc</column-name><column-value><![CDATA[");
        sb.append(getTconc());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
