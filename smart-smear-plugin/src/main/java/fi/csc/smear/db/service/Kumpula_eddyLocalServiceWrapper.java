package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Kumpula_eddyLocalService}.
 *
 * @author pj
 * @see Kumpula_eddyLocalService
 * @generated
 */
public class Kumpula_eddyLocalServiceWrapper implements Kumpula_eddyLocalService,
    ServiceWrapper<Kumpula_eddyLocalService> {
    private Kumpula_eddyLocalService _kumpula_eddyLocalService;

    public Kumpula_eddyLocalServiceWrapper(
        Kumpula_eddyLocalService kumpula_eddyLocalService) {
        _kumpula_eddyLocalService = kumpula_eddyLocalService;
    }

    /**
    * Adds the kumpula_eddy to the database. Also notifies the appropriate model listeners.
    *
    * @param kumpula_eddy the kumpula_eddy
    * @return the kumpula_eddy that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy addKumpula_eddy(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.addKumpula_eddy(kumpula_eddy);
    }

    /**
    * Creates a new kumpula_eddy with the primary key. Does not add the kumpula_eddy to the database.
    *
    * @param samptime the primary key for the new kumpula_eddy
    * @return the new kumpula_eddy
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy createKumpula_eddy(
        java.util.Date samptime) {
        return _kumpula_eddyLocalService.createKumpula_eddy(samptime);
    }

    /**
    * Deletes the kumpula_eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy that was removed
    * @throws PortalException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy deleteKumpula_eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.deleteKumpula_eddy(samptime);
    }

    /**
    * Deletes the kumpula_eddy from the database. Also notifies the appropriate model listeners.
    *
    * @param kumpula_eddy the kumpula_eddy
    * @return the kumpula_eddy that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy deleteKumpula_eddy(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.deleteKumpula_eddy(kumpula_eddy);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _kumpula_eddyLocalService.dynamicQuery();
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
        return _kumpula_eddyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kumpula_eddyLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kumpula_eddyLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _kumpula_eddyLocalService.dynamicQueryCount(dynamicQuery);
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
        return _kumpula_eddyLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Kumpula_eddy fetchKumpula_eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.fetchKumpula_eddy(samptime);
    }

    /**
    * Returns the kumpula_eddy with the primary key.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy
    * @throws PortalException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy getKumpula_eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.getKumpula_eddy(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kumpula_eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpula_eddies
    * @param end the upper bound of the range of kumpula_eddies (not inclusive)
    * @return the range of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Kumpula_eddy> getKumpula_eddies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.getKumpula_eddies(start, end);
    }

    /**
    * Returns the number of kumpula_eddies.
    *
    * @return the number of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getKumpula_eddiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.getKumpula_eddiesCount();
    }

    /**
    * Updates the kumpula_eddy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kumpula_eddy the kumpula_eddy
    * @return the kumpula_eddy that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpula_eddy updateKumpula_eddy(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpula_eddyLocalService.updateKumpula_eddy(kumpula_eddy);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kumpula_eddyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kumpula_eddyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kumpula_eddyLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Kumpula_eddyLocalService getWrappedKumpula_eddyLocalService() {
        return _kumpula_eddyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKumpula_eddyLocalService(
        Kumpula_eddyLocalService kumpula_eddyLocalService) {
        _kumpula_eddyLocalService = kumpula_eddyLocalService;
    }

    @Override
    public Kumpula_eddyLocalService getWrappedService() {
        return _kumpula_eddyLocalService;
    }

    @Override
    public void setWrappedService(
        Kumpula_eddyLocalService kumpula_eddyLocalService) {
        _kumpula_eddyLocalService = kumpula_eddyLocalService;
    }
}
