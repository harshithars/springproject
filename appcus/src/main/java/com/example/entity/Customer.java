package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String name;
	private String email;
	private String date;
	private String password;
	private String address;
	
	public Customer(String name, String email, String date, String password, String address) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.password = password;
		this.address = address;
	}

	public Customer() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", date=" + date + ", password=" + password
				+ ", address=" + address + "]";
	}

	public void setCustomerAddress(String address2) {
		// TODO Auto-generated method stub
		
	}
	
}
