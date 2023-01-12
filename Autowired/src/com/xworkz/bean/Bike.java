package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Autowired
	@Qualifier("bikeName")
	private String name;
	
	@Autowired
	@Qualifier("bikeCC")
	private int cc;
	
	@Autowired
	@Qualifier("bikePrice")
	private int price;
	
	@Autowired
	@Qualifier("bikeColor")
	private String color;
	
	@Autowired
	@Qualifier("bikeWheels")
	private int wheels;
	
	@Autowired
	@Qualifier("bikeBrand")
	private String brand;

	@Override
	public String toString() {
		return "Bike [name=" + name + ", cc=" + cc + ", price=" + price + ", color=" + color + ", wheels=" + wheels
				+ ", brand=" + brand + "]";
	}

}
