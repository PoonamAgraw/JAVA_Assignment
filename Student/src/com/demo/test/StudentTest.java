package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImp;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService eservice = new StudentServiceImp();

		int choice = 0;
		do {
			System.out.println("1.Add New Student");
			System.out.println("2.Display Data");
			System.out.println("3.Search By Id");
			System.out.println("4.Search By Name");
			System.out.println("5.Update by Average");
			System.out.println("6.Delete by id");
			System.out.println("7.Delete by marks");
			System.out.println("8.Delete by name");
			System.out.println("9.Search by marks");
			System.out.println("10.Sort by marks");
			System.out.println("11.Sort by id");
			System.out.println("12.Sort by name");
			System.out.println("13.Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status = eservice.addNewSWtudent();
					if (status) {
						System.out.println("Add Successfully");
					} 
					else {
						System.out.println("Not Found");
					}
			}
			case 2 ->{
				List<Student> studlist = eservice.displayData();
				studlist.forEach(System.out::println);
				
				
				
			}
			}
	
    }	while(choice !=10);
}
}


