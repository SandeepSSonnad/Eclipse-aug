package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.custom.Cardiologist;
import com.xworkz.inheritance.custom.Dentist;
import com.xworkz.inheritance.custom.ENT;
import com.xworkz.inheritance.thing.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {
		
		Doctor doctor=new Dentist();
		Dentist dentist=(Dentist)doctor;
		System.out.println(dentist.available);
		System.out.println(dentist.specilist);
		System.out.println(dentist.fees);
		System.out.println(dentist.name);
		
		Doctor doctor2=new ENT();
		ENT ent=(ENT)doctor2;
		System.out.println(ent.fees);
		System.out.println(ent.name);
		System.out.println(ent.hospital);
		System.out.println(ent.longForm);
		
		Doctor doctor3=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist)doctor3;
		System.out.println(cardiologist.clinicName);
		System.out.println(cardiologist.noOfPatience);
		System.out.println(cardiologist.fees);
		System.out.println(cardiologist.name);
		

	}

}
