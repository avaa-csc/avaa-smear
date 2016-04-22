package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearEvents;

import java.util.List;

/**
 * The persistence utility for the smear events service. This utility wraps {@link SmearEventsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearEventsPersistence
 * @see SmearEventsPersistenceImpl
 * @generated
 */
public class SmearEventsUtil {
    private static SmearEventsPersistence _persistence;

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
    public static void clearCache(SmearEvents smearEvents) {
        getPersistence().clearCache(smearEvents);
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
    public static List<SmearEvents> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearEvents> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearEvents> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearEvents update(SmearEvents smearEvents)
        throws SystemException {
        return getPersistence().update(smearEvents);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearEvents update(SmearEvents smearEvents,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(smearEvents, serviceContext);
    }

    /**
    * Caches the smear events in the entity cache if it is enabled.
    *
    * @param smearEvents the smear events
    */
    public static void cacheResult(
        fi.csc.smear.db.model.SmearEvents smearEvents) {
        getPersistence().cacheResult(smearEvents);
    }

    /**
    * Caches the smear eventses in the entity cache if it is enabled.
    *
    * @param smearEventses the smear eventses
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearEvents> smearEventses) {
        getPersistence().cacheResult(smearEventses);
    }

    /**
    * Creates a new smear events with the primary key. Does not add the smear events to the database.
    *
    * @param eventID the primary key for the new smear events
    * @return the new smear events
    */
    public static fi.csc.smear.db.model.SmearEvents create(long eventID) {
        return getPersistence().create(eventID);
    }

    /**
    * Removes the smear events with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events that was removed
    * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearEvents remove(long eventID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchEventsException {
        return getPersistence().remove(eventID);
    }

    public static fi.csc.smear.db.model.SmearEvents updateImpl(
        fi.csc.smear.db.model.SmearEvents smearEvents)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearEvents);
    }

    /**
    * Returns the smear events with the primary key or throws a {@link fi.csc.smear.db.NoSuchEventsException} if it could not be found.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events
    * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearEvents findByPrimaryKey(
        long eventID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchEventsException {
        return getPersistence().findByPrimaryKey(eventID);
    }

    /**
    * Returns the smear events with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events, or <code>null</code> if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearEvents fetchByPrimaryKey(
        long eventID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(eventID);
    }

    /**
    * Returns all the smear eventses.
    *
    * @return the smear eventses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearEvents> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the smear eventses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearEventsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear eventses
    * @param end the upper bound of the range of smear eventses (not inclusive)
    * @return the range of smear eventses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearEvents> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the smear eventses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearEventsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear eventses
    * @param end the upper bound of the range of smear eventses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smear eventses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearEvents> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smear eventses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smear eventses.
    *
    * @return the number of smear eventses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearEventsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearEventsPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearEventsPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearEventsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearEventsPersistence persistence) {
    }
}
