package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearvariableTagsLocalService}.
 *
 * @author pj
 * @see SmearvariableTagsLocalService
 * @generated
 */
public class SmearvariableTagsLocalServiceWrapper
    implements SmearvariableTagsLocalService,
        ServiceWrapper<SmearvariableTagsLocalService> {
    private SmearvariableTagsLocalService _smearvariableTagsLocalService;

    public SmearvariableTagsLocalServiceWrapper(
        SmearvariableTagsLocalService smearvariableTagsLocalService) {
        _smearvariableTagsLocalService = smearvariableTagsLocalService;
    }

    /**
    * Adds the smearvariable tags to the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableTags the smearvariable tags
    * @return the smearvariable tags that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags addSmearvariableTags(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.addSmearvariableTags(smearvariableTags);
    }

    /**
    * Creates a new smearvariable tags with the primary key. Does not add the smearvariable tags to the database.
    *
    * @param variableID the primary key for the new smearvariable tags
    * @return the new smearvariable tags
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags createSmearvariableTags(
        long variableID) {
        return _smearvariableTagsLocalService.createSmearvariableTags(variableID);
    }

    /**
    * Deletes the smearvariable tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags that was removed
    * @throws PortalException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags deleteSmearvariableTags(
        long variableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.deleteSmearvariableTags(variableID);
    }

    /**
    * Deletes the smearvariable tags from the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableTags the smearvariable tags
    * @return the smearvariable tags that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags deleteSmearvariableTags(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.deleteSmearvariableTags(smearvariableTags);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearvariableTagsLocalService.dynamicQuery();
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
        return _smearvariableTagsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearvariableTagsLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearvariableTagsLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _smearvariableTagsLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearvariableTagsLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.SmearvariableTags fetchSmearvariableTags(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.fetchSmearvariableTags(variableID);
    }

    /**
    * Returns the smearvariable tags with the primary key.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags
    * @throws PortalException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags getSmearvariableTags(
        long variableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.getSmearvariableTags(variableID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smearvariable tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable tagses
    * @param end the upper bound of the range of smearvariable tagses (not inclusive)
    * @return the range of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.SmearvariableTags> getSmearvariableTagses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.getSmearvariableTagses(start, end);
    }

    /**
    * Returns the number of smearvariable tagses.
    *
    * @return the number of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearvariableTagsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.getSmearvariableTagsesCount();
    }

    /**
    * Updates the smearvariable tags in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearvariableTags the smearvariable tags
    * @return the smearvariable tags that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearvariableTags updateSmearvariableTags(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearvariableTagsLocalService.updateSmearvariableTags(smearvariableTags);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearvariableTagsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearvariableTagsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearvariableTagsLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearvariableTagsLocalService getWrappedSmearvariableTagsLocalService() {
        return _smearvariableTagsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearvariableTagsLocalService(
        SmearvariableTagsLocalService smearvariableTagsLocalService) {
        _smearvariableTagsLocalService = smearvariableTagsLocalService;
    }

    @Override
    public SmearvariableTagsLocalService getWrappedService() {
        return _smearvariableTagsLocalService;
    }

    @Override
    public void setWrappedService(
        SmearvariableTagsLocalService smearvariableTagsLocalService) {
        _smearvariableTagsLocalService = smearvariableTagsLocalService;
    }
}
