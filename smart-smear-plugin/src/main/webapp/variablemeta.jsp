<%
        /**
         * Copyright (c) 2015-2017 CSC
         
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
 %><%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery,
        com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil,
        com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil,
        fi.csc.smear.db.model.SmearVariableMetadata,
        fi.csc.smear.db.service.SmearVariableMetadataLocalServiceUtil,
        java.util.List,
        com.google.gson.Gson"%><%@ page import="org.apache.commons.lang.StringEscapeUtils"%>
<%

 DynamicQuery query = DynamicQueryFactoryUtil.forClass(SmearVariableMetadata.class);
 if (null != request.getParameter("file")) {
  query.add(RestrictionsFactoryUtil.eq("variable", StringEscapeUtils.escapeSql(request.getParameter("file")).replaceAll(";", "")));
 }
List<SmearVariableMetadata> data = SmearVariableMetadataLocalServiceUtil.dynamicQuery(query);
Gson gson = new Gson();
out.println(gson.toJson(data));
%>

