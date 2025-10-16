package com.demo.test;
import java.util.Scanner;

import com.demo.exception.NegativeMarksException;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		for(int i=0;i<3;i++) {
			try {
				System.out.println("enter Marks");
				int m1=sc.nextInt();
				if(m1<0) {
					throw new NegativeMarksException("Marks cannot be -ve");
				}
				System.out.println("Marks"+m1);
				break;
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			} catch (NegativeMarksException e) {
				System.out.println(e.getMessage());
			}
	}

	}}





		
		
		
