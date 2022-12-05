package com.xworkz.abstraction.thing;

public class VijayLakshmi extends JavaTrainee implements KarnatakaRTO{

	@Override
	public boolean paidTax(double amount) {
		amount=250;
		System.out.println("Total Amount:"+amount+", EveryBody Should Pay 250 as Tax");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("GST Means: Goods And Service Tax");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("Value-Added Tax");
		return 0;
	}

	
	
	
	
	
	
}
