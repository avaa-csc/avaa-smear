package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.kvjMeta;

/**
 * The persistence interface for the kvj meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see kvjMetaPersistenceImpl
 * @see kvjMetaUtil
 * @generated
 */
public interface kvjMetaPersistence extends BasePersistence<kvjMeta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link kvjMetaUtil} to access the kvj meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the kvj meta in the entity cache if it is enabled.
    *
    * @param kvjMeta the kvj meta
    */
    public void cacheResult(fi.csc.smear.db.model.kvjMeta kvjMeta);

    /**
    * Caches the kvj metas in the entity cache if it is enabled.
    *
    * @param kvjMetas the kvj metas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.kvjMeta> kvjMetas);

    /**
    * Creates a new kvj meta with the primary key. Does not add the kvj meta to the database.
    *
    * @param samptime the primary key for the new kvj meta
    * @return the new kvj meta
    */
    public fi.csc.smear.db.model.kvjMeta create(java.util.Date samptime);

    /**
    * Removes the kvj meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta that was removed
    * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjMeta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjMetaException;

    public fi.csc.smear.db.model.kvjMeta updateImpl(
        fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the kvj meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchkvjMetaException} if it could not be found.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta
    * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjMeta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjMetaException;

    /**
    * Returns the kvj meta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta, or <code>null</code> if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.kvjMeta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the kvj metas.
    *
    * @return the kvj metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjMeta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the kvj metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj metas
    * @param end the upper bound of the range of kvj metas (not inclusive)
    * @return the range of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjMeta> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the kvj metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj metas
    * @param end the upper bound of the range of kvj metas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.kvjMeta> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the kvj metas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of kvj metas.
    *
    * @return the number of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
