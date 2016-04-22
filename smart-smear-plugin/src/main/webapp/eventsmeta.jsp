<%
        /**
         * Copyright (c) 2015 CSC        
         
         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "http://avaa.tdata.fi/smart-smear-portlet/eventsmeta.jsp?varid=11"
         */
%><%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"
%><%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" 
 %><%@ page import="javax.portlet.PortletPreferences"
 %><%@ page import="javax.servlet.http.*,javax.servlet.*,com.google.gson.Gson" 
%><%@ page import="java.io.*,java.util.*,java.sql.*,java.net.URLDecoder"
%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%><%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"
%><portlet:defineObjects 
/><%  File f = new File("/opt/avaa/liferay-portal/tomcat/shared/smear.properties");
      Properties prop = new Properties();
      FileInputStream in = new FileInputStream(f);
      prop.load(in);
      String salasana = prop.getProperty("salasana");
%><c:set var="salasana"><%= salasana %></c:set><c:set
 var="varid"><%= Long.parseLong(request.getParameter("varid")) %></c:set>
 <sql:setDataSource var="smear"  driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://db5.csc.fi:3320/smear?useUnicode=true&characterEncoding=UTF-8"
     user="AVAA-read"  password="${salasana}"
/><sql:query dataSource="${smear}" var="result">
SELECT e.eventID, e.event_type, e.event, e.who, e.period_start, e.period_end, e.etimestamp from Events e,  variableEvent ve WHERE ve.eventID=e.eventID AND ve.variableID=?
	<sql:param value="${varid}" 
	/></sql:query>
[ <c:forEach varStatus='status' var="row" items="${result.rows}">  {
 "eventID":<c:out value="${row.eventID}"/>,
  "event_type":"<c:out value="${row.event_type}"/>",
  "event":"<c:out value="${row.event}"/>",
  "who":"<c:out value="${row.who}"/>",
  "period_start":"<c:out value="${row.period_start}"/>",
  "period_end":"<c:out value="${row.period_end}"/>",
  "etimestamp":"<c:out value="${row.etimestamp}"/>"
 }	<c:if test="${!status.last}">,</c:if> </c:forEach>		]