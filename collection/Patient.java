package com.yash.collection.assignment;

import java.util.List;
import java.util.stream.Collector;

public class Patient 
{
	int p_id;
	String p_name;
	String p_address;
	int age;
	public Patient(int p_id, String p_name, String p_address, int age) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_address = p_address;
		this.age = age;
	}
	/**
	 * @return the p_id
	 */
	public int getP_id() {
		return p_id;
	}
	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	/**
	 * @return the p_name
	 */
	public String getP_name() {
		return p_name;
	}
	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	/**
	 * @return the p_address
	 */
	public String getP_address() {
		return p_address;
	}
	/**
	 * @param p_address the p_address to set
	 */
	public void setP_address(String p_address) {
		this.p_address = p_address;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", p_name=" + p_name + ", p_address=" + p_address + ", age=" + age + "]";
	}
	
}
