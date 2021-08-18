package com.yash.collection.classwork;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleLinkList 
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Harshada");
		list.add("usha");
		list.add("shailesh");
		list.add("akshay");
		//after add method
		System.out.println("the elements in list:"+list);
		LinkedList <String> list1=new LinkedList<String>();
		list1.add("mac");
		list1.add("dev");
		//System.out.println("Adding 2nd list to first list:"+list.addAll(list1));
		list.addAll(1,list1);//add list1 element in list
		Iterator <String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
