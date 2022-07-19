package com.sweetcherry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository<Customer> extends JpaRepository<Customer, Integer> {
	Customer findByCustomerame(String Customername);
	
	
	public Customer addCustomer(Customer customer);
	
	@Query(value="select * from Customer c where c. customerId", nativeQuery=true)
	public Customer removeCustomer(long custId);
	public Customer updateCustomer(long custId, Customer customer);
	
	@Query(value="select * from Customer c where c. customerId", nativeQuery=true)
	public Customer getCustomer(long custId);
	
	@Query(value="select * from Customer c where c. customerId", nativeQuery=true)
	public List<Customer> getAllCustomer();

}
