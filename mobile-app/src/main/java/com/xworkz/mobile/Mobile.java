package com.xworkz.mobile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.sumsung.Sumsung;

@Component
public class Mobile {
	
	@Value("Darshan")
	String name;
	@Value("true")
	boolean iphone;
	@Value("4")
	int size;
	Sumsung sumsung;
	
	public Mobile(String name, boolean iphone, int size) {
		//super();
		this.name = name;
		this.iphone = iphone;
		this.size = size;
		
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", iphone=" + iphone + ", size=" + size + "]";
	}
	
	

}
