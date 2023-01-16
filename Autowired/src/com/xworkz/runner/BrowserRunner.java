package com.xworkz.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Chrome;
import com.xworkz.bean.FireBox;
import com.xworkz.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {


		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Chrome chr=container.getBean(Chrome.class);
		chr.browse();
		
		FireBox box=container.getBean(FireBox.class);
		box.browse();

	}

}
