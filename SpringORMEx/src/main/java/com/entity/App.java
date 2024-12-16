package com.entity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

        // Create
        StudentInfo student = new StudentInfo();
        student.setStudId(2);
        student.setStudName("Mick Will");
        student.setStudCity("USA");
        studentDao.saveStudent(student);

        
        /* 
         
        // Read
        StudentInfo retrievedStudent = studentDao.getStudent(1);
        System.out.println("Retrieved: " + retrievedStudent.getStudName());

        // Update
        retrievedStudent.setStudCity("Los Angeles");
        studentDao.saveStudent(retrievedStudent);

        // Get all students
        List<StudentInfo> students = studentDao.getAllStudents();
        students.forEach(s -> System.out.println(s.getStudName()));

        // Delete
        studentDao.deleteStudent(1);
        System.out.println("Student with ID 1 deleted.");
        
        */
    }
}
