package org.hcl.model;

public class DbCredentials {
	private String driver, url, uname, pwd;
	public DbCredentials() {
		// TODO Auto-generated constructor stub
	}
	public DbCredentials(String driver, String url, String uname, String pwd) {
		super();
		this.driver = driver;
		this.url = url;
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
