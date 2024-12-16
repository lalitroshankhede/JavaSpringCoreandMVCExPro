package com.removeXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
	    Student stu=con.getBean("getStud",Student.class);
	
	    System.out.println(stu);
	    stu.study();
	}
}
