package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.SmearvariableTags;

/**
 * The persistence interface for the smearvariable tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearvariableTagsPersistenceImpl
 * @see SmearvariableTagsUtil
 * @generated
 */
public interface SmearvariableTagsPersistence extends BasePersistence<SmearvariableTags> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearvariableTagsUtil} to access the smearvariable tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smearvariable tags in the entity cache if it is enabled.
    *
    * @param smearvariableTags the smearvariable tags
    */
    public void cacheResult(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags);

    /**
    * Caches the smearvariable tagses in the entity cache if it is enabled.
    *
    * @param smearvariableTagses the smearvariable tagses
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearvariableTags> smearvariableTagses);

    /**
    * Creates a new smearvariable tags with the primary key. Does not add the smearvariable tags to the database.
    *
    * @param variableID the primary key for the new smearvariable tags
    * @return the new smearvariable tags
    */
    public fi.csc.smear.db.model.SmearvariableTags create(long variableID);

    /**
    * Removes the smearvariable tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags that was removed
    * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearvariableTags remove(long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableTagsException;

    public fi.csc.smear.db.model.SmearvariableTags updateImpl(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smearvariable tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchvariableTagsException} if it could not be found.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags
    * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearvariableTags findByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableTagsException;

    /**
    * Returns the smearvariable tags with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags, or <code>null</code> if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearvariableTags fetchByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smearvariable tagses.
    *
    * @return the smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smearvariable tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable tagses
    * @param end the upper bound of the range of smearvariable tagses (not inclusive)
    * @return the range of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smearvariable tagses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearvariableTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearvariable tagses
    * @param end the upper bound of the range of smearvariable tagses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smearvariable tagses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smearvariable tagses.
    *
    * @return the number of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
