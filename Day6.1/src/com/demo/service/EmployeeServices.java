package com.demo.service;
import java.util.*;
import java.util.Date;

import java.text.SimpleDateFormat;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Employee;
import com.demo.beans.ContractEmp;

public class EmployeeServices {
	
	static Employee[] emparr;
	static int count;
	static {
		emparr=new Employee[100];
	    emparr[0]= new SalariedEmp ("RamuKaka", new Date(2003,03,15),"Hr","Designer",89867);
	    emparr[1]= new SalariedEmp ("Thakur", new Date(2004,04,15),"Hr","Designer",89867);
	    emparr[0]= new ContractEmp ("poonam", new Date(2004,04,19),"hr", "Designer",99, 23232);
	    emparr[1]= new ContractEmp ("prajakta", new Date(2004,04,19),"hr", "Designer",99, 23232);
	    count=4;
	}
	public static boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner (System.in);
		
		if(count<emparr.length) {
			System.out.println("Enter name");
			String nm = sc.next();
			System.out.println("Enter birth date (dd/MM/yyyy)");
			String bdate=sc.next();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dt=null;
	
			
		}
		
		return false;
	}

}
