package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Varrio_tree;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Varrio_tree in entity cache.
 *
 * @author pj
 * @see Varrio_tree
 * @generated
 */
public class Varrio_treeCacheModel implements CacheModel<Varrio_tree>,
    Externalizable {
    public long SAMPTIME;
    public float F_CO2_tree0;
    public float F_H2O_tree0;
    public float Tcuv_tree0;
    public float PARcuv_tree0;
    public float CO2_tree0;
    public float H2O_tree0;
    public float F_CO2_tree1;
    public float F_H2O_tree1;
    public float Tcuv_tree1;
    public float PARcuv_tree1;
    public float CO2_tree1;
    public float H2O_tree1;
    public float F_CO2_tree2;
    public float F_H2O_tree2;
    public float Tcuv_tree2;
    public float PARcuv_tree2;
    public float CO2_tree2;
    public float H2O_tree2;
    public float F_CO2_tree3;
    public float F_H2O_tree3;
    public float Tcuv_tree3;
    public float PARcuv_tree3;
    public float CO2_tree3;
    public float H2O_tree3;
    public int F_CO2_tree0_EMEP;
    public int F_H2O_tree0_EMEP;
    public int Tcuv_tree0_EMEP;
    public int PARcuv_tree0_EMEP;
    public int CO2_tree0_EMEP;
    public int H2O_tree0_EMEP;
    public int F_CO2_tree1_EMEP;
    public int F_H2O_tree1_EMEP;
    public int Tcuv_tree1_EMEP;
    public int PARcuv_tree1_EMEP;
    public int CO2_tree1_EMEP;
    public int H2O_tree1_EMEP;
    public int F_CO2_tree2_EMEP;
    public int F_H2O_tree2_EMEP;
    public int Tcuv_tree2_EMEP;
    public int PARcuv_tree2_EMEP;
    public int CO2_tree2_EMEP;
    public int H2O_tree2_EMEP;
    public int F_CO2_tree3_EMEP;
    public int F_H2O_tree3_EMEP;
    public int Tcuv_tree3_EMEP;
    public int PARcuv_tree3_EMEP;
    public int CO2_tree3_EMEP;
    public int H2O_tree3_EMEP;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(99);

        sb.append("{SAMPTIME=");
        sb.append(SAMPTIME);
        sb.append(", F_CO2_tree0=");
        sb.append(F_CO2_tree0);
        sb.append(", F_H2O_tree0=");
        sb.append(F_H2O_tree0);
        sb.append(", Tcuv_tree0=");
        sb.append(Tcuv_tree0);
        sb.append(", PARcuv_tree0=");
        sb.append(PARcuv_tree0);
        sb.append(", CO2_tree0=");
        sb.append(CO2_tree0);
        sb.append(", H2O_tree0=");
        sb.append(H2O_tree0);
        sb.append(", F_CO2_tree1=");
        sb.append(F_CO2_tree1);
        sb.append(", F_H2O_tree1=");
        sb.append(F_H2O_tree1);
        sb.append(", Tcuv_tree1=");
        sb.append(Tcuv_tree1);
        sb.append(", PARcuv_tree1=");
        sb.append(PARcuv_tree1);
        sb.append(", CO2_tree1=");
        sb.append(CO2_tree1);
        sb.append(", H2O_tree1=");
        sb.append(H2O_tree1);
        sb.append(", F_CO2_tree2=");
        sb.append(F_CO2_tree2);
        sb.append(", F_H2O_tree2=");
        sb.append(F_H2O_tree2);
        sb.append(", Tcuv_tree2=");
        sb.append(Tcuv_tree2);
        sb.append(", PARcuv_tree2=");
        sb.append(PARcuv_tree2);
        sb.append(", CO2_tree2=");
        sb.append(CO2_tree2);
        sb.append(", H2O_tree2=");
        sb.append(H2O_tree2);
        sb.append(", F_CO2_tree3=");
        sb.append(F_CO2_tree3);
        sb.append(", F_H2O_tree3=");
        sb.append(F_H2O_tree3);
        sb.append(", Tcuv_tree3=");
        sb.append(Tcuv_tree3);
        sb.append(", PARcuv_tree3=");
        sb.append(PARcuv_tree3);
        sb.append(", CO2_tree3=");
        sb.append(CO2_tree3);
        sb.append(", H2O_tree3=");
        sb.append(H2O_tree3);
        sb.append(", F_CO2_tree0_EMEP=");
        sb.append(F_CO2_tree0_EMEP);
        sb.append(", F_H2O_tree0_EMEP=");
        sb.append(F_H2O_tree0_EMEP);
        sb.append(", Tcuv_tree0_EMEP=");
        sb.append(Tcuv_tree0_EMEP);
        sb.append(", PARcuv_tree0_EMEP=");
        sb.append(PARcuv_tree0_EMEP);
        sb.append(", CO2_tree0_EMEP=");
        sb.append(CO2_tree0_EMEP);
        sb.append(", H2O_tree0_EMEP=");
        sb.append(H2O_tree0_EMEP);
        sb.append(", F_CO2_tree1_EMEP=");
        sb.append(F_CO2_tree1_EMEP);
        sb.append(", F_H2O_tree1_EMEP=");
        sb.append(F_H2O_tree1_EMEP);
        sb.append(", Tcuv_tree1_EMEP=");
        sb.append(Tcuv_tree1_EMEP);
        sb.append(", PARcuv_tree1_EMEP=");
        sb.append(PARcuv_tree1_EMEP);
        sb.append(", CO2_tree1_EMEP=");
        sb.append(CO2_tree1_EMEP);
        sb.append(", H2O_tree1_EMEP=");
        sb.append(H2O_tree1_EMEP);
        sb.append(", F_CO2_tree2_EMEP=");
        sb.append(F_CO2_tree2_EMEP);
        sb.append(", F_H2O_tree2_EMEP=");
        sb.append(F_H2O_tree2_EMEP);
        sb.append(", Tcuv_tree2_EMEP=");
        sb.append(Tcuv_tree2_EMEP);
        sb.append(", PARcuv_tree2_EMEP=");
        sb.append(PARcuv_tree2_EMEP);
        sb.append(", CO2_tree2_EMEP=");
        sb.append(CO2_tree2_EMEP);
        sb.append(", H2O_tree2_EMEP=");
        sb.append(H2O_tree2_EMEP);
        sb.append(", F_CO2_tree3_EMEP=");
        sb.append(F_CO2_tree3_EMEP);
        sb.append(", F_H2O_tree3_EMEP=");
        sb.append(F_H2O_tree3_EMEP);
        sb.append(", Tcuv_tree3_EMEP=");
        sb.append(Tcuv_tree3_EMEP);
        sb.append(", PARcuv_tree3_EMEP=");
        sb.append(PARcuv_tree3_EMEP);
        sb.append(", CO2_tree3_EMEP=");
        sb.append(CO2_tree3_EMEP);
        sb.append(", H2O_tree3_EMEP=");
        sb.append(H2O_tree3_EMEP);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Varrio_tree toEntityModel() {
        Varrio_treeImpl varrio_treeImpl = new Varrio_treeImpl();

        if (SAMPTIME == Long.MIN_VALUE) {
            varrio_treeImpl.setSAMPTIME(null);
        } else {
            varrio_treeImpl.setSAMPTIME(new Date(SAMPTIME));
        }

        varrio_treeImpl.setF_CO2_tree0(F_CO2_tree0);
        varrio_treeImpl.setF_H2O_tree0(F_H2O_tree0);
        varrio_treeImpl.setTcuv_tree0(Tcuv_tree0);
        varrio_treeImpl.setPARcuv_tree0(PARcuv_tree0);
        varrio_treeImpl.setCO2_tree0(CO2_tree0);
        varrio_treeImpl.setH2O_tree0(H2O_tree0);
        varrio_treeImpl.setF_CO2_tree1(F_CO2_tree1);
        varrio_treeImpl.setF_H2O_tree1(F_H2O_tree1);
        varrio_treeImpl.setTcuv_tree1(Tcuv_tree1);
        varrio_treeImpl.setPARcuv_tree1(PARcuv_tree1);
        varrio_treeImpl.setCO2_tree1(CO2_tree1);
        varrio_treeImpl.setH2O_tree1(H2O_tree1);
        varrio_treeImpl.setF_CO2_tree2(F_CO2_tree2);
        varrio_treeImpl.setF_H2O_tree2(F_H2O_tree2);
        varrio_treeImpl.setTcuv_tree2(Tcuv_tree2);
        varrio_treeImpl.setPARcuv_tree2(PARcuv_tree2);
        varrio_treeImpl.setCO2_tree2(CO2_tree2);
        varrio_treeImpl.setH2O_tree2(H2O_tree2);
        varrio_treeImpl.setF_CO2_tree3(F_CO2_tree3);
        varrio_treeImpl.setF_H2O_tree3(F_H2O_tree3);
        varrio_treeImpl.setTcuv_tree3(Tcuv_tree3);
        varrio_treeImpl.setPARcuv_tree3(PARcuv_tree3);
        varrio_treeImpl.setCO2_tree3(CO2_tree3);
        varrio_treeImpl.setH2O_tree3(H2O_tree3);
        varrio_treeImpl.setF_CO2_tree0_EMEP(F_CO2_tree0_EMEP);
        varrio_treeImpl.setF_H2O_tree0_EMEP(F_H2O_tree0_EMEP);
        varrio_treeImpl.setTcuv_tree0_EMEP(Tcuv_tree0_EMEP);
        varrio_treeImpl.setPARcuv_tree0_EMEP(PARcuv_tree0_EMEP);
        varrio_treeImpl.setCO2_tree0_EMEP(CO2_tree0_EMEP);
        varrio_treeImpl.setH2O_tree0_EMEP(H2O_tree0_EMEP);
        varrio_treeImpl.setF_CO2_tree1_EMEP(F_CO2_tree1_EMEP);
        varrio_treeImpl.setF_H2O_tree1_EMEP(F_H2O_tree1_EMEP);
        varrio_treeImpl.setTcuv_tree1_EMEP(Tcuv_tree1_EMEP);
        varrio_treeImpl.setPARcuv_tree1_EMEP(PARcuv_tree1_EMEP);
        varrio_treeImpl.setCO2_tree1_EMEP(CO2_tree1_EMEP);
        varrio_treeImpl.setH2O_tree1_EMEP(H2O_tree1_EMEP);
        varrio_treeImpl.setF_CO2_tree2_EMEP(F_CO2_tree2_EMEP);
        varrio_treeImpl.setF_H2O_tree2_EMEP(F_H2O_tree2_EMEP);
        varrio_treeImpl.setTcuv_tree2_EMEP(Tcuv_tree2_EMEP);
        varrio_treeImpl.setPARcuv_tree2_EMEP(PARcuv_tree2_EMEP);
        varrio_treeImpl.setCO2_tree2_EMEP(CO2_tree2_EMEP);
        varrio_treeImpl.setH2O_tree2_EMEP(H2O_tree2_EMEP);
        varrio_treeImpl.setF_CO2_tree3_EMEP(F_CO2_tree3_EMEP);
        varrio_treeImpl.setF_H2O_tree3_EMEP(F_H2O_tree3_EMEP);
        varrio_treeImpl.setTcuv_tree3_EMEP(Tcuv_tree3_EMEP);
        varrio_treeImpl.setPARcuv_tree3_EMEP(PARcuv_tree3_EMEP);
        varrio_treeImpl.setCO2_tree3_EMEP(CO2_tree3_EMEP);
        varrio_treeImpl.setH2O_tree3_EMEP(H2O_tree3_EMEP);

        varrio_treeImpl.resetOriginalValues();

        return varrio_treeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        SAMPTIME = objectInput.readLong();
        F_CO2_tree0 = objectInput.readFloat();
        F_H2O_tree0 = objectInput.readFloat();
        Tcuv_tree0 = objectInput.readFloat();
        PARcuv_tree0 = objectInput.readFloat();
        CO2_tree0 = objectInput.readFloat();
        H2O_tree0 = objectInput.readFloat();
        F_CO2_tree1 = objectInput.readFloat();
        F_H2O_tree1 = objectInput.readFloat();
        Tcuv_tree1 = objectInput.readFloat();
        PARcuv_tree1 = objectInput.readFloat();
        CO2_tree1 = objectInput.readFloat();
        H2O_tree1 = objectInput.readFloat();
        F_CO2_tree2 = objectInput.readFloat();
        F_H2O_tree2 = objectInput.readFloat();
        Tcuv_tree2 = objectInput.readFloat();
        PARcuv_tree2 = objectInput.readFloat();
        CO2_tree2 = objectInput.readFloat();
        H2O_tree2 = objectInput.readFloat();
        F_CO2_tree3 = objectInput.readFloat();
        F_H2O_tree3 = objectInput.readFloat();
        Tcuv_tree3 = objectInput.readFloat();
        PARcuv_tree3 = objectInput.readFloat();
        CO2_tree3 = objectInput.readFloat();
        H2O_tree3 = objectInput.readFloat();
        F_CO2_tree0_EMEP = objectInput.readInt();
        F_H2O_tree0_EMEP = objectInput.readInt();
        Tcuv_tree0_EMEP = objectInput.readInt();
        PARcuv_tree0_EMEP = objectInput.readInt();
        CO2_tree0_EMEP = objectInput.readInt();
        H2O_tree0_EMEP = objectInput.readInt();
        F_CO2_tree1_EMEP = objectInput.readInt();
        F_H2O_tree1_EMEP = objectInput.readInt();
        Tcuv_tree1_EMEP = objectInput.readInt();
        PARcuv_tree1_EMEP = objectInput.readInt();
        CO2_tree1_EMEP = objectInput.readInt();
        H2O_tree1_EMEP = objectInput.readInt();
        F_CO2_tree2_EMEP = objectInput.readInt();
        F_H2O_tree2_EMEP = objectInput.readInt();
        Tcuv_tree2_EMEP = objectInput.readInt();
        PARcuv_tree2_EMEP = objectInput.readInt();
        CO2_tree2_EMEP = objectInput.readInt();
        H2O_tree2_EMEP = objectInput.readInt();
        F_CO2_tree3_EMEP = objectInput.readInt();
        F_H2O_tree3_EMEP = objectInput.readInt();
        Tcuv_tree3_EMEP = objectInput.readInt();
        PARcuv_tree3_EMEP = objectInput.readInt();
        CO2_tree3_EMEP = objectInput.readInt();
        H2O_tree3_EMEP = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(SAMPTIME);
        objectOutput.writeFloat(F_CO2_tree0);
        objectOutput.writeFloat(F_H2O_tree0);
        objectOutput.writeFloat(Tcuv_tree0);
        objectOutput.writeFloat(PARcuv_tree0);
        objectOutput.writeFloat(CO2_tree0);
        objectOutput.writeFloat(H2O_tree0);
        objectOutput.writeFloat(F_CO2_tree1);
        objectOutput.writeFloat(F_H2O_tree1);
        objectOutput.writeFloat(Tcuv_tree1);
        objectOutput.writeFloat(PARcuv_tree1);
        objectOutput.writeFloat(CO2_tree1);
        objectOutput.writeFloat(H2O_tree1);
        objectOutput.writeFloat(F_CO2_tree2);
        objectOutput.writeFloat(F_H2O_tree2);
        objectOutput.writeFloat(Tcuv_tree2);
        objectOutput.writeFloat(PARcuv_tree2);
        objectOutput.writeFloat(CO2_tree2);
        objectOutput.writeFloat(H2O_tree2);
        objectOutput.writeFloat(F_CO2_tree3);
        objectOutput.writeFloat(F_H2O_tree3);
        objectOutput.writeFloat(Tcuv_tree3);
        objectOutput.writeFloat(PARcuv_tree3);
        objectOutput.writeFloat(CO2_tree3);
        objectOutput.writeFloat(H2O_tree3);
        objectOutput.writeInt(F_CO2_tree0_EMEP);
        objectOutput.writeInt(F_H2O_tree0_EMEP);
        objectOutput.writeInt(Tcuv_tree0_EMEP);
        objectOutput.writeInt(PARcuv_tree0_EMEP);
        objectOutput.writeInt(CO2_tree0_EMEP);
        objectOutput.writeInt(H2O_tree0_EMEP);
        objectOutput.writeInt(F_CO2_tree1_EMEP);
        objectOutput.writeInt(F_H2O_tree1_EMEP);
        objectOutput.writeInt(Tcuv_tree1_EMEP);
        objectOutput.writeInt(PARcuv_tree1_EMEP);
        objectOutput.writeInt(CO2_tree1_EMEP);
        objectOutput.writeInt(H2O_tree1_EMEP);
        objectOutput.writeInt(F_CO2_tree2_EMEP);
        objectOutput.writeInt(F_H2O_tree2_EMEP);
        objectOutput.writeInt(Tcuv_tree2_EMEP);
        objectOutput.writeInt(PARcuv_tree2_EMEP);
        objectOutput.writeInt(CO2_tree2_EMEP);
        objectOutput.writeInt(H2O_tree2_EMEP);
        objectOutput.writeInt(F_CO2_tree3_EMEP);
        objectOutput.writeInt(F_H2O_tree3_EMEP);
        objectOutput.writeInt(Tcuv_tree3_EMEP);
        objectOutput.writeInt(PARcuv_tree3_EMEP);
        objectOutput.writeInt(CO2_tree3_EMEP);
        objectOutput.writeInt(H2O_tree3_EMEP);
    }
}
