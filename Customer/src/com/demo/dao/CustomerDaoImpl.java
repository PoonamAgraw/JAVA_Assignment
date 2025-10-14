package com.demo.dao;
import java.util.List;
import java.util.Map;
import com.demo.beans.Customer;
import com.demo.beans.Item;
import java.util.ArrayList;
import java.util.HashMap;

public class CustomerDaoImpl implements CustomerDao {
static Map<Customer,List<Item>> hm;
static {
	hm=new HashMap<>();
	Customer c = new Customer(10,"Babli","55555");
	List<Item> lst = new ArrayList<>();
	lst.add(new Item(105,"Chair",5,789.00));
	lst.add(new Item(101,"Table",10,79.00));
	lst.add(new Item(109,"Cupboard",2,99.00));
	hm.put(c,lst);
	Customer c1 = new Customer(1,"Bablu","33333");
	List<Item> lst1 = new ArrayList<>();
	lst1.add(new Item(105,"Rice",5,789.00));
	lst1.add(new Item(101,"Wheat",10,79.00));
	lst1.add(new Item(109,"Bajra",2,99.00));
	hm.put(c1, lst1);
}

@Override
public boolean addNewCustomer(Customer c, List<Item> lst) {
	if(!hm.containsKey(c)) {
		hm.put(c,lst);
		return true;
	}
	return false;
}
@Override
public Map<Customer, List<Item>> displayAll() {

	return hm;
}

}
