package com.fresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fresh.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	/*
	 * @Query("select c from Customer c where c.email= :email") public Customer
	 * getCustomerByCustomerName(@Param("email") String email);
	 */
	
	/*
	 * @Query("select c from Customer c where c.email= :email and c.password=:password"
	 * ) public Customer getCustomerByCustomerNameAndPassword(@Param("email") String
	 * email, @Param("password") String password);
	 */
	
	public Customer findByEmail(String em);
}
