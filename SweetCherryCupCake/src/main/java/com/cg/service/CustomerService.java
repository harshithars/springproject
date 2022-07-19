package com.cg.service;

import java.util.List;

import com.cg.entity.CustomerEntity;

public interface CustomerService {
	
	 CustomerEntity saveCustomer(CustomerEntity  c) ;
	 List<CustomerEntity> getAllCustomer();
	 CustomerEntity getCustomerById(int id);	 
	 CustomerEntity updateCustomer(CustomerEntity customer, int id);
	 void deleteCustomerById(int id);

}
