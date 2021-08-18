package com.yash.collection.classwork;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> 
{
	public int compare(Customer c1,Customer c2){  
		return c1.cname.compareTo(c2.cname);  
		}  
}
