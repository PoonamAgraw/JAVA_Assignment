package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> findByName(String name);

	boolean removeById(int id);

	List<Employee> removeByName(String name);

	List<Employee> findBySalary(double salary);

	List<Employee> sortBySal();

	List<Employee> sortById();

	List<Employee> sortByName();



}
