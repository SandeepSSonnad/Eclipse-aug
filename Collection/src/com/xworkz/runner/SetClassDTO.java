package com.xworkz.runner;

import java.io.Serializable;

public class SetClassDTO implements Serializable {

	private String cakeName;
	private String cakeColour;
	private String cakeShape;
	private String bakeryname;

	public SetClassDTO(String cakeName, String cakeColour, String cakeShape, String bakeryname) {
		super();
		this.cakeName = cakeName;
		this.cakeColour = cakeColour;
		this.cakeShape = cakeShape;
		this.bakeryname = bakeryname;
	}

	@Override
	public String toString() {
		return "SetClassDTO [cakeName=" + cakeName + ", cakeColour=" + cakeColour + ", cakeShape=" + cakeShape
				+ ", bakeryname=" + bakeryname + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode..............");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals Method..........");
		if (obj != null) {
			if (obj instanceof SetClassDTO) {
				SetClassDTO set = (SetClassDTO) obj;

				if (set.getCakeShape().equals(this.cakeShape)) {
					System.out.println("shape is Matching");
					return true;

				}

			}
		}
		return false;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public String getCakeColour() {
		return cakeColour;
	}

	public void setCakeColour(String cakeColour) {
		this.cakeColour = cakeColour;
	}

	public String getCakeShape() {
		return cakeShape;
	}

	public void setCakeShape(String cakeShape) {
		this.cakeShape = cakeShape;
	}

	public String getBakeryname() {
		return bakeryname;
	}

	public void setBakeryname(String bakeryname) {
		this.bakeryname = bakeryname;
	}

}
