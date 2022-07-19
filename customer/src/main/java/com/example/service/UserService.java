package com.example.service;

import java.util.List;

import org.apache.tomcat.jni.User;

public interface UserService {
	public User addUser(User user);
	 
	 public List<User> getAllUser();
	 
	 public User updateUser(User user);
	 
	 public void delete(long id);
	 public User getUserById(long id);
}
