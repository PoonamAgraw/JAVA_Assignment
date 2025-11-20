package com.demo.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImp implements EmployeeDao {
 static List<Employee> emplist;
 static {
	 emplist = new ArrayList<>();
	 emplist.add(new Employee(100,"Raju", 89999,LocalDate.of(2024, 11, 12)));
	 emplist.add(new Employee(101,"Athrva", 999,LocalDate.of(2022, 10, 05)));
	 emplist.add(new Employee(102,"Raju", 89999,LocalDate.of(2002, 5, 15)));
	 }
 
	@Override
	public boolean save(Employee e) {
	    emplist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() {
		
		return emplist;
	}

	@Override
	public Employee findById(int id) {
		int pos = emplist.indexOf(new Employee(id));
		if(pos!=-1) {
			return emplist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> temp= emplist.stream()
                .filter(emp->emp.getEname().equals(name))
                .collect(Collectors.toList());

       if(temp.size()>0) {
        return temp;
          }
        return null;
	}

	@Override
	public boolean removeById(int id) {
		
		return emplist.remove(new Employee(id));
	}

	@Override
	public List<Employee> removeByName(String name) {
		List<Employee> temp= emplist.stream()
                .filter(emp->emp.getEname().equals(name))
                .collect(Collectors.toList());
		if(temp.size()>0) {
	        return temp;
	          }
		return null;
	}

	@Override
	public List<Employee> findBySalary(double salary) {
		List<Employee> temp= emplist.stream()
                .filter(emp->emp.getSalary()==(salary))
                .collect(Collectors.toList());

       if(temp.size()>0) {
        return temp;
          }
        return null;

	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:emplist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}


	@Override
	public List<Employee> sortById() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:emplist) {
			lst.add(e);
		}
		//lst.sort(new MyNameComparator());
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getEid()-o2.getEid();
		};
		lst.sort(c);
		return lst;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:emplist) {
			lst.add(e);
		}
		//lst.sort(new MyNameComparator());
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getEname().compareTo(o2.getEname());
		};
		lst.sort(c);
		return lst;
	}

	
	

}
