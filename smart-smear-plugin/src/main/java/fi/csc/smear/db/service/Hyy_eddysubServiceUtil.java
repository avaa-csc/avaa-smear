package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Hyy_eddysub. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Hyy_eddysubServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author pj
 * @see Hyy_eddysubService
 * @see fi.csc.smear.db.service.base.Hyy_eddysubServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Hyy_eddysubServiceImpl
 * @generated
 */
public class Hyy_eddysubServiceUtil {
    private static Hyy_eddysubService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Hyy_eddysubServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static Hyy_eddysubService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Hyy_eddysubService.class.getName());

            if (invokableService instanceof Hyy_eddysubService) {
                _service = (Hyy_eddysubService) invokableService;
            } else {
                _service = new Hyy_eddysubServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Hyy_eddysubServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Hyy_eddysubService service) {
    }
}
