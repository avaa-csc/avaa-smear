package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Hyy_eddysub;

import java.util.List;

/**
 * The persistence utility for the hyy_eddysub service. This utility wraps {@link Hyy_eddysubPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyy_eddysubPersistence
 * @see Hyy_eddysubPersistenceImpl
 * @generated
 */
public class Hyy_eddysubUtil {
    private static Hyy_eddysubPersistence _persistence;

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
    public static void clearCache(Hyy_eddysub hyy_eddysub) {
        getPersistence().clearCache(hyy_eddysub);
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
    public static List<Hyy_eddysub> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Hyy_eddysub> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Hyy_eddysub> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Hyy_eddysub update(Hyy_eddysub hyy_eddysub)
        throws SystemException {
        return getPersistence().update(hyy_eddysub);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Hyy_eddysub update(Hyy_eddysub hyy_eddysub,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(hyy_eddysub, serviceContext);
    }

    /**
    * Caches the hyy_eddysub in the entity cache if it is enabled.
    *
    * @param hyy_eddysub the hyy_eddysub
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub) {
        getPersistence().cacheResult(hyy_eddysub);
    }

    /**
    * Caches the hyy_eddysubs in the entity cache if it is enabled.
    *
    * @param hyy_eddysubs the hyy_eddysubs
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Hyy_eddysub> hyy_eddysubs) {
        getPersistence().cacheResult(hyy_eddysubs);
    }

    /**
    * Creates a new hyy_eddysub with the primary key. Does not add the hyy_eddysub to the database.
    *
    * @param samptime the primary key for the new hyy_eddysub
    * @return the new hyy_eddysub
    */
    public static fi.csc.smear.db.model.Hyy_eddysub create(
        java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the hyy_eddysub with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy_eddysub
    * @return the hyy_eddysub that was removed
    * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyy_eddysub remove(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyy_eddysubException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.Hyy_eddysub updateImpl(
        fi.csc.smear.db.model.Hyy_eddysub hyy_eddysub)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(hyy_eddysub);
    }

    /**
    * Returns the hyy_eddysub with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyy_eddysubException} if it could not be found.
    *
    * @param samptime the primary key of the hyy_eddysub
    * @return the hyy_eddysub
    * @throws fi.csc.smear.db.NoSuchHyy_eddysubException if a hyy_eddysub with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyy_eddysub findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyy_eddysubException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the hyy_eddysub with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyy_eddysub
    * @return the hyy_eddysub, or <code>null</code> if a hyy_eddysub with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyy_eddysub fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the hyy_eddysubs.
    *
    * @return the hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyy_eddysub> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hyy_eddysubs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy_eddysubs
    * @param end the upper bound of the range of hyy_eddysubs (not inclusive)
    * @return the range of hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyy_eddysub> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hyy_eddysubs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyy_eddysubModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy_eddysubs
    * @param end the upper bound of the range of hyy_eddysubs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyy_eddysub> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hyy_eddysubs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hyy_eddysubs.
    *
    * @return the number of hyy_eddysubs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Hyy_eddysubPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Hyy_eddysubPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Hyy_eddysubPersistence.class.getName());

            ReferenceRegistry.registerReference(Hyy_eddysubUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Hyy_eddysubPersistence persistence) {
    }
}
