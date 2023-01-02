package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.PalaceDTO;

public class PalaceDTORunner {

	public static void main(String[] args) {
		
		Collection<PalaceDTO> palace=new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Sandeep", false, 10.0d));
		palace.add(new PalaceDTO("Mysore Palace", "Mysore", "Chetan", false, 100.0d));
		palace.add(new PalaceDTO("Lalith Palace", "Mysore", "Sachin", false, 50.0d));
		palace.add(new PalaceDTO("Hampi Palace", "Hampi", "Enginers", false, 25.0d));
		
		palace.stream()
		.filter(ele->!ele.isDestroyedBy())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		

	}

}
