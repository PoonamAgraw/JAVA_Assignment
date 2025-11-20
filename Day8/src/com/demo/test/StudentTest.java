package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImp;
import com.demo.beans.*;

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
			System.out.println("11.Sort by name");
			System.out.println("12.Sort by id");
			System.out.println("13.Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean status = eservice.addNewSWtudent();
				if (status) {
					System.out.println("Add Successfully");
				} else {
					System.out.println("Not Found");
				}
			}
			case 2 -> {
				List<Student> studlist = eservice.displayData();
				studlist.forEach(System.out::println);
			}
			case 3 -> {
				{
					System.out.println("Enter Id to Search");
					int id = sc.nextInt();
					Student e = eservice.searchById(id);
					if (e != null) {
						System.out.println(e);
					} else {
						System.out.println("Not Founf");
					}

				}
			}
			case 4 -> {
				System.out.println("enter name for searching");
				String sname = sc.next();
				List<Student> elst = eservice.findByName(sname);
				if (elst != null) {
					elst.forEach(System.out::println);
				} else {
					System.out.println("not found");
				}
			}
			case 5 -> {
				System.out.println("Enter m1 for Average");
				int m1 = sc.nextInt();
				System.out.println("Enter m2 for Average");
				int m2 = sc.nextInt();
				System.out.println("Enter m3 for Average");
				int m3 = sc.nextInt();

			}
			case 6 -> {
				System.out.println("enetr id for delete");
				int sid = sc.nextInt();
				boolean status = eservice.deleteById(sid);
				if (status) {
					System.out.println("deleted successfully");
				} else {
					System.out.println("not found");
				}
			}
			case 7 -> {
				System.out.println("enetr Marks for Delete");
				int smarks = sc.nextInt();
				boolean status = eservice.deleteByMarks(smarks);
				if (status) {
					System.out.println("delete successfully");
				} else {
					System.out.println("not found");
				}
			}

			case 8 -> {
				System.out.println("Enter Name to Delete");
				String name = sc.next();
				List<Student> s = eservice.deleteByName(name);
				if (s != null) {
					System.out.println(s);
					System.out.println("Enter Id to Delete");
					int id = sc.nextInt();
					boolean status = eservice.deleteById(id);
					if (status) {
						System.out.println("Deleted Successfully");
					} else {
						System.out.println("Not Found.");
					}

				} else {
					System.out.println("Not Found.");
				}
			}

			case 9 -> {
				System.out.println("Enter marks to search:");
				int m1 = sc.nextInt();
				List<Student> slist= eservice.searchByMarks(m1);
				if(slist!=null) {
					slist.forEach(System.out::println);

			}
				else {
					System.out.println("Not found");
				}
			}
			case 10 -> {
				List<Student> lst=eservice.sortByM1();
				lst.forEach(System.out::println);
			}
			case 11 -> {
				List<Student> lst=eservice.sortByName();
				lst.forEach(System.out::println);
			}
			case 12 -> {
				List<Student> lst=eservice.sortById();
				lst.forEach(System.out::println);
			}
			case 13 -> {
				System.out.println("Thank you.");
			}
			default -> {
				System.out.println("Wrong Choice.");
			}
			}

		} while (choice != 10);
	}
}
