package com.xworkz.association.custom;

public class State {
	
	public String stateName;
	public String religion;
	public long totalArea;
	public int populationInBillion;
	
	
	public State(String stateName, String religion, long totalArea, int populationInBillion) {
		super();
		this.stateName = stateName;
		this.religion = religion;
		this.totalArea = totalArea;
		this.populationInBillion = populationInBillion;
	}
	
	public void showOff() {
		System.out.println(this.stateName);
		System.out.println(this.religion);
		System.out.println(this.totalArea);
		System.out.println(this.populationInBillion);
		
	}
	
	
	
}
