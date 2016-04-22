package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.HyyAero;

/**
 * The persistence interface for the hyy aero service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HyyAeroPersistenceImpl
 * @see HyyAeroUtil
 * @generated
 */
public interface HyyAeroPersistence extends BasePersistence<HyyAero> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HyyAeroUtil} to access the hyy aero persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the hyy aero in the entity cache if it is enabled.
    *
    * @param hyyAero the hyy aero
    */
    public void cacheResult(fi.csc.smear.db.model.HyyAero hyyAero);

    /**
    * Caches the hyy aeros in the entity cache if it is enabled.
    *
    * @param hyyAeros the hyy aeros
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.HyyAero> hyyAeros);

    /**
    * Creates a new hyy aero with the primary key. Does not add the hyy aero to the database.
    *
    * @param samptime the primary key for the new hyy aero
    * @return the new hyy aero
    */
    public fi.csc.smear.db.model.HyyAero create(java.util.Date samptime);

    /**
    * Removes the hyy aero with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero that was removed
    * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyAero remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyAeroException;

    public fi.csc.smear.db.model.HyyAero updateImpl(
        fi.csc.smear.db.model.HyyAero hyyAero)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hyy aero with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyyAeroException} if it could not be found.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero
    * @throws fi.csc.smear.db.NoSuchHyyAeroException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyAero findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyAeroException;

    /**
    * Returns the hyy aero with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero, or <code>null</code> if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyAero fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hyy aeros.
    *
    * @return the hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.HyyAero> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.HyyAero> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.HyyAero> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hyy aeros from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hyy aeros.
    *
    * @return the number of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
