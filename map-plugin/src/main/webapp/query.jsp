
<%
	/**
	 * Copyright (c) 2013 CSC	 
	 
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details. usage:
	 wget "http://localhost:8080/map-portlet/query.jsp?year=2012&month=07&day=16&hour=16"
	 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.portlet.PortletPreferences"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery, 
	com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil,
	com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil,
	com.liferay.portal.kernel.exception.SystemException,
	fi.csc.avaa.smear.db.model.HyyCoord,
	fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil,
	java.util.List,
	com.google.gson.Gson"%>
	
		<% 
		 DynamicQuery query = DynamicQueryFactoryUtil.forClass(HyyCoord.class)
				.add(RestrictionsFactoryUtil.eq("year", Integer.parseInt(request.getParameter("year"))))
				.add(RestrictionsFactoryUtil.eq("month", Integer.parseInt(request.getParameter("month"))))
				.add(RestrictionsFactoryUtil.eq("day", Integer.parseInt(request.getParameter("day"))))
				.add(RestrictionsFactoryUtil.eq("hour",Integer.parseInt(request.getParameter("hour"))));
		List<HyyCoord> data = HyyCoordLocalServiceUtil.dynamicQuery(query);
		Gson gson = new Gson();
		out.println(gson.toJson(data)); 
		%>

