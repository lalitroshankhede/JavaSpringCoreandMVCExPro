package com.constructor.bean;

import java.util.List;

public class Person {

	private int id;
	private String name;
    private Certi certi;
    private List<String> city;
	public Person(int id, String name, Certi certi, List<String> city) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + ", city=" + city + "]";
	}
   
    
	 
	 
	

}
