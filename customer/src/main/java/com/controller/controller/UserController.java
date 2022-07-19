package com.controller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	private UserService service;
	@PostMapping("/api/blog")
	public ResponseEntity<User> createBlog(@RequestBody User blog){
	 return new ResponseEntity<User>(service.addBlog(blog),HttpStatus.OK);
	}
	@GetMapping("/blog")
	public List<User> getBlog(){
	 return service.getAllUser();
	}
	@GetMapping("/api/blog/{id}")
	public ResponseEntity<User> getBlogById(@PathVariable("id") long id){
	 return new ResponseEntity<User>(service.getBlogById(id),HttpStatus.OK);
	}
	@PutMapping("/api/blog/{id}")
	public ResponseEntity<User> updateBlog(@PathVariable("id") long id,@RequestBody User blog){
	 return new ResponseEntity<User>(service.updateBlog(blog),HttpStatus.OK);
	}
	@DeleteMapping("/api/blog/{id}")
	public ResponseEntity<User> deleteBlog(@PathVariable ("id") long id){
	 service.delete(id);
	 return new ResponseEntity<User>(HttpStatus.OK);
	}
}
