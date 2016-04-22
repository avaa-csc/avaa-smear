package fi.csc.avaa.smear.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fi.csc.avaa.smear.db.service.ClpSerializer;
import fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil;
import fi.csc.avaa.smear.db.service.HyyCoordServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            HyyCoordLocalServiceUtil.clearService();

            HyyCoordServiceUtil.clearService();
        }
    }
}
