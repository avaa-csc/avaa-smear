package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VarDMPS}.
 * </p>
 *
 * @author pj
 * @see VarDMPS
 * @generated
 */
public class VarDMPSWrapper implements VarDMPS, ModelWrapper<VarDMPS> {
    private VarDMPS _varDMPS;

    public VarDMPSWrapper(VarDMPS varDMPS) {
        _varDMPS = varDMPS;
    }

    @Override
    public Class<?> getModelClass() {
        return VarDMPS.class;
    }

    @Override
    public String getModelClassName() {
        return VarDMPS.class.getName();
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

    /**
    * Returns the primary key of this var d m p s.
    *
    * @return the primary key of this var d m p s
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _varDMPS.getPrimaryKey();
    }

    /**
    * Sets the primary key of this var d m p s.
    *
    * @param primaryKey the primary key of this var d m p s
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _varDMPS.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this var d m p s.
    *
    * @return the samptime of this var d m p s
    */
    @Override
    public java.util.Date getSamptime() {
        return _varDMPS.getSamptime();
    }

    /**
    * Sets the samptime of this var d m p s.
    *
    * @param samptime the samptime of this var d m p s
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _varDMPS.setSamptime(samptime);
    }

    /**
    * Returns the t1 of this var d m p s.
    *
    * @return the t1 of this var d m p s
    */
    @Override
    public float getT1() {
        return _varDMPS.getT1();
    }

    /**
    * Sets the t1 of this var d m p s.
    *
    * @param t1 the t1 of this var d m p s
    */
    @Override
    public void setT1(float t1) {
        _varDMPS.setT1(t1);
    }

    /**
    * Returns the t2 of this var d m p s.
    *
    * @return the t2 of this var d m p s
    */
    @Override
    public float getT2() {
        return _varDMPS.getT2();
    }

    /**
    * Sets the t2 of this var d m p s.
    *
    * @param t2 the t2 of this var d m p s
    */
    @Override
    public void setT2(float t2) {
        _varDMPS.setT2(t2);
    }

    /**
    * Returns the p1 of this var d m p s.
    *
    * @return the p1 of this var d m p s
    */
    @Override
    public float getP1() {
        return _varDMPS.getP1();
    }

    /**
    * Sets the p1 of this var d m p s.
    *
    * @param p1 the p1 of this var d m p s
    */
    @Override
    public void setP1(float p1) {
        _varDMPS.setP1(p1);
    }

    /**
    * Returns the p2 of this var d m p s.
    *
    * @return the p2 of this var d m p s
    */
    @Override
    public float getP2() {
        return _varDMPS.getP2();
    }

    /**
    * Sets the p2 of this var d m p s.
    *
    * @param p2 the p2 of this var d m p s
    */
    @Override
    public void setP2(float p2) {
        _varDMPS.setP2(p2);
    }

    /**
    * Returns the rh1 of this var d m p s.
    *
    * @return the rh1 of this var d m p s
    */
    @Override
    public float getRh1() {
        return _varDMPS.getRh1();
    }

    /**
    * Sets the rh1 of this var d m p s.
    *
    * @param rh1 the rh1 of this var d m p s
    */
    @Override
    public void setRh1(float rh1) {
        _varDMPS.setRh1(rh1);
    }

    /**
    * Returns the rh2 of this var d m p s.
    *
    * @return the rh2 of this var d m p s
    */
    @Override
    public float getRh2() {
        return _varDMPS.getRh2();
    }

    /**
    * Sets the rh2 of this var d m p s.
    *
    * @param rh2 the rh2 of this var d m p s
    */
    @Override
    public void setRh2(float rh2) {
        _varDMPS.setRh2(rh2);
    }

    /**
    * Returns the d100e1 of this var d m p s.
    *
    * @return the d100e1 of this var d m p s
    */
    @Override
    public float getD100e1() {
        return _varDMPS.getD100e1();
    }

    /**
    * Sets the d100e1 of this var d m p s.
    *
    * @param d100e1 the d100e1 of this var d m p s
    */
    @Override
    public void setD100e1(float d100e1) {
        _varDMPS.setD100e1(d100e1);
    }

    /**
    * Returns the d112e1 of this var d m p s.
    *
    * @return the d112e1 of this var d m p s
    */
    @Override
    public float getD112e1() {
        return _varDMPS.getD112e1();
    }

    /**
    * Sets the d112e1 of this var d m p s.
    *
    * @param d112e1 the d112e1 of this var d m p s
    */
    @Override
    public void setD112e1(float d112e1) {
        _varDMPS.setD112e1(d112e1);
    }

    /**
    * Returns the d126e1 of this var d m p s.
    *
    * @return the d126e1 of this var d m p s
    */
    @Override
    public float getD126e1() {
        return _varDMPS.getD126e1();
    }

    /**
    * Sets the d126e1 of this var d m p s.
    *
    * @param d126e1 the d126e1 of this var d m p s
    */
    @Override
    public void setD126e1(float d126e1) {
        _varDMPS.setD126e1(d126e1);
    }

    /**
    * Returns the d141e1 of this var d m p s.
    *
    * @return the d141e1 of this var d m p s
    */
    @Override
    public float getD141e1() {
        return _varDMPS.getD141e1();
    }

    /**
    * Sets the d141e1 of this var d m p s.
    *
    * @param d141e1 the d141e1 of this var d m p s
    */
    @Override
    public void setD141e1(float d141e1) {
        _varDMPS.setD141e1(d141e1);
    }

    /**
    * Returns the d158e1 of this var d m p s.
    *
    * @return the d158e1 of this var d m p s
    */
    @Override
    public float getD158e1() {
        return _varDMPS.getD158e1();
    }

    /**
    * Sets the d158e1 of this var d m p s.
    *
    * @param d158e1 the d158e1 of this var d m p s
    */
    @Override
    public void setD158e1(float d158e1) {
        _varDMPS.setD158e1(d158e1);
    }

    /**
    * Returns the d178e1 of this var d m p s.
    *
    * @return the d178e1 of this var d m p s
    */
    @Override
    public float getD178e1() {
        return _varDMPS.getD178e1();
    }

    /**
    * Sets the d178e1 of this var d m p s.
    *
    * @param d178e1 the d178e1 of this var d m p s
    */
    @Override
    public void setD178e1(float d178e1) {
        _varDMPS.setD178e1(d178e1);
    }

    /**
    * Returns the d200e1 of this var d m p s.
    *
    * @return the d200e1 of this var d m p s
    */
    @Override
    public float getD200e1() {
        return _varDMPS.getD200e1();
    }

    /**
    * Sets the d200e1 of this var d m p s.
    *
    * @param d200e1 the d200e1 of this var d m p s
    */
    @Override
    public void setD200e1(float d200e1) {
        _varDMPS.setD200e1(d200e1);
    }

    /**
    * Returns the d224e1 of this var d m p s.
    *
    * @return the d224e1 of this var d m p s
    */
    @Override
    public float getD224e1() {
        return _varDMPS.getD224e1();
    }

    /**
    * Sets the d224e1 of this var d m p s.
    *
    * @param d224e1 the d224e1 of this var d m p s
    */
    @Override
    public void setD224e1(float d224e1) {
        _varDMPS.setD224e1(d224e1);
    }

    /**
    * Returns the d251e1 of this var d m p s.
    *
    * @return the d251e1 of this var d m p s
    */
    @Override
    public float getD251e1() {
        return _varDMPS.getD251e1();
    }

    /**
    * Sets the d251e1 of this var d m p s.
    *
    * @param d251e1 the d251e1 of this var d m p s
    */
    @Override
    public void setD251e1(float d251e1) {
        _varDMPS.setD251e1(d251e1);
    }

    /**
    * Returns the d282e1 of this var d m p s.
    *
    * @return the d282e1 of this var d m p s
    */
    @Override
    public float getD282e1() {
        return _varDMPS.getD282e1();
    }

    /**
    * Sets the d282e1 of this var d m p s.
    *
    * @param d282e1 the d282e1 of this var d m p s
    */
    @Override
    public void setD282e1(float d282e1) {
        _varDMPS.setD282e1(d282e1);
    }

    /**
    * Returns the d316e1 of this var d m p s.
    *
    * @return the d316e1 of this var d m p s
    */
    @Override
    public float getD316e1() {
        return _varDMPS.getD316e1();
    }

    /**
    * Sets the d316e1 of this var d m p s.
    *
    * @param d316e1 the d316e1 of this var d m p s
    */
    @Override
    public void setD316e1(float d316e1) {
        _varDMPS.setD316e1(d316e1);
    }

    /**
    * Returns the d355e1 of this var d m p s.
    *
    * @return the d355e1 of this var d m p s
    */
    @Override
    public float getD355e1() {
        return _varDMPS.getD355e1();
    }

    /**
    * Sets the d355e1 of this var d m p s.
    *
    * @param d355e1 the d355e1 of this var d m p s
    */
    @Override
    public void setD355e1(float d355e1) {
        _varDMPS.setD355e1(d355e1);
    }

    /**
    * Returns the d398e1 of this var d m p s.
    *
    * @return the d398e1 of this var d m p s
    */
    @Override
    public float getD398e1() {
        return _varDMPS.getD398e1();
    }

    /**
    * Sets the d398e1 of this var d m p s.
    *
    * @param d398e1 the d398e1 of this var d m p s
    */
    @Override
    public void setD398e1(float d398e1) {
        _varDMPS.setD398e1(d398e1);
    }

    /**
    * Returns the d447e1 of this var d m p s.
    *
    * @return the d447e1 of this var d m p s
    */
    @Override
    public float getD447e1() {
        return _varDMPS.getD447e1();
    }

    /**
    * Sets the d447e1 of this var d m p s.
    *
    * @param d447e1 the d447e1 of this var d m p s
    */
    @Override
    public void setD447e1(float d447e1) {
        _varDMPS.setD447e1(d447e1);
    }

    /**
    * Returns the d501e1 of this var d m p s.
    *
    * @return the d501e1 of this var d m p s
    */
    @Override
    public float getD501e1() {
        return _varDMPS.getD501e1();
    }

    /**
    * Sets the d501e1 of this var d m p s.
    *
    * @param d501e1 the d501e1 of this var d m p s
    */
    @Override
    public void setD501e1(float d501e1) {
        _varDMPS.setD501e1(d501e1);
    }

    /**
    * Returns the d562e1 of this var d m p s.
    *
    * @return the d562e1 of this var d m p s
    */
    @Override
    public float getD562e1() {
        return _varDMPS.getD562e1();
    }

    /**
    * Sets the d562e1 of this var d m p s.
    *
    * @param d562e1 the d562e1 of this var d m p s
    */
    @Override
    public void setD562e1(float d562e1) {
        _varDMPS.setD562e1(d562e1);
    }

    /**
    * Returns the d631e1 of this var d m p s.
    *
    * @return the d631e1 of this var d m p s
    */
    @Override
    public float getD631e1() {
        return _varDMPS.getD631e1();
    }

    /**
    * Sets the d631e1 of this var d m p s.
    *
    * @param d631e1 the d631e1 of this var d m p s
    */
    @Override
    public void setD631e1(float d631e1) {
        _varDMPS.setD631e1(d631e1);
    }

    /**
    * Returns the d708e1 of this var d m p s.
    *
    * @return the d708e1 of this var d m p s
    */
    @Override
    public float getD708e1() {
        return _varDMPS.getD708e1();
    }

    /**
    * Sets the d708e1 of this var d m p s.
    *
    * @param d708e1 the d708e1 of this var d m p s
    */
    @Override
    public void setD708e1(float d708e1) {
        _varDMPS.setD708e1(d708e1);
    }

    /**
    * Returns the d794e1 of this var d m p s.
    *
    * @return the d794e1 of this var d m p s
    */
    @Override
    public float getD794e1() {
        return _varDMPS.getD794e1();
    }

    /**
    * Sets the d794e1 of this var d m p s.
    *
    * @param d794e1 the d794e1 of this var d m p s
    */
    @Override
    public void setD794e1(float d794e1) {
        _varDMPS.setD794e1(d794e1);
    }

    /**
    * Returns the d891e1 of this var d m p s.
    *
    * @return the d891e1 of this var d m p s
    */
    @Override
    public float getD891e1() {
        return _varDMPS.getD891e1();
    }

    /**
    * Sets the d891e1 of this var d m p s.
    *
    * @param d891e1 the d891e1 of this var d m p s
    */
    @Override
    public void setD891e1(float d891e1) {
        _varDMPS.setD891e1(d891e1);
    }

    /**
    * Returns the d100e2 of this var d m p s.
    *
    * @return the d100e2 of this var d m p s
    */
    @Override
    public float getD100e2() {
        return _varDMPS.getD100e2();
    }

    /**
    * Sets the d100e2 of this var d m p s.
    *
    * @param d100e2 the d100e2 of this var d m p s
    */
    @Override
    public void setD100e2(float d100e2) {
        _varDMPS.setD100e2(d100e2);
    }

    /**
    * Returns the d112e2 of this var d m p s.
    *
    * @return the d112e2 of this var d m p s
    */
    @Override
    public float getD112e2() {
        return _varDMPS.getD112e2();
    }

    /**
    * Sets the d112e2 of this var d m p s.
    *
    * @param d112e2 the d112e2 of this var d m p s
    */
    @Override
    public void setD112e2(float d112e2) {
        _varDMPS.setD112e2(d112e2);
    }

    /**
    * Returns the d126e2 of this var d m p s.
    *
    * @return the d126e2 of this var d m p s
    */
    @Override
    public float getD126e2() {
        return _varDMPS.getD126e2();
    }

    /**
    * Sets the d126e2 of this var d m p s.
    *
    * @param d126e2 the d126e2 of this var d m p s
    */
    @Override
    public void setD126e2(float d126e2) {
        _varDMPS.setD126e2(d126e2);
    }

    /**
    * Returns the d141e2 of this var d m p s.
    *
    * @return the d141e2 of this var d m p s
    */
    @Override
    public float getD141e2() {
        return _varDMPS.getD141e2();
    }

    /**
    * Sets the d141e2 of this var d m p s.
    *
    * @param d141e2 the d141e2 of this var d m p s
    */
    @Override
    public void setD141e2(float d141e2) {
        _varDMPS.setD141e2(d141e2);
    }

    /**
    * Returns the d158e2 of this var d m p s.
    *
    * @return the d158e2 of this var d m p s
    */
    @Override
    public float getD158e2() {
        return _varDMPS.getD158e2();
    }

    /**
    * Sets the d158e2 of this var d m p s.
    *
    * @param d158e2 the d158e2 of this var d m p s
    */
    @Override
    public void setD158e2(float d158e2) {
        _varDMPS.setD158e2(d158e2);
    }

    /**
    * Returns the d178e2 of this var d m p s.
    *
    * @return the d178e2 of this var d m p s
    */
    @Override
    public float getD178e2() {
        return _varDMPS.getD178e2();
    }

    /**
    * Sets the d178e2 of this var d m p s.
    *
    * @param d178e2 the d178e2 of this var d m p s
    */
    @Override
    public void setD178e2(float d178e2) {
        _varDMPS.setD178e2(d178e2);
    }

    /**
    * Returns the d200e2 of this var d m p s.
    *
    * @return the d200e2 of this var d m p s
    */
    @Override
    public float getD200e2() {
        return _varDMPS.getD200e2();
    }

    /**
    * Sets the d200e2 of this var d m p s.
    *
    * @param d200e2 the d200e2 of this var d m p s
    */
    @Override
    public void setD200e2(float d200e2) {
        _varDMPS.setD200e2(d200e2);
    }

    /**
    * Returns the d224e2 of this var d m p s.
    *
    * @return the d224e2 of this var d m p s
    */
    @Override
    public float getD224e2() {
        return _varDMPS.getD224e2();
    }

    /**
    * Sets the d224e2 of this var d m p s.
    *
    * @param d224e2 the d224e2 of this var d m p s
    */
    @Override
    public void setD224e2(float d224e2) {
        _varDMPS.setD224e2(d224e2);
    }

    /**
    * Returns the d251e2 of this var d m p s.
    *
    * @return the d251e2 of this var d m p s
    */
    @Override
    public float getD251e2() {
        return _varDMPS.getD251e2();
    }

    /**
    * Sets the d251e2 of this var d m p s.
    *
    * @param d251e2 the d251e2 of this var d m p s
    */
    @Override
    public void setD251e2(float d251e2) {
        _varDMPS.setD251e2(d251e2);
    }

    /**
    * Returns the d282e2 of this var d m p s.
    *
    * @return the d282e2 of this var d m p s
    */
    @Override
    public float getD282e2() {
        return _varDMPS.getD282e2();
    }

    /**
    * Sets the d282e2 of this var d m p s.
    *
    * @param d282e2 the d282e2 of this var d m p s
    */
    @Override
    public void setD282e2(float d282e2) {
        _varDMPS.setD282e2(d282e2);
    }

    /**
    * Returns the d316e2 of this var d m p s.
    *
    * @return the d316e2 of this var d m p s
    */
    @Override
    public float getD316e2() {
        return _varDMPS.getD316e2();
    }

    /**
    * Sets the d316e2 of this var d m p s.
    *
    * @param d316e2 the d316e2 of this var d m p s
    */
    @Override
    public void setD316e2(float d316e2) {
        _varDMPS.setD316e2(d316e2);
    }

    /**
    * Returns the d355e2 of this var d m p s.
    *
    * @return the d355e2 of this var d m p s
    */
    @Override
    public float getD355e2() {
        return _varDMPS.getD355e2();
    }

    /**
    * Sets the d355e2 of this var d m p s.
    *
    * @param d355e2 the d355e2 of this var d m p s
    */
    @Override
    public void setD355e2(float d355e2) {
        _varDMPS.setD355e2(d355e2);
    }

    /**
    * Returns the d398e2 of this var d m p s.
    *
    * @return the d398e2 of this var d m p s
    */
    @Override
    public float getD398e2() {
        return _varDMPS.getD398e2();
    }

    /**
    * Sets the d398e2 of this var d m p s.
    *
    * @param d398e2 the d398e2 of this var d m p s
    */
    @Override
    public void setD398e2(float d398e2) {
        _varDMPS.setD398e2(d398e2);
    }

    /**
    * Returns the d447e2 of this var d m p s.
    *
    * @return the d447e2 of this var d m p s
    */
    @Override
    public float getD447e2() {
        return _varDMPS.getD447e2();
    }

    /**
    * Sets the d447e2 of this var d m p s.
    *
    * @param d447e2 the d447e2 of this var d m p s
    */
    @Override
    public void setD447e2(float d447e2) {
        _varDMPS.setD447e2(d447e2);
    }

    /**
    * Returns the d501e2 of this var d m p s.
    *
    * @return the d501e2 of this var d m p s
    */
    @Override
    public float getD501e2() {
        return _varDMPS.getD501e2();
    }

    /**
    * Sets the d501e2 of this var d m p s.
    *
    * @param d501e2 the d501e2 of this var d m p s
    */
    @Override
    public void setD501e2(float d501e2) {
        _varDMPS.setD501e2(d501e2);
    }

    /**
    * Returns the d562e2 of this var d m p s.
    *
    * @return the d562e2 of this var d m p s
    */
    @Override
    public float getD562e2() {
        return _varDMPS.getD562e2();
    }

    /**
    * Sets the d562e2 of this var d m p s.
    *
    * @param d562e2 the d562e2 of this var d m p s
    */
    @Override
    public void setD562e2(float d562e2) {
        _varDMPS.setD562e2(d562e2);
    }

    /**
    * Returns the d631e2 of this var d m p s.
    *
    * @return the d631e2 of this var d m p s
    */
    @Override
    public float getD631e2() {
        return _varDMPS.getD631e2();
    }

    /**
    * Sets the d631e2 of this var d m p s.
    *
    * @param d631e2 the d631e2 of this var d m p s
    */
    @Override
    public void setD631e2(float d631e2) {
        _varDMPS.setD631e2(d631e2);
    }

    /**
    * Returns the d708e2 of this var d m p s.
    *
    * @return the d708e2 of this var d m p s
    */
    @Override
    public float getD708e2() {
        return _varDMPS.getD708e2();
    }

    /**
    * Sets the d708e2 of this var d m p s.
    *
    * @param d708e2 the d708e2 of this var d m p s
    */
    @Override
    public void setD708e2(float d708e2) {
        _varDMPS.setD708e2(d708e2);
    }

    /**
    * Returns the d794e2 of this var d m p s.
    *
    * @return the d794e2 of this var d m p s
    */
    @Override
    public float getD794e2() {
        return _varDMPS.getD794e2();
    }

    /**
    * Sets the d794e2 of this var d m p s.
    *
    * @param d794e2 the d794e2 of this var d m p s
    */
    @Override
    public void setD794e2(float d794e2) {
        _varDMPS.setD794e2(d794e2);
    }

    /**
    * Returns the d891e2 of this var d m p s.
    *
    * @return the d891e2 of this var d m p s
    */
    @Override
    public float getD891e2() {
        return _varDMPS.getD891e2();
    }

    /**
    * Sets the d891e2 of this var d m p s.
    *
    * @param d891e2 the d891e2 of this var d m p s
    */
    @Override
    public void setD891e2(float d891e2) {
        _varDMPS.setD891e2(d891e2);
    }

    /**
    * Returns the d100e3 of this var d m p s.
    *
    * @return the d100e3 of this var d m p s
    */
    @Override
    public float getD100e3() {
        return _varDMPS.getD100e3();
    }

    /**
    * Sets the d100e3 of this var d m p s.
    *
    * @param d100e3 the d100e3 of this var d m p s
    */
    @Override
    public void setD100e3(float d100e3) {
        _varDMPS.setD100e3(d100e3);
    }

    /**
    * Returns the d112e3 of this var d m p s.
    *
    * @return the d112e3 of this var d m p s
    */
    @Override
    public float getD112e3() {
        return _varDMPS.getD112e3();
    }

    /**
    * Sets the d112e3 of this var d m p s.
    *
    * @param d112e3 the d112e3 of this var d m p s
    */
    @Override
    public void setD112e3(float d112e3) {
        _varDMPS.setD112e3(d112e3);
    }

    /**
    * Returns the d126e3 of this var d m p s.
    *
    * @return the d126e3 of this var d m p s
    */
    @Override
    public float getD126e3() {
        return _varDMPS.getD126e3();
    }

    /**
    * Sets the d126e3 of this var d m p s.
    *
    * @param d126e3 the d126e3 of this var d m p s
    */
    @Override
    public void setD126e3(float d126e3) {
        _varDMPS.setD126e3(d126e3);
    }

    /**
    * Returns the d141e3 of this var d m p s.
    *
    * @return the d141e3 of this var d m p s
    */
    @Override
    public float getD141e3() {
        return _varDMPS.getD141e3();
    }

    /**
    * Sets the d141e3 of this var d m p s.
    *
    * @param d141e3 the d141e3 of this var d m p s
    */
    @Override
    public void setD141e3(float d141e3) {
        _varDMPS.setD141e3(d141e3);
    }

    /**
    * Returns the d158e3 of this var d m p s.
    *
    * @return the d158e3 of this var d m p s
    */
    @Override
    public float getD158e3() {
        return _varDMPS.getD158e3();
    }

    /**
    * Sets the d158e3 of this var d m p s.
    *
    * @param d158e3 the d158e3 of this var d m p s
    */
    @Override
    public void setD158e3(float d158e3) {
        _varDMPS.setD158e3(d158e3);
    }

    /**
    * Returns the d178e3 of this var d m p s.
    *
    * @return the d178e3 of this var d m p s
    */
    @Override
    public float getD178e3() {
        return _varDMPS.getD178e3();
    }

    /**
    * Sets the d178e3 of this var d m p s.
    *
    * @param d178e3 the d178e3 of this var d m p s
    */
    @Override
    public void setD178e3(float d178e3) {
        _varDMPS.setD178e3(d178e3);
    }

    /**
    * Returns the d200e3 of this var d m p s.
    *
    * @return the d200e3 of this var d m p s
    */
    @Override
    public float getD200e3() {
        return _varDMPS.getD200e3();
    }

    /**
    * Sets the d200e3 of this var d m p s.
    *
    * @param d200e3 the d200e3 of this var d m p s
    */
    @Override
    public void setD200e3(float d200e3) {
        _varDMPS.setD200e3(d200e3);
    }

    /**
    * Returns the d224e3 of this var d m p s.
    *
    * @return the d224e3 of this var d m p s
    */
    @Override
    public float getD224e3() {
        return _varDMPS.getD224e3();
    }

    /**
    * Sets the d224e3 of this var d m p s.
    *
    * @param d224e3 the d224e3 of this var d m p s
    */
    @Override
    public void setD224e3(float d224e3) {
        _varDMPS.setD224e3(d224e3);
    }

    /**
    * Returns the d251e3 of this var d m p s.
    *
    * @return the d251e3 of this var d m p s
    */
    @Override
    public float getD251e3() {
        return _varDMPS.getD251e3();
    }

    /**
    * Sets the d251e3 of this var d m p s.
    *
    * @param d251e3 the d251e3 of this var d m p s
    */
    @Override
    public void setD251e3(float d251e3) {
        _varDMPS.setD251e3(d251e3);
    }

    /**
    * Returns the d282e3 of this var d m p s.
    *
    * @return the d282e3 of this var d m p s
    */
    @Override
    public float getD282e3() {
        return _varDMPS.getD282e3();
    }

    /**
    * Sets the d282e3 of this var d m p s.
    *
    * @param d282e3 the d282e3 of this var d m p s
    */
    @Override
    public void setD282e3(float d282e3) {
        _varDMPS.setD282e3(d282e3);
    }

    /**
    * Returns the d316e3 of this var d m p s.
    *
    * @return the d316e3 of this var d m p s
    */
    @Override
    public float getD316e3() {
        return _varDMPS.getD316e3();
    }

    /**
    * Sets the d316e3 of this var d m p s.
    *
    * @param d316e3 the d316e3 of this var d m p s
    */
    @Override
    public void setD316e3(float d316e3) {
        _varDMPS.setD316e3(d316e3);
    }

    /**
    * Returns the d355e3 of this var d m p s.
    *
    * @return the d355e3 of this var d m p s
    */
    @Override
    public float getD355e3() {
        return _varDMPS.getD355e3();
    }

    /**
    * Sets the d355e3 of this var d m p s.
    *
    * @param d355e3 the d355e3 of this var d m p s
    */
    @Override
    public void setD355e3(float d355e3) {
        _varDMPS.setD355e3(d355e3);
    }

    /**
    * Returns the d398e3 of this var d m p s.
    *
    * @return the d398e3 of this var d m p s
    */
    @Override
    public float getD398e3() {
        return _varDMPS.getD398e3();
    }

    /**
    * Sets the d398e3 of this var d m p s.
    *
    * @param d398e3 the d398e3 of this var d m p s
    */
    @Override
    public void setD398e3(float d398e3) {
        _varDMPS.setD398e3(d398e3);
    }

    /**
    * Returns the d447e3 of this var d m p s.
    *
    * @return the d447e3 of this var d m p s
    */
    @Override
    public float getD447e3() {
        return _varDMPS.getD447e3();
    }

    /**
    * Sets the d447e3 of this var d m p s.
    *
    * @param d447e3 the d447e3 of this var d m p s
    */
    @Override
    public void setD447e3(float d447e3) {
        _varDMPS.setD447e3(d447e3);
    }

    /**
    * Returns the d501e3 of this var d m p s.
    *
    * @return the d501e3 of this var d m p s
    */
    @Override
    public float getD501e3() {
        return _varDMPS.getD501e3();
    }

    /**
    * Sets the d501e3 of this var d m p s.
    *
    * @param d501e3 the d501e3 of this var d m p s
    */
    @Override
    public void setD501e3(float d501e3) {
        _varDMPS.setD501e3(d501e3);
    }

    /**
    * Returns the d562e3 of this var d m p s.
    *
    * @return the d562e3 of this var d m p s
    */
    @Override
    public float getD562e3() {
        return _varDMPS.getD562e3();
    }

    /**
    * Sets the d562e3 of this var d m p s.
    *
    * @param d562e3 the d562e3 of this var d m p s
    */
    @Override
    public void setD562e3(float d562e3) {
        _varDMPS.setD562e3(d562e3);
    }

    /**
    * Returns the d631e3 of this var d m p s.
    *
    * @return the d631e3 of this var d m p s
    */
    @Override
    public float getD631e3() {
        return _varDMPS.getD631e3();
    }

    /**
    * Sets the d631e3 of this var d m p s.
    *
    * @param d631e3 the d631e3 of this var d m p s
    */
    @Override
    public void setD631e3(float d631e3) {
        _varDMPS.setD631e3(d631e3);
    }

    /**
    * Returns the d708e3 of this var d m p s.
    *
    * @return the d708e3 of this var d m p s
    */
    @Override
    public float getD708e3() {
        return _varDMPS.getD708e3();
    }

    /**
    * Sets the d708e3 of this var d m p s.
    *
    * @param d708e3 the d708e3 of this var d m p s
    */
    @Override
    public void setD708e3(float d708e3) {
        _varDMPS.setD708e3(d708e3);
    }

    /**
    * Returns the d794e3 of this var d m p s.
    *
    * @return the d794e3 of this var d m p s
    */
    @Override
    public float getD794e3() {
        return _varDMPS.getD794e3();
    }

    /**
    * Sets the d794e3 of this var d m p s.
    *
    * @param d794e3 the d794e3 of this var d m p s
    */
    @Override
    public void setD794e3(float d794e3) {
        _varDMPS.setD794e3(d794e3);
    }

    /**
    * Returns the d891e3 of this var d m p s.
    *
    * @return the d891e3 of this var d m p s
    */
    @Override
    public float getD891e3() {
        return _varDMPS.getD891e3();
    }

    /**
    * Sets the d891e3 of this var d m p s.
    *
    * @param d891e3 the d891e3 of this var d m p s
    */
    @Override
    public void setD891e3(float d891e3) {
        _varDMPS.setD891e3(d891e3);
    }

    /**
    * Returns the d100e4 of this var d m p s.
    *
    * @return the d100e4 of this var d m p s
    */
    @Override
    public float getD100e4() {
        return _varDMPS.getD100e4();
    }

    /**
    * Sets the d100e4 of this var d m p s.
    *
    * @param d100e4 the d100e4 of this var d m p s
    */
    @Override
    public void setD100e4(float d100e4) {
        _varDMPS.setD100e4(d100e4);
    }

    /**
    * Returns the tconc of this var d m p s.
    *
    * @return the tconc of this var d m p s
    */
    @Override
    public float getTconc() {
        return _varDMPS.getTconc();
    }

    /**
    * Sets the tconc of this var d m p s.
    *
    * @param tconc the tconc of this var d m p s
    */
    @Override
    public void setTconc(float tconc) {
        _varDMPS.setTconc(tconc);
    }

    @Override
    public boolean isNew() {
        return _varDMPS.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _varDMPS.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _varDMPS.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _varDMPS.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _varDMPS.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _varDMPS.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _varDMPS.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _varDMPS.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _varDMPS.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _varDMPS.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _varDMPS.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VarDMPSWrapper((VarDMPS) _varDMPS.clone());
    }

    @Override
    public int compareTo(VarDMPS varDMPS) {
        return _varDMPS.compareTo(varDMPS);
    }

    @Override
    public int hashCode() {
        return _varDMPS.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<VarDMPS> toCacheModel() {
        return _varDMPS.toCacheModel();
    }

    @Override
    public VarDMPS toEscapedModel() {
        return new VarDMPSWrapper(_varDMPS.toEscapedModel());
    }

    @Override
    public VarDMPS toUnescapedModel() {
        return new VarDMPSWrapper(_varDMPS.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _varDMPS.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _varDMPS.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _varDMPS.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VarDMPSWrapper)) {
            return false;
        }

        VarDMPSWrapper varDMPSWrapper = (VarDMPSWrapper) obj;

        if (Validator.equals(_varDMPS, varDMPSWrapper._varDMPS)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public VarDMPS getWrappedVarDMPS() {
        return _varDMPS;
    }

    @Override
    public VarDMPS getWrappedModel() {
        return _varDMPS;
    }

    @Override
    public void resetOriginalValues() {
        _varDMPS.resetOriginalValues();
    }
}
