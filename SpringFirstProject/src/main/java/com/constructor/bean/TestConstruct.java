package com.constructor.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstruct {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/bean/conconfig.xml");
		Person person = (Person) context.getBean("PersonData");

		System.out.println(person);
		
		
		Addition add=(Addition) context.getBean("add");
		add.sum();
		
		
		
		
	}

}
