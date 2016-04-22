package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearvariableEvent;
import fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearvariableEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearvariableEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearvariableEventLocalServiceUtil.getService());
        setClass(SmearvariableEvent.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.eventID");
    }
}
