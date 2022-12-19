package com.xworkz.DTO;

import com.xworkz.thing.AbstractAuditDTO;

public class BakeryDTO extends AbstractAuditDTO {

	private String name;
	private String owner;
	private long contact;
	private String location;
	private String famousFor;

	public BakeryDTO(String createdBy, String updatedBy, String name, String owner, long contact, String location,
			String famousFor) {
		super(createdBy, updatedBy);
		this.name = name;
		this.owner = owner;
		this.contact = contact;
		this.location = location;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", owner=" + owner + ", contact=" + contact + ", location=" + location
				+ ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

}
