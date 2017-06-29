<%
        /**
         * Copyright (c) 2015 CSC        
         
         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "http://avaa.tdata.fi/smart-smear-portlet/tablemetadata.jsp?id=11
"
         */
%><%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"
%><portlet:defineObjects
 /><%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" 
 %><%@ page import="javax.portlet.PortletPreferences"
 %><%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery, 
        com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil,
        com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil,
        com.liferay.portal.kernel.exception.SystemException,
        
        fi.csc.smear.db.model.SmearTableMetadata,
        fi.csc.smear.db.service.SmearTableMetadataLocalServiceUtil,
        java.util.List,
        com.google.gson.Gson"%><%
                final String EROTIN = "\", ";
                final String IEROTIN = ", ";
                long tableId = 0L;
                try {
                	tableId = Long.parseLong(request.getParameter("id"));
                } catch(NumberFormatException e) {
                	out.println("Invalid id parameter");
                	return;
                }

                 DynamicQuery query = DynamicQueryFactoryUtil.forClass(SmearTableMetadata.class)
                                .add(RestrictionsFactoryUtil.eq("tableID",
                                		tableId));
                List<SmearTableMetadata> data = SmearTableMetadataLocalServiceUtil.dynamicQuery(query);
                out.print("[{ "); 
                //data.forEach(
                if (!data.isEmpty()) {	
                	SmearTableMetadata tmd = data.get(0);	
                	out.print("\"tableID\":"+tmd.getTableID()+IEROTIN+ 
                			"\"identifier\":\""+tmd.getIdentifier()+EROTIN+ 
                			"\"title\":\""+tmd.getTitle()+EROTIN+ 
                		    "\"spatial_coverage\":\""+tmd.getSpatial_coverage()+EROTIN+
                		    "\"name\":\""+tmd.getName()+EROTIN+
                		    "\"ttimestamp\":\""+tmd.getTtimestamp()+EROTIN+
                		    "\"period\":"+tmd.getPeriod());
                }
                out.print(" }]");
%>
