package com.yash.collection.main;

import java.util.Scanner;

import com.yash.collection.serviceimpl.EmployeeServiceImpl;

public class EmsApp 
{
	public static void main(String args[])
	{

		//EmployeeServiceImpl sr=new EmployeeServiceImpl();
		//sr.getAllEmployee();
		//sr.getEmployeeByName();
		//sr.getEmployeeBySalary();

		System.out.println("1: Get All Employee List");
		System.out.println("2: Get Employee by id");
		System.out.println("3: Get Employee by salary");
		System.out.println("4: Get by name");
		System.out.println("5: exit");
		//System.out.println("Enter the choice");
		Scanner sc=new Scanner(System.in);
		//int choice=sc.nextInt();
		lp:while(true)
		{
			System.out.println("Enter the choice");
			int choice=sc.nextInt();

			switch (choice)
			{
			case 1:	System.out.println("1: Get All Employee List");
			EmployeeServiceImpl sr=new EmployeeServiceImpl();
			sr.getAllEmployee();
			break;

			case 2:System.out.println("2: Get employee by id");
			EmployeeServiceImpl sr2=new EmployeeServiceImpl();
			sr2.getEmployeeById();
			break;
			
			/*case 3:System.out.println("3: Get employee by salary");
			EmployeeServiceImpl sr3=new EmployeeServiceImpl();
			sr3.getEmployeeBySalary();
			break;*/

			case 4:	System.out.println("4: Get Employee by name");
			EmployeeServiceImpl sr4=new EmployeeServiceImpl();
			sr4.getEmployeeByName();
			break;
			
			case 5: System.out.println("5: exit");
			break;

			default:
				break;
			}

		}
	}

}		
