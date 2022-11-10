package com.xworkz.inheritance.thing;

public class Terrorist {

	public String origin;
	public boolean offence;
	public String groupName;// Taliban

	public Terrorist(String origin, boolean offence, String groupName) {
		super();
		this.origin = origin;
		this.offence = offence;
		this.groupName = groupName;
	}
	
	public void display() {
		System.out.println(this.origin);
		System.out.println(this.offence);
		System.out.println(this.groupName);
	}
	
	public void plan() {
		System.out.println("Terrorist is Planning to Attack");
	}

}
