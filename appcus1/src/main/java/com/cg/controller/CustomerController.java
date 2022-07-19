package com.cg.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.entity.Customer;



@Controller
public class CustomerController {
	
	@GetMapping("/home")
	public List<Customer> getCustomer() {
		List<Customer> customer=service.getAllCustomers1();
		System.out.println(customer);
		return customer;
		}

}
