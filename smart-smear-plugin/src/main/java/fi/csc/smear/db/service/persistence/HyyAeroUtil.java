package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.HyyAero;

import java.util.List;

/**
 * The persistence utility for the hyy aero service. This utility wraps {@link HyyAeroPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HyyAeroPersistence
 * @see HyyAeroPersistenceImpl
 * @generated
 */
public class HyyAeroUtil {
    private static HyyAeroPersistence _persistence;

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
    public static void clearCache(HyyAero hyyAero) {
        getPersistence().clearCache(hyyAero);
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
    public static List<HyyAero> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<HyyAero> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<HyyAero> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static HyyAero update(HyyAero hyyAero) throws SystemException {
        return getPersistence().update(hyyAero);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static HyyAero update(HyyAero hyyAero, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(hyyAero, serviceContext);
    }

    /**
    * Caches the hyy aero in the entity cache if it is enabled.
    *
    * @param hyyAero the hyy aero
    */
    public static void cacheResult(fi.csc.smear.db.model.HyyAero hyyAero) {
        getPersistence().cacheResult(hyyAero);
    }

    /**
    * Caches the hyy aeros in the entity cache if it is enabled.
    *
    * @param hyyAeros the hyy aeros
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.HyyAero> hyyAeros) {
        getPersistence().cacheResult(hyyAeros);
    }

    /**
    * Creates a new hyy aero with the primary key. Does not add the hyy aero to the database.
    *
    * @param samptime the primary key for the new hyy aero
    * @return the new hyy aero
    */
    public static fi.csc.smear.db.model.HyyAero create(java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the hyy aero with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero that was removed
    * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.HyyAero remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyAeroException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.HyyAero updateImpl(
        fi.csc.smear.db.model.HyyAero hyyAero)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(hyyAero);
    }

    /**
    * Returns the hyy aero with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyyAeroException} if it could not be found.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero
    * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.HyyAero findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyAeroException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the hyy aero with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero, or <code>null</code> if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.HyyAero fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the hyy aeros.
    *
    * @return the hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.HyyAero> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hyy aeros.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy aeros
    * @param end the upper bound of the range of hyy aeros (not inclusive)
    * @return the range of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.HyyAero> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hyy aeros.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy aeros
    * @param end the upper bound of the range of hyy aeros (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.HyyAero> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hyy aeros from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hyy aeros.
    *
    * @return the number of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static HyyAeroPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (HyyAeroPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    HyyAeroPersistence.class.getName());

            ReferenceRegistry.registerReference(HyyAeroUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(HyyAeroPersistence persistence) {
    }
}
