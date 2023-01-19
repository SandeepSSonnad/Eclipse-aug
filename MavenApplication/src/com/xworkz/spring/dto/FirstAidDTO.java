package com.xworkz.spring.dto;

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
public class FirstAidDTO extends AbstractAuditDTO{
	
	@NotBlank
	@NotNull
	@Size(min = 3,max = 20, message ="Tablet Name SHould Be greater Than 3 and Less than 20" )
	private String tablet;
	
	@NotBlank
	@NotNull
	@Size(min = 3,max = 20, message ="Bandage Name SHould Be greater Than 3 and Less than 20" )
	private String bandage;

}
