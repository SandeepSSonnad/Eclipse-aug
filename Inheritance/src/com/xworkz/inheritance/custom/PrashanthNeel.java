package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Director;

public class PrashanthNeel extends Director {

	public String presentWorking;

	public PrashanthNeel(String role, String type, String presentWorking) {
		super(role, type);
		this.presentWorking = presentWorking;
	}
	
	public void display() {
		System.out.println(this.presentWorking);
		super.display();
	}

	
	
}
