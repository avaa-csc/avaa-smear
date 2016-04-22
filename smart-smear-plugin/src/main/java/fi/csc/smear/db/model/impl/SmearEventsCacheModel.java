package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.smear.db.model.SmearEvents;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SmearEvents in entity cache.
 *
 * @author pj
 * @see SmearEvents
 * @generated
 */
public class SmearEventsCacheModel implements CacheModel<SmearEvents>,
    Externalizable {
    public long eventID;
    public String event_type;
    public String event;
    public String who;
    public long period_start;
    public long period_end;
    public long etimestamp;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{eventID=");
        sb.append(eventID);
        sb.append(", event_type=");
        sb.append(event_type);
        sb.append(", event=");
        sb.append(event);
        sb.append(", who=");
        sb.append(who);
        sb.append(", period_start=");
        sb.append(period_start);
        sb.append(", period_end=");
        sb.append(period_end);
        sb.append(", etimestamp=");
        sb.append(etimestamp);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SmearEvents toEntityModel() {
        SmearEventsImpl smearEventsImpl = new SmearEventsImpl();

        smearEventsImpl.setEventID(eventID);

        if (event_type == null) {
            smearEventsImpl.setEvent_type(StringPool.BLANK);
        } else {
            smearEventsImpl.setEvent_type(event_type);
        }

        if (event == null) {
            smearEventsImpl.setEvent(StringPool.BLANK);
        } else {
            smearEventsImpl.setEvent(event);
        }

        if (who == null) {
            smearEventsImpl.setWho(StringPool.BLANK);
        } else {
            smearEventsImpl.setWho(who);
        }

        if (period_start == Long.MIN_VALUE) {
            smearEventsImpl.setPeriod_start(null);
        } else {
            smearEventsImpl.setPeriod_start(new Date(period_start));
        }

        if (period_end == Long.MIN_VALUE) {
            smearEventsImpl.setPeriod_end(null);
        } else {
            smearEventsImpl.setPeriod_end(new Date(period_end));
        }

        if (etimestamp == Long.MIN_VALUE) {
            smearEventsImpl.setEtimestamp(null);
        } else {
            smearEventsImpl.setEtimestamp(new Date(etimestamp));
        }

        smearEventsImpl.resetOriginalValues();

        return smearEventsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        eventID = objectInput.readLong();
        event_type = objectInput.readUTF();
        event = objectInput.readUTF();
        who = objectInput.readUTF();
        period_start = objectInput.readLong();
        period_end = objectInput.readLong();
        etimestamp = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(eventID);

        if (event_type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(event_type);
        }

        if (event == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(event);
        }

        if (who == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(who);
        }

        objectOutput.writeLong(period_start);
        objectOutput.writeLong(period_end);
        objectOutput.writeLong(etimestamp);
    }
}
