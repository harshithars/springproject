package com.sweet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sweet.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	@Query(value="SELCET * FROM Customer r Customer_id=?", nativeQuery=true)
	public Customer cancelOrder(int customer_id);
	
	@Query(value="SELECT * FROM Customer r where r.customer_id=?1", nativeQuery=true)
	public static Customer getCustomer() {
		return null;
	}
	
	@Query(value="SELECT * FROM Customer r where r.customer_id", nativeQuery=true)
	public Customer getCustomerDetails(int customer_id);
	
	@Query(value="SELECT * FROM Customer r where r.customer_id", nativeQuery=true)
	public Customer getCustomer(int customer_id);
	
	public static void updateById(int id) {
		// TODO Auto-generated method stub	
	}

	public static Customer addCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Customer updateCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Customer modifyAddress(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Customer addCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Customer loginCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
