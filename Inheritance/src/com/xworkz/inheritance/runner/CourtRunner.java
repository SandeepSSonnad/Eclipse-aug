package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.DistrictCourt;
import com.xworkz.inheritance.custom.HighCourt;
import com.xworkz.inheritance.custom.SupremeCourt;
import com.xworkz.inheritance.thing.Court;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court=new HighCourt();
		HighCourt highCourt=(HighCourt)court;
		System.out.println(highCourt.noOfHighCourts);
		System.out.println(highCourt.appointedBy);
		System.out.println(highCourt.authority);
		System.out.println(highCourt.function);
		
		Court court2=new SupremeCourt();
		SupremeCourt supremeCourt=(SupremeCourt)court2;
		System.out.println(supremeCourt.place);
		System.out.println(supremeCourt.judges);
		System.out.println(supremeCourt.authority);
		System.out.println(supremeCourt.function);
		
		Court court3=new DistrictCourt();
		DistrictCourt districtCourt=(DistrictCourt)court3;
		System.out.println(districtCourt.education);
		System.out.println(districtCourt.salaryOfJudge);
		System.out.println(districtCourt.authority);
		System.out.println(districtCourt.function);

	}

}
