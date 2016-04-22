package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii2eddyLocalService}.
 *
 * @author pj
 * @see Sii2eddyLocalService
 * @generated
 */
public class Sii2eddyLocalServiceWrapper implements Sii2eddyLocalService,
    ServiceWrapper<Sii2eddyLocalService> {
    private Sii2eddyLocalService _sii2eddyLocalService;

    public Sii2eddyLocalServiceWrapper(
        Sii2eddyLocalService sii2eddyLocalService) {
        _sii2eddyLocalService = sii2eddyLocalService;
    }

    /**
    * Adds the sii2eddy to the database. Also notifies the appropriate model listeners.
    *
    * @param sii2eddy the sii2eddy
    * @return the sii2eddy that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy addSii2eddy(
        fi.csc.smear.db.model.Sii2eddy sii2eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.addSii2eddy(sii2eddy);
    }

    /**
    * Creates a new sii2eddy with the primary key. Does not add the sii2eddy to the database.
    *
    * @param samptime the primary key for the new sii2eddy
    * @return the new sii2eddy
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy createSii2eddy(
        java.util.Date samptime) {
        return _sii2eddyLocalService.createSii2eddy(samptime);
    }

    /**
    * Deletes the sii2eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii2eddy
    * @return the sii2eddy that was removed
    * @throws PortalException if a sii2eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy deleteSii2eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.deleteSii2eddy(samptime);
    }

    /**
    * Deletes the sii2eddy from the database. Also notifies the appropriate model listeners.
    *
    * @param sii2eddy the sii2eddy
    * @return the sii2eddy that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy deleteSii2eddy(
        fi.csc.smear.db.model.Sii2eddy sii2eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.deleteSii2eddy(sii2eddy);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _sii2eddyLocalService.dynamicQuery();
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
        return _sii2eddyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sii2eddyLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sii2eddyLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _sii2eddyLocalService.dynamicQueryCount(dynamicQuery);
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
        return _sii2eddyLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.Sii2eddy fetchSii2eddy(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.fetchSii2eddy(samptime);
    }

    /**
    * Returns the sii2eddy with the primary key.
    *
    * @param samptime the primary key of the sii2eddy
    * @return the sii2eddy
    * @throws PortalException if a sii2eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy getSii2eddy(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.getSii2eddy(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the sii2eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii2eddies
    * @param end the upper bound of the range of sii2eddies (not inclusive)
    * @return the range of sii2eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Sii2eddy> getSii2eddies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.getSii2eddies(start, end);
    }

    /**
    * Returns the number of sii2eddies.
    *
    * @return the number of sii2eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSii2eddiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.getSii2eddiesCount();
    }

    /**
    * Updates the sii2eddy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sii2eddy the sii2eddy
    * @return the sii2eddy that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii2eddy updateSii2eddy(
        fi.csc.smear.db.model.Sii2eddy sii2eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii2eddyLocalService.updateSii2eddy(sii2eddy);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii2eddyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii2eddyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii2eddyLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii2eddyLocalService getWrappedSii2eddyLocalService() {
        return _sii2eddyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii2eddyLocalService(
        Sii2eddyLocalService sii2eddyLocalService) {
        _sii2eddyLocalService = sii2eddyLocalService;
    }

    @Override
    public Sii2eddyLocalService getWrappedService() {
        return _sii2eddyLocalService;
    }

    @Override
    public void setWrappedService(Sii2eddyLocalService sii2eddyLocalService) {
        _sii2eddyLocalService = sii2eddyLocalService;
    }
}
