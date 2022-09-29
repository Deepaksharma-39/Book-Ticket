package com.masai.bean;

public class Customer {

	private String name;
	private int customerId;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String name, int customerId, String username, String password) {
		super();
		this.name = name;
		this.customerId = customerId;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
