package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearTableMetadata;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SmearTableMetadata in entity cache.
 *
 * @author pj
 * @see SmearTableMetadata
 * @generated
 */
public class SmearTableMetadataCacheModel implements CacheModel<SmearTableMetadata>,
    Externalizable {
    public long tableID;
    public String identifier;
    public String title;
    public String spatial_coverage;
    public String name;
    public long ttimestamp;
    public int period;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{tableID=");
        sb.append(tableID);
        sb.append(", identifier=");
        sb.append(identifier);
        sb.append(", title=");
        sb.append(title);
        sb.append(", spatial_coverage=");
        sb.append(spatial_coverage);
        sb.append(", name=");
        sb.append(name);
        sb.append(", ttimestamp=");
        sb.append(ttimestamp);
        sb.append(", period=");
        sb.append(period);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearTableMetadata toEntityModel() {
        SmearTableMetadataImpl smearTableMetadataImpl = new SmearTableMetadataImpl();

        smearTableMetadataImpl.setTableID(tableID);

        if (identifier == null) {
            smearTableMetadataImpl.setIdentifier(StringPool.BLANK);
        } else {
            smearTableMetadataImpl.setIdentifier(identifier);
        }

        if (title == null) {
            smearTableMetadataImpl.setTitle(StringPool.BLANK);
        } else {
            smearTableMetadataImpl.setTitle(title);
        }

        if (spatial_coverage == null) {
            smearTableMetadataImpl.setSpatial_coverage(StringPool.BLANK);
        } else {
            smearTableMetadataImpl.setSpatial_coverage(spatial_coverage);
        }

        if (name == null) {
            smearTableMetadataImpl.setName(StringPool.BLANK);
        } else {
            smearTableMetadataImpl.setName(name);
        }

        if (ttimestamp == Long.MIN_VALUE) {
            smearTableMetadataImpl.setTtimestamp(null);
        } else {
            smearTableMetadataImpl.setTtimestamp(new Date(ttimestamp));
        }

        smearTableMetadataImpl.setPeriod(period);

        smearTableMetadataImpl.resetOriginalValues();

        return smearTableMetadataImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tableID = objectInput.readLong();
        identifier = objectInput.readUTF();
        title = objectInput.readUTF();
        spatial_coverage = objectInput.readUTF();
        name = objectInput.readUTF();
        ttimestamp = objectInput.readLong();
        period = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tableID);

        if (identifier == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(identifier);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (spatial_coverage == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(spatial_coverage);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(ttimestamp);
        objectOutput.writeInt(period);
    }
}
