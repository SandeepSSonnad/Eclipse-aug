package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		
		Collection<ApplicationDTO> application=new ArrayList<ApplicationDTO>();
		application.add(new ApplicationDTO("MeetMore", 2.0, false, "FaceBook", 10000));
		application.add(new ApplicationDTO("Metaverse", 11.0, true, "Google", 0));
		application.add(new ApplicationDTO("Java", 12.0, true, "MicroSysytem", 0));
		application.add(new ApplicationDTO("Xworkz",18.0 , false, "Omkar", 5000));
		
		application.stream()
		.filter(ele->ele.isFree() == true && ele.getDevelopedBy().equals("Google"))
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Running Another Condition...........");
		
		application.stream()
		.filter(el->el.getVersion() >= 5.0)
		.map(el->el.getName())
		.collect(Collectors.toList())
		.forEach(el->System.out.println(el));
		
		
		
		
		

	}

}
