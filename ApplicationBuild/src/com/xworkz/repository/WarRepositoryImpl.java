package com.xworkz.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exception.ArraySizeIsFullException;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] wardto = new WarDTO[10];
	private int index;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running Create Method");

		if (this.index >= this.wardto.length) {
			System.out.println("Running Custom Exception ");
			throw new ArraySizeIsFullException();
		}
		this.wardto[this.index] = dto;
		System.out.println("Saved:" + dto + "Index" + this.index);
		index++;

		return false;
	}

	@Override
	public boolean create(WarDTO[] dtos) {
		System.out.println("Running Create Array");
		return false;
	}

	@Override
	public int total() {
		System.out.println("Running Total Method");
		return 0;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("Searching Who Started War");
		for (WarDTO wdto : wardto) {
			if (wdto != null && wdto.getStartedBy().equals(startedBy)) {
				System.out.println("I Found who Started First:" + startedBy);
				return wdto;
			}
		}
		System.out.println("Not Found Who Started First");
		return WarRepository.super.findByStartedBy(startedBy);
	}

	@Override
	public WarDTO findByStartedByStartedWith(String startedBy, String startedWith) {
		System.out.println("Searching Who and With Whom War is Happen");
		for (WarDTO wdto2 : wardto) {
			if (wdto2 != null && wdto2.getStartedBy().equals(startedBy) && wdto2.getStartedWith().equals(startedWith)) {
				System.out.println("War Started By:" + startedBy);
				System.out.println("War Started With:" + startedWith);
				return wdto2;
			}
		}
		System.out.println("Not found Who and With Whom War is Happened");
		return WarRepository.super.findByStartedByStartedWith(startedBy, startedWith);
	}

	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime Date) {
		System.out.println("Checking War Started Date Greater than Today Date");
		for (WarDTO wdto3 : wardto) {
			if(wdto3 != null && wdto3.getStartedDate().isAfter(Date)) {
				System.out.println("War Started Date is Greater Than Today Date ");
				return wdto3;
			}
			
		}
        System.out.println("War Started Date is not greater Than Today Date");
		return WarRepository.super.findByStartDateGreaterThanOrEqualTo(Date);
	}
	
	@Override
	public WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime date) {
		System.out.println("Checking War Started date is lesser are Not");
		for (WarDTO wdto4 : wardto) {
			if(wdto4 != null && wdto4.getStartedDate().isBefore(date)) {
				System.out.println("War Started Date is Lesser Than Today Date");
				return wdto4;
			}
		}
		System.out.println("War Started Date is not Lesser Than Today Date");
		return WarRepository.super.findByStartDateLesserThanOrEqualTo(date);
	}
	 
	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		System.out.println("Finding Start Date and End Date");
		for(WarDTO wdto5: wardto) {
			if(wdto5 != null && wdto5.getStartedDate().equals(start) &&
					wdto5.getEndDate().equals(end)) {
				System.out.println("Started Date is Found:"+start);
				System.out.println("Ended Date is Found:"+end);
				return wdto5;
			}
		}
		System.out.println("Started Date and Ended Date is not Found");
		return WarRepository.super.findByStartDateAndEndDate(start, end);
	}

}
