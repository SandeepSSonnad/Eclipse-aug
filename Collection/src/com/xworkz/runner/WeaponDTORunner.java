package com.xworkz.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.constant.WeaponType;
import com.xworkz.dto.WeaponDTO;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO wdto1 = new WeaponDTO("Machine Gun", "Metal", LocalDate.of(2023, 01, 29), 1000,
				WeaponType.ARTILLERY_WEAPON);
		WeaponDTO wdto2 = new WeaponDTO("Hydrogen cyanide", "Chemicals", LocalDate.of(2023, 02, 22), 500,
				WeaponType.CHEMICAL_WEAPONS);
		WeaponDTO wdto3 = new WeaponDTO("Sword", "Steel", LocalDate.of(2023, 03, 21), 100,
				WeaponType.HAND_TO_HAND_WEAPON);
		WeaponDTO wdto4 = new WeaponDTO("Grenade", "Chemicals", LocalDate.of(2023, 04, 05), 2000,
				WeaponType.EXPLOSIVES);
		WeaponDTO wdto5 = new WeaponDTO("Bomb", "Chemicals", LocalDate.of(2023, 05, 19), 5000,
				WeaponType.EXPLOSIVES);
		WeaponDTO wdto6 = new WeaponDTO("RDX", "Chemicals", LocalDate.of(2023, 06, 18), 10000,
				WeaponType.EXPLOSIVES);
		WeaponDTO wdto7 = new WeaponDTO("V-2 Missile", "Metal", LocalDate.of(2023, 07, 17), 10000,
				WeaponType.MISSILES);
		WeaponDTO wdto8 = new WeaponDTO("Trident Missile", "Metal", LocalDate.of(2023, 8, 16), 20000,
				WeaponType.MISSILES);
		WeaponDTO wdto9 = new WeaponDTO("Torpedo", "Metal", LocalDate.of(2023, 9, 25), 5000,
				WeaponType.MISSILES);
		WeaponDTO wdto10 = new WeaponDTO("Hand Gun", "Iron", LocalDate.of(2023, 10, 14), 100,
				WeaponType.SEMIAUTOMATIC_WEAPONS);
		WeaponDTO wdto11 = new WeaponDTO("Pistol", "Iron", LocalDate.of(2023, 12, 12), 200,
				WeaponType.SEMIAUTOMATIC_WEAPONS);
		WeaponDTO wdto12 = new WeaponDTO("M16 Rifle", "Iron", LocalDate.of(2023, 11, 14), 1000,
				WeaponType.SEMIAUTOMATIC_WEAPONS);
		WeaponDTO wdto13 = new WeaponDTO("Ak 47", "Iron", LocalDate.of(2022, 01, 13), 2000,
				WeaponType.SEMIAUTOMATIC_WEAPONS);
		WeaponDTO wdto14 = new WeaponDTO("Revolver", "Iron", LocalDate.of(2022, 02, 28), 500,
				WeaponType.SEMIAUTOMATIC_WEAPONS);
		WeaponDTO wdto15 = new WeaponDTO("Sten Gun", "Steel", LocalDate.of(2022, 03, 02), 1500,
				WeaponType.AUTOMATIC_WEAPONS);
		WeaponDTO wdto16 = new WeaponDTO("MAG Machine Gun", "Metal", LocalDate.of(2022, 04, 30), 24000,
				WeaponType.AUTOMATIC_WEAPONS);
		WeaponDTO wdto17 = new WeaponDTO("Nerve Gas", "Gas", LocalDate.of(2022, 05, 14), 3000,
				WeaponType.CHEMICAL_WEAPONS);
		WeaponDTO wdto18 = new WeaponDTO("Knife", "Steel", LocalDate.of(2022, 06, 23), 50,
				WeaponType.HAND_TO_HAND_WEAPON);
		WeaponDTO wdto19 = new WeaponDTO("Bow And Arrow", "Iron", LocalDate.of(2022, 07, 12), 150,
				WeaponType.HAND_TO_HAND_WEAPON);
		WeaponDTO wdto20 = new WeaponDTO("AX", "Wood", LocalDate.of(2022, 12, 10), 100,
				WeaponType.HAND_TO_HAND_WEAPON);
		
		Collection<WeaponDTO> weapon=Stream.of(wdto1,wdto2,wdto3,wdto4,wdto5,wdto6,wdto7,wdto8,wdto9,wdto10
				,wdto11,wdto12,wdto13,wdto14,wdto15,wdto16,wdto17,wdto18,wdto19,wdto20)
				.collect(Collectors.toList());
		
		System.out.println("Printing All weapon by price greater than");
		weapon.stream()
		.filter(ele->ele.getPrice() > 10000)
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Printing All Weapons madeBy");
		weapon.stream()
		.map((ele)->ele.getMadeBy())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Printing All Weapon madeOn");
		weapon.stream()
		.map(ele->ele.getMadeOn())
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting the Name in Ascending Order");
		weapon.stream()
		.sorted()
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting the Name in Descending Order");
		Comparator<WeaponDTO> dto=(ele1,ele2)->ele2.getName().compareTo(ele1.getName());
				weapon.stream()
				.sorted(dto).forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting The madeBy in Ascending Order");
		weapon.stream()
		.sorted((ele1,ele2)->ele1.getMadeBy().compareTo(ele2.getMadeBy()))
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting The madeOn in Ascending Order");
		weapon.stream()
		.sorted((ele1,ele2)->ele1.getMadeOn().compareTo(ele2.getMadeOn()))
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting The Price in Ascending Order");
		weapon.stream()
		.sorted((a1,a2)->Integer.compare(a1.getPrice(), a2.getPrice()))
		.forEach(ele->System.out.println(ele));
		

		System.out.println("Sorting The Price in Descending Order");
		weapon.stream()
		.sorted((a1,a2)->Integer.compare(a2.getPrice(), a1.getPrice()))
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting the name And MadeOn in Ascending Order");
		weapon.stream()
		.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		.sorted((a3,a4)->a3.getMadeOn().compareTo(a4.getMadeOn()))
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Sorting the type,MadeBy,Name in Descending Order");
		weapon.stream()
		
		.sorted((c1,c2)->c2.getMadeBy().compareTo(c1.getMadeBy()) )
		
		.forEach(ele->System.out.println(ele));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
