package com.demo.beans;

public class ClassA {
	private int x;
	public final void m1() {
		System.out.println("in m1 of ClaasA");
	}

}

 class ClassB extends ClassA{
	 
	 //Compile time error
//	 public void m1() {
//			System.out.println("in m1 of ClaasA");
//		}
//	
}