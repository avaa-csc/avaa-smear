package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearEvents;
import fi.csc.smear.db.service.SmearEventsLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearEventsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearEventsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearEventsLocalServiceUtil.getService());
        setClass(SmearEvents.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("eventID");
    }
}
