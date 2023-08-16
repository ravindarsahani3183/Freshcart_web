package com.fresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fresh.entity.Customer;
import com.fresh.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class Fresh_Controller {

	//@Autowired
	//private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private CustomerService customerService;

	@GetMapping("/profile")
	public String home(Model model) {
		model.addAttribute("listCustomer", customerService.getAllCustomer());
		return "show";
	}

	@PostMapping("/save")
	public String save(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			System.err.println("----------" + result.toString());
			return "Sighup";
		}
		
		System.err.println("------------------"+customer);
		//customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
		customerService.saveCustomer(customer);
		
		return "redirect:/profile";
	}

	@GetMapping("/create")
	public String createForm(Model model) {
		// create model attribute to bind form data
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "Sighup";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer", customer);
		System.out.println(customer);
		return "update";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(value = "id") int id) {

		// call delete employee method
		this.customerService.deleteServiceById(id);
		return "redirect:/profile";
	}

	@GetMapping("/")
	public String home3() {
		return "home3";
	}
	
	@GetMapping("/Product")
	public String home1() {
		return "home1";
	}

	@GetMapping("/Categories")
	public String home2() {
		return "home2";
	}

	

}
