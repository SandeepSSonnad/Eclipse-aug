package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("id")
	private int id;
	
	@Autowired
	@Qualifier("name")
	private String name;
	
	@Autowired
	@Qualifier("gstNum")
	private String gstNo;
	
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	
	@Autowired
	@Qualifier("address")
	private String address;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}

}
