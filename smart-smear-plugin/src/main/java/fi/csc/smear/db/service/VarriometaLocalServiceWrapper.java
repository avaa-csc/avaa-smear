package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VarriometaLocalService}.
 *
 * @author pj
 * @see VarriometaLocalService
 * @generated
 */
public class VarriometaLocalServiceWrapper implements VarriometaLocalService,
    ServiceWrapper<VarriometaLocalService> {
    private VarriometaLocalService _varriometaLocalService;

    public VarriometaLocalServiceWrapper(
        VarriometaLocalService varriometaLocalService) {
        _varriometaLocalService = varriometaLocalService;
    }

    /**
    * Adds the varriometa to the database. Also notifies the appropriate model listeners.
    *
    * @param varriometa the varriometa
    * @return the varriometa that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varriometa addVarriometa(
        fi.csc.smear.db.model.Varriometa varriometa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.addVarriometa(varriometa);
    }

    /**
    * Creates a new varriometa with the primary key. Does not add the varriometa to the database.
    *
    * @param SAMPTIME the primary key for the new varriometa
    * @return the new varriometa
    */
    @Override
    public fi.csc.smear.db.model.Varriometa createVarriometa(
        java.util.Date SAMPTIME) {
        return _varriometaLocalService.createVarriometa(SAMPTIME);
    }

    /**
    * Deletes the varriometa with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varriometa
    * @return the varriometa that was removed
    * @throws PortalException if a varriometa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varriometa deleteVarriometa(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.deleteVarriometa(SAMPTIME);
    }

    /**
    * Deletes the varriometa from the database. Also notifies the appropriate model listeners.
    *
    * @param varriometa the varriometa
    * @return the varriometa that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varriometa deleteVarriometa(
        fi.csc.smear.db.model.Varriometa varriometa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.deleteVarriometa(varriometa);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _varriometaLocalService.dynamicQuery();
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
        return _varriometaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarriometaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _varriometaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarriometaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _varriometaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _varriometaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _varriometaLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Varriometa fetchVarriometa(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.fetchVarriometa(SAMPTIME);
    }

    /**
    * Returns the varriometa with the primary key.
    *
    * @param SAMPTIME the primary key of the varriometa
    * @return the varriometa
    * @throws PortalException if a varriometa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varriometa getVarriometa(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.getVarriometa(SAMPTIME);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the varriometas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarriometaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of varriometas
    * @param end the upper bound of the range of varriometas (not inclusive)
    * @return the range of varriometas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Varriometa> getVarriometas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.getVarriometas(start, end);
    }

    /**
    * Returns the number of varriometas.
    *
    * @return the number of varriometas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getVarriometasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.getVarriometasCount();
    }

    /**
    * Updates the varriometa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param varriometa the varriometa
    * @return the varriometa that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varriometa updateVarriometa(
        fi.csc.smear.db.model.Varriometa varriometa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varriometaLocalService.updateVarriometa(varriometa);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _varriometaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _varriometaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _varriometaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VarriometaLocalService getWrappedVarriometaLocalService() {
        return _varriometaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVarriometaLocalService(
        VarriometaLocalService varriometaLocalService) {
        _varriometaLocalService = varriometaLocalService;
    }

    @Override
    public VarriometaLocalService getWrappedService() {
        return _varriometaLocalService;
    }

    @Override
    public void setWrappedService(VarriometaLocalService varriometaLocalService) {
        _varriometaLocalService = varriometaLocalService;
    }
}
