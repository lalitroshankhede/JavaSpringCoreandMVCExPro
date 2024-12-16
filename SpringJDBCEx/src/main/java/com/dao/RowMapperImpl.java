package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class RowMapperImpl implements RowMapper<Student>{

	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Student stud=new Student();
		
		stud.setStudid(rs.getInt(1));
		stud.setStudname(rs.getString(2));
		stud.setCity(rs.getString(3));
		
		return stud;
	}

	
	
}
