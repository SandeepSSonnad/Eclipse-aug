package com.xworkz.inheritance.thing;

public class Director {

	public String role;
	public String type;

	public Director(String role, String type) {
		super();
		this.role = role;
		this.type = type;
	}
	
	public void display() {
		System.out.println(this.role);
		System.out.println(this.type);
	}

}
