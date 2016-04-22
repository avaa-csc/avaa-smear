package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VareddyService}.
 *
 * @author pj
 * @see VareddyService
 * @generated
 */
public class VareddyServiceWrapper implements VareddyService,
    ServiceWrapper<VareddyService> {
    private VareddyService _vareddyService;

    public VareddyServiceWrapper(VareddyService vareddyService) {
        _vareddyService = vareddyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _vareddyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _vareddyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _vareddyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VareddyService getWrappedVareddyService() {
        return _vareddyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVareddyService(VareddyService vareddyService) {
        _vareddyService = vareddyService;
    }

    @Override
    public VareddyService getWrappedService() {
        return _vareddyService;
    }

    @Override
    public void setWrappedService(VareddyService vareddyService) {
        _vareddyService = vareddyService;
    }
}
