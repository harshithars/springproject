package com.sweetcherry.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Customers")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer customerId;
	
	private String customerName;
	private String email;
	private String mobileNumber;
	private String password;
	private LocalDate regDate;
	
	private Role role=Role.CUSTOMER;
	
	@OneToOne
	private Address address;
	
	@OneToMany (fetch=FetchType.EAGER)
	private List<Order> orders= new ArrayList<Order>();

	public Customer() {
		super();
	}

	public Customer(Integer customerId, String customerName, String email, String mobileNumber, String password,
			LocalDate regDate, Role role, Address address, List<Order> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.regDate = regDate;
		this.role = role;
		this.address = address;
		this.orders = orders;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	
}
