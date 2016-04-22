package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearTags;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SmearTags in entity cache.
 *
 * @author pj
 * @see SmearTags
 * @generated
 */
public class SmearTagsCacheModel implements CacheModel<SmearTags>,
    Externalizable {
    public long tagID;
    public String vocabulary;
    public String tag;
    public String displaykeyword;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{tagID=");
        sb.append(tagID);
        sb.append(", vocabulary=");
        sb.append(vocabulary);
        sb.append(", tag=");
        sb.append(tag);
        sb.append(", displaykeyword=");
        sb.append(displaykeyword);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearTags toEntityModel() {
        SmearTagsImpl smearTagsImpl = new SmearTagsImpl();

        smearTagsImpl.setTagID(tagID);

        if (vocabulary == null) {
            smearTagsImpl.setVocabulary(StringPool.BLANK);
        } else {
            smearTagsImpl.setVocabulary(vocabulary);
        }

        if (tag == null) {
            smearTagsImpl.setTag(StringPool.BLANK);
        } else {
            smearTagsImpl.setTag(tag);
        }

        if (displaykeyword == null) {
            smearTagsImpl.setDisplaykeyword(StringPool.BLANK);
        } else {
            smearTagsImpl.setDisplaykeyword(displaykeyword);
        }

        smearTagsImpl.resetOriginalValues();

        return smearTagsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tagID = objectInput.readLong();
        vocabulary = objectInput.readUTF();
        tag = objectInput.readUTF();
        displaykeyword = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tagID);

        if (vocabulary == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(vocabulary);
        }

        if (tag == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tag);
        }

        if (displaykeyword == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(displaykeyword);
        }
    }
}
