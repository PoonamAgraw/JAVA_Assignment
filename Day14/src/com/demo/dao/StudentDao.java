package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	void readData(String string);

	boolean save(Student s);

	boolean deleteById(int sid);

	boolean updateById(int sid, int marks);

	List<Student> displayAll();

	void writeData(String string);

	Student display(int sid);



}
