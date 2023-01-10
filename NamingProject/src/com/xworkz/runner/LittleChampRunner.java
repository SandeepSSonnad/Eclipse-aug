package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.*;
import com.xworkz.things.Actor;
import com.xworkz.things.LittleChamp;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

public class LittleChampRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(spring.getBean(LittleChamp.class));
		
		
		String str=spring.getBean("email",String.class);
		System.out.println(str);
		
		String string=spring.getBean("password",String.class);
		System.out.println(string);
		
		String str3=spring.getBean("first",String.class);
		System.out.println(str3);
		
		String str4=spring.getBean("last",String.class);
		System.out.println(str4);
		
		String str5=spring.getBean("film",String.class);
		System.out.println(str5);

		System.out.println("========================================");
		
		System.out.println(spring.getBean("petrol",Double.class));
		System.out.println(spring.getBean("diesel",Double.class));
		System.out.println(spring.getBean("chocolate",Double.class));
		System.out.println(spring.getBean("pencil",Double.class));
		System.out.println(spring.getBean("laptop",Double.class));

		System.out.println("========================================");
		
		System.out.println(spring.getBean("single",boolean.class));
		System.out.println(spring.getBean("love",boolean.class));
		System.out.println(spring.getBean("crush",boolean.class));
		System.out.println(spring.getBean("life",boolean.class));
		System.out.println(spring.getBean("job",boolean.class));

		System.out.println("===========================");
		
		System.out.println(spring.getBean("arrayList",ArrayList.class));
		System.out.println(spring.getBean("map",Map.class));
		
		System.out.println(spring.getBean("stringBuilder",StringBuilder.class));
		System.out.println(spring.getBean("stringBuffer",StringBuffer.class));
		
		Rocket refofRocket  =spring.getBean(Rocket.class);
		System.out.println(refofRocket);
		System.out.println(refofRocket.getCountry());
		System.out.println(refofRocket.getName());
		System.out.println(refofRocket.getBudget());
		
		Rocket refofRocket2  =spring.getBean(Rocket.class);
		System.out.println(refofRocket2);
		System.out.println(refofRocket2.getCountry());
		System.out.println(refofRocket2.getName());
		System.out.println(refofRocket2.getBudget());
		
		Actor refofActor =spring.getBean(Actor.class);
		System.out.println(refofActor);
		System.out.println(refofActor.getName());
		System.out.println(refofActor.getLanguage());
		System.out.println(refofActor.getAge());
		
		Season refofSeason= spring.getBean(Season.class);
		System.out.println(refofSeason);
		System.out.println(refofSeason.getName());
		System.out.println(refofSeason.getDuration());
		System.out.println(refofSeason.getStartingMonth());
		
		Season refofSeason2= spring.getBean("season",Season.class);
		System.out.println(refofSeason2);
		System.out.println(refofSeason2.getName());
		System.out.println(refofSeason2.getDuration());
		System.out.println(refofSeason2.getStartingMonth());
		
		
		
	}

}
