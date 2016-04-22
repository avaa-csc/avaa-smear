package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KumpulametaService}.
 *
 * @author pj
 * @see KumpulametaService
 * @generated
 */
public class KumpulametaServiceWrapper implements KumpulametaService,
    ServiceWrapper<KumpulametaService> {
    private KumpulametaService _kumpulametaService;

    public KumpulametaServiceWrapper(KumpulametaService kumpulametaService) {
        _kumpulametaService = kumpulametaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kumpulametaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kumpulametaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kumpulametaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public KumpulametaService getWrappedKumpulametaService() {
        return _kumpulametaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKumpulametaService(
        KumpulametaService kumpulametaService) {
        _kumpulametaService = kumpulametaService;
    }

    @Override
    public KumpulametaService getWrappedService() {
        return _kumpulametaService;
    }

    @Override
    public void setWrappedService(KumpulametaService kumpulametaService) {
        _kumpulametaService = kumpulametaService;
    }
}
