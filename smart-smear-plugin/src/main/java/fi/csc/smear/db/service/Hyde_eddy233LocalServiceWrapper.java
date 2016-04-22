package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyde_eddy233LocalService}.
 *
 * @author pj
 * @see Hyde_eddy233LocalService
 * @generated
 */
public class Hyde_eddy233LocalServiceWrapper implements Hyde_eddy233LocalService,
    ServiceWrapper<Hyde_eddy233LocalService> {
    private Hyde_eddy233LocalService _hyde_eddy233LocalService;

    public Hyde_eddy233LocalServiceWrapper(
        Hyde_eddy233LocalService hyde_eddy233LocalService) {
        _hyde_eddy233LocalService = hyde_eddy233LocalService;
    }

    /**
    * Adds the hyde_eddy233 to the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddy233 the hyde_eddy233
    * @return the hyde_eddy233 that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 addHyde_eddy233(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.addHyde_eddy233(hyde_eddy233);
    }

    /**
    * Creates a new hyde_eddy233 with the primary key. Does not add the hyde_eddy233 to the database.
    *
    * @param samptime the primary key for the new hyde_eddy233
    * @return the new hyde_eddy233
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 createHyde_eddy233(
        java.util.Date samptime) {
        return _hyde_eddy233LocalService.createHyde_eddy233(samptime);
    }

    /**
    * Deletes the hyde_eddy233 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddy233
    * @return the hyde_eddy233 that was removed
    * @throws PortalException if a hyde_eddy233 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 deleteHyde_eddy233(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.deleteHyde_eddy233(samptime);
    }

    /**
    * Deletes the hyde_eddy233 from the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddy233 the hyde_eddy233
    * @return the hyde_eddy233 that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 deleteHyde_eddy233(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.deleteHyde_eddy233(hyde_eddy233);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyde_eddy233LocalService.dynamicQuery();
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
        return _hyde_eddy233LocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyde_eddy233LocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyde_eddy233LocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hyde_eddy233LocalService.dynamicQueryCount(dynamicQuery);
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
        return _hyde_eddy233LocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 fetchHyde_eddy233(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.fetchHyde_eddy233(samptime);
    }

    /**
    * Returns the hyde_eddy233 with the primary key.
    *
    * @param samptime the primary key of the hyde_eddy233
    * @return the hyde_eddy233
    * @throws PortalException if a hyde_eddy233 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 getHyde_eddy233(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.getHyde_eddy233(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyde_eddy233s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddy233s
    * @param end the upper bound of the range of hyde_eddy233s (not inclusive)
    * @return the range of hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Hyde_eddy233> getHyde_eddy233s(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.getHyde_eddy233s(start, end);
    }

    /**
    * Returns the number of hyde_eddy233s.
    *
    * @return the number of hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyde_eddy233sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.getHyde_eddy233sCount();
    }

    /**
    * Updates the hyde_eddy233 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddy233 the hyde_eddy233
    * @return the hyde_eddy233 that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyde_eddy233 updateHyde_eddy233(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyde_eddy233LocalService.updateHyde_eddy233(hyde_eddy233);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyde_eddy233LocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyde_eddy233LocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyde_eddy233LocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyde_eddy233LocalService getWrappedHyde_eddy233LocalService() {
        return _hyde_eddy233LocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyde_eddy233LocalService(
        Hyde_eddy233LocalService hyde_eddy233LocalService) {
        _hyde_eddy233LocalService = hyde_eddy233LocalService;
    }

    @Override
    public Hyde_eddy233LocalService getWrappedService() {
        return _hyde_eddy233LocalService;
    }

    @Override
    public void setWrappedService(
        Hyde_eddy233LocalService hyde_eddy233LocalService) {
        _hyde_eddy233LocalService = hyde_eddy233LocalService;
    }
}
