package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Sii1eddy;

import java.util.List;

/**
 * The persistence utility for the sii1eddy service. This utility wraps {@link Sii1eddyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii1eddyPersistence
 * @see Sii1eddyPersistenceImpl
 * @generated
 */
public class Sii1eddyUtil {
    private static Sii1eddyPersistence _persistence;

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
    public static void clearCache(Sii1eddy sii1eddy) {
        getPersistence().clearCache(sii1eddy);
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
    public static List<Sii1eddy> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Sii1eddy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Sii1eddy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Sii1eddy update(Sii1eddy sii1eddy) throws SystemException {
        return getPersistence().update(sii1eddy);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Sii1eddy update(Sii1eddy sii1eddy,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(sii1eddy, serviceContext);
    }

    /**
    * Caches the sii1eddy in the entity cache if it is enabled.
    *
    * @param sii1eddy the sii1eddy
    */
    public static void cacheResult(fi.csc.smear.db.model.Sii1eddy sii1eddy) {
        getPersistence().cacheResult(sii1eddy);
    }

    /**
    * Caches the sii1eddies in the entity cache if it is enabled.
    *
    * @param sii1eddies the sii1eddies
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Sii1eddy> sii1eddies) {
        getPersistence().cacheResult(sii1eddies);
    }

    /**
    * Creates a new sii1eddy with the primary key. Does not add the sii1eddy to the database.
    *
    * @param samptime the primary key for the new sii1eddy
    * @return the new sii1eddy
    */
    public static fi.csc.smear.db.model.Sii1eddy create(java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the sii1eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii1eddy
    * @return the sii1eddy that was removed
    * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii1eddyException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.Sii1eddy updateImpl(
        fi.csc.smear.db.model.Sii1eddy sii1eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(sii1eddy);
    }

    /**
    * Returns the sii1eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii1eddyException} if it could not be found.
    *
    * @param samptime the primary key of the sii1eddy
    * @return the sii1eddy
    * @throws fi.csc.smear.db.NoSuchSii1eddyException if a sii1eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii1eddyException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the sii1eddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the sii1eddy
    * @return the sii1eddy, or <code>null</code> if a sii1eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the sii1eddies.
    *
    * @return the sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Sii1eddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the sii1eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1eddies
    * @param end the upper bound of the range of sii1eddies (not inclusive)
    * @return the range of sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Sii1eddy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the sii1eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1eddies
    * @param end the upper bound of the range of sii1eddies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Sii1eddy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the sii1eddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of sii1eddies.
    *
    * @return the number of sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Sii1eddyPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Sii1eddyPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Sii1eddyPersistence.class.getName());

            ReferenceRegistry.registerReference(Sii1eddyUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Sii1eddyPersistence persistence) {
    }
}
