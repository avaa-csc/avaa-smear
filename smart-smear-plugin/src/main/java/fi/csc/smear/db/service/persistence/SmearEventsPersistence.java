package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.SmearEvents;

/**
 * The persistence interface for the smear events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearEventsPersistenceImpl
 * @see SmearEventsUtil
 * @generated
 */
public interface SmearEventsPersistence extends BasePersistence<SmearEvents> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearEventsUtil} to access the smear events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smear events in the entity cache if it is enabled.
    *
    * @param smearEvents the smear events
    */
    public void cacheResult(fi.csc.smear.db.model.SmearEvents smearEvents);

    /**
    * Caches the smear eventses in the entity cache if it is enabled.
    *
    * @param smearEventses the smear eventses
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearEvents> smearEventses);

    /**
    * Creates a new smear events with the primary key. Does not add the smear events to the database.
    *
    * @param eventID the primary key for the new smear events
    * @return the new smear events
    */
    public fi.csc.smear.db.model.SmearEvents create(long eventID);

    /**
    * Removes the smear events with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events that was removed
    * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearEvents remove(long eventID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchEventsException;

    public fi.csc.smear.db.model.SmearEvents updateImpl(
        fi.csc.smear.db.model.SmearEvents smearEvents)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smear events with the primary key or throws a {@link fi.csc.smear.db.NoSuchEventsException} if it could not be found.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events
    * @throws fi.csc.smear.db.NoSuchEventsException if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearEvents findByPrimaryKey(long eventID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchEventsException;

    /**
    * Returns the smear events with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param eventID the primary key of the smear events
    * @return the smear events, or <code>null</code> if a smear events with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearEvents fetchByPrimaryKey(long eventID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smear eventses.
    *
    * @return the smear eventses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearEvents> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.SmearEvents> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.SmearEvents> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smear eventses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smear eventses.
    *
    * @return the number of smear eventses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
