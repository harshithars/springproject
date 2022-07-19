package com.sweetcherry.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sweetcherry.demo.entity.CustomerEntity;
import com.sweetcherry.repository.CustomerRepository;

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
		model.addAttribute("customerEntity", new CustomerEntity());
		return "signup_Form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "register_success";
	}
	
	/*@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav=new ModelAndView("/login");
		mav.addObject("admin",new CustomerEntity());
		return mav;
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("admin") CustomerEntity customerEntity){
		CustomerEntity oautCustomerEntity=CustomerService.login(customerEntity.getFirstname(),customerEntity.getPassword());
		System.out.println(oautCustomerEntity);
		if(Objects.nonNull(oautCustomerEntity)) {
			return "redirect:/";
		} else {
			return "redirect:/login";
		}
	}*/
	
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("customerEntity", new CustomerEntity());
		return "login_Form";
	}
	
	@PostMapping("/process_login")
	public String processLogin(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "login_success";
	}
	
	@GetMapping("/logout")
	public String showLogoutForm(Model model) {
		model.addAttribute("customerEntity", new CustomerEntity());
		return "logout_Form";
	}
	
	@PostMapping("/process_logout")
	public String processLogout(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "logout_success";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(Model model) {
		model.addAttribute("customerEntity", new CustomerEntity());
		return "update_Form";
	}
	
	@PostMapping("/process_update")
	public String processUpdate(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "update_success";
	}
	
	@GetMapping("/changepassword")
	public String showChangePasswordForm(Model model) {
		model.addAttribute("customerEntity", new CustomerEntity());
		return "changepassword_Form";
	}
	
	@PostMapping("/process_changepassword")
	public String processChangePassword(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "changepassword_success";
	}
	
	@GetMapping("/forgetpassword")
	public String showForgetPasswordForm(Model model) {
		model.addAttribute("customerEntity", new CustomerEntity());
		return "forgetpassword_Form";
	}
	
	@PostMapping("/process_login")
	public String processForgetPassword(CustomerEntity customerEntity) {
		repo.save(customerEntity);
		return "forgetpassword_success";
	}

}
