package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

	boolean addStudentData(Student s);

	Set<Student> displayStudentData();

	Student searchById(int id);

	Set<Student> searchByName(String nm);

	Student updateMarks(int id);

	boolean deleteByid(int id);

	boolean deletdByname(String nm);

	Set<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByM1();



}
