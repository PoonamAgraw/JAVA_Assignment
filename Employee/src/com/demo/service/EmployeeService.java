package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int id);

	List<Employee> searchByName(String name);

	boolean deleteById(int id);

	List<Employee> deleteByName(String name);



	List<Employee> searchBySalary(double salary);

	

	List<Employee> sortBySal();

	List<Employee> sortById();

	List<Employee> sortByName();

	



}
