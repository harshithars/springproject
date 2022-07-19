package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User(1, "Harshitha", "R S", "harshitha@gamil.com"));
		this.userRepository.save(new User(1, "Harshitha", "R S", "harshitha@gamil.com"));
		this.userRepository.save(new User(1, "Harshitha", "R S", "harshitha@gamil.com"));
		this.userRepository.save(new User(1, "Harshitha", "R S", "harshitha@gamil.com"));
		
	}

}
