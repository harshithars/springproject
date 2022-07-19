package com.appli.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appli.demo.entity.Customer;
import com.appli.deomo.CustomerRepo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomerDetailsById(int id) {
		Optional<Customer> c=repo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
	}
	
	public void updateCustomerById(int id) {
		repo.updateById(id);
	}
	
	public Customer modifyAddress(int id, String Address) {
		Customer c=addCustomerDetailsById(id);
		c.setCustomraddress(Address);
		return repo.save(c);
	}

}
