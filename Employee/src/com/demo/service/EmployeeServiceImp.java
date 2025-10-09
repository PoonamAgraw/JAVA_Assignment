package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao edao;
	
	public EmployeeServiceImp() {
		 edao = new  EmployeeDaoImp();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int empid=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("enetr salary");
		double sal=sc.nextDouble();
		System.out.println("entr joining date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(empid,nm,sal,ldt);
		return edao.save(e);
		
	}

	@Override
	public List<Employee> displayAll() {
		return edao.findAll();
	}

	@Override
	public Employee searchById(int id) {
		return edao.findById(id);
	}

	@Override
	public List<Employee> searchByName(String name) {
		return edao.findByName(name);
		
	}

	

	@Override
	public boolean deleteById(int id) {

		return edao.removeById(id);
	}

	@Override
	public List<Employee> deleteByName(String name) {
		
		return edao.removeByName(name);
	}

	

	@Override
	public List<Employee> searchBySalary(double salary) {
		
		return edao.findBySalary(salary);
	}

	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortBySal();
	}

	@Override
	public List<Employee> sortById() {
		
		return edao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
	
		return edao.sortByName();
	}


	
	
		

}
