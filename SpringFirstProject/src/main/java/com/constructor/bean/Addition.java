package com.constructor.bean;

public class Addition {

	
	private int a;
	private int b;
	
	
	public Addition(double  a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		
		System.out.println("Consturctor : double , double ");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Consturctor : int , int ");
	}


	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Consturctor : String , String ");
	}
	
	
	public void sum()
	{
		System.out.println("Value of a is  "+a);
		System.out.println("Value of b is "+b );
		System.out.println("Sum is = "+(a+b));
		
	}
	
	
	
}

