package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearEventsService}.
 *
 * @author pj
 * @see SmearEventsService
 * @generated
 */
public class SmearEventsServiceWrapper implements SmearEventsService,
    ServiceWrapper<SmearEventsService> {
    private SmearEventsService _smearEventsService;

    public SmearEventsServiceWrapper(SmearEventsService smearEventsService) {
        _smearEventsService = smearEventsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearEventsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearEventsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearEventsService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearEventsService getWrappedSmearEventsService() {
        return _smearEventsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearEventsService(
        SmearEventsService smearEventsService) {
        _smearEventsService = smearEventsService;
    }

    @Override
    public SmearEventsService getWrappedService() {
        return _smearEventsService;
    }

    @Override
    public void setWrappedService(SmearEventsService smearEventsService) {
        _smearEventsService = smearEventsService;
    }
}
