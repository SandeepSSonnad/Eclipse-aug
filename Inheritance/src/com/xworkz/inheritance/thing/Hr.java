package com.xworkz.inheritance.thing;

public class Hr {

	public String name;
	public int salary;
	public String company;

	public Hr(String name, int salary, String company) {
		super();
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.company);
	}
	
	public void seeDetails() {
		System.out.println("HR role is hiring the candidates");
	}

}
