package com.demo.test;
import com.demo.enums.*;
import java.util.*;
import com.demo.beans.Person;
public class TestPerson {


	public static void main(String[] args) {
		Person p = new Person(12,"rahul",Gender.female);
		System.out.println(p);
		for(Gender g:Gender.values()) {
			System.out.println(g);
		}
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Person id");
	    int pid = sc.nextInt();
	    System.out.println("Enter Person Name");
	    String pname = sc.next();
	    System.out.println("Enter Person Gender");
	    String g = sc.next();
	    Gender g1 = Gender.valueOf(g);
	    Person p2 = new Person( pid,  pname,  g1);
	    System.out.println(p2);
             

	}

}
