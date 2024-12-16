package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setterbean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    	
   Student student1=(Student) applicationContext.getBean("stud_data1");
   Student student2=(Student) applicationContext.getBean("stud_data2");
    	
   System.out.println(student1);
   System.out.println(student2);
    }
}
