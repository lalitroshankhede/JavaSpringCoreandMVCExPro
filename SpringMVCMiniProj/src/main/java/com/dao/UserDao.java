package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Component
public class UserDao {

	
	 //Automatically generate getter and setter HibernateTemplate
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int createUser(User user)
	{
       int result=(int) hibernateTemplate.save(user);  // perform insert database operation 
       
       return result;
	}
	
	public List<User> getAllUser()
	{
		return hibernateTemplate.loadAll(User.class);  // select all database object through loadAll();
	}
	
	
	
	
	
}
