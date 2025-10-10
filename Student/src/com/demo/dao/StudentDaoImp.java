package com.demo.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import com.demo.beans.Student;

public class StudentDaoImp implements StudentDao {
	 static List<Student> elist;
	static{
		elist = new ArrayList<>();
		elist.add(new Student(1, "Arjun", 89, 92, 93, LocalDate.of(2002,02,02)));
		elist.add(new Student(2, "Raju", 79, 82, 39, LocalDate.of(2025,03,05)));
		elist.add(new Student(1, "Rohit", 92, 98, 82, LocalDate.of(2006,8,10)));
	}
	
	

	@Override
	public boolean save(Student s) {
		elist.add(s);
		return false;
	}



	@Override
	public List<Student> displayAll() {
		
		return elist;
	}

}
