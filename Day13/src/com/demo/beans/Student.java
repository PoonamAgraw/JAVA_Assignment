package com.demo.beans;
import com.demo.exception.*;
public class Student {
	private int eid;
	   private String ename;
	   private int m1;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int eid, String ename, int m1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.m1 = m1;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) throws NegativeMarksException {
		this.m1 = m1;
		if(m1<0)
			throw new NegativeMarksException("Marks cannot be -ve");
		else if (m1 < 5)
			throw new NegativeMarksException("Marks cannot be < 2000");
		
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", ename=" + ename + ", m1=" + m1 + "]";
	}
	
	   
}
