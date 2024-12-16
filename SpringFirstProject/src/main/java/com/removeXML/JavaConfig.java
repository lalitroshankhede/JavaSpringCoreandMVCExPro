package com.removeXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.removeXML")
public class JavaConfig {

	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
		
	}
	
	@Bean
	public Student getStud()
	{
		Student stud=new Student(getSamosa());
		return stud;
	}
	
	
}
