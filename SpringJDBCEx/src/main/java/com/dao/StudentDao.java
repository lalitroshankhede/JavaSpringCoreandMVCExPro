package com.dao;

import java.util.List;

import com.bean.Student;

public interface StudentDao {

	public int insert(Student student);
   
	public int update(Student student);
	
	public int delete(int studid);

	public Student getSingleStud(int studid);
	
	public List<Student> getAllStud();
	
	
	
	 
	
}
