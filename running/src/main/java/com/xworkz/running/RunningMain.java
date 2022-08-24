package com.xworkz.running;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunningMain {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfigure.xml");
	Running running =(Running)applicationContext.getBean("runbean");
	System.out.println(running.getName());
			
	}

}
