package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.examole.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Repository
public class CustomerDao {
	public CustomerRepo customerrepo;
	
	public Customer addCustomer(int id) {
		return CustomerRepo.addCustomer();
	}
	
	public Customer updateCustomer(int id) {
		return CustomerRepo.updateById();
	}
	
	public Customer modifyAddress(int id) {
		return CustomerRepo.modifyAddress();
	}
	
}
