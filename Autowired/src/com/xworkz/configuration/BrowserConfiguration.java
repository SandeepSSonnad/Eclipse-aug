package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BrowserConfiguration {

	public BrowserConfiguration() {
		System.out.println("Running Default constructor in BrowserConfiguration");
	}
	
	
	
}
