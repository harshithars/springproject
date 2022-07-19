package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository; 
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
