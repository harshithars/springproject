package com.sweetcherry.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sweetcherry.entity.Customer;
import com.sweetcherry.repository.CustomerRepository;

@Repository
public class CustomerDao {
	
	@Autowired
	private CustomerRepository customerRepository;
	public Customer findCustomerByCustomerId(Integer customerId) {
		return null;
		
	}

}
