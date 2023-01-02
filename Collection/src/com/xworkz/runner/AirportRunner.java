package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AirportRunner {

	public static void main(String[] args) {
		
		AirportDTO airportDTO1=new AirportDTO("Kempagowda Bangalore Airport", "International", "Government");
		AirportDTO airportDTO2=new AirportDTO("Belagam Airport", "National", "Adani");
		AirportDTO airportDTO3=new AirportDTO("Hubli Airport", "National", "Government");
		AirportDTO airportDTO4=new AirportDTO("Bizapur Airport", "National", "Government");
		AirportDTO airportDTO5=new AirportDTO("Surat Airport", "International", "Adani");
		AirportDTO airportDTO6=new AirportDTO("Belavigi Airport", "International", "Sonnad.pvt.ltd");
		AirportDTO airportDTO7=new AirportDTO("Haveri Airport", "National", "Sonnad.pvt.ltd");
		AirportDTO airportDTO8=new AirportDTO("Guttal Airport", "National", "Sonnad.pvt.ltd");
		AirportDTO airportDTO9=new AirportDTO("Chennai Airport", "International", "Government");
		AirportDTO airportDTO10=new AirportDTO("Mangalore Airport", "International", "Adani");

		Collection<AirportDTO> ref=new ArrayList<AirportDTO>();
		ref.add(airportDTO10);
		
		boolean save=ref.contains(airportDTO1);
		System.out.println(save);
		
		
		
		

	}

}
