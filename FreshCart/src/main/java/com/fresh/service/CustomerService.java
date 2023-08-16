package com.fresh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fresh.entity.Customer;

import jakarta.transaction.Transactional;

public interface CustomerService {
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(int id);
	void deleteServiceById(int id);
	

}
