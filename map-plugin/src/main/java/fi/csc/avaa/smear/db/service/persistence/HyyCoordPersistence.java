package fi.csc.avaa.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.smear.db.model.HyyCoord;

/**
 * The persistence interface for the hyy coord service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tkantola
 * @see HyyCoordPersistenceImpl
 * @see HyyCoordUtil
 * @generated
 */
public interface HyyCoordPersistence extends BasePersistence<HyyCoord> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HyyCoordUtil} to access the hyy coord persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the hyy coord in the entity cache if it is enabled.
    *
    * @param hyyCoord the hyy coord
    */
    public void cacheResult(fi.csc.avaa.smear.db.model.HyyCoord hyyCoord);

    /**
    * Caches the hyy coords in the entity cache if it is enabled.
    *
    * @param hyyCoords the hyy coords
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> hyyCoords);

    /**
    * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
    *
    * @param arrTimeID the primary key for the new hyy coord
    * @return the new hyy coord
    */
    public fi.csc.avaa.smear.db.model.HyyCoord create(long arrTimeID);

    /**
    * Removes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord that was removed
    * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.smear.db.model.HyyCoord remove(long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.smear.db.NoSuchHyyCoordException;

    public fi.csc.avaa.smear.db.model.HyyCoord updateImpl(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hyy coord with the primary key or throws a {@link fi.csc.avaa.smear.db.NoSuchHyyCoordException} if it could not be found.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord
    * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.smear.db.model.HyyCoord findByPrimaryKey(long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.smear.db.NoSuchHyyCoordException;

    /**
    * Returns the hyy coord with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord, or <code>null</code> if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.smear.db.model.HyyCoord fetchByPrimaryKey(long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hyy coords.
    *
    * @return the hyy coords
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @return the range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hyy coords from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hyy coords.
    *
    * @return the number of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
