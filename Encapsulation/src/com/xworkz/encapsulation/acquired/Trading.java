package com.xworkz.encapsulation.acquired;

import com.xworkz.encapsulation.acquire.Analysis;

public class Trading {

	public static void main(String[] args) {

		Analysis analysis=new Analysis();
		System.out.println("Store Name:"+analysis.getStoreName());
		System.out.println("Owner Name:"+analysis.getOwnerName());
		System.out.println("Share Price:"+analysis.getShareValue());
		System.out.println("Good Balance Sheet:"+analysis.getGoodBalanceSheet());
		System.out.println("Sales:"+analysis.getSales());
		System.out.println("Net Profit:"+analysis.getProfit());
		System.out.println("Total Debt:"+analysis.getDebt());
		System.out.println("Type of Company:"+analysis.getType());
		System.out.println("No of Store:"+analysis.getNoOfStores());
		System.out.println("Year of Return:"+analysis.getYearReturn());
		System.out.println("Competitor:"+analysis.getCompetitor());
		System.out.println("Right to Invest:"+analysis.getRightToInvest());
		System.out.println("Platform:"+analysis.getInvestingPlatform());
		
	}

}
