package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.VarDMPS;

import java.util.List;

/**
 * The persistence utility for the var d m p s service. This utility wraps {@link VarDMPSPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see VarDMPSPersistence
 * @see VarDMPSPersistenceImpl
 * @generated
 */
public class VarDMPSUtil {
    private static VarDMPSPersistence _persistence;

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
    public static void clearCache(VarDMPS varDMPS) {
        getPersistence().clearCache(varDMPS);
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
    public static List<VarDMPS> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<VarDMPS> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<VarDMPS> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static VarDMPS update(VarDMPS varDMPS) throws SystemException {
        return getPersistence().update(varDMPS);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static VarDMPS update(VarDMPS varDMPS, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(varDMPS, serviceContext);
    }

    /**
    * Caches the var d m p s in the entity cache if it is enabled.
    *
    * @param varDMPS the var d m p s
    */
    public static void cacheResult(fi.csc.smear.db.model.VarDMPS varDMPS) {
        getPersistence().cacheResult(varDMPS);
    }

    /**
    * Caches the var d m p ses in the entity cache if it is enabled.
    *
    * @param varDMPSs the var d m p ses
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.VarDMPS> varDMPSs) {
        getPersistence().cacheResult(varDMPSs);
    }

    /**
    * Creates a new var d m p s with the primary key. Does not add the var d m p s to the database.
    *
    * @param samptime the primary key for the new var d m p s
    * @return the new var d m p s
    */
    public static fi.csc.smear.db.model.VarDMPS create(java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the var d m p s with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s that was removed
    * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.VarDMPS remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarDMPSException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.VarDMPS updateImpl(
        fi.csc.smear.db.model.VarDMPS varDMPS)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(varDMPS);
    }

    /**
    * Returns the var d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchVarDMPSException} if it could not be found.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s
    * @throws fi.csc.smear.db.NoSuchVarDMPSException if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.VarDMPS findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVarDMPSException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the var d m p s with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the var d m p s
    * @return the var d m p s, or <code>null</code> if a var d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.VarDMPS fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the var d m p ses.
    *
    * @return the var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.VarDMPS> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the var d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of var d m p ses
    * @param end the upper bound of the range of var d m p ses (not inclusive)
    * @return the range of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.VarDMPS> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the var d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.VarDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of var d m p ses
    * @param end the upper bound of the range of var d m p ses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.VarDMPS> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the var d m p ses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of var d m p ses.
    *
    * @return the number of var d m p ses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static VarDMPSPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (VarDMPSPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    VarDMPSPersistence.class.getName());

            ReferenceRegistry.registerReference(VarDMPSUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(VarDMPSPersistence persistence) {
    }
}
