package com.xworkz.spring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class TerroristDTO extends AbstractAuditDTO {

	@NonNull
	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 3, max = 20, message = "Name is invalid,should be greater than 3 and less than 20")
	private String name;
	
	@NonNull
	@Min(value = 1, message = "Age should be greater than 1")
	@Max(value = 150, message = "Age should be less than 150")
	private int age;
	
	@NonNull
	@NotNull(message = "Terrorist Country cannot be null")
	@Size(min = 3,max = 20, message = "CountryName should be greater than 3 and less than 20")
	private String country;
	
	private boolean alive;
	
	private boolean prison;
	
	@NotNull(message = "Terrorist specialisation Cannot be null")
	@Size(min = 3, max = 20, message = "specialisationName should be greater than 3 and less than 20")
	private String specialisation;
	
	@NotNull(message = "Terrorist organisation cannot be null")
	@Size(min = 3, max = 25, message = "organisationName should be greater than 3 and less than 25")
	private String organisation;
	


	
	
	
	
}
