package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	void readFile(String string);

	boolean addNewStudent();

	boolean deleteById(int sid);

	boolean modifyById(int sid, int marks);

	List<Student> displayAll();

	void writeToFile(String string);

	Student displayById(int sid);

}
