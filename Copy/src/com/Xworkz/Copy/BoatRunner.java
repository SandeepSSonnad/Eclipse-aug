package com.Xworkz.Copy;

public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat=new Boat("Liberty");
		System.out.println(boat.Name);
		
		Boat boat1=new Boat("Liberty","Royal Caribbean Cruises Ltd");
		System.out.println(boat1.Name);
		System.out.println(boat1.CompanyName);
		
		Boat boat2=new Boat("White","Royal Caribbean Cruises Ltd","Cruises");
		System.out.println(boat2.Colour);
		System.out.println(boat2.CompanyName);
		System.out.println(boat2.Type);
		
		Boat boat3=new Boat("Liberty","White","Royal Caribbean Cruises Ltd","Cruises");
		System.out.println(boat3.Colour);
		System.out.println(boat3.CompanyName);
		System.out.println(boat3.Type);
		System.out.println(boat3.Name);
		
		Boat boat4=new Boat("Liberty","White","Royal Caribbean Cruises Ltd","Cruises","John Hancock");
		System.out.println(boat4.Name);
		System.out.println(boat4.Colour);
		System.out.println(boat4.CompanyName);
		System.out.println(boat4.Type);
		System.out.println(boat4.Name);

		Boat boat5=new Boat(80000000);
		System.out.println(boat5.Launched);
		
		Boat boat6=new Boat(80000000,"Liberty");
		System.out.println(boat6.Launched);
		System.out.println(boat6.Name);
		
		Boat boat7=new Boat("Royal Caribbean Cruises Ltd",80000000,"Liberty");
		System.out.println(boat7.Launched);
		System.out.println(boat7.Owner);
		System.out.println(boat7.Name);
	}

}
