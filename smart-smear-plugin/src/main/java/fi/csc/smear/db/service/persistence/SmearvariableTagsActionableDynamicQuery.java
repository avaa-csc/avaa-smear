package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearvariableTags;
import fi.csc.smear.db.service.SmearvariableTagsLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearvariableTagsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearvariableTagsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearvariableTagsLocalServiceUtil.getService());
        setClass(SmearvariableTags.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("variableID");
    }
}
