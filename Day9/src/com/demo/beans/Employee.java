package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String ename;
	private double salary;
	private LocalDate jdt;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename) {
		super();
		this.ename = ename;
	}
	public Employee(int empid, String ename, double salary, LocalDate jdt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.jdt = jdt;
	}
   
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.empid+"----"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
	}
	public Employee(int eid) {
		super();
		this.empid = eid;
	}
	public int getEid() {
		return empid;
	}
	public void setEid(int eid) {
		this.empid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJdt() {
		return jdt;
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + empid + ", ename=" + ename + ", salary=" + salary + ", jdt=" + jdt + "]";
	}
	@Override
	public int compareTo(Employee ob) {
		System.out.println("In compareTo method"+this.empid+"........."+ob.empid);
	System.out.println("In compareTo method"+this.salary+"............."+ob.salary);
	
		return (int)(this.salary-ob.salary);
	}
	

}
