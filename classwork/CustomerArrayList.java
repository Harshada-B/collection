package com.yash.collection.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CustomerArrayList
{
	public static void main(String args[])
	{
		  ArrayList<Customer> al=new ArrayList <Customer>();
		  al.add(new Customer(1,"akansha",2));
		  al.add(new Customer(2,"laren",13));
		  al.add(new Customer(3,"harshada",8));
		  al.add(new Customer(1,"akansha",2));
		  
		  System.out.println("Sorting by Name");  
		  
		  Collections.sort(al,new NameComparator());  
		  for(Customer c: al)
		  {  
		  System.out.println(c.cid+" "+c.cname+" "+c.pquantity);
		  }
			Iterator itr=al.iterator();//using iterator traverse element
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}
	
}
