package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

import com.xworkz.ipl.things.AbstractAuditDTO;

public class WarDTO extends AbstractAuditDTO {

	private String name;
	private LocalDateTime startedDate;
	private LocalDateTime endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;

	public WarDTO() {
		System.out.println("Running WarDTO");
	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startedDate=" + startedDate + ", endDate=" + endDate + ", startedBy="
				+ startedBy + ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
