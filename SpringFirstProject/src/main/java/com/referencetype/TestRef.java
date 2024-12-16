package com.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/referencetype/reftype.xml");
		
	A obj1=(A) context.getBean("aref");
 
	 System.out.println(obj1.getX()+" "+obj1.getOb().getY());
	  
	 System.out.println(obj1.getClass());
	 
	
	}

}
