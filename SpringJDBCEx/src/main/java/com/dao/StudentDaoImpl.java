package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bean.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Inserting Data
	@Override
	public int insert(Student student) {

		String insQuery = "insert into Student(studid,studname,city)values(?,?,?)";

		int result = jdbcTemplate.update(insQuery, student.getStudid(), student.getStudname(), student.getCity());

		return result;
	}

	// Update Data

	@Override
	public int update(Student student) {

		String updQuery = "update Student set studName=?,city=? where studid=?";

		int result = jdbcTemplate.update(updQuery, student.getStudname(), student.getCity(), student.getStudid());

		return result;
	}

	// Delete Data

	@Override
	public int delete(int studid) {

		String delQuery = "delete from Student where studid=?";

		int result = jdbcTemplate.update(delQuery, studid);

		return result;
	}

	// Get Single Student Data

	@Override
	public Student getSingleStud(int studid) {

		String singleStud = "select * from Student where studid=?";

		RowMapper<Student> rowMapper = new RowMapperImpl();

		Student stud = jdbcTemplate.queryForObject(singleStud, rowMapper, studid);

		return stud;
	}

	// Get All Student Data

	@Override
	public List<Student> getAllStud() {

		String selectAllStud = "select * from Student";

		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> list = jdbcTemplate.query(selectAllStud, new RowMapperImpl());

		return list;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
