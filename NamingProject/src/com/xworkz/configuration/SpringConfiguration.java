package com.xworkz.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Actor;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean("email")
	public String email() {
		return "sandeepgmail.com";
	}

	@Bean("password")
	public String password() {
		System.out.println("Running Password.......");
		String str = new String("Sandy24@");
		return str;
	}

	@Bean("first")
	public String firstName() {
		System.out.println("First Name..");
		String s1 = new String("Sandeep");
		return s1;
	}

	@Bean("last")
	public String lastName() {
		System.out.println("Last Name...");
		return "Sonnad";
	}
	
	@Bean("film")
	public String filmName() {
		String film=new String("KGF");
		return film;
	}
	
	
	
	@Bean("petrol")
	public Double petrolPrice() {
		System.out.println("Petrol Price in karnataka");
		Double price=new Double(101.2d);
		return price;
	}
	
	@Bean("diesel")
	public Double dieselPrice() {
		System.out.println("Diesel Price in karnataka");
		double die=98.0;
		return die;
	}
	
	@Bean("chocolate")
	public Double chocolatePrice() {
		System.out.println("kaccha MangoBite");
		double kaccha=2.0;
		return kaccha;
	}
	
	@Bean("pencil")
	public Double pencilRate() {
		System.out.println("Apsara Pencil");
		double pencil=15.0;
		return pencil;
	}
	
	@Bean("laptop")
	public Double laptopPrice() {
		System.out.println("Dell Laptop Price");
		double pc=60000.0;
		return pc;
	}
	
	@Bean("single")
	public boolean isSingle() {
		System.out.println("Are u Single");
		return true;
	}
	
	@Bean("love")
	public boolean love() {
		System.out.println("Love is Blind");
		return false;
	}
	
	@Bean("crush")
	public boolean haveCrush() {
		System.out.println("Are U Having Crush on any Girls");
		return true;
	}
	
	@Bean("job")
	public boolean haveJob() {
		System.out.println("u have Job");
		return false;
	}
	
	@Bean("life")
	public boolean happyLife() {
		System.out.println("U have Happieness In your Life");
		return false;
	}
	
	@Bean("arrayList")
	public ArrayList cityNames() {
		ArrayList<String> city=new ArrayList<String>();
		city.add("Bangalore");
		city.add("Belgaum");
		city.add("Haveri");
		city.add("Belavigi");
		city.add("Hubli");
		
		city.stream()
		.forEach(ele->System.out.println(ele));
		
		return city;
	}
	
	@Bean("map")
	public Map carName() {
		Map<String, Integer> cars=new HashMap<String, Integer>();
		cars.put("Swift", 900000);
		cars.put("Mahindra Thar", 1000000);
		cars.put("Tata Nexon", 800000);
		cars.put("Mahindra XUV700", 1300000);
		cars.put("Tata Punch", 600000);
		
		Set<String> keys=cars.keySet();
		keys.forEach(ele->System.out.println(ele));
		
		Collection<Integer> values=cars.values();
		values.forEach(ele->System.out.println(ele));
		
		Set<Entry<String, Integer>> entries=cars.entrySet();
		entries.forEach(ele->System.out.println(ele));
		
		return cars;
	}
	
	@Bean("stringBuilder")
	public StringBuilder reverse() {
		String name="Sandeep";
		String lastName="Sonnad";
		
		StringBuilder build=new StringBuilder(name);
		build.reverse();
		
		StringBuilder builder=new StringBuilder(name);
		StringBuilder str=builder.insert(7, 'S');
		System.out.println(str);
		
		StringBuilder builders=new StringBuilder(str);
		System.out.println(builders.capacity());
		
		StringBuilder build3=new StringBuilder(name);
		System.out.println(build3.replace(7,8, lastName));
		
		StringBuilder build4=new StringBuilder(name);
		System.out.println(build4.delete(5, 7));
		
		return build;
	}
	
	@Bean("stringBuffer")
	public StringBuffer size() {
		String film="Kantara";
		
		StringBuffer buffer=new StringBuffer(film);
		char ch=buffer.charAt(5);
		System.out.println("Character at 5 :"+ch);
		
		StringBuffer buffer2=new StringBuffer(film);
		System.out.println("Capacity Of StringBuffer :"+buffer2.capacity());
		
		StringBuffer buffer3=new StringBuffer(film);
		System.out.println("Total Length :"+buffer3.length());
		
		StringBuffer buffer4=new StringBuffer(film);
		System.out.println("Append :"+buffer4.append("2"));
		
		StringBuffer buffer5=new StringBuffer("Public Music");
		System.out.println("Substring :"+buffer5.substring(6));
		
		return buffer;
	}
	
	@Bean
	public Rocket rocket() {
		System.out.println("Launching Rocket");
		Rocket rocky=new Rocket();
		return rocky;
	}
	
	@Bean
	public Season season() {
		System.out.println("Running Season..........");
		Season sea=new Season();
		sea.setName("Spring");
		sea.setDuration(3);
		sea.setStartingMonth("March");
		return sea;
	}
	
	
	
	
	
	
	
	
	
	
	

}
