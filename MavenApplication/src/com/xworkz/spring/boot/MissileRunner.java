package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FirstAidConfiguration;
import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
		MissileService service=container.getBean(MissileService.class);
		
		MissileDTO dto=new MissileDTO("MOM", "India", 1000000);
		 boolean saved=service.validateAndSave(dto);
		 System.out.println("Saved : "+saved);
		 
	}

}
