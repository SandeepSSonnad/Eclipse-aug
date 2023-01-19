package com.xworkz.spring.boot;

import java.time.LocalDateTime;

import com.xworkz.spring.dto.AbstractAuditDTO;
import com.xworkz.spring.dto.TerroristDTO;
import com.xworkz.spring.service.TerroristService;
import com.xworkz.spring.service.TerroristServiceimpl;

public class Runner {

	public static void main(String[] args) {

		
		TerroristDTO dtos=new TerroristDTO();
       	dtos.setName("Neeraj");
       	dtos.setAge(25);
       	dtos.setCountry("Pakistan");
       	dtos.setOrganisation("Dubak org");
       	dtos.setSpecialisation("Nothing");
		System.out.println(dtos);
        
		AbstractAuditDTO dt=new AbstractAuditDTO("Sandeep", LocalDateTime.of(2023, 01, 21, 12, 30), "Sandeep", LocalDateTime.now());
		TerroristService service=new TerroristServiceimpl();
		service.validateAndSave(dtos);

		
		
		

	}

}
