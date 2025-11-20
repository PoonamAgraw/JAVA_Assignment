package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class StudentServiceImp implements StudentService {
	
   private StudentDao sdao;
public StudentServiceImp() {
	   sdao = new StudentDaoImp();
   }
	@Override
	public boolean addStudentData() {
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter id:");
		int id =sc.nextInt();
		System.out.println("Enter Name:");
		String nm =sc.next();
		System.out.println("Enter m1:");
		int m1 =sc.nextInt();
		System.out.println("Enter m2:");
		int m2 =sc.nextInt();
		System.out.println("Enter m3:");
		int m3 =sc.nextInt();
		System.out.println("Enter your Birth Date:");
		String bdate =sc.next();
		LocalDate bd = LocalDate.parse(bdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Student s = new Student(id,nm,m1,m2,m3,bd);
		return sdao.addStudentData(s);
	}
	@Override
	public Set<Student> displayStudentData() {
		// TODO Auto-generated method stub
		return sdao.displayStudentData();
	}
	@Override
	public Student SearchById(int id) {
	
		return sdao.searchById(id);
	}
	@Override
	public Set<Student> searchByName(String nm) {
		
		return sdao.searchByName(nm);
	}
	@Override
	public Student updateBySal(int id) {
		
		return sdao.updateMarks(id);
	}
	@Override
	public boolean deleteById(int id) {
		
		return sdao.deleteByid(id);
	}
	@Override
	public boolean deleteByName(String nm) {
		
		return sdao.deletdByname(nm);
	}
	@Override
	public Set<Student> sortById() {
		
		return sdao.sortById();
	}
	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return sdao.sortByName();
	}
	@Override
	public List<Student> sortByM1() {
	
		return sdao.sortByM1();
	}
	
}
