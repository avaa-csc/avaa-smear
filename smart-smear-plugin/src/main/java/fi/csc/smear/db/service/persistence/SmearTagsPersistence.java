package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.SmearTags;

/**
 * The persistence interface for the smear tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTagsPersistenceImpl
 * @see SmearTagsUtil
 * @generated
 */
public interface SmearTagsPersistence extends BasePersistence<SmearTags> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearTagsUtil} to access the smear tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smear tags in the entity cache if it is enabled.
    *
    * @param smearTags the smear tags
    */
    public void cacheResult(fi.csc.smear.db.model.SmearTags smearTags);

    /**
    * Caches the smear tagses in the entity cache if it is enabled.
    *
    * @param smearTagses the smear tagses
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearTags> smearTagses);

    /**
    * Creates a new smear tags with the primary key. Does not add the smear tags to the database.
    *
    * @param tagID the primary key for the new smear tags
    * @return the new smear tags
    */
    public fi.csc.smear.db.model.SmearTags create(long tagID);

    /**
    * Removes the smear tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags that was removed
    * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTags remove(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTagsException;

    public fi.csc.smear.db.model.SmearTags updateImpl(
        fi.csc.smear.db.model.SmearTags smearTags)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smear tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchTagsException} if it could not be found.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags
    * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTags findByPrimaryKey(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTagsException;

    /**
    * Returns the smear tags with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags, or <code>null</code> if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTags fetchByPrimaryKey(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smear tagses.
    *
    * @return the smear tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTags> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smear tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear tagses
    * @param end the upper bound of the range of smear tagses (not inclusive)
    * @return the range of smear tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTags> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smear tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear tagses
    * @param end the upper bound of the range of smear tagses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smear tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTags> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smear tagses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smear tagses.
    *
    * @return the number of smear tagses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
