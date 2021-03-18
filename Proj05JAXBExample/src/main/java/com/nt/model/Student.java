package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private Integer stdId;
	private String sname;
	private Double stdFee;
	
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", sname=" + sname + ", stdFee=" + stdFee + "]";
	}
	
	
	

}
