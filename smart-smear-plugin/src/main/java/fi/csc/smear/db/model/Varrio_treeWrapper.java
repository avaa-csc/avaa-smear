package fi.csc.smear.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Varrio_tree}.
 * </p>
 *
 * @author pj
 * @see Varrio_tree
 * @generated
 */
public class Varrio_treeWrapper implements Varrio_tree,
    ModelWrapper<Varrio_tree> {
    private Varrio_tree _varrio_tree;

    public Varrio_treeWrapper(Varrio_tree varrio_tree) {
        _varrio_tree = varrio_tree;
    }

    @Override
    public Class<?> getModelClass() {
        return Varrio_tree.class;
    }

    @Override
    public String getModelClassName() {
        return Varrio_tree.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("SAMPTIME", getSAMPTIME());
        attributes.put("F_CO2_tree0", getF_CO2_tree0());
        attributes.put("F_H2O_tree0", getF_H2O_tree0());
        attributes.put("Tcuv_tree0", getTcuv_tree0());
        attributes.put("PARcuv_tree0", getPARcuv_tree0());
        attributes.put("CO2_tree0", getCO2_tree0());
        attributes.put("H2O_tree0", getH2O_tree0());
        attributes.put("F_CO2_tree1", getF_CO2_tree1());
        attributes.put("F_H2O_tree1", getF_H2O_tree1());
        attributes.put("Tcuv_tree1", getTcuv_tree1());
        attributes.put("PARcuv_tree1", getPARcuv_tree1());
        attributes.put("CO2_tree1", getCO2_tree1());
        attributes.put("H2O_tree1", getH2O_tree1());
        attributes.put("F_CO2_tree2", getF_CO2_tree2());
        attributes.put("F_H2O_tree2", getF_H2O_tree2());
        attributes.put("Tcuv_tree2", getTcuv_tree2());
        attributes.put("PARcuv_tree2", getPARcuv_tree2());
        attributes.put("CO2_tree2", getCO2_tree2());
        attributes.put("H2O_tree2", getH2O_tree2());
        attributes.put("F_CO2_tree3", getF_CO2_tree3());
        attributes.put("F_H2O_tree3", getF_H2O_tree3());
        attributes.put("Tcuv_tree3", getTcuv_tree3());
        attributes.put("PARcuv_tree3", getPARcuv_tree3());
        attributes.put("CO2_tree3", getCO2_tree3());
        attributes.put("H2O_tree3", getH2O_tree3());
        attributes.put("F_CO2_tree0_EMEP", getF_CO2_tree0_EMEP());
        attributes.put("F_H2O_tree0_EMEP", getF_H2O_tree0_EMEP());
        attributes.put("Tcuv_tree0_EMEP", getTcuv_tree0_EMEP());
        attributes.put("PARcuv_tree0_EMEP", getPARcuv_tree0_EMEP());
        attributes.put("CO2_tree0_EMEP", getCO2_tree0_EMEP());
        attributes.put("H2O_tree0_EMEP", getH2O_tree0_EMEP());
        attributes.put("F_CO2_tree1_EMEP", getF_CO2_tree1_EMEP());
        attributes.put("F_H2O_tree1_EMEP", getF_H2O_tree1_EMEP());
        attributes.put("Tcuv_tree1_EMEP", getTcuv_tree1_EMEP());
        attributes.put("PARcuv_tree1_EMEP", getPARcuv_tree1_EMEP());
        attributes.put("CO2_tree1_EMEP", getCO2_tree1_EMEP());
        attributes.put("H2O_tree1_EMEP", getH2O_tree1_EMEP());
        attributes.put("F_CO2_tree2_EMEP", getF_CO2_tree2_EMEP());
        attributes.put("F_H2O_tree2_EMEP", getF_H2O_tree2_EMEP());
        attributes.put("Tcuv_tree2_EMEP", getTcuv_tree2_EMEP());
        attributes.put("PARcuv_tree2_EMEP", getPARcuv_tree2_EMEP());
        attributes.put("CO2_tree2_EMEP", getCO2_tree2_EMEP());
        attributes.put("H2O_tree2_EMEP", getH2O_tree2_EMEP());
        attributes.put("F_CO2_tree3_EMEP", getF_CO2_tree3_EMEP());
        attributes.put("F_H2O_tree3_EMEP", getF_H2O_tree3_EMEP());
        attributes.put("Tcuv_tree3_EMEP", getTcuv_tree3_EMEP());
        attributes.put("PARcuv_tree3_EMEP", getPARcuv_tree3_EMEP());
        attributes.put("CO2_tree3_EMEP", getCO2_tree3_EMEP());
        attributes.put("H2O_tree3_EMEP", getH2O_tree3_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date SAMPTIME = (Date) attributes.get("SAMPTIME");

        if (SAMPTIME != null) {
            setSAMPTIME(SAMPTIME);
        }

        Float F_CO2_tree0 = (Float) attributes.get("F_CO2_tree0");

        if (F_CO2_tree0 != null) {
            setF_CO2_tree0(F_CO2_tree0);
        }

        Float F_H2O_tree0 = (Float) attributes.get("F_H2O_tree0");

        if (F_H2O_tree0 != null) {
            setF_H2O_tree0(F_H2O_tree0);
        }

        Float Tcuv_tree0 = (Float) attributes.get("Tcuv_tree0");

        if (Tcuv_tree0 != null) {
            setTcuv_tree0(Tcuv_tree0);
        }

        Float PARcuv_tree0 = (Float) attributes.get("PARcuv_tree0");

        if (PARcuv_tree0 != null) {
            setPARcuv_tree0(PARcuv_tree0);
        }

        Float CO2_tree0 = (Float) attributes.get("CO2_tree0");

        if (CO2_tree0 != null) {
            setCO2_tree0(CO2_tree0);
        }

        Float H2O_tree0 = (Float) attributes.get("H2O_tree0");

        if (H2O_tree0 != null) {
            setH2O_tree0(H2O_tree0);
        }

        Float F_CO2_tree1 = (Float) attributes.get("F_CO2_tree1");

        if (F_CO2_tree1 != null) {
            setF_CO2_tree1(F_CO2_tree1);
        }

        Float F_H2O_tree1 = (Float) attributes.get("F_H2O_tree1");

        if (F_H2O_tree1 != null) {
            setF_H2O_tree1(F_H2O_tree1);
        }

        Float Tcuv_tree1 = (Float) attributes.get("Tcuv_tree1");

        if (Tcuv_tree1 != null) {
            setTcuv_tree1(Tcuv_tree1);
        }

        Float PARcuv_tree1 = (Float) attributes.get("PARcuv_tree1");

        if (PARcuv_tree1 != null) {
            setPARcuv_tree1(PARcuv_tree1);
        }

        Float CO2_tree1 = (Float) attributes.get("CO2_tree1");

        if (CO2_tree1 != null) {
            setCO2_tree1(CO2_tree1);
        }

        Float H2O_tree1 = (Float) attributes.get("H2O_tree1");

        if (H2O_tree1 != null) {
            setH2O_tree1(H2O_tree1);
        }

        Float F_CO2_tree2 = (Float) attributes.get("F_CO2_tree2");

        if (F_CO2_tree2 != null) {
            setF_CO2_tree2(F_CO2_tree2);
        }

        Float F_H2O_tree2 = (Float) attributes.get("F_H2O_tree2");

        if (F_H2O_tree2 != null) {
            setF_H2O_tree2(F_H2O_tree2);
        }

        Float Tcuv_tree2 = (Float) attributes.get("Tcuv_tree2");

        if (Tcuv_tree2 != null) {
            setTcuv_tree2(Tcuv_tree2);
        }

        Float PARcuv_tree2 = (Float) attributes.get("PARcuv_tree2");

        if (PARcuv_tree2 != null) {
            setPARcuv_tree2(PARcuv_tree2);
        }

        Float CO2_tree2 = (Float) attributes.get("CO2_tree2");

        if (CO2_tree2 != null) {
            setCO2_tree2(CO2_tree2);
        }

        Float H2O_tree2 = (Float) attributes.get("H2O_tree2");

        if (H2O_tree2 != null) {
            setH2O_tree2(H2O_tree2);
        }

        Float F_CO2_tree3 = (Float) attributes.get("F_CO2_tree3");

        if (F_CO2_tree3 != null) {
            setF_CO2_tree3(F_CO2_tree3);
        }

        Float F_H2O_tree3 = (Float) attributes.get("F_H2O_tree3");

        if (F_H2O_tree3 != null) {
            setF_H2O_tree3(F_H2O_tree3);
        }

        Float Tcuv_tree3 = (Float) attributes.get("Tcuv_tree3");

        if (Tcuv_tree3 != null) {
            setTcuv_tree3(Tcuv_tree3);
        }

        Float PARcuv_tree3 = (Float) attributes.get("PARcuv_tree3");

        if (PARcuv_tree3 != null) {
            setPARcuv_tree3(PARcuv_tree3);
        }

        Float CO2_tree3 = (Float) attributes.get("CO2_tree3");

        if (CO2_tree3 != null) {
            setCO2_tree3(CO2_tree3);
        }

        Float H2O_tree3 = (Float) attributes.get("H2O_tree3");

        if (H2O_tree3 != null) {
            setH2O_tree3(H2O_tree3);
        }

        Integer F_CO2_tree0_EMEP = (Integer) attributes.get("F_CO2_tree0_EMEP");

        if (F_CO2_tree0_EMEP != null) {
            setF_CO2_tree0_EMEP(F_CO2_tree0_EMEP);
        }

        Integer F_H2O_tree0_EMEP = (Integer) attributes.get("F_H2O_tree0_EMEP");

        if (F_H2O_tree0_EMEP != null) {
            setF_H2O_tree0_EMEP(F_H2O_tree0_EMEP);
        }

        Integer Tcuv_tree0_EMEP = (Integer) attributes.get("Tcuv_tree0_EMEP");

        if (Tcuv_tree0_EMEP != null) {
            setTcuv_tree0_EMEP(Tcuv_tree0_EMEP);
        }

        Integer PARcuv_tree0_EMEP = (Integer) attributes.get(
                "PARcuv_tree0_EMEP");

        if (PARcuv_tree0_EMEP != null) {
            setPARcuv_tree0_EMEP(PARcuv_tree0_EMEP);
        }

        Integer CO2_tree0_EMEP = (Integer) attributes.get("CO2_tree0_EMEP");

        if (CO2_tree0_EMEP != null) {
            setCO2_tree0_EMEP(CO2_tree0_EMEP);
        }

        Integer H2O_tree0_EMEP = (Integer) attributes.get("H2O_tree0_EMEP");

        if (H2O_tree0_EMEP != null) {
            setH2O_tree0_EMEP(H2O_tree0_EMEP);
        }

        Integer F_CO2_tree1_EMEP = (Integer) attributes.get("F_CO2_tree1_EMEP");

        if (F_CO2_tree1_EMEP != null) {
            setF_CO2_tree1_EMEP(F_CO2_tree1_EMEP);
        }

        Integer F_H2O_tree1_EMEP = (Integer) attributes.get("F_H2O_tree1_EMEP");

        if (F_H2O_tree1_EMEP != null) {
            setF_H2O_tree1_EMEP(F_H2O_tree1_EMEP);
        }

        Integer Tcuv_tree1_EMEP = (Integer) attributes.get("Tcuv_tree1_EMEP");

        if (Tcuv_tree1_EMEP != null) {
            setTcuv_tree1_EMEP(Tcuv_tree1_EMEP);
        }

        Integer PARcuv_tree1_EMEP = (Integer) attributes.get(
                "PARcuv_tree1_EMEP");

        if (PARcuv_tree1_EMEP != null) {
            setPARcuv_tree1_EMEP(PARcuv_tree1_EMEP);
        }

        Integer CO2_tree1_EMEP = (Integer) attributes.get("CO2_tree1_EMEP");

        if (CO2_tree1_EMEP != null) {
            setCO2_tree1_EMEP(CO2_tree1_EMEP);
        }

        Integer H2O_tree1_EMEP = (Integer) attributes.get("H2O_tree1_EMEP");

        if (H2O_tree1_EMEP != null) {
            setH2O_tree1_EMEP(H2O_tree1_EMEP);
        }

        Integer F_CO2_tree2_EMEP = (Integer) attributes.get("F_CO2_tree2_EMEP");

        if (F_CO2_tree2_EMEP != null) {
            setF_CO2_tree2_EMEP(F_CO2_tree2_EMEP);
        }

        Integer F_H2O_tree2_EMEP = (Integer) attributes.get("F_H2O_tree2_EMEP");

        if (F_H2O_tree2_EMEP != null) {
            setF_H2O_tree2_EMEP(F_H2O_tree2_EMEP);
        }

        Integer Tcuv_tree2_EMEP = (Integer) attributes.get("Tcuv_tree2_EMEP");

        if (Tcuv_tree2_EMEP != null) {
            setTcuv_tree2_EMEP(Tcuv_tree2_EMEP);
        }

        Integer PARcuv_tree2_EMEP = (Integer) attributes.get(
                "PARcuv_tree2_EMEP");

        if (PARcuv_tree2_EMEP != null) {
            setPARcuv_tree2_EMEP(PARcuv_tree2_EMEP);
        }

        Integer CO2_tree2_EMEP = (Integer) attributes.get("CO2_tree2_EMEP");

        if (CO2_tree2_EMEP != null) {
            setCO2_tree2_EMEP(CO2_tree2_EMEP);
        }

        Integer H2O_tree2_EMEP = (Integer) attributes.get("H2O_tree2_EMEP");

        if (H2O_tree2_EMEP != null) {
            setH2O_tree2_EMEP(H2O_tree2_EMEP);
        }

        Integer F_CO2_tree3_EMEP = (Integer) attributes.get("F_CO2_tree3_EMEP");

        if (F_CO2_tree3_EMEP != null) {
            setF_CO2_tree3_EMEP(F_CO2_tree3_EMEP);
        }

        Integer F_H2O_tree3_EMEP = (Integer) attributes.get("F_H2O_tree3_EMEP");

        if (F_H2O_tree3_EMEP != null) {
            setF_H2O_tree3_EMEP(F_H2O_tree3_EMEP);
        }

        Integer Tcuv_tree3_EMEP = (Integer) attributes.get("Tcuv_tree3_EMEP");

        if (Tcuv_tree3_EMEP != null) {
            setTcuv_tree3_EMEP(Tcuv_tree3_EMEP);
        }

        Integer PARcuv_tree3_EMEP = (Integer) attributes.get(
                "PARcuv_tree3_EMEP");

        if (PARcuv_tree3_EMEP != null) {
            setPARcuv_tree3_EMEP(PARcuv_tree3_EMEP);
        }

        Integer CO2_tree3_EMEP = (Integer) attributes.get("CO2_tree3_EMEP");

        if (CO2_tree3_EMEP != null) {
            setCO2_tree3_EMEP(CO2_tree3_EMEP);
        }

        Integer H2O_tree3_EMEP = (Integer) attributes.get("H2O_tree3_EMEP");

        if (H2O_tree3_EMEP != null) {
            setH2O_tree3_EMEP(H2O_tree3_EMEP);
        }
    }

    /**
    * Returns the primary key of this varrio_tree.
    *
    * @return the primary key of this varrio_tree
    */
    @Override
    public java.util.Date getPrimaryKey() {
        return _varrio_tree.getPrimaryKey();
    }

    /**
    * Sets the primary key of this varrio_tree.
    *
    * @param primaryKey the primary key of this varrio_tree
    */
    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        _varrio_tree.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the s a m p t i m e of this varrio_tree.
    *
    * @return the s a m p t i m e of this varrio_tree
    */
    @Override
    public java.util.Date getSAMPTIME() {
        return _varrio_tree.getSAMPTIME();
    }

    /**
    * Sets the s a m p t i m e of this varrio_tree.
    *
    * @param SAMPTIME the s a m p t i m e of this varrio_tree
    */
    @Override
    public void setSAMPTIME(java.util.Date SAMPTIME) {
        _varrio_tree.setSAMPTIME(SAMPTIME);
    }

    /**
    * Returns the f_ c o2_tree0 of this varrio_tree.
    *
    * @return the f_ c o2_tree0 of this varrio_tree
    */
    @Override
    public float getF_CO2_tree0() {
        return _varrio_tree.getF_CO2_tree0();
    }

    /**
    * Sets the f_ c o2_tree0 of this varrio_tree.
    *
    * @param F_CO2_tree0 the f_ c o2_tree0 of this varrio_tree
    */
    @Override
    public void setF_CO2_tree0(float F_CO2_tree0) {
        _varrio_tree.setF_CO2_tree0(F_CO2_tree0);
    }

    /**
    * Returns the f_ h2 o_tree0 of this varrio_tree.
    *
    * @return the f_ h2 o_tree0 of this varrio_tree
    */
    @Override
    public float getF_H2O_tree0() {
        return _varrio_tree.getF_H2O_tree0();
    }

    /**
    * Sets the f_ h2 o_tree0 of this varrio_tree.
    *
    * @param F_H2O_tree0 the f_ h2 o_tree0 of this varrio_tree
    */
    @Override
    public void setF_H2O_tree0(float F_H2O_tree0) {
        _varrio_tree.setF_H2O_tree0(F_H2O_tree0);
    }

    /**
    * Returns the tcuv_tree0 of this varrio_tree.
    *
    * @return the tcuv_tree0 of this varrio_tree
    */
    @Override
    public float getTcuv_tree0() {
        return _varrio_tree.getTcuv_tree0();
    }

    /**
    * Sets the tcuv_tree0 of this varrio_tree.
    *
    * @param Tcuv_tree0 the tcuv_tree0 of this varrio_tree
    */
    @Override
    public void setTcuv_tree0(float Tcuv_tree0) {
        _varrio_tree.setTcuv_tree0(Tcuv_tree0);
    }

    /**
    * Returns the p a rcuv_tree0 of this varrio_tree.
    *
    * @return the p a rcuv_tree0 of this varrio_tree
    */
    @Override
    public float getPARcuv_tree0() {
        return _varrio_tree.getPARcuv_tree0();
    }

    /**
    * Sets the p a rcuv_tree0 of this varrio_tree.
    *
    * @param PARcuv_tree0 the p a rcuv_tree0 of this varrio_tree
    */
    @Override
    public void setPARcuv_tree0(float PARcuv_tree0) {
        _varrio_tree.setPARcuv_tree0(PARcuv_tree0);
    }

    /**
    * Returns the c o2_tree0 of this varrio_tree.
    *
    * @return the c o2_tree0 of this varrio_tree
    */
    @Override
    public float getCO2_tree0() {
        return _varrio_tree.getCO2_tree0();
    }

    /**
    * Sets the c o2_tree0 of this varrio_tree.
    *
    * @param CO2_tree0 the c o2_tree0 of this varrio_tree
    */
    @Override
    public void setCO2_tree0(float CO2_tree0) {
        _varrio_tree.setCO2_tree0(CO2_tree0);
    }

    /**
    * Returns the h2 o_tree0 of this varrio_tree.
    *
    * @return the h2 o_tree0 of this varrio_tree
    */
    @Override
    public float getH2O_tree0() {
        return _varrio_tree.getH2O_tree0();
    }

    /**
    * Sets the h2 o_tree0 of this varrio_tree.
    *
    * @param H2O_tree0 the h2 o_tree0 of this varrio_tree
    */
    @Override
    public void setH2O_tree0(float H2O_tree0) {
        _varrio_tree.setH2O_tree0(H2O_tree0);
    }

    /**
    * Returns the f_ c o2_tree1 of this varrio_tree.
    *
    * @return the f_ c o2_tree1 of this varrio_tree
    */
    @Override
    public float getF_CO2_tree1() {
        return _varrio_tree.getF_CO2_tree1();
    }

    /**
    * Sets the f_ c o2_tree1 of this varrio_tree.
    *
    * @param F_CO2_tree1 the f_ c o2_tree1 of this varrio_tree
    */
    @Override
    public void setF_CO2_tree1(float F_CO2_tree1) {
        _varrio_tree.setF_CO2_tree1(F_CO2_tree1);
    }

    /**
    * Returns the f_ h2 o_tree1 of this varrio_tree.
    *
    * @return the f_ h2 o_tree1 of this varrio_tree
    */
    @Override
    public float getF_H2O_tree1() {
        return _varrio_tree.getF_H2O_tree1();
    }

    /**
    * Sets the f_ h2 o_tree1 of this varrio_tree.
    *
    * @param F_H2O_tree1 the f_ h2 o_tree1 of this varrio_tree
    */
    @Override
    public void setF_H2O_tree1(float F_H2O_tree1) {
        _varrio_tree.setF_H2O_tree1(F_H2O_tree1);
    }

    /**
    * Returns the tcuv_tree1 of this varrio_tree.
    *
    * @return the tcuv_tree1 of this varrio_tree
    */
    @Override
    public float getTcuv_tree1() {
        return _varrio_tree.getTcuv_tree1();
    }

    /**
    * Sets the tcuv_tree1 of this varrio_tree.
    *
    * @param Tcuv_tree1 the tcuv_tree1 of this varrio_tree
    */
    @Override
    public void setTcuv_tree1(float Tcuv_tree1) {
        _varrio_tree.setTcuv_tree1(Tcuv_tree1);
    }

    /**
    * Returns the p a rcuv_tree1 of this varrio_tree.
    *
    * @return the p a rcuv_tree1 of this varrio_tree
    */
    @Override
    public float getPARcuv_tree1() {
        return _varrio_tree.getPARcuv_tree1();
    }

    /**
    * Sets the p a rcuv_tree1 of this varrio_tree.
    *
    * @param PARcuv_tree1 the p a rcuv_tree1 of this varrio_tree
    */
    @Override
    public void setPARcuv_tree1(float PARcuv_tree1) {
        _varrio_tree.setPARcuv_tree1(PARcuv_tree1);
    }

    /**
    * Returns the c o2_tree1 of this varrio_tree.
    *
    * @return the c o2_tree1 of this varrio_tree
    */
    @Override
    public float getCO2_tree1() {
        return _varrio_tree.getCO2_tree1();
    }

    /**
    * Sets the c o2_tree1 of this varrio_tree.
    *
    * @param CO2_tree1 the c o2_tree1 of this varrio_tree
    */
    @Override
    public void setCO2_tree1(float CO2_tree1) {
        _varrio_tree.setCO2_tree1(CO2_tree1);
    }

    /**
    * Returns the h2 o_tree1 of this varrio_tree.
    *
    * @return the h2 o_tree1 of this varrio_tree
    */
    @Override
    public float getH2O_tree1() {
        return _varrio_tree.getH2O_tree1();
    }

    /**
    * Sets the h2 o_tree1 of this varrio_tree.
    *
    * @param H2O_tree1 the h2 o_tree1 of this varrio_tree
    */
    @Override
    public void setH2O_tree1(float H2O_tree1) {
        _varrio_tree.setH2O_tree1(H2O_tree1);
    }

    /**
    * Returns the f_ c o2_tree2 of this varrio_tree.
    *
    * @return the f_ c o2_tree2 of this varrio_tree
    */
    @Override
    public float getF_CO2_tree2() {
        return _varrio_tree.getF_CO2_tree2();
    }

    /**
    * Sets the f_ c o2_tree2 of this varrio_tree.
    *
    * @param F_CO2_tree2 the f_ c o2_tree2 of this varrio_tree
    */
    @Override
    public void setF_CO2_tree2(float F_CO2_tree2) {
        _varrio_tree.setF_CO2_tree2(F_CO2_tree2);
    }

    /**
    * Returns the f_ h2 o_tree2 of this varrio_tree.
    *
    * @return the f_ h2 o_tree2 of this varrio_tree
    */
    @Override
    public float getF_H2O_tree2() {
        return _varrio_tree.getF_H2O_tree2();
    }

    /**
    * Sets the f_ h2 o_tree2 of this varrio_tree.
    *
    * @param F_H2O_tree2 the f_ h2 o_tree2 of this varrio_tree
    */
    @Override
    public void setF_H2O_tree2(float F_H2O_tree2) {
        _varrio_tree.setF_H2O_tree2(F_H2O_tree2);
    }

    /**
    * Returns the tcuv_tree2 of this varrio_tree.
    *
    * @return the tcuv_tree2 of this varrio_tree
    */
    @Override
    public float getTcuv_tree2() {
        return _varrio_tree.getTcuv_tree2();
    }

    /**
    * Sets the tcuv_tree2 of this varrio_tree.
    *
    * @param Tcuv_tree2 the tcuv_tree2 of this varrio_tree
    */
    @Override
    public void setTcuv_tree2(float Tcuv_tree2) {
        _varrio_tree.setTcuv_tree2(Tcuv_tree2);
    }

    /**
    * Returns the p a rcuv_tree2 of this varrio_tree.
    *
    * @return the p a rcuv_tree2 of this varrio_tree
    */
    @Override
    public float getPARcuv_tree2() {
        return _varrio_tree.getPARcuv_tree2();
    }

    /**
    * Sets the p a rcuv_tree2 of this varrio_tree.
    *
    * @param PARcuv_tree2 the p a rcuv_tree2 of this varrio_tree
    */
    @Override
    public void setPARcuv_tree2(float PARcuv_tree2) {
        _varrio_tree.setPARcuv_tree2(PARcuv_tree2);
    }

    /**
    * Returns the c o2_tree2 of this varrio_tree.
    *
    * @return the c o2_tree2 of this varrio_tree
    */
    @Override
    public float getCO2_tree2() {
        return _varrio_tree.getCO2_tree2();
    }

    /**
    * Sets the c o2_tree2 of this varrio_tree.
    *
    * @param CO2_tree2 the c o2_tree2 of this varrio_tree
    */
    @Override
    public void setCO2_tree2(float CO2_tree2) {
        _varrio_tree.setCO2_tree2(CO2_tree2);
    }

    /**
    * Returns the h2 o_tree2 of this varrio_tree.
    *
    * @return the h2 o_tree2 of this varrio_tree
    */
    @Override
    public float getH2O_tree2() {
        return _varrio_tree.getH2O_tree2();
    }

    /**
    * Sets the h2 o_tree2 of this varrio_tree.
    *
    * @param H2O_tree2 the h2 o_tree2 of this varrio_tree
    */
    @Override
    public void setH2O_tree2(float H2O_tree2) {
        _varrio_tree.setH2O_tree2(H2O_tree2);
    }

    /**
    * Returns the f_ c o2_tree3 of this varrio_tree.
    *
    * @return the f_ c o2_tree3 of this varrio_tree
    */
    @Override
    public float getF_CO2_tree3() {
        return _varrio_tree.getF_CO2_tree3();
    }

    /**
    * Sets the f_ c o2_tree3 of this varrio_tree.
    *
    * @param F_CO2_tree3 the f_ c o2_tree3 of this varrio_tree
    */
    @Override
    public void setF_CO2_tree3(float F_CO2_tree3) {
        _varrio_tree.setF_CO2_tree3(F_CO2_tree3);
    }

    /**
    * Returns the f_ h2 o_tree3 of this varrio_tree.
    *
    * @return the f_ h2 o_tree3 of this varrio_tree
    */
    @Override
    public float getF_H2O_tree3() {
        return _varrio_tree.getF_H2O_tree3();
    }

    /**
    * Sets the f_ h2 o_tree3 of this varrio_tree.
    *
    * @param F_H2O_tree3 the f_ h2 o_tree3 of this varrio_tree
    */
    @Override
    public void setF_H2O_tree3(float F_H2O_tree3) {
        _varrio_tree.setF_H2O_tree3(F_H2O_tree3);
    }

    /**
    * Returns the tcuv_tree3 of this varrio_tree.
    *
    * @return the tcuv_tree3 of this varrio_tree
    */
    @Override
    public float getTcuv_tree3() {
        return _varrio_tree.getTcuv_tree3();
    }

    /**
    * Sets the tcuv_tree3 of this varrio_tree.
    *
    * @param Tcuv_tree3 the tcuv_tree3 of this varrio_tree
    */
    @Override
    public void setTcuv_tree3(float Tcuv_tree3) {
        _varrio_tree.setTcuv_tree3(Tcuv_tree3);
    }

    /**
    * Returns the p a rcuv_tree3 of this varrio_tree.
    *
    * @return the p a rcuv_tree3 of this varrio_tree
    */
    @Override
    public float getPARcuv_tree3() {
        return _varrio_tree.getPARcuv_tree3();
    }

    /**
    * Sets the p a rcuv_tree3 of this varrio_tree.
    *
    * @param PARcuv_tree3 the p a rcuv_tree3 of this varrio_tree
    */
    @Override
    public void setPARcuv_tree3(float PARcuv_tree3) {
        _varrio_tree.setPARcuv_tree3(PARcuv_tree3);
    }

    /**
    * Returns the c o2_tree3 of this varrio_tree.
    *
    * @return the c o2_tree3 of this varrio_tree
    */
    @Override
    public float getCO2_tree3() {
        return _varrio_tree.getCO2_tree3();
    }

    /**
    * Sets the c o2_tree3 of this varrio_tree.
    *
    * @param CO2_tree3 the c o2_tree3 of this varrio_tree
    */
    @Override
    public void setCO2_tree3(float CO2_tree3) {
        _varrio_tree.setCO2_tree3(CO2_tree3);
    }

    /**
    * Returns the h2 o_tree3 of this varrio_tree.
    *
    * @return the h2 o_tree3 of this varrio_tree
    */
    @Override
    public float getH2O_tree3() {
        return _varrio_tree.getH2O_tree3();
    }

    /**
    * Sets the h2 o_tree3 of this varrio_tree.
    *
    * @param H2O_tree3 the h2 o_tree3 of this varrio_tree
    */
    @Override
    public void setH2O_tree3(float H2O_tree3) {
        _varrio_tree.setH2O_tree3(H2O_tree3);
    }

    /**
    * Returns the f_ c o2_tree0_ e m e p of this varrio_tree.
    *
    * @return the f_ c o2_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getF_CO2_tree0_EMEP() {
        return _varrio_tree.getF_CO2_tree0_EMEP();
    }

    /**
    * Sets the f_ c o2_tree0_ e m e p of this varrio_tree.
    *
    * @param F_CO2_tree0_EMEP the f_ c o2_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setF_CO2_tree0_EMEP(int F_CO2_tree0_EMEP) {
        _varrio_tree.setF_CO2_tree0_EMEP(F_CO2_tree0_EMEP);
    }

    /**
    * Returns the f_ h2 o_tree0_ e m e p of this varrio_tree.
    *
    * @return the f_ h2 o_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getF_H2O_tree0_EMEP() {
        return _varrio_tree.getF_H2O_tree0_EMEP();
    }

    /**
    * Sets the f_ h2 o_tree0_ e m e p of this varrio_tree.
    *
    * @param F_H2O_tree0_EMEP the f_ h2 o_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setF_H2O_tree0_EMEP(int F_H2O_tree0_EMEP) {
        _varrio_tree.setF_H2O_tree0_EMEP(F_H2O_tree0_EMEP);
    }

    /**
    * Returns the tcuv_tree0_ e m e p of this varrio_tree.
    *
    * @return the tcuv_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getTcuv_tree0_EMEP() {
        return _varrio_tree.getTcuv_tree0_EMEP();
    }

    /**
    * Sets the tcuv_tree0_ e m e p of this varrio_tree.
    *
    * @param Tcuv_tree0_EMEP the tcuv_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setTcuv_tree0_EMEP(int Tcuv_tree0_EMEP) {
        _varrio_tree.setTcuv_tree0_EMEP(Tcuv_tree0_EMEP);
    }

    /**
    * Returns the p a rcuv_tree0_ e m e p of this varrio_tree.
    *
    * @return the p a rcuv_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getPARcuv_tree0_EMEP() {
        return _varrio_tree.getPARcuv_tree0_EMEP();
    }

    /**
    * Sets the p a rcuv_tree0_ e m e p of this varrio_tree.
    *
    * @param PARcuv_tree0_EMEP the p a rcuv_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setPARcuv_tree0_EMEP(int PARcuv_tree0_EMEP) {
        _varrio_tree.setPARcuv_tree0_EMEP(PARcuv_tree0_EMEP);
    }

    /**
    * Returns the c o2_tree0_ e m e p of this varrio_tree.
    *
    * @return the c o2_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getCO2_tree0_EMEP() {
        return _varrio_tree.getCO2_tree0_EMEP();
    }

    /**
    * Sets the c o2_tree0_ e m e p of this varrio_tree.
    *
    * @param CO2_tree0_EMEP the c o2_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setCO2_tree0_EMEP(int CO2_tree0_EMEP) {
        _varrio_tree.setCO2_tree0_EMEP(CO2_tree0_EMEP);
    }

    /**
    * Returns the h2 o_tree0_ e m e p of this varrio_tree.
    *
    * @return the h2 o_tree0_ e m e p of this varrio_tree
    */
    @Override
    public int getH2O_tree0_EMEP() {
        return _varrio_tree.getH2O_tree0_EMEP();
    }

    /**
    * Sets the h2 o_tree0_ e m e p of this varrio_tree.
    *
    * @param H2O_tree0_EMEP the h2 o_tree0_ e m e p of this varrio_tree
    */
    @Override
    public void setH2O_tree0_EMEP(int H2O_tree0_EMEP) {
        _varrio_tree.setH2O_tree0_EMEP(H2O_tree0_EMEP);
    }

    /**
    * Returns the f_ c o2_tree1_ e m e p of this varrio_tree.
    *
    * @return the f_ c o2_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getF_CO2_tree1_EMEP() {
        return _varrio_tree.getF_CO2_tree1_EMEP();
    }

    /**
    * Sets the f_ c o2_tree1_ e m e p of this varrio_tree.
    *
    * @param F_CO2_tree1_EMEP the f_ c o2_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setF_CO2_tree1_EMEP(int F_CO2_tree1_EMEP) {
        _varrio_tree.setF_CO2_tree1_EMEP(F_CO2_tree1_EMEP);
    }

    /**
    * Returns the f_ h2 o_tree1_ e m e p of this varrio_tree.
    *
    * @return the f_ h2 o_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getF_H2O_tree1_EMEP() {
        return _varrio_tree.getF_H2O_tree1_EMEP();
    }

    /**
    * Sets the f_ h2 o_tree1_ e m e p of this varrio_tree.
    *
    * @param F_H2O_tree1_EMEP the f_ h2 o_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setF_H2O_tree1_EMEP(int F_H2O_tree1_EMEP) {
        _varrio_tree.setF_H2O_tree1_EMEP(F_H2O_tree1_EMEP);
    }

    /**
    * Returns the tcuv_tree1_ e m e p of this varrio_tree.
    *
    * @return the tcuv_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getTcuv_tree1_EMEP() {
        return _varrio_tree.getTcuv_tree1_EMEP();
    }

    /**
    * Sets the tcuv_tree1_ e m e p of this varrio_tree.
    *
    * @param Tcuv_tree1_EMEP the tcuv_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setTcuv_tree1_EMEP(int Tcuv_tree1_EMEP) {
        _varrio_tree.setTcuv_tree1_EMEP(Tcuv_tree1_EMEP);
    }

    /**
    * Returns the p a rcuv_tree1_ e m e p of this varrio_tree.
    *
    * @return the p a rcuv_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getPARcuv_tree1_EMEP() {
        return _varrio_tree.getPARcuv_tree1_EMEP();
    }

    /**
    * Sets the p a rcuv_tree1_ e m e p of this varrio_tree.
    *
    * @param PARcuv_tree1_EMEP the p a rcuv_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setPARcuv_tree1_EMEP(int PARcuv_tree1_EMEP) {
        _varrio_tree.setPARcuv_tree1_EMEP(PARcuv_tree1_EMEP);
    }

    /**
    * Returns the c o2_tree1_ e m e p of this varrio_tree.
    *
    * @return the c o2_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getCO2_tree1_EMEP() {
        return _varrio_tree.getCO2_tree1_EMEP();
    }

    /**
    * Sets the c o2_tree1_ e m e p of this varrio_tree.
    *
    * @param CO2_tree1_EMEP the c o2_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setCO2_tree1_EMEP(int CO2_tree1_EMEP) {
        _varrio_tree.setCO2_tree1_EMEP(CO2_tree1_EMEP);
    }

    /**
    * Returns the h2 o_tree1_ e m e p of this varrio_tree.
    *
    * @return the h2 o_tree1_ e m e p of this varrio_tree
    */
    @Override
    public int getH2O_tree1_EMEP() {
        return _varrio_tree.getH2O_tree1_EMEP();
    }

    /**
    * Sets the h2 o_tree1_ e m e p of this varrio_tree.
    *
    * @param H2O_tree1_EMEP the h2 o_tree1_ e m e p of this varrio_tree
    */
    @Override
    public void setH2O_tree1_EMEP(int H2O_tree1_EMEP) {
        _varrio_tree.setH2O_tree1_EMEP(H2O_tree1_EMEP);
    }

    /**
    * Returns the f_ c o2_tree2_ e m e p of this varrio_tree.
    *
    * @return the f_ c o2_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getF_CO2_tree2_EMEP() {
        return _varrio_tree.getF_CO2_tree2_EMEP();
    }

    /**
    * Sets the f_ c o2_tree2_ e m e p of this varrio_tree.
    *
    * @param F_CO2_tree2_EMEP the f_ c o2_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setF_CO2_tree2_EMEP(int F_CO2_tree2_EMEP) {
        _varrio_tree.setF_CO2_tree2_EMEP(F_CO2_tree2_EMEP);
    }

    /**
    * Returns the f_ h2 o_tree2_ e m e p of this varrio_tree.
    *
    * @return the f_ h2 o_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getF_H2O_tree2_EMEP() {
        return _varrio_tree.getF_H2O_tree2_EMEP();
    }

    /**
    * Sets the f_ h2 o_tree2_ e m e p of this varrio_tree.
    *
    * @param F_H2O_tree2_EMEP the f_ h2 o_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setF_H2O_tree2_EMEP(int F_H2O_tree2_EMEP) {
        _varrio_tree.setF_H2O_tree2_EMEP(F_H2O_tree2_EMEP);
    }

    /**
    * Returns the tcuv_tree2_ e m e p of this varrio_tree.
    *
    * @return the tcuv_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getTcuv_tree2_EMEP() {
        return _varrio_tree.getTcuv_tree2_EMEP();
    }

    /**
    * Sets the tcuv_tree2_ e m e p of this varrio_tree.
    *
    * @param Tcuv_tree2_EMEP the tcuv_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setTcuv_tree2_EMEP(int Tcuv_tree2_EMEP) {
        _varrio_tree.setTcuv_tree2_EMEP(Tcuv_tree2_EMEP);
    }

    /**
    * Returns the p a rcuv_tree2_ e m e p of this varrio_tree.
    *
    * @return the p a rcuv_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getPARcuv_tree2_EMEP() {
        return _varrio_tree.getPARcuv_tree2_EMEP();
    }

    /**
    * Sets the p a rcuv_tree2_ e m e p of this varrio_tree.
    *
    * @param PARcuv_tree2_EMEP the p a rcuv_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setPARcuv_tree2_EMEP(int PARcuv_tree2_EMEP) {
        _varrio_tree.setPARcuv_tree2_EMEP(PARcuv_tree2_EMEP);
    }

    /**
    * Returns the c o2_tree2_ e m e p of this varrio_tree.
    *
    * @return the c o2_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getCO2_tree2_EMEP() {
        return _varrio_tree.getCO2_tree2_EMEP();
    }

    /**
    * Sets the c o2_tree2_ e m e p of this varrio_tree.
    *
    * @param CO2_tree2_EMEP the c o2_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setCO2_tree2_EMEP(int CO2_tree2_EMEP) {
        _varrio_tree.setCO2_tree2_EMEP(CO2_tree2_EMEP);
    }

    /**
    * Returns the h2 o_tree2_ e m e p of this varrio_tree.
    *
    * @return the h2 o_tree2_ e m e p of this varrio_tree
    */
    @Override
    public int getH2O_tree2_EMEP() {
        return _varrio_tree.getH2O_tree2_EMEP();
    }

    /**
    * Sets the h2 o_tree2_ e m e p of this varrio_tree.
    *
    * @param H2O_tree2_EMEP the h2 o_tree2_ e m e p of this varrio_tree
    */
    @Override
    public void setH2O_tree2_EMEP(int H2O_tree2_EMEP) {
        _varrio_tree.setH2O_tree2_EMEP(H2O_tree2_EMEP);
    }

    /**
    * Returns the f_ c o2_tree3_ e m e p of this varrio_tree.
    *
    * @return the f_ c o2_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getF_CO2_tree3_EMEP() {
        return _varrio_tree.getF_CO2_tree3_EMEP();
    }

    /**
    * Sets the f_ c o2_tree3_ e m e p of this varrio_tree.
    *
    * @param F_CO2_tree3_EMEP the f_ c o2_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setF_CO2_tree3_EMEP(int F_CO2_tree3_EMEP) {
        _varrio_tree.setF_CO2_tree3_EMEP(F_CO2_tree3_EMEP);
    }

    /**
    * Returns the f_ h2 o_tree3_ e m e p of this varrio_tree.
    *
    * @return the f_ h2 o_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getF_H2O_tree3_EMEP() {
        return _varrio_tree.getF_H2O_tree3_EMEP();
    }

    /**
    * Sets the f_ h2 o_tree3_ e m e p of this varrio_tree.
    *
    * @param F_H2O_tree3_EMEP the f_ h2 o_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setF_H2O_tree3_EMEP(int F_H2O_tree3_EMEP) {
        _varrio_tree.setF_H2O_tree3_EMEP(F_H2O_tree3_EMEP);
    }

    /**
    * Returns the tcuv_tree3_ e m e p of this varrio_tree.
    *
    * @return the tcuv_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getTcuv_tree3_EMEP() {
        return _varrio_tree.getTcuv_tree3_EMEP();
    }

    /**
    * Sets the tcuv_tree3_ e m e p of this varrio_tree.
    *
    * @param Tcuv_tree3_EMEP the tcuv_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setTcuv_tree3_EMEP(int Tcuv_tree3_EMEP) {
        _varrio_tree.setTcuv_tree3_EMEP(Tcuv_tree3_EMEP);
    }

    /**
    * Returns the p a rcuv_tree3_ e m e p of this varrio_tree.
    *
    * @return the p a rcuv_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getPARcuv_tree3_EMEP() {
        return _varrio_tree.getPARcuv_tree3_EMEP();
    }

    /**
    * Sets the p a rcuv_tree3_ e m e p of this varrio_tree.
    *
    * @param PARcuv_tree3_EMEP the p a rcuv_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setPARcuv_tree3_EMEP(int PARcuv_tree3_EMEP) {
        _varrio_tree.setPARcuv_tree3_EMEP(PARcuv_tree3_EMEP);
    }

    /**
    * Returns the c o2_tree3_ e m e p of this varrio_tree.
    *
    * @return the c o2_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getCO2_tree3_EMEP() {
        return _varrio_tree.getCO2_tree3_EMEP();
    }

    /**
    * Sets the c o2_tree3_ e m e p of this varrio_tree.
    *
    * @param CO2_tree3_EMEP the c o2_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setCO2_tree3_EMEP(int CO2_tree3_EMEP) {
        _varrio_tree.setCO2_tree3_EMEP(CO2_tree3_EMEP);
    }

    /**
    * Returns the h2 o_tree3_ e m e p of this varrio_tree.
    *
    * @return the h2 o_tree3_ e m e p of this varrio_tree
    */
    @Override
    public int getH2O_tree3_EMEP() {
        return _varrio_tree.getH2O_tree3_EMEP();
    }

    /**
    * Sets the h2 o_tree3_ e m e p of this varrio_tree.
    *
    * @param H2O_tree3_EMEP the h2 o_tree3_ e m e p of this varrio_tree
    */
    @Override
    public void setH2O_tree3_EMEP(int H2O_tree3_EMEP) {
        _varrio_tree.setH2O_tree3_EMEP(H2O_tree3_EMEP);
    }

    @Override
    public boolean isNew() {
        return _varrio_tree.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _varrio_tree.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _varrio_tree.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _varrio_tree.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _varrio_tree.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _varrio_tree.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _varrio_tree.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _varrio_tree.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _varrio_tree.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _varrio_tree.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _varrio_tree.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Varrio_treeWrapper((Varrio_tree) _varrio_tree.clone());
    }

    @Override
    public int compareTo(Varrio_tree varrio_tree) {
        return _varrio_tree.compareTo(varrio_tree);
    }

    @Override
    public int hashCode() {
        return _varrio_tree.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Varrio_tree> toCacheModel() {
        return _varrio_tree.toCacheModel();
    }

    @Override
    public Varrio_tree toEscapedModel() {
        return new Varrio_treeWrapper(_varrio_tree.toEscapedModel());
    }

    @Override
    public Varrio_tree toUnescapedModel() {
        return new Varrio_treeWrapper(_varrio_tree.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _varrio_tree.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _varrio_tree.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _varrio_tree.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Varrio_treeWrapper)) {
            return false;
        }

        Varrio_treeWrapper varrio_treeWrapper = (Varrio_treeWrapper) obj;

        if (Validator.equals(_varrio_tree, varrio_treeWrapper._varrio_tree)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Varrio_tree getWrappedVarrio_tree() {
        return _varrio_tree;
    }

    @Override
    public Varrio_tree getWrappedModel() {
        return _varrio_tree;
    }

    @Override
    public void resetOriginalValues() {
        _varrio_tree.resetOriginalValues();
    }
}
