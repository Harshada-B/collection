package com.yash.collection.main;

import java.util.Scanner;

import com.yash.collection.serviceimpl.ProductServiceImpl;

public class ProductApp 
{
	public static void main(String args[])
	{
		System.out.println("1:Get the list of product");
		System.out.println("2:sort by id");
		System.out.println("3:sort by name");
		System.out.println("4:find first");
		Scanner sc=new Scanner(System.in);
		lp:while(true)
		{
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			ProductServiceImpl ps=new ProductServiceImpl();
			switch(choice)
			{
			case 1:System.out.println("1:Get Product List");
			ps.getProductList();
			break;
			case 2: System.out.println("2:Get the list sort by id");
			ps.sortById();
			break;
			case 3:System.out.println("3:Get the list sort by name");
			ps.sortByName();
			break;
			case 4:System.out.println("4:Get first");
			ps.getFirstProduct();
			break;
			}
		}
	}
}
