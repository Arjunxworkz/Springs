package com.xworkz.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileRunner {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");
		Mobile mobile=container.getBean(Mobile.class);
		System.out.println(mobile.toString());
	}

}
