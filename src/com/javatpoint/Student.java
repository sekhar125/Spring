package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;

	@Autowired
	@Qualifier("address1")
	private Address address;

	
	/*public Student(String name, Address address) {
		System.out.println("Constrctor autowire2");
		this.address = address;
		this.name = name;
		System.out.println("Hello: " + getName());
	}*/

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("setter autowire");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
		System.out.println("Address: " + address.getAddressLine1());
		System.out.println(address.getAddressLine2());
		System.out.println(address.getCity());
		System.out.println(address.getPincode());
	}
}
