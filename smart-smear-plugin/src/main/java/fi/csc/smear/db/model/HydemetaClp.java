package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.HydemetaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class HydemetaClp extends BaseModelImpl<Hydemeta> implements Hydemeta {
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
    private BaseModel<?> _hydemetaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public HydemetaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Hydemeta.class;
    }

    @Override
    public String getModelClassName() {
        return Hydemeta.class.getName();
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
        attributes.put("UV_A", getUV_A());
        attributes.put("UV_B", getUV_B());
        attributes.put("diffPAR", getDiffPAR());
        attributes.put("diffGLOB", getDiffGLOB());
        attributes.put("dirGLOB", getDirGLOB());
        attributes.put("Net", getNet());
        attributes.put("RGlob", getRGlob());
        attributes.put("Glob", getGlob());
        attributes.put("RPAR", getRPAR());
        attributes.put("PAR", getPAR());
        attributes.put("dirPAR", getDirPAR());
        attributes.put("canIR", getCanIR());
        attributes.put("skyIR", getSkyIR());
        attributes.put("Precip", getPrecip());
        attributes.put("SWS", getSWS());
        attributes.put("Td", getTd());
        attributes.put("Pamb0", getPamb0());
        attributes.put("T672", getT672());
        attributes.put("T504", getT504());
        attributes.put("T336", getT336());
        attributes.put("T168", getT168());
        attributes.put("T84", getT84());
        attributes.put("T42", getT42());
        attributes.put("WS672", getWS672());
        attributes.put("WS504", getWS504());
        attributes.put("WS336", getWS336());
        attributes.put("WS168", getWS168());
        attributes.put("WS84", getWS84());
        attributes.put("WS42", getWS42());
        attributes.put("WSU740", getWSU740());
        attributes.put("WSU336", getWSU336());
        attributes.put("WSU168", getWSU168());
        attributes.put("WSU84", getWSU84());
        attributes.put("WD", getWD());
        attributes.put("WD504", getWD504());
        attributes.put("WD336", getWD336());
        attributes.put("WD168", getWD168());
        attributes.put("WDU740", getWDU740());
        attributes.put("WDU336", getWDU336());
        attributes.put("WDU168", getWDU168());
        attributes.put("WDU84", getWDU84());
        attributes.put("NO672", getNO672());
        attributes.put("NO504", getNO504());
        attributes.put("NO336", getNO336());
        attributes.put("NO168", getNO168());
        attributes.put("NO84", getNO84());
        attributes.put("NO42", getNO42());
        attributes.put("NOx672", getNOx672());
        attributes.put("NOx504", getNOx504());
        attributes.put("NOx336", getNOx336());
        attributes.put("NOx168", getNOx168());
        attributes.put("NOx84", getNOx84());
        attributes.put("NOx42", getNOx42());
        attributes.put("O3672", getO3672());
        attributes.put("O3504", getO3504());
        attributes.put("O3336", getO3336());
        attributes.put("O3168", getO3168());
        attributes.put("O384", getO384());
        attributes.put("O342", getO342());
        attributes.put("SO2672", getSO2672());
        attributes.put("SO2504", getSO2504());
        attributes.put("SO2336", getSO2336());
        attributes.put("SO2168", getSO2168());
        attributes.put("SO284", getSO284());
        attributes.put("SO242", getSO242());
        attributes.put("H2O672", getH2O672());
        attributes.put("H2O504", getH2O504());
        attributes.put("H2O336", getH2O336());
        attributes.put("H2O168", getH2O168());
        attributes.put("H2O84", getH2O84());
        attributes.put("H2O42", getH2O42());
        attributes.put("CO2672", getCO2672());
        attributes.put("CO2504", getCO2504());
        attributes.put("CO2336", getCO2336());
        attributes.put("CO2168", getCO2168());
        attributes.put("CO284", getCO284());
        attributes.put("CO242", getCO242());
        attributes.put("H2S672", getH2S672());
        attributes.put("H2S504", getH2S504());
        attributes.put("H2S336", getH2S336());
        attributes.put("H2S168", getH2S168());
        attributes.put("H2S84", getH2S84());
        attributes.put("H2S42", getH2S42());
        attributes.put("RHIRGA672", getRHIRGA672());
        attributes.put("RHIRGA504", getRHIRGA504());
        attributes.put("RHIRGA336", getRHIRGA336());
        attributes.put("RHIRGA168", getRHIRGA168());
        attributes.put("RHIRGA84", getRHIRGA84());
        attributes.put("RHIRGA42", getRHIRGA42());
        attributes.put("CO672", getCO672());
        attributes.put("CO504", getCO504());
        attributes.put("CO336", getCO336());
        attributes.put("CO168", getCO168());
        attributes.put("CO84", getCO84());
        attributes.put("CO42", getCO42());
        attributes.put("RHTd", getRHTd());
        attributes.put("PTG", getPTG());
        attributes.put("Visibility", getVisibility());
        attributes.put("Visibilitymin", getVisibilitymin());
        attributes.put("Visibilitymax", getVisibilitymax());
        attributes.put("Precipint", getPrecipint());
        attributes.put("Precipintmin", getPrecipintmin());
        attributes.put("Precipintmax", getPrecipintmax());
        attributes.put("Precipacc", getPrecipacc());
        attributes.put("Snowfallacc", getSnowfallacc());
        attributes.put("wthcode", getWthcode());
        attributes.put("wthcodemin", getWthcodemin());
        attributes.put("wthcodemax", getWthcodemax());
        attributes.put("tsoil_humus", getTsoil_humus());
        attributes.put("tsoil_A", getTsoil_A());
        attributes.put("tsoil_B1", getTsoil_B1());
        attributes.put("tsoil_B2", getTsoil_B2());
        attributes.put("tsoil_C1", getTsoil_C1());
        attributes.put("H2OTd", getH2OTd());
        attributes.put("CO2_storage_flux", getCO2_storage_flux());
        attributes.put("wsoil_humus", getWsoil_humus());
        attributes.put("wsoil_A", getWsoil_A());
        attributes.put("wsoil_B1", getWsoil_B1());
        attributes.put("wsoil_B2", getWsoil_B2());
        attributes.put("wsoil_C1", getWsoil_C1());
        attributes.put("LWin", getLWin());
        attributes.put("LWout", getLWout());
        attributes.put("PRI", getPRI());
        attributes.put("NDVI", getNDVI());
        attributes.put("BNDVI", getBNDVI());
        attributes.put("canPAR1", getCanPAR1());
        attributes.put("canPAR2", getCanPAR2());
        attributes.put("canPAR3", getCanPAR3());
        attributes.put("maaPAR", getMaaPAR());
        attributes.put("maaNet", getMaaNet());
        attributes.put("PAR2", getPAR2());
        attributes.put("Globmast", getGlobmast());
        attributes.put("WDU672", getWDU672());
        attributes.put("WSU672", getWSU672());
        attributes.put("RGlob125", getRGlob125());
        attributes.put("CH4168", getCH4168());
        attributes.put("CH4672", getCH4672());
        attributes.put("CH41250", getCH41250());
        attributes.put("T1250", getT1250());
        attributes.put("wpsoil_A", getWpsoil_A());
        attributes.put("wpsoil_B", getWpsoil_B());
        attributes.put("runoff1", getRunoff1());
        attributes.put("runoff2", getRunoff2());
        attributes.put("drainage1", getDrainage1());
        attributes.put("CO2icos168", getCO2icos168());
        attributes.put("CO2icos672", getCO2icos672());
        attributes.put("CO2icos1250", getCO2icos1250());
        attributes.put("H2Oicos168", getH2Oicos168());
        attributes.put("H2Oicos672", getH2Oicos672());
        attributes.put("H2Oicos1250", getH2Oicos1250());
        attributes.put("UV_A_EMEP", getUV_A_EMEP());
        attributes.put("UV_B_EMEP", getUV_B_EMEP());
        attributes.put("diffPAR_EMEP", getDiffPAR_EMEP());
        attributes.put("diffGLOB_EMEP", getDiffGLOB_EMEP());
        attributes.put("dirGLOB_EMEP", getDirGLOB_EMEP());
        attributes.put("Net_EMEP", getNet_EMEP());
        attributes.put("RGlob_EMEP", getRGlob_EMEP());
        attributes.put("Glob_EMEP", getGlob_EMEP());
        attributes.put("RPAR_EMEP", getRPAR_EMEP());
        attributes.put("PAR_EMEP", getPAR_EMEP());
        attributes.put("dirPAR_EMEP", getDirPAR_EMEP());
        attributes.put("canIR_EMEP", getCanIR_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float UV_A = (Float) attributes.get("UV_A");

        if (UV_A != null) {
            setUV_A(UV_A);
        }

        Float UV_B = (Float) attributes.get("UV_B");

        if (UV_B != null) {
            setUV_B(UV_B);
        }

        Float diffPAR = (Float) attributes.get("diffPAR");

        if (diffPAR != null) {
            setDiffPAR(diffPAR);
        }

        Float diffGLOB = (Float) attributes.get("diffGLOB");

        if (diffGLOB != null) {
            setDiffGLOB(diffGLOB);
        }

        Float dirGLOB = (Float) attributes.get("dirGLOB");

        if (dirGLOB != null) {
            setDirGLOB(dirGLOB);
        }

        Float Net = (Float) attributes.get("Net");

        if (Net != null) {
            setNet(Net);
        }

        Float RGlob = (Float) attributes.get("RGlob");

        if (RGlob != null) {
            setRGlob(RGlob);
        }

        Float Glob = (Float) attributes.get("Glob");

        if (Glob != null) {
            setGlob(Glob);
        }

        Float RPAR = (Float) attributes.get("RPAR");

        if (RPAR != null) {
            setRPAR(RPAR);
        }

        Float PAR = (Float) attributes.get("PAR");

        if (PAR != null) {
            setPAR(PAR);
        }

        Float dirPAR = (Float) attributes.get("dirPAR");

        if (dirPAR != null) {
            setDirPAR(dirPAR);
        }

        Float canIR = (Float) attributes.get("canIR");

        if (canIR != null) {
            setCanIR(canIR);
        }

        Float skyIR = (Float) attributes.get("skyIR");

        if (skyIR != null) {
            setSkyIR(skyIR);
        }

        Float Precip = (Float) attributes.get("Precip");

        if (Precip != null) {
            setPrecip(Precip);
        }

        Float SWS = (Float) attributes.get("SWS");

        if (SWS != null) {
            setSWS(SWS);
        }

        Float Td = (Float) attributes.get("Td");

        if (Td != null) {
            setTd(Td);
        }

        Float Pamb0 = (Float) attributes.get("Pamb0");

        if (Pamb0 != null) {
            setPamb0(Pamb0);
        }

        Float T672 = (Float) attributes.get("T672");

        if (T672 != null) {
            setT672(T672);
        }

        Float T504 = (Float) attributes.get("T504");

        if (T504 != null) {
            setT504(T504);
        }

        Float T336 = (Float) attributes.get("T336");

        if (T336 != null) {
            setT336(T336);
        }

        Float T168 = (Float) attributes.get("T168");

        if (T168 != null) {
            setT168(T168);
        }

        Float T84 = (Float) attributes.get("T84");

        if (T84 != null) {
            setT84(T84);
        }

        Float T42 = (Float) attributes.get("T42");

        if (T42 != null) {
            setT42(T42);
        }

        Float WS672 = (Float) attributes.get("WS672");

        if (WS672 != null) {
            setWS672(WS672);
        }

        Float WS504 = (Float) attributes.get("WS504");

        if (WS504 != null) {
            setWS504(WS504);
        }

        Float WS336 = (Float) attributes.get("WS336");

        if (WS336 != null) {
            setWS336(WS336);
        }

        Float WS168 = (Float) attributes.get("WS168");

        if (WS168 != null) {
            setWS168(WS168);
        }

        Float WS84 = (Float) attributes.get("WS84");

        if (WS84 != null) {
            setWS84(WS84);
        }

        Float WS42 = (Float) attributes.get("WS42");

        if (WS42 != null) {
            setWS42(WS42);
        }

        Float WSU740 = (Float) attributes.get("WSU740");

        if (WSU740 != null) {
            setWSU740(WSU740);
        }

        Float WSU336 = (Float) attributes.get("WSU336");

        if (WSU336 != null) {
            setWSU336(WSU336);
        }

        Float WSU168 = (Float) attributes.get("WSU168");

        if (WSU168 != null) {
            setWSU168(WSU168);
        }

        Float WSU84 = (Float) attributes.get("WSU84");

        if (WSU84 != null) {
            setWSU84(WSU84);
        }

        Float WD = (Float) attributes.get("WD");

        if (WD != null) {
            setWD(WD);
        }

        Float WD504 = (Float) attributes.get("WD504");

        if (WD504 != null) {
            setWD504(WD504);
        }

        Float WD336 = (Float) attributes.get("WD336");

        if (WD336 != null) {
            setWD336(WD336);
        }

        Float WD168 = (Float) attributes.get("WD168");

        if (WD168 != null) {
            setWD168(WD168);
        }

        Float WDU740 = (Float) attributes.get("WDU740");

        if (WDU740 != null) {
            setWDU740(WDU740);
        }

        Float WDU336 = (Float) attributes.get("WDU336");

        if (WDU336 != null) {
            setWDU336(WDU336);
        }

        Float WDU168 = (Float) attributes.get("WDU168");

        if (WDU168 != null) {
            setWDU168(WDU168);
        }

        Float WDU84 = (Float) attributes.get("WDU84");

        if (WDU84 != null) {
            setWDU84(WDU84);
        }

        Float NO672 = (Float) attributes.get("NO672");

        if (NO672 != null) {
            setNO672(NO672);
        }

        Float NO504 = (Float) attributes.get("NO504");

        if (NO504 != null) {
            setNO504(NO504);
        }

        Float NO336 = (Float) attributes.get("NO336");

        if (NO336 != null) {
            setNO336(NO336);
        }

        Float NO168 = (Float) attributes.get("NO168");

        if (NO168 != null) {
            setNO168(NO168);
        }

        Float NO84 = (Float) attributes.get("NO84");

        if (NO84 != null) {
            setNO84(NO84);
        }

        Float NO42 = (Float) attributes.get("NO42");

        if (NO42 != null) {
            setNO42(NO42);
        }

        Float NOx672 = (Float) attributes.get("NOx672");

        if (NOx672 != null) {
            setNOx672(NOx672);
        }

        Float NOx504 = (Float) attributes.get("NOx504");

        if (NOx504 != null) {
            setNOx504(NOx504);
        }

        Float NOx336 = (Float) attributes.get("NOx336");

        if (NOx336 != null) {
            setNOx336(NOx336);
        }

        Float NOx168 = (Float) attributes.get("NOx168");

        if (NOx168 != null) {
            setNOx168(NOx168);
        }

        Float NOx84 = (Float) attributes.get("NOx84");

        if (NOx84 != null) {
            setNOx84(NOx84);
        }

        Float NOx42 = (Float) attributes.get("NOx42");

        if (NOx42 != null) {
            setNOx42(NOx42);
        }

        Float O3672 = (Float) attributes.get("O3672");

        if (O3672 != null) {
            setO3672(O3672);
        }

        Float O3504 = (Float) attributes.get("O3504");

        if (O3504 != null) {
            setO3504(O3504);
        }

        Float O3336 = (Float) attributes.get("O3336");

        if (O3336 != null) {
            setO3336(O3336);
        }

        Float O3168 = (Float) attributes.get("O3168");

        if (O3168 != null) {
            setO3168(O3168);
        }

        Float O384 = (Float) attributes.get("O384");

        if (O384 != null) {
            setO384(O384);
        }

        Float O342 = (Float) attributes.get("O342");

        if (O342 != null) {
            setO342(O342);
        }

        Float SO2672 = (Float) attributes.get("SO2672");

        if (SO2672 != null) {
            setSO2672(SO2672);
        }

        Float SO2504 = (Float) attributes.get("SO2504");

        if (SO2504 != null) {
            setSO2504(SO2504);
        }

        Float SO2336 = (Float) attributes.get("SO2336");

        if (SO2336 != null) {
            setSO2336(SO2336);
        }

        Float SO2168 = (Float) attributes.get("SO2168");

        if (SO2168 != null) {
            setSO2168(SO2168);
        }

        Float SO284 = (Float) attributes.get("SO284");

        if (SO284 != null) {
            setSO284(SO284);
        }

        Float SO242 = (Float) attributes.get("SO242");

        if (SO242 != null) {
            setSO242(SO242);
        }

        Float H2O672 = (Float) attributes.get("H2O672");

        if (H2O672 != null) {
            setH2O672(H2O672);
        }

        Float H2O504 = (Float) attributes.get("H2O504");

        if (H2O504 != null) {
            setH2O504(H2O504);
        }

        Float H2O336 = (Float) attributes.get("H2O336");

        if (H2O336 != null) {
            setH2O336(H2O336);
        }

        Float H2O168 = (Float) attributes.get("H2O168");

        if (H2O168 != null) {
            setH2O168(H2O168);
        }

        Float H2O84 = (Float) attributes.get("H2O84");

        if (H2O84 != null) {
            setH2O84(H2O84);
        }

        Float H2O42 = (Float) attributes.get("H2O42");

        if (H2O42 != null) {
            setH2O42(H2O42);
        }

        Float CO2672 = (Float) attributes.get("CO2672");

        if (CO2672 != null) {
            setCO2672(CO2672);
        }

        Float CO2504 = (Float) attributes.get("CO2504");

        if (CO2504 != null) {
            setCO2504(CO2504);
        }

        Float CO2336 = (Float) attributes.get("CO2336");

        if (CO2336 != null) {
            setCO2336(CO2336);
        }

        Float CO2168 = (Float) attributes.get("CO2168");

        if (CO2168 != null) {
            setCO2168(CO2168);
        }

        Float CO284 = (Float) attributes.get("CO284");

        if (CO284 != null) {
            setCO284(CO284);
        }

        Float CO242 = (Float) attributes.get("CO242");

        if (CO242 != null) {
            setCO242(CO242);
        }

        Float H2S672 = (Float) attributes.get("H2S672");

        if (H2S672 != null) {
            setH2S672(H2S672);
        }

        Float H2S504 = (Float) attributes.get("H2S504");

        if (H2S504 != null) {
            setH2S504(H2S504);
        }

        Float H2S336 = (Float) attributes.get("H2S336");

        if (H2S336 != null) {
            setH2S336(H2S336);
        }

        Float H2S168 = (Float) attributes.get("H2S168");

        if (H2S168 != null) {
            setH2S168(H2S168);
        }

        Float H2S84 = (Float) attributes.get("H2S84");

        if (H2S84 != null) {
            setH2S84(H2S84);
        }

        Float H2S42 = (Float) attributes.get("H2S42");

        if (H2S42 != null) {
            setH2S42(H2S42);
        }

        Float RHIRGA672 = (Float) attributes.get("RHIRGA672");

        if (RHIRGA672 != null) {
            setRHIRGA672(RHIRGA672);
        }

        Float RHIRGA504 = (Float) attributes.get("RHIRGA504");

        if (RHIRGA504 != null) {
            setRHIRGA504(RHIRGA504);
        }

        Float RHIRGA336 = (Float) attributes.get("RHIRGA336");

        if (RHIRGA336 != null) {
            setRHIRGA336(RHIRGA336);
        }

        Float RHIRGA168 = (Float) attributes.get("RHIRGA168");

        if (RHIRGA168 != null) {
            setRHIRGA168(RHIRGA168);
        }

        Float RHIRGA84 = (Float) attributes.get("RHIRGA84");

        if (RHIRGA84 != null) {
            setRHIRGA84(RHIRGA84);
        }

        Float RHIRGA42 = (Float) attributes.get("RHIRGA42");

        if (RHIRGA42 != null) {
            setRHIRGA42(RHIRGA42);
        }

        Float CO672 = (Float) attributes.get("CO672");

        if (CO672 != null) {
            setCO672(CO672);
        }

        Float CO504 = (Float) attributes.get("CO504");

        if (CO504 != null) {
            setCO504(CO504);
        }

        Float CO336 = (Float) attributes.get("CO336");

        if (CO336 != null) {
            setCO336(CO336);
        }

        Float CO168 = (Float) attributes.get("CO168");

        if (CO168 != null) {
            setCO168(CO168);
        }

        Float CO84 = (Float) attributes.get("CO84");

        if (CO84 != null) {
            setCO84(CO84);
        }

        Float CO42 = (Float) attributes.get("CO42");

        if (CO42 != null) {
            setCO42(CO42);
        }

        Float RHTd = (Float) attributes.get("RHTd");

        if (RHTd != null) {
            setRHTd(RHTd);
        }

        Float PTG = (Float) attributes.get("PTG");

        if (PTG != null) {
            setPTG(PTG);
        }

        Float Visibility = (Float) attributes.get("Visibility");

        if (Visibility != null) {
            setVisibility(Visibility);
        }

        Float Visibilitymin = (Float) attributes.get("Visibilitymin");

        if (Visibilitymin != null) {
            setVisibilitymin(Visibilitymin);
        }

        Float Visibilitymax = (Float) attributes.get("Visibilitymax");

        if (Visibilitymax != null) {
            setVisibilitymax(Visibilitymax);
        }

        Float Precipint = (Float) attributes.get("Precipint");

        if (Precipint != null) {
            setPrecipint(Precipint);
        }

        Float Precipintmin = (Float) attributes.get("Precipintmin");

        if (Precipintmin != null) {
            setPrecipintmin(Precipintmin);
        }

        Float Precipintmax = (Float) attributes.get("Precipintmax");

        if (Precipintmax != null) {
            setPrecipintmax(Precipintmax);
        }

        Float Precipacc = (Float) attributes.get("Precipacc");

        if (Precipacc != null) {
            setPrecipacc(Precipacc);
        }

        Float Snowfallacc = (Float) attributes.get("Snowfallacc");

        if (Snowfallacc != null) {
            setSnowfallacc(Snowfallacc);
        }

        Integer wthcode = (Integer) attributes.get("wthcode");

        if (wthcode != null) {
            setWthcode(wthcode);
        }

        Integer wthcodemin = (Integer) attributes.get("wthcodemin");

        if (wthcodemin != null) {
            setWthcodemin(wthcodemin);
        }

        Integer wthcodemax = (Integer) attributes.get("wthcodemax");

        if (wthcodemax != null) {
            setWthcodemax(wthcodemax);
        }

        Float tsoil_humus = (Float) attributes.get("tsoil_humus");

        if (tsoil_humus != null) {
            setTsoil_humus(tsoil_humus);
        }

        Float tsoil_A = (Float) attributes.get("tsoil_A");

        if (tsoil_A != null) {
            setTsoil_A(tsoil_A);
        }

        Float tsoil_B1 = (Float) attributes.get("tsoil_B1");

        if (tsoil_B1 != null) {
            setTsoil_B1(tsoil_B1);
        }

        Float tsoil_B2 = (Float) attributes.get("tsoil_B2");

        if (tsoil_B2 != null) {
            setTsoil_B2(tsoil_B2);
        }

        Float tsoil_C1 = (Float) attributes.get("tsoil_C1");

        if (tsoil_C1 != null) {
            setTsoil_C1(tsoil_C1);
        }

        Float H2OTd = (Float) attributes.get("H2OTd");

        if (H2OTd != null) {
            setH2OTd(H2OTd);
        }

        Float CO2_storage_flux = (Float) attributes.get("CO2_storage_flux");

        if (CO2_storage_flux != null) {
            setCO2_storage_flux(CO2_storage_flux);
        }

        Float wsoil_humus = (Float) attributes.get("wsoil_humus");

        if (wsoil_humus != null) {
            setWsoil_humus(wsoil_humus);
        }

        Float wsoil_A = (Float) attributes.get("wsoil_A");

        if (wsoil_A != null) {
            setWsoil_A(wsoil_A);
        }

        Float wsoil_B1 = (Float) attributes.get("wsoil_B1");

        if (wsoil_B1 != null) {
            setWsoil_B1(wsoil_B1);
        }

        Float wsoil_B2 = (Float) attributes.get("wsoil_B2");

        if (wsoil_B2 != null) {
            setWsoil_B2(wsoil_B2);
        }

        Float wsoil_C1 = (Float) attributes.get("wsoil_C1");

        if (wsoil_C1 != null) {
            setWsoil_C1(wsoil_C1);
        }

        Float LWin = (Float) attributes.get("LWin");

        if (LWin != null) {
            setLWin(LWin);
        }

        Float LWout = (Float) attributes.get("LWout");

        if (LWout != null) {
            setLWout(LWout);
        }

        Float PRI = (Float) attributes.get("PRI");

        if (PRI != null) {
            setPRI(PRI);
        }

        Float NDVI = (Float) attributes.get("NDVI");

        if (NDVI != null) {
            setNDVI(NDVI);
        }

        Float BNDVI = (Float) attributes.get("BNDVI");

        if (BNDVI != null) {
            setBNDVI(BNDVI);
        }

        Float canPAR1 = (Float) attributes.get("canPAR1");

        if (canPAR1 != null) {
            setCanPAR1(canPAR1);
        }

        Float canPAR2 = (Float) attributes.get("canPAR2");

        if (canPAR2 != null) {
            setCanPAR2(canPAR2);
        }

        Float canPAR3 = (Float) attributes.get("canPAR3");

        if (canPAR3 != null) {
            setCanPAR3(canPAR3);
        }

        Float maaPAR = (Float) attributes.get("maaPAR");

        if (maaPAR != null) {
            setMaaPAR(maaPAR);
        }

        Float maaNet = (Float) attributes.get("maaNet");

        if (maaNet != null) {
            setMaaNet(maaNet);
        }

        Float PAR2 = (Float) attributes.get("PAR2");

        if (PAR2 != null) {
            setPAR2(PAR2);
        }

        Float Globmast = (Float) attributes.get("Globmast");

        if (Globmast != null) {
            setGlobmast(Globmast);
        }

        Float WDU672 = (Float) attributes.get("WDU672");

        if (WDU672 != null) {
            setWDU672(WDU672);
        }

        Float WSU672 = (Float) attributes.get("WSU672");

        if (WSU672 != null) {
            setWSU672(WSU672);
        }

        Float RGlob125 = (Float) attributes.get("RGlob125");

        if (RGlob125 != null) {
            setRGlob125(RGlob125);
        }

        Float CH4168 = (Float) attributes.get("CH4168");

        if (CH4168 != null) {
            setCH4168(CH4168);
        }

        Float CH4672 = (Float) attributes.get("CH4672");

        if (CH4672 != null) {
            setCH4672(CH4672);
        }

        Float CH41250 = (Float) attributes.get("CH41250");

        if (CH41250 != null) {
            setCH41250(CH41250);
        }

        Float T1250 = (Float) attributes.get("T1250");

        if (T1250 != null) {
            setT1250(T1250);
        }

        Float wpsoil_A = (Float) attributes.get("wpsoil_A");

        if (wpsoil_A != null) {
            setWpsoil_A(wpsoil_A);
        }

        Float wpsoil_B = (Float) attributes.get("wpsoil_B");

        if (wpsoil_B != null) {
            setWpsoil_B(wpsoil_B);
        }

        Float runoff1 = (Float) attributes.get("runoff1");

        if (runoff1 != null) {
            setRunoff1(runoff1);
        }

        Float runoff2 = (Float) attributes.get("runoff2");

        if (runoff2 != null) {
            setRunoff2(runoff2);
        }

        Float drainage1 = (Float) attributes.get("drainage1");

        if (drainage1 != null) {
            setDrainage1(drainage1);
        }

        Float CO2icos168 = (Float) attributes.get("CO2icos168");

        if (CO2icos168 != null) {
            setCO2icos168(CO2icos168);
        }

        Float CO2icos672 = (Float) attributes.get("CO2icos672");

        if (CO2icos672 != null) {
            setCO2icos672(CO2icos672);
        }

        Float CO2icos1250 = (Float) attributes.get("CO2icos1250");

        if (CO2icos1250 != null) {
            setCO2icos1250(CO2icos1250);
        }

        Float H2Oicos168 = (Float) attributes.get("H2Oicos168");

        if (H2Oicos168 != null) {
            setH2Oicos168(H2Oicos168);
        }

        Float H2Oicos672 = (Float) attributes.get("H2Oicos672");

        if (H2Oicos672 != null) {
            setH2Oicos672(H2Oicos672);
        }

        Float H2Oicos1250 = (Float) attributes.get("H2Oicos1250");

        if (H2Oicos1250 != null) {
            setH2Oicos1250(H2Oicos1250);
        }

        Integer UV_A_EMEP = (Integer) attributes.get("UV_A_EMEP");

        if (UV_A_EMEP != null) {
            setUV_A_EMEP(UV_A_EMEP);
        }

        Integer UV_B_EMEP = (Integer) attributes.get("UV_B_EMEP");

        if (UV_B_EMEP != null) {
            setUV_B_EMEP(UV_B_EMEP);
        }

        Integer diffPAR_EMEP = (Integer) attributes.get("diffPAR_EMEP");

        if (diffPAR_EMEP != null) {
            setDiffPAR_EMEP(diffPAR_EMEP);
        }

        Integer diffGLOB_EMEP = (Integer) attributes.get("diffGLOB_EMEP");

        if (diffGLOB_EMEP != null) {
            setDiffGLOB_EMEP(diffGLOB_EMEP);
        }

        Integer dirGLOB_EMEP = (Integer) attributes.get("dirGLOB_EMEP");

        if (dirGLOB_EMEP != null) {
            setDirGLOB_EMEP(dirGLOB_EMEP);
        }

        Integer Net_EMEP = (Integer) attributes.get("Net_EMEP");

        if (Net_EMEP != null) {
            setNet_EMEP(Net_EMEP);
        }

        Integer RGlob_EMEP = (Integer) attributes.get("RGlob_EMEP");

        if (RGlob_EMEP != null) {
            setRGlob_EMEP(RGlob_EMEP);
        }

        Integer Glob_EMEP = (Integer) attributes.get("Glob_EMEP");

        if (Glob_EMEP != null) {
            setGlob_EMEP(Glob_EMEP);
        }

        Integer RPAR_EMEP = (Integer) attributes.get("RPAR_EMEP");

        if (RPAR_EMEP != null) {
            setRPAR_EMEP(RPAR_EMEP);
        }

        Integer PAR_EMEP = (Integer) attributes.get("PAR_EMEP");

        if (PAR_EMEP != null) {
            setPAR_EMEP(PAR_EMEP);
        }

        Integer dirPAR_EMEP = (Integer) attributes.get("dirPAR_EMEP");

        if (dirPAR_EMEP != null) {
            setDirPAR_EMEP(dirPAR_EMEP);
        }

        Integer canIR_EMEP = (Integer) attributes.get("canIR_EMEP");

        if (canIR_EMEP != null) {
            setCanIR_EMEP(canIR_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_hydemetaRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUV_A() {
        return _UV_A;
    }

    @Override
    public void setUV_A(float UV_A) {
        _UV_A = UV_A;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setUV_A", float.class);

                method.invoke(_hydemetaRemoteModel, UV_A);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getUV_B() {
        return _UV_B;
    }

    @Override
    public void setUV_B(float UV_B) {
        _UV_B = UV_B;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setUV_B", float.class);

                method.invoke(_hydemetaRemoteModel, UV_B);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDiffPAR() {
        return _diffPAR;
    }

    @Override
    public void setDiffPAR(float diffPAR) {
        _diffPAR = diffPAR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDiffPAR", float.class);

                method.invoke(_hydemetaRemoteModel, diffPAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDiffGLOB() {
        return _diffGLOB;
    }

    @Override
    public void setDiffGLOB(float diffGLOB) {
        _diffGLOB = diffGLOB;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDiffGLOB", float.class);

                method.invoke(_hydemetaRemoteModel, diffGLOB);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDirGLOB() {
        return _dirGLOB;
    }

    @Override
    public void setDirGLOB(float dirGLOB) {
        _dirGLOB = dirGLOB;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDirGLOB", float.class);

                method.invoke(_hydemetaRemoteModel, dirGLOB);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNet() {
        return _Net;
    }

    @Override
    public void setNet(float Net) {
        _Net = Net;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet", float.class);

                method.invoke(_hydemetaRemoteModel, Net);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRGlob() {
        return _RGlob;
    }

    @Override
    public void setRGlob(float RGlob) {
        _RGlob = RGlob;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRGlob", float.class);

                method.invoke(_hydemetaRemoteModel, RGlob);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getGlob() {
        return _Glob;
    }

    @Override
    public void setGlob(float Glob) {
        _Glob = Glob;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlob", float.class);

                method.invoke(_hydemetaRemoteModel, Glob);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRPAR() {
        return _RPAR;
    }

    @Override
    public void setRPAR(float RPAR) {
        _RPAR = RPAR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRPAR", float.class);

                method.invoke(_hydemetaRemoteModel, RPAR);
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

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR", float.class);

                method.invoke(_hydemetaRemoteModel, PAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDirPAR() {
        return _dirPAR;
    }

    @Override
    public void setDirPAR(float dirPAR) {
        _dirPAR = dirPAR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDirPAR", float.class);

                method.invoke(_hydemetaRemoteModel, dirPAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCanIR() {
        return _canIR;
    }

    @Override
    public void setCanIR(float canIR) {
        _canIR = canIR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCanIR", float.class);

                method.invoke(_hydemetaRemoteModel, canIR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSkyIR() {
        return _skyIR;
    }

    @Override
    public void setSkyIR(float skyIR) {
        _skyIR = skyIR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSkyIR", float.class);

                method.invoke(_hydemetaRemoteModel, skyIR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecip() {
        return _Precip;
    }

    @Override
    public void setPrecip(float Precip) {
        _Precip = Precip;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecip", float.class);

                method.invoke(_hydemetaRemoteModel, Precip);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSWS() {
        return _SWS;
    }

    @Override
    public void setSWS(float SWS) {
        _SWS = SWS;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSWS", float.class);

                method.invoke(_hydemetaRemoteModel, SWS);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTd() {
        return _Td;
    }

    @Override
    public void setTd(float Td) {
        _Td = Td;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTd", float.class);

                method.invoke(_hydemetaRemoteModel, Td);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPamb0() {
        return _Pamb0;
    }

    @Override
    public void setPamb0(float Pamb0) {
        _Pamb0 = Pamb0;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPamb0", float.class);

                method.invoke(_hydemetaRemoteModel, Pamb0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT672() {
        return _T672;
    }

    @Override
    public void setT672(float T672) {
        _T672 = T672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT672", float.class);

                method.invoke(_hydemetaRemoteModel, T672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT504() {
        return _T504;
    }

    @Override
    public void setT504(float T504) {
        _T504 = T504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT504", float.class);

                method.invoke(_hydemetaRemoteModel, T504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT336() {
        return _T336;
    }

    @Override
    public void setT336(float T336) {
        _T336 = T336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT336", float.class);

                method.invoke(_hydemetaRemoteModel, T336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT168() {
        return _T168;
    }

    @Override
    public void setT168(float T168) {
        _T168 = T168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT168", float.class);

                method.invoke(_hydemetaRemoteModel, T168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT84() {
        return _T84;
    }

    @Override
    public void setT84(float T84) {
        _T84 = T84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT84", float.class);

                method.invoke(_hydemetaRemoteModel, T84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT42() {
        return _T42;
    }

    @Override
    public void setT42(float T42) {
        _T42 = T42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT42", float.class);

                method.invoke(_hydemetaRemoteModel, T42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS672() {
        return _WS672;
    }

    @Override
    public void setWS672(float WS672) {
        _WS672 = WS672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS672", float.class);

                method.invoke(_hydemetaRemoteModel, WS672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS504() {
        return _WS504;
    }

    @Override
    public void setWS504(float WS504) {
        _WS504 = WS504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS504", float.class);

                method.invoke(_hydemetaRemoteModel, WS504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS336() {
        return _WS336;
    }

    @Override
    public void setWS336(float WS336) {
        _WS336 = WS336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS336", float.class);

                method.invoke(_hydemetaRemoteModel, WS336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS168() {
        return _WS168;
    }

    @Override
    public void setWS168(float WS168) {
        _WS168 = WS168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS168", float.class);

                method.invoke(_hydemetaRemoteModel, WS168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS84() {
        return _WS84;
    }

    @Override
    public void setWS84(float WS84) {
        _WS84 = WS84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS84", float.class);

                method.invoke(_hydemetaRemoteModel, WS84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWS42() {
        return _WS42;
    }

    @Override
    public void setWS42(float WS42) {
        _WS42 = WS42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWS42", float.class);

                method.invoke(_hydemetaRemoteModel, WS42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWSU740() {
        return _WSU740;
    }

    @Override
    public void setWSU740(float WSU740) {
        _WSU740 = WSU740;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWSU740", float.class);

                method.invoke(_hydemetaRemoteModel, WSU740);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWSU336() {
        return _WSU336;
    }

    @Override
    public void setWSU336(float WSU336) {
        _WSU336 = WSU336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWSU336", float.class);

                method.invoke(_hydemetaRemoteModel, WSU336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWSU168() {
        return _WSU168;
    }

    @Override
    public void setWSU168(float WSU168) {
        _WSU168 = WSU168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWSU168", float.class);

                method.invoke(_hydemetaRemoteModel, WSU168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWSU84() {
        return _WSU84;
    }

    @Override
    public void setWSU84(float WSU84) {
        _WSU84 = WSU84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWSU84", float.class);

                method.invoke(_hydemetaRemoteModel, WSU84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWD() {
        return _WD;
    }

    @Override
    public void setWD(float WD) {
        _WD = WD;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWD", float.class);

                method.invoke(_hydemetaRemoteModel, WD);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWD504() {
        return _WD504;
    }

    @Override
    public void setWD504(float WD504) {
        _WD504 = WD504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWD504", float.class);

                method.invoke(_hydemetaRemoteModel, WD504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWD336() {
        return _WD336;
    }

    @Override
    public void setWD336(float WD336) {
        _WD336 = WD336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWD336", float.class);

                method.invoke(_hydemetaRemoteModel, WD336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWD168() {
        return _WD168;
    }

    @Override
    public void setWD168(float WD168) {
        _WD168 = WD168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWD168", float.class);

                method.invoke(_hydemetaRemoteModel, WD168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDU740() {
        return _WDU740;
    }

    @Override
    public void setWDU740(float WDU740) {
        _WDU740 = WDU740;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDU740", float.class);

                method.invoke(_hydemetaRemoteModel, WDU740);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDU336() {
        return _WDU336;
    }

    @Override
    public void setWDU336(float WDU336) {
        _WDU336 = WDU336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDU336", float.class);

                method.invoke(_hydemetaRemoteModel, WDU336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDU168() {
        return _WDU168;
    }

    @Override
    public void setWDU168(float WDU168) {
        _WDU168 = WDU168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDU168", float.class);

                method.invoke(_hydemetaRemoteModel, WDU168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDU84() {
        return _WDU84;
    }

    @Override
    public void setWDU84(float WDU84) {
        _WDU84 = WDU84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDU84", float.class);

                method.invoke(_hydemetaRemoteModel, WDU84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO672() {
        return _NO672;
    }

    @Override
    public void setNO672(float NO672) {
        _NO672 = NO672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO672", float.class);

                method.invoke(_hydemetaRemoteModel, NO672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO504() {
        return _NO504;
    }

    @Override
    public void setNO504(float NO504) {
        _NO504 = NO504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO504", float.class);

                method.invoke(_hydemetaRemoteModel, NO504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO336() {
        return _NO336;
    }

    @Override
    public void setNO336(float NO336) {
        _NO336 = NO336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO336", float.class);

                method.invoke(_hydemetaRemoteModel, NO336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO168() {
        return _NO168;
    }

    @Override
    public void setNO168(float NO168) {
        _NO168 = NO168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO168", float.class);

                method.invoke(_hydemetaRemoteModel, NO168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO84() {
        return _NO84;
    }

    @Override
    public void setNO84(float NO84) {
        _NO84 = NO84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO84", float.class);

                method.invoke(_hydemetaRemoteModel, NO84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNO42() {
        return _NO42;
    }

    @Override
    public void setNO42(float NO42) {
        _NO42 = NO42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNO42", float.class);

                method.invoke(_hydemetaRemoteModel, NO42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx672() {
        return _NOx672;
    }

    @Override
    public void setNOx672(float NOx672) {
        _NOx672 = NOx672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx672", float.class);

                method.invoke(_hydemetaRemoteModel, NOx672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx504() {
        return _NOx504;
    }

    @Override
    public void setNOx504(float NOx504) {
        _NOx504 = NOx504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx504", float.class);

                method.invoke(_hydemetaRemoteModel, NOx504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx336() {
        return _NOx336;
    }

    @Override
    public void setNOx336(float NOx336) {
        _NOx336 = NOx336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx336", float.class);

                method.invoke(_hydemetaRemoteModel, NOx336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx168() {
        return _NOx168;
    }

    @Override
    public void setNOx168(float NOx168) {
        _NOx168 = NOx168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx168", float.class);

                method.invoke(_hydemetaRemoteModel, NOx168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx84() {
        return _NOx84;
    }

    @Override
    public void setNOx84(float NOx84) {
        _NOx84 = NOx84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx84", float.class);

                method.invoke(_hydemetaRemoteModel, NOx84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNOx42() {
        return _NOx42;
    }

    @Override
    public void setNOx42(float NOx42) {
        _NOx42 = NOx42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNOx42", float.class);

                method.invoke(_hydemetaRemoteModel, NOx42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3672() {
        return _O3672;
    }

    @Override
    public void setO3672(float O3672) {
        _O3672 = O3672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3672", float.class);

                method.invoke(_hydemetaRemoteModel, O3672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3504() {
        return _O3504;
    }

    @Override
    public void setO3504(float O3504) {
        _O3504 = O3504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3504", float.class);

                method.invoke(_hydemetaRemoteModel, O3504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3336() {
        return _O3336;
    }

    @Override
    public void setO3336(float O3336) {
        _O3336 = O3336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3336", float.class);

                method.invoke(_hydemetaRemoteModel, O3336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO3168() {
        return _O3168;
    }

    @Override
    public void setO3168(float O3168) {
        _O3168 = O3168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO3168", float.class);

                method.invoke(_hydemetaRemoteModel, O3168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO384() {
        return _O384;
    }

    @Override
    public void setO384(float O384) {
        _O384 = O384;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO384", float.class);

                method.invoke(_hydemetaRemoteModel, O384);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getO342() {
        return _O342;
    }

    @Override
    public void setO342(float O342) {
        _O342 = O342;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setO342", float.class);

                method.invoke(_hydemetaRemoteModel, O342);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2672() {
        return _SO2672;
    }

    @Override
    public void setSO2672(float SO2672) {
        _SO2672 = SO2672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2672", float.class);

                method.invoke(_hydemetaRemoteModel, SO2672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2504() {
        return _SO2504;
    }

    @Override
    public void setSO2504(float SO2504) {
        _SO2504 = SO2504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2504", float.class);

                method.invoke(_hydemetaRemoteModel, SO2504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2336() {
        return _SO2336;
    }

    @Override
    public void setSO2336(float SO2336) {
        _SO2336 = SO2336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2336", float.class);

                method.invoke(_hydemetaRemoteModel, SO2336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO2168() {
        return _SO2168;
    }

    @Override
    public void setSO2168(float SO2168) {
        _SO2168 = SO2168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO2168", float.class);

                method.invoke(_hydemetaRemoteModel, SO2168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO284() {
        return _SO284;
    }

    @Override
    public void setSO284(float SO284) {
        _SO284 = SO284;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO284", float.class);

                method.invoke(_hydemetaRemoteModel, SO284);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSO242() {
        return _SO242;
    }

    @Override
    public void setSO242(float SO242) {
        _SO242 = SO242;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSO242", float.class);

                method.invoke(_hydemetaRemoteModel, SO242);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O672() {
        return _H2O672;
    }

    @Override
    public void setH2O672(float H2O672) {
        _H2O672 = H2O672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O672", float.class);

                method.invoke(_hydemetaRemoteModel, H2O672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O504() {
        return _H2O504;
    }

    @Override
    public void setH2O504(float H2O504) {
        _H2O504 = H2O504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O504", float.class);

                method.invoke(_hydemetaRemoteModel, H2O504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O336() {
        return _H2O336;
    }

    @Override
    public void setH2O336(float H2O336) {
        _H2O336 = H2O336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O336", float.class);

                method.invoke(_hydemetaRemoteModel, H2O336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O168() {
        return _H2O168;
    }

    @Override
    public void setH2O168(float H2O168) {
        _H2O168 = H2O168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O168", float.class);

                method.invoke(_hydemetaRemoteModel, H2O168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O84() {
        return _H2O84;
    }

    @Override
    public void setH2O84(float H2O84) {
        _H2O84 = H2O84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O84", float.class);

                method.invoke(_hydemetaRemoteModel, H2O84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O42() {
        return _H2O42;
    }

    @Override
    public void setH2O42(float H2O42) {
        _H2O42 = H2O42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O42", float.class);

                method.invoke(_hydemetaRemoteModel, H2O42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2672() {
        return _CO2672;
    }

    @Override
    public void setCO2672(float CO2672) {
        _CO2672 = CO2672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2672", float.class);

                method.invoke(_hydemetaRemoteModel, CO2672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2504() {
        return _CO2504;
    }

    @Override
    public void setCO2504(float CO2504) {
        _CO2504 = CO2504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2504", float.class);

                method.invoke(_hydemetaRemoteModel, CO2504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2336() {
        return _CO2336;
    }

    @Override
    public void setCO2336(float CO2336) {
        _CO2336 = CO2336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2336", float.class);

                method.invoke(_hydemetaRemoteModel, CO2336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2168() {
        return _CO2168;
    }

    @Override
    public void setCO2168(float CO2168) {
        _CO2168 = CO2168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2168", float.class);

                method.invoke(_hydemetaRemoteModel, CO2168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO284() {
        return _CO284;
    }

    @Override
    public void setCO284(float CO284) {
        _CO284 = CO284;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO284", float.class);

                method.invoke(_hydemetaRemoteModel, CO284);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO242() {
        return _CO242;
    }

    @Override
    public void setCO242(float CO242) {
        _CO242 = CO242;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO242", float.class);

                method.invoke(_hydemetaRemoteModel, CO242);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S672() {
        return _H2S672;
    }

    @Override
    public void setH2S672(float H2S672) {
        _H2S672 = H2S672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S672", float.class);

                method.invoke(_hydemetaRemoteModel, H2S672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S504() {
        return _H2S504;
    }

    @Override
    public void setH2S504(float H2S504) {
        _H2S504 = H2S504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S504", float.class);

                method.invoke(_hydemetaRemoteModel, H2S504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S336() {
        return _H2S336;
    }

    @Override
    public void setH2S336(float H2S336) {
        _H2S336 = H2S336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S336", float.class);

                method.invoke(_hydemetaRemoteModel, H2S336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S168() {
        return _H2S168;
    }

    @Override
    public void setH2S168(float H2S168) {
        _H2S168 = H2S168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S168", float.class);

                method.invoke(_hydemetaRemoteModel, H2S168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S84() {
        return _H2S84;
    }

    @Override
    public void setH2S84(float H2S84) {
        _H2S84 = H2S84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S84", float.class);

                method.invoke(_hydemetaRemoteModel, H2S84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2S42() {
        return _H2S42;
    }

    @Override
    public void setH2S42(float H2S42) {
        _H2S42 = H2S42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2S42", float.class);

                method.invoke(_hydemetaRemoteModel, H2S42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA672() {
        return _RHIRGA672;
    }

    @Override
    public void setRHIRGA672(float RHIRGA672) {
        _RHIRGA672 = RHIRGA672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA672", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA504() {
        return _RHIRGA504;
    }

    @Override
    public void setRHIRGA504(float RHIRGA504) {
        _RHIRGA504 = RHIRGA504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA504", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA336() {
        return _RHIRGA336;
    }

    @Override
    public void setRHIRGA336(float RHIRGA336) {
        _RHIRGA336 = RHIRGA336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA336", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA168() {
        return _RHIRGA168;
    }

    @Override
    public void setRHIRGA168(float RHIRGA168) {
        _RHIRGA168 = RHIRGA168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA168", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA84() {
        return _RHIRGA84;
    }

    @Override
    public void setRHIRGA84(float RHIRGA84) {
        _RHIRGA84 = RHIRGA84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA84", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHIRGA42() {
        return _RHIRGA42;
    }

    @Override
    public void setRHIRGA42(float RHIRGA42) {
        _RHIRGA42 = RHIRGA42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHIRGA42", float.class);

                method.invoke(_hydemetaRemoteModel, RHIRGA42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO672() {
        return _CO672;
    }

    @Override
    public void setCO672(float CO672) {
        _CO672 = CO672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO672", float.class);

                method.invoke(_hydemetaRemoteModel, CO672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO504() {
        return _CO504;
    }

    @Override
    public void setCO504(float CO504) {
        _CO504 = CO504;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO504", float.class);

                method.invoke(_hydemetaRemoteModel, CO504);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO336() {
        return _CO336;
    }

    @Override
    public void setCO336(float CO336) {
        _CO336 = CO336;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO336", float.class);

                method.invoke(_hydemetaRemoteModel, CO336);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO168() {
        return _CO168;
    }

    @Override
    public void setCO168(float CO168) {
        _CO168 = CO168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO168", float.class);

                method.invoke(_hydemetaRemoteModel, CO168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO84() {
        return _CO84;
    }

    @Override
    public void setCO84(float CO84) {
        _CO84 = CO84;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO84", float.class);

                method.invoke(_hydemetaRemoteModel, CO84);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO42() {
        return _CO42;
    }

    @Override
    public void setCO42(float CO42) {
        _CO42 = CO42;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO42", float.class);

                method.invoke(_hydemetaRemoteModel, CO42);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRHTd() {
        return _RHTd;
    }

    @Override
    public void setRHTd(float RHTd) {
        _RHTd = RHTd;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRHTd", float.class);

                method.invoke(_hydemetaRemoteModel, RHTd);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPTG() {
        return _PTG;
    }

    @Override
    public void setPTG(float PTG) {
        _PTG = PTG;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPTG", float.class);

                method.invoke(_hydemetaRemoteModel, PTG);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getVisibility() {
        return _Visibility;
    }

    @Override
    public void setVisibility(float Visibility) {
        _Visibility = Visibility;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setVisibility", float.class);

                method.invoke(_hydemetaRemoteModel, Visibility);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getVisibilitymin() {
        return _Visibilitymin;
    }

    @Override
    public void setVisibilitymin(float Visibilitymin) {
        _Visibilitymin = Visibilitymin;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setVisibilitymin", float.class);

                method.invoke(_hydemetaRemoteModel, Visibilitymin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getVisibilitymax() {
        return _Visibilitymax;
    }

    @Override
    public void setVisibilitymax(float Visibilitymax) {
        _Visibilitymax = Visibilitymax;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setVisibilitymax", float.class);

                method.invoke(_hydemetaRemoteModel, Visibilitymax);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecipint() {
        return _Precipint;
    }

    @Override
    public void setPrecipint(float Precipint) {
        _Precipint = Precipint;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecipint", float.class);

                method.invoke(_hydemetaRemoteModel, Precipint);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecipintmin() {
        return _Precipintmin;
    }

    @Override
    public void setPrecipintmin(float Precipintmin) {
        _Precipintmin = Precipintmin;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecipintmin", float.class);

                method.invoke(_hydemetaRemoteModel, Precipintmin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPrecipintmax() {
        return _Precipintmax;
    }

    @Override
    public void setPrecipintmax(float Precipintmax) {
        _Precipintmax = Precipintmax;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecipintmax", float.class);

                method.invoke(_hydemetaRemoteModel, Precipintmax);
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

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecipacc", float.class);

                method.invoke(_hydemetaRemoteModel, Precipacc);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getSnowfallacc() {
        return _Snowfallacc;
    }

    @Override
    public void setSnowfallacc(float Snowfallacc) {
        _Snowfallacc = Snowfallacc;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSnowfallacc", float.class);

                method.invoke(_hydemetaRemoteModel, Snowfallacc);
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

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWthcode", int.class);

                method.invoke(_hydemetaRemoteModel, wthcode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWthcodemin() {
        return _wthcodemin;
    }

    @Override
    public void setWthcodemin(int wthcodemin) {
        _wthcodemin = wthcodemin;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWthcodemin", int.class);

                method.invoke(_hydemetaRemoteModel, wthcodemin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWthcodemax() {
        return _wthcodemax;
    }

    @Override
    public void setWthcodemax(int wthcodemax) {
        _wthcodemax = wthcodemax;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWthcodemax", int.class);

                method.invoke(_hydemetaRemoteModel, wthcodemax);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil_humus() {
        return _tsoil_humus;
    }

    @Override
    public void setTsoil_humus(float tsoil_humus) {
        _tsoil_humus = tsoil_humus;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_humus", float.class);

                method.invoke(_hydemetaRemoteModel, tsoil_humus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil_A() {
        return _tsoil_A;
    }

    @Override
    public void setTsoil_A(float tsoil_A) {
        _tsoil_A = tsoil_A;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_A", float.class);

                method.invoke(_hydemetaRemoteModel, tsoil_A);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil_B1() {
        return _tsoil_B1;
    }

    @Override
    public void setTsoil_B1(float tsoil_B1) {
        _tsoil_B1 = tsoil_B1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_B1", float.class);

                method.invoke(_hydemetaRemoteModel, tsoil_B1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil_B2() {
        return _tsoil_B2;
    }

    @Override
    public void setTsoil_B2(float tsoil_B2) {
        _tsoil_B2 = tsoil_B2;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_B2", float.class);

                method.invoke(_hydemetaRemoteModel, tsoil_B2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTsoil_C1() {
        return _tsoil_C1;
    }

    @Override
    public void setTsoil_C1(float tsoil_C1) {
        _tsoil_C1 = tsoil_C1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTsoil_C1", float.class);

                method.invoke(_hydemetaRemoteModel, tsoil_C1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2OTd() {
        return _H2OTd;
    }

    @Override
    public void setH2OTd(float H2OTd) {
        _H2OTd = H2OTd;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2OTd", float.class);

                method.invoke(_hydemetaRemoteModel, H2OTd);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2_storage_flux() {
        return _CO2_storage_flux;
    }

    @Override
    public void setCO2_storage_flux(float CO2_storage_flux) {
        _CO2_storage_flux = CO2_storage_flux;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_storage_flux",
                        float.class);

                method.invoke(_hydemetaRemoteModel, CO2_storage_flux);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_humus() {
        return _wsoil_humus;
    }

    @Override
    public void setWsoil_humus(float wsoil_humus) {
        _wsoil_humus = wsoil_humus;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_humus", float.class);

                method.invoke(_hydemetaRemoteModel, wsoil_humus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_A() {
        return _wsoil_A;
    }

    @Override
    public void setWsoil_A(float wsoil_A) {
        _wsoil_A = wsoil_A;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_A", float.class);

                method.invoke(_hydemetaRemoteModel, wsoil_A);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_B1() {
        return _wsoil_B1;
    }

    @Override
    public void setWsoil_B1(float wsoil_B1) {
        _wsoil_B1 = wsoil_B1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_B1", float.class);

                method.invoke(_hydemetaRemoteModel, wsoil_B1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_B2() {
        return _wsoil_B2;
    }

    @Override
    public void setWsoil_B2(float wsoil_B2) {
        _wsoil_B2 = wsoil_B2;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_B2", float.class);

                method.invoke(_hydemetaRemoteModel, wsoil_B2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWsoil_C1() {
        return _wsoil_C1;
    }

    @Override
    public void setWsoil_C1(float wsoil_C1) {
        _wsoil_C1 = wsoil_C1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWsoil_C1", float.class);

                method.invoke(_hydemetaRemoteModel, wsoil_C1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLWin() {
        return _LWin;
    }

    @Override
    public void setLWin(float LWin) {
        _LWin = LWin;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWin", float.class);

                method.invoke(_hydemetaRemoteModel, LWin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLWout() {
        return _LWout;
    }

    @Override
    public void setLWout(float LWout) {
        _LWout = LWout;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWout", float.class);

                method.invoke(_hydemetaRemoteModel, LWout);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPRI() {
        return _PRI;
    }

    @Override
    public void setPRI(float PRI) {
        _PRI = PRI;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPRI", float.class);

                method.invoke(_hydemetaRemoteModel, PRI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getNDVI() {
        return _NDVI;
    }

    @Override
    public void setNDVI(float NDVI) {
        _NDVI = NDVI;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNDVI", float.class);

                method.invoke(_hydemetaRemoteModel, NDVI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBNDVI() {
        return _BNDVI;
    }

    @Override
    public void setBNDVI(float BNDVI) {
        _BNDVI = BNDVI;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setBNDVI", float.class);

                method.invoke(_hydemetaRemoteModel, BNDVI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCanPAR1() {
        return _canPAR1;
    }

    @Override
    public void setCanPAR1(float canPAR1) {
        _canPAR1 = canPAR1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCanPAR1", float.class);

                method.invoke(_hydemetaRemoteModel, canPAR1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCanPAR2() {
        return _canPAR2;
    }

    @Override
    public void setCanPAR2(float canPAR2) {
        _canPAR2 = canPAR2;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCanPAR2", float.class);

                method.invoke(_hydemetaRemoteModel, canPAR2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCanPAR3() {
        return _canPAR3;
    }

    @Override
    public void setCanPAR3(float canPAR3) {
        _canPAR3 = canPAR3;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCanPAR3", float.class);

                method.invoke(_hydemetaRemoteModel, canPAR3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMaaPAR() {
        return _maaPAR;
    }

    @Override
    public void setMaaPAR(float maaPAR) {
        _maaPAR = maaPAR;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setMaaPAR", float.class);

                method.invoke(_hydemetaRemoteModel, maaPAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMaaNet() {
        return _maaNet;
    }

    @Override
    public void setMaaNet(float maaNet) {
        _maaNet = maaNet;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setMaaNet", float.class);

                method.invoke(_hydemetaRemoteModel, maaNet);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPAR2() {
        return _PAR2;
    }

    @Override
    public void setPAR2(float PAR2) {
        _PAR2 = PAR2;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR2", float.class);

                method.invoke(_hydemetaRemoteModel, PAR2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getGlobmast() {
        return _Globmast;
    }

    @Override
    public void setGlobmast(float Globmast) {
        _Globmast = Globmast;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlobmast", float.class);

                method.invoke(_hydemetaRemoteModel, Globmast);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWDU672() {
        return _WDU672;
    }

    @Override
    public void setWDU672(float WDU672) {
        _WDU672 = WDU672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWDU672", float.class);

                method.invoke(_hydemetaRemoteModel, WDU672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWSU672() {
        return _WSU672;
    }

    @Override
    public void setWSU672(float WSU672) {
        _WSU672 = WSU672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWSU672", float.class);

                method.invoke(_hydemetaRemoteModel, WSU672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRGlob125() {
        return _RGlob125;
    }

    @Override
    public void setRGlob125(float RGlob125) {
        _RGlob125 = RGlob125;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRGlob125", float.class);

                method.invoke(_hydemetaRemoteModel, RGlob125);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCH4168() {
        return _CH4168;
    }

    @Override
    public void setCH4168(float CH4168) {
        _CH4168 = CH4168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4168", float.class);

                method.invoke(_hydemetaRemoteModel, CH4168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCH4672() {
        return _CH4672;
    }

    @Override
    public void setCH4672(float CH4672) {
        _CH4672 = CH4672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4672", float.class);

                method.invoke(_hydemetaRemoteModel, CH4672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCH41250() {
        return _CH41250;
    }

    @Override
    public void setCH41250(float CH41250) {
        _CH41250 = CH41250;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCH41250", float.class);

                method.invoke(_hydemetaRemoteModel, CH41250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT1250() {
        return _T1250;
    }

    @Override
    public void setT1250(float T1250) {
        _T1250 = T1250;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setT1250", float.class);

                method.invoke(_hydemetaRemoteModel, T1250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWpsoil_A() {
        return _wpsoil_A;
    }

    @Override
    public void setWpsoil_A(float wpsoil_A) {
        _wpsoil_A = wpsoil_A;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWpsoil_A", float.class);

                method.invoke(_hydemetaRemoteModel, wpsoil_A);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWpsoil_B() {
        return _wpsoil_B;
    }

    @Override
    public void setWpsoil_B(float wpsoil_B) {
        _wpsoil_B = wpsoil_B;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setWpsoil_B", float.class);

                method.invoke(_hydemetaRemoteModel, wpsoil_B);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRunoff1() {
        return _runoff1;
    }

    @Override
    public void setRunoff1(float runoff1) {
        _runoff1 = runoff1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRunoff1", float.class);

                method.invoke(_hydemetaRemoteModel, runoff1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRunoff2() {
        return _runoff2;
    }

    @Override
    public void setRunoff2(float runoff2) {
        _runoff2 = runoff2;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRunoff2", float.class);

                method.invoke(_hydemetaRemoteModel, runoff2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getDrainage1() {
        return _drainage1;
    }

    @Override
    public void setDrainage1(float drainage1) {
        _drainage1 = drainage1;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDrainage1", float.class);

                method.invoke(_hydemetaRemoteModel, drainage1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2icos168() {
        return _CO2icos168;
    }

    @Override
    public void setCO2icos168(float CO2icos168) {
        _CO2icos168 = CO2icos168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2icos168", float.class);

                method.invoke(_hydemetaRemoteModel, CO2icos168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2icos672() {
        return _CO2icos672;
    }

    @Override
    public void setCO2icos672(float CO2icos672) {
        _CO2icos672 = CO2icos672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2icos672", float.class);

                method.invoke(_hydemetaRemoteModel, CO2icos672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2icos1250() {
        return _CO2icos1250;
    }

    @Override
    public void setCO2icos1250(float CO2icos1250) {
        _CO2icos1250 = CO2icos1250;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2icos1250", float.class);

                method.invoke(_hydemetaRemoteModel, CO2icos1250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2Oicos168() {
        return _H2Oicos168;
    }

    @Override
    public void setH2Oicos168(float H2Oicos168) {
        _H2Oicos168 = H2Oicos168;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2Oicos168", float.class);

                method.invoke(_hydemetaRemoteModel, H2Oicos168);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2Oicos672() {
        return _H2Oicos672;
    }

    @Override
    public void setH2Oicos672(float H2Oicos672) {
        _H2Oicos672 = H2Oicos672;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2Oicos672", float.class);

                method.invoke(_hydemetaRemoteModel, H2Oicos672);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2Oicos1250() {
        return _H2Oicos1250;
    }

    @Override
    public void setH2Oicos1250(float H2Oicos1250) {
        _H2Oicos1250 = H2Oicos1250;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setH2Oicos1250", float.class);

                method.invoke(_hydemetaRemoteModel, H2Oicos1250);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getUV_A_EMEP() {
        return _UV_A_EMEP;
    }

    @Override
    public void setUV_A_EMEP(int UV_A_EMEP) {
        _UV_A_EMEP = UV_A_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setUV_A_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, UV_A_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getUV_B_EMEP() {
        return _UV_B_EMEP;
    }

    @Override
    public void setUV_B_EMEP(int UV_B_EMEP) {
        _UV_B_EMEP = UV_B_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setUV_B_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, UV_B_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDiffPAR_EMEP() {
        return _diffPAR_EMEP;
    }

    @Override
    public void setDiffPAR_EMEP(int diffPAR_EMEP) {
        _diffPAR_EMEP = diffPAR_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDiffPAR_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, diffPAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDiffGLOB_EMEP() {
        return _diffGLOB_EMEP;
    }

    @Override
    public void setDiffGLOB_EMEP(int diffGLOB_EMEP) {
        _diffGLOB_EMEP = diffGLOB_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDiffGLOB_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, diffGLOB_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDirGLOB_EMEP() {
        return _dirGLOB_EMEP;
    }

    @Override
    public void setDirGLOB_EMEP(int dirGLOB_EMEP) {
        _dirGLOB_EMEP = dirGLOB_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDirGLOB_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, dirGLOB_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNet_EMEP() {
        return _Net_EMEP;
    }

    @Override
    public void setNet_EMEP(int Net_EMEP) {
        _Net_EMEP = Net_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setNet_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, Net_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRGlob_EMEP() {
        return _RGlob_EMEP;
    }

    @Override
    public void setRGlob_EMEP(int RGlob_EMEP) {
        _RGlob_EMEP = RGlob_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRGlob_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, RGlob_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getGlob_EMEP() {
        return _Glob_EMEP;
    }

    @Override
    public void setGlob_EMEP(int Glob_EMEP) {
        _Glob_EMEP = Glob_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlob_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, Glob_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRPAR_EMEP() {
        return _RPAR_EMEP;
    }

    @Override
    public void setRPAR_EMEP(int RPAR_EMEP) {
        _RPAR_EMEP = RPAR_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRPAR_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, RPAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPAR_EMEP() {
        return _PAR_EMEP;
    }

    @Override
    public void setPAR_EMEP(int PAR_EMEP) {
        _PAR_EMEP = PAR_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPAR_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, PAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDirPAR_EMEP() {
        return _dirPAR_EMEP;
    }

    @Override
    public void setDirPAR_EMEP(int dirPAR_EMEP) {
        _dirPAR_EMEP = dirPAR_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setDirPAR_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, dirPAR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCanIR_EMEP() {
        return _canIR_EMEP;
    }

    @Override
    public void setCanIR_EMEP(int canIR_EMEP) {
        _canIR_EMEP = canIR_EMEP;

        if (_hydemetaRemoteModel != null) {
            try {
                Class<?> clazz = _hydemetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCanIR_EMEP", int.class);

                method.invoke(_hydemetaRemoteModel, canIR_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHydemetaRemoteModel() {
        return _hydemetaRemoteModel;
    }

    public void setHydemetaRemoteModel(BaseModel<?> hydemetaRemoteModel) {
        _hydemetaRemoteModel = hydemetaRemoteModel;
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

        Class<?> remoteModelClass = _hydemetaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_hydemetaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HydemetaLocalServiceUtil.addHydemeta(this);
        } else {
            HydemetaLocalServiceUtil.updateHydemeta(this);
        }
    }

    @Override
    public Hydemeta toEscapedModel() {
        return (Hydemeta) ProxyUtil.newProxyInstance(Hydemeta.class.getClassLoader(),
            new Class[] { Hydemeta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HydemetaClp clone = new HydemetaClp();

        clone.setSamptime(getSamptime());
        clone.setUV_A(getUV_A());
        clone.setUV_B(getUV_B());
        clone.setDiffPAR(getDiffPAR());
        clone.setDiffGLOB(getDiffGLOB());
        clone.setDirGLOB(getDirGLOB());
        clone.setNet(getNet());
        clone.setRGlob(getRGlob());
        clone.setGlob(getGlob());
        clone.setRPAR(getRPAR());
        clone.setPAR(getPAR());
        clone.setDirPAR(getDirPAR());
        clone.setCanIR(getCanIR());
        clone.setSkyIR(getSkyIR());
        clone.setPrecip(getPrecip());
        clone.setSWS(getSWS());
        clone.setTd(getTd());
        clone.setPamb0(getPamb0());
        clone.setT672(getT672());
        clone.setT504(getT504());
        clone.setT336(getT336());
        clone.setT168(getT168());
        clone.setT84(getT84());
        clone.setT42(getT42());
        clone.setWS672(getWS672());
        clone.setWS504(getWS504());
        clone.setWS336(getWS336());
        clone.setWS168(getWS168());
        clone.setWS84(getWS84());
        clone.setWS42(getWS42());
        clone.setWSU740(getWSU740());
        clone.setWSU336(getWSU336());
        clone.setWSU168(getWSU168());
        clone.setWSU84(getWSU84());
        clone.setWD(getWD());
        clone.setWD504(getWD504());
        clone.setWD336(getWD336());
        clone.setWD168(getWD168());
        clone.setWDU740(getWDU740());
        clone.setWDU336(getWDU336());
        clone.setWDU168(getWDU168());
        clone.setWDU84(getWDU84());
        clone.setNO672(getNO672());
        clone.setNO504(getNO504());
        clone.setNO336(getNO336());
        clone.setNO168(getNO168());
        clone.setNO84(getNO84());
        clone.setNO42(getNO42());
        clone.setNOx672(getNOx672());
        clone.setNOx504(getNOx504());
        clone.setNOx336(getNOx336());
        clone.setNOx168(getNOx168());
        clone.setNOx84(getNOx84());
        clone.setNOx42(getNOx42());
        clone.setO3672(getO3672());
        clone.setO3504(getO3504());
        clone.setO3336(getO3336());
        clone.setO3168(getO3168());
        clone.setO384(getO384());
        clone.setO342(getO342());
        clone.setSO2672(getSO2672());
        clone.setSO2504(getSO2504());
        clone.setSO2336(getSO2336());
        clone.setSO2168(getSO2168());
        clone.setSO284(getSO284());
        clone.setSO242(getSO242());
        clone.setH2O672(getH2O672());
        clone.setH2O504(getH2O504());
        clone.setH2O336(getH2O336());
        clone.setH2O168(getH2O168());
        clone.setH2O84(getH2O84());
        clone.setH2O42(getH2O42());
        clone.setCO2672(getCO2672());
        clone.setCO2504(getCO2504());
        clone.setCO2336(getCO2336());
        clone.setCO2168(getCO2168());
        clone.setCO284(getCO284());
        clone.setCO242(getCO242());
        clone.setH2S672(getH2S672());
        clone.setH2S504(getH2S504());
        clone.setH2S336(getH2S336());
        clone.setH2S168(getH2S168());
        clone.setH2S84(getH2S84());
        clone.setH2S42(getH2S42());
        clone.setRHIRGA672(getRHIRGA672());
        clone.setRHIRGA504(getRHIRGA504());
        clone.setRHIRGA336(getRHIRGA336());
        clone.setRHIRGA168(getRHIRGA168());
        clone.setRHIRGA84(getRHIRGA84());
        clone.setRHIRGA42(getRHIRGA42());
        clone.setCO672(getCO672());
        clone.setCO504(getCO504());
        clone.setCO336(getCO336());
        clone.setCO168(getCO168());
        clone.setCO84(getCO84());
        clone.setCO42(getCO42());
        clone.setRHTd(getRHTd());
        clone.setPTG(getPTG());
        clone.setVisibility(getVisibility());
        clone.setVisibilitymin(getVisibilitymin());
        clone.setVisibilitymax(getVisibilitymax());
        clone.setPrecipint(getPrecipint());
        clone.setPrecipintmin(getPrecipintmin());
        clone.setPrecipintmax(getPrecipintmax());
        clone.setPrecipacc(getPrecipacc());
        clone.setSnowfallacc(getSnowfallacc());
        clone.setWthcode(getWthcode());
        clone.setWthcodemin(getWthcodemin());
        clone.setWthcodemax(getWthcodemax());
        clone.setTsoil_humus(getTsoil_humus());
        clone.setTsoil_A(getTsoil_A());
        clone.setTsoil_B1(getTsoil_B1());
        clone.setTsoil_B2(getTsoil_B2());
        clone.setTsoil_C1(getTsoil_C1());
        clone.setH2OTd(getH2OTd());
        clone.setCO2_storage_flux(getCO2_storage_flux());
        clone.setWsoil_humus(getWsoil_humus());
        clone.setWsoil_A(getWsoil_A());
        clone.setWsoil_B1(getWsoil_B1());
        clone.setWsoil_B2(getWsoil_B2());
        clone.setWsoil_C1(getWsoil_C1());
        clone.setLWin(getLWin());
        clone.setLWout(getLWout());
        clone.setPRI(getPRI());
        clone.setNDVI(getNDVI());
        clone.setBNDVI(getBNDVI());
        clone.setCanPAR1(getCanPAR1());
        clone.setCanPAR2(getCanPAR2());
        clone.setCanPAR3(getCanPAR3());
        clone.setMaaPAR(getMaaPAR());
        clone.setMaaNet(getMaaNet());
        clone.setPAR2(getPAR2());
        clone.setGlobmast(getGlobmast());
        clone.setWDU672(getWDU672());
        clone.setWSU672(getWSU672());
        clone.setRGlob125(getRGlob125());
        clone.setCH4168(getCH4168());
        clone.setCH4672(getCH4672());
        clone.setCH41250(getCH41250());
        clone.setT1250(getT1250());
        clone.setWpsoil_A(getWpsoil_A());
        clone.setWpsoil_B(getWpsoil_B());
        clone.setRunoff1(getRunoff1());
        clone.setRunoff2(getRunoff2());
        clone.setDrainage1(getDrainage1());
        clone.setCO2icos168(getCO2icos168());
        clone.setCO2icos672(getCO2icos672());
        clone.setCO2icos1250(getCO2icos1250());
        clone.setH2Oicos168(getH2Oicos168());
        clone.setH2Oicos672(getH2Oicos672());
        clone.setH2Oicos1250(getH2Oicos1250());
        clone.setUV_A_EMEP(getUV_A_EMEP());
        clone.setUV_B_EMEP(getUV_B_EMEP());
        clone.setDiffPAR_EMEP(getDiffPAR_EMEP());
        clone.setDiffGLOB_EMEP(getDiffGLOB_EMEP());
        clone.setDirGLOB_EMEP(getDirGLOB_EMEP());
        clone.setNet_EMEP(getNet_EMEP());
        clone.setRGlob_EMEP(getRGlob_EMEP());
        clone.setGlob_EMEP(getGlob_EMEP());
        clone.setRPAR_EMEP(getRPAR_EMEP());
        clone.setPAR_EMEP(getPAR_EMEP());
        clone.setDirPAR_EMEP(getDirPAR_EMEP());
        clone.setCanIR_EMEP(getCanIR_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Hydemeta hydemeta) {
        java.util.Date primaryKey = hydemeta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HydemetaClp)) {
            return false;
        }

        HydemetaClp hydemeta = (HydemetaClp) obj;

        java.util.Date primaryKey = hydemeta.getPrimaryKey();

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
        StringBundler sb = new StringBundler(327);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", UV_A=");
        sb.append(getUV_A());
        sb.append(", UV_B=");
        sb.append(getUV_B());
        sb.append(", diffPAR=");
        sb.append(getDiffPAR());
        sb.append(", diffGLOB=");
        sb.append(getDiffGLOB());
        sb.append(", dirGLOB=");
        sb.append(getDirGLOB());
        sb.append(", Net=");
        sb.append(getNet());
        sb.append(", RGlob=");
        sb.append(getRGlob());
        sb.append(", Glob=");
        sb.append(getGlob());
        sb.append(", RPAR=");
        sb.append(getRPAR());
        sb.append(", PAR=");
        sb.append(getPAR());
        sb.append(", dirPAR=");
        sb.append(getDirPAR());
        sb.append(", canIR=");
        sb.append(getCanIR());
        sb.append(", skyIR=");
        sb.append(getSkyIR());
        sb.append(", Precip=");
        sb.append(getPrecip());
        sb.append(", SWS=");
        sb.append(getSWS());
        sb.append(", Td=");
        sb.append(getTd());
        sb.append(", Pamb0=");
        sb.append(getPamb0());
        sb.append(", T672=");
        sb.append(getT672());
        sb.append(", T504=");
        sb.append(getT504());
        sb.append(", T336=");
        sb.append(getT336());
        sb.append(", T168=");
        sb.append(getT168());
        sb.append(", T84=");
        sb.append(getT84());
        sb.append(", T42=");
        sb.append(getT42());
        sb.append(", WS672=");
        sb.append(getWS672());
        sb.append(", WS504=");
        sb.append(getWS504());
        sb.append(", WS336=");
        sb.append(getWS336());
        sb.append(", WS168=");
        sb.append(getWS168());
        sb.append(", WS84=");
        sb.append(getWS84());
        sb.append(", WS42=");
        sb.append(getWS42());
        sb.append(", WSU740=");
        sb.append(getWSU740());
        sb.append(", WSU336=");
        sb.append(getWSU336());
        sb.append(", WSU168=");
        sb.append(getWSU168());
        sb.append(", WSU84=");
        sb.append(getWSU84());
        sb.append(", WD=");
        sb.append(getWD());
        sb.append(", WD504=");
        sb.append(getWD504());
        sb.append(", WD336=");
        sb.append(getWD336());
        sb.append(", WD168=");
        sb.append(getWD168());
        sb.append(", WDU740=");
        sb.append(getWDU740());
        sb.append(", WDU336=");
        sb.append(getWDU336());
        sb.append(", WDU168=");
        sb.append(getWDU168());
        sb.append(", WDU84=");
        sb.append(getWDU84());
        sb.append(", NO672=");
        sb.append(getNO672());
        sb.append(", NO504=");
        sb.append(getNO504());
        sb.append(", NO336=");
        sb.append(getNO336());
        sb.append(", NO168=");
        sb.append(getNO168());
        sb.append(", NO84=");
        sb.append(getNO84());
        sb.append(", NO42=");
        sb.append(getNO42());
        sb.append(", NOx672=");
        sb.append(getNOx672());
        sb.append(", NOx504=");
        sb.append(getNOx504());
        sb.append(", NOx336=");
        sb.append(getNOx336());
        sb.append(", NOx168=");
        sb.append(getNOx168());
        sb.append(", NOx84=");
        sb.append(getNOx84());
        sb.append(", NOx42=");
        sb.append(getNOx42());
        sb.append(", O3672=");
        sb.append(getO3672());
        sb.append(", O3504=");
        sb.append(getO3504());
        sb.append(", O3336=");
        sb.append(getO3336());
        sb.append(", O3168=");
        sb.append(getO3168());
        sb.append(", O384=");
        sb.append(getO384());
        sb.append(", O342=");
        sb.append(getO342());
        sb.append(", SO2672=");
        sb.append(getSO2672());
        sb.append(", SO2504=");
        sb.append(getSO2504());
        sb.append(", SO2336=");
        sb.append(getSO2336());
        sb.append(", SO2168=");
        sb.append(getSO2168());
        sb.append(", SO284=");
        sb.append(getSO284());
        sb.append(", SO242=");
        sb.append(getSO242());
        sb.append(", H2O672=");
        sb.append(getH2O672());
        sb.append(", H2O504=");
        sb.append(getH2O504());
        sb.append(", H2O336=");
        sb.append(getH2O336());
        sb.append(", H2O168=");
        sb.append(getH2O168());
        sb.append(", H2O84=");
        sb.append(getH2O84());
        sb.append(", H2O42=");
        sb.append(getH2O42());
        sb.append(", CO2672=");
        sb.append(getCO2672());
        sb.append(", CO2504=");
        sb.append(getCO2504());
        sb.append(", CO2336=");
        sb.append(getCO2336());
        sb.append(", CO2168=");
        sb.append(getCO2168());
        sb.append(", CO284=");
        sb.append(getCO284());
        sb.append(", CO242=");
        sb.append(getCO242());
        sb.append(", H2S672=");
        sb.append(getH2S672());
        sb.append(", H2S504=");
        sb.append(getH2S504());
        sb.append(", H2S336=");
        sb.append(getH2S336());
        sb.append(", H2S168=");
        sb.append(getH2S168());
        sb.append(", H2S84=");
        sb.append(getH2S84());
        sb.append(", H2S42=");
        sb.append(getH2S42());
        sb.append(", RHIRGA672=");
        sb.append(getRHIRGA672());
        sb.append(", RHIRGA504=");
        sb.append(getRHIRGA504());
        sb.append(", RHIRGA336=");
        sb.append(getRHIRGA336());
        sb.append(", RHIRGA168=");
        sb.append(getRHIRGA168());
        sb.append(", RHIRGA84=");
        sb.append(getRHIRGA84());
        sb.append(", RHIRGA42=");
        sb.append(getRHIRGA42());
        sb.append(", CO672=");
        sb.append(getCO672());
        sb.append(", CO504=");
        sb.append(getCO504());
        sb.append(", CO336=");
        sb.append(getCO336());
        sb.append(", CO168=");
        sb.append(getCO168());
        sb.append(", CO84=");
        sb.append(getCO84());
        sb.append(", CO42=");
        sb.append(getCO42());
        sb.append(", RHTd=");
        sb.append(getRHTd());
        sb.append(", PTG=");
        sb.append(getPTG());
        sb.append(", Visibility=");
        sb.append(getVisibility());
        sb.append(", Visibilitymin=");
        sb.append(getVisibilitymin());
        sb.append(", Visibilitymax=");
        sb.append(getVisibilitymax());
        sb.append(", Precipint=");
        sb.append(getPrecipint());
        sb.append(", Precipintmin=");
        sb.append(getPrecipintmin());
        sb.append(", Precipintmax=");
        sb.append(getPrecipintmax());
        sb.append(", Precipacc=");
        sb.append(getPrecipacc());
        sb.append(", Snowfallacc=");
        sb.append(getSnowfallacc());
        sb.append(", wthcode=");
        sb.append(getWthcode());
        sb.append(", wthcodemin=");
        sb.append(getWthcodemin());
        sb.append(", wthcodemax=");
        sb.append(getWthcodemax());
        sb.append(", tsoil_humus=");
        sb.append(getTsoil_humus());
        sb.append(", tsoil_A=");
        sb.append(getTsoil_A());
        sb.append(", tsoil_B1=");
        sb.append(getTsoil_B1());
        sb.append(", tsoil_B2=");
        sb.append(getTsoil_B2());
        sb.append(", tsoil_C1=");
        sb.append(getTsoil_C1());
        sb.append(", H2OTd=");
        sb.append(getH2OTd());
        sb.append(", CO2_storage_flux=");
        sb.append(getCO2_storage_flux());
        sb.append(", wsoil_humus=");
        sb.append(getWsoil_humus());
        sb.append(", wsoil_A=");
        sb.append(getWsoil_A());
        sb.append(", wsoil_B1=");
        sb.append(getWsoil_B1());
        sb.append(", wsoil_B2=");
        sb.append(getWsoil_B2());
        sb.append(", wsoil_C1=");
        sb.append(getWsoil_C1());
        sb.append(", LWin=");
        sb.append(getLWin());
        sb.append(", LWout=");
        sb.append(getLWout());
        sb.append(", PRI=");
        sb.append(getPRI());
        sb.append(", NDVI=");
        sb.append(getNDVI());
        sb.append(", BNDVI=");
        sb.append(getBNDVI());
        sb.append(", canPAR1=");
        sb.append(getCanPAR1());
        sb.append(", canPAR2=");
        sb.append(getCanPAR2());
        sb.append(", canPAR3=");
        sb.append(getCanPAR3());
        sb.append(", maaPAR=");
        sb.append(getMaaPAR());
        sb.append(", maaNet=");
        sb.append(getMaaNet());
        sb.append(", PAR2=");
        sb.append(getPAR2());
        sb.append(", Globmast=");
        sb.append(getGlobmast());
        sb.append(", WDU672=");
        sb.append(getWDU672());
        sb.append(", WSU672=");
        sb.append(getWSU672());
        sb.append(", RGlob125=");
        sb.append(getRGlob125());
        sb.append(", CH4168=");
        sb.append(getCH4168());
        sb.append(", CH4672=");
        sb.append(getCH4672());
        sb.append(", CH41250=");
        sb.append(getCH41250());
        sb.append(", T1250=");
        sb.append(getT1250());
        sb.append(", wpsoil_A=");
        sb.append(getWpsoil_A());
        sb.append(", wpsoil_B=");
        sb.append(getWpsoil_B());
        sb.append(", runoff1=");
        sb.append(getRunoff1());
        sb.append(", runoff2=");
        sb.append(getRunoff2());
        sb.append(", drainage1=");
        sb.append(getDrainage1());
        sb.append(", CO2icos168=");
        sb.append(getCO2icos168());
        sb.append(", CO2icos672=");
        sb.append(getCO2icos672());
        sb.append(", CO2icos1250=");
        sb.append(getCO2icos1250());
        sb.append(", H2Oicos168=");
        sb.append(getH2Oicos168());
        sb.append(", H2Oicos672=");
        sb.append(getH2Oicos672());
        sb.append(", H2Oicos1250=");
        sb.append(getH2Oicos1250());
        sb.append(", UV_A_EMEP=");
        sb.append(getUV_A_EMEP());
        sb.append(", UV_B_EMEP=");
        sb.append(getUV_B_EMEP());
        sb.append(", diffPAR_EMEP=");
        sb.append(getDiffPAR_EMEP());
        sb.append(", diffGLOB_EMEP=");
        sb.append(getDiffGLOB_EMEP());
        sb.append(", dirGLOB_EMEP=");
        sb.append(getDirGLOB_EMEP());
        sb.append(", Net_EMEP=");
        sb.append(getNet_EMEP());
        sb.append(", RGlob_EMEP=");
        sb.append(getRGlob_EMEP());
        sb.append(", Glob_EMEP=");
        sb.append(getGlob_EMEP());
        sb.append(", RPAR_EMEP=");
        sb.append(getRPAR_EMEP());
        sb.append(", PAR_EMEP=");
        sb.append(getPAR_EMEP());
        sb.append(", dirPAR_EMEP=");
        sb.append(getDirPAR_EMEP());
        sb.append(", canIR_EMEP=");
        sb.append(getCanIR_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(493);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Hydemeta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UV_A</column-name><column-value><![CDATA[");
        sb.append(getUV_A());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UV_B</column-name><column-value><![CDATA[");
        sb.append(getUV_B());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>diffPAR</column-name><column-value><![CDATA[");
        sb.append(getDiffPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>diffGLOB</column-name><column-value><![CDATA[");
        sb.append(getDiffGLOB());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dirGLOB</column-name><column-value><![CDATA[");
        sb.append(getDirGLOB());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net</column-name><column-value><![CDATA[");
        sb.append(getNet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RGlob</column-name><column-value><![CDATA[");
        sb.append(getRGlob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Glob</column-name><column-value><![CDATA[");
        sb.append(getGlob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RPAR</column-name><column-value><![CDATA[");
        sb.append(getRPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR</column-name><column-value><![CDATA[");
        sb.append(getPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dirPAR</column-name><column-value><![CDATA[");
        sb.append(getDirPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>canIR</column-name><column-value><![CDATA[");
        sb.append(getCanIR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>skyIR</column-name><column-value><![CDATA[");
        sb.append(getSkyIR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precip</column-name><column-value><![CDATA[");
        sb.append(getPrecip());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SWS</column-name><column-value><![CDATA[");
        sb.append(getSWS());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Td</column-name><column-value><![CDATA[");
        sb.append(getTd());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Pamb0</column-name><column-value><![CDATA[");
        sb.append(getPamb0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T672</column-name><column-value><![CDATA[");
        sb.append(getT672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T504</column-name><column-value><![CDATA[");
        sb.append(getT504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T336</column-name><column-value><![CDATA[");
        sb.append(getT336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T168</column-name><column-value><![CDATA[");
        sb.append(getT168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T84</column-name><column-value><![CDATA[");
        sb.append(getT84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T42</column-name><column-value><![CDATA[");
        sb.append(getT42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS672</column-name><column-value><![CDATA[");
        sb.append(getWS672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS504</column-name><column-value><![CDATA[");
        sb.append(getWS504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS336</column-name><column-value><![CDATA[");
        sb.append(getWS336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS168</column-name><column-value><![CDATA[");
        sb.append(getWS168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS84</column-name><column-value><![CDATA[");
        sb.append(getWS84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WS42</column-name><column-value><![CDATA[");
        sb.append(getWS42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WSU740</column-name><column-value><![CDATA[");
        sb.append(getWSU740());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WSU336</column-name><column-value><![CDATA[");
        sb.append(getWSU336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WSU168</column-name><column-value><![CDATA[");
        sb.append(getWSU168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WSU84</column-name><column-value><![CDATA[");
        sb.append(getWSU84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WD</column-name><column-value><![CDATA[");
        sb.append(getWD());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WD504</column-name><column-value><![CDATA[");
        sb.append(getWD504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WD336</column-name><column-value><![CDATA[");
        sb.append(getWD336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WD168</column-name><column-value><![CDATA[");
        sb.append(getWD168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDU740</column-name><column-value><![CDATA[");
        sb.append(getWDU740());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDU336</column-name><column-value><![CDATA[");
        sb.append(getWDU336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDU168</column-name><column-value><![CDATA[");
        sb.append(getWDU168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDU84</column-name><column-value><![CDATA[");
        sb.append(getWDU84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO672</column-name><column-value><![CDATA[");
        sb.append(getNO672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO504</column-name><column-value><![CDATA[");
        sb.append(getNO504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO336</column-name><column-value><![CDATA[");
        sb.append(getNO336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO168</column-name><column-value><![CDATA[");
        sb.append(getNO168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO84</column-name><column-value><![CDATA[");
        sb.append(getNO84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NO42</column-name><column-value><![CDATA[");
        sb.append(getNO42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx672</column-name><column-value><![CDATA[");
        sb.append(getNOx672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx504</column-name><column-value><![CDATA[");
        sb.append(getNOx504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx336</column-name><column-value><![CDATA[");
        sb.append(getNOx336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx168</column-name><column-value><![CDATA[");
        sb.append(getNOx168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx84</column-name><column-value><![CDATA[");
        sb.append(getNOx84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NOx42</column-name><column-value><![CDATA[");
        sb.append(getNOx42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3672</column-name><column-value><![CDATA[");
        sb.append(getO3672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3504</column-name><column-value><![CDATA[");
        sb.append(getO3504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3336</column-name><column-value><![CDATA[");
        sb.append(getO3336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O3168</column-name><column-value><![CDATA[");
        sb.append(getO3168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O384</column-name><column-value><![CDATA[");
        sb.append(getO384());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>O342</column-name><column-value><![CDATA[");
        sb.append(getO342());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2672</column-name><column-value><![CDATA[");
        sb.append(getSO2672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2504</column-name><column-value><![CDATA[");
        sb.append(getSO2504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2336</column-name><column-value><![CDATA[");
        sb.append(getSO2336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO2168</column-name><column-value><![CDATA[");
        sb.append(getSO2168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO284</column-name><column-value><![CDATA[");
        sb.append(getSO284());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>SO242</column-name><column-value><![CDATA[");
        sb.append(getSO242());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O672</column-name><column-value><![CDATA[");
        sb.append(getH2O672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O504</column-name><column-value><![CDATA[");
        sb.append(getH2O504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O336</column-name><column-value><![CDATA[");
        sb.append(getH2O336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O168</column-name><column-value><![CDATA[");
        sb.append(getH2O168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O84</column-name><column-value><![CDATA[");
        sb.append(getH2O84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O42</column-name><column-value><![CDATA[");
        sb.append(getH2O42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2672</column-name><column-value><![CDATA[");
        sb.append(getCO2672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2504</column-name><column-value><![CDATA[");
        sb.append(getCO2504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2336</column-name><column-value><![CDATA[");
        sb.append(getCO2336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2168</column-name><column-value><![CDATA[");
        sb.append(getCO2168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO284</column-name><column-value><![CDATA[");
        sb.append(getCO284());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO242</column-name><column-value><![CDATA[");
        sb.append(getCO242());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S672</column-name><column-value><![CDATA[");
        sb.append(getH2S672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S504</column-name><column-value><![CDATA[");
        sb.append(getH2S504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S336</column-name><column-value><![CDATA[");
        sb.append(getH2S336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S168</column-name><column-value><![CDATA[");
        sb.append(getH2S168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S84</column-name><column-value><![CDATA[");
        sb.append(getH2S84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2S42</column-name><column-value><![CDATA[");
        sb.append(getH2S42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA672</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA504</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA336</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA168</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA84</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHIRGA42</column-name><column-value><![CDATA[");
        sb.append(getRHIRGA42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO672</column-name><column-value><![CDATA[");
        sb.append(getCO672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO504</column-name><column-value><![CDATA[");
        sb.append(getCO504());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO336</column-name><column-value><![CDATA[");
        sb.append(getCO336());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO168</column-name><column-value><![CDATA[");
        sb.append(getCO168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO84</column-name><column-value><![CDATA[");
        sb.append(getCO84());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO42</column-name><column-value><![CDATA[");
        sb.append(getCO42());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RHTd</column-name><column-value><![CDATA[");
        sb.append(getRHTd());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PTG</column-name><column-value><![CDATA[");
        sb.append(getPTG());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Visibility</column-name><column-value><![CDATA[");
        sb.append(getVisibility());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Visibilitymin</column-name><column-value><![CDATA[");
        sb.append(getVisibilitymin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Visibilitymax</column-name><column-value><![CDATA[");
        sb.append(getVisibilitymax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precipint</column-name><column-value><![CDATA[");
        sb.append(getPrecipint());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precipintmin</column-name><column-value><![CDATA[");
        sb.append(getPrecipintmin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precipintmax</column-name><column-value><![CDATA[");
        sb.append(getPrecipintmax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precipacc</column-name><column-value><![CDATA[");
        sb.append(getPrecipacc());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Snowfallacc</column-name><column-value><![CDATA[");
        sb.append(getSnowfallacc());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wthcode</column-name><column-value><![CDATA[");
        sb.append(getWthcode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wthcodemin</column-name><column-value><![CDATA[");
        sb.append(getWthcodemin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wthcodemax</column-name><column-value><![CDATA[");
        sb.append(getWthcodemax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tsoil_humus</column-name><column-value><![CDATA[");
        sb.append(getTsoil_humus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tsoil_A</column-name><column-value><![CDATA[");
        sb.append(getTsoil_A());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tsoil_B1</column-name><column-value><![CDATA[");
        sb.append(getTsoil_B1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tsoil_B2</column-name><column-value><![CDATA[");
        sb.append(getTsoil_B2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tsoil_C1</column-name><column-value><![CDATA[");
        sb.append(getTsoil_C1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2OTd</column-name><column-value><![CDATA[");
        sb.append(getH2OTd());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_storage_flux</column-name><column-value><![CDATA[");
        sb.append(getCO2_storage_flux());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_humus</column-name><column-value><![CDATA[");
        sb.append(getWsoil_humus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_A</column-name><column-value><![CDATA[");
        sb.append(getWsoil_A());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_B1</column-name><column-value><![CDATA[");
        sb.append(getWsoil_B1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_B2</column-name><column-value><![CDATA[");
        sb.append(getWsoil_B2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wsoil_C1</column-name><column-value><![CDATA[");
        sb.append(getWsoil_C1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LWin</column-name><column-value><![CDATA[");
        sb.append(getLWin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LWout</column-name><column-value><![CDATA[");
        sb.append(getLWout());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PRI</column-name><column-value><![CDATA[");
        sb.append(getPRI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>NDVI</column-name><column-value><![CDATA[");
        sb.append(getNDVI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>BNDVI</column-name><column-value><![CDATA[");
        sb.append(getBNDVI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>canPAR1</column-name><column-value><![CDATA[");
        sb.append(getCanPAR1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>canPAR2</column-name><column-value><![CDATA[");
        sb.append(getCanPAR2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>canPAR3</column-name><column-value><![CDATA[");
        sb.append(getCanPAR3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maaPAR</column-name><column-value><![CDATA[");
        sb.append(getMaaPAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maaNet</column-name><column-value><![CDATA[");
        sb.append(getMaaNet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR2</column-name><column-value><![CDATA[");
        sb.append(getPAR2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Globmast</column-name><column-value><![CDATA[");
        sb.append(getGlobmast());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WDU672</column-name><column-value><![CDATA[");
        sb.append(getWDU672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WSU672</column-name><column-value><![CDATA[");
        sb.append(getWSU672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RGlob125</column-name><column-value><![CDATA[");
        sb.append(getRGlob125());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4168</column-name><column-value><![CDATA[");
        sb.append(getCH4168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4672</column-name><column-value><![CDATA[");
        sb.append(getCH4672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH41250</column-name><column-value><![CDATA[");
        sb.append(getCH41250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T1250</column-name><column-value><![CDATA[");
        sb.append(getT1250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wpsoil_A</column-name><column-value><![CDATA[");
        sb.append(getWpsoil_A());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wpsoil_B</column-name><column-value><![CDATA[");
        sb.append(getWpsoil_B());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>runoff1</column-name><column-value><![CDATA[");
        sb.append(getRunoff1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>runoff2</column-name><column-value><![CDATA[");
        sb.append(getRunoff2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>drainage1</column-name><column-value><![CDATA[");
        sb.append(getDrainage1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2icos168</column-name><column-value><![CDATA[");
        sb.append(getCO2icos168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2icos672</column-name><column-value><![CDATA[");
        sb.append(getCO2icos672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2icos1250</column-name><column-value><![CDATA[");
        sb.append(getCO2icos1250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2Oicos168</column-name><column-value><![CDATA[");
        sb.append(getH2Oicos168());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2Oicos672</column-name><column-value><![CDATA[");
        sb.append(getH2Oicos672());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2Oicos1250</column-name><column-value><![CDATA[");
        sb.append(getH2Oicos1250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UV_A_EMEP</column-name><column-value><![CDATA[");
        sb.append(getUV_A_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>UV_B_EMEP</column-name><column-value><![CDATA[");
        sb.append(getUV_B_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>diffPAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getDiffPAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>diffGLOB_EMEP</column-name><column-value><![CDATA[");
        sb.append(getDiffGLOB_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dirGLOB_EMEP</column-name><column-value><![CDATA[");
        sb.append(getDirGLOB_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RGlob_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRGlob_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Glob_EMEP</column-name><column-value><![CDATA[");
        sb.append(getGlob_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RPAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRPAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dirPAR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getDirPAR_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>canIR_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCanIR_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
