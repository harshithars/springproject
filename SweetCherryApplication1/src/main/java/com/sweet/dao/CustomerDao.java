package com.sweet.dao;

import org.springframework.stereotype.Repository;

import com.sweet.entity.Customer;
import com.sweet.repository.CustomerRepo;

@Repository
public class CustomerDao {
	
	public Customer addCustomer() {
		return CustomerRepo.addCustomer();
	}
	
	public Customer updateCustomer(int id) {
		return CustomerRepo.updateCustomer(id);
	}
	
	public Customer modifyAddress(int id) {
		return CustomerRepo.modifyAddress(id);
	}
	
	public Customer loginCustomer(int id) {
		return CustomerRepo.loginCustomer(id);
	}
	
}
