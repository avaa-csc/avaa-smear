package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearVariableMetadataLocalService}.
 *
 * @author pj
 * @see SmearVariableMetadataLocalService
 * @generated
 */
public class SmearVariableMetadataLocalServiceWrapper
    implements SmearVariableMetadataLocalService,
        ServiceWrapper<SmearVariableMetadataLocalService> {
    private SmearVariableMetadataLocalService _smearVariableMetadataLocalService;

    public SmearVariableMetadataLocalServiceWrapper(
        SmearVariableMetadataLocalService smearVariableMetadataLocalService) {
        _smearVariableMetadataLocalService = smearVariableMetadataLocalService;
    }

    /**
    * Adds the smear variable metadata to the database. Also notifies the appropriate model listeners.
    *
    * @param smearVariableMetadata the smear variable metadata
    * @return the smear variable metadata that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata addSmearVariableMetadata(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.addSmearVariableMetadata(smearVariableMetadata);
    }

    /**
    * Creates a new smear variable metadata with the primary key. Does not add the smear variable metadata to the database.
    *
    * @param variableID the primary key for the new smear variable metadata
    * @return the new smear variable metadata
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata createSmearVariableMetadata(
        long variableID) {
        return _smearVariableMetadataLocalService.createSmearVariableMetadata(variableID);
    }

    /**
    * Deletes the smear variable metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata that was removed
    * @throws PortalException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata deleteSmearVariableMetadata(
        long variableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.deleteSmearVariableMetadata(variableID);
    }

    /**
    * Deletes the smear variable metadata from the database. Also notifies the appropriate model listeners.
    *
    * @param smearVariableMetadata the smear variable metadata
    * @return the smear variable metadata that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata deleteSmearVariableMetadata(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.deleteSmearVariableMetadata(smearVariableMetadata);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearVariableMetadataLocalService.dynamicQuery();
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
        return _smearVariableMetadataLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearVariableMetadataLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearVariableMetadataLocalService.dynamicQuery(dynamicQuery,
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
        return _smearVariableMetadataLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearVariableMetadataLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata fetchSmearVariableMetadata(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.fetchSmearVariableMetadata(variableID);
    }

    /**
    * Returns the smear variable metadata with the primary key.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata
    * @throws PortalException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata getSmearVariableMetadata(
        long variableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.getSmearVariableMetadata(variableID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smear variable metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear variable metadatas
    * @param end the upper bound of the range of smear variable metadatas (not inclusive)
    * @return the range of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> getSmearVariableMetadatas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.getSmearVariableMetadatas(start,
            end);
    }

    /**
    * Returns the number of smear variable metadatas.
    *
    * @return the number of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearVariableMetadatasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.getSmearVariableMetadatasCount();
    }

    /**
    * Updates the smear variable metadata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearVariableMetadata the smear variable metadata
    * @return the smear variable metadata that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearVariableMetadata updateSmearVariableMetadata(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearVariableMetadataLocalService.updateSmearVariableMetadata(smearVariableMetadata);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearVariableMetadataLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearVariableMetadataLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearVariableMetadataLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearVariableMetadataLocalService getWrappedSmearVariableMetadataLocalService() {
        return _smearVariableMetadataLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearVariableMetadataLocalService(
        SmearVariableMetadataLocalService smearVariableMetadataLocalService) {
        _smearVariableMetadataLocalService = smearVariableMetadataLocalService;
    }

    @Override
    public SmearVariableMetadataLocalService getWrappedService() {
        return _smearVariableMetadataLocalService;
    }

    @Override
    public void setWrappedService(
        SmearVariableMetadataLocalService smearVariableMetadataLocalService) {
        _smearVariableMetadataLocalService = smearVariableMetadataLocalService;
    }
}
