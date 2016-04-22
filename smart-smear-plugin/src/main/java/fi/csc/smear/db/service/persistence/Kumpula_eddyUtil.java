package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Kumpula_eddy;

import java.util.List;

/**
 * The persistence utility for the kumpula_eddy service. This utility wraps {@link Kumpula_eddyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Kumpula_eddyPersistence
 * @see Kumpula_eddyPersistenceImpl
 * @generated
 */
public class Kumpula_eddyUtil {
    private static Kumpula_eddyPersistence _persistence;

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
    public static void clearCache(Kumpula_eddy kumpula_eddy) {
        getPersistence().clearCache(kumpula_eddy);
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
    public static List<Kumpula_eddy> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Kumpula_eddy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Kumpula_eddy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Kumpula_eddy update(Kumpula_eddy kumpula_eddy)
        throws SystemException {
        return getPersistence().update(kumpula_eddy);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Kumpula_eddy update(Kumpula_eddy kumpula_eddy,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(kumpula_eddy, serviceContext);
    }

    /**
    * Caches the kumpula_eddy in the entity cache if it is enabled.
    *
    * @param kumpula_eddy the kumpula_eddy
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy) {
        getPersistence().cacheResult(kumpula_eddy);
    }

    /**
    * Caches the kumpula_eddies in the entity cache if it is enabled.
    *
    * @param kumpula_eddies the kumpula_eddies
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Kumpula_eddy> kumpula_eddies) {
        getPersistence().cacheResult(kumpula_eddies);
    }

    /**
    * Creates a new kumpula_eddy with the primary key. Does not add the kumpula_eddy to the database.
    *
    * @param samptime the primary key for the new kumpula_eddy
    * @return the new kumpula_eddy
    */
    public static fi.csc.smear.db.model.Kumpula_eddy create(
        java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the kumpula_eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy that was removed
    * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpula_eddy remove(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpula_eddyException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.Kumpula_eddy updateImpl(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(kumpula_eddy);
    }

    /**
    * Returns the kumpula_eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpula_eddyException} if it could not be found.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy
    * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpula_eddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpula_eddyException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the kumpula_eddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy, or <code>null</code> if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpula_eddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the kumpula_eddies.
    *
    * @return the kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the kumpula_eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpula_eddies
    * @param end the upper bound of the range of kumpula_eddies (not inclusive)
    * @return the range of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the kumpula_eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Kumpula_eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpula_eddies
    * @param end the upper bound of the range of kumpula_eddies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the kumpula_eddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of kumpula_eddies.
    *
    * @return the number of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Kumpula_eddyPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Kumpula_eddyPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Kumpula_eddyPersistence.class.getName());

            ReferenceRegistry.registerReference(Kumpula_eddyUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Kumpula_eddyPersistence persistence) {
    }
}
