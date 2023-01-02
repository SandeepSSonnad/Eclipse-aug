package com.xworkz.runner;

import java.util.HashSet;
import java.util.Set;

public class SetClassDTORunner {

	public static void main(String[] args) {
		
		SetClassDTO setdto1=new SetClassDTO("Butterscosh", "Yellow", "Circle", "Iyengar");
		SetClassDTO setdto2=new SetClassDTO("Honey", "Yellow", "Oval", "Iyengar");
		SetClassDTO setdto3=new SetClassDTO("Red Valvet", "Yellow", "Heart", "Iyengar");

		Set<SetClassDTO> ref=new HashSet<SetClassDTO>();
		ref.add(setdto2);
		ref.add(setdto1);
		ref.add(setdto3);
		
		for (SetClassDTO setClassDTO : ref) {
			System.out.println(setClassDTO);
		}
		
	}

}
