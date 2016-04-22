package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Hyde_eddytow. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Hyde_eddytowLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj
 * @see Hyde_eddytowLocalService
 * @see fi.csc.smear.db.service.base.Hyde_eddytowLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Hyde_eddytowLocalServiceImpl
 * @generated
 */
public class Hyde_eddytowLocalServiceUtil {
    private static Hyde_eddytowLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Hyde_eddytowLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the hyde_eddytow to the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow addHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addHyde_eddytow(hyde_eddytow);
    }

    /**
    * Creates a new hyde_eddytow with the primary key. Does not add the hyde_eddytow to the database.
    *
    * @param samptime the primary key for the new hyde_eddytow
    * @return the new hyde_eddytow
    */
    public static fi.csc.smear.db.model.Hyde_eddytow createHyde_eddytow(
        java.util.Date samptime) {
        return getService().createHyde_eddytow(samptime);
    }

    /**
    * Deletes the hyde_eddytow with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws PortalException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow deleteHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHyde_eddytow(samptime);
    }

    /**
    * Deletes the hyde_eddytow from the database. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow deleteHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHyde_eddytow(hyde_eddytow);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.smear.db.model.Hyde_eddytow fetchHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchHyde_eddytow(samptime);
    }

    /**
    * Returns the hyde_eddytow with the primary key.
    *
    * @param samptime the primary key of the hyde_eddytow
    * @return the hyde_eddytow
    * @throws PortalException if a hyde_eddytow with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow getHyde_eddytow(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyde_eddytow(samptime);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyde_eddytows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddytowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddytows
    * @param end the upper bound of the range of hyde_eddytows (not inclusive)
    * @return the range of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddytow> getHyde_eddytows(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyde_eddytows(start, end);
    }

    /**
    * Returns the number of hyde_eddytows.
    *
    * @return the number of hyde_eddytows
    * @throws SystemException if a system exception occurred
    */
    public static int getHyde_eddytowsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getHyde_eddytowsCount();
    }

    /**
    * Updates the hyde_eddytow in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyde_eddytow the hyde_eddytow
    * @return the hyde_eddytow that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddytow updateHyde_eddytow(
        fi.csc.smear.db.model.Hyde_eddytow hyde_eddytow)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateHyde_eddytow(hyde_eddytow);
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

    public static Hyde_eddytowLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Hyde_eddytowLocalService.class.getName());

            if (invokableLocalService instanceof Hyde_eddytowLocalService) {
                _service = (Hyde_eddytowLocalService) invokableLocalService;
            } else {
                _service = new Hyde_eddytowLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Hyde_eddytowLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Hyde_eddytowLocalService service) {
    }
}
