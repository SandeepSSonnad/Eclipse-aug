package com.Xworkz.Chain;

public class Tractor {

	public String Name;
	public String Brand;
	public int Price;
	public String Colour;
	public int Hp;
	public String Model;
	
	public Tractor(String Name) {
		this.Name=Name;
		System.out.println("This Constructer Is Printing Only Name");
	}
	
	public Tractor(String Name, int Price) {
		this(Name);
		this.Price=Price;
		System.out.println("This Constructer Is Printing Both Name and Price");
	}
	
	public Tractor(String Name, int Price, String Brand) {
		this(Name,Price);
		this.Brand=Brand;
		System.out.println("This Constructer Is Printing Name ,Price and Brand ");
	}
	
	public Tractor(String Name, int Price, String Brand, int Hp) {
		this(Name,Price,Brand);
		this.Hp=Hp;
		System.out.println("This Constructer Is Printing Name ,Price , Brand and Hp ");
	}
	
	public Tractor(String Name, int Price, String Brand, int Hp, String Colour) {
		this(Name,Price,Brand,Hp);
		this.Colour=Colour;
		System.out.println("This Constructer Is Printing Name ,Price , Brand, Hp and Colour ");
	}
	
	public Tractor(String Name,  int Price,String Brand, int Hp, String Colour, String Model) {
		this(Name,Price,Brand,Hp,Colour);
		this.Model=Model;
		System.out.println("This Constructer Is Printing Name ,Price , Brand, Hp, Colour and Model ");
	}
	
	
	
}
