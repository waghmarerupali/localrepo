package com.bikkadit.crudrepo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

	@Id
	private int sid;
	private String sname;
	private String sadd;
	private String srank;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	public String getSrank() {
		return srank;
	}
	public void setSrank(String srank) {
		this.srank = srank;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + ", srank=" + srank + "]";
	}
	
}
