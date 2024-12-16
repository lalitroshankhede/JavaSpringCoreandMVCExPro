package com.dbconfig;

 

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.dao")
public class JDBCConfig {

	@Bean("ds")
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/SpringJDBCEx");
		ds.setUsername("root");
		ds.setPassword("Password@123");
		
		return ds;
		
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		
	JdbcTemplate jdbcTemplate=	new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
	
	}
	
	// Note : Comment on this StudentDao bean because of using @Autowired Concept here
	
	/*
	
	@Bean("studentDao")
	public StudentDao getStudentDao()
	{
		
		StudentDaoImpl dao=new StudentDaoImpl();
		
	     dao.setJdbcTemplate(getTemplate());
		
		return dao;
		
	}
	
	*/
	
	
}
