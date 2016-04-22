package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearvariableTags;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SmearvariableTags in entity cache.
 *
 * @author pj
 * @see SmearvariableTags
 * @generated
 */
public class SmearvariableTagsCacheModel implements CacheModel<SmearvariableTags>,
    Externalizable {
    public long tagID;
    public long variableID;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{tagID=");
        sb.append(tagID);
        sb.append(", variableID=");
        sb.append(variableID);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearvariableTags toEntityModel() {
        SmearvariableTagsImpl smearvariableTagsImpl = new SmearvariableTagsImpl();

        smearvariableTagsImpl.setTagID(tagID);
        smearvariableTagsImpl.setVariableID(variableID);

        smearvariableTagsImpl.resetOriginalValues();

        return smearvariableTagsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tagID = objectInput.readLong();
        variableID = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tagID);
        objectOutput.writeLong(variableID);
    }
}
