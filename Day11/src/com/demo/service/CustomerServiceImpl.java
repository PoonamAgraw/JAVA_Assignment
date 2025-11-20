package com.demo.service;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class CustomerServiceImpl implements CustomerService{
	 private CustomerDao cdao;
	    
		public CustomerServiceImpl() {
			super();
			cdao=new CustomerDaoImpl();}
	@Override
	public boolean addanewCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer id:");
		int cid = sc.nextInt();
		System.out.println("Enter Customer Name:");
		String cname = sc.next();
		System.out.println("Enter Customer Mobile Number:");
		String cmob =sc.next();
		Customer c = new Customer(cid,cname,cmob);
		List<Item> lst = new ArrayList<>();
		String ans =null;
		do {
			System.out.println("Enter Item id:");
			int iid = sc.nextInt();
			System.out.println("Enter Item Name:");
			String iname = sc.next();
			System.out.println("Enter Item Quantity:");
			int iqty = sc.nextInt();
			System.out.println("Enter Item Price:");
			double iprice = sc.nextDouble();
			Item i = new Item(iid,iname,iqty,iprice);
			lst.add(i);
			System.out.println("Want to add more Items :");
			ans=sc.next();
		}while(ans.equals("y"));
		return cdao.addNewCustomer(c,lst);
	}
	@Override
	public Map<Customer, List<Item>> displayAll() {
		return cdao.displayAll() ;
	}
	@Override
	public Entry<Customer, List<Item>> findById(int cid) {
		
		return cdao.findById(cid);
	}
	@Override
	public boolean deleteById(int cid) {
		
		return cdao.deleteById(cid);
	}
	@Override
	public boolean addNewItem(int cid, Item item) {
		
		return cdao.addNewItem(cid,item);
	}
	@Override
	public boolean deleteItem(int cid, int iid) {

		return cdao.deleteItem(cid,iid);
	}

}
