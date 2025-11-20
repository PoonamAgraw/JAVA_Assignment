package com.demo.dao;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.Student;
import com.demo.beans.*;
import com.demo.beans.Student;

public class StudentDaoImp implements StudentDao {
	 static List<Student> slist;
	static{
		slist = new ArrayList<>();
		slist.add(new Student(1, "Arjun", 89, 92, 93, LocalDate.of(2002,02,02)));
		slist.add(new Student(2, "Raju", 79, 82, 39, LocalDate.of(2025,03,05)));
		slist.add(new Student(1, "Rohit", 92, 98, 82, LocalDate.of(2006,8,10)));
	}
	
	

	@Override
	public boolean save(Student s) {
		
		return slist.add(s);
	}



	@Override
	public List<Student> displayAll() {
		
		return slist;
	}



	@Override
	public Student findById(int id) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			return slist.get(pos);
		}
		return null;
	
	
	}



	@Override
	public List<Student> FindByName(String sname) {
		List<Student> temp=new ArrayList<>();
		for(Student e:slist) {
			if(e.getSname().equals(sname)) {
				temp.add(e);
			}
		}
		return temp; 
	}



	@Override
	public boolean removeById(int sid) {
		
		return slist.remove(new Student(sid) ) ;
	}



	


	@Override
	public List<Student> removeByName(String name) {
		List<Student> temp= slist.stream()
                .filter(emp->emp.getSname().equals(name))
                .collect(Collectors.toList());
		if(temp.size()>0) {
	      
	          }
		  return temp;
	}



	@Override
	public boolean deleteByMarks(int smarks) {
		return slist.remove(new Student(smarks) );
	}



	@Override
	public List<Student> searchByMarks(int m1) {
		List<Student> lst = slist.stream().filter(std->std.getM1()==m1).collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}



	@Override
	public List<Student> sortByM1() {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			lst.add(s);
		}
		lst.sort(null);
		return lst;
	}



	@Override
	public List<Student> sortByName() {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			lst.add(s);
		}
		Comparator<Student> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getSname().compareTo(o2.getSname());
		};
		lst.sort(c);
		return lst;
	}



	@Override
	public List<Student> sortById() {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			lst.add(s);
		}
		Comparator<Student> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getSid()-(o2.getSid());
		};
		lst.sort(c);
		return lst;
	}



	


	
}
