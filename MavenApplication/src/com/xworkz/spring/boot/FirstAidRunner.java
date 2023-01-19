package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FirstAidConfiguration;
import com.xworkz.spring.dto.FirstAidDTO;
import com.xworkz.spring.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		
		ApplicationContext container=new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
		
		FirstAidService service=container.getBean(FirstAidService.class);
		
		FirstAidDTO dto=new FirstAidDTO("Pain killer", "Dettol Bandage");
		
		boolean saved=service.ValidateAndSave(dto);
		System.out.println("Saved "+saved);
		
		
		
		
		
		
		
		
		
		
	}

}
