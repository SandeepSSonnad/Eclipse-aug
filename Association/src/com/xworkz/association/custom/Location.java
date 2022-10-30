package com.xworkz.association.custom;

public class Location {
	public String loc;

	public Location(String loc) {
		super();
		this.loc = loc;
	}
	
	public void ShowOff() {
		System.out.println("Exact Location");
		System.out.println(this.loc);
	}

}
