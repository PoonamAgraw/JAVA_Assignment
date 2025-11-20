package com.demo.test;

import java.security.KeyStore.Entry;
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
			case 1 -> {
				boolean status = cservice.addanewCustomer();
				if (status) {
					System.out.println("Successfully Added.");
				} else {
					System.out.println("Not Found.");
				}

			}
			case 2 -> {
				Map<Customer, List<Item>> cmp = cservice.displayAll();
				Set<Customer> keys = cmp.keySet();
				keys.forEach(c -> System.out.println(c + "---->" + cmp.get(c)));

			}
			case 3 -> {
				System.out.println("Enter Cusomer Id");
				int cid = sc.nextInt();
				Map.Entry<Customer, List<Item>> data = cservice.findById(cid);
				if (data != null) {
					System.out.println(data.getKey() + "......." + data.getValue());
				} else {
					System.out.println("Not found");
				}

			}
			case 4 -> {
				System.out.println("Enter Cusomer Id");
				int cid = sc.nextInt();
				boolean status = cservice.deleteById(cid);
				if (status) {
					System.out.println("Deleted Successfully.");
				} else {
					System.out.println("Not Found.");
				}

			}
			case 5 -> {
				System.out.println("Enter Cusomer Id");
				int cid = sc.nextInt();
				System.out.println("Enter Item id:");
				int iid = sc.nextInt();
				System.out.println("Enter Item Name:");
				String iname = sc.next();
				System.out.println("Enter Item Quantity:");
				int iqty = sc.nextInt();
				System.out.println("Enter Item Price:");
				double iprice = sc.nextDouble();
				boolean status = cservice.addNewItem(cid, new Item(iid, iname, iqty, iprice));
				if (status) {
					System.out.println("Successfully Added.");
				} else {
					System.out.println("Not Found.");
				}

			}
			case 6 -> {
				System.out.println("Enter Cusomer Id");
				int cid = sc.nextInt();
				System.out.println("Enter Item id:");
				int iid = sc.nextInt();
				boolean status = cservice.deleteItem(cid,iid);
				if (status) {
					System.out.println("Deleted Successfully.");
				} else {
					System.out.println("Not Found.");
				}
			}
			case 7 -> {
				System.out.println("Thank you.");
			}
			default -> {
				System.out.println("Wrong Choice.");
			}

			}

		} while (choice != 7);

	}

}
