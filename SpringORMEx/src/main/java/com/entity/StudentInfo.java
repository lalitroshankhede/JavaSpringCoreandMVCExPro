package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class StudentInfo {

	 @Id
	    private int studId;
	    private String studName;
	    private String studCity;

	    // Getters and Setters

	    public int getStudId() {
	        return studId;
	    }

	    public void setStudId(int studId) {
	        this.studId = studId;
	    }

	    public String getStudName() {
	        return studName;
	    }

	    public void setStudName(String studName) {
	        this.studName = studName;
	    }

	    public String getStudCity() {
	        return studCity;
	    }

	    public void setStudCity(String studCity) {
	        this.studCity = studCity;
	    }
	
	
}
