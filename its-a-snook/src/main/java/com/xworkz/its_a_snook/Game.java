package com.xworkz.its_a_snook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {
public static void main(String[] args) {
	
  ApplicationContext context= new ClassPathXmlApplicationContext("applicationConfigure.xml");
  
 // System.out.println( context);
  SnookerGame gm=context.getBean(SnookerGame.class);
  System.out.println("Onwer name "+gm.onwerName);
  System.out.println("Location "+gm.location);
  System.out.println("TotalTable "+gm.totalTable);
  System.out.println("ChargesPerHours "+gm.chargesPerHours);
  
  SnookerGame snooker=(SnookerGame) context.getBean("its");
  

  
}
}
