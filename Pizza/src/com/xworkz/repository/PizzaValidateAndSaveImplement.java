package com.xworkz.repository;

import com.xworkz.DTO.PizzaDTO;
import com.xworkz.constant.PizzaSize;

public class PizzaValidateAndSaveImplement implements PizzaValidateAndSave {

	@Override
	public boolean pizzaName(String name) {
		System.out.println("Running PizzaName");
		if (name.length() >= 4 && name.length() <= 20 && name != null) {
			System.out.println("Valid Pizza Name");
			return true;
		} else {
			System.out.println("Invalid Pizza Name");
		}
		return false;
	}

	@Override
	public boolean pizzaCompany(String company) {
		System.out.println("Running Company Name");
		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Valid Company Name");
			return true;
		} else {
			System.out.println("Invalid Company Name");
		}
		return false;
	}

	@Override
	public PizzaSize findSize(PizzaSize size) {
		System.out.println("Running Pizza Size");
		if (size != null) {
			System.out.println("Valid Size");

		} else {
			System.out.println("Invalid Size");
		}
		return PizzaValidateAndSave.super.findSize(size);
	}

	@Override
	public double PizzaPrice(double price) {
		System.out.println("Running  Pizza Price");
		if (price >= 50 && price <= 2000) {
			System.out.println("Valid Pizza Price");
			return price;
		} else {
			System.out.println("Invalid Pizza Price");
		}
		return PizzaValidateAndSave.super.PizzaPrice(price);
	}

	@Override
	public String pizzaFlavour(String flavour) {
		System.out.println("Running Pizza Flavour");
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("Valid Pizza Flavour");
		} else {
			System.out.println("Invalid Pizza Flavour");
		}
		return PizzaValidateAndSave.super.pizzaFlavour(flavour);
	}

	@Override
	public String pizzaType(String type) {
		System.out.println("Running Pizza Type");
		if (type != null && type == "VEG" || type == "NON-VEG") {
			System.out.println("Valid Pizza Type");
		} else {
			System.out.println("Invalid Pizza Type");
		}
		return PizzaValidateAndSave.super.pizzaType(type);
	}

}
