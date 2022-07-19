package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Customer;
import com.cg.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public Customer addCustomer(Customer r) {
		return repo.save(r);
	}
	
	public Customer getCustomerDetailsById(int id) {
		Optional<Customer> r=repo.findById((long) id);
		if(r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	public void updateCustomerById(int id) {
		CustomerRepository.updateById(id);
	}

	public List<Customer> getAllCustomers1() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void addAddressById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void modifyAddress(int id, String customerAddress) {
		// TODO Auto-generated method stub
		
	}

	public void changepasswordCustomer(int id, String customerAddress) {
		// TODO Auto-generated method stub
		
	}
}
