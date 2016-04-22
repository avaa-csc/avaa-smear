package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Varrio_treeLocalService}.
 *
 * @author pj
 * @see Varrio_treeLocalService
 * @generated
 */
public class Varrio_treeLocalServiceWrapper implements Varrio_treeLocalService,
    ServiceWrapper<Varrio_treeLocalService> {
    private Varrio_treeLocalService _varrio_treeLocalService;

    public Varrio_treeLocalServiceWrapper(
        Varrio_treeLocalService varrio_treeLocalService) {
        _varrio_treeLocalService = varrio_treeLocalService;
    }

    /**
    * Adds the varrio_tree to the database. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree addVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.addVarrio_tree(varrio_tree);
    }

    /**
    * Creates a new varrio_tree with the primary key. Does not add the varrio_tree to the database.
    *
    * @param SAMPTIME the primary key for the new varrio_tree
    * @return the new varrio_tree
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree createVarrio_tree(
        java.util.Date SAMPTIME) {
        return _varrio_treeLocalService.createVarrio_tree(SAMPTIME);
    }

    /**
    * Deletes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree that was removed
    * @throws PortalException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree deleteVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.deleteVarrio_tree(SAMPTIME);
    }

    /**
    * Deletes the varrio_tree from the database. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree deleteVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.deleteVarrio_tree(varrio_tree);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _varrio_treeLocalService.dynamicQuery();
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
        return _varrio_treeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _varrio_treeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _varrio_treeLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _varrio_treeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _varrio_treeLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Varrio_tree fetchVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.fetchVarrio_tree(SAMPTIME);
    }

    /**
    * Returns the varrio_tree with the primary key.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree
    * @throws PortalException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree getVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.getVarrio_tree(SAMPTIME);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the varrio_trees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of varrio_trees
    * @param end the upper bound of the range of varrio_trees (not inclusive)
    * @return the range of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Varrio_tree> getVarrio_trees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.getVarrio_trees(start, end);
    }

    /**
    * Returns the number of varrio_trees.
    *
    * @return the number of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getVarrio_treesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.getVarrio_treesCount();
    }

    /**
    * Updates the varrio_tree in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Varrio_tree updateVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _varrio_treeLocalService.updateVarrio_tree(varrio_tree);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _varrio_treeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _varrio_treeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _varrio_treeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Varrio_treeLocalService getWrappedVarrio_treeLocalService() {
        return _varrio_treeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVarrio_treeLocalService(
        Varrio_treeLocalService varrio_treeLocalService) {
        _varrio_treeLocalService = varrio_treeLocalService;
    }

    @Override
    public Varrio_treeLocalService getWrappedService() {
        return _varrio_treeLocalService;
    }

    @Override
    public void setWrappedService(
        Varrio_treeLocalService varrio_treeLocalService) {
        _varrio_treeLocalService = varrio_treeLocalService;
    }
}
