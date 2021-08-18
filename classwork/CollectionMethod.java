package com.yash.collection.classwork;

import java.util.ArrayList;

public class CollectionMethod 
{
	public static void main(String args[])
	{
	ArrayList al=new ArrayList();//create array list
	System.out.println("initial size of array:"+al.size());
	
	al.add(1);//adding element to array
	al.add("harshada");
	al.add("B");
	al.add(1, "sun");//add a2 at index 1
	
	System.out.println("Size after adding element:"+al.size());//printing array size
	
	System.out.println("Array elements are:"+al);//display array
	al.remove("B");//remove the element
	System.out.println("Array after removing element"+al);
	}
}
