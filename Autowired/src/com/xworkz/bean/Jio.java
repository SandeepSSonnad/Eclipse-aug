package com.xworkz.bean;

import org.springframework.stereotype.Component;

import com.xworkz.interfaceClass.Provider;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("Running Jio Default Constructor");
	}
	
	
	@Override
	public void connect() {
		System.out.println("Running Connect with jio..");

	}

}
