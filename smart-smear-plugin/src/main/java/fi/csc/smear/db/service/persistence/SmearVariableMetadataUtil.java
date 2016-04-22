package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearVariableMetadata;

import java.util.List;

/**
 * The persistence utility for the smear variable metadata service. This utility wraps {@link SmearVariableMetadataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearVariableMetadataPersistence
 * @see SmearVariableMetadataPersistenceImpl
 * @generated
 */
public class SmearVariableMetadataUtil {
    private static SmearVariableMetadataPersistence _persistence;

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
    public static void clearCache(SmearVariableMetadata smearVariableMetadata) {
        getPersistence().clearCache(smearVariableMetadata);
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
    public static List<SmearVariableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearVariableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearVariableMetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearVariableMetadata update(
        SmearVariableMetadata smearVariableMetadata) throws SystemException {
        return getPersistence().update(smearVariableMetadata);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearVariableMetadata update(
        SmearVariableMetadata smearVariableMetadata,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(smearVariableMetadata, serviceContext);
    }

    /**
    * Caches the smear variable metadata in the entity cache if it is enabled.
    *
    * @param smearVariableMetadata the smear variable metadata
    */
    public static void cacheResult(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata) {
        getPersistence().cacheResult(smearVariableMetadata);
    }

    /**
    * Caches the smear variable metadatas in the entity cache if it is enabled.
    *
    * @param smearVariableMetadatas the smear variable metadatas
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> smearVariableMetadatas) {
        getPersistence().cacheResult(smearVariableMetadatas);
    }

    /**
    * Creates a new smear variable metadata with the primary key. Does not add the smear variable metadata to the database.
    *
    * @param variableID the primary key for the new smear variable metadata
    * @return the new smear variable metadata
    */
    public static fi.csc.smear.db.model.SmearVariableMetadata create(
        long variableID) {
        return getPersistence().create(variableID);
    }

    /**
    * Removes the smear variable metadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata that was removed
    * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearVariableMetadata remove(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVariableMetadataException {
        return getPersistence().remove(variableID);
    }

    public static fi.csc.smear.db.model.SmearVariableMetadata updateImpl(
        fi.csc.smear.db.model.SmearVariableMetadata smearVariableMetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearVariableMetadata);
    }

    /**
    * Returns the smear variable metadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchVariableMetadataException} if it could not be found.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata
    * @throws fi.csc.smear.db.NoSuchVariableMetadataException if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearVariableMetadata findByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchVariableMetadataException {
        return getPersistence().findByPrimaryKey(variableID);
    }

    /**
    * Returns the smear variable metadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param variableID the primary key of the smear variable metadata
    * @return the smear variable metadata, or <code>null</code> if a smear variable metadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearVariableMetadata fetchByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(variableID);
    }

    /**
    * Returns all the smear variable metadatas.
    *
    * @return the smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearVariableMetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smear variable metadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smear variable metadatas.
    *
    * @return the number of smear variable metadatas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearVariableMetadataPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearVariableMetadataPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearVariableMetadataPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearVariableMetadataUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearVariableMetadataPersistence persistence) {
    }
}
