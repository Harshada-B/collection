package com.yash.collection.classwork;

import java.util.ArrayList;
import java.util.Iterator;

public class Colors
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
		list.add("Red");
		list.add("pink");
		list.add("Yellow");
		list.add("black");
		list.add(2,"Green");//Add element at given index
		//change element at index 1
		System.out.println("Update element at given index:"+list.set(1,"blue"));
		//get the element at given index
		System.out.println("Element at index 3 is:"+list.get(3));
		
		Iterator itr=list.iterator();//using iterator traverse element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
