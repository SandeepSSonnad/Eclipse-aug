package com.xworkz.association.custom;

public class Location1 {

	public int doorNo;
	public String street;
	public Country country=new Country("India","Hindu",3287263L,139);
	public Town town=new Town("Bangalore", "Hindu", 741L,13193035);
	public State state=new State("Karnataka","Hindu",191791L,66165886);
	
	public Location1(int doorNo, String street) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		
	}
	
	public void showOff() {
		System.out.println(this.doorNo);
		System.out.println(this.street);
		country.showOff();
		town.showOff();
		state.showOff();
		
	}
	
	
}
