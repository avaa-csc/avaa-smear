package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearstationService}.
 *
 * @author pj
 * @see SmearstationService
 * @generated
 */
public class SmearstationServiceWrapper implements SmearstationService,
    ServiceWrapper<SmearstationService> {
    private SmearstationService _smearstationService;

    public SmearstationServiceWrapper(SmearstationService smearstationService) {
        _smearstationService = smearstationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearstationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearstationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearstationService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearstationService getWrappedSmearstationService() {
        return _smearstationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearstationService(
        SmearstationService smearstationService) {
        _smearstationService = smearstationService;
    }

    @Override
    public SmearstationService getWrappedService() {
        return _smearstationService;
    }

    @Override
    public void setWrappedService(SmearstationService smearstationService) {
        _smearstationService = smearstationService;
    }
}
