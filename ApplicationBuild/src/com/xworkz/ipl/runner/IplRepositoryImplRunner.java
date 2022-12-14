package com.xworkz.ipl.runner;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.repository.IplRepository;
import com.xworkz.repository.IplRepositoryImpl;

public class IplRepositoryImplRunner {

	public static void main(String[] args) {

		IplRepository repository = new IplRepositoryImpl();
		IplDTO dto = new IplDTO();
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat Kholi");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();
		System.out.println(repository.findTeamName("kohli"));
		

		System.out.println(System.lineSeparator());

		dto.setTeamName("CSK");
		dto.setCaptainName("Dhoni");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("Mumbai Indians");
		dto.setCaptainName("Hardhik Pandey");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("SunRise Hydrabad");
		dto.setCaptainName("Yash");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("Belavigi Rockers");
		dto.setCaptainName("Sandy");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("Kolkata KnightRides");
		dto.setCaptainName("SharuKhan");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("Indian Team");
		dto.setCaptainName("Sachin");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("Karnataka");
		dto.setCaptainName("Sudeepa");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("KGF Rockers");
		dto.setCaptainName("Yash");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();

		System.out.println(System.lineSeparator());

		dto.setTeamName("BTM Killers");
		dto.setCaptainName("Omkar");
		dto.setOwnerAlive(true);
		dto.setPurse(2);
		dto.setWins(0);
		dto.setDefeats(8);
		dto.setcreatedBy("Sandeep");
		dto.setUpdatedBy("Sandeep");
		dto.setcreatedDate(LocalDateTime.now());
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		repository.total();
		
		System.out.println(System.lineSeparator());
		
		System.out.println(repository.findTeamName("BTM Killers"));

		

	}

}
