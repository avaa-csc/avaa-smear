package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kvjMetaService}.
 *
 * @author pj
 * @see kvjMetaService
 * @generated
 */
public class kvjMetaServiceWrapper implements kvjMetaService,
    ServiceWrapper<kvjMetaService> {
    private kvjMetaService _kvjMetaService;

    public kvjMetaServiceWrapper(kvjMetaService kvjMetaService) {
        _kvjMetaService = kvjMetaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kvjMetaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kvjMetaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kvjMetaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public kvjMetaService getWrappedkvjMetaService() {
        return _kvjMetaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedkvjMetaService(kvjMetaService kvjMetaService) {
        _kvjMetaService = kvjMetaService;
    }

    @Override
    public kvjMetaService getWrappedService() {
        return _kvjMetaService;
    }

    @Override
    public void setWrappedService(kvjMetaService kvjMetaService) {
        _kvjMetaService = kvjMetaService;
    }
}
