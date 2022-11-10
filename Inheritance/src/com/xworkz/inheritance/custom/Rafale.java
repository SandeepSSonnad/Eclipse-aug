package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Warjet;

public class Rafale extends Warjet {
	
	public String company;

	public Rafale(String use, String country,String company) {
		super(use, country);
		this.company=company;
		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(this.company);
	}
	
	@Override
	public void details() {
		super.details();
	}
	
	

}
