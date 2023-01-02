package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDamRunner {

	public static void main(String[] args) {

		String karnatakaDam1 = "TungaBhadra Dam";
		String karnatakaDam2 = "KrishnaRajaSagar Dam";
		String karnatakaDam3 = "Kodasalli Dam";
		String karnatakaDam4 = "Almatti Dam";
		String karnatakaDam5 = "Kadra Dam";
		String karnatakaDam6 = "Harangi Dam";
		String karnatakaDam7 = "BasavaSagara Dam";
		String karnatakaDam8 = "LinganaMakki Dam";
		String karnatakaDam9 = "Narayanpur Dam";
		String karnatakaDam10 = "Supa Dam";
		String karnatakaDam11 = "GhataPrabha Dam";
		String karnatakaDam12 = "gadag";
		Collection<String> karnatakaDams = new ArrayList<String>();
		karnatakaDams.add(karnatakaDam1);
		karnatakaDams.add(karnatakaDam2);
		karnatakaDams.add(karnatakaDam3);
		karnatakaDams.add(karnatakaDam4);
		karnatakaDams.add(karnatakaDam5);
		karnatakaDams.add(karnatakaDam6);
		karnatakaDams.add(karnatakaDam7);
		karnatakaDams.add(karnatakaDam8);
		karnatakaDams.add(karnatakaDam9);
		karnatakaDams.add(karnatakaDam10);
		karnatakaDams.add(karnatakaDam11);
		karnatakaDams.add(karnatakaDam12);

		String andraPradeshDam1 = "Somasila Dam";
		String andraPradeshDam2 = "Prakasham Dam";
		String andraPradeshDam3 = "Srisailam Dam";
		String andraPradeshDam4 = "Gandipalem Dam";
		Collection<String> andraPradeshDams = new ArrayList<String>();
		andraPradeshDams.add(andraPradeshDam4);
		andraPradeshDams.add(andraPradeshDam3);
		andraPradeshDams.add(andraPradeshDam2);
		andraPradeshDams.add(andraPradeshDam1);

		String gujaratdam1 = "Dharai Dam";
		String gujaratdam2 = "Dantiwada Dam";
		String gujaratdam3 = "Kadana Dam";
		String gujaratdam4 = "Sardar Sarovar Dam";
		String gujaratdam5 = "Ukai Dam";
		Collection<String> gujaratDams = new ArrayList<String>();
		gujaratDams.add(gujaratdam5);
		gujaratDams.add(gujaratdam4);
		gujaratDams.add(gujaratdam3);
		gujaratDams.add(gujaratdam2);
		gujaratDams.add(gujaratdam1);

		String himachalPradesh1 = "Beas Dam";
		String himachalPradesh2 = "Maharana Pratap Dam";
		String himachalPradesh3 = "Nathpa Dam";
		String himachalPradesh4 = "BhakraNangal Dam";
		String himachalPradesh5 = "GobindSagar Dam";
		String himachalPradesh6 = "Chamera Dam";
		Collection<String> himachalPradeshDams = new ArrayList<String>();
		himachalPradeshDams.add(himachalPradesh6);
		himachalPradeshDams.add(himachalPradesh5);
		himachalPradeshDams.add(himachalPradesh4);
		himachalPradeshDams.add(himachalPradesh3);
		himachalPradeshDams.add(himachalPradesh2);
		himachalPradeshDams.add(himachalPradesh1);

		String jk1 = "Baglihar Dam";
		String jk2 = "Salal Dam";
		String jk3 = "Dumkhar Dam";
		String jk4 = "Uri Dam";
		String jk5 = "Chutak Dam";
		Collection<String> jkDams = new ArrayList<String>();
		jkDams.add(jk3);
		jkDams.add(jk2);
		jkDams.add(jk1);
		jkDams.add(jk4);
		jkDams.add(jk5);

		String jharkhandDam1 = "chandil Dam";
		String jharkhandDam2 = "Maithon Dam";
		String jharkhandDam3 = "Panchet Dam";
		Collection<String> jharkhandDams = new ArrayList<String>();
		jharkhandDams.add(jharkhandDam3);
		jharkhandDams.add(jharkhandDam2);
		jharkhandDams.add(jharkhandDam1);

		String keralaDam1 = "BanasuraSagar Dam";
		String keralaDam2 = "Idukki Dam";
		String keralaDam3 = "Walayar Dam";
		String keralaDam4 = "Neyyar Dam";
		String keralaDam5 = "Mullaperiyar Dam";
		String keralaDam6 = "Cheruthoni Dam";
		String keralaDam7 = "Peechi Dam";
		String keralaDam8 = "Kundala Dam";
		String keralaDam9 = "Parambikulam Dam";
		Collection<String> keralaDams = new ArrayList<String>();
		keralaDams.add(keralaDam9);
		keralaDams.add(keralaDam8);
		keralaDams.add(keralaDam7);
		keralaDams.add(keralaDam6);
		keralaDams.add(keralaDam5);
		keralaDams.add(keralaDam4);
		keralaDams.add(keralaDam3);
		keralaDams.add(keralaDam2);
		keralaDams.add(keralaDam1);

		String madhyaPradeshDam1 = "BanSagar Dam";
		String madhyaPradeshDam2 = "Bargi Dam";
		String madhyaPradeshDam3 = "IndiraSagar Dam";
		String madhyaPradeshDam4 = "Rajghat Dam";
		String madhyaPradeshDam5 = "GandhiSagar Dam";
		String madhyaPradeshDam6 = "Tawa Dam";
		String madhyaPradeshDam7 = "Barna Dam";
		Collection<String> madhyaPradeshDams = new ArrayList<String>();
		madhyaPradeshDams.add(madhyaPradeshDam7);
		madhyaPradeshDams.add(madhyaPradeshDam6);
		madhyaPradeshDams.add(madhyaPradeshDam5);
		madhyaPradeshDams.add(madhyaPradeshDam4);
		madhyaPradeshDams.add(madhyaPradeshDam3);
		madhyaPradeshDams.add(madhyaPradeshDam2);
		madhyaPradeshDams.add(madhyaPradeshDam1);

		String maharshtraDam1 = "Manair Dam";
		String maharshtraDam2 = "Radhanagari Dam";
		String maharshtraDam3 = "Vaitarna Dam";
		String maharshtraDam4 = "Bhandardara Dam";
		String maharshtraDam5 = "Girna Dam";
		String maharshtraDam6 = "Khadakwasla Dam";
		String maharshtraDam7 = "Panshet Dam";
		String maharshtraDam8 = "Tansa Dam";
		String maharshtraDam9 = "Wilson Dam";
		String maharshtraDam10 = "Bhatsa Dam";
		String maharshtraDam11 = "Gangapur Dam";
		String maharshtraDam12 = "Jayakwadi Dam";
		String maharshtraDam13 = "Nandur Dam";
		String maharshtraDam14 = "Kolkewadi Dam";
		Collection<String> maharshtraDams = new ArrayList<String>();
		maharshtraDams.add(maharshtraDam14);
		maharshtraDams.add(maharshtraDam13);
		maharshtraDams.add(maharshtraDam12);
		maharshtraDams.add(maharshtraDam11);
		maharshtraDams.add(maharshtraDam10);
		maharshtraDams.add(maharshtraDam9);
		maharshtraDams.add(maharshtraDam8);
		maharshtraDams.add(maharshtraDam7);
		maharshtraDams.add(maharshtraDam6);
		maharshtraDams.add(maharshtraDam5);
		maharshtraDams.add(maharshtraDam4);
		maharshtraDams.add(maharshtraDam3);
		maharshtraDams.add(maharshtraDam2);
		maharshtraDams.add(maharshtraDam1);

		String odishaDam1 = "Jalaput Dam";
		String odishaDam2 = "Balimela Dam";
		String odishaDam3 = "Hirakud Dam";
		String odishaDam4 = "Indravti Dam";
		Collection<String> odishaDams = new ArrayList<String>();
		odishaDams.add(odishaDam4);
		odishaDams.add(odishaDam3);
		odishaDams.add(odishaDam2);
		odishaDams.add(odishaDam1);

		String tamilNaduDam1 = "Vaigal Dam";
		String tamilNaduDam2 = "Aliyar Dam";
		String tamilNaduDam3 = "Perunchani Dam";
		String tamilNaduDam4 = "Manimuthar Dam";
		String tamilNaduDam5 = "Pechiparai Dam";
		String tamilNaduDam6 = "Amaravathi Dam";
		String tamilNaduDam7 = "Periyar Dam";
		String tamilNaduDam8 = "Mettur Dam";
		String tamilNaduDam9 = "Kallanai Dam";
		String tamilNaduDam10 = "BhavaniSagar Dam";
		Collection<String> tamilNaduDams = new ArrayList<String>();
		tamilNaduDams.add(tamilNaduDam1);
		tamilNaduDams.add(tamilNaduDam2);
		tamilNaduDams.add(tamilNaduDam3);
		tamilNaduDams.add(tamilNaduDam4);
		tamilNaduDams.add(tamilNaduDam5);
		tamilNaduDams.add(tamilNaduDam6);
		tamilNaduDams.add(tamilNaduDam7);
		tamilNaduDams.add(tamilNaduDam8);
		tamilNaduDams.add(tamilNaduDam9);
		tamilNaduDams.add(tamilNaduDam10);

		String telanganaDam1 = "NizamSagar Dam";
		String telanganaDam2 = "Singur Dam";
		String telanganaDam3 = "Dindi Dam";
		String telanganaDam4 = "NagarjunaSagar Dam";
		String telanganaDam5 = "Srisailam Dam";
		String telanganaDam6 = "LowerManair Dam";
		String telanganaDam7 = "Ramagundam Dam";
		String telanganaDam8 = "Dummugudem Dam";
		String telanganaDam9 = "SriramSagar Dam";
		String telanganaDam10 = "HimayatSagar Dam";
		Collection<String> telanganaDams = new ArrayList<String>();
		telanganaDams.add(telanganaDam1);
		telanganaDams.add(telanganaDam2);
		telanganaDams.add(telanganaDam3);
		telanganaDams.add(telanganaDam4);
		telanganaDams.add(telanganaDam5);
		telanganaDams.add(telanganaDam6);
		telanganaDams.add(telanganaDam7);
		telanganaDams.add(telanganaDam8);
		telanganaDams.add(telanganaDam9);
		telanganaDams.add(telanganaDam10);

		String uttarPradeshDam1 = "Parichha Dam";
		String uttarPradeshDam2 = "Rihand Dam";
		String uttarPradeshDam3 = "GovindBallabhPant Dam";
		String uttarPradeshDam4 = "Dhauliganga Dam";
		Collection<String> uttarPradeshDams = new ArrayList<String>();
		uttarPradeshDams.add(uttarPradeshDam4);
		uttarPradeshDams.add(uttarPradeshDam3);
		uttarPradeshDams.add(uttarPradeshDam2);
		uttarPradeshDams.add(uttarPradeshDam1);

		String uttarakhandDam1 = "Tehri Dam";
		String uttarakhandDam2 = "Koteshwar Dam";
		String uttarakhandDam3 = "Lakhwar Dam";
		String uttarakhandDam4 = "Dhora Dam";
		String uttarakhandDam5 = "Ramganga Dam";
		Collection<String> uttarakhandDams = new ArrayList<String>();
		uttarakhandDams.add(uttarakhandDam5);
		uttarakhandDams.add(uttarakhandDam4);
		uttarakhandDams.add(uttarakhandDam3);
		uttarakhandDams.add(uttarakhandDam2);
		uttarakhandDams.add(uttarakhandDam1);

		Collection<String> indiaDams = new ArrayList<String>();
		indiaDams.addAll(karnatakaDams);
		indiaDams.addAll(andraPradeshDams);
		indiaDams.addAll(himachalPradeshDams);
		indiaDams.addAll(uttarakhandDams);
		indiaDams.addAll(uttarPradeshDams);
		indiaDams.addAll(tamilNaduDams);
		indiaDams.addAll(telanganaDams);
		indiaDams.addAll(madhyaPradeshDams);
		indiaDams.addAll(maharshtraDams);
		indiaDams.addAll(jharkhandDams);
		indiaDams.addAll(jkDams);
		indiaDams.addAll(odishaDams);
		indiaDams.addAll(gujaratDams);
		indiaDams.addAll(jharkhandDams);
		indiaDams.addAll(keralaDams);

		Iterator<String> element1 = indiaDams.iterator();
		while (element1.hasNext()) {
			String str = element1.next();
			
			if (str.startsWith("T")) {
				System.out.println("DamName starts With T : " + str);
			}
		}
		System.out.println("==================================================");
		Iterator<String> element2 = indiaDams.iterator();
		while (element2.hasNext()) {
			String str = element2.next();
			if (str.endsWith("m")) {
				System.out.println("DamName ends With m : " + str);
			}
		}

		System.out.println("==================================================");

		Iterator<String> element3 = indiaDams.iterator();
		while (element3.hasNext()) {
			String str = element3.next();
			if (str.length() >= 15) {
				System.out.println("Dams length is over 15 character : " + str);
			}
		}

		System.out.println("==================================================");

		Iterator<String> element4 = indiaDams.iterator();
		while (element4.hasNext()) {
			String str = element4.next();
			String upper = str.toUpperCase();
			System.out.println("Dams in UpperCase : " + upper);
		}

		System.out.println("==================================================");

		Iterator<String> element5 = indiaDams.iterator();
		while (element5.hasNext()) {
			String str = element5.next();
			String lower = str.toLowerCase();
			System.out.println("Dams in LowerCase : " + lower);
		}

		System.out.println("==================================================");

		Iterator<String> element6 = indiaDams.iterator();
		while (element6.hasNext()) {
			String str = element6.next();

		}

		System.out.println("==================================================");

		Iterator<String> element7 = indiaDams.iterator();
		System.out.println("Before removal : " + indiaDams.size());
		while (element7.hasNext()) {
			String str = element7.next();

			if (str.startsWith("P")) {
				element7.remove();

			}

		}
		System.out.println("After removal : " + indiaDams.size());

	}

}
