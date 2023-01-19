package com.xworkz.spring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDTO extends AbstractAuditDTO{

	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "Name Should be minimum 3 and Maximum 20")
	private String name;
	
	@Min(value = 1,message = "Id should be greater than 1")
	@Max(value = 1000,message = "Id should Not be less than 1000")
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "BetalianName Should be minimum 3 and Maximum 20")
	private String betalian;
	
	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "Rank Should be minimum 3 and Maximum 20")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "CountryName Should be minimum 3 and Maximum 20")
	private String country;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
