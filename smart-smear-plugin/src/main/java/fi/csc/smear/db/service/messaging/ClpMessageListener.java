package fi.csc.smear.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Hyde_eddy233LocalServiceUtil;
import fi.csc.smear.db.service.Hyde_eddy233ServiceUtil;
import fi.csc.smear.db.service.Hyde_eddytowLocalServiceUtil;
import fi.csc.smear.db.service.Hyde_eddytowServiceUtil;
import fi.csc.smear.db.service.HydemetaLocalServiceUtil;
import fi.csc.smear.db.service.HydemetaServiceUtil;
import fi.csc.smear.db.service.HyyAeroLocalServiceUtil;
import fi.csc.smear.db.service.HyyAeroServiceUtil;
import fi.csc.smear.db.service.HyyDMPSLocalServiceUtil;
import fi.csc.smear.db.service.HyyDMPSServiceUtil;
import fi.csc.smear.db.service.Hyy_eddysubLocalServiceUtil;
import fi.csc.smear.db.service.Hyy_eddysubServiceUtil;
import fi.csc.smear.db.service.KumpulaDMPSLocalServiceUtil;
import fi.csc.smear.db.service.KumpulaDMPSServiceUtil;
import fi.csc.smear.db.service.Kumpula_eddyLocalServiceUtil;
import fi.csc.smear.db.service.Kumpula_eddyServiceUtil;
import fi.csc.smear.db.service.KumpulametaLocalServiceUtil;
import fi.csc.smear.db.service.KumpulametaServiceUtil;
import fi.csc.smear.db.service.Sii1eddyLocalServiceUtil;
import fi.csc.smear.db.service.Sii1eddyServiceUtil;
import fi.csc.smear.db.service.Sii1metaLocalServiceUtil;
import fi.csc.smear.db.service.Sii1metaServiceUtil;
import fi.csc.smear.db.service.Sii2eddyLocalServiceUtil;
import fi.csc.smear.db.service.Sii2eddyServiceUtil;
import fi.csc.smear.db.service.Sii2metaLocalServiceUtil;
import fi.csc.smear.db.service.Sii2metaServiceUtil;
import fi.csc.smear.db.service.SmearEventsLocalServiceUtil;
import fi.csc.smear.db.service.SmearEventsServiceUtil;
import fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil;
import fi.csc.smear.db.service.SmearTableMetadataServiceUtil;
import fi.csc.smear.db.service.SmearTagsLocalServiceUtil;
import fi.csc.smear.db.service.SmearTagsServiceUtil;
import fi.csc.smear.db.service.SmearVariableMetadataLocalServiceUtil;
import fi.csc.smear.db.service.SmearVariableMetadataServiceUtil;
import fi.csc.smear.db.service.SmearmetadataLocalServiceUtil;
import fi.csc.smear.db.service.SmearmetadataServiceUtil;
import fi.csc.smear.db.service.SmearstationLocalServiceUtil;
import fi.csc.smear.db.service.SmearstationServiceUtil;
import fi.csc.smear.db.service.SmearvariableEventLocalServiceUtil;
import fi.csc.smear.db.service.SmearvariableTagsLocalServiceUtil;
import fi.csc.smear.db.service.SmearvariableTagsServiceUtil;
import fi.csc.smear.db.service.TowermetaLocalServiceUtil;
import fi.csc.smear.db.service.TowermetaServiceUtil;
import fi.csc.smear.db.service.VarDMPSLocalServiceUtil;
import fi.csc.smear.db.service.VarDMPSServiceUtil;
import fi.csc.smear.db.service.VareddyLocalServiceUtil;
import fi.csc.smear.db.service.VareddyServiceUtil;
import fi.csc.smear.db.service.Varrio_treeLocalServiceUtil;
import fi.csc.smear.db.service.Varrio_treeServiceUtil;
import fi.csc.smear.db.service.VarriometaLocalServiceUtil;
import fi.csc.smear.db.service.VarriometaServiceUtil;
import fi.csc.smear.db.service.kvjEddyLocalServiceUtil;
import fi.csc.smear.db.service.kvjEddyServiceUtil;


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
            Hyde_eddy233LocalServiceUtil.clearService();

            Hyde_eddy233ServiceUtil.clearService();
            Hyde_eddytowLocalServiceUtil.clearService();

            Hyde_eddytowServiceUtil.clearService();
            HydemetaLocalServiceUtil.clearService();

            HydemetaServiceUtil.clearService();
            Hyy_eddysubLocalServiceUtil.clearService();

            Hyy_eddysubServiceUtil.clearService();
            HyyAeroLocalServiceUtil.clearService();

            HyyAeroServiceUtil.clearService();
            HyyDMPSLocalServiceUtil.clearService();

            HyyDMPSServiceUtil.clearService();
            Kumpula_eddyLocalServiceUtil.clearService();

            Kumpula_eddyServiceUtil.clearService();
            KumpulaDMPSLocalServiceUtil.clearService();

            KumpulaDMPSServiceUtil.clearService();
            KumpulametaLocalServiceUtil.clearService();

            KumpulametaServiceUtil.clearService();
            kvjEddyLocalServiceUtil.clearService();

            kvjEddyServiceUtil.clearService();
            Sii1eddyLocalServiceUtil.clearService();

            Sii1eddyServiceUtil.clearService();
            Sii1metaLocalServiceUtil.clearService();

            Sii1metaServiceUtil.clearService();
            Sii2eddyLocalServiceUtil.clearService();

            Sii2eddyServiceUtil.clearService();
            Sii2metaLocalServiceUtil.clearService();

            Sii2metaServiceUtil.clearService();
            SmearEventsLocalServiceUtil.clearService();

            SmearEventsServiceUtil.clearService();
            SmearmetadataLocalServiceUtil.clearService();

            SmearmetadataServiceUtil.clearService();
            SmearstationLocalServiceUtil.clearService();

            SmearstationServiceUtil.clearService();
            SmearTableMetadataLocalServiceUtil.clearService();

            SmearTableMetadataServiceUtil.clearService();
            SmearTagsLocalServiceUtil.clearService();

            SmearTagsServiceUtil.clearService();
            SmearvariableEventLocalServiceUtil.clearService();

            SmearVariableMetadataLocalServiceUtil.clearService();

            SmearVariableMetadataServiceUtil.clearService();
            SmearvariableTagsLocalServiceUtil.clearService();

            SmearvariableTagsServiceUtil.clearService();
            TowermetaLocalServiceUtil.clearService();

            TowermetaServiceUtil.clearService();
            VarDMPSLocalServiceUtil.clearService();

            VarDMPSServiceUtil.clearService();
            VareddyLocalServiceUtil.clearService();

            VareddyServiceUtil.clearService();
            Varrio_treeLocalServiceUtil.clearService();

            Varrio_treeServiceUtil.clearService();
            VarriometaLocalServiceUtil.clearService();

            VarriometaServiceUtil.clearService();
        }
    }
}
