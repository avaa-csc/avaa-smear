package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearvariableEventLocalService}.
 *
 * @author pj
 * @see SmearvariableEventLocalService
 * @generated
 */
public class SmearvariableEventLocalServiceWrapper
    implements SmearvariableEventLocalService,
        ServiceWrapper<SmearvariableEventLocalService> {
    private SmearvariableEventLocalService _smearvariableEventLocalService;

    public SmearvariableEventLocalServiceWrapper(
        SmearvariableEventLocalService smearvariableEventLocalService) {
        _smearvariableEventLocalService = smearvariableEventLocalService;
    }

    /**
    * Adds the smearvariable event to the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableEvent the smearvariable event
    * @return the smearvariable event that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent addSmearvariableEvent(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.addSmearvariableEvent(smearvariableEvent);
    }

    /**
    * Creates a new smearvariable event with the primary key. Does not add the smearvariable event to the database.
    *
    * @param smearvariableEventPK the primary key for the new smearvariable event
    * @return the new smearvariable event
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent createSmearvariableEvent(
        fi.csc.smear.db.service.persistence.SmearvariableEventPK smearvariableEventPK) {
        return _smearvariableEventLocalService.createSmearvariableEvent(smearvariableEventPK);
    }

    /**
    * Deletes the smearvariable event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableEventPK the primary key of the smearvariable event
    * @return the smearvariable event that was removed
    * @throws PortalException if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent deleteSmearvariableEvent(
        fi.csc.smear.db.service.persistence.SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.deleteSmearvariableEvent(smearvariableEventPK);
    }

    /**
    * Deletes the smearvariable event from the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableEvent the smearvariable event
    * @return the smearvariable event that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent deleteSmearvariableEvent(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.deleteSmearvariableEvent(smearvariableEvent);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearvariableEventLocalService.dynamicQuery();
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
        return _smearvariableEventLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearvariableEventLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearvariableEventLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _smearvariableEventLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearvariableEventLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.SmearvariableEvent fetchSmearvariableEvent(
        fi.csc.smear.db.service.persistence.SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.fetchSmearvariableEvent(smearvariableEventPK);
    }

    /**
    * Returns the smearvariable event with the primary key.
    *
    * @param smearvariableEventPK the primary key of the smearvariable event
    * @return the smearvariable event
    * @throws PortalException if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent getSmearvariableEvent(
        fi.csc.smear.db.service.persistence.SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.getSmearvariableEvent(smearvariableEventPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smearvariable events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable events
    * @param end the upper bound of the range of smearvariable events (not inclusive)
    * @return the range of smearvariable events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.SmearvariableEvent> getSmearvariableEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.getSmearvariableEvents(start, end);
    }

    /**
    * Returns the number of smearvariable events.
    *
    * @return the number of smearvariable events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearvariableEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.getSmearvariableEventsCount();
    }

    /**
    * Updates the smearvariable event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearvariableEvent the smearvariable event
    * @return the smearvariable event that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableEvent updateSmearvariableEvent(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableEventLocalService.updateSmearvariableEvent(smearvariableEvent);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearvariableEventLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearvariableEventLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearvariableEventLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findByVariable(
        long varId) {
        return _smearvariableEventLocalService.findByVariable(varId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearvariableEventLocalService getWrappedSmearvariableEventLocalService() {
        return _smearvariableEventLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearvariableEventLocalService(
        SmearvariableEventLocalService smearvariableEventLocalService) {
        _smearvariableEventLocalService = smearvariableEventLocalService;
    }

    @Override
    public SmearvariableEventLocalService getWrappedService() {
        return _smearvariableEventLocalService;
    }

    @Override
    public void setWrappedService(
        SmearvariableEventLocalService smearvariableEventLocalService) {
        _smearvariableEventLocalService = smearvariableEventLocalService;
    }
}
