package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Hr;

public class Akshara extends Hr {

	public String wifeName;

	public Akshara(String name, int salary, String company, String wifeName) {
		super(name, salary, company);
		this.wifeName=wifeName;
	}
	
	public void display() {
		System.out.println(this.wifeName);
		super.display();
	}
	
	public void seeDetails() {
		super.seeDetails();
		System.out.println("Ask the Hr for More Details");
	}
}
