package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii1eddyService}.
 *
 * @author pj
 * @see Sii1eddyService
 * @generated
 */
public class Sii1eddyServiceWrapper implements Sii1eddyService,
    ServiceWrapper<Sii1eddyService> {
    private Sii1eddyService _sii1eddyService;

    public Sii1eddyServiceWrapper(Sii1eddyService sii1eddyService) {
        _sii1eddyService = sii1eddyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii1eddyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii1eddyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii1eddyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii1eddyService getWrappedSii1eddyService() {
        return _sii1eddyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii1eddyService(Sii1eddyService sii1eddyService) {
        _sii1eddyService = sii1eddyService;
    }

    @Override
    public Sii1eddyService getWrappedService() {
        return _sii1eddyService;
    }

    @Override
    public void setWrappedService(Sii1eddyService sii1eddyService) {
        _sii1eddyService = sii1eddyService;
    }
}
