package com.xworkz.runner;

import java.time.LocalDateTime;

import com.xworkz.DTO.PizzaDTO;
import com.xworkz.constant.PizzaSize;
import com.xworkz.repository.PizzaValidateAndSave;
import com.xworkz.repository.PizzaValidateAndSaveImplement;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaValidateAndSave save =new PizzaValidateAndSaveImplement();
		PizzaDTO dto = new PizzaDTO();
		dto.setCreatedBy("Sandeep");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Sandeep");
		dto.setUpdatedDate(LocalDateTime.now());
		dto.setName("Corn Pizza");
		dto.setCompany("Dominos");
		dto.setSize(PizzaSize.SMALL);
		dto.setCheese(true);
		dto.setPrice(225);
		dto.setFlavour("Sezning");
		dto.setType("Veg");
		System.out.println(save.pizzaName("Corn Pizza"));
		System.out.println(dto);
		System.out.println(save.pizzaCompany("Dominos"));
		System.out.println(dto);
		System.out.println(save.PizzaPrice(250));
		System.out.println(dto);
		System.out.println(save.findSize(PizzaSize.MEDIUM));
		System.out.println(dto);
		System.out.println(save.pizzaFlavour("Cheese Burst"));
		System.out.println(dto);
		System.out.println(save.pizzaType("VEG"));
		System.out.println(dto);
		
		
	}

}
