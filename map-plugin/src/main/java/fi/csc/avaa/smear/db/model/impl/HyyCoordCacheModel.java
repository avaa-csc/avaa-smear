package fi.csc.avaa.smear.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.smear.db.model.HyyCoord;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HyyCoord in entity cache.
 *
 * @author tkantola
 * @see HyyCoord
 * @generated
 */
public class HyyCoordCacheModel implements CacheModel<HyyCoord>, Externalizable {
    public long arrTimeID;
    public long arrTime;
    public float matTime;
    public int year;
    public int month;
    public int day;
    public int hour;
    public int doy;
    public int backTime;
    public float lat100;
    public float lon100;
    public float alt100;
    public float azim100;
    public float lat250;
    public float lon250;
    public float alt250;
    public float azim250;
    public float lat500;
    public float lon500;
    public float alt500;
    public float azim500;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(43);

        sb.append("{arrTimeID=");
        sb.append(arrTimeID);
        sb.append(", arrTime=");
        sb.append(arrTime);
        sb.append(", matTime=");
        sb.append(matTime);
        sb.append(", year=");
        sb.append(year);
        sb.append(", month=");
        sb.append(month);
        sb.append(", day=");
        sb.append(day);
        sb.append(", hour=");
        sb.append(hour);
        sb.append(", doy=");
        sb.append(doy);
        sb.append(", backTime=");
        sb.append(backTime);
        sb.append(", lat100=");
        sb.append(lat100);
        sb.append(", lon100=");
        sb.append(lon100);
        sb.append(", alt100=");
        sb.append(alt100);
        sb.append(", azim100=");
        sb.append(azim100);
        sb.append(", lat250=");
        sb.append(lat250);
        sb.append(", lon250=");
        sb.append(lon250);
        sb.append(", alt250=");
        sb.append(alt250);
        sb.append(", azim250=");
        sb.append(azim250);
        sb.append(", lat500=");
        sb.append(lat500);
        sb.append(", lon500=");
        sb.append(lon500);
        sb.append(", alt500=");
        sb.append(alt500);
        sb.append(", azim500=");
        sb.append(azim500);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public HyyCoord toEntityModel() {
        HyyCoordImpl hyyCoordImpl = new HyyCoordImpl();

        hyyCoordImpl.setArrTimeID(arrTimeID);

        if (arrTime == Long.MIN_VALUE) {
            hyyCoordImpl.setArrTime(null);
        } else {
            hyyCoordImpl.setArrTime(new Date(arrTime));
        }

        hyyCoordImpl.setMatTime(matTime);
        hyyCoordImpl.setYear(year);
        hyyCoordImpl.setMonth(month);
        hyyCoordImpl.setDay(day);
        hyyCoordImpl.setHour(hour);
        hyyCoordImpl.setDoy(doy);
        hyyCoordImpl.setBackTime(backTime);
        hyyCoordImpl.setLat100(lat100);
        hyyCoordImpl.setLon100(lon100);
        hyyCoordImpl.setAlt100(alt100);
        hyyCoordImpl.setAzim100(azim100);
        hyyCoordImpl.setLat250(lat250);
        hyyCoordImpl.setLon250(lon250);
        hyyCoordImpl.setAlt250(alt250);
        hyyCoordImpl.setAzim250(azim250);
        hyyCoordImpl.setLat500(lat500);
        hyyCoordImpl.setLon500(lon500);
        hyyCoordImpl.setAlt500(alt500);
        hyyCoordImpl.setAzim500(azim500);

        hyyCoordImpl.resetOriginalValues();

        return hyyCoordImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        arrTimeID = objectInput.readLong();
        arrTime = objectInput.readLong();
        matTime = objectInput.readFloat();
        year = objectInput.readInt();
        month = objectInput.readInt();
        day = objectInput.readInt();
        hour = objectInput.readInt();
        doy = objectInput.readInt();
        backTime = objectInput.readInt();
        lat100 = objectInput.readFloat();
        lon100 = objectInput.readFloat();
        alt100 = objectInput.readFloat();
        azim100 = objectInput.readFloat();
        lat250 = objectInput.readFloat();
        lon250 = objectInput.readFloat();
        alt250 = objectInput.readFloat();
        azim250 = objectInput.readFloat();
        lat500 = objectInput.readFloat();
        lon500 = objectInput.readFloat();
        alt500 = objectInput.readFloat();
        azim500 = objectInput.readFloat();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(arrTimeID);
        objectOutput.writeLong(arrTime);
        objectOutput.writeFloat(matTime);
        objectOutput.writeInt(year);
        objectOutput.writeInt(month);
        objectOutput.writeInt(day);
        objectOutput.writeInt(hour);
        objectOutput.writeInt(doy);
        objectOutput.writeInt(backTime);
        objectOutput.writeFloat(lat100);
        objectOutput.writeFloat(lon100);
        objectOutput.writeFloat(alt100);
        objectOutput.writeFloat(azim100);
        objectOutput.writeFloat(lat250);
        objectOutput.writeFloat(lon250);
        objectOutput.writeFloat(alt250);
        objectOutput.writeFloat(azim250);
        objectOutput.writeFloat(lat500);
        objectOutput.writeFloat(lon500);
        objectOutput.writeFloat(alt500);
        objectOutput.writeFloat(azim500);
    }
}
