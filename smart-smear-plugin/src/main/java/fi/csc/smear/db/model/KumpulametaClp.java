package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.KumpulametaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class KumpulametaClp extends BaseModelImpl<Kumpulameta>
    implements Kumpulameta {
    private Date _samptime;
    private float _t;
    private float _dp;
    private float _rh;
    private float _p;
    private float _ws;
    private float _wdir;
    private float _rmm;
    private float _p0;
    private float _glob;
    private float _par;
    private float _skyir;
    private float _pwd_visibility_1;
    private float _pwd_visibility_10;
    private float _pwd_wmo_0;
    private float _pwd_wmo_15;
    private float _pwd_wmo_60;
    private float _pwd_intensity_w;
    private float _pwd_rmm;
    private float _pwd_smm;
    private String _pwd_nws;
    private float _Tower_T_4m;
    private float _Tower_T_8m;
    private float _Tower_T_16m;
    private float _Tower_T_32m;
    private float _Tower_WS_32m;
    private float _Tower_WS_16m;
    private float _Tower_WS_8m;
    private float _Tower_WS_4m;
    private float _Tower_WDIR_32m;
    private float _Tower_WDIR_16m;
    private float _Tower_WDIR_8m;
    private float _Tower_WDIR_4m;
    private float _Tower_PAR_32m;
    private float _Tower_PAR_REFL_32m;
    private float _Tower_GLOB_32m;
    private float _Tower_GLOB_REFL_32m;
    private float _Tower_IR_32m;
    private float _Tower_IR_REFL_32m;
    private float _Tower_VT_4m;
    private float _Tower_VT_8m;
    private float _Tower_VT_16m;
    private float _Tower_VT_32m;
    private float _O_3;
    private float _NO;
    private float _NO_x;
    private float _SO_2;
    private float _CO;
    private float _Tower_WS_MAX_32m;
    private float _Tower_WS_MAX_16m;
    private float _Tower_WS_MAX_8m;
    private float _Tower_WS_MAX_4m;
    private BaseModel<?> _kumpulametaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public KumpulametaClp() {
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

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_kumpulametaRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT() {
        return _t;
    }

    @Override
    public void setT(float t) {
        _t = t;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setT", float.class);

                method.invoke(_kumpulametaRemoteModel, t);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDp() {
        return _dp;
    }

    @Override
    public void setDp(float dp) {
        _dp = dp;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setDp", float.class);

                method.invoke(_kumpulametaRemoteModel, dp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRh() {
        return _rh;
    }

    @Override
    public void setRh(float rh) {
        _rh = rh;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setRh", float.class);

                method.invoke(_kumpulametaRemoteModel, rh);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP() {
        return _p;
    }

    @Override
    public void setP(float p) {
        _p = p;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setP", float.class);

                method.invoke(_kumpulametaRemoteModel, p);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWs() {
        return _ws;
    }

    @Override
    public void setWs(float ws) {
        _ws = ws;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setWs", float.class);

                method.invoke(_kumpulametaRemoteModel, ws);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWdir() {
        return _wdir;
    }

    @Override
    public void setWdir(float wdir) {
        _wdir = wdir;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setWdir", float.class);

                method.invoke(_kumpulametaRemoteModel, wdir);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRmm() {
        return _rmm;
    }

    @Override
    public void setRmm(float rmm) {
        _rmm = rmm;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setRmm", float.class);

                method.invoke(_kumpulametaRemoteModel, rmm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP0() {
        return _p0;
    }

    @Override
    public void setP0(float p0) {
        _p0 = p0;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setP0", float.class);

                method.invoke(_kumpulametaRemoteModel, p0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getGlob() {
        return _glob;
    }

    @Override
    public void setGlob(float glob) {
        _glob = glob;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlob", float.class);

                method.invoke(_kumpulametaRemoteModel, glob);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPar() {
        return _par;
    }

    @Override
    public void setPar(float par) {
        _par = par;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPar", float.class);

                method.invoke(_kumpulametaRemoteModel, par);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSkyir() {
        return _skyir;
    }

    @Override
    public void setSkyir(float skyir) {
        _skyir = skyir;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setSkyir", float.class);

                method.invoke(_kumpulametaRemoteModel, skyir);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_visibility_1() {
        return _pwd_visibility_1;
    }

    @Override
    public void setPwd_visibility_1(float pwd_visibility_1) {
        _pwd_visibility_1 = pwd_visibility_1;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_visibility_1",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_visibility_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_visibility_10() {
        return _pwd_visibility_10;
    }

    @Override
    public void setPwd_visibility_10(float pwd_visibility_10) {
        _pwd_visibility_10 = pwd_visibility_10;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_visibility_10",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_visibility_10);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_wmo_0() {
        return _pwd_wmo_0;
    }

    @Override
    public void setPwd_wmo_0(float pwd_wmo_0) {
        _pwd_wmo_0 = pwd_wmo_0;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_wmo_0", float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_wmo_0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_wmo_15() {
        return _pwd_wmo_15;
    }

    @Override
    public void setPwd_wmo_15(float pwd_wmo_15) {
        _pwd_wmo_15 = pwd_wmo_15;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_wmo_15", float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_wmo_15);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_wmo_60() {
        return _pwd_wmo_60;
    }

    @Override
    public void setPwd_wmo_60(float pwd_wmo_60) {
        _pwd_wmo_60 = pwd_wmo_60;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_wmo_60", float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_wmo_60);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_intensity_w() {
        return _pwd_intensity_w;
    }

    @Override
    public void setPwd_intensity_w(float pwd_intensity_w) {
        _pwd_intensity_w = pwd_intensity_w;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_intensity_w",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_intensity_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_rmm() {
        return _pwd_rmm;
    }

    @Override
    public void setPwd_rmm(float pwd_rmm) {
        _pwd_rmm = pwd_rmm;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_rmm", float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_rmm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPwd_smm() {
        return _pwd_smm;
    }

    @Override
    public void setPwd_smm(float pwd_smm) {
        _pwd_smm = pwd_smm;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_smm", float.class);

                method.invoke(_kumpulametaRemoteModel, pwd_smm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPwd_nws() {
        return _pwd_nws;
    }

    @Override
    public void setPwd_nws(String pwd_nws) {
        _pwd_nws = pwd_nws;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setPwd_nws", String.class);

                method.invoke(_kumpulametaRemoteModel, pwd_nws);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_T_4m() {
        return _Tower_T_4m;
    }

    @Override
    public void setTower_T_4m(float Tower_T_4m) {
        _Tower_T_4m = Tower_T_4m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_T_4m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_T_4m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_T_8m() {
        return _Tower_T_8m;
    }

    @Override
    public void setTower_T_8m(float Tower_T_8m) {
        _Tower_T_8m = Tower_T_8m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_T_8m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_T_8m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_T_16m() {
        return _Tower_T_16m;
    }

    @Override
    public void setTower_T_16m(float Tower_T_16m) {
        _Tower_T_16m = Tower_T_16m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_T_16m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_T_16m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_T_32m() {
        return _Tower_T_32m;
    }

    @Override
    public void setTower_T_32m(float Tower_T_32m) {
        _Tower_T_32m = Tower_T_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_T_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_T_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_32m() {
        return _Tower_WS_32m;
    }

    @Override
    public void setTower_WS_32m(float Tower_WS_32m) {
        _Tower_WS_32m = Tower_WS_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_16m() {
        return _Tower_WS_16m;
    }

    @Override
    public void setTower_WS_16m(float Tower_WS_16m) {
        _Tower_WS_16m = Tower_WS_16m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_16m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_16m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_8m() {
        return _Tower_WS_8m;
    }

    @Override
    public void setTower_WS_8m(float Tower_WS_8m) {
        _Tower_WS_8m = Tower_WS_8m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_8m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_8m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_4m() {
        return _Tower_WS_4m;
    }

    @Override
    public void setTower_WS_4m(float Tower_WS_4m) {
        _Tower_WS_4m = Tower_WS_4m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_4m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_4m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WDIR_32m() {
        return _Tower_WDIR_32m;
    }

    @Override
    public void setTower_WDIR_32m(float Tower_WDIR_32m) {
        _Tower_WDIR_32m = Tower_WDIR_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WDIR_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WDIR_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WDIR_16m() {
        return _Tower_WDIR_16m;
    }

    @Override
    public void setTower_WDIR_16m(float Tower_WDIR_16m) {
        _Tower_WDIR_16m = Tower_WDIR_16m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WDIR_16m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WDIR_16m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WDIR_8m() {
        return _Tower_WDIR_8m;
    }

    @Override
    public void setTower_WDIR_8m(float Tower_WDIR_8m) {
        _Tower_WDIR_8m = Tower_WDIR_8m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WDIR_8m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WDIR_8m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WDIR_4m() {
        return _Tower_WDIR_4m;
    }

    @Override
    public void setTower_WDIR_4m(float Tower_WDIR_4m) {
        _Tower_WDIR_4m = Tower_WDIR_4m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WDIR_4m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WDIR_4m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_PAR_32m() {
        return _Tower_PAR_32m;
    }

    @Override
    public void setTower_PAR_32m(float Tower_PAR_32m) {
        _Tower_PAR_32m = Tower_PAR_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_PAR_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_PAR_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_PAR_REFL_32m() {
        return _Tower_PAR_REFL_32m;
    }

    @Override
    public void setTower_PAR_REFL_32m(float Tower_PAR_REFL_32m) {
        _Tower_PAR_REFL_32m = Tower_PAR_REFL_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_PAR_REFL_32m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_PAR_REFL_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_GLOB_32m() {
        return _Tower_GLOB_32m;
    }

    @Override
    public void setTower_GLOB_32m(float Tower_GLOB_32m) {
        _Tower_GLOB_32m = Tower_GLOB_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_GLOB_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_GLOB_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_GLOB_REFL_32m() {
        return _Tower_GLOB_REFL_32m;
    }

    @Override
    public void setTower_GLOB_REFL_32m(float Tower_GLOB_REFL_32m) {
        _Tower_GLOB_REFL_32m = Tower_GLOB_REFL_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_GLOB_REFL_32m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_GLOB_REFL_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_IR_32m() {
        return _Tower_IR_32m;
    }

    @Override
    public void setTower_IR_32m(float Tower_IR_32m) {
        _Tower_IR_32m = Tower_IR_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_IR_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_IR_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_IR_REFL_32m() {
        return _Tower_IR_REFL_32m;
    }

    @Override
    public void setTower_IR_REFL_32m(float Tower_IR_REFL_32m) {
        _Tower_IR_REFL_32m = Tower_IR_REFL_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_IR_REFL_32m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_IR_REFL_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_VT_4m() {
        return _Tower_VT_4m;
    }

    @Override
    public void setTower_VT_4m(float Tower_VT_4m) {
        _Tower_VT_4m = Tower_VT_4m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_VT_4m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_VT_4m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_VT_8m() {
        return _Tower_VT_8m;
    }

    @Override
    public void setTower_VT_8m(float Tower_VT_8m) {
        _Tower_VT_8m = Tower_VT_8m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_VT_8m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_VT_8m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_VT_16m() {
        return _Tower_VT_16m;
    }

    @Override
    public void setTower_VT_16m(float Tower_VT_16m) {
        _Tower_VT_16m = Tower_VT_16m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_VT_16m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_VT_16m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_VT_32m() {
        return _Tower_VT_32m;
    }

    @Override
    public void setTower_VT_32m(float Tower_VT_32m) {
        _Tower_VT_32m = Tower_VT_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_VT_32m", float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_VT_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO_3() {
        return _O_3;
    }

    @Override
    public void setO_3(float O_3) {
        _O_3 = O_3;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setO_3", float.class);

                method.invoke(_kumpulametaRemoteModel, O_3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO() {
        return _NO;
    }

    @Override
    public void setNO(float NO) {
        _NO = NO;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO", float.class);

                method.invoke(_kumpulametaRemoteModel, NO);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO_x() {
        return _NO_x;
    }

    @Override
    public void setNO_x(float NO_x) {
        _NO_x = NO_x;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO_x", float.class);

                method.invoke(_kumpulametaRemoteModel, NO_x);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO_2() {
        return _SO_2;
    }

    @Override
    public void setSO_2(float SO_2) {
        _SO_2 = SO_2;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO_2", float.class);

                method.invoke(_kumpulametaRemoteModel, SO_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO() {
        return _CO;
    }

    @Override
    public void setCO(float CO) {
        _CO = CO;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO", float.class);

                method.invoke(_kumpulametaRemoteModel, CO);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_MAX_32m() {
        return _Tower_WS_MAX_32m;
    }

    @Override
    public void setTower_WS_MAX_32m(float Tower_WS_MAX_32m) {
        _Tower_WS_MAX_32m = Tower_WS_MAX_32m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_MAX_32m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_MAX_32m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_MAX_16m() {
        return _Tower_WS_MAX_16m;
    }

    @Override
    public void setTower_WS_MAX_16m(float Tower_WS_MAX_16m) {
        _Tower_WS_MAX_16m = Tower_WS_MAX_16m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_MAX_16m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_MAX_16m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_MAX_8m() {
        return _Tower_WS_MAX_8m;
    }

    @Override
    public void setTower_WS_MAX_8m(float Tower_WS_MAX_8m) {
        _Tower_WS_MAX_8m = Tower_WS_MAX_8m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_MAX_8m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_MAX_8m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTower_WS_MAX_4m() {
        return _Tower_WS_MAX_4m;
    }

    @Override
    public void setTower_WS_MAX_4m(float Tower_WS_MAX_4m) {
        _Tower_WS_MAX_4m = Tower_WS_MAX_4m;

        if (_kumpulametaRemoteModel != null) {
            try {
                Class<?> clazz = _kumpulametaRemoteModel.getClass();

                Method method = clazz.getMethod("setTower_WS_MAX_4m",
                        float.class);

                method.invoke(_kumpulametaRemoteModel, Tower_WS_MAX_4m);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getKumpulametaRemoteModel() {
        return _kumpulametaRemoteModel;
    }

    public void setKumpulametaRemoteModel(BaseModel<?> kumpulametaRemoteModel) {
        _kumpulametaRemoteModel = kumpulametaRemoteModel;
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

        Class<?> remoteModelClass = _kumpulametaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_kumpulametaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            KumpulametaLocalServiceUtil.addKumpulameta(this);
        } else {
            KumpulametaLocalServiceUtil.updateKumpulameta(this);
        }
    }

    @Override
    public Kumpulameta toEscapedModel() {
        return (Kumpulameta) ProxyUtil.newProxyInstance(Kumpulameta.class.getClassLoader(),
            new Class[] { Kumpulameta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        KumpulametaClp clone = new KumpulametaClp();

        clone.setSamptime(getSamptime());
        clone.setT(getT());
        clone.setDp(getDp());
        clone.setRh(getRh());
        clone.setP(getP());
        clone.setWs(getWs());
        clone.setWdir(getWdir());
        clone.setRmm(getRmm());
        clone.setP0(getP0());
        clone.setGlob(getGlob());
        clone.setPar(getPar());
        clone.setSkyir(getSkyir());
        clone.setPwd_visibility_1(getPwd_visibility_1());
        clone.setPwd_visibility_10(getPwd_visibility_10());
        clone.setPwd_wmo_0(getPwd_wmo_0());
        clone.setPwd_wmo_15(getPwd_wmo_15());
        clone.setPwd_wmo_60(getPwd_wmo_60());
        clone.setPwd_intensity_w(getPwd_intensity_w());
        clone.setPwd_rmm(getPwd_rmm());
        clone.setPwd_smm(getPwd_smm());
        clone.setPwd_nws(getPwd_nws());
        clone.setTower_T_4m(getTower_T_4m());
        clone.setTower_T_8m(getTower_T_8m());
        clone.setTower_T_16m(getTower_T_16m());
        clone.setTower_T_32m(getTower_T_32m());
        clone.setTower_WS_32m(getTower_WS_32m());
        clone.setTower_WS_16m(getTower_WS_16m());
        clone.setTower_WS_8m(getTower_WS_8m());
        clone.setTower_WS_4m(getTower_WS_4m());
        clone.setTower_WDIR_32m(getTower_WDIR_32m());
        clone.setTower_WDIR_16m(getTower_WDIR_16m());
        clone.setTower_WDIR_8m(getTower_WDIR_8m());
        clone.setTower_WDIR_4m(getTower_WDIR_4m());
        clone.setTower_PAR_32m(getTower_PAR_32m());
        clone.setTower_PAR_REFL_32m(getTower_PAR_REFL_32m());
        clone.setTower_GLOB_32m(getTower_GLOB_32m());
        clone.setTower_GLOB_REFL_32m(getTower_GLOB_REFL_32m());
        clone.setTower_IR_32m(getTower_IR_32m());
        clone.setTower_IR_REFL_32m(getTower_IR_REFL_32m());
        clone.setTower_VT_4m(getTower_VT_4m());
        clone.setTower_VT_8m(getTower_VT_8m());
        clone.setTower_VT_16m(getTower_VT_16m());
        clone.setTower_VT_32m(getTower_VT_32m());
        clone.setO_3(getO_3());
        clone.setNO(getNO());
        clone.setNO_x(getNO_x());
        clone.setSO_2(getSO_2());
        clone.setCO(getCO());
        clone.setTower_WS_MAX_32m(getTower_WS_MAX_32m());
        clone.setTower_WS_MAX_16m(getTower_WS_MAX_16m());
        clone.setTower_WS_MAX_8m(getTower_WS_MAX_8m());
        clone.setTower_WS_MAX_4m(getTower_WS_MAX_4m());

        return clone;
    }

    @Override
    public int compareTo(Kumpulameta kumpulameta) {
        java.util.Date primaryKey = kumpulameta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof KumpulametaClp)) {
            return false;
        }

        KumpulametaClp kumpulameta = (KumpulametaClp) obj;

        java.util.Date primaryKey = kumpulameta.getPrimaryKey();

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
        StringBundler sb = new StringBundler(105);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", t=");
        sb.append(getT());
        sb.append(", dp=");
        sb.append(getDp());
        sb.append(", rh=");
        sb.append(getRh());
        sb.append(", p=");
        sb.append(getP());
        sb.append(", ws=");
        sb.append(getWs());
        sb.append(", wdir=");
        sb.append(getWdir());
        sb.append(", rmm=");
        sb.append(getRmm());
        sb.append(", p0=");
        sb.append(getP0());
        sb.append(", glob=");
        sb.append(getGlob());
        sb.append(", par=");
        sb.append(getPar());
        sb.append(", skyir=");
        sb.append(getSkyir());
        sb.append(", pwd_visibility_1=");
        sb.append(getPwd_visibility_1());
        sb.append(", pwd_visibility_10=");
        sb.append(getPwd_visibility_10());
        sb.append(", pwd_wmo_0=");
        sb.append(getPwd_wmo_0());
        sb.append(", pwd_wmo_15=");
        sb.append(getPwd_wmo_15());
        sb.append(", pwd_wmo_60=");
        sb.append(getPwd_wmo_60());
        sb.append(", pwd_intensity_w=");
        sb.append(getPwd_intensity_w());
        sb.append(", pwd_rmm=");
        sb.append(getPwd_rmm());
        sb.append(", pwd_smm=");
        sb.append(getPwd_smm());
        sb.append(", pwd_nws=");
        sb.append(getPwd_nws());
        sb.append(", Tower_T_4m=");
        sb.append(getTower_T_4m());
        sb.append(", Tower_T_8m=");
        sb.append(getTower_T_8m());
        sb.append(", Tower_T_16m=");
        sb.append(getTower_T_16m());
        sb.append(", Tower_T_32m=");
        sb.append(getTower_T_32m());
        sb.append(", Tower_WS_32m=");
        sb.append(getTower_WS_32m());
        sb.append(", Tower_WS_16m=");
        sb.append(getTower_WS_16m());
        sb.append(", Tower_WS_8m=");
        sb.append(getTower_WS_8m());
        sb.append(", Tower_WS_4m=");
        sb.append(getTower_WS_4m());
        sb.append(", Tower_WDIR_32m=");
        sb.append(getTower_WDIR_32m());
        sb.append(", Tower_WDIR_16m=");
        sb.append(getTower_WDIR_16m());
        sb.append(", Tower_WDIR_8m=");
        sb.append(getTower_WDIR_8m());
        sb.append(", Tower_WDIR_4m=");
        sb.append(getTower_WDIR_4m());
        sb.append(", Tower_PAR_32m=");
        sb.append(getTower_PAR_32m());
        sb.append(", Tower_PAR_REFL_32m=");
        sb.append(getTower_PAR_REFL_32m());
        sb.append(", Tower_GLOB_32m=");
        sb.append(getTower_GLOB_32m());
        sb.append(", Tower_GLOB_REFL_32m=");
        sb.append(getTower_GLOB_REFL_32m());
        sb.append(", Tower_IR_32m=");
        sb.append(getTower_IR_32m());
        sb.append(", Tower_IR_REFL_32m=");
        sb.append(getTower_IR_REFL_32m());
        sb.append(", Tower_VT_4m=");
        sb.append(getTower_VT_4m());
        sb.append(", Tower_VT_8m=");
        sb.append(getTower_VT_8m());
        sb.append(", Tower_VT_16m=");
        sb.append(getTower_VT_16m());
        sb.append(", Tower_VT_32m=");
        sb.append(getTower_VT_32m());
        sb.append(", O_3=");
        sb.append(getO_3());
        sb.append(", NO=");
        sb.append(getNO());
        sb.append(", NO_x=");
        sb.append(getNO_x());
        sb.append(", SO_2=");
        sb.append(getSO_2());
        sb.append(", CO=");
        sb.append(getCO());
        sb.append(", Tower_WS_MAX_32m=");
        sb.append(getTower_WS_MAX_32m());
        sb.append(", Tower_WS_MAX_16m=");
        sb.append(getTower_WS_MAX_16m());
        sb.append(", Tower_WS_MAX_8m=");
        sb.append(getTower_WS_MAX_8m());
        sb.append(", Tower_WS_MAX_4m=");
        sb.append(getTower_WS_MAX_4m());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(160);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Kumpulameta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>t</column-name><column-value><![CDATA[");
        sb.append(getT());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dp</column-name><column-value><![CDATA[");
        sb.append(getDp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rh</column-name><column-value><![CDATA[");
        sb.append(getRh());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>p</column-name><column-value><![CDATA[");
        sb.append(getP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ws</column-name><column-value><![CDATA[");
        sb.append(getWs());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wdir</column-name><column-value><![CDATA[");
        sb.append(getWdir());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rmm</column-name><column-value><![CDATA[");
        sb.append(getRmm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>p0</column-name><column-value><![CDATA[");
        sb.append(getP0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>glob</column-name><column-value><![CDATA[");
        sb.append(getGlob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>par</column-name><column-value><![CDATA[");
        sb.append(getPar());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>skyir</column-name><column-value><![CDATA[");
        sb.append(getSkyir());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_visibility_1</column-name><column-value><![CDATA[");
        sb.append(getPwd_visibility_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_visibility_10</column-name><column-value><![CDATA[");
        sb.append(getPwd_visibility_10());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_wmo_0</column-name><column-value><![CDATA[");
        sb.append(getPwd_wmo_0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_wmo_15</column-name><column-value><![CDATA[");
        sb.append(getPwd_wmo_15());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_wmo_60</column-name><column-value><![CDATA[");
        sb.append(getPwd_wmo_60());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_intensity_w</column-name><column-value><![CDATA[");
        sb.append(getPwd_intensity_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_rmm</column-name><column-value><![CDATA[");
        sb.append(getPwd_rmm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_smm</column-name><column-value><![CDATA[");
        sb.append(getPwd_smm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pwd_nws</column-name><column-value><![CDATA[");
        sb.append(getPwd_nws());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_T_4m</column-name><column-value><![CDATA[");
        sb.append(getTower_T_4m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_T_8m</column-name><column-value><![CDATA[");
        sb.append(getTower_T_8m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_T_16m</column-name><column-value><![CDATA[");
        sb.append(getTower_T_16m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_T_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_T_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_16m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_16m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_8m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_8m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_4m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_4m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WDIR_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_WDIR_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WDIR_16m</column-name><column-value><![CDATA[");
        sb.append(getTower_WDIR_16m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WDIR_8m</column-name><column-value><![CDATA[");
        sb.append(getTower_WDIR_8m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WDIR_4m</column-name><column-value><![CDATA[");
        sb.append(getTower_WDIR_4m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_PAR_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_PAR_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_PAR_REFL_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_PAR_REFL_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_GLOB_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_GLOB_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_GLOB_REFL_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_GLOB_REFL_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_IR_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_IR_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_IR_REFL_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_IR_REFL_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_VT_4m</column-name><column-value><![CDATA[");
        sb.append(getTower_VT_4m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_VT_8m</column-name><column-value><![CDATA[");
        sb.append(getTower_VT_8m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_VT_16m</column-name><column-value><![CDATA[");
        sb.append(getTower_VT_16m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_VT_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_VT_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O_3</column-name><column-value><![CDATA[");
        sb.append(getO_3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO</column-name><column-value><![CDATA[");
        sb.append(getNO());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO_x</column-name><column-value><![CDATA[");
        sb.append(getNO_x());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO_2</column-name><column-value><![CDATA[");
        sb.append(getSO_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO</column-name><column-value><![CDATA[");
        sb.append(getCO());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_MAX_32m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_MAX_32m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_MAX_16m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_MAX_16m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_MAX_8m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_MAX_8m());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tower_WS_MAX_4m</column-name><column-value><![CDATA[");
        sb.append(getTower_WS_MAX_4m());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
