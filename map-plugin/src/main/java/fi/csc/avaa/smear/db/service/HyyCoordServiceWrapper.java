package fi.csc.avaa.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyCoordService}.
 *
 * @author tkantola
 * @see HyyCoordService
 * @generated
 */
public class HyyCoordServiceWrapper implements HyyCoordService,
    ServiceWrapper<HyyCoordService> {
    private HyyCoordService _hyyCoordService;

    public HyyCoordServiceWrapper(HyyCoordService hyyCoordService) {
        _hyyCoordService = hyyCoordService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyCoordService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyCoordService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyCoordService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyCoordService getWrappedHyyCoordService() {
        return _hyyCoordService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyCoordService(HyyCoordService hyyCoordService) {
        _hyyCoordService = hyyCoordService;
    }

    @Override
    public HyyCoordService getWrappedService() {
        return _hyyCoordService;
    }

    @Override
    public void setWrappedService(HyyCoordService hyyCoordService) {
        _hyyCoordService = hyyCoordService;
    }
}
