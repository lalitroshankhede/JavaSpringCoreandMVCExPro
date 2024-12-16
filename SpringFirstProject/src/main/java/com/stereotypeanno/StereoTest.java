package com.stereotypeanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/stereotypeanno/config.xml");

		Student stu = con.getBean("stud_obj", Student.class);
		System.out.println(stu);
		
		System.out.println("===================================");

		System.out.println(stu.getStreet());
		System.out.println(stu.getStreet().getClass().getName());
	
		
		
		Student stu2 = con.getBean("stud_obj", Student.class);
		
		 System.out.println(stu.hashCode());
		 System.out.println(stu2.hashCode());
		 
	
	}
}
