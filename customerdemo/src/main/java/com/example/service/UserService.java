package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {
	
	User addUser(User user);
	User getUserById(int id);
	List<User> getAllUser();

}
