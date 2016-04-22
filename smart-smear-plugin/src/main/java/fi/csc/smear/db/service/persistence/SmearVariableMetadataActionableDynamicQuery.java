package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearVariableMetadata;
import fi.csc.smear.db.service.SmearVariableMetadataLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearVariableMetadataActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearVariableMetadataActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SmearVariableMetadataLocalServiceUtil.getService());
        setClass(SmearVariableMetadata.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("variableID");
    }
}
