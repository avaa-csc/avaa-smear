package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyDMPSLocalService}.
 *
 * @author pj
 * @see HyyDMPSLocalService
 * @generated
 */
public class HyyDMPSLocalServiceWrapper implements HyyDMPSLocalService,
    ServiceWrapper<HyyDMPSLocalService> {
    private HyyDMPSLocalService _hyyDMPSLocalService;

    public HyyDMPSLocalServiceWrapper(HyyDMPSLocalService hyyDMPSLocalService) {
        _hyyDMPSLocalService = hyyDMPSLocalService;
    }

    /**
    * Adds the hyy d m p s to the database. Also notifies the appropriate model listeners.
    *
    * @param hyyDMPS the hyy d m p s
    * @return the hyy d m p s that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS addHyyDMPS(
        fi.csc.smear.db.model.HyyDMPS hyyDMPS)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.addHyyDMPS(hyyDMPS);
    }

    /**
    * Creates a new hyy d m p s with the primary key. Does not add the hyy d m p s to the database.
    *
    * @param samptime the primary key for the new hyy d m p s
    * @return the new hyy d m p s
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS createHyyDMPS(java.util.Date samptime) {
        return _hyyDMPSLocalService.createHyyDMPS(samptime);
    }

    /**
    * Deletes the hyy d m p s with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy d m p s
    * @return the hyy d m p s that was removed
    * @throws PortalException if a hyy d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS deleteHyyDMPS(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.deleteHyyDMPS(samptime);
    }

    /**
    * Deletes the hyy d m p s from the database. Also notifies the appropriate model listeners.
    *
    * @param hyyDMPS the hyy d m p s
    * @return the hyy d m p s that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS deleteHyyDMPS(
        fi.csc.smear.db.model.HyyDMPS hyyDMPS)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.deleteHyyDMPS(hyyDMPS);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyyDMPSLocalService.dynamicQuery();
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
        return _hyyDMPSLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyyDMPSLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyyDMPSLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hyyDMPSLocalService.dynamicQueryCount(dynamicQuery);
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
        return _hyyDMPSLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.HyyDMPS fetchHyyDMPS(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.fetchHyyDMPS(samptime);
    }

    /**
    * Returns the hyy d m p s with the primary key.
    *
    * @param samptime the primary key of the hyy d m p s
    * @return the hyy d m p s
    * @throws PortalException if a hyy d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS getHyyDMPS(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.getHyyDMPS(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyy d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy d m p ses
    * @param end the upper bound of the range of hyy d m p ses (not inclusive)
    * @return the range of hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.HyyDMPS> getHyyDMPSs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.getHyyDMPSs(start, end);
    }

    /**
    * Returns the number of hyy d m p ses.
    *
    * @return the number of hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyyDMPSsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.getHyyDMPSsCount();
    }

    /**
    * Updates the hyy d m p s in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyyDMPS the hyy d m p s
    * @return the hyy d m p s that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyDMPS updateHyyDMPS(
        fi.csc.smear.db.model.HyyDMPS hyyDMPS)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyDMPSLocalService.updateHyyDMPS(hyyDMPS);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyDMPSLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyDMPSLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyDMPSLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyDMPSLocalService getWrappedHyyDMPSLocalService() {
        return _hyyDMPSLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyDMPSLocalService(
        HyyDMPSLocalService hyyDMPSLocalService) {
        _hyyDMPSLocalService = hyyDMPSLocalService;
    }

    @Override
    public HyyDMPSLocalService getWrappedService() {
        return _hyyDMPSLocalService;
    }

    @Override
    public void setWrappedService(HyyDMPSLocalService hyyDMPSLocalService) {
        _hyyDMPSLocalService = hyyDMPSLocalService;
    }
}
