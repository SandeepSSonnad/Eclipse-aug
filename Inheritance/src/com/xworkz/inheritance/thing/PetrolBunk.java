package com.xworkz.inheritance.thing;

public class PetrolBunk {

	public String brand;
	public String location;

	public PetrolBunk(String brand, String location) {
		super();
		this.brand = brand;
		this.location = location;
	}
	
	public void display() {
		System.out.println(this.brand);
		System.out.println(this.location);
	}
	
	public void details() {
		System.out.println("Click Here for");
	}

}
