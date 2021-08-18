package com.yash.collection.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Test 
{
	public static void main(String args[])
	{
		Integer a=new Integer(8);
		Integer b=new Integer(4);
		Integer c=new Integer(4);
		Vector vec=new Vector();
		Iterator itr;
		vec.add(a);
		vec.add(b);
		vec.add(c);
		itr=vec.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}
	}
}
