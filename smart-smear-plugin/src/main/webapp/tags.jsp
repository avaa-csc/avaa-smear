<%
        /**
         * Copyright (c) 2015 CSC        
         
         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "http://avaa.tdata.fi/smart-smear-portlet/tags.jsp?varid=11"
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
SELECT t.tagID, t.vocabulary, t.tag, t.displaykeyword
 from Tags t, variableTags vt WHERE  t.TagID=vt.TagID AND vt.variableID=?
        <sql:param value="${varid}" 
        /></sql:query>
[ <c:forEach varStatus='status' var="row" items="${result.rows}"> {
 "tagID":<c:out value="${row.tagID}"/>,
  "vocabulary":"<c:out value="${row.vocabulary}"/>",
  "tag":"<c:out value="${row.tag}"/>",
  "displaykeyword":"<c:out value="${row.displaykeyword}"/>" 
 } <c:if test="${!status.last}">,</c:if> </c:forEach>  ]
         