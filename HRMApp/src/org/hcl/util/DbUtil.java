package org.hcl.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hcl.util.DBCredentials;

public class DbUtil {
	public static final Connection getConnection(String driver, String url, String uname, String pwd) {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uname,pwd);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static DBCredentials getCredentials() {
		Properties properties = null;
		DBCredentials credentials = null;
		try {
			properties = new Properties();
			credentials = new DBCredentials();
			properties.load(new FileInputStream("D:\\spring\\workspace\\HRMApp\\src\\org\\hcl\\util\\database.properties"));
			credentials.setDriver(properties.getProperty("driver"));
			credentials.setUrl(properties.getProperty("url"));
			credentials.setUname(properties.getProperty("uname"));
			credentials.setPwd(properties.getProperty("pwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return credentials;
	}

}
