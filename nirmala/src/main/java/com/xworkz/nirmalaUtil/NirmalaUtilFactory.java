package com.xworkz.nirmalaUtil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NirmalaUtilFactory {
private static EntityManagerFactory factory;
	
	public static  EntityManagerFactory getfactory() {
		return factory;
	}
	
	static {
		factory=Persistence.createEntityManagerFactory("com.xworkz");
	}
}
