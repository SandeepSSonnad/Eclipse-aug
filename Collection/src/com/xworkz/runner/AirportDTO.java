package com.xworkz.runner;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String name;
	private String type;
	private String operator;

	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String type, String operator) {
		super();
		this.name = name;
		this.type = type;
		this.operator = operator;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method");
		if(obj!= null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matching "+dto.name);
					return true;
				}else {
					System.out.println("Name is not Matching");
				}
				if(dto.type.equals(this.type)) {
					System.out.println("Type is Matching "+dto.type);
					return true;
				}
				if(dto.operator.equals(this.operator)) {
					System.out.println("Operator is matching "+dto.operator);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", type=" + type + ", operator=" + operator + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}
