package com.rakesh.customerTracker.service;

import java.util.List;

import com.rakesh.customerTracker.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomerByID(int id);
	public void deleteCustomer(int id);
	

}
