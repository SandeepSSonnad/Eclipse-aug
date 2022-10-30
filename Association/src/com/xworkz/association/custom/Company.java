package com.xworkz.association.custom;

public class Company {
	
	public String name;
	public String type;
	
	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void ShowOff() {
		System.out.println("Association Starts");
		System.out.println(this.name);
		System.out.println(this.type);
	}
	

}
