package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Hyde_eddytow;

/**
 * The persistence interface for the hyde_eddytow service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyde_eddytowPersistenceImpl
 * @see Hyde_eddytowUtil
 * @generated
 */
public interface Hyde_eddytowPersistence extends BasePersistence<Hyde_eddytow> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Hyde_eddytowUtil} to access the hyde_eddytow persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the hyde_eddytow in the entity cache if it is enabled.
    *
    * @param hyde_eddytow the hyde_eddytow
    */
    public void cacheResult(fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow);

    /**
    * Caches the hyde_eddytows in the entity cache if it is enabled.
    *
    * @param hyde_eddytows the hyde_eddytows
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Hyde_eddytow> hyde_eddytows);

    /**
    * Creates a new hyde_eddytow with the primary key. Does not add the hyde_eddytow to the database.
    *
    * @param samptime the primary key for the new hyde_eddytow
    * @return the new hyde_eddytow
    */
    public fi.csc.smear.db.model.Hyde_eddytow create(java.util.Date samptime);

    /**
    * Removes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hyde_eddytow remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddytowException;

    public fi.csc.smear.db.model.Hyde_eddytow updateImpl(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hyde_eddytow with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyde_eddytowException} if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow
    * @throws fi.csc.smear.db.NoSuchHyde_eddytowException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hyde_eddytow findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddytowException;

    /**
    * Returns the hyde_eddytow with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow, or <code>null</code> if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hyde_eddytow fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hyde_eddytows.
    *
    * @return the hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @return the range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hyde_eddytow> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hyde_eddytows from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hyde_eddytows.
    *
    * @return the number of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
