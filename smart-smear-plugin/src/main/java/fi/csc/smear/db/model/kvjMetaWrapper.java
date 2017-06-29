package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link kvjMeta}.
 * </p>
 *
 * @author pj
 * @see kvjMeta
 * @generated
 */
public class kvjMetaWrapper implements kvjMeta, ModelWrapper<kvjMeta> {
    private kvjMeta _kvjMeta;

    public kvjMetaWrapper(kvjMeta kvjMeta) {
        _kvjMeta = kvjMeta;
    }

    @Override
    public Class<?> getModelClass() {
        return kvjMeta.class;
    }

    @Override
    public String getModelClassName() {
        return kvjMeta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("Tw2", getTw2());
        attributes.put("Tw5", getTw5());
        attributes.put("Tw10", getTw10());
        attributes.put("Tw15", getTw15());
        attributes.put("Tw20", getTw20());
        attributes.put("Tw25", getTw25());
        attributes.put("Tw30", getTw30());
        attributes.put("Tw35", getTw35());
        attributes.put("Tw40", getTw40());
        attributes.put("Tw45", getTw45());
        attributes.put("Tw50", getTw50());
        attributes.put("Tw60", getTw60());
        attributes.put("Tw70", getTw70());
        attributes.put("Tw80", getTw80());
        attributes.put("Tw100", getTw100());
        attributes.put("Tw120", getTw120());
        attributes.put("CO2w02", getCO2w02());
        attributes.put("CO2w15", getCO2w15());
        attributes.put("CO2w25", getCO2w25());
        attributes.put("CO2w70", getCO2w70());
        attributes.put("Glob", getGlob());
        attributes.put("RGlob", getRGlob());
        attributes.put("LWin", getLWin());
        attributes.put("LWout", getLWout());
        attributes.put("PARw02", getPARw02());
        attributes.put("PARw07", getPARw07());
        attributes.put("PARw10", getPARw10());
        attributes.put("Ta", getTa());
        attributes.put("RH", getRH());
        attributes.put("Tw2_EMEP", getTw2_EMEP());
        attributes.put("Tw5_EMEP", getTw5_EMEP());
        attributes.put("Tw10_EMEP", getTw10_EMEP());
        attributes.put("Tw15_EMEP", getTw15_EMEP());
        attributes.put("Tw20_EMEP", getTw20_EMEP());
        attributes.put("Tw25_EMEP", getTw25_EMEP());
        attributes.put("Tw30_EMEP", getTw30_EMEP());
        attributes.put("Tw35_EMEP", getTw35_EMEP());
        attributes.put("Tw40_EMEP", getTw40_EMEP());
        attributes.put("Tw45_EMEP", getTw45_EMEP());
        attributes.put("Tw50_EMEP", getTw50_EMEP());
        attributes.put("Tw60_EMEP", getTw60_EMEP());
        attributes.put("Tw70_EMEP", getTw70_EMEP());
        attributes.put("Tw80_EMEP", getTw80_EMEP());
        attributes.put("Tw100_EMEP", getTw100_EMEP());
        attributes.put("Tw120_EMEP", getTw120_EMEP());
        attributes.put("CO2w02_EMEP", getCO2w02_EMEP());
        attributes.put("CO2w15_EMEP", getCO2w15_EMEP());
        attributes.put("CO2w25_EMEP", getCO2w25_EMEP());
        attributes.put("CO2w70_EMEP", getCO2w70_EMEP());
        attributes.put("Glob_EMEP", getGlob_EMEP());
        attributes.put("RGlob_EMEP", getRGlob_EMEP());
        attributes.put("LWin_EMEP", getLWin_EMEP());
        attributes.put("LWout_EMEP", getLWout_EMEP());
        attributes.put("PARw02_EMEP", getPARw02_EMEP());
        attributes.put("PARw07_EMEP", getPARw07_EMEP());
        attributes.put("PARw10_EMEP", getPARw10_EMEP());
        attributes.put("Ta_EMEP", getTa_EMEP());
        attributes.put("RH_EMEP", getRH_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float Tw2 = (Float) attributes.get("Tw2");

        if (Tw2 != null) {
            setTw2(Tw2);
        }

        Float Tw5 = (Float) attributes.get("Tw5");

        if (Tw5 != null) {
            setTw5(Tw5);
        }

        Float Tw10 = (Float) attributes.get("Tw10");

        if (Tw10 != null) {
            setTw10(Tw10);
        }

        Float Tw15 = (Float) attributes.get("Tw15");

        if (Tw15 != null) {
            setTw15(Tw15);
        }

        Float Tw20 = (Float) attributes.get("Tw20");

        if (Tw20 != null) {
            setTw20(Tw20);
        }

        Float Tw25 = (Float) attributes.get("Tw25");

        if (Tw25 != null) {
            setTw25(Tw25);
        }

        Float Tw30 = (Float) attributes.get("Tw30");

        if (Tw30 != null) {
            setTw30(Tw30);
        }

        Float Tw35 = (Float) attributes.get("Tw35");

        if (Tw35 != null) {
            setTw35(Tw35);
        }

        Float Tw40 = (Float) attributes.get("Tw40");

        if (Tw40 != null) {
            setTw40(Tw40);
        }

        Float Tw45 = (Float) attributes.get("Tw45");

        if (Tw45 != null) {
            setTw45(Tw45);
        }

        Float Tw50 = (Float) attributes.get("Tw50");

        if (Tw50 != null) {
            setTw50(Tw50);
        }

        Float Tw60 = (Float) attributes.get("Tw60");

        if (Tw60 != null) {
            setTw60(Tw60);
        }

        Float Tw70 = (Float) attributes.get("Tw70");

        if (Tw70 != null) {
            setTw70(Tw70);
        }

        Float Tw80 = (Float) attributes.get("Tw80");

        if (Tw80 != null) {
            setTw80(Tw80);
        }

        Float Tw100 = (Float) attributes.get("Tw100");

        if (Tw100 != null) {
            setTw100(Tw100);
        }

        Float Tw120 = (Float) attributes.get("Tw120");

        if (Tw120 != null) {
            setTw120(Tw120);
        }

        Float CO2w02 = (Float) attributes.get("CO2w02");

        if (CO2w02 != null) {
            setCO2w02(CO2w02);
        }

        Float CO2w15 = (Float) attributes.get("CO2w15");

        if (CO2w15 != null) {
            setCO2w15(CO2w15);
        }

        Float CO2w25 = (Float) attributes.get("CO2w25");

        if (CO2w25 != null) {
            setCO2w25(CO2w25);
        }

        Float CO2w70 = (Float) attributes.get("CO2w70");

        if (CO2w70 != null) {
            setCO2w70(CO2w70);
        }

        Float Glob = (Float) attributes.get("Glob");

        if (Glob != null) {
            setGlob(Glob);
        }

        Float RGlob = (Float) attributes.get("RGlob");

        if (RGlob != null) {
            setRGlob(RGlob);
        }

        Float LWin = (Float) attributes.get("LWin");

        if (LWin != null) {
            setLWin(LWin);
        }

        Float LWout = (Float) attributes.get("LWout");

        if (LWout != null) {
            setLWout(LWout);
        }

        Float PARw02 = (Float) attributes.get("PARw02");

        if (PARw02 != null) {
            setPARw02(PARw02);
        }

        Float PARw07 = (Float) attributes.get("PARw07");

        if (PARw07 != null) {
            setPARw07(PARw07);
        }

        Float PARw10 = (Float) attributes.get("PARw10");

        if (PARw10 != null) {
            setPARw10(PARw10);
        }

        Float Ta = (Float) attributes.get("Ta");

        if (Ta != null) {
            setTa(Ta);
        }

        Float RH = (Float) attributes.get("RH");

        if (RH != null) {
            setRH(RH);
        }

        Integer Tw2_EMEP = (Integer) attributes.get("Tw2_EMEP");

        if (Tw2_EMEP != null) {
            setTw2_EMEP(Tw2_EMEP);
        }

        Integer Tw5_EMEP = (Integer) attributes.get("Tw5_EMEP");

        if (Tw5_EMEP != null) {
            setTw5_EMEP(Tw5_EMEP);
        }

        Integer Tw10_EMEP = (Integer) attributes.get("Tw10_EMEP");

        if (Tw10_EMEP != null) {
            setTw10_EMEP(Tw10_EMEP);
        }

        Integer Tw15_EMEP = (Integer) attributes.get("Tw15_EMEP");

        if (Tw15_EMEP != null) {
            setTw15_EMEP(Tw15_EMEP);
        }

        Integer Tw20_EMEP = (Integer) attributes.get("Tw20_EMEP");

        if (Tw20_EMEP != null) {
            setTw20_EMEP(Tw20_EMEP);
        }

        Integer Tw25_EMEP = (Integer) attributes.get("Tw25_EMEP");

        if (Tw25_EMEP != null) {
            setTw25_EMEP(Tw25_EMEP);
        }

        Integer Tw30_EMEP = (Integer) attributes.get("Tw30_EMEP");

        if (Tw30_EMEP != null) {
            setTw30_EMEP(Tw30_EMEP);
        }

        Integer Tw35_EMEP = (Integer) attributes.get("Tw35_EMEP");

        if (Tw35_EMEP != null) {
            setTw35_EMEP(Tw35_EMEP);
        }

        Integer Tw40_EMEP = (Integer) attributes.get("Tw40_EMEP");

        if (Tw40_EMEP != null) {
            setTw40_EMEP(Tw40_EMEP);
        }

        Integer Tw45_EMEP = (Integer) attributes.get("Tw45_EMEP");

        if (Tw45_EMEP != null) {
            setTw45_EMEP(Tw45_EMEP);
        }

        Integer Tw50_EMEP = (Integer) attributes.get("Tw50_EMEP");

        if (Tw50_EMEP != null) {
            setTw50_EMEP(Tw50_EMEP);
        }

        Integer Tw60_EMEP = (Integer) attributes.get("Tw60_EMEP");

        if (Tw60_EMEP != null) {
            setTw60_EMEP(Tw60_EMEP);
        }

        Integer Tw70_EMEP = (Integer) attributes.get("Tw70_EMEP");

        if (Tw70_EMEP != null) {
            setTw70_EMEP(Tw70_EMEP);
        }

        Integer Tw80_EMEP = (Integer) attributes.get("Tw80_EMEP");

        if (Tw80_EMEP != null) {
            setTw80_EMEP(Tw80_EMEP);
        }

        Integer Tw100_EMEP = (Integer) attributes.get("Tw100_EMEP");

        if (Tw100_EMEP != null) {
            setTw100_EMEP(Tw100_EMEP);
        }

        Integer Tw120_EMEP = (Integer) attributes.get("Tw120_EMEP");

        if (Tw120_EMEP != null) {
            setTw120_EMEP(Tw120_EMEP);
        }

        Integer CO2w02_EMEP = (Integer) attributes.get("CO2w02_EMEP");

        if (CO2w02_EMEP != null) {
            setCO2w02_EMEP(CO2w02_EMEP);
        }

        Integer CO2w15_EMEP = (Integer) attributes.get("CO2w15_EMEP");

        if (CO2w15_EMEP != null) {
            setCO2w15_EMEP(CO2w15_EMEP);
        }

        Integer CO2w25_EMEP = (Integer) attributes.get("CO2w25_EMEP");

        if (CO2w25_EMEP != null) {
            setCO2w25_EMEP(CO2w25_EMEP);
        }

        Integer CO2w70_EMEP = (Integer) attributes.get("CO2w70_EMEP");

        if (CO2w70_EMEP != null) {
            setCO2w70_EMEP(CO2w70_EMEP);
        }

        Integer Glob_EMEP = (Integer) attributes.get("Glob_EMEP");

        if (Glob_EMEP != null) {
            setGlob_EMEP(Glob_EMEP);
        }

        Integer RGlob_EMEP = (Integer) attributes.get("RGlob_EMEP");

        if (RGlob_EMEP != null) {
            setRGlob_EMEP(RGlob_EMEP);
        }

        Integer LWin_EMEP = (Integer) attributes.get("LWin_EMEP");

        if (LWin_EMEP != null) {
            setLWin_EMEP(LWin_EMEP);
        }

        Integer LWout_EMEP = (Integer) attributes.get("LWout_EMEP");

        if (LWout_EMEP != null) {
            setLWout_EMEP(LWout_EMEP);
        }

        Integer PARw02_EMEP = (Integer) attributes.get("PARw02_EMEP");

        if (PARw02_EMEP != null) {
            setPARw02_EMEP(PARw02_EMEP);
        }

        Integer PARw07_EMEP = (Integer) attributes.get("PARw07_EMEP");

        if (PARw07_EMEP != null) {
            setPARw07_EMEP(PARw07_EMEP);
        }

        Integer PARw10_EMEP = (Integer) attributes.get("PARw10_EMEP");

        if (PARw10_EMEP != null) {
            setPARw10_EMEP(PARw10_EMEP);
        }

        Integer Ta_EMEP = (Integer) attributes.get("Ta_EMEP");

        if (Ta_EMEP != null) {
            setTa_EMEP(Ta_EMEP);
        }

        Integer RH_EMEP = (Integer) attributes.get("RH_EMEP");

        if (RH_EMEP != null) {
            setRH_EMEP(RH_EMEP);
        }
    }

    /**
    * Returns the primary key of this kvj meta.
    *
    * @return the primary key of this kvj meta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _kvjMeta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this kvj meta.
    *
    * @param primaryKey the primary key of this kvj meta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _kvjMeta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this kvj meta.
    *
    * @return the samptime of this kvj meta
    */
    @Override
    public java.util.Date getSamptime() {
        return _kvjMeta.getSamptime();
    }

    /**
    * Sets the samptime of this kvj meta.
    *
    * @param samptime the samptime of this kvj meta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _kvjMeta.setSamptime(samptime);
    }

    /**
    * Returns the tw2 of this kvj meta.
    *
    * @return the tw2 of this kvj meta
    */
    @Override
    public float getTw2() {
        return _kvjMeta.getTw2();
    }

    /**
    * Sets the tw2 of this kvj meta.
    *
    * @param Tw2 the tw2 of this kvj meta
    */
    @Override
    public void setTw2(float Tw2) {
        _kvjMeta.setTw2(Tw2);
    }

    /**
    * Returns the tw5 of this kvj meta.
    *
    * @return the tw5 of this kvj meta
    */
    @Override
    public float getTw5() {
        return _kvjMeta.getTw5();
    }

    /**
    * Sets the tw5 of this kvj meta.
    *
    * @param Tw5 the tw5 of this kvj meta
    */
    @Override
    public void setTw5(float Tw5) {
        _kvjMeta.setTw5(Tw5);
    }

    /**
    * Returns the tw10 of this kvj meta.
    *
    * @return the tw10 of this kvj meta
    */
    @Override
    public float getTw10() {
        return _kvjMeta.getTw10();
    }

    /**
    * Sets the tw10 of this kvj meta.
    *
    * @param Tw10 the tw10 of this kvj meta
    */
    @Override
    public void setTw10(float Tw10) {
        _kvjMeta.setTw10(Tw10);
    }

    /**
    * Returns the tw15 of this kvj meta.
    *
    * @return the tw15 of this kvj meta
    */
    @Override
    public float getTw15() {
        return _kvjMeta.getTw15();
    }

    /**
    * Sets the tw15 of this kvj meta.
    *
    * @param Tw15 the tw15 of this kvj meta
    */
    @Override
    public void setTw15(float Tw15) {
        _kvjMeta.setTw15(Tw15);
    }

    /**
    * Returns the tw20 of this kvj meta.
    *
    * @return the tw20 of this kvj meta
    */
    @Override
    public float getTw20() {
        return _kvjMeta.getTw20();
    }

    /**
    * Sets the tw20 of this kvj meta.
    *
    * @param Tw20 the tw20 of this kvj meta
    */
    @Override
    public void setTw20(float Tw20) {
        _kvjMeta.setTw20(Tw20);
    }

    /**
    * Returns the tw25 of this kvj meta.
    *
    * @return the tw25 of this kvj meta
    */
    @Override
    public float getTw25() {
        return _kvjMeta.getTw25();
    }

    /**
    * Sets the tw25 of this kvj meta.
    *
    * @param Tw25 the tw25 of this kvj meta
    */
    @Override
    public void setTw25(float Tw25) {
        _kvjMeta.setTw25(Tw25);
    }

    /**
    * Returns the tw30 of this kvj meta.
    *
    * @return the tw30 of this kvj meta
    */
    @Override
    public float getTw30() {
        return _kvjMeta.getTw30();
    }

    /**
    * Sets the tw30 of this kvj meta.
    *
    * @param Tw30 the tw30 of this kvj meta
    */
    @Override
    public void setTw30(float Tw30) {
        _kvjMeta.setTw30(Tw30);
    }

    /**
    * Returns the tw35 of this kvj meta.
    *
    * @return the tw35 of this kvj meta
    */
    @Override
    public float getTw35() {
        return _kvjMeta.getTw35();
    }

    /**
    * Sets the tw35 of this kvj meta.
    *
    * @param Tw35 the tw35 of this kvj meta
    */
    @Override
    public void setTw35(float Tw35) {
        _kvjMeta.setTw35(Tw35);
    }

    /**
    * Returns the tw40 of this kvj meta.
    *
    * @return the tw40 of this kvj meta
    */
    @Override
    public float getTw40() {
        return _kvjMeta.getTw40();
    }

    /**
    * Sets the tw40 of this kvj meta.
    *
    * @param Tw40 the tw40 of this kvj meta
    */
    @Override
    public void setTw40(float Tw40) {
        _kvjMeta.setTw40(Tw40);
    }

    /**
    * Returns the tw45 of this kvj meta.
    *
    * @return the tw45 of this kvj meta
    */
    @Override
    public float getTw45() {
        return _kvjMeta.getTw45();
    }

    /**
    * Sets the tw45 of this kvj meta.
    *
    * @param Tw45 the tw45 of this kvj meta
    */
    @Override
    public void setTw45(float Tw45) {
        _kvjMeta.setTw45(Tw45);
    }

    /**
    * Returns the tw50 of this kvj meta.
    *
    * @return the tw50 of this kvj meta
    */
    @Override
    public float getTw50() {
        return _kvjMeta.getTw50();
    }

    /**
    * Sets the tw50 of this kvj meta.
    *
    * @param Tw50 the tw50 of this kvj meta
    */
    @Override
    public void setTw50(float Tw50) {
        _kvjMeta.setTw50(Tw50);
    }

    /**
    * Returns the tw60 of this kvj meta.
    *
    * @return the tw60 of this kvj meta
    */
    @Override
    public float getTw60() {
        return _kvjMeta.getTw60();
    }

    /**
    * Sets the tw60 of this kvj meta.
    *
    * @param Tw60 the tw60 of this kvj meta
    */
    @Override
    public void setTw60(float Tw60) {
        _kvjMeta.setTw60(Tw60);
    }

    /**
    * Returns the tw70 of this kvj meta.
    *
    * @return the tw70 of this kvj meta
    */
    @Override
    public float getTw70() {
        return _kvjMeta.getTw70();
    }

    /**
    * Sets the tw70 of this kvj meta.
    *
    * @param Tw70 the tw70 of this kvj meta
    */
    @Override
    public void setTw70(float Tw70) {
        _kvjMeta.setTw70(Tw70);
    }

    /**
    * Returns the tw80 of this kvj meta.
    *
    * @return the tw80 of this kvj meta
    */
    @Override
    public float getTw80() {
        return _kvjMeta.getTw80();
    }

    /**
    * Sets the tw80 of this kvj meta.
    *
    * @param Tw80 the tw80 of this kvj meta
    */
    @Override
    public void setTw80(float Tw80) {
        _kvjMeta.setTw80(Tw80);
    }

    /**
    * Returns the tw100 of this kvj meta.
    *
    * @return the tw100 of this kvj meta
    */
    @Override
    public float getTw100() {
        return _kvjMeta.getTw100();
    }

    /**
    * Sets the tw100 of this kvj meta.
    *
    * @param Tw100 the tw100 of this kvj meta
    */
    @Override
    public void setTw100(float Tw100) {
        _kvjMeta.setTw100(Tw100);
    }

    /**
    * Returns the tw120 of this kvj meta.
    *
    * @return the tw120 of this kvj meta
    */
    @Override
    public float getTw120() {
        return _kvjMeta.getTw120();
    }

    /**
    * Sets the tw120 of this kvj meta.
    *
    * @param Tw120 the tw120 of this kvj meta
    */
    @Override
    public void setTw120(float Tw120) {
        _kvjMeta.setTw120(Tw120);
    }

    /**
    * Returns the c o2w02 of this kvj meta.
    *
    * @return the c o2w02 of this kvj meta
    */
    @Override
    public float getCO2w02() {
        return _kvjMeta.getCO2w02();
    }

    /**
    * Sets the c o2w02 of this kvj meta.
    *
    * @param CO2w02 the c o2w02 of this kvj meta
    */
    @Override
    public void setCO2w02(float CO2w02) {
        _kvjMeta.setCO2w02(CO2w02);
    }

    /**
    * Returns the c o2w15 of this kvj meta.
    *
    * @return the c o2w15 of this kvj meta
    */
    @Override
    public float getCO2w15() {
        return _kvjMeta.getCO2w15();
    }

    /**
    * Sets the c o2w15 of this kvj meta.
    *
    * @param CO2w15 the c o2w15 of this kvj meta
    */
    @Override
    public void setCO2w15(float CO2w15) {
        _kvjMeta.setCO2w15(CO2w15);
    }

    /**
    * Returns the c o2w25 of this kvj meta.
    *
    * @return the c o2w25 of this kvj meta
    */
    @Override
    public float getCO2w25() {
        return _kvjMeta.getCO2w25();
    }

    /**
    * Sets the c o2w25 of this kvj meta.
    *
    * @param CO2w25 the c o2w25 of this kvj meta
    */
    @Override
    public void setCO2w25(float CO2w25) {
        _kvjMeta.setCO2w25(CO2w25);
    }

    /**
    * Returns the c o2w70 of this kvj meta.
    *
    * @return the c o2w70 of this kvj meta
    */
    @Override
    public float getCO2w70() {
        return _kvjMeta.getCO2w70();
    }

    /**
    * Sets the c o2w70 of this kvj meta.
    *
    * @param CO2w70 the c o2w70 of this kvj meta
    */
    @Override
    public void setCO2w70(float CO2w70) {
        _kvjMeta.setCO2w70(CO2w70);
    }

    /**
    * Returns the glob of this kvj meta.
    *
    * @return the glob of this kvj meta
    */
    @Override
    public float getGlob() {
        return _kvjMeta.getGlob();
    }

    /**
    * Sets the glob of this kvj meta.
    *
    * @param Glob the glob of this kvj meta
    */
    @Override
    public void setGlob(float Glob) {
        _kvjMeta.setGlob(Glob);
    }

    /**
    * Returns the r glob of this kvj meta.
    *
    * @return the r glob of this kvj meta
    */
    @Override
    public float getRGlob() {
        return _kvjMeta.getRGlob();
    }

    /**
    * Sets the r glob of this kvj meta.
    *
    * @param RGlob the r glob of this kvj meta
    */
    @Override
    public void setRGlob(float RGlob) {
        _kvjMeta.setRGlob(RGlob);
    }

    /**
    * Returns the l win of this kvj meta.
    *
    * @return the l win of this kvj meta
    */
    @Override
    public float getLWin() {
        return _kvjMeta.getLWin();
    }

    /**
    * Sets the l win of this kvj meta.
    *
    * @param LWin the l win of this kvj meta
    */
    @Override
    public void setLWin(float LWin) {
        _kvjMeta.setLWin(LWin);
    }

    /**
    * Returns the l wout of this kvj meta.
    *
    * @return the l wout of this kvj meta
    */
    @Override
    public float getLWout() {
        return _kvjMeta.getLWout();
    }

    /**
    * Sets the l wout of this kvj meta.
    *
    * @param LWout the l wout of this kvj meta
    */
    @Override
    public void setLWout(float LWout) {
        _kvjMeta.setLWout(LWout);
    }

    /**
    * Returns the p a rw02 of this kvj meta.
    *
    * @return the p a rw02 of this kvj meta
    */
    @Override
    public float getPARw02() {
        return _kvjMeta.getPARw02();
    }

    /**
    * Sets the p a rw02 of this kvj meta.
    *
    * @param PARw02 the p a rw02 of this kvj meta
    */
    @Override
    public void setPARw02(float PARw02) {
        _kvjMeta.setPARw02(PARw02);
    }

    /**
    * Returns the p a rw07 of this kvj meta.
    *
    * @return the p a rw07 of this kvj meta
    */
    @Override
    public float getPARw07() {
        return _kvjMeta.getPARw07();
    }

    /**
    * Sets the p a rw07 of this kvj meta.
    *
    * @param PARw07 the p a rw07 of this kvj meta
    */
    @Override
    public void setPARw07(float PARw07) {
        _kvjMeta.setPARw07(PARw07);
    }

    /**
    * Returns the p a rw10 of this kvj meta.
    *
    * @return the p a rw10 of this kvj meta
    */
    @Override
    public float getPARw10() {
        return _kvjMeta.getPARw10();
    }

    /**
    * Sets the p a rw10 of this kvj meta.
    *
    * @param PARw10 the p a rw10 of this kvj meta
    */
    @Override
    public void setPARw10(float PARw10) {
        _kvjMeta.setPARw10(PARw10);
    }

    /**
    * Returns the ta of this kvj meta.
    *
    * @return the ta of this kvj meta
    */
    @Override
    public float getTa() {
        return _kvjMeta.getTa();
    }

    /**
    * Sets the ta of this kvj meta.
    *
    * @param Ta the ta of this kvj meta
    */
    @Override
    public void setTa(float Ta) {
        _kvjMeta.setTa(Ta);
    }

    /**
    * Returns the r h of this kvj meta.
    *
    * @return the r h of this kvj meta
    */
    @Override
    public float getRH() {
        return _kvjMeta.getRH();
    }

    /**
    * Sets the r h of this kvj meta.
    *
    * @param RH the r h of this kvj meta
    */
    @Override
    public void setRH(float RH) {
        _kvjMeta.setRH(RH);
    }

    /**
    * Returns the tw2_ e m e p of this kvj meta.
    *
    * @return the tw2_ e m e p of this kvj meta
    */
    @Override
    public int getTw2_EMEP() {
        return _kvjMeta.getTw2_EMEP();
    }

    /**
    * Sets the tw2_ e m e p of this kvj meta.
    *
    * @param Tw2_EMEP the tw2_ e m e p of this kvj meta
    */
    @Override
    public void setTw2_EMEP(int Tw2_EMEP) {
        _kvjMeta.setTw2_EMEP(Tw2_EMEP);
    }

    /**
    * Returns the tw5_ e m e p of this kvj meta.
    *
    * @return the tw5_ e m e p of this kvj meta
    */
    @Override
    public int getTw5_EMEP() {
        return _kvjMeta.getTw5_EMEP();
    }

    /**
    * Sets the tw5_ e m e p of this kvj meta.
    *
    * @param Tw5_EMEP the tw5_ e m e p of this kvj meta
    */
    @Override
    public void setTw5_EMEP(int Tw5_EMEP) {
        _kvjMeta.setTw5_EMEP(Tw5_EMEP);
    }

    /**
    * Returns the tw10_ e m e p of this kvj meta.
    *
    * @return the tw10_ e m e p of this kvj meta
    */
    @Override
    public int getTw10_EMEP() {
        return _kvjMeta.getTw10_EMEP();
    }

    /**
    * Sets the tw10_ e m e p of this kvj meta.
    *
    * @param Tw10_EMEP the tw10_ e m e p of this kvj meta
    */
    @Override
    public void setTw10_EMEP(int Tw10_EMEP) {
        _kvjMeta.setTw10_EMEP(Tw10_EMEP);
    }

    /**
    * Returns the tw15_ e m e p of this kvj meta.
    *
    * @return the tw15_ e m e p of this kvj meta
    */
    @Override
    public int getTw15_EMEP() {
        return _kvjMeta.getTw15_EMEP();
    }

    /**
    * Sets the tw15_ e m e p of this kvj meta.
    *
    * @param Tw15_EMEP the tw15_ e m e p of this kvj meta
    */
    @Override
    public void setTw15_EMEP(int Tw15_EMEP) {
        _kvjMeta.setTw15_EMEP(Tw15_EMEP);
    }

    /**
    * Returns the tw20_ e m e p of this kvj meta.
    *
    * @return the tw20_ e m e p of this kvj meta
    */
    @Override
    public int getTw20_EMEP() {
        return _kvjMeta.getTw20_EMEP();
    }

    /**
    * Sets the tw20_ e m e p of this kvj meta.
    *
    * @param Tw20_EMEP the tw20_ e m e p of this kvj meta
    */
    @Override
    public void setTw20_EMEP(int Tw20_EMEP) {
        _kvjMeta.setTw20_EMEP(Tw20_EMEP);
    }

    /**
    * Returns the tw25_ e m e p of this kvj meta.
    *
    * @return the tw25_ e m e p of this kvj meta
    */
    @Override
    public int getTw25_EMEP() {
        return _kvjMeta.getTw25_EMEP();
    }

    /**
    * Sets the tw25_ e m e p of this kvj meta.
    *
    * @param Tw25_EMEP the tw25_ e m e p of this kvj meta
    */
    @Override
    public void setTw25_EMEP(int Tw25_EMEP) {
        _kvjMeta.setTw25_EMEP(Tw25_EMEP);
    }

    /**
    * Returns the tw30_ e m e p of this kvj meta.
    *
    * @return the tw30_ e m e p of this kvj meta
    */
    @Override
    public int getTw30_EMEP() {
        return _kvjMeta.getTw30_EMEP();
    }

    /**
    * Sets the tw30_ e m e p of this kvj meta.
    *
    * @param Tw30_EMEP the tw30_ e m e p of this kvj meta
    */
    @Override
    public void setTw30_EMEP(int Tw30_EMEP) {
        _kvjMeta.setTw30_EMEP(Tw30_EMEP);
    }

    /**
    * Returns the tw35_ e m e p of this kvj meta.
    *
    * @return the tw35_ e m e p of this kvj meta
    */
    @Override
    public int getTw35_EMEP() {
        return _kvjMeta.getTw35_EMEP();
    }

    /**
    * Sets the tw35_ e m e p of this kvj meta.
    *
    * @param Tw35_EMEP the tw35_ e m e p of this kvj meta
    */
    @Override
    public void setTw35_EMEP(int Tw35_EMEP) {
        _kvjMeta.setTw35_EMEP(Tw35_EMEP);
    }

    /**
    * Returns the tw40_ e m e p of this kvj meta.
    *
    * @return the tw40_ e m e p of this kvj meta
    */
    @Override
    public int getTw40_EMEP() {
        return _kvjMeta.getTw40_EMEP();
    }

    /**
    * Sets the tw40_ e m e p of this kvj meta.
    *
    * @param Tw40_EMEP the tw40_ e m e p of this kvj meta
    */
    @Override
    public void setTw40_EMEP(int Tw40_EMEP) {
        _kvjMeta.setTw40_EMEP(Tw40_EMEP);
    }

    /**
    * Returns the tw45_ e m e p of this kvj meta.
    *
    * @return the tw45_ e m e p of this kvj meta
    */
    @Override
    public int getTw45_EMEP() {
        return _kvjMeta.getTw45_EMEP();
    }

    /**
    * Sets the tw45_ e m e p of this kvj meta.
    *
    * @param Tw45_EMEP the tw45_ e m e p of this kvj meta
    */
    @Override
    public void setTw45_EMEP(int Tw45_EMEP) {
        _kvjMeta.setTw45_EMEP(Tw45_EMEP);
    }

    /**
    * Returns the tw50_ e m e p of this kvj meta.
    *
    * @return the tw50_ e m e p of this kvj meta
    */
    @Override
    public int getTw50_EMEP() {
        return _kvjMeta.getTw50_EMEP();
    }

    /**
    * Sets the tw50_ e m e p of this kvj meta.
    *
    * @param Tw50_EMEP the tw50_ e m e p of this kvj meta
    */
    @Override
    public void setTw50_EMEP(int Tw50_EMEP) {
        _kvjMeta.setTw50_EMEP(Tw50_EMEP);
    }

    /**
    * Returns the tw60_ e m e p of this kvj meta.
    *
    * @return the tw60_ e m e p of this kvj meta
    */
    @Override
    public int getTw60_EMEP() {
        return _kvjMeta.getTw60_EMEP();
    }

    /**
    * Sets the tw60_ e m e p of this kvj meta.
    *
    * @param Tw60_EMEP the tw60_ e m e p of this kvj meta
    */
    @Override
    public void setTw60_EMEP(int Tw60_EMEP) {
        _kvjMeta.setTw60_EMEP(Tw60_EMEP);
    }

    /**
    * Returns the tw70_ e m e p of this kvj meta.
    *
    * @return the tw70_ e m e p of this kvj meta
    */
    @Override
    public int getTw70_EMEP() {
        return _kvjMeta.getTw70_EMEP();
    }

    /**
    * Sets the tw70_ e m e p of this kvj meta.
    *
    * @param Tw70_EMEP the tw70_ e m e p of this kvj meta
    */
    @Override
    public void setTw70_EMEP(int Tw70_EMEP) {
        _kvjMeta.setTw70_EMEP(Tw70_EMEP);
    }

    /**
    * Returns the tw80_ e m e p of this kvj meta.
    *
    * @return the tw80_ e m e p of this kvj meta
    */
    @Override
    public int getTw80_EMEP() {
        return _kvjMeta.getTw80_EMEP();
    }

    /**
    * Sets the tw80_ e m e p of this kvj meta.
    *
    * @param Tw80_EMEP the tw80_ e m e p of this kvj meta
    */
    @Override
    public void setTw80_EMEP(int Tw80_EMEP) {
        _kvjMeta.setTw80_EMEP(Tw80_EMEP);
    }

    /**
    * Returns the tw100_ e m e p of this kvj meta.
    *
    * @return the tw100_ e m e p of this kvj meta
    */
    @Override
    public int getTw100_EMEP() {
        return _kvjMeta.getTw100_EMEP();
    }

    /**
    * Sets the tw100_ e m e p of this kvj meta.
    *
    * @param Tw100_EMEP the tw100_ e m e p of this kvj meta
    */
    @Override
    public void setTw100_EMEP(int Tw100_EMEP) {
        _kvjMeta.setTw100_EMEP(Tw100_EMEP);
    }

    /**
    * Returns the tw120_ e m e p of this kvj meta.
    *
    * @return the tw120_ e m e p of this kvj meta
    */
    @Override
    public int getTw120_EMEP() {
        return _kvjMeta.getTw120_EMEP();
    }

    /**
    * Sets the tw120_ e m e p of this kvj meta.
    *
    * @param Tw120_EMEP the tw120_ e m e p of this kvj meta
    */
    @Override
    public void setTw120_EMEP(int Tw120_EMEP) {
        _kvjMeta.setTw120_EMEP(Tw120_EMEP);
    }

    /**
    * Returns the c o2w02_ e m e p of this kvj meta.
    *
    * @return the c o2w02_ e m e p of this kvj meta
    */
    @Override
    public int getCO2w02_EMEP() {
        return _kvjMeta.getCO2w02_EMEP();
    }

    /**
    * Sets the c o2w02_ e m e p of this kvj meta.
    *
    * @param CO2w02_EMEP the c o2w02_ e m e p of this kvj meta
    */
    @Override
    public void setCO2w02_EMEP(int CO2w02_EMEP) {
        _kvjMeta.setCO2w02_EMEP(CO2w02_EMEP);
    }

    /**
    * Returns the c o2w15_ e m e p of this kvj meta.
    *
    * @return the c o2w15_ e m e p of this kvj meta
    */
    @Override
    public int getCO2w15_EMEP() {
        return _kvjMeta.getCO2w15_EMEP();
    }

    /**
    * Sets the c o2w15_ e m e p of this kvj meta.
    *
    * @param CO2w15_EMEP the c o2w15_ e m e p of this kvj meta
    */
    @Override
    public void setCO2w15_EMEP(int CO2w15_EMEP) {
        _kvjMeta.setCO2w15_EMEP(CO2w15_EMEP);
    }

    /**
    * Returns the c o2w25_ e m e p of this kvj meta.
    *
    * @return the c o2w25_ e m e p of this kvj meta
    */
    @Override
    public int getCO2w25_EMEP() {
        return _kvjMeta.getCO2w25_EMEP();
    }

    /**
    * Sets the c o2w25_ e m e p of this kvj meta.
    *
    * @param CO2w25_EMEP the c o2w25_ e m e p of this kvj meta
    */
    @Override
    public void setCO2w25_EMEP(int CO2w25_EMEP) {
        _kvjMeta.setCO2w25_EMEP(CO2w25_EMEP);
    }

    /**
    * Returns the c o2w70_ e m e p of this kvj meta.
    *
    * @return the c o2w70_ e m e p of this kvj meta
    */
    @Override
    public int getCO2w70_EMEP() {
        return _kvjMeta.getCO2w70_EMEP();
    }

    /**
    * Sets the c o2w70_ e m e p of this kvj meta.
    *
    * @param CO2w70_EMEP the c o2w70_ e m e p of this kvj meta
    */
    @Override
    public void setCO2w70_EMEP(int CO2w70_EMEP) {
        _kvjMeta.setCO2w70_EMEP(CO2w70_EMEP);
    }

    /**
    * Returns the glob_ e m e p of this kvj meta.
    *
    * @return the glob_ e m e p of this kvj meta
    */
    @Override
    public int getGlob_EMEP() {
        return _kvjMeta.getGlob_EMEP();
    }

    /**
    * Sets the glob_ e m e p of this kvj meta.
    *
    * @param Glob_EMEP the glob_ e m e p of this kvj meta
    */
    @Override
    public void setGlob_EMEP(int Glob_EMEP) {
        _kvjMeta.setGlob_EMEP(Glob_EMEP);
    }

    /**
    * Returns the r glob_ e m e p of this kvj meta.
    *
    * @return the r glob_ e m e p of this kvj meta
    */
    @Override
    public int getRGlob_EMEP() {
        return _kvjMeta.getRGlob_EMEP();
    }

    /**
    * Sets the r glob_ e m e p of this kvj meta.
    *
    * @param RGlob_EMEP the r glob_ e m e p of this kvj meta
    */
    @Override
    public void setRGlob_EMEP(int RGlob_EMEP) {
        _kvjMeta.setRGlob_EMEP(RGlob_EMEP);
    }

    /**
    * Returns the l win_ e m e p of this kvj meta.
    *
    * @return the l win_ e m e p of this kvj meta
    */
    @Override
    public int getLWin_EMEP() {
        return _kvjMeta.getLWin_EMEP();
    }

    /**
    * Sets the l win_ e m e p of this kvj meta.
    *
    * @param LWin_EMEP the l win_ e m e p of this kvj meta
    */
    @Override
    public void setLWin_EMEP(int LWin_EMEP) {
        _kvjMeta.setLWin_EMEP(LWin_EMEP);
    }

    /**
    * Returns the l wout_ e m e p of this kvj meta.
    *
    * @return the l wout_ e m e p of this kvj meta
    */
    @Override
    public int getLWout_EMEP() {
        return _kvjMeta.getLWout_EMEP();
    }

    /**
    * Sets the l wout_ e m e p of this kvj meta.
    *
    * @param LWout_EMEP the l wout_ e m e p of this kvj meta
    */
    @Override
    public void setLWout_EMEP(int LWout_EMEP) {
        _kvjMeta.setLWout_EMEP(LWout_EMEP);
    }

    /**
    * Returns the p a rw02_ e m e p of this kvj meta.
    *
    * @return the p a rw02_ e m e p of this kvj meta
    */
    @Override
    public int getPARw02_EMEP() {
        return _kvjMeta.getPARw02_EMEP();
    }

    /**
    * Sets the p a rw02_ e m e p of this kvj meta.
    *
    * @param PARw02_EMEP the p a rw02_ e m e p of this kvj meta
    */
    @Override
    public void setPARw02_EMEP(int PARw02_EMEP) {
        _kvjMeta.setPARw02_EMEP(PARw02_EMEP);
    }

    /**
    * Returns the p a rw07_ e m e p of this kvj meta.
    *
    * @return the p a rw07_ e m e p of this kvj meta
    */
    @Override
    public int getPARw07_EMEP() {
        return _kvjMeta.getPARw07_EMEP();
    }

    /**
    * Sets the p a rw07_ e m e p of this kvj meta.
    *
    * @param PARw07_EMEP the p a rw07_ e m e p of this kvj meta
    */
    @Override
    public void setPARw07_EMEP(int PARw07_EMEP) {
        _kvjMeta.setPARw07_EMEP(PARw07_EMEP);
    }

    /**
    * Returns the p a rw10_ e m e p of this kvj meta.
    *
    * @return the p a rw10_ e m e p of this kvj meta
    */
    @Override
    public int getPARw10_EMEP() {
        return _kvjMeta.getPARw10_EMEP();
    }

    /**
    * Sets the p a rw10_ e m e p of this kvj meta.
    *
    * @param PARw10_EMEP the p a rw10_ e m e p of this kvj meta
    */
    @Override
    public void setPARw10_EMEP(int PARw10_EMEP) {
        _kvjMeta.setPARw10_EMEP(PARw10_EMEP);
    }

    /**
    * Returns the ta_ e m e p of this kvj meta.
    *
    * @return the ta_ e m e p of this kvj meta
    */
    @Override
    public int getTa_EMEP() {
        return _kvjMeta.getTa_EMEP();
    }

    /**
    * Sets the ta_ e m e p of this kvj meta.
    *
    * @param Ta_EMEP the ta_ e m e p of this kvj meta
    */
    @Override
    public void setTa_EMEP(int Ta_EMEP) {
        _kvjMeta.setTa_EMEP(Ta_EMEP);
    }

    /**
    * Returns the r h_ e m e p of this kvj meta.
    *
    * @return the r h_ e m e p of this kvj meta
    */
    @Override
    public int getRH_EMEP() {
        return _kvjMeta.getRH_EMEP();
    }

    /**
    * Sets the r h_ e m e p of this kvj meta.
    *
    * @param RH_EMEP the r h_ e m e p of this kvj meta
    */
    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _kvjMeta.setRH_EMEP(RH_EMEP);
    }

    @Override
    public boolean isNew() {
        return _kvjMeta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _kvjMeta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _kvjMeta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _kvjMeta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _kvjMeta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _kvjMeta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _kvjMeta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _kvjMeta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _kvjMeta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _kvjMeta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _kvjMeta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new kvjMetaWrapper((kvjMeta) _kvjMeta.clone());
    }

    @Override
    public int compareTo(fi.csc.smear.db.model.kvjMeta kvjMeta) {
        return _kvjMeta.compareTo(kvjMeta);
    }

    @Override
    public int hashCode() {
        return _kvjMeta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.smear.db.model.kvjMeta> toCacheModel() {
        return _kvjMeta.toCacheModel();
    }

    @Override
    public fi.csc.smear.db.model.kvjMeta toEscapedModel() {
        return new kvjMetaWrapper(_kvjMeta.toEscapedModel());
    }

    @Override
    public fi.csc.smear.db.model.kvjMeta toUnescapedModel() {
        return new kvjMetaWrapper(_kvjMeta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _kvjMeta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _kvjMeta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _kvjMeta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof kvjMetaWrapper)) {
            return false;
        }

        kvjMetaWrapper kvjMetaWrapper = (kvjMetaWrapper) obj;

        if (Validator.equals(_kvjMeta, kvjMetaWrapper._kvjMeta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public kvjMeta getWrappedkvjMeta() {
        return _kvjMeta;
    }

    @Override
    public kvjMeta getWrappedModel() {
        return _kvjMeta;
    }

    @Override
    public void resetOriginalValues() {
        _kvjMeta.resetOriginalValues();
    }
}
