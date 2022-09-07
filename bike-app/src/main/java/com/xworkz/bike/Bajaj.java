package com.xworkz.bike;

import org.springframework.stereotype.Component;

@Component
public class Bajaj {
private String aame;

public Bajaj() {
	System.out.println("Bean Created");
}

public Bajaj(String aame) {
	//super();
	this.aame = aame;
}


public String getName() {
	return aame;
}

public void setName(String aame) {
	this.aame = aame;
}
@Override
public String toString() {
	return "Bajaj [aame=" + aame + "]";
}


}
