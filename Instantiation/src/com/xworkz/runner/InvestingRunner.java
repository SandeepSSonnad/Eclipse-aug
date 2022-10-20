package com.xworkz.runner;

import com.xworkz.keyword.TradingApp;
import com.xworkz.thing.Investing;

public class InvestingRunner {

	public static void main(String[] args) {
		
		Investing investing=new Investing("TATA MOTORS", 399, TradingApp.ZERODHA_KITE);
		
		investing.Brokerage();

	}

}
