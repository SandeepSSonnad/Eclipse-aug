package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FirstAidConfiguration;
import com.xworkz.spring.dto.ResortDTO;
import com.xworkz.spring.service.ResortService;

public class ResortRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext store=new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
		ResortService service=store.getBean(ResortService.class);
		ResortDTO dto=new ResortDTO("Apporva", "Davangere", 700);
		boolean saved=service.validateAndSave(dto);
		System.out.println("Saved :"+saved);
	}

}
