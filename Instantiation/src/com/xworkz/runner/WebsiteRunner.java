package com.xworkz.runner;

import com.xworkz.thing.Website;

public class WebsiteRunner {

	public static void main(String[] args) {
		
		String[] items1 = {"Game Of Thrones","House Of The Dragon","13 Reasons Why","Money Hiest"};
		String[] items2 = {"Dragon World","Kill All Walkers","Knights Watch"};
		String[] items3 = {"Aegon ","Veserys","Rhaneyra","Clay Jhonson"};
		double[] items4 = {200045435.0,1500656.0,450045546.0};
		long[]   items5 = {1,79,14};
		String[] items6 = {"Danerys","Aegon","Title song"};
		
		Website hb = new Website("House Of The Dragon",'A',"Matt Smith",25,true,items1,items2,items3,items4,items5,items6);
		
		hb.display();

	}

}
