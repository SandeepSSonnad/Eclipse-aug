package com.xworkz.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.ArraySizeIsFullException;

public class IplRepositoryImpl implements IplRepository{

	private IplDTO[]  ipldto=new IplDTO[10];
	private int index=0;
	
	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running Create ipldto");
		if(this.index >= this.ipldto.length) {
			System.out.println("Running custom Exception");
			throw new ArraySizeIsFullException();
		}
		
		this.ipldto[this.index]=dto;
		System.out.println("Saved:"+dto+"In index"+this.index);
		index++;
		
		return false;
	}
 
	@Override
	public IplDTO findTeamName(String name) {
		System.out.println("Running findTeamName");
		for (IplDTO iplDTO2 : this.ipldto) {
			if(iplDTO2!=null && iplDTO2.getTeamName().equals(name)) {
				System.out.println("Name is Matched:"+name);
				return iplDTO2;
			}
			else {
				System.out.println("Name is not matched");
				return iplDTO2;
				
			}
		}
		return IplRepository.super.findTeamName(name);
	}
}
