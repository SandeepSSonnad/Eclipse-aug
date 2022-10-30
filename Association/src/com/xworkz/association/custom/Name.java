package com.xworkz.association.custom;

public class Name {

	public String oldName;
	public String presentName;
	public String futureName;
	
	public Name(String oldName, String presentName, String futureName) {
		super();
		this.oldName = oldName;
		this.presentName = presentName;
		this.futureName = futureName;
	}
	
	public void display() {
		System.out.println(this.oldName);
		System.out.println(this.presentName);
		System.out.println(this.futureName);
	}
	
	
}
