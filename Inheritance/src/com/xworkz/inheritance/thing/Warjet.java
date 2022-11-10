package com.xworkz.inheritance.thing;

public class Warjet {

	public String use;
	public String country;

	public Warjet(String use, String country) {
		super();
		this.use = use;
		this.country = country;
	}
	
	public void display() {
		System.out.println(this.use);
		System.out.println(this.country);
	}
	
	public void details() {
		System.out.println("Indian Army");
	}

}
