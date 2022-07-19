package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	public Customer Registration(Long Id, String username,  String Password)
	{
		Customer ALE=customerRepository.findByCustomerRegistrationnameAndIdAndPassword(Id,username,Password);
		return ALE;
	}	

}
