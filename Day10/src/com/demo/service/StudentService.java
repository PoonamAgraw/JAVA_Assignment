package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addStudentData();

	Set<Student> displayStudentData();

	Student SearchById(int id);

	Set<Student> searchByName(String nm);

	Student updateBySal(int id);

	boolean deleteById(int id);

	boolean deleteByName(String nm);

	Set<Student> sortById();

	List<Student> sortByName();

	List<Student> sortByM1();

	



}
