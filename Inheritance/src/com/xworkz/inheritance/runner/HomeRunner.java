package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Pg;
import com.xworkz.inheritance.thing.Home;

public class HomeRunner {

	public static void main(String[] args) {

		Home home=new Pg("Belavigi",5,6000);
		Pg pg=(Pg)home;
		pg.display();
		pg.see();
	}

}
