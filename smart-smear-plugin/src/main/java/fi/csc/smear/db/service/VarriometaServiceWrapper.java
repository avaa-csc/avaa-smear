package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VarriometaService}.
 *
 * @author pj
 * @see VarriometaService
 * @generated
 */
public class VarriometaServiceWrapper implements VarriometaService,
    ServiceWrapper<VarriometaService> {
    private VarriometaService _varriometaService;

    public VarriometaServiceWrapper(VarriometaService varriometaService) {
        _varriometaService = varriometaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _varriometaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _varriometaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _varriometaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VarriometaService getWrappedVarriometaService() {
        return _varriometaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVarriometaService(VarriometaService varriometaService) {
        _varriometaService = varriometaService;
    }

    @Override
    public VarriometaService getWrappedService() {
        return _varriometaService;
    }

    @Override
    public void setWrappedService(VarriometaService varriometaService) {
        _varriometaService = varriometaService;
    }
}
