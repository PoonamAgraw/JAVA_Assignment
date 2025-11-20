package com.demo.thread;

import java.util.concurrent.Callable;

public class MyClassThread implements Callable<Integer>{
   private int start;
   private int end;
   
	public MyClassThread(int start, int end) {
	super();
	this.start = start;
	this.end = end;
}

	@Override
	public Integer call() throws Exception {
		int sum =0;
		for(int i =start;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println("in thread "+Thread.currentThread().getId()+"---->"+start+","+end);
		return sum;
	}

}
