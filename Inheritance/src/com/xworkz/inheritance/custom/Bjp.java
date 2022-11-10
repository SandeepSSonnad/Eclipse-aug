package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.PoliticalParty;

public class Bjp extends PoliticalParty {
	
	public String president;

	public Bjp(String name, int founded,String president) {
		super(name, founded);
		this.president=president;
	}
	
	public void display() {
		System.out.println(this.president);
		super.display();
	}
	
	

}
