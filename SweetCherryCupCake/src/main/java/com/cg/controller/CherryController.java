package com.cg.controller;

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

import com.cg.entity.CustomerEntity;
import com.cg.service.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customers")
public class CherryController {
	
	@Autowired
	private CustomerService customerService;

	public CherryController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	//build create customer REST API
	@PostMapping
	public ResponseEntity<CustomerEntity> saveCustomer(@RequestBody CustomerEntity customer){
		return new ResponseEntity<CustomerEntity>(customerService.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	// get all customer using rest API
	@GetMapping("/getAll")
	public List<CustomerEntity> getAllCustomers(){
		return customerService.getAllCustomer();
	}
	
	// get by id using rest API
	@GetMapping("{id}")
	public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable("id")int id){
		return new ResponseEntity<CustomerEntity>(customerService.getCustomerById(id), HttpStatus.OK);
	}
	
	// update customer using rest API
	@PutMapping("{id}")
	public ResponseEntity<CustomerEntity> updateCustomer(@PathVariable("id")int id,@RequestBody CustomerEntity customer){
		return new ResponseEntity<CustomerEntity>(customerService.updateCustomer(customer, id), HttpStatus.OK);
	}
	
	//delete customer by id using rest API
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable("id")int id){
		customerService.deleteCustomerById(id);
		
		return new ResponseEntity<String>("Customer deleted succesfully!",HttpStatus.OK);
	}

}
