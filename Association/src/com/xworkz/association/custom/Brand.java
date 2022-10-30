package com.xworkz.association.custom;

public class Brand {
	
	public String name;
	public String gstNo;
	public Location loc=new Location("Rajaji Nagar");
	public int rating;
	
	public Brand(String name, String gstNo, int rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	
	public void ShowOff() {
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.rating);
		loc.ShowOff();
	}
	
	

}
