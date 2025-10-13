package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import com.demo.beans.*;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImp;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService sservice = new StudentServiceImp();
		int choice=0;
		do {
			System.out.println("1.Add New Student.");
			System.out.println("2.Display All Data.");
			System.out.println("3.Search By id.");
			System.out.println("4.Search By Name.");
			System.out.println("5.Update By Average Marks.");
			System.out.println("6.Delete By Id.");
			System.out.println("7.Delete By Name.");
			System.out.println("8.Delete By Marks.");
			System.out.println("9.Sort By Id.");
			System.out.println("10.Sort By Name.");
			System.out.println("11.Sort By m1.");
			System.out.println("12.Exit.");
			System.out.println("Enter your Choice :");
		    choice=sc.nextInt();
		    switch(choice) {
		    case 1->{
		    	boolean status = sservice.addStudentData();
		    	if(status) {
		    		System.out.println("Added Successfully.");
		    	}
		    	else {
		    		System.out.println("Not Fount.");
		    	}
		    }
		    case 2->{
		    	Set<Student> eset =sservice.displayStudentData();
		    	eset.forEach(System.out::println);
		    }
		    case 3->{
		    	System.out.println("Enter id to search.");
		    	int id = sc.nextInt();
		    	Student e = sservice.SearchById(id);
		    	if(e!=null) {
		    		System.out.println(e);
		    	}
		    	else {
		    		System.out.println("Not Found.");
		    	}
		    }
		    case 4->{
		    	System.out.println("Enter name to search");
		    	String nm = sc.next();
		    	Set<Student> s=sservice.searchByName(nm);
		    	if(s!=null) {
		    		s.forEach(System.out::println);
		    	}
		    	else {
		    		System.out.println("Not Found.");
		    	}
		    }
		    case 5->{
		    	System.out.println("Enter Id ");
				int id=sc.nextInt();
				Student s= sservice.updateBySal(id);
				if(s!=null) {
					System.out.println("Enter M1");
					int m1 = sc.nextInt();
					s.setM1(m1);
					System.out.println("Enter M2");
					int m2 = sc.nextInt();
					s.setM2(m2);
					System.out.println("Enter M3");
					int m3 = sc.nextInt();
					s.setM3(m3);
					System.out.println("Update Successfully");
					
				}
				else {
					System.out.println("Not found");
				}
		    }
		    case 6->{
		    	System.out.println("Enter Id to Delete.");
		    	int id = sc.nextInt();
		    	boolean status = sservice.deleteById(id);
		    	if(status) {
		    		System.out.println("Deleted Successfully.");
		    	}
		    	else {
		    		System.out.println("Not Found");
		    	}
		    	
		    }
		    case 7->{
		    
		    	System.out.println("Enter name to delete");
		    	String nm = sc.next();
		    	boolean status = sservice.deleteByName(nm);
		    	if(status) {
		    		System.out.println("Deleted Successfully.");
		    	}
		    	else {
		    		System.out.println("Not Found");
		    }
		    }
		    case 8->{
		    	System.out.println("Enter your Marks to delete");
		    }
		    case 9->{
		    	Set<Student> s=sservice.sortById();
		    		s.forEach(System.out::println);
		    	
		    }
		    case 10->{
		    	List<Student> s=sservice.sortByName();
		    		s.forEach(System.out::println);
		    	
		    }
		    case 11->{
		    	List<Student> s=sservice.sortByM1();
		    		s.forEach(System.out::println);
		    	
		    }
		    case 12->{
		    	System.out.println("Thank you...");
		    }
		    default->{System.out.println("Wrong Choice.");
		    }
		    }
		}
        while(choice!=12);
	}

}
