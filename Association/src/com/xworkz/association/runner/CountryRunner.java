package com.xworkz.association.runner;

import com.xworkz.association.custom.City;
import com.xworkz.association.custom.Name;
import com.xworkz.association.custom.President;
import com.xworkz.association.keyword.Gender;
import com.xworkz.association.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
		
		Country country=new Country("India");
		President president=new President("Droupadi Murmu",Gender.FEMALE);
		president.showOff();
		country.setPresident(president);
		  
		Name name=new Name("Belavigi", "Guttal", "Ranibennur");
		City city=new City(name, false, false);
		
		Name name2=new Name("Raidurga","Ramdurga","Ramadurga");
		City city2=new City(name2, false, false);
		
		City[] cities= {city,city2};
		
		country.setCities(cities);
		country.nodu();
		
		
		
		
		
		
		
		
		
	}

}
