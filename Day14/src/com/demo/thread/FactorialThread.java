package com.demo.thread;
import com.demo.beans.*;
public class FactorialThread extends Thread {
private int n;
private MyClass ob;
public FactorialThread(int n, MyClass ob) {
	super();
	this.n = n;
	this.ob = ob;
}
public void run() {
	int ans=ob.factorial(n);
	System.out.println("Factorial: "+ans);
}
}
