package com.xworkz.DTO;

import com.xworkz.thing.AbstractAuditDTO;

public class PlaceDTO extends AbstractAuditDTO {

	private String name;
	private String famousFor;
	private String district;
	private String state;
	private String country;

	public PlaceDTO(String createdBy, String updatedBy, String name, String famousFor, String district, String state,
			String country) {
		super(createdBy, updatedBy);
		this.name = name;
		this.famousFor = famousFor;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", district=" + district + ", state=" + state
				+ ", country=" + country + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
