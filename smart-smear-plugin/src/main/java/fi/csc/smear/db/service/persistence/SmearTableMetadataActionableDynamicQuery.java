package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearTableMetadata;
import fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil;

/**
 * @author pj
 * @generated
 */
public abstract class SmearTableMetadataActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SmearTableMetadataActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SmearTableMetadataLocalServiceUtil.getService());
        setClass(SmearTableMetadata.class);

        setClassLoader(fi.csc.smear.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("tableID");
    }
}
