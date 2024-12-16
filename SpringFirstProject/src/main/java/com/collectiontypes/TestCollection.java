package com.collectiontypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/collectiontypes/collection-config.xml");
		Emp emp1 = (Emp) context.getBean("empData");

		System.out.println(emp1.getEmpId() + " " + emp1.getEmpName() + " " + emp1.getCity() + " " + emp1.getPhones()
				+ " " + emp1.getCourses() + " " + emp1.getProps());

	}
}
