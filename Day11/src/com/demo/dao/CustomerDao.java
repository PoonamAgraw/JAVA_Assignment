package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface CustomerDao {



	boolean addNewCustomer(Customer c, List<Item> lst);

	Map<Customer, List<Item>> displayAll();

	Entry<Customer, List<Item>> findById(int cid);

	boolean deleteById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean deleteItem(int cid, int iid);

}
