package com.demo.services;
import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;

public class AccountService {

	static Account [] arr;
	static int count;
	static {
		arr = new Account[100];
		arr[0] =new SavingAccount("Raju", "Ambani", 465167574," raju@gmail.com");
		arr[1]= new CurrentAccount("Ramu", "Adani", 641565154, "ramu@gmail.com");
		count=2;
	}
	public static boolean addAccount(int ch) {
		Scanner sc = new Scanner (System.in);
		if(count<arr.length) {
			System.out.println("Enter your name:");
			String fname = sc.next();
			System.out.println("Enter Ypur Last Name");
			String lname = sc.next();
			System.out.println("Enter Your Mobile Number");
			int mob = sc.nextInt();
			System.out.println("Enter Your Mobile Number");
			String email = sc.next();
			
			if(ch==1) {
				arr[count]=new SavingAccount( fname, lname, mob, email);
				count++;
		}else if(ch==2) {
			System.out.println("Enter Your Mobile Number");
			int transaction = sc.nextInt();
			arr[count]=new CurrentAccount( fname, lname, mob, email);
			count++;
		}else {
			
		}
			return true;
	}
		return false;
	}
}
