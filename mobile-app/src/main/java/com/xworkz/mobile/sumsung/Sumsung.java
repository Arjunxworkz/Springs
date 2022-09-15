package com.xworkz.mobile.sumsung;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sumsung {
	
@Value("G55")	
private String name;

   public Sumsung() {
	   System.out.println(this.getClass().getSimpleName());
	   
		
		
}
	
	public Sumsung(String name) {
		this.name=name;
		
//		System.out.println("Sumsung class constructor");
	}

	@Override
	public String toString() {
		return "Sumsung [name=" + name + "]";
	}
	
	
	
}
