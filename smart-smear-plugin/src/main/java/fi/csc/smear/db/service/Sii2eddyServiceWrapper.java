package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii2eddyService}.
 *
 * @author pj
 * @see Sii2eddyService
 * @generated
 */
public class Sii2eddyServiceWrapper implements Sii2eddyService,
    ServiceWrapper<Sii2eddyService> {
    private Sii2eddyService _sii2eddyService;

    public Sii2eddyServiceWrapper(Sii2eddyService sii2eddyService) {
        _sii2eddyService = sii2eddyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii2eddyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii2eddyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii2eddyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii2eddyService getWrappedSii2eddyService() {
        return _sii2eddyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii2eddyService(Sii2eddyService sii2eddyService) {
        _sii2eddyService = sii2eddyService;
    }

    @Override
    public Sii2eddyService getWrappedService() {
        return _sii2eddyService;
    }

    @Override
    public void setWrappedService(Sii2eddyService sii2eddyService) {
        _sii2eddyService = sii2eddyService;
    }
}
