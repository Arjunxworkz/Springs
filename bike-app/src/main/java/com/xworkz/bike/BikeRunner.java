package com.xworkz.bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeRunner {

	public static void main(String[] args) {
		 ApplicationContext context =new	ClassPathXmlApplicationContext("configure.xml");
	
	      Bike bike=context.getBean(Bike.class);
	       System.out.println(bike);
	}

}
