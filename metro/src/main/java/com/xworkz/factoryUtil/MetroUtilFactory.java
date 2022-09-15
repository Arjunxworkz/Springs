package com.xworkz.factoryUtil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MetroUtilFactory {
	private static EntityManagerFactory factory;
	
	public static  EntityManagerFactory getfactory() {
		return factory;
	}
	
	static {
		factory=Persistence.createEntityManagerFactory("com.xworkz");
	}

}
