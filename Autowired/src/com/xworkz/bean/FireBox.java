package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceClass.Browser;
import com.xworkz.interfaceClass.Provider;

@Component
public class FireBox implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public FireBox() {
		System.out.println("Running FireBox Default Constructor .");
	}
	
	
	@Override
	public void browse() {
		System.out.println("Running browser with FireBox");
		provider.connect();
	}

}
