package com.demo.thread;

import com.demo.beans.MyClass;

public class Table extends Thread {
	private int n;
	private MyClass ob;
	public Table(int n, MyClass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	public void run() {
		ob.printTable(n);
	}
}
