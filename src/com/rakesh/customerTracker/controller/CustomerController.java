package com.rakesh.customerTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Customer")
public class CustomerController {
	
	@RequestMapping("/list")
	public String showAllCustomers(Model model) {
		
		
		return "list-Customers";
	}

}
