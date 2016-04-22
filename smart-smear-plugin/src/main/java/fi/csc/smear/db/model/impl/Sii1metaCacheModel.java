package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Sii1meta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sii1meta in entity cache.
 *
 * @author pj
 * @see Sii1meta
 * @generated
 */
public class Sii1metaCacheModel implements CacheModel<Sii1meta>, Externalizable {
    public long samptime;
    public float T_a;
    public int T_a_EMEP;
    public float RH;
    public int RH_EMEP;
    public float PAR;
    public int PAR_EMEP;
    public float R_PAR;
    public int R_PAR_EMEP;
    public float Net_CNR4;
    public int Net_CNR4_EMEP;
    public float Net_NRLite;
    public int Net_NRLite_EMEP;
    public float Wsoil_1;
    public int Wsoil_1_EMEP;
    public float Wsoil_2;
    public int Wsoil_2_EMEP;
    public float T_p_B5;
    public int T_p_B5_EMEP;
    public float T_p_B20;
    public int T_p_B20_EMEP;
    public float T_p_B35;
    public int T_p_B35_EMEP;
    public float T_p_B50;
    public int T_p_B50_EMEP;
    public float T_p_C1;
    public int T_p_C1_EMEP;
    public float T_p_C2;
    public int T_p_C2_EMEP;
    public float T_p_C5;
    public int T_p_C5_EMEP;
    public float T_p_C10;
    public int T_p_C10_EMEP;
    public float T_p_C15;
    public int T_p_C15_EMEP;
    public float T_p_C20;
    public int T_p_C20_EMEP;
    public float T_p_C30;
    public int T_p_C30_EMEP;
    public float T_p_C50;
    public int T_p_C50_EMEP;
    public float T_p_C70;
    public int T_p_C70_EMEP;
    public float T_p_C100;
    public int T_p_C100_EMEP;
    public float WTD;
    public int WTD_EMEP;
    public float Precip;
    public int Precip_EMEP;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(99);

        sb.append("{samptime=");
        sb.append(samptime);
        sb.append(", T_a=");
        sb.append(T_a);
        sb.append(", T_a_EMEP=");
        sb.append(T_a_EMEP);
        sb.append(", RH=");
        sb.append(RH);
        sb.append(", RH_EMEP=");
        sb.append(RH_EMEP);
        sb.append(", PAR=");
        sb.append(PAR);
        sb.append(", PAR_EMEP=");
        sb.append(PAR_EMEP);
        sb.append(", R_PAR=");
        sb.append(R_PAR);
        sb.append(", R_PAR_EMEP=");
        sb.append(R_PAR_EMEP);
        sb.append(", Net_CNR4=");
        sb.append(Net_CNR4);
        sb.append(", Net_CNR4_EMEP=");
        sb.append(Net_CNR4_EMEP);
        sb.append(", Net_NRLite=");
        sb.append(Net_NRLite);
        sb.append(", Net_NRLite_EMEP=");
        sb.append(Net_NRLite_EMEP);
        sb.append(", Wsoil_1=");
        sb.append(Wsoil_1);
        sb.append(", Wsoil_1_EMEP=");
        sb.append(Wsoil_1_EMEP);
        sb.append(", Wsoil_2=");
        sb.append(Wsoil_2);
        sb.append(", Wsoil_2_EMEP=");
        sb.append(Wsoil_2_EMEP);
        sb.append(", T_p_B5=");
        sb.append(T_p_B5);
        sb.append(", T_p_B5_EMEP=");
        sb.append(T_p_B5_EMEP);
        sb.append(", T_p_B20=");
        sb.append(T_p_B20);
        sb.append(", T_p_B20_EMEP=");
        sb.append(T_p_B20_EMEP);
        sb.append(", T_p_B35=");
        sb.append(T_p_B35);
        sb.append(", T_p_B35_EMEP=");
        sb.append(T_p_B35_EMEP);
        sb.append(", T_p_B50=");
        sb.append(T_p_B50);
        sb.append(", T_p_B50_EMEP=");
        sb.append(T_p_B50_EMEP);
        sb.append(", T_p_C1=");
        sb.append(T_p_C1);
        sb.append(", T_p_C1_EMEP=");
        sb.append(T_p_C1_EMEP);
        sb.append(", T_p_C2=");
        sb.append(T_p_C2);
        sb.append(", T_p_C2_EMEP=");
        sb.append(T_p_C2_EMEP);
        sb.append(", T_p_C5=");
        sb.append(T_p_C5);
        sb.append(", T_p_C5_EMEP=");
        sb.append(T_p_C5_EMEP);
        sb.append(", T_p_C10=");
        sb.append(T_p_C10);
        sb.append(", T_p_C10_EMEP=");
        sb.append(T_p_C10_EMEP);
        sb.append(", T_p_C15=");
        sb.append(T_p_C15);
        sb.append(", T_p_C15_EMEP=");
        sb.append(T_p_C15_EMEP);
        sb.append(", T_p_C20=");
        sb.append(T_p_C20);
        sb.append(", T_p_C20_EMEP=");
        sb.append(T_p_C20_EMEP);
        sb.append(", T_p_C30=");
        sb.append(T_p_C30);
        sb.append(", T_p_C30_EMEP=");
        sb.append(T_p_C30_EMEP);
        sb.append(", T_p_C50=");
        sb.append(T_p_C50);
        sb.append(", T_p_C50_EMEP=");
        sb.append(T_p_C50_EMEP);
        sb.append(", T_p_C70=");
        sb.append(T_p_C70);
        sb.append(", T_p_C70_EMEP=");
        sb.append(T_p_C70_EMEP);
        sb.append(", T_p_C100=");
        sb.append(T_p_C100);
        sb.append(", T_p_C100_EMEP=");
        sb.append(T_p_C100_EMEP);
        sb.append(", WTD=");
        sb.append(WTD);
        sb.append(", WTD_EMEP=");
        sb.append(WTD_EMEP);
        sb.append(", Precip=");
        sb.append(Precip);
        sb.append(", Precip_EMEP=");
        sb.append(Precip_EMEP);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Sii1meta toEntityModel() {
        Sii1metaImpl sii1metaImpl = new Sii1metaImpl();

        if (samptime == Long.MIN_VALUE) {
            sii1metaImpl.setSamptime(null);
        } else {
            sii1metaImpl.setSamptime(new Date(samptime));
        }

        sii1metaImpl.setT_a(T_a);
        sii1metaImpl.setT_a_EMEP(T_a_EMEP);
        sii1metaImpl.setRH(RH);
        sii1metaImpl.setRH_EMEP(RH_EMEP);
        sii1metaImpl.setPAR(PAR);
        sii1metaImpl.setPAR_EMEP(PAR_EMEP);
        sii1metaImpl.setR_PAR(R_PAR);
        sii1metaImpl.setR_PAR_EMEP(R_PAR_EMEP);
        sii1metaImpl.setNet_CNR4(Net_CNR4);
        sii1metaImpl.setNet_CNR4_EMEP(Net_CNR4_EMEP);
        sii1metaImpl.setNet_NRLite(Net_NRLite);
        sii1metaImpl.setNet_NRLite_EMEP(Net_NRLite_EMEP);
        sii1metaImpl.setWsoil_1(Wsoil_1);
        sii1metaImpl.setWsoil_1_EMEP(Wsoil_1_EMEP);
        sii1metaImpl.setWsoil_2(Wsoil_2);
        sii1metaImpl.setWsoil_2_EMEP(Wsoil_2_EMEP);
        sii1metaImpl.setT_p_B5(T_p_B5);
        sii1metaImpl.setT_p_B5_EMEP(T_p_B5_EMEP);
        sii1metaImpl.setT_p_B20(T_p_B20);
        sii1metaImpl.setT_p_B20_EMEP(T_p_B20_EMEP);
        sii1metaImpl.setT_p_B35(T_p_B35);
        sii1metaImpl.setT_p_B35_EMEP(T_p_B35_EMEP);
        sii1metaImpl.setT_p_B50(T_p_B50);
        sii1metaImpl.setT_p_B50_EMEP(T_p_B50_EMEP);
        sii1metaImpl.setT_p_C1(T_p_C1);
        sii1metaImpl.setT_p_C1_EMEP(T_p_C1_EMEP);
        sii1metaImpl.setT_p_C2(T_p_C2);
        sii1metaImpl.setT_p_C2_EMEP(T_p_C2_EMEP);
        sii1metaImpl.setT_p_C5(T_p_C5);
        sii1metaImpl.setT_p_C5_EMEP(T_p_C5_EMEP);
        sii1metaImpl.setT_p_C10(T_p_C10);
        sii1metaImpl.setT_p_C10_EMEP(T_p_C10_EMEP);
        sii1metaImpl.setT_p_C15(T_p_C15);
        sii1metaImpl.setT_p_C15_EMEP(T_p_C15_EMEP);
        sii1metaImpl.setT_p_C20(T_p_C20);
        sii1metaImpl.setT_p_C20_EMEP(T_p_C20_EMEP);
        sii1metaImpl.setT_p_C30(T_p_C30);
        sii1metaImpl.setT_p_C30_EMEP(T_p_C30_EMEP);
        sii1metaImpl.setT_p_C50(T_p_C50);
        sii1metaImpl.setT_p_C50_EMEP(T_p_C50_EMEP);
        sii1metaImpl.setT_p_C70(T_p_C70);
        sii1metaImpl.setT_p_C70_EMEP(T_p_C70_EMEP);
        sii1metaImpl.setT_p_C100(T_p_C100);
        sii1metaImpl.setT_p_C100_EMEP(T_p_C100_EMEP);
        sii1metaImpl.setWTD(WTD);
        sii1metaImpl.setWTD_EMEP(WTD_EMEP);
        sii1metaImpl.setPrecip(Precip);
        sii1metaImpl.setPrecip_EMEP(Precip_EMEP);

        sii1metaImpl.resetOriginalValues();

        return sii1metaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        samptime = objectInput.readLong();
        T_a = objectInput.readFloat();
        T_a_EMEP = objectInput.readInt();
        RH = objectInput.readFloat();
        RH_EMEP = objectInput.readInt();
        PAR = objectInput.readFloat();
        PAR_EMEP = objectInput.readInt();
        R_PAR = objectInput.readFloat();
        R_PAR_EMEP = objectInput.readInt();
        Net_CNR4 = objectInput.readFloat();
        Net_CNR4_EMEP = objectInput.readInt();
        Net_NRLite = objectInput.readFloat();
        Net_NRLite_EMEP = objectInput.readInt();
        Wsoil_1 = objectInput.readFloat();
        Wsoil_1_EMEP = objectInput.readInt();
        Wsoil_2 = objectInput.readFloat();
        Wsoil_2_EMEP = objectInput.readInt();
        T_p_B5 = objectInput.readFloat();
        T_p_B5_EMEP = objectInput.readInt();
        T_p_B20 = objectInput.readFloat();
        T_p_B20_EMEP = objectInput.readInt();
        T_p_B35 = objectInput.readFloat();
        T_p_B35_EMEP = objectInput.readInt();
        T_p_B50 = objectInput.readFloat();
        T_p_B50_EMEP = objectInput.readInt();
        T_p_C1 = objectInput.readFloat();
        T_p_C1_EMEP = objectInput.readInt();
        T_p_C2 = objectInput.readFloat();
        T_p_C2_EMEP = objectInput.readInt();
        T_p_C5 = objectInput.readFloat();
        T_p_C5_EMEP = objectInput.readInt();
        T_p_C10 = objectInput.readFloat();
        T_p_C10_EMEP = objectInput.readInt();
        T_p_C15 = objectInput.readFloat();
        T_p_C15_EMEP = objectInput.readInt();
        T_p_C20 = objectInput.readFloat();
        T_p_C20_EMEP = objectInput.readInt();
        T_p_C30 = objectInput.readFloat();
        T_p_C30_EMEP = objectInput.readInt();
        T_p_C50 = objectInput.readFloat();
        T_p_C50_EMEP = objectInput.readInt();
        T_p_C70 = objectInput.readFloat();
        T_p_C70_EMEP = objectInput.readInt();
        T_p_C100 = objectInput.readFloat();
        T_p_C100_EMEP = objectInput.readInt();
        WTD = objectInput.readFloat();
        WTD_EMEP = objectInput.readInt();
        Precip = objectInput.readFloat();
        Precip_EMEP = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(samptime);
        objectOutput.writeFloat(T_a);
        objectOutput.writeInt(T_a_EMEP);
        objectOutput.writeFloat(RH);
        objectOutput.writeInt(RH_EMEP);
        objectOutput.writeFloat(PAR);
        objectOutput.writeInt(PAR_EMEP);
        objectOutput.writeFloat(R_PAR);
        objectOutput.writeInt(R_PAR_EMEP);
        objectOutput.writeFloat(Net_CNR4);
        objectOutput.writeInt(Net_CNR4_EMEP);
        objectOutput.writeFloat(Net_NRLite);
        objectOutput.writeInt(Net_NRLite_EMEP);
        objectOutput.writeFloat(Wsoil_1);
        objectOutput.writeInt(Wsoil_1_EMEP);
        objectOutput.writeFloat(Wsoil_2);
        objectOutput.writeInt(Wsoil_2_EMEP);
        objectOutput.writeFloat(T_p_B5);
        objectOutput.writeInt(T_p_B5_EMEP);
        objectOutput.writeFloat(T_p_B20);
        objectOutput.writeInt(T_p_B20_EMEP);
        objectOutput.writeFloat(T_p_B35);
        objectOutput.writeInt(T_p_B35_EMEP);
        objectOutput.writeFloat(T_p_B50);
        objectOutput.writeInt(T_p_B50_EMEP);
        objectOutput.writeFloat(T_p_C1);
        objectOutput.writeInt(T_p_C1_EMEP);
        objectOutput.writeFloat(T_p_C2);
        objectOutput.writeInt(T_p_C2_EMEP);
        objectOutput.writeFloat(T_p_C5);
        objectOutput.writeInt(T_p_C5_EMEP);
        objectOutput.writeFloat(T_p_C10);
        objectOutput.writeInt(T_p_C10_EMEP);
        objectOutput.writeFloat(T_p_C15);
        objectOutput.writeInt(T_p_C15_EMEP);
        objectOutput.writeFloat(T_p_C20);
        objectOutput.writeInt(T_p_C20_EMEP);
        objectOutput.writeFloat(T_p_C30);
        objectOutput.writeInt(T_p_C30_EMEP);
        objectOutput.writeFloat(T_p_C50);
        objectOutput.writeInt(T_p_C50_EMEP);
        objectOutput.writeFloat(T_p_C70);
        objectOutput.writeInt(T_p_C70_EMEP);
        objectOutput.writeFloat(T_p_C100);
        objectOutput.writeInt(T_p_C100_EMEP);
        objectOutput.writeFloat(WTD);
        objectOutput.writeInt(WTD_EMEP);
        objectOutput.writeFloat(Precip);
        objectOutput.writeInt(Precip_EMEP);
    }
}
