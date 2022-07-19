package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SweetCherryLogin;
import com.example.demo.service.SweetCherryLoginService;

@RestController
public class SweetCheeryLoginController {
	@Autowired
	private SweetCherryLoginService service;
	
	@GetMapping("/")
	public String hello() {
		return "Hello!";
	}
	
	@PostMapping("/SweetCherryLogin/login")
	@CrossOrigin(origins= "*", allowedHeaders= "*")
	public SweetCherryLogin login(@RequestBody SweetCherryLogin c) {
		return service.login(c);
	}
	
	@PostMapping("/SweetCherryLogin/add")
	public SweetCherryLogin add(@RequestBody SweetCherryLogin c) {
		return service.add(c);
	}
	
}
