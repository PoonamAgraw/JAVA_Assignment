package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class TestCustomerManagementSystem {

	public static void main(String[] args) {
		CustomerService cservice = new CustomerServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add New Customer.");
			System.out.println("2.Display All.");
			System.out.println("3.Display By Customer.");
			System.out.println("4.Delete by Customer.");
			System.out.println("5.Add new item in existing order.");
			System.out.println("6.Delete from existing order.");
			System.out.println("7.Exit.");
			System.out.println("Enter your Choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {boolean status = cservice.addanewCustomer();
			if(status) {
				System.out.println("Successfully Added.");
			}
			else {
				System.out.println("Not Found.");
			}
                    
			}
			case 2 -> {Map<Customer,List<Item>> cmp=cservice.displayAll();
			Set<Customer> keys=cmp.keySet();
			keys.forEach(c->System.out.println(c+"---->"+cmp.get(c)));

			}
			case 3 -> {
				System.out.println("Enter Cusomer Id");

			}
			case 4 -> {

			}
			case 5 -> {

			}
			case 6 -> {

			}
			case 7 -> {
                System.out.println("Thank you.");
			}
			default->{
				System.out.println("Wrong Choice.");
			}

			}

		}
		while (choice != 7);

	}

}
