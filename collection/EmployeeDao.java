package com.yash.collection.assignment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDao 
{
	public static void main(String args[])
	{
		Map<Integer,Employee> map=new HashMap<>();
		map.put(101,new Employee(101,"radhesh",23000,"IT","Manager"));
		map.put(105,new Employee(105,"sapna",40000,"civil","HR"));
		map.put(220,new Employee(120,"radhesh",23000,"IT","Testing"));
		map.put(102,new Employee(102,"radhesh",200000,"mechanical","Analyst"));
		map.put(203,new Employee(103,"radhesh",120000,"civil","Manager"));
		
		System.out.println(map);
		
		//map.entrySet().stream().filter(e ->e.getKey().startsWith(""))
        //.forEach(m -> System.out.println(m));
		int size = map.size();//no of records
		System.out.printf("The size of the HashMap is %d%n", size);
		
		 System.out.println("Is Employee collection empty: "//check if collection is empty or not
                 + map.isEmpty());
        
	}
}
