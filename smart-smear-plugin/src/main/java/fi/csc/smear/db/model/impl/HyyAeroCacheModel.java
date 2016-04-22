package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.HyyAero;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HyyAero in entity cache.
 *
 * @author pj
 * @see HyyAero
 * @generated
 */
public class HyyAeroCacheModel implements CacheModel<HyyAero>, Externalizable {
    public long samptime;
    public float cn;
    public float cn_t;
    public float cn_p;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{samptime=");
        sb.append(samptime);
        sb.append(", cn=");
        sb.append(cn);
        sb.append(", cn_t=");
        sb.append(cn_t);
        sb.append(", cn_p=");
        sb.append(cn_p);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public HyyAero toEntityModel() {
        HyyAeroImpl hyyAeroImpl = new HyyAeroImpl();

        if (samptime == Long.MIN_VALUE) {
            hyyAeroImpl.setSamptime(null);
        } else {
            hyyAeroImpl.setSamptime(new Date(samptime));
        }

        hyyAeroImpl.setCn(cn);
        hyyAeroImpl.setCn_t(cn_t);
        hyyAeroImpl.setCn_p(cn_p);

        hyyAeroImpl.resetOriginalValues();

        return hyyAeroImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        samptime = objectInput.readLong();
        cn = objectInput.readFloat();
        cn_t = objectInput.readFloat();
        cn_p = objectInput.readFloat();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(samptime);
        objectOutput.writeFloat(cn);
        objectOutput.writeFloat(cn_t);
        objectOutput.writeFloat(cn_p);
    }
}
