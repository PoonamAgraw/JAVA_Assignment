package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


import com.demo.dao.*;
import com.demo.beans.*;

import com.demo.dao.StudentDao;

public class StudentServiceImp implements StudentService {
	
	private StudentDao edao;
	
	public  StudentServiceImp() {
		edao = new StudentDaoImp();
	}

	@Override
	public boolean addNewSWtudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int sid = sc.nextInt();
		System.out.println("Enter Name");
		String sname = sc.next();
		System.out.println("Enter Marks m1");
		int m1 = sc.nextInt();
		System.out.println("Enter Marks m2");
		int m2 = sc.nextInt();
		System.out.println("Enter Marks m3");
		int m3 = sc.nextInt();
		System.out.println("Enter A Birth Date");
		String bdate = sc.next();
		
		LocalDate ldt = LocalDate.parse(bdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Student s = new Student( sid, sname,  m1,  m2,  m3, ldt);
		return edao.save(s);
	}

}
