package fi.csc.avaa.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for HyyCoord. This utility wraps
 * {@link fi.csc.avaa.smear.db.service.impl.HyyCoordLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author tkantola
 * @see HyyCoordLocalService
 * @see fi.csc.avaa.smear.db.service.base.HyyCoordLocalServiceBaseImpl
 * @see fi.csc.avaa.smear.db.service.impl.HyyCoordLocalServiceImpl
 * @generated
 */
public class HyyCoordLocalServiceUtil {
    private static HyyCoordLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.smear.db.service.impl.HyyCoordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the hyy coord to the database. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord addHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addHyyCoord(hyyCoord);
    }

    /**
    * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
    *
    * @param arrTimeID the primary key for the new hyy coord
    * @return the new hyy coord
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord createHyyCoord(
        long arrTimeID) {
        return getService().createHyyCoord(arrTimeID);
    }

    /**
    * Deletes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord that was removed
    * @throws PortalException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord deleteHyyCoord(
        long arrTimeID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHyyCoord(arrTimeID);
    }

    /**
    * Deletes the hyy coord from the database. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord deleteHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHyyCoord(hyyCoord);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static fi.csc.avaa.smear.db.model.HyyCoord fetchHyyCoord(
        long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchHyyCoord(arrTimeID);
    }

    /**
    * Returns the hyy coord with the primary key.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord
    * @throws PortalException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord getHyyCoord(
        long arrTimeID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyyCoord(arrTimeID);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @return the range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> getHyyCoords(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyyCoords(start, end);
    }

    /**
    * Returns the number of hyy coords.
    *
    * @return the number of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static int getHyyCoordsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyyCoordsCount();
    }

    /**
    * Updates the hyy coord in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyyCoord the hyy coord
    * @return the hyy coord that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord updateHyyCoord(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateHyyCoord(hyyCoord);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static HyyCoordLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    HyyCoordLocalService.class.getName());

            if (invokableLocalService instanceof HyyCoordLocalService) {
                _service = (HyyCoordLocalService) invokableLocalService;
            } else {
                _service = new HyyCoordLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(HyyCoordLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(HyyCoordLocalService service) {
    }
}
