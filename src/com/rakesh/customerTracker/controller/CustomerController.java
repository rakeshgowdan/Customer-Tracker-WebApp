package com.rakesh.customerTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rakesh.customerTracker.DAO.CustomerDAO;
import com.rakesh.customerTracker.entity.Customer;
import com.rakesh.customerTracker.service.CustomerService;

@Controller
@RequestMapping("Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customer;
	
	@GetMapping("/list")
	public String showAllCustomers(Model model) {
		
		List<Customer>theList=customer.getCustomers();
		model.addAttribute("customers",theList);
		
		return "list-Customers";
	}
	
	@GetMapping("/showAddCustomer")
	public String showAddCustomer(Model theModel) {
		Customer c=new Customer();
		theModel.addAttribute("customer", c);
		return "Add-Customer";
	}
	@PostMapping("/saveCustomer")
	public String addCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		
		customer.addCustomer(theCustomer);
		return "redirect:/Customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theId,Model themodel) {
		
		Customer theCustomer=customer.getCustomerByID(theId);
		themodel.addAttribute("customer", theCustomer);
		return "Add-Customer";
		
	}
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId")int id) {
		customer.deleteCustomer(id);
		return "redirect:/Customer/list";
		
	}

}
