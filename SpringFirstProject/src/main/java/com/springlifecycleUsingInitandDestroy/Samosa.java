package com.springlifecycleUsingInitandDestroy;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property");
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy method");
	}
}
