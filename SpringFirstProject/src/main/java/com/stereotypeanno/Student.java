package com.stereotypeanno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud_obj")
@Scope("prototype")
public class Student {

	@Value("LalitR")
	private String studName;
	@Value("Nagpur")
	private String city;

	@Value("#{temp}")
	private List<String> street;
	
	
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getStreet() {
		return street;
	}

	public void setStreet(List<String> street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", city=" + city + ", street=" + street + "]";
	}

	 

}
