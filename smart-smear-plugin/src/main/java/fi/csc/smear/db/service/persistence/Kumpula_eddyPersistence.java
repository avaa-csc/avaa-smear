package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Kumpula_eddy;

/**
 * The persistence interface for the kumpula_eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Kumpula_eddyPersistenceImpl
 * @see Kumpula_eddyUtil
 * @generated
 */
public interface Kumpula_eddyPersistence extends BasePersistence<Kumpula_eddy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Kumpula_eddyUtil} to access the kumpula_eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the kumpula_eddy in the entity cache if it is enabled.
    *
    * @param kumpula_eddy the kumpula_eddy
    */
    public void cacheResult(fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy);

    /**
    * Caches the kumpula_eddies in the entity cache if it is enabled.
    *
    * @param kumpula_eddies the kumpula_eddies
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Kumpula_eddy> kumpula_eddies);

    /**
    * Creates a new kumpula_eddy with the primary key. Does not add the kumpula_eddy to the database.
    *
    * @param samptime the primary key for the new kumpula_eddy
    * @return the new kumpula_eddy
    */
    public fi.csc.smear.db.model.Kumpula_eddy create(java.util.Date samptime);

    /**
    * Removes the kumpula_eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy that was removed
    * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpula_eddy remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpula_eddyException;

    public fi.csc.smear.db.model.Kumpula_eddy updateImpl(
        fi.csc.smear.db.model.Kumpula_eddy kumpula_eddy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the kumpula_eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpula_eddyException} if it could not be found.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy
    * @throws fi.csc.smear.db.NoSuchKumpula_eddyException if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpula_eddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpula_eddyException;

    /**
    * Returns the kumpula_eddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kumpula_eddy
    * @return the kumpula_eddy, or <code>null</code> if a kumpula_eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpula_eddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the kumpula_eddies.
    *
    * @return the kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.smear.db.model.Kumpula_eddy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the kumpula_eddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of kumpula_eddies.
    *
    * @return the number of kumpula_eddies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
