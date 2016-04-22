package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VarDMPSService}.
 *
 * @author pj
 * @see VarDMPSService
 * @generated
 */
public class VarDMPSServiceWrapper implements VarDMPSService,
    ServiceWrapper<VarDMPSService> {
    private VarDMPSService _varDMPSService;

    public VarDMPSServiceWrapper(VarDMPSService varDMPSService) {
        _varDMPSService = varDMPSService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _varDMPSService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _varDMPSService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _varDMPSService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VarDMPSService getWrappedVarDMPSService() {
        return _varDMPSService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVarDMPSService(VarDMPSService varDMPSService) {
        _varDMPSService = varDMPSService;
    }

    @Override
    public VarDMPSService getWrappedService() {
        return _varDMPSService;
    }

    @Override
    public void setWrappedService(VarDMPSService varDMPSService) {
        _varDMPSService = varDMPSService;
    }
}
