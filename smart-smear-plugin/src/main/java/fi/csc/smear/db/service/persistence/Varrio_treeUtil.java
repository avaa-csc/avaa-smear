package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Varrio_tree;

import java.util.List;

/**
 * The persistence utility for the varrio_tree service. This utility wraps {@link Varrio_treePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Varrio_treePersistence
 * @see Varrio_treePersistenceImpl
 * @generated
 */
public class Varrio_treeUtil {
    private static Varrio_treePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Varrio_tree varrio_tree) {
        getPersistence().clearCache(varrio_tree);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Varrio_tree> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Varrio_tree> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Varrio_tree> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Varrio_tree update(Varrio_tree varrio_tree)
        throws SystemException {
        return getPersistence().update(varrio_tree);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Varrio_tree update(Varrio_tree varrio_tree,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(varrio_tree, serviceContext);
    }

    /**
    * Caches the varrio_tree in the entity cache if it is enabled.
    *
    * @param varrio_tree the varrio_tree
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Varrio_tree varrio_tree) {
        getPersistence().cacheResult(varrio_tree);
    }

    /**
    * Caches the varrio_trees in the entity cache if it is enabled.
    *
    * @param varrio_trees the varrio_trees
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Varrio_tree> varrio_trees) {
        getPersistence().cacheResult(varrio_trees);
    }

    /**
    * Creates a new varrio_tree with the primary key. Does not add the varrio_tree to the database.
    *
    * @param SAMPTIME the primary key for the new varrio_tree
    * @return the new varrio_tree
    */
    public static fi.csc.smear.db.model.Varrio_tree create(
        java.util.Date SAMPTIME) {
        return getPersistence().create(SAMPTIME);
    }

    /**
    * Removes the varrio_tree with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree that was removed
    * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree remove(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarrio_treeException {
        return getPersistence().remove(SAMPTIME);
    }

    public static fi.csc.smear.db.model.Varrio_tree updateImpl(
        fi.csc.smear.db.model.Varrio_tree varrio_tree)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(varrio_tree);
    }

    /**
    * Returns the varrio_tree with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarrio_treeException} if it could not be found.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree
    * @throws fi.csc.smear.db.NoSuchVarrio_treeException if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree findByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarrio_treeException {
        return getPersistence().findByPrimaryKey(SAMPTIME);
    }

    /**
    * Returns the varrio_tree with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param SAMPTIME the primary key of the varrio_tree
    * @return the varrio_tree, or <code>null</code> if a varrio_tree with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Varrio_tree fetchByPrimaryKey(
        java.util.Date SAMPTIME)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(SAMPTIME);
    }

    /**
    * Returns all the varrio_trees.
    *
    * @return the varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the varrio_trees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Varrio_treeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of varrio_trees
    * @param end the upper bound of the range of varrio_trees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Varrio_tree> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the varrio_trees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of varrio_trees.
    *
    * @return the number of varrio_trees
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Varrio_treePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Varrio_treePersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Varrio_treePersistence.class.getName());

            ReferenceRegistry.registerReference(Varrio_treeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Varrio_treePersistence persistence) {
    }
}
