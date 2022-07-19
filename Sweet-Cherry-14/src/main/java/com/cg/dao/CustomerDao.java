package com.cg.dao;

import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;
import com.cg.repository.CustomerRepository;

@Repository
public class CustomerDao {
	
	public Customer addCustomer() {
		return CustomerRepository.addCustomer();
	}
	
	public Customer loginCustomer(int id) {
		return CustomerRepository.loginCustomer(id);
	}

}
