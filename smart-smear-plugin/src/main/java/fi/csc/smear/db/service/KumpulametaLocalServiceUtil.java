package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Kumpulameta. This utility wraps
 * {@link fi.csc.smear.db.service.impl.KumpulametaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author pj
 * @see KumpulametaLocalService
 * @see fi.csc.smear.db.service.base.KumpulametaLocalServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.KumpulametaLocalServiceImpl
 * @generated
 */
public class KumpulametaLocalServiceUtil {
    private static KumpulametaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.KumpulametaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the kumpulameta to the database. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpulameta addKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addKumpulameta(kumpulameta);
    }

    /**
    * Creates a new kumpulameta with the primary key. Does not add the kumpulameta to the database.
    *
    * @param samptime the primary key for the new kumpulameta
    * @return the new kumpulameta
    */
    public static fi.csc.smear.db.model.Kumpulameta createKumpulameta(
        java.util.Date samptime) {
        return getService().createKumpulameta(samptime);
    }

    /**
    * Deletes the kumpulameta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta that was removed
    * @throws PortalException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpulameta deleteKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteKumpulameta(samptime);
    }

    /**
    * Deletes the kumpulameta from the database. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpulameta deleteKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteKumpulameta(kumpulameta);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static fi.csc.smear.db.model.Kumpulameta fetchKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchKumpulameta(samptime);
    }

    /**
    * Returns the kumpulameta with the primary key.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta
    * @throws PortalException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpulameta getKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getKumpulameta(samptime);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kumpulametas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpulametas
    * @param end the upper bound of the range of kumpulametas (not inclusive)
    * @return the range of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Kumpulameta> getKumpulametas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getKumpulametas(start, end);
    }

    /**
    * Returns the number of kumpulametas.
    *
    * @return the number of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    public static int getKumpulametasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getKumpulametasCount();
    }

    /**
    * Updates the kumpulameta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Kumpulameta updateKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateKumpulameta(kumpulameta);
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

    public static KumpulametaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    KumpulametaLocalService.class.getName());

            if (invokableLocalService instanceof KumpulametaLocalService) {
                _service = (KumpulametaLocalService) invokableLocalService;
            } else {
                _service = new KumpulametaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(KumpulametaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(KumpulametaLocalService service) {
    }
}
