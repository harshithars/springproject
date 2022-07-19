package com.appli.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.appli.demo.Service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String hrllo() {
		return "hello";
	}

}
