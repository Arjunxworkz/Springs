package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
     ApplicationContext context =new	ClassPathXmlApplicationContext("configure.xml");
     Tv tv= context.getBean(Tv.class);
     System.out.println(tv);
	}

}
