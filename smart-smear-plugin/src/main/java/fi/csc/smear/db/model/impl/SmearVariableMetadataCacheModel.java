package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearVariableMetadata;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SmearVariableMetadata in entity cache.
 *
 * @author pj
 * @see SmearVariableMetadata
 * @generated
 */
public class SmearVariableMetadataCacheModel implements CacheModel<SmearVariableMetadata>,
    Externalizable {
    public long variableID;
    public long tableID;
    public String variable;
    public String description;
    public String unit;
    public String title;
    public String source;
    public long period_start;
    public long period_end;
    public long coverage;
    public String rights;
    public boolean mandatory;
    public boolean derivative;
    public long vtimestamp;
    public String category;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{variableID=");
        sb.append(variableID);
        sb.append(", tableID=");
        sb.append(tableID);
        sb.append(", variable=");
        sb.append(variable);
        sb.append(", description=");
        sb.append(description);
        sb.append(", unit=");
        sb.append(unit);
        sb.append(", title=");
        sb.append(title);
        sb.append(", source=");
        sb.append(source);
        sb.append(", period_start=");
        sb.append(period_start);
        sb.append(", period_end=");
        sb.append(period_end);
        sb.append(", coverage=");
        sb.append(coverage);
        sb.append(", rights=");
        sb.append(rights);
        sb.append(", mandatory=");
        sb.append(mandatory);
        sb.append(", derivative=");
        sb.append(derivative);
        sb.append(", vtimestamp=");
        sb.append(vtimestamp);
        sb.append(", category=");
        sb.append(category);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearVariableMetadata toEntityModel() {
        SmearVariableMetadataImpl smearVariableMetadataImpl = new SmearVariableMetadataImpl();

        smearVariableMetadataImpl.setVariableID(variableID);
        smearVariableMetadataImpl.setTableID(tableID);

        if (variable == null) {
            smearVariableMetadataImpl.setVariable(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setVariable(variable);
        }

        if (description == null) {
            smearVariableMetadataImpl.setDescription(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setDescription(description);
        }

        if (unit == null) {
            smearVariableMetadataImpl.setUnit(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setUnit(unit);
        }

        if (title == null) {
            smearVariableMetadataImpl.setTitle(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setTitle(title);
        }

        if (source == null) {
            smearVariableMetadataImpl.setSource(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setSource(source);
        }

        if (period_start == Long.MIN_VALUE) {
            smearVariableMetadataImpl.setPeriod_start(null);
        } else {
            smearVariableMetadataImpl.setPeriod_start(new Date(period_start));
        }

        if (period_end == Long.MIN_VALUE) {
            smearVariableMetadataImpl.setPeriod_end(null);
        } else {
            smearVariableMetadataImpl.setPeriod_end(new Date(period_end));
        }

        smearVariableMetadataImpl.setCoverage(coverage);

        if (rights == null) {
            smearVariableMetadataImpl.setRights(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setRights(rights);
        }

        smearVariableMetadataImpl.setMandatory(mandatory);
        smearVariableMetadataImpl.setDerivative(derivative);

        if (vtimestamp == Long.MIN_VALUE) {
            smearVariableMetadataImpl.setVtimestamp(null);
        } else {
            smearVariableMetadataImpl.setVtimestamp(new Date(vtimestamp));
        }

        if (category == null) {
            smearVariableMetadataImpl.setCategory(StringPool.BLANK);
        } else {
            smearVariableMetadataImpl.setCategory(category);
        }

        smearVariableMetadataImpl.resetOriginalValues();

        return smearVariableMetadataImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        variableID = objectInput.readLong();
        tableID = objectInput.readLong();
        variable = objectInput.readUTF();
        description = objectInput.readUTF();
        unit = objectInput.readUTF();
        title = objectInput.readUTF();
        source = objectInput.readUTF();
        period_start = objectInput.readLong();
        period_end = objectInput.readLong();
        coverage = objectInput.readLong();
        rights = objectInput.readUTF();
        mandatory = objectInput.readBoolean();
        derivative = objectInput.readBoolean();
        vtimestamp = objectInput.readLong();
        category = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(variableID);
        objectOutput.writeLong(tableID);

        if (variable == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(variable);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (unit == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(unit);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (source == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(source);
        }

        objectOutput.writeLong(period_start);
        objectOutput.writeLong(period_end);
        objectOutput.writeLong(coverage);

        if (rights == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rights);
        }

        objectOutput.writeBoolean(mandatory);
        objectOutput.writeBoolean(derivative);
        objectOutput.writeLong(vtimestamp);

        if (category == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(category);
        }
    }
}
