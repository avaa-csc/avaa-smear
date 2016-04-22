package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearTableMetadataLocalService}.
 *
 * @author pj
 * @see SmearTableMetadataLocalService
 * @generated
 */
public class SmearTableMetadataLocalServiceWrapper
    implements SmearTableMetadataLocalService,
        ServiceWrapper<SmearTableMetadataLocalService> {
    private SmearTableMetadataLocalService _smearTableMetadataLocalService;

    public SmearTableMetadataLocalServiceWrapper(
        SmearTableMetadataLocalService smearTableMetadataLocalService) {
        _smearTableMetadataLocalService = smearTableMetadataLocalService;
    }

    /**
    * Adds the smear table metadata to the database. Also notifies the appropriate model listeners.
    *
    * @param smearTableMetadata the smear table metadata
    * @return the smear table metadata that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata addSmearTableMetadata(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.addSmearTableMetadata(smearTableMetadata);
    }

    /**
    * Creates a new smear table metadata with the primary key. Does not add the smear table metadata to the database.
    *
    * @param tableID the primary key for the new smear table metadata
    * @return the new smear table metadata
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata createSmearTableMetadata(
        long tableID) {
        return _smearTableMetadataLocalService.createSmearTableMetadata(tableID);
    }

    /**
    * Deletes the smear table metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata that was removed
    * @throws PortalException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata deleteSmearTableMetadata(
        long tableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.deleteSmearTableMetadata(tableID);
    }

    /**
    * Deletes the smear table metadata from the database. Also notifies the appropriate model listeners.
    *
    * @param smearTableMetadata the smear table metadata
    * @return the smear table metadata that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata deleteSmearTableMetadata(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.deleteSmearTableMetadata(smearTableMetadata);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _smearTableMetadataLocalService.dynamicQuery();
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
        return _smearTableMetadataLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearTableMetadataLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _smearTableMetadataLocalService.dynamicQuery(dynamicQuery,
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
        return _smearTableMetadataLocalService.dynamicQueryCount(dynamicQuery);
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
        return _smearTableMetadataLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.SmearTableMetadata fetchSmearTableMetadata(
        long tableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.fetchSmearTableMetadata(tableID);
    }

    /**
    * Returns the smear table metadata with the primary key.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata
    * @throws PortalException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata getSmearTableMetadata(
        long tableID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.getSmearTableMetadata(tableID);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the smear table metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear table metadatas
    * @param end the upper bound of the range of smear table metadatas (not inclusive)
    * @return the range of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.SmearTableMetadata> getSmearTableMetadatas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.getSmearTableMetadatas(start, end);
    }

    /**
    * Returns the number of smear table metadatas.
    *
    * @return the number of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSmearTableMetadatasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.getSmearTableMetadatasCount();
    }

    /**
    * Updates the smear table metadata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param smearTableMetadata the smear table metadata
    * @return the smear table metadata that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.SmearTableMetadata updateSmearTableMetadata(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _smearTableMetadataLocalService.updateSmearTableMetadata(smearTableMetadata);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearTableMetadataLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearTableMetadataLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearTableMetadataLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearTableMetadataLocalService getWrappedSmearTableMetadataLocalService() {
        return _smearTableMetadataLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearTableMetadataLocalService(
        SmearTableMetadataLocalService smearTableMetadataLocalService) {
        _smearTableMetadataLocalService = smearTableMetadataLocalService;
    }

    @Override
    public SmearTableMetadataLocalService getWrappedService() {
        return _smearTableMetadataLocalService;
    }

    @Override
    public void setWrappedService(
        SmearTableMetadataLocalService smearTableMetadataLocalService) {
        _smearTableMetadataLocalService = smearTableMetadataLocalService;
    }
}
