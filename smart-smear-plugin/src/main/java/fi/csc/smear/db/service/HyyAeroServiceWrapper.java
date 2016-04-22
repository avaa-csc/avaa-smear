package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyAeroService}.
 *
 * @author pj
 * @see HyyAeroService
 * @generated
 */
public class HyyAeroServiceWrapper implements HyyAeroService,
    ServiceWrapper<HyyAeroService> {
    private HyyAeroService _hyyAeroService;

    public HyyAeroServiceWrapper(HyyAeroService hyyAeroService) {
        _hyyAeroService = hyyAeroService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyAeroService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyAeroService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyAeroService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyAeroService getWrappedHyyAeroService() {
        return _hyyAeroService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyAeroService(HyyAeroService hyyAeroService) {
        _hyyAeroService = hyyAeroService;
    }

    @Override
    public HyyAeroService getWrappedService() {
        return _hyyAeroService;
    }

    @Override
    public void setWrappedService(HyyAeroService hyyAeroService) {
        _hyyAeroService = hyyAeroService;
    }
}
