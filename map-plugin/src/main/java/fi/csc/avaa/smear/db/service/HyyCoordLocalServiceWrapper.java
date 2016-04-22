package fi.csc.avaa.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyCoordLocalService}.
 *
 * @author tkantola
 * @see HyyCoordLocalService
 * @generated
 */
public class HyyCoordLocalServiceWrapper implements HyyCoordLocalService,
    ServiceWrapper<HyyCoordLocalService> {
    private HyyCoordLocalService _hyyCoordLocalService;

    public HyyCoordLocalServiceWrapper(
        HyyCoordLocalService hyyCoordLocalService) {
        _hyyCoordLocalService = hyyCoordLocalService;
    }

    /**
    * Adds the hyy coord to the database. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord addHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.addHyyCoord(hyyCoord);
    }

    /**
    * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
    *
    * @param arrTimeID the primary key for the new hyy coord
    * @return the new hyy coord
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord createHyyCoord(long arrTimeID) {
        return _hyyCoordLocalService.createHyyCoord(arrTimeID);
    }

    /**
    * Deletes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord that was removed
    * @throws PortalException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord deleteHyyCoord(long arrTimeID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.deleteHyyCoord(arrTimeID);
    }

    /**
    * Deletes the hyy coord from the database. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord deleteHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.deleteHyyCoord(hyyCoord);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyyCoordLocalService.dynamicQuery();
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
        return _hyyCoordLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyyCoordLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _hyyCoordLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _hyyCoordLocalService.dynamicQueryCount(dynamicQuery);
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
        return _hyyCoordLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord fetchHyyCoord(long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.fetchHyyCoord(arrTimeID);
    }

    /**
    * Returns the hyy coord with the primary key.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord
    * @throws PortalException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord getHyyCoord(long arrTimeID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.getHyyCoord(arrTimeID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @return the range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> getHyyCoords(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.getHyyCoords(start, end);
    }

    /**
    * Returns the number of hyy coords.
    *
    * @return the number of hyy coords
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyyCoordsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.getHyyCoordsCount();
    }

    /**
    * Updates the hyy coord in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.smear.db.model.HyyCoord updateHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyCoordLocalService.updateHyyCoord(hyyCoord);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyCoordLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyCoordLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyCoordLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyCoordLocalService getWrappedHyyCoordLocalService() {
        return _hyyCoordLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyCoordLocalService(
        HyyCoordLocalService hyyCoordLocalService) {
        _hyyCoordLocalService = hyyCoordLocalService;
    }

    @Override
    public HyyCoordLocalService getWrappedService() {
        return _hyyCoordLocalService;
    }

    @Override
    public void setWrappedService(HyyCoordLocalService hyyCoordLocalService) {
        _hyyCoordLocalService = hyyCoordLocalService;
    }
}
