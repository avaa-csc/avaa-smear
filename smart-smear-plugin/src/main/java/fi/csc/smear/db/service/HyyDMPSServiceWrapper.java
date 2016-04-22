package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyDMPSService}.
 *
 * @author pj
 * @see HyyDMPSService
 * @generated
 */
public class HyyDMPSServiceWrapper implements HyyDMPSService,
    ServiceWrapper<HyyDMPSService> {
    private HyyDMPSService _hyyDMPSService;

    public HyyDMPSServiceWrapper(HyyDMPSService hyyDMPSService) {
        _hyyDMPSService = hyyDMPSService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyDMPSService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyDMPSService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyDMPSService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyDMPSService getWrappedHyyDMPSService() {
        return _hyyDMPSService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyDMPSService(HyyDMPSService hyyDMPSService) {
        _hyyDMPSService = hyyDMPSService;
    }

    @Override
    public HyyDMPSService getWrappedService() {
        return _hyyDMPSService;
    }

    @Override
    public void setWrappedService(HyyDMPSService hyyDMPSService) {
        _hyyDMPSService = hyyDMPSService;
    }
}
