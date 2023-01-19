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

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MissileDTO extends AbstractAuditDTO {
	
	@NotBlank
	@NotNull
	@Size(min = 3,max = 10,message = "Name Should be greater than 3 and less than 10")
	private String name;
	
	@NotBlank
	@NotNull
	@Size(min = 3,max = 20,message = "CountryName Should be greater than 3 and less than 20")
	private String country;
	
	@Min(value = 100000 ,message = "Budget Should be Minimum 1 Lakhs")
	@Max(value = 10000000,message = "Budget should not be more than 1 cr")
	private int budget;
	
	
	
	

}
