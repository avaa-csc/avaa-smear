package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author pj
 * @generated
 */
public class SmearvariableEventPK implements Comparable<SmearvariableEventPK>,
    Serializable {
    public long eventID;
    public long variableID;

    public SmearvariableEventPK() {
    }

    public SmearvariableEventPK(long eventID, long variableID) {
        this.eventID = eventID;
        this.variableID = variableID;
    }

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public long getVariableID() {
        return variableID;
    }

    public void setVariableID(long variableID) {
        this.variableID = variableID;
    }

    @Override
    public int compareTo(SmearvariableEventPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (eventID < pk.eventID) {
            value = -1;
        } else if (eventID > pk.eventID) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (variableID < pk.variableID) {
            value = -1;
        } else if (variableID > pk.variableID) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SmearvariableEventPK)) {
            return false;
        }

        SmearvariableEventPK pk = (SmearvariableEventPK) obj;

        if ((eventID == pk.eventID) && (variableID == pk.variableID)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(eventID) + String.valueOf(variableID)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("eventID");
        sb.append(StringPool.EQUAL);
        sb.append(eventID);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("variableID");
        sb.append(StringPool.EQUAL);
        sb.append(variableID);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
