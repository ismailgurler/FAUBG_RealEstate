package com.faubg.rea.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.faubg.rea.model.Property;

@Repository
public class PropertyDaoImpl implements PropertyDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Property> findAllResaleProperties() {
		List<Property> properties = new ArrayList<Property>();

		properties = sessionFactory.getCurrentSession()
				.createQuery("from Property where rental is false")
				.list();
		return properties;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Property> findAllRentalProperties() {
		List<Property> properties = new ArrayList<Property>();

		properties = sessionFactory.getCurrentSession()
				.createQuery("from Property where rental is true")
				.list();
		return properties;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}