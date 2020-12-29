package org.hcl.model;

public class Emp {
	private Integer eno;
	private String name, address;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
