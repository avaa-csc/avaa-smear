package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearTags;

import java.util.List;

/**
 * The persistence utility for the smear tags service. This utility wraps {@link SmearTagsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearTagsPersistence
 * @see SmearTagsPersistenceImpl
 * @generated
 */
public class SmearTagsUtil {
    private static SmearTagsPersistence _persistence;

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
    public static void clearCache(SmearTags smearTags) {
        getPersistence().clearCache(smearTags);
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
    public static List<SmearTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearTags update(SmearTags smearTags)
        throws SystemException {
        return getPersistence().update(smearTags);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearTags update(SmearTags smearTags,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(smearTags, serviceContext);
    }

    /**
    * Caches the smear tags in the entity cache if it is enabled.
    *
    * @param smearTags the smear tags
    */
    public static void cacheResult(fi.csc.smear.db.model.SmearTags smearTags) {
        getPersistence().cacheResult(smearTags);
    }

    /**
    * Caches the smear tagses in the entity cache if it is enabled.
    *
    * @param smearTagses the smear tagses
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearTags> smearTagses) {
        getPersistence().cacheResult(smearTagses);
    }

    /**
    * Creates a new smear tags with the primary key. Does not add the smear tags to the database.
    *
    * @param tagID the primary key for the new smear tags
    * @return the new smear tags
    */
    public static fi.csc.smear.db.model.SmearTags create(long tagID) {
        return getPersistence().create(tagID);
    }

    /**
    * Removes the smear tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags that was removed
    * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTags remove(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTagsException {
        return getPersistence().remove(tagID);
    }

    public static fi.csc.smear.db.model.SmearTags updateImpl(
        fi.csc.smear.db.model.SmearTags smearTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearTags);
    }

    /**
    * Returns the smear tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchTagsException} if it could not be found.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags
    * @throws fi.csc.smear.db.NoSuchTagsException if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTags findByPrimaryKey(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTagsException {
        return getPersistence().findByPrimaryKey(tagID);
    }

    /**
    * Returns the smear tags with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param tagID the primary key of the smear tags
    * @return the smear tags, or <code>null</code> if a smear tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearTags fetchByPrimaryKey(long tagID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(tagID);
    }

    /**
    * Returns all the smear tagses.
    *
    * @return the smear tagses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearTags> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearTags> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearTags> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smear tagses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smear tagses.
    *
    * @return the number of smear tagses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearTagsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearTagsPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearTagsPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearTagsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearTagsPersistence persistence) {
    }
}
