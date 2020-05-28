package com.rakesh.customerTracker.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.customerTracker.DAO.CustomerDAO;
import com.rakesh.customerTracker.entity.Customer;


@Service
public class CustomerServiceImple implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void addCustomer(Customer c) {
		 customerDAO.addCustomer(c);
	}

	@Override
	@Transactional
	public Customer getCustomerByID(int id) {
		
		return customerDAO.getCustomerByID(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

}
