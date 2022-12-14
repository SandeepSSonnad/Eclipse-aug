package com.xworkz.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	boolean create(WarDTO[] dtos);

	int total();

	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}

	default WarDTO findByStartedByStartedWith(String startedBy, String startedWith) {
		return null;
	}

	default WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date) {
		return null;
	}

	default WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime date) {
		return null;
	}

	default WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		return null;
	}
}
