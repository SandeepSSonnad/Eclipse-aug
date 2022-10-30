package com.xworkz.association.runner;

import com.xworkz.association.keyword.Type;
import com.xworkz.association.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) {

		Fuel fuel = new Fuel(true, Type.PETROL, 101, 1);
		fuel.ShowOff();

	}

}
