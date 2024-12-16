package com.springlifecycleUsingInitandDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sandwich {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Sandwich [type=" + type + "]";
	}

	
	 @PostConstruct
	public void eating()
	{
		System.out.println("start eating...");
	}
	
	
	 @PreDestroy
	public void stop()
	{
		System.out.println("finish sandwich...");
	}
	
	
}
