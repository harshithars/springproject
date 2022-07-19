package com.sweetcherry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerdata")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_email")
	private String customermail;
	
	@Column(name="customer_password")
	private String customerPassword;

	public Customer(Integer id, String customerId, String customerName, String customermail, 
			String customerPassword) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customermail = customermail;
		this.customerPassword = customerPassword;
	}
	
	public Customer() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomermail() {
		return customermail;
	}

	public void setCustomermail(String customermail) {
		this.customermail = customermail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName + ", "
				+ "customermail="
				+ customermail + ", customerPassword=" + customerPassword + "]";
	}
	
}
