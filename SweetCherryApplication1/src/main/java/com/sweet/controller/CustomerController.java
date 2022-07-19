package com.sweet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.sweet.entity.Customer;
import com.sweet.services.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/add")
	public String empRegister(@ModelAttribute Customer r) {
		service.addCustomer(r);
		return "";
	}
	
	@GetMapping("/Customer")
	public List<Customer> getCustomer() {
	List<Customer> customer=service.getAllCustomers1();
	System.out.println(customer);
	return customer;
	}
	
	@GetMapping("/register Customer{id}")
	public String registeremp(@PathVariable int id) {
		service.addAddressById(id);
		return "";
	}
	
	@GetMapping("/login Customer{id}")
	public String loginemp(@PathVariable int id) {
		service.addAddressById(id);
		return "";
	}
	
	@GetMapping("/logout Customer{id}")
	public String logoutemp(@PathVariable int id) {
		service.addAddressById(id);
		return "";
	}
	
	@GetMapping("/update Customer{id}")
	public String Updateemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.modifyAddress(id, r.getCustomerAddress());
		return "";
	}
	
	@GetMapping("/changepassword Customer{id}")
	public String changepasswordemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.changepasswordCustomer(id, r.getCustomerAddress());
		return "";
	}
	
	@GetMapping("/deletepassword Customer{id}")
	public String deletepasswordemp(@PathVariable int id, @ModelAttribute Customer r) {
		service.changepasswordCustomer(id, r.getCustomerAddress());
		return "";
	}
	
}
