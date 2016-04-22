package fi.csc.smear.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.smear.db.service.http.Varrio_treeServiceSoap}.
 *
 * @author pj
 * @see fi.csc.smear.db.service.http.Varrio_treeServiceSoap
 * @generated
 */
public class Varrio_treeSoap implements Serializable {
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

    public Varrio_treeSoap() {
    }

    public static Varrio_treeSoap toSoapModel(Varrio_tree model) {
        Varrio_treeSoap soapModel = new Varrio_treeSoap();

        soapModel.setSAMPTIME(model.getSAMPTIME());
        soapModel.setF_CO2_tree0(model.getF_CO2_tree0());
        soapModel.setF_H2O_tree0(model.getF_H2O_tree0());
        soapModel.setTcuv_tree0(model.getTcuv_tree0());
        soapModel.setPARcuv_tree0(model.getPARcuv_tree0());
        soapModel.setCO2_tree0(model.getCO2_tree0());
        soapModel.setH2O_tree0(model.getH2O_tree0());
        soapModel.setF_CO2_tree1(model.getF_CO2_tree1());
        soapModel.setF_H2O_tree1(model.getF_H2O_tree1());
        soapModel.setTcuv_tree1(model.getTcuv_tree1());
        soapModel.setPARcuv_tree1(model.getPARcuv_tree1());
        soapModel.setCO2_tree1(model.getCO2_tree1());
        soapModel.setH2O_tree1(model.getH2O_tree1());
        soapModel.setF_CO2_tree2(model.getF_CO2_tree2());
        soapModel.setF_H2O_tree2(model.getF_H2O_tree2());
        soapModel.setTcuv_tree2(model.getTcuv_tree2());
        soapModel.setPARcuv_tree2(model.getPARcuv_tree2());
        soapModel.setCO2_tree2(model.getCO2_tree2());
        soapModel.setH2O_tree2(model.getH2O_tree2());
        soapModel.setF_CO2_tree3(model.getF_CO2_tree3());
        soapModel.setF_H2O_tree3(model.getF_H2O_tree3());
        soapModel.setTcuv_tree3(model.getTcuv_tree3());
        soapModel.setPARcuv_tree3(model.getPARcuv_tree3());
        soapModel.setCO2_tree3(model.getCO2_tree3());
        soapModel.setH2O_tree3(model.getH2O_tree3());
        soapModel.setF_CO2_tree0_EMEP(model.getF_CO2_tree0_EMEP());
        soapModel.setF_H2O_tree0_EMEP(model.getF_H2O_tree0_EMEP());
        soapModel.setTcuv_tree0_EMEP(model.getTcuv_tree0_EMEP());
        soapModel.setPARcuv_tree0_EMEP(model.getPARcuv_tree0_EMEP());
        soapModel.setCO2_tree0_EMEP(model.getCO2_tree0_EMEP());
        soapModel.setH2O_tree0_EMEP(model.getH2O_tree0_EMEP());
        soapModel.setF_CO2_tree1_EMEP(model.getF_CO2_tree1_EMEP());
        soapModel.setF_H2O_tree1_EMEP(model.getF_H2O_tree1_EMEP());
        soapModel.setTcuv_tree1_EMEP(model.getTcuv_tree1_EMEP());
        soapModel.setPARcuv_tree1_EMEP(model.getPARcuv_tree1_EMEP());
        soapModel.setCO2_tree1_EMEP(model.getCO2_tree1_EMEP());
        soapModel.setH2O_tree1_EMEP(model.getH2O_tree1_EMEP());
        soapModel.setF_CO2_tree2_EMEP(model.getF_CO2_tree2_EMEP());
        soapModel.setF_H2O_tree2_EMEP(model.getF_H2O_tree2_EMEP());
        soapModel.setTcuv_tree2_EMEP(model.getTcuv_tree2_EMEP());
        soapModel.setPARcuv_tree2_EMEP(model.getPARcuv_tree2_EMEP());
        soapModel.setCO2_tree2_EMEP(model.getCO2_tree2_EMEP());
        soapModel.setH2O_tree2_EMEP(model.getH2O_tree2_EMEP());
        soapModel.setF_CO2_tree3_EMEP(model.getF_CO2_tree3_EMEP());
        soapModel.setF_H2O_tree3_EMEP(model.getF_H2O_tree3_EMEP());
        soapModel.setTcuv_tree3_EMEP(model.getTcuv_tree3_EMEP());
        soapModel.setPARcuv_tree3_EMEP(model.getPARcuv_tree3_EMEP());
        soapModel.setCO2_tree3_EMEP(model.getCO2_tree3_EMEP());
        soapModel.setH2O_tree3_EMEP(model.getH2O_tree3_EMEP());

        return soapModel;
    }

    public static Varrio_treeSoap[] toSoapModels(Varrio_tree[] models) {
        Varrio_treeSoap[] soapModels = new Varrio_treeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Varrio_treeSoap[][] toSoapModels(Varrio_tree[][] models) {
        Varrio_treeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Varrio_treeSoap[models.length][models[0].length];
        } else {
            soapModels = new Varrio_treeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Varrio_treeSoap[] toSoapModels(List<Varrio_tree> models) {
        List<Varrio_treeSoap> soapModels = new ArrayList<Varrio_treeSoap>(models.size());

        for (Varrio_tree model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Varrio_treeSoap[soapModels.size()]);
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

    public float getF_CO2_tree0() {
        return _F_CO2_tree0;
    }

    public void setF_CO2_tree0(float F_CO2_tree0) {
        _F_CO2_tree0 = F_CO2_tree0;
    }

    public float getF_H2O_tree0() {
        return _F_H2O_tree0;
    }

    public void setF_H2O_tree0(float F_H2O_tree0) {
        _F_H2O_tree0 = F_H2O_tree0;
    }

    public float getTcuv_tree0() {
        return _Tcuv_tree0;
    }

    public void setTcuv_tree0(float Tcuv_tree0) {
        _Tcuv_tree0 = Tcuv_tree0;
    }

    public float getPARcuv_tree0() {
        return _PARcuv_tree0;
    }

    public void setPARcuv_tree0(float PARcuv_tree0) {
        _PARcuv_tree0 = PARcuv_tree0;
    }

    public float getCO2_tree0() {
        return _CO2_tree0;
    }

    public void setCO2_tree0(float CO2_tree0) {
        _CO2_tree0 = CO2_tree0;
    }

    public float getH2O_tree0() {
        return _H2O_tree0;
    }

    public void setH2O_tree0(float H2O_tree0) {
        _H2O_tree0 = H2O_tree0;
    }

    public float getF_CO2_tree1() {
        return _F_CO2_tree1;
    }

    public void setF_CO2_tree1(float F_CO2_tree1) {
        _F_CO2_tree1 = F_CO2_tree1;
    }

    public float getF_H2O_tree1() {
        return _F_H2O_tree1;
    }

    public void setF_H2O_tree1(float F_H2O_tree1) {
        _F_H2O_tree1 = F_H2O_tree1;
    }

    public float getTcuv_tree1() {
        return _Tcuv_tree1;
    }

    public void setTcuv_tree1(float Tcuv_tree1) {
        _Tcuv_tree1 = Tcuv_tree1;
    }

    public float getPARcuv_tree1() {
        return _PARcuv_tree1;
    }

    public void setPARcuv_tree1(float PARcuv_tree1) {
        _PARcuv_tree1 = PARcuv_tree1;
    }

    public float getCO2_tree1() {
        return _CO2_tree1;
    }

    public void setCO2_tree1(float CO2_tree1) {
        _CO2_tree1 = CO2_tree1;
    }

    public float getH2O_tree1() {
        return _H2O_tree1;
    }

    public void setH2O_tree1(float H2O_tree1) {
        _H2O_tree1 = H2O_tree1;
    }

    public float getF_CO2_tree2() {
        return _F_CO2_tree2;
    }

    public void setF_CO2_tree2(float F_CO2_tree2) {
        _F_CO2_tree2 = F_CO2_tree2;
    }

    public float getF_H2O_tree2() {
        return _F_H2O_tree2;
    }

    public void setF_H2O_tree2(float F_H2O_tree2) {
        _F_H2O_tree2 = F_H2O_tree2;
    }

    public float getTcuv_tree2() {
        return _Tcuv_tree2;
    }

    public void setTcuv_tree2(float Tcuv_tree2) {
        _Tcuv_tree2 = Tcuv_tree2;
    }

    public float getPARcuv_tree2() {
        return _PARcuv_tree2;
    }

    public void setPARcuv_tree2(float PARcuv_tree2) {
        _PARcuv_tree2 = PARcuv_tree2;
    }

    public float getCO2_tree2() {
        return _CO2_tree2;
    }

    public void setCO2_tree2(float CO2_tree2) {
        _CO2_tree2 = CO2_tree2;
    }

    public float getH2O_tree2() {
        return _H2O_tree2;
    }

    public void setH2O_tree2(float H2O_tree2) {
        _H2O_tree2 = H2O_tree2;
    }

    public float getF_CO2_tree3() {
        return _F_CO2_tree3;
    }

    public void setF_CO2_tree3(float F_CO2_tree3) {
        _F_CO2_tree3 = F_CO2_tree3;
    }

    public float getF_H2O_tree3() {
        return _F_H2O_tree3;
    }

    public void setF_H2O_tree3(float F_H2O_tree3) {
        _F_H2O_tree3 = F_H2O_tree3;
    }

    public float getTcuv_tree3() {
        return _Tcuv_tree3;
    }

    public void setTcuv_tree3(float Tcuv_tree3) {
        _Tcuv_tree3 = Tcuv_tree3;
    }

    public float getPARcuv_tree3() {
        return _PARcuv_tree3;
    }

    public void setPARcuv_tree3(float PARcuv_tree3) {
        _PARcuv_tree3 = PARcuv_tree3;
    }

    public float getCO2_tree3() {
        return _CO2_tree3;
    }

    public void setCO2_tree3(float CO2_tree3) {
        _CO2_tree3 = CO2_tree3;
    }

    public float getH2O_tree3() {
        return _H2O_tree3;
    }

    public void setH2O_tree3(float H2O_tree3) {
        _H2O_tree3 = H2O_tree3;
    }

    public int getF_CO2_tree0_EMEP() {
        return _F_CO2_tree0_EMEP;
    }

    public void setF_CO2_tree0_EMEP(int F_CO2_tree0_EMEP) {
        _F_CO2_tree0_EMEP = F_CO2_tree0_EMEP;
    }

    public int getF_H2O_tree0_EMEP() {
        return _F_H2O_tree0_EMEP;
    }

    public void setF_H2O_tree0_EMEP(int F_H2O_tree0_EMEP) {
        _F_H2O_tree0_EMEP = F_H2O_tree0_EMEP;
    }

    public int getTcuv_tree0_EMEP() {
        return _Tcuv_tree0_EMEP;
    }

    public void setTcuv_tree0_EMEP(int Tcuv_tree0_EMEP) {
        _Tcuv_tree0_EMEP = Tcuv_tree0_EMEP;
    }

    public int getPARcuv_tree0_EMEP() {
        return _PARcuv_tree0_EMEP;
    }

    public void setPARcuv_tree0_EMEP(int PARcuv_tree0_EMEP) {
        _PARcuv_tree0_EMEP = PARcuv_tree0_EMEP;
    }

    public int getCO2_tree0_EMEP() {
        return _CO2_tree0_EMEP;
    }

    public void setCO2_tree0_EMEP(int CO2_tree0_EMEP) {
        _CO2_tree0_EMEP = CO2_tree0_EMEP;
    }

    public int getH2O_tree0_EMEP() {
        return _H2O_tree0_EMEP;
    }

    public void setH2O_tree0_EMEP(int H2O_tree0_EMEP) {
        _H2O_tree0_EMEP = H2O_tree0_EMEP;
    }

    public int getF_CO2_tree1_EMEP() {
        return _F_CO2_tree1_EMEP;
    }

    public void setF_CO2_tree1_EMEP(int F_CO2_tree1_EMEP) {
        _F_CO2_tree1_EMEP = F_CO2_tree1_EMEP;
    }

    public int getF_H2O_tree1_EMEP() {
        return _F_H2O_tree1_EMEP;
    }

    public void setF_H2O_tree1_EMEP(int F_H2O_tree1_EMEP) {
        _F_H2O_tree1_EMEP = F_H2O_tree1_EMEP;
    }

    public int getTcuv_tree1_EMEP() {
        return _Tcuv_tree1_EMEP;
    }

    public void setTcuv_tree1_EMEP(int Tcuv_tree1_EMEP) {
        _Tcuv_tree1_EMEP = Tcuv_tree1_EMEP;
    }

    public int getPARcuv_tree1_EMEP() {
        return _PARcuv_tree1_EMEP;
    }

    public void setPARcuv_tree1_EMEP(int PARcuv_tree1_EMEP) {
        _PARcuv_tree1_EMEP = PARcuv_tree1_EMEP;
    }

    public int getCO2_tree1_EMEP() {
        return _CO2_tree1_EMEP;
    }

    public void setCO2_tree1_EMEP(int CO2_tree1_EMEP) {
        _CO2_tree1_EMEP = CO2_tree1_EMEP;
    }

    public int getH2O_tree1_EMEP() {
        return _H2O_tree1_EMEP;
    }

    public void setH2O_tree1_EMEP(int H2O_tree1_EMEP) {
        _H2O_tree1_EMEP = H2O_tree1_EMEP;
    }

    public int getF_CO2_tree2_EMEP() {
        return _F_CO2_tree2_EMEP;
    }

    public void setF_CO2_tree2_EMEP(int F_CO2_tree2_EMEP) {
        _F_CO2_tree2_EMEP = F_CO2_tree2_EMEP;
    }

    public int getF_H2O_tree2_EMEP() {
        return _F_H2O_tree2_EMEP;
    }

    public void setF_H2O_tree2_EMEP(int F_H2O_tree2_EMEP) {
        _F_H2O_tree2_EMEP = F_H2O_tree2_EMEP;
    }

    public int getTcuv_tree2_EMEP() {
        return _Tcuv_tree2_EMEP;
    }

    public void setTcuv_tree2_EMEP(int Tcuv_tree2_EMEP) {
        _Tcuv_tree2_EMEP = Tcuv_tree2_EMEP;
    }

    public int getPARcuv_tree2_EMEP() {
        return _PARcuv_tree2_EMEP;
    }

    public void setPARcuv_tree2_EMEP(int PARcuv_tree2_EMEP) {
        _PARcuv_tree2_EMEP = PARcuv_tree2_EMEP;
    }

    public int getCO2_tree2_EMEP() {
        return _CO2_tree2_EMEP;
    }

    public void setCO2_tree2_EMEP(int CO2_tree2_EMEP) {
        _CO2_tree2_EMEP = CO2_tree2_EMEP;
    }

    public int getH2O_tree2_EMEP() {
        return _H2O_tree2_EMEP;
    }

    public void setH2O_tree2_EMEP(int H2O_tree2_EMEP) {
        _H2O_tree2_EMEP = H2O_tree2_EMEP;
    }

    public int getF_CO2_tree3_EMEP() {
        return _F_CO2_tree3_EMEP;
    }

    public void setF_CO2_tree3_EMEP(int F_CO2_tree3_EMEP) {
        _F_CO2_tree3_EMEP = F_CO2_tree3_EMEP;
    }

    public int getF_H2O_tree3_EMEP() {
        return _F_H2O_tree3_EMEP;
    }

    public void setF_H2O_tree3_EMEP(int F_H2O_tree3_EMEP) {
        _F_H2O_tree3_EMEP = F_H2O_tree3_EMEP;
    }

    public int getTcuv_tree3_EMEP() {
        return _Tcuv_tree3_EMEP;
    }

    public void setTcuv_tree3_EMEP(int Tcuv_tree3_EMEP) {
        _Tcuv_tree3_EMEP = Tcuv_tree3_EMEP;
    }

    public int getPARcuv_tree3_EMEP() {
        return _PARcuv_tree3_EMEP;
    }

    public void setPARcuv_tree3_EMEP(int PARcuv_tree3_EMEP) {
        _PARcuv_tree3_EMEP = PARcuv_tree3_EMEP;
    }

    public int getCO2_tree3_EMEP() {
        return _CO2_tree3_EMEP;
    }

    public void setCO2_tree3_EMEP(int CO2_tree3_EMEP) {
        _CO2_tree3_EMEP = CO2_tree3_EMEP;
    }

    public int getH2O_tree3_EMEP() {
        return _H2O_tree3_EMEP;
    }

    public void setH2O_tree3_EMEP(int H2O_tree3_EMEP) {
        _H2O_tree3_EMEP = H2O_tree3_EMEP;
    }
}
