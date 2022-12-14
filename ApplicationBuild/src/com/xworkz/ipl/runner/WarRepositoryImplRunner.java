package com.xworkz.ipl.runner;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.repository.WarRepository;
import com.xworkz.repository.WarRepositoryImpl;

public class WarRepositoryImplRunner {

	public static void main(String[] args) {

		WarRepository repo=new WarRepositoryImpl();
		WarDTO dto=new WarDTO();
		dto.setName("RussiaUkrain War");
		dto.setStartedDate(LocalDateTime.of(2021, 02, 1, 12, 00));
		dto.setEndDate(LocalDateTime.of(2022, 03, 31, 12, 00));
		dto.setStartedBy("Russia");
		dto.setStartedWith("Ukrain");
		dto.setWonBy("Russia");
		dto.setNoOfDeaths(1000);
		dto.setcreatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.of(2022,12,13,21,10));
		dto.setUpdatedBy("Sandeep");
		dto.setUpdatedDate(LocalDateTime.of(2022, 12, 13, 21, 15));
		repo.create(dto);
		System.out.println(System.lineSeparator());
		repo.total();
		System.out.println(repo.findByStartedBy("Russia"));
		System.out.println(System.lineSeparator());
		System.out.println(repo.findByStartedByStartedWith("Russia", "Ukrain"));
		System.out.println(System.lineSeparator());
		System.out.println(repo.findByStartDateGreaterThanOrEqualTo(LocalDateTime.of(2022,12,13,21,10)));
		System.out.println(System.lineSeparator());
		System.out.println(repo.findByStartDateLesserThanOrEqualTo(LocalDateTime.of(2022,12,13,21,15)));
		System.out.println(System.lineSeparator());
		System.out.println(repo.findByStartDateAndEndDate(LocalDateTime.of(2021, 02, 1, 12, 00), LocalDateTime.of(2022, 03, 31, 12, 00)));
		
		
		
		
		
		
		
	}

}
