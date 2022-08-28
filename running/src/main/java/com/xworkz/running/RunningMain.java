package com.xworkz.running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunningMain {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfigure.xml");
	
	System.out.println(applicationContext);
	
	Running run=applicationContext.getBean(Running.class);	
	//System.out.println("Running name :"+run.name);
	
	System.out.println("Running name :"+run.name);
	System.out.println("Running avg :"+run.avg);
	
	Integer intger =applicationContext.getBean(Integer.class);
	System.out.println(intger);
	
	String str=applicationContext.getBean(String.class);
	System.out.println(str);
	
	Double dbl=applicationContext.getBean(Double.class);
	System.out.println(dbl);
	
	Boolean bl=applicationContext.getBean(Boolean.class);
	System.out.println(bl);
	Long lg=applicationContext.getBean(Long.class);
	System.out.println(lg);
	
	}
	
	
	

}
