package com.xworkz.inheritance.custom;

import com.xworkz.inheritance.thing.Invitation;

public class NamingCeremonyInvitation extends Invitation {

	public NamingCeremonyInvitation(String type, int cost, String shopName) {
		super(type, cost, shopName);

	}
	
	public void display() {
		System.out.println(this.type);
		System.out.println(this.cost);
		System.out.println(this.shopName);
		
	}
	
	

}
