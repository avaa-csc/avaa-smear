package fi.csc.avaa.smear.smartsmear;

import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.ui.UI;
import javax.portlet.PortletPreferences;

public class SmearUIProvider extends UIProvider {
	private static final long serialVersionUID = 3530335052699858888L;
	private static final Log log = LogFactoryUtil.getLog(SmearUIProvider.class);
	private static final String TILA = "state";
	String portletstate = "Search";
	@Override
	public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
		PortletMode portletMode = null;
		if (event.getRequest().getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST) instanceof PortletRequest) {
			PortletRequest request = (PortletRequest) event.getRequest().getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);
			portletMode = request.getPortletMode();
			PortletPreferences portletPreferences = request.getPreferences();
			portletstate = portletPreferences.getValue(TILA, "");
		}
    	
		if (portletMode == PortletMode.VIEW) {
			if (portletstate.equals("Search")) {
				return SmearViewUI.class;
			} else if (portletstate.equals("Dashboard")){
				return SmearDashUI.class;
			} else {
				return SmearDownloadUI.class;
			}
		} else if (portletMode == PortletMode.EDIT) {
			return SmearEditUI.class;
		}
		log.warn("Unknown portlet mode. Using view UI.");
		return SmearViewUI.class;
	}
}
