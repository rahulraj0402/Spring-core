package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certi certi;
	private List<Integer> projectId;
	
	public Person(String name , int personId , Certi certi , List projectId) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		this.projectId=projectId;
		
	}

	@Override
	public String toString() {
		
		return "name = "+this.name + " | " + "idNo = "+this.personId +" | "+ "certificate name = " + this.certi.name + " | " + "project id = "+this.projectId;
	}
	
	

}
