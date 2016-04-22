package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Smearstation;

/**
 * The persistence interface for the smearstation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearstationPersistenceImpl
 * @see SmearstationUtil
 * @generated
 */
public interface SmearstationPersistence extends BasePersistence<Smearstation> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearstationUtil} to access the smearstation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smearstation in the entity cache if it is enabled.
    *
    * @param smearstation the smearstation
    */
    public void cacheResult(fi.csc.smear.db.model.Smearstation smearstation);

    /**
    * Caches the smearstations in the entity cache if it is enabled.
    *
    * @param smearstations the smearstations
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Smearstation> smearstations);

    /**
    * Creates a new smearstation with the primary key. Does not add the smearstation to the database.
    *
    * @param stationID the primary key for the new smearstation
    * @return the new smearstation
    */
    public fi.csc.smear.db.model.Smearstation create(long stationID);

    /**
    * Removes the smearstation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation that was removed
    * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearstation remove(long stationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchstationException;

    public fi.csc.smear.db.model.Smearstation updateImpl(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smearstation with the primary key or throws a {@link fi.csc.smear.db.NoSuchstationException} if it could not be found.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation
    * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearstation findByPrimaryKey(long stationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchstationException;

    /**
    * Returns the smearstation with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation, or <code>null</code> if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearstation fetchByPrimaryKey(long stationID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smearstations.
    *
    * @return the smearstations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearstation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smearstations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearstations
    * @param end the upper bound of the range of smearstations (not inclusive)
    * @return the range of smearstations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearstation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smearstations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearstations
    * @param end the upper bound of the range of smearstations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smearstations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearstation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smearstations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smearstations.
    *
    * @return the number of smearstations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
