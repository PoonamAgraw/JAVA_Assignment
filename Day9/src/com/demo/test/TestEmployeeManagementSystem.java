package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.service.*;

public class TestEmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImp();

		int choice = 0;
		do {
			System.out.println("1.Add New Employee");
			System.out.println("2.Display Data");
			System.out.println("3.Search By Id");
			System.out.println("4.Search By Name");
			System.out.println("5.Update salary");
			System.out.println("6.Delete by id");
			System.out.println("7.Delete by salary");
			System.out.println("8.Delete by name");
			System.out.println("9.Search by salarye");
			System.out.println("10.Sort by salary");
			System.out.println("11.Sort by id");
			System.out.println("12.Sort by name");
			System.out.println("13.Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = eservice.addNewEmployee();
				if (status) {
					System.out.println("Add Successfully");
				} else {
					System.out.println("Not Found");
				}
			}
			case 2 -> {
				List<Employee> emplist = eservice.displayAll();
				emplist.forEach(System.out::println);

			}
			case 3 -> {
				System.out.println("Enter Id to Search");
				int id = sc.nextInt();
				Employee e = eservice.searchById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not Founf");
				}

			}
			case 4 -> {
				System.out.println("Enter your name to search");
				String name = sc.next();
				List<Employee> e = eservice.searchByName(name);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Nout Found.");
				}
			}
			case 5 -> {
				System.out.println("Enter Id to Update Salary");
				int id = sc.nextInt();
				Employee e = eservice.searchById(id);
				System.out.println("Enter Salary to update.");
				double salary = sc.nextDouble();
				e.setSalary(salary);
				if (e != null) {
					System.out.println("Update Sussfully");
				} else {
					System.out.println("Not Found");
				}
			}
			case 6 -> {
				System.out.println("Enter Id to Delete");
				int id = sc.nextInt();
				boolean status = eservice.deleteById(id);
				if (status) {
					System.out.println("Deleted Successfully");
				} else {
					System.out.println("Not Found.");
				}

			}
			case 7 -> {
				System.out.println("Enter your salary to delete");
				double salary = sc.nextDouble();
				List<Employee> e = eservice.searchBySalary(salary);
				if (e != null) {
					System.out.println(e);
					System.out.println("Enter Id to Delete");
					int id = sc.nextInt();
					boolean status = eservice.deleteById(id);
					if (status) {
						System.out.println("Deleted Successfully");
					} else {
						System.out.println("Not Found.");
					}
				} else {
					System.out.println("Nout Found.");
				}

			}
			case 8 -> {
				System.out.println("Enter Name to Delete");
				String name = sc.next();
				List<Employee> e = eservice.deleteByName(name);
				if (e != null) {
					System.out.println(e);
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
				System.out.println("Enter your salary to search");
				double salary = sc.nextDouble();
				List<Employee> e = eservice.searchBySalary(salary);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Nout Found.");
				}
			}
			case 10 -> {
				List<Employee> lst = eservice.sortBySal();
				lst.forEach(System.out::println);
			}

			case 11 -> {
				List<Employee> lst = eservice.sortById();
				lst.forEach(System.out::println);
			}
			case 12 -> {
				List<Employee> lst=eservice.sortByName();
				lst.forEach(System.out::println);
			}
			case 13 -> {
				System.out.println("Exit");

			}
			default -> System.out.println("Wrong Choice");

			}

		} while (choice != 13);
	}
}
