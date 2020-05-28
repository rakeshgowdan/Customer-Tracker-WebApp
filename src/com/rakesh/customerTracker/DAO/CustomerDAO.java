package com.rakesh.customerTracker.DAO;

import java.util.List;

import com.rakesh.customerTracker.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomers();
	public boolean addCustomer(Customer c);
	
}
