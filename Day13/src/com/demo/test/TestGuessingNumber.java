package com.demo.test;
import java.util.*;
import com.demo.exception.*;
public class TestGuessingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num1 = 45;
	    while(true) {
	    	try {
	    	System.out.println("Enter a Number:");
	    	int num2=sc.nextInt();
	    	if(num1==num2) {
	    		System.out.println("Yeahh!!! you guess correct number.");
	    		break;
	    	}
	    	else if(num2>num1) {
	    		throw new WrongNumberException("Number is greater .");
	    	}
	    	else{
	    
	    		throw new WrongNumberException("Number is smaller .");
	    	}
	    	
	    	}catch(WrongNumberException e) {
	    		System.out.println(e.getMessage());
	    	}
	    }
	

	}

}
