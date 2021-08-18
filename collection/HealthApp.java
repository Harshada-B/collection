package com.yash.collection.assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HealthApp 
{
	public static void main(String args[])
	{
		Set<Patient> patient=new HashSet<>();
		patient.add(new Patient(1,"shekhar","pune",24));
		patient.add(new Patient(4,"vidya","moshi",89));
		patient.add(new Patient(3,"harshada","pune",23));
		patient.add(new Patient(2,"neha","pune",26));
		patient.add(new Patient(6,"urvesh","nashik",19));
		patient.add(new Patient(5,"kiran","mp",56));
		patient.add(new Patient(7,"danish","us",32));
		
		//set cantaints are
		System.out.println("HashSet::"+patient);
		
		Iterator itr=patient.iterator();//iterater created
		System.out.println("set using iterator is::");//print set content using iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
		System.out.println("First five record of patient:");
		List<Patient> cn=patient.stream().limit(5).collect(Collectors.toList());//first five record
		System.out.println(cn);
		
		System.out.println("Record of first patient in set:");//get first from set
		System.out.println(patient.stream().findFirst().get());
		
		System.out.println("Record of last patient in set:");//get lats from set
		System.out.println(patient.stream().reduce((first,second)->second).orElse(null));
	}
}
