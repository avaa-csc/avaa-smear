<%
        /**
         * Copyright (c) 2015 CSC        
         
         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "http://avaa.tdata.fi/smart-smear-portlet/variablemeta.jsp?file=RAIN
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
        
        fi.csc.smear.db.model.SmearVariableMetadata,
        fi.csc.smear.db.service.SmearVariableMetadataLocalServiceUtil,
        java.util.List,
        com.google.gson.Gson"%>
                <% 
                 DynamicQuery query = DynamicQueryFactoryUtil.forClass(SmearVariableMetadata.class)
                                .add(RestrictionsFactoryUtil.eq("variable", request.getParameter("file")));
                List<SmearVariableMetadata> data = SmearVariableMetadataLocalServiceUtil.dynamicQuery(query);
                Gson gson = new Gson();
                out.println(gson.toJson(data)); 
                %>

