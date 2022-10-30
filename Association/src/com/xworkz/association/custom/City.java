package com.xworkz.association.custom;

public class City {

	public Name name;
	public boolean capital;
	public boolean areaInSquareKilometer;

	public City(Name name, boolean capital, boolean areaInSquareKilometer) {
		super();
		this.name = name;
		this.capital = capital;
		this.areaInSquareKilometer = areaInSquareKilometer;
	}

	public void display() {
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometer);
		if (name != null) {
			this.name.display();
			System.out.println("Printing the Names");
		} else {
			System.out.println("Name is null");
		}
	}

}
