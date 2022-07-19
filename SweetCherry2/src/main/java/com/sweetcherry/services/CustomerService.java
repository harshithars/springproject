package com.sweetcherry.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweetcherry.entity.Customer;
import com.sweetcherry.repository.CustomerRepository;

@Service
public interface CustomerService {
	
	Customer findByCustomername(String Customername);
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer changepasswordCustomer(Customer customer);
	Customer forgetpasswordCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer saveCustomer(Customer customer);
	Object findBy(long custId);
	
	
}
