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
public class ResortDTO extends AbstractAuditDTO {
	
	@NotBlank
	@NotNull
	@Size(min = 5,max = 20,message = "Resort Name should be min 5 and not more than 20")
	private String name;
	
	@NotBlank
	@NotNull
	@Size(min = 3,max = 20,message = "LocationName should be min 3 and not more than 20")
	private String location;
	
	@Min(value = 400,message = "Rent should be minimum 400 Rs")
	@Max(value = 1500, message = "Rent Should not be more than 1500 Rs ")
	private int rent;
	

}
