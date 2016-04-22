package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.SmearVariableMetadata;

/**
 * The persistence interface for the smear variable metadata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearVariableMetadataPersistenceImpl
 * @see SmearVariableMetadataUtil
 * @generated
 */
public interface SmearVariableMetadataPersistence extends BasePersistence<SmearVariableMetadata> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SmearVariableMetadataUtil} to access the smear variable metadata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the smear variable metadata in the entity cache if it is enabled.
    *
    * @param smearVariableMetadata the smear variable metadata
    */
    public void cacheResult(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata);

    /**
    * Caches the smear variable metadatas in the entity cache if it is enabled.
    *
    * @param smearVariableMetadatas the smear variable metadatas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> smearVariableMetadatas);

    /**
    * Creates a new smear variable metadata with the primary key. Does not add the smear variable metadata to the database.
    *
    * @param variableID the primary key for the new smear variable metadata
    * @return the new smear variable metadata
    */
    public fi.csc.smear.db.model.SmearVariableMetadata create(long variableID);

    /**
    * Removes the smear variable metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata that was removed
    * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearVariableMetadata remove(long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVariableMetadataException;

    public fi.csc.smear.db.model.SmearVariableMetadata updateImpl(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the smear variable metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchVariableMetadataException} if it could not be found.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata
    * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearVariableMetadata findByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVariableMetadataException;

    /**
    * Returns the smear variable metadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata, or <code>null</code> if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.SmearVariableMetadata fetchByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the smear variable metadatas.
    *
    * @return the smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the smear variable metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear variable metadatas
    * @param end the upper bound of the range of smear variable metadatas (not inclusive)
    * @return the range of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the smear variable metadatas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearVariableMetadataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smear variable metadatas
    * @param end the upper bound of the range of smear variable metadatas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the smear variable metadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of smear variable metadatas.
    *
    * @return the number of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
