package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo {

	public MissileRepoImpl() {
		System.out.println("Creating MissileRepoImpl const......");
	}
	
	@Override
	public boolean save(MissileDTO mdto) {
		System.out.println("Running Save in Repo");
		System.out.println("Saved repo :"+mdto);
		return true;
	}

}
