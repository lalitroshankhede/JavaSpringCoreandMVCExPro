package com.removeXML;

import org.springframework.stereotype.Component;


public class Student {

	
	private Samosa samosa;
	
	
	public void study()
	{
		 samosa.display();
		System.out.println("Student Study...");
		
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	

	 
	
	

	
	
}
