package com.demo.beans;
import java.io.Serializable;
import java.util.Objects;

import com.demo.exception.*;
public class Student implements Serializable {
private int sid;
private String sname;
private int  marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, int marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
}


@Override
public boolean equals(Object obj) {
	Student other = (Student) obj;
	System.out.println(this.marks+"....."+other.marks);
	return this.marks == other.marks;
}
public Student(int sid) {
	super();
	this.sid = sid;
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
	
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
}

}
