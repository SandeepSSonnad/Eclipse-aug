package com.xworkz.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.constant.Type;
import com.xworkz.dto.DataBaseVendorDTO;

public class DataBaseVendorDTORunner {

	public static void main(String[] args) {
		
		Collection<DataBaseVendorDTO> database=new LinkedList<DataBaseVendorDTO>();
		database.add(new DataBaseVendorDTO("AdventureWorks", "Sandeep", Type.NETWORK_DATABASE, 189, 10000.0d));
		database.add(new DataBaseVendorDTO("CreditData", "Google", Type.OBJECT_ORINETED_DATABASE, 170, 1000.0d));
		database.add(new DataBaseVendorDTO("MasterData", "Oracle", Type.RELATIONAL_DATABASE, 4, 5000.0d));
		database.add(new DataBaseVendorDTO("MySQL", "MicroSoft", Type.SQL, 10, 100.0d));

		database.stream()
		.map(ele->ele.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Running Another Condition");
		database.stream()
		.filter(ele->ele.getLincenseCost() <= 100 && ele.getType().equals(Type.SQL))
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Running Another Condition");
		
		database.stream()
		.map(ele->ele.getType())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		
		
		
		
		
	}

}
