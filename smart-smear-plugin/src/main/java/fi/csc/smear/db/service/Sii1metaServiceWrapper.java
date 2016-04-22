package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii1metaService}.
 *
 * @author pj
 * @see Sii1metaService
 * @generated
 */
public class Sii1metaServiceWrapper implements Sii1metaService,
    ServiceWrapper<Sii1metaService> {
    private Sii1metaService _sii1metaService;

    public Sii1metaServiceWrapper(Sii1metaService sii1metaService) {
        _sii1metaService = sii1metaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii1metaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii1metaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii1metaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii1metaService getWrappedSii1metaService() {
        return _sii1metaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii1metaService(Sii1metaService sii1metaService) {
        _sii1metaService = sii1metaService;
    }

    @Override
    public Sii1metaService getWrappedService() {
        return _sii1metaService;
    }

    @Override
    public void setWrappedService(Sii1metaService sii1metaService) {
        _sii1metaService = sii1metaService;
    }
}
