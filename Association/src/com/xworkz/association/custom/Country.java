package com.xworkz.association.custom;

public class Country {

	public String countryName;
	public String countryReligion;
	public long totalArea;
	public int populationInBillion;
	
	public Country(String countryName, String countryReligion, long totalArea, int populationInBillion) {
		super();
		this.countryName = countryName;
		this.countryReligion = countryReligion;
		this.totalArea = totalArea;
		this.populationInBillion = populationInBillion;
	}
	
	public void showOff() {
		System.out.println(this.countryName);
		System.out.println(this.countryReligion);
		System.out.println(this.totalArea);
		System.out.println(this.populationInBillion);
	}
	
	
	
	
}
