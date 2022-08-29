package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
     ApplicationContext context =new	ClassPathXmlApplicationContext("configure.xml");
     Tv tv= context.getBean(Tv.class);
     System.out.println(tv);
     
     TvDisplay tvd=context.getBean(TvDisplay.class);
     System.out.println(tvd);
     
     TvRemote tvr=context.getBean(TvRemote.class);
     System.out.println(tvr);
     
     TvStand tvs=context.getBean(TvStand.class);
     System.out.println(tvs);
     
     TvSetupBox tvb=context.getBean(TvSetupBox.class);
     System.out.println(tvb);
     
     
     
	}

}
