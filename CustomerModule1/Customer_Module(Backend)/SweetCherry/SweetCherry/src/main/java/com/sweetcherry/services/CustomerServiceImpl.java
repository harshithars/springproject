package com.sweetcherry.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sweetcherry.entity.Customer;
import com.sweetcherry.entity.CustomerDTO;
import com.sweetcherry.exception.CustomerNotFoundException;
import com.sweetcherry.exception.InvalidIdException;
import com.sweetcherry.repository.CustomerRepository;

/************************************************************************************
 * @author: Nisha 
 * Description: It is a service class that provides the services for register a new customer, 
                updating, deleting and viewing all the customer.
 * Created Date: 17-MAY-2022
 ************************************************************************************/
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepo;
	
	
	/************************************************************************************
	 * Method: registerCustomer 
	 * Description: To register the customer 
	 * Created By : Nisha Bharti 
	 * Created Date : 17-MAY-2022
	 ************************************************************************************/
	@Override
	public Customer registerCustomer(@RequestBody Customer customer) {
		
		return this.customerRepo.save(customer);
	}
	
	/************************************************************************************
	 * Method: updateCustomerProfile
	 * Description: To update the customer details
	 * @param customerId : as per customer ID it will update customer details 
	 * @returns object : customer details, if id found otherwise throws CustomerNotFoundException
	 * @throws CustomerNotFoundException: It is raised due to invalid customer Id 
	 * Created By :Nisha Bharti
	 * Created Date : 17-MAY-2022
	 ************************************************************************************/

	@Override
	public Customer updateCustomerProfile(CustomerDTO customerDTO) throws CustomerNotFoundException {
		Optional<Customer> customerOpt = this.customerRepo.findById(customerDTO.getCustomerId());
		if(customerOpt.isEmpty())
			throw new CustomerNotFoundException("Customer id does not exist to update.");
		
		Customer updateCustomerProfile =customerOpt.get();
		updateCustomerProfile.setCustomerName(customerDTO.getCustomerName());
		updateCustomerProfile.setMobileNumber(customerDTO.getMobileNumber());
		updateCustomerProfile.setEmail(customerDTO.getEmail());
		updateCustomerProfile.setPassword(customerDTO.getPassword());
		
		return this.customerRepo.save(updateCustomerProfile);
	}
	
	/************************************************************************************
	 * Method: allCustomerDetailsById 
	 * Description: To get the customer by Id 
	 * @param categoryId : customer ID
	 * @returns object : customer details, if id found otherwise throws InvalidIdException
	 * @throws InvalidIdException: It is raised due to invalid category Id 
	 * Created By :Nisha Bharti
	 * Created Date : 17-MAY-2022
	 ************************************************************************************/

	@Override
	public Customer allCustomerDetailsById(int customerId) throws InvalidIdException {
		Optional<Customer> customerOpt= this.customerRepo.findById(customerId);
		if(customerOpt.isEmpty())
			throw new InvalidIdException("Id Not Found");
		
		return customerOpt.get();
	}

	/**********************************************************************************************
	 * Method:getAllCustomers 
       *Description: To get all customer to the sweetCherry application
	 * @returns List of object- result, return all the resister customer Details
	 *                                             
                *Created By                                - Nisha Bharti
                *Created Date                            - 18-MAY-2022                          
	 
	 ************************************************************************************************/
	@Override
	public List<Customer> getAllCustomers() {
		
		return this.customerRepo.findAll();
	}
	
	/************************************************************************************
	 * Method: deleteCustomerById 
	 * Description: To delete the customer by Id
	 * @param customerId : customer ID
	 * @returns object : customer details if id found otherwise throws InvalidIdException
	 * @throws InvalidIdException: It is raised due to invalid customer Id 
	 * Created By : Nisha Bharti 
	 * Created Date : 18-MAY-2022
	 ************************************************************************************/
	@Override
	public Customer deleteCustomerById(int customerId) throws InvalidIdException {
		Optional<Customer> optCustomer = this.customerRepo.findById(customerId);
		if(optCustomer.isEmpty())
			throw new InvalidIdException("Customer Id does not exists to delete.");
		this.customerRepo.deleteById(customerId);
		return optCustomer.get();	
		
	}

	
	


}
