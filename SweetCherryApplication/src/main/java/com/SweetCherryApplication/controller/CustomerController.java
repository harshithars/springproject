package com.SweetCherryApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SweetCherryApplication.entity.Customer;
import com.SweetCherryApplication.services.CustomerService;


@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping("/add")
	public String empRegister(@ModelAttribute Customer r) {
		service.addCustomer(r);
		return "";
	}
	
	@GetMapping("/Customer")
	public List<Customer> getCustomer(){
	 List<Customer> customer=service.getAllCustomers1();
	System.out.println(customer);
	return customer;	
	}
	
	@GetMapping("/Customer{id}")
	public String updateemp(@PathVariable int id) {
		service.addAddressById(id);
		return "";
	}
	
	@PostMapping("/update Customer{id}")
	public String Updateemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.modifyAddress(id, r.getCustomerAddress());
		return "";
	}
	
	@PostMapping("/changepassword Customer{id}")
	public String changepasswordemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.modifyAddress(id, r.getCustomerAddress());
		return "";
	}
	
	@PostMapping("/deletepassword Customer{id}")
	public String deletepasswordemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.modifyAddress(id, r.getCustomerAddress());
		return "";
	}
}
