package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	@GetMapping("/login")
	public String login() {
		return "login_page";
	}
	@PostMapping("/admin/add")
	public Customer
	addAdmin(@RequestBody Customer a)
	{
		return service.addCustomer(a);
	}
	@GetMapping("/admin")
	public Customer
	getAdmin(@PathVariable long id) {
		return service.getCustomerByid(id);
	}
	

}
