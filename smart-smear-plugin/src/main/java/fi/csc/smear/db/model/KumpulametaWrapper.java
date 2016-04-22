package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Kumpulameta}.
 * </p>
 *
 * @author pj
 * @see Kumpulameta
 * @generated
 */
public class KumpulametaWrapper implements Kumpulameta,
    ModelWrapper<Kumpulameta> {
    private Kumpulameta _kumpulameta;

    public KumpulametaWrapper(Kumpulameta kumpulameta) {
        _kumpulameta = kumpulameta;
    }

    @Override
    public Class<?> getModelClass() {
        return Kumpulameta.class;
    }

    @Override
    public String getModelClassName() {
        return Kumpulameta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("t", getT());
        attributes.put("dp", getDp());
        attributes.put("rh", getRh());
        attributes.put("p", getP());
        attributes.put("ws", getWs());
        attributes.put("wdir", getWdir());
        attributes.put("rmm", getRmm());
        attributes.put("p0", getP0());
        attributes.put("glob", getGlob());
        attributes.put("par", getPar());
        attributes.put("skyir", getSkyir());
        attributes.put("pwd_visibility_1", getPwd_visibility_1());
        attributes.put("pwd_visibility_10", getPwd_visibility_10());
        attributes.put("pwd_wmo_0", getPwd_wmo_0());
        attributes.put("pwd_wmo_15", getPwd_wmo_15());
        attributes.put("pwd_wmo_60", getPwd_wmo_60());
        attributes.put("pwd_intensity_w", getPwd_intensity_w());
        attributes.put("pwd_rmm", getPwd_rmm());
        attributes.put("pwd_smm", getPwd_smm());
        attributes.put("pwd_nws", getPwd_nws());
        attributes.put("Tower_T_4m", getTower_T_4m());
        attributes.put("Tower_T_8m", getTower_T_8m());
        attributes.put("Tower_T_16m", getTower_T_16m());
        attributes.put("Tower_T_32m", getTower_T_32m());
        attributes.put("Tower_WS_32m", getTower_WS_32m());
        attributes.put("Tower_WS_16m", getTower_WS_16m());
        attributes.put("Tower_WS_8m", getTower_WS_8m());
        attributes.put("Tower_WS_4m", getTower_WS_4m());
        attributes.put("Tower_WDIR_32m", getTower_WDIR_32m());
        attributes.put("Tower_WDIR_16m", getTower_WDIR_16m());
        attributes.put("Tower_WDIR_8m", getTower_WDIR_8m());
        attributes.put("Tower_WDIR_4m", getTower_WDIR_4m());
        attributes.put("Tower_PAR_32m", getTower_PAR_32m());
        attributes.put("Tower_PAR_REFL_32m", getTower_PAR_REFL_32m());
        attributes.put("Tower_GLOB_32m", getTower_GLOB_32m());
        attributes.put("Tower_GLOB_REFL_32m", getTower_GLOB_REFL_32m());
        attributes.put("Tower_IR_32m", getTower_IR_32m());
        attributes.put("Tower_IR_REFL_32m", getTower_IR_REFL_32m());
        attributes.put("Tower_VT_4m", getTower_VT_4m());
        attributes.put("Tower_VT_8m", getTower_VT_8m());
        attributes.put("Tower_VT_16m", getTower_VT_16m());
        attributes.put("Tower_VT_32m", getTower_VT_32m());
        attributes.put("O_3", getO_3());
        attributes.put("NO", getNO());
        attributes.put("NO_x", getNO_x());
        attributes.put("SO_2", getSO_2());
        attributes.put("CO", getCO());
        attributes.put("Tower_WS_MAX_32m", getTower_WS_MAX_32m());
        attributes.put("Tower_WS_MAX_16m", getTower_WS_MAX_16m());
        attributes.put("Tower_WS_MAX_8m", getTower_WS_MAX_8m());
        attributes.put("Tower_WS_MAX_4m", getTower_WS_MAX_4m());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float t = (Float) attributes.get("t");

        if (t != null) {
            setT(t);
        }

        Float dp = (Float) attributes.get("dp");

        if (dp != null) {
            setDp(dp);
        }

        Float rh = (Float) attributes.get("rh");

        if (rh != null) {
            setRh(rh);
        }

        Float p = (Float) attributes.get("p");

        if (p != null) {
            setP(p);
        }

        Float ws = (Float) attributes.get("ws");

        if (ws != null) {
            setWs(ws);
        }

        Float wdir = (Float) attributes.get("wdir");

        if (wdir != null) {
            setWdir(wdir);
        }

        Float rmm = (Float) attributes.get("rmm");

        if (rmm != null) {
            setRmm(rmm);
        }

        Float p0 = (Float) attributes.get("p0");

        if (p0 != null) {
            setP0(p0);
        }

        Float glob = (Float) attributes.get("glob");

        if (glob != null) {
            setGlob(glob);
        }

        Float par = (Float) attributes.get("par");

        if (par != null) {
            setPar(par);
        }

        Float skyir = (Float) attributes.get("skyir");

        if (skyir != null) {
            setSkyir(skyir);
        }

        Float pwd_visibility_1 = (Float) attributes.get("pwd_visibility_1");

        if (pwd_visibility_1 != null) {
            setPwd_visibility_1(pwd_visibility_1);
        }

        Float pwd_visibility_10 = (Float) attributes.get("pwd_visibility_10");

        if (pwd_visibility_10 != null) {
            setPwd_visibility_10(pwd_visibility_10);
        }

        Float pwd_wmo_0 = (Float) attributes.get("pwd_wmo_0");

        if (pwd_wmo_0 != null) {
            setPwd_wmo_0(pwd_wmo_0);
        }

        Float pwd_wmo_15 = (Float) attributes.get("pwd_wmo_15");

        if (pwd_wmo_15 != null) {
            setPwd_wmo_15(pwd_wmo_15);
        }

        Float pwd_wmo_60 = (Float) attributes.get("pwd_wmo_60");

        if (pwd_wmo_60 != null) {
            setPwd_wmo_60(pwd_wmo_60);
        }

        Float pwd_intensity_w = (Float) attributes.get("pwd_intensity_w");

        if (pwd_intensity_w != null) {
            setPwd_intensity_w(pwd_intensity_w);
        }

        Float pwd_rmm = (Float) attributes.get("pwd_rmm");

        if (pwd_rmm != null) {
            setPwd_rmm(pwd_rmm);
        }

        Float pwd_smm = (Float) attributes.get("pwd_smm");

        if (pwd_smm != null) {
            setPwd_smm(pwd_smm);
        }

        String pwd_nws = (String) attributes.get("pwd_nws");

        if (pwd_nws != null) {
            setPwd_nws(pwd_nws);
        }

        Float Tower_T_4m = (Float) attributes.get("Tower_T_4m");

        if (Tower_T_4m != null) {
            setTower_T_4m(Tower_T_4m);
        }

        Float Tower_T_8m = (Float) attributes.get("Tower_T_8m");

        if (Tower_T_8m != null) {
            setTower_T_8m(Tower_T_8m);
        }

        Float Tower_T_16m = (Float) attributes.get("Tower_T_16m");

        if (Tower_T_16m != null) {
            setTower_T_16m(Tower_T_16m);
        }

        Float Tower_T_32m = (Float) attributes.get("Tower_T_32m");

        if (Tower_T_32m != null) {
            setTower_T_32m(Tower_T_32m);
        }

        Float Tower_WS_32m = (Float) attributes.get("Tower_WS_32m");

        if (Tower_WS_32m != null) {
            setTower_WS_32m(Tower_WS_32m);
        }

        Float Tower_WS_16m = (Float) attributes.get("Tower_WS_16m");

        if (Tower_WS_16m != null) {
            setTower_WS_16m(Tower_WS_16m);
        }

        Float Tower_WS_8m = (Float) attributes.get("Tower_WS_8m");

        if (Tower_WS_8m != null) {
            setTower_WS_8m(Tower_WS_8m);
        }

        Float Tower_WS_4m = (Float) attributes.get("Tower_WS_4m");

        if (Tower_WS_4m != null) {
            setTower_WS_4m(Tower_WS_4m);
        }

        Float Tower_WDIR_32m = (Float) attributes.get("Tower_WDIR_32m");

        if (Tower_WDIR_32m != null) {
            setTower_WDIR_32m(Tower_WDIR_32m);
        }

        Float Tower_WDIR_16m = (Float) attributes.get("Tower_WDIR_16m");

        if (Tower_WDIR_16m != null) {
            setTower_WDIR_16m(Tower_WDIR_16m);
        }

        Float Tower_WDIR_8m = (Float) attributes.get("Tower_WDIR_8m");

        if (Tower_WDIR_8m != null) {
            setTower_WDIR_8m(Tower_WDIR_8m);
        }

        Float Tower_WDIR_4m = (Float) attributes.get("Tower_WDIR_4m");

        if (Tower_WDIR_4m != null) {
            setTower_WDIR_4m(Tower_WDIR_4m);
        }

        Float Tower_PAR_32m = (Float) attributes.get("Tower_PAR_32m");

        if (Tower_PAR_32m != null) {
            setTower_PAR_32m(Tower_PAR_32m);
        }

        Float Tower_PAR_REFL_32m = (Float) attributes.get("Tower_PAR_REFL_32m");

        if (Tower_PAR_REFL_32m != null) {
            setTower_PAR_REFL_32m(Tower_PAR_REFL_32m);
        }

        Float Tower_GLOB_32m = (Float) attributes.get("Tower_GLOB_32m");

        if (Tower_GLOB_32m != null) {
            setTower_GLOB_32m(Tower_GLOB_32m);
        }

        Float Tower_GLOB_REFL_32m = (Float) attributes.get(
                "Tower_GLOB_REFL_32m");

        if (Tower_GLOB_REFL_32m != null) {
            setTower_GLOB_REFL_32m(Tower_GLOB_REFL_32m);
        }

        Float Tower_IR_32m = (Float) attributes.get("Tower_IR_32m");

        if (Tower_IR_32m != null) {
            setTower_IR_32m(Tower_IR_32m);
        }

        Float Tower_IR_REFL_32m = (Float) attributes.get("Tower_IR_REFL_32m");

        if (Tower_IR_REFL_32m != null) {
            setTower_IR_REFL_32m(Tower_IR_REFL_32m);
        }

        Float Tower_VT_4m = (Float) attributes.get("Tower_VT_4m");

        if (Tower_VT_4m != null) {
            setTower_VT_4m(Tower_VT_4m);
        }

        Float Tower_VT_8m = (Float) attributes.get("Tower_VT_8m");

        if (Tower_VT_8m != null) {
            setTower_VT_8m(Tower_VT_8m);
        }

        Float Tower_VT_16m = (Float) attributes.get("Tower_VT_16m");

        if (Tower_VT_16m != null) {
            setTower_VT_16m(Tower_VT_16m);
        }

        Float Tower_VT_32m = (Float) attributes.get("Tower_VT_32m");

        if (Tower_VT_32m != null) {
            setTower_VT_32m(Tower_VT_32m);
        }

        Float O_3 = (Float) attributes.get("O_3");

        if (O_3 != null) {
            setO_3(O_3);
        }

        Float NO = (Float) attributes.get("NO");

        if (NO != null) {
            setNO(NO);
        }

        Float NO_x = (Float) attributes.get("NO_x");

        if (NO_x != null) {
            setNO_x(NO_x);
        }

        Float SO_2 = (Float) attributes.get("SO_2");

        if (SO_2 != null) {
            setSO_2(SO_2);
        }

        Float CO = (Float) attributes.get("CO");

        if (CO != null) {
            setCO(CO);
        }

        Float Tower_WS_MAX_32m = (Float) attributes.get("Tower_WS_MAX_32m");

        if (Tower_WS_MAX_32m != null) {
            setTower_WS_MAX_32m(Tower_WS_MAX_32m);
        }

        Float Tower_WS_MAX_16m = (Float) attributes.get("Tower_WS_MAX_16m");

        if (Tower_WS_MAX_16m != null) {
            setTower_WS_MAX_16m(Tower_WS_MAX_16m);
        }

        Float Tower_WS_MAX_8m = (Float) attributes.get("Tower_WS_MAX_8m");

        if (Tower_WS_MAX_8m != null) {
            setTower_WS_MAX_8m(Tower_WS_MAX_8m);
        }

        Float Tower_WS_MAX_4m = (Float) attributes.get("Tower_WS_MAX_4m");

        if (Tower_WS_MAX_4m != null) {
            setTower_WS_MAX_4m(Tower_WS_MAX_4m);
        }
    }

    /**
    * Returns the primary key of this kumpulameta.
    *
    * @return the primary key of this kumpulameta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _kumpulameta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this kumpulameta.
    *
    * @param primaryKey the primary key of this kumpulameta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _kumpulameta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this kumpulameta.
    *
    * @return the samptime of this kumpulameta
    */
    @Override
    public java.util.Date getSamptime() {
        return _kumpulameta.getSamptime();
    }

    /**
    * Sets the samptime of this kumpulameta.
    *
    * @param samptime the samptime of this kumpulameta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _kumpulameta.setSamptime(samptime);
    }

    /**
    * Returns the t of this kumpulameta.
    *
    * @return the t of this kumpulameta
    */
    @Override
    public float getT() {
        return _kumpulameta.getT();
    }

    /**
    * Sets the t of this kumpulameta.
    *
    * @param t the t of this kumpulameta
    */
    @Override
    public void setT(float t) {
        _kumpulameta.setT(t);
    }

    /**
    * Returns the dp of this kumpulameta.
    *
    * @return the dp of this kumpulameta
    */
    @Override
    public float getDp() {
        return _kumpulameta.getDp();
    }

    /**
    * Sets the dp of this kumpulameta.
    *
    * @param dp the dp of this kumpulameta
    */
    @Override
    public void setDp(float dp) {
        _kumpulameta.setDp(dp);
    }

    /**
    * Returns the rh of this kumpulameta.
    *
    * @return the rh of this kumpulameta
    */
    @Override
    public float getRh() {
        return _kumpulameta.getRh();
    }

    /**
    * Sets the rh of this kumpulameta.
    *
    * @param rh the rh of this kumpulameta
    */
    @Override
    public void setRh(float rh) {
        _kumpulameta.setRh(rh);
    }

    /**
    * Returns the p of this kumpulameta.
    *
    * @return the p of this kumpulameta
    */
    @Override
    public float getP() {
        return _kumpulameta.getP();
    }

    /**
    * Sets the p of this kumpulameta.
    *
    * @param p the p of this kumpulameta
    */
    @Override
    public void setP(float p) {
        _kumpulameta.setP(p);
    }

    /**
    * Returns the ws of this kumpulameta.
    *
    * @return the ws of this kumpulameta
    */
    @Override
    public float getWs() {
        return _kumpulameta.getWs();
    }

    /**
    * Sets the ws of this kumpulameta.
    *
    * @param ws the ws of this kumpulameta
    */
    @Override
    public void setWs(float ws) {
        _kumpulameta.setWs(ws);
    }

    /**
    * Returns the wdir of this kumpulameta.
    *
    * @return the wdir of this kumpulameta
    */
    @Override
    public float getWdir() {
        return _kumpulameta.getWdir();
    }

    /**
    * Sets the wdir of this kumpulameta.
    *
    * @param wdir the wdir of this kumpulameta
    */
    @Override
    public void setWdir(float wdir) {
        _kumpulameta.setWdir(wdir);
    }

    /**
    * Returns the rmm of this kumpulameta.
    *
    * @return the rmm of this kumpulameta
    */
    @Override
    public float getRmm() {
        return _kumpulameta.getRmm();
    }

    /**
    * Sets the rmm of this kumpulameta.
    *
    * @param rmm the rmm of this kumpulameta
    */
    @Override
    public void setRmm(float rmm) {
        _kumpulameta.setRmm(rmm);
    }

    /**
    * Returns the p0 of this kumpulameta.
    *
    * @return the p0 of this kumpulameta
    */
    @Override
    public float getP0() {
        return _kumpulameta.getP0();
    }

    /**
    * Sets the p0 of this kumpulameta.
    *
    * @param p0 the p0 of this kumpulameta
    */
    @Override
    public void setP0(float p0) {
        _kumpulameta.setP0(p0);
    }

    /**
    * Returns the glob of this kumpulameta.
    *
    * @return the glob of this kumpulameta
    */
    @Override
    public float getGlob() {
        return _kumpulameta.getGlob();
    }

    /**
    * Sets the glob of this kumpulameta.
    *
    * @param glob the glob of this kumpulameta
    */
    @Override
    public void setGlob(float glob) {
        _kumpulameta.setGlob(glob);
    }

    /**
    * Returns the par of this kumpulameta.
    *
    * @return the par of this kumpulameta
    */
    @Override
    public float getPar() {
        return _kumpulameta.getPar();
    }

    /**
    * Sets the par of this kumpulameta.
    *
    * @param par the par of this kumpulameta
    */
    @Override
    public void setPar(float par) {
        _kumpulameta.setPar(par);
    }

    /**
    * Returns the skyir of this kumpulameta.
    *
    * @return the skyir of this kumpulameta
    */
    @Override
    public float getSkyir() {
        return _kumpulameta.getSkyir();
    }

    /**
    * Sets the skyir of this kumpulameta.
    *
    * @param skyir the skyir of this kumpulameta
    */
    @Override
    public void setSkyir(float skyir) {
        _kumpulameta.setSkyir(skyir);
    }

    /**
    * Returns the pwd_visibility_1 of this kumpulameta.
    *
    * @return the pwd_visibility_1 of this kumpulameta
    */
    @Override
    public float getPwd_visibility_1() {
        return _kumpulameta.getPwd_visibility_1();
    }

    /**
    * Sets the pwd_visibility_1 of this kumpulameta.
    *
    * @param pwd_visibility_1 the pwd_visibility_1 of this kumpulameta
    */
    @Override
    public void setPwd_visibility_1(float pwd_visibility_1) {
        _kumpulameta.setPwd_visibility_1(pwd_visibility_1);
    }

    /**
    * Returns the pwd_visibility_10 of this kumpulameta.
    *
    * @return the pwd_visibility_10 of this kumpulameta
    */
    @Override
    public float getPwd_visibility_10() {
        return _kumpulameta.getPwd_visibility_10();
    }

    /**
    * Sets the pwd_visibility_10 of this kumpulameta.
    *
    * @param pwd_visibility_10 the pwd_visibility_10 of this kumpulameta
    */
    @Override
    public void setPwd_visibility_10(float pwd_visibility_10) {
        _kumpulameta.setPwd_visibility_10(pwd_visibility_10);
    }

    /**
    * Returns the pwd_wmo_0 of this kumpulameta.
    *
    * @return the pwd_wmo_0 of this kumpulameta
    */
    @Override
    public float getPwd_wmo_0() {
        return _kumpulameta.getPwd_wmo_0();
    }

    /**
    * Sets the pwd_wmo_0 of this kumpulameta.
    *
    * @param pwd_wmo_0 the pwd_wmo_0 of this kumpulameta
    */
    @Override
    public void setPwd_wmo_0(float pwd_wmo_0) {
        _kumpulameta.setPwd_wmo_0(pwd_wmo_0);
    }

    /**
    * Returns the pwd_wmo_15 of this kumpulameta.
    *
    * @return the pwd_wmo_15 of this kumpulameta
    */
    @Override
    public float getPwd_wmo_15() {
        return _kumpulameta.getPwd_wmo_15();
    }

    /**
    * Sets the pwd_wmo_15 of this kumpulameta.
    *
    * @param pwd_wmo_15 the pwd_wmo_15 of this kumpulameta
    */
    @Override
    public void setPwd_wmo_15(float pwd_wmo_15) {
        _kumpulameta.setPwd_wmo_15(pwd_wmo_15);
    }

    /**
    * Returns the pwd_wmo_60 of this kumpulameta.
    *
    * @return the pwd_wmo_60 of this kumpulameta
    */
    @Override
    public float getPwd_wmo_60() {
        return _kumpulameta.getPwd_wmo_60();
    }

    /**
    * Sets the pwd_wmo_60 of this kumpulameta.
    *
    * @param pwd_wmo_60 the pwd_wmo_60 of this kumpulameta
    */
    @Override
    public void setPwd_wmo_60(float pwd_wmo_60) {
        _kumpulameta.setPwd_wmo_60(pwd_wmo_60);
    }

    /**
    * Returns the pwd_intensity_w of this kumpulameta.
    *
    * @return the pwd_intensity_w of this kumpulameta
    */
    @Override
    public float getPwd_intensity_w() {
        return _kumpulameta.getPwd_intensity_w();
    }

    /**
    * Sets the pwd_intensity_w of this kumpulameta.
    *
    * @param pwd_intensity_w the pwd_intensity_w of this kumpulameta
    */
    @Override
    public void setPwd_intensity_w(float pwd_intensity_w) {
        _kumpulameta.setPwd_intensity_w(pwd_intensity_w);
    }

    /**
    * Returns the pwd_rmm of this kumpulameta.
    *
    * @return the pwd_rmm of this kumpulameta
    */
    @Override
    public float getPwd_rmm() {
        return _kumpulameta.getPwd_rmm();
    }

    /**
    * Sets the pwd_rmm of this kumpulameta.
    *
    * @param pwd_rmm the pwd_rmm of this kumpulameta
    */
    @Override
    public void setPwd_rmm(float pwd_rmm) {
        _kumpulameta.setPwd_rmm(pwd_rmm);
    }

    /**
    * Returns the pwd_smm of this kumpulameta.
    *
    * @return the pwd_smm of this kumpulameta
    */
    @Override
    public float getPwd_smm() {
        return _kumpulameta.getPwd_smm();
    }

    /**
    * Sets the pwd_smm of this kumpulameta.
    *
    * @param pwd_smm the pwd_smm of this kumpulameta
    */
    @Override
    public void setPwd_smm(float pwd_smm) {
        _kumpulameta.setPwd_smm(pwd_smm);
    }

    /**
    * Returns the pwd_nws of this kumpulameta.
    *
    * @return the pwd_nws of this kumpulameta
    */
    @Override
    public java.lang.String getPwd_nws() {
        return _kumpulameta.getPwd_nws();
    }

    /**
    * Sets the pwd_nws of this kumpulameta.
    *
    * @param pwd_nws the pwd_nws of this kumpulameta
    */
    @Override
    public void setPwd_nws(java.lang.String pwd_nws) {
        _kumpulameta.setPwd_nws(pwd_nws);
    }

    /**
    * Returns the tower_ t_4m of this kumpulameta.
    *
    * @return the tower_ t_4m of this kumpulameta
    */
    @Override
    public float getTower_T_4m() {
        return _kumpulameta.getTower_T_4m();
    }

    /**
    * Sets the tower_ t_4m of this kumpulameta.
    *
    * @param Tower_T_4m the tower_ t_4m of this kumpulameta
    */
    @Override
    public void setTower_T_4m(float Tower_T_4m) {
        _kumpulameta.setTower_T_4m(Tower_T_4m);
    }

    /**
    * Returns the tower_ t_8m of this kumpulameta.
    *
    * @return the tower_ t_8m of this kumpulameta
    */
    @Override
    public float getTower_T_8m() {
        return _kumpulameta.getTower_T_8m();
    }

    /**
    * Sets the tower_ t_8m of this kumpulameta.
    *
    * @param Tower_T_8m the tower_ t_8m of this kumpulameta
    */
    @Override
    public void setTower_T_8m(float Tower_T_8m) {
        _kumpulameta.setTower_T_8m(Tower_T_8m);
    }

    /**
    * Returns the tower_ t_16m of this kumpulameta.
    *
    * @return the tower_ t_16m of this kumpulameta
    */
    @Override
    public float getTower_T_16m() {
        return _kumpulameta.getTower_T_16m();
    }

    /**
    * Sets the tower_ t_16m of this kumpulameta.
    *
    * @param Tower_T_16m the tower_ t_16m of this kumpulameta
    */
    @Override
    public void setTower_T_16m(float Tower_T_16m) {
        _kumpulameta.setTower_T_16m(Tower_T_16m);
    }

    /**
    * Returns the tower_ t_32m of this kumpulameta.
    *
    * @return the tower_ t_32m of this kumpulameta
    */
    @Override
    public float getTower_T_32m() {
        return _kumpulameta.getTower_T_32m();
    }

    /**
    * Sets the tower_ t_32m of this kumpulameta.
    *
    * @param Tower_T_32m the tower_ t_32m of this kumpulameta
    */
    @Override
    public void setTower_T_32m(float Tower_T_32m) {
        _kumpulameta.setTower_T_32m(Tower_T_32m);
    }

    /**
    * Returns the tower_ w s_32m of this kumpulameta.
    *
    * @return the tower_ w s_32m of this kumpulameta
    */
    @Override
    public float getTower_WS_32m() {
        return _kumpulameta.getTower_WS_32m();
    }

    /**
    * Sets the tower_ w s_32m of this kumpulameta.
    *
    * @param Tower_WS_32m the tower_ w s_32m of this kumpulameta
    */
    @Override
    public void setTower_WS_32m(float Tower_WS_32m) {
        _kumpulameta.setTower_WS_32m(Tower_WS_32m);
    }

    /**
    * Returns the tower_ w s_16m of this kumpulameta.
    *
    * @return the tower_ w s_16m of this kumpulameta
    */
    @Override
    public float getTower_WS_16m() {
        return _kumpulameta.getTower_WS_16m();
    }

    /**
    * Sets the tower_ w s_16m of this kumpulameta.
    *
    * @param Tower_WS_16m the tower_ w s_16m of this kumpulameta
    */
    @Override
    public void setTower_WS_16m(float Tower_WS_16m) {
        _kumpulameta.setTower_WS_16m(Tower_WS_16m);
    }

    /**
    * Returns the tower_ w s_8m of this kumpulameta.
    *
    * @return the tower_ w s_8m of this kumpulameta
    */
    @Override
    public float getTower_WS_8m() {
        return _kumpulameta.getTower_WS_8m();
    }

    /**
    * Sets the tower_ w s_8m of this kumpulameta.
    *
    * @param Tower_WS_8m the tower_ w s_8m of this kumpulameta
    */
    @Override
    public void setTower_WS_8m(float Tower_WS_8m) {
        _kumpulameta.setTower_WS_8m(Tower_WS_8m);
    }

    /**
    * Returns the tower_ w s_4m of this kumpulameta.
    *
    * @return the tower_ w s_4m of this kumpulameta
    */
    @Override
    public float getTower_WS_4m() {
        return _kumpulameta.getTower_WS_4m();
    }

    /**
    * Sets the tower_ w s_4m of this kumpulameta.
    *
    * @param Tower_WS_4m the tower_ w s_4m of this kumpulameta
    */
    @Override
    public void setTower_WS_4m(float Tower_WS_4m) {
        _kumpulameta.setTower_WS_4m(Tower_WS_4m);
    }

    /**
    * Returns the tower_ w d i r_32m of this kumpulameta.
    *
    * @return the tower_ w d i r_32m of this kumpulameta
    */
    @Override
    public float getTower_WDIR_32m() {
        return _kumpulameta.getTower_WDIR_32m();
    }

    /**
    * Sets the tower_ w d i r_32m of this kumpulameta.
    *
    * @param Tower_WDIR_32m the tower_ w d i r_32m of this kumpulameta
    */
    @Override
    public void setTower_WDIR_32m(float Tower_WDIR_32m) {
        _kumpulameta.setTower_WDIR_32m(Tower_WDIR_32m);
    }

    /**
    * Returns the tower_ w d i r_16m of this kumpulameta.
    *
    * @return the tower_ w d i r_16m of this kumpulameta
    */
    @Override
    public float getTower_WDIR_16m() {
        return _kumpulameta.getTower_WDIR_16m();
    }

    /**
    * Sets the tower_ w d i r_16m of this kumpulameta.
    *
    * @param Tower_WDIR_16m the tower_ w d i r_16m of this kumpulameta
    */
    @Override
    public void setTower_WDIR_16m(float Tower_WDIR_16m) {
        _kumpulameta.setTower_WDIR_16m(Tower_WDIR_16m);
    }

    /**
    * Returns the tower_ w d i r_8m of this kumpulameta.
    *
    * @return the tower_ w d i r_8m of this kumpulameta
    */
    @Override
    public float getTower_WDIR_8m() {
        return _kumpulameta.getTower_WDIR_8m();
    }

    /**
    * Sets the tower_ w d i r_8m of this kumpulameta.
    *
    * @param Tower_WDIR_8m the tower_ w d i r_8m of this kumpulameta
    */
    @Override
    public void setTower_WDIR_8m(float Tower_WDIR_8m) {
        _kumpulameta.setTower_WDIR_8m(Tower_WDIR_8m);
    }

    /**
    * Returns the tower_ w d i r_4m of this kumpulameta.
    *
    * @return the tower_ w d i r_4m of this kumpulameta
    */
    @Override
    public float getTower_WDIR_4m() {
        return _kumpulameta.getTower_WDIR_4m();
    }

    /**
    * Sets the tower_ w d i r_4m of this kumpulameta.
    *
    * @param Tower_WDIR_4m the tower_ w d i r_4m of this kumpulameta
    */
    @Override
    public void setTower_WDIR_4m(float Tower_WDIR_4m) {
        _kumpulameta.setTower_WDIR_4m(Tower_WDIR_4m);
    }

    /**
    * Returns the tower_ p a r_32m of this kumpulameta.
    *
    * @return the tower_ p a r_32m of this kumpulameta
    */
    @Override
    public float getTower_PAR_32m() {
        return _kumpulameta.getTower_PAR_32m();
    }

    /**
    * Sets the tower_ p a r_32m of this kumpulameta.
    *
    * @param Tower_PAR_32m the tower_ p a r_32m of this kumpulameta
    */
    @Override
    public void setTower_PAR_32m(float Tower_PAR_32m) {
        _kumpulameta.setTower_PAR_32m(Tower_PAR_32m);
    }

    /**
    * Returns the tower_ p a r_ r e f l_32m of this kumpulameta.
    *
    * @return the tower_ p a r_ r e f l_32m of this kumpulameta
    */
    @Override
    public float getTower_PAR_REFL_32m() {
        return _kumpulameta.getTower_PAR_REFL_32m();
    }

    /**
    * Sets the tower_ p a r_ r e f l_32m of this kumpulameta.
    *
    * @param Tower_PAR_REFL_32m the tower_ p a r_ r e f l_32m of this kumpulameta
    */
    @Override
    public void setTower_PAR_REFL_32m(float Tower_PAR_REFL_32m) {
        _kumpulameta.setTower_PAR_REFL_32m(Tower_PAR_REFL_32m);
    }

    /**
    * Returns the tower_ g l o b_32m of this kumpulameta.
    *
    * @return the tower_ g l o b_32m of this kumpulameta
    */
    @Override
    public float getTower_GLOB_32m() {
        return _kumpulameta.getTower_GLOB_32m();
    }

    /**
    * Sets the tower_ g l o b_32m of this kumpulameta.
    *
    * @param Tower_GLOB_32m the tower_ g l o b_32m of this kumpulameta
    */
    @Override
    public void setTower_GLOB_32m(float Tower_GLOB_32m) {
        _kumpulameta.setTower_GLOB_32m(Tower_GLOB_32m);
    }

    /**
    * Returns the tower_ g l o b_ r e f l_32m of this kumpulameta.
    *
    * @return the tower_ g l o b_ r e f l_32m of this kumpulameta
    */
    @Override
    public float getTower_GLOB_REFL_32m() {
        return _kumpulameta.getTower_GLOB_REFL_32m();
    }

    /**
    * Sets the tower_ g l o b_ r e f l_32m of this kumpulameta.
    *
    * @param Tower_GLOB_REFL_32m the tower_ g l o b_ r e f l_32m of this kumpulameta
    */
    @Override
    public void setTower_GLOB_REFL_32m(float Tower_GLOB_REFL_32m) {
        _kumpulameta.setTower_GLOB_REFL_32m(Tower_GLOB_REFL_32m);
    }

    /**
    * Returns the tower_ i r_32m of this kumpulameta.
    *
    * @return the tower_ i r_32m of this kumpulameta
    */
    @Override
    public float getTower_IR_32m() {
        return _kumpulameta.getTower_IR_32m();
    }

    /**
    * Sets the tower_ i r_32m of this kumpulameta.
    *
    * @param Tower_IR_32m the tower_ i r_32m of this kumpulameta
    */
    @Override
    public void setTower_IR_32m(float Tower_IR_32m) {
        _kumpulameta.setTower_IR_32m(Tower_IR_32m);
    }

    /**
    * Returns the tower_ i r_ r e f l_32m of this kumpulameta.
    *
    * @return the tower_ i r_ r e f l_32m of this kumpulameta
    */
    @Override
    public float getTower_IR_REFL_32m() {
        return _kumpulameta.getTower_IR_REFL_32m();
    }

    /**
    * Sets the tower_ i r_ r e f l_32m of this kumpulameta.
    *
    * @param Tower_IR_REFL_32m the tower_ i r_ r e f l_32m of this kumpulameta
    */
    @Override
    public void setTower_IR_REFL_32m(float Tower_IR_REFL_32m) {
        _kumpulameta.setTower_IR_REFL_32m(Tower_IR_REFL_32m);
    }

    /**
    * Returns the tower_ v t_4m of this kumpulameta.
    *
    * @return the tower_ v t_4m of this kumpulameta
    */
    @Override
    public float getTower_VT_4m() {
        return _kumpulameta.getTower_VT_4m();
    }

    /**
    * Sets the tower_ v t_4m of this kumpulameta.
    *
    * @param Tower_VT_4m the tower_ v t_4m of this kumpulameta
    */
    @Override
    public void setTower_VT_4m(float Tower_VT_4m) {
        _kumpulameta.setTower_VT_4m(Tower_VT_4m);
    }

    /**
    * Returns the tower_ v t_8m of this kumpulameta.
    *
    * @return the tower_ v t_8m of this kumpulameta
    */
    @Override
    public float getTower_VT_8m() {
        return _kumpulameta.getTower_VT_8m();
    }

    /**
    * Sets the tower_ v t_8m of this kumpulameta.
    *
    * @param Tower_VT_8m the tower_ v t_8m of this kumpulameta
    */
    @Override
    public void setTower_VT_8m(float Tower_VT_8m) {
        _kumpulameta.setTower_VT_8m(Tower_VT_8m);
    }

    /**
    * Returns the tower_ v t_16m of this kumpulameta.
    *
    * @return the tower_ v t_16m of this kumpulameta
    */
    @Override
    public float getTower_VT_16m() {
        return _kumpulameta.getTower_VT_16m();
    }

    /**
    * Sets the tower_ v t_16m of this kumpulameta.
    *
    * @param Tower_VT_16m the tower_ v t_16m of this kumpulameta
    */
    @Override
    public void setTower_VT_16m(float Tower_VT_16m) {
        _kumpulameta.setTower_VT_16m(Tower_VT_16m);
    }

    /**
    * Returns the tower_ v t_32m of this kumpulameta.
    *
    * @return the tower_ v t_32m of this kumpulameta
    */
    @Override
    public float getTower_VT_32m() {
        return _kumpulameta.getTower_VT_32m();
    }

    /**
    * Sets the tower_ v t_32m of this kumpulameta.
    *
    * @param Tower_VT_32m the tower_ v t_32m of this kumpulameta
    */
    @Override
    public void setTower_VT_32m(float Tower_VT_32m) {
        _kumpulameta.setTower_VT_32m(Tower_VT_32m);
    }

    /**
    * Returns the o_3 of this kumpulameta.
    *
    * @return the o_3 of this kumpulameta
    */
    @Override
    public float getO_3() {
        return _kumpulameta.getO_3();
    }

    /**
    * Sets the o_3 of this kumpulameta.
    *
    * @param O_3 the o_3 of this kumpulameta
    */
    @Override
    public void setO_3(float O_3) {
        _kumpulameta.setO_3(O_3);
    }

    /**
    * Returns the n o of this kumpulameta.
    *
    * @return the n o of this kumpulameta
    */
    @Override
    public float getNO() {
        return _kumpulameta.getNO();
    }

    /**
    * Sets the n o of this kumpulameta.
    *
    * @param NO the n o of this kumpulameta
    */
    @Override
    public void setNO(float NO) {
        _kumpulameta.setNO(NO);
    }

    /**
    * Returns the n o_x of this kumpulameta.
    *
    * @return the n o_x of this kumpulameta
    */
    @Override
    public float getNO_x() {
        return _kumpulameta.getNO_x();
    }

    /**
    * Sets the n o_x of this kumpulameta.
    *
    * @param NO_x the n o_x of this kumpulameta
    */
    @Override
    public void setNO_x(float NO_x) {
        _kumpulameta.setNO_x(NO_x);
    }

    /**
    * Returns the s o_2 of this kumpulameta.
    *
    * @return the s o_2 of this kumpulameta
    */
    @Override
    public float getSO_2() {
        return _kumpulameta.getSO_2();
    }

    /**
    * Sets the s o_2 of this kumpulameta.
    *
    * @param SO_2 the s o_2 of this kumpulameta
    */
    @Override
    public void setSO_2(float SO_2) {
        _kumpulameta.setSO_2(SO_2);
    }

    /**
    * Returns the c o of this kumpulameta.
    *
    * @return the c o of this kumpulameta
    */
    @Override
    public float getCO() {
        return _kumpulameta.getCO();
    }

    /**
    * Sets the c o of this kumpulameta.
    *
    * @param CO the c o of this kumpulameta
    */
    @Override
    public void setCO(float CO) {
        _kumpulameta.setCO(CO);
    }

    /**
    * Returns the tower_ w s_ m a x_32m of this kumpulameta.
    *
    * @return the tower_ w s_ m a x_32m of this kumpulameta
    */
    @Override
    public float getTower_WS_MAX_32m() {
        return _kumpulameta.getTower_WS_MAX_32m();
    }

    /**
    * Sets the tower_ w s_ m a x_32m of this kumpulameta.
    *
    * @param Tower_WS_MAX_32m the tower_ w s_ m a x_32m of this kumpulameta
    */
    @Override
    public void setTower_WS_MAX_32m(float Tower_WS_MAX_32m) {
        _kumpulameta.setTower_WS_MAX_32m(Tower_WS_MAX_32m);
    }

    /**
    * Returns the tower_ w s_ m a x_16m of this kumpulameta.
    *
    * @return the tower_ w s_ m a x_16m of this kumpulameta
    */
    @Override
    public float getTower_WS_MAX_16m() {
        return _kumpulameta.getTower_WS_MAX_16m();
    }

    /**
    * Sets the tower_ w s_ m a x_16m of this kumpulameta.
    *
    * @param Tower_WS_MAX_16m the tower_ w s_ m a x_16m of this kumpulameta
    */
    @Override
    public void setTower_WS_MAX_16m(float Tower_WS_MAX_16m) {
        _kumpulameta.setTower_WS_MAX_16m(Tower_WS_MAX_16m);
    }

    /**
    * Returns the tower_ w s_ m a x_8m of this kumpulameta.
    *
    * @return the tower_ w s_ m a x_8m of this kumpulameta
    */
    @Override
    public float getTower_WS_MAX_8m() {
        return _kumpulameta.getTower_WS_MAX_8m();
    }

    /**
    * Sets the tower_ w s_ m a x_8m of this kumpulameta.
    *
    * @param Tower_WS_MAX_8m the tower_ w s_ m a x_8m of this kumpulameta
    */
    @Override
    public void setTower_WS_MAX_8m(float Tower_WS_MAX_8m) {
        _kumpulameta.setTower_WS_MAX_8m(Tower_WS_MAX_8m);
    }

    /**
    * Returns the tower_ w s_ m a x_4m of this kumpulameta.
    *
    * @return the tower_ w s_ m a x_4m of this kumpulameta
    */
    @Override
    public float getTower_WS_MAX_4m() {
        return _kumpulameta.getTower_WS_MAX_4m();
    }

    /**
    * Sets the tower_ w s_ m a x_4m of this kumpulameta.
    *
    * @param Tower_WS_MAX_4m the tower_ w s_ m a x_4m of this kumpulameta
    */
    @Override
    public void setTower_WS_MAX_4m(float Tower_WS_MAX_4m) {
        _kumpulameta.setTower_WS_MAX_4m(Tower_WS_MAX_4m);
    }

    @Override
    public boolean isNew() {
        return _kumpulameta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _kumpulameta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _kumpulameta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _kumpulameta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _kumpulameta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _kumpulameta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _kumpulameta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _kumpulameta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _kumpulameta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _kumpulameta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _kumpulameta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new KumpulametaWrapper((Kumpulameta) _kumpulameta.clone());
    }

    @Override
    public int compareTo(Kumpulameta kumpulameta) {
        return _kumpulameta.compareTo(kumpulameta);
    }

    @Override
    public int hashCode() {
        return _kumpulameta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Kumpulameta> toCacheModel() {
        return _kumpulameta.toCacheModel();
    }

    @Override
    public Kumpulameta toEscapedModel() {
        return new KumpulametaWrapper(_kumpulameta.toEscapedModel());
    }

    @Override
    public Kumpulameta toUnescapedModel() {
        return new KumpulametaWrapper(_kumpulameta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _kumpulameta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _kumpulameta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _kumpulameta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof KumpulametaWrapper)) {
            return false;
        }

        KumpulametaWrapper kumpulametaWrapper = (KumpulametaWrapper) obj;

        if (Validator.equals(_kumpulameta, kumpulametaWrapper._kumpulameta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Kumpulameta getWrappedKumpulameta() {
        return _kumpulameta;
    }

    @Override
    public Kumpulameta getWrappedModel() {
        return _kumpulameta;
    }

    @Override
    public void resetOriginalValues() {
        _kumpulameta.resetOriginalValues();
    }
}
