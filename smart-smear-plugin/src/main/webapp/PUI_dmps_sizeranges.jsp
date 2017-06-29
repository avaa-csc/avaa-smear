<%--
  Created by IntelliJ IDEA.
  User: pj
  Date: 5.5.2017
  Time: 13:39
  To change this template use File | Settings | File Templates.

        /**
         * Copyright (c) 2017 CSC

         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "https://avaa.tdata.fi/smart-smear-portlet/PUI_dmps_sizeranges.jsp?id=1
"
         */



--%><%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"
%><portlet:defineObjects
 /><%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"
 %><%@ page import="javax.portlet.PortletPreferences"
 %><%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery,
        com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil,
        com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil,
        com.liferay.portal.kernel.exception.SystemException,

        fi.csc.smear.db.model.PUI_dmps_sizeranges,
        fi.csc.smear.db.service.PUI_dmps_sizerangesLocalServiceUtil,
        java.util.List,
        com.google.gson.Gson"%><%

        DynamicQuery query = DynamicQueryFactoryUtil.forClass(PUI_dmps_sizeranges.class);
        if (null != request.getParameter("id")) {
            int id = Integer.parseInt(request.getParameter("id"));
            query.add(RestrictionsFactoryUtil.eq("sizerange_id", id));
                List<PUI_dmps_sizeranges> data = PUI_dmps_sizerangesLocalServiceUtil.dynamicQuery(query);
                Gson gson = new Gson();
                out.println(gson.toJson(data));
        }


        %>
