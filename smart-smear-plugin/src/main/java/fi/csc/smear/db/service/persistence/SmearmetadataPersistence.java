package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Smearmetadata;

/**
 * The persistence interface for the smearmetadata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearmetadataPersistenceImpl
 * @see SmearmetadataUtil
 * @generated
 */
public interface SmearmetadataPersistence extends BasePersistence<Smearmetadata> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearmetadataUtil} to access the smearmetadata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smearmetadata in the entity cache if it is enabled.
    *
    * @param smearmetadata the smearmetadata
    */
    public void cacheResult(fi.csc.smear.db.model.Smearmetadata smearmetadata);

    /**
    * Caches the smearmetadatas in the entity cache if it is enabled.
    *
    * @param smearmetadatas the smearmetadatas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Smearmetadata> smearmetadatas);

    /**
    * Creates a new smearmetadata with the primary key. Does not add the smearmetadata to the database.
    *
    * @param title the primary key for the new smearmetadata
    * @return the new smearmetadata
    */
    public fi.csc.smear.db.model.Smearmetadata create(java.lang.String title);

    /**
    * Removes the smearmetadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata that was removed
    * @throws fi.csc.smear.db.NoSuchmetadataException if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearmetadata remove(java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchmetadataException;

    public fi.csc.smear.db.model.Smearmetadata updateImpl(
        fi.csc.smear.db.model.Smearmetadata smearmetadata)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smearmetadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchmetadataException} if it could not be found.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata
    * @throws fi.csc.smear.db.NoSuchmetadataException if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearmetadata findByPrimaryKey(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchmetadataException;

    /**
    * Returns the smearmetadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata, or <code>null</code> if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Smearmetadata fetchByPrimaryKey(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smearmetadatas.
    *
    * @return the smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smearmetadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearmetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearmetadatas
    * @param end the upper bound of the range of smearmetadatas (not inclusive)
    * @return the range of smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smearmetadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearmetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearmetadatas
    * @param end the upper bound of the range of smearmetadatas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smearmetadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smearmetadatas.
    *
    * @return the number of smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
