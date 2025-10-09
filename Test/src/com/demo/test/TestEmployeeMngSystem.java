package com.demo.test;
import java.util.Scanner;
import com.demo.service.*;

public class TestEmployeeMngSystem {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice =0;
	do {
		System.out.println("1.Add Employee Data");
		System.out.println("2.Display Data");
		System.out.println("3.Search By Id");
		System.out.println("4.Search By Name");
		System.out.println("5.Modified Salary/Charge");
		System.out.println("6.Calculate net Salary");
		System.out.println("7.Display Salaried employee");
		System.out.println("8.Display Contract Employee");
		System.out.println("9.Exit");
		System.out.println("Enter Your Choices");
		choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("1. SalariedEmp\n 2.ContractEmp\n 3.Vendor\n Enter Your Choice");
				int ch = sc.nextInt();
				boolean Status= EmployeeServices.addNewEmployee(ch);
				if(Status) {
					System.out.println("Data Found Successfully");
				}else {
					System.out.println("Error:Data Notfound ");
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
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("Thankueee For Visiting");
				break;
			default:System.out.println("Wrong Choice");
			break;
			
			
		}
	}
		while(choice!=9);
		
		
		
	
	
	
	

	}

}
