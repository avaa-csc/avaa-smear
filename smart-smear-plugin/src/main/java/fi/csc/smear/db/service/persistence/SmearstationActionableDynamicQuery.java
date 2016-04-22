package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Smearstation;
import fi.csc.smear.db.service.SmearstationLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearstationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearstationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearstationLocalServiceUtil.getService());
        setClass(Smearstation.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("stationID");
    }
}
