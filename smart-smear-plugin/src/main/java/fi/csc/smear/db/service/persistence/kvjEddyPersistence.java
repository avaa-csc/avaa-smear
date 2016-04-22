package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.kvjEddy;

/**
 * The persistence interface for the kvj eddy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see kvjEddyPersistenceImpl
 * @see kvjEddyUtil
 * @generated
 */
public interface kvjEddyPersistence extends BasePersistence<kvjEddy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link kvjEddyUtil} to access the kvj eddy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the kvj eddy in the entity cache if it is enabled.
    *
    * @param kvjEddy the kvj eddy
    */
    public void cacheResult(fi.csc.smear.db.model.kvjEddy kvjEddy);

    /**
    * Caches the kvj eddies in the entity cache if it is enabled.
    *
    * @param kvjEddies the kvj eddies
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.kvjEddy> kvjEddies);

    /**
    * Creates a new kvj eddy with the primary key. Does not add the kvj eddy to the database.
    *
    * @param samptime the primary key for the new kvj eddy
    * @return the new kvj eddy
    */
    public fi.csc.smear.db.model.kvjEddy create(java.util.Date samptime);

    /**
    * Removes the kvj eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kvj eddy
    * @return the kvj eddy that was removed
    * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjEddy remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjEddyException;

    public fi.csc.smear.db.model.kvjEddy updateImpl(
        fi.csc.smear.db.model.kvjEddy kvjEddy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the kvj eddy with the primary key or throws a {@link fi.csc.smear.db.NoSuchkvjEddyException} if it could not be found.
    *
    * @param samptime the primary key of the kvj eddy
    * @return the kvj eddy
    * @throws fi.csc.smear.db.NoSuchkvjEddyException if a kvj eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjEddy findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjEddyException;

    /**
    * Returns the kvj eddy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kvj eddy
    * @return the kvj eddy, or <code>null</code> if a kvj eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjEddy fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the kvj eddies.
    *
    * @return the kvj eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjEddy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the kvj eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj eddies
    * @param end the upper bound of the range of kvj eddies (not inclusive)
    * @return the range of kvj eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjEddy> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the kvj eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjEddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj eddies
    * @param end the upper bound of the range of kvj eddies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kvj eddies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjEddy> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the kvj eddies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of kvj eddies.
    *
    * @return the number of kvj eddies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
