package com.xworkz.repository;

import com.xworkz.constant.PizzaSize;

public interface PizzaValidateAndSave {

	boolean pizzaName(String name);

	boolean pizzaCompany(String company);

	default double PizzaPrice(double price) {
		return price;
	}

	default PizzaSize findSize(PizzaSize size) {
		return null;
	}

	default String pizzaFlavour(String flavour) {
		return flavour;
	}

	default String pizzaType(String type) {
		return type;
	}

}
