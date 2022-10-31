package com.xworkz.association.custom;

public class Town {

	public String TownName;
	public String religion;
	public long totalArea;
	public int population;
	
	public Town(String townName, String religion, long totalArea, int population) {
		super();
		TownName = townName;
		this.religion = religion;
		this.totalArea = totalArea;
		this.population = population;
	}
	
	public void showOff() {
		System.out.println(this.TownName);
		System.out.println(this.religion);
		System.out.println(this.totalArea);
		System.out.println(this.population);
		
	}
	
	
}
