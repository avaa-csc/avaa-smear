<%
        /**
         * Copyright (c) 2015 CSC

         * This library is distributed in the hope that it will be useful, but WITHOUT
         * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
         * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
         * details.
         *
         * Example call ../smeardata.jsp?variables=Pamb0,CO284,T1250&table=HYY_META&from=2016-01-01 00:00:00.000&to=2016-11-03 23:59:59.000&quality=ANY&averaging=60MIN&type=ARITHMETIC&format=TXT
         */
%><%@
    page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"
%><%@
    page import="fi.csc.avaa.smear.api.Smearyhteys,
        org.apache.commons.lang.StringEscapeUtils,
        java.sql.Connection,
        java.sql.PreparedStatement,
	java.sql.ResultSet,
	java.sql.Timestamp,
	java.text.SimpleDateFormat,
        java.time.Instant,
        java.time.OffsetDateTime,
        java.util.TimeZone,
        java.time.ZoneOffset"%><%@ page import="java.util.Arrays"%><%@ page import="java.util.Date"%><%@ page import="java.util.GregorianCalendar"%><%@ page import="java.util.List"%><%
        final GregorianCalendar gcal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
Connection conn = null;
final List<String> VALID_TABLES = Arrays.asList("HYY_META", "HYY_EDDY233", "HYY_EDDYTOW", "HYY_EDDYSUB", "HYY_DMPS", "HYY_AERO",
        "KUM_META", "KUM_EDDY", "KUM_DMPS", "VAR_META", "VAR_TREE", "VAR_EDDY", "VAR_DMPS",
        "SII1_META", "SII1_EDDY", "SII2_META", "SII2_EDDY", "TOR_EDDY", "KVJ_EDDY", "KVJ_META",
        "PUI_cdp", "PUI_dmps_int", "PUI_dmps_tot", "PUI_maap_int",
        "PUI_maap_tot", "PUI_neph_int", "PUI_neph_tot", "PUI_weather");
try {
	conn = (new Smearyhteys()).getConnection(true);
	if(conn == null) {
		out.println("Too many users trying to use this API.");
		return;
	}
	String table = request.getParameter("table");
	if(table == null) {
		out.println("Parameter table missing");
		return;
	}
	if(!VALID_TABLES.contains(table)) {
		out.println("Invalid table parameter. It should be one of:");
		for(String vt : VALID_TABLES) {
			out.println(vt);
		}
		return;
	}
	String variables = request.getParameter("variables");
	if(variables == null) {
		out.println("Parameter variables missing. Please separate variable names with commas: ,");
		return;
	}
    variables = StringEscapeUtils.escapeSql(variables).replaceAll(";", "");
    String format = request.getParameter("format");
	String[] sepVars = variables.split(",");
	String type = "";
	int type_int = 0;
	if (request.getParameter("type") != null) {
		type = request.getParameter("type");
		if (type.equalsIgnoreCase("NONE")) {
			type_int = 0;
		} else if (type.equalsIgnoreCase("GEOMETRIC")) {
			type_int = 1;
		} else if (type.equalsIgnoreCase("ARITHMETIC")) {
			type_int = 2;
		} else if (type.equalsIgnoreCase("SUM")) {
			type_int = 3;
		} else if (type.equalsIgnoreCase("MEDIAN")) {
			type_int = 4;
		} else {
			out.println("Parameter type should have one of the following values: NONE, GEOMETRIC, ARITHMETIC, SUM, MEDIAN");
			return;
		}
	}
	if(format != null) {
        if(!format.equalsIgnoreCase("csv") && !format.equalsIgnoreCase("txt")) {
            out.println("Parameter format should have one of the following values: CSV, TXT");
            return;
        }
	} else {
	    format = "csv";
	}
	SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	SimpleDateFormat filenameSdf = new SimpleDateFormat("yyyyMMddhhmmss");
	Date from = null;
	Date to = null;
	try {
	    from = sdf.parse(request.getParameter("from"));
	    to = sdf.parse(request.getParameter("to"));
	} catch(Exception e) {
		out.println("Unable to parse from or to date values. Make sure from and to parameters are present and that their values are in correct format - for example: 2012-01-02 13:23:45");
		return;
	}
	Timestamp startTs = new Timestamp(from.getTime());
	Timestamp endTs = new Timestamp(to.getTime());
	String averaging = request.getParameter("averaging");
	String quality = request.getParameter("quality");
    if(quality != null && !quality.equalsIgnoreCase("ANY") && !quality.equalsIgnoreCase("CHECKED")) {
        out.println("Parameter quality should have one of the following values: ANY, CHECKED");
        return;
    }
	int min = 30;
	if (averaging != null) {
		if (averaging.equalsIgnoreCase("NONE")) {
   			min = 0;
		} else if (averaging.equalsIgnoreCase("1HOUR")){
			min = 60;
		} else if (averaging.equalsIgnoreCase("30MIN")){
			min = 30;
		} else if (averaging.equalsIgnoreCase("60MIN")) {
            min = 60;
		} else {
			out.println("Parameter averaging should have one of the following values: NONE, 1HOUR, 60MIN, 30MIN");
			return;
		}
	}
	String GEOMETRIC = "exp(avg(ln(";
	String CS = ", ";
	String[] AVG = {CS, CS+GEOMETRIC, CS+"avg(", CS+"sum(", CS};
	String[] LOPPUSULUT = {"", ")))", ")", ")", ""};

	StringBuilder sb = new StringBuilder();
	String SAMPTIME = "samptime";
	sb.append("SELECT "+SAMPTIME);
	for(String var : sepVars) {
        if (quality != null && quality.equals("CHECKED")) {
            sb.append(AVG[type_int]);
            sb.append("CASE WHEN " + var + "_EMEP = 2 THEN ");
            sb.append(var);
            sb.append(" ELSE NULL END");
            sb.append(LOPPUSULUT[type_int]);
            sb.append(" AS " + var);
        } else {
            sb.append(AVG[type_int]);
            sb.append(var);
            sb.append(LOPPUSULUT[type_int]);
            sb.append(" AS " + var);
        }
//        }
    }
	sb.append(" FROM " + table + " WHERE "+SAMPTIME+" < ? AND "+SAMPTIME+" >= ?");
	if (!type.equals("NONE")) {
		sb.append(" GROUP BY floor(timestampdiff(minute, '1990-1-1', "+SAMPTIME+") /? )");
	}
	Class.forName("com.mysql.jdbc.Driver");
	PreparedStatement ps = conn.prepareStatement(sb.toString(), java.sql.ResultSet.TYPE_FORWARD_ONLY, java.sql.ResultSet.CONCUR_READ_ONLY);
	ps.setFetchSize(Integer.MIN_VALUE);
	ps.setTimestamp(1, endTs);
	ps.setTimestamp(2, startTs);
	if (!type.equals("NONE")) {
		if (min < 30) {
			ps.setInt(3, 30);
		} else {
			ps.setInt(3, min);
		}
	}

	ResultSet rs = null;
	response.setHeader("Content-Type", "application/octet-stream; charset=utf-8");
	response.setHeader("Content-Disposition", "attachment;filename=\"smeardata_" + filenameSdf.format(from) + "." + format + "\"");

    try {
        rs = ps.executeQuery();
        if(format.equalsIgnoreCase("csv") || format.equalsIgnoreCase("txt")) {
            /*SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            SimpleDateFormat mthFormat = new SimpleDateFormat("MM");
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
            SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
            SimpleDateFormat minFormat = new SimpleDateFormat("mm");
            SimpleDateFormat secFormat = new SimpleDateFormat("ss");*/
            String separator;
            if(format.equalsIgnoreCase("csv")) {
                separator = ",";
            } else if (format.equalsIgnoreCase("txt")) {
                separator = "\t";
            } else {
                separator = ";";
            }

            StringBuilder varsHeader = new StringBuilder();
            for(String var : sepVars) {
                varsHeader.append(separator);
                varsHeader.append(table + "." + var);
            }

            if(format.equalsIgnoreCase("csv")) {
                out.println("Year" + separator + "Month" + separator + "Day" + separator + "Hour" + separator + "Minute" + separator + "Second" + varsHeader.toString());
            }
            int varsAmt = sepVars.length;
            TimeZone zoneEET = TimeZone.getTimeZone("EET");
            int offset = 0;
            while (rs.next()) {
                StringBuilder varValues = new StringBuilder();
                for(int i=2; i <= varsAmt+1; i++) {
                    float val = rs.getFloat(i);
                    String valString;
                    if(rs.wasNull()) {
                        valString = "NaN";
                    } else {
                        valString = String.valueOf(val);
                    }
                    varValues.append(separator);
                    varValues.append(valString);
                }
		        Timestamp ts = rs.getTimestamp(1, gcal ); // why UTC gcal don't help??
                Instant i = ts.toInstant();
                offset = 0;
                if (zoneEET.inDaylightTime(new Date(i.getEpochSecond()*1000))) {
                    offset = 1;
                }
		        OffsetDateTime odt = i.atOffset(ZoneOffset.ofHours(2+offset));
                out.println(odt.getYear() + separator +
                            odt.getMonthValue() + separator +
                            odt.getDayOfMonth() + separator +
                            odt.getHour() + separator +
                            odt.getMinute()  +  separator + "0"
                             + varValues.toString());
                }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {e.printStackTrace();};
	    try { if (ps != null) ps.close(); } catch (Exception e) {e.printStackTrace();};
    }

}
catch(Exception e)
{

} finally {
	try { if (conn != null && !conn.isClosed()) conn.close(); } catch (Exception e) { e.printStackTrace();};
}
%>