package com.xworkz.inheritance.thing;

public class PoliticalParty {
	
	public String name;
	public int founded;
	
	public PoliticalParty(String name,int founded) {
		this.name=name;
		this.founded=founded;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.founded);
	}

}
