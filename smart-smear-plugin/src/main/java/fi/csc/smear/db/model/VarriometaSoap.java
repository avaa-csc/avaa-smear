package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.VarriometaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.VarriometaServiceSoap
 * @generated
 */
public class VarriometaSoap implements Serializable {
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

    public VarriometaSoap() {
    }

    public static VarriometaSoap toSoapModel(Varriometa model) {
        VarriometaSoap soapModel = new VarriometaSoap();

        soapModel.setSAMPTIME(model.getSAMPTIME());
        soapModel.setWS0(model.getWS0());
        soapModel.setWS1(model.getWS1());
        soapModel.setWS2(model.getWS2());
        soapModel.setWS3(model.getWS3());
        soapModel.setWS4(model.getWS4());
        soapModel.setRMM(model.getRMM());
        soapModel.setTLOG(model.getTLOG());
        soapModel.setPAR(model.getPAR());
        soapModel.setGLOB(model.getGLOB());
        soapModel.setREFL(model.getREFL());
        soapModel.setNET(model.getNET());
        soapModel.setUVA(model.getUVA());
        soapModel.setUVB(model.getUVB());
        soapModel.setUVAT(model.getUVAT());
        soapModel.setUVBT(model.getUVBT());
        soapModel.setRAIN(model.getRAIN());
        soapModel.setTDRY0(model.getTDRY0());
        soapModel.setTWET0(model.getTWET0());
        soapModel.setTDRY1(model.getTDRY1());
        soapModel.setTWET1(model.getTWET1());
        soapModel.setTDRY2(model.getTDRY2());
        soapModel.setTWET2(model.getTWET2());
        soapModel.setTDRY3(model.getTDRY3());
        soapModel.setTWET3(model.getTWET3());
        soapModel.setTDRY4(model.getTDRY4());
        soapModel.setTWET4(model.getTWET4());
        soapModel.setST(model.getST());
        soapModel.setWDIR(model.getWDIR());
        soapModel.setCPC1(model.getCPC1());
        soapModel.setO3_0(model.getO3_0());
        soapModel.setO3_1(model.getO3_1());
        soapModel.setO3_2(model.getO3_2());
        soapModel.setO3_3(model.getO3_3());
        soapModel.setO3_4(model.getO3_4());
        soapModel.setSO2_0(model.getSO2_0());
        soapModel.setSO2_1(model.getSO2_1());
        soapModel.setSO2_2(model.getSO2_2());
        soapModel.setSO2_3(model.getSO2_3());
        soapModel.setSO2_4(model.getSO2_4());
        soapModel.setNO_0(model.getNO_0());
        soapModel.setNO_1(model.getNO_1());
        soapModel.setNO_2(model.getNO_2());
        soapModel.setNO_4(model.getNO_4());
        soapModel.setNOX_0(model.getNOX_0());
        soapModel.setNOX_1(model.getNOX_1());
        soapModel.setNOX_2(model.getNOX_2());
        soapModel.setNOX_4(model.getNOX_4());
        soapModel.setP(model.getP());
        soapModel.setHUM_RH(model.getHUM_RH());
        soapModel.setHUM_T(model.getHUM_T());
        soapModel.setTemp(model.getTemp());
        soapModel.setWS00(model.getWS00());
        soapModel.setVisibility(model.getVisibility());
        soapModel.setRainint(model.getRainint());
        soapModel.setPrecipacc(model.getPrecipacc());
        soapModel.setHaildiammax(model.getHaildiammax());
        soapModel.setSnowint(model.getSnowint());
        soapModel.setVisibilitylpm(model.getVisibilitylpm());
        soapModel.setWthcode(model.getWthcode());
        soapModel.setCO_1(model.getCO_1());
        soapModel.setQuality(model.getQuality());
        soapModel.setTsoil(model.getTsoil());
        soapModel.setWsoil(model.getWsoil());
        soapModel.setCO206(model.getCO206());
        soapModel.setCO2soil(model.getCO2soil());
        soapModel.setTsoil_EMEP(model.getTsoil_EMEP());
        soapModel.setWsoil_EMEP(model.getWsoil_EMEP());
        soapModel.setCO206_EMEP(model.getCO206_EMEP());
        soapModel.setCO2soil_EMEP(model.getCO2soil_EMEP());

        return soapModel;
    }

    public static VarriometaSoap[] toSoapModels(Varriometa[] models) {
        VarriometaSoap[] soapModels = new VarriometaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VarriometaSoap[][] toSoapModels(Varriometa[][] models) {
        VarriometaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VarriometaSoap[models.length][models[0].length];
        } else {
            soapModels = new VarriometaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VarriometaSoap[] toSoapModels(List<Varriometa> models) {
        List<VarriometaSoap> soapModels = new ArrayList<VarriometaSoap>(models.size());

        for (Varriometa model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VarriometaSoap[soapModels.size()]);
    }

    public java.util.Date getPrimaryKey() {
        return _SAMPTIME;
    }

    public void setPrimaryKey(java.util.Date pk) {
        setSAMPTIME(pk);
    }

    public Date getSAMPTIME() {
        return _SAMPTIME;
    }

    public void setSAMPTIME(Date SAMPTIME) {
        _SAMPTIME = SAMPTIME;
    }

    public float getWS0() {
        return _WS0;
    }

    public void setWS0(float WS0) {
        _WS0 = WS0;
    }

    public float getWS1() {
        return _WS1;
    }

    public void setWS1(float WS1) {
        _WS1 = WS1;
    }

    public float getWS2() {
        return _WS2;
    }

    public void setWS2(float WS2) {
        _WS2 = WS2;
    }

    public float getWS3() {
        return _WS3;
    }

    public void setWS3(float WS3) {
        _WS3 = WS3;
    }

    public float getWS4() {
        return _WS4;
    }

    public void setWS4(float WS4) {
        _WS4 = WS4;
    }

    public float getRMM() {
        return _RMM;
    }

    public void setRMM(float RMM) {
        _RMM = RMM;
    }

    public float getTLOG() {
        return _TLOG;
    }

    public void setTLOG(float TLOG) {
        _TLOG = TLOG;
    }

    public float getPAR() {
        return _PAR;
    }

    public void setPAR(float PAR) {
        _PAR = PAR;
    }

    public float getGLOB() {
        return _GLOB;
    }

    public void setGLOB(float GLOB) {
        _GLOB = GLOB;
    }

    public float getREFL() {
        return _REFL;
    }

    public void setREFL(float REFL) {
        _REFL = REFL;
    }

    public float getNET() {
        return _NET;
    }

    public void setNET(float NET) {
        _NET = NET;
    }

    public float getUVA() {
        return _UVA;
    }

    public void setUVA(float UVA) {
        _UVA = UVA;
    }

    public float getUVB() {
        return _UVB;
    }

    public void setUVB(float UVB) {
        _UVB = UVB;
    }

    public float getUVAT() {
        return _UVAT;
    }

    public void setUVAT(float UVAT) {
        _UVAT = UVAT;
    }

    public float getUVBT() {
        return _UVBT;
    }

    public void setUVBT(float UVBT) {
        _UVBT = UVBT;
    }

    public float getRAIN() {
        return _RAIN;
    }

    public void setRAIN(float RAIN) {
        _RAIN = RAIN;
    }

    public float getTDRY0() {
        return _TDRY0;
    }

    public void setTDRY0(float TDRY0) {
        _TDRY0 = TDRY0;
    }

    public float getTWET0() {
        return _TWET0;
    }

    public void setTWET0(float TWET0) {
        _TWET0 = TWET0;
    }

    public float getTDRY1() {
        return _TDRY1;
    }

    public void setTDRY1(float TDRY1) {
        _TDRY1 = TDRY1;
    }

    public float getTWET1() {
        return _TWET1;
    }

    public void setTWET1(float TWET1) {
        _TWET1 = TWET1;
    }

    public float getTDRY2() {
        return _TDRY2;
    }

    public void setTDRY2(float TDRY2) {
        _TDRY2 = TDRY2;
    }

    public float getTWET2() {
        return _TWET2;
    }

    public void setTWET2(float TWET2) {
        _TWET2 = TWET2;
    }

    public float getTDRY3() {
        return _TDRY3;
    }

    public void setTDRY3(float TDRY3) {
        _TDRY3 = TDRY3;
    }

    public float getTWET3() {
        return _TWET3;
    }

    public void setTWET3(float TWET3) {
        _TWET3 = TWET3;
    }

    public float getTDRY4() {
        return _TDRY4;
    }

    public void setTDRY4(float TDRY4) {
        _TDRY4 = TDRY4;
    }

    public float getTWET4() {
        return _TWET4;
    }

    public void setTWET4(float TWET4) {
        _TWET4 = TWET4;
    }

    public float getST() {
        return _ST;
    }

    public void setST(float ST) {
        _ST = ST;
    }

    public float getWDIR() {
        return _WDIR;
    }

    public void setWDIR(float WDIR) {
        _WDIR = WDIR;
    }

    public float getCPC1() {
        return _CPC1;
    }

    public void setCPC1(float CPC1) {
        _CPC1 = CPC1;
    }

    public float getO3_0() {
        return _O3_0;
    }

    public void setO3_0(float O3_0) {
        _O3_0 = O3_0;
    }

    public float getO3_1() {
        return _O3_1;
    }

    public void setO3_1(float O3_1) {
        _O3_1 = O3_1;
    }

    public float getO3_2() {
        return _O3_2;
    }

    public void setO3_2(float O3_2) {
        _O3_2 = O3_2;
    }

    public float getO3_3() {
        return _O3_3;
    }

    public void setO3_3(float O3_3) {
        _O3_3 = O3_3;
    }

    public float getO3_4() {
        return _O3_4;
    }

    public void setO3_4(float O3_4) {
        _O3_4 = O3_4;
    }

    public float getSO2_0() {
        return _SO2_0;
    }

    public void setSO2_0(float SO2_0) {
        _SO2_0 = SO2_0;
    }

    public float getSO2_1() {
        return _SO2_1;
    }

    public void setSO2_1(float SO2_1) {
        _SO2_1 = SO2_1;
    }

    public float getSO2_2() {
        return _SO2_2;
    }

    public void setSO2_2(float SO2_2) {
        _SO2_2 = SO2_2;
    }

    public float getSO2_3() {
        return _SO2_3;
    }

    public void setSO2_3(float SO2_3) {
        _SO2_3 = SO2_3;
    }

    public float getSO2_4() {
        return _SO2_4;
    }

    public void setSO2_4(float SO2_4) {
        _SO2_4 = SO2_4;
    }

    public float getNO_0() {
        return _NO_0;
    }

    public void setNO_0(float NO_0) {
        _NO_0 = NO_0;
    }

    public float getNO_1() {
        return _NO_1;
    }

    public void setNO_1(float NO_1) {
        _NO_1 = NO_1;
    }

    public float getNO_2() {
        return _NO_2;
    }

    public void setNO_2(float NO_2) {
        _NO_2 = NO_2;
    }

    public float getNO_4() {
        return _NO_4;
    }

    public void setNO_4(float NO_4) {
        _NO_4 = NO_4;
    }

    public float getNOX_0() {
        return _NOX_0;
    }

    public void setNOX_0(float NOX_0) {
        _NOX_0 = NOX_0;
    }

    public float getNOX_1() {
        return _NOX_1;
    }

    public void setNOX_1(float NOX_1) {
        _NOX_1 = NOX_1;
    }

    public float getNOX_2() {
        return _NOX_2;
    }

    public void setNOX_2(float NOX_2) {
        _NOX_2 = NOX_2;
    }

    public float getNOX_4() {
        return _NOX_4;
    }

    public void setNOX_4(float NOX_4) {
        _NOX_4 = NOX_4;
    }

    public float getP() {
        return _P;
    }

    public void setP(float P) {
        _P = P;
    }

    public float getHUM_RH() {
        return _HUM_RH;
    }

    public void setHUM_RH(float HUM_RH) {
        _HUM_RH = HUM_RH;
    }

    public float getHUM_T() {
        return _HUM_T;
    }

    public void setHUM_T(float HUM_T) {
        _HUM_T = HUM_T;
    }

    public float getTemp() {
        return _temp;
    }

    public void setTemp(float temp) {
        _temp = temp;
    }

    public float getWS00() {
        return _WS00;
    }

    public void setWS00(float WS00) {
        _WS00 = WS00;
    }

    public float getVisibility() {
        return _visibility;
    }

    public void setVisibility(float visibility) {
        _visibility = visibility;
    }

    public float getRainint() {
        return _rainint;
    }

    public void setRainint(float rainint) {
        _rainint = rainint;
    }

    public float getPrecipacc() {
        return _Precipacc;
    }

    public void setPrecipacc(float Precipacc) {
        _Precipacc = Precipacc;
    }

    public float getHaildiammax() {
        return _haildiammax;
    }

    public void setHaildiammax(float haildiammax) {
        _haildiammax = haildiammax;
    }

    public float getSnowint() {
        return _snowint;
    }

    public void setSnowint(float snowint) {
        _snowint = snowint;
    }

    public float getVisibilitylpm() {
        return _visibilitylpm;
    }

    public void setVisibilitylpm(float visibilitylpm) {
        _visibilitylpm = visibilitylpm;
    }

    public int getWthcode() {
        return _wthcode;
    }

    public void setWthcode(int wthcode) {
        _wthcode = wthcode;
    }

    public float getCO_1() {
        return _CO_1;
    }

    public void setCO_1(float CO_1) {
        _CO_1 = CO_1;
    }

    public int getQuality() {
        return _quality;
    }

    public void setQuality(int quality) {
        _quality = quality;
    }

    public float getTsoil() {
        return _Tsoil;
    }

    public void setTsoil(float Tsoil) {
        _Tsoil = Tsoil;
    }

    public float getWsoil() {
        return _wsoil;
    }

    public void setWsoil(float wsoil) {
        _wsoil = wsoil;
    }

    public float getCO206() {
        return _CO206;
    }

    public void setCO206(float CO206) {
        _CO206 = CO206;
    }

    public float getCO2soil() {
        return _CO2soil;
    }

    public void setCO2soil(float CO2soil) {
        _CO2soil = CO2soil;
    }

    public int getTsoil_EMEP() {
        return _Tsoil_EMEP;
    }

    public void setTsoil_EMEP(int Tsoil_EMEP) {
        _Tsoil_EMEP = Tsoil_EMEP;
    }

    public int getWsoil_EMEP() {
        return _wsoil_EMEP;
    }

    public void setWsoil_EMEP(int wsoil_EMEP) {
        _wsoil_EMEP = wsoil_EMEP;
    }

    public int getCO206_EMEP() {
        return _CO206_EMEP;
    }

    public void setCO206_EMEP(int CO206_EMEP) {
        _CO206_EMEP = CO206_EMEP;
    }

    public int getCO2soil_EMEP() {
        return _CO2soil_EMEP;
    }

    public void setCO2soil_EMEP(int CO2soil_EMEP) {
        _CO2soil_EMEP = CO2soil_EMEP;
    }
}
