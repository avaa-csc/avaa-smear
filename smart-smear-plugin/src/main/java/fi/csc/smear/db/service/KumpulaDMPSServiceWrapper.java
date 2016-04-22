package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KumpulaDMPSService}.
 *
 * @author pj
 * @see KumpulaDMPSService
 * @generated
 */
public class KumpulaDMPSServiceWrapper implements KumpulaDMPSService,
    ServiceWrapper<KumpulaDMPSService> {
    private KumpulaDMPSService _kumpulaDMPSService;

    public KumpulaDMPSServiceWrapper(KumpulaDMPSService kumpulaDMPSService) {
        _kumpulaDMPSService = kumpulaDMPSService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kumpulaDMPSService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kumpulaDMPSService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kumpulaDMPSService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public KumpulaDMPSService getWrappedKumpulaDMPSService() {
        return _kumpulaDMPSService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKumpulaDMPSService(
        KumpulaDMPSService kumpulaDMPSService) {
        _kumpulaDMPSService = kumpulaDMPSService;
    }

    @Override
    public KumpulaDMPSService getWrappedService() {
        return _kumpulaDMPSService;
    }

    @Override
    public void setWrappedService(KumpulaDMPSService kumpulaDMPSService) {
        _kumpulaDMPSService = kumpulaDMPSService;
    }
}
