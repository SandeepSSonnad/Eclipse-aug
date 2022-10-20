package com.xworkz.runner;
import com.xworkz.thing.TextBook;
public class TextBookRunner {

	public static void main(String[] args) {
		String[] items1 = {"Emma","Jane Eyre","David Copperfield","The God Father"};
		String[] items2 = {"Fantasy","Romance","Mystery"};
		String[] items3 = {"Jane Austin","Charlotte Bronte","Miss Fortune","Mario Puzo"};
		double[] items4 = {340.0,150.0,2000.0};
		long[]   items5 = {13458345,79454345,14553545};
		String[] items6 = {"India","Russia","South Korea"};
		
		TextBook pass = new TextBook ("God Father","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();
		

	}

	}


