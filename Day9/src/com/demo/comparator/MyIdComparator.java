package com.demo.comparator;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in compare"+o1.getEid()+".........."+o2.getEid());
		return o1.getEid()-o2.getEid();
	}

}
