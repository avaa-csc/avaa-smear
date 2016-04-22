package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearvariableEvent;

import java.util.List;

/**
 * The persistence utility for the smearvariable event service. This utility wraps {@link SmearvariableEventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearvariableEventPersistence
 * @see SmearvariableEventPersistenceImpl
 * @generated
 */
public class SmearvariableEventUtil {
    private static SmearvariableEventPersistence _persistence;

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
    public static void clearCache(SmearvariableEvent smearvariableEvent) {
        getPersistence().clearCache(smearvariableEvent);
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
    public static List<SmearvariableEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearvariableEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearvariableEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearvariableEvent update(
        SmearvariableEvent smearvariableEvent) throws SystemException {
        return getPersistence().update(smearvariableEvent);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearvariableEvent update(
        SmearvariableEvent smearvariableEvent, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(smearvariableEvent, serviceContext);
    }

    /**
    * Returns all the smearvariable events where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @return the matching smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findByVariable(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByVariable(variableID);
    }

    /**
    * Returns a range of all the smearvariable events where variableID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param variableID the variable i d
    * @param start the lower bound of the range of smearvariable events
    * @param end the upper bound of the range of smearvariable events (not inclusive)
    * @return the range of matching smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findByVariable(
        long variableID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByVariable(variableID, start, end);
    }

    /**
    * Returns an ordered range of all the smearvariable events where variableID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param variableID the variable i d
    * @param start the lower bound of the range of smearvariable events
    * @param end the upper bound of the range of smearvariable events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findByVariable(
        long variableID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByVariable(variableID, start, end, orderByComparator);
    }

    /**
    * Returns the first smearvariable event in the ordered set where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching smearvariable event
    * @throws fi.csc.smear.db.NoSuchvariableEventException if a matching smearvariable event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent findByVariable_First(
        long variableID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableEventException {
        return getPersistence()
                   .findByVariable_First(variableID, orderByComparator);
    }

    /**
    * Returns the first smearvariable event in the ordered set where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching smearvariable event, or <code>null</code> if a matching smearvariable event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent fetchByVariable_First(
        long variableID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByVariable_First(variableID, orderByComparator);
    }

    /**
    * Returns the last smearvariable event in the ordered set where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching smearvariable event
    * @throws fi.csc.smear.db.NoSuchvariableEventException if a matching smearvariable event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent findByVariable_Last(
        long variableID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableEventException {
        return getPersistence()
                   .findByVariable_Last(variableID, orderByComparator);
    }

    /**
    * Returns the last smearvariable event in the ordered set where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching smearvariable event, or <code>null</code> if a matching smearvariable event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent fetchByVariable_Last(
        long variableID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByVariable_Last(variableID, orderByComparator);
    }

    /**
    * Returns the smearvariable events before and after the current smearvariable event in the ordered set where variableID = &#63;.
    *
    * @param smearvariableEventPK the primary key of the current smearvariable event
    * @param variableID the variable i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next smearvariable event
    * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent[] findByVariable_PrevAndNext(
        SmearvariableEventPK smearvariableEventPK, long variableID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableEventException {
        return getPersistence()
                   .findByVariable_PrevAndNext(smearvariableEventPK,
            variableID, orderByComparator);
    }

    /**
    * Removes all the smearvariable events where variableID = &#63; from the database.
    *
    * @param variableID the variable i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByVariable(long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByVariable(variableID);
    }

    /**
    * Returns the number of smearvariable events where variableID = &#63;.
    *
    * @param variableID the variable i d
    * @return the number of matching smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static int countByVariable(long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByVariable(variableID);
    }

    /**
    * Caches the smearvariable event in the entity cache if it is enabled.
    *
    * @param smearvariableEvent the smearvariable event
    */
    public static void cacheResult(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent) {
        getPersistence().cacheResult(smearvariableEvent);
    }

    /**
    * Caches the smearvariable events in the entity cache if it is enabled.
    *
    * @param smearvariableEvents the smearvariable events
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearvariableEvent> smearvariableEvents) {
        getPersistence().cacheResult(smearvariableEvents);
    }

    /**
    * Creates a new smearvariable event with the primary key. Does not add the smearvariable event to the database.
    *
    * @param smearvariableEventPK the primary key for the new smearvariable event
    * @return the new smearvariable event
    */
    public static fi.csc.smear.db.model.SmearvariableEvent create(
        SmearvariableEventPK smearvariableEventPK) {
        return getPersistence().create(smearvariableEventPK);
    }

    /**
    * Removes the smearvariable event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param smearvariableEventPK the primary key of the smearvariable event
    * @return the smearvariable event that was removed
    * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent remove(
        SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableEventException {
        return getPersistence().remove(smearvariableEventPK);
    }

    public static fi.csc.smear.db.model.SmearvariableEvent updateImpl(
        fi.csc.smear.db.model.SmearvariableEvent smearvariableEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearvariableEvent);
    }

    /**
    * Returns the smearvariable event with the primary key or throws a {@link fi.csc.smear.db.NoSuchvariableEventException} if it could not be found.
    *
    * @param smearvariableEventPK the primary key of the smearvariable event
    * @return the smearvariable event
    * @throws fi.csc.smear.db.NoSuchvariableEventException if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent findByPrimaryKey(
        SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableEventException {
        return getPersistence().findByPrimaryKey(smearvariableEventPK);
    }

    /**
    * Returns the smearvariable event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param smearvariableEventPK the primary key of the smearvariable event
    * @return the smearvariable event, or <code>null</code> if a smearvariable event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableEvent fetchByPrimaryKey(
        SmearvariableEventPK smearvariableEventPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(smearvariableEventPK);
    }

    /**
    * Returns all the smearvariable events.
    *
    * @return the smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the smearvariable events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable events
    * @param end the upper bound of the range of smearvariable events (not inclusive)
    * @return the range of smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the smearvariable events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable events
    * @param end the upper bound of the range of smearvariable events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableEvent> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smearvariable events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smearvariable events.
    *
    * @return the number of smearvariable events
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearvariableEventPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearvariableEventPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearvariableEventPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearvariableEventUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearvariableEventPersistence persistence) {
    }
}
