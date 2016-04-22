package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.HyyDMPS;

/**
 * The persistence interface for the hyy d m p s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HyyDMPSPersistenceImpl
 * @see HyyDMPSUtil
 * @generated
 */
public interface HyyDMPSPersistence extends BasePersistence<HyyDMPS> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HyyDMPSUtil} to access the hyy d m p s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the hyy d m p s in the entity cache if it is enabled.
    *
    * @param hyyDMPS the hyy d m p s
    */
    public void cacheResult(fi.csc.smear.db.model.HyyDMPS hyyDMPS);

    /**
    * Caches the hyy d m p ses in the entity cache if it is enabled.
    *
    * @param hyyDMPSs the hyy d m p ses
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.HyyDMPS> hyyDMPSs);

    /**
    * Creates a new hyy d m p s with the primary key. Does not add the hyy d m p s to the database.
    *
    * @param samptime the primary key for the new hyy d m p s
    * @return the new hyy d m p s
    */
    public fi.csc.smear.db.model.HyyDMPS create(java.util.Date samptime);

    /**
    * Removes the hyy d m p s with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy d m p s
    * @return the hyy d m p s that was removed
    * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyDMPS remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyDMPSException;

    public fi.csc.smear.db.model.HyyDMPS updateImpl(
        fi.csc.smear.db.model.HyyDMPS hyyDMPS)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hyy d m p s with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyyDMPSException} if it could not be found.
    *
    * @param samptime the primary key of the hyy d m p s
    * @return the hyy d m p s
    * @throws fi.csc.smear.db.NoSuchHyyDMPSException if a hyy d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyDMPS findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyyDMPSException;

    /**
    * Returns the hyy d m p s with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyy d m p s
    * @return the hyy d m p s, or <code>null</code> if a hyy d m p s with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.HyyDMPS fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hyy d m p ses.
    *
    * @return the hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.HyyDMPS> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the hyy d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy d m p ses
    * @param end the upper bound of the range of hyy d m p ses (not inclusive)
    * @return the range of hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.HyyDMPS> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the hyy d m p ses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy d m p ses
    * @param end the upper bound of the range of hyy d m p ses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.HyyDMPS> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hyy d m p ses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hyy d m p ses.
    *
    * @return the number of hyy d m p ses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
