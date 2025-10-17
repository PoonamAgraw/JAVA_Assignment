package com.demo.beans;

public class MyClass {
	private int x ;
	

	public MyClass() {
		super();
		this.x = 5;
	}

	synchronized public int factorial(int n) {
		x=x+10;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end of factorial"+x);
		return fact;
	}
	
	public void printTable(int n) {
		x=x+20;
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end of table"+x);
	}
	
	public boolean checkPrime(int n) {
		x=x+30;
		for(int i=2;i<n;i++) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			if(n%i==0)
				return false;
		}
		System.out.println("End of prime"+x);
		return true;
	}
}
