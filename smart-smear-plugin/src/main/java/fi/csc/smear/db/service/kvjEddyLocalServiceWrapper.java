package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kvjEddyLocalService}.
 *
 * @author pj
 * @see kvjEddyLocalService
 * @generated
 */
public class kvjEddyLocalServiceWrapper implements kvjEddyLocalService,
    ServiceWrapper<kvjEddyLocalService> {
    private kvjEddyLocalService _kvjEddyLocalService;

    public kvjEddyLocalServiceWrapper(kvjEddyLocalService kvjEddyLocalService) {
        _kvjEddyLocalService = kvjEddyLocalService;
    }

    /**
    * Adds the kvj eddy to the database. Also notifies the appropriate model listeners.
    *
    * @param kvjEddy the kvj eddy
    * @return the kvj eddy that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy addkvjEddy(
        fi.csc.smear.db.model.kvjEddy kvjEddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.addkvjEddy(kvjEddy);
    }

    /**
    * Creates a new kvj eddy with the primary key. Does not add the kvj eddy to the database.
    *
    * @param samptime the primary key for the new kvj eddy
    * @return the new kvj eddy
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy createkvjEddy(java.util.Date samptime) {
        return _kvjEddyLocalService.createkvjEddy(samptime);
    }

    /**
    * Deletes the kvj eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kvj eddy
    * @return the kvj eddy that was removed
    * @throws PortalException if a kvj eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy deletekvjEddy(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.deletekvjEddy(samptime);
    }

    /**
    * Deletes the kvj eddy from the database. Also notifies the appropriate model listeners.
    *
    * @param kvjEddy the kvj eddy
    * @return the kvj eddy that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy deletekvjEddy(
        fi.csc.smear.db.model.kvjEddy kvjEddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.deletekvjEddy(kvjEddy);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _kvjEddyLocalService.dynamicQuery();
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
        return _kvjEddyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kvjEddyLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kvjEddyLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _kvjEddyLocalService.dynamicQueryCount(dynamicQuery);
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
        return _kvjEddyLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.kvjEddy fetchkvjEddy(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.fetchkvjEddy(samptime);
    }

    /**
    * Returns the kvj eddy with the primary key.
    *
    * @param samptime the primary key of the kvj eddy
    * @return the kvj eddy
    * @throws PortalException if a kvj eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy getkvjEddy(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.getkvjEddy(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kvj eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj eddies
    * @param end the upper bound of the range of kvj eddies (not inclusive)
    * @return the range of kvj eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.kvjEddy> getkvjEddies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.getkvjEddies(start, end);
    }

    /**
    * Returns the number of kvj eddies.
    *
    * @return the number of kvj eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getkvjEddiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.getkvjEddiesCount();
    }

    /**
    * Updates the kvj eddy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kvjEddy the kvj eddy
    * @return the kvj eddy that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.kvjEddy updatekvjEddy(
        fi.csc.smear.db.model.kvjEddy kvjEddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kvjEddyLocalService.updatekvjEddy(kvjEddy);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kvjEddyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kvjEddyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kvjEddyLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public kvjEddyLocalService getWrappedkvjEddyLocalService() {
        return _kvjEddyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedkvjEddyLocalService(
        kvjEddyLocalService kvjEddyLocalService) {
        _kvjEddyLocalService = kvjEddyLocalService;
    }

    @Override
    public kvjEddyLocalService getWrappedService() {
        return _kvjEddyLocalService;
    }

    @Override
    public void setWrappedService(kvjEddyLocalService kvjEddyLocalService) {
        _kvjEddyLocalService = kvjEddyLocalService;
    }
}
