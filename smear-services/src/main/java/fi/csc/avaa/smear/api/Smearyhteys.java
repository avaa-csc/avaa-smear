/**
 * 
 */
package fi.csc.avaa.smear.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;*/

/**
 * @author pj
 *
 */
public class Smearyhteys {
	static final String AJURI= "com.mysql.jdbc.Driver";
	static final String PROPERTIES = "/opt/avaa/liferay-portal/tomcat/shared/smear.properties";
	static int port=3320;
	static final String URL = "jdbc:mysql://db5.csc.fi:"+port+"/smear";
	static final String USER = "AVAA-read";
	String passwd;
	
	public Smearyhteys() {
		Properties prop = new Properties();
		try {
			File f = new File(PROPERTIES);
			FileInputStream in = new FileInputStream(f);
			prop.load(in);
	
			passwd = prop.getProperty("salasana");
		} catch (IOException ex) {
    		ex.printStackTrace();
        }
	}
	
	public Connection getConnection(boolean tuotanto) {
		Connection connection = null;	
		try {
		    Class.forName(AJURI);
		}  catch (  ClassNotFoundException e ) {
		    System.err.println(AJURI+" ajuria ei löytynyt");
		    return null;
		}
		try {
			connection = DriverManager.getConnection(URL, USER, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
