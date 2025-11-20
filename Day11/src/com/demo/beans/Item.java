package com.demo.beans;

import java.util.Objects;

public class Item {
private int iid;
private String iname;
private int iQty;
private double iprice;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int iid, String iname, int iQty, double iprice) {
	super();
	this.iid = iid;
	this.iname = iname;
	this.iQty = iQty;
	this.iprice = iprice;
}

@Override
public int hashCode() {
	System.out.print("In Hash Code"+iid);
	return iid;
}
@Override
public boolean equals(Object obj) {
	return this.iid==((Item)obj).iid;
}
public Item(int iid) {
	super();
	this.iid = iid;
}
public int getIid() {
	return iid;
}
public void setIid(int iid) {
	this.iid = iid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public int getiQty() {
	return iQty;
}
public void setiQty(int iQty) {
	this.iQty = iQty;
}
public double getIprice() {
	return iprice;
}
public void setIprice(double iprice) {
	this.iprice = iprice;
}
@Override
public String toString() {
	return "Item [iid=" + iid + ", iname=" + iname + ", iQty=" + iQty + ", iprice=" + iprice + "]";
}


}
