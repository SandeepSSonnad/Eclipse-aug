package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.CompanyCEODTO;
import com.xworkz.dto.DaughterDTO;

public class CompanyCEODTORunner {

	public static void main(String[] args) {
		
		DaughterDTO ceodto=new DaughterDTO("Vanitha", 9734251645L, 20, false, true);
		DaughterDTO ceodto1=new DaughterDTO("Madhu", 8734244164L, 16, false, true);
		
		
		
		Collection<CompanyCEODTO> daughterdto=new ArrayList<CompanyCEODTO>();
		daughterdto.add(new CompanyCEODTO("Raghavendra", "MEE.pvt.ltd", 51,
				"India", "BE", true, ceodto ));
		daughterdto.add(new CompanyCEODTO("Gopal", "Kushi.pvt.ltd", 49,
				"India", "Diploma", true, ceodto1 ));
		
		daughterdto.stream()
		.map(ele->ele.getDaughter())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Another Condition");
		
		daughterdto.stream()
		.map(ele->ele.getDaughter().getName())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Another Condition");
		
		daughterdto.stream()
		.filter(ele->ele.getAge() >= 30)
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Another Condition");
		
		
		
		
		
		
		
		
		

	}

}
