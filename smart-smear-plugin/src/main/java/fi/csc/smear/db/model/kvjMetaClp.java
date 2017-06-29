package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.kvjMetaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class kvjMetaClp extends BaseModelImpl<kvjMeta> implements kvjMeta {
    private Date _samptime;
    private float _Tw2;
    private float _Tw5;
    private float _Tw10;
    private float _Tw15;
    private float _Tw20;
    private float _Tw25;
    private float _Tw30;
    private float _Tw35;
    private float _Tw40;
    private float _Tw45;
    private float _Tw50;
    private float _Tw60;
    private float _Tw70;
    private float _Tw80;
    private float _Tw100;
    private float _Tw120;
    private float _CO2w02;
    private float _CO2w15;
    private float _CO2w25;
    private float _CO2w70;
    private float _Glob;
    private float _RGlob;
    private float _LWin;
    private float _LWout;
    private float _PARw02;
    private float _PARw07;
    private float _PARw10;
    private float _Ta;
    private float _RH;
    private int _Tw2_EMEP;
    private int _Tw5_EMEP;
    private int _Tw10_EMEP;
    private int _Tw15_EMEP;
    private int _Tw20_EMEP;
    private int _Tw25_EMEP;
    private int _Tw30_EMEP;
    private int _Tw35_EMEP;
    private int _Tw40_EMEP;
    private int _Tw45_EMEP;
    private int _Tw50_EMEP;
    private int _Tw60_EMEP;
    private int _Tw70_EMEP;
    private int _Tw80_EMEP;
    private int _Tw100_EMEP;
    private int _Tw120_EMEP;
    private int _CO2w02_EMEP;
    private int _CO2w15_EMEP;
    private int _CO2w25_EMEP;
    private int _CO2w70_EMEP;
    private int _Glob_EMEP;
    private int _RGlob_EMEP;
    private int _LWin_EMEP;
    private int _LWout_EMEP;
    private int _PARw02_EMEP;
    private int _PARw07_EMEP;
    private int _PARw10_EMEP;
    private int _Ta_EMEP;
    private int _RH_EMEP;
    private BaseModel<?> _kvjMetaRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public kvjMetaClp() {
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

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_kvjMetaRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw2() {
        return _Tw2;
    }

    @Override
    public void setTw2(float Tw2) {
        _Tw2 = Tw2;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw2", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw5() {
        return _Tw5;
    }

    @Override
    public void setTw5(float Tw5) {
        _Tw5 = Tw5;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw5", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw10() {
        return _Tw10;
    }

    @Override
    public void setTw10(float Tw10) {
        _Tw10 = Tw10;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw10", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw10);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw15() {
        return _Tw15;
    }

    @Override
    public void setTw15(float Tw15) {
        _Tw15 = Tw15;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw15", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw15);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw20() {
        return _Tw20;
    }

    @Override
    public void setTw20(float Tw20) {
        _Tw20 = Tw20;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw20", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw20);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw25() {
        return _Tw25;
    }

    @Override
    public void setTw25(float Tw25) {
        _Tw25 = Tw25;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw25", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw25);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw30() {
        return _Tw30;
    }

    @Override
    public void setTw30(float Tw30) {
        _Tw30 = Tw30;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw30", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw30);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw35() {
        return _Tw35;
    }

    @Override
    public void setTw35(float Tw35) {
        _Tw35 = Tw35;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw35", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw35);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw40() {
        return _Tw40;
    }

    @Override
    public void setTw40(float Tw40) {
        _Tw40 = Tw40;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw40", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw40);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw45() {
        return _Tw45;
    }

    @Override
    public void setTw45(float Tw45) {
        _Tw45 = Tw45;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw45", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw45);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw50() {
        return _Tw50;
    }

    @Override
    public void setTw50(float Tw50) {
        _Tw50 = Tw50;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw50", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw50);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw60() {
        return _Tw60;
    }

    @Override
    public void setTw60(float Tw60) {
        _Tw60 = Tw60;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw60", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw60);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw70() {
        return _Tw70;
    }

    @Override
    public void setTw70(float Tw70) {
        _Tw70 = Tw70;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw70", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw70);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw80() {
        return _Tw80;
    }

    @Override
    public void setTw80(float Tw80) {
        _Tw80 = Tw80;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw80", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw80);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw100() {
        return _Tw100;
    }

    @Override
    public void setTw100(float Tw100) {
        _Tw100 = Tw100;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw100", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw100);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTw120() {
        return _Tw120;
    }

    @Override
    public void setTw120(float Tw120) {
        _Tw120 = Tw120;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw120", float.class);

                method.invoke(_kvjMetaRemoteModel, Tw120);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2w02() {
        return _CO2w02;
    }

    @Override
    public void setCO2w02(float CO2w02) {
        _CO2w02 = CO2w02;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w02", float.class);

                method.invoke(_kvjMetaRemoteModel, CO2w02);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2w15() {
        return _CO2w15;
    }

    @Override
    public void setCO2w15(float CO2w15) {
        _CO2w15 = CO2w15;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w15", float.class);

                method.invoke(_kvjMetaRemoteModel, CO2w15);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2w25() {
        return _CO2w25;
    }

    @Override
    public void setCO2w25(float CO2w25) {
        _CO2w25 = CO2w25;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w25", float.class);

                method.invoke(_kvjMetaRemoteModel, CO2w25);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCO2w70() {
        return _CO2w70;
    }

    @Override
    public void setCO2w70(float CO2w70) {
        _CO2w70 = CO2w70;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w70", float.class);

                method.invoke(_kvjMetaRemoteModel, CO2w70);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlob", float.class);

                method.invoke(_kvjMetaRemoteModel, Glob);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRGlob", float.class);

                method.invoke(_kvjMetaRemoteModel, RGlob);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWin", float.class);

                method.invoke(_kvjMetaRemoteModel, LWin);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWout", float.class);

                method.invoke(_kvjMetaRemoteModel, LWout);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARw02() {
        return _PARw02;
    }

    @Override
    public void setPARw02(float PARw02) {
        _PARw02 = PARw02;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw02", float.class);

                method.invoke(_kvjMetaRemoteModel, PARw02);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARw07() {
        return _PARw07;
    }

    @Override
    public void setPARw07(float PARw07) {
        _PARw07 = PARw07;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw07", float.class);

                method.invoke(_kvjMetaRemoteModel, PARw07);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getPARw10() {
        return _PARw10;
    }

    @Override
    public void setPARw10(float PARw10) {
        _PARw10 = PARw10;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw10", float.class);

                method.invoke(_kvjMetaRemoteModel, PARw10);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTa() {
        return _Ta;
    }

    @Override
    public void setTa(float Ta) {
        _Ta = Ta;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTa", float.class);

                method.invoke(_kvjMetaRemoteModel, Ta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getRH() {
        return _RH;
    }

    @Override
    public void setRH(float RH) {
        _RH = RH;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH", float.class);

                method.invoke(_kvjMetaRemoteModel, RH);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw2_EMEP() {
        return _Tw2_EMEP;
    }

    @Override
    public void setTw2_EMEP(int Tw2_EMEP) {
        _Tw2_EMEP = Tw2_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw2_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw2_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw5_EMEP() {
        return _Tw5_EMEP;
    }

    @Override
    public void setTw5_EMEP(int Tw5_EMEP) {
        _Tw5_EMEP = Tw5_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw5_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw5_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw10_EMEP() {
        return _Tw10_EMEP;
    }

    @Override
    public void setTw10_EMEP(int Tw10_EMEP) {
        _Tw10_EMEP = Tw10_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw10_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw10_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw15_EMEP() {
        return _Tw15_EMEP;
    }

    @Override
    public void setTw15_EMEP(int Tw15_EMEP) {
        _Tw15_EMEP = Tw15_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw15_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw15_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw20_EMEP() {
        return _Tw20_EMEP;
    }

    @Override
    public void setTw20_EMEP(int Tw20_EMEP) {
        _Tw20_EMEP = Tw20_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw20_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw20_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw25_EMEP() {
        return _Tw25_EMEP;
    }

    @Override
    public void setTw25_EMEP(int Tw25_EMEP) {
        _Tw25_EMEP = Tw25_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw25_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw25_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw30_EMEP() {
        return _Tw30_EMEP;
    }

    @Override
    public void setTw30_EMEP(int Tw30_EMEP) {
        _Tw30_EMEP = Tw30_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw30_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw30_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw35_EMEP() {
        return _Tw35_EMEP;
    }

    @Override
    public void setTw35_EMEP(int Tw35_EMEP) {
        _Tw35_EMEP = Tw35_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw35_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw35_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw40_EMEP() {
        return _Tw40_EMEP;
    }

    @Override
    public void setTw40_EMEP(int Tw40_EMEP) {
        _Tw40_EMEP = Tw40_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw40_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw40_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw45_EMEP() {
        return _Tw45_EMEP;
    }

    @Override
    public void setTw45_EMEP(int Tw45_EMEP) {
        _Tw45_EMEP = Tw45_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw45_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw45_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw50_EMEP() {
        return _Tw50_EMEP;
    }

    @Override
    public void setTw50_EMEP(int Tw50_EMEP) {
        _Tw50_EMEP = Tw50_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw50_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw50_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw60_EMEP() {
        return _Tw60_EMEP;
    }

    @Override
    public void setTw60_EMEP(int Tw60_EMEP) {
        _Tw60_EMEP = Tw60_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw60_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw60_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw70_EMEP() {
        return _Tw70_EMEP;
    }

    @Override
    public void setTw70_EMEP(int Tw70_EMEP) {
        _Tw70_EMEP = Tw70_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw70_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw70_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw80_EMEP() {
        return _Tw80_EMEP;
    }

    @Override
    public void setTw80_EMEP(int Tw80_EMEP) {
        _Tw80_EMEP = Tw80_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw80_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw80_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw100_EMEP() {
        return _Tw100_EMEP;
    }

    @Override
    public void setTw100_EMEP(int Tw100_EMEP) {
        _Tw100_EMEP = Tw100_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw100_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw100_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTw120_EMEP() {
        return _Tw120_EMEP;
    }

    @Override
    public void setTw120_EMEP(int Tw120_EMEP) {
        _Tw120_EMEP = Tw120_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTw120_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Tw120_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2w02_EMEP() {
        return _CO2w02_EMEP;
    }

    @Override
    public void setCO2w02_EMEP(int CO2w02_EMEP) {
        _CO2w02_EMEP = CO2w02_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w02_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, CO2w02_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2w15_EMEP() {
        return _CO2w15_EMEP;
    }

    @Override
    public void setCO2w15_EMEP(int CO2w15_EMEP) {
        _CO2w15_EMEP = CO2w15_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w15_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, CO2w15_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2w25_EMEP() {
        return _CO2w25_EMEP;
    }

    @Override
    public void setCO2w25_EMEP(int CO2w25_EMEP) {
        _CO2w25_EMEP = CO2w25_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w25_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, CO2w25_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCO2w70_EMEP() {
        return _CO2w70_EMEP;
    }

    @Override
    public void setCO2w70_EMEP(int CO2w70_EMEP) {
        _CO2w70_EMEP = CO2w70_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setCO2w70_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, CO2w70_EMEP);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setGlob_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Glob_EMEP);
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

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRGlob_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, RGlob_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLWin_EMEP() {
        return _LWin_EMEP;
    }

    @Override
    public void setLWin_EMEP(int LWin_EMEP) {
        _LWin_EMEP = LWin_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWin_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, LWin_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLWout_EMEP() {
        return _LWout_EMEP;
    }

    @Override
    public void setLWout_EMEP(int LWout_EMEP) {
        _LWout_EMEP = LWout_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setLWout_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, LWout_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARw02_EMEP() {
        return _PARw02_EMEP;
    }

    @Override
    public void setPARw02_EMEP(int PARw02_EMEP) {
        _PARw02_EMEP = PARw02_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw02_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, PARw02_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARw07_EMEP() {
        return _PARw07_EMEP;
    }

    @Override
    public void setPARw07_EMEP(int PARw07_EMEP) {
        _PARw07_EMEP = PARw07_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw07_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, PARw07_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPARw10_EMEP() {
        return _PARw10_EMEP;
    }

    @Override
    public void setPARw10_EMEP(int PARw10_EMEP) {
        _PARw10_EMEP = PARw10_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setPARw10_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, PARw10_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTa_EMEP() {
        return _Ta_EMEP;
    }

    @Override
    public void setTa_EMEP(int Ta_EMEP) {
        _Ta_EMEP = Ta_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setTa_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, Ta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRH_EMEP() {
        return _RH_EMEP;
    }

    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _RH_EMEP = RH_EMEP;

        if (_kvjMetaRemoteModel != null) {
            try {
                Class<?> clazz = _kvjMetaRemoteModel.getClass();

                Method method = clazz.getMethod("setRH_EMEP", int.class);

                method.invoke(_kvjMetaRemoteModel, RH_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getkvjMetaRemoteModel() {
        return _kvjMetaRemoteModel;
    }

    public void setkvjMetaRemoteModel(BaseModel<?> kvjMetaRemoteModel) {
        _kvjMetaRemoteModel = kvjMetaRemoteModel;
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

        Class<?> remoteModelClass = _kvjMetaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_kvjMetaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            kvjMetaLocalServiceUtil.addkvjMeta(this);
        } else {
            kvjMetaLocalServiceUtil.updatekvjMeta(this);
        }
    }

    @Override
    public kvjMeta toEscapedModel() {
        return (kvjMeta) ProxyUtil.newProxyInstance(kvjMeta.class.getClassLoader(),
            new Class[] { kvjMeta.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        kvjMetaClp clone = new kvjMetaClp();

        clone.setSamptime(getSamptime());
        clone.setTw2(getTw2());
        clone.setTw5(getTw5());
        clone.setTw10(getTw10());
        clone.setTw15(getTw15());
        clone.setTw20(getTw20());
        clone.setTw25(getTw25());
        clone.setTw30(getTw30());
        clone.setTw35(getTw35());
        clone.setTw40(getTw40());
        clone.setTw45(getTw45());
        clone.setTw50(getTw50());
        clone.setTw60(getTw60());
        clone.setTw70(getTw70());
        clone.setTw80(getTw80());
        clone.setTw100(getTw100());
        clone.setTw120(getTw120());
        clone.setCO2w02(getCO2w02());
        clone.setCO2w15(getCO2w15());
        clone.setCO2w25(getCO2w25());
        clone.setCO2w70(getCO2w70());
        clone.setGlob(getGlob());
        clone.setRGlob(getRGlob());
        clone.setLWin(getLWin());
        clone.setLWout(getLWout());
        clone.setPARw02(getPARw02());
        clone.setPARw07(getPARw07());
        clone.setPARw10(getPARw10());
        clone.setTa(getTa());
        clone.setRH(getRH());
        clone.setTw2_EMEP(getTw2_EMEP());
        clone.setTw5_EMEP(getTw5_EMEP());
        clone.setTw10_EMEP(getTw10_EMEP());
        clone.setTw15_EMEP(getTw15_EMEP());
        clone.setTw20_EMEP(getTw20_EMEP());
        clone.setTw25_EMEP(getTw25_EMEP());
        clone.setTw30_EMEP(getTw30_EMEP());
        clone.setTw35_EMEP(getTw35_EMEP());
        clone.setTw40_EMEP(getTw40_EMEP());
        clone.setTw45_EMEP(getTw45_EMEP());
        clone.setTw50_EMEP(getTw50_EMEP());
        clone.setTw60_EMEP(getTw60_EMEP());
        clone.setTw70_EMEP(getTw70_EMEP());
        clone.setTw80_EMEP(getTw80_EMEP());
        clone.setTw100_EMEP(getTw100_EMEP());
        clone.setTw120_EMEP(getTw120_EMEP());
        clone.setCO2w02_EMEP(getCO2w02_EMEP());
        clone.setCO2w15_EMEP(getCO2w15_EMEP());
        clone.setCO2w25_EMEP(getCO2w25_EMEP());
        clone.setCO2w70_EMEP(getCO2w70_EMEP());
        clone.setGlob_EMEP(getGlob_EMEP());
        clone.setRGlob_EMEP(getRGlob_EMEP());
        clone.setLWin_EMEP(getLWin_EMEP());
        clone.setLWout_EMEP(getLWout_EMEP());
        clone.setPARw02_EMEP(getPARw02_EMEP());
        clone.setPARw07_EMEP(getPARw07_EMEP());
        clone.setPARw10_EMEP(getPARw10_EMEP());
        clone.setTa_EMEP(getTa_EMEP());
        clone.setRH_EMEP(getRH_EMEP());

        return clone;
    }

    @Override
    public int compareTo(kvjMeta kvjMeta) {
        java.util.Date primaryKey = kvjMeta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof kvjMetaClp)) {
            return false;
        }

        kvjMetaClp kvjMeta = (kvjMetaClp) obj;

        java.util.Date primaryKey = kvjMeta.getPrimaryKey();

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
        StringBundler sb = new StringBundler(119);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", Tw2=");
        sb.append(getTw2());
        sb.append(", Tw5=");
        sb.append(getTw5());
        sb.append(", Tw10=");
        sb.append(getTw10());
        sb.append(", Tw15=");
        sb.append(getTw15());
        sb.append(", Tw20=");
        sb.append(getTw20());
        sb.append(", Tw25=");
        sb.append(getTw25());
        sb.append(", Tw30=");
        sb.append(getTw30());
        sb.append(", Tw35=");
        sb.append(getTw35());
        sb.append(", Tw40=");
        sb.append(getTw40());
        sb.append(", Tw45=");
        sb.append(getTw45());
        sb.append(", Tw50=");
        sb.append(getTw50());
        sb.append(", Tw60=");
        sb.append(getTw60());
        sb.append(", Tw70=");
        sb.append(getTw70());
        sb.append(", Tw80=");
        sb.append(getTw80());
        sb.append(", Tw100=");
        sb.append(getTw100());
        sb.append(", Tw120=");
        sb.append(getTw120());
        sb.append(", CO2w02=");
        sb.append(getCO2w02());
        sb.append(", CO2w15=");
        sb.append(getCO2w15());
        sb.append(", CO2w25=");
        sb.append(getCO2w25());
        sb.append(", CO2w70=");
        sb.append(getCO2w70());
        sb.append(", Glob=");
        sb.append(getGlob());
        sb.append(", RGlob=");
        sb.append(getRGlob());
        sb.append(", LWin=");
        sb.append(getLWin());
        sb.append(", LWout=");
        sb.append(getLWout());
        sb.append(", PARw02=");
        sb.append(getPARw02());
        sb.append(", PARw07=");
        sb.append(getPARw07());
        sb.append(", PARw10=");
        sb.append(getPARw10());
        sb.append(", Ta=");
        sb.append(getTa());
        sb.append(", RH=");
        sb.append(getRH());
        sb.append(", Tw2_EMEP=");
        sb.append(getTw2_EMEP());
        sb.append(", Tw5_EMEP=");
        sb.append(getTw5_EMEP());
        sb.append(", Tw10_EMEP=");
        sb.append(getTw10_EMEP());
        sb.append(", Tw15_EMEP=");
        sb.append(getTw15_EMEP());
        sb.append(", Tw20_EMEP=");
        sb.append(getTw20_EMEP());
        sb.append(", Tw25_EMEP=");
        sb.append(getTw25_EMEP());
        sb.append(", Tw30_EMEP=");
        sb.append(getTw30_EMEP());
        sb.append(", Tw35_EMEP=");
        sb.append(getTw35_EMEP());
        sb.append(", Tw40_EMEP=");
        sb.append(getTw40_EMEP());
        sb.append(", Tw45_EMEP=");
        sb.append(getTw45_EMEP());
        sb.append(", Tw50_EMEP=");
        sb.append(getTw50_EMEP());
        sb.append(", Tw60_EMEP=");
        sb.append(getTw60_EMEP());
        sb.append(", Tw70_EMEP=");
        sb.append(getTw70_EMEP());
        sb.append(", Tw80_EMEP=");
        sb.append(getTw80_EMEP());
        sb.append(", Tw100_EMEP=");
        sb.append(getTw100_EMEP());
        sb.append(", Tw120_EMEP=");
        sb.append(getTw120_EMEP());
        sb.append(", CO2w02_EMEP=");
        sb.append(getCO2w02_EMEP());
        sb.append(", CO2w15_EMEP=");
        sb.append(getCO2w15_EMEP());
        sb.append(", CO2w25_EMEP=");
        sb.append(getCO2w25_EMEP());
        sb.append(", CO2w70_EMEP=");
        sb.append(getCO2w70_EMEP());
        sb.append(", Glob_EMEP=");
        sb.append(getGlob_EMEP());
        sb.append(", RGlob_EMEP=");
        sb.append(getRGlob_EMEP());
        sb.append(", LWin_EMEP=");
        sb.append(getLWin_EMEP());
        sb.append(", LWout_EMEP=");
        sb.append(getLWout_EMEP());
        sb.append(", PARw02_EMEP=");
        sb.append(getPARw02_EMEP());
        sb.append(", PARw07_EMEP=");
        sb.append(getPARw07_EMEP());
        sb.append(", PARw10_EMEP=");
        sb.append(getPARw10_EMEP());
        sb.append(", Ta_EMEP=");
        sb.append(getTa_EMEP());
        sb.append(", RH_EMEP=");
        sb.append(getRH_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(181);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.kvjMeta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw2</column-name><column-value><![CDATA[");
        sb.append(getTw2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw5</column-name><column-value><![CDATA[");
        sb.append(getTw5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw10</column-name><column-value><![CDATA[");
        sb.append(getTw10());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw15</column-name><column-value><![CDATA[");
        sb.append(getTw15());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw20</column-name><column-value><![CDATA[");
        sb.append(getTw20());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw25</column-name><column-value><![CDATA[");
        sb.append(getTw25());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw30</column-name><column-value><![CDATA[");
        sb.append(getTw30());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw35</column-name><column-value><![CDATA[");
        sb.append(getTw35());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw40</column-name><column-value><![CDATA[");
        sb.append(getTw40());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw45</column-name><column-value><![CDATA[");
        sb.append(getTw45());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw50</column-name><column-value><![CDATA[");
        sb.append(getTw50());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw60</column-name><column-value><![CDATA[");
        sb.append(getTw60());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw70</column-name><column-value><![CDATA[");
        sb.append(getTw70());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw80</column-name><column-value><![CDATA[");
        sb.append(getTw80());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw100</column-name><column-value><![CDATA[");
        sb.append(getTw100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw120</column-name><column-value><![CDATA[");
        sb.append(getTw120());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w02</column-name><column-value><![CDATA[");
        sb.append(getCO2w02());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w15</column-name><column-value><![CDATA[");
        sb.append(getCO2w15());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w25</column-name><column-value><![CDATA[");
        sb.append(getCO2w25());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w70</column-name><column-value><![CDATA[");
        sb.append(getCO2w70());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Glob</column-name><column-value><![CDATA[");
        sb.append(getGlob());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RGlob</column-name><column-value><![CDATA[");
        sb.append(getRGlob());
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
            "<column><column-name>PARw02</column-name><column-value><![CDATA[");
        sb.append(getPARw02());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARw07</column-name><column-value><![CDATA[");
        sb.append(getPARw07());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARw10</column-name><column-value><![CDATA[");
        sb.append(getPARw10());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Ta</column-name><column-value><![CDATA[");
        sb.append(getTa());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH</column-name><column-value><![CDATA[");
        sb.append(getRH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw2_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw2_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw5_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw5_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw10_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw10_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw15_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw15_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw20_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw20_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw25_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw25_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw30_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw30_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw35_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw35_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw40_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw40_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw45_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw45_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw50_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw50_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw60_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw60_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw70_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw70_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw80_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw80_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw100_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw100_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Tw120_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTw120_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w02_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2w02_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w15_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2w15_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w25_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2w25_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CO2w70_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCO2w70_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Glob_EMEP</column-name><column-value><![CDATA[");
        sb.append(getGlob_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RGlob_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRGlob_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LWin_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLWin_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LWout_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLWout_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARw02_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARw02_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARw07_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARw07_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PARw10_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPARw10_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Ta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTa_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRH_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
