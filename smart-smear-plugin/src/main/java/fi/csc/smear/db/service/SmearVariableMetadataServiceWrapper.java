package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearVariableMetadataService}.
 *
 * @author pj
 * @see SmearVariableMetadataService
 * @generated
 */
public class SmearVariableMetadataServiceWrapper
    implements SmearVariableMetadataService,
        ServiceWrapper<SmearVariableMetadataService> {
    private SmearVariableMetadataService _smearVariableMetadataService;

    public SmearVariableMetadataServiceWrapper(
        SmearVariableMetadataService smearVariableMetadataService) {
        _smearVariableMetadataService = smearVariableMetadataService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearVariableMetadataService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearVariableMetadataService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearVariableMetadataService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearVariableMetadataService getWrappedSmearVariableMetadataService() {
        return _smearVariableMetadataService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearVariableMetadataService(
        SmearVariableMetadataService smearVariableMetadataService) {
        _smearVariableMetadataService = smearVariableMetadataService;
    }

    @Override
    public SmearVariableMetadataService getWrappedService() {
        return _smearVariableMetadataService;
    }

    @Override
    public void setWrappedService(
        SmearVariableMetadataService smearVariableMetadataService) {
        _smearVariableMetadataService = smearVariableMetadataService;
    }
}
