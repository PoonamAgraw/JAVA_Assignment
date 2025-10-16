package com.demo.service;
import com.demo.beans.*;
import com.demo.exception.*;
import java.util.*;
public class StudentService {
	public void acceptData() throws NegativeMarksException{
		Scanner sc=new Scanner(System.in);
		Student s=new Student(12,"xxx",45);
		s.setM1(-54);
		
	}
}
