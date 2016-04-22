<%
        /**
         * Copyright (c) 2015 CSC        
         
         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details. usage:
         wget "http://avaa.tdata.fi/smart-smear-portlet/smeardata.jsp?variable=T672&table=HYY_META&from=20150920&to=20150921"
         */
%><%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"
%><portlet:defineObjects
 /><%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" 
 %>
 <%@ page import="javax.portlet.PortletPreferences"%>
 <%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery, 
        com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil,
        com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil,
        com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil,
        com.liferay.portal.kernel.dao.orm.Property,
        com.liferay.portal.kernel.exception.SystemException,
        fi.csc.avaa.smear.smartsmear.Smearyhteys,
        java.util.List,
        java.util.Date,
        java.text.SimpleDateFormat,
        com.google.gson.Gson,
        javax.servlet.http.*,
        javax.servlet.*,
        java.io.*,
        java.sql.*
"%>                 
<%

try {
	Connection conn = null;
	Smearyhteys sy  = null;
	sy = new Smearyhteys();
	conn = sy.getConnection(true);
	//String url="jdbc:mysql://db5.csc.fi:3320/smear";
	String tabl = request.getParameter("table");
	String variab = request.getParameter("variable");

	String quality = "";
	String typ = "";
	int typ_int = 0;
	if (request.getParameter("type") != null) {
		typ = request.getParameter("type");
		if (typ.equals("NONE")) {
			typ_int = 0;
		} else if (typ.equals("GEOM")) {
			typ_int = 1;
		} else if (typ.equals("ARITHMETIC")) {
			typ_int = 2;
		} else if (typ.equals("SUMM")) {
			typ_int = 3;
		} else if (typ.equals("MEDIAN")) {
			typ_int = 4;
		} else {
			typ_int = 0;
		}
	}

	SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date alk = sdf.parse(request.getParameter("from"));
	Date lop = sdf.parse(request.getParameter("to"));
	Timestamp startTs = new Timestamp(alk.getTime());
	Timestamp endTs = new Timestamp(lop.getTime());
	String averaging = request.getParameter("averaging");
	int min = 30;
	if (request.getParameter("averaging") != null) {
		if (request.getParameter("averaging").equals("NONE")) {
   			min = 0;
		} else if (request.getParameter("averaging").equals("1HOUR")){
			min = 60;
		} else if (request.getParameter("averaging").equals("30MIN")){
			min = 30;
		}
	}
	String SAMPTIME =  "samptime";
	String GEOMETRIC = "exp(avg(ln(";
	String CS = "";
	String[] AVG = {CS, CS+GEOMETRIC, CS+"avg(", CS+"sum(", CS};
	String[] LOPPUSULUT = {"", ")))", ")", ")", ""};
	int NONE = 0;
	int GEOM = 1;
	int MEAN = 2;
	int SUMM = 3;
	int MEDIAN = 4;

	StringBuilder sb = new StringBuilder();
	sb.append("SELECT ");
	sb.append(AVG[typ_int]);
	sb.append(variab);
	if (request.getParameter("quality") != null) {
		if (request.getParameter("quality").equals("CHECKED")) {
   			sb.append(", "+variab+"_EMEP");
		}
	}
	sb.append(LOPPUSULUT[typ_int]);
	sb.append(",samptime FROM "+tabl+" WHERE "+SAMPTIME+ " <= ? AND "+SAMPTIME+ " >= ?");
	if (!typ.equals("NONE")) {
		sb.append(" GROUP BY floor(timestampdiff(minute, '1990-1-1', "+SAMPTIME+") /? )");
	}
	Class.forName("com.mysql.jdbc.Driver");
	//Connection conn=DriverManager.getConnection(url,account,password);
	PreparedStatement ps = conn.prepareStatement(sb.toString());
	ps.setTimestamp(1, endTs);
	ps.setTimestamp(2, startTs);
	if (!typ.equals("NONE")) {
		if (min < 30) { //danger!! fix if set new averaging time
			ps.setInt(3, 30); //use 30 as default when user NOT select avraging time
		} else {
			ps.setInt(3, min);
		}
	}
	ResultSet rs = ps.executeQuery();

	Gson gson = new Gson();
	while (rs.next()) {
		if (request.getParameter("quality") != null) {
			if (request.getParameter("quality").equals("CHECKED")) {
				if (rs.getInt(2) > 1){
					out.println(rs.getFloat(1)+"   "+gson.toJson(rs.getTimestamp(3)));
				}
			} else {
				out.println(rs.getFloat(1)+"   "+gson.toJson(rs.getTimestamp(2)));
			}
		} else {
			out.println(rs.getFloat(1)+"   "+gson.toJson(rs.getTimestamp(2)));
		}
	}
	conn.close();
}
catch(Exception e)
{
	out.println("the exception is:"+e);
}
%>
			
