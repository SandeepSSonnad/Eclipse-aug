package com.xworkz.association.custom;

public class CompanyNew {
	
	public String name;
	public String ownerName;
	public Address address=new Address();
	
	public CompanyNew(String name,String ownerName ) {
		this.name=name;
		this.ownerName=ownerName;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		address.showOff();
	}

}
