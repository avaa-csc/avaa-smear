package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii2metaLocalService}.
 *
 * @author pj
 * @see Sii2metaLocalService
 * @generated
 */
public class Sii2metaLocalServiceWrapper implements Sii2metaLocalService,
    ServiceWrapper<Sii2metaLocalService> {
    private Sii2metaLocalService _sii2metaLocalService;

    public Sii2metaLocalServiceWrapper(
        Sii2metaLocalService sii2metaLocalService) {
        _sii2metaLocalService = sii2metaLocalService;
    }

    /**
    * Adds the sii2meta to the database. Also notifies the appropriate model listeners.
    *
    * @param sii2meta the sii2meta
    * @return the sii2meta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta addSii2meta(
        fi.csc.smear.db.model.Sii2meta sii2meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.addSii2meta(sii2meta);
    }

    /**
    * Creates a new sii2meta with the primary key. Does not add the sii2meta to the database.
    *
    * @param samptime the primary key for the new sii2meta
    * @return the new sii2meta
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta createSii2meta(
        java.util.Date samptime) {
        return _sii2metaLocalService.createSii2meta(samptime);
    }

    /**
    * Deletes the sii2meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii2meta
    * @return the sii2meta that was removed
    * @throws PortalException if a sii2meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta deleteSii2meta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.deleteSii2meta(samptime);
    }

    /**
    * Deletes the sii2meta from the database. Also notifies the appropriate model listeners.
    *
    * @param sii2meta the sii2meta
    * @return the sii2meta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta deleteSii2meta(
        fi.csc.smear.db.model.Sii2meta sii2meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.deleteSii2meta(sii2meta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _sii2metaLocalService.dynamicQuery();
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
        return _sii2metaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sii2metaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sii2metaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _sii2metaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _sii2metaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.Sii2meta fetchSii2meta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.fetchSii2meta(samptime);
    }

    /**
    * Returns the sii2meta with the primary key.
    *
    * @param samptime the primary key of the sii2meta
    * @return the sii2meta
    * @throws PortalException if a sii2meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta getSii2meta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.getSii2meta(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the sii2metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii2metas
    * @param end the upper bound of the range of sii2metas (not inclusive)
    * @return the range of sii2metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Sii2meta> getSii2metas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.getSii2metas(start, end);
    }

    /**
    * Returns the number of sii2metas.
    *
    * @return the number of sii2metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSii2metasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.getSii2metasCount();
    }

    /**
    * Updates the sii2meta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sii2meta the sii2meta
    * @return the sii2meta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2meta updateSii2meta(
        fi.csc.smear.db.model.Sii2meta sii2meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2metaLocalService.updateSii2meta(sii2meta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii2metaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii2metaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii2metaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii2metaLocalService getWrappedSii2metaLocalService() {
        return _sii2metaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii2metaLocalService(
        Sii2metaLocalService sii2metaLocalService) {
        _sii2metaLocalService = sii2metaLocalService;
    }

    @Override
    public Sii2metaLocalService getWrappedService() {
        return _sii2metaLocalService;
    }

    @Override
    public void setWrappedService(Sii2metaLocalService sii2metaLocalService) {
        _sii2metaLocalService = sii2metaLocalService;
    }
}
