package com.xworkz.caram.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.caram.Caram;

public class CaramRunner {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("caram.xml");
		Caram caram=container.getBean(Caram.class);
        System.out.println(caram);
	}

}
