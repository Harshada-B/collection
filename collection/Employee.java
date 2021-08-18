package com.yash.collection.assignment;

public class Employee
{
int e_id;
String e_name;
double e_salary;
String e_dept;
String e_desig;
public Employee(int e_id, String e_name, double e_salary, String e_dept, String e_desig) {
	super();
	this.e_id = e_id;
	this.e_name = e_name;
	this.e_salary = e_salary;
	this.e_dept = e_dept;
	this.e_desig = e_desig;
}
@Override
public String toString() {
	return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", e_dept=" + e_dept
			+ ", e_desig=" + e_desig + "]";
}
/**
 * @return the e_id
 */
public int getE_id() {
	return e_id;
}
/**
 * @param e_id the e_id to set
 */
public void setE_id(int e_id) {
	this.e_id = e_id;
}
/**
 * @return the e_name
 */
public String getE_name() {
	return e_name;
}
/**
 * @param e_name the e_name to set
 */
public void setE_name(String e_name) {
	this.e_name = e_name;
}
/**
 * @return the e_salary
 */
public double getE_salary() {
	return e_salary;
}
/**
 * @param e_salary the e_salary to set
 */
public void setE_salary(double e_salary) {
	this.e_salary = e_salary;
}
/**
 * @return the e_dept
 */
public String getE_dept() {
	return e_dept;
}
/**
 * @param e_dept the e_dept to set
 */
public void setE_dept(String e_dept) {
	this.e_dept = e_dept;
}
/**
 * @return the e_desig
 */
public String getE_desig() {
	return e_desig;
}
/**
 * @param e_desig the e_desig to set
 */
public void setE_desig(String e_desig) {
	this.e_desig = e_desig;
}

}
