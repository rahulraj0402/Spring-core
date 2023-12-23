package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	
	
	public Addition(double a , double b){
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double conctructor running : double a , double b  ");
	}

	
	public Addition(int a , int b){
		this.a = a;
		this.b = b;
		System.out.println("int conctructor running : int a , int b  ");
	}
	
	public Addition(String a , String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string constructor is running : string a , string b");
	}
	
	
		
	public void doSum() {
		System.out.println("value of a : " + this.a);
		System.out.println("value of b : " + this.b);
		System.out.println("sum is : " + (this.a + this.b));
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	

}
