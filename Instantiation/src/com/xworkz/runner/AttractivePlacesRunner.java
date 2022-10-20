package com.xworkz.runner;

import com.xworkz.thing.AttractivePlaces;

public class AttractivePlacesRunner {

	public static void main(String[] args) {
		
		String[] items1 = {"Nandi Hills","Indiranagar","Cubbon Park","Koramangala"};
		String[] items2 = {"Near Shivajinagar","Ramanagara","Indiranagar"};
		String[] items3 = {"Mom ","Dad","Brother","Sister"};
		double[] items4 = {350.0,400.0,500.0};
		long[]   items5 = {1345800,794500,145545};
		String[] items6 = {"India","Russia","Japan"};
		
		AttractivePlaces electronCity = new AttractivePlaces("Nandi Hils",'S',"India",1,true,items1,items2,items3,items4,items5,items6);
		
		electronCity.display();
		
	}

}
