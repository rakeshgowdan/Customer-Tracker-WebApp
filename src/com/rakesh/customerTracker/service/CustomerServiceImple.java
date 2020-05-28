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

}
