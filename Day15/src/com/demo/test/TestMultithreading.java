package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.thread.FactorialThread;
import com.demo.thread.PrimeNo;
import com.demo.thread.Table;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		MyClass ob1=new MyClass();
		MyClass ob2=new MyClass();
		MyClass ob3=new MyClass();
		MyClass ob4=new MyClass();
		FactorialThread fth=new FactorialThread(5,ob1);
		fth.start();

		Table th1=new Table(3, ob2);
		th1.start();
		
		Table th2=new Table(7, ob3);
		th2.start();
		
	
		PrimeNo th3=new PrimeNo(9, ob4);
		Thread th=new Thread(th3);
		th.start();
		
		try {
			fth.join();
			th1.join();
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main function ");
		
		

	}

}
