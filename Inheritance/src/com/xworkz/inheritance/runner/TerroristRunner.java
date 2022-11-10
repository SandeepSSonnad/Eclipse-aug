package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Kasab;
import com.xworkz.inheritance.thing.Terrorist;

public class TerroristRunner {

	public static void main(String[] args) {

		Terrorist terrorist=new Kasab("Pakistan", true, "Taliban","To Eat Tommato");
		Kasab kasab=(Kasab)terrorist;
		kasab.display();
		kasab.plan();
		
		
		
	}

}
