package com.SweetCherryApplication.deo;

import org.springframework.stereotype.Repository;

import com.SweetCherryApplication.entity.Customer;
import com.SweetCherryApplication.repository.CustomerRepo;

@Repository
public class CustomerDao {

public CustomerRepo customerrepo;
	
	public Customer addCustomer(int id) {
		return CustomerRepo.addCustomer();
	}
	
	public Customer updateCustomer(int id) {
		return CustomerRepo.updateById();
	}
	
	public Customer modifyAddress(int id) {
		return CustomerRepo.modifyAddress();
	}
	

}
