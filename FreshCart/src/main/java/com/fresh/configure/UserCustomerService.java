/*package com.fresh.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.fresh.entity.Customer;
import com.fresh.repository.CustomerRepository;
@Component
public class UserCustomerService implements UserDetailsService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {
		
		
		Customer customer	= customerRepository.findByEmail(em);
		if(customer==null)
		{
			throw new UsernameNotFoundException("no customer");
		}
		else
		{
			return new CustomUserCustomer(customer);
		}
			
		
		
		
		
	}

}
*/