package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TowermetaService}.
 *
 * @author pj
 * @see TowermetaService
 * @generated
 */
public class TowermetaServiceWrapper implements TowermetaService,
    ServiceWrapper<TowermetaService> {
    private TowermetaService _towermetaService;

    public TowermetaServiceWrapper(TowermetaService towermetaService) {
        _towermetaService = towermetaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _towermetaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _towermetaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _towermetaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TowermetaService getWrappedTowermetaService() {
        return _towermetaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTowermetaService(TowermetaService towermetaService) {
        _towermetaService = towermetaService;
    }

    @Override
    public TowermetaService getWrappedService() {
        return _towermetaService;
    }

    @Override
    public void setWrappedService(TowermetaService towermetaService) {
        _towermetaService = towermetaService;
    }
}
