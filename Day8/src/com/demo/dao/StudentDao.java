package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	List<Student> displayAll();

	Student findById(int id);

	List<Student> FindByName(String sname);

	boolean removeById(int sid);



	List<Student> removeByName(String name);

	boolean deleteByMarks(int smarks);

	List<Student> searchByMarks(int m1);

	List<Student> sortByM1();

	List<Student> sortByName();

	List<Student> sortById();

}
