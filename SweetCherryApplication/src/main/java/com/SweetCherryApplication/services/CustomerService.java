package com.SweetCherryApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SweetCherryApplication.entity.Customer;
import com.SweetCherryApplication.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomer(Customer r) {
		return repo.save(r);
	}
	
	public Customer getCustomerDetailsById(int id) {
		Optional<Customer> r=repo.findById(id);
		if(r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	public void updateCustomerById(int id) {
		CustomerRepo.updateById(id);
	}
	
	public Customer modifyAddress(int id, String Address) {
		Customer c=getCustomerDetailsById(id);
		c.setCustomerAddress(Address);
		deleteAddressById(id);
		return repo.save(c);
	}

	private void deleteAddressById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void addAddressById(int id) {
		repo.findById();
	}
	
	public List<Customer> getAllCustomers1() {
		// TODO Auto-generated method stub
		return null;
	}

}
