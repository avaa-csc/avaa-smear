package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Smearstation;

import java.util.List;

/**
 * The persistence utility for the smearstation service. This utility wraps {@link SmearstationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see SmearstationPersistence
 * @see SmearstationPersistenceImpl
 * @generated
 */
public class SmearstationUtil {
    private static SmearstationPersistence _persistence;

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
    public static void clearCache(Smearstation smearstation) {
        getPersistence().clearCache(smearstation);
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
    public static List<Smearstation> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Smearstation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Smearstation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Smearstation update(Smearstation smearstation)
        throws SystemException {
        return getPersistence().update(smearstation);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Smearstation update(Smearstation smearstation,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(smearstation, serviceContext);
    }

    /**
    * Caches the smearstation in the entity cache if it is enabled.
    *
    * @param smearstation the smearstation
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Smearstation smearstation) {
        getPersistence().cacheResult(smearstation);
    }

    /**
    * Caches the smearstations in the entity cache if it is enabled.
    *
    * @param smearstations the smearstations
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Smearstation> smearstations) {
        getPersistence().cacheResult(smearstations);
    }

    /**
    * Creates a new smearstation with the primary key. Does not add the smearstation to the database.
    *
    * @param stationID the primary key for the new smearstation
    * @return the new smearstation
    */
    public static fi.csc.smear.db.model.Smearstation create(long stationID) {
        return getPersistence().create(stationID);
    }

    /**
    * Removes the smearstation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation that was removed
    * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearstation remove(long stationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchstationException {
        return getPersistence().remove(stationID);
    }

    public static fi.csc.smear.db.model.Smearstation updateImpl(
        fi.csc.smear.db.model.Smearstation smearstation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(smearstation);
    }

    /**
    * Returns the smearstation with the primary key or throws a {@link fi.csc.smear.db.NoSuchstationException} if it could not be found.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation
    * @throws fi.csc.smear.db.NoSuchstationException if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearstation findByPrimaryKey(
        long stationID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchstationException {
        return getPersistence().findByPrimaryKey(stationID);
    }

    /**
    * Returns the smearstation with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param stationID the primary key of the smearstation
    * @return the smearstation, or <code>null</code> if a smearstation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Smearstation fetchByPrimaryKey(
        long stationID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(stationID);
    }

    /**
    * Returns all the smearstations.
    *
    * @return the smearstations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Smearstation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the smearstations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearstations
    * @param end the upper bound of the range of smearstations (not inclusive)
    * @return the range of smearstations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Smearstation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the smearstations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.SmearstationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of smearstations
    * @param end the upper bound of the range of smearstations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of smearstations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Smearstation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the smearstations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of smearstations.
    *
    * @return the number of smearstations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SmearstationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SmearstationPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    SmearstationPersistence.class.getName());

            ReferenceRegistry.registerReference(SmearstationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SmearstationPersistence persistence) {
    }
}
