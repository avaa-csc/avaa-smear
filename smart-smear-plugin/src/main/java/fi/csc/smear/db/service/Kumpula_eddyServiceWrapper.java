package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Kumpula_eddyService}.
 *
 * @author pj
 * @see Kumpula_eddyService
 * @generated
 */
public class Kumpula_eddyServiceWrapper implements Kumpula_eddyService,
    ServiceWrapper<Kumpula_eddyService> {
    private Kumpula_eddyService _kumpula_eddyService;

    public Kumpula_eddyServiceWrapper(Kumpula_eddyService kumpula_eddyService) {
        _kumpula_eddyService = kumpula_eddyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kumpula_eddyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kumpula_eddyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kumpula_eddyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Kumpula_eddyService getWrappedKumpula_eddyService() {
        return _kumpula_eddyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKumpula_eddyService(
        Kumpula_eddyService kumpula_eddyService) {
        _kumpula_eddyService = kumpula_eddyService;
    }

    @Override
    public Kumpula_eddyService getWrappedService() {
        return _kumpula_eddyService;
    }

    @Override
    public void setWrappedService(Kumpula_eddyService kumpula_eddyService) {
        _kumpula_eddyService = kumpula_eddyService;
    }
}
