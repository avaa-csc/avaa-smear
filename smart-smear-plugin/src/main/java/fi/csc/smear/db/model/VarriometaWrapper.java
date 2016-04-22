package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Varriometa}.
 * </p>
 *
 * @author pj
 * @see Varriometa
 * @generated
 */
public class VarriometaWrapper implements Varriometa, ModelWrapper<Varriometa> {
    private Varriometa _varriometa;

    public VarriometaWrapper(Varriometa varriometa) {
        _varriometa = varriometa;
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

    /**
    * Returns the primary key of this varriometa.
    *
    * @return the primary key of this varriometa
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _varriometa.getPrimaryKey();
    }

    /**
    * Sets the primary key of this varriometa.
    *
    * @param primaryKey the primary key of this varriometa
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _varriometa.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the s a m p t i m e of this varriometa.
    *
    * @return the s a m p t i m e of this varriometa
    */
    @Override
    public java.util.Date getSAMPTIME() {
        return _varriometa.getSAMPTIME();
    }

    /**
    * Sets the s a m p t i m e of this varriometa.
    *
    * @param SAMPTIME the s a m p t i m e of this varriometa
    */
    @Override
    public void setSAMPTIME(java.util.Date SAMPTIME) {
        _varriometa.setSAMPTIME(SAMPTIME);
    }

    /**
    * Returns the w s0 of this varriometa.
    *
    * @return the w s0 of this varriometa
    */
    @Override
    public float getWS0() {
        return _varriometa.getWS0();
    }

    /**
    * Sets the w s0 of this varriometa.
    *
    * @param WS0 the w s0 of this varriometa
    */
    @Override
    public void setWS0(float WS0) {
        _varriometa.setWS0(WS0);
    }

    /**
    * Returns the w s1 of this varriometa.
    *
    * @return the w s1 of this varriometa
    */
    @Override
    public float getWS1() {
        return _varriometa.getWS1();
    }

    /**
    * Sets the w s1 of this varriometa.
    *
    * @param WS1 the w s1 of this varriometa
    */
    @Override
    public void setWS1(float WS1) {
        _varriometa.setWS1(WS1);
    }

    /**
    * Returns the w s2 of this varriometa.
    *
    * @return the w s2 of this varriometa
    */
    @Override
    public float getWS2() {
        return _varriometa.getWS2();
    }

    /**
    * Sets the w s2 of this varriometa.
    *
    * @param WS2 the w s2 of this varriometa
    */
    @Override
    public void setWS2(float WS2) {
        _varriometa.setWS2(WS2);
    }

    /**
    * Returns the w s3 of this varriometa.
    *
    * @return the w s3 of this varriometa
    */
    @Override
    public float getWS3() {
        return _varriometa.getWS3();
    }

    /**
    * Sets the w s3 of this varriometa.
    *
    * @param WS3 the w s3 of this varriometa
    */
    @Override
    public void setWS3(float WS3) {
        _varriometa.setWS3(WS3);
    }

    /**
    * Returns the w s4 of this varriometa.
    *
    * @return the w s4 of this varriometa
    */
    @Override
    public float getWS4() {
        return _varriometa.getWS4();
    }

    /**
    * Sets the w s4 of this varriometa.
    *
    * @param WS4 the w s4 of this varriometa
    */
    @Override
    public void setWS4(float WS4) {
        _varriometa.setWS4(WS4);
    }

    /**
    * Returns the r m m of this varriometa.
    *
    * @return the r m m of this varriometa
    */
    @Override
    public float getRMM() {
        return _varriometa.getRMM();
    }

    /**
    * Sets the r m m of this varriometa.
    *
    * @param RMM the r m m of this varriometa
    */
    @Override
    public void setRMM(float RMM) {
        _varriometa.setRMM(RMM);
    }

    /**
    * Returns the t l o g of this varriometa.
    *
    * @return the t l o g of this varriometa
    */
    @Override
    public float getTLOG() {
        return _varriometa.getTLOG();
    }

    /**
    * Sets the t l o g of this varriometa.
    *
    * @param TLOG the t l o g of this varriometa
    */
    @Override
    public void setTLOG(float TLOG) {
        _varriometa.setTLOG(TLOG);
    }

    /**
    * Returns the p a r of this varriometa.
    *
    * @return the p a r of this varriometa
    */
    @Override
    public float getPAR() {
        return _varriometa.getPAR();
    }

    /**
    * Sets the p a r of this varriometa.
    *
    * @param PAR the p a r of this varriometa
    */
    @Override
    public void setPAR(float PAR) {
        _varriometa.setPAR(PAR);
    }

    /**
    * Returns the g l o b of this varriometa.
    *
    * @return the g l o b of this varriometa
    */
    @Override
    public float getGLOB() {
        return _varriometa.getGLOB();
    }

    /**
    * Sets the g l o b of this varriometa.
    *
    * @param GLOB the g l o b of this varriometa
    */
    @Override
    public void setGLOB(float GLOB) {
        _varriometa.setGLOB(GLOB);
    }

    /**
    * Returns the r e f l of this varriometa.
    *
    * @return the r e f l of this varriometa
    */
    @Override
    public float getREFL() {
        return _varriometa.getREFL();
    }

    /**
    * Sets the r e f l of this varriometa.
    *
    * @param REFL the r e f l of this varriometa
    */
    @Override
    public void setREFL(float REFL) {
        _varriometa.setREFL(REFL);
    }

    /**
    * Returns the n e t of this varriometa.
    *
    * @return the n e t of this varriometa
    */
    @Override
    public float getNET() {
        return _varriometa.getNET();
    }

    /**
    * Sets the n e t of this varriometa.
    *
    * @param NET the n e t of this varriometa
    */
    @Override
    public void setNET(float NET) {
        _varriometa.setNET(NET);
    }

    /**
    * Returns the u v a of this varriometa.
    *
    * @return the u v a of this varriometa
    */
    @Override
    public float getUVA() {
        return _varriometa.getUVA();
    }

    /**
    * Sets the u v a of this varriometa.
    *
    * @param UVA the u v a of this varriometa
    */
    @Override
    public void setUVA(float UVA) {
        _varriometa.setUVA(UVA);
    }

    /**
    * Returns the u v b of this varriometa.
    *
    * @return the u v b of this varriometa
    */
    @Override
    public float getUVB() {
        return _varriometa.getUVB();
    }

    /**
    * Sets the u v b of this varriometa.
    *
    * @param UVB the u v b of this varriometa
    */
    @Override
    public void setUVB(float UVB) {
        _varriometa.setUVB(UVB);
    }

    /**
    * Returns the u v a t of this varriometa.
    *
    * @return the u v a t of this varriometa
    */
    @Override
    public float getUVAT() {
        return _varriometa.getUVAT();
    }

    /**
    * Sets the u v a t of this varriometa.
    *
    * @param UVAT the u v a t of this varriometa
    */
    @Override
    public void setUVAT(float UVAT) {
        _varriometa.setUVAT(UVAT);
    }

    /**
    * Returns the u v b t of this varriometa.
    *
    * @return the u v b t of this varriometa
    */
    @Override
    public float getUVBT() {
        return _varriometa.getUVBT();
    }

    /**
    * Sets the u v b t of this varriometa.
    *
    * @param UVBT the u v b t of this varriometa
    */
    @Override
    public void setUVBT(float UVBT) {
        _varriometa.setUVBT(UVBT);
    }

    /**
    * Returns the r a i n of this varriometa.
    *
    * @return the r a i n of this varriometa
    */
    @Override
    public float getRAIN() {
        return _varriometa.getRAIN();
    }

    /**
    * Sets the r a i n of this varriometa.
    *
    * @param RAIN the r a i n of this varriometa
    */
    @Override
    public void setRAIN(float RAIN) {
        _varriometa.setRAIN(RAIN);
    }

    /**
    * Returns the t d r y0 of this varriometa.
    *
    * @return the t d r y0 of this varriometa
    */
    @Override
    public float getTDRY0() {
        return _varriometa.getTDRY0();
    }

    /**
    * Sets the t d r y0 of this varriometa.
    *
    * @param TDRY0 the t d r y0 of this varriometa
    */
    @Override
    public void setTDRY0(float TDRY0) {
        _varriometa.setTDRY0(TDRY0);
    }

    /**
    * Returns the t w e t0 of this varriometa.
    *
    * @return the t w e t0 of this varriometa
    */
    @Override
    public float getTWET0() {
        return _varriometa.getTWET0();
    }

    /**
    * Sets the t w e t0 of this varriometa.
    *
    * @param TWET0 the t w e t0 of this varriometa
    */
    @Override
    public void setTWET0(float TWET0) {
        _varriometa.setTWET0(TWET0);
    }

    /**
    * Returns the t d r y1 of this varriometa.
    *
    * @return the t d r y1 of this varriometa
    */
    @Override
    public float getTDRY1() {
        return _varriometa.getTDRY1();
    }

    /**
    * Sets the t d r y1 of this varriometa.
    *
    * @param TDRY1 the t d r y1 of this varriometa
    */
    @Override
    public void setTDRY1(float TDRY1) {
        _varriometa.setTDRY1(TDRY1);
    }

    /**
    * Returns the t w e t1 of this varriometa.
    *
    * @return the t w e t1 of this varriometa
    */
    @Override
    public float getTWET1() {
        return _varriometa.getTWET1();
    }

    /**
    * Sets the t w e t1 of this varriometa.
    *
    * @param TWET1 the t w e t1 of this varriometa
    */
    @Override
    public void setTWET1(float TWET1) {
        _varriometa.setTWET1(TWET1);
    }

    /**
    * Returns the t d r y2 of this varriometa.
    *
    * @return the t d r y2 of this varriometa
    */
    @Override
    public float getTDRY2() {
        return _varriometa.getTDRY2();
    }

    /**
    * Sets the t d r y2 of this varriometa.
    *
    * @param TDRY2 the t d r y2 of this varriometa
    */
    @Override
    public void setTDRY2(float TDRY2) {
        _varriometa.setTDRY2(TDRY2);
    }

    /**
    * Returns the t w e t2 of this varriometa.
    *
    * @return the t w e t2 of this varriometa
    */
    @Override
    public float getTWET2() {
        return _varriometa.getTWET2();
    }

    /**
    * Sets the t w e t2 of this varriometa.
    *
    * @param TWET2 the t w e t2 of this varriometa
    */
    @Override
    public void setTWET2(float TWET2) {
        _varriometa.setTWET2(TWET2);
    }

    /**
    * Returns the t d r y3 of this varriometa.
    *
    * @return the t d r y3 of this varriometa
    */
    @Override
    public float getTDRY3() {
        return _varriometa.getTDRY3();
    }

    /**
    * Sets the t d r y3 of this varriometa.
    *
    * @param TDRY3 the t d r y3 of this varriometa
    */
    @Override
    public void setTDRY3(float TDRY3) {
        _varriometa.setTDRY3(TDRY3);
    }

    /**
    * Returns the t w e t3 of this varriometa.
    *
    * @return the t w e t3 of this varriometa
    */
    @Override
    public float getTWET3() {
        return _varriometa.getTWET3();
    }

    /**
    * Sets the t w e t3 of this varriometa.
    *
    * @param TWET3 the t w e t3 of this varriometa
    */
    @Override
    public void setTWET3(float TWET3) {
        _varriometa.setTWET3(TWET3);
    }

    /**
    * Returns the t d r y4 of this varriometa.
    *
    * @return the t d r y4 of this varriometa
    */
    @Override
    public float getTDRY4() {
        return _varriometa.getTDRY4();
    }

    /**
    * Sets the t d r y4 of this varriometa.
    *
    * @param TDRY4 the t d r y4 of this varriometa
    */
    @Override
    public void setTDRY4(float TDRY4) {
        _varriometa.setTDRY4(TDRY4);
    }

    /**
    * Returns the t w e t4 of this varriometa.
    *
    * @return the t w e t4 of this varriometa
    */
    @Override
    public float getTWET4() {
        return _varriometa.getTWET4();
    }

    /**
    * Sets the t w e t4 of this varriometa.
    *
    * @param TWET4 the t w e t4 of this varriometa
    */
    @Override
    public void setTWET4(float TWET4) {
        _varriometa.setTWET4(TWET4);
    }

    /**
    * Returns the s t of this varriometa.
    *
    * @return the s t of this varriometa
    */
    @Override
    public float getST() {
        return _varriometa.getST();
    }

    /**
    * Sets the s t of this varriometa.
    *
    * @param ST the s t of this varriometa
    */
    @Override
    public void setST(float ST) {
        _varriometa.setST(ST);
    }

    /**
    * Returns the w d i r of this varriometa.
    *
    * @return the w d i r of this varriometa
    */
    @Override
    public float getWDIR() {
        return _varriometa.getWDIR();
    }

    /**
    * Sets the w d i r of this varriometa.
    *
    * @param WDIR the w d i r of this varriometa
    */
    @Override
    public void setWDIR(float WDIR) {
        _varriometa.setWDIR(WDIR);
    }

    /**
    * Returns the c p c1 of this varriometa.
    *
    * @return the c p c1 of this varriometa
    */
    @Override
    public float getCPC1() {
        return _varriometa.getCPC1();
    }

    /**
    * Sets the c p c1 of this varriometa.
    *
    * @param CPC1 the c p c1 of this varriometa
    */
    @Override
    public void setCPC1(float CPC1) {
        _varriometa.setCPC1(CPC1);
    }

    /**
    * Returns the o3_0 of this varriometa.
    *
    * @return the o3_0 of this varriometa
    */
    @Override
    public float getO3_0() {
        return _varriometa.getO3_0();
    }

    /**
    * Sets the o3_0 of this varriometa.
    *
    * @param O3_0 the o3_0 of this varriometa
    */
    @Override
    public void setO3_0(float O3_0) {
        _varriometa.setO3_0(O3_0);
    }

    /**
    * Returns the o3_1 of this varriometa.
    *
    * @return the o3_1 of this varriometa
    */
    @Override
    public float getO3_1() {
        return _varriometa.getO3_1();
    }

    /**
    * Sets the o3_1 of this varriometa.
    *
    * @param O3_1 the o3_1 of this varriometa
    */
    @Override
    public void setO3_1(float O3_1) {
        _varriometa.setO3_1(O3_1);
    }

    /**
    * Returns the o3_2 of this varriometa.
    *
    * @return the o3_2 of this varriometa
    */
    @Override
    public float getO3_2() {
        return _varriometa.getO3_2();
    }

    /**
    * Sets the o3_2 of this varriometa.
    *
    * @param O3_2 the o3_2 of this varriometa
    */
    @Override
    public void setO3_2(float O3_2) {
        _varriometa.setO3_2(O3_2);
    }

    /**
    * Returns the o3_3 of this varriometa.
    *
    * @return the o3_3 of this varriometa
    */
    @Override
    public float getO3_3() {
        return _varriometa.getO3_3();
    }

    /**
    * Sets the o3_3 of this varriometa.
    *
    * @param O3_3 the o3_3 of this varriometa
    */
    @Override
    public void setO3_3(float O3_3) {
        _varriometa.setO3_3(O3_3);
    }

    /**
    * Returns the o3_4 of this varriometa.
    *
    * @return the o3_4 of this varriometa
    */
    @Override
    public float getO3_4() {
        return _varriometa.getO3_4();
    }

    /**
    * Sets the o3_4 of this varriometa.
    *
    * @param O3_4 the o3_4 of this varriometa
    */
    @Override
    public void setO3_4(float O3_4) {
        _varriometa.setO3_4(O3_4);
    }

    /**
    * Returns the s o2_0 of this varriometa.
    *
    * @return the s o2_0 of this varriometa
    */
    @Override
    public float getSO2_0() {
        return _varriometa.getSO2_0();
    }

    /**
    * Sets the s o2_0 of this varriometa.
    *
    * @param SO2_0 the s o2_0 of this varriometa
    */
    @Override
    public void setSO2_0(float SO2_0) {
        _varriometa.setSO2_0(SO2_0);
    }

    /**
    * Returns the s o2_1 of this varriometa.
    *
    * @return the s o2_1 of this varriometa
    */
    @Override
    public float getSO2_1() {
        return _varriometa.getSO2_1();
    }

    /**
    * Sets the s o2_1 of this varriometa.
    *
    * @param SO2_1 the s o2_1 of this varriometa
    */
    @Override
    public void setSO2_1(float SO2_1) {
        _varriometa.setSO2_1(SO2_1);
    }

    /**
    * Returns the s o2_2 of this varriometa.
    *
    * @return the s o2_2 of this varriometa
    */
    @Override
    public float getSO2_2() {
        return _varriometa.getSO2_2();
    }

    /**
    * Sets the s o2_2 of this varriometa.
    *
    * @param SO2_2 the s o2_2 of this varriometa
    */
    @Override
    public void setSO2_2(float SO2_2) {
        _varriometa.setSO2_2(SO2_2);
    }

    /**
    * Returns the s o2_3 of this varriometa.
    *
    * @return the s o2_3 of this varriometa
    */
    @Override
    public float getSO2_3() {
        return _varriometa.getSO2_3();
    }

    /**
    * Sets the s o2_3 of this varriometa.
    *
    * @param SO2_3 the s o2_3 of this varriometa
    */
    @Override
    public void setSO2_3(float SO2_3) {
        _varriometa.setSO2_3(SO2_3);
    }

    /**
    * Returns the s o2_4 of this varriometa.
    *
    * @return the s o2_4 of this varriometa
    */
    @Override
    public float getSO2_4() {
        return _varriometa.getSO2_4();
    }

    /**
    * Sets the s o2_4 of this varriometa.
    *
    * @param SO2_4 the s o2_4 of this varriometa
    */
    @Override
    public void setSO2_4(float SO2_4) {
        _varriometa.setSO2_4(SO2_4);
    }

    /**
    * Returns the n o_0 of this varriometa.
    *
    * @return the n o_0 of this varriometa
    */
    @Override
    public float getNO_0() {
        return _varriometa.getNO_0();
    }

    /**
    * Sets the n o_0 of this varriometa.
    *
    * @param NO_0 the n o_0 of this varriometa
    */
    @Override
    public void setNO_0(float NO_0) {
        _varriometa.setNO_0(NO_0);
    }

    /**
    * Returns the n o_1 of this varriometa.
    *
    * @return the n o_1 of this varriometa
    */
    @Override
    public float getNO_1() {
        return _varriometa.getNO_1();
    }

    /**
    * Sets the n o_1 of this varriometa.
    *
    * @param NO_1 the n o_1 of this varriometa
    */
    @Override
    public void setNO_1(float NO_1) {
        _varriometa.setNO_1(NO_1);
    }

    /**
    * Returns the n o_2 of this varriometa.
    *
    * @return the n o_2 of this varriometa
    */
    @Override
    public float getNO_2() {
        return _varriometa.getNO_2();
    }

    /**
    * Sets the n o_2 of this varriometa.
    *
    * @param NO_2 the n o_2 of this varriometa
    */
    @Override
    public void setNO_2(float NO_2) {
        _varriometa.setNO_2(NO_2);
    }

    /**
    * Returns the n o_4 of this varriometa.
    *
    * @return the n o_4 of this varriometa
    */
    @Override
    public float getNO_4() {
        return _varriometa.getNO_4();
    }

    /**
    * Sets the n o_4 of this varriometa.
    *
    * @param NO_4 the n o_4 of this varriometa
    */
    @Override
    public void setNO_4(float NO_4) {
        _varriometa.setNO_4(NO_4);
    }

    /**
    * Returns the n o x_0 of this varriometa.
    *
    * @return the n o x_0 of this varriometa
    */
    @Override
    public float getNOX_0() {
        return _varriometa.getNOX_0();
    }

    /**
    * Sets the n o x_0 of this varriometa.
    *
    * @param NOX_0 the n o x_0 of this varriometa
    */
    @Override
    public void setNOX_0(float NOX_0) {
        _varriometa.setNOX_0(NOX_0);
    }

    /**
    * Returns the n o x_1 of this varriometa.
    *
    * @return the n o x_1 of this varriometa
    */
    @Override
    public float getNOX_1() {
        return _varriometa.getNOX_1();
    }

    /**
    * Sets the n o x_1 of this varriometa.
    *
    * @param NOX_1 the n o x_1 of this varriometa
    */
    @Override
    public void setNOX_1(float NOX_1) {
        _varriometa.setNOX_1(NOX_1);
    }

    /**
    * Returns the n o x_2 of this varriometa.
    *
    * @return the n o x_2 of this varriometa
    */
    @Override
    public float getNOX_2() {
        return _varriometa.getNOX_2();
    }

    /**
    * Sets the n o x_2 of this varriometa.
    *
    * @param NOX_2 the n o x_2 of this varriometa
    */
    @Override
    public void setNOX_2(float NOX_2) {
        _varriometa.setNOX_2(NOX_2);
    }

    /**
    * Returns the n o x_4 of this varriometa.
    *
    * @return the n o x_4 of this varriometa
    */
    @Override
    public float getNOX_4() {
        return _varriometa.getNOX_4();
    }

    /**
    * Sets the n o x_4 of this varriometa.
    *
    * @param NOX_4 the n o x_4 of this varriometa
    */
    @Override
    public void setNOX_4(float NOX_4) {
        _varriometa.setNOX_4(NOX_4);
    }

    /**
    * Returns the p of this varriometa.
    *
    * @return the p of this varriometa
    */
    @Override
    public float getP() {
        return _varriometa.getP();
    }

    /**
    * Sets the p of this varriometa.
    *
    * @param P the p of this varriometa
    */
    @Override
    public void setP(float P) {
        _varriometa.setP(P);
    }

    /**
    * Returns the h u m_ r h of this varriometa.
    *
    * @return the h u m_ r h of this varriometa
    */
    @Override
    public float getHUM_RH() {
        return _varriometa.getHUM_RH();
    }

    /**
    * Sets the h u m_ r h of this varriometa.
    *
    * @param HUM_RH the h u m_ r h of this varriometa
    */
    @Override
    public void setHUM_RH(float HUM_RH) {
        _varriometa.setHUM_RH(HUM_RH);
    }

    /**
    * Returns the h u m_ t of this varriometa.
    *
    * @return the h u m_ t of this varriometa
    */
    @Override
    public float getHUM_T() {
        return _varriometa.getHUM_T();
    }

    /**
    * Sets the h u m_ t of this varriometa.
    *
    * @param HUM_T the h u m_ t of this varriometa
    */
    @Override
    public void setHUM_T(float HUM_T) {
        _varriometa.setHUM_T(HUM_T);
    }

    /**
    * Returns the temp of this varriometa.
    *
    * @return the temp of this varriometa
    */
    @Override
    public float getTemp() {
        return _varriometa.getTemp();
    }

    /**
    * Sets the temp of this varriometa.
    *
    * @param temp the temp of this varriometa
    */
    @Override
    public void setTemp(float temp) {
        _varriometa.setTemp(temp);
    }

    /**
    * Returns the w s00 of this varriometa.
    *
    * @return the w s00 of this varriometa
    */
    @Override
    public float getWS00() {
        return _varriometa.getWS00();
    }

    /**
    * Sets the w s00 of this varriometa.
    *
    * @param WS00 the w s00 of this varriometa
    */
    @Override
    public void setWS00(float WS00) {
        _varriometa.setWS00(WS00);
    }

    /**
    * Returns the visibility of this varriometa.
    *
    * @return the visibility of this varriometa
    */
    @Override
    public float getVisibility() {
        return _varriometa.getVisibility();
    }

    /**
    * Sets the visibility of this varriometa.
    *
    * @param visibility the visibility of this varriometa
    */
    @Override
    public void setVisibility(float visibility) {
        _varriometa.setVisibility(visibility);
    }

    /**
    * Returns the rainint of this varriometa.
    *
    * @return the rainint of this varriometa
    */
    @Override
    public float getRainint() {
        return _varriometa.getRainint();
    }

    /**
    * Sets the rainint of this varriometa.
    *
    * @param rainint the rainint of this varriometa
    */
    @Override
    public void setRainint(float rainint) {
        _varriometa.setRainint(rainint);
    }

    /**
    * Returns the precipacc of this varriometa.
    *
    * @return the precipacc of this varriometa
    */
    @Override
    public float getPrecipacc() {
        return _varriometa.getPrecipacc();
    }

    /**
    * Sets the precipacc of this varriometa.
    *
    * @param Precipacc the precipacc of this varriometa
    */
    @Override
    public void setPrecipacc(float Precipacc) {
        _varriometa.setPrecipacc(Precipacc);
    }

    /**
    * Returns the haildiammax of this varriometa.
    *
    * @return the haildiammax of this varriometa
    */
    @Override
    public float getHaildiammax() {
        return _varriometa.getHaildiammax();
    }

    /**
    * Sets the haildiammax of this varriometa.
    *
    * @param haildiammax the haildiammax of this varriometa
    */
    @Override
    public void setHaildiammax(float haildiammax) {
        _varriometa.setHaildiammax(haildiammax);
    }

    /**
    * Returns the snowint of this varriometa.
    *
    * @return the snowint of this varriometa
    */
    @Override
    public float getSnowint() {
        return _varriometa.getSnowint();
    }

    /**
    * Sets the snowint of this varriometa.
    *
    * @param snowint the snowint of this varriometa
    */
    @Override
    public void setSnowint(float snowint) {
        _varriometa.setSnowint(snowint);
    }

    /**
    * Returns the visibilitylpm of this varriometa.
    *
    * @return the visibilitylpm of this varriometa
    */
    @Override
    public float getVisibilitylpm() {
        return _varriometa.getVisibilitylpm();
    }

    /**
    * Sets the visibilitylpm of this varriometa.
    *
    * @param visibilitylpm the visibilitylpm of this varriometa
    */
    @Override
    public void setVisibilitylpm(float visibilitylpm) {
        _varriometa.setVisibilitylpm(visibilitylpm);
    }

    /**
    * Returns the wthcode of this varriometa.
    *
    * @return the wthcode of this varriometa
    */
    @Override
    public int getWthcode() {
        return _varriometa.getWthcode();
    }

    /**
    * Sets the wthcode of this varriometa.
    *
    * @param wthcode the wthcode of this varriometa
    */
    @Override
    public void setWthcode(int wthcode) {
        _varriometa.setWthcode(wthcode);
    }

    /**
    * Returns the c o_1 of this varriometa.
    *
    * @return the c o_1 of this varriometa
    */
    @Override
    public float getCO_1() {
        return _varriometa.getCO_1();
    }

    /**
    * Sets the c o_1 of this varriometa.
    *
    * @param CO_1 the c o_1 of this varriometa
    */
    @Override
    public void setCO_1(float CO_1) {
        _varriometa.setCO_1(CO_1);
    }

    /**
    * Returns the quality of this varriometa.
    *
    * @return the quality of this varriometa
    */
    @Override
    public int getQuality() {
        return _varriometa.getQuality();
    }

    /**
    * Sets the quality of this varriometa.
    *
    * @param quality the quality of this varriometa
    */
    @Override
    public void setQuality(int quality) {
        _varriometa.setQuality(quality);
    }

    /**
    * Returns the tsoil of this varriometa.
    *
    * @return the tsoil of this varriometa
    */
    @Override
    public float getTsoil() {
        return _varriometa.getTsoil();
    }

    /**
    * Sets the tsoil of this varriometa.
    *
    * @param Tsoil the tsoil of this varriometa
    */
    @Override
    public void setTsoil(float Tsoil) {
        _varriometa.setTsoil(Tsoil);
    }

    /**
    * Returns the wsoil of this varriometa.
    *
    * @return the wsoil of this varriometa
    */
    @Override
    public float getWsoil() {
        return _varriometa.getWsoil();
    }

    /**
    * Sets the wsoil of this varriometa.
    *
    * @param wsoil the wsoil of this varriometa
    */
    @Override
    public void setWsoil(float wsoil) {
        _varriometa.setWsoil(wsoil);
    }

    /**
    * Returns the c o206 of this varriometa.
    *
    * @return the c o206 of this varriometa
    */
    @Override
    public float getCO206() {
        return _varriometa.getCO206();
    }

    /**
    * Sets the c o206 of this varriometa.
    *
    * @param CO206 the c o206 of this varriometa
    */
    @Override
    public void setCO206(float CO206) {
        _varriometa.setCO206(CO206);
    }

    /**
    * Returns the c o2soil of this varriometa.
    *
    * @return the c o2soil of this varriometa
    */
    @Override
    public float getCO2soil() {
        return _varriometa.getCO2soil();
    }

    /**
    * Sets the c o2soil of this varriometa.
    *
    * @param CO2soil the c o2soil of this varriometa
    */
    @Override
    public void setCO2soil(float CO2soil) {
        _varriometa.setCO2soil(CO2soil);
    }

    /**
    * Returns the tsoil_ e m e p of this varriometa.
    *
    * @return the tsoil_ e m e p of this varriometa
    */
    @Override
    public int getTsoil_EMEP() {
        return _varriometa.getTsoil_EMEP();
    }

    /**
    * Sets the tsoil_ e m e p of this varriometa.
    *
    * @param Tsoil_EMEP the tsoil_ e m e p of this varriometa
    */
    @Override
    public void setTsoil_EMEP(int Tsoil_EMEP) {
        _varriometa.setTsoil_EMEP(Tsoil_EMEP);
    }

    /**
    * Returns the wsoil_ e m e p of this varriometa.
    *
    * @return the wsoil_ e m e p of this varriometa
    */
    @Override
    public int getWsoil_EMEP() {
        return _varriometa.getWsoil_EMEP();
    }

    /**
    * Sets the wsoil_ e m e p of this varriometa.
    *
    * @param wsoil_EMEP the wsoil_ e m e p of this varriometa
    */
    @Override
    public void setWsoil_EMEP(int wsoil_EMEP) {
        _varriometa.setWsoil_EMEP(wsoil_EMEP);
    }

    /**
    * Returns the c o206_ e m e p of this varriometa.
    *
    * @return the c o206_ e m e p of this varriometa
    */
    @Override
    public int getCO206_EMEP() {
        return _varriometa.getCO206_EMEP();
    }

    /**
    * Sets the c o206_ e m e p of this varriometa.
    *
    * @param CO206_EMEP the c o206_ e m e p of this varriometa
    */
    @Override
    public void setCO206_EMEP(int CO206_EMEP) {
        _varriometa.setCO206_EMEP(CO206_EMEP);
    }

    /**
    * Returns the c o2soil_ e m e p of this varriometa.
    *
    * @return the c o2soil_ e m e p of this varriometa
    */
    @Override
    public int getCO2soil_EMEP() {
        return _varriometa.getCO2soil_EMEP();
    }

    /**
    * Sets the c o2soil_ e m e p of this varriometa.
    *
    * @param CO2soil_EMEP the c o2soil_ e m e p of this varriometa
    */
    @Override
    public void setCO2soil_EMEP(int CO2soil_EMEP) {
        _varriometa.setCO2soil_EMEP(CO2soil_EMEP);
    }

    @Override
    public boolean isNew() {
        return _varriometa.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _varriometa.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _varriometa.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _varriometa.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _varriometa.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _varriometa.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _varriometa.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _varriometa.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _varriometa.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _varriometa.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _varriometa.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VarriometaWrapper((Varriometa) _varriometa.clone());
    }

    @Override
    public int compareTo(Varriometa varriometa) {
        return _varriometa.compareTo(varriometa);
    }

    @Override
    public int hashCode() {
        return _varriometa.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Varriometa> toCacheModel() {
        return _varriometa.toCacheModel();
    }

    @Override
    public Varriometa toEscapedModel() {
        return new VarriometaWrapper(_varriometa.toEscapedModel());
    }

    @Override
    public Varriometa toUnescapedModel() {
        return new VarriometaWrapper(_varriometa.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _varriometa.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _varriometa.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _varriometa.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VarriometaWrapper)) {
            return false;
        }

        VarriometaWrapper varriometaWrapper = (VarriometaWrapper) obj;

        if (Validator.equals(_varriometa, varriometaWrapper._varriometa)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Varriometa getWrappedVarriometa() {
        return _varriometa;
    }

    @Override
    public Varriometa getWrappedModel() {
        return _varriometa;
    }

    @Override
    public void resetOriginalValues() {
        _varriometa.resetOriginalValues();
    }
}
