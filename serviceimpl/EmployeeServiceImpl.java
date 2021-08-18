package com.yash.collection.serviceimpl;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.collection.model.Employee;
import com.yash.collection.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	Scanner sc=new Scanner(System.in);

	ArrayList<Employee> emp=new ArrayList<>();
	{
		emp.add(new Employee(1,"megha",39998,"traniee","pune"));
		emp.add(new Employee(102,"shiv",40000,"ceo","dheu"));
		emp.add(new Employee(104,"usha",120000,"tester","pune"));
		emp.add(new Employee(107,"harshada",120000,"analyst","nashik"));
		emp.add(new Employee(103,"mayuri",50000,"developer","chincwad"));
	}

	@Override
	public void getAllEmployee() {
		emp.stream().forEach(t->System.out.println(t));
		//System.out.println(list);
	}
	@Override
	public void getEmployeeById() {
		System.out.println("Employee ID :");
		int empId=sc.nextInt();
		Employee e=emp.stream().filter(id->id.getId()==empId).collect(Collectors.toList()).get(0);
		System.out.println(emp);
	}


	@Override
	public void getEmployeeBySalary() {
		emp.stream()
		.collect(Collectors.toMap(Employee::getId, Employee::getSalary));
	}
	@Override
	public void getEmployeeByName() {
		ArrayList<Employee> empByName=(ArrayList<Employee>)emp.stream().filter(t->t.getName().equals("mayuri")).collect(Collectors.toList());
		empByName.stream().forEach(t->System.out.println(t));
	}

}

