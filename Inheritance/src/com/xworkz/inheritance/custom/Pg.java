package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Home;

public class Pg extends Home {

	public int fee;

	public Pg(String place, int members, int fee) {
		super(place, members);
		this.fee=fee;
		
	}
	
	public void display() {
		System.out.println(this.fee);
		super.display();
	}
	
	public void see() {
		super.see();
		System.out.println("Pg is like Home But Not Home");
	}

}
