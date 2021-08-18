package com.online.model;

public class CustomerDetails {
	private int id;
	private String cust_name;
	private String cust_email;
	private String cust_password;
	
	public CustomerDetails() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_password() {
		return cust_password;
	}

	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}

	public CustomerDetails(String cust_name, String cust_email, String cust_password) {
		super();
		
		this.cust_name = cust_name;
		this.cust_email = cust_email;
		this.cust_password = cust_password;
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", cust_name=" + cust_name + ", cust_email=" + cust_email
				+ ", cust_password=" + cust_password + "]";
	}
	
	
}
