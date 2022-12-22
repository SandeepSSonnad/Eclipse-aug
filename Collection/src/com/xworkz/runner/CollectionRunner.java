package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRunner {

	public static void main(String[] args) {
		String mall1 = "LuLu Mall";
		String mall2 = "Orien Mall";
		String mall3 = "Forum Mall";
		String mall4 = "Mantri Square";
		String mall5 = "GT Mall";

		Collection<String> malls = new ArrayList<String>();
		malls.add(mall5);
		malls.add(mall4);
		malls.add(mall3);
		malls.add(mall2);
		malls.add(mall1);

		//System.out.println(malls.size());
		
		malls.removeAll(malls);
		System.out.println(malls.size());

		for (String element : malls) {
			System.out.println(element);
		}
		
		
		

	}

}
