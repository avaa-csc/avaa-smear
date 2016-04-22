package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearTags;
import fi.csc.smear.db.service.SmearTagsLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearTagsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearTagsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearTagsLocalServiceUtil.getService());
        setClass(SmearTags.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("tagID");
    }
}
