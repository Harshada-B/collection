package com.yash.collection.assignment;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StudentDao
{
	public static void main(String args[])
	{
		//public ArrayList<Student> getStudent()
		//{
			ArrayList<Student> student=new ArrayList<>();
			student.add(new Student(3,"harshada","fybcs",LocalDate.of(1999,Month.JUNE,30)));
			student.add(new Student(4,"samy","civil",LocalDate.of(2000,Month.FEBRUARY,24)));
			student.add(new Student(1,"akshada","mba",LocalDate.of(2017,Month.AUGUST,15)));
			student.add(new Student(2,"max","mbbs",LocalDate.of(1998,Month.MARCH,30)));
			//System.out.println(list);
			/*for(Student s:list) {
				System.out.println(s);
			}*/
			//using consumer interface
			
		student.stream().forEach(t->System.out.println(t));
		
		//sorted according to student id
		ArrayList<Student> sortedlist=(ArrayList<Student>) student.stream().sorted(Comparator.comparingInt(e->e.id))
				.collect(Collectors.toList());
		System.out.println("-------sorted list-------");
		sortedlist.stream().forEach(t->System.out.println(t));
		
		//sorted according to student name
		ArrayList<Student> sortname=(ArrayList<Student>) student.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println("-------sorting according to name-------");
		sortname.stream().forEach(t->System.out.println(t));
		
		System.out.println("-------name is as follows-------");
		ArrayList<Student> name=(ArrayList<Student>)student.stream().filter(t->t.getName().equals("samy")).collect(Collectors.toList());
		name.stream().forEach(t->System.out.println(t));
		
		System.out.println("-------count of student is-------");
		long count=student.stream()
				.count();
		System.out.println("Total count is::"+count);
		
		LocalDate ld=LocalDate.now();//get local date
		System.out.println("The Local Date is::"+ld);
		//}
}
}
