package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sii1meta}.
 * </p>
 *
 * @author pj
 * @see Sii1meta
 * @generated
 */
public class Sii1metaWrapper implements Sii1meta, ModelWrapper<Sii1meta> {
    private Sii1meta _sii1meta;

    public Sii1metaWrapper(Sii1meta sii1meta) {
        _sii1meta = sii1meta;
    }

    @Override
    public Class<?> getModelClass() {
        return Sii1meta.class;
    }

    @Override
    public String getModelClassName() {
        return Sii1meta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("T_a", getT_a());
        attributes.put("T_a_EMEP", getT_a_EMEP());
        attributes.put("RH", getRH());
        attributes.put("RH_EMEP", getRH_EMEP());
        attributes.put("PAR", getPAR());
        attributes.put("PAR_EMEP", getPAR_EMEP());
        attributes.put("R_PAR", getR_PAR());
        attributes.put("R_PAR_EMEP", getR_PAR_EMEP());
        attributes.put("Net_CNR4", getNet_CNR4());
        attributes.put("Net_CNR4_EMEP", getNet_CNR4_EMEP());
        attributes.put("Net_NRLite", getNet_NRLite());
        attributes.put("Net_NRLite_EMEP", getNet_NRLite_EMEP());
        attributes.put("Wsoil_1", getWsoil_1());
        attributes.put("Wsoil_1_EMEP", getWsoil_1_EMEP());
        attributes.put("Wsoil_2", getWsoil_2());
        attributes.put("Wsoil_2_EMEP", getWsoil_2_EMEP());
        attributes.put("T_p_B5", getT_p_B5());
        attributes.put("T_p_B5_EMEP", getT_p_B5_EMEP());
        attributes.put("T_p_B20", getT_p_B20());
        attributes.put("T_p_B20_EMEP", getT_p_B20_EMEP());
        attributes.put("T_p_B35", getT_p_B35());
        attributes.put("T_p_B35_EMEP", getT_p_B35_EMEP());
        attributes.put("T_p_B50", getT_p_B50());
        attributes.put("T_p_B50_EMEP", getT_p_B50_EMEP());
        attributes.put("T_p_C1", getT_p_C1());
        attributes.put("T_p_C1_EMEP", getT_p_C1_EMEP());
        attributes.put("T_p_C2", getT_p_C2());
        attributes.put("T_p_C2_EMEP", getT_p_C2_EMEP());
        attributes.put("T_p_C5", getT_p_C5());
        attributes.put("T_p_C5_EMEP", getT_p_C5_EMEP());
        attributes.put("T_p_C10", getT_p_C10());
        attributes.put("T_p_C10_EMEP", getT_p_C10_EMEP());
        attributes.put("T_p_C15", getT_p_C15());
        attributes.put("T_p_C15_EMEP", getT_p_C15_EMEP());
        attributes.put("T_p_C20", getT_p_C20());
        attributes.put("T_p_C20_EMEP", getT_p_C20_EMEP());
        attributes.put("T_p_C30", getT_p_C30());
        attributes.put("T_p_C30_EMEP", getT_p_C30_EMEP());
        attributes.put("T_p_C50", getT_p_C50());
        attributes.put("T_p_C50_EMEP", getT_p_C50_EMEP());
        attributes.put("T_p_C70", getT_p_C70());
        attributes.put("T_p_C70_EMEP", getT_p_C70_EMEP());
        attributes.put("T_p_C100", getT_p_C100());
        attributes.put("T_p_C100_EMEP", getT_p_C100_EMEP());
        attributes.put("WTD", getWTD());
        attributes.put("WTD_EMEP", getWTD_EMEP());
        attributes.put("Precip", getPrecip());
        attributes.put("Precip_EMEP", getPrecip_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float T_a = (Float) attributes.get("T_a");

        if (T_a != null) {
            setT_a(T_a);
        }

        Integer T_a_EMEP = (Integer) attributes.get("T_a_EMEP");

        if (T_a_EMEP != null) {
            setT_a_EMEP(T_a_EMEP);
        }

        Float RH = (Float) attributes.get("RH");

        if (RH != null) {
            setRH(RH);
        }

        Integer RH_EMEP = (Integer) attributes.get("RH_EMEP");

        if (RH_EMEP != null) {
            setRH_EMEP(RH_EMEP);
        }

        Float PAR = (Float) attributes.get("PAR");

        if (PAR != null) {
            setPAR(PAR);
        }

        Integer PAR_EMEP = (Integer) attributes.get("PAR_EMEP");

        if (PAR_EMEP != null) {
            setPAR_EMEP(PAR_EMEP);
        }

        Float R_PAR = (Float) attributes.get("R_PAR");

        if (R_PAR != null) {
            setR_PAR(R_PAR);
        }

        Integer R_PAR_EMEP = (Integer) attributes.get("R_PAR_EMEP");

        if (R_PAR_EMEP != null) {
            setR_PAR_EMEP(R_PAR_EMEP);
        }

        Float Net_CNR4 = (Float) attributes.get("Net_CNR4");

        if (Net_CNR4 != null) {
            setNet_CNR4(Net_CNR4);
        }

        Integer Net_CNR4_EMEP = (Integer) attributes.get("Net_CNR4_EMEP");

        if (Net_CNR4_EMEP != null) {
            setNet_CNR4_EMEP(Net_CNR4_EMEP);
        }

        Float Net_NRLite = (Float) attributes.get("Net_NRLite");

        if (Net_NRLite != null) {
            setNet_NRLite(Net_NRLite);
        }

        Integer Net_NRLite_EMEP = (Integer) attributes.get("Net_NRLite_EMEP");

        if (Net_NRLite_EMEP != null) {
            setNet_NRLite_EMEP(Net_NRLite_EMEP);
        }

        Float Wsoil_1 = (Float) attributes.get("Wsoil_1");

        if (Wsoil_1 != null) {
            setWsoil_1(Wsoil_1);
        }

        Integer Wsoil_1_EMEP = (Integer) attributes.get("Wsoil_1_EMEP");

        if (Wsoil_1_EMEP != null) {
            setWsoil_1_EMEP(Wsoil_1_EMEP);
        }

        Float Wsoil_2 = (Float) attributes.get("Wsoil_2");

        if (Wsoil_2 != null) {
            setWsoil_2(Wsoil_2);
        }

        Integer Wsoil_2_EMEP = (Integer) attributes.get("Wsoil_2_EMEP");

        if (Wsoil_2_EMEP != null) {
            setWsoil_2_EMEP(Wsoil_2_EMEP);
        }

        Float T_p_B5 = (Float) attributes.get("T_p_B5");

        if (T_p_B5 != null) {
            setT_p_B5(T_p_B5);
        }

        Integer T_p_B5_EMEP = (Integer) attributes.get("T_p_B5_EMEP");

        if (T_p_B5_EMEP != null) {
            setT_p_B5_EMEP(T_p_B5_EMEP);
        }

        Float T_p_B20 = (Float) attributes.get("T_p_B20");

        if (T_p_B20 != null) {
            setT_p_B20(T_p_B20);
        }

        Integer T_p_B20_EMEP = (Integer) attributes.get("T_p_B20_EMEP");

        if (T_p_B20_EMEP != null) {
            setT_p_B20_EMEP(T_p_B20_EMEP);
        }

        Float T_p_B35 = (Float) attributes.get("T_p_B35");

        if (T_p_B35 != null) {
            setT_p_B35(T_p_B35);
        }

        Integer T_p_B35_EMEP = (Integer) attributes.get("T_p_B35_EMEP");

        if (T_p_B35_EMEP != null) {
            setT_p_B35_EMEP(T_p_B35_EMEP);
        }

        Float T_p_B50 = (Float) attributes.get("T_p_B50");

        if (T_p_B50 != null) {
            setT_p_B50(T_p_B50);
        }

        Integer T_p_B50_EMEP = (Integer) attributes.get("T_p_B50_EMEP");

        if (T_p_B50_EMEP != null) {
            setT_p_B50_EMEP(T_p_B50_EMEP);
        }

        Float T_p_C1 = (Float) attributes.get("T_p_C1");

        if (T_p_C1 != null) {
            setT_p_C1(T_p_C1);
        }

        Integer T_p_C1_EMEP = (Integer) attributes.get("T_p_C1_EMEP");

        if (T_p_C1_EMEP != null) {
            setT_p_C1_EMEP(T_p_C1_EMEP);
        }

        Float T_p_C2 = (Float) attributes.get("T_p_C2");

        if (T_p_C2 != null) {
            setT_p_C2(T_p_C2);
        }

        Integer T_p_C2_EMEP = (Integer) attributes.get("T_p_C2_EMEP");

        if (T_p_C2_EMEP != null) {
            setT_p_C2_EMEP(T_p_C2_EMEP);
        }

        Float T_p_C5 = (Float) attributes.get("T_p_C5");

        if (T_p_C5 != null) {
            setT_p_C5(T_p_C5);
        }

        Integer T_p_C5_EMEP = (Integer) attributes.get("T_p_C5_EMEP");

        if (T_p_C5_EMEP != null) {
            setT_p_C5_EMEP(T_p_C5_EMEP);
        }

        Float T_p_C10 = (Float) attributes.get("T_p_C10");

        if (T_p_C10 != null) {
            setT_p_C10(T_p_C10);
        }

        Integer T_p_C10_EMEP = (Integer) attributes.get("T_p_C10_EMEP");

        if (T_p_C10_EMEP != null) {
            setT_p_C10_EMEP(T_p_C10_EMEP);
        }

        Float T_p_C15 = (Float) attributes.get("T_p_C15");

        if (T_p_C15 != null) {
            setT_p_C15(T_p_C15);
        }

        Integer T_p_C15_EMEP = (Integer) attributes.get("T_p_C15_EMEP");

        if (T_p_C15_EMEP != null) {
            setT_p_C15_EMEP(T_p_C15_EMEP);
        }

        Float T_p_C20 = (Float) attributes.get("T_p_C20");

        if (T_p_C20 != null) {
            setT_p_C20(T_p_C20);
        }

        Integer T_p_C20_EMEP = (Integer) attributes.get("T_p_C20_EMEP");

        if (T_p_C20_EMEP != null) {
            setT_p_C20_EMEP(T_p_C20_EMEP);
        }

        Float T_p_C30 = (Float) attributes.get("T_p_C30");

        if (T_p_C30 != null) {
            setT_p_C30(T_p_C30);
        }

        Integer T_p_C30_EMEP = (Integer) attributes.get("T_p_C30_EMEP");

        if (T_p_C30_EMEP != null) {
            setT_p_C30_EMEP(T_p_C30_EMEP);
        }

        Float T_p_C50 = (Float) attributes.get("T_p_C50");

        if (T_p_C50 != null) {
            setT_p_C50(T_p_C50);
        }

        Integer T_p_C50_EMEP = (Integer) attributes.get("T_p_C50_EMEP");

        if (T_p_C50_EMEP != null) {
            setT_p_C50_EMEP(T_p_C50_EMEP);
        }

        Float T_p_C70 = (Float) attributes.get("T_p_C70");

        if (T_p_C70 != null) {
            setT_p_C70(T_p_C70);
        }

        Integer T_p_C70_EMEP = (Integer) attributes.get("T_p_C70_EMEP");

        if (T_p_C70_EMEP != null) {
            setT_p_C70_EMEP(T_p_C70_EMEP);
        }

        Float T_p_C100 = (Float) attributes.get("T_p_C100");

        if (T_p_C100 != null) {
            setT_p_C100(T_p_C100);
        }

        Integer T_p_C100_EMEP = (Integer) attributes.get("T_p_C100_EMEP");

        if (T_p_C100_EMEP != null) {
            setT_p_C100_EMEP(T_p_C100_EMEP);
        }

        Float WTD = (Float) attributes.get("WTD");

        if (WTD != null) {
            setWTD(WTD);
        }

        Integer WTD_EMEP = (Integer) attributes.get("WTD_EMEP");

        if (WTD_EMEP != null) {
            setWTD_EMEP(WTD_EMEP);
        }

        Float Precip = (Float) attributes.get("Precip");

        if (Precip != null) {
            setPrecip(Precip);
        }

        Integer Precip_EMEP = (Integer) attributes.get("Precip_EMEP");

        if (Precip_EMEP != null) {
            setPrecip_EMEP(Precip_EMEP);
        }
    }

    /**
    * Returns the primary key of this sii1meta.
    *
    * @return the primary key of this sii1meta
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _sii1meta.getPrimaryKey();
    }

    /**
    * Sets the primary key of this sii1meta.
    *
    * @param primaryKey the primary key of this sii1meta
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _sii1meta.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the samptime of this sii1meta.
    *
    * @return the samptime of this sii1meta
    */
    @Override
    public java.util.Date getSamptime() {
        return _sii1meta.getSamptime();
    }

    /**
    * Sets the samptime of this sii1meta.
    *
    * @param samptime the samptime of this sii1meta
    */
    @Override
    public void setSamptime(java.util.Date samptime) {
        _sii1meta.setSamptime(samptime);
    }

    /**
    * Returns the t_a of this sii1meta.
    *
    * @return the t_a of this sii1meta
    */
    @Override
    public float getT_a() {
        return _sii1meta.getT_a();
    }

    /**
    * Sets the t_a of this sii1meta.
    *
    * @param T_a the t_a of this sii1meta
    */
    @Override
    public void setT_a(float T_a) {
        _sii1meta.setT_a(T_a);
    }

    /**
    * Returns the t_a_ e m e p of this sii1meta.
    *
    * @return the t_a_ e m e p of this sii1meta
    */
    @Override
    public int getT_a_EMEP() {
        return _sii1meta.getT_a_EMEP();
    }

    /**
    * Sets the t_a_ e m e p of this sii1meta.
    *
    * @param T_a_EMEP the t_a_ e m e p of this sii1meta
    */
    @Override
    public void setT_a_EMEP(int T_a_EMEP) {
        _sii1meta.setT_a_EMEP(T_a_EMEP);
    }

    /**
    * Returns the r h of this sii1meta.
    *
    * @return the r h of this sii1meta
    */
    @Override
    public float getRH() {
        return _sii1meta.getRH();
    }

    /**
    * Sets the r h of this sii1meta.
    *
    * @param RH the r h of this sii1meta
    */
    @Override
    public void setRH(float RH) {
        _sii1meta.setRH(RH);
    }

    /**
    * Returns the r h_ e m e p of this sii1meta.
    *
    * @return the r h_ e m e p of this sii1meta
    */
    @Override
    public int getRH_EMEP() {
        return _sii1meta.getRH_EMEP();
    }

    /**
    * Sets the r h_ e m e p of this sii1meta.
    *
    * @param RH_EMEP the r h_ e m e p of this sii1meta
    */
    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _sii1meta.setRH_EMEP(RH_EMEP);
    }

    /**
    * Returns the p a r of this sii1meta.
    *
    * @return the p a r of this sii1meta
    */
    @Override
    public float getPAR() {
        return _sii1meta.getPAR();
    }

    /**
    * Sets the p a r of this sii1meta.
    *
    * @param PAR the p a r of this sii1meta
    */
    @Override
    public void setPAR(float PAR) {
        _sii1meta.setPAR(PAR);
    }

    /**
    * Returns the p a r_ e m e p of this sii1meta.
    *
    * @return the p a r_ e m e p of this sii1meta
    */
    @Override
    public int getPAR_EMEP() {
        return _sii1meta.getPAR_EMEP();
    }

    /**
    * Sets the p a r_ e m e p of this sii1meta.
    *
    * @param PAR_EMEP the p a r_ e m e p of this sii1meta
    */
    @Override
    public void setPAR_EMEP(int PAR_EMEP) {
        _sii1meta.setPAR_EMEP(PAR_EMEP);
    }

    /**
    * Returns the r_ p a r of this sii1meta.
    *
    * @return the r_ p a r of this sii1meta
    */
    @Override
    public float getR_PAR() {
        return _sii1meta.getR_PAR();
    }

    /**
    * Sets the r_ p a r of this sii1meta.
    *
    * @param R_PAR the r_ p a r of this sii1meta
    */
    @Override
    public void setR_PAR(float R_PAR) {
        _sii1meta.setR_PAR(R_PAR);
    }

    /**
    * Returns the r_ p a r_ e m e p of this sii1meta.
    *
    * @return the r_ p a r_ e m e p of this sii1meta
    */
    @Override
    public int getR_PAR_EMEP() {
        return _sii1meta.getR_PAR_EMEP();
    }

    /**
    * Sets the r_ p a r_ e m e p of this sii1meta.
    *
    * @param R_PAR_EMEP the r_ p a r_ e m e p of this sii1meta
    */
    @Override
    public void setR_PAR_EMEP(int R_PAR_EMEP) {
        _sii1meta.setR_PAR_EMEP(R_PAR_EMEP);
    }

    /**
    * Returns the net_ c n r4 of this sii1meta.
    *
    * @return the net_ c n r4 of this sii1meta
    */
    @Override
    public float getNet_CNR4() {
        return _sii1meta.getNet_CNR4();
    }

    /**
    * Sets the net_ c n r4 of this sii1meta.
    *
    * @param Net_CNR4 the net_ c n r4 of this sii1meta
    */
    @Override
    public void setNet_CNR4(float Net_CNR4) {
        _sii1meta.setNet_CNR4(Net_CNR4);
    }

    /**
    * Returns the net_ c n r4_ e m e p of this sii1meta.
    *
    * @return the net_ c n r4_ e m e p of this sii1meta
    */
    @Override
    public int getNet_CNR4_EMEP() {
        return _sii1meta.getNet_CNR4_EMEP();
    }

    /**
    * Sets the net_ c n r4_ e m e p of this sii1meta.
    *
    * @param Net_CNR4_EMEP the net_ c n r4_ e m e p of this sii1meta
    */
    @Override
    public void setNet_CNR4_EMEP(int Net_CNR4_EMEP) {
        _sii1meta.setNet_CNR4_EMEP(Net_CNR4_EMEP);
    }

    /**
    * Returns the net_ n r lite of this sii1meta.
    *
    * @return the net_ n r lite of this sii1meta
    */
    @Override
    public float getNet_NRLite() {
        return _sii1meta.getNet_NRLite();
    }

    /**
    * Sets the net_ n r lite of this sii1meta.
    *
    * @param Net_NRLite the net_ n r lite of this sii1meta
    */
    @Override
    public void setNet_NRLite(float Net_NRLite) {
        _sii1meta.setNet_NRLite(Net_NRLite);
    }

    /**
    * Returns the net_ n r lite_ e m e p of this sii1meta.
    *
    * @return the net_ n r lite_ e m e p of this sii1meta
    */
    @Override
    public int getNet_NRLite_EMEP() {
        return _sii1meta.getNet_NRLite_EMEP();
    }

    /**
    * Sets the net_ n r lite_ e m e p of this sii1meta.
    *
    * @param Net_NRLite_EMEP the net_ n r lite_ e m e p of this sii1meta
    */
    @Override
    public void setNet_NRLite_EMEP(int Net_NRLite_EMEP) {
        _sii1meta.setNet_NRLite_EMEP(Net_NRLite_EMEP);
    }

    /**
    * Returns the wsoil_1 of this sii1meta.
    *
    * @return the wsoil_1 of this sii1meta
    */
    @Override
    public float getWsoil_1() {
        return _sii1meta.getWsoil_1();
    }

    /**
    * Sets the wsoil_1 of this sii1meta.
    *
    * @param Wsoil_1 the wsoil_1 of this sii1meta
    */
    @Override
    public void setWsoil_1(float Wsoil_1) {
        _sii1meta.setWsoil_1(Wsoil_1);
    }

    /**
    * Returns the wsoil_1_ e m e p of this sii1meta.
    *
    * @return the wsoil_1_ e m e p of this sii1meta
    */
    @Override
    public int getWsoil_1_EMEP() {
        return _sii1meta.getWsoil_1_EMEP();
    }

    /**
    * Sets the wsoil_1_ e m e p of this sii1meta.
    *
    * @param Wsoil_1_EMEP the wsoil_1_ e m e p of this sii1meta
    */
    @Override
    public void setWsoil_1_EMEP(int Wsoil_1_EMEP) {
        _sii1meta.setWsoil_1_EMEP(Wsoil_1_EMEP);
    }

    /**
    * Returns the wsoil_2 of this sii1meta.
    *
    * @return the wsoil_2 of this sii1meta
    */
    @Override
    public float getWsoil_2() {
        return _sii1meta.getWsoil_2();
    }

    /**
    * Sets the wsoil_2 of this sii1meta.
    *
    * @param Wsoil_2 the wsoil_2 of this sii1meta
    */
    @Override
    public void setWsoil_2(float Wsoil_2) {
        _sii1meta.setWsoil_2(Wsoil_2);
    }

    /**
    * Returns the wsoil_2_ e m e p of this sii1meta.
    *
    * @return the wsoil_2_ e m e p of this sii1meta
    */
    @Override
    public int getWsoil_2_EMEP() {
        return _sii1meta.getWsoil_2_EMEP();
    }

    /**
    * Sets the wsoil_2_ e m e p of this sii1meta.
    *
    * @param Wsoil_2_EMEP the wsoil_2_ e m e p of this sii1meta
    */
    @Override
    public void setWsoil_2_EMEP(int Wsoil_2_EMEP) {
        _sii1meta.setWsoil_2_EMEP(Wsoil_2_EMEP);
    }

    /**
    * Returns the t_p_ b5 of this sii1meta.
    *
    * @return the t_p_ b5 of this sii1meta
    */
    @Override
    public float getT_p_B5() {
        return _sii1meta.getT_p_B5();
    }

    /**
    * Sets the t_p_ b5 of this sii1meta.
    *
    * @param T_p_B5 the t_p_ b5 of this sii1meta
    */
    @Override
    public void setT_p_B5(float T_p_B5) {
        _sii1meta.setT_p_B5(T_p_B5);
    }

    /**
    * Returns the t_p_ b5_ e m e p of this sii1meta.
    *
    * @return the t_p_ b5_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_B5_EMEP() {
        return _sii1meta.getT_p_B5_EMEP();
    }

    /**
    * Sets the t_p_ b5_ e m e p of this sii1meta.
    *
    * @param T_p_B5_EMEP the t_p_ b5_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_B5_EMEP(int T_p_B5_EMEP) {
        _sii1meta.setT_p_B5_EMEP(T_p_B5_EMEP);
    }

    /**
    * Returns the t_p_ b20 of this sii1meta.
    *
    * @return the t_p_ b20 of this sii1meta
    */
    @Override
    public float getT_p_B20() {
        return _sii1meta.getT_p_B20();
    }

    /**
    * Sets the t_p_ b20 of this sii1meta.
    *
    * @param T_p_B20 the t_p_ b20 of this sii1meta
    */
    @Override
    public void setT_p_B20(float T_p_B20) {
        _sii1meta.setT_p_B20(T_p_B20);
    }

    /**
    * Returns the t_p_ b20_ e m e p of this sii1meta.
    *
    * @return the t_p_ b20_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_B20_EMEP() {
        return _sii1meta.getT_p_B20_EMEP();
    }

    /**
    * Sets the t_p_ b20_ e m e p of this sii1meta.
    *
    * @param T_p_B20_EMEP the t_p_ b20_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_B20_EMEP(int T_p_B20_EMEP) {
        _sii1meta.setT_p_B20_EMEP(T_p_B20_EMEP);
    }

    /**
    * Returns the t_p_ b35 of this sii1meta.
    *
    * @return the t_p_ b35 of this sii1meta
    */
    @Override
    public float getT_p_B35() {
        return _sii1meta.getT_p_B35();
    }

    /**
    * Sets the t_p_ b35 of this sii1meta.
    *
    * @param T_p_B35 the t_p_ b35 of this sii1meta
    */
    @Override
    public void setT_p_B35(float T_p_B35) {
        _sii1meta.setT_p_B35(T_p_B35);
    }

    /**
    * Returns the t_p_ b35_ e m e p of this sii1meta.
    *
    * @return the t_p_ b35_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_B35_EMEP() {
        return _sii1meta.getT_p_B35_EMEP();
    }

    /**
    * Sets the t_p_ b35_ e m e p of this sii1meta.
    *
    * @param T_p_B35_EMEP the t_p_ b35_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_B35_EMEP(int T_p_B35_EMEP) {
        _sii1meta.setT_p_B35_EMEP(T_p_B35_EMEP);
    }

    /**
    * Returns the t_p_ b50 of this sii1meta.
    *
    * @return the t_p_ b50 of this sii1meta
    */
    @Override
    public float getT_p_B50() {
        return _sii1meta.getT_p_B50();
    }

    /**
    * Sets the t_p_ b50 of this sii1meta.
    *
    * @param T_p_B50 the t_p_ b50 of this sii1meta
    */
    @Override
    public void setT_p_B50(float T_p_B50) {
        _sii1meta.setT_p_B50(T_p_B50);
    }

    /**
    * Returns the t_p_ b50_ e m e p of this sii1meta.
    *
    * @return the t_p_ b50_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_B50_EMEP() {
        return _sii1meta.getT_p_B50_EMEP();
    }

    /**
    * Sets the t_p_ b50_ e m e p of this sii1meta.
    *
    * @param T_p_B50_EMEP the t_p_ b50_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_B50_EMEP(int T_p_B50_EMEP) {
        _sii1meta.setT_p_B50_EMEP(T_p_B50_EMEP);
    }

    /**
    * Returns the t_p_ c1 of this sii1meta.
    *
    * @return the t_p_ c1 of this sii1meta
    */
    @Override
    public float getT_p_C1() {
        return _sii1meta.getT_p_C1();
    }

    /**
    * Sets the t_p_ c1 of this sii1meta.
    *
    * @param T_p_C1 the t_p_ c1 of this sii1meta
    */
    @Override
    public void setT_p_C1(float T_p_C1) {
        _sii1meta.setT_p_C1(T_p_C1);
    }

    /**
    * Returns the t_p_ c1_ e m e p of this sii1meta.
    *
    * @return the t_p_ c1_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C1_EMEP() {
        return _sii1meta.getT_p_C1_EMEP();
    }

    /**
    * Sets the t_p_ c1_ e m e p of this sii1meta.
    *
    * @param T_p_C1_EMEP the t_p_ c1_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C1_EMEP(int T_p_C1_EMEP) {
        _sii1meta.setT_p_C1_EMEP(T_p_C1_EMEP);
    }

    /**
    * Returns the t_p_ c2 of this sii1meta.
    *
    * @return the t_p_ c2 of this sii1meta
    */
    @Override
    public float getT_p_C2() {
        return _sii1meta.getT_p_C2();
    }

    /**
    * Sets the t_p_ c2 of this sii1meta.
    *
    * @param T_p_C2 the t_p_ c2 of this sii1meta
    */
    @Override
    public void setT_p_C2(float T_p_C2) {
        _sii1meta.setT_p_C2(T_p_C2);
    }

    /**
    * Returns the t_p_ c2_ e m e p of this sii1meta.
    *
    * @return the t_p_ c2_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C2_EMEP() {
        return _sii1meta.getT_p_C2_EMEP();
    }

    /**
    * Sets the t_p_ c2_ e m e p of this sii1meta.
    *
    * @param T_p_C2_EMEP the t_p_ c2_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C2_EMEP(int T_p_C2_EMEP) {
        _sii1meta.setT_p_C2_EMEP(T_p_C2_EMEP);
    }

    /**
    * Returns the t_p_ c5 of this sii1meta.
    *
    * @return the t_p_ c5 of this sii1meta
    */
    @Override
    public float getT_p_C5() {
        return _sii1meta.getT_p_C5();
    }

    /**
    * Sets the t_p_ c5 of this sii1meta.
    *
    * @param T_p_C5 the t_p_ c5 of this sii1meta
    */
    @Override
    public void setT_p_C5(float T_p_C5) {
        _sii1meta.setT_p_C5(T_p_C5);
    }

    /**
    * Returns the t_p_ c5_ e m e p of this sii1meta.
    *
    * @return the t_p_ c5_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C5_EMEP() {
        return _sii1meta.getT_p_C5_EMEP();
    }

    /**
    * Sets the t_p_ c5_ e m e p of this sii1meta.
    *
    * @param T_p_C5_EMEP the t_p_ c5_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C5_EMEP(int T_p_C5_EMEP) {
        _sii1meta.setT_p_C5_EMEP(T_p_C5_EMEP);
    }

    /**
    * Returns the t_p_ c10 of this sii1meta.
    *
    * @return the t_p_ c10 of this sii1meta
    */
    @Override
    public float getT_p_C10() {
        return _sii1meta.getT_p_C10();
    }

    /**
    * Sets the t_p_ c10 of this sii1meta.
    *
    * @param T_p_C10 the t_p_ c10 of this sii1meta
    */
    @Override
    public void setT_p_C10(float T_p_C10) {
        _sii1meta.setT_p_C10(T_p_C10);
    }

    /**
    * Returns the t_p_ c10_ e m e p of this sii1meta.
    *
    * @return the t_p_ c10_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C10_EMEP() {
        return _sii1meta.getT_p_C10_EMEP();
    }

    /**
    * Sets the t_p_ c10_ e m e p of this sii1meta.
    *
    * @param T_p_C10_EMEP the t_p_ c10_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C10_EMEP(int T_p_C10_EMEP) {
        _sii1meta.setT_p_C10_EMEP(T_p_C10_EMEP);
    }

    /**
    * Returns the t_p_ c15 of this sii1meta.
    *
    * @return the t_p_ c15 of this sii1meta
    */
    @Override
    public float getT_p_C15() {
        return _sii1meta.getT_p_C15();
    }

    /**
    * Sets the t_p_ c15 of this sii1meta.
    *
    * @param T_p_C15 the t_p_ c15 of this sii1meta
    */
    @Override
    public void setT_p_C15(float T_p_C15) {
        _sii1meta.setT_p_C15(T_p_C15);
    }

    /**
    * Returns the t_p_ c15_ e m e p of this sii1meta.
    *
    * @return the t_p_ c15_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C15_EMEP() {
        return _sii1meta.getT_p_C15_EMEP();
    }

    /**
    * Sets the t_p_ c15_ e m e p of this sii1meta.
    *
    * @param T_p_C15_EMEP the t_p_ c15_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C15_EMEP(int T_p_C15_EMEP) {
        _sii1meta.setT_p_C15_EMEP(T_p_C15_EMEP);
    }

    /**
    * Returns the t_p_ c20 of this sii1meta.
    *
    * @return the t_p_ c20 of this sii1meta
    */
    @Override
    public float getT_p_C20() {
        return _sii1meta.getT_p_C20();
    }

    /**
    * Sets the t_p_ c20 of this sii1meta.
    *
    * @param T_p_C20 the t_p_ c20 of this sii1meta
    */
    @Override
    public void setT_p_C20(float T_p_C20) {
        _sii1meta.setT_p_C20(T_p_C20);
    }

    /**
    * Returns the t_p_ c20_ e m e p of this sii1meta.
    *
    * @return the t_p_ c20_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C20_EMEP() {
        return _sii1meta.getT_p_C20_EMEP();
    }

    /**
    * Sets the t_p_ c20_ e m e p of this sii1meta.
    *
    * @param T_p_C20_EMEP the t_p_ c20_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C20_EMEP(int T_p_C20_EMEP) {
        _sii1meta.setT_p_C20_EMEP(T_p_C20_EMEP);
    }

    /**
    * Returns the t_p_ c30 of this sii1meta.
    *
    * @return the t_p_ c30 of this sii1meta
    */
    @Override
    public float getT_p_C30() {
        return _sii1meta.getT_p_C30();
    }

    /**
    * Sets the t_p_ c30 of this sii1meta.
    *
    * @param T_p_C30 the t_p_ c30 of this sii1meta
    */
    @Override
    public void setT_p_C30(float T_p_C30) {
        _sii1meta.setT_p_C30(T_p_C30);
    }

    /**
    * Returns the t_p_ c30_ e m e p of this sii1meta.
    *
    * @return the t_p_ c30_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C30_EMEP() {
        return _sii1meta.getT_p_C30_EMEP();
    }

    /**
    * Sets the t_p_ c30_ e m e p of this sii1meta.
    *
    * @param T_p_C30_EMEP the t_p_ c30_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C30_EMEP(int T_p_C30_EMEP) {
        _sii1meta.setT_p_C30_EMEP(T_p_C30_EMEP);
    }

    /**
    * Returns the t_p_ c50 of this sii1meta.
    *
    * @return the t_p_ c50 of this sii1meta
    */
    @Override
    public float getT_p_C50() {
        return _sii1meta.getT_p_C50();
    }

    /**
    * Sets the t_p_ c50 of this sii1meta.
    *
    * @param T_p_C50 the t_p_ c50 of this sii1meta
    */
    @Override
    public void setT_p_C50(float T_p_C50) {
        _sii1meta.setT_p_C50(T_p_C50);
    }

    /**
    * Returns the t_p_ c50_ e m e p of this sii1meta.
    *
    * @return the t_p_ c50_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C50_EMEP() {
        return _sii1meta.getT_p_C50_EMEP();
    }

    /**
    * Sets the t_p_ c50_ e m e p of this sii1meta.
    *
    * @param T_p_C50_EMEP the t_p_ c50_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C50_EMEP(int T_p_C50_EMEP) {
        _sii1meta.setT_p_C50_EMEP(T_p_C50_EMEP);
    }

    /**
    * Returns the t_p_ c70 of this sii1meta.
    *
    * @return the t_p_ c70 of this sii1meta
    */
    @Override
    public float getT_p_C70() {
        return _sii1meta.getT_p_C70();
    }

    /**
    * Sets the t_p_ c70 of this sii1meta.
    *
    * @param T_p_C70 the t_p_ c70 of this sii1meta
    */
    @Override
    public void setT_p_C70(float T_p_C70) {
        _sii1meta.setT_p_C70(T_p_C70);
    }

    /**
    * Returns the t_p_ c70_ e m e p of this sii1meta.
    *
    * @return the t_p_ c70_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C70_EMEP() {
        return _sii1meta.getT_p_C70_EMEP();
    }

    /**
    * Sets the t_p_ c70_ e m e p of this sii1meta.
    *
    * @param T_p_C70_EMEP the t_p_ c70_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C70_EMEP(int T_p_C70_EMEP) {
        _sii1meta.setT_p_C70_EMEP(T_p_C70_EMEP);
    }

    /**
    * Returns the t_p_ c100 of this sii1meta.
    *
    * @return the t_p_ c100 of this sii1meta
    */
    @Override
    public float getT_p_C100() {
        return _sii1meta.getT_p_C100();
    }

    /**
    * Sets the t_p_ c100 of this sii1meta.
    *
    * @param T_p_C100 the t_p_ c100 of this sii1meta
    */
    @Override
    public void setT_p_C100(float T_p_C100) {
        _sii1meta.setT_p_C100(T_p_C100);
    }

    /**
    * Returns the t_p_ c100_ e m e p of this sii1meta.
    *
    * @return the t_p_ c100_ e m e p of this sii1meta
    */
    @Override
    public int getT_p_C100_EMEP() {
        return _sii1meta.getT_p_C100_EMEP();
    }

    /**
    * Sets the t_p_ c100_ e m e p of this sii1meta.
    *
    * @param T_p_C100_EMEP the t_p_ c100_ e m e p of this sii1meta
    */
    @Override
    public void setT_p_C100_EMEP(int T_p_C100_EMEP) {
        _sii1meta.setT_p_C100_EMEP(T_p_C100_EMEP);
    }

    /**
    * Returns the w t d of this sii1meta.
    *
    * @return the w t d of this sii1meta
    */
    @Override
    public float getWTD() {
        return _sii1meta.getWTD();
    }

    /**
    * Sets the w t d of this sii1meta.
    *
    * @param WTD the w t d of this sii1meta
    */
    @Override
    public void setWTD(float WTD) {
        _sii1meta.setWTD(WTD);
    }

    /**
    * Returns the w t d_ e m e p of this sii1meta.
    *
    * @return the w t d_ e m e p of this sii1meta
    */
    @Override
    public int getWTD_EMEP() {
        return _sii1meta.getWTD_EMEP();
    }

    /**
    * Sets the w t d_ e m e p of this sii1meta.
    *
    * @param WTD_EMEP the w t d_ e m e p of this sii1meta
    */
    @Override
    public void setWTD_EMEP(int WTD_EMEP) {
        _sii1meta.setWTD_EMEP(WTD_EMEP);
    }

    /**
    * Returns the precip of this sii1meta.
    *
    * @return the precip of this sii1meta
    */
    @Override
    public float getPrecip() {
        return _sii1meta.getPrecip();
    }

    /**
    * Sets the precip of this sii1meta.
    *
    * @param Precip the precip of this sii1meta
    */
    @Override
    public void setPrecip(float Precip) {
        _sii1meta.setPrecip(Precip);
    }

    /**
    * Returns the precip_ e m e p of this sii1meta.
    *
    * @return the precip_ e m e p of this sii1meta
    */
    @Override
    public int getPrecip_EMEP() {
        return _sii1meta.getPrecip_EMEP();
    }

    /**
    * Sets the precip_ e m e p of this sii1meta.
    *
    * @param Precip_EMEP the precip_ e m e p of this sii1meta
    */
    @Override
    public void setPrecip_EMEP(int Precip_EMEP) {
        _sii1meta.setPrecip_EMEP(Precip_EMEP);
    }

    @Override
    public boolean isNew() {
        return _sii1meta.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _sii1meta.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _sii1meta.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _sii1meta.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _sii1meta.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _sii1meta.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _sii1meta.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _sii1meta.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _sii1meta.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _sii1meta.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _sii1meta.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Sii1metaWrapper((Sii1meta) _sii1meta.clone());
    }

    @Override
    public int compareTo(Sii1meta sii1meta) {
        return _sii1meta.compareTo(sii1meta);
    }

    @Override
    public int hashCode() {
        return _sii1meta.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Sii1meta> toCacheModel() {
        return _sii1meta.toCacheModel();
    }

    @Override
    public Sii1meta toEscapedModel() {
        return new Sii1metaWrapper(_sii1meta.toEscapedModel());
    }

    @Override
    public Sii1meta toUnescapedModel() {
        return new Sii1metaWrapper(_sii1meta.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _sii1meta.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _sii1meta.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _sii1meta.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii1metaWrapper)) {
            return false;
        }

        Sii1metaWrapper sii1metaWrapper = (Sii1metaWrapper) obj;

        if (Validator.equals(_sii1meta, sii1metaWrapper._sii1meta)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Sii1meta getWrappedSii1meta() {
        return _sii1meta;
    }

    @Override
    public Sii1meta getWrappedModel() {
        return _sii1meta;
    }

    @Override
    public void resetOriginalValues() {
        _sii1meta.resetOriginalValues();
    }
}
