package com.xworkz.thing;

import com.xworkz.keyword.TradingApp;

public class Investing {
	
	public String companyName;
	public int shareValue;
	public TradingApp tradingApp;
	
	public Investing(String companyName, int shareValue, TradingApp tradingApp) {
		this.companyName=companyName;
		this.shareValue=shareValue;
		this.tradingApp=tradingApp;
	}
	
	public void Brokerage() {
		System.out.println("The Company Name");
		System.out.println(this.companyName);
		System.out.println("Share Price");
		System.out.println(this.shareValue);
		System.out.println("Suggest The Best Trading App");
		System.out.println(this.tradingApp);
	}

}
