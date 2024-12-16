package com.autowiringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/autowiringEx/auto-config.xml");

		Emp emp = (Emp) con.getBean("emp1");

		System.out.println(emp);

	}

}
