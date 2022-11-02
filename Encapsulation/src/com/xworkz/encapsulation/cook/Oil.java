package com.xworkz.encapsulation.cook;

public class Oil {
	
	String brand="GoldWinner";
	int manufactureYear=2022;
	int expiryYear=2022;
	String colour="ColourLess";
	char size='M';
	String salt="No";
	String type= "Edible";
	int quantity=250;
	boolean safetyForChildren=false;
	int price=230;
	String flavour="GroundNut";
	String solvent="Not Soluble in water";
	String chemical= "No";

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

	void setSalt(String salt) {
		this.salt = salt;
	}

	void setType(String type) {
		this.type = type;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setSafetyForChildren(boolean safetyForChildren) {
		this.safetyForChildren = safetyForChildren;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	void setSolvent(String solvent) {
		this.solvent = solvent;
	}

	void setChemical(String chemical) {
		this.chemical = chemical;
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

	public String getSalt() {
		return salt;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean getSafetyForChildren() {
		return safetyForChildren;
	}

	public int getPrice() {
		return price;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getSolvent() {
		return solvent;
	}

	public String getChemical() {
		return chemical;
	}


}
