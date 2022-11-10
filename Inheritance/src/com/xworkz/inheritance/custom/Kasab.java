package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Terrorist;

public class Kasab extends Terrorist{
	
	public String lastWish;

	public Kasab(String origin, boolean offence, String groupName,String lastWish) {
		super(origin, offence, groupName);
		this.lastWish=lastWish;
	}
	
	 @Override
	public void display() {
		System.out.println(this.lastWish);
		super.display();
	}
	
	 @Override
	public void plan() {
		 super.plan();
		System.out.println("Planning is Completed");
	}
	

}
