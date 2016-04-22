package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HydemetaLocalService}.
 *
 * @author pj
 * @see HydemetaLocalService
 * @generated
 */
public class HydemetaLocalServiceWrapper implements HydemetaLocalService,
    ServiceWrapper<HydemetaLocalService> {
    private HydemetaLocalService _hydemetaLocalService;

    public HydemetaLocalServiceWrapper(
        HydemetaLocalService hydemetaLocalService) {
        _hydemetaLocalService = hydemetaLocalService;
    }

    /**
    * Adds the hydemeta to the database. Also notifies the appropriate model listeners.
    *
    * @param hydemeta the hydemeta
    * @return the hydemeta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta addHydemeta(
        fi.csc.smear.db.model.Hydemeta hydemeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.addHydemeta(hydemeta);
    }

    /**
    * Creates a new hydemeta with the primary key. Does not add the hydemeta to the database.
    *
    * @param samptime the primary key for the new hydemeta
    * @return the new hydemeta
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta createHydemeta(
        java.util.Date samptime) {
        return _hydemetaLocalService.createHydemeta(samptime);
    }

    /**
    * Deletes the hydemeta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hydemeta
    * @return the hydemeta that was removed
    * @throws PortalException if a hydemeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta deleteHydemeta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.deleteHydemeta(samptime);
    }

    /**
    * Deletes the hydemeta from the database. Also notifies the appropriate model listeners.
    *
    * @param hydemeta the hydemeta
    * @return the hydemeta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta deleteHydemeta(
        fi.csc.smear.db.model.Hydemeta hydemeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.deleteHydemeta(hydemeta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hydemetaLocalService.dynamicQuery();
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
        return _hydemetaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hydemetaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hydemetaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hydemetaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _hydemetaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.Hydemeta fetchHydemeta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.fetchHydemeta(samptime);
    }

    /**
    * Returns the hydemeta with the primary key.
    *
    * @param samptime the primary key of the hydemeta
    * @return the hydemeta
    * @throws PortalException if a hydemeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta getHydemeta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.getHydemeta(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hydemetas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hydemetas
    * @param end the upper bound of the range of hydemetas (not inclusive)
    * @return the range of hydemetas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Hydemeta> getHydemetas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.getHydemetas(start, end);
    }

    /**
    * Returns the number of hydemetas.
    *
    * @return the number of hydemetas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHydemetasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.getHydemetasCount();
    }

    /**
    * Updates the hydemeta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hydemeta the hydemeta
    * @return the hydemeta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hydemeta updateHydemeta(
        fi.csc.smear.db.model.Hydemeta hydemeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hydemetaLocalService.updateHydemeta(hydemeta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hydemetaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hydemetaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hydemetaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HydemetaLocalService getWrappedHydemetaLocalService() {
        return _hydemetaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHydemetaLocalService(
        HydemetaLocalService hydemetaLocalService) {
        _hydemetaLocalService = hydemetaLocalService;
    }

    @Override
    public HydemetaLocalService getWrappedService() {
        return _hydemetaLocalService;
    }

    @Override
    public void setWrappedService(HydemetaLocalService hydemetaLocalService) {
        _hydemetaLocalService = hydemetaLocalService;
    }
}
