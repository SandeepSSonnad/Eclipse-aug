package com.xworkz.encapsulation.office;

public class Bag {

	String brand="American Tourist";
	int manufactureYear=2022;
	int expiryYear=2032;
	String colour="Black";
	char size='S';
	String type= "Laptopbag";
	int quantity=1;
	boolean ForChildren=false;
	int price=2000;
	String processor="No";
	int compartment=2;
	int warrenty=1;
	String graphicCard="No";

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	void setSize(char size) {
		this.size = size;
	}

	void setType(String type) {
		this.type = type;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setForChildren(boolean ForChildren) {
		this.ForChildren = ForChildren;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}

	void setCompartment(int compartment) {
		this.compartment = compartment;
	}
	
	void setGraphicCard(String graphicCard) {
		this.graphicCard=graphicCard;
	}

	void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	public String getBrand() {
		return brand;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public String getColour() {
		return colour;
	}

	public char getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean getForChildren() {
		return ForChildren;
	}

	public int getPrice() {
		return price;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public String getProcessor() {
		return processor;
	}
	
	public int getCompartment() {
		return compartment;
	}

	public int  getWarrenty() {
		return warrenty;
	}

}
