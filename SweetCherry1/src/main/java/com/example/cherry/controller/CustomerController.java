package com.example.cherry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository repo;
	
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("customerEntity", new Customer());
		return "signup_Form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(Customer customer) {
		repo.save(customer);
		return "register_success";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "login_Form";
	}
	
	@PostMapping("/process_login")
	public String processLogin(Customer customer) {
		repo.save(customer);
		return "login_success";
	}
	
	@GetMapping("/logout")
	public String showLogoutForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "logout_Form";
	}
	
	@PostMapping("/process_logout")
	public String processLogout(Customer customer) {
		repo.save(customer);
		return "logout_success";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "update_Form";
	}
	
	@PostMapping("/process_update")
	public String processUpdate(Customer customer) {
		repo.save(customer);
		return "update_success";
	}
	
	@GetMapping("/changepassword")
	public String showChangePasswordForm(Model model) {
		model.addAttribute("customerEntity", new Customer());
		return "changepassword_Form";
	}
	
	@PostMapping("/process_changepassword")
	public String processChangePassword(Customer customer) {
		repo.save(customer);
		return "changepassword_success";
	}
	
	@GetMapping("/forgetpassword")
	public String showForgetPasswordForm(Model model) {
		model.addAttribute("customerEntity", new Customer());
		return "forgetpassword_Form";
	}
	
	@PostMapping("/process_login")
	public String processForgetPassword(Customer customer) {
		repo.save(customer);
		return "forgetpassword_success";
	}

}
