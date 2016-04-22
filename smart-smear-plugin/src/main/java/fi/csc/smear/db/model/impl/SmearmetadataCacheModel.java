package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.Smearmetadata;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Smearmetadata in entity cache.
 *
 * @author pj
 * @see Smearmetadata
 * @generated
 */
public class SmearmetadataCacheModel implements CacheModel<Smearmetadata>,
    Externalizable {
    public String title;
    public String rightsCategory;
    public String access_rights;
    public String project;
    public String maintaining_organisation;
    public String contact;
    public String ref;
    public String creator;
    public String discipline;
    public long timestamp;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{title=");
        sb.append(title);
        sb.append(", rightsCategory=");
        sb.append(rightsCategory);
        sb.append(", access_rights=");
        sb.append(access_rights);
        sb.append(", project=");
        sb.append(project);
        sb.append(", maintaining_organisation=");
        sb.append(maintaining_organisation);
        sb.append(", contact=");
        sb.append(contact);
        sb.append(", ref=");
        sb.append(ref);
        sb.append(", creator=");
        sb.append(creator);
        sb.append(", discipline=");
        sb.append(discipline);
        sb.append(", timestamp=");
        sb.append(timestamp);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Smearmetadata toEntityModel() {
        SmearmetadataImpl smearmetadataImpl = new SmearmetadataImpl();

        if (title == null) {
            smearmetadataImpl.setTitle(StringPool.BLANK);
        } else {
            smearmetadataImpl.setTitle(title);
        }

        if (rightsCategory == null) {
            smearmetadataImpl.setRightsCategory(StringPool.BLANK);
        } else {
            smearmetadataImpl.setRightsCategory(rightsCategory);
        }

        if (access_rights == null) {
            smearmetadataImpl.setAccess_rights(StringPool.BLANK);
        } else {
            smearmetadataImpl.setAccess_rights(access_rights);
        }

        if (project == null) {
            smearmetadataImpl.setProject(StringPool.BLANK);
        } else {
            smearmetadataImpl.setProject(project);
        }

        if (maintaining_organisation == null) {
            smearmetadataImpl.setMaintaining_organisation(StringPool.BLANK);
        } else {
            smearmetadataImpl.setMaintaining_organisation(maintaining_organisation);
        }

        if (contact == null) {
            smearmetadataImpl.setContact(StringPool.BLANK);
        } else {
            smearmetadataImpl.setContact(contact);
        }

        if (ref == null) {
            smearmetadataImpl.setRef(StringPool.BLANK);
        } else {
            smearmetadataImpl.setRef(ref);
        }

        if (creator == null) {
            smearmetadataImpl.setCreator(StringPool.BLANK);
        } else {
            smearmetadataImpl.setCreator(creator);
        }

        if (discipline == null) {
            smearmetadataImpl.setDiscipline(StringPool.BLANK);
        } else {
            smearmetadataImpl.setDiscipline(discipline);
        }

        if (timestamp == Long.MIN_VALUE) {
            smearmetadataImpl.setTimestamp(null);
        } else {
            smearmetadataImpl.setTimestamp(new Date(timestamp));
        }

        smearmetadataImpl.resetOriginalValues();

        return smearmetadataImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        title = objectInput.readUTF();
        rightsCategory = objectInput.readUTF();
        access_rights = objectInput.readUTF();
        project = objectInput.readUTF();
        maintaining_organisation = objectInput.readUTF();
        contact = objectInput.readUTF();
        ref = objectInput.readUTF();
        creator = objectInput.readUTF();
        discipline = objectInput.readUTF();
        timestamp = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (rightsCategory == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rightsCategory);
        }

        if (access_rights == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(access_rights);
        }

        if (project == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(project);
        }

        if (maintaining_organisation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(maintaining_organisation);
        }

        if (contact == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contact);
        }

        if (ref == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ref);
        }

        if (creator == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(creator);
        }

        if (discipline == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(discipline);
        }

        objectOutput.writeLong(timestamp);
    }
}
