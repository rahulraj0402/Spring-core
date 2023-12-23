package com.springcore.ci;

public class Certi {
	
	 String name;

	@Override
	public String toString() {
		return "certificate name = "+this.name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}
	

}
