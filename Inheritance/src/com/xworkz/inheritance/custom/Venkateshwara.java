package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.PetrolBunk;

public class Venkateshwara extends PetrolBunk {
	
	public String type;

	public Venkateshwara(String brand, String location,String type) {
		super(brand, location);
		this.type=type;
	}
	
	public void display() {
		System.out.println(this.type);
		super.display();
	}
	
	public void details() {
		super.details();
		System.out.println("More Details");
	}
	
	

}
