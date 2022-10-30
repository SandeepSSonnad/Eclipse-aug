package com.xworkz.association.things;

import com.xworkz.association.custom.City;
import com.xworkz.association.custom.President;

public class Country {

	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {

		this.name = name;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void nodu() {
		System.out.println(this.name);
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				city.display();

			}
		}
		if (president != null) {
			System.out.println("Displaying president info");
			president.showOff();
		}else {
			System.out.println("President is null");
		}
	}

}
