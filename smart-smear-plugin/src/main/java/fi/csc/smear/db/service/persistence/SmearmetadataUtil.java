package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Smearmetadata;

import java.util.List;

/**
 * The persistence utility for the smearmetadata service. This utility wraps {@link SmearmetadataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearmetadataPersistence
 * @see SmearmetadataPersistenceImpl
 * @generated
 */
public class SmearmetadataUtil {
    private static SmearmetadataPersistence _persistence;

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
    public static void clearCache(Smearmetadata smearmetadata) {
        getPersistence().clearCache(smearmetadata);
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
    public static List<Smearmetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Smearmetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Smearmetadata> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Smearmetadata update(Smearmetadata smearmetadata)
        throws SystemException {
        return getPersistence().update(smearmetadata);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Smearmetadata update(Smearmetadata smearmetadata,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(smearmetadata, serviceContext);
    }

    /**
    * Caches the smearmetadata in the entity cache if it is enabled.
    *
    * @param smearmetadata the smearmetadata
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Smearmetadata smearmetadata) {
        getPersistence().cacheResult(smearmetadata);
    }

    /**
    * Caches the smearmetadatas in the entity cache if it is enabled.
    *
    * @param smearmetadatas the smearmetadatas
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Smearmetadata> smearmetadatas) {
        getPersistence().cacheResult(smearmetadatas);
    }

    /**
    * Creates a new smearmetadata with the primary key. Does not add the smearmetadata to the database.
    *
    * @param title the primary key for the new smearmetadata
    * @return the new smearmetadata
    */
    public static fi.csc.smear.db.model.Smearmetadata create(
        java.lang.String title) {
        return getPersistence().create(title);
    }

    /**
    * Removes the smearmetadata with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata that was removed
    * @throws fi.csc.smear.db.NoSuchmetadataException if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearmetadata remove(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchmetadataException {
        return getPersistence().remove(title);
    }

    public static fi.csc.smear.db.model.Smearmetadata updateImpl(
        fi.csc.smear.db.model.Smearmetadata smearmetadata)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearmetadata);
    }

    /**
    * Returns the smearmetadata with the primary key or throws a {@link fi.csc.smear.db.NoSuchmetadataException} if it could not be found.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata
    * @throws fi.csc.smear.db.NoSuchmetadataException if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearmetadata findByPrimaryKey(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchmetadataException {
        return getPersistence().findByPrimaryKey(title);
    }

    /**
    * Returns the smearmetadata with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param title the primary key of the smearmetadata
    * @return the smearmetadata, or <code>null</code> if a smearmetadata with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearmetadata fetchByPrimaryKey(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(title);
    }

    /**
    * Returns all the smearmetadatas.
    *
    * @return the smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<fi.csc.smear.db.model.Smearmetadata> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smearmetadatas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smearmetadatas.
    *
    * @return the number of smearmetadatas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearmetadataPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearmetadataPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearmetadataPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearmetadataUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearmetadataPersistence persistence) {
    }
}
