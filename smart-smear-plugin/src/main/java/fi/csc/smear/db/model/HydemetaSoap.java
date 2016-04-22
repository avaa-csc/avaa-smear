package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.HydemetaServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.HydemetaServiceSoap
 * @generated
 */
public class HydemetaSoap implements Serializable {
    private Date _samptime;
    private float _UV_A;
    private float _UV_B;
    private float _diffPAR;
    private float _diffGLOB;
    private float _dirGLOB;
    private float _Net;
    private float _RGlob;
    private float _Glob;
    private float _RPAR;
    private float _PAR;
    private float _dirPAR;
    private float _canIR;
    private float _skyIR;
    private float _Precip;
    private float _SWS;
    private float _Td;
    private float _Pamb0;
    private float _T672;
    private float _T504;
    private float _T336;
    private float _T168;
    private float _T84;
    private float _T42;
    private float _WS672;
    private float _WS504;
    private float _WS336;
    private float _WS168;
    private float _WS84;
    private float _WS42;
    private float _WSU740;
    private float _WSU336;
    private float _WSU168;
    private float _WSU84;
    private float _WD;
    private float _WD504;
    private float _WD336;
    private float _WD168;
    private float _WDU740;
    private float _WDU336;
    private float _WDU168;
    private float _WDU84;
    private float _NO672;
    private float _NO504;
    private float _NO336;
    private float _NO168;
    private float _NO84;
    private float _NO42;
    private float _NOx672;
    private float _NOx504;
    private float _NOx336;
    private float _NOx168;
    private float _NOx84;
    private float _NOx42;
    private float _O3672;
    private float _O3504;
    private float _O3336;
    private float _O3168;
    private float _O384;
    private float _O342;
    private float _SO2672;
    private float _SO2504;
    private float _SO2336;
    private float _SO2168;
    private float _SO284;
    private float _SO242;
    private float _H2O672;
    private float _H2O504;
    private float _H2O336;
    private float _H2O168;
    private float _H2O84;
    private float _H2O42;
    private float _CO2672;
    private float _CO2504;
    private float _CO2336;
    private float _CO2168;
    private float _CO284;
    private float _CO242;
    private float _H2S672;
    private float _H2S504;
    private float _H2S336;
    private float _H2S168;
    private float _H2S84;
    private float _H2S42;
    private float _RHIRGA672;
    private float _RHIRGA504;
    private float _RHIRGA336;
    private float _RHIRGA168;
    private float _RHIRGA84;
    private float _RHIRGA42;
    private float _CO672;
    private float _CO504;
    private float _CO336;
    private float _CO168;
    private float _CO84;
    private float _CO42;
    private float _RHTd;
    private float _PTG;
    private float _Visibility;
    private float _Visibilitymin;
    private float _Visibilitymax;
    private float _Precipint;
    private float _Precipintmin;
    private float _Precipintmax;
    private float _Precipacc;
    private float _Snowfallacc;
    private int _wthcode;
    private int _wthcodemin;
    private int _wthcodemax;
    private float _tsoil_humus;
    private float _tsoil_A;
    private float _tsoil_B1;
    private float _tsoil_B2;
    private float _tsoil_C1;
    private float _H2OTd;
    private float _CO2_storage_flux;
    private float _wsoil_humus;
    private float _wsoil_A;
    private float _wsoil_B1;
    private float _wsoil_B2;
    private float _wsoil_C1;
    private float _LWin;
    private float _LWout;
    private float _PRI;
    private float _NDVI;
    private float _BNDVI;
    private float _canPAR1;
    private float _canPAR2;
    private float _canPAR3;
    private float _maaPAR;
    private float _maaNet;
    private float _PAR2;
    private float _Globmast;
    private float _WDU672;
    private float _WSU672;
    private float _RGlob125;
    private float _CH4168;
    private float _CH4672;
    private float _CH41250;
    private float _T1250;
    private float _wpsoil_A;
    private float _wpsoil_B;
    private float _runoff1;
    private float _runoff2;
    private float _drainage1;
    private float _CO2icos168;
    private float _CO2icos672;
    private float _CO2icos1250;
    private float _H2Oicos168;
    private float _H2Oicos672;
    private float _H2Oicos1250;
    private int _UV_A_EMEP;
    private int _UV_B_EMEP;
    private int _diffPAR_EMEP;
    private int _diffGLOB_EMEP;
    private int _dirGLOB_EMEP;
    private int _Net_EMEP;
    private int _RGlob_EMEP;
    private int _Glob_EMEP;
    private int _RPAR_EMEP;
    private int _PAR_EMEP;
    private int _dirPAR_EMEP;
    private int _canIR_EMEP;

    public HydemetaSoap() {
    }

    public static HydemetaSoap toSoapModel(Hydemeta model) {
        HydemetaSoap soapModel = new HydemetaSoap();

        soapModel.setSamptime(model.getSamptime());
        soapModel.setUV_A(model.getUV_A());
        soapModel.setUV_B(model.getUV_B());
        soapModel.setDiffPAR(model.getDiffPAR());
        soapModel.setDiffGLOB(model.getDiffGLOB());
        soapModel.setDirGLOB(model.getDirGLOB());
        soapModel.setNet(model.getNet());
        soapModel.setRGlob(model.getRGlob());
        soapModel.setGlob(model.getGlob());
        soapModel.setRPAR(model.getRPAR());
        soapModel.setPAR(model.getPAR());
        soapModel.setDirPAR(model.getDirPAR());
        soapModel.setCanIR(model.getCanIR());
        soapModel.setSkyIR(model.getSkyIR());
        soapModel.setPrecip(model.getPrecip());
        soapModel.setSWS(model.getSWS());
        soapModel.setTd(model.getTd());
        soapModel.setPamb0(model.getPamb0());
        soapModel.setT672(model.getT672());
        soapModel.setT504(model.getT504());
        soapModel.setT336(model.getT336());
        soapModel.setT168(model.getT168());
        soapModel.setT84(model.getT84());
        soapModel.setT42(model.getT42());
        soapModel.setWS672(model.getWS672());
        soapModel.setWS504(model.getWS504());
        soapModel.setWS336(model.getWS336());
        soapModel.setWS168(model.getWS168());
        soapModel.setWS84(model.getWS84());
        soapModel.setWS42(model.getWS42());
        soapModel.setWSU740(model.getWSU740());
        soapModel.setWSU336(model.getWSU336());
        soapModel.setWSU168(model.getWSU168());
        soapModel.setWSU84(model.getWSU84());
        soapModel.setWD(model.getWD());
        soapModel.setWD504(model.getWD504());
        soapModel.setWD336(model.getWD336());
        soapModel.setWD168(model.getWD168());
        soapModel.setWDU740(model.getWDU740());
        soapModel.setWDU336(model.getWDU336());
        soapModel.setWDU168(model.getWDU168());
        soapModel.setWDU84(model.getWDU84());
        soapModel.setNO672(model.getNO672());
        soapModel.setNO504(model.getNO504());
        soapModel.setNO336(model.getNO336());
        soapModel.setNO168(model.getNO168());
        soapModel.setNO84(model.getNO84());
        soapModel.setNO42(model.getNO42());
        soapModel.setNOx672(model.getNOx672());
        soapModel.setNOx504(model.getNOx504());
        soapModel.setNOx336(model.getNOx336());
        soapModel.setNOx168(model.getNOx168());
        soapModel.setNOx84(model.getNOx84());
        soapModel.setNOx42(model.getNOx42());
        soapModel.setO3672(model.getO3672());
        soapModel.setO3504(model.getO3504());
        soapModel.setO3336(model.getO3336());
        soapModel.setO3168(model.getO3168());
        soapModel.setO384(model.getO384());
        soapModel.setO342(model.getO342());
        soapModel.setSO2672(model.getSO2672());
        soapModel.setSO2504(model.getSO2504());
        soapModel.setSO2336(model.getSO2336());
        soapModel.setSO2168(model.getSO2168());
        soapModel.setSO284(model.getSO284());
        soapModel.setSO242(model.getSO242());
        soapModel.setH2O672(model.getH2O672());
        soapModel.setH2O504(model.getH2O504());
        soapModel.setH2O336(model.getH2O336());
        soapModel.setH2O168(model.getH2O168());
        soapModel.setH2O84(model.getH2O84());
        soapModel.setH2O42(model.getH2O42());
        soapModel.setCO2672(model.getCO2672());
        soapModel.setCO2504(model.getCO2504());
        soapModel.setCO2336(model.getCO2336());
        soapModel.setCO2168(model.getCO2168());
        soapModel.setCO284(model.getCO284());
        soapModel.setCO242(model.getCO242());
        soapModel.setH2S672(model.getH2S672());
        soapModel.setH2S504(model.getH2S504());
        soapModel.setH2S336(model.getH2S336());
        soapModel.setH2S168(model.getH2S168());
        soapModel.setH2S84(model.getH2S84());
        soapModel.setH2S42(model.getH2S42());
        soapModel.setRHIRGA672(model.getRHIRGA672());
        soapModel.setRHIRGA504(model.getRHIRGA504());
        soapModel.setRHIRGA336(model.getRHIRGA336());
        soapModel.setRHIRGA168(model.getRHIRGA168());
        soapModel.setRHIRGA84(model.getRHIRGA84());
        soapModel.setRHIRGA42(model.getRHIRGA42());
        soapModel.setCO672(model.getCO672());
        soapModel.setCO504(model.getCO504());
        soapModel.setCO336(model.getCO336());
        soapModel.setCO168(model.getCO168());
        soapModel.setCO84(model.getCO84());
        soapModel.setCO42(model.getCO42());
        soapModel.setRHTd(model.getRHTd());
        soapModel.setPTG(model.getPTG());
        soapModel.setVisibility(model.getVisibility());
        soapModel.setVisibilitymin(model.getVisibilitymin());
        soapModel.setVisibilitymax(model.getVisibilitymax());
        soapModel.setPrecipint(model.getPrecipint());
        soapModel.setPrecipintmin(model.getPrecipintmin());
        soapModel.setPrecipintmax(model.getPrecipintmax());
        soapModel.setPrecipacc(model.getPrecipacc());
        soapModel.setSnowfallacc(model.getSnowfallacc());
        soapModel.setWthcode(model.getWthcode());
        soapModel.setWthcodemin(model.getWthcodemin());
        soapModel.setWthcodemax(model.getWthcodemax());
        soapModel.setTsoil_humus(model.getTsoil_humus());
        soapModel.setTsoil_A(model.getTsoil_A());
        soapModel.setTsoil_B1(model.getTsoil_B1());
        soapModel.setTsoil_B2(model.getTsoil_B2());
        soapModel.setTsoil_C1(model.getTsoil_C1());
        soapModel.setH2OTd(model.getH2OTd());
        soapModel.setCO2_storage_flux(model.getCO2_storage_flux());
        soapModel.setWsoil_humus(model.getWsoil_humus());
        soapModel.setWsoil_A(model.getWsoil_A());
        soapModel.setWsoil_B1(model.getWsoil_B1());
        soapModel.setWsoil_B2(model.getWsoil_B2());
        soapModel.setWsoil_C1(model.getWsoil_C1());
        soapModel.setLWin(model.getLWin());
        soapModel.setLWout(model.getLWout());
        soapModel.setPRI(model.getPRI());
        soapModel.setNDVI(model.getNDVI());
        soapModel.setBNDVI(model.getBNDVI());
        soapModel.setCanPAR1(model.getCanPAR1());
        soapModel.setCanPAR2(model.getCanPAR2());
        soapModel.setCanPAR3(model.getCanPAR3());
        soapModel.setMaaPAR(model.getMaaPAR());
        soapModel.setMaaNet(model.getMaaNet());
        soapModel.setPAR2(model.getPAR2());
        soapModel.setGlobmast(model.getGlobmast());
        soapModel.setWDU672(model.getWDU672());
        soapModel.setWSU672(model.getWSU672());
        soapModel.setRGlob125(model.getRGlob125());
        soapModel.setCH4168(model.getCH4168());
        soapModel.setCH4672(model.getCH4672());
        soapModel.setCH41250(model.getCH41250());
        soapModel.setT1250(model.getT1250());
        soapModel.setWpsoil_A(model.getWpsoil_A());
        soapModel.setWpsoil_B(model.getWpsoil_B());
        soapModel.setRunoff1(model.getRunoff1());
        soapModel.setRunoff2(model.getRunoff2());
        soapModel.setDrainage1(model.getDrainage1());
        soapModel.setCO2icos168(model.getCO2icos168());
        soapModel.setCO2icos672(model.getCO2icos672());
        soapModel.setCO2icos1250(model.getCO2icos1250());
        soapModel.setH2Oicos168(model.getH2Oicos168());
        soapModel.setH2Oicos672(model.getH2Oicos672());
        soapModel.setH2Oicos1250(model.getH2Oicos1250());
        soapModel.setUV_A_EMEP(model.getUV_A_EMEP());
        soapModel.setUV_B_EMEP(model.getUV_B_EMEP());
        soapModel.setDiffPAR_EMEP(model.getDiffPAR_EMEP());
        soapModel.setDiffGLOB_EMEP(model.getDiffGLOB_EMEP());
        soapModel.setDirGLOB_EMEP(model.getDirGLOB_EMEP());
        soapModel.setNet_EMEP(model.getNet_EMEP());
        soapModel.setRGlob_EMEP(model.getRGlob_EMEP());
        soapModel.setGlob_EMEP(model.getGlob_EMEP());
        soapModel.setRPAR_EMEP(model.getRPAR_EMEP());
        soapModel.setPAR_EMEP(model.getPAR_EMEP());
        soapModel.setDirPAR_EMEP(model.getDirPAR_EMEP());
        soapModel.setCanIR_EMEP(model.getCanIR_EMEP());

        return soapModel;
    }

    public static HydemetaSoap[] toSoapModels(Hydemeta[] models) {
        HydemetaSoap[] soapModels = new HydemetaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HydemetaSoap[][] toSoapModels(Hydemeta[][] models) {
        HydemetaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HydemetaSoap[models.length][models[0].length];
        } else {
            soapModels = new HydemetaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HydemetaSoap[] toSoapModels(List<Hydemeta> models) {
        List<HydemetaSoap> soapModels = new ArrayList<HydemetaSoap>(models.size());

        for (Hydemeta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HydemetaSoap[soapModels.size()]);
    }

    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    public void setPrimaryKey(java.util.Date pk) {
        setSamptime(pk);
    }

    public Date getSamptime() {
        return _samptime;
    }

    public void setSamptime(Date samptime) {
        _samptime = samptime;
    }

    public float getUV_A() {
        return _UV_A;
    }

    public void setUV_A(float UV_A) {
        _UV_A = UV_A;
    }

    public float getUV_B() {
        return _UV_B;
    }

    public void setUV_B(float UV_B) {
        _UV_B = UV_B;
    }

    public float getDiffPAR() {
        return _diffPAR;
    }

    public void setDiffPAR(float diffPAR) {
        _diffPAR = diffPAR;
    }

    public float getDiffGLOB() {
        return _diffGLOB;
    }

    public void setDiffGLOB(float diffGLOB) {
        _diffGLOB = diffGLOB;
    }

    public float getDirGLOB() {
        return _dirGLOB;
    }

    public void setDirGLOB(float dirGLOB) {
        _dirGLOB = dirGLOB;
    }

    public float getNet() {
        return _Net;
    }

    public void setNet(float Net) {
        _Net = Net;
    }

    public float getRGlob() {
        return _RGlob;
    }

    public void setRGlob(float RGlob) {
        _RGlob = RGlob;
    }

    public float getGlob() {
        return _Glob;
    }

    public void setGlob(float Glob) {
        _Glob = Glob;
    }

    public float getRPAR() {
        return _RPAR;
    }

    public void setRPAR(float RPAR) {
        _RPAR = RPAR;
    }

    public float getPAR() {
        return _PAR;
    }

    public void setPAR(float PAR) {
        _PAR = PAR;
    }

    public float getDirPAR() {
        return _dirPAR;
    }

    public void setDirPAR(float dirPAR) {
        _dirPAR = dirPAR;
    }

    public float getCanIR() {
        return _canIR;
    }

    public void setCanIR(float canIR) {
        _canIR = canIR;
    }

    public float getSkyIR() {
        return _skyIR;
    }

    public void setSkyIR(float skyIR) {
        _skyIR = skyIR;
    }

    public float getPrecip() {
        return _Precip;
    }

    public void setPrecip(float Precip) {
        _Precip = Precip;
    }

    public float getSWS() {
        return _SWS;
    }

    public void setSWS(float SWS) {
        _SWS = SWS;
    }

    public float getTd() {
        return _Td;
    }

    public void setTd(float Td) {
        _Td = Td;
    }

    public float getPamb0() {
        return _Pamb0;
    }

    public void setPamb0(float Pamb0) {
        _Pamb0 = Pamb0;
    }

    public float getT672() {
        return _T672;
    }

    public void setT672(float T672) {
        _T672 = T672;
    }

    public float getT504() {
        return _T504;
    }

    public void setT504(float T504) {
        _T504 = T504;
    }

    public float getT336() {
        return _T336;
    }

    public void setT336(float T336) {
        _T336 = T336;
    }

    public float getT168() {
        return _T168;
    }

    public void setT168(float T168) {
        _T168 = T168;
    }

    public float getT84() {
        return _T84;
    }

    public void setT84(float T84) {
        _T84 = T84;
    }

    public float getT42() {
        return _T42;
    }

    public void setT42(float T42) {
        _T42 = T42;
    }

    public float getWS672() {
        return _WS672;
    }

    public void setWS672(float WS672) {
        _WS672 = WS672;
    }

    public float getWS504() {
        return _WS504;
    }

    public void setWS504(float WS504) {
        _WS504 = WS504;
    }

    public float getWS336() {
        return _WS336;
    }

    public void setWS336(float WS336) {
        _WS336 = WS336;
    }

    public float getWS168() {
        return _WS168;
    }

    public void setWS168(float WS168) {
        _WS168 = WS168;
    }

    public float getWS84() {
        return _WS84;
    }

    public void setWS84(float WS84) {
        _WS84 = WS84;
    }

    public float getWS42() {
        return _WS42;
    }

    public void setWS42(float WS42) {
        _WS42 = WS42;
    }

    public float getWSU740() {
        return _WSU740;
    }

    public void setWSU740(float WSU740) {
        _WSU740 = WSU740;
    }

    public float getWSU336() {
        return _WSU336;
    }

    public void setWSU336(float WSU336) {
        _WSU336 = WSU336;
    }

    public float getWSU168() {
        return _WSU168;
    }

    public void setWSU168(float WSU168) {
        _WSU168 = WSU168;
    }

    public float getWSU84() {
        return _WSU84;
    }

    public void setWSU84(float WSU84) {
        _WSU84 = WSU84;
    }

    public float getWD() {
        return _WD;
    }

    public void setWD(float WD) {
        _WD = WD;
    }

    public float getWD504() {
        return _WD504;
    }

    public void setWD504(float WD504) {
        _WD504 = WD504;
    }

    public float getWD336() {
        return _WD336;
    }

    public void setWD336(float WD336) {
        _WD336 = WD336;
    }

    public float getWD168() {
        return _WD168;
    }

    public void setWD168(float WD168) {
        _WD168 = WD168;
    }

    public float getWDU740() {
        return _WDU740;
    }

    public void setWDU740(float WDU740) {
        _WDU740 = WDU740;
    }

    public float getWDU336() {
        return _WDU336;
    }

    public void setWDU336(float WDU336) {
        _WDU336 = WDU336;
    }

    public float getWDU168() {
        return _WDU168;
    }

    public void setWDU168(float WDU168) {
        _WDU168 = WDU168;
    }

    public float getWDU84() {
        return _WDU84;
    }

    public void setWDU84(float WDU84) {
        _WDU84 = WDU84;
    }

    public float getNO672() {
        return _NO672;
    }

    public void setNO672(float NO672) {
        _NO672 = NO672;
    }

    public float getNO504() {
        return _NO504;
    }

    public void setNO504(float NO504) {
        _NO504 = NO504;
    }

    public float getNO336() {
        return _NO336;
    }

    public void setNO336(float NO336) {
        _NO336 = NO336;
    }

    public float getNO168() {
        return _NO168;
    }

    public void setNO168(float NO168) {
        _NO168 = NO168;
    }

    public float getNO84() {
        return _NO84;
    }

    public void setNO84(float NO84) {
        _NO84 = NO84;
    }

    public float getNO42() {
        return _NO42;
    }

    public void setNO42(float NO42) {
        _NO42 = NO42;
    }

    public float getNOx672() {
        return _NOx672;
    }

    public void setNOx672(float NOx672) {
        _NOx672 = NOx672;
    }

    public float getNOx504() {
        return _NOx504;
    }

    public void setNOx504(float NOx504) {
        _NOx504 = NOx504;
    }

    public float getNOx336() {
        return _NOx336;
    }

    public void setNOx336(float NOx336) {
        _NOx336 = NOx336;
    }

    public float getNOx168() {
        return _NOx168;
    }

    public void setNOx168(float NOx168) {
        _NOx168 = NOx168;
    }

    public float getNOx84() {
        return _NOx84;
    }

    public void setNOx84(float NOx84) {
        _NOx84 = NOx84;
    }

    public float getNOx42() {
        return _NOx42;
    }

    public void setNOx42(float NOx42) {
        _NOx42 = NOx42;
    }

    public float getO3672() {
        return _O3672;
    }

    public void setO3672(float O3672) {
        _O3672 = O3672;
    }

    public float getO3504() {
        return _O3504;
    }

    public void setO3504(float O3504) {
        _O3504 = O3504;
    }

    public float getO3336() {
        return _O3336;
    }

    public void setO3336(float O3336) {
        _O3336 = O3336;
    }

    public float getO3168() {
        return _O3168;
    }

    public void setO3168(float O3168) {
        _O3168 = O3168;
    }

    public float getO384() {
        return _O384;
    }

    public void setO384(float O384) {
        _O384 = O384;
    }

    public float getO342() {
        return _O342;
    }

    public void setO342(float O342) {
        _O342 = O342;
    }

    public float getSO2672() {
        return _SO2672;
    }

    public void setSO2672(float SO2672) {
        _SO2672 = SO2672;
    }

    public float getSO2504() {
        return _SO2504;
    }

    public void setSO2504(float SO2504) {
        _SO2504 = SO2504;
    }

    public float getSO2336() {
        return _SO2336;
    }

    public void setSO2336(float SO2336) {
        _SO2336 = SO2336;
    }

    public float getSO2168() {
        return _SO2168;
    }

    public void setSO2168(float SO2168) {
        _SO2168 = SO2168;
    }

    public float getSO284() {
        return _SO284;
    }

    public void setSO284(float SO284) {
        _SO284 = SO284;
    }

    public float getSO242() {
        return _SO242;
    }

    public void setSO242(float SO242) {
        _SO242 = SO242;
    }

    public float getH2O672() {
        return _H2O672;
    }

    public void setH2O672(float H2O672) {
        _H2O672 = H2O672;
    }

    public float getH2O504() {
        return _H2O504;
    }

    public void setH2O504(float H2O504) {
        _H2O504 = H2O504;
    }

    public float getH2O336() {
        return _H2O336;
    }

    public void setH2O336(float H2O336) {
        _H2O336 = H2O336;
    }

    public float getH2O168() {
        return _H2O168;
    }

    public void setH2O168(float H2O168) {
        _H2O168 = H2O168;
    }

    public float getH2O84() {
        return _H2O84;
    }

    public void setH2O84(float H2O84) {
        _H2O84 = H2O84;
    }

    public float getH2O42() {
        return _H2O42;
    }

    public void setH2O42(float H2O42) {
        _H2O42 = H2O42;
    }

    public float getCO2672() {
        return _CO2672;
    }

    public void setCO2672(float CO2672) {
        _CO2672 = CO2672;
    }

    public float getCO2504() {
        return _CO2504;
    }

    public void setCO2504(float CO2504) {
        _CO2504 = CO2504;
    }

    public float getCO2336() {
        return _CO2336;
    }

    public void setCO2336(float CO2336) {
        _CO2336 = CO2336;
    }

    public float getCO2168() {
        return _CO2168;
    }

    public void setCO2168(float CO2168) {
        _CO2168 = CO2168;
    }

    public float getCO284() {
        return _CO284;
    }

    public void setCO284(float CO284) {
        _CO284 = CO284;
    }

    public float getCO242() {
        return _CO242;
    }

    public void setCO242(float CO242) {
        _CO242 = CO242;
    }

    public float getH2S672() {
        return _H2S672;
    }

    public void setH2S672(float H2S672) {
        _H2S672 = H2S672;
    }

    public float getH2S504() {
        return _H2S504;
    }

    public void setH2S504(float H2S504) {
        _H2S504 = H2S504;
    }

    public float getH2S336() {
        return _H2S336;
    }

    public void setH2S336(float H2S336) {
        _H2S336 = H2S336;
    }

    public float getH2S168() {
        return _H2S168;
    }

    public void setH2S168(float H2S168) {
        _H2S168 = H2S168;
    }

    public float getH2S84() {
        return _H2S84;
    }

    public void setH2S84(float H2S84) {
        _H2S84 = H2S84;
    }

    public float getH2S42() {
        return _H2S42;
    }

    public void setH2S42(float H2S42) {
        _H2S42 = H2S42;
    }

    public float getRHIRGA672() {
        return _RHIRGA672;
    }

    public void setRHIRGA672(float RHIRGA672) {
        _RHIRGA672 = RHIRGA672;
    }

    public float getRHIRGA504() {
        return _RHIRGA504;
    }

    public void setRHIRGA504(float RHIRGA504) {
        _RHIRGA504 = RHIRGA504;
    }

    public float getRHIRGA336() {
        return _RHIRGA336;
    }

    public void setRHIRGA336(float RHIRGA336) {
        _RHIRGA336 = RHIRGA336;
    }

    public float getRHIRGA168() {
        return _RHIRGA168;
    }

    public void setRHIRGA168(float RHIRGA168) {
        _RHIRGA168 = RHIRGA168;
    }

    public float getRHIRGA84() {
        return _RHIRGA84;
    }

    public void setRHIRGA84(float RHIRGA84) {
        _RHIRGA84 = RHIRGA84;
    }

    public float getRHIRGA42() {
        return _RHIRGA42;
    }

    public void setRHIRGA42(float RHIRGA42) {
        _RHIRGA42 = RHIRGA42;
    }

    public float getCO672() {
        return _CO672;
    }

    public void setCO672(float CO672) {
        _CO672 = CO672;
    }

    public float getCO504() {
        return _CO504;
    }

    public void setCO504(float CO504) {
        _CO504 = CO504;
    }

    public float getCO336() {
        return _CO336;
    }

    public void setCO336(float CO336) {
        _CO336 = CO336;
    }

    public float getCO168() {
        return _CO168;
    }

    public void setCO168(float CO168) {
        _CO168 = CO168;
    }

    public float getCO84() {
        return _CO84;
    }

    public void setCO84(float CO84) {
        _CO84 = CO84;
    }

    public float getCO42() {
        return _CO42;
    }

    public void setCO42(float CO42) {
        _CO42 = CO42;
    }

    public float getRHTd() {
        return _RHTd;
    }

    public void setRHTd(float RHTd) {
        _RHTd = RHTd;
    }

    public float getPTG() {
        return _PTG;
    }

    public void setPTG(float PTG) {
        _PTG = PTG;
    }

    public float getVisibility() {
        return _Visibility;
    }

    public void setVisibility(float Visibility) {
        _Visibility = Visibility;
    }

    public float getVisibilitymin() {
        return _Visibilitymin;
    }

    public void setVisibilitymin(float Visibilitymin) {
        _Visibilitymin = Visibilitymin;
    }

    public float getVisibilitymax() {
        return _Visibilitymax;
    }

    public void setVisibilitymax(float Visibilitymax) {
        _Visibilitymax = Visibilitymax;
    }

    public float getPrecipint() {
        return _Precipint;
    }

    public void setPrecipint(float Precipint) {
        _Precipint = Precipint;
    }

    public float getPrecipintmin() {
        return _Precipintmin;
    }

    public void setPrecipintmin(float Precipintmin) {
        _Precipintmin = Precipintmin;
    }

    public float getPrecipintmax() {
        return _Precipintmax;
    }

    public void setPrecipintmax(float Precipintmax) {
        _Precipintmax = Precipintmax;
    }

    public float getPrecipacc() {
        return _Precipacc;
    }

    public void setPrecipacc(float Precipacc) {
        _Precipacc = Precipacc;
    }

    public float getSnowfallacc() {
        return _Snowfallacc;
    }

    public void setSnowfallacc(float Snowfallacc) {
        _Snowfallacc = Snowfallacc;
    }

    public int getWthcode() {
        return _wthcode;
    }

    public void setWthcode(int wthcode) {
        _wthcode = wthcode;
    }

    public int getWthcodemin() {
        return _wthcodemin;
    }

    public void setWthcodemin(int wthcodemin) {
        _wthcodemin = wthcodemin;
    }

    public int getWthcodemax() {
        return _wthcodemax;
    }

    public void setWthcodemax(int wthcodemax) {
        _wthcodemax = wthcodemax;
    }

    public float getTsoil_humus() {
        return _tsoil_humus;
    }

    public void setTsoil_humus(float tsoil_humus) {
        _tsoil_humus = tsoil_humus;
    }

    public float getTsoil_A() {
        return _tsoil_A;
    }

    public void setTsoil_A(float tsoil_A) {
        _tsoil_A = tsoil_A;
    }

    public float getTsoil_B1() {
        return _tsoil_B1;
    }

    public void setTsoil_B1(float tsoil_B1) {
        _tsoil_B1 = tsoil_B1;
    }

    public float getTsoil_B2() {
        return _tsoil_B2;
    }

    public void setTsoil_B2(float tsoil_B2) {
        _tsoil_B2 = tsoil_B2;
    }

    public float getTsoil_C1() {
        return _tsoil_C1;
    }

    public void setTsoil_C1(float tsoil_C1) {
        _tsoil_C1 = tsoil_C1;
    }

    public float getH2OTd() {
        return _H2OTd;
    }

    public void setH2OTd(float H2OTd) {
        _H2OTd = H2OTd;
    }

    public float getCO2_storage_flux() {
        return _CO2_storage_flux;
    }

    public void setCO2_storage_flux(float CO2_storage_flux) {
        _CO2_storage_flux = CO2_storage_flux;
    }

    public float getWsoil_humus() {
        return _wsoil_humus;
    }

    public void setWsoil_humus(float wsoil_humus) {
        _wsoil_humus = wsoil_humus;
    }

    public float getWsoil_A() {
        return _wsoil_A;
    }

    public void setWsoil_A(float wsoil_A) {
        _wsoil_A = wsoil_A;
    }

    public float getWsoil_B1() {
        return _wsoil_B1;
    }

    public void setWsoil_B1(float wsoil_B1) {
        _wsoil_B1 = wsoil_B1;
    }

    public float getWsoil_B2() {
        return _wsoil_B2;
    }

    public void setWsoil_B2(float wsoil_B2) {
        _wsoil_B2 = wsoil_B2;
    }

    public float getWsoil_C1() {
        return _wsoil_C1;
    }

    public void setWsoil_C1(float wsoil_C1) {
        _wsoil_C1 = wsoil_C1;
    }

    public float getLWin() {
        return _LWin;
    }

    public void setLWin(float LWin) {
        _LWin = LWin;
    }

    public float getLWout() {
        return _LWout;
    }

    public void setLWout(float LWout) {
        _LWout = LWout;
    }

    public float getPRI() {
        return _PRI;
    }

    public void setPRI(float PRI) {
        _PRI = PRI;
    }

    public float getNDVI() {
        return _NDVI;
    }

    public void setNDVI(float NDVI) {
        _NDVI = NDVI;
    }

    public float getBNDVI() {
        return _BNDVI;
    }

    public void setBNDVI(float BNDVI) {
        _BNDVI = BNDVI;
    }

    public float getCanPAR1() {
        return _canPAR1;
    }

    public void setCanPAR1(float canPAR1) {
        _canPAR1 = canPAR1;
    }

    public float getCanPAR2() {
        return _canPAR2;
    }

    public void setCanPAR2(float canPAR2) {
        _canPAR2 = canPAR2;
    }

    public float getCanPAR3() {
        return _canPAR3;
    }

    public void setCanPAR3(float canPAR3) {
        _canPAR3 = canPAR3;
    }

    public float getMaaPAR() {
        return _maaPAR;
    }

    public void setMaaPAR(float maaPAR) {
        _maaPAR = maaPAR;
    }

    public float getMaaNet() {
        return _maaNet;
    }

    public void setMaaNet(float maaNet) {
        _maaNet = maaNet;
    }

    public float getPAR2() {
        return _PAR2;
    }

    public void setPAR2(float PAR2) {
        _PAR2 = PAR2;
    }

    public float getGlobmast() {
        return _Globmast;
    }

    public void setGlobmast(float Globmast) {
        _Globmast = Globmast;
    }

    public float getWDU672() {
        return _WDU672;
    }

    public void setWDU672(float WDU672) {
        _WDU672 = WDU672;
    }

    public float getWSU672() {
        return _WSU672;
    }

    public void setWSU672(float WSU672) {
        _WSU672 = WSU672;
    }

    public float getRGlob125() {
        return _RGlob125;
    }

    public void setRGlob125(float RGlob125) {
        _RGlob125 = RGlob125;
    }

    public float getCH4168() {
        return _CH4168;
    }

    public void setCH4168(float CH4168) {
        _CH4168 = CH4168;
    }

    public float getCH4672() {
        return _CH4672;
    }

    public void setCH4672(float CH4672) {
        _CH4672 = CH4672;
    }

    public float getCH41250() {
        return _CH41250;
    }

    public void setCH41250(float CH41250) {
        _CH41250 = CH41250;
    }

    public float getT1250() {
        return _T1250;
    }

    public void setT1250(float T1250) {
        _T1250 = T1250;
    }

    public float getWpsoil_A() {
        return _wpsoil_A;
    }

    public void setWpsoil_A(float wpsoil_A) {
        _wpsoil_A = wpsoil_A;
    }

    public float getWpsoil_B() {
        return _wpsoil_B;
    }

    public void setWpsoil_B(float wpsoil_B) {
        _wpsoil_B = wpsoil_B;
    }

    public float getRunoff1() {
        return _runoff1;
    }

    public void setRunoff1(float runoff1) {
        _runoff1 = runoff1;
    }

    public float getRunoff2() {
        return _runoff2;
    }

    public void setRunoff2(float runoff2) {
        _runoff2 = runoff2;
    }

    public float getDrainage1() {
        return _drainage1;
    }

    public void setDrainage1(float drainage1) {
        _drainage1 = drainage1;
    }

    public float getCO2icos168() {
        return _CO2icos168;
    }

    public void setCO2icos168(float CO2icos168) {
        _CO2icos168 = CO2icos168;
    }

    public float getCO2icos672() {
        return _CO2icos672;
    }

    public void setCO2icos672(float CO2icos672) {
        _CO2icos672 = CO2icos672;
    }

    public float getCO2icos1250() {
        return _CO2icos1250;
    }

    public void setCO2icos1250(float CO2icos1250) {
        _CO2icos1250 = CO2icos1250;
    }

    public float getH2Oicos168() {
        return _H2Oicos168;
    }

    public void setH2Oicos168(float H2Oicos168) {
        _H2Oicos168 = H2Oicos168;
    }

    public float getH2Oicos672() {
        return _H2Oicos672;
    }

    public void setH2Oicos672(float H2Oicos672) {
        _H2Oicos672 = H2Oicos672;
    }

    public float getH2Oicos1250() {
        return _H2Oicos1250;
    }

    public void setH2Oicos1250(float H2Oicos1250) {
        _H2Oicos1250 = H2Oicos1250;
    }

    public int getUV_A_EMEP() {
        return _UV_A_EMEP;
    }

    public void setUV_A_EMEP(int UV_A_EMEP) {
        _UV_A_EMEP = UV_A_EMEP;
    }

    public int getUV_B_EMEP() {
        return _UV_B_EMEP;
    }

    public void setUV_B_EMEP(int UV_B_EMEP) {
        _UV_B_EMEP = UV_B_EMEP;
    }

    public int getDiffPAR_EMEP() {
        return _diffPAR_EMEP;
    }

    public void setDiffPAR_EMEP(int diffPAR_EMEP) {
        _diffPAR_EMEP = diffPAR_EMEP;
    }

    public int getDiffGLOB_EMEP() {
        return _diffGLOB_EMEP;
    }

    public void setDiffGLOB_EMEP(int diffGLOB_EMEP) {
        _diffGLOB_EMEP = diffGLOB_EMEP;
    }

    public int getDirGLOB_EMEP() {
        return _dirGLOB_EMEP;
    }

    public void setDirGLOB_EMEP(int dirGLOB_EMEP) {
        _dirGLOB_EMEP = dirGLOB_EMEP;
    }

    public int getNet_EMEP() {
        return _Net_EMEP;
    }

    public void setNet_EMEP(int Net_EMEP) {
        _Net_EMEP = Net_EMEP;
    }

    public int getRGlob_EMEP() {
        return _RGlob_EMEP;
    }

    public void setRGlob_EMEP(int RGlob_EMEP) {
        _RGlob_EMEP = RGlob_EMEP;
    }

    public int getGlob_EMEP() {
        return _Glob_EMEP;
    }

    public void setGlob_EMEP(int Glob_EMEP) {
        _Glob_EMEP = Glob_EMEP;
    }

    public int getRPAR_EMEP() {
        return _RPAR_EMEP;
    }

    public void setRPAR_EMEP(int RPAR_EMEP) {
        _RPAR_EMEP = RPAR_EMEP;
    }

    public int getPAR_EMEP() {
        return _PAR_EMEP;
    }

    public void setPAR_EMEP(int PAR_EMEP) {
        _PAR_EMEP = PAR_EMEP;
    }

    public int getDirPAR_EMEP() {
        return _dirPAR_EMEP;
    }

    public void setDirPAR_EMEP(int dirPAR_EMEP) {
        _dirPAR_EMEP = dirPAR_EMEP;
    }

    public int getCanIR_EMEP() {
        return _canIR_EMEP;
    }

    public void setCanIR_EMEP(int canIR_EMEP) {
        _canIR_EMEP = canIR_EMEP;
    }
}
