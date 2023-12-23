package com.springcore.auto.wire;

public class Emp {
	
	private Address address;

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor is running ");
	}

	public Address getAddress() {
		return address;
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
