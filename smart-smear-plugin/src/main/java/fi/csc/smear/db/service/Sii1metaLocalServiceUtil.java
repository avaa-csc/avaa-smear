package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Sii1meta. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Sii1metaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj
 * @see Sii1metaLocalService
 * @see fi.csc.smear.db.service.base.Sii1metaLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Sii1metaLocalServiceImpl
 * @generated
 */
public class Sii1metaLocalServiceUtil {
    private static Sii1metaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Sii1metaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the sii1meta to the database. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1meta addSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSii1meta(sii1meta);
    }

    /**
    * Creates a new sii1meta with the primary key. Does not add the sii1meta to the database.
    *
    * @param samptime the primary key for the new sii1meta
    * @return the new sii1meta
    */
    public static fi.csc.smear.db.model.Sii1meta createSii1meta(
        java.util.Date samptime) {
        return getService().createSii1meta(samptime);
    }

    /**
    * Deletes the sii1meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta that was removed
    * @throws PortalException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1meta deleteSii1meta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSii1meta(samptime);
    }

    /**
    * Deletes the sii1meta from the database. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1meta deleteSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSii1meta(sii1meta);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.smear.db.model.Sii1meta fetchSii1meta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSii1meta(samptime);
    }

    /**
    * Returns the sii1meta with the primary key.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta
    * @throws PortalException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1meta getSii1meta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1meta(samptime);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the sii1metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1metas
    * @param end the upper bound of the range of sii1metas (not inclusive)
    * @return the range of sii1metas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Sii1meta> getSii1metas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1metas(start, end);
    }

    /**
    * Returns the number of sii1metas.
    *
    * @return the number of sii1metas
    * @throws SystemException if a system exception occurred
    */
    public static int getSii1metasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSii1metasCount();
    }

    /**
    * Updates the sii1meta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Sii1meta updateSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSii1meta(sii1meta);
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

    public static Sii1metaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Sii1metaLocalService.class.getName());

            if (invokableLocalService instanceof Sii1metaLocalService) {
                _service = (Sii1metaLocalService) invokableLocalService;
            } else {
                _service = new Sii1metaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Sii1metaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Sii1metaLocalService service) {
    }
}
