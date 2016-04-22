package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Kumpulameta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Kumpulameta in entity cache.
 *
 * @author pj
 * @see Kumpulameta
 * @generated
 */
public class KumpulametaCacheModel implements CacheModel<Kumpulameta>,
    Externalizable {
    public long samptime;
    public float t;
    public float dp;
    public float rh;
    public float p;
    public float ws;
    public float wdir;
    public float rmm;
    public float p0;
    public float glob;
    public float par;
    public float skyir;
    public float pwd_visibility_1;
    public float pwd_visibility_10;
    public float pwd_wmo_0;
    public float pwd_wmo_15;
    public float pwd_wmo_60;
    public float pwd_intensity_w;
    public float pwd_rmm;
    public float pwd_smm;
    public String pwd_nws;
    public float Tower_T_4m;
    public float Tower_T_8m;
    public float Tower_T_16m;
    public float Tower_T_32m;
    public float Tower_WS_32m;
    public float Tower_WS_16m;
    public float Tower_WS_8m;
    public float Tower_WS_4m;
    public float Tower_WDIR_32m;
    public float Tower_WDIR_16m;
    public float Tower_WDIR_8m;
    public float Tower_WDIR_4m;
    public float Tower_PAR_32m;
    public float Tower_PAR_REFL_32m;
    public float Tower_GLOB_32m;
    public float Tower_GLOB_REFL_32m;
    public float Tower_IR_32m;
    public float Tower_IR_REFL_32m;
    public float Tower_VT_4m;
    public float Tower_VT_8m;
    public float Tower_VT_16m;
    public float Tower_VT_32m;
    public float O_3;
    public float NO;
    public float NO_x;
    public float SO_2;
    public float CO;
    public float Tower_WS_MAX_32m;
    public float Tower_WS_MAX_16m;
    public float Tower_WS_MAX_8m;
    public float Tower_WS_MAX_4m;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(105);

        sb.append("{samptime=");
        sb.append(samptime);
        sb.append(", t=");
        sb.append(t);
        sb.append(", dp=");
        sb.append(dp);
        sb.append(", rh=");
        sb.append(rh);
        sb.append(", p=");
        sb.append(p);
        sb.append(", ws=");
        sb.append(ws);
        sb.append(", wdir=");
        sb.append(wdir);
        sb.append(", rmm=");
        sb.append(rmm);
        sb.append(", p0=");
        sb.append(p0);
        sb.append(", glob=");
        sb.append(glob);
        sb.append(", par=");
        sb.append(par);
        sb.append(", skyir=");
        sb.append(skyir);
        sb.append(", pwd_visibility_1=");
        sb.append(pwd_visibility_1);
        sb.append(", pwd_visibility_10=");
        sb.append(pwd_visibility_10);
        sb.append(", pwd_wmo_0=");
        sb.append(pwd_wmo_0);
        sb.append(", pwd_wmo_15=");
        sb.append(pwd_wmo_15);
        sb.append(", pwd_wmo_60=");
        sb.append(pwd_wmo_60);
        sb.append(", pwd_intensity_w=");
        sb.append(pwd_intensity_w);
        sb.append(", pwd_rmm=");
        sb.append(pwd_rmm);
        sb.append(", pwd_smm=");
        sb.append(pwd_smm);
        sb.append(", pwd_nws=");
        sb.append(pwd_nws);
        sb.append(", Tower_T_4m=");
        sb.append(Tower_T_4m);
        sb.append(", Tower_T_8m=");
        sb.append(Tower_T_8m);
        sb.append(", Tower_T_16m=");
        sb.append(Tower_T_16m);
        sb.append(", Tower_T_32m=");
        sb.append(Tower_T_32m);
        sb.append(", Tower_WS_32m=");
        sb.append(Tower_WS_32m);
        sb.append(", Tower_WS_16m=");
        sb.append(Tower_WS_16m);
        sb.append(", Tower_WS_8m=");
        sb.append(Tower_WS_8m);
        sb.append(", Tower_WS_4m=");
        sb.append(Tower_WS_4m);
        sb.append(", Tower_WDIR_32m=");
        sb.append(Tower_WDIR_32m);
        sb.append(", Tower_WDIR_16m=");
        sb.append(Tower_WDIR_16m);
        sb.append(", Tower_WDIR_8m=");
        sb.append(Tower_WDIR_8m);
        sb.append(", Tower_WDIR_4m=");
        sb.append(Tower_WDIR_4m);
        sb.append(", Tower_PAR_32m=");
        sb.append(Tower_PAR_32m);
        sb.append(", Tower_PAR_REFL_32m=");
        sb.append(Tower_PAR_REFL_32m);
        sb.append(", Tower_GLOB_32m=");
        sb.append(Tower_GLOB_32m);
        sb.append(", Tower_GLOB_REFL_32m=");
        sb.append(Tower_GLOB_REFL_32m);
        sb.append(", Tower_IR_32m=");
        sb.append(Tower_IR_32m);
        sb.append(", Tower_IR_REFL_32m=");
        sb.append(Tower_IR_REFL_32m);
        sb.append(", Tower_VT_4m=");
        sb.append(Tower_VT_4m);
        sb.append(", Tower_VT_8m=");
        sb.append(Tower_VT_8m);
        sb.append(", Tower_VT_16m=");
        sb.append(Tower_VT_16m);
        sb.append(", Tower_VT_32m=");
        sb.append(Tower_VT_32m);
        sb.append(", O_3=");
        sb.append(O_3);
        sb.append(", NO=");
        sb.append(NO);
        sb.append(", NO_x=");
        sb.append(NO_x);
        sb.append(", SO_2=");
        sb.append(SO_2);
        sb.append(", CO=");
        sb.append(CO);
        sb.append(", Tower_WS_MAX_32m=");
        sb.append(Tower_WS_MAX_32m);
        sb.append(", Tower_WS_MAX_16m=");
        sb.append(Tower_WS_MAX_16m);
        sb.append(", Tower_WS_MAX_8m=");
        sb.append(Tower_WS_MAX_8m);
        sb.append(", Tower_WS_MAX_4m=");
        sb.append(Tower_WS_MAX_4m);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Kumpulameta toEntityModel() {
        KumpulametaImpl kumpulametaImpl = new KumpulametaImpl();

        if (samptime == Long.MIN_VALUE) {
            kumpulametaImpl.setSamptime(null);
        } else {
            kumpulametaImpl.setSamptime(new Date(samptime));
        }

        kumpulametaImpl.setT(t);
        kumpulametaImpl.setDp(dp);
        kumpulametaImpl.setRh(rh);
        kumpulametaImpl.setP(p);
        kumpulametaImpl.setWs(ws);
        kumpulametaImpl.setWdir(wdir);
        kumpulametaImpl.setRmm(rmm);
        kumpulametaImpl.setP0(p0);
        kumpulametaImpl.setGlob(glob);
        kumpulametaImpl.setPar(par);
        kumpulametaImpl.setSkyir(skyir);
        kumpulametaImpl.setPwd_visibility_1(pwd_visibility_1);
        kumpulametaImpl.setPwd_visibility_10(pwd_visibility_10);
        kumpulametaImpl.setPwd_wmo_0(pwd_wmo_0);
        kumpulametaImpl.setPwd_wmo_15(pwd_wmo_15);
        kumpulametaImpl.setPwd_wmo_60(pwd_wmo_60);
        kumpulametaImpl.setPwd_intensity_w(pwd_intensity_w);
        kumpulametaImpl.setPwd_rmm(pwd_rmm);
        kumpulametaImpl.setPwd_smm(pwd_smm);

        if (pwd_nws == null) {
            kumpulametaImpl.setPwd_nws(StringPool.BLANK);
        } else {
            kumpulametaImpl.setPwd_nws(pwd_nws);
        }

        kumpulametaImpl.setTower_T_4m(Tower_T_4m);
        kumpulametaImpl.setTower_T_8m(Tower_T_8m);
        kumpulametaImpl.setTower_T_16m(Tower_T_16m);
        kumpulametaImpl.setTower_T_32m(Tower_T_32m);
        kumpulametaImpl.setTower_WS_32m(Tower_WS_32m);
        kumpulametaImpl.setTower_WS_16m(Tower_WS_16m);
        kumpulametaImpl.setTower_WS_8m(Tower_WS_8m);
        kumpulametaImpl.setTower_WS_4m(Tower_WS_4m);
        kumpulametaImpl.setTower_WDIR_32m(Tower_WDIR_32m);
        kumpulametaImpl.setTower_WDIR_16m(Tower_WDIR_16m);
        kumpulametaImpl.setTower_WDIR_8m(Tower_WDIR_8m);
        kumpulametaImpl.setTower_WDIR_4m(Tower_WDIR_4m);
        kumpulametaImpl.setTower_PAR_32m(Tower_PAR_32m);
        kumpulametaImpl.setTower_PAR_REFL_32m(Tower_PAR_REFL_32m);
        kumpulametaImpl.setTower_GLOB_32m(Tower_GLOB_32m);
        kumpulametaImpl.setTower_GLOB_REFL_32m(Tower_GLOB_REFL_32m);
        kumpulametaImpl.setTower_IR_32m(Tower_IR_32m);
        kumpulametaImpl.setTower_IR_REFL_32m(Tower_IR_REFL_32m);
        kumpulametaImpl.setTower_VT_4m(Tower_VT_4m);
        kumpulametaImpl.setTower_VT_8m(Tower_VT_8m);
        kumpulametaImpl.setTower_VT_16m(Tower_VT_16m);
        kumpulametaImpl.setTower_VT_32m(Tower_VT_32m);
        kumpulametaImpl.setO_3(O_3);
        kumpulametaImpl.setNO(NO);
        kumpulametaImpl.setNO_x(NO_x);
        kumpulametaImpl.setSO_2(SO_2);
        kumpulametaImpl.setCO(CO);
        kumpulametaImpl.setTower_WS_MAX_32m(Tower_WS_MAX_32m);
        kumpulametaImpl.setTower_WS_MAX_16m(Tower_WS_MAX_16m);
        kumpulametaImpl.setTower_WS_MAX_8m(Tower_WS_MAX_8m);
        kumpulametaImpl.setTower_WS_MAX_4m(Tower_WS_MAX_4m);

        kumpulametaImpl.resetOriginalValues();

        return kumpulametaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        samptime = objectInput.readLong();
        t = objectInput.readFloat();
        dp = objectInput.readFloat();
        rh = objectInput.readFloat();
        p = objectInput.readFloat();
        ws = objectInput.readFloat();
        wdir = objectInput.readFloat();
        rmm = objectInput.readFloat();
        p0 = objectInput.readFloat();
        glob = objectInput.readFloat();
        par = objectInput.readFloat();
        skyir = objectInput.readFloat();
        pwd_visibility_1 = objectInput.readFloat();
        pwd_visibility_10 = objectInput.readFloat();
        pwd_wmo_0 = objectInput.readFloat();
        pwd_wmo_15 = objectInput.readFloat();
        pwd_wmo_60 = objectInput.readFloat();
        pwd_intensity_w = objectInput.readFloat();
        pwd_rmm = objectInput.readFloat();
        pwd_smm = objectInput.readFloat();
        pwd_nws = objectInput.readUTF();
        Tower_T_4m = objectInput.readFloat();
        Tower_T_8m = objectInput.readFloat();
        Tower_T_16m = objectInput.readFloat();
        Tower_T_32m = objectInput.readFloat();
        Tower_WS_32m = objectInput.readFloat();
        Tower_WS_16m = objectInput.readFloat();
        Tower_WS_8m = objectInput.readFloat();
        Tower_WS_4m = objectInput.readFloat();
        Tower_WDIR_32m = objectInput.readFloat();
        Tower_WDIR_16m = objectInput.readFloat();
        Tower_WDIR_8m = objectInput.readFloat();
        Tower_WDIR_4m = objectInput.readFloat();
        Tower_PAR_32m = objectInput.readFloat();
        Tower_PAR_REFL_32m = objectInput.readFloat();
        Tower_GLOB_32m = objectInput.readFloat();
        Tower_GLOB_REFL_32m = objectInput.readFloat();
        Tower_IR_32m = objectInput.readFloat();
        Tower_IR_REFL_32m = objectInput.readFloat();
        Tower_VT_4m = objectInput.readFloat();
        Tower_VT_8m = objectInput.readFloat();
        Tower_VT_16m = objectInput.readFloat();
        Tower_VT_32m = objectInput.readFloat();
        O_3 = objectInput.readFloat();
        NO = objectInput.readFloat();
        NO_x = objectInput.readFloat();
        SO_2 = objectInput.readFloat();
        CO = objectInput.readFloat();
        Tower_WS_MAX_32m = objectInput.readFloat();
        Tower_WS_MAX_16m = objectInput.readFloat();
        Tower_WS_MAX_8m = objectInput.readFloat();
        Tower_WS_MAX_4m = objectInput.readFloat();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(samptime);
        objectOutput.writeFloat(t);
        objectOutput.writeFloat(dp);
        objectOutput.writeFloat(rh);
        objectOutput.writeFloat(p);
        objectOutput.writeFloat(ws);
        objectOutput.writeFloat(wdir);
        objectOutput.writeFloat(rmm);
        objectOutput.writeFloat(p0);
        objectOutput.writeFloat(glob);
        objectOutput.writeFloat(par);
        objectOutput.writeFloat(skyir);
        objectOutput.writeFloat(pwd_visibility_1);
        objectOutput.writeFloat(pwd_visibility_10);
        objectOutput.writeFloat(pwd_wmo_0);
        objectOutput.writeFloat(pwd_wmo_15);
        objectOutput.writeFloat(pwd_wmo_60);
        objectOutput.writeFloat(pwd_intensity_w);
        objectOutput.writeFloat(pwd_rmm);
        objectOutput.writeFloat(pwd_smm);

        if (pwd_nws == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pwd_nws);
        }

        objectOutput.writeFloat(Tower_T_4m);
        objectOutput.writeFloat(Tower_T_8m);
        objectOutput.writeFloat(Tower_T_16m);
        objectOutput.writeFloat(Tower_T_32m);
        objectOutput.writeFloat(Tower_WS_32m);
        objectOutput.writeFloat(Tower_WS_16m);
        objectOutput.writeFloat(Tower_WS_8m);
        objectOutput.writeFloat(Tower_WS_4m);
        objectOutput.writeFloat(Tower_WDIR_32m);
        objectOutput.writeFloat(Tower_WDIR_16m);
        objectOutput.writeFloat(Tower_WDIR_8m);
        objectOutput.writeFloat(Tower_WDIR_4m);
        objectOutput.writeFloat(Tower_PAR_32m);
        objectOutput.writeFloat(Tower_PAR_REFL_32m);
        objectOutput.writeFloat(Tower_GLOB_32m);
        objectOutput.writeFloat(Tower_GLOB_REFL_32m);
        objectOutput.writeFloat(Tower_IR_32m);
        objectOutput.writeFloat(Tower_IR_REFL_32m);
        objectOutput.writeFloat(Tower_VT_4m);
        objectOutput.writeFloat(Tower_VT_8m);
        objectOutput.writeFloat(Tower_VT_16m);
        objectOutput.writeFloat(Tower_VT_32m);
        objectOutput.writeFloat(O_3);
        objectOutput.writeFloat(NO);
        objectOutput.writeFloat(NO_x);
        objectOutput.writeFloat(SO_2);
        objectOutput.writeFloat(CO);
        objectOutput.writeFloat(Tower_WS_MAX_32m);
        objectOutput.writeFloat(Tower_WS_MAX_16m);
        objectOutput.writeFloat(Tower_WS_MAX_8m);
        objectOutput.writeFloat(Tower_WS_MAX_4m);
    }
}
