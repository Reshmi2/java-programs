package org.hcl.model;

public class User {
	private int userid;
	private String userName, password, gender, designation;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String userName, String password, String gender, String designation) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.designation = designation;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
