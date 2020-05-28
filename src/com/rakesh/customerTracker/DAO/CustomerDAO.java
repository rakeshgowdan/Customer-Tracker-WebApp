package com.rakesh.customerTracker.DAO;

import java.util.List;

import com.rakesh.customerTracker.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomerByID(int id);
	public void deleteCustomer(int id);
}
