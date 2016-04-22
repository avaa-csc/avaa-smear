package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Sii2meta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sii2meta in entity cache.
 *
 * @author pj
 * @see Sii2meta
 * @generated
 */
public class Sii2metaCacheModel implements CacheModel<Sii2meta>, Externalizable {
    public long samptime;
    public float T_a;
    public int T_a_EMEP;
    public float RH;
    public int RH_EMEP;
    public float Net;
    public int Net_EMEP;
    public float T_p_5;
    public int T_p_5_EMEP;
    public float T_p_B20;
    public int T_p_B20_EMEP;
    public float T_p_B35;
    public int T_p_B35_EMEP;
    public float T_p_B50;
    public int T_p_B50_EMEP;
    public float WTD;
    public int WTD_EMEP;
    public float Precip;
    public int Precip_EMEP;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(39);

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
        sb.append(", Net=");
        sb.append(Net);
        sb.append(", Net_EMEP=");
        sb.append(Net_EMEP);
        sb.append(", T_p_5=");
        sb.append(T_p_5);
        sb.append(", T_p_5_EMEP=");
        sb.append(T_p_5_EMEP);
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
    public Sii2meta toEntityModel() {
        Sii2metaImpl sii2metaImpl = new Sii2metaImpl();

        if (samptime == Long.MIN_VALUE) {
            sii2metaImpl.setSamptime(null);
        } else {
            sii2metaImpl.setSamptime(new Date(samptime));
        }

        sii2metaImpl.setT_a(T_a);
        sii2metaImpl.setT_a_EMEP(T_a_EMEP);
        sii2metaImpl.setRH(RH);
        sii2metaImpl.setRH_EMEP(RH_EMEP);
        sii2metaImpl.setNet(Net);
        sii2metaImpl.setNet_EMEP(Net_EMEP);
        sii2metaImpl.setT_p_5(T_p_5);
        sii2metaImpl.setT_p_5_EMEP(T_p_5_EMEP);
        sii2metaImpl.setT_p_B20(T_p_B20);
        sii2metaImpl.setT_p_B20_EMEP(T_p_B20_EMEP);
        sii2metaImpl.setT_p_B35(T_p_B35);
        sii2metaImpl.setT_p_B35_EMEP(T_p_B35_EMEP);
        sii2metaImpl.setT_p_B50(T_p_B50);
        sii2metaImpl.setT_p_B50_EMEP(T_p_B50_EMEP);
        sii2metaImpl.setWTD(WTD);
        sii2metaImpl.setWTD_EMEP(WTD_EMEP);
        sii2metaImpl.setPrecip(Precip);
        sii2metaImpl.setPrecip_EMEP(Precip_EMEP);

        sii2metaImpl.resetOriginalValues();

        return sii2metaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        samptime = objectInput.readLong();
        T_a = objectInput.readFloat();
        T_a_EMEP = objectInput.readInt();
        RH = objectInput.readFloat();
        RH_EMEP = objectInput.readInt();
        Net = objectInput.readFloat();
        Net_EMEP = objectInput.readInt();
        T_p_5 = objectInput.readFloat();
        T_p_5_EMEP = objectInput.readInt();
        T_p_B20 = objectInput.readFloat();
        T_p_B20_EMEP = objectInput.readInt();
        T_p_B35 = objectInput.readFloat();
        T_p_B35_EMEP = objectInput.readInt();
        T_p_B50 = objectInput.readFloat();
        T_p_B50_EMEP = objectInput.readInt();
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
        objectOutput.writeFloat(Net);
        objectOutput.writeInt(Net_EMEP);
        objectOutput.writeFloat(T_p_5);
        objectOutput.writeInt(T_p_5_EMEP);
        objectOutput.writeFloat(T_p_B20);
        objectOutput.writeInt(T_p_B20_EMEP);
        objectOutput.writeFloat(T_p_B35);
        objectOutput.writeInt(T_p_B35_EMEP);
        objectOutput.writeFloat(T_p_B50);
        objectOutput.writeInt(T_p_B50_EMEP);
        objectOutput.writeFloat(WTD);
        objectOutput.writeInt(WTD_EMEP);
        objectOutput.writeFloat(Precip);
        objectOutput.writeInt(Precip_EMEP);
    }
}
