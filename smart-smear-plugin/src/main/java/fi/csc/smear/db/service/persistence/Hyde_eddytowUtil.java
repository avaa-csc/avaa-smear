package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Hyde_eddytow;

import java.util.List;

/**
 * The persistence utility for the hyde_eddytow service. This utility wraps {@link Hyde_eddytowPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyde_eddytowPersistence
 * @see Hyde_eddytowPersistenceImpl
 * @generated
 */
public class Hyde_eddytowUtil {
    private static Hyde_eddytowPersistence _persistence;

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
    public static void clearCache(Hyde_eddytow hyde_eddytow) {
        getPersistence().clearCache(hyde_eddytow);
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
    public static List<Hyde_eddytow> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Hyde_eddytow> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Hyde_eddytow> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Hyde_eddytow update(Hyde_eddytow hyde_eddytow)
        throws SystemException {
        return getPersistence().update(hyde_eddytow);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Hyde_eddytow update(Hyde_eddytow hyde_eddytow,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(hyde_eddytow, serviceContext);
    }

    /**
    * Caches the hyde_eddytow in the entity cache if it is enabled.
    *
    * @param hyde_eddytow the hyde_eddytow
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow) {
        getPersistence().cacheResult(hyde_eddytow);
    }

    /**
    * Caches the hyde_eddytows in the entity cache if it is enabled.
    *
    * @param hyde_eddytows the hyde_eddytows
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Hyde_eddytow> hyde_eddytows) {
        getPersistence().cacheResult(hyde_eddytows);
    }

    /**
    * Creates a new hyde_eddytow with the primary key. Does not add the hyde_eddytow to the database.
    *
    * @param samptime the primary key for the new hyde_eddytow
    * @return the new hyde_eddytow
    */
    public static fi.csc.smear.db.model.Hyde_eddytow create(
        java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow remove(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddytowException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.Hyde_eddytow updateImpl(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(hyde_eddytow);
    }

    /**
    * Returns the hyde_eddytow with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyde_eddytowException} if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow
    * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddytowException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the hyde_eddytow with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow, or <code>null</code> if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the hyde_eddytows.
    *
    * @return the hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @return the range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hyde_eddytows from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hyde_eddytows.
    *
    * @return the number of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Hyde_eddytowPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Hyde_eddytowPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Hyde_eddytowPersistence.class.getName());

            ReferenceRegistry.registerReference(Hyde_eddytowUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Hyde_eddytowPersistence persistence) {
    }
}
