package com.dbconfig;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Student;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program Started...!");

		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCConfig.class);

		StudentDaoImpl dao = con.getBean("studentDao", StudentDaoImpl.class);
		Student stud = new Student();

		Scanner input = new Scanner(System.in);

		// Adding Data

		/*
		 * System.out.println("Enter Student Id"); 
		 * int id=input.nextInt();
		 * input.nextLine(); System.out.println("Enter Student Name"); String
		 * name=input.nextLine(); System.out.println("Enter Student City"); String
		 * studCity=input.next();
		 * 
		 * stud.setStudid(id); stud.setStudname(name); stud.setCity(studCity);
		 * 
		 * int res = dao.insert(stud);
		 * 
		 * System.out.println(res + " Student Added Successfully");
		 */

		// *******************************************************************

		// Update Data

		/*
		 * stud.setStudid(1005); 
		 * stud.setStudname("Manoj Shahu");
		 * stud.setCity("Jaipur");
		 * 
		 * 
		 * int res=dao.update(stud);
		 * 
		 * System.out.println(res+" Data Updated Successfully");
		 * 
		 */

		// *******************************************************************

		// Delete Data

		/*
		 * 
		 * int res=dao.delete(1005);
		 * 
		 * System.out.println(res+" Data Deleted ");
		 */

		// *******************************************************************

		
		
		  //  Get Single Student Data
		  
//		  Student student= dao.getSingleStud(1002); 
//		  System.out.println(student.getStudid()+" "+student.getStudname()+" "+student.getCity());

		   
		 

		// *******************************************************************

		
		  // Get All Student
		  
			/*
			 * List<Student> listAllStud= dao.getAllStud();
			 * 
			 * for (Student student : listAllStud) {
			 * 
			 * System.out.println(student.getStudid()+" "+student.getStudname()+" "+student.
			 * getCity()); }
			 */
		  
		 

		
	}
}
