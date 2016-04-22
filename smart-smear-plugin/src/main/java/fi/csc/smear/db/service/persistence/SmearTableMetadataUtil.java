package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearTableMetadata;

import java.util.List;

/**
 * The persistence utility for the smear table metadata service. This utility wraps {@link SmearTableMetadataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTableMetadataPersistence
 * @see SmearTableMetadataPersistenceImpl
 * @generated
 */
public class SmearTableMetadataUtil {
    private static SmearTableMetadataPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(SmearTableMetadata smearTableMetadata) {
        getPersistence().clearCache(smearTableMetadata);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<SmearTableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearTableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearTableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearTableMetadata update(
        SmearTableMetadata smearTableMetadata) throws SystemException {
        return getPersistence().update(smearTableMetadata);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearTableMetadata update(
        SmearTableMetadata smearTableMetadata, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(smearTableMetadata, serviceContext);
    }

    /**
    * Caches the smear table metadata in the entity cache if it is enabled.
    *
    * @param smearTableMetadata the smear table metadata
    */
    public static void cacheResult(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata) {
        getPersistence().cacheResult(smearTableMetadata);
    }

    /**
    * Caches the smear table metadatas in the entity cache if it is enabled.
    *
    * @param smearTableMetadatas the smear table metadatas
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearTableMetadata> smearTableMetadatas) {
        getPersistence().cacheResult(smearTableMetadatas);
    }

    /**
    * Creates a new smear table metadata with the primary key. Does not add the smear table metadata to the database.
    *
    * @param tableID the primary key for the new smear table metadata
    * @return the new smear table metadata
    */
    public static fi.csc.smear.db.model.SmearTableMetadata create(long tableID) {
        return getPersistence().create(tableID);
    }

    /**
    * Removes the smear table metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata that was removed
    * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTableMetadata remove(long tableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTableMetadataException {
        return getPersistence().remove(tableID);
    }

    public static fi.csc.smear.db.model.SmearTableMetadata updateImpl(
        fi.csc.smear.db.model.SmearTableMetadata smearTableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearTableMetadata);
    }

    /**
    * Returns the smear table metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchTableMetadataException} if it could not be found.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata
    * @throws fi.csc.smear.db.NoSuchTableMetadataException if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTableMetadata findByPrimaryKey(
        long tableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTableMetadataException {
        return getPersistence().findByPrimaryKey(tableID);
    }

    /**
    * Returns the smear table metadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tableID the primary key of the smear table metadata
    * @return the smear table metadata, or <code>null</code> if a smear table metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTableMetadata fetchByPrimaryKey(
        long tableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(tableID);
    }

    /**
    * Returns all the smear table metadatas.
    *
    * @return the smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearTableMetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smear table metadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smear table metadatas.
    *
    * @return the number of smear table metadatas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearTableMetadataPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearTableMetadataPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearTableMetadataPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearTableMetadataUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearTableMetadataPersistence persistence) {
    }
}
