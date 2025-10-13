package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewSWtudent();

	List<Student> displayData();

	Student searchById(int id);

	List<Student> findByName(String sname);

	boolean deleteById(int sid);

	List<Student> deleteByName(String name);

	boolean deleteByMarks(int smarks);

	

	

	

	

}
