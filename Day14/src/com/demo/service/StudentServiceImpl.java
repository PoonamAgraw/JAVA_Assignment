package com.demo.service;
import java.util.*;
import com.demo.beans.*;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	Scanner sc = new Scanner(System.in);
	private StudentDao sdao;

	public StudentServiceImpl() {
		sdao = new StudentDaoImpl();
	}

	@Override
	public void readFile(String string) {
           sdao.readData(string);
	}

	@Override
	public boolean addNewStudent() {
		System.out.println("Enter Student id:");
		int sid = sc.nextInt();
		System.out.println("Enter Student name:");
		String sname = sc.next();
		System.out.println("Enter Student marks:");
		int marks = sc.nextInt();
		Student s = new Student(sid,sname,marks);
		return sdao.save(s);
	}

	@Override
	public boolean deleteById(int sid) {

		return sdao.deleteById(sid);
	}

	@Override
	public boolean modifyById(int sid, int marks) {
		
		return sdao.updateById(sid,marks);
	}

	@Override
	public List<Student> displayAll() {
	
		return sdao.displayAll();
	}

	@Override
	public void writeToFile(String string) {
		
		sdao.writeData(string);
	}

	@Override
	public Student displayById(int sid) {
	
		return sdao.display(sid);
	}

	
}
