package com.cg.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.entity.CustomerEntity;
import com.cg.exception.ResourseNotFoundException;
import com.cg.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public CustomerEntity saveCustomer(CustomerEntity c) {
		// TODO Auto-generated method stub
		return customerRepository.save(c);

	}

	@Override
	public List<CustomerEntity> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public CustomerEntity getCustomerById(int id) {
		Optional<CustomerEntity> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			return customer.get();
		} else
			throw new ResourseNotFoundException("Customer", "Id", id);

	}

	@Override
	public CustomerEntity updateCustomer(CustomerEntity customer, int id) {
		// check whether customer existed or not

		CustomerEntity existedCustomer = customerRepository.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("Customer", "Id", id));
		existedCustomer.setName(customer.getName());
		existedCustomer.setPassword(customer.getPassword());
		existedCustomer.setEmail(customer.getEmail());
		existedCustomer.setCity(customer.getAddress());
		customerRepository.save(existedCustomer);
		return existedCustomer;
	}

	@Override
	public void deleteCustomerById(int id) {
		// check whether the customer is exist or not
		customerRepository.findById(id).orElseThrow(() -> new ResourseNotFoundException("Customer", "id", id));
		customerRepository.deleteById(id);

	}

}
