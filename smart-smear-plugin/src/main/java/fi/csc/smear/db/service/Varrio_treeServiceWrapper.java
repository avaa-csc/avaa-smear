package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Varrio_treeService}.
 *
 * @author pj
 * @see Varrio_treeService
 * @generated
 */
public class Varrio_treeServiceWrapper implements Varrio_treeService,
    ServiceWrapper<Varrio_treeService> {
    private Varrio_treeService _varrio_treeService;

    public Varrio_treeServiceWrapper(Varrio_treeService varrio_treeService) {
        _varrio_treeService = varrio_treeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _varrio_treeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _varrio_treeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _varrio_treeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Varrio_treeService getWrappedVarrio_treeService() {
        return _varrio_treeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVarrio_treeService(
        Varrio_treeService varrio_treeService) {
        _varrio_treeService = varrio_treeService;
    }

    @Override
    public Varrio_treeService getWrappedService() {
        return _varrio_treeService;
    }

    @Override
    public void setWrappedService(Varrio_treeService varrio_treeService) {
        _varrio_treeService = varrio_treeService;
    }
}
