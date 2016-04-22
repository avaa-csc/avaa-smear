package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearvariableEvent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SmearvariableEvent in entity cache.
 *
 * @author pj
 * @see SmearvariableEvent
 * @generated
 */
public class SmearvariableEventCacheModel implements CacheModel<SmearvariableEvent>,
    Externalizable {
    public long eventID;
    public long variableID;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{eventID=");
        sb.append(eventID);
        sb.append(", variableID=");
        sb.append(variableID);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearvariableEvent toEntityModel() {
        SmearvariableEventImpl smearvariableEventImpl = new SmearvariableEventImpl();

        smearvariableEventImpl.setEventID(eventID);
        smearvariableEventImpl.setVariableID(variableID);

        smearvariableEventImpl.resetOriginalValues();

        return smearvariableEventImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        eventID = objectInput.readLong();
        variableID = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(eventID);
        objectOutput.writeLong(variableID);
    }
}
