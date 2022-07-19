package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	static Customer addCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	static Customer loginCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	static void updateById(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
