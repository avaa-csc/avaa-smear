package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SmearTagsService}.
 *
 * @author pj
 * @see SmearTagsService
 * @generated
 */
public class SmearTagsServiceWrapper implements SmearTagsService,
    ServiceWrapper<SmearTagsService> {
    private SmearTagsService _smearTagsService;

    public SmearTagsServiceWrapper(SmearTagsService smearTagsService) {
        _smearTagsService = smearTagsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _smearTagsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _smearTagsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _smearTagsService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SmearTagsService getWrappedSmearTagsService() {
        return _smearTagsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSmearTagsService(SmearTagsService smearTagsService) {
        _smearTagsService = smearTagsService;
    }

    @Override
    public SmearTagsService getWrappedService() {
        return _smearTagsService;
    }

    @Override
    public void setWrappedService(SmearTagsService smearTagsService) {
        _smearTagsService = smearTagsService;
    }
}
