package com.yash.collection.serviceimpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.yash.collection.model.Product;
import com.yash.collection.service.ProductService;

public class ProductServiceImpl implements ProductService
{
	ArrayList<Product> product=new ArrayList<Product>();
	{
		product.add(new Product(1,"mobile",20000));
		product.add(new Product(2,"cosmetics",10000));
		product.add(new Product(3,"bag",1000));
		product.add(new Product(4,"pencil",20));
		product.add(new Product(5,"laptop",40000));
		product.add(new Product(6,"chocolate",200));
		product.add(new Product(1,"cover",200));
		
	}
	@Override
	public void getProductList() 
	{
		product.stream().forEach(e->System.out.println(e));
	}
	@Override
	public void sortById() 
	{
		System.out.println("---sorted list by id----");
		product.stream().sorted(Comparator.comparingInt(e->e.getP_id()))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
	}
	@Override
	public void sortByName() 
	{
		System.out.println("---sorted list by name----");
		product.stream().sorted(Comparator.comparing(e->e.getP_name())).collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	}
	@Override
	public void getFirstProduct() {
		product.stream().filter(e->e.getP_name().equals("mobilemm")).findFirst().orElse(null);
	}
	
}
