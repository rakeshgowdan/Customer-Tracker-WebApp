package com.rakesh.customerTracker.service;

import java.util.List;

import com.rakesh.customerTracker.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public boolean addCustomer(Customer c);

}
