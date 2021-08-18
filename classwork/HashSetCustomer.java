package com.yash.collection.classwork;

import java.util.HashSet;

public class HashSetCustomer 
{
	public static void main(String[] args) {  
	    HashSet<Customer> set=new HashSet<Customer>();  
	    //Creating customer data  
	    Customer c1=new Customer(101,"harsh",8);  
	    Customer c2=new Customer(102,"melvin",4);  
	    Customer c3=new Customer(103,"mark",6);  
	    //Adding customer to HashSet  
	    set.add(c1);  
	    set.add(c2);  
	    set.add(c3);  
	    //Traversing HashSet  
	    for(Customer b:set)
	    {  
	    System.out.println(b.cid+" "+b.cname+" "+b.pquantity);  
	    }  
}
}