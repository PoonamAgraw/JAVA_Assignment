package com.demo.beans;

public class SavingAccount extends Account {
	private static int  rate ;
	private static int minbalance;
	static{
		rate = 4;
		minbalance=2000;
		
	}
	public SavingAccount(String fname, String lname, int mob, String email) {
		super(fname, lname,  mob, email);
	}
	@Override
	public String toString() {
		return  super.toString()+"SavingAccount []";
	}
	

}
