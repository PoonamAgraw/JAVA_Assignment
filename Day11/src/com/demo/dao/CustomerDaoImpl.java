package com.demo.dao;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
@Override
public Entry<Customer, List<Item>> findById(int cid) {
  Set<Map.Entry<Customer,List<Item>>> cset=hm.entrySet();
  for(Map.Entry<Customer,List<Item>> e:cset) {
	  if(e.getKey().getCid()==cid) {
		  return e;
		  
	  }
  }
	return null;
}
@Override
public boolean deleteById(int cid) {
List<Item> lst = hm.remove( new Customer(cid));
	return lst!=null;
}
@Override
public boolean addNewItem(int cid, Item item) {
	List<Item> lst = hm.get( new Customer(cid));
	if(lst!=null) {
		lst.add(item);
		return true;
	}
	return false;
}
@Override
public boolean deleteItem(int cid, int iid) {
	List<Item> lst = hm.get( new Customer(cid));
	return lst.remove(new Item(iid));
}

}
