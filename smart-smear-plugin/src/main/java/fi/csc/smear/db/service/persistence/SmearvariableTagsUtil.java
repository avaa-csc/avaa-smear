package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.SmearvariableTags;

import java.util.List;

/**
 * The persistence utility for the smearvariable tags service. This utility wraps {@link SmearvariableTagsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearvariableTagsPersistence
 * @see SmearvariableTagsPersistenceImpl
 * @generated
 */
public class SmearvariableTagsUtil {
    private static SmearvariableTagsPersistence _persistence;

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
    public static void clearCache(SmearvariableTags smearvariableTags) {
        getPersistence().clearCache(smearvariableTags);
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
    public static List<SmearvariableTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SmearvariableTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SmearvariableTags> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SmearvariableTags update(SmearvariableTags smearvariableTags)
        throws SystemException {
        return getPersistence().update(smearvariableTags);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SmearvariableTags update(
        SmearvariableTags smearvariableTags, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(smearvariableTags, serviceContext);
    }

    /**
    * Caches the smearvariable tags in the entity cache if it is enabled.
    *
    * @param smearvariableTags the smearvariable tags
    */
    public static void cacheResult(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags) {
        getPersistence().cacheResult(smearvariableTags);
    }

    /**
    * Caches the smearvariable tagses in the entity cache if it is enabled.
    *
    * @param smearvariableTagses the smearvariable tagses
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.SmearvariableTags> smearvariableTagses) {
        getPersistence().cacheResult(smearvariableTagses);
    }

    /**
    * Creates a new smearvariable tags with the primary key. Does not add the smearvariable tags to the database.
    *
    * @param variableID the primary key for the new smearvariable tags
    * @return the new smearvariable tags
    */
    public static fi.csc.smear.db.model.SmearvariableTags create(
        long variableID) {
        return getPersistence().create(variableID);
    }

    /**
    * Removes the smearvariable tags with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags that was removed
    * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableTags remove(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableTagsException {
        return getPersistence().remove(variableID);
    }

    public static fi.csc.smear.db.model.SmearvariableTags updateImpl(
        fi.csc.smear.db.model.SmearvariableTags smearvariableTags)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearvariableTags);
    }

    /**
    * Returns the smearvariable tags with the primary key or throws a {@link fi.csc.smear.db.NoSuchvariableTagsException} if it could not be found.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags
    * @throws fi.csc.smear.db.NoSuchvariableTagsException if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableTags findByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchvariableTagsException {
        return getPersistence().findByPrimaryKey(variableID);
    }

    /**
    * Returns the smearvariable tags with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param variableID the primary key of the smearvariable tags
    * @return the smearvariable tags, or <code>null</code> if a smearvariable tags with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.SmearvariableTags fetchByPrimaryKey(
        long variableID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(variableID);
    }

    /**
    * Returns all the smearvariable tagses.
    *
    * @return the smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<fi.csc.smear.db.model.SmearvariableTags> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smearvariable tagses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smearvariable tagses.
    *
    * @return the number of smearvariable tagses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearvariableTagsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearvariableTagsPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearvariableTagsPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearvariableTagsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearvariableTagsPersistence persistence) {
    }
}
