package org.hcl.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hcl.model.DbCredentials;

public class DbUtil {
	public static Connection getConnection(String driver, String url, String user, String pwd) {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static final DbCredentials getCredentials() {
		DbCredentials credentials = null;
		Properties properties = null;
		try {
			properties = new Properties();
			credentials = new DbCredentials();
			properties.load(new FileInputStream("D:\\spring\\workspace\\ShoppingCartApp\\Resources\\datasource.properties"));
			credentials.setDriver(properties.getProperty("driver"));
			credentials.setUrl(properties.getProperty("url"));
			credentials.setUser(properties.getProperty("user"));
			credentials.setPwd(properties.getProperty("pwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return credentials;
	}

}
