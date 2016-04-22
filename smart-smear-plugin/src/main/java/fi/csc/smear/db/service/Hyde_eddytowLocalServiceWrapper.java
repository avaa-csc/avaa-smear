package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyde_eddytowLocalService}.
 *
 * @author pj
 * @see Hyde_eddytowLocalService
 * @generated
 */
public class Hyde_eddytowLocalServiceWrapper implements Hyde_eddytowLocalService,
    ServiceWrapper<Hyde_eddytowLocalService> {
    private Hyde_eddytowLocalService _hyde_eddytowLocalService;

    public Hyde_eddytowLocalServiceWrapper(
        Hyde_eddytowLocalService hyde_eddytowLocalService) {
        _hyde_eddytowLocalService = hyde_eddytowLocalService;
    }

    /**
    * Adds the hyde_eddytow to the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow addHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.addHyde_eddytow(hyde_eddytow);
    }

    /**
    * Creates a new hyde_eddytow with the primary key. Does not add the hyde_eddytow to the database.
    *
    * @param samptime the primary key for the new hyde_eddytow
    * @return the new hyde_eddytow
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow createHyde_eddytow(
        java.util.Date samptime) {
        return _hyde_eddytowLocalService.createHyde_eddytow(samptime);
    }

    /**
    * Deletes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws PortalException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow deleteHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.deleteHyde_eddytow(samptime);
    }

    /**
    * Deletes the hyde_eddytow from the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow deleteHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.deleteHyde_eddytow(hyde_eddytow);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyde_eddytowLocalService.dynamicQuery();
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
        return _hyde_eddytowLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyde_eddytowLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyde_eddytowLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hyde_eddytowLocalService.dynamicQueryCount(dynamicQuery);
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
        return _hyde_eddytowLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Hyde_eddytow fetchHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.fetchHyde_eddytow(samptime);
    }

    /**
    * Returns the hyde_eddytow with the primary key.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow
    * @throws PortalException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow getHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.getHyde_eddytow(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @return the range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Hyde_eddytow> getHyde_eddytows(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.getHyde_eddytows(start, end);
    }

    /**
    * Returns the number of hyde_eddytows.
    *
    * @return the number of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyde_eddytowsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.getHyde_eddytowsCount();
    }

    /**
    * Updates the hyde_eddytow in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddytow updateHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddytowLocalService.updateHyde_eddytow(hyde_eddytow);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyde_eddytowLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyde_eddytowLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyde_eddytowLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyde_eddytowLocalService getWrappedHyde_eddytowLocalService() {
        return _hyde_eddytowLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyde_eddytowLocalService(
        Hyde_eddytowLocalService hyde_eddytowLocalService) {
        _hyde_eddytowLocalService = hyde_eddytowLocalService;
    }

    @Override
    public Hyde_eddytowLocalService getWrappedService() {
        return _hyde_eddytowLocalService;
    }

    @Override
    public void setWrappedService(
        Hyde_eddytowLocalService hyde_eddytowLocalService) {
        _hyde_eddytowLocalService = hyde_eddytowLocalService;
    }
}
