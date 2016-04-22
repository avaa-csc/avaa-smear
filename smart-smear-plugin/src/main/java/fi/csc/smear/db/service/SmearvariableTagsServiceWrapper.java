package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearvariableTagsService}.
 *
 * @author pj
 * @see SmearvariableTagsService
 * @generated
 */
public class SmearvariableTagsServiceWrapper implements SmearvariableTagsService,
    ServiceWrapper<SmearvariableTagsService> {
    private SmearvariableTagsService _smearvariableTagsService;

    public SmearvariableTagsServiceWrapper(
        SmearvariableTagsService smearvariableTagsService) {
        _smearvariableTagsService = smearvariableTagsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearvariableTagsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearvariableTagsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearvariableTagsService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearvariableTagsService getWrappedSmearvariableTagsService() {
        return _smearvariableTagsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearvariableTagsService(
        SmearvariableTagsService smearvariableTagsService) {
        _smearvariableTagsService = smearvariableTagsService;
    }

    @Override
    public SmearvariableTagsService getWrappedService() {
        return _smearvariableTagsService;
    }

    @Override
    public void setWrappedService(
        SmearvariableTagsService smearvariableTagsService) {
        _smearvariableTagsService = smearvariableTagsService;
    }
}
