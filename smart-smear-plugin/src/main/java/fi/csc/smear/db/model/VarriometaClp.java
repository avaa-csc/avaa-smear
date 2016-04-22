package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.VarriometaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class VarriometaClp extends BaseModelImpl<Varriometa>
    implements Varriometa {
    private Date _SAMPTIME;
    private float _WS0;
    private float _WS1;
    private float _WS2;
    private float _WS3;
    private float _WS4;
    private float _RMM;
    private float _TLOG;
    private float _PAR;
    private float _GLOB;
    private float _REFL;
    private float _NET;
    private float _UVA;
    private float _UVB;
    private float _UVAT;
    private float _UVBT;
    private float _RAIN;
    private float _TDRY0;
    private float _TWET0;
    private float _TDRY1;
    private float _TWET1;
    private float _TDRY2;
    private float _TWET2;
    private float _TDRY3;
    private float _TWET3;
    private float _TDRY4;
    private float _TWET4;
    private float _ST;
    private float _WDIR;
    private float _CPC1;
    private float _O3_0;
    private float _O3_1;
    private float _O3_2;
    private float _O3_3;
    private float _O3_4;
    private float _SO2_0;
    private float _SO2_1;
    private float _SO2_2;
    private float _SO2_3;
    private float _SO2_4;
    private float _NO_0;
    private float _NO_1;
    private float _NO_2;
    private float _NO_4;
    private float _NOX_0;
    private float _NOX_1;
    private float _NOX_2;
    private float _NOX_4;
    private float _P;
    private float _HUM_RH;
    private float _HUM_T;
    private float _temp;
    private float _WS00;
    private float _visibility;
    private float _rainint;
    private float _Precipacc;
    private float _haildiammax;
    private float _snowint;
    private float _visibilitylpm;
    private int _wthcode;
    private float _CO_1;
    private int _quality;
    private float _Tsoil;
    private float _wsoil;
    private float _CO206;
    private float _CO2soil;
    private int _Tsoil_EMEP;
    private int _wsoil_EMEP;
    private int _CO206_EMEP;
    private int _CO2soil_EMEP;
    private BaseModel<?> _varriometaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public VarriometaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Varriometa.class;
    }

    @Override
    public String getModelClassName() {
        return Varriometa.class.getName();
    }

    @Override
    public java.util.Date getPrimaryKey() {
        return _SAMPTIME;
    }

    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        setSAMPTIME(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _SAMPTIME;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((java.util.Date) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("SAMPTIME", getSAMPTIME());
        attributes.put("WS0", getWS0());
        attributes.put("WS1", getWS1());
        attributes.put("WS2", getWS2());
        attributes.put("WS3", getWS3());
        attributes.put("WS4", getWS4());
        attributes.put("RMM", getRMM());
        attributes.put("TLOG", getTLOG());
        attributes.put("PAR", getPAR());
        attributes.put("GLOB", getGLOB());
        attributes.put("REFL", getREFL());
        attributes.put("NET", getNET());
        attributes.put("UVA", getUVA());
        attributes.put("UVB", getUVB());
        attributes.put("UVAT", getUVAT());
        attributes.put("UVBT", getUVBT());
        attributes.put("RAIN", getRAIN());
        attributes.put("TDRY0", getTDRY0());
        attributes.put("TWET0", getTWET0());
        attributes.put("TDRY1", getTDRY1());
        attributes.put("TWET1", getTWET1());
        attributes.put("TDRY2", getTDRY2());
        attributes.put("TWET2", getTWET2());
        attributes.put("TDRY3", getTDRY3());
        attributes.put("TWET3", getTWET3());
        attributes.put("TDRY4", getTDRY4());
        attributes.put("TWET4", getTWET4());
        attributes.put("ST", getST());
        attributes.put("WDIR", getWDIR());
        attributes.put("CPC1", getCPC1());
        attributes.put("O3_0", getO3_0());
        attributes.put("O3_1", getO3_1());
        attributes.put("O3_2", getO3_2());
        attributes.put("O3_3", getO3_3());
        attributes.put("O3_4", getO3_4());
        attributes.put("SO2_0", getSO2_0());
        attributes.put("SO2_1", getSO2_1());
        attributes.put("SO2_2", getSO2_2());
        attributes.put("SO2_3", getSO2_3());
        attributes.put("SO2_4", getSO2_4());
        attributes.put("NO_0", getNO_0());
        attributes.put("NO_1", getNO_1());
        attributes.put("NO_2", getNO_2());
        attributes.put("NO_4", getNO_4());
        attributes.put("NOX_0", getNOX_0());
        attributes.put("NOX_1", getNOX_1());
        attributes.put("NOX_2", getNOX_2());
        attributes.put("NOX_4", getNOX_4());
        attributes.put("P", getP());
        attributes.put("HUM_RH", getHUM_RH());
        attributes.put("HUM_T", getHUM_T());
        attributes.put("temp", getTemp());
        attributes.put("WS00", getWS00());
        attributes.put("visibility", getVisibility());
        attributes.put("rainint", getRainint());
        attributes.put("Precipacc", getPrecipacc());
        attributes.put("haildiammax", getHaildiammax());
        attributes.put("snowint", getSnowint());
        attributes.put("visibilitylpm", getVisibilitylpm());
        attributes.put("wthcode", getWthcode());
        attributes.put("CO_1", getCO_1());
        attributes.put("quality", getQuality());
        attributes.put("Tsoil", getTsoil());
        attributes.put("wsoil", getWsoil());
        attributes.put("CO206", getCO206());
        attributes.put("CO2soil", getCO2soil());
        attributes.put("Tsoil_EMEP", getTsoil_EMEP());
        attributes.put("wsoil_EMEP", getWsoil_EMEP());
        attributes.put("CO206_EMEP", getCO206_EMEP());
        attributes.put("CO2soil_EMEP", getCO2soil_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date SAMPTIME = (Date) attributes.get("SAMPTIME");

        if (SAMPTIME != null) {
            setSAMPTIME(SAMPTIME);
        }

        Float WS0 = (Float) attributes.get("WS0");

        if (WS0 != null) {
            setWS0(WS0);
        }

        Float WS1 = (Float) attributes.get("WS1");

        if (WS1 != null) {
            setWS1(WS1);
        }

        Float WS2 = (Float) attributes.get("WS2");

        if (WS2 != null) {
            setWS2(WS2);
        }

        Float WS3 = (Float) attributes.get("WS3");

        if (WS3 != null) {
            setWS3(WS3);
        }

        Float WS4 = (Float) attributes.get("WS4");

        if (WS4 != null) {
            setWS4(WS4);
        }

        Float RMM = (Float) attributes.get("RMM");

        if (RMM != null) {
            setRMM(RMM);
        }

        Float TLOG = (Float) attributes.get("TLOG");

        if (TLOG != null) {
            setTLOG(TLOG);
        }

        Float PAR = (Float) attributes.get("PAR");

        if (PAR != null) {
            setPAR(PAR);
        }

        Float GLOB = (Float) attributes.get("GLOB");

        if (GLOB != null) {
            setGLOB(GLOB);
        }

        Float REFL = (Float) attributes.get("REFL");

        if (REFL != null) {
            setREFL(REFL);
        }

        Float NET = (Float) attributes.get("NET");

        if (NET != null) {
            setNET(NET);
        }

        Float UVA = (Float) attributes.get("UVA");

        if (UVA != null) {
            setUVA(UVA);
        }

        Float UVB = (Float) attributes.get("UVB");

        if (UVB != null) {
            setUVB(UVB);
        }

        Float UVAT = (Float) attributes.get("UVAT");

        if (UVAT != null) {
            setUVAT(UVAT);
        }

        Float UVBT = (Float) attributes.get("UVBT");

        if (UVBT != null) {
            setUVBT(UVBT);
        }

        Float RAIN = (Float) attributes.get("RAIN");

        if (RAIN != null) {
            setRAIN(RAIN);
        }

        Float TDRY0 = (Float) attributes.get("TDRY0");

        if (TDRY0 != null) {
            setTDRY0(TDRY0);
        }

        Float TWET0 = (Float) attributes.get("TWET0");

        if (TWET0 != null) {
            setTWET0(TWET0);
        }

        Float TDRY1 = (Float) attributes.get("TDRY1");

        if (TDRY1 != null) {
            setTDRY1(TDRY1);
        }

        Float TWET1 = (Float) attributes.get("TWET1");

        if (TWET1 != null) {
            setTWET1(TWET1);
        }

        Float TDRY2 = (Float) attributes.get("TDRY2");

        if (TDRY2 != null) {
            setTDRY2(TDRY2);
        }

        Float TWET2 = (Float) attributes.get("TWET2");

        if (TWET2 != null) {
            setTWET2(TWET2);
        }

        Float TDRY3 = (Float) attributes.get("TDRY3");

        if (TDRY3 != null) {
            setTDRY3(TDRY3);
        }

        Float TWET3 = (Float) attributes.get("TWET3");

        if (TWET3 != null) {
            setTWET3(TWET3);
        }

        Float TDRY4 = (Float) attributes.get("TDRY4");

        if (TDRY4 != null) {
            setTDRY4(TDRY4);
        }

        Float TWET4 = (Float) attributes.get("TWET4");

        if (TWET4 != null) {
            setTWET4(TWET4);
        }

        Float ST = (Float) attributes.get("ST");

        if (ST != null) {
            setST(ST);
        }

        Float WDIR = (Float) attributes.get("WDIR");

        if (WDIR != null) {
            setWDIR(WDIR);
        }

        Float CPC1 = (Float) attributes.get("CPC1");

        if (CPC1 != null) {
            setCPC1(CPC1);
        }

        Float O3_0 = (Float) attributes.get("O3_0");

        if (O3_0 != null) {
            setO3_0(O3_0);
        }

        Float O3_1 = (Float) attributes.get("O3_1");

        if (O3_1 != null) {
            setO3_1(O3_1);
        }

        Float O3_2 = (Float) attributes.get("O3_2");

        if (O3_2 != null) {
            setO3_2(O3_2);
        }

        Float O3_3 = (Float) attributes.get("O3_3");

        if (O3_3 != null) {
            setO3_3(O3_3);
        }

        Float O3_4 = (Float) attributes.get("O3_4");

        if (O3_4 != null) {
            setO3_4(O3_4);
        }

        Float SO2_0 = (Float) attributes.get("SO2_0");

        if (SO2_0 != null) {
            setSO2_0(SO2_0);
        }

        Float SO2_1 = (Float) attributes.get("SO2_1");

        if (SO2_1 != null) {
            setSO2_1(SO2_1);
        }

        Float SO2_2 = (Float) attributes.get("SO2_2");

        if (SO2_2 != null) {
            setSO2_2(SO2_2);
        }

        Float SO2_3 = (Float) attributes.get("SO2_3");

        if (SO2_3 != null) {
            setSO2_3(SO2_3);
        }

        Float SO2_4 = (Float) attributes.get("SO2_4");

        if (SO2_4 != null) {
            setSO2_4(SO2_4);
        }

        Float NO_0 = (Float) attributes.get("NO_0");

        if (NO_0 != null) {
            setNO_0(NO_0);
        }

        Float NO_1 = (Float) attributes.get("NO_1");

        if (NO_1 != null) {
            setNO_1(NO_1);
        }

        Float NO_2 = (Float) attributes.get("NO_2");

        if (NO_2 != null) {
            setNO_2(NO_2);
        }

        Float NO_4 = (Float) attributes.get("NO_4");

        if (NO_4 != null) {
            setNO_4(NO_4);
        }

        Float NOX_0 = (Float) attributes.get("NOX_0");

        if (NOX_0 != null) {
            setNOX_0(NOX_0);
        }

        Float NOX_1 = (Float) attributes.get("NOX_1");

        if (NOX_1 != null) {
            setNOX_1(NOX_1);
        }

        Float NOX_2 = (Float) attributes.get("NOX_2");

        if (NOX_2 != null) {
            setNOX_2(NOX_2);
        }

        Float NOX_4 = (Float) attributes.get("NOX_4");

        if (NOX_4 != null) {
            setNOX_4(NOX_4);
        }

        Float P = (Float) attributes.get("P");

        if (P != null) {
            setP(P);
        }

        Float HUM_RH = (Float) attributes.get("HUM_RH");

        if (HUM_RH != null) {
            setHUM_RH(HUM_RH);
        }

        Float HUM_T = (Float) attributes.get("HUM_T");

        if (HUM_T != null) {
            setHUM_T(HUM_T);
        }

        Float temp = (Float) attributes.get("temp");

        if (temp != null) {
            setTemp(temp);
        }

        Float WS00 = (Float) attributes.get("WS00");

        if (WS00 != null) {
            setWS00(WS00);
        }

        Float visibility = (Float) attributes.get("visibility");

        if (visibility != null) {
            setVisibility(visibility);
        }

        Float rainint = (Float) attributes.get("rainint");

        if (rainint != null) {
            setRainint(rainint);
        }

        Float Precipacc = (Float) attributes.get("Precipacc");

        if (Precipacc != null) {
            setPrecipacc(Precipacc);
        }

        Float haildiammax = (Float) attributes.get("haildiammax");

        if (haildiammax != null) {
            setHaildiammax(haildiammax);
        }

        Float snowint = (Float) attributes.get("snowint");

        if (snowint != null) {
            setSnowint(snowint);
        }

        Float visibilitylpm = (Float) attributes.get("visibilitylpm");

        if (visibilitylpm != null) {
            setVisibilitylpm(visibilitylpm);
        }

        Integer wthcode = (Integer) attributes.get("wthcode");

        if (wthcode != null) {
            setWthcode(wthcode);
        }

        Float CO_1 = (Float) attributes.get("CO_1");

        if (CO_1 != null) {
            setCO_1(CO_1);
        }

        Integer quality = (Integer) attributes.get("quality");

        if (quality != null) {
            setQuality(quality);
        }

        Float Tsoil = (Float) attributes.get("Tsoil");

        if (Tsoil != null) {
            setTsoil(Tsoil);
        }

        Float wsoil = (Float) attributes.get("wsoil");

        if (wsoil != null) {
            setWsoil(wsoil);
        }

        Float CO206 = (Float) attributes.get("CO206");

        if (CO206 != null) {
            setCO206(CO206);
        }

        Float CO2soil = (Float) attributes.get("CO2soil");

        if (CO2soil != null) {
            setCO2soil(CO2soil);
        }

        Integer Tsoil_EMEP = (Integer) attributes.get("Tsoil_EMEP");

        if (Tsoil_EMEP != null) {
            setTsoil_EMEP(Tsoil_EMEP);
        }

        Integer wsoil_EMEP = (Integer) attributes.get("wsoil_EMEP");

        if (wsoil_EMEP != null) {
            setWsoil_EMEP(wsoil_EMEP);
        }

        Integer CO206_EMEP = (Integer) attributes.get("CO206_EMEP");

        if (CO206_EMEP != null) {
            setCO206_EMEP(CO206_EMEP);
        }

        Integer CO2soil_EMEP = (Integer) attributes.get("CO2soil_EMEP");

        if (CO2soil_EMEP != null) {
            setCO2soil_EMEP(CO2soil_EMEP);
        }
    }

    @Override
    public Date getSAMPTIME() {
        return _SAMPTIME;
    }

    @Override
    public void setSAMPTIME(Date SAMPTIME) {
        _SAMPTIME = SAMPTIME;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSAMPTIME", Date.class);

                method.invoke(_varriometaRemoteModel, SAMPTIME);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS0() {
        return _WS0;
    }

    @Override
    public void setWS0(float WS0) {
        _WS0 = WS0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS0", float.class);

                method.invoke(_varriometaRemoteModel, WS0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS1() {
        return _WS1;
    }

    @Override
    public void setWS1(float WS1) {
        _WS1 = WS1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS1", float.class);

                method.invoke(_varriometaRemoteModel, WS1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS2() {
        return _WS2;
    }

    @Override
    public void setWS2(float WS2) {
        _WS2 = WS2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS2", float.class);

                method.invoke(_varriometaRemoteModel, WS2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS3() {
        return _WS3;
    }

    @Override
    public void setWS3(float WS3) {
        _WS3 = WS3;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS3", float.class);

                method.invoke(_varriometaRemoteModel, WS3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS4() {
        return _WS4;
    }

    @Override
    public void setWS4(float WS4) {
        _WS4 = WS4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS4", float.class);

                method.invoke(_varriometaRemoteModel, WS4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRMM() {
        return _RMM;
    }

    @Override
    public void setRMM(float RMM) {
        _RMM = RMM;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setRMM", float.class);

                method.invoke(_varriometaRemoteModel, RMM);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTLOG() {
        return _TLOG;
    }

    @Override
    public void setTLOG(float TLOG) {
        _TLOG = TLOG;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTLOG", float.class);

                method.invoke(_varriometaRemoteModel, TLOG);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPAR() {
        return _PAR;
    }

    @Override
    public void setPAR(float PAR) {
        _PAR = PAR;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR", float.class);

                method.invoke(_varriometaRemoteModel, PAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getGLOB() {
        return _GLOB;
    }

    @Override
    public void setGLOB(float GLOB) {
        _GLOB = GLOB;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setGLOB", float.class);

                method.invoke(_varriometaRemoteModel, GLOB);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getREFL() {
        return _REFL;
    }

    @Override
    public void setREFL(float REFL) {
        _REFL = REFL;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setREFL", float.class);

                method.invoke(_varriometaRemoteModel, REFL);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNET() {
        return _NET;
    }

    @Override
    public void setNET(float NET) {
        _NET = NET;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNET", float.class);

                method.invoke(_varriometaRemoteModel, NET);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUVA() {
        return _UVA;
    }

    @Override
    public void setUVA(float UVA) {
        _UVA = UVA;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setUVA", float.class);

                method.invoke(_varriometaRemoteModel, UVA);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUVB() {
        return _UVB;
    }

    @Override
    public void setUVB(float UVB) {
        _UVB = UVB;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setUVB", float.class);

                method.invoke(_varriometaRemoteModel, UVB);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUVAT() {
        return _UVAT;
    }

    @Override
    public void setUVAT(float UVAT) {
        _UVAT = UVAT;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setUVAT", float.class);

                method.invoke(_varriometaRemoteModel, UVAT);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUVBT() {
        return _UVBT;
    }

    @Override
    public void setUVBT(float UVBT) {
        _UVBT = UVBT;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setUVBT", float.class);

                method.invoke(_varriometaRemoteModel, UVBT);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRAIN() {
        return _RAIN;
    }

    @Override
    public void setRAIN(float RAIN) {
        _RAIN = RAIN;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setRAIN", float.class);

                method.invoke(_varriometaRemoteModel, RAIN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTDRY0() {
        return _TDRY0;
    }

    @Override
    public void setTDRY0(float TDRY0) {
        _TDRY0 = TDRY0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTDRY0", float.class);

                method.invoke(_varriometaRemoteModel, TDRY0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTWET0() {
        return _TWET0;
    }

    @Override
    public void setTWET0(float TWET0) {
        _TWET0 = TWET0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTWET0", float.class);

                method.invoke(_varriometaRemoteModel, TWET0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTDRY1() {
        return _TDRY1;
    }

    @Override
    public void setTDRY1(float TDRY1) {
        _TDRY1 = TDRY1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTDRY1", float.class);

                method.invoke(_varriometaRemoteModel, TDRY1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTWET1() {
        return _TWET1;
    }

    @Override
    public void setTWET1(float TWET1) {
        _TWET1 = TWET1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTWET1", float.class);

                method.invoke(_varriometaRemoteModel, TWET1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTDRY2() {
        return _TDRY2;
    }

    @Override
    public void setTDRY2(float TDRY2) {
        _TDRY2 = TDRY2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTDRY2", float.class);

                method.invoke(_varriometaRemoteModel, TDRY2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTWET2() {
        return _TWET2;
    }

    @Override
    public void setTWET2(float TWET2) {
        _TWET2 = TWET2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTWET2", float.class);

                method.invoke(_varriometaRemoteModel, TWET2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTDRY3() {
        return _TDRY3;
    }

    @Override
    public void setTDRY3(float TDRY3) {
        _TDRY3 = TDRY3;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTDRY3", float.class);

                method.invoke(_varriometaRemoteModel, TDRY3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTWET3() {
        return _TWET3;
    }

    @Override
    public void setTWET3(float TWET3) {
        _TWET3 = TWET3;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTWET3", float.class);

                method.invoke(_varriometaRemoteModel, TWET3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTDRY4() {
        return _TDRY4;
    }

    @Override
    public void setTDRY4(float TDRY4) {
        _TDRY4 = TDRY4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTDRY4", float.class);

                method.invoke(_varriometaRemoteModel, TDRY4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTWET4() {
        return _TWET4;
    }

    @Override
    public void setTWET4(float TWET4) {
        _TWET4 = TWET4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTWET4", float.class);

                method.invoke(_varriometaRemoteModel, TWET4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getST() {
        return _ST;
    }

    @Override
    public void setST(float ST) {
        _ST = ST;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setST", float.class);

                method.invoke(_varriometaRemoteModel, ST);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDIR() {
        return _WDIR;
    }

    @Override
    public void setWDIR(float WDIR) {
        _WDIR = WDIR;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDIR", float.class);

                method.invoke(_varriometaRemoteModel, WDIR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCPC1() {
        return _CPC1;
    }

    @Override
    public void setCPC1(float CPC1) {
        _CPC1 = CPC1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCPC1", float.class);

                method.invoke(_varriometaRemoteModel, CPC1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_0() {
        return _O3_0;
    }

    @Override
    public void setO3_0(float O3_0) {
        _O3_0 = O3_0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_0", float.class);

                method.invoke(_varriometaRemoteModel, O3_0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_1() {
        return _O3_1;
    }

    @Override
    public void setO3_1(float O3_1) {
        _O3_1 = O3_1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_1", float.class);

                method.invoke(_varriometaRemoteModel, O3_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_2() {
        return _O3_2;
    }

    @Override
    public void setO3_2(float O3_2) {
        _O3_2 = O3_2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_2", float.class);

                method.invoke(_varriometaRemoteModel, O3_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_3() {
        return _O3_3;
    }

    @Override
    public void setO3_3(float O3_3) {
        _O3_3 = O3_3;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_3", float.class);

                method.invoke(_varriometaRemoteModel, O3_3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3_4() {
        return _O3_4;
    }

    @Override
    public void setO3_4(float O3_4) {
        _O3_4 = O3_4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3_4", float.class);

                method.invoke(_varriometaRemoteModel, O3_4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2_0() {
        return _SO2_0;
    }

    @Override
    public void setSO2_0(float SO2_0) {
        _SO2_0 = SO2_0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2_0", float.class);

                method.invoke(_varriometaRemoteModel, SO2_0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2_1() {
        return _SO2_1;
    }

    @Override
    public void setSO2_1(float SO2_1) {
        _SO2_1 = SO2_1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2_1", float.class);

                method.invoke(_varriometaRemoteModel, SO2_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2_2() {
        return _SO2_2;
    }

    @Override
    public void setSO2_2(float SO2_2) {
        _SO2_2 = SO2_2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2_2", float.class);

                method.invoke(_varriometaRemoteModel, SO2_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2_3() {
        return _SO2_3;
    }

    @Override
    public void setSO2_3(float SO2_3) {
        _SO2_3 = SO2_3;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2_3", float.class);

                method.invoke(_varriometaRemoteModel, SO2_3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2_4() {
        return _SO2_4;
    }

    @Override
    public void setSO2_4(float SO2_4) {
        _SO2_4 = SO2_4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2_4", float.class);

                method.invoke(_varriometaRemoteModel, SO2_4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO_0() {
        return _NO_0;
    }

    @Override
    public void setNO_0(float NO_0) {
        _NO_0 = NO_0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO_0", float.class);

                method.invoke(_varriometaRemoteModel, NO_0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO_1() {
        return _NO_1;
    }

    @Override
    public void setNO_1(float NO_1) {
        _NO_1 = NO_1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO_1", float.class);

                method.invoke(_varriometaRemoteModel, NO_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO_2() {
        return _NO_2;
    }

    @Override
    public void setNO_2(float NO_2) {
        _NO_2 = NO_2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO_2", float.class);

                method.invoke(_varriometaRemoteModel, NO_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO_4() {
        return _NO_4;
    }

    @Override
    public void setNO_4(float NO_4) {
        _NO_4 = NO_4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO_4", float.class);

                method.invoke(_varriometaRemoteModel, NO_4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOX_0() {
        return _NOX_0;
    }

    @Override
    public void setNOX_0(float NOX_0) {
        _NOX_0 = NOX_0;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOX_0", float.class);

                method.invoke(_varriometaRemoteModel, NOX_0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOX_1() {
        return _NOX_1;
    }

    @Override
    public void setNOX_1(float NOX_1) {
        _NOX_1 = NOX_1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOX_1", float.class);

                method.invoke(_varriometaRemoteModel, NOX_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOX_2() {
        return _NOX_2;
    }

    @Override
    public void setNOX_2(float NOX_2) {
        _NOX_2 = NOX_2;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOX_2", float.class);

                method.invoke(_varriometaRemoteModel, NOX_2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOX_4() {
        return _NOX_4;
    }

    @Override
    public void setNOX_4(float NOX_4) {
        _NOX_4 = NOX_4;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOX_4", float.class);

                method.invoke(_varriometaRemoteModel, NOX_4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getP() {
        return _P;
    }

    @Override
    public void setP(float P) {
        _P = P;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setP", float.class);

                method.invoke(_varriometaRemoteModel, P);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHUM_RH() {
        return _HUM_RH;
    }

    @Override
    public void setHUM_RH(float HUM_RH) {
        _HUM_RH = HUM_RH;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setHUM_RH", float.class);

                method.invoke(_varriometaRemoteModel, HUM_RH);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHUM_T() {
        return _HUM_T;
    }

    @Override
    public void setHUM_T(float HUM_T) {
        _HUM_T = HUM_T;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setHUM_T", float.class);

                method.invoke(_varriometaRemoteModel, HUM_T);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTemp() {
        return _temp;
    }

    @Override
    public void setTemp(float temp) {
        _temp = temp;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTemp", float.class);

                method.invoke(_varriometaRemoteModel, temp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS00() {
        return _WS00;
    }

    @Override
    public void setWS00(float WS00) {
        _WS00 = WS00;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS00", float.class);

                method.invoke(_varriometaRemoteModel, WS00);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getVisibility() {
        return _visibility;
    }

    @Override
    public void setVisibility(float visibility) {
        _visibility = visibility;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setVisibility", float.class);

                method.invoke(_varriometaRemoteModel, visibility);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRainint() {
        return _rainint;
    }

    @Override
    public void setRainint(float rainint) {
        _rainint = rainint;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setRainint", float.class);

                method.invoke(_varriometaRemoteModel, rainint);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecipacc() {
        return _Precipacc;
    }

    @Override
    public void setPrecipacc(float Precipacc) {
        _Precipacc = Precipacc;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecipacc", float.class);

                method.invoke(_varriometaRemoteModel, Precipacc);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getHaildiammax() {
        return _haildiammax;
    }

    @Override
    public void setHaildiammax(float haildiammax) {
        _haildiammax = haildiammax;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setHaildiammax", float.class);

                method.invoke(_varriometaRemoteModel, haildiammax);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSnowint() {
        return _snowint;
    }

    @Override
    public void setSnowint(float snowint) {
        _snowint = snowint;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setSnowint", float.class);

                method.invoke(_varriometaRemoteModel, snowint);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getVisibilitylpm() {
        return _visibilitylpm;
    }

    @Override
    public void setVisibilitylpm(float visibilitylpm) {
        _visibilitylpm = visibilitylpm;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setVisibilitylpm", float.class);

                method.invoke(_varriometaRemoteModel, visibilitylpm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWthcode() {
        return _wthcode;
    }

    @Override
    public void setWthcode(int wthcode) {
        _wthcode = wthcode;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWthcode", int.class);

                method.invoke(_varriometaRemoteModel, wthcode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO_1() {
        return _CO_1;
    }

    @Override
    public void setCO_1(float CO_1) {
        _CO_1 = CO_1;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO_1", float.class);

                method.invoke(_varriometaRemoteModel, CO_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQuality() {
        return _quality;
    }

    @Override
    public void setQuality(int quality) {
        _quality = quality;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setQuality", int.class);

                method.invoke(_varriometaRemoteModel, quality);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil() {
        return _Tsoil;
    }

    @Override
    public void setTsoil(float Tsoil) {
        _Tsoil = Tsoil;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil", float.class);

                method.invoke(_varriometaRemoteModel, Tsoil);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil() {
        return _wsoil;
    }

    @Override
    public void setWsoil(float wsoil) {
        _wsoil = wsoil;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil", float.class);

                method.invoke(_varriometaRemoteModel, wsoil);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO206() {
        return _CO206;
    }

    @Override
    public void setCO206(float CO206) {
        _CO206 = CO206;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO206", float.class);

                method.invoke(_varriometaRemoteModel, CO206);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2soil() {
        return _CO2soil;
    }

    @Override
    public void setCO2soil(float CO2soil) {
        _CO2soil = CO2soil;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2soil", float.class);

                method.invoke(_varriometaRemoteModel, CO2soil);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTsoil_EMEP() {
        return _Tsoil_EMEP;
    }

    @Override
    public void setTsoil_EMEP(int Tsoil_EMEP) {
        _Tsoil_EMEP = Tsoil_EMEP;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_EMEP", int.class);

                method.invoke(_varriometaRemoteModel, Tsoil_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWsoil_EMEP() {
        return _wsoil_EMEP;
    }

    @Override
    public void setWsoil_EMEP(int wsoil_EMEP) {
        _wsoil_EMEP = wsoil_EMEP;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_EMEP", int.class);

                method.invoke(_varriometaRemoteModel, wsoil_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO206_EMEP() {
        return _CO206_EMEP;
    }

    @Override
    public void setCO206_EMEP(int CO206_EMEP) {
        _CO206_EMEP = CO206_EMEP;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO206_EMEP", int.class);

                method.invoke(_varriometaRemoteModel, CO206_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2soil_EMEP() {
        return _CO2soil_EMEP;
    }

    @Override
    public void setCO2soil_EMEP(int CO2soil_EMEP) {
        _CO2soil_EMEP = CO2soil_EMEP;

        if (_varriometaRemoteModel != null) {
            try {
                Class<?> clazz = _varriometaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2soil_EMEP", int.class);

                method.invoke(_varriometaRemoteModel, CO2soil_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getVarriometaRemoteModel() {
        return _varriometaRemoteModel;
    }

    public void setVarriometaRemoteModel(BaseModel<?> varriometaRemoteModel) {
        _varriometaRemoteModel = varriometaRemoteModel;
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

        Class<?> remoteModelClass = _varriometaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_varriometaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VarriometaLocalServiceUtil.addVarriometa(this);
        } else {
            VarriometaLocalServiceUtil.updateVarriometa(this);
        }
    }

    @Override
    public Varriometa toEscapedModel() {
        return (Varriometa) ProxyUtil.newProxyInstance(Varriometa.class.getClassLoader(),
            new Class[] { Varriometa.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        VarriometaClp clone = new VarriometaClp();

        clone.setSAMPTIME(getSAMPTIME());
        clone.setWS0(getWS0());
        clone.setWS1(getWS1());
        clone.setWS2(getWS2());
        clone.setWS3(getWS3());
        clone.setWS4(getWS4());
        clone.setRMM(getRMM());
        clone.setTLOG(getTLOG());
        clone.setPAR(getPAR());
        clone.setGLOB(getGLOB());
        clone.setREFL(getREFL());
        clone.setNET(getNET());
        clone.setUVA(getUVA());
        clone.setUVB(getUVB());
        clone.setUVAT(getUVAT());
        clone.setUVBT(getUVBT());
        clone.setRAIN(getRAIN());
        clone.setTDRY0(getTDRY0());
        clone.setTWET0(getTWET0());
        clone.setTDRY1(getTDRY1());
        clone.setTWET1(getTWET1());
        clone.setTDRY2(getTDRY2());
        clone.setTWET2(getTWET2());
        clone.setTDRY3(getTDRY3());
        clone.setTWET3(getTWET3());
        clone.setTDRY4(getTDRY4());
        clone.setTWET4(getTWET4());
        clone.setST(getST());
        clone.setWDIR(getWDIR());
        clone.setCPC1(getCPC1());
        clone.setO3_0(getO3_0());
        clone.setO3_1(getO3_1());
        clone.setO3_2(getO3_2());
        clone.setO3_3(getO3_3());
        clone.setO3_4(getO3_4());
        clone.setSO2_0(getSO2_0());
        clone.setSO2_1(getSO2_1());
        clone.setSO2_2(getSO2_2());
        clone.setSO2_3(getSO2_3());
        clone.setSO2_4(getSO2_4());
        clone.setNO_0(getNO_0());
        clone.setNO_1(getNO_1());
        clone.setNO_2(getNO_2());
        clone.setNO_4(getNO_4());
        clone.setNOX_0(getNOX_0());
        clone.setNOX_1(getNOX_1());
        clone.setNOX_2(getNOX_2());
        clone.setNOX_4(getNOX_4());
        clone.setP(getP());
        clone.setHUM_RH(getHUM_RH());
        clone.setHUM_T(getHUM_T());
        clone.setTemp(getTemp());
        clone.setWS00(getWS00());
        clone.setVisibility(getVisibility());
        clone.setRainint(getRainint());
        clone.setPrecipacc(getPrecipacc());
        clone.setHaildiammax(getHaildiammax());
        clone.setSnowint(getSnowint());
        clone.setVisibilitylpm(getVisibilitylpm());
        clone.setWthcode(getWthcode());
        clone.setCO_1(getCO_1());
        clone.setQuality(getQuality());
        clone.setTsoil(getTsoil());
        clone.setWsoil(getWsoil());
        clone.setCO206(getCO206());
        clone.setCO2soil(getCO2soil());
        clone.setTsoil_EMEP(getTsoil_EMEP());
        clone.setWsoil_EMEP(getWsoil_EMEP());
        clone.setCO206_EMEP(getCO206_EMEP());
        clone.setCO2soil_EMEP(getCO2soil_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Varriometa varriometa) {
        java.util.Date primaryKey = varriometa.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VarriometaClp)) {
            return false;
        }

        VarriometaClp varriometa = (VarriometaClp) obj;

        java.util.Date primaryKey = varriometa.getPrimaryKey();

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
        StringBundler sb = new StringBundler(141);

        sb.append("{SAMPTIME=");
        sb.append(getSAMPTIME());
        sb.append(", WS0=");
        sb.append(getWS0());
        sb.append(", WS1=");
        sb.append(getWS1());
        sb.append(", WS2=");
        sb.append(getWS2());
        sb.append(", WS3=");
        sb.append(getWS3());
        sb.append(", WS4=");
        sb.append(getWS4());
        sb.append(", RMM=");
        sb.append(getRMM());
        sb.append(", TLOG=");
        sb.append(getTLOG());
        sb.append(", PAR=");
        sb.append(getPAR());
        sb.append(", GLOB=");
        sb.append(getGLOB());
        sb.append(", REFL=");
        sb.append(getREFL());
        sb.append(", NET=");
        sb.append(getNET());
        sb.append(", UVA=");
        sb.append(getUVA());
        sb.append(", UVB=");
        sb.append(getUVB());
        sb.append(", UVAT=");
        sb.append(getUVAT());
        sb.append(", UVBT=");
        sb.append(getUVBT());
        sb.append(", RAIN=");
        sb.append(getRAIN());
        sb.append(", TDRY0=");
        sb.append(getTDRY0());
        sb.append(", TWET0=");
        sb.append(getTWET0());
        sb.append(", TDRY1=");
        sb.append(getTDRY1());
        sb.append(", TWET1=");
        sb.append(getTWET1());
        sb.append(", TDRY2=");
        sb.append(getTDRY2());
        sb.append(", TWET2=");
        sb.append(getTWET2());
        sb.append(", TDRY3=");
        sb.append(getTDRY3());
        sb.append(", TWET3=");
        sb.append(getTWET3());
        sb.append(", TDRY4=");
        sb.append(getTDRY4());
        sb.append(", TWET4=");
        sb.append(getTWET4());
        sb.append(", ST=");
        sb.append(getST());
        sb.append(", WDIR=");
        sb.append(getWDIR());
        sb.append(", CPC1=");
        sb.append(getCPC1());
        sb.append(", O3_0=");
        sb.append(getO3_0());
        sb.append(", O3_1=");
        sb.append(getO3_1());
        sb.append(", O3_2=");
        sb.append(getO3_2());
        sb.append(", O3_3=");
        sb.append(getO3_3());
        sb.append(", O3_4=");
        sb.append(getO3_4());
        sb.append(", SO2_0=");
        sb.append(getSO2_0());
        sb.append(", SO2_1=");
        sb.append(getSO2_1());
        sb.append(", SO2_2=");
        sb.append(getSO2_2());
        sb.append(", SO2_3=");
        sb.append(getSO2_3());
        sb.append(", SO2_4=");
        sb.append(getSO2_4());
        sb.append(", NO_0=");
        sb.append(getNO_0());
        sb.append(", NO_1=");
        sb.append(getNO_1());
        sb.append(", NO_2=");
        sb.append(getNO_2());
        sb.append(", NO_4=");
        sb.append(getNO_4());
        sb.append(", NOX_0=");
        sb.append(getNOX_0());
        sb.append(", NOX_1=");
        sb.append(getNOX_1());
        sb.append(", NOX_2=");
        sb.append(getNOX_2());
        sb.append(", NOX_4=");
        sb.append(getNOX_4());
        sb.append(", P=");
        sb.append(getP());
        sb.append(", HUM_RH=");
        sb.append(getHUM_RH());
        sb.append(", HUM_T=");
        sb.append(getHUM_T());
        sb.append(", temp=");
        sb.append(getTemp());
        sb.append(", WS00=");
        sb.append(getWS00());
        sb.append(", visibility=");
        sb.append(getVisibility());
        sb.append(", rainint=");
        sb.append(getRainint());
        sb.append(", Precipacc=");
        sb.append(getPrecipacc());
        sb.append(", haildiammax=");
        sb.append(getHaildiammax());
        sb.append(", snowint=");
        sb.append(getSnowint());
        sb.append(", visibilitylpm=");
        sb.append(getVisibilitylpm());
        sb.append(", wthcode=");
        sb.append(getWthcode());
        sb.append(", CO_1=");
        sb.append(getCO_1());
        sb.append(", quality=");
        sb.append(getQuality());
        sb.append(", Tsoil=");
        sb.append(getTsoil());
        sb.append(", wsoil=");
        sb.append(getWsoil());
        sb.append(", CO206=");
        sb.append(getCO206());
        sb.append(", CO2soil=");
        sb.append(getCO2soil());
        sb.append(", Tsoil_EMEP=");
        sb.append(getTsoil_EMEP());
        sb.append(", wsoil_EMEP=");
        sb.append(getWsoil_EMEP());
        sb.append(", CO206_EMEP=");
        sb.append(getCO206_EMEP());
        sb.append(", CO2soil_EMEP=");
        sb.append(getCO2soil_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(214);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Varriometa");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>SAMPTIME</column-name><column-value><![CDATA[");
        sb.append(getSAMPTIME());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS0</column-name><column-value><![CDATA[");
        sb.append(getWS0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS1</column-name><column-value><![CDATA[");
        sb.append(getWS1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS2</column-name><column-value><![CDATA[");
        sb.append(getWS2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS3</column-name><column-value><![CDATA[");
        sb.append(getWS3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS4</column-name><column-value><![CDATA[");
        sb.append(getWS4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RMM</column-name><column-value><![CDATA[");
        sb.append(getRMM());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TLOG</column-name><column-value><![CDATA[");
        sb.append(getTLOG());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR</column-name><column-value><![CDATA[");
        sb.append(getPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>GLOB</column-name><column-value><![CDATA[");
        sb.append(getGLOB());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>REFL</column-name><column-value><![CDATA[");
        sb.append(getREFL());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NET</column-name><column-value><![CDATA[");
        sb.append(getNET());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UVA</column-name><column-value><![CDATA[");
        sb.append(getUVA());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UVB</column-name><column-value><![CDATA[");
        sb.append(getUVB());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UVAT</column-name><column-value><![CDATA[");
        sb.append(getUVAT());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UVBT</column-name><column-value><![CDATA[");
        sb.append(getUVBT());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RAIN</column-name><column-value><![CDATA[");
        sb.append(getRAIN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TDRY0</column-name><column-value><![CDATA[");
        sb.append(getTDRY0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TWET0</column-name><column-value><![CDATA[");
        sb.append(getTWET0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TDRY1</column-name><column-value><![CDATA[");
        sb.append(getTDRY1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TWET1</column-name><column-value><![CDATA[");
        sb.append(getTWET1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TDRY2</column-name><column-value><![CDATA[");
        sb.append(getTDRY2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TWET2</column-name><column-value><![CDATA[");
        sb.append(getTWET2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TDRY3</column-name><column-value><![CDATA[");
        sb.append(getTDRY3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TWET3</column-name><column-value><![CDATA[");
        sb.append(getTWET3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TDRY4</column-name><column-value><![CDATA[");
        sb.append(getTDRY4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>TWET4</column-name><column-value><![CDATA[");
        sb.append(getTWET4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ST</column-name><column-value><![CDATA[");
        sb.append(getST());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDIR</column-name><column-value><![CDATA[");
        sb.append(getWDIR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CPC1</column-name><column-value><![CDATA[");
        sb.append(getCPC1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_0</column-name><column-value><![CDATA[");
        sb.append(getO3_0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_1</column-name><column-value><![CDATA[");
        sb.append(getO3_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_2</column-name><column-value><![CDATA[");
        sb.append(getO3_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_3</column-name><column-value><![CDATA[");
        sb.append(getO3_3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3_4</column-name><column-value><![CDATA[");
        sb.append(getO3_4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2_0</column-name><column-value><![CDATA[");
        sb.append(getSO2_0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2_1</column-name><column-value><![CDATA[");
        sb.append(getSO2_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2_2</column-name><column-value><![CDATA[");
        sb.append(getSO2_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2_3</column-name><column-value><![CDATA[");
        sb.append(getSO2_3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2_4</column-name><column-value><![CDATA[");
        sb.append(getSO2_4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO_0</column-name><column-value><![CDATA[");
        sb.append(getNO_0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO_1</column-name><column-value><![CDATA[");
        sb.append(getNO_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO_2</column-name><column-value><![CDATA[");
        sb.append(getNO_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO_4</column-name><column-value><![CDATA[");
        sb.append(getNO_4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOX_0</column-name><column-value><![CDATA[");
        sb.append(getNOX_0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOX_1</column-name><column-value><![CDATA[");
        sb.append(getNOX_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOX_2</column-name><column-value><![CDATA[");
        sb.append(getNOX_2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOX_4</column-name><column-value><![CDATA[");
        sb.append(getNOX_4());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>P</column-name><column-value><![CDATA[");
        sb.append(getP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>HUM_RH</column-name><column-value><![CDATA[");
        sb.append(getHUM_RH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>HUM_T</column-name><column-value><![CDATA[");
        sb.append(getHUM_T());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>temp</column-name><column-value><![CDATA[");
        sb.append(getTemp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS00</column-name><column-value><![CDATA[");
        sb.append(getWS00());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visibility</column-name><column-value><![CDATA[");
        sb.append(getVisibility());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rainint</column-name><column-value><![CDATA[");
        sb.append(getRainint());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precipacc</column-name><column-value><![CDATA[");
        sb.append(getPrecipacc());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>haildiammax</column-name><column-value><![CDATA[");
        sb.append(getHaildiammax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>snowint</column-name><column-value><![CDATA[");
        sb.append(getSnowint());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visibilitylpm</column-name><column-value><![CDATA[");
        sb.append(getVisibilitylpm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wthcode</column-name><column-value><![CDATA[");
        sb.append(getWthcode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO_1</column-name><column-value><![CDATA[");
        sb.append(getCO_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>quality</column-name><column-value><![CDATA[");
        sb.append(getQuality());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tsoil</column-name><column-value><![CDATA[");
        sb.append(getTsoil());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil</column-name><column-value><![CDATA[");
        sb.append(getWsoil());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO206</column-name><column-value><![CDATA[");
        sb.append(getCO206());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2soil</column-name><column-value><![CDATA[");
        sb.append(getCO2soil());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tsoil_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTsoil_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWsoil_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO206_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO206_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2soil_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2soil_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
