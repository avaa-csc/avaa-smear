package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearTagsLocalService}.
 *
 * @author pj
 * @see SmearTagsLocalService
 * @generated
 */
public class SmearTagsLocalServiceWrapper implements SmearTagsLocalService,
    ServiceWrapper<SmearTagsLocalService> {
    private SmearTagsLocalService _smearTagsLocalService;

    public SmearTagsLocalServiceWrapper(
        SmearTagsLocalService smearTagsLocalService) {
        _smearTagsLocalService = smearTagsLocalService;
    }

    /**
    * Adds the smear tags to the database. Also notifies the appropriate model listeners.
    *
    * @param smearTags the smear tags
    * @return the smear tags that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTags addSmearTags(
        fi.csc.smear.db.model.SmearTags smearTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.addSmearTags(smearTags);
    }

    /**
    * Creates a new smear tags with the primary key. Does not add the smear tags to the database.
    *
    * @param tagID the primary key for the new smear tags
    * @return the new smear tags
    */
    @Override
    public fi.csc.smear.db.model.SmearTags createSmearTags(long tagID) {
        return _smearTagsLocalService.createSmearTags(tagID);
    }

    /**
    * Deletes the smear tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags that was removed
    * @throws PortalException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTags deleteSmearTags(long tagID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.deleteSmearTags(tagID);
    }

    /**
    * Deletes the smear tags from the database. Also notifies the appropriate model listeners.
    *
    * @param smearTags the smear tags
    * @return the smear tags that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTags deleteSmearTags(
        fi.csc.smear.db.model.SmearTags smearTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.deleteSmearTags(smearTags);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearTagsLocalService.dynamicQuery();
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
        return _smearTagsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearTagsLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearTagsLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _smearTagsLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearTagsLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.SmearTags fetchSmearTags(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.fetchSmearTags(tagID);
    }

    /**
    * Returns the smear tags with the primary key.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags
    * @throws PortalException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTags getSmearTags(long tagID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.getSmearTags(tagID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smear tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear tagses
    * @param end the upper bound of the range of smear tagses (not inclusive)
    * @return the range of smear tagses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.SmearTags> getSmearTagses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.getSmearTagses(start, end);
    }

    /**
    * Returns the number of smear tagses.
    *
    * @return the number of smear tagses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearTagsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.getSmearTagsesCount();
    }

    /**
    * Updates the smear tags in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearTags the smear tags
    * @return the smear tags that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTags updateSmearTags(
        fi.csc.smear.db.model.SmearTags smearTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTagsLocalService.updateSmearTags(smearTags);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearTagsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearTagsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearTagsLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearTagsLocalService getWrappedSmearTagsLocalService() {
        return _smearTagsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearTagsLocalService(
        SmearTagsLocalService smearTagsLocalService) {
        _smearTagsLocalService = smearTagsLocalService;
    }

    @Override
    public SmearTagsLocalService getWrappedService() {
        return _smearTagsLocalService;
    }

    @Override
    public void setWrappedService(SmearTagsLocalService smearTagsLocalService) {
        _smearTagsLocalService = smearTagsLocalService;
    }
}
