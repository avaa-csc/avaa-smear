package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Kumpulameta;

/**
 * The persistence interface for the kumpulameta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see KumpulametaPersistenceImpl
 * @see KumpulametaUtil
 * @generated
 */
public interface KumpulametaPersistence extends BasePersistence<Kumpulameta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link KumpulametaUtil} to access the kumpulameta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the kumpulameta in the entity cache if it is enabled.
    *
    * @param kumpulameta the kumpulameta
    */
    public void cacheResult(fi.csc.smear.db.model.Kumpulameta kumpulameta);

    /**
    * Caches the kumpulametas in the entity cache if it is enabled.
    *
    * @param kumpulametas the kumpulametas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Kumpulameta> kumpulametas);

    /**
    * Creates a new kumpulameta with the primary key. Does not add the kumpulameta to the database.
    *
    * @param samptime the primary key for the new kumpulameta
    * @return the new kumpulameta
    */
    public fi.csc.smear.db.model.Kumpulameta create(java.util.Date samptime);

    /**
    * Removes the kumpulameta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta that was removed
    * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpulameta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpulametaException;

    public fi.csc.smear.db.model.Kumpulameta updateImpl(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the kumpulameta with the primary key or throws a {@link fi.csc.smear.db.NoSuchKumpulametaException} if it could not be found.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta
    * @throws fi.csc.smear.db.NoSuchKumpulametaException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpulameta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchKumpulametaException;

    /**
    * Returns the kumpulameta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta, or <code>null</code> if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Kumpulameta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the kumpulametas.
    *
    * @return the kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Kumpulameta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the kumpulametas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpulametas
    * @param end the upper bound of the range of kumpulametas (not inclusive)
    * @return the range of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Kumpulameta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the kumpulametas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpulametas
    * @param end the upper bound of the range of kumpulametas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Kumpulameta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the kumpulametas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of kumpulametas.
    *
    * @return the number of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
