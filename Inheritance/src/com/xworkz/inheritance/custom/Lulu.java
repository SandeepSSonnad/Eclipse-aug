package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.ShoppingMall;

public class Lulu extends ShoppingMall {

	public String origin;

	public Lulu(String name, String location) {
		super(name, location);

	}
	
	public void display() {
		System.out.println(this.origin);
		super.display();
		
	}
	
	
	
}
