package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearTableMetadataService}.
 *
 * @author pj
 * @see SmearTableMetadataService
 * @generated
 */
public class SmearTableMetadataServiceWrapper
    implements SmearTableMetadataService,
        ServiceWrapper<SmearTableMetadataService> {
    private SmearTableMetadataService _smearTableMetadataService;

    public SmearTableMetadataServiceWrapper(
        SmearTableMetadataService smearTableMetadataService) {
        _smearTableMetadataService = smearTableMetadataService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearTableMetadataService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearTableMetadataService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearTableMetadataService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearTableMetadataService getWrappedSmearTableMetadataService() {
        return _smearTableMetadataService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearTableMetadataService(
        SmearTableMetadataService smearTableMetadataService) {
        _smearTableMetadataService = smearTableMetadataService;
    }

    @Override
    public SmearTableMetadataService getWrappedService() {
        return _smearTableMetadataService;
    }

    @Override
    public void setWrappedService(
        SmearTableMetadataService smearTableMetadataService) {
        _smearTableMetadataService = smearTableMetadataService;
    }
}
