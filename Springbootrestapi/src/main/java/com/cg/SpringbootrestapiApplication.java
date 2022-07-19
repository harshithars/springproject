package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@CrossOrigin("*")
@RequestMapping("/api")
public class SpringbootrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapiApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return "Hello World! Welcome to Spring boot and React Hooks!";
	}

}
