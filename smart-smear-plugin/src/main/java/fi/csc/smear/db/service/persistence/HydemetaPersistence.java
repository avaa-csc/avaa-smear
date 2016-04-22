package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Hydemeta;

/**
 * The persistence interface for the hydemeta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see HydemetaPersistenceImpl
 * @see HydemetaUtil
 * @generated
 */
public interface HydemetaPersistence extends BasePersistence<Hydemeta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HydemetaUtil} to access the hydemeta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the hydemeta in the entity cache if it is enabled.
    *
    * @param hydemeta the hydemeta
    */
    public void cacheResult(fi.csc.smear.db.model.Hydemeta hydemeta);

    /**
    * Caches the hydemetas in the entity cache if it is enabled.
    *
    * @param hydemetas the hydemetas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Hydemeta> hydemetas);

    /**
    * Creates a new hydemeta with the primary key. Does not add the hydemeta to the database.
    *
    * @param samptime the primary key for the new hydemeta
    * @return the new hydemeta
    */
    public fi.csc.smear.db.model.Hydemeta create(java.util.Date samptime);

    /**
    * Removes the hydemeta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hydemeta
    * @return the hydemeta that was removed
    * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hydemeta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHydemetaException;

    public fi.csc.smear.db.model.Hydemeta updateImpl(
        fi.csc.smear.db.model.Hydemeta hydemeta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hydemeta with the primary key or throws a {@link fi.csc.smear.db.NoSuchHydemetaException} if it could not be found.
    *
    * @param samptime the primary key of the hydemeta
    * @return the hydemeta
    * @throws fi.csc.smear.db.NoSuchHydemetaException if a hydemeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hydemeta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHydemetaException;

    /**
    * Returns the hydemeta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hydemeta
    * @return the hydemeta, or <code>null</code> if a hydemeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Hydemeta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hydemetas.
    *
    * @return the hydemetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hydemeta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the hydemetas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hydemetas
    * @param end the upper bound of the range of hydemetas (not inclusive)
    * @return the range of hydemetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hydemeta> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the hydemetas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HydemetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hydemetas
    * @param end the upper bound of the range of hydemetas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hydemetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Hydemeta> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hydemetas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hydemetas.
    *
    * @return the number of hydemetas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
