package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearmetadataService}.
 *
 * @author pj
 * @see SmearmetadataService
 * @generated
 */
public class SmearmetadataServiceWrapper implements SmearmetadataService,
    ServiceWrapper<SmearmetadataService> {
    private SmearmetadataService _smearmetadataService;

    public SmearmetadataServiceWrapper(
        SmearmetadataService smearmetadataService) {
        _smearmetadataService = smearmetadataService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearmetadataService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearmetadataService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearmetadataService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearmetadataService getWrappedSmearmetadataService() {
        return _smearmetadataService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearmetadataService(
        SmearmetadataService smearmetadataService) {
        _smearmetadataService = smearmetadataService;
    }

    @Override
    public SmearmetadataService getWrappedService() {
        return _smearmetadataService;
    }

    @Override
    public void setWrappedService(SmearmetadataService smearmetadataService) {
        _smearmetadataService = smearmetadataService;
    }
}
