package fi.csc.avaa.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.smear.db.model.HyyCoord;
import fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil;

/**
 * @author tkantola
 * @generated
 */
public abstract class HyyCoordActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public HyyCoordActionableDynamicQuery() throws SystemException {
        setBaseLocalService(HyyCoordLocalServiceUtil.getService());
        setClass(HyyCoord.class);

        setClassLoader(fi.csc.avaa.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("arrTimeID");
    }
}
