package com.dao;

import com.entity.StudentInfo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveStudent(StudentInfo student) {
		
	  int i=(int) hibernateTemplate.save(student);
	  
		
	}

	

	/*
	 * public StudentInfo getStudent(int id) { Session session =
	 * sessionFactory.getCurrentSession(); return session.get(StudentInfo.class,
	 * id); }
	 * 
	 * public List<StudentInfo> getAllStudents() { Session session =
	 * sessionFactory.getCurrentSession(); return
	 * session.createQuery("from StudentInfo", StudentInfo.class).list(); }
	 * 
	 * public void deleteStudent(int id) { Session session =
	 * sessionFactory.getCurrentSession(); StudentInfo student =
	 * session.get(StudentInfo.class, id); if (student != null) {
	 * session.delete(student); } }
	 * 
	 */
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
