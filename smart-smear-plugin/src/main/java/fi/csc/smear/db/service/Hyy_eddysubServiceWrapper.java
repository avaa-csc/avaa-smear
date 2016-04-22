package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyy_eddysubService}.
 *
 * @author pj
 * @see Hyy_eddysubService
 * @generated
 */
public class Hyy_eddysubServiceWrapper implements Hyy_eddysubService,
    ServiceWrapper<Hyy_eddysubService> {
    private Hyy_eddysubService _hyy_eddysubService;

    public Hyy_eddysubServiceWrapper(Hyy_eddysubService hyy_eddysubService) {
        _hyy_eddysubService = hyy_eddysubService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyy_eddysubService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyy_eddysubService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyy_eddysubService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyy_eddysubService getWrappedHyy_eddysubService() {
        return _hyy_eddysubService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyy_eddysubService(
        Hyy_eddysubService hyy_eddysubService) {
        _hyy_eddysubService = hyy_eddysubService;
    }

    @Override
    public Hyy_eddysubService getWrappedService() {
        return _hyy_eddysubService;
    }

    @Override
    public void setWrappedService(Hyy_eddysubService hyy_eddysubService) {
        _hyy_eddysubService = hyy_eddysubService;
    }
}
