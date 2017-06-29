package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kvjMetaLocalService}.
 *
 * @author pj
 * @see kvjMetaLocalService
 * @generated
 */
public class kvjMetaLocalServiceWrapper implements kvjMetaLocalService,
    ServiceWrapper<kvjMetaLocalService> {
    private kvjMetaLocalService _kvjMetaLocalService;

    public kvjMetaLocalServiceWrapper(kvjMetaLocalService kvjMetaLocalService) {
        _kvjMetaLocalService = kvjMetaLocalService;
    }

    /**
    * Adds the kvj meta to the database. Also notifies the appropriate model listeners.
    *
    * @param kvjMeta the kvj meta
    * @return the kvj meta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta addkvjMeta(
        fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.addkvjMeta(kvjMeta);
    }

    /**
    * Creates a new kvj meta with the primary key. Does not add the kvj meta to the database.
    *
    * @param samptime the primary key for the new kvj meta
    * @return the new kvj meta
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta createkvjMeta(java.util.Date samptime) {
        return _kvjMetaLocalService.createkvjMeta(samptime);
    }

    /**
    * Deletes the kvj meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta that was removed
    * @throws PortalException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta deletekvjMeta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.deletekvjMeta(samptime);
    }

    /**
    * Deletes the kvj meta from the database. Also notifies the appropriate model listeners.
    *
    * @param kvjMeta the kvj meta
    * @return the kvj meta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta deletekvjMeta(
        fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.deletekvjMeta(kvjMeta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _kvjMetaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.kvjMeta fetchkvjMeta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.fetchkvjMeta(samptime);
    }

    /**
    * Returns the kvj meta with the primary key.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta
    * @throws PortalException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta getkvjMeta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.getkvjMeta(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kvj metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj metas
    * @param end the upper bound of the range of kvj metas (not inclusive)
    * @return the range of kvj metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.kvjMeta> getkvjMetas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.getkvjMetas(start, end);
    }

    /**
    * Returns the number of kvj metas.
    *
    * @return the number of kvj metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getkvjMetasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.getkvjMetasCount();
    }

    /**
    * Updates the kvj meta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kvjMeta the kvj meta
    * @return the kvj meta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjMeta updatekvjMeta(
        fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjMetaLocalService.updatekvjMeta(kvjMeta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kvjMetaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kvjMetaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kvjMetaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public kvjMetaLocalService getWrappedkvjMetaLocalService() {
        return _kvjMetaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedkvjMetaLocalService(
        kvjMetaLocalService kvjMetaLocalService) {
        _kvjMetaLocalService = kvjMetaLocalService;
    }

    @Override
    public kvjMetaLocalService getWrappedService() {
        return _kvjMetaLocalService;
    }

    @Override
    public void setWrappedService(kvjMetaLocalService kvjMetaLocalService) {
        _kvjMetaLocalService = kvjMetaLocalService;
    }
}
