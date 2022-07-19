package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.services.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public Customer empRegister(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return customer;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
	List<Customer> customer=service.getAllCustomers1();
	System.out.println(customer);
	return customer;
	}
	
	@PostMapping("/customer/login")
	public String login(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return "";
	}
	
	@GetMapping("/login/customer{id}")
	public String loginemp(@PathVariable int id) {
		service.addAddressById(id);
		return "";
	}
	
	

}
