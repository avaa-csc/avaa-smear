package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Varrio_tree. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Varrio_treeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj
 * @see Varrio_treeLocalService
 * @see fi.csc.smear.db.service.base.Varrio_treeLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Varrio_treeLocalServiceImpl
 * @generated
 */
public class Varrio_treeLocalServiceUtil {
    private static Varrio_treeLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Varrio_treeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the varrio_tree to the database. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree addVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addVarrio_tree(varrio_tree);
    }

    /**
    * Creates a new varrio_tree with the primary key. Does not add the varrio_tree to the database.
    *
    * @param SAMPTIME the primary key for the new varrio_tree
    * @return the new varrio_tree
    */
    public static fi.csc.smear.db.model.Varrio_tree createVarrio_tree(
        java.util.Date SAMPTIME) {
        return getService().createVarrio_tree(SAMPTIME);
    }

    /**
    * Deletes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree that was removed
    * @throws PortalException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree deleteVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteVarrio_tree(SAMPTIME);
    }

    /**
    * Deletes the varrio_tree from the database. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree deleteVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteVarrio_tree(varrio_tree);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static fi.csc.smear.db.model.Varrio_tree fetchVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchVarrio_tree(SAMPTIME);
    }

    /**
    * Returns the varrio_tree with the primary key.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree
    * @throws PortalException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree getVarrio_tree(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getVarrio_tree(SAMPTIME);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<fi.csc.smear.db.model.Varrio_tree> getVarrio_trees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVarrio_trees(start, end);
    }

    /**
    * Returns the number of varrio_trees.
    *
    * @return the number of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public static int getVarrio_treesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVarrio_treesCount();
    }

    /**
    * Updates the varrio_tree in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param varrio_tree the varrio_tree
    * @return the varrio_tree that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree updateVarrio_tree(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateVarrio_tree(varrio_tree);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Varrio_treeLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Varrio_treeLocalService.class.getName());

            if (invokableLocalService instanceof Varrio_treeLocalService) {
                _service = (Varrio_treeLocalService) invokableLocalService;
            } else {
                _service = new Varrio_treeLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Varrio_treeLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Varrio_treeLocalService service) {
    }
}
