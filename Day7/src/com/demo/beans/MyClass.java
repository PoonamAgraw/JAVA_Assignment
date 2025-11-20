package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MyClass implements I1,I2 {


	@Override
	public int m1() {
		System.out.println("in m1 method");
		return 0;
		
	}

	@Override
	public int m2(int x) {
	    System.out.println("in m2 method "+x);
		return 10;
	}

	/*@Override
	public void m2() {
		System.out.println("in m2 method without parameter");
		
	}*/

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}



	//@Override
//	public int m4() {
//		I1.super.m4();
//		return I2.super.m4();
//		
//	}
//	

}
