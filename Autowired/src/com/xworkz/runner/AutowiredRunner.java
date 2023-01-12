package com.xworkz.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Bike;
import com.xworkz.bean.Engine;
import com.xworkz.bean.Ghost;
import com.xworkz.bean.HardwareShop;
import com.xworkz.bean.NewsPaper;
import com.xworkz.bean.Pencil;
import com.xworkz.bean.Rubber;
import com.xworkz.bean.Snake;
import com.xworkz.bean.Software;
import com.xworkz.bean.SoftwareEngineer;
import com.xworkz.configuration.AutoWiredConfiguration;

public class AutowiredRunner {

	public static void main(String[] args) {
		
		ApplicationContext container= new AnnotationConfigApplicationContext(AutoWiredConfiguration.class);
		
		String[] names=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
		HardwareShop shop=container.getBean(HardwareShop.class);
		System.out.println(shop);
		
		int ids=container.getBean("id",int.class);
		System.out.println(ids);
		String str=container.getBean("name",String.class);
		System.out.println(str);
		String gst=container.getBean("gstNum",String.class);
		System.out.println(gst);
		String string=container.getBean("ownerName",String.class);
		System.out.println(string);
		Object adrs=container.getBean("address");
		System.out.println(adrs);
		
		System.out.println("===============================================");
		
		Software soft=container.getBean(Software.class);
		System.out.println(soft);
		System.out.println(container.getBean("softwareName"));
		System.out.println(container.getBean("softwareVersion"));
		System.out.println(container.getBean("developerName"));
		System.out.println(container.getBean("date"));
		System.out.println(container.getBean("free"));
		
		System.out.println("=========================================");
		
		SoftwareEngineer engineer=container.getBean(SoftwareEngineer.class);
		System.out.println(engineer);
		System.out.println(container.getBean("engineerName"));
		System.out.println(container.getBean("salary"));
		System.out.println(container.getBean("companyName"));
		System.out.println(container.getBean("experience"));
		
		System.out.println("=============================================");
		Pencil pencil=container.getBean(Pencil.class);
		System.out.println(pencil);
		System.out.println(container.getBean("pencilName"));
		System.out.println(container.getBean("pencilType"));
		System.out.println(container.getBean("pencilPrice"));
		System.out.println(container.getBean("pencilColor"));
		System.out.println(container.getBean("pencilSharp"));
		System.out.println(container.getBean("stolen"));
		
		System.out.println("=============================================");
		
		Rubber rub=container.getBean(Rubber.class);
		System.out.println(rub);
		System.out.println(container.getBean("rubberName"));
		System.out.println(container.getBean("rubberType"));
		System.out.println(container.getBean("rubberPrice"));
		System.out.println(container.getBean("rubberColor"));
		System.out.println(container.getBean("rubberSharp"));
		System.out.println(container.getBean("rubberStolen"));
		System.out.println(container.getBean("rubberSize"));
		
		System.out.println("=======================================");
		
		Bike bike=container.getBean(Bike.class);
		System.out.println(bike);
		System.out.println(container.getBean("bikeName"));
		System.out.println(container.getBean("bikeCC"));
		System.out.println(container.getBean("bikePrice"));
		System.out.println(container.getBean("bikeWheels"));
		System.out.println(container.getBean("bikeBrand"));
		System.out.println(container.getBean("bikeColor"));
		
		System.out.println("=====================================");
		
		NewsPaper paper=container.getBean(NewsPaper.class);
		System.out.println(paper);
		
		System.out.println("=========================================");
		
		Engine engine=container.getBean(Engine.class);
		System.out.println(engine);
		
		System.out.println("==================================");
		
		Snake snake=container.getBean(Snake.class);
		System.out.println(snake);
		
		System.out.println("=======================================");
		
		Ghost ghost=container.getBean(Ghost.class);
		System.out.println(ghost);
		
		
		
		
	}

}
