package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Smearstation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Smearstation in entity cache.
 *
 * @author pj
 * @see Smearstation
 * @generated
 */
public class SmearstationCacheModel implements CacheModel<Smearstation>,
    Externalizable {
    public long stationID;
    public String dcmipoint;
    public String name;
    public boolean dataAvail;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{stationID=");
        sb.append(stationID);
        sb.append(", dcmipoint=");
        sb.append(dcmipoint);
        sb.append(", name=");
        sb.append(name);
        sb.append(", dataAvail=");
        sb.append(dataAvail);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Smearstation toEntityModel() {
        SmearstationImpl smearstationImpl = new SmearstationImpl();

        smearstationImpl.setStationID(stationID);

        if (dcmipoint == null) {
            smearstationImpl.setDcmipoint(StringPool.BLANK);
        } else {
            smearstationImpl.setDcmipoint(dcmipoint);
        }

        if (name == null) {
            smearstationImpl.setName(StringPool.BLANK);
        } else {
            smearstationImpl.setName(name);
        }

        smearstationImpl.setDataAvail(dataAvail);

        smearstationImpl.resetOriginalValues();

        return smearstationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        stationID = objectInput.readLong();
        dcmipoint = objectInput.readUTF();
        name = objectInput.readUTF();
        dataAvail = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(stationID);

        if (dcmipoint == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dcmipoint);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeBoolean(dataAvail);
    }
}
