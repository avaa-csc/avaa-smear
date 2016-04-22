package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HydemetaService}.
 *
 * @author pj
 * @see HydemetaService
 * @generated
 */
public class HydemetaServiceWrapper implements HydemetaService,
    ServiceWrapper<HydemetaService> {
    private HydemetaService _hydemetaService;

    public HydemetaServiceWrapper(HydemetaService hydemetaService) {
        _hydemetaService = hydemetaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hydemetaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hydemetaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hydemetaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HydemetaService getWrappedHydemetaService() {
        return _hydemetaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHydemetaService(HydemetaService hydemetaService) {
        _hydemetaService = hydemetaService;
    }

    @Override
    public HydemetaService getWrappedService() {
        return _hydemetaService;
    }

    @Override
    public void setWrappedService(HydemetaService hydemetaService) {
        _hydemetaService = hydemetaService;
    }
}
