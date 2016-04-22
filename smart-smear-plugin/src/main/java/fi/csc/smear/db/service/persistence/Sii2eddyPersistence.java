package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Sii2eddy;

/**
 * The persistence interface for the sii2eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii2eddyPersistenceImpl
 * @see Sii2eddyUtil
 * @generated
 */
public interface Sii2eddyPersistence extends BasePersistence<Sii2eddy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Sii2eddyUtil} to access the sii2eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the sii2eddy in the entity cache if it is enabled.
    *
    * @param sii2eddy the sii2eddy
    */
    public void cacheResult(fi.csc.smear.db.model.Sii2eddy sii2eddy);

    /**
    * Caches the sii2eddies in the entity cache if it is enabled.
    *
    * @param sii2eddies the sii2eddies
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Sii2eddy> sii2eddies);

    /**
    * Creates a new sii2eddy with the primary key. Does not add the sii2eddy to the database.
    *
    * @param samptime the primary key for the new sii2eddy
    * @return the new sii2eddy
    */
    public fi.csc.smear.db.model.Sii2eddy create(java.util.Date samptime);

    /**
    * Removes the sii2eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii2eddy
    * @return the sii2eddy that was removed
    * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii2eddy remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii2eddyException;

    public fi.csc.smear.db.model.Sii2eddy updateImpl(
        fi.csc.smear.db.model.Sii2eddy sii2eddy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sii2eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii2eddyException} if it could not be found.
    *
    * @param samptime the primary key of the sii2eddy
    * @return the sii2eddy
    * @throws fi.csc.smear.db.NoSuchSii2eddyException if a sii2eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii2eddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii2eddyException;

    /**
    * Returns the sii2eddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the sii2eddy
    * @return the sii2eddy, or <code>null</code> if a sii2eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii2eddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sii2eddies.
    *
    * @return the sii2eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii2eddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sii2eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii2eddies
    * @param end the upper bound of the range of sii2eddies (not inclusive)
    * @return the range of sii2eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii2eddy> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sii2eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii2eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii2eddies
    * @param end the upper bound of the range of sii2eddies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of sii2eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii2eddy> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the sii2eddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sii2eddies.
    *
    * @return the number of sii2eddies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
