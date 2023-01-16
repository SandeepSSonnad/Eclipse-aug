package com.xworkz.bean;

import org.springframework.stereotype.Component;

import com.xworkz.interfaceClass.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("Running Airtel Default constructor..");
	}

	@Override
	public void connect() {
		System.out.println("Running Connect with Airtel");

	}

}
