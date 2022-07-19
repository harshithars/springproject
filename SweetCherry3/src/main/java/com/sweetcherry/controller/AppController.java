package com.sweetcherry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sweetcherry.entity.User;
import com.sweetcherry.repository.UserRepository;

@Controller
public class AppController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		return "signup_Form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		return "register_success";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "login_Form";
	}
	
	@PostMapping("/process_login")
	public String processLogin(User user) {
		repo.save(user);
		return "login_success";
	}
	
	@GetMapping("/logout")
	public String showLogoutForm(Model model) {
		model.addAttribute("user", new User());
		return "logout_Form";
	}
	
	@PostMapping("/process_logout")
	public String processLogout(User user) {
		repo.save(user);
		return "logout_success";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(Model model) {
		model.addAttribute("user", new User());
		return "update_Form";
	}
	
	@PostMapping("/process_update")
	public String processUpdate(User user) {
		repo.save(user);
		return "update_success";
	}
	
	@GetMapping("/changepassword")
	public String showChangePasswordForm(Model model) {
		model.addAttribute("user", new User());
		return "changepassword_Form";
	}
	
	@PostMapping("/process_changepassword")
	public String processChangePassword(User user) {
		repo.save(user);
		return "changepassword_success";
	}
	
	@GetMapping("/forgetpassword")
	public String showForgetPasswordForm(Model model) {
		model.addAttribute("user", new User());
		return "forgetpassword_Form";
	}
	
	@PostMapping("/process_login")
	public String processForgetPassword(User user) {
		repo.save(user);
		return "forgetpassword_success";
	}
	

}
