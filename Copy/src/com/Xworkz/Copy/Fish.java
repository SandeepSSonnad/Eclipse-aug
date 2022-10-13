package com.Xworkz.Copy;

public class Fish {

	public String Name;
	public String Type;
	public int Price;
	public double Weight;
	public double Length;

	public Fish(String Name) {
		this.Name = Name;
	}

	public Fish(int Price) {
		this.Price = Price;
	}

	public Fish(double Weight) {
		this.Weight = Weight;
	}

	public Fish(String Name, int Price) {
		this.Name = Name;
		this.Price = Price;
	}

	public Fish(String Type, double Weight) {
		this.Type = Type;
		this.Weight = Weight;
	}

	public Fish(String Name, String Type) {
		this.Name = Name;
		this.Type = Type;
	}

	public Fish(int Price, double Weight) {
		this.Price = Price;
		this.Weight = Weight;
	}

	public Fish(String Name, int Price, double Weight) {
		this.Name = Name;
		this.Price = Price;
		this.Weight = Weight;
	}

}
