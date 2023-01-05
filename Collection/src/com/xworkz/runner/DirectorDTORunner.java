package com.xworkz.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.dto.DirectorDTO;

public class DirectorDTORunner {

	public static void main(String[] args) {

		DirectorDTO dto1 = new DirectorDTO("Kgf", 10000, 10000d, "Kannada", LocalDate.of(2021, 11, 20));
		DirectorDTO dto2 = new DirectorDTO("Googly", 20000, 15000d, "English", LocalDate.of(2016, 06, 21));
		DirectorDTO dto3 = new DirectorDTO("MasterPiece", 30000, 20000d, "Hindi", LocalDate.of(2018, 07, 13));
		DirectorDTO dto4 = new DirectorDTO("Santhu Straight Forward", 40000, 25000d, "Telugu",LocalDate.of(2019, 12, 23));
		DirectorDTO dto5 = new DirectorDTO("Ramachari", 50000, 350000d, "Tamil", LocalDate.of(2020, 01, 07));

		Collection<DirectorDTO> director = Stream.of(dto1, dto2, dto3, dto4, dto5).collect(Collectors.toList());

		System.out.println("Comparing starts...........");

		System.out.println("Ascending Film name");
		director.stream().sorted().forEach(ele -> System.out.println(ele));

		System.out.println("Descending Film name");
		director.stream().sorted((a1, a2) -> a2.getFilm().compareTo(a1.getFilm()))
				.forEach(ele -> System.out.println(ele));

		System.out.println("Budget Ascending..");
		director.stream().sorted((e1, e2) -> Double.compare(e1.getBudget(), e2.getBudget()))
				.forEach(ele -> System.out.println(ele));

		System.out.println("Budget Descending");
		director.stream().sorted((ele1, ele2) -> Double.compare(ele2.getBudget(), ele1.getBudget()))
				.forEach(ele -> System.out.println(ele));

		System.out.println("profit Ascending order");
		Comparator<DirectorDTO> dto = (d1, d2) -> Integer.compare(d1.getProfit(), d2.getProfit());
		director.stream().sorted(dto).forEach(ele -> System.out.println(ele));

		System.out.println("profit Descending order");
		Comparator<DirectorDTO> dirdto = (p1, p2) -> Integer.compare(p2.getProfit(), p1.getProfit());
		director.stream().sorted(dirdto).forEach(ele -> System.out.println(ele));

		System.out.println("Date Ascending order");
		Comparator<DirectorDTO> dtos = (d1, d2) -> d1.getDate().compareTo(d2.getDate());
		director.stream().sorted(dtos).forEach(ele -> System.out.println(ele));

		System.out.println("Date Descending order");
		Comparator<DirectorDTO> dtos1 = (d1, d2) -> d2.getDate().compareTo(d1.getDate());
		director.stream().sorted(dtos1).forEach(d1 -> System.out.println(d1));

		System.out.println("==========================================");

	}

}
