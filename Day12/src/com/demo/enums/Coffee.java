package com.demo.enums;

public enum Coffee {
small(150,150.00),medium(250,250.00),large(350,350.00);
	private double price;
	private int size;
	private Coffee(int size,double price) {
		System.out.println("In Coffee Constructor");
		this.size=size;
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
	public int getSize() {
		return size;
	}
	
	
}
