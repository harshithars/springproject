package com.sweetcherry.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_Details")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_email")
	private String customermail;
	
	@Column(name="customer_password")
	private String customerPassword;

	public CustomerEntity(Integer id, String userId, String customerName, String customermail,
			String customerPassword) {
		super();
		this.id = id;
		this.userId = userId;
		this.customerName = customerName;
		this.customermail = customermail;
		this.customerPassword = customerPassword;
	}

	public CustomerEntity() {
		
	}
}
