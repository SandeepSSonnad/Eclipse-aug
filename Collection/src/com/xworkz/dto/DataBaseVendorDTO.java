package com.xworkz.dto;

import com.xworkz.constant.Type;

public class DataBaseVendorDTO {

	private String name;
	private String developedBy;
	private Type type;
	private int size;
	private double lincenseCost;

	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, Type type, int size, double lincenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.lincenseCost = lincenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", lincenseCost=" + lincenseCost + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 24;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto=(DataBaseVendorDTO)obj;
				if(dto.getName().equals(this.name))
					return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLincenseCost() {
		return lincenseCost;
	}

	public void setLincenseCost(double lincenseCost) {
		this.lincenseCost = lincenseCost;
	}

}
