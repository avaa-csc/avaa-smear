package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearstationLocalService}.
 *
 * @author pj
 * @see SmearstationLocalService
 * @generated
 */
public class SmearstationLocalServiceWrapper implements SmearstationLocalService,
    ServiceWrapper<SmearstationLocalService> {
    private SmearstationLocalService _smearstationLocalService;

    public SmearstationLocalServiceWrapper(
        SmearstationLocalService smearstationLocalService) {
        _smearstationLocalService = smearstationLocalService;
    }

    /**
    * Adds the smearstation to the database. Also notifies the appropriate model listeners.
    *
    * @param smearstation the smearstation
    * @return the smearstation that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Smearstation addSmearstation(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.addSmearstation(smearstation);
    }

    /**
    * Creates a new smearstation with the primary key. Does not add the smearstation to the database.
    *
    * @param stationID the primary key for the new smearstation
    * @return the new smearstation
    */
    @Override
    public fi.csc.smear.db.model.Smearstation createSmearstation(long stationID) {
        return _smearstationLocalService.createSmearstation(stationID);
    }

    /**
    * Deletes the smearstation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation that was removed
    * @throws PortalException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Smearstation deleteSmearstation(long stationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.deleteSmearstation(stationID);
    }

    /**
    * Deletes the smearstation from the database. Also notifies the appropriate model listeners.
    *
    * @param smearstation the smearstation
    * @return the smearstation that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Smearstation deleteSmearstation(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.deleteSmearstation(smearstation);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearstationLocalService.dynamicQuery();
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
        return _smearstationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearstationLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearstationLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _smearstationLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearstationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Smearstation fetchSmearstation(long stationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.fetchSmearstation(stationID);
    }

    /**
    * Returns the smearstation with the primary key.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation
    * @throws PortalException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Smearstation getSmearstation(long stationID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.getSmearstation(stationID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smearstations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearstations
    * @param end the upper bound of the range of smearstations (not inclusive)
    * @return the range of smearstations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Smearstation> getSmearstations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.getSmearstations(start, end);
    }

    /**
    * Returns the number of smearstations.
    *
    * @return the number of smearstations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearstationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.getSmearstationsCount();
    }

    /**
    * Updates the smearstation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearstation the smearstation
    * @return the smearstation that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Smearstation updateSmearstation(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearstationLocalService.updateSmearstation(smearstation);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearstationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearstationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearstationLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearstationLocalService getWrappedSmearstationLocalService() {
        return _smearstationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearstationLocalService(
        SmearstationLocalService smearstationLocalService) {
        _smearstationLocalService = smearstationLocalService;
    }

    @Override
    public SmearstationLocalService getWrappedService() {
        return _smearstationLocalService;
    }

    @Override
    public void setWrappedService(
        SmearstationLocalService smearstationLocalService) {
        _smearstationLocalService = smearstationLocalService;
    }
}
