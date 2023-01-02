package com.xworkz.runner;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {

	private int id;
	private String brand;
	private int price;
	private String colour;

	public SanitizerDTO() {
		System.out.println("Running Default Constructor");
	}

	public SanitizerDTO(int id, String brand, int price, String colour) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
