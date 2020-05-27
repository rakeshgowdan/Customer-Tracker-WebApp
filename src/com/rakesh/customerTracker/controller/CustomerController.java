package com.rakesh.customerTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakesh.customerTracker.DAO.CustomerDAO;
import com.rakesh.customerTracker.entity.Customer;

@Controller
@RequestMapping("Customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customer;
	
	@RequestMapping("/list")
	public String showAllCustomers(Model model) {
		
		List<Customer>theList=customer.getCustomers();
		model.addAttribute("customers",theList);
		
		return "list-Customers";
	}

}
