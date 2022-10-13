package com.Xworkz.Copy;

public class Boat {

	public String Name;// Liberty
	public String Colour;// White
	public String CompanyName;// Royal Caribbean Cruises Ltd
	public String Type;// Cruises
	public String Owner;// John Hancock
	public int Launched;// 2007;

	public Boat(String Name) {
		this.Name = Name;
	}

	public Boat(String Name, String CompanyName) {
		this.Name = Name;
		this.CompanyName = CompanyName;
	}

	public Boat(String Colour, String CompanyName, String Type) {
		this.Colour = Colour;
		this.CompanyName = CompanyName;
		this.Type = Type;
	}

	public Boat(String Name, String Colour, String CompanyName, String Type) {
		this.Name = Name;
		this.Colour = Colour;
		this.CompanyName = CompanyName;
		this.Type = Type;
	}

	public Boat(String Name, String Colour, String CompanyName, String Type, String Owner) {
		this.Name = Name;
		this.Colour = Colour;
		this.CompanyName = CompanyName;
		this.Type = Type;
		this.Owner = Owner;
	}

	public Boat(int Launched) {
		this.Launched = Launched;
	}

	public Boat(int Launched, String Name) {
		this.Launched = Launched;
		this.Name = Name;
	}

	public Boat(String Name, int Launched, String Owner) {
		this.Launched = Launched;
		this.Name = Name;
		this.Owner = Owner;
	}

}
