package com.xworkz.association.custom;

public class EmailCompany {

	public String name;
	public String ownerName;
	
	public EmailCompany(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
	}
	
	
}
