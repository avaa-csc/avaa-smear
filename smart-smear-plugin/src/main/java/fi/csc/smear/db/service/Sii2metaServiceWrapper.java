package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii2metaService}.
 *
 * @author pj
 * @see Sii2metaService
 * @generated
 */
public class Sii2metaServiceWrapper implements Sii2metaService,
    ServiceWrapper<Sii2metaService> {
    private Sii2metaService _sii2metaService;

    public Sii2metaServiceWrapper(Sii2metaService sii2metaService) {
        _sii2metaService = sii2metaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii2metaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii2metaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii2metaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii2metaService getWrappedSii2metaService() {
        return _sii2metaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii2metaService(Sii2metaService sii2metaService) {
        _sii2metaService = sii2metaService;
    }

    @Override
    public Sii2metaService getWrappedService() {
        return _sii2metaService;
    }

    @Override
    public void setWrappedService(Sii2metaService sii2metaService) {
        _sii2metaService = sii2metaService;
    }
}
