package com.yash.collection.service;
import java.util.ArrayList;
import java.util.Objects;
import com.sun.tools.javac.util.List;
import com.yash.collection.model.Employee;

public interface EmployeeService 
{
	public void getAllEmployee();
	public void getEmployeeById();
	public void getEmployeeBySalary();
	public void getEmployeeByName();
}
