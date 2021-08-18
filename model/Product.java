package com.yash.collection.model;

import java.util.Objects;

public class Product 
{
	private int p_id;
	private String p_name;
	private int p_price;
	public Product(int p_id, String p_name, int p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
	}
	
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(p_id, p_name, p_price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return p_id == other.p_id && Objects.equals(p_name, other.p_name) && Objects.equals(p_price, other.p_price);
	}

	public int getP_id() {
		return p_id;
	}
	
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	
	public String getP_name() {
		return p_name;
	}
	
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	
	public int getP_price() {
		return p_price;
	}
	
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	
}
