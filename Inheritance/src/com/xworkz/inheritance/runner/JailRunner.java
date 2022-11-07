package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.CentralJail;
import com.xworkz.inheritance.custom.DistrictJail;
import com.xworkz.inheritance.custom.TiharJail;
import com.xworkz.inheritance.thing.Jail;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail=new CentralJail();
		CentralJail centralJail=(CentralJail)jail;
		System.out.println(centralJail.function);
		System.out.println(centralJail.types);
		System.out.println(centralJail.noOfCentralJail);
		System.out.println(centralJail.location);
		
		Jail jail2=new DistrictJail();
		DistrictJail districtJail=(DistrictJail)jail2;
		System.out.println(districtJail.function);
		System.out.println(districtJail.types);
		System.out.println(districtJail.food);
		System.out.println(districtJail.library);
		
		Jail jail3=new TiharJail();
		TiharJail tiharJail=(TiharJail)jail3;
		System.out.println(tiharJail.function);
		System.out.println(tiharJail.types);
		System.out.println(tiharJail.capacity);
		System.out.println(tiharJail.location);
		
	}

}
