package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Student {
private int sid;
private String sname;
private int m1;
private int m2;
private int m3;
private LocalDate bdate;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, int m1, int m2, int m3, LocalDate bdate) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	this.bdate = bdate;
}

public Student(int sid) {
	super();
	this.sid = sid;
}
@Override
public int hashCode() {
	System.out.println("In HashCode"+"..............."+sid);
	return sid;
}
@Override
public boolean equals(Object obj) {
	System.out.println("In Equals Method"+this.sid+"............."+((Student)obj).sid);
	return this.sid==((Student)obj).sid;
	}
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
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
public LocalDate getBdate() {
	return bdate;
}
public void setBdate(LocalDate bdate) {
	this.bdate = bdate;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", bdate=" + bdate
			+ "]";
}

}
