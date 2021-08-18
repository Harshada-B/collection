package com.yash.collection.classwork;

import java.util.Comparator;

public class Customer 
{
	int cid;  
	String cname;  
	int pquantity;
	public Customer(int cid, String cname, int pquantity) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", pquantity=" + pquantity + "]";
	}  
}
