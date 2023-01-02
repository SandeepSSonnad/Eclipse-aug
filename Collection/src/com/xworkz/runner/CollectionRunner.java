package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
		
		
		
		System.out.println("==================================");
		
		if(mall5.equals(mall5)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		System.out.println(malls.size());

	}

}
