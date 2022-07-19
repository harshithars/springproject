package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return  userService.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getUserAllUsers(){
		return userService.getAllUser();
	}

}
