package com.xworkz.inheritance.thing;

public class Home {

	public String place;
	public int members;

	public Home(String place, int members) {
		super();
		this.place = place;
		this.members = members;
	}
	
	public void display() {
		System.out.println(this.place);
		System.out.println(this.members);
	}
	
	public void see() {
		System.out.println("See Next");
	}

}
