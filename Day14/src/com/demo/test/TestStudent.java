package com.demo.test;

import com.demo.service.*;
import com.demo.beans.*;
import java.util.List;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService sservice = new StudentServiceImpl();
		sservice.readFile("stud.txt");
		int choice = 0;
		do {
			System.out.println("1.Add new Student data.");
			System.out.println("2.Delete by id.");
			System.out.println("3.Modify by id.");
			System.out.println("4.Display All.");
			System.out.println("5.Display by Student id.");
			System.out.println("6.Exit.");
			System.out.println("Enter your Choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean status = sservice.addNewStudent();
				if (status) {
					System.out.println("Added Successfully.");
				} else {
					System.out.println("Not Added.");
				}
			}

			case 2 -> {
				System.out.println("Enter Student id to delete:");
				int sid = sc.nextInt();
				boolean status = sservice.deleteById(sid);
				if (status) {
					System.out.println("Deleted Successfully.");
				} else {
					System.out.println("Not Found.");
				}
			}

			case 3 -> {
				System.out.println("Enter Student id to delete:");
				int sid = sc.nextInt();
				System.out.println("Enter Student new marks:");
				int marks = sc.nextInt();
				boolean status = sservice.modifyById(sid, marks);
				if (status) {
					System.out.println("Modify Successfully.");
				} else {
					System.out.println("Not Found.");
				}
			}
			case 4 -> {
                  List<Student> lst = sservice.displayAll();
                  lst.forEach(System.out::println);
			}
			case 5 -> {
				System.out.println("Enter Student id:");
				int sid = sc.nextInt();
				Student s=sservice.displayById(sid);
				if(s!=null) {
					System.out.println(s);
				}
				else {
					System.out.println("id nout found.");
				}
			}

			case 6 -> {
				sservice.writeToFile("stud.txt");
				
                  System.out.println("Thank you.");
			}
            default->{
            	System.out.println("Wrong Choice.");
            }
			}

		} while (choice != 6);

	}

}
