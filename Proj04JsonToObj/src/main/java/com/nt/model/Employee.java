package com.nt.model;

public class Employee {
	
	private int uid;
	private String uname;
	private double usal;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public double getUsal() {
		return usal;
	}
	public void setUsal(double usal) {
		this.usal = usal;
	}
	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", uname=" + uname + ", usal=" + usal + "]";
	}
	
	
	

}
