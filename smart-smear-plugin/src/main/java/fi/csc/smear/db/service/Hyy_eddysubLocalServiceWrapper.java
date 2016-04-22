package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyy_eddysubLocalService}.
 *
 * @author pj
 * @see Hyy_eddysubLocalService
 * @generated
 */
public class Hyy_eddysubLocalServiceWrapper implements Hyy_eddysubLocalService,
    ServiceWrapper<Hyy_eddysubLocalService> {
    private Hyy_eddysubLocalService _hyy_eddysubLocalService;

    public Hyy_eddysubLocalServiceWrapper(
        Hyy_eddysubLocalService hyy_eddysubLocalService) {
        _hyy_eddysubLocalService = hyy_eddysubLocalService;
    }

    /**
    * Adds the hyy_eddysub to the database. Also notifies the appropriate model listeners.
    *
    * @param hyy_eddysub the hyy_eddysub
    * @return the hyy_eddysub that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub addHyy_eddysub(
        fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.addHyy_eddysub(hyy_eddysub);
    }

    /**
    * Creates a new hyy_eddysub with the primary key. Does not add the hyy_eddysub to the database.
    *
    * @param samptime the primary key for the new hyy_eddysub
    * @return the new hyy_eddysub
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub createHyy_eddysub(
        java.util.Date samptime) {
        return _hyy_eddysubLocalService.createHyy_eddysub(samptime);
    }

    /**
    * Deletes the hyy_eddysub with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy_eddysub
    * @return the hyy_eddysub that was removed
    * @throws PortalException if a hyy_eddysub with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub deleteHyy_eddysub(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.deleteHyy_eddysub(samptime);
    }

    /**
    * Deletes the hyy_eddysub from the database. Also notifies the appropriate model listeners.
    *
    * @param hyy_eddysub the hyy_eddysub
    * @return the hyy_eddysub that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub deleteHyy_eddysub(
        fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.deleteHyy_eddysub(hyy_eddysub);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyy_eddysubLocalService.dynamicQuery();
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
        return _hyy_eddysubLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyy_eddysubLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyy_eddysubLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hyy_eddysubLocalService.dynamicQueryCount(dynamicQuery);
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
        return _hyy_eddysubLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Hyy_eddysub fetchHyy_eddysub(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.fetchHyy_eddysub(samptime);
    }

    /**
    * Returns the hyy_eddysub with the primary key.
    *
    * @param samptime the primary key of the hyy_eddysub
    * @return the hyy_eddysub
    * @throws PortalException if a hyy_eddysub with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub getHyy_eddysub(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.getHyy_eddysub(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyy_eddysubs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy_eddysubs
    * @param end the upper bound of the range of hyy_eddysubs (not inclusive)
    * @return the range of hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Hyy_eddysub> getHyy_eddysubs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.getHyy_eddysubs(start, end);
    }

    /**
    * Returns the number of hyy_eddysubs.
    *
    * @return the number of hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyy_eddysubsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.getHyy_eddysubsCount();
    }

    /**
    * Updates the hyy_eddysub in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyy_eddysub the hyy_eddysub
    * @return the hyy_eddysub that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Hyy_eddysub updateHyy_eddysub(
        fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyy_eddysubLocalService.updateHyy_eddysub(hyy_eddysub);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyy_eddysubLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyy_eddysubLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyy_eddysubLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyy_eddysubLocalService getWrappedHyy_eddysubLocalService() {
        return _hyy_eddysubLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyy_eddysubLocalService(
        Hyy_eddysubLocalService hyy_eddysubLocalService) {
        _hyy_eddysubLocalService = hyy_eddysubLocalService;
    }

    @Override
    public Hyy_eddysubLocalService getWrappedService() {
        return _hyy_eddysubLocalService;
    }

    @Override
    public void setWrappedService(
        Hyy_eddysubLocalService hyy_eddysubLocalService) {
        _hyy_eddysubLocalService = hyy_eddysubLocalService;
    }
}
