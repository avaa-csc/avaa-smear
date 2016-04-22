package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.SmearTableMetadata;

/**
 * The persistence interface for the smear table metadata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTableMetadataPersistenceImpl
 * @see SmearTableMetadataUtil
 * @generated
 */
public interface SmearTableMetadataPersistence extends BasePersistence<SmearTableMetadata> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearTableMetadataUtil} to access the smear table metadata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smear table metadata in the entity cache if it is enabled.
    *
    * @param smearTableMetadata the smear table metadata
    */
    public void cacheResult(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata);

    /**
    * Caches the smear table metadatas in the entity cache if it is enabled.
    *
    * @param smearTableMetadatas the smear table metadatas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearTableMetadata> smearTableMetadatas);

    /**
    * Creates a new smear table metadata with the primary key. Does not add the smear table metadata to the database.
    *
    * @param tableID the primary key for the new smear table metadata
    * @return the new smear table metadata
    */
    public fi.csc.smear.db.model.SmearTableMetadata create(long tableID);

    /**
    * Removes the smear table metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata that was removed
    * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTableMetadata remove(long tableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTableMetadataException;

    public fi.csc.smear.db.model.SmearTableMetadata updateImpl(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smear table metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchTableMetadataException} if it could not be found.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata
    * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTableMetadata findByPrimaryKey(
        long tableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTableMetadataException;

    /**
    * Returns the smear table metadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata, or <code>null</code> if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearTableMetadata fetchByPrimaryKey(
        long tableID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smear table metadatas.
    *
    * @return the smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smear table metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear table metadatas
    * @param end the upper bound of the range of smear table metadatas (not inclusive)
    * @return the range of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smear table metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearTableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear table metadatas
    * @param end the upper bound of the range of smear table metadatas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smear table metadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smear table metadatas.
    *
    * @return the number of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
