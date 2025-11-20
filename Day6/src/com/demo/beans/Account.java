package com.demo.beans;

public class Account {
	private String fname;
	private String lname;
	private int mob;
	private String email;
	protected double  balance;
	private static int  cnt;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String fname, String lname, int mob, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mob = mob;
		this.email = email;
	
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Account [fname=" + fname + ", lname=" + lname + ", mob=" + mob + ", email=" + email + ", balance="
				+ balance + "]";
	}
	
	
	

}
