package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kvjEddyService}.
 *
 * @author pj
 * @see kvjEddyService
 * @generated
 */
public class kvjEddyServiceWrapper implements kvjEddyService,
    ServiceWrapper<kvjEddyService> {
    private kvjEddyService _kvjEddyService;

    public kvjEddyServiceWrapper(kvjEddyService kvjEddyService) {
        _kvjEddyService = kvjEddyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kvjEddyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kvjEddyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kvjEddyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public kvjEddyService getWrappedkvjEddyService() {
        return _kvjEddyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedkvjEddyService(kvjEddyService kvjEddyService) {
        _kvjEddyService = kvjEddyService;
    }

    @Override
    public kvjEddyService getWrappedService() {
        return _kvjEddyService;
    }

    @Override
    public void setWrappedService(kvjEddyService kvjEddyService) {
        _kvjEddyService = kvjEddyService;
    }
}
