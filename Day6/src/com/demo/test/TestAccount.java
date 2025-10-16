package com.demo.test;
import java.util.Scanner;

import com.demo.services.AccountService;
public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice =0;
        do {
        	System.out.println("1.Add Account.");
        	System.out.println("2.Display All.");
        	System.out.println("7.Exit.");
        	System.out.println("Enter your Choice :");
        	choice =sc.nextInt();
        	switch(choice) {
        	case 1:System.out.println("1.Saving\n2.Current\n3.DemateAccount");
        	int ch =sc.nextInt();
        	boolean status = AccountService.addAccount(ch);
        	if(status) {
        		System.out.println("Added Succesfull");
        		
        	}
        	else {
        		System.out.println("Error : Not Added.");
        	}
        		break;
        	case 2:
        		break;
        	case 3:
        		break;
        	case 4:
        		break;
        	case 5:
        		break;
        	case 6:
        		break;
        	case 7:System.out.println("Thank you .");
        		break;
        	default: System.out.println("Wrong Choice");
        	}
        }
        while(choice!=7);
	}

}
