package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	public FirstAidRepoImpl() {
		System.out.println("Creating FirstAidRepoImpl Constructor with No-args constructor");
	}
	
	
	@Override
	public boolean Save(FirstAidDTO aidDTO) {
		System.out.println("Running save in repo");
		System.out.println("Saving DTO with Repo :"+aidDTO);
		return true;
	}

}
