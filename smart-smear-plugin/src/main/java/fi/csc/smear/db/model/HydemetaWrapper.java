package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hydemeta}.
 * </p>
 *
 * @author pj
 * @see Hydemeta
 * @generated
 */
public class HydemetaWrapper implements Hydemeta, ModelWrapper<Hydemeta> {
    private Hydemeta _hydemeta;

    public HydemetaWrapper(Hydemeta hydemeta) {
        _hydemeta = hydemeta;
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

    /**
    * Returns the primary key of this hydemeta.
    *
    * @return the primary key of this hydemeta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _hydemeta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hydemeta.
    *
    * @param primaryKey the primary key of this hydemeta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _hydemeta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this hydemeta.
    *
    * @return the samptime of this hydemeta
    */
    @Override
    public java.util.Date getSamptime() {
        return _hydemeta.getSamptime();
    }

    /**
    * Sets the samptime of this hydemeta.
    *
    * @param samptime the samptime of this hydemeta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _hydemeta.setSamptime(samptime);
    }

    /**
    * Returns the u v_ a of this hydemeta.
    *
    * @return the u v_ a of this hydemeta
    */
    @Override
    public float getUV_A() {
        return _hydemeta.getUV_A();
    }

    /**
    * Sets the u v_ a of this hydemeta.
    *
    * @param UV_A the u v_ a of this hydemeta
    */
    @Override
    public void setUV_A(float UV_A) {
        _hydemeta.setUV_A(UV_A);
    }

    /**
    * Returns the u v_ b of this hydemeta.
    *
    * @return the u v_ b of this hydemeta
    */
    @Override
    public float getUV_B() {
        return _hydemeta.getUV_B();
    }

    /**
    * Sets the u v_ b of this hydemeta.
    *
    * @param UV_B the u v_ b of this hydemeta
    */
    @Override
    public void setUV_B(float UV_B) {
        _hydemeta.setUV_B(UV_B);
    }

    /**
    * Returns the diff p a r of this hydemeta.
    *
    * @return the diff p a r of this hydemeta
    */
    @Override
    public float getDiffPAR() {
        return _hydemeta.getDiffPAR();
    }

    /**
    * Sets the diff p a r of this hydemeta.
    *
    * @param diffPAR the diff p a r of this hydemeta
    */
    @Override
    public void setDiffPAR(float diffPAR) {
        _hydemeta.setDiffPAR(diffPAR);
    }

    /**
    * Returns the diff g l o b of this hydemeta.
    *
    * @return the diff g l o b of this hydemeta
    */
    @Override
    public float getDiffGLOB() {
        return _hydemeta.getDiffGLOB();
    }

    /**
    * Sets the diff g l o b of this hydemeta.
    *
    * @param diffGLOB the diff g l o b of this hydemeta
    */
    @Override
    public void setDiffGLOB(float diffGLOB) {
        _hydemeta.setDiffGLOB(diffGLOB);
    }

    /**
    * Returns the dir g l o b of this hydemeta.
    *
    * @return the dir g l o b of this hydemeta
    */
    @Override
    public float getDirGLOB() {
        return _hydemeta.getDirGLOB();
    }

    /**
    * Sets the dir g l o b of this hydemeta.
    *
    * @param dirGLOB the dir g l o b of this hydemeta
    */
    @Override
    public void setDirGLOB(float dirGLOB) {
        _hydemeta.setDirGLOB(dirGLOB);
    }

    /**
    * Returns the net of this hydemeta.
    *
    * @return the net of this hydemeta
    */
    @Override
    public float getNet() {
        return _hydemeta.getNet();
    }

    /**
    * Sets the net of this hydemeta.
    *
    * @param Net the net of this hydemeta
    */
    @Override
    public void setNet(float Net) {
        _hydemeta.setNet(Net);
    }

    /**
    * Returns the r glob of this hydemeta.
    *
    * @return the r glob of this hydemeta
    */
    @Override
    public float getRGlob() {
        return _hydemeta.getRGlob();
    }

    /**
    * Sets the r glob of this hydemeta.
    *
    * @param RGlob the r glob of this hydemeta
    */
    @Override
    public void setRGlob(float RGlob) {
        _hydemeta.setRGlob(RGlob);
    }

    /**
    * Returns the glob of this hydemeta.
    *
    * @return the glob of this hydemeta
    */
    @Override
    public float getGlob() {
        return _hydemeta.getGlob();
    }

    /**
    * Sets the glob of this hydemeta.
    *
    * @param Glob the glob of this hydemeta
    */
    @Override
    public void setGlob(float Glob) {
        _hydemeta.setGlob(Glob);
    }

    /**
    * Returns the r p a r of this hydemeta.
    *
    * @return the r p a r of this hydemeta
    */
    @Override
    public float getRPAR() {
        return _hydemeta.getRPAR();
    }

    /**
    * Sets the r p a r of this hydemeta.
    *
    * @param RPAR the r p a r of this hydemeta
    */
    @Override
    public void setRPAR(float RPAR) {
        _hydemeta.setRPAR(RPAR);
    }

    /**
    * Returns the p a r of this hydemeta.
    *
    * @return the p a r of this hydemeta
    */
    @Override
    public float getPAR() {
        return _hydemeta.getPAR();
    }

    /**
    * Sets the p a r of this hydemeta.
    *
    * @param PAR the p a r of this hydemeta
    */
    @Override
    public void setPAR(float PAR) {
        _hydemeta.setPAR(PAR);
    }

    /**
    * Returns the dir p a r of this hydemeta.
    *
    * @return the dir p a r of this hydemeta
    */
    @Override
    public float getDirPAR() {
        return _hydemeta.getDirPAR();
    }

    /**
    * Sets the dir p a r of this hydemeta.
    *
    * @param dirPAR the dir p a r of this hydemeta
    */
    @Override
    public void setDirPAR(float dirPAR) {
        _hydemeta.setDirPAR(dirPAR);
    }

    /**
    * Returns the can i r of this hydemeta.
    *
    * @return the can i r of this hydemeta
    */
    @Override
    public float getCanIR() {
        return _hydemeta.getCanIR();
    }

    /**
    * Sets the can i r of this hydemeta.
    *
    * @param canIR the can i r of this hydemeta
    */
    @Override
    public void setCanIR(float canIR) {
        _hydemeta.setCanIR(canIR);
    }

    /**
    * Returns the sky i r of this hydemeta.
    *
    * @return the sky i r of this hydemeta
    */
    @Override
    public float getSkyIR() {
        return _hydemeta.getSkyIR();
    }

    /**
    * Sets the sky i r of this hydemeta.
    *
    * @param skyIR the sky i r of this hydemeta
    */
    @Override
    public void setSkyIR(float skyIR) {
        _hydemeta.setSkyIR(skyIR);
    }

    /**
    * Returns the precip of this hydemeta.
    *
    * @return the precip of this hydemeta
    */
    @Override
    public float getPrecip() {
        return _hydemeta.getPrecip();
    }

    /**
    * Sets the precip of this hydemeta.
    *
    * @param Precip the precip of this hydemeta
    */
    @Override
    public void setPrecip(float Precip) {
        _hydemeta.setPrecip(Precip);
    }

    /**
    * Returns the s w s of this hydemeta.
    *
    * @return the s w s of this hydemeta
    */
    @Override
    public float getSWS() {
        return _hydemeta.getSWS();
    }

    /**
    * Sets the s w s of this hydemeta.
    *
    * @param SWS the s w s of this hydemeta
    */
    @Override
    public void setSWS(float SWS) {
        _hydemeta.setSWS(SWS);
    }

    /**
    * Returns the td of this hydemeta.
    *
    * @return the td of this hydemeta
    */
    @Override
    public float getTd() {
        return _hydemeta.getTd();
    }

    /**
    * Sets the td of this hydemeta.
    *
    * @param Td the td of this hydemeta
    */
    @Override
    public void setTd(float Td) {
        _hydemeta.setTd(Td);
    }

    /**
    * Returns the pamb0 of this hydemeta.
    *
    * @return the pamb0 of this hydemeta
    */
    @Override
    public float getPamb0() {
        return _hydemeta.getPamb0();
    }

    /**
    * Sets the pamb0 of this hydemeta.
    *
    * @param Pamb0 the pamb0 of this hydemeta
    */
    @Override
    public void setPamb0(float Pamb0) {
        _hydemeta.setPamb0(Pamb0);
    }

    /**
    * Returns the t672 of this hydemeta.
    *
    * @return the t672 of this hydemeta
    */
    @Override
    public float getT672() {
        return _hydemeta.getT672();
    }

    /**
    * Sets the t672 of this hydemeta.
    *
    * @param T672 the t672 of this hydemeta
    */
    @Override
    public void setT672(float T672) {
        _hydemeta.setT672(T672);
    }

    /**
    * Returns the t504 of this hydemeta.
    *
    * @return the t504 of this hydemeta
    */
    @Override
    public float getT504() {
        return _hydemeta.getT504();
    }

    /**
    * Sets the t504 of this hydemeta.
    *
    * @param T504 the t504 of this hydemeta
    */
    @Override
    public void setT504(float T504) {
        _hydemeta.setT504(T504);
    }

    /**
    * Returns the t336 of this hydemeta.
    *
    * @return the t336 of this hydemeta
    */
    @Override
    public float getT336() {
        return _hydemeta.getT336();
    }

    /**
    * Sets the t336 of this hydemeta.
    *
    * @param T336 the t336 of this hydemeta
    */
    @Override
    public void setT336(float T336) {
        _hydemeta.setT336(T336);
    }

    /**
    * Returns the t168 of this hydemeta.
    *
    * @return the t168 of this hydemeta
    */
    @Override
    public float getT168() {
        return _hydemeta.getT168();
    }

    /**
    * Sets the t168 of this hydemeta.
    *
    * @param T168 the t168 of this hydemeta
    */
    @Override
    public void setT168(float T168) {
        _hydemeta.setT168(T168);
    }

    /**
    * Returns the t84 of this hydemeta.
    *
    * @return the t84 of this hydemeta
    */
    @Override
    public float getT84() {
        return _hydemeta.getT84();
    }

    /**
    * Sets the t84 of this hydemeta.
    *
    * @param T84 the t84 of this hydemeta
    */
    @Override
    public void setT84(float T84) {
        _hydemeta.setT84(T84);
    }

    /**
    * Returns the t42 of this hydemeta.
    *
    * @return the t42 of this hydemeta
    */
    @Override
    public float getT42() {
        return _hydemeta.getT42();
    }

    /**
    * Sets the t42 of this hydemeta.
    *
    * @param T42 the t42 of this hydemeta
    */
    @Override
    public void setT42(float T42) {
        _hydemeta.setT42(T42);
    }

    /**
    * Returns the w s672 of this hydemeta.
    *
    * @return the w s672 of this hydemeta
    */
    @Override
    public float getWS672() {
        return _hydemeta.getWS672();
    }

    /**
    * Sets the w s672 of this hydemeta.
    *
    * @param WS672 the w s672 of this hydemeta
    */
    @Override
    public void setWS672(float WS672) {
        _hydemeta.setWS672(WS672);
    }

    /**
    * Returns the w s504 of this hydemeta.
    *
    * @return the w s504 of this hydemeta
    */
    @Override
    public float getWS504() {
        return _hydemeta.getWS504();
    }

    /**
    * Sets the w s504 of this hydemeta.
    *
    * @param WS504 the w s504 of this hydemeta
    */
    @Override
    public void setWS504(float WS504) {
        _hydemeta.setWS504(WS504);
    }

    /**
    * Returns the w s336 of this hydemeta.
    *
    * @return the w s336 of this hydemeta
    */
    @Override
    public float getWS336() {
        return _hydemeta.getWS336();
    }

    /**
    * Sets the w s336 of this hydemeta.
    *
    * @param WS336 the w s336 of this hydemeta
    */
    @Override
    public void setWS336(float WS336) {
        _hydemeta.setWS336(WS336);
    }

    /**
    * Returns the w s168 of this hydemeta.
    *
    * @return the w s168 of this hydemeta
    */
    @Override
    public float getWS168() {
        return _hydemeta.getWS168();
    }

    /**
    * Sets the w s168 of this hydemeta.
    *
    * @param WS168 the w s168 of this hydemeta
    */
    @Override
    public void setWS168(float WS168) {
        _hydemeta.setWS168(WS168);
    }

    /**
    * Returns the w s84 of this hydemeta.
    *
    * @return the w s84 of this hydemeta
    */
    @Override
    public float getWS84() {
        return _hydemeta.getWS84();
    }

    /**
    * Sets the w s84 of this hydemeta.
    *
    * @param WS84 the w s84 of this hydemeta
    */
    @Override
    public void setWS84(float WS84) {
        _hydemeta.setWS84(WS84);
    }

    /**
    * Returns the w s42 of this hydemeta.
    *
    * @return the w s42 of this hydemeta
    */
    @Override
    public float getWS42() {
        return _hydemeta.getWS42();
    }

    /**
    * Sets the w s42 of this hydemeta.
    *
    * @param WS42 the w s42 of this hydemeta
    */
    @Override
    public void setWS42(float WS42) {
        _hydemeta.setWS42(WS42);
    }

    /**
    * Returns the w s u740 of this hydemeta.
    *
    * @return the w s u740 of this hydemeta
    */
    @Override
    public float getWSU740() {
        return _hydemeta.getWSU740();
    }

    /**
    * Sets the w s u740 of this hydemeta.
    *
    * @param WSU740 the w s u740 of this hydemeta
    */
    @Override
    public void setWSU740(float WSU740) {
        _hydemeta.setWSU740(WSU740);
    }

    /**
    * Returns the w s u336 of this hydemeta.
    *
    * @return the w s u336 of this hydemeta
    */
    @Override
    public float getWSU336() {
        return _hydemeta.getWSU336();
    }

    /**
    * Sets the w s u336 of this hydemeta.
    *
    * @param WSU336 the w s u336 of this hydemeta
    */
    @Override
    public void setWSU336(float WSU336) {
        _hydemeta.setWSU336(WSU336);
    }

    /**
    * Returns the w s u168 of this hydemeta.
    *
    * @return the w s u168 of this hydemeta
    */
    @Override
    public float getWSU168() {
        return _hydemeta.getWSU168();
    }

    /**
    * Sets the w s u168 of this hydemeta.
    *
    * @param WSU168 the w s u168 of this hydemeta
    */
    @Override
    public void setWSU168(float WSU168) {
        _hydemeta.setWSU168(WSU168);
    }

    /**
    * Returns the w s u84 of this hydemeta.
    *
    * @return the w s u84 of this hydemeta
    */
    @Override
    public float getWSU84() {
        return _hydemeta.getWSU84();
    }

    /**
    * Sets the w s u84 of this hydemeta.
    *
    * @param WSU84 the w s u84 of this hydemeta
    */
    @Override
    public void setWSU84(float WSU84) {
        _hydemeta.setWSU84(WSU84);
    }

    /**
    * Returns the w d of this hydemeta.
    *
    * @return the w d of this hydemeta
    */
    @Override
    public float getWD() {
        return _hydemeta.getWD();
    }

    /**
    * Sets the w d of this hydemeta.
    *
    * @param WD the w d of this hydemeta
    */
    @Override
    public void setWD(float WD) {
        _hydemeta.setWD(WD);
    }

    /**
    * Returns the w d504 of this hydemeta.
    *
    * @return the w d504 of this hydemeta
    */
    @Override
    public float getWD504() {
        return _hydemeta.getWD504();
    }

    /**
    * Sets the w d504 of this hydemeta.
    *
    * @param WD504 the w d504 of this hydemeta
    */
    @Override
    public void setWD504(float WD504) {
        _hydemeta.setWD504(WD504);
    }

    /**
    * Returns the w d336 of this hydemeta.
    *
    * @return the w d336 of this hydemeta
    */
    @Override
    public float getWD336() {
        return _hydemeta.getWD336();
    }

    /**
    * Sets the w d336 of this hydemeta.
    *
    * @param WD336 the w d336 of this hydemeta
    */
    @Override
    public void setWD336(float WD336) {
        _hydemeta.setWD336(WD336);
    }

    /**
    * Returns the w d168 of this hydemeta.
    *
    * @return the w d168 of this hydemeta
    */
    @Override
    public float getWD168() {
        return _hydemeta.getWD168();
    }

    /**
    * Sets the w d168 of this hydemeta.
    *
    * @param WD168 the w d168 of this hydemeta
    */
    @Override
    public void setWD168(float WD168) {
        _hydemeta.setWD168(WD168);
    }

    /**
    * Returns the w d u740 of this hydemeta.
    *
    * @return the w d u740 of this hydemeta
    */
    @Override
    public float getWDU740() {
        return _hydemeta.getWDU740();
    }

    /**
    * Sets the w d u740 of this hydemeta.
    *
    * @param WDU740 the w d u740 of this hydemeta
    */
    @Override
    public void setWDU740(float WDU740) {
        _hydemeta.setWDU740(WDU740);
    }

    /**
    * Returns the w d u336 of this hydemeta.
    *
    * @return the w d u336 of this hydemeta
    */
    @Override
    public float getWDU336() {
        return _hydemeta.getWDU336();
    }

    /**
    * Sets the w d u336 of this hydemeta.
    *
    * @param WDU336 the w d u336 of this hydemeta
    */
    @Override
    public void setWDU336(float WDU336) {
        _hydemeta.setWDU336(WDU336);
    }

    /**
    * Returns the w d u168 of this hydemeta.
    *
    * @return the w d u168 of this hydemeta
    */
    @Override
    public float getWDU168() {
        return _hydemeta.getWDU168();
    }

    /**
    * Sets the w d u168 of this hydemeta.
    *
    * @param WDU168 the w d u168 of this hydemeta
    */
    @Override
    public void setWDU168(float WDU168) {
        _hydemeta.setWDU168(WDU168);
    }

    /**
    * Returns the w d u84 of this hydemeta.
    *
    * @return the w d u84 of this hydemeta
    */
    @Override
    public float getWDU84() {
        return _hydemeta.getWDU84();
    }

    /**
    * Sets the w d u84 of this hydemeta.
    *
    * @param WDU84 the w d u84 of this hydemeta
    */
    @Override
    public void setWDU84(float WDU84) {
        _hydemeta.setWDU84(WDU84);
    }

    /**
    * Returns the n o672 of this hydemeta.
    *
    * @return the n o672 of this hydemeta
    */
    @Override
    public float getNO672() {
        return _hydemeta.getNO672();
    }

    /**
    * Sets the n o672 of this hydemeta.
    *
    * @param NO672 the n o672 of this hydemeta
    */
    @Override
    public void setNO672(float NO672) {
        _hydemeta.setNO672(NO672);
    }

    /**
    * Returns the n o504 of this hydemeta.
    *
    * @return the n o504 of this hydemeta
    */
    @Override
    public float getNO504() {
        return _hydemeta.getNO504();
    }

    /**
    * Sets the n o504 of this hydemeta.
    *
    * @param NO504 the n o504 of this hydemeta
    */
    @Override
    public void setNO504(float NO504) {
        _hydemeta.setNO504(NO504);
    }

    /**
    * Returns the n o336 of this hydemeta.
    *
    * @return the n o336 of this hydemeta
    */
    @Override
    public float getNO336() {
        return _hydemeta.getNO336();
    }

    /**
    * Sets the n o336 of this hydemeta.
    *
    * @param NO336 the n o336 of this hydemeta
    */
    @Override
    public void setNO336(float NO336) {
        _hydemeta.setNO336(NO336);
    }

    /**
    * Returns the n o168 of this hydemeta.
    *
    * @return the n o168 of this hydemeta
    */
    @Override
    public float getNO168() {
        return _hydemeta.getNO168();
    }

    /**
    * Sets the n o168 of this hydemeta.
    *
    * @param NO168 the n o168 of this hydemeta
    */
    @Override
    public void setNO168(float NO168) {
        _hydemeta.setNO168(NO168);
    }

    /**
    * Returns the n o84 of this hydemeta.
    *
    * @return the n o84 of this hydemeta
    */
    @Override
    public float getNO84() {
        return _hydemeta.getNO84();
    }

    /**
    * Sets the n o84 of this hydemeta.
    *
    * @param NO84 the n o84 of this hydemeta
    */
    @Override
    public void setNO84(float NO84) {
        _hydemeta.setNO84(NO84);
    }

    /**
    * Returns the n o42 of this hydemeta.
    *
    * @return the n o42 of this hydemeta
    */
    @Override
    public float getNO42() {
        return _hydemeta.getNO42();
    }

    /**
    * Sets the n o42 of this hydemeta.
    *
    * @param NO42 the n o42 of this hydemeta
    */
    @Override
    public void setNO42(float NO42) {
        _hydemeta.setNO42(NO42);
    }

    /**
    * Returns the n ox672 of this hydemeta.
    *
    * @return the n ox672 of this hydemeta
    */
    @Override
    public float getNOx672() {
        return _hydemeta.getNOx672();
    }

    /**
    * Sets the n ox672 of this hydemeta.
    *
    * @param NOx672 the n ox672 of this hydemeta
    */
    @Override
    public void setNOx672(float NOx672) {
        _hydemeta.setNOx672(NOx672);
    }

    /**
    * Returns the n ox504 of this hydemeta.
    *
    * @return the n ox504 of this hydemeta
    */
    @Override
    public float getNOx504() {
        return _hydemeta.getNOx504();
    }

    /**
    * Sets the n ox504 of this hydemeta.
    *
    * @param NOx504 the n ox504 of this hydemeta
    */
    @Override
    public void setNOx504(float NOx504) {
        _hydemeta.setNOx504(NOx504);
    }

    /**
    * Returns the n ox336 of this hydemeta.
    *
    * @return the n ox336 of this hydemeta
    */
    @Override
    public float getNOx336() {
        return _hydemeta.getNOx336();
    }

    /**
    * Sets the n ox336 of this hydemeta.
    *
    * @param NOx336 the n ox336 of this hydemeta
    */
    @Override
    public void setNOx336(float NOx336) {
        _hydemeta.setNOx336(NOx336);
    }

    /**
    * Returns the n ox168 of this hydemeta.
    *
    * @return the n ox168 of this hydemeta
    */
    @Override
    public float getNOx168() {
        return _hydemeta.getNOx168();
    }

    /**
    * Sets the n ox168 of this hydemeta.
    *
    * @param NOx168 the n ox168 of this hydemeta
    */
    @Override
    public void setNOx168(float NOx168) {
        _hydemeta.setNOx168(NOx168);
    }

    /**
    * Returns the n ox84 of this hydemeta.
    *
    * @return the n ox84 of this hydemeta
    */
    @Override
    public float getNOx84() {
        return _hydemeta.getNOx84();
    }

    /**
    * Sets the n ox84 of this hydemeta.
    *
    * @param NOx84 the n ox84 of this hydemeta
    */
    @Override
    public void setNOx84(float NOx84) {
        _hydemeta.setNOx84(NOx84);
    }

    /**
    * Returns the n ox42 of this hydemeta.
    *
    * @return the n ox42 of this hydemeta
    */
    @Override
    public float getNOx42() {
        return _hydemeta.getNOx42();
    }

    /**
    * Sets the n ox42 of this hydemeta.
    *
    * @param NOx42 the n ox42 of this hydemeta
    */
    @Override
    public void setNOx42(float NOx42) {
        _hydemeta.setNOx42(NOx42);
    }

    /**
    * Returns the o3672 of this hydemeta.
    *
    * @return the o3672 of this hydemeta
    */
    @Override
    public float getO3672() {
        return _hydemeta.getO3672();
    }

    /**
    * Sets the o3672 of this hydemeta.
    *
    * @param O3672 the o3672 of this hydemeta
    */
    @Override
    public void setO3672(float O3672) {
        _hydemeta.setO3672(O3672);
    }

    /**
    * Returns the o3504 of this hydemeta.
    *
    * @return the o3504 of this hydemeta
    */
    @Override
    public float getO3504() {
        return _hydemeta.getO3504();
    }

    /**
    * Sets the o3504 of this hydemeta.
    *
    * @param O3504 the o3504 of this hydemeta
    */
    @Override
    public void setO3504(float O3504) {
        _hydemeta.setO3504(O3504);
    }

    /**
    * Returns the o3336 of this hydemeta.
    *
    * @return the o3336 of this hydemeta
    */
    @Override
    public float getO3336() {
        return _hydemeta.getO3336();
    }

    /**
    * Sets the o3336 of this hydemeta.
    *
    * @param O3336 the o3336 of this hydemeta
    */
    @Override
    public void setO3336(float O3336) {
        _hydemeta.setO3336(O3336);
    }

    /**
    * Returns the o3168 of this hydemeta.
    *
    * @return the o3168 of this hydemeta
    */
    @Override
    public float getO3168() {
        return _hydemeta.getO3168();
    }

    /**
    * Sets the o3168 of this hydemeta.
    *
    * @param O3168 the o3168 of this hydemeta
    */
    @Override
    public void setO3168(float O3168) {
        _hydemeta.setO3168(O3168);
    }

    /**
    * Returns the o384 of this hydemeta.
    *
    * @return the o384 of this hydemeta
    */
    @Override
    public float getO384() {
        return _hydemeta.getO384();
    }

    /**
    * Sets the o384 of this hydemeta.
    *
    * @param O384 the o384 of this hydemeta
    */
    @Override
    public void setO384(float O384) {
        _hydemeta.setO384(O384);
    }

    /**
    * Returns the o342 of this hydemeta.
    *
    * @return the o342 of this hydemeta
    */
    @Override
    public float getO342() {
        return _hydemeta.getO342();
    }

    /**
    * Sets the o342 of this hydemeta.
    *
    * @param O342 the o342 of this hydemeta
    */
    @Override
    public void setO342(float O342) {
        _hydemeta.setO342(O342);
    }

    /**
    * Returns the s o2672 of this hydemeta.
    *
    * @return the s o2672 of this hydemeta
    */
    @Override
    public float getSO2672() {
        return _hydemeta.getSO2672();
    }

    /**
    * Sets the s o2672 of this hydemeta.
    *
    * @param SO2672 the s o2672 of this hydemeta
    */
    @Override
    public void setSO2672(float SO2672) {
        _hydemeta.setSO2672(SO2672);
    }

    /**
    * Returns the s o2504 of this hydemeta.
    *
    * @return the s o2504 of this hydemeta
    */
    @Override
    public float getSO2504() {
        return _hydemeta.getSO2504();
    }

    /**
    * Sets the s o2504 of this hydemeta.
    *
    * @param SO2504 the s o2504 of this hydemeta
    */
    @Override
    public void setSO2504(float SO2504) {
        _hydemeta.setSO2504(SO2504);
    }

    /**
    * Returns the s o2336 of this hydemeta.
    *
    * @return the s o2336 of this hydemeta
    */
    @Override
    public float getSO2336() {
        return _hydemeta.getSO2336();
    }

    /**
    * Sets the s o2336 of this hydemeta.
    *
    * @param SO2336 the s o2336 of this hydemeta
    */
    @Override
    public void setSO2336(float SO2336) {
        _hydemeta.setSO2336(SO2336);
    }

    /**
    * Returns the s o2168 of this hydemeta.
    *
    * @return the s o2168 of this hydemeta
    */
    @Override
    public float getSO2168() {
        return _hydemeta.getSO2168();
    }

    /**
    * Sets the s o2168 of this hydemeta.
    *
    * @param SO2168 the s o2168 of this hydemeta
    */
    @Override
    public void setSO2168(float SO2168) {
        _hydemeta.setSO2168(SO2168);
    }

    /**
    * Returns the s o284 of this hydemeta.
    *
    * @return the s o284 of this hydemeta
    */
    @Override
    public float getSO284() {
        return _hydemeta.getSO284();
    }

    /**
    * Sets the s o284 of this hydemeta.
    *
    * @param SO284 the s o284 of this hydemeta
    */
    @Override
    public void setSO284(float SO284) {
        _hydemeta.setSO284(SO284);
    }

    /**
    * Returns the s o242 of this hydemeta.
    *
    * @return the s o242 of this hydemeta
    */
    @Override
    public float getSO242() {
        return _hydemeta.getSO242();
    }

    /**
    * Sets the s o242 of this hydemeta.
    *
    * @param SO242 the s o242 of this hydemeta
    */
    @Override
    public void setSO242(float SO242) {
        _hydemeta.setSO242(SO242);
    }

    /**
    * Returns the h2 o672 of this hydemeta.
    *
    * @return the h2 o672 of this hydemeta
    */
    @Override
    public float getH2O672() {
        return _hydemeta.getH2O672();
    }

    /**
    * Sets the h2 o672 of this hydemeta.
    *
    * @param H2O672 the h2 o672 of this hydemeta
    */
    @Override
    public void setH2O672(float H2O672) {
        _hydemeta.setH2O672(H2O672);
    }

    /**
    * Returns the h2 o504 of this hydemeta.
    *
    * @return the h2 o504 of this hydemeta
    */
    @Override
    public float getH2O504() {
        return _hydemeta.getH2O504();
    }

    /**
    * Sets the h2 o504 of this hydemeta.
    *
    * @param H2O504 the h2 o504 of this hydemeta
    */
    @Override
    public void setH2O504(float H2O504) {
        _hydemeta.setH2O504(H2O504);
    }

    /**
    * Returns the h2 o336 of this hydemeta.
    *
    * @return the h2 o336 of this hydemeta
    */
    @Override
    public float getH2O336() {
        return _hydemeta.getH2O336();
    }

    /**
    * Sets the h2 o336 of this hydemeta.
    *
    * @param H2O336 the h2 o336 of this hydemeta
    */
    @Override
    public void setH2O336(float H2O336) {
        _hydemeta.setH2O336(H2O336);
    }

    /**
    * Returns the h2 o168 of this hydemeta.
    *
    * @return the h2 o168 of this hydemeta
    */
    @Override
    public float getH2O168() {
        return _hydemeta.getH2O168();
    }

    /**
    * Sets the h2 o168 of this hydemeta.
    *
    * @param H2O168 the h2 o168 of this hydemeta
    */
    @Override
    public void setH2O168(float H2O168) {
        _hydemeta.setH2O168(H2O168);
    }

    /**
    * Returns the h2 o84 of this hydemeta.
    *
    * @return the h2 o84 of this hydemeta
    */
    @Override
    public float getH2O84() {
        return _hydemeta.getH2O84();
    }

    /**
    * Sets the h2 o84 of this hydemeta.
    *
    * @param H2O84 the h2 o84 of this hydemeta
    */
    @Override
    public void setH2O84(float H2O84) {
        _hydemeta.setH2O84(H2O84);
    }

    /**
    * Returns the h2 o42 of this hydemeta.
    *
    * @return the h2 o42 of this hydemeta
    */
    @Override
    public float getH2O42() {
        return _hydemeta.getH2O42();
    }

    /**
    * Sets the h2 o42 of this hydemeta.
    *
    * @param H2O42 the h2 o42 of this hydemeta
    */
    @Override
    public void setH2O42(float H2O42) {
        _hydemeta.setH2O42(H2O42);
    }

    /**
    * Returns the c o2672 of this hydemeta.
    *
    * @return the c o2672 of this hydemeta
    */
    @Override
    public float getCO2672() {
        return _hydemeta.getCO2672();
    }

    /**
    * Sets the c o2672 of this hydemeta.
    *
    * @param CO2672 the c o2672 of this hydemeta
    */
    @Override
    public void setCO2672(float CO2672) {
        _hydemeta.setCO2672(CO2672);
    }

    /**
    * Returns the c o2504 of this hydemeta.
    *
    * @return the c o2504 of this hydemeta
    */
    @Override
    public float getCO2504() {
        return _hydemeta.getCO2504();
    }

    /**
    * Sets the c o2504 of this hydemeta.
    *
    * @param CO2504 the c o2504 of this hydemeta
    */
    @Override
    public void setCO2504(float CO2504) {
        _hydemeta.setCO2504(CO2504);
    }

    /**
    * Returns the c o2336 of this hydemeta.
    *
    * @return the c o2336 of this hydemeta
    */
    @Override
    public float getCO2336() {
        return _hydemeta.getCO2336();
    }

    /**
    * Sets the c o2336 of this hydemeta.
    *
    * @param CO2336 the c o2336 of this hydemeta
    */
    @Override
    public void setCO2336(float CO2336) {
        _hydemeta.setCO2336(CO2336);
    }

    /**
    * Returns the c o2168 of this hydemeta.
    *
    * @return the c o2168 of this hydemeta
    */
    @Override
    public float getCO2168() {
        return _hydemeta.getCO2168();
    }

    /**
    * Sets the c o2168 of this hydemeta.
    *
    * @param CO2168 the c o2168 of this hydemeta
    */
    @Override
    public void setCO2168(float CO2168) {
        _hydemeta.setCO2168(CO2168);
    }

    /**
    * Returns the c o284 of this hydemeta.
    *
    * @return the c o284 of this hydemeta
    */
    @Override
    public float getCO284() {
        return _hydemeta.getCO284();
    }

    /**
    * Sets the c o284 of this hydemeta.
    *
    * @param CO284 the c o284 of this hydemeta
    */
    @Override
    public void setCO284(float CO284) {
        _hydemeta.setCO284(CO284);
    }

    /**
    * Returns the c o242 of this hydemeta.
    *
    * @return the c o242 of this hydemeta
    */
    @Override
    public float getCO242() {
        return _hydemeta.getCO242();
    }

    /**
    * Sets the c o242 of this hydemeta.
    *
    * @param CO242 the c o242 of this hydemeta
    */
    @Override
    public void setCO242(float CO242) {
        _hydemeta.setCO242(CO242);
    }

    /**
    * Returns the h2 s672 of this hydemeta.
    *
    * @return the h2 s672 of this hydemeta
    */
    @Override
    public float getH2S672() {
        return _hydemeta.getH2S672();
    }

    /**
    * Sets the h2 s672 of this hydemeta.
    *
    * @param H2S672 the h2 s672 of this hydemeta
    */
    @Override
    public void setH2S672(float H2S672) {
        _hydemeta.setH2S672(H2S672);
    }

    /**
    * Returns the h2 s504 of this hydemeta.
    *
    * @return the h2 s504 of this hydemeta
    */
    @Override
    public float getH2S504() {
        return _hydemeta.getH2S504();
    }

    /**
    * Sets the h2 s504 of this hydemeta.
    *
    * @param H2S504 the h2 s504 of this hydemeta
    */
    @Override
    public void setH2S504(float H2S504) {
        _hydemeta.setH2S504(H2S504);
    }

    /**
    * Returns the h2 s336 of this hydemeta.
    *
    * @return the h2 s336 of this hydemeta
    */
    @Override
    public float getH2S336() {
        return _hydemeta.getH2S336();
    }

    /**
    * Sets the h2 s336 of this hydemeta.
    *
    * @param H2S336 the h2 s336 of this hydemeta
    */
    @Override
    public void setH2S336(float H2S336) {
        _hydemeta.setH2S336(H2S336);
    }

    /**
    * Returns the h2 s168 of this hydemeta.
    *
    * @return the h2 s168 of this hydemeta
    */
    @Override
    public float getH2S168() {
        return _hydemeta.getH2S168();
    }

    /**
    * Sets the h2 s168 of this hydemeta.
    *
    * @param H2S168 the h2 s168 of this hydemeta
    */
    @Override
    public void setH2S168(float H2S168) {
        _hydemeta.setH2S168(H2S168);
    }

    /**
    * Returns the h2 s84 of this hydemeta.
    *
    * @return the h2 s84 of this hydemeta
    */
    @Override
    public float getH2S84() {
        return _hydemeta.getH2S84();
    }

    /**
    * Sets the h2 s84 of this hydemeta.
    *
    * @param H2S84 the h2 s84 of this hydemeta
    */
    @Override
    public void setH2S84(float H2S84) {
        _hydemeta.setH2S84(H2S84);
    }

    /**
    * Returns the h2 s42 of this hydemeta.
    *
    * @return the h2 s42 of this hydemeta
    */
    @Override
    public float getH2S42() {
        return _hydemeta.getH2S42();
    }

    /**
    * Sets the h2 s42 of this hydemeta.
    *
    * @param H2S42 the h2 s42 of this hydemeta
    */
    @Override
    public void setH2S42(float H2S42) {
        _hydemeta.setH2S42(H2S42);
    }

    /**
    * Returns the r h i r g a672 of this hydemeta.
    *
    * @return the r h i r g a672 of this hydemeta
    */
    @Override
    public float getRHIRGA672() {
        return _hydemeta.getRHIRGA672();
    }

    /**
    * Sets the r h i r g a672 of this hydemeta.
    *
    * @param RHIRGA672 the r h i r g a672 of this hydemeta
    */
    @Override
    public void setRHIRGA672(float RHIRGA672) {
        _hydemeta.setRHIRGA672(RHIRGA672);
    }

    /**
    * Returns the r h i r g a504 of this hydemeta.
    *
    * @return the r h i r g a504 of this hydemeta
    */
    @Override
    public float getRHIRGA504() {
        return _hydemeta.getRHIRGA504();
    }

    /**
    * Sets the r h i r g a504 of this hydemeta.
    *
    * @param RHIRGA504 the r h i r g a504 of this hydemeta
    */
    @Override
    public void setRHIRGA504(float RHIRGA504) {
        _hydemeta.setRHIRGA504(RHIRGA504);
    }

    /**
    * Returns the r h i r g a336 of this hydemeta.
    *
    * @return the r h i r g a336 of this hydemeta
    */
    @Override
    public float getRHIRGA336() {
        return _hydemeta.getRHIRGA336();
    }

    /**
    * Sets the r h i r g a336 of this hydemeta.
    *
    * @param RHIRGA336 the r h i r g a336 of this hydemeta
    */
    @Override
    public void setRHIRGA336(float RHIRGA336) {
        _hydemeta.setRHIRGA336(RHIRGA336);
    }

    /**
    * Returns the r h i r g a168 of this hydemeta.
    *
    * @return the r h i r g a168 of this hydemeta
    */
    @Override
    public float getRHIRGA168() {
        return _hydemeta.getRHIRGA168();
    }

    /**
    * Sets the r h i r g a168 of this hydemeta.
    *
    * @param RHIRGA168 the r h i r g a168 of this hydemeta
    */
    @Override
    public void setRHIRGA168(float RHIRGA168) {
        _hydemeta.setRHIRGA168(RHIRGA168);
    }

    /**
    * Returns the r h i r g a84 of this hydemeta.
    *
    * @return the r h i r g a84 of this hydemeta
    */
    @Override
    public float getRHIRGA84() {
        return _hydemeta.getRHIRGA84();
    }

    /**
    * Sets the r h i r g a84 of this hydemeta.
    *
    * @param RHIRGA84 the r h i r g a84 of this hydemeta
    */
    @Override
    public void setRHIRGA84(float RHIRGA84) {
        _hydemeta.setRHIRGA84(RHIRGA84);
    }

    /**
    * Returns the r h i r g a42 of this hydemeta.
    *
    * @return the r h i r g a42 of this hydemeta
    */
    @Override
    public float getRHIRGA42() {
        return _hydemeta.getRHIRGA42();
    }

    /**
    * Sets the r h i r g a42 of this hydemeta.
    *
    * @param RHIRGA42 the r h i r g a42 of this hydemeta
    */
    @Override
    public void setRHIRGA42(float RHIRGA42) {
        _hydemeta.setRHIRGA42(RHIRGA42);
    }

    /**
    * Returns the c o672 of this hydemeta.
    *
    * @return the c o672 of this hydemeta
    */
    @Override
    public float getCO672() {
        return _hydemeta.getCO672();
    }

    /**
    * Sets the c o672 of this hydemeta.
    *
    * @param CO672 the c o672 of this hydemeta
    */
    @Override
    public void setCO672(float CO672) {
        _hydemeta.setCO672(CO672);
    }

    /**
    * Returns the c o504 of this hydemeta.
    *
    * @return the c o504 of this hydemeta
    */
    @Override
    public float getCO504() {
        return _hydemeta.getCO504();
    }

    /**
    * Sets the c o504 of this hydemeta.
    *
    * @param CO504 the c o504 of this hydemeta
    */
    @Override
    public void setCO504(float CO504) {
        _hydemeta.setCO504(CO504);
    }

    /**
    * Returns the c o336 of this hydemeta.
    *
    * @return the c o336 of this hydemeta
    */
    @Override
    public float getCO336() {
        return _hydemeta.getCO336();
    }

    /**
    * Sets the c o336 of this hydemeta.
    *
    * @param CO336 the c o336 of this hydemeta
    */
    @Override
    public void setCO336(float CO336) {
        _hydemeta.setCO336(CO336);
    }

    /**
    * Returns the c o168 of this hydemeta.
    *
    * @return the c o168 of this hydemeta
    */
    @Override
    public float getCO168() {
        return _hydemeta.getCO168();
    }

    /**
    * Sets the c o168 of this hydemeta.
    *
    * @param CO168 the c o168 of this hydemeta
    */
    @Override
    public void setCO168(float CO168) {
        _hydemeta.setCO168(CO168);
    }

    /**
    * Returns the c o84 of this hydemeta.
    *
    * @return the c o84 of this hydemeta
    */
    @Override
    public float getCO84() {
        return _hydemeta.getCO84();
    }

    /**
    * Sets the c o84 of this hydemeta.
    *
    * @param CO84 the c o84 of this hydemeta
    */
    @Override
    public void setCO84(float CO84) {
        _hydemeta.setCO84(CO84);
    }

    /**
    * Returns the c o42 of this hydemeta.
    *
    * @return the c o42 of this hydemeta
    */
    @Override
    public float getCO42() {
        return _hydemeta.getCO42();
    }

    /**
    * Sets the c o42 of this hydemeta.
    *
    * @param CO42 the c o42 of this hydemeta
    */
    @Override
    public void setCO42(float CO42) {
        _hydemeta.setCO42(CO42);
    }

    /**
    * Returns the r h td of this hydemeta.
    *
    * @return the r h td of this hydemeta
    */
    @Override
    public float getRHTd() {
        return _hydemeta.getRHTd();
    }

    /**
    * Sets the r h td of this hydemeta.
    *
    * @param RHTd the r h td of this hydemeta
    */
    @Override
    public void setRHTd(float RHTd) {
        _hydemeta.setRHTd(RHTd);
    }

    /**
    * Returns the p t g of this hydemeta.
    *
    * @return the p t g of this hydemeta
    */
    @Override
    public float getPTG() {
        return _hydemeta.getPTG();
    }

    /**
    * Sets the p t g of this hydemeta.
    *
    * @param PTG the p t g of this hydemeta
    */
    @Override
    public void setPTG(float PTG) {
        _hydemeta.setPTG(PTG);
    }

    /**
    * Returns the visibility of this hydemeta.
    *
    * @return the visibility of this hydemeta
    */
    @Override
    public float getVisibility() {
        return _hydemeta.getVisibility();
    }

    /**
    * Sets the visibility of this hydemeta.
    *
    * @param Visibility the visibility of this hydemeta
    */
    @Override
    public void setVisibility(float Visibility) {
        _hydemeta.setVisibility(Visibility);
    }

    /**
    * Returns the visibilitymin of this hydemeta.
    *
    * @return the visibilitymin of this hydemeta
    */
    @Override
    public float getVisibilitymin() {
        return _hydemeta.getVisibilitymin();
    }

    /**
    * Sets the visibilitymin of this hydemeta.
    *
    * @param Visibilitymin the visibilitymin of this hydemeta
    */
    @Override
    public void setVisibilitymin(float Visibilitymin) {
        _hydemeta.setVisibilitymin(Visibilitymin);
    }

    /**
    * Returns the visibilitymax of this hydemeta.
    *
    * @return the visibilitymax of this hydemeta
    */
    @Override
    public float getVisibilitymax() {
        return _hydemeta.getVisibilitymax();
    }

    /**
    * Sets the visibilitymax of this hydemeta.
    *
    * @param Visibilitymax the visibilitymax of this hydemeta
    */
    @Override
    public void setVisibilitymax(float Visibilitymax) {
        _hydemeta.setVisibilitymax(Visibilitymax);
    }

    /**
    * Returns the precipint of this hydemeta.
    *
    * @return the precipint of this hydemeta
    */
    @Override
    public float getPrecipint() {
        return _hydemeta.getPrecipint();
    }

    /**
    * Sets the precipint of this hydemeta.
    *
    * @param Precipint the precipint of this hydemeta
    */
    @Override
    public void setPrecipint(float Precipint) {
        _hydemeta.setPrecipint(Precipint);
    }

    /**
    * Returns the precipintmin of this hydemeta.
    *
    * @return the precipintmin of this hydemeta
    */
    @Override
    public float getPrecipintmin() {
        return _hydemeta.getPrecipintmin();
    }

    /**
    * Sets the precipintmin of this hydemeta.
    *
    * @param Precipintmin the precipintmin of this hydemeta
    */
    @Override
    public void setPrecipintmin(float Precipintmin) {
        _hydemeta.setPrecipintmin(Precipintmin);
    }

    /**
    * Returns the precipintmax of this hydemeta.
    *
    * @return the precipintmax of this hydemeta
    */
    @Override
    public float getPrecipintmax() {
        return _hydemeta.getPrecipintmax();
    }

    /**
    * Sets the precipintmax of this hydemeta.
    *
    * @param Precipintmax the precipintmax of this hydemeta
    */
    @Override
    public void setPrecipintmax(float Precipintmax) {
        _hydemeta.setPrecipintmax(Precipintmax);
    }

    /**
    * Returns the precipacc of this hydemeta.
    *
    * @return the precipacc of this hydemeta
    */
    @Override
    public float getPrecipacc() {
        return _hydemeta.getPrecipacc();
    }

    /**
    * Sets the precipacc of this hydemeta.
    *
    * @param Precipacc the precipacc of this hydemeta
    */
    @Override
    public void setPrecipacc(float Precipacc) {
        _hydemeta.setPrecipacc(Precipacc);
    }

    /**
    * Returns the snowfallacc of this hydemeta.
    *
    * @return the snowfallacc of this hydemeta
    */
    @Override
    public float getSnowfallacc() {
        return _hydemeta.getSnowfallacc();
    }

    /**
    * Sets the snowfallacc of this hydemeta.
    *
    * @param Snowfallacc the snowfallacc of this hydemeta
    */
    @Override
    public void setSnowfallacc(float Snowfallacc) {
        _hydemeta.setSnowfallacc(Snowfallacc);
    }

    /**
    * Returns the wthcode of this hydemeta.
    *
    * @return the wthcode of this hydemeta
    */
    @Override
    public int getWthcode() {
        return _hydemeta.getWthcode();
    }

    /**
    * Sets the wthcode of this hydemeta.
    *
    * @param wthcode the wthcode of this hydemeta
    */
    @Override
    public void setWthcode(int wthcode) {
        _hydemeta.setWthcode(wthcode);
    }

    /**
    * Returns the wthcodemin of this hydemeta.
    *
    * @return the wthcodemin of this hydemeta
    */
    @Override
    public int getWthcodemin() {
        return _hydemeta.getWthcodemin();
    }

    /**
    * Sets the wthcodemin of this hydemeta.
    *
    * @param wthcodemin the wthcodemin of this hydemeta
    */
    @Override
    public void setWthcodemin(int wthcodemin) {
        _hydemeta.setWthcodemin(wthcodemin);
    }

    /**
    * Returns the wthcodemax of this hydemeta.
    *
    * @return the wthcodemax of this hydemeta
    */
    @Override
    public int getWthcodemax() {
        return _hydemeta.getWthcodemax();
    }

    /**
    * Sets the wthcodemax of this hydemeta.
    *
    * @param wthcodemax the wthcodemax of this hydemeta
    */
    @Override
    public void setWthcodemax(int wthcodemax) {
        _hydemeta.setWthcodemax(wthcodemax);
    }

    /**
    * Returns the tsoil_humus of this hydemeta.
    *
    * @return the tsoil_humus of this hydemeta
    */
    @Override
    public float getTsoil_humus() {
        return _hydemeta.getTsoil_humus();
    }

    /**
    * Sets the tsoil_humus of this hydemeta.
    *
    * @param tsoil_humus the tsoil_humus of this hydemeta
    */
    @Override
    public void setTsoil_humus(float tsoil_humus) {
        _hydemeta.setTsoil_humus(tsoil_humus);
    }

    /**
    * Returns the tsoil_ a of this hydemeta.
    *
    * @return the tsoil_ a of this hydemeta
    */
    @Override
    public float getTsoil_A() {
        return _hydemeta.getTsoil_A();
    }

    /**
    * Sets the tsoil_ a of this hydemeta.
    *
    * @param tsoil_A the tsoil_ a of this hydemeta
    */
    @Override
    public void setTsoil_A(float tsoil_A) {
        _hydemeta.setTsoil_A(tsoil_A);
    }

    /**
    * Returns the tsoil_ b1 of this hydemeta.
    *
    * @return the tsoil_ b1 of this hydemeta
    */
    @Override
    public float getTsoil_B1() {
        return _hydemeta.getTsoil_B1();
    }

    /**
    * Sets the tsoil_ b1 of this hydemeta.
    *
    * @param tsoil_B1 the tsoil_ b1 of this hydemeta
    */
    @Override
    public void setTsoil_B1(float tsoil_B1) {
        _hydemeta.setTsoil_B1(tsoil_B1);
    }

    /**
    * Returns the tsoil_ b2 of this hydemeta.
    *
    * @return the tsoil_ b2 of this hydemeta
    */
    @Override
    public float getTsoil_B2() {
        return _hydemeta.getTsoil_B2();
    }

    /**
    * Sets the tsoil_ b2 of this hydemeta.
    *
    * @param tsoil_B2 the tsoil_ b2 of this hydemeta
    */
    @Override
    public void setTsoil_B2(float tsoil_B2) {
        _hydemeta.setTsoil_B2(tsoil_B2);
    }

    /**
    * Returns the tsoil_ c1 of this hydemeta.
    *
    * @return the tsoil_ c1 of this hydemeta
    */
    @Override
    public float getTsoil_C1() {
        return _hydemeta.getTsoil_C1();
    }

    /**
    * Sets the tsoil_ c1 of this hydemeta.
    *
    * @param tsoil_C1 the tsoil_ c1 of this hydemeta
    */
    @Override
    public void setTsoil_C1(float tsoil_C1) {
        _hydemeta.setTsoil_C1(tsoil_C1);
    }

    /**
    * Returns the h2 o td of this hydemeta.
    *
    * @return the h2 o td of this hydemeta
    */
    @Override
    public float getH2OTd() {
        return _hydemeta.getH2OTd();
    }

    /**
    * Sets the h2 o td of this hydemeta.
    *
    * @param H2OTd the h2 o td of this hydemeta
    */
    @Override
    public void setH2OTd(float H2OTd) {
        _hydemeta.setH2OTd(H2OTd);
    }

    /**
    * Returns the c o2_storage_flux of this hydemeta.
    *
    * @return the c o2_storage_flux of this hydemeta
    */
    @Override
    public float getCO2_storage_flux() {
        return _hydemeta.getCO2_storage_flux();
    }

    /**
    * Sets the c o2_storage_flux of this hydemeta.
    *
    * @param CO2_storage_flux the c o2_storage_flux of this hydemeta
    */
    @Override
    public void setCO2_storage_flux(float CO2_storage_flux) {
        _hydemeta.setCO2_storage_flux(CO2_storage_flux);
    }

    /**
    * Returns the wsoil_humus of this hydemeta.
    *
    * @return the wsoil_humus of this hydemeta
    */
    @Override
    public float getWsoil_humus() {
        return _hydemeta.getWsoil_humus();
    }

    /**
    * Sets the wsoil_humus of this hydemeta.
    *
    * @param wsoil_humus the wsoil_humus of this hydemeta
    */
    @Override
    public void setWsoil_humus(float wsoil_humus) {
        _hydemeta.setWsoil_humus(wsoil_humus);
    }

    /**
    * Returns the wsoil_ a of this hydemeta.
    *
    * @return the wsoil_ a of this hydemeta
    */
    @Override
    public float getWsoil_A() {
        return _hydemeta.getWsoil_A();
    }

    /**
    * Sets the wsoil_ a of this hydemeta.
    *
    * @param wsoil_A the wsoil_ a of this hydemeta
    */
    @Override
    public void setWsoil_A(float wsoil_A) {
        _hydemeta.setWsoil_A(wsoil_A);
    }

    /**
    * Returns the wsoil_ b1 of this hydemeta.
    *
    * @return the wsoil_ b1 of this hydemeta
    */
    @Override
    public float getWsoil_B1() {
        return _hydemeta.getWsoil_B1();
    }

    /**
    * Sets the wsoil_ b1 of this hydemeta.
    *
    * @param wsoil_B1 the wsoil_ b1 of this hydemeta
    */
    @Override
    public void setWsoil_B1(float wsoil_B1) {
        _hydemeta.setWsoil_B1(wsoil_B1);
    }

    /**
    * Returns the wsoil_ b2 of this hydemeta.
    *
    * @return the wsoil_ b2 of this hydemeta
    */
    @Override
    public float getWsoil_B2() {
        return _hydemeta.getWsoil_B2();
    }

    /**
    * Sets the wsoil_ b2 of this hydemeta.
    *
    * @param wsoil_B2 the wsoil_ b2 of this hydemeta
    */
    @Override
    public void setWsoil_B2(float wsoil_B2) {
        _hydemeta.setWsoil_B2(wsoil_B2);
    }

    /**
    * Returns the wsoil_ c1 of this hydemeta.
    *
    * @return the wsoil_ c1 of this hydemeta
    */
    @Override
    public float getWsoil_C1() {
        return _hydemeta.getWsoil_C1();
    }

    /**
    * Sets the wsoil_ c1 of this hydemeta.
    *
    * @param wsoil_C1 the wsoil_ c1 of this hydemeta
    */
    @Override
    public void setWsoil_C1(float wsoil_C1) {
        _hydemeta.setWsoil_C1(wsoil_C1);
    }

    /**
    * Returns the l win of this hydemeta.
    *
    * @return the l win of this hydemeta
    */
    @Override
    public float getLWin() {
        return _hydemeta.getLWin();
    }

    /**
    * Sets the l win of this hydemeta.
    *
    * @param LWin the l win of this hydemeta
    */
    @Override
    public void setLWin(float LWin) {
        _hydemeta.setLWin(LWin);
    }

    /**
    * Returns the l wout of this hydemeta.
    *
    * @return the l wout of this hydemeta
    */
    @Override
    public float getLWout() {
        return _hydemeta.getLWout();
    }

    /**
    * Sets the l wout of this hydemeta.
    *
    * @param LWout the l wout of this hydemeta
    */
    @Override
    public void setLWout(float LWout) {
        _hydemeta.setLWout(LWout);
    }

    /**
    * Returns the p r i of this hydemeta.
    *
    * @return the p r i of this hydemeta
    */
    @Override
    public float getPRI() {
        return _hydemeta.getPRI();
    }

    /**
    * Sets the p r i of this hydemeta.
    *
    * @param PRI the p r i of this hydemeta
    */
    @Override
    public void setPRI(float PRI) {
        _hydemeta.setPRI(PRI);
    }

    /**
    * Returns the n d v i of this hydemeta.
    *
    * @return the n d v i of this hydemeta
    */
    @Override
    public float getNDVI() {
        return _hydemeta.getNDVI();
    }

    /**
    * Sets the n d v i of this hydemeta.
    *
    * @param NDVI the n d v i of this hydemeta
    */
    @Override
    public void setNDVI(float NDVI) {
        _hydemeta.setNDVI(NDVI);
    }

    /**
    * Returns the b n d v i of this hydemeta.
    *
    * @return the b n d v i of this hydemeta
    */
    @Override
    public float getBNDVI() {
        return _hydemeta.getBNDVI();
    }

    /**
    * Sets the b n d v i of this hydemeta.
    *
    * @param BNDVI the b n d v i of this hydemeta
    */
    @Override
    public void setBNDVI(float BNDVI) {
        _hydemeta.setBNDVI(BNDVI);
    }

    /**
    * Returns the can p a r1 of this hydemeta.
    *
    * @return the can p a r1 of this hydemeta
    */
    @Override
    public float getCanPAR1() {
        return _hydemeta.getCanPAR1();
    }

    /**
    * Sets the can p a r1 of this hydemeta.
    *
    * @param canPAR1 the can p a r1 of this hydemeta
    */
    @Override
    public void setCanPAR1(float canPAR1) {
        _hydemeta.setCanPAR1(canPAR1);
    }

    /**
    * Returns the can p a r2 of this hydemeta.
    *
    * @return the can p a r2 of this hydemeta
    */
    @Override
    public float getCanPAR2() {
        return _hydemeta.getCanPAR2();
    }

    /**
    * Sets the can p a r2 of this hydemeta.
    *
    * @param canPAR2 the can p a r2 of this hydemeta
    */
    @Override
    public void setCanPAR2(float canPAR2) {
        _hydemeta.setCanPAR2(canPAR2);
    }

    /**
    * Returns the can p a r3 of this hydemeta.
    *
    * @return the can p a r3 of this hydemeta
    */
    @Override
    public float getCanPAR3() {
        return _hydemeta.getCanPAR3();
    }

    /**
    * Sets the can p a r3 of this hydemeta.
    *
    * @param canPAR3 the can p a r3 of this hydemeta
    */
    @Override
    public void setCanPAR3(float canPAR3) {
        _hydemeta.setCanPAR3(canPAR3);
    }

    /**
    * Returns the maa p a r of this hydemeta.
    *
    * @return the maa p a r of this hydemeta
    */
    @Override
    public float getMaaPAR() {
        return _hydemeta.getMaaPAR();
    }

    /**
    * Sets the maa p a r of this hydemeta.
    *
    * @param maaPAR the maa p a r of this hydemeta
    */
    @Override
    public void setMaaPAR(float maaPAR) {
        _hydemeta.setMaaPAR(maaPAR);
    }

    /**
    * Returns the maa net of this hydemeta.
    *
    * @return the maa net of this hydemeta
    */
    @Override
    public float getMaaNet() {
        return _hydemeta.getMaaNet();
    }

    /**
    * Sets the maa net of this hydemeta.
    *
    * @param maaNet the maa net of this hydemeta
    */
    @Override
    public void setMaaNet(float maaNet) {
        _hydemeta.setMaaNet(maaNet);
    }

    /**
    * Returns the p a r2 of this hydemeta.
    *
    * @return the p a r2 of this hydemeta
    */
    @Override
    public float getPAR2() {
        return _hydemeta.getPAR2();
    }

    /**
    * Sets the p a r2 of this hydemeta.
    *
    * @param PAR2 the p a r2 of this hydemeta
    */
    @Override
    public void setPAR2(float PAR2) {
        _hydemeta.setPAR2(PAR2);
    }

    /**
    * Returns the globmast of this hydemeta.
    *
    * @return the globmast of this hydemeta
    */
    @Override
    public float getGlobmast() {
        return _hydemeta.getGlobmast();
    }

    /**
    * Sets the globmast of this hydemeta.
    *
    * @param Globmast the globmast of this hydemeta
    */
    @Override
    public void setGlobmast(float Globmast) {
        _hydemeta.setGlobmast(Globmast);
    }

    /**
    * Returns the w d u672 of this hydemeta.
    *
    * @return the w d u672 of this hydemeta
    */
    @Override
    public float getWDU672() {
        return _hydemeta.getWDU672();
    }

    /**
    * Sets the w d u672 of this hydemeta.
    *
    * @param WDU672 the w d u672 of this hydemeta
    */
    @Override
    public void setWDU672(float WDU672) {
        _hydemeta.setWDU672(WDU672);
    }

    /**
    * Returns the w s u672 of this hydemeta.
    *
    * @return the w s u672 of this hydemeta
    */
    @Override
    public float getWSU672() {
        return _hydemeta.getWSU672();
    }

    /**
    * Sets the w s u672 of this hydemeta.
    *
    * @param WSU672 the w s u672 of this hydemeta
    */
    @Override
    public void setWSU672(float WSU672) {
        _hydemeta.setWSU672(WSU672);
    }

    /**
    * Returns the r glob125 of this hydemeta.
    *
    * @return the r glob125 of this hydemeta
    */
    @Override
    public float getRGlob125() {
        return _hydemeta.getRGlob125();
    }

    /**
    * Sets the r glob125 of this hydemeta.
    *
    * @param RGlob125 the r glob125 of this hydemeta
    */
    @Override
    public void setRGlob125(float RGlob125) {
        _hydemeta.setRGlob125(RGlob125);
    }

    /**
    * Returns the c h4168 of this hydemeta.
    *
    * @return the c h4168 of this hydemeta
    */
    @Override
    public float getCH4168() {
        return _hydemeta.getCH4168();
    }

    /**
    * Sets the c h4168 of this hydemeta.
    *
    * @param CH4168 the c h4168 of this hydemeta
    */
    @Override
    public void setCH4168(float CH4168) {
        _hydemeta.setCH4168(CH4168);
    }

    /**
    * Returns the c h4672 of this hydemeta.
    *
    * @return the c h4672 of this hydemeta
    */
    @Override
    public float getCH4672() {
        return _hydemeta.getCH4672();
    }

    /**
    * Sets the c h4672 of this hydemeta.
    *
    * @param CH4672 the c h4672 of this hydemeta
    */
    @Override
    public void setCH4672(float CH4672) {
        _hydemeta.setCH4672(CH4672);
    }

    /**
    * Returns the c h41250 of this hydemeta.
    *
    * @return the c h41250 of this hydemeta
    */
    @Override
    public float getCH41250() {
        return _hydemeta.getCH41250();
    }

    /**
    * Sets the c h41250 of this hydemeta.
    *
    * @param CH41250 the c h41250 of this hydemeta
    */
    @Override
    public void setCH41250(float CH41250) {
        _hydemeta.setCH41250(CH41250);
    }

    /**
    * Returns the t1250 of this hydemeta.
    *
    * @return the t1250 of this hydemeta
    */
    @Override
    public float getT1250() {
        return _hydemeta.getT1250();
    }

    /**
    * Sets the t1250 of this hydemeta.
    *
    * @param T1250 the t1250 of this hydemeta
    */
    @Override
    public void setT1250(float T1250) {
        _hydemeta.setT1250(T1250);
    }

    /**
    * Returns the wpsoil_ a of this hydemeta.
    *
    * @return the wpsoil_ a of this hydemeta
    */
    @Override
    public float getWpsoil_A() {
        return _hydemeta.getWpsoil_A();
    }

    /**
    * Sets the wpsoil_ a of this hydemeta.
    *
    * @param wpsoil_A the wpsoil_ a of this hydemeta
    */
    @Override
    public void setWpsoil_A(float wpsoil_A) {
        _hydemeta.setWpsoil_A(wpsoil_A);
    }

    /**
    * Returns the wpsoil_ b of this hydemeta.
    *
    * @return the wpsoil_ b of this hydemeta
    */
    @Override
    public float getWpsoil_B() {
        return _hydemeta.getWpsoil_B();
    }

    /**
    * Sets the wpsoil_ b of this hydemeta.
    *
    * @param wpsoil_B the wpsoil_ b of this hydemeta
    */
    @Override
    public void setWpsoil_B(float wpsoil_B) {
        _hydemeta.setWpsoil_B(wpsoil_B);
    }

    /**
    * Returns the runoff1 of this hydemeta.
    *
    * @return the runoff1 of this hydemeta
    */
    @Override
    public float getRunoff1() {
        return _hydemeta.getRunoff1();
    }

    /**
    * Sets the runoff1 of this hydemeta.
    *
    * @param runoff1 the runoff1 of this hydemeta
    */
    @Override
    public void setRunoff1(float runoff1) {
        _hydemeta.setRunoff1(runoff1);
    }

    /**
    * Returns the runoff2 of this hydemeta.
    *
    * @return the runoff2 of this hydemeta
    */
    @Override
    public float getRunoff2() {
        return _hydemeta.getRunoff2();
    }

    /**
    * Sets the runoff2 of this hydemeta.
    *
    * @param runoff2 the runoff2 of this hydemeta
    */
    @Override
    public void setRunoff2(float runoff2) {
        _hydemeta.setRunoff2(runoff2);
    }

    /**
    * Returns the drainage1 of this hydemeta.
    *
    * @return the drainage1 of this hydemeta
    */
    @Override
    public float getDrainage1() {
        return _hydemeta.getDrainage1();
    }

    /**
    * Sets the drainage1 of this hydemeta.
    *
    * @param drainage1 the drainage1 of this hydemeta
    */
    @Override
    public void setDrainage1(float drainage1) {
        _hydemeta.setDrainage1(drainage1);
    }

    /**
    * Returns the c o2icos168 of this hydemeta.
    *
    * @return the c o2icos168 of this hydemeta
    */
    @Override
    public float getCO2icos168() {
        return _hydemeta.getCO2icos168();
    }

    /**
    * Sets the c o2icos168 of this hydemeta.
    *
    * @param CO2icos168 the c o2icos168 of this hydemeta
    */
    @Override
    public void setCO2icos168(float CO2icos168) {
        _hydemeta.setCO2icos168(CO2icos168);
    }

    /**
    * Returns the c o2icos672 of this hydemeta.
    *
    * @return the c o2icos672 of this hydemeta
    */
    @Override
    public float getCO2icos672() {
        return _hydemeta.getCO2icos672();
    }

    /**
    * Sets the c o2icos672 of this hydemeta.
    *
    * @param CO2icos672 the c o2icos672 of this hydemeta
    */
    @Override
    public void setCO2icos672(float CO2icos672) {
        _hydemeta.setCO2icos672(CO2icos672);
    }

    /**
    * Returns the c o2icos1250 of this hydemeta.
    *
    * @return the c o2icos1250 of this hydemeta
    */
    @Override
    public float getCO2icos1250() {
        return _hydemeta.getCO2icos1250();
    }

    /**
    * Sets the c o2icos1250 of this hydemeta.
    *
    * @param CO2icos1250 the c o2icos1250 of this hydemeta
    */
    @Override
    public void setCO2icos1250(float CO2icos1250) {
        _hydemeta.setCO2icos1250(CO2icos1250);
    }

    /**
    * Returns the h2 oicos168 of this hydemeta.
    *
    * @return the h2 oicos168 of this hydemeta
    */
    @Override
    public float getH2Oicos168() {
        return _hydemeta.getH2Oicos168();
    }

    /**
    * Sets the h2 oicos168 of this hydemeta.
    *
    * @param H2Oicos168 the h2 oicos168 of this hydemeta
    */
    @Override
    public void setH2Oicos168(float H2Oicos168) {
        _hydemeta.setH2Oicos168(H2Oicos168);
    }

    /**
    * Returns the h2 oicos672 of this hydemeta.
    *
    * @return the h2 oicos672 of this hydemeta
    */
    @Override
    public float getH2Oicos672() {
        return _hydemeta.getH2Oicos672();
    }

    /**
    * Sets the h2 oicos672 of this hydemeta.
    *
    * @param H2Oicos672 the h2 oicos672 of this hydemeta
    */
    @Override
    public void setH2Oicos672(float H2Oicos672) {
        _hydemeta.setH2Oicos672(H2Oicos672);
    }

    /**
    * Returns the h2 oicos1250 of this hydemeta.
    *
    * @return the h2 oicos1250 of this hydemeta
    */
    @Override
    public float getH2Oicos1250() {
        return _hydemeta.getH2Oicos1250();
    }

    /**
    * Sets the h2 oicos1250 of this hydemeta.
    *
    * @param H2Oicos1250 the h2 oicos1250 of this hydemeta
    */
    @Override
    public void setH2Oicos1250(float H2Oicos1250) {
        _hydemeta.setH2Oicos1250(H2Oicos1250);
    }

    /**
    * Returns the u v_ a_ e m e p of this hydemeta.
    *
    * @return the u v_ a_ e m e p of this hydemeta
    */
    @Override
    public int getUV_A_EMEP() {
        return _hydemeta.getUV_A_EMEP();
    }

    /**
    * Sets the u v_ a_ e m e p of this hydemeta.
    *
    * @param UV_A_EMEP the u v_ a_ e m e p of this hydemeta
    */
    @Override
    public void setUV_A_EMEP(int UV_A_EMEP) {
        _hydemeta.setUV_A_EMEP(UV_A_EMEP);
    }

    /**
    * Returns the u v_ b_ e m e p of this hydemeta.
    *
    * @return the u v_ b_ e m e p of this hydemeta
    */
    @Override
    public int getUV_B_EMEP() {
        return _hydemeta.getUV_B_EMEP();
    }

    /**
    * Sets the u v_ b_ e m e p of this hydemeta.
    *
    * @param UV_B_EMEP the u v_ b_ e m e p of this hydemeta
    */
    @Override
    public void setUV_B_EMEP(int UV_B_EMEP) {
        _hydemeta.setUV_B_EMEP(UV_B_EMEP);
    }

    /**
    * Returns the diff p a r_ e m e p of this hydemeta.
    *
    * @return the diff p a r_ e m e p of this hydemeta
    */
    @Override
    public int getDiffPAR_EMEP() {
        return _hydemeta.getDiffPAR_EMEP();
    }

    /**
    * Sets the diff p a r_ e m e p of this hydemeta.
    *
    * @param diffPAR_EMEP the diff p a r_ e m e p of this hydemeta
    */
    @Override
    public void setDiffPAR_EMEP(int diffPAR_EMEP) {
        _hydemeta.setDiffPAR_EMEP(diffPAR_EMEP);
    }

    /**
    * Returns the diff g l o b_ e m e p of this hydemeta.
    *
    * @return the diff g l o b_ e m e p of this hydemeta
    */
    @Override
    public int getDiffGLOB_EMEP() {
        return _hydemeta.getDiffGLOB_EMEP();
    }

    /**
    * Sets the diff g l o b_ e m e p of this hydemeta.
    *
    * @param diffGLOB_EMEP the diff g l o b_ e m e p of this hydemeta
    */
    @Override
    public void setDiffGLOB_EMEP(int diffGLOB_EMEP) {
        _hydemeta.setDiffGLOB_EMEP(diffGLOB_EMEP);
    }

    /**
    * Returns the dir g l o b_ e m e p of this hydemeta.
    *
    * @return the dir g l o b_ e m e p of this hydemeta
    */
    @Override
    public int getDirGLOB_EMEP() {
        return _hydemeta.getDirGLOB_EMEP();
    }

    /**
    * Sets the dir g l o b_ e m e p of this hydemeta.
    *
    * @param dirGLOB_EMEP the dir g l o b_ e m e p of this hydemeta
    */
    @Override
    public void setDirGLOB_EMEP(int dirGLOB_EMEP) {
        _hydemeta.setDirGLOB_EMEP(dirGLOB_EMEP);
    }

    /**
    * Returns the net_ e m e p of this hydemeta.
    *
    * @return the net_ e m e p of this hydemeta
    */
    @Override
    public int getNet_EMEP() {
        return _hydemeta.getNet_EMEP();
    }

    /**
    * Sets the net_ e m e p of this hydemeta.
    *
    * @param Net_EMEP the net_ e m e p of this hydemeta
    */
    @Override
    public void setNet_EMEP(int Net_EMEP) {
        _hydemeta.setNet_EMEP(Net_EMEP);
    }

    /**
    * Returns the r glob_ e m e p of this hydemeta.
    *
    * @return the r glob_ e m e p of this hydemeta
    */
    @Override
    public int getRGlob_EMEP() {
        return _hydemeta.getRGlob_EMEP();
    }

    /**
    * Sets the r glob_ e m e p of this hydemeta.
    *
    * @param RGlob_EMEP the r glob_ e m e p of this hydemeta
    */
    @Override
    public void setRGlob_EMEP(int RGlob_EMEP) {
        _hydemeta.setRGlob_EMEP(RGlob_EMEP);
    }

    /**
    * Returns the glob_ e m e p of this hydemeta.
    *
    * @return the glob_ e m e p of this hydemeta
    */
    @Override
    public int getGlob_EMEP() {
        return _hydemeta.getGlob_EMEP();
    }

    /**
    * Sets the glob_ e m e p of this hydemeta.
    *
    * @param Glob_EMEP the glob_ e m e p of this hydemeta
    */
    @Override
    public void setGlob_EMEP(int Glob_EMEP) {
        _hydemeta.setGlob_EMEP(Glob_EMEP);
    }

    /**
    * Returns the r p a r_ e m e p of this hydemeta.
    *
    * @return the r p a r_ e m e p of this hydemeta
    */
    @Override
    public int getRPAR_EMEP() {
        return _hydemeta.getRPAR_EMEP();
    }

    /**
    * Sets the r p a r_ e m e p of this hydemeta.
    *
    * @param RPAR_EMEP the r p a r_ e m e p of this hydemeta
    */
    @Override
    public void setRPAR_EMEP(int RPAR_EMEP) {
        _hydemeta.setRPAR_EMEP(RPAR_EMEP);
    }

    /**
    * Returns the p a r_ e m e p of this hydemeta.
    *
    * @return the p a r_ e m e p of this hydemeta
    */
    @Override
    public int getPAR_EMEP() {
        return _hydemeta.getPAR_EMEP();
    }

    /**
    * Sets the p a r_ e m e p of this hydemeta.
    *
    * @param PAR_EMEP the p a r_ e m e p of this hydemeta
    */
    @Override
    public void setPAR_EMEP(int PAR_EMEP) {
        _hydemeta.setPAR_EMEP(PAR_EMEP);
    }

    /**
    * Returns the dir p a r_ e m e p of this hydemeta.
    *
    * @return the dir p a r_ e m e p of this hydemeta
    */
    @Override
    public int getDirPAR_EMEP() {
        return _hydemeta.getDirPAR_EMEP();
    }

    /**
    * Sets the dir p a r_ e m e p of this hydemeta.
    *
    * @param dirPAR_EMEP the dir p a r_ e m e p of this hydemeta
    */
    @Override
    public void setDirPAR_EMEP(int dirPAR_EMEP) {
        _hydemeta.setDirPAR_EMEP(dirPAR_EMEP);
    }

    /**
    * Returns the can i r_ e m e p of this hydemeta.
    *
    * @return the can i r_ e m e p of this hydemeta
    */
    @Override
    public int getCanIR_EMEP() {
        return _hydemeta.getCanIR_EMEP();
    }

    /**
    * Sets the can i r_ e m e p of this hydemeta.
    *
    * @param canIR_EMEP the can i r_ e m e p of this hydemeta
    */
    @Override
    public void setCanIR_EMEP(int canIR_EMEP) {
        _hydemeta.setCanIR_EMEP(canIR_EMEP);
    }

    @Override
    public boolean isNew() {
        return _hydemeta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _hydemeta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _hydemeta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _hydemeta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _hydemeta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _hydemeta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _hydemeta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _hydemeta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _hydemeta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _hydemeta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _hydemeta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HydemetaWrapper((Hydemeta) _hydemeta.clone());
    }

    @Override
    public int compareTo(Hydemeta hydemeta) {
        return _hydemeta.compareTo(hydemeta);
    }

    @Override
    public int hashCode() {
        return _hydemeta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Hydemeta> toCacheModel() {
        return _hydemeta.toCacheModel();
    }

    @Override
    public Hydemeta toEscapedModel() {
        return new HydemetaWrapper(_hydemeta.toEscapedModel());
    }

    @Override
    public Hydemeta toUnescapedModel() {
        return new HydemetaWrapper(_hydemeta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _hydemeta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _hydemeta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _hydemeta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HydemetaWrapper)) {
            return false;
        }

        HydemetaWrapper hydemetaWrapper = (HydemetaWrapper) obj;

        if (Validator.equals(_hydemeta, hydemetaWrapper._hydemeta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Hydemeta getWrappedHydemeta() {
        return _hydemeta;
    }

    @Override
    public Hydemeta getWrappedModel() {
        return _hydemeta;
    }

    @Override
    public void resetOriginalValues() {
        _hydemeta.resetOriginalValues();
    }
}
