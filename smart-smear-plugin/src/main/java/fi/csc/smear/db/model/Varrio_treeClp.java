package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Varrio_treeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Varrio_treeClp extends BaseModelImpl<Varrio_tree>
    implements Varrio_tree {
    private Date _SAMPTIME;
    private float _F_CO2_tree0;
    private float _F_H2O_tree0;
    private float _Tcuv_tree0;
    private float _PARcuv_tree0;
    private float _CO2_tree0;
    private float _H2O_tree0;
    private float _F_CO2_tree1;
    private float _F_H2O_tree1;
    private float _Tcuv_tree1;
    private float _PARcuv_tree1;
    private float _CO2_tree1;
    private float _H2O_tree1;
    private float _F_CO2_tree2;
    private float _F_H2O_tree2;
    private float _Tcuv_tree2;
    private float _PARcuv_tree2;
    private float _CO2_tree2;
    private float _H2O_tree2;
    private float _F_CO2_tree3;
    private float _F_H2O_tree3;
    private float _Tcuv_tree3;
    private float _PARcuv_tree3;
    private float _CO2_tree3;
    private float _H2O_tree3;
    private int _F_CO2_tree0_EMEP;
    private int _F_H2O_tree0_EMEP;
    private int _Tcuv_tree0_EMEP;
    private int _PARcuv_tree0_EMEP;
    private int _CO2_tree0_EMEP;
    private int _H2O_tree0_EMEP;
    private int _F_CO2_tree1_EMEP;
    private int _F_H2O_tree1_EMEP;
    private int _Tcuv_tree1_EMEP;
    private int _PARcuv_tree1_EMEP;
    private int _CO2_tree1_EMEP;
    private int _H2O_tree1_EMEP;
    private int _F_CO2_tree2_EMEP;
    private int _F_H2O_tree2_EMEP;
    private int _Tcuv_tree2_EMEP;
    private int _PARcuv_tree2_EMEP;
    private int _CO2_tree2_EMEP;
    private int _H2O_tree2_EMEP;
    private int _F_CO2_tree3_EMEP;
    private int _F_H2O_tree3_EMEP;
    private int _Tcuv_tree3_EMEP;
    private int _PARcuv_tree3_EMEP;
    private int _CO2_tree3_EMEP;
    private int _H2O_tree3_EMEP;
    private BaseModel<?> _varrio_treeRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Varrio_treeClp() {
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

    @Override
    public Date getSAMPTIME() {
        return _SAMPTIME;
    }

    @Override
    public void setSAMPTIME(Date SAMPTIME) {
        _SAMPTIME = SAMPTIME;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setSAMPTIME", Date.class);

                method.invoke(_varrio_treeRemoteModel, SAMPTIME);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CO2_tree0() {
        return _F_CO2_tree0;
    }

    @Override
    public void setF_CO2_tree0(float F_CO2_tree0) {
        _F_CO2_tree0 = F_CO2_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_tree0() {
        return _F_H2O_tree0;
    }

    @Override
    public void setF_H2O_tree0(float F_H2O_tree0) {
        _F_H2O_tree0 = F_H2O_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTcuv_tree0() {
        return _Tcuv_tree0;
    }

    @Override
    public void setTcuv_tree0(float Tcuv_tree0) {
        _Tcuv_tree0 = Tcuv_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARcuv_tree0() {
        return _PARcuv_tree0;
    }

    @Override
    public void setPARcuv_tree0(float PARcuv_tree0) {
        _PARcuv_tree0 = PARcuv_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2_tree0() {
        return _CO2_tree0;
    }

    @Override
    public void setCO2_tree0(float CO2_tree0) {
        _CO2_tree0 = CO2_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O_tree0() {
        return _H2O_tree0;
    }

    @Override
    public void setH2O_tree0(float H2O_tree0) {
        _H2O_tree0 = H2O_tree0;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree0", float.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree0);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CO2_tree1() {
        return _F_CO2_tree1;
    }

    @Override
    public void setF_CO2_tree1(float F_CO2_tree1) {
        _F_CO2_tree1 = F_CO2_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_tree1() {
        return _F_H2O_tree1;
    }

    @Override
    public void setF_H2O_tree1(float F_H2O_tree1) {
        _F_H2O_tree1 = F_H2O_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTcuv_tree1() {
        return _Tcuv_tree1;
    }

    @Override
    public void setTcuv_tree1(float Tcuv_tree1) {
        _Tcuv_tree1 = Tcuv_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARcuv_tree1() {
        return _PARcuv_tree1;
    }

    @Override
    public void setPARcuv_tree1(float PARcuv_tree1) {
        _PARcuv_tree1 = PARcuv_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2_tree1() {
        return _CO2_tree1;
    }

    @Override
    public void setCO2_tree1(float CO2_tree1) {
        _CO2_tree1 = CO2_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O_tree1() {
        return _H2O_tree1;
    }

    @Override
    public void setH2O_tree1(float H2O_tree1) {
        _H2O_tree1 = H2O_tree1;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree1", float.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CO2_tree2() {
        return _F_CO2_tree2;
    }

    @Override
    public void setF_CO2_tree2(float F_CO2_tree2) {
        _F_CO2_tree2 = F_CO2_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_tree2() {
        return _F_H2O_tree2;
    }

    @Override
    public void setF_H2O_tree2(float F_H2O_tree2) {
        _F_H2O_tree2 = F_H2O_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTcuv_tree2() {
        return _Tcuv_tree2;
    }

    @Override
    public void setTcuv_tree2(float Tcuv_tree2) {
        _Tcuv_tree2 = Tcuv_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARcuv_tree2() {
        return _PARcuv_tree2;
    }

    @Override
    public void setPARcuv_tree2(float PARcuv_tree2) {
        _PARcuv_tree2 = PARcuv_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2_tree2() {
        return _CO2_tree2;
    }

    @Override
    public void setCO2_tree2(float CO2_tree2) {
        _CO2_tree2 = CO2_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O_tree2() {
        return _H2O_tree2;
    }

    @Override
    public void setH2O_tree2(float H2O_tree2) {
        _H2O_tree2 = H2O_tree2;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree2", float.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CO2_tree3() {
        return _F_CO2_tree3;
    }

    @Override
    public void setF_CO2_tree3(float F_CO2_tree3) {
        _F_CO2_tree3 = F_CO2_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_tree3() {
        return _F_H2O_tree3;
    }

    @Override
    public void setF_H2O_tree3(float F_H2O_tree3) {
        _F_H2O_tree3 = F_H2O_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTcuv_tree3() {
        return _Tcuv_tree3;
    }

    @Override
    public void setTcuv_tree3(float Tcuv_tree3) {
        _Tcuv_tree3 = Tcuv_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARcuv_tree3() {
        return _PARcuv_tree3;
    }

    @Override
    public void setPARcuv_tree3(float PARcuv_tree3) {
        _PARcuv_tree3 = PARcuv_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2_tree3() {
        return _CO2_tree3;
    }

    @Override
    public void setCO2_tree3(float CO2_tree3) {
        _CO2_tree3 = CO2_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O_tree3() {
        return _H2O_tree3;
    }

    @Override
    public void setH2O_tree3(float H2O_tree3) {
        _H2O_tree3 = H2O_tree3;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree3", float.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CO2_tree0_EMEP() {
        return _F_CO2_tree0_EMEP;
    }

    @Override
    public void setF_CO2_tree0_EMEP(int F_CO2_tree0_EMEP) {
        _F_CO2_tree0_EMEP = F_CO2_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree0_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_tree0_EMEP() {
        return _F_H2O_tree0_EMEP;
    }

    @Override
    public void setF_H2O_tree0_EMEP(int F_H2O_tree0_EMEP) {
        _F_H2O_tree0_EMEP = F_H2O_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree0_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTcuv_tree0_EMEP() {
        return _Tcuv_tree0_EMEP;
    }

    @Override
    public void setTcuv_tree0_EMEP(int Tcuv_tree0_EMEP) {
        _Tcuv_tree0_EMEP = Tcuv_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree0_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARcuv_tree0_EMEP() {
        return _PARcuv_tree0_EMEP;
    }

    @Override
    public void setPARcuv_tree0_EMEP(int PARcuv_tree0_EMEP) {
        _PARcuv_tree0_EMEP = PARcuv_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree0_EMEP",
                        int.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2_tree0_EMEP() {
        return _CO2_tree0_EMEP;
    }

    @Override
    public void setCO2_tree0_EMEP(int CO2_tree0_EMEP) {
        _CO2_tree0_EMEP = CO2_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree0_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH2O_tree0_EMEP() {
        return _H2O_tree0_EMEP;
    }

    @Override
    public void setH2O_tree0_EMEP(int H2O_tree0_EMEP) {
        _H2O_tree0_EMEP = H2O_tree0_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree0_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree0_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CO2_tree1_EMEP() {
        return _F_CO2_tree1_EMEP;
    }

    @Override
    public void setF_CO2_tree1_EMEP(int F_CO2_tree1_EMEP) {
        _F_CO2_tree1_EMEP = F_CO2_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree1_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_tree1_EMEP() {
        return _F_H2O_tree1_EMEP;
    }

    @Override
    public void setF_H2O_tree1_EMEP(int F_H2O_tree1_EMEP) {
        _F_H2O_tree1_EMEP = F_H2O_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree1_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTcuv_tree1_EMEP() {
        return _Tcuv_tree1_EMEP;
    }

    @Override
    public void setTcuv_tree1_EMEP(int Tcuv_tree1_EMEP) {
        _Tcuv_tree1_EMEP = Tcuv_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree1_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARcuv_tree1_EMEP() {
        return _PARcuv_tree1_EMEP;
    }

    @Override
    public void setPARcuv_tree1_EMEP(int PARcuv_tree1_EMEP) {
        _PARcuv_tree1_EMEP = PARcuv_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree1_EMEP",
                        int.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2_tree1_EMEP() {
        return _CO2_tree1_EMEP;
    }

    @Override
    public void setCO2_tree1_EMEP(int CO2_tree1_EMEP) {
        _CO2_tree1_EMEP = CO2_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree1_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH2O_tree1_EMEP() {
        return _H2O_tree1_EMEP;
    }

    @Override
    public void setH2O_tree1_EMEP(int H2O_tree1_EMEP) {
        _H2O_tree1_EMEP = H2O_tree1_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree1_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree1_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CO2_tree2_EMEP() {
        return _F_CO2_tree2_EMEP;
    }

    @Override
    public void setF_CO2_tree2_EMEP(int F_CO2_tree2_EMEP) {
        _F_CO2_tree2_EMEP = F_CO2_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree2_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_tree2_EMEP() {
        return _F_H2O_tree2_EMEP;
    }

    @Override
    public void setF_H2O_tree2_EMEP(int F_H2O_tree2_EMEP) {
        _F_H2O_tree2_EMEP = F_H2O_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree2_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTcuv_tree2_EMEP() {
        return _Tcuv_tree2_EMEP;
    }

    @Override
    public void setTcuv_tree2_EMEP(int Tcuv_tree2_EMEP) {
        _Tcuv_tree2_EMEP = Tcuv_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree2_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARcuv_tree2_EMEP() {
        return _PARcuv_tree2_EMEP;
    }

    @Override
    public void setPARcuv_tree2_EMEP(int PARcuv_tree2_EMEP) {
        _PARcuv_tree2_EMEP = PARcuv_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree2_EMEP",
                        int.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2_tree2_EMEP() {
        return _CO2_tree2_EMEP;
    }

    @Override
    public void setCO2_tree2_EMEP(int CO2_tree2_EMEP) {
        _CO2_tree2_EMEP = CO2_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree2_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH2O_tree2_EMEP() {
        return _H2O_tree2_EMEP;
    }

    @Override
    public void setH2O_tree2_EMEP(int H2O_tree2_EMEP) {
        _H2O_tree2_EMEP = H2O_tree2_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree2_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CO2_tree3_EMEP() {
        return _F_CO2_tree3_EMEP;
    }

    @Override
    public void setF_CO2_tree3_EMEP(int F_CO2_tree3_EMEP) {
        _F_CO2_tree3_EMEP = F_CO2_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CO2_tree3_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_CO2_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_tree3_EMEP() {
        return _F_H2O_tree3_EMEP;
    }

    @Override
    public void setF_H2O_tree3_EMEP(int F_H2O_tree3_EMEP) {
        _F_H2O_tree3_EMEP = F_H2O_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_tree3_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, F_H2O_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTcuv_tree3_EMEP() {
        return _Tcuv_tree3_EMEP;
    }

    @Override
    public void setTcuv_tree3_EMEP(int Tcuv_tree3_EMEP) {
        _Tcuv_tree3_EMEP = Tcuv_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setTcuv_tree3_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, Tcuv_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARcuv_tree3_EMEP() {
        return _PARcuv_tree3_EMEP;
    }

    @Override
    public void setPARcuv_tree3_EMEP(int PARcuv_tree3_EMEP) {
        _PARcuv_tree3_EMEP = PARcuv_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setPARcuv_tree3_EMEP",
                        int.class);

                method.invoke(_varrio_treeRemoteModel, PARcuv_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2_tree3_EMEP() {
        return _CO2_tree3_EMEP;
    }

    @Override
    public void setCO2_tree3_EMEP(int CO2_tree3_EMEP) {
        _CO2_tree3_EMEP = CO2_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2_tree3_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, CO2_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH2O_tree3_EMEP() {
        return _H2O_tree3_EMEP;
    }

    @Override
    public void setH2O_tree3_EMEP(int H2O_tree3_EMEP) {
        _H2O_tree3_EMEP = H2O_tree3_EMEP;

        if (_varrio_treeRemoteModel != null) {
            try {
                Class<?> clazz = _varrio_treeRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_tree3_EMEP", int.class);

                method.invoke(_varrio_treeRemoteModel, H2O_tree3_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getVarrio_treeRemoteModel() {
        return _varrio_treeRemoteModel;
    }

    public void setVarrio_treeRemoteModel(BaseModel<?> varrio_treeRemoteModel) {
        _varrio_treeRemoteModel = varrio_treeRemoteModel;
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

        Class<?> remoteModelClass = _varrio_treeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_varrio_treeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Varrio_treeLocalServiceUtil.addVarrio_tree(this);
        } else {
            Varrio_treeLocalServiceUtil.updateVarrio_tree(this);
        }
    }

    @Override
    public Varrio_tree toEscapedModel() {
        return (Varrio_tree) ProxyUtil.newProxyInstance(Varrio_tree.class.getClassLoader(),
            new Class[] { Varrio_tree.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Varrio_treeClp clone = new Varrio_treeClp();

        clone.setSAMPTIME(getSAMPTIME());
        clone.setF_CO2_tree0(getF_CO2_tree0());
        clone.setF_H2O_tree0(getF_H2O_tree0());
        clone.setTcuv_tree0(getTcuv_tree0());
        clone.setPARcuv_tree0(getPARcuv_tree0());
        clone.setCO2_tree0(getCO2_tree0());
        clone.setH2O_tree0(getH2O_tree0());
        clone.setF_CO2_tree1(getF_CO2_tree1());
        clone.setF_H2O_tree1(getF_H2O_tree1());
        clone.setTcuv_tree1(getTcuv_tree1());
        clone.setPARcuv_tree1(getPARcuv_tree1());
        clone.setCO2_tree1(getCO2_tree1());
        clone.setH2O_tree1(getH2O_tree1());
        clone.setF_CO2_tree2(getF_CO2_tree2());
        clone.setF_H2O_tree2(getF_H2O_tree2());
        clone.setTcuv_tree2(getTcuv_tree2());
        clone.setPARcuv_tree2(getPARcuv_tree2());
        clone.setCO2_tree2(getCO2_tree2());
        clone.setH2O_tree2(getH2O_tree2());
        clone.setF_CO2_tree3(getF_CO2_tree3());
        clone.setF_H2O_tree3(getF_H2O_tree3());
        clone.setTcuv_tree3(getTcuv_tree3());
        clone.setPARcuv_tree3(getPARcuv_tree3());
        clone.setCO2_tree3(getCO2_tree3());
        clone.setH2O_tree3(getH2O_tree3());
        clone.setF_CO2_tree0_EMEP(getF_CO2_tree0_EMEP());
        clone.setF_H2O_tree0_EMEP(getF_H2O_tree0_EMEP());
        clone.setTcuv_tree0_EMEP(getTcuv_tree0_EMEP());
        clone.setPARcuv_tree0_EMEP(getPARcuv_tree0_EMEP());
        clone.setCO2_tree0_EMEP(getCO2_tree0_EMEP());
        clone.setH2O_tree0_EMEP(getH2O_tree0_EMEP());
        clone.setF_CO2_tree1_EMEP(getF_CO2_tree1_EMEP());
        clone.setF_H2O_tree1_EMEP(getF_H2O_tree1_EMEP());
        clone.setTcuv_tree1_EMEP(getTcuv_tree1_EMEP());
        clone.setPARcuv_tree1_EMEP(getPARcuv_tree1_EMEP());
        clone.setCO2_tree1_EMEP(getCO2_tree1_EMEP());
        clone.setH2O_tree1_EMEP(getH2O_tree1_EMEP());
        clone.setF_CO2_tree2_EMEP(getF_CO2_tree2_EMEP());
        clone.setF_H2O_tree2_EMEP(getF_H2O_tree2_EMEP());
        clone.setTcuv_tree2_EMEP(getTcuv_tree2_EMEP());
        clone.setPARcuv_tree2_EMEP(getPARcuv_tree2_EMEP());
        clone.setCO2_tree2_EMEP(getCO2_tree2_EMEP());
        clone.setH2O_tree2_EMEP(getH2O_tree2_EMEP());
        clone.setF_CO2_tree3_EMEP(getF_CO2_tree3_EMEP());
        clone.setF_H2O_tree3_EMEP(getF_H2O_tree3_EMEP());
        clone.setTcuv_tree3_EMEP(getTcuv_tree3_EMEP());
        clone.setPARcuv_tree3_EMEP(getPARcuv_tree3_EMEP());
        clone.setCO2_tree3_EMEP(getCO2_tree3_EMEP());
        clone.setH2O_tree3_EMEP(getH2O_tree3_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Varrio_tree varrio_tree) {
        java.util.Date primaryKey = varrio_tree.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Varrio_treeClp)) {
            return false;
        }

        Varrio_treeClp varrio_tree = (Varrio_treeClp) obj;

        java.util.Date primaryKey = varrio_tree.getPrimaryKey();

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
        StringBundler sb = new StringBundler(99);

        sb.append("{SAMPTIME=");
        sb.append(getSAMPTIME());
        sb.append(", F_CO2_tree0=");
        sb.append(getF_CO2_tree0());
        sb.append(", F_H2O_tree0=");
        sb.append(getF_H2O_tree0());
        sb.append(", Tcuv_tree0=");
        sb.append(getTcuv_tree0());
        sb.append(", PARcuv_tree0=");
        sb.append(getPARcuv_tree0());
        sb.append(", CO2_tree0=");
        sb.append(getCO2_tree0());
        sb.append(", H2O_tree0=");
        sb.append(getH2O_tree0());
        sb.append(", F_CO2_tree1=");
        sb.append(getF_CO2_tree1());
        sb.append(", F_H2O_tree1=");
        sb.append(getF_H2O_tree1());
        sb.append(", Tcuv_tree1=");
        sb.append(getTcuv_tree1());
        sb.append(", PARcuv_tree1=");
        sb.append(getPARcuv_tree1());
        sb.append(", CO2_tree1=");
        sb.append(getCO2_tree1());
        sb.append(", H2O_tree1=");
        sb.append(getH2O_tree1());
        sb.append(", F_CO2_tree2=");
        sb.append(getF_CO2_tree2());
        sb.append(", F_H2O_tree2=");
        sb.append(getF_H2O_tree2());
        sb.append(", Tcuv_tree2=");
        sb.append(getTcuv_tree2());
        sb.append(", PARcuv_tree2=");
        sb.append(getPARcuv_tree2());
        sb.append(", CO2_tree2=");
        sb.append(getCO2_tree2());
        sb.append(", H2O_tree2=");
        sb.append(getH2O_tree2());
        sb.append(", F_CO2_tree3=");
        sb.append(getF_CO2_tree3());
        sb.append(", F_H2O_tree3=");
        sb.append(getF_H2O_tree3());
        sb.append(", Tcuv_tree3=");
        sb.append(getTcuv_tree3());
        sb.append(", PARcuv_tree3=");
        sb.append(getPARcuv_tree3());
        sb.append(", CO2_tree3=");
        sb.append(getCO2_tree3());
        sb.append(", H2O_tree3=");
        sb.append(getH2O_tree3());
        sb.append(", F_CO2_tree0_EMEP=");
        sb.append(getF_CO2_tree0_EMEP());
        sb.append(", F_H2O_tree0_EMEP=");
        sb.append(getF_H2O_tree0_EMEP());
        sb.append(", Tcuv_tree0_EMEP=");
        sb.append(getTcuv_tree0_EMEP());
        sb.append(", PARcuv_tree0_EMEP=");
        sb.append(getPARcuv_tree0_EMEP());
        sb.append(", CO2_tree0_EMEP=");
        sb.append(getCO2_tree0_EMEP());
        sb.append(", H2O_tree0_EMEP=");
        sb.append(getH2O_tree0_EMEP());
        sb.append(", F_CO2_tree1_EMEP=");
        sb.append(getF_CO2_tree1_EMEP());
        sb.append(", F_H2O_tree1_EMEP=");
        sb.append(getF_H2O_tree1_EMEP());
        sb.append(", Tcuv_tree1_EMEP=");
        sb.append(getTcuv_tree1_EMEP());
        sb.append(", PARcuv_tree1_EMEP=");
        sb.append(getPARcuv_tree1_EMEP());
        sb.append(", CO2_tree1_EMEP=");
        sb.append(getCO2_tree1_EMEP());
        sb.append(", H2O_tree1_EMEP=");
        sb.append(getH2O_tree1_EMEP());
        sb.append(", F_CO2_tree2_EMEP=");
        sb.append(getF_CO2_tree2_EMEP());
        sb.append(", F_H2O_tree2_EMEP=");
        sb.append(getF_H2O_tree2_EMEP());
        sb.append(", Tcuv_tree2_EMEP=");
        sb.append(getTcuv_tree2_EMEP());
        sb.append(", PARcuv_tree2_EMEP=");
        sb.append(getPARcuv_tree2_EMEP());
        sb.append(", CO2_tree2_EMEP=");
        sb.append(getCO2_tree2_EMEP());
        sb.append(", H2O_tree2_EMEP=");
        sb.append(getH2O_tree2_EMEP());
        sb.append(", F_CO2_tree3_EMEP=");
        sb.append(getF_CO2_tree3_EMEP());
        sb.append(", F_H2O_tree3_EMEP=");
        sb.append(getF_H2O_tree3_EMEP());
        sb.append(", Tcuv_tree3_EMEP=");
        sb.append(getTcuv_tree3_EMEP());
        sb.append(", PARcuv_tree3_EMEP=");
        sb.append(getPARcuv_tree3_EMEP());
        sb.append(", CO2_tree3_EMEP=");
        sb.append(getCO2_tree3_EMEP());
        sb.append(", H2O_tree3_EMEP=");
        sb.append(getH2O_tree3_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(151);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Varrio_tree");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>SAMPTIME</column-name><column-value><![CDATA[");
        sb.append(getSAMPTIME());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree0</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree0</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree0</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree0</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree0</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree0</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree0());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree1</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree1</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree1</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree1</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree1</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree1</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree2</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree2</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree2</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree2</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree2</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree2</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree3</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree3</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree3</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree3</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree3</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree3</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree0_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree0_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree1_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree1_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CO2_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CO2_tree3_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_tree3_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tcuv_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTcuv_tree3_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARcuv_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARcuv_tree3_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2_tree3_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_tree3_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH2O_tree3_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
