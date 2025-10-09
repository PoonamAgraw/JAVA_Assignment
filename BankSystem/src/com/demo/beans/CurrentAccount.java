package com.demo.beans;

public class CurrentAccount extends Account{
	private static int  rate ;
	private static int minbalance;
	private   static int transaction;
	static{
		rate = 1;
		minbalance=1000;
		transaction=0;
		
	}
	
	public CurrentAccount(String fname, String lname, int mob, String email) {
		super(fname, lname,  mob, email);
		
	}

	@Override
	public String toString() {
		return super.toString()+ "CurrentAccount []";
	}
}
