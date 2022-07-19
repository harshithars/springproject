package com.java.controller;

public class CustomerController {
	@GetMapping("")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping("/add")
	public String empRegister(@ModelAttribute Customer r) {
		service.addCustomer(r);
		return "";
	}

}
