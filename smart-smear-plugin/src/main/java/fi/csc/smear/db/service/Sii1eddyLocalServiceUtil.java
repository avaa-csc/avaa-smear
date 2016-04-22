package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Sii1eddy. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Sii1eddyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj
 * @see Sii1eddyLocalService
 * @see fi.csc.smear.db.service.base.Sii1eddyLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Sii1eddyLocalServiceImpl
 * @generated
 */
public class Sii1eddyLocalServiceUtil {
    private static Sii1eddyLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Sii1eddyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the sii1eddy to the database. Also notifies the appropriate model listeners.
    *
    * @param sii1eddy the sii1eddy
    * @return the sii1eddy that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy addSii1eddy(
        fi.csc.smear.db.model.Sii1eddy sii1eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSii1eddy(sii1eddy);
    }

    /**
    * Creates a new sii1eddy with the primary key. Does not add the sii1eddy to the database.
    *
    * @param samptime the primary key for the new sii1eddy
    * @return the new sii1eddy
    */
    public static fi.csc.smear.db.model.Sii1eddy createSii1eddy(
        java.util.Date samptime) {
        return getService().createSii1eddy(samptime);
    }

    /**
    * Deletes the sii1eddy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii1eddy
    * @return the sii1eddy that was removed
    * @throws PortalException if a sii1eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy deleteSii1eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSii1eddy(samptime);
    }

    /**
    * Deletes the sii1eddy from the database. Also notifies the appropriate model listeners.
    *
    * @param sii1eddy the sii1eddy
    * @return the sii1eddy that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy deleteSii1eddy(
        fi.csc.smear.db.model.Sii1eddy sii1eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSii1eddy(sii1eddy);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.smear.db.model.Sii1eddy fetchSii1eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSii1eddy(samptime);
    }

    /**
    * Returns the sii1eddy with the primary key.
    *
    * @param samptime the primary key of the sii1eddy
    * @return the sii1eddy
    * @throws PortalException if a sii1eddy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy getSii1eddy(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1eddy(samptime);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the sii1eddies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1eddyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1eddies
    * @param end the upper bound of the range of sii1eddies (not inclusive)
    * @return the range of sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Sii1eddy> getSii1eddies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1eddies(start, end);
    }

    /**
    * Returns the number of sii1eddies.
    *
    * @return the number of sii1eddies
    * @throws SystemException if a system exception occurred
    */
    public static int getSii1eddiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1eddiesCount();
    }

    /**
    * Updates the sii1eddy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sii1eddy the sii1eddy
    * @return the sii1eddy that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1eddy updateSii1eddy(
        fi.csc.smear.db.model.Sii1eddy sii1eddy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSii1eddy(sii1eddy);
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

    public static Sii1eddyLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Sii1eddyLocalService.class.getName());

            if (invokableLocalService instanceof Sii1eddyLocalService) {
                _service = (Sii1eddyLocalService) invokableLocalService;
            } else {
                _service = new Sii1eddyLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Sii1eddyLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Sii1eddyLocalService service) {
    }
}
