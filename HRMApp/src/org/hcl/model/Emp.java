package org.hcl.model;

final public class Emp {
	int eno;
	String ename;
	String address;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String ename, String address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
