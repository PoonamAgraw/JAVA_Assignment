package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.thread.FactorialThread;
import com.demo.thread.PrimeNo;
import com.demo.thread.Table;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
	
		FactorialThread fth=new FactorialThread(5,ob);
		fth.start();
		Table th1=new Table(3, ob);
		th1.start();
		
		Table th2=new Table(7, ob);
		th2.start();
		
	
		PrimeNo th3=new PrimeNo(9, ob);
		Thread th=new Thread(th3);
		th.start();
		
		try {
			fth.join();
			th1.join();
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main function .");
		
		

	}

}
