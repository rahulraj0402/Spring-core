package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor is running ");
	}
	

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setting address in emp ");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
