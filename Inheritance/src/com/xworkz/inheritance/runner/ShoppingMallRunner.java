package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Lulu;
import com.xworkz.inheritance.thing.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {

		ShoppingMall mall=new Lulu("Lulu Hypermarket","Bangalore");
		Lulu lulu=(Lulu)mall;
		lulu.origin="Kerala";
		lulu.display();
		
		
		
	}

}
