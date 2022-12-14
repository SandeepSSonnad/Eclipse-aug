package com.xworkz.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {
	
	boolean create(IplDTO dto);
	
	default int total() {
		return 0;
	}
	
	default IplDTO findTeamName(String name) {
		return null;
	}
	
	
	

}
