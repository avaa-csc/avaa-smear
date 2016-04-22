package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Hyde_eddy233Service}.
 *
 * @author pj
 * @see Hyde_eddy233Service
 * @generated
 */
public class Hyde_eddy233ServiceWrapper implements Hyde_eddy233Service,
    ServiceWrapper<Hyde_eddy233Service> {
    private Hyde_eddy233Service _hyde_eddy233Service;

    public Hyde_eddy233ServiceWrapper(Hyde_eddy233Service hyde_eddy233Service) {
        _hyde_eddy233Service = hyde_eddy233Service;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyde_eddy233Service.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyde_eddy233Service.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyde_eddy233Service.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Hyde_eddy233Service getWrappedHyde_eddy233Service() {
        return _hyde_eddy233Service;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyde_eddy233Service(
        Hyde_eddy233Service hyde_eddy233Service) {
        _hyde_eddy233Service = hyde_eddy233Service;
    }

    @Override
    public Hyde_eddy233Service getWrappedService() {
        return _hyde_eddy233Service;
    }

    @Override
    public void setWrappedService(Hyde_eddy233Service hyde_eddy233Service) {
        _hyde_eddy233Service = hyde_eddy233Service;
    }
}
