package com.xworkz.dto;

public class CompanyCEODTO {

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;
	private DaughterDTO daughter;

	public CompanyCEODTO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODTO(String name, String company, int age, String country, String qualification, boolean married,
			DaughterDTO daughter) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughter = daughter;
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daughter=" + daughter + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODTO) {
				CompanyCEODTO dto = (CompanyCEODTO) obj;
				if (dto.getName().equals(this.name))
					return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDTO getDaughter() {
		return daughter;
	}

	public void setDaughter(DaughterDTO daughter) {
		this.daughter = daughter;
	}

}
