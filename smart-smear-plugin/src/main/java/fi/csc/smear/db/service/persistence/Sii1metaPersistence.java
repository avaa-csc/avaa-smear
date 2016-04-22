package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Sii1meta;

/**
 * The persistence interface for the sii1meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Sii1metaPersistenceImpl
 * @see Sii1metaUtil
 * @generated
 */
public interface Sii1metaPersistence extends BasePersistence<Sii1meta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Sii1metaUtil} to access the sii1meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the sii1meta in the entity cache if it is enabled.
    *
    * @param sii1meta the sii1meta
    */
    public void cacheResult(fi.csc.smear.db.model.Sii1meta sii1meta);

    /**
    * Caches the sii1metas in the entity cache if it is enabled.
    *
    * @param sii1metas the sii1metas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Sii1meta> sii1metas);

    /**
    * Creates a new sii1meta with the primary key. Does not add the sii1meta to the database.
    *
    * @param samptime the primary key for the new sii1meta
    * @return the new sii1meta
    */
    public fi.csc.smear.db.model.Sii1meta create(java.util.Date samptime);

    /**
    * Removes the sii1meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta that was removed
    * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii1meta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii1metaException;

    public fi.csc.smear.db.model.Sii1meta updateImpl(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sii1meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchSii1metaException} if it could not be found.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta
    * @throws fi.csc.smear.db.NoSuchSii1metaException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii1meta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchSii1metaException;

    /**
    * Returns the sii1meta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta, or <code>null</code> if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Sii1meta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sii1metas.
    *
    * @return the sii1metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii1meta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sii1metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1metas
    * @param end the upper bound of the range of sii1metas (not inclusive)
    * @return the range of sii1metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii1meta> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sii1metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1metas
    * @param end the upper bound of the range of sii1metas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of sii1metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Sii1meta> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the sii1metas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sii1metas.
    *
    * @return the number of sii1metas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
