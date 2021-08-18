package com.yash.collection.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaComparatorEx 
{
	public static void sort(ArrayList<Student>list)
	{
		Collections.sort(list,(Student s1,Student s2)->s1.getName().compareTo(s2.getName()));
		System.out.println("\n\n<--- Sorted list with Lambda - ASCENDING order --->");
        list.forEach(e->System.out.println(e.toString()));
	}
	/*public static long getObjectSize(ArrayList<Student>list)
	{
		 Object o;
		return LambdaComparatorEx.getObjectSize(list);
	}*/
	public static void main(String args[])
	{
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1,"mahindra",6));
		list.add(new Student(2,"sohum",10));
		list.add(new Student(3,"charu",8));
		list.add(new Student(4,"madhavi",12));
		list.add(new Student(5,"usha",5));
		System.out.println(list);
		LambdaComparatorEx.sort(list);
		long count=list.stream().count();//get size of list
		System.out.println("The total records are::"+count);
		//LambdaComparatorEx.getObjectSize(list);
	}
}
