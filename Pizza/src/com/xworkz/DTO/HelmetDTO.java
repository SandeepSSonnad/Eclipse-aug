package com.xworkz.DTO;

import com.xworkz.constant.Colour;
import com.xworkz.constant.Type;
import com.xworkz.thing.AbstractAuditDTO;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;
	private Double price;
	private Colour colour;
	private Type type;

	public HelmetDTO(String createdBy, String updatedBy, String brand, Double price, Colour colour, Type type) {
		super(createdBy, updatedBy);
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
