package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceClass.Browser;
import com.xworkz.interfaceClass.Provider;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provide;
	
	public Chrome() {
		System.out.println("Running Chrome default Constructor..");
	}

	@Override
	public void browse() {
		System.out.println("Running browser with chrome");
		provide.connect();
	}

}
