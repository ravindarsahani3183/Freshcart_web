package com.fresh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresh.entity.Customer;
import com.fresh.repository.CustomerRepository;

import jakarta.transaction.Transactional;
@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		this.customerRepository.save(customer);
		
	}

	@Override
	public Customer getCustomerById(int id) {
		 Optional < Customer > optional = customerRepository.findById(id);
		    Customer customer = null;
		    if (optional.isPresent()) {
		    	customer = optional.get();
		    } else {
		        throw new RuntimeException(" Customer is  not found for id :: " + id);
		    }
		    return customer;
		
	}

	@Override
	public void deleteServiceById(int id) {
		// TODO Auto-generated method stub
		this.customerRepository.deleteById(id);
	}

}
