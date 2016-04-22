package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyde_eddytowService}.
 *
 * @author pj
 * @see Hyde_eddytowService
 * @generated
 */
public class Hyde_eddytowServiceWrapper implements Hyde_eddytowService,
    ServiceWrapper<Hyde_eddytowService> {
    private Hyde_eddytowService _hyde_eddytowService;

    public Hyde_eddytowServiceWrapper(Hyde_eddytowService hyde_eddytowService) {
        _hyde_eddytowService = hyde_eddytowService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyde_eddytowService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyde_eddytowService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyde_eddytowService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyde_eddytowService getWrappedHyde_eddytowService() {
        return _hyde_eddytowService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyde_eddytowService(
        Hyde_eddytowService hyde_eddytowService) {
        _hyde_eddytowService = hyde_eddytowService;
    }

    @Override
    public Hyde_eddytowService getWrappedService() {
        return _hyde_eddytowService;
    }

    @Override
    public void setWrappedService(Hyde_eddytowService hyde_eddytowService) {
        _hyde_eddytowService = hyde_eddytowService;
    }
}
