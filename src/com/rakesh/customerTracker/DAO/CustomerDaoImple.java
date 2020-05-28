package com.rakesh.customerTracker.DAO;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rakesh.customerTracker.entity.Customer;

@Repository
public class CustomerDaoImple implements CustomerDAO {

	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Customer> getCustomers() {
		
		Session session=sf.getCurrentSession();
		Query<Customer> theQuery=session.createQuery("from Customer order by first_name",Customer.class);
		List<Customer> list=theQuery.getResultList();
		return list;
	}

	@Override
	public boolean addCustomer(Customer c) {
		Session session=sf.getCurrentSession();
		session.save(c);
		return true;
	}

}
